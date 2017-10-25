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
 * from: org.eclipse.qvto.examples.pivot.qvtoperational/model/QVTOperational.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.pivot.qvtoperational.util;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.internal.utilities.AS2XMIid;
import org.eclipse.qvto.examples.pivot.imperativeocl.utilities.ImperativeOCLAS2XMIidVisitor;

/**
 * An AbstractQVTOperationalAS2XMIidVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractQVTOperationalAS2XMIidVisitor
extends ImperativeOCLAS2XMIidVisitor
implements QVTOperationalVisitor<Boolean>
{
	/**
	 * Initializes me with an initial value for my result.
	 *
	 * @param context my initial result value
	 */
	protected AbstractQVTOperationalAS2XMIidVisitor(@NonNull AS2XMIid context) {
		super(context);
	}

	@Override
	public @Nullable Boolean visitConstructor(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Constructor object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Boolean visitConstructorBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ConstructorBody object) {
		return visitOperationBody(object);
	}

	@Override
	public @Nullable Boolean visitContextualProperty(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ContextualProperty object) {
		return visitProperty(object);
	}

	@Override
	public @Nullable Boolean visitDummyRelation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelation object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Boolean visitDummyRelationDomain(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationDomain object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Boolean visitDummyRelationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationalTransformation object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Boolean visitEntryOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull EntryOperation object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Boolean visitHelper(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Helper object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Boolean visitImperativeCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeCallExp object) {
		return visitOperationCallExp(object);
	}

	@Override
	public @Nullable Boolean visitImperativeOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeOperation object) {
		return visitOperation(object);
	}

	@Override
	public @Nullable Boolean visitLibrary(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Library object) {
		return visitModule(object);
	}

	@Override
	public @Nullable Boolean visitMappingBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingBody object) {
		return visitOperationBody(object);
	}

	@Override
	public @Nullable Boolean visitMappingCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingCallExp object) {
		return visitImperativeCallExp(object);
	}

	@Override
	public @Nullable Boolean visitMappingOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingOperation object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Boolean visitMappingParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingParameter object) {
		return visitVarParameter(object);
	}

	@Override
	public @Nullable Boolean visitModelParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelParameter object) {
		return visitVarParameter(object);
	}

	@Override
	public @Nullable Boolean visitModelType(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelType object) {
		return visitClass(object);
	}

	@Override
	public @Nullable Boolean visitModule(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Module object) {
		return visitClass(object);
	}

	@Override
	public @Nullable Boolean visitModuleImport(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModuleImport object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Boolean visitObjectExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ObjectExp object) {
		return visitInstantiationExp(object);
	}

	@Override
	public @Nullable Boolean visitOperationBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationBody object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Boolean visitOperationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationalTransformation object) {
		return visitModule(object);
	}

	@Override
	public @Nullable Boolean visitResolveExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveExp object) {
		return visitCallExp(object);
	}

	@Override
	public @Nullable Boolean visitResolveInExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveInExp object) {
		return visitResolveExp(object);
	}

	@Override
	public @Nullable Boolean visitTag(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Tag object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Boolean visitVarParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull VarParameter object) {
		return visitVariable(object);
	}
}
