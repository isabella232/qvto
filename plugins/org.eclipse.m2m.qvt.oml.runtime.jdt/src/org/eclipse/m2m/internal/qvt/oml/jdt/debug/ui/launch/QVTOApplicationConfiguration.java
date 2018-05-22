/*******************************************************************************
 * Copyright (c) 2009, 2016 R.Dvorak and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Radek Dvorak - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.debug.ui.launch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.common.launch.TargetUriData;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.MappingContainer;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.MetamodelURIMappingHelper;
import org.eclipse.m2m.internal.qvt.oml.emf.util.urimap.URIMapping;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchUtil;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation.TransformationParameter;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation.TransformationParameter.DirectionKind;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.WorkspaceQvtModule;
import org.eclipse.m2m.qvt.oml.debug.core.QVTODebugCore;
import org.eclipse.m2m.qvt.oml.debug.core.QVTODebugUtil;
import org.eclipse.m2m.qvt.oml.debug.core.app.QVTOApplication;
import org.eclipse.pde.launching.EclipseApplicationLaunchConfiguration;
import org.eclipse.pde.launching.IPDELauncherConstants;

public class QVTOApplicationConfiguration extends EclipseApplicationLaunchConfiguration {
	
	private final List<URI> fModels;
	private URI fTraceURI;
	
	public QVTOApplicationConfiguration() {
		fModels = new ArrayList<URI>();
	}
	
	@Override
	public String[] getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
		String[] programArguments = super.getProgramArguments(configuration);
		
		List<String> result = new ArrayList<String>(Arrays.asList(programArguments));

		String transformationURI = QvtLaunchUtil.getTransformationURI(configuration);
		if(transformationURI != null) {
			result.add(createArgStr(QVTOApplication.ARG_TRANSFORMATION,
					createPlatformURI(transformationURI).toString()));
		}
		
		String traceFileURI = QvtLaunchUtil.getTraceFileURI(configuration);
		if (traceFileURI != null && traceFileURI.trim().length() != 0) {
			fTraceURI = QVTODebugUtil.toFileURI(traceFileURI);
			result.add(createArgStr(QVTOApplication.ARG_TRACE, fTraceURI.toString()));
		}

		if (QvtLaunchUtil.shouldGenerateTraceFile(configuration) && fTraceURI != null) {
			result.add(QVTOApplication.ARG_TRACE_SAVE);
		}
		
		if (QvtLaunchUtil.isIncrementalUpdate(configuration) && fTraceURI != null) {
			result.add(QVTOApplication.ARG_TRACE_INCREMENTAL);
		}
		
		List<DirectionKind> transfParams = getTransfParams(transformationURI);
		int paramIndex = 0;
		
		List<TargetUriData> modelURIs = QvtLaunchUtil.getTargetUris(configuration);				
		for (TargetUriData targetUriData : modelURIs) {
			String nextURI = targetUriData.getUriString();
			boolean isPlatformUri = paramIndex < transfParams.size() && transfParams.get(paramIndex++) == DirectionKind.IN;
			URI nextModelURI = isPlatformUri ? createPlatformURI(nextURI) : QVTODebugUtil.toFileURI(nextURI);
			fModels.add(nextModelURI);
			
			result.add(createArgStr(QVTOApplication.ARG_PARAM, 
					nextModelURI.toString()));
		}
		
		List<String> mappings = createMetamodelMappings(transformationURI);
		for (String m : mappings) {
			result.add(createArgStr(QVTOApplication.ARG_MMAPINGS, m));
		}
		
		return result.toArray(new String[result.size()]);
	}
	
	@Override
	public void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		reset();
		
		configuration = validateLaunchConfiguration(configuration);
		
		super.launch(configuration, mode, launch, monitor == null ? new NullProgressMonitor() : monitor);
		
		IProcess p = getProcess(launch);
		if(p != null) {
			addTerminationHook(p);
		}
	}

	ILaunchConfiguration validateLaunchConfiguration(ILaunchConfiguration configuration) {
		try {
			ILaunchConfigurationWorkingCopy workingCopy = configuration.getWorkingCopy();
			workingCopy.setAttribute(IPDELauncherConstants.APPLICATION, QVTOApplication.ID);
			return workingCopy.doSave();
		} catch (CoreException e) {
			QVTODebugCore.log(e.getStatus());
		}
		return configuration;
	}
	
	IProcess getProcess(ILaunch launch) {
		IProcess[] launchedProcesses = launch.getProcesses();
		if(launchedProcesses.length == 0) {
			// the process have been terminated, hopefully reported the reason ;)
			return null;
		}
		
		return launchedProcesses[0];
	}
	
	private URI createPlatformURI(String uriStr) {
		URI uri = URI.createURI(uriStr, true);
		IFile file = getIFile(uriStr);
		if (file != null) {
			URI platformPluginURI = QVTODebugCore.getDefault().resolvePlatformPluginURI(file);
			if (platformPluginURI != null) {
				return platformPluginURI;
			}

			if (uri.isPlatformResource()) {
				URI baseURI = URI.createURI(ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toString());
				uri = URI.createURI(baseURI.toString() + uri.toPlatformString(true), true);			
			}
		}
		
		return uri;
	}
	
	private IFile getIFile(String uriStr) {
		try {
			URI uri = URI.createURI(uriStr);
			IFile file = QVTODebugUtil.toFile(uri);
			if (file != null && file.exists()) {
				return file;
			}
		} catch (Exception e) {
		}
		return null;
	}
	
	static String createArgStr(String argName, String argValue) {
		return argName + "=" + argValue; //$NON-NLS-1$
	}
	
	private List<String> createMetamodelMappings(String transformationURI) throws CoreException {
		IFile file = getIFile(transformationURI);
		if (file == null) {
			return Collections.emptyList();
		}
		if (!MetamodelURIMappingHelper.hasMappingResource(file.getProject())) {
			return Collections.emptyList();
		}

		try {
			MappingContainer mappings = MetamodelURIMappingHelper.loadMappings(file.getProject());
			List<String> args = new ArrayList<String>(mappings.getMapping().size());
			for (URIMapping m : mappings.getMapping()) {
				args.add(m.getSourceURI() + ';' + createPlatformURI(m.getTargetURI()).toString());
			}
			return args;
		} catch (Exception e) {
			throw new CoreException(QVTODebugCore.createStatus(IStatus.ERROR, "Failed to load metamodel mappings", e)); //$NON-NLS-1$
		}
	}

	private List<DirectionKind> getTransfParams(String transformationURI) throws CoreException {
		IFile file = getIFile(transformationURI);
		if (file == null) {
			return Collections.emptyList();
		}
		
		try {
			List<DirectionKind> params = new ArrayList<DirectionKind>(2);
			for (TransformationParameter p : new WorkspaceQvtModule(file).getParameters()) {
				params.add(p.getDirectionKind());
			}
			return params;
		} catch (MdaException e) {
			QVTODebugCore.log(QVTODebugCore.createStatus(IStatus.ERROR, "Failed to load transformation", e)); //$NON-NLS-1$
		}
		return Collections.emptyList();
	}

	private void addTerminationHook(final IProcess process) {
		DebugPlugin.getDefault().addDebugEventListener(new IDebugEventSetListener() {
			public void handleDebugEvents(DebugEvent[] events) {
				for (DebugEvent event : events) {
					if (event.getSource() == process
						&& event.getKind() == DebugEvent.TERMINATE) {						
						DebugPlugin.getDefault().removeDebugEventListener(this);
												
						onTerminate();						
					}
				}
			}
		});
		
		if(process.isTerminated()) {
			onTerminate();
		}		
	}
	
	private void onTerminate() {	
		// TODO - refresh only [out, inout] models, trace files in the workspace
		// currently it's hard to deduce this info from the TargetURIData class
		QVTODebugUtil.refreshInWorkspace(fModels);
		if(fTraceURI != null) {
			QVTODebugUtil.refreshInWorkspace(Collections.singletonList(fTraceURI));
		}
	}
	
	protected void reset() {
		fModels.clear();
		fTraceURI = null;
	}
}
