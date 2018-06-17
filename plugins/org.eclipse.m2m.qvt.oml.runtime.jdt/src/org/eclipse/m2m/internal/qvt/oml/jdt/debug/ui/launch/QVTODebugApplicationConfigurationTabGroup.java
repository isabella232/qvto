/*******************************************************************************
 * Copyright (c) 2009, 2016 R.Dvorak and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Radek Dvorak - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.debug.ui.launch;

import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.m2m.internal.qvt.oml.runtime.ui.launch.QvtLaunchConfigurationTabGroup;
import org.eclipse.m2m.internal.qvt.oml.runtime.ui.launch.QvtLauncherTab;
import org.eclipse.m2m.internal.qvt.oml.runtime.ui.launch.QvtTransformationConfigurationTab;
import org.eclipse.m2m.qvt.oml.debug.core.app.QVTODebugApplication;
import org.eclipse.pde.ui.launcher.ConfigurationTab;
import org.eclipse.pde.ui.launcher.PluginsTab;
import org.eclipse.pde.ui.launcher.TracingTab;


public class QVTODebugApplicationConfigurationTabGroup extends QvtLaunchConfigurationTabGroup {
	
	public QVTODebugApplicationConfigurationTabGroup() {
    	super();
	}

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
                new QvtLauncherTab(TRANSFORMATION_MAKER),
                new QvtTransformationConfigurationTab(TRANSFORMATION_MAKER),
                new QVTOMainTab() {
                	@Override
                	protected String getAppId() {
                		return QVTODebugApplication.ID;
                	}
                },
                new JavaArgumentsTab(), 
                new PluginsTab(), 
                new ConfigurationTab(), 
                new TracingTab(), 
                new EnvironmentTab(), 
                new CommonTab()
        };
        
		setTabs(tabs);
	}
	
}
