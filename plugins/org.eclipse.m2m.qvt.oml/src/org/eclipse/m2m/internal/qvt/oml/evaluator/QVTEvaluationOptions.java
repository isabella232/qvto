/*******************************************************************************
 * Copyright (c) 2008, 2014 Borland Software Corporation and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *     Christine Gerpheide - bug 432969
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.evaluator;

import java.util.Collections;
import java.util.List;

import org.eclipse.m2m.qvt.oml.util.ISessionData;

public class QVTEvaluationOptions {

	public static final ISessionData.SimpleEntry<Boolean> FLAG_READONLY_GUARD_ENABLED = new ISessionData.SimpleEntry<Boolean>();

	/**
	 * QVTo evaluator's maximum stack depth. Default maximum depth is 1000.
	 */
	public static final ISessionData.SimpleEntry<Integer> EVALUATION_MAX_STACK_DEPTH = new ISessionData.SimpleEntry<Integer>(1000);

	/**
	 * Decorator classes to be used when constructing a QVTo evaluation visitor.
	 * 
	 * <p> Visitor decorators should extend QvtGenericVisitorDecorator. They can be contributed by third parties
	 * by setting this value on the transformation context before executing:
	 * 
	 * <p> <blockquote><pre>
	 * public static class TestQvtGenericVisitorDecorator extends QvtGenericVisitorDecorator {
	 * 
	 *   public TestQvtGenericVisitorDecorator(InternalEvaluator qvtExtVisitor) {
	 *     super(qvtExtVisitor);
	 *   }
	 * 
	 *   public Object visitModule(Module module) {
	 *     //...
	 *     return super.visitModule(module);
	 *   }
	 *   // ...
	 * }
	 * </pre></blockquote>
	 * 
	 * Usage example:
	 * 
	 * <p> <blockquote><pre>
	 * ExecutionContextImpl context = new ExecutionContextImpl();
	 * context.getSessionData().setValue(QVTEvaluationOptions.VISITOR_DECORATORS, Collections.singletonList(TestQvtGenericVisitorDecorator.class));
	 * TransformationExecutor executor = new TransformationExecutor(uri);
	 * ExecutionDiagnostic result = executor.execute(context);
	 * </pre></blockquote>
	 * 
	 * @see org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEnvFactory#createEvaluationVisitor()
	 */
	public static final ISessionData.SimpleEntry<List<Class<? extends QvtGenericVisitorDecorator>>> VISITOR_DECORATORS = 
			new ISessionData.SimpleEntry<List<Class<? extends QvtGenericVisitorDecorator>>>(
					Collections.<Class<? extends QvtGenericVisitorDecorator>>emptyList());
	
}
