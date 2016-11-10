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
 *     Christopher Gerking - bugs 289982, 326871, 427237
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.blackbox;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalModuleEnv;


public abstract class BlackboxUnitDescriptor {
	
	public static final String URI_QVTO_SCHEME = "qvto"; //$NON-NLS-1$
	public static final String URI_BLACKBOX_AUTHORITY = "blackbox"; //$NON-NLS-1$	
	
	private URI fURI;
	private String fQualifiedName;
	private String fDescription;
	private BlackboxProvider fProvider;
	
	/**
	 * @throws IllegalArgumentException
	 */
	protected BlackboxUnitDescriptor(BlackboxProvider provider, String qualifiedName, String... uriSegments) {
		if(provider == null || qualifiedName == null) {
			throw new IllegalArgumentException("null 'qualified name' or 'provider'"); //$NON-NLS-1$
		}
		
		if(uriSegments == null || uriSegments.length == 0) {
			throw new IllegalArgumentException("Invalid unit uri segments"); //$NON-NLS-1$
		}
		
		fProvider = provider;
		fQualifiedName = qualifiedName;
		// TODO - better error handling of invalid segments
		fURI = URI.createHierarchicalURI(URI_QVTO_SCHEME, URI_BLACKBOX_AUTHORITY, null, uriSegments, getUnitQuery(), getFragment());		
	}
	
	protected String getUnitQuery() {
		return null;
	}

	protected String getFragment() {
		return null;
	}

	protected BlackboxUnitDescriptor(BlackboxProvider provider, String qualifiedName) {
		this(provider, qualifiedName, qualifiedName);
	}
		
	protected BlackboxProvider getProvider() {
		return fProvider;
	}
	
	protected void setDescription(String description) {
		fDescription = description;
	}

	public final URI getURI() {
		return fURI;
	}	
	
	public String getDescription() {
		return fDescription; 
	}	
	
	public String getQualifiedName() {
		return fQualifiedName;
	}
	
	@Override
	public String toString() {
		return "Descriptor: " + fQualifiedName + " - " + getProvider().toString(); //$NON-NLS-1$ //$NON-NLS-2$ 
	}
	
	protected final BlackboxUnit createBlackboxUnit(
			final List<QvtOperationalModuleEnv> loadedModules) {
		return new BlackboxUnit() {
			public List<QvtOperationalModuleEnv> getElements() {
				return Collections.unmodifiableList(loadedModules);
			}
			public Diagnostic getDiagnostic() {
				return Diagnostic.OK_INSTANCE;
			}
		};
	}
	
	public abstract BlackboxUnit load(LoadContext context);
}