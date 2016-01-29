/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;
import org.eclipse.qvto.examples.pivot.qvtoperational.QVTOperationalPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS;
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
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSFactory;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QualifierKindCS;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTOperationalCSPackageImpl extends EPackageImpl implements QVTOperationalCSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathName2CSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathElement2CSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedTypeRef2CSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topLevelCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvToClassCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvToImportCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvToLibraryCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qvToOperationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorOperationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertyCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryOperationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initPartCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationBodyCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationRefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierPropertyCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeQualifierCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperOperationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperativeOperationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualPropertyCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingBodyCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingCallExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingOperationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleRefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeRefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modulePropertyCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleUsageCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDeclarationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageRefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitRefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveByTypeExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveByMappingExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metamodelKindCSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionKindCSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum importKindCSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moduleKindCSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qualifierKindCSEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QVTOperationalCSPackageImpl() {
		super(eNS_URI, QVTOperationalCSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QVTOperationalCSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QVTOperationalCSPackage init() {
		if (isInited) return (QVTOperationalCSPackage)EPackage.Registry.INSTANCE.getEPackage(QVTOperationalCSPackage.eNS_URI);

		// Obtain or create and register package
		Object ePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QVTOperationalCSPackageImpl theQVTOperationalCSPackage = (QVTOperationalCSPackageImpl)(ePackage instanceof QVTOperationalCSPackageImpl ? ePackage : new QVTOperationalCSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ImperativeOCLCSPackage.eINSTANCE.eClass();
		QVTOperationalPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQVTOperationalCSPackage.createPackageContents();

		// Initialize created meta-data
		theQVTOperationalCSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQVTOperationalCSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QVTOperationalCSPackage.eNS_URI, theQVTOperationalCSPackage);
		return theQVTOperationalCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathName2CS() {
		return pathName2CSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathName2CS_OwnedPathElements2() {
		return (EReference)pathName2CSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathElement2CS() {
		return pathElement2CSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathElement2CS_Name() {
		return (EAttribute)pathElement2CSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathElement2CS_OwningPathNameCS() {
		return (EReference)pathElement2CSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedTypeRef2CS() {
		return typedTypeRef2CSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedTypeRef2CS_OwnedPathName() {
		return (EReference)typedTypeRef2CSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedTypeRef2CS_OwnedBinding() {
		return (EReference)typedTypeRef2CSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedTypeRef2CS_ExtentLocation() {
		return (EAttribute)typedTypeRef2CSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelCS() {
		return topLevelCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopLevelCS_OwnedTypes() {
		return (EReference)topLevelCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQVToClassCS() {
		return qvToClassCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQVToClassCS_IsIntermediate() {
		return (EAttribute)qvToClassCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQVToImportCS() {
		return qvToImportCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQVToImportCS_OwnedUnitRef() {
		return (EReference)qvToImportCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQVToImportCS_ImportedUnitElement() {
		return (EAttribute)qvToImportCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQVToLibraryCS() {
		return qvToLibraryCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQVToOperationCS() {
		return qvToOperationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQVToOperationCS_OwnedStereotype() {
		return (EReference)qvToOperationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorOperationCS() {
		return constructorOperationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationPropertyCS() {
		return configurationPropertyCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryOperationCS() {
		return entryOperationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitPartCS() {
		return initPartCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitPartCS_InitOp() {
		return (EAttribute)initPartCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitPartCS_OwnedExp() {
		return (EReference)initPartCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelCS() {
		return metamodelCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelCS_MetamodelKind() {
		return (EAttribute)metamodelCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationBodyCS() {
		return operationBodyCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationBodyCS_OwnedContentExps() {
		return (EReference)operationBodyCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationRefCS() {
		return operationRefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationRefCS_OwnedPathName() {
		return (EReference)operationRefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypeCS() {
		return primitiveTypeCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierPropertyCS() {
		return classifierPropertyCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierPropertyCS_OwnedStereotype() {
		return (EReference)classifierPropertyCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierPropertyCS_Opposite() {
		return (EAttribute)classifierPropertyCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotypeQualifierCS() {
		return stereotypeQualifierCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStereotypeQualifierCS_Stereotypes() {
		return (EAttribute)stereotypeQualifierCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagCS() {
		return tagCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagCS_OwnedElementPath() {
		return (EReference)tagCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagCS_OwnedExpression() {
		return (EReference)tagCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionCS() {
		return exceptionCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperOperationCS() {
		return helperOperationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelperOperationCS_IsQuery() {
		return (EAttribute)helperOperationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperativeOperationCS() {
		return imperativeOperationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperationCS_OwnedScopedName() {
		return (EReference)imperativeOperationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperationCS_OwnedResults() {
		return (EReference)imperativeOperationCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeOperationCS_OwnedBody() {
		return (EReference)imperativeOperationCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextualPropertyCS() {
		return contextualPropertyCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContextualPropertyCS_OwnedInitExp() {
		return (EReference)contextualPropertyCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingBodyCS() {
		return mappingBodyCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingBodyCS_OwnedInitExps() {
		return (EReference)mappingBodyCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingBodyCS_OwnedEndExps() {
		return (EReference)mappingBodyCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingBodyCS_HasPopulationKeyword() {
		return (EAttribute)mappingBodyCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingCallExpCS() {
		return mappingCallExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingCallExpCS_IsStrict() {
		return (EAttribute)mappingCallExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingOperationCS() {
		return mappingOperationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingOperationCS_Direction() {
		return (EAttribute)mappingOperationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperationCS_OwnedInheritRefs() {
		return (EReference)mappingOperationCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperationCS_OwnedDisjunctRefs() {
		return (EReference)mappingOperationCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperationCS_OwnedMergeRefs() {
		return (EReference)mappingOperationCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperationCS_OwnedRefinedRule() {
		return (EReference)mappingOperationCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperationCS_OwnedWhenExps() {
		return (EReference)mappingOperationCSEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingOperationCS_OwnedWhereExps() {
		return (EReference)mappingOperationCSEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModuleKindCS() {
		return moduleKindCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleRefCS() {
		return moduleRefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefCS_OwnedScopedName() {
		return (EReference)moduleRefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleRefCS_OwnedParameters() {
		return (EReference)moduleRefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTypeCS() {
		return modelTypeCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelTypeCS_ComplianceKind() {
		return (EAttribute)modelTypeCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTypeCS_OwnedPackageRefs() {
		return (EReference)modelTypeCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTypeCS_OwnedConditions() {
		return (EReference)modelTypeCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTypeRefCS() {
		return modelTypeRefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleCS() {
		return moduleCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleCS_OwnedParameters() {
		return (EReference)moduleCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleCS_OwnedModuleUsages() {
		return (EReference)moduleCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleCS_OwnedQualifiers() {
		return (EAttribute)moduleCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulePropertyCS() {
		return modulePropertyCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulePropertyCS_OwnedScopedName() {
		return (EReference)modulePropertyCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleUsageCS() {
		return moduleUsageCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleUsageCS_ImportKind() {
		return (EAttribute)moduleUsageCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleUsageCS_ModuleKind() {
		return (EAttribute)moduleUsageCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleUsageCS_OwnedModuleRefs() {
		return (EReference)moduleUsageCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExpCS() {
		return objectExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExpCS_OwnedVariable() {
		return (EReference)objectExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExpCS_OwnedExtentRef() {
		return (EReference)objectExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectExpCS_OwnedIterator() {
		return (EReference)objectExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDeclarationCS() {
		return parameterDeclarationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterDeclarationCS_Direction() {
		return (EAttribute)parameterDeclarationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterDeclarationCS_OwnedInitPart() {
		return (EReference)parameterDeclarationCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageRefCS() {
		return packageRefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageRefCS_OwnedScopedName() {
		return (EReference)packageRefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageRefCS_Uri() {
		return (EAttribute)packageRefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationCS() {
		return transformationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationCS_OwnedRefinedModule() {
		return (EReference)transformationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitRefCS() {
		return unitRefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitRefCS_Segment() {
		return (EAttribute)unitRefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitRefCS_TopLevelElements() {
		return (EReference)unitRefCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitRefCS_Modules() {
		return (EReference)unitRefCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitRefCS_ModelTypes() {
		return (EReference)unitRefCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitRefCS_Imports() {
		return (EReference)unitRefCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveExpCS() {
		return resolveExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExpCS_IsDeferred() {
		return (EAttribute)resolveExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveExpCS_OwnedCondition() {
		return (EReference)resolveExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolveExpCS_Name() {
		return (EAttribute)resolveExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveExpCS_OwnedTarget() {
		return (EReference)resolveExpCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveByTypeExpCS() {
		return resolveByTypeExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveByMappingExpCS() {
		return resolveByMappingExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolveByMappingExpCS_OwnedMappingRef() {
		return (EReference)resolveByMappingExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetamodelKindCS() {
		return metamodelKindCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirectionKindCS() {
		return directionKindCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImportKindCS() {
		return importKindCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQualifierKindCS() {
		return qualifierKindCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalCSFactory getQVTOperationalCSFactory() {
		return (QVTOperationalCSFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pathName2CSEClass = createEClass(PATH_NAME2_CS);
		createEReference(pathName2CSEClass, PATH_NAME2_CS__OWNED_PATH_ELEMENTS2);

		pathElement2CSEClass = createEClass(PATH_ELEMENT2_CS);
		createEAttribute(pathElement2CSEClass, PATH_ELEMENT2_CS__NAME);
		createEReference(pathElement2CSEClass, PATH_ELEMENT2_CS__OWNING_PATH_NAME_CS);

		typedTypeRef2CSEClass = createEClass(TYPED_TYPE_REF2_CS);
		createEReference(typedTypeRef2CSEClass, TYPED_TYPE_REF2_CS__OWNED_PATH_NAME);
		createEReference(typedTypeRef2CSEClass, TYPED_TYPE_REF2_CS__OWNED_BINDING);
		createEAttribute(typedTypeRef2CSEClass, TYPED_TYPE_REF2_CS__EXTENT_LOCATION);

		topLevelCSEClass = createEClass(TOP_LEVEL_CS);
		createEReference(topLevelCSEClass, TOP_LEVEL_CS__OWNED_TYPES);

		classifierPropertyCSEClass = createEClass(CLASSIFIER_PROPERTY_CS);
		createEReference(classifierPropertyCSEClass, CLASSIFIER_PROPERTY_CS__OWNED_STEREOTYPE);
		createEAttribute(classifierPropertyCSEClass, CLASSIFIER_PROPERTY_CS__OPPOSITE);

		constructorOperationCSEClass = createEClass(CONSTRUCTOR_OPERATION_CS);

		configurationPropertyCSEClass = createEClass(CONFIGURATION_PROPERTY_CS);

		contextualPropertyCSEClass = createEClass(CONTEXTUAL_PROPERTY_CS);
		createEReference(contextualPropertyCSEClass, CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP);

		entryOperationCSEClass = createEClass(ENTRY_OPERATION_CS);

		exceptionCSEClass = createEClass(EXCEPTION_CS);

		helperOperationCSEClass = createEClass(HELPER_OPERATION_CS);
		createEAttribute(helperOperationCSEClass, HELPER_OPERATION_CS__IS_QUERY);

		imperativeOperationCSEClass = createEClass(IMPERATIVE_OPERATION_CS);
		createEReference(imperativeOperationCSEClass, IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME);
		createEReference(imperativeOperationCSEClass, IMPERATIVE_OPERATION_CS__OWNED_RESULTS);
		createEReference(imperativeOperationCSEClass, IMPERATIVE_OPERATION_CS__OWNED_BODY);

		initPartCSEClass = createEClass(INIT_PART_CS);
		createEAttribute(initPartCSEClass, INIT_PART_CS__INIT_OP);
		createEReference(initPartCSEClass, INIT_PART_CS__OWNED_EXP);

		mappingBodyCSEClass = createEClass(MAPPING_BODY_CS);
		createEReference(mappingBodyCSEClass, MAPPING_BODY_CS__OWNED_INIT_EXPS);
		createEReference(mappingBodyCSEClass, MAPPING_BODY_CS__OWNED_END_EXPS);
		createEAttribute(mappingBodyCSEClass, MAPPING_BODY_CS__HAS_POPULATION_KEYWORD);

		mappingCallExpCSEClass = createEClass(MAPPING_CALL_EXP_CS);
		createEAttribute(mappingCallExpCSEClass, MAPPING_CALL_EXP_CS__IS_STRICT);

		mappingOperationCSEClass = createEClass(MAPPING_OPERATION_CS);
		createEAttribute(mappingOperationCSEClass, MAPPING_OPERATION_CS__DIRECTION);
		createEReference(mappingOperationCSEClass, MAPPING_OPERATION_CS__OWNED_INHERIT_REFS);
		createEReference(mappingOperationCSEClass, MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS);
		createEReference(mappingOperationCSEClass, MAPPING_OPERATION_CS__OWNED_MERGE_REFS);
		createEReference(mappingOperationCSEClass, MAPPING_OPERATION_CS__OWNED_REFINED_RULE);
		createEReference(mappingOperationCSEClass, MAPPING_OPERATION_CS__OWNED_WHEN_EXPS);
		createEReference(mappingOperationCSEClass, MAPPING_OPERATION_CS__OWNED_WHERE_EXPS);

		metamodelCSEClass = createEClass(METAMODEL_CS);
		createEAttribute(metamodelCSEClass, METAMODEL_CS__METAMODEL_KIND);

		modelTypeCSEClass = createEClass(MODEL_TYPE_CS);
		createEAttribute(modelTypeCSEClass, MODEL_TYPE_CS__COMPLIANCE_KIND);
		createEReference(modelTypeCSEClass, MODEL_TYPE_CS__OWNED_PACKAGE_REFS);
		createEReference(modelTypeCSEClass, MODEL_TYPE_CS__OWNED_CONDITIONS);

		modelTypeRefCSEClass = createEClass(MODEL_TYPE_REF_CS);

		moduleCSEClass = createEClass(MODULE_CS);
		createEReference(moduleCSEClass, MODULE_CS__OWNED_PARAMETERS);
		createEReference(moduleCSEClass, MODULE_CS__OWNED_MODULE_USAGES);
		createEAttribute(moduleCSEClass, MODULE_CS__OWNED_QUALIFIERS);

		modulePropertyCSEClass = createEClass(MODULE_PROPERTY_CS);
		createEReference(modulePropertyCSEClass, MODULE_PROPERTY_CS__OWNED_SCOPED_NAME);

		moduleRefCSEClass = createEClass(MODULE_REF_CS);
		createEReference(moduleRefCSEClass, MODULE_REF_CS__OWNED_SCOPED_NAME);
		createEReference(moduleRefCSEClass, MODULE_REF_CS__OWNED_PARAMETERS);

		moduleUsageCSEClass = createEClass(MODULE_USAGE_CS);
		createEAttribute(moduleUsageCSEClass, MODULE_USAGE_CS__IMPORT_KIND);
		createEAttribute(moduleUsageCSEClass, MODULE_USAGE_CS__MODULE_KIND);
		createEReference(moduleUsageCSEClass, MODULE_USAGE_CS__OWNED_MODULE_REFS);

		objectExpCSEClass = createEClass(OBJECT_EXP_CS);
		createEReference(objectExpCSEClass, OBJECT_EXP_CS__OWNED_VARIABLE);
		createEReference(objectExpCSEClass, OBJECT_EXP_CS__OWNED_EXTENT_REF);
		createEReference(objectExpCSEClass, OBJECT_EXP_CS__OWNED_ITERATOR);

		operationBodyCSEClass = createEClass(OPERATION_BODY_CS);
		createEReference(operationBodyCSEClass, OPERATION_BODY_CS__OWNED_CONTENT_EXPS);

		operationRefCSEClass = createEClass(OPERATION_REF_CS);
		createEReference(operationRefCSEClass, OPERATION_REF_CS__OWNED_PATH_NAME);

		packageRefCSEClass = createEClass(PACKAGE_REF_CS);
		createEReference(packageRefCSEClass, PACKAGE_REF_CS__OWNED_SCOPED_NAME);
		createEAttribute(packageRefCSEClass, PACKAGE_REF_CS__URI);

		parameterDeclarationCSEClass = createEClass(PARAMETER_DECLARATION_CS);
		createEAttribute(parameterDeclarationCSEClass, PARAMETER_DECLARATION_CS__DIRECTION);
		createEReference(parameterDeclarationCSEClass, PARAMETER_DECLARATION_CS__OWNED_INIT_PART);

		primitiveTypeCSEClass = createEClass(PRIMITIVE_TYPE_CS);

		qvToClassCSEClass = createEClass(QV_TO_CLASS_CS);
		createEAttribute(qvToClassCSEClass, QV_TO_CLASS_CS__IS_INTERMEDIATE);

		qvToImportCSEClass = createEClass(QV_TO_IMPORT_CS);
		createEReference(qvToImportCSEClass, QV_TO_IMPORT_CS__OWNED_UNIT_REF);
		createEAttribute(qvToImportCSEClass, QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT);

		qvToLibraryCSEClass = createEClass(QV_TO_LIBRARY_CS);

		qvToOperationCSEClass = createEClass(QV_TO_OPERATION_CS);
		createEReference(qvToOperationCSEClass, QV_TO_OPERATION_CS__OWNED_STEREOTYPE);

		resolveExpCSEClass = createEClass(RESOLVE_EXP_CS);
		createEAttribute(resolveExpCSEClass, RESOLVE_EXP_CS__IS_DEFERRED);
		createEReference(resolveExpCSEClass, RESOLVE_EXP_CS__OWNED_CONDITION);
		createEAttribute(resolveExpCSEClass, RESOLVE_EXP_CS__NAME);
		createEReference(resolveExpCSEClass, RESOLVE_EXP_CS__OWNED_TARGET);

		resolveByTypeExpCSEClass = createEClass(RESOLVE_BY_TYPE_EXP_CS);

		resolveByMappingExpCSEClass = createEClass(RESOLVE_BY_MAPPING_EXP_CS);
		createEReference(resolveByMappingExpCSEClass, RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF);

		stereotypeQualifierCSEClass = createEClass(STEREOTYPE_QUALIFIER_CS);
		createEAttribute(stereotypeQualifierCSEClass, STEREOTYPE_QUALIFIER_CS__STEREOTYPES);

		tagCSEClass = createEClass(TAG_CS);
		createEReference(tagCSEClass, TAG_CS__OWNED_ELEMENT_PATH);
		createEReference(tagCSEClass, TAG_CS__OWNED_EXPRESSION);

		transformationCSEClass = createEClass(TRANSFORMATION_CS);
		createEReference(transformationCSEClass, TRANSFORMATION_CS__OWNED_REFINED_MODULE);

		unitRefCSEClass = createEClass(UNIT_REF_CS);
		createEAttribute(unitRefCSEClass, UNIT_REF_CS__SEGMENT);
		createEReference(unitRefCSEClass, UNIT_REF_CS__TOP_LEVEL_ELEMENTS);
		createEReference(unitRefCSEClass, UNIT_REF_CS__MODULES);
		createEReference(unitRefCSEClass, UNIT_REF_CS__MODEL_TYPES);
		createEReference(unitRefCSEClass, UNIT_REF_CS__IMPORTS);

		// Create enums
		directionKindCSEEnum = createEEnum(DIRECTION_KIND_CS);
		importKindCSEEnum = createEEnum(IMPORT_KIND_CS);
		metamodelKindCSEEnum = createEEnum(METAMODEL_KIND_CS);
		moduleKindCSEEnum = createEEnum(MODULE_KIND_CS);
		qualifierKindCSEEnum = createEEnum(QUALIFIER_KIND_CS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSPackage.eNS_URI);
		ImperativeOCLCSPackage theImperativeOCLCSPackage = (ImperativeOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(ImperativeOCLCSPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pathName2CSEClass.getESuperTypes().add(theBaseCSPackage.getPivotableElementCS());
		pathElement2CSEClass.getESuperTypes().add(theBaseCSPackage.getPivotableElementCS());
		typedTypeRef2CSEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		topLevelCSEClass.getESuperTypes().add(theBaseCSPackage.getRootPackageCS());
		classifierPropertyCSEClass.getESuperTypes().add(theBaseCSPackage.getStructuralFeatureCS());
		constructorOperationCSEClass.getESuperTypes().add(this.getImperativeOperationCS());
		configurationPropertyCSEClass.getESuperTypes().add(this.getModulePropertyCS());
		contextualPropertyCSEClass.getESuperTypes().add(this.getModulePropertyCS());
		entryOperationCSEClass.getESuperTypes().add(this.getImperativeOperationCS());
		exceptionCSEClass.getESuperTypes().add(theBaseCSPackage.getClassCS());
		helperOperationCSEClass.getESuperTypes().add(this.getImperativeOperationCS());
		imperativeOperationCSEClass.getESuperTypes().add(theBaseCSPackage.getOperationCS());
		initPartCSEClass.getESuperTypes().add(theBaseCSPackage.getElementCS());
		mappingBodyCSEClass.getESuperTypes().add(this.getOperationBodyCS());
		mappingCallExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getNameExpCS());
		mappingOperationCSEClass.getESuperTypes().add(this.getImperativeOperationCS());
		metamodelCSEClass.getESuperTypes().add(theBaseCSPackage.getPackageCS());
		modelTypeCSEClass.getESuperTypes().add(theBaseCSPackage.getClassCS());
		modelTypeRefCSEClass.getESuperTypes().add(theBaseCSPackage.getParameterCS());
		moduleCSEClass.getESuperTypes().add(theBaseCSPackage.getStructuredClassCS());
		modulePropertyCSEClass.getESuperTypes().add(theBaseCSPackage.getStructuralFeatureCS());
		moduleRefCSEClass.getESuperTypes().add(theBaseCSPackage.getElementRefCS());
		moduleUsageCSEClass.getESuperTypes().add(theBaseCSPackage.getElementCS());
		objectExpCSEClass.getESuperTypes().add(theImperativeOCLCSPackage.getExpressionBlockCS());
		operationBodyCSEClass.getESuperTypes().add(theBaseCSPackage.getPivotableElementCS());
		operationRefCSEClass.getESuperTypes().add(theBaseCSPackage.getElementRefCS());
		packageRefCSEClass.getESuperTypes().add(theBaseCSPackage.getElementCS());
		parameterDeclarationCSEClass.getESuperTypes().add(theBaseCSPackage.getParameterCS());
		primitiveTypeCSEClass.getESuperTypes().add(theBaseCSPackage.getDataTypeCS());
		qvToClassCSEClass.getESuperTypes().add(theBaseCSPackage.getStructuredClassCS());
		qvToImportCSEClass.getESuperTypes().add(theBaseCSPackage.getImportCS());
		qvToLibraryCSEClass.getESuperTypes().add(this.getModuleCS());
		qvToOperationCSEClass.getESuperTypes().add(theBaseCSPackage.getOperationCS());
		resolveExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getCallExpCS());
		resolveByTypeExpCSEClass.getESuperTypes().add(this.getResolveExpCS());
		resolveByMappingExpCSEClass.getESuperTypes().add(this.getResolveExpCS());
		stereotypeQualifierCSEClass.getESuperTypes().add(theBaseCSPackage.getElementCS());
		tagCSEClass.getESuperTypes().add(theBaseCSPackage.getAnnotationCS());
		transformationCSEClass.getESuperTypes().add(this.getModuleCS());
		unitRefCSEClass.getESuperTypes().add(theBaseCSPackage.getElementCS());

		// Initialize classes and features; add operations and parameters
		initEClass(pathName2CSEClass, PathName2CS.class, "PathName2CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathName2CS_OwnedPathElements2(), this.getPathElement2CS(), null, "ownedPathElements2", null, 0, -1, PathName2CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathElement2CSEClass, PathElement2CS.class, "PathElement2CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathElement2CS_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PathElement2CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathElement2CS_OwningPathNameCS(), this.getPathName2CS(), null, "owningPathNameCS", null, 0, 1, PathElement2CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedTypeRef2CSEClass, TypedTypeRef2CS.class, "TypedTypeRef2CS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedTypeRef2CS_OwnedPathName(), this.getPathName2CS(), null, "ownedPathName", null, 0, 1, TypedTypeRef2CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypedTypeRef2CS_OwnedBinding(), theBaseCSPackage.getTemplateBindingCS(), null, "ownedBinding", null, 0, 1, TypedTypeRef2CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedTypeRef2CS_ExtentLocation(), ecorePackage.getEString(), "extentLocation", null, 0, 1, TypedTypeRef2CS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topLevelCSEClass, TopLevelCS.class, "TopLevelCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopLevelCS_OwnedTypes(), theBaseCSPackage.getTypeCS(), null, "ownedTypes", null, 0, -1, TopLevelCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifierPropertyCSEClass, ClassifierPropertyCS.class, "ClassifierPropertyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifierPropertyCS_OwnedStereotype(), this.getStereotypeQualifierCS(), null, "ownedStereotype", null, 0, 1, ClassifierPropertyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassifierPropertyCS_Opposite(), ecorePackage.getEString(), "opposite", null, 0, 1, ClassifierPropertyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorOperationCSEClass, ConstructorOperationCS.class, "ConstructorOperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationPropertyCSEClass, ConfigurationPropertyCS.class, "ConfigurationPropertyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualPropertyCSEClass, ContextualPropertyCS.class, "ContextualPropertyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextualPropertyCS_OwnedInitExp(), theEssentialOCLCSPackage.getExpCS(), null, "ownedInitExp", null, 0, 1, ContextualPropertyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryOperationCSEClass, EntryOperationCS.class, "EntryOperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionCSEClass, ExceptionCS.class, "ExceptionCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helperOperationCSEClass, HelperOperationCS.class, "HelperOperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHelperOperationCS_IsQuery(), ecorePackage.getEBooleanObject(), "isQuery", null, 0, 1, HelperOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imperativeOperationCSEClass, ImperativeOperationCS.class, "ImperativeOperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImperativeOperationCS_OwnedScopedName(), this.getPathName2CS(), null, "ownedScopedName", null, 0, 1, ImperativeOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeOperationCS_OwnedResults(), this.getParameterDeclarationCS(), null, "ownedResults", null, 0, -1, ImperativeOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeOperationCS_OwnedBody(), this.getOperationBodyCS(), null, "ownedBody", null, 0, 1, ImperativeOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initPartCSEClass, InitPartCS.class, "InitPartCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitPartCS_InitOp(), theImperativeOCLCSPackage.getInitOpCS(), "initOp", null, 0, 1, InitPartCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitPartCS_OwnedExp(), theEssentialOCLCSPackage.getExpCS(), null, "ownedExp", null, 0, 1, InitPartCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingBodyCSEClass, MappingBodyCS.class, "MappingBodyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingBodyCS_OwnedInitExps(), theEssentialOCLCSPackage.getExpCS(), null, "ownedInitExps", null, 0, -1, MappingBodyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingBodyCS_OwnedEndExps(), theEssentialOCLCSPackage.getExpCS(), null, "ownedEndExps", null, 0, -1, MappingBodyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingBodyCS_HasPopulationKeyword(), ecorePackage.getEBoolean(), "hasPopulationKeyword", null, 0, 1, MappingBodyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingCallExpCSEClass, MappingCallExpCS.class, "MappingCallExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingCallExpCS_IsStrict(), ecorePackage.getEBoolean(), "isStrict", null, 0, 1, MappingCallExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingOperationCSEClass, MappingOperationCS.class, "MappingOperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingOperationCS_Direction(), this.getDirectionKindCS(), "direction", null, 0, 1, MappingOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperationCS_OwnedInheritRefs(), this.getOperationRefCS(), null, "ownedInheritRefs", null, 0, -1, MappingOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperationCS_OwnedDisjunctRefs(), this.getOperationRefCS(), null, "ownedDisjunctRefs", null, 0, -1, MappingOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperationCS_OwnedMergeRefs(), this.getOperationRefCS(), null, "ownedMergeRefs", null, 0, -1, MappingOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperationCS_OwnedRefinedRule(), this.getPathName2CS(), null, "ownedRefinedRule", null, 0, 1, MappingOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperationCS_OwnedWhenExps(), theEssentialOCLCSPackage.getExpCS(), null, "ownedWhenExps", null, 0, -1, MappingOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappingOperationCS_OwnedWhereExps(), theEssentialOCLCSPackage.getExpCS(), null, "ownedWhereExps", null, 0, -1, MappingOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelCSEClass, MetamodelCS.class, "MetamodelCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelCS_MetamodelKind(), this.getMetamodelKindCS(), "metamodelKind", null, 0, 1, MetamodelCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeCSEClass, ModelTypeCS.class, "ModelTypeCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelTypeCS_ComplianceKind(), theEcorePackage.getEString(), "complianceKind", "strict", 0, 1, ModelTypeCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelTypeCS_OwnedPackageRefs(), this.getPackageRefCS(), null, "ownedPackageRefs", null, 1, -1, ModelTypeCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelTypeCS_OwnedConditions(), theEssentialOCLCSPackage.getExpCS(), null, "ownedConditions", null, 0, -1, ModelTypeCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeRefCSEClass, ModelTypeRefCS.class, "ModelTypeRefCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleCSEClass, ModuleCS.class, "ModuleCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleCS_OwnedParameters(), theBaseCSPackage.getParameterCS(), null, "ownedParameters", null, 0, -1, ModuleCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleCS_OwnedModuleUsages(), this.getModuleUsageCS(), null, "ownedModuleUsages", null, 0, -1, ModuleCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleCS_OwnedQualifiers(), theEcorePackage.getEString(), "ownedQualifiers", null, 0, -1, ModuleCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modulePropertyCSEClass, ModulePropertyCS.class, "ModulePropertyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModulePropertyCS_OwnedScopedName(), this.getPathName2CS(), null, "ownedScopedName", null, 1, 1, ModulePropertyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleRefCSEClass, ModuleRefCS.class, "ModuleRefCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleRefCS_OwnedScopedName(), this.getPathName2CS(), null, "ownedScopedName", null, 1, 1, ModuleRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleRefCS_OwnedParameters(), this.getParameterDeclarationCS(), null, "ownedParameters", null, 0, -1, ModuleRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleUsageCSEClass, ModuleUsageCS.class, "ModuleUsageCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleUsageCS_ImportKind(), this.getImportKindCS(), "importKind", null, 0, 1, ModuleUsageCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModuleUsageCS_ModuleKind(), this.getModuleKindCS(), "moduleKind", null, 0, 1, ModuleUsageCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleUsageCS_OwnedModuleRefs(), this.getModuleRefCS(), null, "ownedModuleRefs", null, 1, -1, ModuleUsageCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectExpCSEClass, ObjectExpCS.class, "ObjectExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectExpCS_OwnedVariable(), theEssentialOCLCSPackage.getVariableCS(), null, "ownedVariable", null, 0, 1, ObjectExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectExpCS_OwnedExtentRef(), theImperativeOCLCSPackage.getExtentRefCS(), null, "ownedExtentRef", null, 0, 1, ObjectExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectExpCS_OwnedIterator(), theEssentialOCLCSPackage.getVariableCS(), null, "ownedIterator", null, 0, 1, ObjectExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationBodyCSEClass, OperationBodyCS.class, "OperationBodyCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationBodyCS_OwnedContentExps(), theEssentialOCLCSPackage.getExpCS(), null, "ownedContentExps", null, 0, -1, OperationBodyCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationRefCSEClass, OperationRefCS.class, "OperationRefCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationRefCS_OwnedPathName(), this.getPathName2CS(), null, "ownedPathName", null, 1, 1, OperationRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageRefCSEClass, PackageRefCS.class, "PackageRefCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageRefCS_OwnedScopedName(), this.getPathName2CS(), null, "ownedScopedName", null, 0, 1, PackageRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackageRefCS_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, PackageRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDeclarationCSEClass, ParameterDeclarationCS.class, "ParameterDeclarationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDeclarationCS_Direction(), this.getDirectionKindCS(), "direction", null, 0, 1, ParameterDeclarationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDeclarationCS_OwnedInitPart(), this.getInitPartCS(), null, "ownedInitPart", null, 0, 1, ParameterDeclarationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeCSEClass, PrimitiveTypeCS.class, "PrimitiveTypeCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qvToClassCSEClass, QVToClassCS.class, "QVToClassCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQVToClassCS_IsIntermediate(), ecorePackage.getEBoolean(), "isIntermediate", null, 1, 1, QVToClassCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qvToImportCSEClass, QVToImportCS.class, "QVToImportCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQVToImportCS_OwnedUnitRef(), this.getUnitRefCS(), null, "ownedUnitRef", null, 0, 1, QVToImportCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQVToImportCS_ImportedUnitElement(), ecorePackage.getEString(), "importedUnitElement", null, 0, -1, QVToImportCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qvToLibraryCSEClass, QVToLibraryCS.class, "QVToLibraryCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qvToOperationCSEClass, QVToOperationCS.class, "QVToOperationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQVToOperationCS_OwnedStereotype(), this.getStereotypeQualifierCS(), null, "ownedStereotype", null, 0, 1, QVToOperationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveExpCSEClass, ResolveExpCS.class, "ResolveExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolveExpCS_IsDeferred(), ecorePackage.getEBooleanObject(), "isDeferred", null, 1, 1, ResolveExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolveExpCS_OwnedCondition(), theEssentialOCLCSPackage.getExpCS(), null, "ownedCondition", null, 0, 1, ResolveExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolveExpCS_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ResolveExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolveExpCS_OwnedTarget(), theEssentialOCLCSPackage.getVariableCS(), null, "ownedTarget", null, 1, 1, ResolveExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolveByTypeExpCSEClass, ResolveByTypeExpCS.class, "ResolveByTypeExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resolveByMappingExpCSEClass, ResolveByMappingExpCS.class, "ResolveByMappingExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolveByMappingExpCS_OwnedMappingRef(), this.getOperationRefCS(), null, "ownedMappingRef", null, 1, 1, ResolveByMappingExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stereotypeQualifierCSEClass, StereotypeQualifierCS.class, "StereotypeQualifierCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStereotypeQualifierCS_Stereotypes(), ecorePackage.getEString(), "stereotypes", null, 0, -1, StereotypeQualifierCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagCSEClass, TagCS.class, "TagCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTagCS_OwnedElementPath(), this.getPathName2CS(), null, "ownedElementPath", null, 1, 1, TagCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagCS_OwnedExpression(), theEssentialOCLCSPackage.getExpCS(), null, "ownedExpression", null, 0, 1, TagCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationCSEClass, TransformationCS.class, "TransformationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationCS_OwnedRefinedModule(), this.getModuleRefCS(), null, "ownedRefinedModule", null, 0, 1, TransformationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitRefCSEClass, UnitRefCS.class, "UnitRefCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitRefCS_Segment(), ecorePackage.getEString(), "segment", null, 0, -1, UnitRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitRefCS_TopLevelElements(), theBaseCSPackage.getElementCS(), null, "topLevelElements", null, 0, -1, UnitRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnitRefCS_Modules(), this.getModuleCS(), null, "modules", null, 0, -1, UnitRefCS.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitRefCS_ModelTypes(), this.getModelTypeCS(), null, "modelTypes", null, 0, -1, UnitRefCS.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnitRefCS_Imports(), this.getQVToImportCS(), null, "imports", null, 0, -1, UnitRefCS.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionKindCSEEnum, DirectionKindCS.class, "DirectionKindCS");
		addEEnumLiteral(directionKindCSEEnum, DirectionKindCS.IN);
		addEEnumLiteral(directionKindCSEEnum, DirectionKindCS.OUT);
		addEEnumLiteral(directionKindCSEEnum, DirectionKindCS.INOUT);

		initEEnum(importKindCSEEnum, ImportKindCS.class, "ImportKindCS");
		addEEnumLiteral(importKindCSEEnum, ImportKindCS.EXTENSION);
		addEEnumLiteral(importKindCSEEnum, ImportKindCS.ACCESS);

		initEEnum(metamodelKindCSEEnum, MetamodelKindCS.class, "MetamodelKindCS");
		addEEnumLiteral(metamodelKindCSEEnum, MetamodelKindCS.METAMODEL);
		addEEnumLiteral(metamodelKindCSEEnum, MetamodelKindCS.PACKAGE);

		initEEnum(moduleKindCSEEnum, ModuleKindCS.class, "ModuleKindCS");
		addEEnumLiteral(moduleKindCSEEnum, ModuleKindCS.TRANSFORMATION);
		addEEnumLiteral(moduleKindCSEEnum, ModuleKindCS.LIBRARY);

		initEEnum(qualifierKindCSEEnum, QualifierKindCS.class, "QualifierKindCS");
		addEEnumLiteral(qualifierKindCSEEnum, QualifierKindCS.ABSTRACT);
		addEEnumLiteral(qualifierKindCSEEnum, QualifierKindCS.BLACKBOX);
		addEEnumLiteral(qualifierKindCSEEnum, QualifierKindCS.STATIC);

		// Create resource
		createResource(eNS_URI);
	}

} //QVTOperationalCSPackageImpl
