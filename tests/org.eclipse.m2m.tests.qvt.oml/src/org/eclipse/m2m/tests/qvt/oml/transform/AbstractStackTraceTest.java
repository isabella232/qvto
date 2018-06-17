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
 *     E.D.Willink - Bug 534956
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.transform;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.compiler.QvtCompilerOptions;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtRuntimeException;
import org.eclipse.m2m.internal.qvt.oml.runtime.launch.QvtLaunchUtil;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtInterpretedTransformation;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.m2m.tests.qvt.oml.util.TestUtil;
import org.junit.Before;

public abstract class AbstractStackTraceTest extends TestTransformation {

	protected boolean fEnableLineNumbers = true;
	protected boolean fUseCompiledXMI = true;
	protected StringWriter fLogger = new StringWriter();

	public AbstractStackTraceTest(ModelTestData data) {
		super(data);
	}

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();

		buildTestProject();
	}

	protected static void assertValidQVTRuntimeException(QvtRuntimeException exception) {
		assertNotNull(exception);
		assertNotNull(exception.getQvtStackTrace());
		assertTrue(exception.getQvtStackTrace().size() > 0);
	}

	protected QvtRuntimeException runQvtModuleTestCase(String testCaseName) throws Exception {
		return runQvtModuleTestCase(testCaseName, null);
	}

	protected QvtRuntimeException runQvtModuleTestCase(String testCaseName, Map<String, Object> configProperties) throws Exception {
		ITransformer transformer = createTransformer();
		try {
			Map<String, Object> passedProps = (configProperties == null) ? Collections.<String, Object>emptyMap() : configProperties;
			Map<String, Object> extProps = new HashMap<String, Object>(passedProps);
			extProps.put("testcase", testCaseName);		//$NON-NLS-1$
			ExecutionContext context = QvtLaunchUtil.createContext(extProps);

			transformer.transform(
					getIFile(getData().getTransformation(getProject())),
					getData().getIn(getProject()), getData().getTrace(getProject()), context);
		} catch (QvtRuntimeException e) {
			return e;
		}

		return null;
	}

	protected String loadExpectedStackDump(String testCase) throws IOException {
		return loadExpectedDump(testCase + ".stack"); //$NON-NLS-1$
	}

	protected void assertLogMatch(String testCase) throws Exception {
		String expectedContents = loadExpectedLogDump(testCase);
		assertFalse("Non-empty log expected", expectedContents.length() == 0); //$NON-NLS-1$

		String logContents = fLogger != null ? fLogger.getBuffer().toString() : ""; //$NON-NLS-1$
		assertFalse("Non-empty log expected", logContents.length() == 0); //$NON-NLS-1$

		assertEqualContents(expectedContents, logContents);
	}

	private String loadExpectedLogDump(String testCase) throws IOException {
		return loadExpectedDump(testCase + ".log.txt"); //$NON-NLS-1$
	}

	private String loadExpectedDump(String fileName) throws IOException {
		File parentFolder = getData().getTransformation(getTestProject().getProject()).getParentFile();
		FileReader freader = new FileReader(new File(parentFolder, fileName));

		CharBuffer buf = CharBuffer.allocate(1024);
		StringBuilder result = new StringBuilder();

		for (;;) {
			int read = freader.read(buf);
			if (read < 0) {
				break;
			}

			((Buffer)buf).flip();			// See Bug 534950/534956 - cast needed for JDK 8/9 compatibility
			result.append(buf);
		}

		freader.close();

		return result.toString();
	}

	private ITransformer createTransformer() {

		boolean useCompiledXMI = fUseCompiledXMI && getData().isUseCompiledXmi();

		return new TestQvtInterpreter.DefaultTransformer(useCompiledXMI, getData().getResourceSet(null)) {

			@Override
			protected QvtInterpretedTransformation getTransformation(IFile transformation) {
				QvtInterpretedTransformation transf = super.getTransformation(transformation);

				if (!fUseCompiledXMI) {
					QvtCompilerOptions options = new QvtCompilerOptions();
					options.setGenerateCompletionData(false);
					options.setSourceLineNumbersEnabled(fEnableLineNumbers);
					transf.setQvtCompilerOptions(options);
				}

				return transf;
			}

			@Override
			public List<URI> transform(IFile transformation, List<URI> inUris, URI traceUri, ExecutionContext context) throws Exception {
				QvtTransformation transf = getTransformation(transformation);

				if(!fUseCompiledXMI) {
					TestUtil.assertAllPersistableAST(transf.getUnit());
				}

				Map<String, Object> props = new HashMap<String, Object>();
				for(String name : context.getConfigPropertyNames()) {
					props.put(name, context.getConfigProperty(name));
				}

				ExecutionContext qvtContext = QvtLaunchUtil.createContext(props, new WriterLog(fLogger));

				return launchTransform(transformation, inUris, traceUri, qvtContext, transf);
			}
		};
	}

}