/*******************************************************************************
 * Copyright (c) 2007, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.common.io.eclipse;

import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.m2m.internal.qvt.oml.common.io.CFile;
import org.eclipse.m2m.internal.qvt.oml.common.io.CFolder;


public class BundleFolder extends AbstractBundleResource implements CFolder {
	
	public BundleFolder(IPath dirPath, BundleModuleRegistry resourceRegistry) {
		super(dirPath, resourceRegistry);
	}
	
	public CFolder getParent() {
		if(resourcePath.segmentCount() <= 1) {
			return null;
		}
		return new BundleFolder(resourcePath.removeLastSegments(1), resourceRegistry);
	}
	

	public CFile getFile(String name) {
		Collection<IPath> files = resourceRegistry.getChildFiles(resourcePath);
		for (IPath path : files) {
			if(name.equals(path.lastSegment())) {
				return new BundleFile(path, resourceRegistry);
			}
		}
		return null;
	}

	public boolean exists() {
		return true;
	}
	
}
