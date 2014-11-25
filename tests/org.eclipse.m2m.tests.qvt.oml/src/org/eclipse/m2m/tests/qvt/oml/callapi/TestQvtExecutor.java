/*******************************************************************************
 * Copyright (c) 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Boyko Sergey - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.callapi;

import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.internal.qvt.oml.expressions.DirectionKind;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.tests.qvt.oml.transform.FileToFileData;
import org.eclipse.m2m.tests.qvt.oml.transform.FilesToFilesData;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;

public class TestQvtExecutor extends TransformationExecutorTest {
	
	private final List<URI> ecoreMetamodels;

	public TestQvtExecutor(ModelTestData data) {
		super(data.getName(), getInModels(data), getOutModels(data), data.getContext().getConfigProperties());
		ecoreMetamodels = data.getEcoreMetamodels();
	}

	private static List<String> getInModels(ModelTestData data) {
		if (data instanceof FileToFileData) {
			return Collections.singletonList(((FileToFileData) data).getFromFile());
		}
		if (data instanceof FilesToFilesData) {
			return ((FilesToFilesData) data).getFromFiles();
		}
		return Collections.emptyList();
	}
	
	private static List<String> getOutModels(ModelTestData data) {
		if (data instanceof FileToFileData) {
			return Collections.singletonList(((FileToFileData) data).getExpectedFile());
		}
		if (data instanceof FilesToFilesData) {
			return ((FilesToFilesData) data).getExpectedFiles();
		}
		return Collections.emptyList();
	}
	
	@Override
	protected List<URI> getEcoreMetamodels() {
		return ecoreMetamodels;
	}

	@Override
	protected void setUp() {
		super.setUp();
	}
	
	@Override
	protected void runTest() throws Throwable {
		super.runTest();
		
		int outIndex = 0;
		for (int i = 0; i < paramKinds.size(); ++i) {
			if (paramKinds.get(i) == DirectionKind.IN) {
				continue;
			}
			
			ModelExtent modelExtent = extents.get(i);
			URI modelUri = uriCreator.getModelUri(outModels.get(outIndex++));
			Resource resource = resSet.getResource(modelUri, true);
			compareWithExpected(resource.getContents(), modelExtent.getContents());
		}
	}

	private void compareWithExpected(List<EObject> expected, List<EObject> out) {
    	TestCase.assertEquals("transf output differs in size to expected result", expected.size(), out.size()); //$NON-NLS-1$ 
    	for (int i = 0; i < out.size(); i++) {
    		TestCase.assertNotSame("Actual output and expected output must not be the same instances", expected.get(i), out.get(i)); //$NON-NLS-1$
    		ModelTestData.assertEquals(name + ":", expected.get(i), out.get(i)); //$NON-NLS-1$
    	}
	}

}
