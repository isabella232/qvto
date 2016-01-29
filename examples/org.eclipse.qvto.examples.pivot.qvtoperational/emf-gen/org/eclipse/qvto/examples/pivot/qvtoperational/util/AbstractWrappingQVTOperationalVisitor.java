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

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractWrappingQVTOperationalVisitor delegates all visits wrapping the delegation in a call to a preVisit function and a postVisit function.
 */
public abstract class AbstractWrappingQVTOperationalVisitor<R, C, D extends QVTOperationalVisitor<R>, P>
	extends org.eclipse.qvto.examples.pivot.imperativeocl.util.AbstractWrappingImperativeOCLVisitor<R, C, D, P>
	implements QVTOperationalVisitor<R>
{
	protected AbstractWrappingQVTOperationalVisitor(@NonNull D delegate, C context) {
		super(delegate, context);
	}

	@Override
	public R visitConstructor(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Constructor object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitConstructor(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitConstructorBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ConstructorBody object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitConstructorBody(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitContextualProperty(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ContextualProperty object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitContextualProperty(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDummyRelation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelation object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDummyRelation(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDummyRelationDomain(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationDomain object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDummyRelationDomain(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitDummyRelationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationalTransformation object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitDummyRelationalTransformation(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitEntryOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull EntryOperation object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitEntryOperation(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitHelper(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Helper object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitHelper(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitImperativeCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeCallExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitImperativeCallExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitImperativeOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeOperation object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitImperativeOperation(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitLibrary(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Library object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitLibrary(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMappingBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingBody object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMappingBody(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMappingCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingCallExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMappingCallExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMappingOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingOperation object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMappingOperation(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitMappingParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingParameter object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitMappingParameter(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitModelParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelParameter object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitModelParameter(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitModelType(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelType object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitModelType(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitModule(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Module object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitModule(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitModuleImport(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModuleImport object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitModuleImport(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitObjectExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ObjectExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitObjectExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOperationBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationBody object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOperationBody(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitOperationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationalTransformation object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitOperationalTransformation(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitResolveExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitResolveExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitResolveInExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveInExp object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitResolveInExp(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitTag(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Tag object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitTag(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}

	@Override
	public R visitVarParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull VarParameter object) {
		@Nullable P prologue = preVisit(object);
		try {
			R result = delegate.visitVarParameter(object);
			return postVisit(object, prologue, result);
		}
		catch (Throwable e) {
			return badVisit(object, prologue, e);
		}
	}
}
