/*******************************************************************************
 * Copyright (c) 2008, 2011 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.blackbox;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;

public class ResolutionContextImpl implements ResolutionContext {
	
	private final URI fURI;	
	private final Map<URI, Set<String>> fDeclaredLibraries;
	
	public ResolutionContextImpl(URI contextURI, Map<URI, Set<String>> declaredLibraries) {
		if(contextURI == null) {
			throw new IllegalArgumentException();
		}
		
		fURI = contextURI;
		fDeclaredLibraries = declaredLibraries;
	}
	
	public ResolutionContextImpl(URI contextURI) {
		this(contextURI, Collections.<URI, Set<String>>emptyMap());
	}

	@Override
	public String toString() {	
		return "Resolution context (" + fURI.toString() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public URI getURI() {
		return fURI;
	}			
	
	public Map<URI, Set<String>> getDeclaredLibraries() {
		return fDeclaredLibraries;
	}
	
}
