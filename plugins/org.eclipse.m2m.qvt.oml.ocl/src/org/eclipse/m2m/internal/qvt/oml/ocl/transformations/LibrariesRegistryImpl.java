/*******************************************************************************
 * Copyright (c) 2007, 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
/*
 * Created on Jun 29, 2005
 */
package org.eclipse.m2m.internal.qvt.oml.ocl.transformations;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.m2m.internal.qvt.oml.ocl.Logger;


public class LibrariesRegistryImpl implements LibrariesRegistry {

    private static final String LIBRARY_TAG = "library"; //$NON-NLS-1$

    private final Map<String, Library> myLibraries;

    public LibrariesRegistryImpl(IConfigurationElement[] configurations) {
        myLibraries = Collections.unmodifiableMap(load(configurations));
    }

    public Map<String, Library> getLibraries() {
        return myLibraries;
    }
    
    private static Map<String, Library> load(IConfigurationElement[] configurations) {
        Map<String, Library> libraries = new LinkedHashMap<String, Library>(configurations.length);
        
        for (int i = 0; i < configurations.length; i++) {
            if (!LIBRARY_TAG.equals(configurations[i].getName())) {
                Logger.getLogger().log(Logger.WARNING,
                        "Unrecognized tag : " //$NON-NLS-1$
                                + configurations[i].getName());
                continue;
            }
            
            try {
                Library lib = new LibraryImpl(configurations[i]);
                
                if (!libraries.containsKey(lib.getId())) {
					libraries.put(lib.getId(), lib);
                } else {
                    Logger.getLogger().log(Logger.SEVERE,
                            "Library with the same Id was already registered. Skipping: " //$NON-NLS-1$
                                    + configurations[i].getNamespaceIdentifier());
                }
            } catch (LibraryCreationException e) {
                Logger.getLogger().log(Logger.SEVERE,
                        "LibraryImpl was not created", e); //$NON-NLS-1$
            }
        }
		return libraries;
    }
}
