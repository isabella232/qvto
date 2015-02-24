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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.m2m.internal.qvt.oml.common.io.CFile;
import org.eclipse.m2m.internal.qvt.oml.common.io.CFolder;


public class BundleFile extends AbstractBundleResource implements CFile {
	private URL resourceURL;
	private String unitName;
	
	public BundleFile(IPath resourcePath, BundleModuleRegistry bundleRegistry) {
		super(resourcePath, bundleRegistry);
		this.resourceURL = Platform.getBundle(bundleRegistry.getBundleSymbolicName()).getResource(resourcePath.toString());
		this.unitName = resourcePath.removeFileExtension().lastSegment();
	}
	
	
	public InputStream getContents() throws IOException {
		if(resourceURL != null) {
			return resourceURL.openStream();
		}
		return new ByteArrayInputStream(new byte[0]);
	}
	
	public String getUnitName() {
		return unitName;
	}
	
	public String getCharset() throws IOException {
		return ResourcesPlugin.getEncoding();
	}
		
	public CFolder getParent() {
		if(resourcePath.segmentCount() > 1) {
			IPath parentPath = resourcePath.removeLastSegments(1);
			return new BundleFolder(parentPath, resourceRegistry);
		}
		return null;
	}

	public boolean exists() {
		return resourceURL != null;
	}	
}
