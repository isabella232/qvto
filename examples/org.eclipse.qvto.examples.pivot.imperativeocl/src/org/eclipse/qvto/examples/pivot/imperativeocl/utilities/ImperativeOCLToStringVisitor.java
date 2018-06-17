/**
 * <copyright>
 *
 * Copyright (c) 2012 E.D. Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D. Willink - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.qvto.examples.pivot.imperativeocl.utilities;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.utilities.ToStringVisitor;
import org.eclipse.qvto.examples.pivot.imperativeocl.ImperativeOCLPackage;
import org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLVisitor;

public class ImperativeOCLToStringVisitor extends ToStringVisitor implements ImperativeOCLVisitor<String>
{
	protected static class ImperativeOCLToStringFactory implements ToStringVisitor.Factory
	{
		protected ImperativeOCLToStringFactory() {
			ToStringVisitor.addFactory(this);
			ToStringVisitor.FACTORY.getClass();
		}

		@Override
		public @NonNull ToStringVisitor createToStringVisitor(@NonNull StringBuilder s) {
			return new ImperativeOCLToStringVisitor(s);
		}

		@Override
		public @NonNull EPackage getEPackage() {
			ImperativeOCLPackage eInstance = ImperativeOCLPackage.eINSTANCE;
			assert eInstance != null;
			return eInstance;
		}
	}

	public static ToStringVisitor.@NonNull Factory FACTORY = new ImperativeOCLToStringFactory();
	
	public ImperativeOCLToStringVisitor(@NonNull StringBuilder s) {
		super(s);
	}

	public @Nullable String visitAltExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AltExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitAssertExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssertExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitAssignExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull AssignExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitBlockExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BlockExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitBreakExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull BreakExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitCatchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull CatchExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitComputeExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ComputeExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitContinueExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ContinueExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitDictLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralExp object) {
		return visitLiteralExp(object);
	}

	public @Nullable String visitDictLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictLiteralPart object) {
		return visitElement(object);
	}

	public @Nullable String visitDictionaryType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull DictionaryType object) {
		return visitCollectionType(object);
	}

	public @Nullable String visitForExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ForExp object) {
		return visitImperativeLoopExp(object);
	}

	public @Nullable String visitImperativeExpression(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeExpression object) {
		return visitOCLExpression(object);
	}

	public @Nullable String visitImperativeIterateExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeIterateExp object) {
		return visitImperativeLoopExp(object);
	}

	public @Nullable String visitImperativeLoopExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ImperativeLoopExp object) {
		return visitLoopExp(object);
	}

	public @Nullable String visitInstantiationExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull InstantiationExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitListLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListLiteralExp object) {
		return visitLiteralExp(object);
	}

	public @Nullable String visitListType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ListType object) {
		return visitCollectionType(object);
	}

	public @Nullable String visitLogExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull LogExp object) {
		return visitOperationCallExp(object);
	}

	public @Nullable String visitOrderedTupleLiteralExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralExp object) {
		return visitLiteralExp(object);
	}

	public @Nullable String visitOrderedTupleLiteralPart(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleLiteralPart object) {
		return visitElement(object);
	}

	public @Nullable String visitOrderedTupleType(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull OrderedTupleType object) {
		return visitClass(object);
	}

	public @Nullable String visitRaiseExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull RaiseExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitReturnExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull ReturnExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitSwitchExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull SwitchExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitTryExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull TryExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitTypedef(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull Typedef object) {
		return visitClass(object);
	}

	public @Nullable String visitUnlinkExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnlinkExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitUnpackExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull UnpackExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitVariableInitExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull VariableInitExp object) {
		return visitImperativeExpression(object);
	}

	public @Nullable String visitWhileExp(org.eclipse.qvto.examples.pivot.imperativeocl.@NonNull WhileExp object) {
		return visitImperativeExpression(object);
	}
}
