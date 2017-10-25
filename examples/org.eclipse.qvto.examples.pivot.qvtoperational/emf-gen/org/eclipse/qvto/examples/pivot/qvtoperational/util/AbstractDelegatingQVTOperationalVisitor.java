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

/**
 * An AbstractDelegatingQVTOperationalVisitor delegates all visits.
 */
public abstract class AbstractDelegatingQVTOperationalVisitor<R, C, @NonNull D extends QVTOperationalVisitor<R>>
	extends org.eclipse.qvto.examples.pivot.imperativeocl.util.AbstractDelegatingImperativeOCLVisitor<R, C, D>
	implements QVTOperationalVisitor<R>
{
	protected AbstractDelegatingQVTOperationalVisitor(@NonNull D delegate, C context) {
		super(delegate, context);
	}

	@Override
	public R visiting(org.eclipse.ocl.pivot.util.@NonNull Visitable visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitConstructor(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Constructor object) {
		return delegate.visitConstructor(object);
	}

	@Override
	public R visitConstructorBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ConstructorBody object) {
		return delegate.visitConstructorBody(object);
	}

	@Override
	public R visitContextualProperty(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ContextualProperty object) {
		return delegate.visitContextualProperty(object);
	}

	@Override
	public R visitDummyRelation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelation object) {
		return delegate.visitDummyRelation(object);
	}

	@Override
	public R visitDummyRelationDomain(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationDomain object) {
		return delegate.visitDummyRelationDomain(object);
	}

	@Override
	public R visitDummyRelationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationalTransformation object) {
		return delegate.visitDummyRelationalTransformation(object);
	}

	@Override
	public R visitEntryOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull EntryOperation object) {
		return delegate.visitEntryOperation(object);
	}

	@Override
	public R visitHelper(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Helper object) {
		return delegate.visitHelper(object);
	}

	@Override
	public R visitImperativeCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeCallExp object) {
		return delegate.visitImperativeCallExp(object);
	}

	@Override
	public R visitImperativeOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeOperation object) {
		return delegate.visitImperativeOperation(object);
	}

	@Override
	public R visitLibrary(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Library object) {
		return delegate.visitLibrary(object);
	}

	@Override
	public R visitMappingBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingBody object) {
		return delegate.visitMappingBody(object);
	}

	@Override
	public R visitMappingCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingCallExp object) {
		return delegate.visitMappingCallExp(object);
	}

	@Override
	public R visitMappingOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingOperation object) {
		return delegate.visitMappingOperation(object);
	}

	@Override
	public R visitMappingParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingParameter object) {
		return delegate.visitMappingParameter(object);
	}

	@Override
	public R visitModelParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelParameter object) {
		return delegate.visitModelParameter(object);
	}

	@Override
	public R visitModelType(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelType object) {
		return delegate.visitModelType(object);
	}

	@Override
	public R visitModule(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Module object) {
		return delegate.visitModule(object);
	}

	@Override
	public R visitModuleImport(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModuleImport object) {
		return delegate.visitModuleImport(object);
	}

	@Override
	public R visitObjectExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ObjectExp object) {
		return delegate.visitObjectExp(object);
	}

	@Override
	public R visitOperationBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationBody object) {
		return delegate.visitOperationBody(object);
	}

	@Override
	public R visitOperationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationalTransformation object) {
		return delegate.visitOperationalTransformation(object);
	}

	@Override
	public R visitResolveExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveExp object) {
		return delegate.visitResolveExp(object);
	}

	@Override
	public R visitResolveInExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveInExp object) {
		return delegate.visitResolveInExp(object);
	}

	@Override
	public R visitTag(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Tag object) {
		return delegate.visitTag(object);
	}

	@Override
	public R visitVarParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull VarParameter object) {
		return delegate.visitVarParameter(object);
	}
}
