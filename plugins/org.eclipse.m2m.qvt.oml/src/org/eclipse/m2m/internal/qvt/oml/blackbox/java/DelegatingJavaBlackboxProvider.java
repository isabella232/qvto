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

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxUnitDescriptor;
import org.eclipse.m2m.internal.qvt.oml.blackbox.ResolutionContext;

public abstract class DelegatingJavaBlackboxProvider extends JavaBlackboxProvider {

	private BlackboxProvider parent;

	public DelegatingJavaBlackboxProvider(BlackboxProvider parent) {
		this.parent = parent;
	}
	
	public final BlackboxProvider getParent() {
		return parent;
	}

	@Override
	public final Collection<? extends BlackboxUnitDescriptor> getUnitDescriptors(ResolutionContext resolutionContext) {
		
		Collection<? extends BlackboxUnitDescriptor> parentDescriptors = Collections.emptyList();//parent.getUnitDescriptors(resolutionContext);
		
		Map<String, BlackboxUnitDescriptor> descriptors = new HashMap<String, BlackboxUnitDescriptor>(parentDescriptors.size());
		for(BlackboxUnitDescriptor parentDescriptor : parentDescriptors) {
			descriptors.put(parentDescriptor.getQualifiedName(), parentDescriptor);
		};
		
		Collection<? extends BlackboxUnitDescriptor> localDescriptors = getLocalUnitDescriptors(resolutionContext);
		
		for(BlackboxUnitDescriptor localDescriptor : localDescriptors) {
			descriptors.put(localDescriptor.getQualifiedName(), localDescriptor);
		};
		
		return descriptors.values();
	}

	@Override
	public final BlackboxUnitDescriptor getUnitDescriptor(String qualifiedName, ResolutionContext resolutionContext) {
		
		BlackboxUnitDescriptor descriptor = getLocalUnitDescriptor(qualifiedName, resolutionContext);
		
		//if (descriptor == null) descriptor = parent.getUnitDescriptor(qualifiedName, resolutionContext);
		
		return descriptor;
	}
	
	protected abstract Collection<? extends BlackboxUnitDescriptor> getLocalUnitDescriptors(ResolutionContext resolutionContext);
	
	protected abstract BlackboxUnitDescriptor getLocalUnitDescriptor(String qualifiedName, ResolutionContext resolutionContext);

}