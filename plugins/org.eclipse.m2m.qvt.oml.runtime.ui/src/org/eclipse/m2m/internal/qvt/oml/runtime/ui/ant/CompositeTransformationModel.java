/*******************************************************************************
 * Copyright (c) 2009, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.runtime.ui.ant;

import java.util.LinkedList;
import java.util.List;

class CompositeTransformationModel {

	private String myProjectName = "project"; //$NON-NLS-1$

	private String myTargetName = "default"; //$NON-NLS-1$

	private final List<TaskModel> myTaskModels = new LinkedList<TaskModel>();

	public String getProjectName() {
		return myProjectName;
	}

	public void setProjectName(String projectName) {
		myProjectName = projectName;
	}

	public String getTargetName() {
		return myTargetName;
	}

	public void setTargetName(String targetName) {
		myTargetName = targetName;
	}

	public List<TaskModel> getTaskModels() {
		return myTaskModels;
	}
}
