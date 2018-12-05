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
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;

import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtInterruptedExecutionException;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtRuntimeException;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestBlackboxLibContext extends AbstractStackTraceTest {
	
	public TestBlackboxLibContext(ModelTestData data) {
		super(data);
	}
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
		return Collections.<ModelTestData>singletonList(
			new FileToFileData("blackboxlib_context", //$NON-NLS-1$
				new String[][] {
				{"strTest", "test"},  //$NON-NLS-1$ //$NON-NLS-2$
				{"strTest2", "test2"},  //$NON-NLS-1$ //$NON-NLS-2$
				}
			)
		);
	}
	
	@Test
	public void testInvalidConfigProp() throws Exception {
		String testcase = "executionTerminated"; //$NON-NLS-1$
		QvtRuntimeException e = runQvtModuleTestCase(testcase, QvtLaunchUtil.getConfigProperties(getData().getContext()));						
		assertValidQVTRuntimeException(e);
		assertEquals(QvtInterruptedExecutionException.class, e.getClass());
		
		StringWriter strWriter = new StringWriter();
		e.printQvtStackTrace(new PrintWriter(strWriter));

		String dumpedContents = loadExpectedStackDump(testcase);
		assertEqualContents(dumpedContents.toString(), strWriter.getBuffer().toString());
		
		assertLogMatch(testcase);		
	}
	
}
