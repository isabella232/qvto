/*******************************************************************************
 * <copyright>
 * Copyright (c) 2013, 2016 Willink Transformations, University of York, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *   Adolfo Sanchez-Barbudo (University of York) - Bug397429
 * </copyright>
 *
 * This code is auto-generated
 * from: org.eclipse.qvto.examples.pivot.imperativeocl/model/ImperativeOCL.genmodel
 * template: org.eclipse.ocl.examples.build.xtend.GenerateAutoLookupInfrastructureXtend
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.pivot.imperativeocl.util;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.internal.lookup.LookupEnvironment;
import org.eclipse.ocl.pivot.util.Visitable;
import org.eclipse.ocl.pivot.util.AbstractPivotCommonLookupVisitor;

public abstract class AbstractImperativeOCLCommonLookupVisitor
	extends AbstractExtendingImperativeOCLVisitor<LookupEnvironment, LookupEnvironment> {

	private AbstractPivotCommonLookupVisitor delegate;
	protected AbstractImperativeOCLCommonLookupVisitor(LookupEnvironment context) {
		super(context);
		this.delegate = createSuperLangVisitor();
	}
	
	@Override
	public final LookupEnvironment visiting(@NonNull Visitable visitable) {
		return org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage.eINSTANCE == visitable.eClass().getEPackage()
			? doVisiting(visitable)
			: visitable.accept(getSuperLangVisitor());
	}
	
	protected AbstractPivotCommonLookupVisitor getSuperLangVisitor(){
		if (delegate == null) {
			delegate = createSuperLangVisitor();
		}
		return delegate;
	}
	
	abstract protected LookupEnvironment doVisiting(@NonNull Visitable visitable);
	
	abstract protected AbstractPivotCommonLookupVisitor  createSuperLangVisitor();
}
