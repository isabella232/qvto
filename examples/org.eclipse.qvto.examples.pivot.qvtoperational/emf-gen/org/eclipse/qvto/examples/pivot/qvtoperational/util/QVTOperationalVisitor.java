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
 */
public interface QVTOperationalVisitor<R> extends org.eclipse.qvto.examples.pivot.imperativeocl.util.ImperativeOCLVisitor<R>
{
	R visitConstructor(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Constructor object);
	R visitConstructorBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ConstructorBody object);
	R visitContextualProperty(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ContextualProperty object);
	R visitDummyRelation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelation object);
	R visitDummyRelationDomain(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationDomain object);
	R visitDummyRelationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull DummyRelationalTransformation object);
	R visitEntryOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull EntryOperation object);
	R visitHelper(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Helper object);
	R visitImperativeCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeCallExp object);
	R visitImperativeOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ImperativeOperation object);
	R visitLibrary(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Library object);
	R visitMappingBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingBody object);
	R visitMappingCallExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingCallExp object);
	R visitMappingOperation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingOperation object);
	R visitMappingParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull MappingParameter object);
	R visitModelParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelParameter object);
	R visitModelType(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModelType object);
	R visitModule(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Module object);
	R visitModuleImport(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ModuleImport object);
	R visitObjectExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ObjectExp object);
	R visitOperationBody(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationBody object);
	R visitOperationalTransformation(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull OperationalTransformation object);
	R visitResolveExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveExp object);
	R visitResolveInExp(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull ResolveInExp object);
	R visitTag(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull Tag object);
	R visitVarParameter(org.eclipse.qvto.examples.pivot.qvtoperational.@NonNull VarParameter object);
}
