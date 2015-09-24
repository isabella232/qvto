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
package org.eclipse.m2m.tests.qvt.oml.transform.api;

import java.util.Collections;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationValidator;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;
import org.eclipse.m2m.tests.qvt.oml.transform.api.QvtoTransfHelperTests.ApiTestData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sboyko
 */
@RunWith(Parameterized.class)
public class WrappedExecTransformationTestCase extends ExecDeployedTransformationTestCase {
	
	public WrappedExecTransformationTestCase(ModelTestData data) {
        super(data);
        myUseFilename = true;
    }
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
		return Collections.<ModelTestData>singletonList(
			new ApiTestData("exec_erroneous", Collections.<String>emptyList(), Collections.<String>emptyList()) //$NON-NLS-1$
		);
	}
    
    @Override
    @Test
    public void runTest() throws Exception {
    	boolean isFailed = false;
    	try {
    		super.runTest();
    	}
    	catch (Exception e) {
    		isFailed = e.getMessage().length() > 0;
    	}
    	assertTrue("Compilation errors should be reported", isFailed); //$NON-NLS-1$
    }
    
    @Override
    protected void validateScript(URI scriptUri) {
		Diagnostic validateQvtoScript = QvtoTransformationValidator.validateQvtoScript(scriptUri, null, null);
		assertTrue(validateQvtoScript.toString(), validateQvtoScript.getSeverity() == Diagnostic.ERROR);
    }
}
