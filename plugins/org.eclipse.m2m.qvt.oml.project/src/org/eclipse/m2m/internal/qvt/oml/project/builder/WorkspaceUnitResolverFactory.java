/*******************************************************************************
 * Copyright (c) 2014, 2016 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Christopher Gerking - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.project.builder;

import java.util.Collections;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.NLS;
import org.eclipse.m2m.internal.qvt.oml.compiler.ResolverUtils;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolver;
import org.eclipse.m2m.internal.qvt.oml.compiler.UnitResolverFactory;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;
import org.eclipse.m2m.internal.qvt.oml.project.Messages;
import org.eclipse.m2m.internal.qvt.oml.project.QVTOProjectPlugin;

public class WorkspaceUnitResolverFactory extends UnitResolverFactory {

	@Override
	public boolean accepts(URI uri) {
		return EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE && (uri.isPlatformResource() || isWorkspacePath(uri));
	}

	@Override
	public UnitResolver getResolver(URI uri) {
		
		if(isWorkspacePath(uri)) {
			uri = URI.createPlatformResourceURI(uri.path(), false);
		}
		
		IResource file = URIUtils.getResource(uri);
		if (file == null) {
			return null;
		}
		
		try {	
			IContainer sourceContainer = QVTOBuilderConfig.getConfig(file.getProject()).getSourceContainer();
			if(sourceContainer != null) {
				if (!sourceContainer.exists()) {
					QVTOProjectPlugin.log(QVTOProjectPlugin.createStatus(IStatus.ERROR,
							NLS.bind(Messages.InvalidSourceContainer, sourceContainer), null));
					
					return null;
				}
				
				return new WorkspaceUnitResolver(Collections.singletonList(sourceContainer));
			}
		}
		catch (CoreException e) {
			QVTOProjectPlugin.log(e.getStatus());
		}
		
		return null;
	}

	@Override
	public String getQualifiedName(URI uri) {
		
		if(isWorkspacePath(uri)) {
			uri = URI.createPlatformResourceURI(uri.path(), false);
		}
		
		IResource resource = URIUtils.getResource(uri);
		if (resource == null) {
			return null;
		}
		
		try {
			IContainer sourceContainer = QVTOBuilderConfig.getConfig(resource.getProject()).getSourceContainer();
			URI sourceContainerUri = URIUtils.getResourceURI(sourceContainer);
			URI relativeUri = uri.deresolve(sourceContainerUri).trimFileExtension();
			assert (relativeUri.isRelative());
			
			// exclude first segment which is the source container itself
			String[] segments = relativeUri.segments();
			if(segments.length > 1) {
				return ResolverUtils.toQualifiedName(segments, 1, segments.length-1);
			}
		}
		catch(CoreException e) {
			QVTOProjectPlugin.log(e.getStatus());
		}
		
		return null;
	}
	
	private static boolean isWorkspacePath(URI uri) {
		return uri.scheme() == null && !uri.hasDevice() && !uri.hasAuthority()
				&& !uri.hasEmptyPath() && !uri.hasQuery() && !uri.hasFragment()
				&& uri.hasAbsolutePath();
	}
		
}