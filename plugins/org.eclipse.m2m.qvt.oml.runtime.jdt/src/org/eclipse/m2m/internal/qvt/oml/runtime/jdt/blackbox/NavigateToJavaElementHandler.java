package org.eclipse.m2m.internal.qvt.oml.runtime.jdt.blackbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.IStatusHandler;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.m2m.internal.qvt.oml.emf.util.URIUtils;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

public class NavigateToJavaElementHandler implements IStatusHandler {

	public Object handleStatus(IStatus status, Object source) throws CoreException {
		if(false == source instanceof Object[]) {
			return Boolean.FALSE;
		}
		final Object[] args = (Object[])source;
		if(args.length < 2) {
			return Boolean.FALSE;
		}

		Display.getDefault().asyncExec(new Runnable() {
			
			public void run() {
				navigateToJavaElement((java.net.URI) args[0], (String) args[1], (String) args[2]);
			}
		});
		
		return Boolean.TRUE;
	}
	
	private static void navigateToJavaElement(java.net.URI scriptContext, String qualifiedName, String elementName) {
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

}
