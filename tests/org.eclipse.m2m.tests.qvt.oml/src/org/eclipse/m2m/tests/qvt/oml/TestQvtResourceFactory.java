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

package org.eclipse.m2m.tests.qvt.oml;

import java.util.Arrays;
import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.internal.qvt.oml.common.MDAConstants;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.tests.qvt.oml.transform.FileToFileData;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;
import org.eclipse.m2m.tests.qvt.oml.transform.TestTransformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sboyko
 *
 */
@RunWith(Parameterized.class)
public class TestQvtResourceFactory extends TestTransformation {
	
	public TestQvtResourceFactory(String dataName) {
		super(new FileToFileData(dataName));
	}
	
	@Parameters(name="{0}")
	public static Iterable<String> data() {
		return Arrays.asList(
			"abstractresult",
			"errorinexpressionlist"
		);
	}
		
	@Test
	public void runTest1() throws Throwable {
		IPath filePath = getProject().getFullPath().append(ModelTestData.MODEL_FOLDER).append(getName())
				.append(getName() + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT);
		checkResourceByUri(URI.createPlatformResourceURI(filePath.toString(), true));
	}
	
	@Test
	public void runTest2() throws Throwable {
		String testFile = "org.eclipse.m2m.tests.qvt.oml/parserTestData/models/" + getName() + "/"  //$NON-NLS-1$ //$NON-NLS-2$
				+ getName() + MDAConstants.QVTO_FILE_EXTENSION_WITH_DOT; 
		checkResourceByUri(URI.createPlatformPluginURI(testFile, false));
	}
	    
	private static void checkResourceByUri(URI scriptUri) throws Exception {
		Resource resource = Resource.Factory.Registry.INSTANCE.getFactory(scriptUri).createResource(scriptUri);
		resource.load(Collections.emptyMap());
		assertTrue(resource.getContents().get(0) instanceof Module);
	}
	
}
