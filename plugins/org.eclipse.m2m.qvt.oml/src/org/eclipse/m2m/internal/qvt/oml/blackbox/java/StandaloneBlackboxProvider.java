/*******************************************************************************
 * Copyright (c) 2008, 2016 Borland Software Corporation and others.
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

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;


public class StandaloneBlackboxProvider extends JavaBlackboxProvider {
	
	private Map<String, JavaUnitDescriptor> fDescriptorMap = new LinkedHashMap<String, JavaUnitDescriptor>();
	
	@Override
	public BlackboxUnitDescriptor getUnitDescriptor(final String qualifiedName, ResolutionContext resolutionContext) { 
		try {
			JavaUnitDescriptor d = fDescriptorMap.get(qualifiedName);
			
			if (d == null) {
				try {
					Class<?> c = Class.forName(qualifiedName);
					
					d = new JavaUnitDescriptor(qualifiedName) {
						
						@Override
						protected void handleBlackboxError(Diagnostic diagnostic) {
							QvtPlugin.logDiagnostic(diagnostic);
						}	
					};
					
					d.addModuleHandle(new ClassModuleHandle(c));
					
					fDescriptorMap.put(qualifiedName, d);
				}
				catch (ClassNotFoundException e) {
					return null;
				}
			}
			
			return d;
		}
		catch(RuntimeException e) {
			return null;
		}
	}
	
	public void registerDescriptor(final Class<?> cls, String unitQualifiedName, String moduleName, final String[] packageURIs) {
		JavaUnitDescriptor d = fDescriptorMap.get(unitQualifiedName);
		
		if (d == null) {
			d = new JavaUnitDescriptor(unitQualifiedName) {
				
				@Override
				protected void handleBlackboxError(Diagnostic diagnostic) {
					QvtPlugin.logDiagnostic(diagnostic);
				}
				
			};
			fDescriptorMap.put(unitQualifiedName, d);
		}

		d.addModuleHandle(
			new ClassModuleHandle(cls, moduleName) {
									
				@Override
				public List<String> getUsedPackages() {
					return Arrays.asList(packageURIs);
				}
			}
		);
	}

	@Override
	public Collection<JavaUnitDescriptor> getUnitDescriptors(ResolutionContext resolutionContext) {
		return fDescriptorMap.values();
	}

	@Override
	public void cleanup() {
		fDescriptorMap.clear();
	}
}
