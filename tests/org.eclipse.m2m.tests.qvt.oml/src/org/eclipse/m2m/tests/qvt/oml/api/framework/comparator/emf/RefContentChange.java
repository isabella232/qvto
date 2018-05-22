/*******************************************************************************
 * Copyright (c) 2007, 2016 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.api.framework.comparator.emf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.m2m.tests.qvt.oml.api.framework.comparator.tree.ContentChange;


/**
 * @author pkobiakov
 */
public class RefContentChange extends ContentChange.Adapter {
	public RefContentChange(EObject obj, EReference ref, Object left, Object right, final int cmp) {
		myObj = obj;
		myRef = ref;
		myLeft = left;
		myRight = right;
		myCmp = cmp;
	}
	
	public int getCmp() {
		return myCmp;
	}
	
	@Override
	public String toString() {
		return "RefContentChange:obj=" + myObj.eClass().getName() + ",ref=" + myRef.getName() + ",change= (" + myLeft + "->" + myRight + ")"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
	}
	
	private final EObject       myObj;
	private final EReference    myRef;
	private final Object        myLeft;
	private final Object        myRight;
	private final int           myCmp;
}
