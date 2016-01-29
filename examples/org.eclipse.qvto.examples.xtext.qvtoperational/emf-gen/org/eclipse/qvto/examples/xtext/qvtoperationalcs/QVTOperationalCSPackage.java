/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSFactory
 * @model kind="package"
 * @generated
 */
public interface QVTOperationalCSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qvtoperationalcs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qvtoperationalcs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QVTOperationalCSPackage eINSTANCE = org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathName2CSImpl <em>Path Name2 CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathName2CSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPathName2CS()
	 * @generated
	 */
	int PATH_NAME2_CS = 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NAME2_CS__CSI = BaseCSPackage.PIVOTABLE_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NAME2_CS__PARENT = BaseCSPackage.PIVOTABLE_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NAME2_CS__PIVOT = BaseCSPackage.PIVOTABLE_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Path Elements2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NAME2_CS__OWNED_PATH_ELEMENTS2 = BaseCSPackage.PIVOTABLE_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Name2 CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_NAME2_CS_FEATURE_COUNT = BaseCSPackage.PIVOTABLE_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathElement2CSImpl <em>Path Element2 CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathElement2CSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPathElement2CS()
	 * @generated
	 */
	int PATH_ELEMENT2_CS = 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT2_CS__CSI = BaseCSPackage.PIVOTABLE_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT2_CS__PARENT = BaseCSPackage.PIVOTABLE_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT2_CS__PIVOT = BaseCSPackage.PIVOTABLE_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT2_CS__NAME = BaseCSPackage.PIVOTABLE_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Path Name CS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT2_CS__OWNING_PATH_NAME_CS = BaseCSPackage.PIVOTABLE_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Element2 CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_ELEMENT2_CS_FEATURE_COUNT = BaseCSPackage.PIVOTABLE_ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TypedTypeRef2CSImpl <em>Typed Type Ref2 CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TypedTypeRef2CSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTypedTypeRef2CS()
	 * @generated
	 */
	int TYPED_TYPE_REF2_CS = 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS__CSI = BaseCSPackage.TYPED_REF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS__PARENT = BaseCSPackage.TYPED_REF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS__PIVOT = BaseCSPackage.TYPED_REF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS__OWNED_MULTIPLICITY = BaseCSPackage.TYPED_REF_CS__OWNED_MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS__OWNED_PATH_NAME = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS__OWNED_BINDING = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extent Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS__EXTENT_LOCATION = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Typed Type Ref2 CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_TYPE_REF2_CS_FEATURE_COUNT = BaseCSPackage.TYPED_REF_CS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TopLevelCSImpl <em>Top Level CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TopLevelCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTopLevelCS()
	 * @generated
	 */
	int TOP_LEVEL_CS = 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__CSI = BaseCSPackage.ROOT_PACKAGE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__PARENT = BaseCSPackage.ROOT_PACKAGE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__PIVOT = BaseCSPackage.ROOT_PACKAGE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__ORIGINAL_XMI_ID = BaseCSPackage.ROOT_PACKAGE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__OWNED_ANNOTATIONS = BaseCSPackage.ROOT_PACKAGE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__OWNED_PACKAGES = BaseCSPackage.ROOT_PACKAGE_CS__OWNED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Owned Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__OWNED_IMPORTS = BaseCSPackage.ROOT_PACKAGE_CS__OWNED_IMPORTS;

	/**
	 * The feature id for the '<em><b>Owned Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS__OWNED_TYPES = BaseCSPackage.ROOT_PACKAGE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Level CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CS_FEATURE_COUNT = BaseCSPackage.ROOT_PACKAGE_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToClassCSImpl <em>QV To Class CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToClassCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToClassCS()
	 * @generated
	 */
	int QV_TO_CLASS_CS = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToImportCSImpl <em>QV To Import CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToImportCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToImportCS()
	 * @generated
	 */
	int QV_TO_IMPORT_CS = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleCSImpl <em>Module CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleCS()
	 * @generated
	 */
	int MODULE_CS = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToLibraryCSImpl <em>QV To Library CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToLibraryCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToLibraryCS()
	 * @generated
	 */
	int QV_TO_LIBRARY_CS = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToOperationCSImpl <em>QV To Operation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToOperationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToOperationCS()
	 * @generated
	 */
	int QV_TO_OPERATION_CS = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ImperativeOperationCSImpl <em>Imperative Operation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ImperativeOperationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getImperativeOperationCS()
	 * @generated
	 */
	int IMPERATIVE_OPERATION_CS = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConstructorOperationCSImpl <em>Constructor Operation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConstructorOperationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getConstructorOperationCS()
	 * @generated
	 */
	int CONSTRUCTOR_OPERATION_CS = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.EntryOperationCSImpl <em>Entry Operation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.EntryOperationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getEntryOperationCS()
	 * @generated
	 */
	int ENTRY_OPERATION_CS = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.InitPartCSImpl <em>Init Part CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.InitPartCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getInitPartCS()
	 * @generated
	 */
	int INIT_PART_CS = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MetamodelCSImpl <em>Metamodel CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MetamodelCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMetamodelCS()
	 * @generated
	 */
	int METAMODEL_CS = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationRefCSImpl <em>Operation Ref CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationRefCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getOperationRefCS()
	 * @generated
	 */
	int OPERATION_REF_CS = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationBodyCSImpl <em>Operation Body CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationBodyCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getOperationBodyCS()
	 * @generated
	 */
	int OPERATION_BODY_CS = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PrimitiveTypeCSImpl <em>Primitive Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PrimitiveTypeCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPrimitiveTypeCS()
	 * @generated
	 */
	int PRIMITIVE_TYPE_CS = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ClassifierPropertyCSImpl <em>Classifier Property CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ClassifierPropertyCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getClassifierPropertyCS()
	 * @generated
	 */
	int CLASSIFIER_PROPERTY_CS = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.StereotypeQualifierCSImpl <em>Stereotype Qualifier CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.StereotypeQualifierCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getStereotypeQualifierCS()
	 * @generated
	 */
	int STEREOTYPE_QUALIFIER_CS = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TagCSImpl <em>Tag CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TagCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTagCS()
	 * @generated
	 */
	int TAG_CS = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ExceptionCSImpl <em>Exception CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ExceptionCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getExceptionCS()
	 * @generated
	 */
	int EXCEPTION_CS = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.HelperOperationCSImpl <em>Helper Operation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.HelperOperationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getHelperOperationCS()
	 * @generated
	 */
	int HELPER_OPERATION_CS = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModulePropertyCSImpl <em>Module Property CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModulePropertyCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModulePropertyCS()
	 * @generated
	 */
	int MODULE_PROPERTY_CS = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConfigurationPropertyCSImpl <em>Configuration Property CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConfigurationPropertyCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getConfigurationPropertyCS()
	 * @generated
	 */
	int CONFIGURATION_PROPERTY_CS = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ContextualPropertyCSImpl <em>Contextual Property CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ContextualPropertyCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getContextualPropertyCS()
	 * @generated
	 */
	int CONTEXTUAL_PROPERTY_CS = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingBodyCSImpl <em>Mapping Body CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingBodyCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMappingBodyCS()
	 * @generated
	 */
	int MAPPING_BODY_CS = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingCallExpCSImpl <em>Mapping Call Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingCallExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMappingCallExpCS()
	 * @generated
	 */
	int MAPPING_CALL_EXP_CS = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl <em>Mapping Operation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMappingOperationCS()
	 * @generated
	 */
	int MAPPING_OPERATION_CS = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS <em>Module Kind CS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleKindCS()
	 * @generated
	 */
	int MODULE_KIND_CS = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleRefCSImpl <em>Module Ref CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleRefCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleRefCS()
	 * @generated
	 */
	int MODULE_REF_CS = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeCSImpl <em>Model Type CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModelTypeCS()
	 * @generated
	 */
	int MODEL_TYPE_CS = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeRefCSImpl <em>Model Type Ref CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeRefCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModelTypeRefCS()
	 * @generated
	 */
	int MODEL_TYPE_REF_CS = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleUsageCSImpl <em>Module Usage CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleUsageCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleUsageCS()
	 * @generated
	 */
	int MODULE_USAGE_CS = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ObjectExpCSImpl <em>Object Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ObjectExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getObjectExpCS()
	 * @generated
	 */
	int OBJECT_EXP_CS = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ParameterDeclarationCSImpl <em>Parameter Declaration CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ParameterDeclarationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getParameterDeclarationCS()
	 * @generated
	 */
	int PARAMETER_DECLARATION_CS = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PackageRefCSImpl <em>Package Ref CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PackageRefCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPackageRefCS()
	 * @generated
	 */
	int PACKAGE_REF_CS = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl <em>Transformation CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTransformationCS()
	 * @generated
	 */
	int TRANSFORMATION_CS = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl <em>Resolve Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getResolveExpCS()
	 * @generated
	 */
	int RESOLVE_EXP_CS = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByTypeExpCSImpl <em>Resolve By Type Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByTypeExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getResolveByTypeExpCS()
	 * @generated
	 */
	int RESOLVE_BY_TYPE_EXP_CS = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByMappingExpCSImpl <em>Resolve By Mapping Exp CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByMappingExpCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getResolveByMappingExpCS()
	 * @generated
	 */
	int RESOLVE_BY_MAPPING_EXP_CS = 35;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__CSI = BaseCSPackage.STRUCTURAL_FEATURE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__PARENT = BaseCSPackage.STRUCTURAL_FEATURE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__PIVOT = BaseCSPackage.STRUCTURAL_FEATURE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__ORIGINAL_XMI_ID = BaseCSPackage.STRUCTURAL_FEATURE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__OWNED_ANNOTATIONS = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__NAME = BaseCSPackage.STRUCTURAL_FEATURE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__IS_OPTIONAL = BaseCSPackage.STRUCTURAL_FEATURE_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__OWNED_TYPE = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__QUALIFIERS = BaseCSPackage.STRUCTURAL_FEATURE_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__DEFAULT = BaseCSPackage.STRUCTURAL_FEATURE_CS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Owned Default Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__OWNED_DEFAULT_EXPRESSIONS = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNED_DEFAULT_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__OWNING_CLASS = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Stereotype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__OWNED_STEREOTYPE = BaseCSPackage.STRUCTURAL_FEATURE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS__OPPOSITE = BaseCSPackage.STRUCTURAL_FEATURE_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Classifier Property CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_PROPERTY_CS_FEATURE_COUNT = BaseCSPackage.STRUCTURAL_FEATURE_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__CSI = BaseCSPackage.OPERATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__PARENT = BaseCSPackage.OPERATION_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__PIVOT = BaseCSPackage.OPERATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__ORIGINAL_XMI_ID = BaseCSPackage.OPERATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_ANNOTATIONS = BaseCSPackage.OPERATION_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__NAME = BaseCSPackage.OPERATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__IS_OPTIONAL = BaseCSPackage.OPERATION_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_TYPE = BaseCSPackage.OPERATION_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__QUALIFIERS = BaseCSPackage.OPERATION_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_SIGNATURE = BaseCSPackage.OPERATION_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Body Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_BODY_EXPRESSIONS = BaseCSPackage.OPERATION_CS__OWNED_BODY_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owned Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_EXCEPTIONS = BaseCSPackage.OPERATION_CS__OWNED_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_PARAMETERS = BaseCSPackage.OPERATION_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_POSTCONDITIONS = BaseCSPackage.OPERATION_CS__OWNED_POSTCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_PRECONDITIONS = BaseCSPackage.OPERATION_CS__OWNED_PRECONDITIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNING_CLASS = BaseCSPackage.OPERATION_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME = BaseCSPackage.OPERATION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_RESULTS = BaseCSPackage.OPERATION_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS__OWNED_BODY = BaseCSPackage.OPERATION_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Imperative Operation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPERATIVE_OPERATION_CS_FEATURE_COUNT = BaseCSPackage.OPERATION_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__CSI = IMPERATIVE_OPERATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__PARENT = IMPERATIVE_OPERATION_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__PIVOT = IMPERATIVE_OPERATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__ORIGINAL_XMI_ID = IMPERATIVE_OPERATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_ANNOTATIONS = IMPERATIVE_OPERATION_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__NAME = IMPERATIVE_OPERATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__IS_OPTIONAL = IMPERATIVE_OPERATION_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_TYPE = IMPERATIVE_OPERATION_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__QUALIFIERS = IMPERATIVE_OPERATION_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_SIGNATURE = IMPERATIVE_OPERATION_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Body Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_BODY_EXPRESSIONS = IMPERATIVE_OPERATION_CS__OWNED_BODY_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owned Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_EXCEPTIONS = IMPERATIVE_OPERATION_CS__OWNED_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_PARAMETERS = IMPERATIVE_OPERATION_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_POSTCONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_POSTCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_PRECONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_PRECONDITIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNING_CLASS = IMPERATIVE_OPERATION_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_SCOPED_NAME = IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_RESULTS = IMPERATIVE_OPERATION_CS__OWNED_RESULTS;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS__OWNED_BODY = IMPERATIVE_OPERATION_CS__OWNED_BODY;

	/**
	 * The number of structural features of the '<em>Constructor Operation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_CS_FEATURE_COUNT = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__CSI = BaseCSPackage.STRUCTURAL_FEATURE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__PARENT = BaseCSPackage.STRUCTURAL_FEATURE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__PIVOT = BaseCSPackage.STRUCTURAL_FEATURE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__ORIGINAL_XMI_ID = BaseCSPackage.STRUCTURAL_FEATURE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__OWNED_ANNOTATIONS = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__NAME = BaseCSPackage.STRUCTURAL_FEATURE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__IS_OPTIONAL = BaseCSPackage.STRUCTURAL_FEATURE_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__OWNED_TYPE = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__QUALIFIERS = BaseCSPackage.STRUCTURAL_FEATURE_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__DEFAULT = BaseCSPackage.STRUCTURAL_FEATURE_CS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Owned Default Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__OWNED_DEFAULT_EXPRESSIONS = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNED_DEFAULT_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__OWNING_CLASS = BaseCSPackage.STRUCTURAL_FEATURE_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS__OWNED_SCOPED_NAME = BaseCSPackage.STRUCTURAL_FEATURE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Property CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_PROPERTY_CS_FEATURE_COUNT = BaseCSPackage.STRUCTURAL_FEATURE_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__CSI = MODULE_PROPERTY_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__PARENT = MODULE_PROPERTY_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__PIVOT = MODULE_PROPERTY_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__ORIGINAL_XMI_ID = MODULE_PROPERTY_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__OWNED_ANNOTATIONS = MODULE_PROPERTY_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__NAME = MODULE_PROPERTY_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__IS_OPTIONAL = MODULE_PROPERTY_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__OWNED_TYPE = MODULE_PROPERTY_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__QUALIFIERS = MODULE_PROPERTY_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__DEFAULT = MODULE_PROPERTY_CS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Owned Default Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__OWNED_DEFAULT_EXPRESSIONS = MODULE_PROPERTY_CS__OWNED_DEFAULT_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__OWNING_CLASS = MODULE_PROPERTY_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS__OWNED_SCOPED_NAME = MODULE_PROPERTY_CS__OWNED_SCOPED_NAME;

	/**
	 * The number of structural features of the '<em>Configuration Property CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_PROPERTY_CS_FEATURE_COUNT = MODULE_PROPERTY_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__CSI = MODULE_PROPERTY_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__PARENT = MODULE_PROPERTY_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__PIVOT = MODULE_PROPERTY_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__ORIGINAL_XMI_ID = MODULE_PROPERTY_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__OWNED_ANNOTATIONS = MODULE_PROPERTY_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__NAME = MODULE_PROPERTY_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__IS_OPTIONAL = MODULE_PROPERTY_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__OWNED_TYPE = MODULE_PROPERTY_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__QUALIFIERS = MODULE_PROPERTY_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__DEFAULT = MODULE_PROPERTY_CS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Owned Default Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__OWNED_DEFAULT_EXPRESSIONS = MODULE_PROPERTY_CS__OWNED_DEFAULT_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__OWNING_CLASS = MODULE_PROPERTY_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__OWNED_SCOPED_NAME = MODULE_PROPERTY_CS__OWNED_SCOPED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP = MODULE_PROPERTY_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contextual Property CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_PROPERTY_CS_FEATURE_COUNT = MODULE_PROPERTY_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__CSI = IMPERATIVE_OPERATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__PARENT = IMPERATIVE_OPERATION_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__PIVOT = IMPERATIVE_OPERATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__ORIGINAL_XMI_ID = IMPERATIVE_OPERATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_ANNOTATIONS = IMPERATIVE_OPERATION_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__NAME = IMPERATIVE_OPERATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__IS_OPTIONAL = IMPERATIVE_OPERATION_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_TYPE = IMPERATIVE_OPERATION_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__QUALIFIERS = IMPERATIVE_OPERATION_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_SIGNATURE = IMPERATIVE_OPERATION_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Body Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_BODY_EXPRESSIONS = IMPERATIVE_OPERATION_CS__OWNED_BODY_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owned Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_EXCEPTIONS = IMPERATIVE_OPERATION_CS__OWNED_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_PARAMETERS = IMPERATIVE_OPERATION_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_POSTCONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_POSTCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_PRECONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_PRECONDITIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNING_CLASS = IMPERATIVE_OPERATION_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_SCOPED_NAME = IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_RESULTS = IMPERATIVE_OPERATION_CS__OWNED_RESULTS;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS__OWNED_BODY = IMPERATIVE_OPERATION_CS__OWNED_BODY;

	/**
	 * The number of structural features of the '<em>Entry Operation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_CS_FEATURE_COUNT = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__CSI = BaseCSPackage.CLASS_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__PARENT = BaseCSPackage.CLASS_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__PIVOT = BaseCSPackage.CLASS_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__ORIGINAL_XMI_ID = BaseCSPackage.CLASS_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__OWNED_ANNOTATIONS = BaseCSPackage.CLASS_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__NAME = BaseCSPackage.CLASS_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__OWNED_SIGNATURE = BaseCSPackage.CLASS_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__INSTANCE_CLASS_NAME = BaseCSPackage.CLASS_CS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__OWNED_CONSTRAINTS = BaseCSPackage.CLASS_CS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS__OWNING_PACKAGE = BaseCSPackage.CLASS_CS__OWNING_PACKAGE;

	/**
	 * The number of structural features of the '<em>Exception CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_CS_FEATURE_COUNT = BaseCSPackage.CLASS_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__CSI = IMPERATIVE_OPERATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__PARENT = IMPERATIVE_OPERATION_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__PIVOT = IMPERATIVE_OPERATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__ORIGINAL_XMI_ID = IMPERATIVE_OPERATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_ANNOTATIONS = IMPERATIVE_OPERATION_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__NAME = IMPERATIVE_OPERATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__IS_OPTIONAL = IMPERATIVE_OPERATION_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_TYPE = IMPERATIVE_OPERATION_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__QUALIFIERS = IMPERATIVE_OPERATION_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_SIGNATURE = IMPERATIVE_OPERATION_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Body Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_BODY_EXPRESSIONS = IMPERATIVE_OPERATION_CS__OWNED_BODY_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owned Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_EXCEPTIONS = IMPERATIVE_OPERATION_CS__OWNED_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_PARAMETERS = IMPERATIVE_OPERATION_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_POSTCONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_POSTCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_PRECONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_PRECONDITIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNING_CLASS = IMPERATIVE_OPERATION_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_SCOPED_NAME = IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_RESULTS = IMPERATIVE_OPERATION_CS__OWNED_RESULTS;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__OWNED_BODY = IMPERATIVE_OPERATION_CS__OWNED_BODY;

	/**
	 * The feature id for the '<em><b>Is Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS__IS_QUERY = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Helper Operation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_OPERATION_CS_FEATURE_COUNT = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART_CS__CSI = BaseCSPackage.ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART_CS__PARENT = BaseCSPackage.ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Init Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART_CS__INIT_OP = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART_CS__OWNED_EXP = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Init Part CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_PART_CS_FEATURE_COUNT = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_CS__CSI = BaseCSPackage.PIVOTABLE_ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_CS__PARENT = BaseCSPackage.PIVOTABLE_ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_CS__PIVOT = BaseCSPackage.PIVOTABLE_ELEMENT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Content Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_CS__OWNED_CONTENT_EXPS = BaseCSPackage.PIVOTABLE_ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Body CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_CS_FEATURE_COUNT = BaseCSPackage.PIVOTABLE_ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS__CSI = OPERATION_BODY_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS__PARENT = OPERATION_BODY_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS__PIVOT = OPERATION_BODY_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Content Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS__OWNED_CONTENT_EXPS = OPERATION_BODY_CS__OWNED_CONTENT_EXPS;

	/**
	 * The feature id for the '<em><b>Owned Init Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS__OWNED_INIT_EXPS = OPERATION_BODY_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned End Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS__OWNED_END_EXPS = OPERATION_BODY_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Population Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS__HAS_POPULATION_KEYWORD = OPERATION_BODY_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapping Body CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_BODY_CS_FEATURE_COUNT = OPERATION_BODY_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__CSI = EssentialOCLCSPackage.NAME_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__PARENT = EssentialOCLCSPackage.NAME_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__PIVOT = EssentialOCLCSPackage.NAME_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.NAME_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.NAME_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.NAME_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.NAME_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.NAME_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.NAME_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.NAME_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.NAME_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.NAME_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__IS_PRE = EssentialOCLCSPackage.NAME_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = EssentialOCLCSPackage.NAME_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__OWNED_PATH_NAME = EssentialOCLCSPackage.NAME_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = EssentialOCLCSPackage.NAME_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = EssentialOCLCSPackage.NAME_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__SOURCE_TYPE = EssentialOCLCSPackage.NAME_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__SOURCE_TYPE_VALUE = EssentialOCLCSPackage.NAME_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__ARGUMENTS = EssentialOCLCSPackage.NAME_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__SOURCE = EssentialOCLCSPackage.NAME_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Referred Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__REFERRED_ASSOCIATION = EssentialOCLCSPackage.NAME_EXP_CS__REFERRED_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__PARTS = EssentialOCLCSPackage.NAME_EXP_CS__PARTS;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__TYPE_NAME = EssentialOCLCSPackage.NAME_EXP_CS__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__VALUE = EssentialOCLCSPackage.NAME_EXP_CS__VALUE;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__ITERATORS = EssentialOCLCSPackage.NAME_EXP_CS__ITERATORS;

	/**
	 * The feature id for the '<em><b>Referred Iteration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__REFERRED_ITERATION = EssentialOCLCSPackage.NAME_EXP_CS__REFERRED_ITERATION;

	/**
	 * The feature id for the '<em><b>Accumulators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__ACCUMULATORS = EssentialOCLCSPackage.NAME_EXP_CS__ACCUMULATORS;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__REFERRED_OPERATION = EssentialOCLCSPackage.NAME_EXP_CS__REFERRED_OPERATION;

	/**
	 * The feature id for the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__REFERRED_PROPERTY = EssentialOCLCSPackage.NAME_EXP_CS__REFERRED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__REFERRED_VARIABLE = EssentialOCLCSPackage.NAME_EXP_CS__REFERRED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS__IS_STRICT = EssentialOCLCSPackage.NAME_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapping Call Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_CALL_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.NAME_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__CSI = IMPERATIVE_OPERATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__PARENT = IMPERATIVE_OPERATION_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__PIVOT = IMPERATIVE_OPERATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__ORIGINAL_XMI_ID = IMPERATIVE_OPERATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_ANNOTATIONS = IMPERATIVE_OPERATION_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__NAME = IMPERATIVE_OPERATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__IS_OPTIONAL = IMPERATIVE_OPERATION_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_TYPE = IMPERATIVE_OPERATION_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__QUALIFIERS = IMPERATIVE_OPERATION_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_SIGNATURE = IMPERATIVE_OPERATION_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Body Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_BODY_EXPRESSIONS = IMPERATIVE_OPERATION_CS__OWNED_BODY_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owned Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_EXCEPTIONS = IMPERATIVE_OPERATION_CS__OWNED_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_PARAMETERS = IMPERATIVE_OPERATION_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_POSTCONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_POSTCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_PRECONDITIONS = IMPERATIVE_OPERATION_CS__OWNED_PRECONDITIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNING_CLASS = IMPERATIVE_OPERATION_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_SCOPED_NAME = IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_RESULTS = IMPERATIVE_OPERATION_CS__OWNED_RESULTS;

	/**
	 * The feature id for the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_BODY = IMPERATIVE_OPERATION_CS__OWNED_BODY;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__DIRECTION = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Inherit Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_INHERIT_REFS = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Disjunct Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Merge Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_MERGE_REFS = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Refined Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_REFINED_RULE = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned When Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_WHEN_EXPS = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Where Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS__OWNED_WHERE_EXPS = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Mapping Operation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_CS_FEATURE_COUNT = IMPERATIVE_OPERATION_CS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__CSI = BaseCSPackage.PACKAGE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__PARENT = BaseCSPackage.PACKAGE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__PIVOT = BaseCSPackage.PACKAGE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__ORIGINAL_XMI_ID = BaseCSPackage.PACKAGE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__OWNED_ANNOTATIONS = BaseCSPackage.PACKAGE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__OWNED_PACKAGES = BaseCSPackage.PACKAGE_CS__OWNED_PACKAGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__NAME = BaseCSPackage.PACKAGE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__NS_PREFIX = BaseCSPackage.PACKAGE_CS__NS_PREFIX;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__NS_URI = BaseCSPackage.PACKAGE_CS__NS_URI;

	/**
	 * The feature id for the '<em><b>Owned Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__OWNED_CLASSES = BaseCSPackage.PACKAGE_CS__OWNED_CLASSES;

	/**
	 * The feature id for the '<em><b>Metamodel Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS__METAMODEL_KIND = BaseCSPackage.PACKAGE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Metamodel CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_CS_FEATURE_COUNT = BaseCSPackage.PACKAGE_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__CSI = BaseCSPackage.CLASS_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__PARENT = BaseCSPackage.CLASS_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__PIVOT = BaseCSPackage.CLASS_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__ORIGINAL_XMI_ID = BaseCSPackage.CLASS_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__OWNED_ANNOTATIONS = BaseCSPackage.CLASS_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__NAME = BaseCSPackage.CLASS_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__OWNED_SIGNATURE = BaseCSPackage.CLASS_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__INSTANCE_CLASS_NAME = BaseCSPackage.CLASS_CS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__OWNED_CONSTRAINTS = BaseCSPackage.CLASS_CS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__OWNING_PACKAGE = BaseCSPackage.CLASS_CS__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Compliance Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__COMPLIANCE_KIND = BaseCSPackage.CLASS_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Package Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__OWNED_PACKAGE_REFS = BaseCSPackage.CLASS_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS__OWNED_CONDITIONS = BaseCSPackage.CLASS_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_CS_FEATURE_COUNT = BaseCSPackage.CLASS_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__CSI = BaseCSPackage.PARAMETER_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__PARENT = BaseCSPackage.PARAMETER_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__PIVOT = BaseCSPackage.PARAMETER_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__ORIGINAL_XMI_ID = BaseCSPackage.PARAMETER_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__OWNED_ANNOTATIONS = BaseCSPackage.PARAMETER_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__NAME = BaseCSPackage.PARAMETER_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__IS_OPTIONAL = BaseCSPackage.PARAMETER_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__OWNED_TYPE = BaseCSPackage.PARAMETER_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__QUALIFIERS = BaseCSPackage.PARAMETER_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS__OWNING_OPERATION = BaseCSPackage.PARAMETER_CS__OWNING_OPERATION;

	/**
	 * The number of structural features of the '<em>Model Type Ref CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_REF_CS_FEATURE_COUNT = BaseCSPackage.PARAMETER_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__CSI = BaseCSPackage.STRUCTURED_CLASS_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__PARENT = BaseCSPackage.STRUCTURED_CLASS_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__PIVOT = BaseCSPackage.STRUCTURED_CLASS_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__ORIGINAL_XMI_ID = BaseCSPackage.STRUCTURED_CLASS_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_ANNOTATIONS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__NAME = BaseCSPackage.STRUCTURED_CLASS_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_SIGNATURE = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__INSTANCE_CLASS_NAME = BaseCSPackage.STRUCTURED_CLASS_CS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_CONSTRAINTS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNING_PACKAGE = BaseCSPackage.STRUCTURED_CLASS_CS__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__IS_ABSTRACT = BaseCSPackage.STRUCTURED_CLASS_CS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__IS_INTERFACE = BaseCSPackage.STRUCTURED_CLASS_CS__IS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Owned Metaclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_METACLASS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_METACLASS;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_OPERATIONS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_PROPERTIES = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_SUPER_TYPES = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_PARAMETERS = BaseCSPackage.STRUCTURED_CLASS_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Module Usages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_MODULE_USAGES = BaseCSPackage.STRUCTURED_CLASS_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS__OWNED_QUALIFIERS = BaseCSPackage.STRUCTURED_CLASS_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_CS_FEATURE_COUNT = BaseCSPackage.STRUCTURED_CLASS_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_CS__CSI = BaseCSPackage.ELEMENT_REF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_CS__PARENT = BaseCSPackage.ELEMENT_REF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_CS__PIVOT = BaseCSPackage.ELEMENT_REF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_CS__OWNED_SCOPED_NAME = BaseCSPackage.ELEMENT_REF_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_CS__OWNED_PARAMETERS = BaseCSPackage.ELEMENT_REF_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module Ref CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_REF_CS_FEATURE_COUNT = BaseCSPackage.ELEMENT_REF_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_CS__CSI = BaseCSPackage.ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_CS__PARENT = BaseCSPackage.ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Import Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_CS__IMPORT_KIND = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_CS__MODULE_KIND = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Module Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_CS__OWNED_MODULE_REFS = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module Usage CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_USAGE_CS_FEATURE_COUNT = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__CSI = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__PARENT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__PIVOT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__ORIGINAL_XMI_ID = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__OWNED_ANNOTATIONS = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__HAS_ERROR = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__LOCAL_LEFT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__LOCAL_PARENT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__LOCAL_RIGHT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__PRECEDENCE = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Owned Exps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__OWNED_EXPS = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS__OWNED_EXPS;

	/**
	 * The feature id for the '<em><b>Owned Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__OWNED_VARIABLE = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Extent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__OWNED_EXTENT_REF = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS__OWNED_ITERATOR = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXP_CS_FEATURE_COUNT = ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_CS__CSI = BaseCSPackage.ELEMENT_REF_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_CS__PARENT = BaseCSPackage.ELEMENT_REF_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_CS__PIVOT = BaseCSPackage.ELEMENT_REF_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_CS__OWNED_PATH_NAME = BaseCSPackage.ELEMENT_REF_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Operation Ref CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_REF_CS_FEATURE_COUNT = BaseCSPackage.ELEMENT_REF_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_CS__CSI = BaseCSPackage.ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_CS__PARENT = BaseCSPackage.ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_CS__OWNED_SCOPED_NAME = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_CS__URI = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Package Ref CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_REF_CS_FEATURE_COUNT = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__CSI = BaseCSPackage.PARAMETER_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__PARENT = BaseCSPackage.PARAMETER_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__PIVOT = BaseCSPackage.PARAMETER_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__ORIGINAL_XMI_ID = BaseCSPackage.PARAMETER_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__OWNED_ANNOTATIONS = BaseCSPackage.PARAMETER_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__NAME = BaseCSPackage.PARAMETER_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__IS_OPTIONAL = BaseCSPackage.PARAMETER_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__OWNED_TYPE = BaseCSPackage.PARAMETER_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__QUALIFIERS = BaseCSPackage.PARAMETER_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__OWNING_OPERATION = BaseCSPackage.PARAMETER_CS__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__DIRECTION = BaseCSPackage.PARAMETER_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Init Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS__OWNED_INIT_PART = BaseCSPackage.PARAMETER_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Declaration CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DECLARATION_CS_FEATURE_COUNT = BaseCSPackage.PARAMETER_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__CSI = BaseCSPackage.DATA_TYPE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__PARENT = BaseCSPackage.DATA_TYPE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__PIVOT = BaseCSPackage.DATA_TYPE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__ORIGINAL_XMI_ID = BaseCSPackage.DATA_TYPE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__OWNED_ANNOTATIONS = BaseCSPackage.DATA_TYPE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__NAME = BaseCSPackage.DATA_TYPE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__OWNED_SIGNATURE = BaseCSPackage.DATA_TYPE_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__INSTANCE_CLASS_NAME = BaseCSPackage.DATA_TYPE_CS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__OWNED_CONSTRAINTS = BaseCSPackage.DATA_TYPE_CS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__OWNING_PACKAGE = BaseCSPackage.DATA_TYPE_CS__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__IS_PRIMITIVE = BaseCSPackage.DATA_TYPE_CS__IS_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Is Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS__IS_SERIALIZABLE = BaseCSPackage.DATA_TYPE_CS__IS_SERIALIZABLE;

	/**
	 * The number of structural features of the '<em>Primitive Type CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_CS_FEATURE_COUNT = BaseCSPackage.DATA_TYPE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__CSI = BaseCSPackage.STRUCTURED_CLASS_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__PARENT = BaseCSPackage.STRUCTURED_CLASS_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__PIVOT = BaseCSPackage.STRUCTURED_CLASS_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__ORIGINAL_XMI_ID = BaseCSPackage.STRUCTURED_CLASS_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNED_ANNOTATIONS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__NAME = BaseCSPackage.STRUCTURED_CLASS_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNED_SIGNATURE = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__INSTANCE_CLASS_NAME = BaseCSPackage.STRUCTURED_CLASS_CS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNED_CONSTRAINTS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNING_PACKAGE = BaseCSPackage.STRUCTURED_CLASS_CS__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__IS_ABSTRACT = BaseCSPackage.STRUCTURED_CLASS_CS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__IS_INTERFACE = BaseCSPackage.STRUCTURED_CLASS_CS__IS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Owned Metaclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNED_METACLASS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_METACLASS;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNED_OPERATIONS = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNED_PROPERTIES = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__OWNED_SUPER_TYPES = BaseCSPackage.STRUCTURED_CLASS_CS__OWNED_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Is Intermediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS__IS_INTERMEDIATE = BaseCSPackage.STRUCTURED_CLASS_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QV To Class CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_CLASS_CS_FEATURE_COUNT = BaseCSPackage.STRUCTURED_CLASS_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__CSI = BaseCSPackage.IMPORT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__PARENT = BaseCSPackage.IMPORT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__PIVOT = BaseCSPackage.IMPORT_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__ORIGINAL_XMI_ID = BaseCSPackage.IMPORT_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__OWNED_ANNOTATIONS = BaseCSPackage.IMPORT_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__NAME = BaseCSPackage.IMPORT_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__IS_ALL = BaseCSPackage.IMPORT_CS__IS_ALL;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__OWNED_PATH_NAME = BaseCSPackage.IMPORT_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Referred Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__REFERRED_NAMESPACE = BaseCSPackage.IMPORT_CS__REFERRED_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Owned Unit Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__OWNED_UNIT_REF = BaseCSPackage.IMPORT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Unit Element</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT = BaseCSPackage.IMPORT_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QV To Import CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_IMPORT_CS_FEATURE_COUNT = BaseCSPackage.IMPORT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__CSI = MODULE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__PARENT = MODULE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__PIVOT = MODULE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__ORIGINAL_XMI_ID = MODULE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_ANNOTATIONS = MODULE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__NAME = MODULE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_SIGNATURE = MODULE_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__INSTANCE_CLASS_NAME = MODULE_CS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_CONSTRAINTS = MODULE_CS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNING_PACKAGE = MODULE_CS__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__IS_ABSTRACT = MODULE_CS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__IS_INTERFACE = MODULE_CS__IS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Owned Metaclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_METACLASS = MODULE_CS__OWNED_METACLASS;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_OPERATIONS = MODULE_CS__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_PROPERTIES = MODULE_CS__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_SUPER_TYPES = MODULE_CS__OWNED_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_PARAMETERS = MODULE_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Module Usages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_MODULE_USAGES = MODULE_CS__OWNED_MODULE_USAGES;

	/**
	 * The feature id for the '<em><b>Owned Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS__OWNED_QUALIFIERS = MODULE_CS__OWNED_QUALIFIERS;

	/**
	 * The number of structural features of the '<em>QV To Library CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_LIBRARY_CS_FEATURE_COUNT = MODULE_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__CSI = BaseCSPackage.OPERATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__PARENT = BaseCSPackage.OPERATION_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__PIVOT = BaseCSPackage.OPERATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__ORIGINAL_XMI_ID = BaseCSPackage.OPERATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_ANNOTATIONS = BaseCSPackage.OPERATION_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__NAME = BaseCSPackage.OPERATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__IS_OPTIONAL = BaseCSPackage.OPERATION_CS__IS_OPTIONAL;

	/**
	 * The feature id for the '<em><b>Owned Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_TYPE = BaseCSPackage.OPERATION_CS__OWNED_TYPE;

	/**
	 * The feature id for the '<em><b>Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__QUALIFIERS = BaseCSPackage.OPERATION_CS__QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_SIGNATURE = BaseCSPackage.OPERATION_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Owned Body Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_BODY_EXPRESSIONS = BaseCSPackage.OPERATION_CS__OWNED_BODY_EXPRESSIONS;

	/**
	 * The feature id for the '<em><b>Owned Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_EXCEPTIONS = BaseCSPackage.OPERATION_CS__OWNED_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_PARAMETERS = BaseCSPackage.OPERATION_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Postconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_POSTCONDITIONS = BaseCSPackage.OPERATION_CS__OWNED_POSTCONDITIONS;

	/**
	 * The feature id for the '<em><b>Owned Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_PRECONDITIONS = BaseCSPackage.OPERATION_CS__OWNED_PRECONDITIONS;

	/**
	 * The feature id for the '<em><b>Owning Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNING_CLASS = BaseCSPackage.OPERATION_CS__OWNING_CLASS;

	/**
	 * The feature id for the '<em><b>Owned Stereotype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS__OWNED_STEREOTYPE = BaseCSPackage.OPERATION_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QV To Operation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QV_TO_OPERATION_CS_FEATURE_COUNT = BaseCSPackage.OPERATION_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__CSI = EssentialOCLCSPackage.CALL_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__PARENT = EssentialOCLCSPackage.CALL_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__PIVOT = EssentialOCLCSPackage.CALL_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__ORIGINAL_XMI_ID = EssentialOCLCSPackage.CALL_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__OWNED_ANNOTATIONS = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__HAS_ERROR = EssentialOCLCSPackage.CALL_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__LOCAL_LEFT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__LOCAL_PARENT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__LOCAL_RIGHT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = EssentialOCLCSPackage.CALL_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__PRECEDENCE = EssentialOCLCSPackage.CALL_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__IS_PRE = EssentialOCLCSPackage.CALL_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__OWNED_PATH_NAME = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = EssentialOCLCSPackage.CALL_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__SOURCE_TYPE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__SOURCE_TYPE_VALUE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__ARGUMENTS = EssentialOCLCSPackage.CALL_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__SOURCE = EssentialOCLCSPackage.CALL_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__IS_DEFERRED = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__OWNED_CONDITION = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__NAME = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS__OWNED_TARGET = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resolve Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_EXP_CS_FEATURE_COUNT = EssentialOCLCSPackage.CALL_EXP_CS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__CSI = RESOLVE_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__PARENT = RESOLVE_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__PIVOT = RESOLVE_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__ORIGINAL_XMI_ID = RESOLVE_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__OWNED_ANNOTATIONS = RESOLVE_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__HAS_ERROR = RESOLVE_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__LOCAL_LEFT = RESOLVE_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = RESOLVE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__LOCAL_PARENT = RESOLVE_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__LOCAL_RIGHT = RESOLVE_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = RESOLVE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__PRECEDENCE = RESOLVE_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__IS_PRE = RESOLVE_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = RESOLVE_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__OWNED_PATH_NAME = RESOLVE_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = RESOLVE_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = RESOLVE_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__SOURCE_TYPE = RESOLVE_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__SOURCE_TYPE_VALUE = RESOLVE_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__ARGUMENTS = RESOLVE_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__SOURCE = RESOLVE_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__IS_DEFERRED = RESOLVE_EXP_CS__IS_DEFERRED;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__OWNED_CONDITION = RESOLVE_EXP_CS__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__NAME = RESOLVE_EXP_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS__OWNED_TARGET = RESOLVE_EXP_CS__OWNED_TARGET;

	/**
	 * The number of structural features of the '<em>Resolve By Type Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_TYPE_EXP_CS_FEATURE_COUNT = RESOLVE_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__CSI = RESOLVE_EXP_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__PARENT = RESOLVE_EXP_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__PIVOT = RESOLVE_EXP_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__ORIGINAL_XMI_ID = RESOLVE_EXP_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_ANNOTATIONS = RESOLVE_EXP_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Has Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__HAS_ERROR = RESOLVE_EXP_CS__HAS_ERROR;

	/**
	 * The feature id for the '<em><b>Local Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__LOCAL_LEFT = RESOLVE_EXP_CS__LOCAL_LEFT;

	/**
	 * The feature id for the '<em><b>Local Leftmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__LOCAL_LEFTMOST_DESCENDANT = RESOLVE_EXP_CS__LOCAL_LEFTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Local Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__LOCAL_PARENT = RESOLVE_EXP_CS__LOCAL_PARENT;

	/**
	 * The feature id for the '<em><b>Local Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__LOCAL_RIGHT = RESOLVE_EXP_CS__LOCAL_RIGHT;

	/**
	 * The feature id for the '<em><b>Local Rightmost Descendant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT = RESOLVE_EXP_CS__LOCAL_RIGHTMOST_DESCENDANT;

	/**
	 * The feature id for the '<em><b>Precedence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__PRECEDENCE = RESOLVE_EXP_CS__PRECEDENCE;

	/**
	 * The feature id for the '<em><b>Is Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__IS_PRE = RESOLVE_EXP_CS__IS_PRE;

	/**
	 * The feature id for the '<em><b>Owned Curly Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE = RESOLVE_EXP_CS__OWNED_CURLY_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_PATH_NAME = RESOLVE_EXP_CS__OWNED_PATH_NAME;

	/**
	 * The feature id for the '<em><b>Owned Round Bracketed Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE = RESOLVE_EXP_CS__OWNED_ROUND_BRACKETED_CLAUSE;

	/**
	 * The feature id for the '<em><b>Owned Square Bracketed Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES = RESOLVE_EXP_CS__OWNED_SQUARE_BRACKETED_CLAUSES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__SOURCE_TYPE = RESOLVE_EXP_CS__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Source Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__SOURCE_TYPE_VALUE = RESOLVE_EXP_CS__SOURCE_TYPE_VALUE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__ARGUMENTS = RESOLVE_EXP_CS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__SOURCE = RESOLVE_EXP_CS__SOURCE;

	/**
	 * The feature id for the '<em><b>Is Deferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__IS_DEFERRED = RESOLVE_EXP_CS__IS_DEFERRED;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_CONDITION = RESOLVE_EXP_CS__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__NAME = RESOLVE_EXP_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_TARGET = RESOLVE_EXP_CS__OWNED_TARGET;

	/**
	 * The feature id for the '<em><b>Owned Mapping Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF = RESOLVE_EXP_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolve By Mapping Exp CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_BY_MAPPING_EXP_CS_FEATURE_COUNT = RESOLVE_EXP_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_QUALIFIER_CS__CSI = BaseCSPackage.ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_QUALIFIER_CS__PARENT = BaseCSPackage.ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Stereotypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_QUALIFIER_CS__STEREOTYPES = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stereotype Qualifier CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEREOTYPE_QUALIFIER_CS_FEATURE_COUNT = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__CSI = BaseCSPackage.ANNOTATION_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__PARENT = BaseCSPackage.ANNOTATION_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__PIVOT = BaseCSPackage.ANNOTATION_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__ORIGINAL_XMI_ID = BaseCSPackage.ANNOTATION_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__OWNED_ANNOTATIONS = BaseCSPackage.ANNOTATION_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__NAME = BaseCSPackage.ANNOTATION_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__OWNED_DETAILS = BaseCSPackage.ANNOTATION_CS__OWNED_DETAILS;

	/**
	 * The feature id for the '<em><b>Owned Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__OWNED_CONTENTS = BaseCSPackage.ANNOTATION_CS__OWNED_CONTENTS;

	/**
	 * The feature id for the '<em><b>Owned References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__OWNED_REFERENCES = BaseCSPackage.ANNOTATION_CS__OWNED_REFERENCES;

	/**
	 * The feature id for the '<em><b>Owned Element Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__OWNED_ELEMENT_PATH = BaseCSPackage.ANNOTATION_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS__OWNED_EXPRESSION = BaseCSPackage.ANNOTATION_CS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tag CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_CS_FEATURE_COUNT = BaseCSPackage.ANNOTATION_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__CSI = MODULE_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__PARENT = MODULE_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Pivot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__PIVOT = MODULE_CS__PIVOT;

	/**
	 * The feature id for the '<em><b>Original Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__ORIGINAL_XMI_ID = MODULE_CS__ORIGINAL_XMI_ID;

	/**
	 * The feature id for the '<em><b>Owned Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_ANNOTATIONS = MODULE_CS__OWNED_ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__NAME = MODULE_CS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_SIGNATURE = MODULE_CS__OWNED_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__INSTANCE_CLASS_NAME = MODULE_CS__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_CONSTRAINTS = MODULE_CS__OWNED_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Owning Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNING_PACKAGE = MODULE_CS__OWNING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__IS_ABSTRACT = MODULE_CS__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__IS_INTERFACE = MODULE_CS__IS_INTERFACE;

	/**
	 * The feature id for the '<em><b>Owned Metaclass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_METACLASS = MODULE_CS__OWNED_METACLASS;

	/**
	 * The feature id for the '<em><b>Owned Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_OPERATIONS = MODULE_CS__OWNED_OPERATIONS;

	/**
	 * The feature id for the '<em><b>Owned Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_PROPERTIES = MODULE_CS__OWNED_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_SUPER_TYPES = MODULE_CS__OWNED_SUPER_TYPES;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_PARAMETERS = MODULE_CS__OWNED_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Owned Module Usages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_MODULE_USAGES = MODULE_CS__OWNED_MODULE_USAGES;

	/**
	 * The feature id for the '<em><b>Owned Qualifiers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_QUALIFIERS = MODULE_CS__OWNED_QUALIFIERS;

	/**
	 * The feature id for the '<em><b>Owned Refined Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS__OWNED_REFINED_MODULE = MODULE_CS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_CS_FEATURE_COUNT = MODULE_CS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.UnitRefCSImpl <em>Unit Ref CS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.UnitRefCSImpl
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getUnitRefCS()
	 * @generated
	 */
	int UNIT_REF_CS = 39;

	/**
	 * The feature id for the '<em><b>Csi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS__CSI = BaseCSPackage.ELEMENT_CS__CSI;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS__PARENT = BaseCSPackage.ELEMENT_CS__PARENT;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS__SEGMENT = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Level Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS__TOP_LEVEL_ELEMENTS = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS__MODULES = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS__MODEL_TYPES = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS__IMPORTS = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Unit Ref CS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_REF_CS_FEATURE_COUNT = BaseCSPackage.ELEMENT_CS_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKindCS <em>Metamodel Kind CS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKindCS
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMetamodelKindCS()
	 * @generated
	 */
	int METAMODEL_KIND_CS = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS <em>Direction Kind CS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getDirectionKindCS()
	 * @generated
	 */
	int DIRECTION_KIND_CS = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS <em>Import Kind CS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getImportKindCS()
	 * @generated
	 */
	int IMPORT_KIND_CS = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QualifierKindCS <em>Qualifier Kind CS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QualifierKindCS
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQualifierKindCS()
	 * @generated
	 */
	int QUALIFIER_KIND_CS = 44;


	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS <em>Path Name2 CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Name2 CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS
	 * @generated
	 */
	EClass getPathName2CS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS#getOwnedPathElements2 <em>Owned Path Elements2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Path Elements2</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS#getOwnedPathElements2()
	 * @see #getPathName2CS()
	 * @generated
	 */
	EReference getPathName2CS_OwnedPathElements2();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS <em>Path Element2 CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Element2 CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS
	 * @generated
	 */
	EClass getPathElement2CS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS#getName()
	 * @see #getPathElement2CS()
	 * @generated
	 */
	EAttribute getPathElement2CS_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS#getOwningPathNameCS <em>Owning Path Name CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Path Name CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS#getOwningPathNameCS()
	 * @see #getPathElement2CS()
	 * @generated
	 */
	EReference getPathElement2CS_OwningPathNameCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS <em>Typed Type Ref2 CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Type Ref2 CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS
	 * @generated
	 */
	EClass getTypedTypeRef2CS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS#getOwnedPathName <em>Owned Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Path Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS#getOwnedPathName()
	 * @see #getTypedTypeRef2CS()
	 * @generated
	 */
	EReference getTypedTypeRef2CS_OwnedPathName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS#getOwnedBinding <em>Owned Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Binding</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS#getOwnedBinding()
	 * @see #getTypedTypeRef2CS()
	 * @generated
	 */
	EReference getTypedTypeRef2CS_OwnedBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS#getExtentLocation <em>Extent Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent Location</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS#getExtentLocation()
	 * @see #getTypedTypeRef2CS()
	 * @generated
	 */
	EAttribute getTypedTypeRef2CS_ExtentLocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS <em>Top Level CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS
	 * @generated
	 */
	EClass getTopLevelCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS#getOwnedTypes <em>Owned Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Types</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS#getOwnedTypes()
	 * @see #getTopLevelCS()
	 * @generated
	 */
	EReference getTopLevelCS_OwnedTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS <em>QV To Class CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QV To Class CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS
	 * @generated
	 */
	EClass getQVToClassCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS#isIsIntermediate <em>Is Intermediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Intermediate</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS#isIsIntermediate()
	 * @see #getQVToClassCS()
	 * @generated
	 */
	EAttribute getQVToClassCS_IsIntermediate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS <em>QV To Import CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QV To Import CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS
	 * @generated
	 */
	EClass getQVToImportCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS#getOwnedUnitRef <em>Owned Unit Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Unit Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS#getOwnedUnitRef()
	 * @see #getQVToImportCS()
	 * @generated
	 */
	EReference getQVToImportCS_OwnedUnitRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS#getImportedUnitElement <em>Imported Unit Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imported Unit Element</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS#getImportedUnitElement()
	 * @see #getQVToImportCS()
	 * @generated
	 */
	EAttribute getQVToImportCS_ImportedUnitElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS <em>QV To Library CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QV To Library CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS
	 * @generated
	 */
	EClass getQVToLibraryCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS <em>QV To Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QV To Operation CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS
	 * @generated
	 */
	EClass getQVToOperationCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS#getOwnedStereotype <em>Owned Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Stereotype</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS#getOwnedStereotype()
	 * @see #getQVToOperationCS()
	 * @generated
	 */
	EReference getQVToOperationCS_OwnedStereotype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS <em>Constructor Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Operation CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConstructorOperationCS
	 * @generated
	 */
	EClass getConstructorOperationCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS <em>Configuration Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Property CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ConfigurationPropertyCS
	 * @generated
	 */
	EClass getConfigurationPropertyCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS <em>Entry Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Operation CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.EntryOperationCS
	 * @generated
	 */
	EClass getEntryOperationCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS <em>Init Part CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Part CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS
	 * @generated
	 */
	EClass getInitPartCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getInitOp <em>Init Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Op</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getInitOp()
	 * @see #getInitPartCS()
	 * @generated
	 */
	EAttribute getInitPartCS_InitOp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getOwnedExp <em>Owned Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Exp</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getOwnedExp()
	 * @see #getInitPartCS()
	 * @generated
	 */
	EReference getInitPartCS_OwnedExp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS <em>Metamodel CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS
	 * @generated
	 */
	EClass getMetamodelCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS#getMetamodelKind <em>Metamodel Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel Kind</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS#getMetamodelKind()
	 * @see #getMetamodelCS()
	 * @generated
	 */
	EAttribute getMetamodelCS_MetamodelKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS <em>Operation Body CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Body CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS
	 * @generated
	 */
	EClass getOperationBodyCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS#getOwnedContentExps <em>Owned Content Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Content Exps</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS#getOwnedContentExps()
	 * @see #getOperationBodyCS()
	 * @generated
	 */
	EReference getOperationBodyCS_OwnedContentExps();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS <em>Operation Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Ref CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS
	 * @generated
	 */
	EClass getOperationRefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS#getOwnedPathName <em>Owned Path Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Path Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS#getOwnedPathName()
	 * @see #getOperationRefCS()
	 * @generated
	 */
	EReference getOperationRefCS_OwnedPathName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS <em>Primitive Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS
	 * @generated
	 */
	EClass getPrimitiveTypeCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS <em>Classifier Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Property CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS
	 * @generated
	 */
	EClass getClassifierPropertyCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS#getOwnedStereotype <em>Owned Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Stereotype</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS#getOwnedStereotype()
	 * @see #getClassifierPropertyCS()
	 * @generated
	 */
	EReference getClassifierPropertyCS_OwnedStereotype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opposite</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS#getOpposite()
	 * @see #getClassifierPropertyCS()
	 * @generated
	 */
	EAttribute getClassifierPropertyCS_Opposite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS <em>Stereotype Qualifier CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stereotype Qualifier CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS
	 * @generated
	 */
	EClass getStereotypeQualifierCS();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS#getStereotypes <em>Stereotypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stereotypes</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS#getStereotypes()
	 * @see #getStereotypeQualifierCS()
	 * @generated
	 */
	EAttribute getStereotypeQualifierCS_Stereotypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS <em>Tag CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS
	 * @generated
	 */
	EClass getTagCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS#getOwnedElementPath <em>Owned Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Element Path</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS#getOwnedElementPath()
	 * @see #getTagCS()
	 * @generated
	 */
	EReference getTagCS_OwnedElementPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS#getOwnedExpression <em>Owned Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Expression</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS#getOwnedExpression()
	 * @see #getTagCS()
	 * @generated
	 */
	EReference getTagCS_OwnedExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS <em>Exception CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ExceptionCS
	 * @generated
	 */
	EClass getExceptionCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS <em>Helper Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Operation CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS
	 * @generated
	 */
	EClass getHelperOperationCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS#getIsQuery <em>Is Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Query</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.HelperOperationCS#getIsQuery()
	 * @see #getHelperOperationCS()
	 * @generated
	 */
	EAttribute getHelperOperationCS_IsQuery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS <em>Imperative Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imperative Operation CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS
	 * @generated
	 */
	EClass getImperativeOperationCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedScopedName <em>Owned Scoped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Scoped Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedScopedName()
	 * @see #getImperativeOperationCS()
	 * @generated
	 */
	EReference getImperativeOperationCS_OwnedScopedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedResults <em>Owned Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Results</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedResults()
	 * @see #getImperativeOperationCS()
	 * @generated
	 */
	EReference getImperativeOperationCS_OwnedResults();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedBody <em>Owned Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Body</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedBody()
	 * @see #getImperativeOperationCS()
	 * @generated
	 */
	EReference getImperativeOperationCS_OwnedBody();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS <em>Contextual Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Property CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS
	 * @generated
	 */
	EClass getContextualPropertyCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS#getOwnedInitExp <em>Owned Init Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Init Exp</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS#getOwnedInitExp()
	 * @see #getContextualPropertyCS()
	 * @generated
	 */
	EReference getContextualPropertyCS_OwnedInitExp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS <em>Mapping Body CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Body CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS
	 * @generated
	 */
	EClass getMappingBodyCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#getOwnedInitExps <em>Owned Init Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Init Exps</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#getOwnedInitExps()
	 * @see #getMappingBodyCS()
	 * @generated
	 */
	EReference getMappingBodyCS_OwnedInitExps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#getOwnedEndExps <em>Owned End Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned End Exps</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#getOwnedEndExps()
	 * @see #getMappingBodyCS()
	 * @generated
	 */
	EReference getMappingBodyCS_OwnedEndExps();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#isHasPopulationKeyword <em>Has Population Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Population Keyword</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#isHasPopulationKeyword()
	 * @see #getMappingBodyCS()
	 * @generated
	 */
	EAttribute getMappingBodyCS_HasPopulationKeyword();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS <em>Mapping Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Call Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS
	 * @generated
	 */
	EClass getMappingCallExpCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS#isIsStrict <em>Is Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Strict</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS#isIsStrict()
	 * @see #getMappingCallExpCS()
	 * @generated
	 */
	EAttribute getMappingCallExpCS_IsStrict();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS <em>Mapping Operation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Operation CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS
	 * @generated
	 */
	EClass getMappingOperationCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getDirection()
	 * @see #getMappingOperationCS()
	 * @generated
	 */
	EAttribute getMappingOperationCS_Direction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedInheritRefs <em>Owned Inherit Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Inherit Refs</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedInheritRefs()
	 * @see #getMappingOperationCS()
	 * @generated
	 */
	EReference getMappingOperationCS_OwnedInheritRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedDisjunctRefs <em>Owned Disjunct Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Disjunct Refs</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedDisjunctRefs()
	 * @see #getMappingOperationCS()
	 * @generated
	 */
	EReference getMappingOperationCS_OwnedDisjunctRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedMergeRefs <em>Owned Merge Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Merge Refs</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedMergeRefs()
	 * @see #getMappingOperationCS()
	 * @generated
	 */
	EReference getMappingOperationCS_OwnedMergeRefs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedRefinedRule <em>Owned Refined Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Refined Rule</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedRefinedRule()
	 * @see #getMappingOperationCS()
	 * @generated
	 */
	EReference getMappingOperationCS_OwnedRefinedRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedWhenExps <em>Owned When Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned When Exps</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedWhenExps()
	 * @see #getMappingOperationCS()
	 * @generated
	 */
	EReference getMappingOperationCS_OwnedWhenExps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedWhereExps <em>Owned Where Exps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Where Exps</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedWhereExps()
	 * @see #getMappingOperationCS()
	 * @generated
	 */
	EReference getMappingOperationCS_OwnedWhereExps();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS <em>Module Kind CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Module Kind CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS
	 * @generated
	 */
	EEnum getModuleKindCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS <em>Module Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Ref CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS
	 * @generated
	 */
	EClass getModuleRefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS#getOwnedScopedName <em>Owned Scoped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Scoped Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS#getOwnedScopedName()
	 * @see #getModuleRefCS()
	 * @generated
	 */
	EReference getModuleRefCS_OwnedScopedName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS#getOwnedParameters()
	 * @see #getModuleRefCS()
	 * @generated
	 */
	EReference getModuleRefCS_OwnedParameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS <em>Model Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS
	 * @generated
	 */
	EClass getModelTypeCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getComplianceKind <em>Compliance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compliance Kind</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getComplianceKind()
	 * @see #getModelTypeCS()
	 * @generated
	 */
	EAttribute getModelTypeCS_ComplianceKind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getOwnedPackageRefs <em>Owned Package Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Package Refs</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getOwnedPackageRefs()
	 * @see #getModelTypeCS()
	 * @generated
	 */
	EReference getModelTypeCS_OwnedPackageRefs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getOwnedConditions <em>Owned Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Conditions</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getOwnedConditions()
	 * @see #getModelTypeCS()
	 * @generated
	 */
	EReference getModelTypeCS_OwnedConditions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS <em>Model Type Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type Ref CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS
	 * @generated
	 */
	EClass getModelTypeRefCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS <em>Module CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS
	 * @generated
	 */
	EClass getModuleCS();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameters</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS#getOwnedParameters()
	 * @see #getModuleCS()
	 * @generated
	 */
	EReference getModuleCS_OwnedParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS#getOwnedModuleUsages <em>Owned Module Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Module Usages</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS#getOwnedModuleUsages()
	 * @see #getModuleCS()
	 * @generated
	 */
	EReference getModuleCS_OwnedModuleUsages();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS#getOwnedQualifiers <em>Owned Qualifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Owned Qualifiers</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS#getOwnedQualifiers()
	 * @see #getModuleCS()
	 * @generated
	 */
	EAttribute getModuleCS_OwnedQualifiers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS <em>Module Property CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Property CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS
	 * @generated
	 */
	EClass getModulePropertyCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS#getOwnedScopedName <em>Owned Scoped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Scoped Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS#getOwnedScopedName()
	 * @see #getModulePropertyCS()
	 * @generated
	 */
	EReference getModulePropertyCS_OwnedScopedName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS <em>Module Usage CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Usage CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS
	 * @generated
	 */
	EClass getModuleUsageCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS#getImportKind <em>Import Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Kind</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS#getImportKind()
	 * @see #getModuleUsageCS()
	 * @generated
	 */
	EAttribute getModuleUsageCS_ImportKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS#getModuleKind <em>Module Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Kind</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS#getModuleKind()
	 * @see #getModuleUsageCS()
	 * @generated
	 */
	EAttribute getModuleUsageCS_ModuleKind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS#getOwnedModuleRefs <em>Owned Module Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Module Refs</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS#getOwnedModuleRefs()
	 * @see #getModuleUsageCS()
	 * @generated
	 */
	EReference getModuleUsageCS_OwnedModuleRefs();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS <em>Object Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS
	 * @generated
	 */
	EClass getObjectExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedVariable <em>Owned Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Variable</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedVariable()
	 * @see #getObjectExpCS()
	 * @generated
	 */
	EReference getObjectExpCS_OwnedVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedExtentRef <em>Owned Extent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Extent Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedExtentRef()
	 * @see #getObjectExpCS()
	 * @generated
	 */
	EReference getObjectExpCS_OwnedExtentRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedIterator <em>Owned Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Iterator</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedIterator()
	 * @see #getObjectExpCS()
	 * @generated
	 */
	EReference getObjectExpCS_OwnedIterator();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS <em>Parameter Declaration CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Declaration CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS
	 * @generated
	 */
	EClass getParameterDeclarationCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getDirection()
	 * @see #getParameterDeclarationCS()
	 * @generated
	 */
	EAttribute getParameterDeclarationCS_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getOwnedInitPart <em>Owned Init Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Init Part</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getOwnedInitPart()
	 * @see #getParameterDeclarationCS()
	 * @generated
	 */
	EReference getParameterDeclarationCS_OwnedInitPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS <em>Package Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Ref CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS
	 * @generated
	 */
	EClass getPackageRefCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getOwnedScopedName <em>Owned Scoped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Scoped Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getOwnedScopedName()
	 * @see #getPackageRefCS()
	 * @generated
	 */
	EReference getPackageRefCS_OwnedScopedName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getUri()
	 * @see #getPackageRefCS()
	 * @generated
	 */
	EAttribute getPackageRefCS_Uri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS <em>Transformation CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS
	 * @generated
	 */
	EClass getTransformationCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS#getOwnedRefinedModule <em>Owned Refined Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Refined Module</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS#getOwnedRefinedModule()
	 * @see #getTransformationCS()
	 * @generated
	 */
	EReference getTransformationCS_OwnedRefinedModule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS <em>Unit Ref CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Ref CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS
	 * @generated
	 */
	EClass getUnitRefCS();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getSegment()
	 * @see #getUnitRefCS()
	 * @generated
	 */
	EAttribute getUnitRefCS_Segment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getTopLevelElements <em>Top Level Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Top Level Elements</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getTopLevelElements()
	 * @see #getUnitRefCS()
	 * @generated
	 */
	EReference getUnitRefCS_TopLevelElements();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getModules()
	 * @see #getUnitRefCS()
	 * @generated
	 */
	EReference getUnitRefCS_Modules();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getModelTypes <em>Model Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Types</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getModelTypes()
	 * @see #getUnitRefCS()
	 * @generated
	 */
	EReference getUnitRefCS_ModelTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS#getImports()
	 * @see #getUnitRefCS()
	 * @generated
	 */
	EReference getUnitRefCS_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS <em>Resolve Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS
	 * @generated
	 */
	EClass getResolveExpCS();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getIsDeferred <em>Is Deferred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Deferred</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getIsDeferred()
	 * @see #getResolveExpCS()
	 * @generated
	 */
	EAttribute getResolveExpCS_IsDeferred();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Condition</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getOwnedCondition()
	 * @see #getResolveExpCS()
	 * @generated
	 */
	EReference getResolveExpCS_OwnedCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getName()
	 * @see #getResolveExpCS()
	 * @generated
	 */
	EAttribute getResolveExpCS_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getOwnedTarget <em>Owned Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Target</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS#getOwnedTarget()
	 * @see #getResolveExpCS()
	 * @generated
	 */
	EReference getResolveExpCS_OwnedTarget();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByTypeExpCS <em>Resolve By Type Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve By Type Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByTypeExpCS
	 * @generated
	 */
	EClass getResolveByTypeExpCS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS <em>Resolve By Mapping Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve By Mapping Exp CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS
	 * @generated
	 */
	EClass getResolveByMappingExpCS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS#getOwnedMappingRef <em>Owned Mapping Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Mapping Ref</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS#getOwnedMappingRef()
	 * @see #getResolveByMappingExpCS()
	 * @generated
	 */
	EReference getResolveByMappingExpCS_OwnedMappingRef();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKindCS <em>Metamodel Kind CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metamodel Kind CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKindCS
	 * @generated
	 */
	EEnum getMetamodelKindCS();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS <em>Direction Kind CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Kind CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS
	 * @generated
	 */
	EEnum getDirectionKindCS();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS <em>Import Kind CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Import Kind CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS
	 * @generated
	 */
	EEnum getImportKindCS();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QualifierKindCS <em>Qualifier Kind CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualifier Kind CS</em>'.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QualifierKindCS
	 * @generated
	 */
	EEnum getQualifierKindCS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QVTOperationalCSFactory getQVTOperationalCSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathName2CSImpl <em>Path Name2 CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathName2CSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPathName2CS()
		 * @generated
		 */
		EClass PATH_NAME2_CS = eINSTANCE.getPathName2CS();

		/**
		 * The meta object literal for the '<em><b>Owned Path Elements2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_NAME2_CS__OWNED_PATH_ELEMENTS2 = eINSTANCE.getPathName2CS_OwnedPathElements2();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathElement2CSImpl <em>Path Element2 CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PathElement2CSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPathElement2CS()
		 * @generated
		 */
		EClass PATH_ELEMENT2_CS = eINSTANCE.getPathElement2CS();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_ELEMENT2_CS__NAME = eINSTANCE.getPathElement2CS_Name();

		/**
		 * The meta object literal for the '<em><b>Owning Path Name CS</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_ELEMENT2_CS__OWNING_PATH_NAME_CS = eINSTANCE.getPathElement2CS_OwningPathNameCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TypedTypeRef2CSImpl <em>Typed Type Ref2 CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TypedTypeRef2CSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTypedTypeRef2CS()
		 * @generated
		 */
		EClass TYPED_TYPE_REF2_CS = eINSTANCE.getTypedTypeRef2CS();

		/**
		 * The meta object literal for the '<em><b>Owned Path Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_TYPE_REF2_CS__OWNED_PATH_NAME = eINSTANCE.getTypedTypeRef2CS_OwnedPathName();

		/**
		 * The meta object literal for the '<em><b>Owned Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_TYPE_REF2_CS__OWNED_BINDING = eINSTANCE.getTypedTypeRef2CS_OwnedBinding();

		/**
		 * The meta object literal for the '<em><b>Extent Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_TYPE_REF2_CS__EXTENT_LOCATION = eINSTANCE.getTypedTypeRef2CS_ExtentLocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TopLevelCSImpl <em>Top Level CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TopLevelCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTopLevelCS()
		 * @generated
		 */
		EClass TOP_LEVEL_CS = eINSTANCE.getTopLevelCS();

		/**
		 * The meta object literal for the '<em><b>Owned Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_LEVEL_CS__OWNED_TYPES = eINSTANCE.getTopLevelCS_OwnedTypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToClassCSImpl <em>QV To Class CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToClassCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToClassCS()
		 * @generated
		 */
		EClass QV_TO_CLASS_CS = eINSTANCE.getQVToClassCS();

		/**
		 * The meta object literal for the '<em><b>Is Intermediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QV_TO_CLASS_CS__IS_INTERMEDIATE = eINSTANCE.getQVToClassCS_IsIntermediate();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToImportCSImpl <em>QV To Import CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToImportCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToImportCS()
		 * @generated
		 */
		EClass QV_TO_IMPORT_CS = eINSTANCE.getQVToImportCS();

		/**
		 * The meta object literal for the '<em><b>Owned Unit Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QV_TO_IMPORT_CS__OWNED_UNIT_REF = eINSTANCE.getQVToImportCS_OwnedUnitRef();

		/**
		 * The meta object literal for the '<em><b>Imported Unit Element</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT = eINSTANCE.getQVToImportCS_ImportedUnitElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToLibraryCSImpl <em>QV To Library CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToLibraryCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToLibraryCS()
		 * @generated
		 */
		EClass QV_TO_LIBRARY_CS = eINSTANCE.getQVToLibraryCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToOperationCSImpl <em>QV To Operation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToOperationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQVToOperationCS()
		 * @generated
		 */
		EClass QV_TO_OPERATION_CS = eINSTANCE.getQVToOperationCS();

		/**
		 * The meta object literal for the '<em><b>Owned Stereotype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QV_TO_OPERATION_CS__OWNED_STEREOTYPE = eINSTANCE.getQVToOperationCS_OwnedStereotype();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConstructorOperationCSImpl <em>Constructor Operation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConstructorOperationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getConstructorOperationCS()
		 * @generated
		 */
		EClass CONSTRUCTOR_OPERATION_CS = eINSTANCE.getConstructorOperationCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConfigurationPropertyCSImpl <em>Configuration Property CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ConfigurationPropertyCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getConfigurationPropertyCS()
		 * @generated
		 */
		EClass CONFIGURATION_PROPERTY_CS = eINSTANCE.getConfigurationPropertyCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.EntryOperationCSImpl <em>Entry Operation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.EntryOperationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getEntryOperationCS()
		 * @generated
		 */
		EClass ENTRY_OPERATION_CS = eINSTANCE.getEntryOperationCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.InitPartCSImpl <em>Init Part CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.InitPartCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getInitPartCS()
		 * @generated
		 */
		EClass INIT_PART_CS = eINSTANCE.getInitPartCS();

		/**
		 * The meta object literal for the '<em><b>Init Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INIT_PART_CS__INIT_OP = eINSTANCE.getInitPartCS_InitOp();

		/**
		 * The meta object literal for the '<em><b>Owned Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INIT_PART_CS__OWNED_EXP = eINSTANCE.getInitPartCS_OwnedExp();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MetamodelCSImpl <em>Metamodel CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MetamodelCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMetamodelCS()
		 * @generated
		 */
		EClass METAMODEL_CS = eINSTANCE.getMetamodelCS();

		/**
		 * The meta object literal for the '<em><b>Metamodel Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_CS__METAMODEL_KIND = eINSTANCE.getMetamodelCS_MetamodelKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationBodyCSImpl <em>Operation Body CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationBodyCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getOperationBodyCS()
		 * @generated
		 */
		EClass OPERATION_BODY_CS = eINSTANCE.getOperationBodyCS();

		/**
		 * The meta object literal for the '<em><b>Owned Content Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_BODY_CS__OWNED_CONTENT_EXPS = eINSTANCE.getOperationBodyCS_OwnedContentExps();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationRefCSImpl <em>Operation Ref CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.OperationRefCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getOperationRefCS()
		 * @generated
		 */
		EClass OPERATION_REF_CS = eINSTANCE.getOperationRefCS();

		/**
		 * The meta object literal for the '<em><b>Owned Path Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_REF_CS__OWNED_PATH_NAME = eINSTANCE.getOperationRefCS_OwnedPathName();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PrimitiveTypeCSImpl <em>Primitive Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PrimitiveTypeCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPrimitiveTypeCS()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_CS = eINSTANCE.getPrimitiveTypeCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ClassifierPropertyCSImpl <em>Classifier Property CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ClassifierPropertyCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getClassifierPropertyCS()
		 * @generated
		 */
		EClass CLASSIFIER_PROPERTY_CS = eINSTANCE.getClassifierPropertyCS();

		/**
		 * The meta object literal for the '<em><b>Owned Stereotype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIER_PROPERTY_CS__OWNED_STEREOTYPE = eINSTANCE.getClassifierPropertyCS_OwnedStereotype();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIER_PROPERTY_CS__OPPOSITE = eINSTANCE.getClassifierPropertyCS_Opposite();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.StereotypeQualifierCSImpl <em>Stereotype Qualifier CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.StereotypeQualifierCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getStereotypeQualifierCS()
		 * @generated
		 */
		EClass STEREOTYPE_QUALIFIER_CS = eINSTANCE.getStereotypeQualifierCS();

		/**
		 * The meta object literal for the '<em><b>Stereotypes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEREOTYPE_QUALIFIER_CS__STEREOTYPES = eINSTANCE.getStereotypeQualifierCS_Stereotypes();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TagCSImpl <em>Tag CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TagCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTagCS()
		 * @generated
		 */
		EClass TAG_CS = eINSTANCE.getTagCS();

		/**
		 * The meta object literal for the '<em><b>Owned Element Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_CS__OWNED_ELEMENT_PATH = eINSTANCE.getTagCS_OwnedElementPath();

		/**
		 * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG_CS__OWNED_EXPRESSION = eINSTANCE.getTagCS_OwnedExpression();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ExceptionCSImpl <em>Exception CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ExceptionCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getExceptionCS()
		 * @generated
		 */
		EClass EXCEPTION_CS = eINSTANCE.getExceptionCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.HelperOperationCSImpl <em>Helper Operation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.HelperOperationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getHelperOperationCS()
		 * @generated
		 */
		EClass HELPER_OPERATION_CS = eINSTANCE.getHelperOperationCS();

		/**
		 * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_OPERATION_CS__IS_QUERY = eINSTANCE.getHelperOperationCS_IsQuery();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ImperativeOperationCSImpl <em>Imperative Operation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ImperativeOperationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getImperativeOperationCS()
		 * @generated
		 */
		EClass IMPERATIVE_OPERATION_CS = eINSTANCE.getImperativeOperationCS();

		/**
		 * The meta object literal for the '<em><b>Owned Scoped Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME = eINSTANCE.getImperativeOperationCS_OwnedScopedName();

		/**
		 * The meta object literal for the '<em><b>Owned Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION_CS__OWNED_RESULTS = eINSTANCE.getImperativeOperationCS_OwnedResults();

		/**
		 * The meta object literal for the '<em><b>Owned Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPERATIVE_OPERATION_CS__OWNED_BODY = eINSTANCE.getImperativeOperationCS_OwnedBody();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ContextualPropertyCSImpl <em>Contextual Property CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ContextualPropertyCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getContextualPropertyCS()
		 * @generated
		 */
		EClass CONTEXTUAL_PROPERTY_CS = eINSTANCE.getContextualPropertyCS();

		/**
		 * The meta object literal for the '<em><b>Owned Init Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP = eINSTANCE.getContextualPropertyCS_OwnedInitExp();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingBodyCSImpl <em>Mapping Body CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingBodyCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMappingBodyCS()
		 * @generated
		 */
		EClass MAPPING_BODY_CS = eINSTANCE.getMappingBodyCS();

		/**
		 * The meta object literal for the '<em><b>Owned Init Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY_CS__OWNED_INIT_EXPS = eINSTANCE.getMappingBodyCS_OwnedInitExps();

		/**
		 * The meta object literal for the '<em><b>Owned End Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_BODY_CS__OWNED_END_EXPS = eINSTANCE.getMappingBodyCS_OwnedEndExps();

		/**
		 * The meta object literal for the '<em><b>Has Population Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_BODY_CS__HAS_POPULATION_KEYWORD = eINSTANCE.getMappingBodyCS_HasPopulationKeyword();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingCallExpCSImpl <em>Mapping Call Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingCallExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMappingCallExpCS()
		 * @generated
		 */
		EClass MAPPING_CALL_EXP_CS = eINSTANCE.getMappingCallExpCS();

		/**
		 * The meta object literal for the '<em><b>Is Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_CALL_EXP_CS__IS_STRICT = eINSTANCE.getMappingCallExpCS_IsStrict();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl <em>Mapping Operation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMappingOperationCS()
		 * @generated
		 */
		EClass MAPPING_OPERATION_CS = eINSTANCE.getMappingOperationCS();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_OPERATION_CS__DIRECTION = eINSTANCE.getMappingOperationCS_Direction();

		/**
		 * The meta object literal for the '<em><b>Owned Inherit Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION_CS__OWNED_INHERIT_REFS = eINSTANCE.getMappingOperationCS_OwnedInheritRefs();

		/**
		 * The meta object literal for the '<em><b>Owned Disjunct Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS = eINSTANCE.getMappingOperationCS_OwnedDisjunctRefs();

		/**
		 * The meta object literal for the '<em><b>Owned Merge Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION_CS__OWNED_MERGE_REFS = eINSTANCE.getMappingOperationCS_OwnedMergeRefs();

		/**
		 * The meta object literal for the '<em><b>Owned Refined Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION_CS__OWNED_REFINED_RULE = eINSTANCE.getMappingOperationCS_OwnedRefinedRule();

		/**
		 * The meta object literal for the '<em><b>Owned When Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION_CS__OWNED_WHEN_EXPS = eINSTANCE.getMappingOperationCS_OwnedWhenExps();

		/**
		 * The meta object literal for the '<em><b>Owned Where Exps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_OPERATION_CS__OWNED_WHERE_EXPS = eINSTANCE.getMappingOperationCS_OwnedWhereExps();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS <em>Module Kind CS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleKindCS()
		 * @generated
		 */
		EEnum MODULE_KIND_CS = eINSTANCE.getModuleKindCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleRefCSImpl <em>Module Ref CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleRefCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleRefCS()
		 * @generated
		 */
		EClass MODULE_REF_CS = eINSTANCE.getModuleRefCS();

		/**
		 * The meta object literal for the '<em><b>Owned Scoped Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REF_CS__OWNED_SCOPED_NAME = eINSTANCE.getModuleRefCS_OwnedScopedName();

		/**
		 * The meta object literal for the '<em><b>Owned Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_REF_CS__OWNED_PARAMETERS = eINSTANCE.getModuleRefCS_OwnedParameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeCSImpl <em>Model Type CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModelTypeCS()
		 * @generated
		 */
		EClass MODEL_TYPE_CS = eINSTANCE.getModelTypeCS();

		/**
		 * The meta object literal for the '<em><b>Compliance Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE_CS__COMPLIANCE_KIND = eINSTANCE.getModelTypeCS_ComplianceKind();

		/**
		 * The meta object literal for the '<em><b>Owned Package Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE_CS__OWNED_PACKAGE_REFS = eINSTANCE.getModelTypeCS_OwnedPackageRefs();

		/**
		 * The meta object literal for the '<em><b>Owned Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE_CS__OWNED_CONDITIONS = eINSTANCE.getModelTypeCS_OwnedConditions();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeRefCSImpl <em>Model Type Ref CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeRefCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModelTypeRefCS()
		 * @generated
		 */
		EClass MODEL_TYPE_REF_CS = eINSTANCE.getModelTypeRefCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleCSImpl <em>Module CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleCS()
		 * @generated
		 */
		EClass MODULE_CS = eINSTANCE.getModuleCS();

		/**
		 * The meta object literal for the '<em><b>Owned Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CS__OWNED_PARAMETERS = eINSTANCE.getModuleCS_OwnedParameters();

		/**
		 * The meta object literal for the '<em><b>Owned Module Usages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_CS__OWNED_MODULE_USAGES = eINSTANCE.getModuleCS_OwnedModuleUsages();

		/**
		 * The meta object literal for the '<em><b>Owned Qualifiers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_CS__OWNED_QUALIFIERS = eINSTANCE.getModuleCS_OwnedQualifiers();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModulePropertyCSImpl <em>Module Property CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModulePropertyCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModulePropertyCS()
		 * @generated
		 */
		EClass MODULE_PROPERTY_CS = eINSTANCE.getModulePropertyCS();

		/**
		 * The meta object literal for the '<em><b>Owned Scoped Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_PROPERTY_CS__OWNED_SCOPED_NAME = eINSTANCE.getModulePropertyCS_OwnedScopedName();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleUsageCSImpl <em>Module Usage CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleUsageCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getModuleUsageCS()
		 * @generated
		 */
		EClass MODULE_USAGE_CS = eINSTANCE.getModuleUsageCS();

		/**
		 * The meta object literal for the '<em><b>Import Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_USAGE_CS__IMPORT_KIND = eINSTANCE.getModuleUsageCS_ImportKind();

		/**
		 * The meta object literal for the '<em><b>Module Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_USAGE_CS__MODULE_KIND = eINSTANCE.getModuleUsageCS_ModuleKind();

		/**
		 * The meta object literal for the '<em><b>Owned Module Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_USAGE_CS__OWNED_MODULE_REFS = eINSTANCE.getModuleUsageCS_OwnedModuleRefs();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ObjectExpCSImpl <em>Object Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ObjectExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getObjectExpCS()
		 * @generated
		 */
		EClass OBJECT_EXP_CS = eINSTANCE.getObjectExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP_CS__OWNED_VARIABLE = eINSTANCE.getObjectExpCS_OwnedVariable();

		/**
		 * The meta object literal for the '<em><b>Owned Extent Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP_CS__OWNED_EXTENT_REF = eINSTANCE.getObjectExpCS_OwnedExtentRef();

		/**
		 * The meta object literal for the '<em><b>Owned Iterator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_EXP_CS__OWNED_ITERATOR = eINSTANCE.getObjectExpCS_OwnedIterator();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ParameterDeclarationCSImpl <em>Parameter Declaration CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ParameterDeclarationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getParameterDeclarationCS()
		 * @generated
		 */
		EClass PARAMETER_DECLARATION_CS = eINSTANCE.getParameterDeclarationCS();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_DECLARATION_CS__DIRECTION = eINSTANCE.getParameterDeclarationCS_Direction();

		/**
		 * The meta object literal for the '<em><b>Owned Init Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_DECLARATION_CS__OWNED_INIT_PART = eINSTANCE.getParameterDeclarationCS_OwnedInitPart();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PackageRefCSImpl <em>Package Ref CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.PackageRefCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getPackageRefCS()
		 * @generated
		 */
		EClass PACKAGE_REF_CS = eINSTANCE.getPackageRefCS();

		/**
		 * The meta object literal for the '<em><b>Owned Scoped Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_REF_CS__OWNED_SCOPED_NAME = eINSTANCE.getPackageRefCS_OwnedScopedName();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_REF_CS__URI = eINSTANCE.getPackageRefCS_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl <em>Transformation CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getTransformationCS()
		 * @generated
		 */
		EClass TRANSFORMATION_CS = eINSTANCE.getTransformationCS();

		/**
		 * The meta object literal for the '<em><b>Owned Refined Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_CS__OWNED_REFINED_MODULE = eINSTANCE.getTransformationCS_OwnedRefinedModule();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.UnitRefCSImpl <em>Unit Ref CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.UnitRefCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getUnitRefCS()
		 * @generated
		 */
		EClass UNIT_REF_CS = eINSTANCE.getUnitRefCS();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_REF_CS__SEGMENT = eINSTANCE.getUnitRefCS_Segment();

		/**
		 * The meta object literal for the '<em><b>Top Level Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_REF_CS__TOP_LEVEL_ELEMENTS = eINSTANCE.getUnitRefCS_TopLevelElements();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_REF_CS__MODULES = eINSTANCE.getUnitRefCS_Modules();

		/**
		 * The meta object literal for the '<em><b>Model Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_REF_CS__MODEL_TYPES = eINSTANCE.getUnitRefCS_ModelTypes();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_REF_CS__IMPORTS = eINSTANCE.getUnitRefCS_Imports();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl <em>Resolve Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getResolveExpCS()
		 * @generated
		 */
		EClass RESOLVE_EXP_CS = eINSTANCE.getResolveExpCS();

		/**
		 * The meta object literal for the '<em><b>Is Deferred</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP_CS__IS_DEFERRED = eINSTANCE.getResolveExpCS_IsDeferred();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP_CS__OWNED_CONDITION = eINSTANCE.getResolveExpCS_OwnedCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_EXP_CS__NAME = eINSTANCE.getResolveExpCS_Name();

		/**
		 * The meta object literal for the '<em><b>Owned Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_EXP_CS__OWNED_TARGET = eINSTANCE.getResolveExpCS_OwnedTarget();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByTypeExpCSImpl <em>Resolve By Type Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByTypeExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getResolveByTypeExpCS()
		 * @generated
		 */
		EClass RESOLVE_BY_TYPE_EXP_CS = eINSTANCE.getResolveByTypeExpCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByMappingExpCSImpl <em>Resolve By Mapping Exp CS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByMappingExpCSImpl
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getResolveByMappingExpCS()
		 * @generated
		 */
		EClass RESOLVE_BY_MAPPING_EXP_CS = eINSTANCE.getResolveByMappingExpCS();

		/**
		 * The meta object literal for the '<em><b>Owned Mapping Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF = eINSTANCE.getResolveByMappingExpCS_OwnedMappingRef();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKindCS <em>Metamodel Kind CS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKindCS
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getMetamodelKindCS()
		 * @generated
		 */
		EEnum METAMODEL_KIND_CS = eINSTANCE.getMetamodelKindCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS <em>Direction Kind CS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getDirectionKindCS()
		 * @generated
		 */
		EEnum DIRECTION_KIND_CS = eINSTANCE.getDirectionKindCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS <em>Import Kind CS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getImportKindCS()
		 * @generated
		 */
		EEnum IMPORT_KIND_CS = eINSTANCE.getImportKindCS();

		/**
		 * The meta object literal for the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QualifierKindCS <em>Qualifier Kind CS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QualifierKindCS
		 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVTOperationalCSPackageImpl#getQualifierKindCS()
		 * @generated
		 */
		EEnum QUALIFIER_KIND_CS = eINSTANCE.getQualifierKindCS();

	}

} //QVTOperationalCSPackage
