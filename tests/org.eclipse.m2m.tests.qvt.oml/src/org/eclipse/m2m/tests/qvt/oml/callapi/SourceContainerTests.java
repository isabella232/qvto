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
package org.eclipse.m2m.tests.qvt.oml.callapi;

import java.util.Arrays;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

/**
 * @author sboyko
 */
@RunWith(Parameterized.class)
public class SourceContainerTests extends TestCase {

	private final URI myUri;
	
	public SourceContainerTests(String name, URI uri) {
		super(name);
		myUri = uri;
	}
	
	@Parameters(name="{0}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(
			new Object[] {"TransformationProjectRelPath", URI.createPlatformPluginURI("org.eclipse.m2m.tests.qvto.transformationProject/root/RootTransformation.qvto", true)},
			new Object[] {"TransformationProjectFullPath", URI.createPlatformPluginURI("org.eclipse.m2m.tests.qvto.transformationProject/transforms/root/RootTransformation.qvto", true)},
			new Object[] {"PlainProject", URI.createPlatformPluginURI("org.eclipse.m2m.tests.qvto.pluginProject/transforms/root/RootTransformation.qvto", true)},
			
			// test transformation deployed with 'org.eclipse.m2m.tests.qvto.deployedTransfProject' plug-in
			new Object[] {"DeployedTransfProject", URI.createURI("deployedTransformationId", true)}
		);
	}
	
	@Override
	@Test
	public void runTest() throws Throwable {
		TransformationExecutor executor = new TransformationExecutor(myUri);
		ExecutionDiagnostic diagnostic = executor.execute(new ExecutionContextImpl());
				
		assertEquals(Diagnostic.OK, diagnostic.getSeverity());
	}
}
