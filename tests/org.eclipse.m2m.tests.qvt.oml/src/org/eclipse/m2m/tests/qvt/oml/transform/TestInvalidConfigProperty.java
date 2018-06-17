/*******************************************************************************
 * Copyright (c) 2008, 2015 Borland Software Corporation and others.
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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtRuntimeException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestInvalidConfigProperty extends AbstractStackTraceTest {
	
	public TestInvalidConfigProperty(ModelTestData data) {
		super(data);
	}
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
		return Collections.<ModelTestData>singletonList(
			new FileToFileData("invalidConfigProp") //$NON-NLS-1$
		);
	}
	
	@Test
	public void testInvalidConfigProp() throws Exception {
		String testCase = "invalidConfigProp"; //$NON-NLS-1$
		
		Map<String, Object> configProps = new HashMap<String, Object>();
		configProps.put("intProp", "xxx"); //$NON-NLS-1$ //$NON-NLS-2$
		
		QvtRuntimeException e = runQvtModuleTestCase(testCase, configProps);
		
		assertValidQVTRuntimeException(e);
		
		StringWriter strWriter = new StringWriter();
		e.printQvtStackTrace(new PrintWriter(strWriter));

		String dumpedContents = loadExpectedStackDump("invalidIntConfigProp"); //$NON-NLS-1$
		assertEqualContents(dumpedContents.toString(), strWriter.getBuffer().toString());
	}
	
	@Test
	public void testInvalidRealConfigProp() throws Exception {
		String testCase = "invalidConfigProp"; //$NON-NLS-1$
		
		Map<String, Object> configProps = new HashMap<String, Object>();
		configProps.put("realProp", "xxx"); //$NON-NLS-1$ //$NON-NLS-2$
		
		QvtRuntimeException e = runQvtModuleTestCase(testCase, configProps);
		
		assertValidQVTRuntimeException(e);
		
		StringWriter strWriter = new StringWriter();
		e.printQvtStackTrace(new PrintWriter(strWriter));

		String dumpedContents = loadExpectedStackDump("invalidRealConfigProp"); //$NON-NLS-1$
		assertEqualContents(dumpedContents.toString(), strWriter.getBuffer().toString());
	}
	
	@Test
	public void testUndefinedConfigProp() throws Exception {
		String testCase = "invalidConfigProp"; //$NON-NLS-1$
		
		QvtRuntimeException e = runQvtModuleTestCase(testCase);
		assertNull(e);
	}	
}
