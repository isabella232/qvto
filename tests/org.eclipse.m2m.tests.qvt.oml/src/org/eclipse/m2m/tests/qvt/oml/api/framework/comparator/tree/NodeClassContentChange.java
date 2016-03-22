/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.api.framework.comparator.tree;

import org.eclipse.m2m.tests.qvt.oml.api.framework.comparator.edit.TreeEdit;

/**
 * @author pkobiakov
 */
public class NodeClassContentChange extends ContentChange.Adapter {
	public NodeClassContentChange(ComparatorTreeNode left, ComparatorTreeNode right) {
		myLeft = left;
		myRight = right;
		myCmp = myLeft.getClass().getName().compareTo(myRight.getClass().getName()) * TreeEdit.UNWANTED_CHANGE_COST;
	}
	
	public int getCmp() {
		return myCmp;
	}
	
	@Override
	public String toString() {
		return "NodeClassContentChange:" + myLeft + "->" + myRight; //$NON-NLS-1$ //$NON-NLS-2$
	}

	private final ComparatorTreeNode myLeft;
	private final ComparatorTreeNode myRight;
	private final int myCmp;
}
