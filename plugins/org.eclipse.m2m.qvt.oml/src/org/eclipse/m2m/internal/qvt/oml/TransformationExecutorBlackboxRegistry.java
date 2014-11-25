/*******************************************************************************
 * Copyright (c) 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Boyko Sergey - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxRegistry;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class TransformationExecutorBlackboxRegistry implements TransformationExecutor.BlackboxRegistry {

	public Diagnostic registerModules(Class<?>... classes) {
		BlackboxRegistry.INSTANCE.addStandaloneModules(classes);
		return Diagnostic.OK_INSTANCE;
	}

}
