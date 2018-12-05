/*******************************************************************************
 * Copyright (c) 2007, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.api.framework.comparator.edit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** @author pkobiakov */
public class CompositeEdit implements TreeEdit {
	
	public CompositeEdit(List<TreeEdit> edits) {
		myEdits = new ArrayList<TreeEdit>(edits.size());
		
		for(TreeEdit edit : edits) {
			addTreeEdit(edit);
		}
		
		myCumulativeCost = -1;
	}
	
	public CompositeEdit(TreeEdit first, TreeEdit second) {
		myEdits = new ArrayList<TreeEdit>(2);
		
		addTreeEdit(first);
		addTreeEdit(second);
		
		myCumulativeCost = -1;
	}

	private void addTreeEdit(TreeEdit second) {
		if(second.getCost() > 0) {
			if(second instanceof CompositeEdit) {
				myEdits.addAll(((CompositeEdit)second).myEdits);
			}
			else {
				myEdits.add(second);
			}
		}
	}
	
	public int getCost() {
		if(myCumulativeCost == -1) {
			myCumulativeCost = 0;
			for(TreeEdit edit : myEdits) {
				myCumulativeCost += edit.getCost();
			}
		}
		
		return myCumulativeCost;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof CompositeEdit == false) {
			return false;
		}
		
		CompositeEdit edit = (CompositeEdit)o;
		return myEdits.equals(edit.myEdits);
	}
	
	@Override
	public int hashCode() { return 0; }

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		
		for(Iterator<?> editIt = myEdits.iterator(); editIt.hasNext(); ) {
			TreeEdit edit = (TreeEdit)editIt.next();
			if(s.length() > 0) {
				s.append("\n"); //$NON-NLS-1$
			}
			s.append(edit.toString());
		}
		
		return "[" + s.toString() + "]"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	private final List<TreeEdit>  myEdits;
	private int   myCumulativeCost;
}
