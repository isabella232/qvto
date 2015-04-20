/*******************************************************************************
 * Copyright (c) 2008, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.bbox;

import java.util.Date;

import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;


@Module(packageURIs={
	"http://www.eclipse.org/emf/2002/Ecore"
	})
public class SimpleJavaLibrary {
	
	public SimpleJavaLibrary() {
		 super();
	}
	
	public String echoFromSimpleJavaLibrary(String str) {
		return str;
	}
	
	public Date simpleCreateDate(String dateStr) {
		return (Date) EcoreFactory.eINSTANCE.createFromString(EcorePackage.eINSTANCE.getEDate(), dateStr);
	}
	
	@Operation(contextual=true)
	public static boolean isBefore(Date self, Date when) {
		return self.before(when);
	}		
	
}
