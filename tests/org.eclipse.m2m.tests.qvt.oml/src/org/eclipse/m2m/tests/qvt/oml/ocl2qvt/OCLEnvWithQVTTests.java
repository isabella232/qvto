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

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	ExtOCLEnvironmentWithQVTAccessTest.class,
	OCLEnvironmentWithQVTAccessTest.class,
	OCLEnvironmentWithQVTAccessByURITest.class,
	OCLEnvironmentWithQVTAccessByURITest.DynamicPackageTest.class,
	OCLEnvWithQVTAccessDiagnosticTest.class,
})
public class OCLEnvWithQVTTests {

}
