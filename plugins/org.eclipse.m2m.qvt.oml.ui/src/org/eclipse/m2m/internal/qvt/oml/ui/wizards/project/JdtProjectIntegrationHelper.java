/*******************************************************************************
 * Copyright (c) 2009, 2016 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.ui.wizards.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.m2m.internal.qvt.oml.ui.QVTUIPlugin;
import org.eclipse.swt.widgets.Combo;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class JdtProjectIntegrationHelper {
	
	private static final JdtProjectIntegration jdtIntegartion = getJdtProjectIntegration();
	
	private static JdtProjectIntegration getJdtProjectIntegration() {
		try {
			BundleContext bundleContext = QVTUIPlugin.getDefault().getBundle().getBundleContext();
			ServiceReference<JdtProjectIntegration> serviceReference = bundleContext.getServiceReference(JdtProjectIntegration.class);
			return serviceReference == null ? null : bundleContext.getService(serviceReference);
		}
		catch (Exception e) {
			return null;
		}
	}


	static boolean isJdtIntegration() {
		return jdtIntegartion != null;
	}
	
	static void setupJava(IProject project, boolean isPDE, String sourceFolder, String outFolder, String executionEnv,
			IProgressMonitor monitor) throws CoreException {
		
		if (jdtIntegartion != null) {
			jdtIntegartion.setupJava(project, isPDE, sourceFolder, outFolder, executionEnv, monitor);
		}		
	}

	static String getRequiredExecutionEnv(String executionEnv) {
		if (jdtIntegartion != null) {
			return jdtIntegartion.getRequiredExecutionEnv(executionEnv);
		}
		return null;
	}

	static String getClassField(String id, String suffix) {
		if (jdtIntegartion != null) {
			return jdtIntegartion.getClassField(id, suffix);
		}
		return ""; //$NON-NLS-1$
	}

	static IStatus validateJavaTypeName(String name) {
		if (jdtIntegartion != null) {
			return jdtIntegartion.validateJavaTypeName(name);
		}
		return Status.OK_STATUS;
	}

	static void fillExecutionEnvironments(Combo combo) {
		if (jdtIntegartion != null) {
			jdtIntegartion.fillExecutionEnvironments(combo);
		}
	}

}
