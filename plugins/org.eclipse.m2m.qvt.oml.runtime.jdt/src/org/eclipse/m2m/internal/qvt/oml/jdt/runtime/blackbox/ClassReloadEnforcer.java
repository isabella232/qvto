package org.eclipse.m2m.internal.qvt.oml.jdt.runtime.blackbox;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.compiler.CompilationParticipant;

public class ClassReloadEnforcer extends CompilationParticipant {
		
	@Override
	public void buildFinished(IJavaProject project) {	
		ProjectClassLoader.resetProjectClassLoader(project);
	}
	
	@Override
	public boolean isActive(IJavaProject project) {
	    return ProjectClassLoader.isProjectClassLoaderExisting(project);
	}
	
}
