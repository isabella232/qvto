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
 * from: org.eclipse.qvto.examples.pivot.qvtoperational/model/QVTOperational.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.pivot.qvtoperational.util;

import java.lang.Object;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.internal.resource.ASSaver;
import org.eclipse.qvto.examples.pivot.imperativeocl.utilities.ImperativeOCLASSaverNormalizeVisitor;

/**
 * An AbstractQVTOperationalASSaverNormalizeVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractQVTOperationalASSaverNormalizeVisitor
	extends ImperativeOCLASSaverNormalizeVisitor
	implements QVTOperationalVisitor<Object>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractQVTOperationalASSaverNormalizeVisitor(@NonNull ASSaver context) {
		super(context);
	}	

	@Override
	public @Nullable Object visitConstructor(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Constructor object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Object visitConstructorBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ConstructorBody object) {
		return visitOperationBody(object);
	}

	@Override
	public @Nullable Object visitContextualProperty(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ContextualProperty object) {
		return visitProperty(object);
	}

	@Override
	public @Nullable Object visitDummyRelation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelation object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitDummyRelationDomain(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationDomain object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitDummyRelationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationalTransformation object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitEntryOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull EntryOperation object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Object visitHelper(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Helper object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Object visitImperativeCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeCallExp object) {
		return visitOperationCallExp(object);
	}

	@Override
	public @Nullable Object visitImperativeOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeOperation object) {
		return visitOperation(object);
	}

	@Override
	public @Nullable Object visitLibrary(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Library object) {
		return visitModule(object);
	}

	@Override
	public @Nullable Object visitMappingBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingBody object) {
		return visitOperationBody(object);
	}

	@Override
	public @Nullable Object visitMappingCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingCallExp object) {
		return visitImperativeCallExp(object);
	}

	@Override
	public @Nullable Object visitMappingOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingOperation object) {
		return visitImperativeOperation(object);
	}

	@Override
	public @Nullable Object visitMappingParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingParameter object) {
		return visitVarParameter(object);
	}

	@Override
	public @Nullable Object visitModelParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelParameter object) {
		return visitVarParameter(object);
	}

	@Override
	public @Nullable Object visitModelType(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelType object) {
		return visitClass(object);
	}

	@Override
	public @Nullable Object visitModule(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Module object) {
		return visitClass(object);
	}

	@Override
	public @Nullable Object visitModuleImport(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModuleImport object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitObjectExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ObjectExp object) {
		return visitInstantiationExp(object);
	}

	@Override
	public @Nullable Object visitOperationBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationBody object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitOperationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationalTransformation object) {
		return visitModule(object);
	}

	@Override
	public @Nullable Object visitResolveExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveExp object) {
		return visitCallExp(object);
	}

	@Override
	public @Nullable Object visitResolveInExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveInExp object) {
		return visitResolveExp(object);
	}

	@Override
	public @Nullable Object visitTag(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Tag object) {
		return visitElement(object);
	}

	@Override
	public @Nullable Object visitVarParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull VarParameter object) {
		return visitVariable(object);
	}
}
