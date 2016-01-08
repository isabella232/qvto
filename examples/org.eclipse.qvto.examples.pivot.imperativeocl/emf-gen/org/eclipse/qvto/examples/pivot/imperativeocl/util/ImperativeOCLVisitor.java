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
 */
public interface ImperativeOCLVisitor<R> extends org.eclipse.ocl.pivot.util.Visitor<R>
{
	R visitAltExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AltExp object);
	R visitAssertExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssertExp object);
	R visitAssignExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssignExp object);
	R visitBlockExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BlockExp object);
	R visitBreakExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BreakExp object);
	R visitCatchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull CatchExp object);
	R visitComputeExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ComputeExp object);
	R visitContinueExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ContinueExp object);
	R visitDictLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralExp object);
	R visitDictLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralPart object);
	R visitDictionaryType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictionaryType object);
	R visitForExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ForExp object);
	R visitImperativeExpression(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeExpression object);
	R visitImperativeIterateExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeIterateExp object);
	R visitImperativeLoopExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeLoopExp object);
	R visitInstantiationExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull InstantiationExp object);
	R visitListLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListLiteralExp object);
	R visitListType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListType object);
	R visitLogExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull LogExp object);
	R visitOrderedTupleLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralExp object);
	R visitOrderedTupleLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralPart object);
	R visitOrderedTupleType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleType object);
	R visitRaiseExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull RaiseExp object);
	R visitReturnExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ReturnExp object);
	R visitSwitchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull SwitchExp object);
	R visitTryExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull TryExp object);
	R visitTypedef(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull Typedef object);
	R visitUnlinkExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnlinkExp object);
	R visitUnpackExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnpackExp object);
	R visitVariableInitExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull VariableInitExp object);
	R visitWhileExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull WhileExp object);
}
