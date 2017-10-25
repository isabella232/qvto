/*******************************************************************************
 * <copyright>
 * Copyright (c) 2013 Willink Transformations, University of York, and others.
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
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.pivot.imperativeocl.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractWrappingImperativeOCLVisitor delegates all visits wrapping the delegation in a call to a preVisit function and a postVisit function.
 */
public abstract class AbstractWrappingImperativeOCLVisitor<R, C, @NonNull D extends ImperativeOCLVisitor<R>, P>
	extends org.eclipse.ocl.pivot.util.AbstractWrappingVisitor<R, C, D, P>
	implements ImperativeOCLVisitor<R>
{
	protected AbstractWrappingImperativeOCLVisitor(@NonNull D delegate, C context) {
		super(delegate, context);
	}

	@Override
	public R visitAltExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AltExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAltExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAssertExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssertExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAssertExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitAssignExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssignExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitAssignExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBlockExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BlockExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBlockExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitBreakExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BreakExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitBreakExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitCatchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull CatchExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitCatchExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitComputeExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ComputeExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitComputeExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitContinueExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ContinueExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitContinueExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDictLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDictLiteralExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDictLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralPart object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDictLiteralPart(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDictionaryType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictionaryType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDictionaryType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitForExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ForExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitForExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitImperativeExpression(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeExpression object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitImperativeExpression(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitImperativeIterateExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeIterateExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitImperativeIterateExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitImperativeLoopExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeLoopExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitImperativeLoopExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitInstantiationExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull InstantiationExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitInstantiationExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitListLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListLiteralExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitListLiteralExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitListType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitListType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLogExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull LogExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLogExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOrderedTupleLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOrderedTupleLiteralExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOrderedTupleLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralPart object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOrderedTupleLiteralPart(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOrderedTupleType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOrderedTupleType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitRaiseExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull RaiseExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitRaiseExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitReturnExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ReturnExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitReturnExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitSwitchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull SwitchExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitSwitchExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTryExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull TryExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTryExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTypedef(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull Typedef object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTypedef(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUnlinkExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnlinkExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUnlinkExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitUnpackExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnpackExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitUnpackExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVariableInitExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull VariableInitExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVariableInitExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitWhileExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull WhileExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitWhileExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}
}
