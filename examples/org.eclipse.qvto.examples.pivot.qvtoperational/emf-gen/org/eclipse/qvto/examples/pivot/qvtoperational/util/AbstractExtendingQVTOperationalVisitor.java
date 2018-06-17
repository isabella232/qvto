/**
 * <copyright>
 * Copyright (c) 2013 Willink Transformations, University of York, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
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
 * An AbstractExtendingQVTOperationalVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingQVTOperationalVisitor<R, C>
	extends org.eclipse.qvto.examples.pivot.imperativeocl.util.AbstractExtendingImperativeOCLVisitor<R, C>
	implements QVTOperationalVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 *
	 * @param context my initial result value
	 */
	protected AbstractExtendingQVTOperationalVisitor(C context) {
		super(context);
	}

	@Override
	public R visitConstructor(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Constructor object) {
		return visitImperativeOperation(object);
	}

	@Override
	public R visitConstructorBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ConstructorBody object) {
		return visitOperationBody(object);
	}

	@Override
	public R visitContextualProperty(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ContextualProperty object) {
		return visitProperty(object);
	}

	@Override
	public R visitDummyRelation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelation object) {
		return visitElement(object);
	}

	@Override
	public R visitDummyRelationDomain(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationDomain object) {
		return visitElement(object);
	}

	@Override
	public R visitDummyRelationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationalTransformation object) {
		return visitElement(object);
	}

	@Override
	public R visitEntryOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull EntryOperation object) {
		return visitImperativeOperation(object);
	}

	@Override
	public R visitHelper(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Helper object) {
		return visitImperativeOperation(object);
	}

	@Override
	public R visitImperativeCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeCallExp object) {
		return visitOperationCallExp(object);
	}

	@Override
	public R visitImperativeOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeOperation object) {
		return visitOperation(object);
	}

	@Override
	public R visitLibrary(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Library object) {
		return visitModule(object);
	}

	@Override
	public R visitMappingBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingBody object) {
		return visitOperationBody(object);
	}

	@Override
	public R visitMappingCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingCallExp object) {
		return visitImperativeCallExp(object);
	}

	@Override
	public R visitMappingOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingOperation object) {
		return visitImperativeOperation(object);
	}

	@Override
	public R visitMappingParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingParameter object) {
		return visitVarParameter(object);
	}

	@Override
	public R visitModelParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelParameter object) {
		return visitVarParameter(object);
	}

	@Override
	public R visitModelType(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelType object) {
		return visitClass(object);
	}

	@Override
	public R visitModule(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Module object) {
		return visitClass(object);
	}

	@Override
	public R visitModuleImport(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModuleImport object) {
		return visitElement(object);
	}

	@Override
	public R visitObjectExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ObjectExp object) {
		return visitInstantiationExp(object);
	}

	@Override
	public R visitOperationBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationBody object) {
		return visitElement(object);
	}

	@Override
	public R visitOperationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationalTransformation object) {
		return visitModule(object);
	}

	@Override
	public R visitResolveExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveExp object) {
		return visitCallExp(object);
	}

	@Override
	public R visitResolveInExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveInExp object) {
		return visitResolveExp(object);
	}

	@Override
	public R visitTag(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Tag object) {
		return visitElement(object);
	}

	@Override
	public R visitVarParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull VarParameter object) {
		return visitVariable(object);
	}
}
