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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtil;
import org.eclipse.m2m.internal.qvt.oml.emf.util.ModelContent;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.ModelExtent;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.TransfExecutionResult;
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
@SuppressWarnings("deprecation")
@RunWith(Parameterized.class)
public class ExecTransformationTestCase extends ApiTestCase {

	public ExecTransformationTestCase(ModelTestData data) {
		super(data);
		setName("workspace: " + data.getName()); //$NON-NLS-1$
	}
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
		return Arrays.<ModelTestData>asList(
			new ApiTestData("exec1", Arrays.asList("in1.ecore", "in2.ecore"), Arrays.asList("expected.simpleuml", "expected.rdb")), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			new ApiTestData("exec2", Arrays.asList("in1.ecore", "in2.ecore"), Arrays.asList("expected.simpleuml", "expected.rdb")), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			new ApiTestData("exec3", Collections.<String>emptyList(), Collections.<String>emptyList()) //$NON-NLS-1$
		);
	}

	@Override
	@Test
	public void runTest() throws Exception {
		URI scriptUri = createScriptUri(getData().getName());
		validateScript(scriptUri);
		
		ResourceSet rs = new ResourceSetImpl();

		List<EObject> inObjects = new ArrayList<EObject>();
		List<URI> inputs = getData().getIn(getProject());
		for (URI uri : inputs) {
			ModelContent loadModel = EmfUtil.loadModel(uri, rs);
			inObjects.add(loadModel.getContent().get(0));
		}
		TransfExecutionResult execResult = new QvtoTransformationHelper(scriptUri).executeTransformation(
				inObjects, Collections.<String, Object> emptyMap(), rs);

		Iterator<ModelExtent> itrExt = execResult.getOutModelExtents().iterator();
		for (URI uri : getData().getExpected(getProject())) {
			if (!itrExt.hasNext()) {
				throw new Exception("Missed execution result model extent"); //$NON-NLS-1$
			}
			Resource loadResource = rs.getResource(uri, true);
			ModelExtent nextExtent = itrExt.next();
			for (int i = 0; i < loadResource.getContents().size(); ++i) {
				ModelTestData
						.assertEquals(
								"Diff execution result", loadResource.getContents().get(i), nextExtent.getAllRootElements().get(i)); //$NON-NLS-1$
			}
		}

		if (execResult.getOutParameters().isEmpty()) {
			return;
		}

		Iterator<EObject> itrObj = execResult.getOutParameters().iterator();
		for (URI uri : getData().getExpected(getProject())) {
			if (!itrObj.hasNext()) {
				throw new Exception("Missed execution result out parameter"); //$NON-NLS-1$
			}
			Resource loadResource = rs.getResource(uri, true);
			ModelTestData
					.assertEquals(
							"Diff execution result", loadResource.getContents().get(0), itrObj.next()); //$NON-NLS-1$
		}
	}

	protected void validateScript(URI scriptUri) {
		Diagnostic validateQvtoScript = QvtoTransformationValidator.validateQvtoScript(scriptUri, null, null);
		assertTrue(validateQvtoScript.toString(), validateQvtoScript.getSeverity() < Diagnostic.ERROR);
	}

	protected URI createScriptUri(String scriptName) {
		IFile qvtoFile = getIFile(getData().getName()
				+ MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT);
		return URI.createPlatformResourceURI(qvtoFile.getFullPath().toString(),
				false);
	}

}
