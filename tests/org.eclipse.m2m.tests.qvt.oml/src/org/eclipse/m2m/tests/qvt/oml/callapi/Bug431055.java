/*******************************************************************************
 * Copyright (c) 2015, 2018 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.callapi;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class Bug431055 extends TestCase {

	URI modelUri;
	Resource resource;
	EObject object;
	BasicModelExtent modelExtent;
	TransformationExecutor executor;

	@Override
	@Before
	protected void setUp() {
		URI modelUri = URI.createPlatformPluginURI("org.eclipse.m2m.tests.qvt.oml/deployed/callapi/Bug431055.ecore", //$NON-NLS-1$
				true);
		ResourceSet resSet = new ResourceSetImpl();
		resource = resSet.getResource(modelUri, true);
		object = resource.getContents().get(0);
		modelExtent = new BasicModelExtent();
		modelExtent.add(object);
		URI uri = URI.createPlatformPluginURI("org.eclipse.m2m.tests.qvt.oml/deployed/callapi/InplaceEcore.qvto", //$NON-NLS-1$
				true);
		executor = new TransformationExecutor(uri);
	}

	/**
	 * When executing an inout qvto transformation programmatically using the
	 * TransformationExecutor class, all objects that are part of the model
	 * extent are removed from their original eResource.
	 * 
	 * Expected result: the model extent's objects are not removed from their
	 * original eResource (this is the default "kepler behavior")
	 * 
	 * It seems this behavior change was caused by commit
	 * 70ca216576ef4988a4338f22c0c188592786af0b (see class
	 * ModelParameterExtent's constructor)
	 * 
	 */
	@Test
	public void testInoutWithResource() {
		assertEquals(resource, object.eResource());
		ExecutionDiagnostic diagnostic = executor.execute(new ExecutionContextImpl(), modelExtent);
		assertEquals(Diagnostic.OK, diagnostic.getSeverity());
		assertEquals(0, diagnostic.getCode());
		assertNotNull(object.eResource());
		assertEquals(resource, object.eResource());
	}
}
