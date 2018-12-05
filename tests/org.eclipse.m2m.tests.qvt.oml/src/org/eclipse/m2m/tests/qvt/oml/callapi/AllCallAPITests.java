/*******************************************************************************
 * Copyright (c) 2009, 2018 Borland Software Corporation and others.
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

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	BasicModelExtentTest.class,
	InvocationTest.class,
	InvocationExtTest.class,
	DynamicModelInvocationTest.class,
	DynamicRegisteredModelInvocationTest.class,
	ChildInTreeInputInvocationTest.class,
	Bug431055.class,
	TransformationExecutorWithVisitorDecoratorTest.class,
	IncrementalUpdateExecutorTest.class,
	BlackboxModuleStandaloneSetupTest.class	
})
public class AllCallAPITests {

}
