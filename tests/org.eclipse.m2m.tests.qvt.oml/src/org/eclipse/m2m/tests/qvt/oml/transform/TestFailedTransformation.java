/*******************************************************************************
 * Copyright (c) 2008, 2015 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;

import org.eclipse.m2m.internal.qvt.oml.common.io.IOFile;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtRuntimeException;
import org.eclipse.m2m.internal.qvt.oml.library.Context;
import org.eclipse.m2m.internal.qvt.oml.runtime.util.MiscUtil;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.util.IContext;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestFailedTransformation extends TestTransformation {

    public TestFailedTransformation(ModelTestData data) {
        super(data);
        setName(TestQvtInterpreter.PREFIX + data.getName());
    }
    
    @Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {    	
		return Arrays.asList(
			new ModelTestData[] {
        		new FileToFileData("scr878") { //$NON-NLS-1$
                	@Override
                	public ExecutionContext getContext() {
        	    		ExecutionContext ctx = super.getContext();
        	    		ctx.getSessionData().setValue(QVTEvaluationOptions.FLAG_READONLY_GUARD_ENABLED, Boolean.TRUE);
        	    		return ctx;
                	}
                },
        		new FilesToFilesData("bug301134"), //$NON-NLS-1$
        		new FilesToFilesData("bug323915"), //$NON-NLS-1$
        		new FilesToFilesData("bug370098") { //$NON-NLS-1$
                	@Override
                	public ExecutionContext getContext() {
                		ExecutionContext ctx = super.getContext();
                		ctx.getSessionData().setValue(QVTEvaluationOptions.EVALUATION_MAX_STACK_DEPTH, 10);
                		return ctx;
                	}
                },
        		new FilesToFilesData("bug289982_failed") //$NON-NLS-1$		
	        }
		);
    }
    	
	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		buildTestProject();
	}
    
    @Override
    @Test
	public void runTest() throws Exception {
		runTransformation();
		assertLogMatch("qvtTraceLog.stack"); //$NON-NLS-1$
	}
	
	private QvtRuntimeException runTransformation() throws Exception {
        ITransformer transformer = TestQvtInterpreter.getDefaultTransformer(getData());
		try {
			ExecutionContextImpl context = (ExecutionContextImpl) getData().getContext();
			context.setLog(new WriterLog(myLogger));
			
			transformer.transform(
					getIFile(getData().getTransformation(getProject())),
					getData().getIn(getProject()), getData().getTrace(getProject()), context);
		} catch (QvtRuntimeException e) {
			return e;			
		}
		
		return null;
	}

	private void assertLogMatch(String testCase) throws Exception {
		String expectedContents = loadExpectedTraceLog(testCase);
		assertFalse("Non-empty trace expected", expectedContents.length() == 0); //$NON-NLS-1$
		
		String logContents = myLogger.getBuffer().toString();
		assertFalse("Non-empty trace expected", logContents.length() == 0); //$NON-NLS-1$
		
		assertEqualContents(expectedContents, logContents);
	}
	
	private String loadExpectedTraceLog(String fileName) throws IOException {
		File parentFolder = getData().getTransformation(getTestProject().getProject()).getParentFile();
		return MiscUtil.readStream(new IOFile(new File(parentFolder, fileName)));
	}
	
	private final StringWriter myLogger = new StringWriter();
}
