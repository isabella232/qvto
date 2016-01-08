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
	protected AbstractExtendingQVTOperationalCSVisitor(C context) {
		super(context);
	}	

	@Override
	public R visitClassifierPropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ClassifierPropertyCS object) {
		return visitStructuralFeatureCS(object);
	}

	@Override
	public R visitConfigurationPropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ConfigurationPropertyCS object) {
		return visitModulePropertyCS(object);
	}

	@Override
	public R visitConstructorOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ConstructorOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	@Override
	public R visitContextualPropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ContextualPropertyCS object) {
		return visitModulePropertyCS(object);
	}

	@Override
	public R visitEntryOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull EntryOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	@Override
	public R visitExceptionCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ExceptionCS object) {
		return visitClassCS(object);
	}

	@Override
	public R visitHelperOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull HelperOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	@Override
	public R visitImperativeOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ImperativeOperationCS object) {
		return visitOperationCS(object);
	}

	@Override
	public R visitInitPartCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull InitPartCS object) {
		return visitElementCS(object);
	}

	@Override
	public R visitMappingBodyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MappingBodyCS object) {
		return visitOperationBodyCS(object);
	}

	@Override
	public R visitMappingCallExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MappingCallExpCS object) {
		return visitNameExpCS(object);
	}

	@Override
	public R visitMappingOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MappingOperationCS object) {
		return visitImperativeOperationCS(object);
	}

	@Override
	public R visitMetamodelCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull MetamodelCS object) {
		return visitPackageCS(object);
	}

	@Override
	public R visitModelTypeCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModelTypeCS object) {
		return visitClassCS(object);
	}

	@Override
	public R visitModelTypeRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModelTypeRefCS object) {
		return visitParameterCS(object);
	}

	@Override
	public R visitModuleCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModuleCS object) {
		return visitStructuredClassCS(object);
	}

	@Override
	public R visitModulePropertyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModulePropertyCS object) {
		return visitStructuralFeatureCS(object);
	}

	@Override
	public R visitModuleRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModuleRefCS object) {
		return visitElementRefCS(object);
	}

	@Override
	public R visitModuleUsageCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ModuleUsageCS object) {
		return visitElementCS(object);
	}

	@Override
	public R visitObjectExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ObjectExpCS object) {
		return visitExpressionBlockCS(object);
	}

	@Override
	public R visitOperationBodyCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull OperationBodyCS object) {
		return visitPivotableElementCS(object);
	}

	@Override
	public R visitOperationRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull OperationRefCS object) {
		return visitElementRefCS(object);
	}

	@Override
	public R visitPackageRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PackageRefCS object) {
		return visitElementCS(object);
	}

	@Override
	public R visitParameterDeclarationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ParameterDeclarationCS object) {
		return visitParameterCS(object);
	}

	@Override
	public R visitPathElement2CS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PathElement2CS object) {
		return visitPivotableElementCS(object);
	}

	@Override
	public R visitPathName2CS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PathName2CS object) {
		return visitPivotableElementCS(object);
	}

	@Override
	public R visitPrimitiveTypeCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull PrimitiveTypeCS object) {
		return visitDataTypeCS(object);
	}

	@Override
	public R visitQVToClassCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToClassCS object) {
		return visitStructuredClassCS(object);
	}

	@Override
	public R visitQVToImportCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToImportCS object) {
		return visitImportCS(object);
	}

	@Override
	public R visitQVToLibraryCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToLibraryCS object) {
		return visitModuleCS(object);
	}

	@Override
	public R visitQVToOperationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull QVToOperationCS object) {
		return visitOperationCS(object);
	}

	@Override
	public R visitResolveByMappingExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ResolveByMappingExpCS object) {
		return visitResolveExpCS(object);
	}

	@Override
	public R visitResolveByTypeExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ResolveByTypeExpCS object) {
		return visitResolveExpCS(object);
	}

	@Override
	public R visitResolveExpCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull ResolveExpCS object) {
		return visitCallExpCS(object);
	}

	@Override
	public R visitStereotypeQualifierCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull StereotypeQualifierCS object) {
		return visitElementCS(object);
	}

	@Override
	public R visitTagCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TagCS object) {
		return visitAnnotationCS(object);
	}

	@Override
	public R visitTopLevelCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TopLevelCS object) {
		return visitRootPackageCS(object);
	}

	@Override
	public R visitTransformationCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TransformationCS object) {
		return visitModuleCS(object);
	}

	@Override
	public R visitTypedTypeRef2CS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull TypedTypeRef2CS object) {
		return visitTypedRefCS(object);
	}

	@Override
	public R visitUnitRefCS(org.eclipse.qvto.examples.xtext.qvtoperationalcs.@NonNull UnitRefCS object) {
		return visitElementCS(object);
	}
}
