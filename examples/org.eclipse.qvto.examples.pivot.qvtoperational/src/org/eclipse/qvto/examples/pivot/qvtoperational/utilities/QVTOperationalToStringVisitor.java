package org.eclipse.qvto.examples.pivot.qvtoperational.utilities;
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


import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.utilities.ToStringVisitor;
import org.eclipse.qvto.examples.pivot.imperativeocl.utilities.ImperativeOCLToStringVisitor;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.util.QVTOperationalVisitor;

public class QVTOperationalToStringVisitor extends ImperativeOCLToStringVisitor implements QVTOperationalVisitor<String>
{
	protected static class QVTOperationalToStringFactory implements ToStringVisitor.Factory
	{
		protected QVTOperationalToStringFactory() {
			ToStringVisitor.addFactory(this);
			ImperativeOCLToStringVisitor.FACTORY.getClass();
		}

		@Override
		public @NonNull ToStringVisitor createToStringVisitor(@NonNull StringBuilder s) {
			return new QVTOperationalToStringVisitor(s);
		}

		@Override
		public @NonNull EPackage getEPackage() {
			QVTOperationalPackage eInstance = QVTOperationalPackage.eINSTANCE;
			assert eInstance != null;
			return eInstance;
		}
	}

	public static ToStringVisitor.@NonNull Factory FACTORY = new QVTOperationalToStringFactory();
	
	public QVTOperationalToStringVisitor(@NonNull StringBuilder s) {
		super(s);
	}

	public @Nullable String visitConstructor(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Constructor object) {
		return visitImperativeOperation(object);
	}

	public @Nullable String visitConstructorBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ConstructorBody object) {
		return visitOperationBody(object);
	}

	public @Nullable String visitContextualProperty(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ContextualProperty object) {
		return visitProperty(object);
	}

	public @Nullable String visitDummyRelation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelation object) {
		return visitElement(object);
	}

	public @Nullable String visitDummyRelationDomain(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationDomain object) {
		return visitElement(object);
	}

	public @Nullable String visitDummyRelationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationalTransformation object) {
		return visitElement(object);
	}

	public @Nullable String visitEntryOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull EntryOperation object) {
		return visitImperativeOperation(object);
	}

	public @Nullable String visitHelper(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Helper object) {
		return visitImperativeOperation(object);
	}

	public @Nullable String visitImperativeCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeCallExp object) {
		return visitOperationCallExp(object);
	}

	public @Nullable String visitImperativeOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeOperation object) {
		return visitOperation(object);
	}

	public @Nullable String visitLibrary(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Library object) {
		return visitModule(object);
	}

	public @Nullable String visitMappingBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingBody object) {
		return visitOperationBody(object);
	}

	public @Nullable String visitMappingCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingCallExp object) {
		return visitImperativeCallExp(object);
	}

	public @Nullable String visitMappingOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingOperation object) {
		return visitImperativeOperation(object);
	}

	public @Nullable String visitMappingParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingParameter object) {
		return visitVarParameter(object);
	}

	public @Nullable String visitModelParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelParameter object) {
		context.append(object.getName());
		context.append(" : ");
		context.append(object.getKind());
		return null;
	}

	public @Nullable String visitModelType(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelType object) {
		return visitClass(object);
	}

	public @Nullable String visitModule(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Module object) {
		return visitClass(object);
	}

	public @Nullable String visitModuleImport(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModuleImport object) {
		return visitElement(object);
	}

	public @Nullable String visitObjectExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ObjectExp object) {
		return visitInstantiationExp(object);
	}

	public @Nullable String visitOperationBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationBody object) {
		return visitElement(object);
	}

	public @Nullable String visitOperationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationalTransformation object) {
		return visitModule(object);
	}

	public @Nullable String visitResolveExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveExp object) {
		return visitCallExp(object);
	}

	public @Nullable String visitResolveInExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveInExp object) {
		return visitResolveExp(object);
	}

	public @Nullable String visitTag(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Tag object) {
		return visitElement(object);
	}

	public @Nullable String visitVarParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull VarParameter object) {
		return visitVariable(object);
	}
}
