/*******************************************************************************
 * Copyright (c) 2009, 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.m2m.tests.qvt.oml.TestProject;

public class ReferencedProjectData extends FilesToFilesData {
	
	private TestTransformation referencedProjectTestCase;
	
	public ReferencedProjectData(String myName, String referencedName) {
		super(myName);
		
		ModelTestData referencedProjectTestData = new FilesToFilesData(referencedName) {
			@Override
			public boolean isUseCompiledXmi() {
				return ReferencedProjectData.this.isUseCompiledXmi();
			}
		};
		
		referencedProjectTestCase = new TestTransformation(referencedProjectTestData) {
			
			@Override
			protected String getProjectName() {
		    	return "ReferencedTransformationTest"; //$NON-NLS-1$
		    }
		};
	}
	
	@Override
	public void prepare(TestProject project) throws Exception {
		referencedProjectTestCase.setUp();
		
		super.prepare(project);
		
		IProject referencedProject = referencedProjectTestCase.getProject();
		IProject myProject = project.getProject();
		
		IProjectDescription desc = myProject.getDescription();
		desc.setReferencedProjects(new IProject[] {referencedProject});
		myProject.setDescription(desc, null);				
	}

}
