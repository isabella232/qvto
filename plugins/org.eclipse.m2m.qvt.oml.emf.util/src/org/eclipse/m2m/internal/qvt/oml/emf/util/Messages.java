/*******************************************************************************
 * Copyright (c) 2007, 2018 Borland Software Corporation and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Ed Willink - bug 533565
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.emf.util;

import org.eclipse.osgi.util.NLS;

public class Messages {
	private Messages() {
	}

	public static String EmfUtil_1;
	public static String EmfUtil_2;
	public static String EmfUtil_3;
	public static String EmfUtil_5;
	public static String EmfUtil_6;

	public static String EMFUtil_FailedToLoad;
	public static String EMFUtil_ResourceDiagnostic;

	private static final String BUNDLE_NAME = "org.eclipse.m2m.internal.qvt.oml.emf.util.messages"; //$NON-NLS-1$
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
