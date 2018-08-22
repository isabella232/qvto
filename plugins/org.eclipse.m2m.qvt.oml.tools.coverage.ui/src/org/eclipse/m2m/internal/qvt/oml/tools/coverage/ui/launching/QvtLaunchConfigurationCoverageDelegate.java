/*****************************************************************************
 * Copyright (c) 2014, 2019 ASML Netherlands B.V. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *  ASML Netherlands B.V. - Initial API and implementation
 *	Christopher Gerking - bug 537609
 *****************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.tools.coverage.ui.launching;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.IStatusHandler;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.common.launch.ProcessJob;
import org.eclipse.m2m.internal.qvt.oml.common.launch.StreamsProxy;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtGenericVisitorDecorator;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtRuntimeException;
import org.eclipse.m2m.internal.qvt.oml.runtime.QvtRuntimePlugin;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchConfigurationDelegateBase;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchUtil;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtInterpretedTransformation;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation;
import org.eclipse.m2m.internal.qvt.oml.tools.coverage.QVTOCoverageDecorator;
import org.eclipse.m2m.internal.qvt.oml.tools.coverage.common.CoverageData;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.tools.coverage.ui.CoveragePlugin;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

@SuppressWarnings("restriction")
public class QvtLaunchConfigurationCoverageDelegate extends QvtLaunchConfigurationDelegateBase {

	public static final String LAUNCH_CONFIGURATION_TYPE_ID = "org.eclipse.m2m.qvt.oml.QvtTransformation"; //$NON-NLS-1$

	public QvtLaunchConfigurationCoverageDelegate() {
	}

	// FIXME - do refactoring of this area
	@Override
	public void launch(final ILaunchConfiguration configuration, String mode, final ILaunch launch, final IProgressMonitor monitor) throws CoreException {

		final QvtTransformation qvtTransformation = new QvtInterpretedTransformation(getQvtModule(configuration));

		final StreamsProxy streamsProxy = new StreamsProxy();

		ProcessJob processJob = new ProcessJob("QVT Run", launch, streamsProxy) { //$NON-NLS-1$

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				try {
					IStatus status = QvtLaunchConfigurationDelegateBase.validate(qvtTransformation, configuration);
					if (status.getSeverity() > IStatus.WARNING) {
						throw new CoreException(status);
					}

					ExecutionContext context = QvtLaunchUtil.createContext(configuration, new WriterLog(streamsProxy.getOutputWriter()), monitor);

					// Install the decorators for collecting coverage data
					ArrayList<Class<? extends QvtGenericVisitorDecorator>> decorators = new ArrayList<Class<? extends QvtGenericVisitorDecorator>>();
					decorators.add(QVTOCoverageDecorator.class);
					context.getSessionData().setValue(QVTEvaluationOptions.VISITOR_DECORATORS, decorators);

					// Create coverage data private for this run
					CoverageData data = new CoverageData();
					context.getSessionData().setValue(QVTOCoverageDecorator.COVERAGE_DATA, data);

					QvtLaunchUtil.doLaunch(qvtTransformation, configuration, context);

					qvtTransformation.cleanup();

					// Activate the coverage view
					CoveragePlugin.getDefault().showCoverageView(data);

					return Status.OK_STATUS;
				}
				catch (QvtRuntimeException e) {
					// QVT runtime exception are legal QVT transformation level errors
					return BasicDiagnostic.toIStatus(e.getDiagnostic());
				}
				catch (Exception e) {
					IStatus actualStatus = new Status(IStatus.ERROR, QvtRuntimePlugin.ID,
							QvtRuntimePlugin.LAUNCH_ERROR_STATUS.getCode(), e.getMessage(),
							e.getMessage() == null ? e : null);

					IStatusHandler statusHandler = DebugPlugin.getDefault().getStatusHandler(QvtRuntimePlugin.LAUNCH_ERROR_STATUS);

					if(statusHandler != null) {
						try {
							statusHandler.handleStatus(actualStatus, configuration);
						} catch (CoreException coreExc) {
							actualStatus = coreExc.getStatus();
							QvtPlugin.getDefault().log(actualStatus);
						}
					}

					QvtPlugin.error(e);

					throw new CoreException(actualStatus);
				}
				finally {
					qvtTransformation.cleanup();
				}
			}
		};

		launch.addProcess(processJob);

		processJob.schedule();
	}
}
