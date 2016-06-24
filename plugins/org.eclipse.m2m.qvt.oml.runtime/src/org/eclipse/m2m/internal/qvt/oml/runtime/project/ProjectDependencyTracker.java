package org.eclipse.m2m.internal.qvt.oml.runtime.project;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.runtime.QvtRuntimePlugin;

public abstract class ProjectDependencyTracker {
	
	public static final String POINT = QvtRuntimePlugin.ID + ".qvtProjectDependencyTracker";
	
	public static Set<IProject> getAllReferencedProjects(IProject project, boolean recursive) {
		
		IConfigurationElement[] providers = Platform.getExtensionRegistry().getConfigurationElementsFor(POINT);
		
		Set<IProject> referencedProjects = new HashSet<IProject>(providers.length);
		
		for (IConfigurationElement provider : providers) {
			try {
		        Object extension = provider.createExecutableExtension("class");
		        if (extension instanceof ProjectDependencyTracker) {
		        	ProjectDependencyTracker tracker = (ProjectDependencyTracker) extension;
		        	referencedProjects.addAll(tracker.getReferencedProjects(project, recursive));
		        }
			}
			catch(CoreException e) {
				QvtPlugin.logDiagnostic(BasicDiagnostic.toDiagnostic(e.getStatus()));
			}
	    }
		
		return referencedProjects;		
	}
	
	public abstract Set<IProject> getReferencedProjects(IProject project, boolean recursive);

}
