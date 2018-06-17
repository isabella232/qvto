/*******************************************************************************
 * Copyright (c) 2007, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform.api;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.tests.qvt.oml.AllTests;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;
import org.eclipse.m2m.tests.qvt.oml.transform.api.QvtoTransfHelperTests.ApiTestData;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sboyko
 */
@RunWith(Parameterized.class)
public class ExecDeployedTransformationTestCase extends ExecTransformationTestCase {
	
	private static final String TEST_PREFIX = "deployed_";	
	
	private static final String TEST_USEFILE_PREFIX = "file_deployed_";
	
	@RunWith(Parameterized.class)
	public static class UseFileName extends ExecDeployedTransformationTestCase {

		public UseFileName(ModelTestData data) {
			super(data);
			myUseFilename = true;
			setName(TEST_USEFILE_PREFIX + getData().getName());			
		}
		
		@Parameters(name="{0}")
		public static Iterable<ModelTestData> data() {
			return Arrays.<ModelTestData>asList(
				new ApiTestData("exec1", Arrays.asList("in1.ecore", "in2.ecore"), Arrays.asList("expected.simpleuml", "expected.rdb")), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
				new ApiTestData("exec2", Arrays.asList("in1.ecore", "in2.ecore"), Arrays.asList("expected.simpleuml", "expected.rdb")), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
				new ApiTestData("exec3", Collections.<String>emptyList(), Collections.<String>emptyList()), //$NON-NLS-1$
				new ApiTestData("exec3_withImport", Collections.<String>emptyList(), Collections.<String>emptyList()) //$NON-NLS-1$		
			);
		}
	}
	    
	public ExecDeployedTransformationTestCase(ModelTestData data) {
		super(data);
        myUseFilename = false;
        setName(TEST_PREFIX + data.getName()); //$NON-NLS-1$
	}
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
		return Arrays.<ModelTestData>asList(
			new ApiTestData("exec1", Arrays.asList("in1.ecore", "in2.ecore"), Arrays.asList("expected.simpleuml", "expected.rdb")), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			new ApiTestData("exec3", Collections.<String>emptyList(), Collections.<String>emptyList()), //$NON-NLS-1$
			new ApiTestData("exec3_withImport", Collections.<String>emptyList(), Collections.<String>emptyList()) //$NON-NLS-1$
		);
	}
	
	protected String getPrefix() {
		return TEST_PREFIX;
	}
    
    @Override
	protected URI createScriptUri(String scriptName) {
    	if (myUseFilename) {
			return URI.createPlatformPluginURI("/" + AllTests.BUNDLE_ID + "/" + ROOT_DIR_NAME //$NON-NLS-1$ //$NON-NLS-2$
					+ "/" + scriptName + "/" + scriptName + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT, false); //$NON-NLS-1$ //$NON-NLS-2$
    	} 
    	
		return URI.createURI(ROOT_DIR_NAME + "." + scriptName + "." + scriptName, false); //$NON-NLS-1$ //$NON-NLS-2$
	}
    
    protected boolean myUseFilename;
}
