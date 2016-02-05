/*******************************************************************************
 * Copyright (c) 2016 Sergey Boyko and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sergey Boyko - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.runtime.jdt.blackbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;
import org.eclipse.ui.IEditorPart;

public class JdtBlackboxHelper {
	
	private JdtBlackboxHelper() {}

	public static void navigateToJavaElement(java.net.URI scriptContext, String qualifiedName, String elementName) {
		IResource resource = URIUtils.getResource(URI.createFileURI(scriptContext.getPath()));
		
		if (resource == null || !resource.exists()) {
			return;
		}
		
		List<IProject> projects = new ArrayList<IProject>();
		projects.add(resource.getProject());
		try {
			projects.addAll(Arrays.asList(resource.getProject().getReferencedProjects()));
		} catch (CoreException e) {
			// ignore
		}
		
		for (IProject project : projects) {
			IJavaProject javaProject = JavaCore.create(project);
			
			try {
				IType findType = javaProject.findType(qualifiedName);
				if (findType != null) {
					IEditorPart editorPart = JavaUI.openInEditor(findType);
					
					if (elementName != null) {
						for (IMethod m : findType.getMethods()) {
							if (m.getElementName().equals(elementName)) {
								JavaUI.revealInEditor(editorPart, m.getPrimaryElement());
							}
						}
					}
					
					return;
				}				
			} catch (Exception e) {
				// ignore
			}
		}
	}
	
	public static boolean isJdtUnitUri(URI uri) {
		return JdtBlackboxProvider.URI_BLACKBOX_JDT_QUERY.equals(uri.query());
	}
	
}
