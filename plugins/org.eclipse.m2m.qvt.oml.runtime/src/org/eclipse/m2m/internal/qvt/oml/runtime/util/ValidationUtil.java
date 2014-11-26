/*******************************************************************************
 * Copyright (c) 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.runtime.util;

import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation;

public class ValidationUtil {
	
	public static boolean isRunnable(QvtTransformation transformation) throws MdaException {
		return transformation.isBlackbox() && transformation.hasEntryOperation();
	}

}
