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

/**
 * An AbstractMergedImperativeOCLVisitor merges all visits direct to visiting().
 * This can be used by a decorating visitor to execute shared code before redispatching to a decorated visitor.
 */
public abstract class AbstractMergedImperativeOCLVisitor<R, C>
	extends org.eclipse.ocl.pivot.util.AbstractMergedVisitor<R, C>
	implements ImperativeOCLVisitor<R>
{
	protected AbstractMergedImperativeOCLVisitor(C context) {
		super(context);
	}

	@Override
	public R visitAltExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AltExp object) {
		return visiting(object);
	}

	@Override
	public R visitAssertExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssertExp object) {
		return visiting(object);
	}

	@Override
	public R visitAssignExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssignExp object) {
		return visiting(object);
	}

	@Override
	public R visitBlockExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BlockExp object) {
		return visiting(object);
	}

	@Override
	public R visitBreakExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BreakExp object) {
		return visiting(object);
	}

	@Override
	public R visitCatchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull CatchExp object) {
		return visiting(object);
	}

	@Override
	public R visitComputeExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ComputeExp object) {
		return visiting(object);
	}

	@Override
	public R visitContinueExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ContinueExp object) {
		return visiting(object);
	}

	@Override
	public R visitDictLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralExp object) {
		return visiting(object);
	}

	@Override
	public R visitDictLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralPart object) {
		return visiting(object);
	}

	@Override
	public R visitDictionaryType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictionaryType object) {
		return visiting(object);
	}

	@Override
	public R visitForExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ForExp object) {
		return visiting(object);
	}

	@Override
	public R visitImperativeExpression(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeExpression object) {
		return visiting(object);
	}

	@Override
	public R visitImperativeIterateExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeIterateExp object) {
		return visiting(object);
	}

	@Override
	public R visitImperativeLoopExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeLoopExp object) {
		return visiting(object);
	}

	@Override
	public R visitInstantiationExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull InstantiationExp object) {
		return visiting(object);
	}

	@Override
	public R visitListLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListLiteralExp object) {
		return visiting(object);
	}

	@Override
	public R visitListType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListType object) {
		return visiting(object);
	}

	@Override
	public R visitLogExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull LogExp object) {
		return visiting(object);
	}

	@Override
	public R visitOrderedTupleLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralExp object) {
		return visiting(object);
	}

	@Override
	public R visitOrderedTupleLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralPart object) {
		return visiting(object);
	}

	@Override
	public R visitOrderedTupleType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleType object) {
		return visiting(object);
	}

	@Override
	public R visitRaiseExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull RaiseExp object) {
		return visiting(object);
	}

	@Override
	public R visitReturnExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ReturnExp object) {
		return visiting(object);
	}

	@Override
	public R visitSwitchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull SwitchExp object) {
		return visiting(object);
	}

	@Override
	public R visitTryExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull TryExp object) {
		return visiting(object);
	}

	@Override
	public R visitTypedef(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull Typedef object) {
		return visiting(object);
	}

	@Override
	public R visitUnlinkExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnlinkExp object) {
		return visiting(object);
	}

	@Override
	public R visitUnpackExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnpackExp object) {
		return visiting(object);
	}

	@Override
	public R visitVariableInitExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull VariableInitExp object) {
		return visiting(object);
	}

	@Override
	public R visitWhileExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull WhileExp object) {
		return visiting(object);
	}
}
