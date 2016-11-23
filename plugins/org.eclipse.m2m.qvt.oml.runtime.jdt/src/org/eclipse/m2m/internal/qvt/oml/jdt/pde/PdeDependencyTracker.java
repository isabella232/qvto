/*******************************************************************************
 * Copyright (c) 2007, 2016 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christopher Gerking - bugs 474603, 507955
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.pde;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.DependencyTracker;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.osgi.framework.Bundle;

public class PdeDependencyTracker extends DependencyTracker {
		
	@Override
	protected boolean accepts(IProject project) {
		return isPluginProject(project);
	}
	
	@Override
	public Collection<IProject> getLocalReferencedProjects(IProject project) {
		
		IPluginModelBase plugin = PluginRegistry.findModel(project);
		
		if(plugin != null) {

			BundleDescription[] imports = plugin.getBundleDescription().getResolvedRequires();
		
			Set<IProject> referencedProjects = new HashSet<IProject>(imports.length);
			
			for (BundleDescription nextImport : imports) {
				IPluginModelBase depPlugin = PluginRegistry.findModel(nextImport);
			
				if(depPlugin != null && depPlugin.getUnderlyingResource() != null) {
					IProject projectDep = depPlugin.getUnderlyingResource().getProject();
					
					referencedProjects.add(projectDep);
				}
			}
			
			return referencedProjects;
		}
		
		return Collections.emptySet();
	}
	
	@Override
	protected Collection<Bundle> getLocalRequiredBundles(IProject project) {
				
		IPluginModelBase plugin = PluginRegistry.findModel(project);
		
		if(plugin != null) {		
			BundleDescription[] imports = plugin.getBundleDescription().getResolvedRequires();
		
			Set<Bundle> requiredBundles = new HashSet<Bundle>(imports.length);
				
			for (BundleDescription nextImport : imports) {				
				IPluginModelBase depPlugin = PluginRegistry.findModel(nextImport);
				
				if(depPlugin != null) {
					Bundle requiredBundle = Platform.getBundle(nextImport.getName());
					
					if (requiredBundle != null) requiredBundles.add(requiredBundle);
				}
			}
			
			return requiredBundles;
		}
		
		return Collections.emptySet();
	}
}
