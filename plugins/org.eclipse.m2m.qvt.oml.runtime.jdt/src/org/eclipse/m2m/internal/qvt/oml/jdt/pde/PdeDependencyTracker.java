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
package org.eclipse.m2m.internal.qvt.oml.jdt.pde;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.DependencyTracker;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.pde.core.plugin.IPluginImport;
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
			IPluginImport[] imports = plugin.getPluginBase().getImports();
		
			Set<IProject> referencedProjects = new HashSet<IProject>(imports.length);
				
			for (IPluginImport nextImport : imports) {				
				BundleDescription description = nextImport.getPluginModel().getBundleDescription();
				IPluginModelBase depPlugin = PluginRegistry.findModel(description);
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
			IPluginImport[] imports = plugin.getPluginBase().getImports();
		
			Set<Bundle> requiredBundles = new HashSet<Bundle>(imports.length);
				
			for (IPluginImport nextImport : imports) {
				BundleDescription description = nextImport.getPluginModel().getBundleDescription();
				IPluginModelBase depPlugin = PluginRegistry.findModel(description);
				if(depPlugin != null) {
					Bundle requiredBundle = description.getBundle();
					
					requiredBundles.add(requiredBundle);
				}
			}
			
			return requiredBundles;
		}
		
		return Collections.emptySet();
	}
}
