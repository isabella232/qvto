/*******************************************************************************
 * Copyright (c) 2014, 2015 Borland Software Corporation and others.
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
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;

public class TransformationExecutorBlackboxRegistry implements TransformationExecutor.BlackboxRegistry {

	public Diagnostic registerModules(Class<?>... classes) {
		for(Class<?> cls : classes) {
			registerModule(cls);
		}
		return Diagnostic.OK_INSTANCE;
	}
	
	public Diagnostic registerModule(Class<?> cls) {
		return registerModule(cls, cls.getName());
	}
	
	public Diagnostic registerModule(Class<?> cls, String unitName) {
		return registerModule(cls, unitName, cls.getSimpleName());
	}
	
	public Diagnostic registerModule(Class<?> cls, String unitName, String moduleName) {
		Module annotation = cls.getAnnotation(Module.class);
		return registerModule(cls, unitName, moduleName, annotation == null ? new String[] {} : annotation.packageURIs());
	}
	
	public Diagnostic registerModule(Class<?> cls, String unitName, String moduleName, String[] packageURIs) {
		BlackboxRegistry.INSTANCE.addStandaloneModule(cls, unitName, moduleName, packageURIs);
		return Diagnostic.OK_INSTANCE;
	}

}
