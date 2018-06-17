/*******************************************************************************
 * Copyright (c) 2009, 2016 R.Dvorak and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Sergey Boyko - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.debug.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.IStatusHandler;
import org.eclipse.m2m.internal.qvt.oml.debug.ui.views.TraceViewPart;
import org.eclipse.m2m.qvt.oml.debug.core.QVTODebugCore;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;


public class ShowTraceViewHandler implements IStatusHandler {
	
	public Object handleStatus(IStatus status, Object source) throws CoreException {
		Display.getDefault().asyncExec(new Runnable() {
			
			public void run() {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TraceViewPart.ID);
				} catch (PartInitException e) {
					QVTODebugCore.log(e);
				}
			}
		});

		return Boolean.TRUE;
	}

}
