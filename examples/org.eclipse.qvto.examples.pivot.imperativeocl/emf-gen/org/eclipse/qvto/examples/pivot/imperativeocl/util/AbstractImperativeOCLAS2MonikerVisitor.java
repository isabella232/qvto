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

import java.lang.Object;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.internal.utilities.AS2Moniker;
import org.eclipse.ocl.pivot.utilities.PivotAS2MonikerVisitor;

/**
 * An AbstractImperativeOCLAS2MonikerVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractImperativeOCLAS2MonikerVisitor
	extends PivotAS2MonikerVisitor
	implements ImperativeOCLVisitor<Object>
{
	/**
	 * Initializes me with an initial value for my result.
	 *
	 * @param context my initial result value
	 */
	protected AbstractImperativeOCLAS2MonikerVisitor(@NonNull AS2Moniker context) {
		super(context);
	}

	@Override
	public @Nullable Object visitAltExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AltExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitAssertExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssertExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitAssignExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssignExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitBlockExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BlockExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitBreakExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BreakExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitCatchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull CatchExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitComputeExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ComputeExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitContinueExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ContinueExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitDictLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralExp object) {
		return visitLiteralExp(object);
	}

	@Override
	public @Nullable Object visitDictLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralPart object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitDictionaryType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictionaryType object) {
		return visitCollectionType(object);
	}

	@Override
	public @Nullable Object visitForExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ForExp object) {
		return visitImperativeLoopExp(object);
	}

	@Override
	public @Nullable Object visitImperativeExpression(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeExpression object) {
		return visitOCLExpression(object);
	}

	@Override
	public @Nullable Object visitImperativeIterateExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeIterateExp object) {
		return visitImperativeLoopExp(object);
	}

	@Override
	public @Nullable Object visitImperativeLoopExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeLoopExp object) {
		return visitLoopExp(object);
	}

	@Override
	public @Nullable Object visitInstantiationExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull InstantiationExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitListLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListLiteralExp object) {
		return visitLiteralExp(object);
	}

	@Override
	public @Nullable Object visitListType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListType object) {
		return visitCollectionType(object);
	}

	@Override
	public @Nullable Object visitLogExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull LogExp object) {
		return visitOperationCallExp(object);
	}

	@Override
	public @Nullable Object visitOrderedTupleLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralExp object) {
		return visitLiteralExp(object);
	}

	@Override
	public @Nullable Object visitOrderedTupleLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralPart object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitOrderedTupleType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleType object) {
		return visitClass(object);
	}

	@Override
	public @Nullable Object visitRaiseExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull RaiseExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitReturnExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ReturnExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitSwitchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull SwitchExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitTryExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull TryExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitTypedef(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull Typedef object) {
		return visitClass(object);
	}

	@Override
	public @Nullable Object visitUnlinkExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnlinkExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitUnpackExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnpackExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitVariableInitExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull VariableInitExp object) {
		return visitImperativeExpression(object);
	}

	@Override
	public @Nullable Object visitWhileExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull WhileExp object) {
		return visitImperativeExpression(object);
	}
}
