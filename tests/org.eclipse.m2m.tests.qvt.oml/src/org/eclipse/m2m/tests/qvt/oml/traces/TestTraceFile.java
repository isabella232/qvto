/*******************************************************************************
 * Copyright (c) 2007, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.traces;

import java.util.Arrays;

import org.eclipse.m2m.internal.qvt.oml.trace.Trace;
import org.eclipse.m2m.tests.qvt.oml.transform.FileToFileData;
import org.eclipse.m2m.tests.qvt.oml.transform.TestQvtInterpreter;
import org.eclipse.m2m.tests.qvt.oml.transform.TestTransformation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestTraceFile extends TestTransformation {
	private final int myExpectedTraceSize;

	public TestTraceFile(String name, int expectedTraceSize) {
		super(new FileToFileData(name));
		myExpectedTraceSize = expectedTraceSize;
	}
	
	@Parameters(name="{0}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(
			new Object[] {"multipletracerecords", 5}, //$NON-NLS-1$
			new Object[] {"mappingWithNoResultTrace_266854", 1} //$NON-NLS-1$
		);
	}
	
    @Override
    @Test
	public void runTest() throws Exception {
		check(TestQvtInterpreter.getDefaultTransformer(getData()));
    }
    
    @Override
    @Before
    public void setUp() throws Exception {   
    	super.setUp();
    	buildTestProject();
    }

    private void check(ITransformer transformer) throws Exception {
        Trace trace = TraceUtil.transform(getData(), getProject(), transformer);
        assertTrue(trace.getTraceRecords().size() == myExpectedTraceSize);
	}
}
