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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.QvtPlugin;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;


public class StandaloneBlackboxProvider extends JavaBlackboxProvider {
	
	public static final String URI_BLACKBOX_STANDALONE_QUERY = "standalone"; //$NON-NLS-1$
	
	private Map<String, JavaUnitDescriptor> fDescriptorMap = new LinkedHashMap<String, JavaUnitDescriptor>();
	
	@Override
	public JavaUnitDescriptor getUnitDescriptor(final String qualifiedName, ResolutionContext resolutionContext) { 
		try {
			JavaUnitDescriptor d = fDescriptorMap.get(qualifiedName);
			
			if (d == null) {
				try {
					Class<?> c = Class.forName(qualifiedName);
					
					d = new JavaUnitDescriptor(qualifiedName) {
						
						@Override
						protected String getUnitQuery() {
							return URI_BLACKBOX_STANDALONE_QUERY;
						}
						
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
	
	@Override
	public Collection<JavaUnitDescriptor> getUnitDescriptors(ResolutionContext resolutionContext) {
		List<JavaUnitDescriptor> result = Collections.emptyList();

		if (resolutionContext.getDeclaredLibraries().isEmpty()) {
			return fDescriptorMap.values();
		}
		else {
			for (URI libraryUri : resolutionContext.getDeclaredLibraries().keySet()) {
				if (URI_BLACKBOX_STANDALONE_QUERY.equals(libraryUri.query())) {
					JavaUnitDescriptor descriptor = getUnitDescriptor(libraryUri.segment(0), resolutionContext);
					if (descriptor != null) {
						if (result.isEmpty()) {
							result = new LinkedList<JavaUnitDescriptor>();
						}
						result.add(descriptor);
					}
				}
			}
		}
		
		return result;
	}

	@Override
	public void cleanup() {
		fDescriptorMap.clear();
	}

	public void registerDescriptor(final Class<?> cls, String unitQualifiedName, String moduleName, final String[] packageURIs) {
		JavaUnitDescriptor d = fDescriptorMap.get(unitQualifiedName);
		
		if (d == null) {
			d = new JavaUnitDescriptor(unitQualifiedName) {
				
				@Override
				protected String getUnitQuery() {
					return URI_BLACKBOX_STANDALONE_QUERY;
				}
				
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

}
