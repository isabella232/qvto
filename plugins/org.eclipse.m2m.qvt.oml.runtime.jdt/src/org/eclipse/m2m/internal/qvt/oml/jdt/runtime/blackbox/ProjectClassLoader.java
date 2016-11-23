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

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.DependencyTracker;
import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleWiring;

public class ProjectClassLoader extends URLClassLoader {
			
	private static Map<IJavaProject, ProjectClassLoader> loadersMap = new HashMap<IJavaProject, ProjectClassLoader>();
	
	private IJavaProject javaProject;
	
	private ProjectClassLoader(IProject project) throws JavaModelException, MalformedURLException {
		this(JavaCore.create(project));
	}
	
	private ProjectClassLoader(IJavaProject javaProject) throws JavaModelException, MalformedURLException {
		super(new URL[] {getProjectOutputURL(javaProject)}, getParentLoader(javaProject));
		
		this.javaProject = javaProject;
		
		loadersMap.put(javaProject, this);
	}
	
	@Override
	protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
		if (javaProject.hasBuildState()) {
			return super.loadClass(name, resolve);
		}
		else {
			throw new ClassNotFoundException(name);
		}
	}
	
	static synchronized ProjectClassLoader getProjectClassLoader(IProject project) throws JavaModelException, MalformedURLException {
		return getProjectClassLoader(JavaCore.create(project));
	}
	
	static synchronized ProjectClassLoader getProjectClassLoader(IJavaProject javaProject) throws JavaModelException, MalformedURLException {
		ProjectClassLoader loader = loadersMap.get(javaProject);
		
		if (loader == null) {
			loader = new ProjectClassLoader(javaProject);
		}
		
		return loader;		
	}
	
	static synchronized void resetProjectClassLoader(IJavaProject javaProject) {
		
		ProjectClassLoader loader = loadersMap.get(javaProject);
		
		if (loader != null) {
			try {
				loader.close();
			}
			catch(IOException e) {
				QvtPlugin.error(e);
			};
			
			loadersMap.remove(javaProject);
		}
	}
		
	private static URL getProjectOutputURL(IJavaProject javaProject) throws JavaModelException, MalformedURLException {
				
		IPath projectRelativeOutputPath = javaProject.getOutputLocation().removeFirstSegments(1);
		IPath outputPath = javaProject.getProject().getLocation().append(projectRelativeOutputPath);
		
		return outputPath.addTrailingSeparator().toFile().toURI().toURL();
	}
		
	private static List<ClassLoader> getReferencedProjectLoaders(IJavaProject javaProject) {
		
		if (javaProject.hasBuildState()) {

			Set<IProject> referencedProjects = DependencyTracker.findReferencedProjects(javaProject.getProject(), false);
			Set<Bundle> requiredBundles = DependencyTracker.findRequiredBundles(javaProject.getProject(), false);
						
			List<ClassLoader> referencedLoaders = new ArrayList<ClassLoader>(referencedProjects.size() + requiredBundles.size());
																				
			for(IProject referencedProject : referencedProjects) {
				
				try {			
					referencedLoaders.add(ProjectClassLoader.getProjectClassLoader(referencedProject));
				}
				catch(JavaModelException e) {
					QvtPlugin.logDiagnostic(BasicDiagnostic.toDiagnostic(e.getStatus()));
				}
				catch(MalformedURLException e) {
					QvtPlugin.error(e);
				}
			}

			for (Bundle requiredBundle : requiredBundles) {
				referencedLoaders.add(requiredBundle.adapt(BundleWiring.class).getClassLoader());
			}
			
			return referencedLoaders;
		}	
		
		return Collections.emptyList();
	}
	
	private static ClassLoader getParentLoader(IJavaProject javaProject) {
		
		List<ClassLoader> referencedLoaders = getReferencedProjectLoaders(javaProject);
		
		return referencedLoaders.isEmpty() ? getSystemClassLoader() : new CompositeClassLoader(referencedLoaders);
	}
	
	private static class CompositeClassLoader extends ClassLoader {
		
		private List<? extends ClassLoader> composedLoaders;
		
		public CompositeClassLoader(List<? extends ClassLoader> composedLoaders) {
			this.composedLoaders = composedLoaders;
		}
		
		@Override
		protected Class<?> findClass(String name) throws ClassNotFoundException {
			
			for (ClassLoader composed : composedLoaders) {
				try {
					Class<?> c = composed.loadClass(name);
					
					return c;
				}
				catch (ClassNotFoundException e) {
					continue;
				}
			}
			
			throw new ClassNotFoundException(name);
		}			
	}
}
