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
 * An AbstractExtendingQVTOperationalCSVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingQVTOperationalCSVisitor<R, C>
	extends org.eclipse.qvto.examples.xtext.imperativeoclcs.util.AbstractExtendingImperativeOCLCSVisitor<R, C>
	implements QVTOperationalCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 * 
	 * @param context my initial result value
	 */
	protected AbstractExtendingQVTOperationalCSVisitor(@NonNull C context) {
		super(context);
	}	

	public @Nullable R visitClassifierPropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS object) {
		return visitStructuralFeatureCS(object);
	}

	public @Nullable R visitConfigurationPropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS object) {
		return visitModulePropertyCS(object);
	}

	public @Nullable R visitConstructorOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	public @Nullable R visitContextualPropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS object) {
		return visitModulePropertyCS(object);
	}

	public @Nullable R visitEntryOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	public @Nullable R visitExceptionCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS object) {
		return visitClassCS(object);
	}

	public @Nullable R visitHelperOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	public @Nullable R visitImperativeOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS object) {
		return visitOperationCS(object);
	}

	public @Nullable R visitInitPartCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS object) {
		return visitElementCS(object);
	}

	public @Nullable R visitMappingBodyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS object) {
		return visitOperationBodyCS(object);
	}

	public @Nullable R visitMappingCallExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS object) {
		return visitNameExpCS(object);
	}

	public @Nullable R visitMappingOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	public @Nullable R visitMetamodelCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS object) {
		return visitPackageCS(object);
	}

	public @Nullable R visitModelTypeCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS object) {
		return visitClassCS(object);
	}

	public @Nullable R visitModelTypeRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS object) {
		return visitParameterCS(object);
	}

	public @Nullable R visitModuleCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS object) {
		return visitStructuredClassCS(object);
	}

	public @Nullable R visitModulePropertyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS object) {
		return visitStructuralFeatureCS(object);
	}

	public @Nullable R visitModuleRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS object) {
		return visitElementRefCS(object);
	}

	public @Nullable R visitModuleUsageCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS object) {
		return visitElementCS(object);
	}

	public @Nullable R visitObjectExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS object) {
		return visitExpressionBlockCS(object);
	}

	public @Nullable R visitOperationBodyCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS object) {
		return visitPivotableElementCS(object);
	}

	public @Nullable R visitOperationRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS object) {
		return visitElementRefCS(object);
	}

	public @Nullable R visitPackageRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS object) {
		return visitElementCS(object);
	}

	public @Nullable R visitParameterDeclarationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS object) {
		return visitParameterCS(object);
	}

	public @Nullable R visitPathElement2CS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS object) {
		return visitPivotableElementCS(object);
	}

	public @Nullable R visitPathName2CS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS object) {
		return visitPivotableElementCS(object);
	}

	public @Nullable R visitPrimitiveTypeCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS object) {
		return visitDataTypeCS(object);
	}

	public @Nullable R visitQVToClassCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS object) {
		return visitStructuredClassCS(object);
	}

	public @Nullable R visitQVToImportCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS object) {
		return visitImportCS(object);
	}

	public @Nullable R visitQVToLibraryCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS object) {
		return visitModuleCS(object);
	}

	public @Nullable R visitQVToOperationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS object) {
		return visitOperationCS(object);
	}

	public @Nullable R visitResolveByMappingExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS object) {
		return visitResolveExpCS(object);
	}

	public @Nullable R visitResolveByTypeExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByTypeExpCS object) {
		return visitResolveExpCS(object);
	}

	public @Nullable R visitResolveExpCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS object) {
		return visitCallExpCS(object);
	}

	public @Nullable R visitStereotypeQualifierCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS object) {
		return visitElementCS(object);
	}

	public @Nullable R visitTagCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS object) {
		return visitAnnotationCS(object);
	}

	public @Nullable R visitTopLevelCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS object) {
		return visitRootPackageCS(object);
	}

	public @Nullable R visitTransformationCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS object) {
		return visitModuleCS(object);
	}

	public @Nullable R visitTypedTypeRef2CS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS object) {
		return visitTypedRefCS(object);
	}

	public @Nullable R visitUnitRefCS(@NonNull org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS object) {
		return visitElementCS(object);
	}
}
