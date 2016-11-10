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
package org.eclipse.m2m.internal.qvt.oml.runtime.project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.runtime.QvtRuntimePlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.wiring.BundleRequirement;
import org.osgi.framework.wiring.BundleWiring;

public abstract class DependencyTracker {
	
	public static final String POINT = QvtRuntimePlugin.ID + ".qvtDependencyTracker";
	
	private static final Collection<DependencyTracker> trackers = getTrackers();
	
	private static Collection<DependencyTracker> getTrackers() {
		IConfigurationElement[] providers = Platform.getExtensionRegistry().getConfigurationElementsFor(POINT);
		
		Collection<DependencyTracker> trackers = new ArrayList<DependencyTracker>(providers.length);
				
		for (IConfigurationElement provider : providers) {
			try {
		        Object extension = provider.createExecutableExtension("class");
		        if (extension instanceof DependencyTracker) {
		        	trackers.add((DependencyTracker) extension);
		        }
			}
			catch(CoreException e) {
				QvtPlugin.logDiagnostic(BasicDiagnostic.toDiagnostic(e.getStatus()));
			}
	    }
		
		return trackers;
	}
	
	public static Set<IProject> findReferencedProjects(IProject project, boolean recursive) {
		
		for (DependencyTracker tracker : trackers) {
			if (tracker.accepts(project)) {
				return tracker.getReferencedProjects(project, recursive);
		    }
		};
					
		return Collections.emptySet();		
	}
	
	public static Set<Bundle> findRequiredBundles(IProject project, boolean recursive) {
		
		for (DependencyTracker tracker : trackers) {
			if (tracker.accepts(project)) {
				return tracker.getRequiredBundles(project, recursive);
		    }
		};
		
		return Collections.emptySet();
	}
		
	public static Set<Bundle> findRequiredBundles(Bundle bundle, boolean recursive) {
		
		Set<Bundle> result = new HashSet<Bundle>(getLocalRequiredBundles(bundle));
		
		List<Bundle> todo = new ArrayList<Bundle>(result);
				
		while (recursive && !todo.isEmpty()) {
			
			Bundle current = todo.get(0);
			
			List<Bundle> referenced = new ArrayList<Bundle>(getLocalRequiredBundles(current));
			
			referenced.removeAll(result);
			result.addAll(referenced);
						
			todo.addAll(referenced);				
			todo.remove(current);
		}
						
		return result;
	}
	
	protected abstract boolean accepts(IProject project);

	protected Set<Bundle> getRequiredBundles(IProject project, boolean recursive) {
		
		Set<Bundle> result = new HashSet<Bundle>(getLocalRequiredBundles(project));
		
		List<Bundle> todo = new ArrayList<Bundle>(result);
				
		while (recursive && !todo.isEmpty()) {
			
			Bundle current = todo.get(0);
			
			List<Bundle> referenced = new ArrayList<Bundle>(getLocalRequiredBundles(current));
			
			referenced.removeAll(result);
			result.addAll(referenced);
						
			todo.addAll(referenced);				
			todo.remove(current);
		}
						
		return result;
		
	};
		
	protected Set<IProject> getReferencedProjects(IProject project, boolean recursive) {
		
		Set<IProject> result = new HashSet<IProject>(getLocalReferencedProjects(project));
		
		List<IProject> todo = new ArrayList<IProject>(result);
				
		while (recursive && !todo.isEmpty()) {
			
			IProject current = todo.get(0);
			
			List<IProject> referenced = new ArrayList<IProject>(getLocalReferencedProjects(current));
			
			referenced.removeAll(result);
			result.addAll(referenced);
						
			todo.addAll(referenced);				
			todo.remove(current);
		}
						
		return result;
	}
	
	protected abstract Collection<IProject> getLocalReferencedProjects(IProject project);
	
	protected abstract Collection<Bundle> getLocalRequiredBundles(IProject project);

	private static Collection<Bundle> getLocalRequiredBundles(Bundle bundle) {
		
		Set<Bundle> requiredBundles = new HashSet<Bundle>();
		
		BundleWiring bundleWiring = bundle.adapt(BundleWiring.class);
		
		for (BundleRequirement requirement : bundleWiring.getRequirements(null)) {
			Bundle requiredBundle = Platform.getBundle(requirement.getNamespace());
			
			if (requiredBundle != null) {
				requiredBundles.add(requiredBundle);
			}
		}
		
		return requiredBundles;
	}

	protected static boolean isPluginProject(IProject project) {
		return (project.isOpen() && (
			project.exists(new Path("META-INF/MANIFEST.MF")) || //$NON-NLS-1$
			project.exists(new Path("plugin.xml")) //$NON-NLS-1$			
			));
	}
}
