/*******************************************************************************
 * Copyright (c) 2016 Christopher Gerking and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.runtime.blackbox;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.ClassModuleHandle;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.DelegatingJavaBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.JavaBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.compiler.ResolverUtils;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.BundleBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.DependencyTracker;

public class JdtBlackboxProvider extends DelegatingJavaBlackboxProvider {

	public static final String URI_BLACKBOX_JDT_QUERY = "jdt"; //$NON-NLS-1$
	
	private static Map<IProject, Map<String, JdtDescriptor>> descriptors = new HashMap<IProject, Map<String, JdtDescriptor>>();
	
	public JdtBlackboxProvider() {
		super(new BundleBlackboxProvider());
	}
	
	@Override
	protected Collection<? extends BlackboxUnitDescriptor> getLocalUnitDescriptors(ResolutionContext resolutionContext) {
		List<BlackboxUnitDescriptor> descriptors = Collections.emptyList();
		
		if (resolutionContext.getDeclaredLibraries().isEmpty()) {
			IProject project = getProject(resolutionContext);
			if (project != null) {
				descriptors = new ArrayList<BlackboxUnitDescriptor>();
				getProjectDescriptors(project, descriptors);
				
				for (IProject p : DependencyTracker.findReferencedProjects(project, true)) {
					getProjectDescriptors(p, descriptors);
				}
			}
		}
		else {
			for (URI libraryUri : resolutionContext.getDeclaredLibraries().keySet()) {
				if (URI_BLACKBOX_JDT_QUERY.equals(libraryUri.query())) {
					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(libraryUri.fragment());
					if (project != null) {
						BlackboxUnitDescriptor jdtUnitDescriptor = getJdtUnitDescriptor(project, libraryUri.segment(0));
						if (jdtUnitDescriptor != null) {
							if (descriptors.isEmpty()) {
								descriptors = new LinkedList<BlackboxUnitDescriptor>();
							}
							descriptors.add(jdtUnitDescriptor);
						}
					}
				}
			}
		}

		return descriptors;
	}

	private void getProjectDescriptors(IProject p, List<BlackboxUnitDescriptor> descriptors) {
		for (String qualifiedName : getAllClasses(p)) {
			BlackboxUnitDescriptor jdtUnitDescriptor = getJdtUnitDescriptor(p, qualifiedName);
			if (jdtUnitDescriptor != null) {
				descriptors.add(jdtUnitDescriptor);
			}
		}
	}
	
	@Override
	protected BlackboxUnitDescriptor getLocalUnitDescriptor(String qualifiedName, ResolutionContext resolutionContext) {
		IProject project = getProject(resolutionContext);
		if (project == null) {
			return null;			
		}
		
		return getJdtUnitDescriptor(project, qualifiedName);
	}

	private BlackboxUnitDescriptor getJdtUnitDescriptor(IProject project, String qualifiedName) {
				
		Map<String, JdtDescriptor> projectDescriptors = descriptors.get(project);
		
		if (projectDescriptors == null) {
			projectDescriptors = new HashMap<String, JdtDescriptor>();
			descriptors.put(project, projectDescriptors);
		}
		
		JdtDescriptor descriptor = projectDescriptors.get(qualifiedName);
		
		if (descriptor == null) {
		
			try {
				if (!project.hasNature(JavaCore.NATURE_ID)) {
					return null;
				}
			} catch (CoreException e) {
				QvtPlugin.logDiagnostic(BasicDiagnostic.toDiagnostic(e.getStatus()));
				
				return null;
			}
			
			final IJavaProject javaProject = JavaCore.create(project);
					
			try {		
				ClassLoader loader = ProjectClassLoader.getProjectClassLoader(javaProject);
				
				try {
					Class<?> moduleJavaClass = loader.loadClass(qualifiedName);
							
					descriptor = new JdtDescriptor(qualifiedName, moduleJavaClass) {
						@Override
						protected String getFragment() {
							return javaProject.getElementName();
						}
					};
					
					projectDescriptors.put(qualifiedName, descriptor);
				}
				catch (ClassNotFoundException e) {
					return null;
				}
	
			} catch (JavaModelException e) {
				QvtPlugin.logDiagnostic(BasicDiagnostic.toDiagnostic(e.getStatus()));
			} catch (MalformedURLException e) {
				QvtPlugin.error(e);
			}
		}
		
		return descriptor;
	}
	
	private List<String> getAllClasses(IProject project) {
		final List<String> classes = new ArrayList<String>();

		try {
			IJavaProject javaProject = JavaCore.create(project);
			IResource folder = ResourcesPlugin.getWorkspace().getRoot().findMember(javaProject.getOutputLocation());
			final IPath folderPath = folder.getFullPath();

			folder.accept(new IResourceProxyVisitor() {

				public boolean visit(IResourceProxy proxy) throws CoreException {
					if (proxy.getType() == IResource.FOLDER) {
						return true;
					}
					if (proxy.getType() == IResource.FILE) {
						IPath filePath = proxy.requestFullPath();						
						if (filePath.getFileExtension().equals("class")) {
							filePath = filePath.removeFileExtension();

							if (folderPath.isPrefixOf(filePath)) {
								filePath = filePath.makeRelativeTo(folderPath);
							}
							classes.add(ResolverUtils.toQualifiedName(filePath));
						}
					}
					return false;
				}

			}, IResource.NONE);
		} catch (CoreException e) {
			QvtPlugin.logDiagnostic(BasicDiagnostic.toDiagnostic(e.getStatus()));
		}

		return classes;
	}
	
	@Override
	public void cleanup() {
		descriptors.clear();		
	}
	
	static void clear(IJavaProject project) {		
		ProjectClassLoader.resetProjectClassLoader(project);
		
		descriptors.remove(project.getProject());
	}
	
	private class JdtDescriptor extends JavaBlackboxProvider.JavaUnitDescriptor {
		
		private final Class<?> fModuleJavaClass;
		private volatile int hashCode;
		
		public JdtDescriptor(String unitQualifiedName, Class<?> moduleJavaClass) {
			super(unitQualifiedName);
			addModuleHandle(new ClassModuleHandle(moduleJavaClass, unitQualifiedName));
			
			fModuleJavaClass = moduleJavaClass;
		}
		
		@Override
		protected String getUnitQuery() {
			return URI_BLACKBOX_JDT_QUERY;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof JdtDescriptor == false) {
				return false;
			}
			
			JdtDescriptor other = (JdtDescriptor) obj;

			return getQualifiedName().equals(other.getQualifiedName())
					&& fModuleJavaClass.equals(other.fModuleJavaClass);
		}
		
		@Override
		public int hashCode() {
			int result = hashCode;
			if (result == 0) {
				result = 17;
				result = 31 * result + getQualifiedName().hashCode();
				result = 31 * result + fModuleJavaClass.hashCode();
				hashCode = result;
			}
						
			return result;
		}
	}
}
