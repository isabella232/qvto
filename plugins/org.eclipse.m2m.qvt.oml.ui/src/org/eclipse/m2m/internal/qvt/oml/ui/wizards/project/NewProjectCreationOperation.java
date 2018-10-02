/*******************************************************************************
 * Copyright (c) 2009, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christopher Gerking - bugs 319078, 414662, 536601
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.ui.wizards.project;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Arrays;

import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.m2m.internal.qvt.oml.ui.QVTUIPlugin;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

class NewProjectCreationOperation extends WorkspaceModifyOperation {

	private static final String BUILD_FILENAME_DESCRIPTOR = "build.properties"; //$NON-NLS-1$
	
	private static final String PLUGIN_NATURE = "org.eclipse.pde.PluginNature"; //$NON-NLS-1$
	
		
	// instance fields
	private PluginClassCodeGenerator fGenerator;	
	
	private NewProjectData fData;
	
	private IProject fProjectHandle; 

	
	public NewProjectCreationOperation(IProject projectHandle, NewProjectData projectData) {
		if(projectHandle == null || projectData == null) {
			throw new IllegalArgumentException();
		}

		fData = projectData;
		fProjectHandle = projectHandle;
	}
	
	protected void createContents(IProgressMonitor monitor, IProject project) throws CoreException, InterruptedException {
		SubMonitor.done(monitor);
	}
	
	private void createBuildProperties(IProject project, IProgressMonitor monitor) throws CoreException {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor, 4);
		
		IFile buildProperties = project.getFile(BUILD_FILENAME_DESCRIPTOR);
		StringWriter contents = new StringWriter();
		PrintWriter wr = new PrintWriter(contents, true);
		
		if(fData.isCreateJava()) {
			IPath sourceFolder = asBinIncludesFolder(createJavaFolder(fData.getSourceFolderName(), subMonitor.split(1)));
			IPath outFolder = asBinIncludesFolder(createJavaFolder(fData.getOutFolderName(), subMonitor.split(1)));

			wr.append("source.. = ").println(sourceFolder.toString()); //$NON-NLS-1$
			wr.append("output.. = ").println(outFolder.toString()); //$NON-NLS-1$
		}

		char[] alignChars = new char[15];
		Arrays.fill(alignChars, ' ');
		String indent = new String(alignChars);
		
		wr.print("bin.includes = META-INF/"); //$NON-NLS-1$
		if(fData.isCreateJava()) {
			wr.println(",\\"); //$NON-NLS-1$
			wr.append(indent).append('.');
		}

		IContainer qvtContainer = createJavaFolder(fData.getQVTSourceFolderName(), subMonitor.split(1));
		IPath qvtFolder = asBinIncludesFolder(qvtContainer);
		if(!fProjectHandle.equals(qvtContainer) || !fData.isCreateJava()) {
			wr.println(",\\"); //$NON-NLS-1$
			wr.append(indent).append(qvtFolder.toString());
		}

		wr.println();
		wr.flush();
		
		InputStream is = createContentStreamForNewFile(buildProperties, contents.getBuffer().toString());
		buildProperties.create(is, false, subMonitor.split(1));
	}

	private void createManifest(IFolder metaFolder, IProgressMonitor monitor) throws CoreException {
		IFile manifest = metaFolder.getFile("MANIFEST.MF"); //$NON-NLS-1$
		StringWriter contents = new StringWriter();
		PrintWriter wr = new PrintWriter(contents, true);

		wr.println("Manifest-Version: 1.0"); //$NON-NLS-1$
		wr.println("Bundle-ManifestVersion: 2"); //$NON-NLS-1$
		wr.append("Bundle-Name: ").println(fData.getName()); //$NON-NLS-1$
		wr.append("Bundle-SymbolicName: ").println(fData.getID()); //$NON-NLS-1$
		wr.append("Bundle-Version: ").println(fData.getVersion()); //$NON-NLS-1$
		if (fData.isDoGenerateClass() && fData.getClassName().length() > 0) {
			wr.append("Bundle-Activator: ").println(fData.getClassName()); //$NON-NLS-1$
		}
		if (fData.getProviderName().length() > 0) {
			wr.append("Bundle-Vendor: ").println(fData.getProviderName()); //$NON-NLS-1$
		}

		PluginReference[] dependencies = getDependencies();
		if (dependencies.length > 0) {
			wr.append("Require-Bundle:"); //$NON-NLS-1$

			int i = 0;
			for (PluginReference pluginReference : dependencies) {
				if (i++ > 0) {
					wr.println(',');
				}
				wr.append(' ');
				wr.append(pluginReference.getId());
			}
			wr.println();
		}

		if (fData.isCreateJava()) {
			String requiredEnv = JdtProjectIntegrationHelper.getRequiredExecutionEnv(fData.getfExecutionEnv());
			if (requiredEnv != null) {
				wr.println(requiredEnv);
			}
		}
		
		wr.println("Bundle-ActivationPolicy: lazy"); //$NON-NLS-1$

		wr.flush();

		InputStream is = createContentStreamForNewFile(manifest, contents.getBuffer().toString());
		manifest.create(is, false, monitor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.actions.WorkspaceModifyOperation#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(monitor, Messages.NewProjectCreationOperation_createQVTProjectTask, 2);
				
		try {
			createProject(subMonitor.split(1));
			createContents(subMonitor.split(1), fProjectHandle);
		}
		finally {
			SubMonitor.done(monitor);
		}
	}


	private void generateTopLevelPluginClass(IProgressMonitor monitor) throws CoreException {
		fGenerator.generate(monitor);
	}

	private PluginReference[] getDependencies() {
		if (fGenerator == null) {
			return new PluginReference[0];
		}
		return fGenerator.getDependencies();
	}
	
	private void createProject(IProgressMonitor monitor) throws CoreException {
		
		// compute total amount of work
		int totalWork = 2;
		totalWork += fData.isPlugin() ? 4 : 0;
		totalWork += fData.isCreateJava() ? 2 : 0;
		
        SubMonitor subMonitor = SubMonitor.convert(monitor, totalWork);
		
        URI location = URIUtil.toURI(fData.getLocation());

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProjectDescription description = workspace.newProjectDescription(fProjectHandle.getName());
		if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
			location = null;
		}
		description.setLocationURI(location); 
						
		if(!fProjectHandle.exists()) {
			fProjectHandle.create(description, subMonitor.split(1));
		}
		subMonitor.setWorkRemaining(totalWork - 1);

        fProjectHandle.open(IResource.BACKGROUND_REFRESH, subMonitor.split(1));
        
        if (fData.isPlugin()) {
			addNatureToProject(fProjectHandle, PLUGIN_NATURE, subMonitor.split(1));
			
			fGenerator = new PluginClassCodeGenerator(fProjectHandle, fData);
        }
        			
		if(fData.isCreateJava()) {
			JdtProjectIntegrationHelper.setupJava(fProjectHandle, true, 
					fData.getSourceFolderName(), fData.getOutFolderName(), fData.getfExecutionEnv(), subMonitor.split(1));

			if(fData.isDoGenerateClass()) {
				generateTopLevelPluginClass(subMonitor.split(1));
			}	
		}
					
		if (fData.isPlugin()) {
			// generate the manifest file
			IFolder metaFolder = fProjectHandle.getFolder("META-INF"); //$NON-NLS-1$
			metaFolder.create(true, true, subMonitor.split(1));

			createManifest(metaFolder, subMonitor.split(1));
			
			// generate the build.properties file
			createBuildProperties(fProjectHandle, subMonitor.split(1));

		}
	}

	private void addNatureToProject(IProject proj, String natureId, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = proj.getDescription();
		String[] prevNatures = description.getNatureIds();
		String[] newNatures = new String[prevNatures.length + 1];
		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[prevNatures.length] = natureId;
		description.setNatureIds(newNatures);
		proj.setDescription(description, monitor);
	}
	
	private InputStream createContentStreamForNewFile(IFile fileHandle, String contents) {
		String charset = null;
		try {
			charset = fileHandle.getProject().getDefaultCharset();
		} catch (CoreException e) {
			QVTUIPlugin.log(e.getStatus());
		}

		if(charset == null) {
			charset = ResourcesPlugin.getEncoding();
		}

		byte[] bytes;
		try {
			bytes = contents.getBytes(charset);
		} catch (UnsupportedEncodingException e) {
			bytes = contents.getBytes();	
		}
		
		return new ByteArrayInputStream(bytes);
	}
	
	private IPath asBinIncludesFolder(IContainer container) {
		if(container.equals(fProjectHandle)) {
			return new Path("."); //$NON-NLS-1$
		}
		IPath result = container.getProjectRelativePath();   
		while(result.hasTrailingSeparator()) {
			result = result.removeTrailingSeparator();
		}
		// ensure single trailing slash
		return result.addTrailingSeparator(); 
	}
	
	private IContainer createJavaFolder(String folderName, IProgressMonitor monitor) throws CoreException {
		try {
			if(folderName == null || folderName.trim().length() == 0) {
				return fProjectHandle;			
			}
			
			IFolder folder = fProjectHandle.getFolder(folderName);
			if(!folder.exists()) {
				folder.create(true, true, monitor);
			}
			return folder;
		} finally {
			SubMonitor.done(monitor);
		}
	}	
}
