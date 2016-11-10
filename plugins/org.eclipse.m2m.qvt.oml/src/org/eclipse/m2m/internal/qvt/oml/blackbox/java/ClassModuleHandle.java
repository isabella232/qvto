/*******************************************************************************
 * Copyright (c) 2009, 2016 Christopher Gerking and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.blackbox.java;

public class ClassModuleHandle extends ModuleHandle {
	
	private Class<?> cls;
	
	public ClassModuleHandle(Class<?> c) {
		this(c, c.getSimpleName());
	}
	
	public ClassModuleHandle(Class<?> c, String moduleName) {
		super(c.getName(), moduleName);
		
		this.cls = c;
	}
	
	@Override
	public Class<?> getModuleJavaClass() {
		return cls;
	}
	
	@Override
	public String getJavaClassName() {
		return cls.getName();
	}
}
