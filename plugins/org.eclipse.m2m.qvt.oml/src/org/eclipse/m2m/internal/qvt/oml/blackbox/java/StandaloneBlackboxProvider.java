/*******************************************************************************
 * Copyright (c) 2008, 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christopher Gerking - bug 326871
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.blackbox.java;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.m2m.internal.qvt.oml.blackbox.AbstractCompilationUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;


public class StandaloneBlackboxProvider extends JavaBlackboxProvider {
	
	private Map<String, AbstractCompilationUnitDescriptor> fDescriptorMap = new LinkedHashMap<String, AbstractCompilationUnitDescriptor>();
	
	@Override
	public AbstractCompilationUnitDescriptor getModuleDescriptor(String qualifiedName, ResolutionContext resolutionContext) { 
		try {
			AbstractCompilationUnitDescriptor d = fDescriptorMap.get(qualifiedName);
			if (d == null) {
				d = new StandaloneDescriptor(qualifiedName);
				fDescriptorMap.put(qualifiedName, d);
			}
			return d;
		} catch(ClassNotFoundException e) {
			return null;
		}
	}
	
	public void registerDescriptor(final Class<?> cls) {
		JavaUnitDescriptor d = new JavaUnitDescriptor(cls.getName()) {};
		
		try {
			d.addModuleHandle(new StandaloneModuleHandle(d.getQualifiedName(), cls.getSimpleName()) {
				@Override
				public Class<?> getModuleJavaClass() throws ClassNotFoundException {
					return cls;
				}
			});

			fDescriptorMap.put(d.getQualifiedName(), d);
		} catch (ClassNotFoundException e) {
		}
	}

	@Override
	public Collection<AbstractCompilationUnitDescriptor> getModuleDescriptors(ResolutionContext resolutionContext) {
		return fDescriptorMap.values();
	}

	@Override
	public void cleanup() {
		super.cleanup();
		fDescriptorMap = new LinkedHashMap<String, AbstractCompilationUnitDescriptor>();
	}
	
	private class StandaloneDescriptor extends JavaUnitDescriptor {		
				
		StandaloneDescriptor(String unitQualifiedName) throws ClassNotFoundException {
			super(unitQualifiedName); 
			
			addModuleHandle(new StandaloneModuleHandle(unitQualifiedName, getSimpleNameFromJavaClass(unitQualifiedName)));			
		}
						
	}

}
