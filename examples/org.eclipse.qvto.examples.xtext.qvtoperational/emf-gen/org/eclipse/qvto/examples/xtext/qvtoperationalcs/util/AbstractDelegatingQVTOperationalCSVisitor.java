/*******************************************************************************
 * <copyright>
 * 
 * </copyright>
 *
 * This code is auto-generated
 * from: org.eclipse.qvto.examples.xtext.qvtoperational/model/QVTOperationalCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.qvto.examples.xtext.qvtoperationalcs.util;

import org.eclipse.jdt.annotation.NonNull;

/**
 * An AbstractDelegatingQVTOperationalCSVisitor delegates all visits.
 */
public abstract class AbstractDelegatingQVTOperationalCSVisitor<R, C, D extends QVTOperationalCSVisitor<R>>
	extends org.eclipse.qvto.examples.xtext.imperativeoclcs.util.AbstractDelegatingImperativeOCLCSVisitor<R, C, D>
	implements QVTOperationalCSVisitor<R>
{
	protected AbstractDelegatingQVTOperationalCSVisitor(@NonNull D delegate, C context) {
		super(delegate, context);
	}

	@Override
	public R visiting(org.eclipse.ocl.xtext.basecs.util.@NonNull VisitableCS visitable) {
		return delegate.visiting(visitable);
	}

	@Override
	public R visitClassifierPropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ClassifierPropertyCS object) {
		return delegate.visitClassifierPropertyCS(object);
	}

	@Override
	public R visitConfigurationPropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ConfigurationPropertyCS object) {
		return delegate.visitConfigurationPropertyCS(object);
	}

	@Override
	public R visitConstructorOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ConstructorOperationCS object) {
		return delegate.visitConstructorOperationCS(object);
	}

	@Override
	public R visitContextualPropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ContextualPropertyCS object) {
		return delegate.visitContextualPropertyCS(object);
	}

	@Override
	public R visitEntryOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull EntryOperationCS object) {
		return delegate.visitEntryOperationCS(object);
	}

	@Override
	public R visitExceptionCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ExceptionCS object) {
		return delegate.visitExceptionCS(object);
	}

	@Override
	public R visitHelperOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull HelperOperationCS object) {
		return delegate.visitHelperOperationCS(object);
	}

	@Override
	public R visitImperativeOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ImperativeOperationCS object) {
		return delegate.visitImperativeOperationCS(object);
	}

	@Override
	public R visitInitPartCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull InitPartCS object) {
		return delegate.visitInitPartCS(object);
	}

	@Override
	public R visitMappingBodyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MappingBodyCS object) {
		return delegate.visitMappingBodyCS(object);
	}

	@Override
	public R visitMappingCallExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MappingCallExpCS object) {
		return delegate.visitMappingCallExpCS(object);
	}

	@Override
	public R visitMappingOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MappingOperationCS object) {
		return delegate.visitMappingOperationCS(object);
	}

	@Override
	public R visitMetamodelCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MetamodelCS object) {
		return delegate.visitMetamodelCS(object);
	}

	@Override
	public R visitModelTypeCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModelTypeCS object) {
		return delegate.visitModelTypeCS(object);
	}

	@Override
	public R visitModelTypeRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModelTypeRefCS object) {
		return delegate.visitModelTypeRefCS(object);
	}

	@Override
	public R visitModuleCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModuleCS object) {
		return delegate.visitModuleCS(object);
	}

	@Override
	public R visitModulePropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModulePropertyCS object) {
		return delegate.visitModulePropertyCS(object);
	}

	@Override
	public R visitModuleRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModuleRefCS object) {
		return delegate.visitModuleRefCS(object);
	}

	@Override
	public R visitModuleUsageCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModuleUsageCS object) {
		return delegate.visitModuleUsageCS(object);
	}

	@Override
	public R visitObjectExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ObjectExpCS object) {
		return delegate.visitObjectExpCS(object);
	}

	@Override
	public R visitOperationBodyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull OperationBodyCS object) {
		return delegate.visitOperationBodyCS(object);
	}

	@Override
	public R visitOperationRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull OperationRefCS object) {
		return delegate.visitOperationRefCS(object);
	}

	@Override
	public R visitPackageRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PackageRefCS object) {
		return delegate.visitPackageRefCS(object);
	}

	@Override
	public R visitParameterDeclarationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ParameterDeclarationCS object) {
		return delegate.visitParameterDeclarationCS(object);
	}

	@Override
	public R visitPathElement2CS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PathElement2CS object) {
		return delegate.visitPathElement2CS(object);
	}

	@Override
	public R visitPathName2CS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PathName2CS object) {
		return delegate.visitPathName2CS(object);
	}

	@Override
	public R visitPrimitiveTypeCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PrimitiveTypeCS object) {
		return delegate.visitPrimitiveTypeCS(object);
	}

	@Override
	public R visitQVToClassCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToClassCS object) {
		return delegate.visitQVToClassCS(object);
	}

	@Override
	public R visitQVToImportCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToImportCS object) {
		return delegate.visitQVToImportCS(object);
	}

	@Override
	public R visitQVToLibraryCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToLibraryCS object) {
		return delegate.visitQVToLibraryCS(object);
	}

	@Override
	public R visitQVToOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToOperationCS object) {
		return delegate.visitQVToOperationCS(object);
	}

	@Override
	public R visitResolveByMappingExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ResolveByMappingExpCS object) {
		return delegate.visitResolveByMappingExpCS(object);
	}

	@Override
	public R visitResolveByTypeExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ResolveByTypeExpCS object) {
		return delegate.visitResolveByTypeExpCS(object);
	}

	@Override
	public R visitResolveExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ResolveExpCS object) {
		return delegate.visitResolveExpCS(object);
	}

	@Override
	public R visitStereotypeQualifierCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull StereotypeQualifierCS object) {
		return delegate.visitStereotypeQualifierCS(object);
	}

	@Override
	public R visitTagCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TagCS object) {
		return delegate.visitTagCS(object);
	}

	@Override
	public R visitTopLevelCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TopLevelCS object) {
		return delegate.visitTopLevelCS(object);
	}

	@Override
	public R visitTransformationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TransformationCS object) {
		return delegate.visitTransformationCS(object);
	}

	@Override
	public R visitTypedTypeRef2CS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TypedTypeRef2CS object) {
		return delegate.visitTypedTypeRef2CS(object);
	}

	@Override
	public R visitUnitRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull UnitRefCS object) {
		return delegate.visitUnitRefCS(object);
	}
}
