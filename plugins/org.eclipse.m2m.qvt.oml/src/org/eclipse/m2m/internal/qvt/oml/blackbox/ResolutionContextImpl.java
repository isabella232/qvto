/*******************************************************************************
 * Copyright (c) 2008, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.blackbox;

import org.eclipse.emf.common.util.URI;

public class ResolutionContextImpl implements ResolutionContext {
	
	private final URI fURI;	
	
	public ResolutionContextImpl(URI contextURI) {
		if(contextURI == null) {
			throw new IllegalArgumentException();
		}
		
		fURI = contextURI;
	}

	@Override
	public String toString() {	
		return "Resolution context (" + fURI.toString() + ")"; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	public URI getURI() {
		return fURI;
	}			
}
