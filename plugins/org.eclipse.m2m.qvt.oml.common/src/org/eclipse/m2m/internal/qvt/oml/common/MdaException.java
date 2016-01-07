/*******************************************************************************
 * Copyright (c) 2007, 2008 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.common;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicDiagnostic;

/**
 * @author pkobiakov
 */
public class MdaException extends Exception {
	private static final long serialVersionUID = 4003559255399844949L;
	
	public MdaException(String message, IStatus status) {
		super(message);
		myStatus = status;
	}
	
	public MdaException(IStatus status) {
		this(status.getMessage(), status);
	}
	
	public MdaException(String message) {
		this(new Status(IStatus.ERROR, CommonPlugin.ID, message));
	}
	
	public MdaException(String message, Throwable cause) {
		this(message, BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(cause)));
	}
	
	public MdaException(Throwable cause) {
		this(cause.getMessage(), cause);
	}
	
	public IStatus getStatus() {
		return myStatus;
	}
	
	@Override
	public synchronized Throwable getCause() {
		return myStatus.getException();
	}
	
	private IStatus myStatus; 
}
