/*******************************************************************************
 * Copyright (c) 2014, 2018 Borland Software Corporation and others.
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

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.AssertionFailedError;

@RunWith(Parameterized.class)
public class TestIncorrectTransformation extends TestQvtInterpreter {

	public TestIncorrectTransformation(ModelTestData data) {
		super(data);
	}
	
	@Parameters(name="{0}")
	public static Iterable<ModelTestData> data() {    	
		return Arrays.asList(
			new ModelTestData[] {	
				new ReferencedProjectData("bug433937_wrongImport", "bug433937_referenced", false) { //$NON-NLS-1$ //$NON-NLS-2$
					@Override
					public boolean isUseCompiledXmi() {
						// TODO it should be possible to run this test with the
						// using of compiled XMI
						return false;
					}
				},		
				new ReferencedProjectData("bug433937_wrongImport", "bug433937_referenced", true) { //$NON-NLS-1$ //$NON-NLS-2$
					@Override
					public boolean isUseCompiledXmi() {
						// TODO it should be possible to run this test with the
						// using of compiled XMI
						return false;
					}
				}
			}
		);
	}
	
	@Override
	protected void onBuildFailed(Throwable e) {
		if (e instanceof AssertionFailedError) {
			// it's compilation error so skip it
			return;
		}
		
		super.onBuildFailed(e);
	}
	
	@Override
	@Test
	public void runTest() throws Exception {
		// skip test execution since it's failed to build
	}

}
