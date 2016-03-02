/*******************************************************************************
 * Copyright (c) 2016 Christopher Gerking and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.jdt.runtime.blackbox;

import java.util.Collections;
import java.util.List;

import org.eclipse.m2m.internal.qvt.oml.blackbox.java.ModuleHandle;

public class JdtModuleHandle extends ModuleHandle {
	
	private final Class<?> moduleJavaClass;
		
	JdtModuleHandle(String moduleName, Class<?> moduleJavaClass) {
		super(moduleJavaClass.getName(), moduleName);
		this.moduleJavaClass = moduleJavaClass;
	}
		
	@Override
	public List<String> getUsedPackages() {
		return Collections.emptyList();
	}
	
	@Override
	public Class<?> getModuleJavaClass() throws ClassNotFoundException {
		return moduleJavaClass;
	}

}
