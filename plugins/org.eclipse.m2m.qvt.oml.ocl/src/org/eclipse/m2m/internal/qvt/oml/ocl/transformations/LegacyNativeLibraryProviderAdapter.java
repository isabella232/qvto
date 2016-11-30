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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnit;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.LoadContext;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;
import org.eclipse.m2m.internal.qvt.oml.ocl.OclQvtoPlugin;

public class LegacyNativeLibraryProviderAdapter extends BlackboxProvider {
	
	private static final String URI_BLACKBOX_LEGACY_QUERY = "legacy"; //$NON-NLS-1$
	
	private final Map<String, BlackboxUnitDescriptor> fDescriptorMap = new LinkedHashMap<String, BlackboxUnitDescriptor>();
	private final Map<LibraryDescriptor, BlackboxUnit> fBlackboxUnits = new LinkedHashMap<LibraryDescriptor, BlackboxUnit>();
	
	public LegacyNativeLibraryProviderAdapter() {}

	@Override
	public BlackboxUnitDescriptor getUnitDescriptor(String qualifiedName, ResolutionContext resolutionContext) {
		Library library = getOclLibraries().get(qualifiedName);
		if (library == null) {
			return null;
		}
		
		BlackboxUnitDescriptor descriptor = fDescriptorMap.get(qualifiedName);
		if (descriptor == null) {
			descriptor = new LibraryDescriptor(library);
			fDescriptorMap.put(qualifiedName, descriptor);
		}
		
		return descriptor;
	}
		
	@Override
	public Collection<BlackboxUnitDescriptor> getUnitDescriptors(ResolutionContext loadContext) {
		List<BlackboxUnitDescriptor> result = Collections.emptyList();

		if (loadContext.getDeclaredLibraries().isEmpty()) {
			result = new LinkedList<BlackboxUnitDescriptor>();

			for (String libId : getOclLibraries().keySet()) {
				result.add(getUnitDescriptor(libId, loadContext));
			}
		}
		else {
			for (URI libraryUri : loadContext.getDeclaredLibraries().keySet()) {
				if (URI_BLACKBOX_LEGACY_QUERY.equals(libraryUri.query())) {
					BlackboxUnitDescriptor descriptor = getUnitDescriptor(libraryUri.segment(0), loadContext);
					if (descriptor != null) {
						if (result.isEmpty()) {
							result = new LinkedList<BlackboxUnitDescriptor>();
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
		fBlackboxUnits.clear();
		fDescriptorMap.clear();
	}
	
	private Map<String, Library> getOclLibraries() {
		return OclQvtoPlugin.getDefault().getLibrariesRegistry().getLibraries();
	}
	
	
	private class LibraryDescriptor extends BlackboxUnitDescriptor {

		private final Library fLibrary;
		
		protected LibraryDescriptor(Library library) {
			super(LegacyNativeLibraryProviderAdapter.this, library.getId());
			fLibrary = library;
		}
		
		@Override
		protected String getUnitQuery() {
			return URI_BLACKBOX_LEGACY_QUERY;
		}
										
		@Override
		public BlackboxUnit load(LoadContext context) {
			
			if (fBlackboxUnits.containsKey(this)) {
				return fBlackboxUnits.get(this);
			}
			
			try {
				BlackboxUnit compilationUnit = createBlackboxUnit(Collections.singletonList(LegacyNativeLibSupport.INSTANCE.defineLibrary(fLibrary, getURI())));			
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
