/*******************************************************************************
 * Copyright (c) 2007, 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform.api;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.m2m.tests.qvt.oml.AllTests;
import org.eclipse.m2m.tests.qvt.oml.transform.FilesToFilesData;
import org.eclipse.m2m.tests.qvt.oml.transform.api.ExecDeployedTransformationTestCase.UseFileName;
import org.eclipse.m2m.tests.qvt.oml.util.TestUtil;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author sboyko
 */
@RunWith(Suite.class)
@SuiteClasses({InputExtensionsTestCase.class, ExecTransformationTestCase.class, ExecDeployedTransformationTestCase.class, UseFileName.class, WrappedExecTransformationTestCase.class, InoutValidationTestCase.class})
public class QvtoTransfHelperTests {
    
    static class ApiTestData extends FilesToFilesData {
    	public ApiTestData(String name, List<String> fromFiles, List<String> expectedFiles) {
            super(name, fromFiles, expectedFiles);
        }

        @Override
		protected File getDestFolder(IProject project) {
            try {
                return ApiTestData.getDestFolder(getName(), project);
            }
            catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
        
        private static File getDestFolder(String name, IProject project) throws IOException {
            File srcRootFolder = TestUtil.getPluginRelativeFile(AllTests.BUNDLE_ID, ApiTestCase.ROOT_DIR_NAME);
            File srcFolder = ApiTestData.getFolder(srcRootFolder, name);
            File destFolder = ApiTestData.getFolder(new File(project.getLocation().toString() + "/models/"), srcFolder.getName()); //$NON-NLS-1$
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
