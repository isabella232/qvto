package org.eclipse.m2m.internal.qvt.oml.pde;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.ProjectDependencyTracker;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;

public class PdeDependencyTracker extends ProjectDependencyTracker {
	
	public PdeDependencyTracker() {}
	
	public Set<IProject> getReferencedProjects(IProject project, boolean recursive) {
		
		IPluginModelBase plugin = findPluginModelByProject(project);
		
		if(plugin != null) {		
			IPluginImport[] imports = plugin.getPluginBase().getImports();
		
			Set<IProject> referencedProjects = new HashSet<IProject>(imports.length);
				
			for (IPluginImport nextImport : imports) {
				String importID = nextImport.getId();
				IPluginModelBase depPlugin = findPluginModelByID(importID);
				if(depPlugin != null && depPlugin.getUnderlyingResource() != null) {
					IProject projectDep = depPlugin.getUnderlyingResource().getProject();
					
					referencedProjects.add(projectDep);
					
					if(recursive) {
						referencedProjects.addAll(getReferencedProjects(projectDep, true));
					}
				}
			}
			
			return referencedProjects;
		}
		
		return Collections.emptySet();
	}
	
	
	private static IPluginModelBase findPluginModelByProject(IProject project) {
		return PluginRegistry.findModel(project);
	}

	private static IPluginModelBase findPluginModelByID(String importID) {
		return PluginRegistry.findModel(importID);
	}

}
