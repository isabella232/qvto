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
package org.eclipse.m2m.tests.qvt.oml.transform.api;

import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.internal.qvt.oml.emf.util.EmfUtil;
import org.eclipse.m2m.tests.qvt.oml.AllTests;
import org.eclipse.m2m.tests.qvt.oml.transform.ModelTestData;
import org.eclipse.m2m.tests.qvt.oml.transform.api.QvtoTransfHelperTests.ApiTestData;
import org.eclipse.m2m.tests.qvt.oml.util.CustomEmfResourceFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author sboyko
 */
@RunWith(Parameterized.class)
public class InoutValidationTestCase extends ApiTestCase {

	public InoutValidationTestCase(ModelTestData data) {
		super(data);
	}
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {
		return Collections.<ModelTestData>singletonList(
				new ApiTestData("inoutModels", Collections.<String>emptyList(), Collections.<String>emptyList()) //$NON-NLS-1$
		);
	}
		
	@Test
	public void testEmptyModel() {
		{
			URI uri = createWorkspaceUri("empty.ecore"); //$NON-NLS-1$
			assertNotNull(uri);
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
		{
			URI uri = createPlatformUri("empty.ecore"); //$NON-NLS-1$
			assertNotNull(uri);
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
		{
			URI uri = CustomEmfResourceFactory.createUri(CustomEmfResourceFactory.EMPTY_MODEL);
			assertNotNull(uri);
			assertFalse(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
	}
	
	@Test
	public void testNonEmptyModel() {
		{
			URI uri = createWorkspaceUri("nonEmpty.ecore"); //$NON-NLS-1$
			assertNotNull(uri);
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
		{
			URI uri = createPlatformUri("nonEmpty.ecore"); //$NON-NLS-1$
			assertNotNull(uri);
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
		{
			URI uri = CustomEmfResourceFactory.createUri(CustomEmfResourceFactory.NON_EMPTY_MODEL);
			assertNotNull(uri);
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
	}
	
	@Test
	public void testInvalidModel() {
		{
			URI uri = createWorkspaceUri("invalid.ecore"); //$NON-NLS-1$
			assertNotNull(uri);
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
		{
			URI uri = createPlatformUri("invalid.ecore"); //$NON-NLS-1$
			assertNotNull(uri);
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertTrue(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
		{
			URI uri = CustomEmfResourceFactory.createUri(CustomEmfResourceFactory.INVALID_MODEL);
			assertNotNull(uri);
			assertFalse(EmfUtil.isUriExists(uri, new ResourceSetImpl(), true));
			assertFalse(EmfUtil.isUriExists(uri, new ResourceSetImpl(), false));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), true));
			assertFalse(EmfUtil.isUriExistsAsEObject(uri, new ResourceSetImpl(), false));
		}
	}
	

	private URI createWorkspaceUri(String fileName) {
		IFile qvtoFile = getIFile(fileName);
		return URI.createPlatformResourceURI(qvtoFile.getFullPath().toString(), false);
	}

	private URI createPlatformUri(String fileName) {
		return URI.createPlatformPluginURI("/" + AllTests.BUNDLE_ID + "/" + ROOT_DIR_NAME //$NON-NLS-1$ //$NON-NLS-2$ 
				+ "/" + getData().getName() + "/" + fileName, false); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
