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
import org.eclipse.jdt.annotation.Nullable;

/**
 * An AbstractDelegatingQVTOperationalCSVisitor delegates all visits.
 */
public abstract class AbstractDelegatingQVTOperationalCSVisitor<R, C, D extends QVTOperationalCSVisitor<R>>
	extends org.eclipse.qvto.examples.xtext.imperativeoclcs.util.AbstractDelegatingImperativeOCLCSVisitor<R, C, D>
	implements QVTOperationalCSVisitor<R>
{
	protected AbstractDelegatingQVTOperationalCSVisitor(@NonNull D delegate, @NonNull C context) {
		super(delegate, context);
	}

	@Override
	public @Nullable R visiting(@NonNull org.eclipse.ocl.xtext.basecs.util.VisitableCS visitable) {
		return delegate.visiting(visitable);
	}

	public @Nullable R visitClassifierPropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS object) {
		return delegate.visitClassifierPropertyCS(object);
	}

	public @Nullable R visitConfigurationPropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS object) {
		return delegate.visitConfigurationPropertyCS(object);
	}

	public @Nullable R visitConstructorOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS object) {
		return delegate.visitConstructorOperationCS(object);
	}

	public @Nullable R visitContextualPropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS object) {
		return delegate.visitContextualPropertyCS(object);
	}

	public @Nullable R visitEntryOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS object) {
		return delegate.visitEntryOperationCS(object);
	}

	public @Nullable R visitExceptionCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS object) {
		return delegate.visitExceptionCS(object);
	}

	public @Nullable R visitHelperOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS object) {
		return delegate.visitHelperOperationCS(object);
	}

	public @Nullable R visitImperativeOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS object) {
		return delegate.visitImperativeOperationCS(object);
	}

	public @Nullable R visitInitPartCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS object) {
		return delegate.visitInitPartCS(object);
	}

	public @Nullable R visitMappingBodyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS object) {
		return delegate.visitMappingBodyCS(object);
	}

	public @Nullable R visitMappingCallExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS object) {
		return delegate.visitMappingCallExpCS(object);
	}

	public @Nullable R visitMappingOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS object) {
		return delegate.visitMappingOperationCS(object);
	}

	public @Nullable R visitMetamodelCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS object) {
		return delegate.visitMetamodelCS(object);
	}

	public @Nullable R visitModelTypeCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS object) {
		return delegate.visitModelTypeCS(object);
	}

	public @Nullable R visitModelTypeRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS object) {
		return delegate.visitModelTypeRefCS(object);
	}

	public @Nullable R visitModuleCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS object) {
		return delegate.visitModuleCS(object);
	}

	public @Nullable R visitModulePropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS object) {
		return delegate.visitModulePropertyCS(object);
	}

	public @Nullable R visitModuleRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS object) {
		return delegate.visitModuleRefCS(object);
	}

	public @Nullable R visitModuleUsageCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS object) {
		return delegate.visitModuleUsageCS(object);
	}

	public @Nullable R visitObjectExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS object) {
		return delegate.visitObjectExpCS(object);
	}

	public @Nullable R visitOperationBodyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS object) {
		return delegate.visitOperationBodyCS(object);
	}

	public @Nullable R visitOperationRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS object) {
		return delegate.visitOperationRefCS(object);
	}

	public @Nullable R visitPackageRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS object) {
		return delegate.visitPackageRefCS(object);
	}

	public @Nullable R visitParameterDeclarationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS object) {
		return delegate.visitParameterDeclarationCS(object);
	}

	public @Nullable R visitPathElement2CS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS object) {
		return delegate.visitPathElement2CS(object);
	}

	public @Nullable R visitPathName2CS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS object) {
		return delegate.visitPathName2CS(object);
	}

	public @Nullable R visitPrimitiveTypeCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS object) {
		return delegate.visitPrimitiveTypeCS(object);
	}

	public @Nullable R visitQVToClassCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS object) {
		return delegate.visitQVToClassCS(object);
	}

	public @Nullable R visitQVToImportCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS object) {
		return delegate.visitQVToImportCS(object);
	}

	public @Nullable R visitQVToLibraryCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS object) {
		return delegate.visitQVToLibraryCS(object);
	}

	public @Nullable R visitQVToOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS object) {
		return delegate.visitQVToOperationCS(object);
	}

	public @Nullable R visitResolveByMappingExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS object) {
		return delegate.visitResolveByMappingExpCS(object);
	}

	public @Nullable R visitResolveByTypeExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByTypeExpCS object) {
		return delegate.visitResolveByTypeExpCS(object);
	}

	public @Nullable R visitResolveExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS object) {
		return delegate.visitResolveExpCS(object);
	}

	public @Nullable R visitStereotypeQualifierCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS object) {
		return delegate.visitStereotypeQualifierCS(object);
	}

	public @Nullable R visitTagCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS object) {
		return delegate.visitTagCS(object);
	}

	public @Nullable R visitTopLevelCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS object) {
		return delegate.visitTopLevelCS(object);
	}

	public @Nullable R visitTransformationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS object) {
		return delegate.visitTransformationCS(object);
	}

	public @Nullable R visitTypedTypeRef2CS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS object) {
		return delegate.visitTypedTypeRef2CS(object);
	}

	public @Nullable R visitUnitRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS object) {
		return delegate.visitUnitRefCS(object);
	}
}
