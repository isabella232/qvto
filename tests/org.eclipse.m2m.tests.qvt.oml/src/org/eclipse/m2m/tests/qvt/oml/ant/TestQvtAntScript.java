/*******************************************************************************
 * Copyright (c) 2008, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christopher Gerking - Bug394188
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.ant;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.internal.qvt.oml.common.io.FileUtil;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtil;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ModelContent;
import org.eclipse.m2m.tests.qvt.oml.AllTests;
import org.eclipse.m2m.tests.qvt.oml.TestProject;
import org.eclipse.m2m.tests.qvt.oml.transform.FilesToFilesData;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;
import org.eclipse.m2m.tests.qvt.oml.util.TestUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

/**
 * @author sboyko
 */
@RunWith(Parameterized.class)
public class TestQvtAntScript extends TestCase {
	
	public static final String ROOT_DIR_NAME = "antTestData"; //$NON-NLS-1$
	private static final String FIELD_DELIM = ","; //$NON-NLS-1$

    public TestQvtAntScript(ModelTestData data) {
        super(data.getName());
        myData = data;
    }
    
    @Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
    	return Arrays.<ModelTestData>asList(
    		new AntModelTestData("simple", Collections.<String>emptyList(), Arrays.asList("expected.ecore")), //$NON-NLS-1$ //$NON-NLS-2$
    	    new AntModelTestData("twomodels", Collections.<String>emptyList(), Arrays.asList("expected.rdb")), //$NON-NLS-1$ //$NON-NLS-2$
    	    new AntModelTestData("twomodels_new", Collections.<String>emptyList(), Arrays.asList("expected.rdb")) //$NON-NLS-1$ //$NON-NLS-2$
    	);
    }
    
    @Override
    @Test
    public void runTest() throws Exception {
    	IFile script = getIFile("composite.xml"); //$NON-NLS-1$
    	
    	IProgressMonitor monitor = new NullProgressMonitor();
    	AntRunner runner = new AntRunner();
    	runner.setBuildFileLocation(script.getRawLocation().toOSString());
    	runner.setArguments("-v"); //$NON-NLS-1$
    	runner.run(monitor);
    	
    	IFile outUri = getIFile("out.uri.txt"); //$NON-NLS-1$
    	byte[] buffer = new byte[10000];
    	FileInputStream fileInputStream = new FileInputStream(outUri.getRawLocation().toOSString());
    	int count = fileInputStream.read(buffer);
    	String content = new String(buffer, 0, count, ModelTestData.ENCODING);
    	int index = 0;
    	for (String strUri : content.split(FIELD_DELIM)) {
    		URI uri = URI.createURI(strUri);
    		ModelContent loadModel = EmfUtil.loadModel(uri);
    		EObject loadObj = (loadModel != null && !loadModel.getContent().isEmpty() ? loadModel.getContent().get(0) : null);
    	
            URI expectedURI = myData.getExpected(getProject()).get(index);
            EObject expectedObject = loadObj.eResource().getResourceSet().getResource(expectedURI, true).getContents().get(0);
			ModelTestData.compareWithExpected(myData.getName(), expectedObject, loadObj);
            index++;
    	}
    	fileInputStream.close();
    }
    
    @Override
    @Before
	public void setUp() throws Exception {
        TestUtil.turnOffAutoBuilding();     
        
        String name = "QvtAntTest"; //$NON-NLS-1$
        myProject = TestProject.getExistingProject(name);
        if(myProject == null) {
            myProject = new TestProject(name, new String[] {}, 0); 
            myProject.getProject().setDefaultCharset(ModelTestData.ENCODING, null);
        }
        
        copyModelData(); 
    }
    
    @Override
    @After
	public void tearDown() throws Exception {
        //+myProject.delete();
    }
    
    private IProject getProject() {
        return myProject.getProject();
    }
    
    private void copyModelData() throws Exception {
        File srcFolder = TestUtil.getPluginRelativeFile(AllTests.BUNDLE_ID, ROOT_DIR_NAME + "/" + myData.getName()); //$NON-NLS-1$
        File destFolder = getDestFolder();
        destFolder.mkdirs();
        FileUtil.copyFolder(srcFolder, destFolder);
        getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
    }

    private IFile getIFile(String fileName) {
        File file = getDestFile(fileName);
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IPath location = new Path(file.getAbsolutePath());
        IFile ifile = workspace.getRoot().getFileForLocation(location);
        if(ifile == null) {
            throw new RuntimeException("File not found: " + file); //$NON-NLS-1$
        }
        
        return ifile;
    }

    private File getDestFolder() {
        return new File(getProject().getLocation().toString() + "/models/" + myData.getName()); //$NON-NLS-1$
    }
    
    private File getDestFile(final String expectedName) {
        File file = new File(getDestFolder(), expectedName);
        if(!file.exists() || !file.isFile()) {
            throw new IllegalArgumentException("No such file: " + file); //$NON-NLS-1$
        }
        
        return file;
    }
    
	private final ModelTestData myData;
    private TestProject myProject;
    
    private static class AntModelTestData extends FilesToFilesData {
    	public AntModelTestData(String name, List<String> fromFiles, List<String> expectedFiles) {
            super(name, fromFiles, expectedFiles);
        }

        @Override
		protected File getDestFolder(IProject project) {
            try {
                return AntModelTestData.getDestFolder(getName(), project);
            }
            catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
        
        private static File getDestFolder(String name, IProject project) throws IOException {
            File srcRootFolder = TestUtil.getPluginRelativeFile(AllTests.BUNDLE_ID, TestQvtAntScript.ROOT_DIR_NAME);
            File srcFolder = AntModelTestData.getFolder(srcRootFolder, name);
            File destFolder = AntModelTestData.getFolder(new File(project.getLocation().toString() + "/models/"), srcFolder.getName()); //$NON-NLS-1$
            return destFolder;
        }
        
        private static File getFolder(File folder, final String expectedName) {
            File dir = new File(folder, expectedName);
            if(!dir.exists() || !dir.isDirectory()) {
                throw new IllegalArgumentException("Invalid directory: " + dir); //$NON-NLS-1$
            }
            
            return dir;
        }
    }

}
