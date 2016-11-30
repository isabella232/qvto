/*******************************************************************************
 * Copyright (c) 2009, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.ocl2qvt;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.internal.qvt.oml.blackbox.java.StandaloneBlackboxProvider;
import org.eclipse.m2m.internal.qvt.oml.runtime.util.OCLEnvironmentWithQVTAccessFactory;
import org.junit.Test;

import junit.framework.TestCase;

public class OCLEnvWithQVTAccessDiagnosticTest extends TestCase {

	public OCLEnvWithQVTAccessDiagnosticTest() {
		super();
	}
	
	@Test
	public void testCSTAndBlackboxSuccess() throws Exception {
		Diagnostic diagnostic = createFactoryDiagnostic(
				URI.createURI("qvto://blackbox/org.eclipse.m2m.tests.qvt.oml.bbox.SimpleJavaLibrary")
					.appendQuery(StandaloneBlackboxProvider.URI_BLACKBOX_STANDALONE_QUERY),
				URI.createURI("qvto://blackbox/org.bar.Foo"),
				URI.createPlatformPluginURI("org.eclipse.m2m.tests.qvt.oml/parserTestData/externlib/successLib.qvto", false));
		assertTrue(diagnostic.getSeverity() == Diagnostic.OK);
	}
	
	@Test
	public void testCompilationErrors() throws Exception {
		URI uri = URI.createPlatformPluginURI("org.eclipse.m2m.tests.qvt.oml/parserTestData/externlib/errorsLib.qvto", false);
		Diagnostic diagnostic = createFactoryDiagnostic(uri);
		assertTrue(diagnostic.getSeverity() == Diagnostic.ERROR);
		List<Diagnostic> children = diagnostic.getChildren();
		assertFalse(children.isEmpty());
		assertEquals(uri.toString(), children.get(0).getSource());
	}
	
	@Test
	public void testUnresolved() throws Exception {
		URI badURI = URI.createURI("platform:/plugin/never.exist");
		URI okURI = URI.createURI("qvto://blackbox/org.eclipse.m2m.tests.qvt.oml.bbox.SimpleJavaLibrary")
				.appendQuery(StandaloneBlackboxProvider.URI_BLACKBOX_STANDALONE_QUERY);
		Diagnostic diagnostic = createFactoryDiagnostic(okURI, badURI);
		assertTrue(diagnostic.getSeverity() == Diagnostic.ERROR);
		List<Diagnostic> children = diagnostic.getChildren();
		assertEquals(1, children.size());
		assertEquals(badURI.toString(), children.get(0).getData().get(0).toString());
	}	
	
	
	private static Diagnostic createFactoryDiagnostic(URI... uris) {
		return new OCLEnvironmentWithQVTAccessFactory(Arrays.asList(uris)).getDiagnostic();
	}
}
