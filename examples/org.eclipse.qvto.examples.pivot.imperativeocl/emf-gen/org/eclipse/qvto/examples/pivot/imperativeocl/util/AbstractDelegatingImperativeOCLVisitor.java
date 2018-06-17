/**
 * <copyright>
 * Copyright (c) 2013 Willink Transformations, University of York, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *   Adolfo Sanchez-Barbudo (University of York) - Bug397429
 * </copyright>
 *
 * This code is auto-generated
 * from: org.eclipse.qvto.examples.pivot.imperativeocl/model/ImperativeOCL.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.pivot.imperativeocl.util;

import org.eclipse.jdt.annotation.NonNull;

/**
 * An AbstractDelegatingImperativeOCLVisitor delegates all visits.
 */
public abstract class AbstractDelegatingImperativeOCLVisitor<R, C, @NonNull D extends ImperativeOCLVisitor<R>>
	extends org.eclipse.ocl.pivot.util.AbstractDelegatingVisitor<R, C, D>
	implements ImperativeOCLVisitor<R>
{
	protected AbstractDelegatingImperativeOCLVisitor(@NonNull D delegate, C context) {
		super(delegate, context);
	}

	@Override
	public R visiting(org.eclipse.ocl.pivot.util.@NonNull Visitable visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitAltExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AltExp object) {
		return delegate.visitAltExp(object);
	}

	@Override
	public R visitAssertExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssertExp object) {
		return delegate.visitAssertExp(object);
	}

	@Override
	public R visitAssignExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssignExp object) {
		return delegate.visitAssignExp(object);
	}

	@Override
	public R visitBlockExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BlockExp object) {
		return delegate.visitBlockExp(object);
	}

	@Override
	public R visitBreakExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BreakExp object) {
		return delegate.visitBreakExp(object);
	}

	@Override
	public R visitCatchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull CatchExp object) {
		return delegate.visitCatchExp(object);
	}

	@Override
	public R visitComputeExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ComputeExp object) {
		return delegate.visitComputeExp(object);
	}

	@Override
	public R visitContinueExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ContinueExp object) {
		return delegate.visitContinueExp(object);
	}

	@Override
	public R visitDictLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralExp object) {
		return delegate.visitDictLiteralExp(object);
	}

	@Override
	public R visitDictLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralPart object) {
		return delegate.visitDictLiteralPart(object);
	}

	@Override
	public R visitDictionaryType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictionaryType object) {
		return delegate.visitDictionaryType(object);
	}

	@Override
	public R visitForExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ForExp object) {
		return delegate.visitForExp(object);
	}

	@Override
	public R visitImperativeExpression(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeExpression object) {
		return delegate.visitImperativeExpression(object);
	}

	@Override
	public R visitImperativeIterateExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeIterateExp object) {
		return delegate.visitImperativeIterateExp(object);
	}

	@Override
	public R visitImperativeLoopExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeLoopExp object) {
		return delegate.visitImperativeLoopExp(object);
	}

	@Override
	public R visitInstantiationExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull InstantiationExp object) {
		return delegate.visitInstantiationExp(object);
	}

	@Override
	public R visitListLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListLiteralExp object) {
		return delegate.visitListLiteralExp(object);
	}

	@Override
	public R visitListType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListType object) {
		return delegate.visitListType(object);
	}

	@Override
	public R visitLogExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull LogExp object) {
		return delegate.visitLogExp(object);
	}

	@Override
	public R visitOrderedTupleLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralExp object) {
		return delegate.visitOrderedTupleLiteralExp(object);
	}

	@Override
	public R visitOrderedTupleLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralPart object) {
		return delegate.visitOrderedTupleLiteralPart(object);
	}

	@Override
	public R visitOrderedTupleType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleType object) {
		return delegate.visitOrderedTupleType(object);
	}

	@Override
	public R visitRaiseExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull RaiseExp object) {
		return delegate.visitRaiseExp(object);
	}

	@Override
	public R visitReturnExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ReturnExp object) {
		return delegate.visitReturnExp(object);
	}

	@Override
	public R visitSwitchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull SwitchExp object) {
		return delegate.visitSwitchExp(object);
	}

	@Override
	public R visitTryExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull TryExp object) {
		return delegate.visitTryExp(object);
	}

	@Override
	public R visitTypedef(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull Typedef object) {
		return delegate.visitTypedef(object);
	}

	@Override
	public R visitUnlinkExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnlinkExp object) {
		return delegate.visitUnlinkExp(object);
	}

	@Override
	public R visitUnpackExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnpackExp object) {
		return delegate.visitUnpackExp(object);
	}

	@Override
	public R visitVariableInitExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull VariableInitExp object) {
		return delegate.visitVariableInitExp(object);
	}

	@Override
	public R visitWhileExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull WhileExp object) {
		return delegate.visitWhileExp(object);
	}
}
