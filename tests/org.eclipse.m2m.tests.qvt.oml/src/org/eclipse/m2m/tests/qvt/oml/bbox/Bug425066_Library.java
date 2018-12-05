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
 *     Christopher Gerking - bug 425066
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.bbox;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

public class Bug425066_Library {
		
	@Operation (kind=Kind.HELPER)
	public EClass getEClass() {
		return EcoreFactory.eINSTANCE.createEClass();
	}
	
	@Operation (kind=Kind.MAPPING)
	public EClass createEClass1() {
		return getEClass();
	}
	
	@Operation (kind=Kind.MAPPING)
	public EClass createEClass2() {
		return getEClass();
	}
	
	@Operation (kind=Kind.CONSTRUCTOR, contextual = true)
	public void EClass(EClass result, int i) {}
	
	@Operation (kind=Kind.CONSTRUCTOR, contextual = true)
	public void EClass(EClass result, String s) {}	
}
