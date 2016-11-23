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
 *     Christopher Gerking - bugs 289982, 427237
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.ocl.transformations;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnit;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.LoadContext;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;
import org.eclipse.m2m.internal.qvt.oml.ocl.OclQvtoPlugin;

public class LegacyNativeLibraryProviderAdapter extends BlackboxProvider {
	
	private Map<String, BlackboxUnitDescriptor> fDescriptorMap;
	private final Map<LibraryDescriptor, BlackboxUnit> fBlackboxUnits = new LinkedHashMap<LibraryDescriptor, BlackboxUnit>();
	
	public LegacyNativeLibraryProviderAdapter() {
		super();
	}

	@Override
	public Collection<BlackboxUnitDescriptor> getUnitDescriptors(ResolutionContext loadContext) {
		return getDescriptorMap().values();
	}
	
	@Override
	public BlackboxUnitDescriptor getUnitDescriptor(String qualifiedName, ResolutionContext resolutionContext) {
		return getDescriptorMap().get(qualifiedName);		
	}
		
	@Override
	public void cleanup() {
		fBlackboxUnits.clear();
		fDescriptorMap = null;
	}
	
	private Map<String, BlackboxUnitDescriptor> getDescriptorMap() {
		if (fDescriptorMap != null) {
			return fDescriptorMap;
		}
		
		LibrariesRegistry registry = OclQvtoPlugin.getDefault().getLibrariesRegistry();

		fDescriptorMap = new LinkedHashMap<String, BlackboxUnitDescriptor>(registry.getLibraries().size());
		for (final Library lib : registry.getLibraries()) {
			fDescriptorMap.put(lib.getId(), new LibraryDescriptor(lib));			
		}
		
		return fDescriptorMap;
	}
	
	
	private class LibraryDescriptor extends BlackboxUnitDescriptor {

		private final Library fLibrary;
		private final Map<String, List<EOperation>> fDefinedOperations;
		
		protected LibraryDescriptor(Library library) {
			super(LegacyNativeLibraryProviderAdapter.this, library.getId());
			fLibrary = library;
			fDefinedOperations = new LinkedHashMap<String, List<EOperation>>();
		}
										
		@Override
		public BlackboxUnit load(LoadContext context) {
			
			if (fBlackboxUnits.containsKey(this)) {
				return fBlackboxUnits.get(this);
			}
			
			try {
				BlackboxUnit compilationUnit = createBlackboxUnit(Collections.singletonList(LegacyNativeLibSupport.INSTANCE.defineLibrary(fLibrary, fDefinedOperations)));			
				fBlackboxUnits.put(this, compilationUnit);
				return compilationUnit;
			} catch (LibraryCreationException e) {
				fBlackboxUnits.put(this, null);
				
				OclQvtoPlugin.getDefault().getLog().log(BasicDiagnostic.toIStatus(BasicDiagnostic.toDiagnostic(e)));

				return null;
			}
		}
	}	
}
