/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;
import org.eclipse.ocl.xtext.basecs.AnnotationCS;
import org.eclipse.ocl.xtext.basecs.AnnotationElementCS;
import org.eclipse.ocl.xtext.basecs.ClassCS;
import org.eclipse.ocl.xtext.basecs.DataTypeCS;
import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ElementRefCS;
import org.eclipse.ocl.xtext.basecs.FeatureCS;
import org.eclipse.ocl.xtext.basecs.ImportCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.NamespaceCS;
import org.eclipse.ocl.xtext.basecs.OperationCS;
import org.eclipse.ocl.xtext.basecs.PackageCS;
import org.eclipse.ocl.xtext.basecs.PackageOwnerCS;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.RootCS;
import org.eclipse.ocl.xtext.basecs.RootPackageCS;
import org.eclipse.ocl.xtext.basecs.StructuralFeatureCS;
import org.eclipse.ocl.xtext.basecs.StructuredClassCS;
import org.eclipse.ocl.xtext.basecs.TemplateableElementCS;
import org.eclipse.ocl.xtext.basecs.TypeCS;
import org.eclipse.ocl.xtext.basecs.TypeRefCS;
import org.eclipse.ocl.xtext.basecs.TypedElementCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.basecs.util.VisitableCS;
import org.eclipse.ocl.xtext.essentialoclcs.AbstractNameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.AssociationClassCallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.IterateCallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.IterationCallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.OperationCallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PropertyCallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ShadowExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.VariableExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.StatementCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByTypeExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage
 * @generated
 */
public class QVTOperationalCSAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QVTOperationalCSPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalCSAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QVTOperationalCSPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QVTOperationalCSSwitch<Adapter> modelSwitch =
		new QVTOperationalCSSwitch<Adapter>() {
			@Override
			public Adapter casePathName2CS(PathName2CS object) {
				return createPathName2CSAdapter();
			}
			@Override
			public Adapter casePathElement2CS(PathElement2CS object) {
				return createPathElement2CSAdapter();
			}
			@Override
			public Adapter caseTypedTypeRef2CS(TypedTypeRef2CS object) {
				return createTypedTypeRef2CSAdapter();
			}
			@Override
			public Adapter caseTopLevelCS(TopLevelCS object) {
				return createTopLevelCSAdapter();
			}
			@Override
			public Adapter caseClassifierPropertyCS(ClassifierPropertyCS object) {
				return createClassifierPropertyCSAdapter();
			}
			@Override
			public Adapter caseConstructorOperationCS(ConstructorOperationCS object) {
				return createConstructorOperationCSAdapter();
			}
			@Override
			public Adapter caseConfigurationPropertyCS(ConfigurationPropertyCS object) {
				return createConfigurationPropertyCSAdapter();
			}
			@Override
			public Adapter caseContextualPropertyCS(ContextualPropertyCS object) {
				return createContextualPropertyCSAdapter();
			}
			@Override
			public Adapter caseEntryOperationCS(EntryOperationCS object) {
				return createEntryOperationCSAdapter();
			}
			@Override
			public Adapter caseExceptionCS(ExceptionCS object) {
				return createExceptionCSAdapter();
			}
			@Override
			public Adapter caseHelperOperationCS(HelperOperationCS object) {
				return createHelperOperationCSAdapter();
			}
			@Override
			public Adapter caseImperativeOperationCS(ImperativeOperationCS object) {
				return createImperativeOperationCSAdapter();
			}
			@Override
			public Adapter caseInitPartCS(InitPartCS object) {
				return createInitPartCSAdapter();
			}
			@Override
			public Adapter caseMappingBodyCS(MappingBodyCS object) {
				return createMappingBodyCSAdapter();
			}
			@Override
			public Adapter caseMappingCallExpCS(MappingCallExpCS object) {
				return createMappingCallExpCSAdapter();
			}
			@Override
			public Adapter caseMappingOperationCS(MappingOperationCS object) {
				return createMappingOperationCSAdapter();
			}
			@Override
			public Adapter caseMetamodelCS(MetamodelCS object) {
				return createMetamodelCSAdapter();
			}
			@Override
			public Adapter caseModelTypeCS(ModelTypeCS object) {
				return createModelTypeCSAdapter();
			}
			@Override
			public Adapter caseModelTypeRefCS(ModelTypeRefCS object) {
				return createModelTypeRefCSAdapter();
			}
			@Override
			public Adapter caseModuleCS(ModuleCS object) {
				return createModuleCSAdapter();
			}
			@Override
			public Adapter caseModulePropertyCS(ModulePropertyCS object) {
				return createModulePropertyCSAdapter();
			}
			@Override
			public Adapter caseModuleRefCS(ModuleRefCS object) {
				return createModuleRefCSAdapter();
			}
			@Override
			public Adapter caseModuleUsageCS(ModuleUsageCS object) {
				return createModuleUsageCSAdapter();
			}
			@Override
			public Adapter caseObjectExpCS(ObjectExpCS object) {
				return createObjectExpCSAdapter();
			}
			@Override
			public Adapter caseOperationBodyCS(OperationBodyCS object) {
				return createOperationBodyCSAdapter();
			}
			@Override
			public Adapter caseOperationRefCS(OperationRefCS object) {
				return createOperationRefCSAdapter();
			}
			@Override
			public Adapter casePackageRefCS(PackageRefCS object) {
				return createPackageRefCSAdapter();
			}
			@Override
			public Adapter caseParameterDeclarationCS(ParameterDeclarationCS object) {
				return createParameterDeclarationCSAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeCS(PrimitiveTypeCS object) {
				return createPrimitiveTypeCSAdapter();
			}
			@Override
			public Adapter caseQVToClassCS(QVToClassCS object) {
				return createQVToClassCSAdapter();
			}
			@Override
			public Adapter caseQVToImportCS(QVToImportCS object) {
				return createQVToImportCSAdapter();
			}
			@Override
			public Adapter caseQVToLibraryCS(QVToLibraryCS object) {
				return createQVToLibraryCSAdapter();
			}
			@Override
			public Adapter caseQVToOperationCS(QVToOperationCS object) {
				return createQVToOperationCSAdapter();
			}
			@Override
			public Adapter caseResolveExpCS(ResolveExpCS object) {
				return createResolveExpCSAdapter();
			}
			@Override
			public Adapter caseResolveByTypeExpCS(ResolveByTypeExpCS object) {
				return createResolveByTypeExpCSAdapter();
			}
			@Override
			public Adapter caseResolveByMappingExpCS(ResolveByMappingExpCS object) {
				return createResolveByMappingExpCSAdapter();
			}
			@Override
			public Adapter caseStereotypeQualifierCS(StereotypeQualifierCS object) {
				return createStereotypeQualifierCSAdapter();
			}
			@Override
			public Adapter caseTagCS(TagCS object) {
				return createTagCSAdapter();
			}
			@Override
			public Adapter caseTransformationCS(TransformationCS object) {
				return createTransformationCSAdapter();
			}
			@Override
			public Adapter caseUnitRefCS(UnitRefCS object) {
				return createUnitRefCSAdapter();
			}
			@Override
			public Adapter caseVisitableCS(VisitableCS object) {
				return createVisitableCSAdapter();
			}
			@Override
			public Adapter caseElementCS(ElementCS object) {
				return createElementCSAdapter();
			}
			@Override
			public Adapter casePivotable(Pivotable object) {
				return createPivotableAdapter();
			}
			@Override
			public Adapter casePivotableElementCS(PivotableElementCS object) {
				return createPivotableElementCSAdapter();
			}
			@Override
			public Adapter caseElementRefCS(ElementRefCS object) {
				return createElementRefCSAdapter();
			}
			@Override
			public Adapter caseTypeRefCS(TypeRefCS object) {
				return createTypeRefCSAdapter();
			}
			@Override
			public Adapter caseTypedRefCS(TypedRefCS object) {
				return createTypedRefCSAdapter();
			}
			@Override
			public Adapter caseModelElementCS(ModelElementCS object) {
				return createModelElementCSAdapter();
			}
			@Override
			public Adapter casePackageOwnerCS(PackageOwnerCS object) {
				return createPackageOwnerCSAdapter();
			}
			@Override
			public Adapter caseRootCS(RootCS object) {
				return createRootCSAdapter();
			}
			@Override
			public Adapter caseRootPackageCS(RootPackageCS object) {
				return createRootPackageCSAdapter();
			}
			@Override
			public Adapter caseNameable(Nameable object) {
				return createNameableAdapter();
			}
			@Override
			public Adapter caseNamedElementCS(NamedElementCS object) {
				return createNamedElementCSAdapter();
			}
			@Override
			public Adapter caseTypedElementCS(TypedElementCS object) {
				return createTypedElementCSAdapter();
			}
			@Override
			public Adapter caseFeatureCS(FeatureCS object) {
				return createFeatureCSAdapter();
			}
			@Override
			public Adapter caseStructuralFeatureCS(StructuralFeatureCS object) {
				return createStructuralFeatureCSAdapter();
			}
			@Override
			public Adapter caseTemplateableElementCS(TemplateableElementCS object) {
				return createTemplateableElementCSAdapter();
			}
			@Override
			public Adapter caseOperationCS(OperationCS object) {
				return createOperationCSAdapter();
			}
			@Override
			public Adapter caseTypeCS(TypeCS object) {
				return createTypeCSAdapter();
			}
			@Override
			public Adapter caseClassCS(ClassCS object) {
				return createClassCSAdapter();
			}
			@Override
			public Adapter caseExpCS(ExpCS object) {
				return createExpCSAdapter();
			}
			@Override
			public Adapter caseAbstractNameExpCS(AbstractNameExpCS object) {
				return createAbstractNameExpCSAdapter();
			}
			@Override
			public Adapter caseCallExpCS(CallExpCS object) {
				return createCallExpCSAdapter();
			}
			@Override
			public Adapter caseAssociationClassCallExpCS(AssociationClassCallExpCS object) {
				return createAssociationClassCallExpCSAdapter();
			}
			@Override
			public Adapter caseShadowExpCS(ShadowExpCS object) {
				return createShadowExpCSAdapter();
			}
			@Override
			public Adapter caseIterationCallExpCS(IterationCallExpCS object) {
				return createIterationCallExpCSAdapter();
			}
			@Override
			public Adapter caseIterateCallExpCS(IterateCallExpCS object) {
				return createIterateCallExpCSAdapter();
			}
			@Override
			public Adapter caseOperationCallExpCS(OperationCallExpCS object) {
				return createOperationCallExpCSAdapter();
			}
			@Override
			public Adapter casePropertyCallExpCS(PropertyCallExpCS object) {
				return createPropertyCallExpCSAdapter();
			}
			@Override
			public Adapter caseVariableExpCS(VariableExpCS object) {
				return createVariableExpCSAdapter();
			}
			@Override
			public Adapter caseNameExpCS(NameExpCS object) {
				return createNameExpCSAdapter();
			}
			@Override
			public Adapter caseNamespaceCS(NamespaceCS object) {
				return createNamespaceCSAdapter();
			}
			@Override
			public Adapter casePackageCS(PackageCS object) {
				return createPackageCSAdapter();
			}
			@Override
			public Adapter caseParameterCS(ParameterCS object) {
				return createParameterCSAdapter();
			}
			@Override
			public Adapter caseStructuredClassCS(StructuredClassCS object) {
				return createStructuredClassCSAdapter();
			}
			@Override
			public Adapter caseStatementCS(StatementCS object) {
				return createStatementCSAdapter();
			}
			@Override
			public Adapter caseExpressionBlockCS(ExpressionBlockCS object) {
				return createExpressionBlockCSAdapter();
			}
			@Override
			public Adapter caseDataTypeCS(DataTypeCS object) {
				return createDataTypeCSAdapter();
			}
			@Override
			public Adapter caseImportCS(ImportCS object) {
				return createImportCSAdapter();
			}
			@Override
			public Adapter caseAnnotationElementCS(AnnotationElementCS object) {
				return createAnnotationElementCSAdapter();
			}
			@Override
			public Adapter caseAnnotationCS(AnnotationCS object) {
				return createAnnotationCSAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS <em>Path Name2 CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS
	 * @generated
	 */
	public Adapter createPathName2CSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS <em>Path Element2 CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS
	 * @generated
	 */
	public Adapter createPathElement2CSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS <em>Typed Type Ref2 CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS
	 * @generated
	 */
	public Adapter createTypedTypeRef2CSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS <em>Top Level CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS
	 * @generated
	 */
	public Adapter createTopLevelCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS <em>QV To Class CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS
	 * @generated
	 */
	public Adapter createQVToClassCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS <em>QV To Import CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS
	 * @generated
	 */
	public Adapter createQVToImportCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS <em>QV To Library CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS
	 * @generated
	 */
	public Adapter createQVToLibraryCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS <em>QV To Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS
	 * @generated
	 */
	public Adapter createQVToOperationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS <em>Constructor Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS
	 * @generated
	 */
	public Adapter createConstructorOperationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS <em>Configuration Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS
	 * @generated
	 */
	public Adapter createConfigurationPropertyCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS <em>Entry Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS
	 * @generated
	 */
	public Adapter createEntryOperationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS <em>Init Part CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS
	 * @generated
	 */
	public Adapter createInitPartCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS <em>Metamodel CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS
	 * @generated
	 */
	public Adapter createMetamodelCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS <em>Operation Body CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS
	 * @generated
	 */
	public Adapter createOperationBodyCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS <em>Operation Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS
	 * @generated
	 */
	public Adapter createOperationRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS <em>Primitive Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS
	 * @generated
	 */
	public Adapter createPrimitiveTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS <em>Classifier Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS
	 * @generated
	 */
	public Adapter createClassifierPropertyCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS <em>Stereotype Qualifier CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS
	 * @generated
	 */
	public Adapter createStereotypeQualifierCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS <em>Tag CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS
	 * @generated
	 */
	public Adapter createTagCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS <em>Exception CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS
	 * @generated
	 */
	public Adapter createExceptionCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS <em>Helper Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS
	 * @generated
	 */
	public Adapter createHelperOperationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS <em>Imperative Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS
	 * @generated
	 */
	public Adapter createImperativeOperationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS <em>Contextual Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS
	 * @generated
	 */
	public Adapter createContextualPropertyCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS <em>Mapping Body CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS
	 * @generated
	 */
	public Adapter createMappingBodyCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS <em>Mapping Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS
	 * @generated
	 */
	public Adapter createMappingCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS <em>Mapping Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS
	 * @generated
	 */
	public Adapter createMappingOperationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS <em>Module Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS
	 * @generated
	 */
	public Adapter createModuleRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS <em>Model Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS
	 * @generated
	 */
	public Adapter createModelTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS <em>Model Type Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS
	 * @generated
	 */
	public Adapter createModelTypeRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS <em>Module CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS
	 * @generated
	 */
	public Adapter createModuleCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS <em>Module Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS
	 * @generated
	 */
	public Adapter createModulePropertyCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS <em>Module Usage CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS
	 * @generated
	 */
	public Adapter createModuleUsageCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS <em>Object Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS
	 * @generated
	 */
	public Adapter createObjectExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS <em>Parameter Declaration CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS
	 * @generated
	 */
	public Adapter createParameterDeclarationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS <em>Package Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS
	 * @generated
	 */
	public Adapter createPackageRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS <em>Transformation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS
	 * @generated
	 */
	public Adapter createTransformationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS <em>Unit Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS
	 * @generated
	 */
	public Adapter createUnitRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS <em>Resolve Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS
	 * @generated
	 */
	public Adapter createResolveExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByTypeExpCS <em>Resolve By Type Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByTypeExpCS
	 * @generated
	 */
	public Adapter createResolveByTypeExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS <em>Resolve By Mapping Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS
	 * @generated
	 */
	public Adapter createResolveByMappingExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.util.VisitableCS <em>Visitable CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.util.VisitableCS
	 * @generated
	 */
	public Adapter createVisitableCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ElementCS <em>Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ElementCS
	 * @generated
	 */
	public Adapter createElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.pivot.utilities.Pivotable <em>Pivotable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.pivot.utilities.Pivotable
	 * @generated
	 */
	public Adapter createPivotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.PivotableElementCS <em>Pivotable Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.PivotableElementCS
	 * @generated
	 */
	public Adapter createPivotableElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ModelElementCS <em>Model Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ModelElementCS
	 * @generated
	 */
	public Adapter createModelElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.PackageOwnerCS <em>Package Owner CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.PackageOwnerCS
	 * @generated
	 */
	public Adapter createPackageOwnerCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.RootCS <em>Root CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.RootCS
	 * @generated
	 */
	public Adapter createRootCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.RootPackageCS <em>Root Package CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.RootPackageCS
	 * @generated
	 */
	public Adapter createRootPackageCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.pivot.utilities.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.pivot.utilities.Nameable
	 * @generated
	 */
	public Adapter createNameableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.NamedElementCS <em>Named Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.NamedElementCS
	 * @generated
	 */
	public Adapter createNamedElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.TypeCS <em>Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.TypeCS
	 * @generated
	 */
	public Adapter createTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.TemplateableElementCS <em>Templateable Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.TemplateableElementCS
	 * @generated
	 */
	public Adapter createTemplateableElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ClassCS <em>Class CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ClassCS
	 * @generated
	 */
	public Adapter createClassCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.TypedElementCS <em>Typed Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.TypedElementCS
	 * @generated
	 */
	public Adapter createTypedElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.FeatureCS <em>Feature CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.FeatureCS
	 * @generated
	 */
	public Adapter createFeatureCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.OperationCS <em>Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.OperationCS
	 * @generated
	 */
	public Adapter createOperationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ParameterCS <em>Parameter CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ParameterCS
	 * @generated
	 */
	public Adapter createParameterCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.StatementCS <em>Statement CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.StatementCS
	 * @generated
	 */
	public Adapter createStatementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.NamespaceCS <em>Namespace CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.NamespaceCS
	 * @generated
	 */
	public Adapter createNamespaceCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.StructuredClassCS <em>Structured Class CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.StructuredClassCS
	 * @generated
	 */
	public Adapter createStructuredClassCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ImportCS <em>Import CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ImportCS
	 * @generated
	 */
	public Adapter createImportCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.PackageCS <em>Package CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.PackageCS
	 * @generated
	 */
	public Adapter createPackageCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.DataTypeCS <em>Data Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.DataTypeCS
	 * @generated
	 */
	public Adapter createDataTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.StructuralFeatureCS <em>Structural Feature CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.StructuralFeatureCS
	 * @generated
	 */
	public Adapter createStructuralFeatureCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.AnnotationElementCS <em>Annotation Element CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.AnnotationElementCS
	 * @generated
	 */
	public Adapter createAnnotationElementCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.AnnotationCS <em>Annotation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.AnnotationCS
	 * @generated
	 */
	public Adapter createAnnotationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS <em>Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.ExpCS
	 * @generated
	 */
	public Adapter createExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.AbstractNameExpCS <em>Abstract Name Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.AbstractNameExpCS
	 * @generated
	 */
	public Adapter createAbstractNameExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.CallExpCS <em>Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.CallExpCS
	 * @generated
	 */
	public Adapter createCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.AssociationClassCallExpCS <em>Association Class Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.AssociationClassCallExpCS
	 * @generated
	 */
	public Adapter createAssociationClassCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.ShadowExpCS <em>Shadow Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.ShadowExpCS
	 * @generated
	 */
	public Adapter createShadowExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.IterationCallExpCS <em>Iteration Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.IterationCallExpCS
	 * @generated
	 */
	public Adapter createIterationCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.IterateCallExpCS <em>Iterate Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.IterateCallExpCS
	 * @generated
	 */
	public Adapter createIterateCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.OperationCallExpCS <em>Operation Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.OperationCallExpCS
	 * @generated
	 */
	public Adapter createOperationCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.PropertyCallExpCS <em>Property Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.PropertyCallExpCS
	 * @generated
	 */
	public Adapter createPropertyCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.VariableExpCS <em>Variable Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.VariableExpCS
	 * @generated
	 */
	public Adapter createVariableExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.essentialoclcs.NameExpCS <em>Name Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.essentialoclcs.NameExpCS
	 * @generated
	 */
	public Adapter createNameExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.ElementRefCS <em>Element Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.ElementRefCS
	 * @generated
	 */
	public Adapter createElementRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS <em>Expression Block CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS
	 * @generated
	 */
	public Adapter createExpressionBlockCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.TypeRefCS <em>Type Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.TypeRefCS
	 * @generated
	 */
	public Adapter createTypeRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.ocl.xtext.basecs.TypedRefCS <em>Typed Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.ocl.xtext.basecs.TypedRefCS
	 * @generated
	 */
	public Adapter createTypedRefCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QVTOperationalCSAdapterFactory
