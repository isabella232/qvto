/*******************************************************************************
 * Copyright (c) 2009, 2015 R.Dvorak and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Radek Dvorak - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.debug.ui.launch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.debug.core.QVTODebugCore;
import org.eclipse.m2m.qvt.oml.debug.core.QVTODebugTarget;
import org.eclipse.m2m.qvt.oml.debug.core.app.QVTODebugApplication;
import org.eclipse.m2m.qvt.oml.debug.core.app.SocketUtil;
import org.eclipse.m2m.qvt.oml.debug.core.vm.IQVTOVirtualMachineShell;
import org.eclipse.m2m.qvt.oml.debug.core.vm.QVTOVirtualMachineProxy;
import org.eclipse.pde.launching.IPDELauncherConstants;

/**
 * @since 1.6
 */
public class QVTODebugApplicationConfiguration extends QVTOApplicationConfiguration {
	
	private int fPort;
	
	public QVTODebugApplicationConfiguration() {
		super();
		fPort = -1;
	}
	
	@Override
	public String[] getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
		String[] programArguments = super.getProgramArguments(configuration);
		
		List<String> result = new ArrayList<String>(Arrays.asList(programArguments));

		result.add(createArgStr(QVTODebugApplication.ARG_PORT, String.valueOf(getPort())));
		
		return result.toArray(new String[result.size()]);
	}
	
	@Override
	ILaunchConfiguration validateLaunchConfiguration(ILaunchConfiguration configuration) {
		try {
			ILaunchConfigurationWorkingCopy workingCopy = configuration.getWorkingCopy();
			workingCopy.setAttribute(IPDELauncherConstants.APPLICATION, QVTODebugApplication.ID);
			return workingCopy.doSave();
		} catch (CoreException e) {
			QVTODebugCore.log(e.getStatus());
		}
		return configuration;
	}
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, final ILaunch launch, IProgressMonitor monitor) throws CoreException {
		super.launch(configuration, mode, launch, monitor);					

		final int port = getPort();
		if(port == -1) {
			throw new CoreException(QVTODebugCore.createStatus(IStatus.ERROR, "Failed to find free debugging port"));
		}

		// connect the QVTO target to QVTO VM afterwards
		
		IQVTOVirtualMachineShell vm;
		try {
			Monitor connectMonitor = new BasicMonitor() {
				public boolean isCanceled() {
					IProcess p = getProcess(launch);
					return p != null ? p.isTerminated() : false;
				}
			};
			
			vm = new QVTOVirtualMachineProxy("localhost", port, connectMonitor); //$NON-NLS-1$
		} catch (IOException e) {
			IProcess p = getProcess(launch);
			if(p != null && p.isTerminated() && p.getExitValue() != 0) {
				return;
			}
			throw new CoreException(QVTODebugCore.createStatus(IStatus.ERROR,
					"Failed to connect to QVTO VM", e)); //$NON-NLS-1$
		}
		
		try {
			// Note: there must be a process ready as we have connected to QVTO VM hosted by the process
			IProcess p = getProcess(launch);
			if(p == null) {
				// the process have been terminated, hopefully reported the reason ;)
				return;
			}

			QVTODebugTarget debugTarget = new QVTODebugTarget(p, vm) {
				@Override
				protected URI computeBreakpointURI(URI sourceURI) {				
					URI platformPluginURI = QVTODebugCore.getDefault().resolvePlatformPluginURI(sourceURI);
					if (platformPluginURI != null) {
						return platformPluginURI;
					}

					if (sourceURI.isPlatformResource()) {
						URI baseURI = URI.createURI(ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toString());
						return URI.createURI(baseURI.toString() + sourceURI.toPlatformString(true), true);			
					}
					
					return sourceURI;
				}
			};
			launch.addDebugTarget(debugTarget);
		} finally {
			fPort = -1;
		}
	}

	protected void reset() {
		super.reset();
		fPort = -1;
	}

	private int getPort() {
		if(fPort == -1) {
			fPort = SocketUtil.findFreePort();
		}
		return fPort;
	}
	
}
