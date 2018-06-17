/*******************************************************************************
 * Copyright (c) 2014, 2015 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Boyko Sergey - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.tests.qvt.oml.callapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.m2m.internal.qvt.oml.evaluator.InternalEvaluator;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QVTEvaluationOptions;
import org.eclipse.m2m.internal.qvt.oml.evaluator.QvtGenericVisitorDecorator;
import org.eclipse.m2m.internal.qvt.oml.expressions.Helper;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TransformationExecutorWithVisitorDecoratorTest extends TransformationExecutorTest {
	
	static String testBuffer = ""; //$NON-NLS-1$

	public static class TestQvtGenericVisitorDecorator extends QvtGenericVisitorDecorator {
		public TestQvtGenericVisitorDecorator(InternalEvaluator qvtExtVisitor) {
			super(qvtExtVisitor);
		}
		
		@Override
		public Object visitModule(Module module) {
			testBuffer += module.getName() + " "; //$NON-NLS-1$
			return super.visitModule(module);
		}
		
		@Override
		public Object visitHelper(Helper helper) {
			testBuffer += helper.getName() + " "; //$NON-NLS-1$
			return super.visitHelper(helper);
		}
	}
	
	
	public TransformationExecutorWithVisitorDecoratorTest(String name, List<String> inModels, List<String> outModels, String[][] configProps) {
		super(name, inModels, outModels, configProps);
	}
	
	@Parameters(name="{0}")
	public static Iterable<Object[]> data() {
		return Collections.singletonList(
			new Object[] {
				"bug416584", Arrays.asList("in.ecore"), Collections.<String>emptyList(), //$NON-NLS-1$ //$NON-NLS-2$
				new String[][] {
					new String[] { "libProp", "123" }, //$NON-NLS-1$ //$NON-NLS-2$
					new String[] { "prop", "prop" }, //$NON-NLS-1$ //$NON-NLS-2$
					new String[] { "prop2", "prop2" }, //$NON-NLS-1$ //$NON-NLS-2$
				}
			}
		);
	}
	
	@Override
	@Before
	public void setUp() {
		super.setUp();
		
		testBuffer = ""; //$NON-NLS-1$
		
		ArrayList<Class<? extends QvtGenericVisitorDecorator>> decorators = new ArrayList<Class<? extends QvtGenericVisitorDecorator>>();
		decorators.add(TestQvtGenericVisitorDecorator.class);
		executionContext.getSessionData().setValue(QVTEvaluationOptions.VISITOR_DECORATORS, decorators);
	}
	
	@Override
	@Test
	public void runTest() throws Throwable {
		super.runTest();
		assertEquals(testBuffer, "T2 lib_helper lib_helper T3_helper T3_helper lib_helper "); //$NON-NLS-1$
	}
	
}
