/**
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
 * An AbstractExtendingImperativeOCLVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingImperativeOCLVisitor<R, C>
	extends org.eclipse.ocl.pivot.util.AbstractExtendingVisitor<R, C>
	implements ImperativeOCLVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 *
	 * @param context my initial result value
	 */
	protected AbstractExtendingImperativeOCLVisitor(C context) {
		super(context);
	}

	@Override
	public R visitAltExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AltExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitAssertExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssertExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitAssignExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssignExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitBlockExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BlockExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitBreakExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BreakExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitCatchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull CatchExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitComputeExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ComputeExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitContinueExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ContinueExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitDictLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralExp object) {
		return visitLiteralExp(object);
	}

	@Override
	public R visitDictLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralPart object) {
		return visitElement(object);
	}

	@Override
	public R visitDictionaryType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictionaryType object) {
		return visitCollectionType(object);
	}

	@Override
	public R visitForExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ForExp object) {
		return visitImperativeLoopExp(object);
	}

	@Override
	public R visitImperativeExpression(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeExpression object) {
		return visitOCLExpression(object);
	}

	@Override
	public R visitImperativeIterateExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeIterateExp object) {
		return visitImperativeLoopExp(object);
	}

	@Override
	public R visitImperativeLoopExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeLoopExp object) {
		return visitLoopExp(object);
	}

	@Override
	public R visitInstantiationExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull InstantiationExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitListLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListLiteralExp object) {
		return visitLiteralExp(object);
	}

	@Override
	public R visitListType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListType object) {
		return visitCollectionType(object);
	}

	@Override
	public R visitLogExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull LogExp object) {
		return visitOperationCallExp(object);
	}

	@Override
	public R visitOrderedTupleLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralExp object) {
		return visitLiteralExp(object);
	}

	@Override
	public R visitOrderedTupleLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralPart object) {
		return visitElement(object);
	}

	@Override
	public R visitOrderedTupleType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleType object) {
		return visitClass(object);
	}

	@Override
	public R visitRaiseExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull RaiseExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitReturnExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ReturnExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitSwitchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull SwitchExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitTryExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull TryExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitTypedef(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull Typedef object) {
		return visitClass(object);
	}

	@Override
	public R visitUnlinkExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnlinkExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitUnpackExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnpackExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitVariableInitExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull VariableInitExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public R visitWhileExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull WhileExp object) {
		return visitImperativeExpression(object);
	}
}
