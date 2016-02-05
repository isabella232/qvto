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
package org.eclipse.m2m.internal.qvt.oml.runtime.jdt.blackbox;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.blackbox.AbstractCompilationUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.JavaBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;

public class JdtBlackboxProvider extends JavaBlackboxProvider {

	public static final String URI_BLACKBOX_JDT_QUERY = "jdt"; //$NON-NLS-1$	
	
	@Override
	public Collection<? extends AbstractCompilationUnitDescriptor> getModuleDescriptors(ResolutionContext resolutionContext) {
		IProject project = getProject(resolutionContext);
		if (project == null) {
			return Collections.emptyList();			
		}
		
		List<IProject> projects = new ArrayList<IProject>();
		projects.add(project);
		try {
			projects.addAll(Arrays.asList(project.getReferencedProjects()));
		} catch (CoreException e) {
			// ignore
		}

		List<AbstractCompilationUnitDescriptor> descriptors = new ArrayList<AbstractCompilationUnitDescriptor>();
		for (IProject p : projects) {
			final List<String> classes = getAllClasses(p);
			
			for (String qualifiedName : classes) {
				AbstractCompilationUnitDescriptor jdtUnitDescriptor = getJdtUnitDescriptor(p, qualifiedName);
				if (jdtUnitDescriptor != null) {
					descriptors.add(jdtUnitDescriptor);
				}
			}
		}
		
		return descriptors;
	}

	@Override
	public AbstractCompilationUnitDescriptor getModuleDescriptor(String qualifiedName, ResolutionContext resolutionContext) {
		IProject project = getProject(resolutionContext);
		if (project == null) {
			return null;			
		}
		
		return getJdtUnitDescriptor(project, qualifiedName);
	}

	private AbstractCompilationUnitDescriptor getJdtUnitDescriptor(IProject project, String qualifiedName) {
		URLClassLoader loader = null;
		try {
			final IJavaProject javaProject = JavaCore.create(project);
			IPath projectRelativeOutputPath = javaProject.getOutputLocation().removeFirstSegments(1);

			IPath outputPath = project.getLocation().append(projectRelativeOutputPath);
			URL outputUrl = outputPath.addTrailingSeparator().toFile().toURI().toURL();

			loader = new URLClassLoader(new URL[] { outputUrl }, this.getClass().getClassLoader());

			Class<?> moduleJavaClass = loader.loadClass(qualifiedName);
			return new JdtDescriptor(qualifiedName, moduleJavaClass) {
				@Override
				protected String getFragment() {
					return javaProject.getElementName();
				}
			};

		} catch (JavaModelException e) {
			// ignore
		} catch (MalformedURLException e) {
			QvtPlugin.error(e);
		} catch (ClassNotFoundException e) {
			// ignore
		} finally {
			try {
				if (loader != null) {
					loader.close();
				}
			} catch (IOException e) {
				QvtPlugin.error(e);
			}
		}

		return null;
	}

	private IProject getProject(ResolutionContext resolutionContext) {
		IResource resource = URIUtils.getResource(resolutionContext.getURI());

		if (resource == null || !resource.exists()) {
			return null;
		}

		return resource.getProject();
	}
	
	private List<String> getAllClasses(IProject project) {
		final List<String> classes = new ArrayList<String>();

		try {
			IJavaProject javaProject = JavaCore.create(project);
			IResource folder = ResourcesPlugin.getWorkspace().getRoot().findMember(javaProject.getOutputLocation());
			final String folderPath = folder.getFullPath().toString();

			folder.accept(new IResourceProxyVisitor() {

				public boolean visit(IResourceProxy proxy) throws CoreException {
					if (proxy.getType() == IResource.FOLDER) {
						return true;
					}
					if (proxy.getType() == IResource.FILE) {
						if (proxy.getName().endsWith(".class")) {
							String filePath = proxy.requestFullPath().toString();
							filePath = filePath.substring(0, filePath.length() - 6);
							if (filePath.startsWith(folderPath)) {
								filePath = filePath.substring(folderPath.length() + 1);
							}
							classes.add(filePath.replace('/', '.'));
						}
					}
					return false;
				}

			}, IResource.NONE);
		} catch (CoreException e) {
			// ignore
		}

		return classes;
	}
	
	private class JdtDescriptor extends JavaBlackboxProvider.JavaUnitDescriptor {
		
		public JdtDescriptor(String unitQualifiedName, Class<?> moduleJavaClass) {
			super(unitQualifiedName);
			addModuleHandle(new JdtModuleHandle(unitQualifiedName, moduleJavaClass));
		}
		
		@Override
		protected String getUnitQuery() {
			return URI_BLACKBOX_JDT_QUERY;
		}
	}

}
