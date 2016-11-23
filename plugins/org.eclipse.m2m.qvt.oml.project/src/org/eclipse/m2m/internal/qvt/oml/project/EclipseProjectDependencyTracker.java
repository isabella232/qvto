/*******************************************************************************
 * Copyright (c) 2009, 2016 Christopher Gerking and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.project;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.DependencyTracker;
import org.osgi.framework.Bundle;

public class EclipseProjectDependencyTracker extends DependencyTracker {
	
	@Override
	protected boolean accepts(IProject project) {
		return !isPluginProject(project);
	}
	
	@Override
	public Collection<IProject> getLocalReferencedProjects(IProject project) {
		try {
			return Arrays.asList(project.getReferencedProjects());
		}
		catch(CoreException e) {
			QVTOProjectPlugin.log(e.getStatus());
			
			return Collections.emptyList();
		}
	}
	
	@Override
	public Set<Bundle> getLocalRequiredBundles(IProject project) {
		return Collections.emptySet();
	}

}
