/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QVTOperationalCSFactoryImpl extends EFactoryImpl implements QVTOperationalCSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QVTOperationalCSFactory init() {
		try {
			QVTOperationalCSFactory theQVTOperationalCSFactory = (QVTOperationalCSFactory)EPackage.Registry.INSTANCE.getEFactory(QVTOperationalCSPackage.eNS_URI);
			if (theQVTOperationalCSFactory != null) {
				return theQVTOperationalCSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QVTOperationalCSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QVTOperationalCSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QVTOperationalCSPackage.PATH_NAME2_CS: return createPathName2CS();
		case QVTOperationalCSPackage.PATH_ELEMENT2_CS: return createPathElement2CS();
		case QVTOperationalCSPackage.TYPED_TYPE_REF2_CS: return createTypedTypeRef2CS();
		case QVTOperationalCSPackage.TOP_LEVEL_CS: return createTopLevelCS();
		case QVTOperationalCSPackage.CLASSIFIER_PROPERTY_CS: return createClassifierPropertyCS();
		case QVTOperationalCSPackage.CONSTRUCTOR_OPERATION_CS: return createConstructorOperationCS();
		case QVTOperationalCSPackage.CONFIGURATION_PROPERTY_CS: return createConfigurationPropertyCS();
		case QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS: return createContextualPropertyCS();
		case QVTOperationalCSPackage.ENTRY_OPERATION_CS: return createEntryOperationCS();
		case QVTOperationalCSPackage.EXCEPTION_CS: return createExceptionCS();
		case QVTOperationalCSPackage.HELPER_OPERATION_CS: return createHelperOperationCS();
		case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS: return createImperativeOperationCS();
		case QVTOperationalCSPackage.INIT_PART_CS: return createInitPartCS();
		case QVTOperationalCSPackage.MAPPING_BODY_CS: return createMappingBodyCS();
		case QVTOperationalCSPackage.MAPPING_CALL_EXP_CS: return createMappingCallExpCS();
		case QVTOperationalCSPackage.MAPPING_OPERATION_CS: return createMappingOperationCS();
		case QVTOperationalCSPackage.METAMODEL_CS: return createMetamodelCS();
		case QVTOperationalCSPackage.MODEL_TYPE_CS: return createModelTypeCS();
		case QVTOperationalCSPackage.MODEL_TYPE_REF_CS: return createModelTypeRefCS();
		case QVTOperationalCSPackage.MODULE_CS: return createModuleCS();
		case QVTOperationalCSPackage.MODULE_PROPERTY_CS: return createModulePropertyCS();
		case QVTOperationalCSPackage.MODULE_REF_CS: return createModuleRefCS();
		case QVTOperationalCSPackage.MODULE_USAGE_CS: return createModuleUsageCS();
		case QVTOperationalCSPackage.OBJECT_EXP_CS: return createObjectExpCS();
		case QVTOperationalCSPackage.OPERATION_BODY_CS: return createOperationBodyCS();
		case QVTOperationalCSPackage.OPERATION_REF_CS: return createOperationRefCS();
		case QVTOperationalCSPackage.PACKAGE_REF_CS: return createPackageRefCS();
		case QVTOperationalCSPackage.PARAMETER_DECLARATION_CS: return createParameterDeclarationCS();
		case QVTOperationalCSPackage.PRIMITIVE_TYPE_CS: return createPrimitiveTypeCS();
		case QVTOperationalCSPackage.QV_TO_CLASS_CS: return createQVToClassCS();
		case QVTOperationalCSPackage.QV_TO_IMPORT_CS: return createQVToImportCS();
		case QVTOperationalCSPackage.QV_TO_LIBRARY_CS: return createQVToLibraryCS();
		case QVTOperationalCSPackage.QV_TO_OPERATION_CS: return createQVToOperationCS();
		case QVTOperationalCSPackage.RESOLVE_EXP_CS: return createResolveExpCS();
		case QVTOperationalCSPackage.RESOLVE_BY_TYPE_EXP_CS: return createResolveByTypeExpCS();
		case QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS: return createResolveByMappingExpCS();
		case QVTOperationalCSPackage.STEREOTYPE_QUALIFIER_CS: return createStereotypeQualifierCS();
		case QVTOperationalCSPackage.TAG_CS: return createTagCS();
		case QVTOperationalCSPackage.TRANSFORMATION_CS: return createTransformationCS();
		case QVTOperationalCSPackage.UNIT_REF_CS: return createUnitRefCS();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QVTOperationalCSPackage.DIRECTION_KIND_CS:
			return createDirectionKindCSFromString(eDataType, initialValue);
		case QVTOperationalCSPackage.IMPORT_KIND_CS:
			return createImportKindCSFromString(eDataType, initialValue);
		case QVTOperationalCSPackage.METAMODEL_KIND_CS:
			return createMetamodelKindCSFromString(eDataType, initialValue);
		case QVTOperationalCSPackage.MODULE_KIND_CS:
			return createModuleKindCSFromString(eDataType, initialValue);
		case QVTOperationalCSPackage.QUALIFIER_KIND_CS:
			return createQualifierKindCSFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QVTOperationalCSPackage.DIRECTION_KIND_CS:
			return convertDirectionKindCSToString(eDataType, instanceValue);
		case QVTOperationalCSPackage.IMPORT_KIND_CS:
			return convertImportKindCSToString(eDataType, instanceValue);
		case QVTOperationalCSPackage.METAMODEL_KIND_CS:
			return convertMetamodelKindCSToString(eDataType, instanceValue);
		case QVTOperationalCSPackage.MODULE_KIND_CS:
			return convertModuleKindCSToString(eDataType, instanceValue);
		case QVTOperationalCSPackage.QUALIFIER_KIND_CS:
			return convertQualifierKindCSToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathName2CS createPathName2CS() {
		PathName2CSImpl pathName2CS = new PathName2CSImpl();
		return pathName2CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathElement2CS createPathElement2CS() {
		PathElement2CSImpl pathElement2CS = new PathElement2CSImpl();
		return pathElement2CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypedTypeRef2CS createTypedTypeRef2CS() {
		TypedTypeRef2CSImpl typedTypeRef2CS = new TypedTypeRef2CSImpl();
		return typedTypeRef2CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopLevelCS createTopLevelCS() {
		TopLevelCSImpl topLevelCS = new TopLevelCSImpl();
		return topLevelCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QVToClassCS createQVToClassCS() {
		QVToClassCSImpl qvToClassCS = new QVToClassCSImpl();
		return qvToClassCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QVToImportCS createQVToImportCS() {
		QVToImportCSImpl qvToImportCS = new QVToImportCSImpl();
		return qvToImportCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QVToLibraryCS createQVToLibraryCS() {
		QVToLibraryCSImpl qvToLibraryCS = new QVToLibraryCSImpl();
		return qvToLibraryCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QVToOperationCS createQVToOperationCS() {
		QVToOperationCSImpl qvToOperationCS = new QVToOperationCSImpl();
		return qvToOperationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorOperationCS createConstructorOperationCS() {
		ConstructorOperationCSImpl constructorOperationCS = new ConstructorOperationCSImpl();
		return constructorOperationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationPropertyCS createConfigurationPropertyCS() {
		ConfigurationPropertyCSImpl configurationPropertyCS = new ConfigurationPropertyCSImpl();
		return configurationPropertyCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryOperationCS createEntryOperationCS() {
		EntryOperationCSImpl entryOperationCS = new EntryOperationCSImpl();
		return entryOperationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitPartCS createInitPartCS() {
		InitPartCSImpl initPartCS = new InitPartCSImpl();
		return initPartCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelCS createMetamodelCS() {
		MetamodelCSImpl metamodelCS = new MetamodelCSImpl();
		return metamodelCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBodyCS createOperationBodyCS() {
		OperationBodyCSImpl operationBodyCS = new OperationBodyCSImpl();
		return operationBodyCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRefCS createOperationRefCS() {
		OperationRefCSImpl operationRefCS = new OperationRefCSImpl();
		return operationRefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeCS createPrimitiveTypeCS() {
		PrimitiveTypeCSImpl primitiveTypeCS = new PrimitiveTypeCSImpl();
		return primitiveTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassifierPropertyCS createClassifierPropertyCS() {
		ClassifierPropertyCSImpl classifierPropertyCS = new ClassifierPropertyCSImpl();
		return classifierPropertyCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StereotypeQualifierCS createStereotypeQualifierCS() {
		StereotypeQualifierCSImpl stereotypeQualifierCS = new StereotypeQualifierCSImpl();
		return stereotypeQualifierCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagCS createTagCS() {
		TagCSImpl tagCS = new TagCSImpl();
		return tagCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionCS createExceptionCS() {
		ExceptionCSImpl exceptionCS = new ExceptionCSImpl();
		return exceptionCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HelperOperationCS createHelperOperationCS() {
		HelperOperationCSImpl helperOperationCS = new HelperOperationCSImpl();
		return helperOperationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImperativeOperationCS createImperativeOperationCS() {
		ImperativeOperationCSImpl imperativeOperationCS = new ImperativeOperationCSImpl();
		return imperativeOperationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextualPropertyCS createContextualPropertyCS() {
		ContextualPropertyCSImpl contextualPropertyCS = new ContextualPropertyCSImpl();
		return contextualPropertyCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModulePropertyCS createModulePropertyCS() {
		ModulePropertyCSImpl modulePropertyCS = new ModulePropertyCSImpl();
		return modulePropertyCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingBodyCS createMappingBodyCS() {
		MappingBodyCSImpl mappingBodyCS = new MappingBodyCSImpl();
		return mappingBodyCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingCallExpCS createMappingCallExpCS() {
		MappingCallExpCSImpl mappingCallExpCS = new MappingCallExpCSImpl();
		return mappingCallExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingOperationCS createMappingOperationCS() {
		MappingOperationCSImpl mappingOperationCS = new MappingOperationCSImpl();
		return mappingOperationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleRefCS createModuleRefCS() {
		ModuleRefCSImpl moduleRefCS = new ModuleRefCSImpl();
		return moduleRefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelTypeCS createModelTypeCS() {
		ModelTypeCSImpl modelTypeCS = new ModelTypeCSImpl();
		return modelTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelTypeRefCS createModelTypeRefCS() {
		ModelTypeRefCSImpl modelTypeRefCS = new ModelTypeRefCSImpl();
		return modelTypeRefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleCS createModuleCS() {
		ModuleCSImpl moduleCS = new ModuleCSImpl();
		return moduleCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleUsageCS createModuleUsageCS() {
		ModuleUsageCSImpl moduleUsageCS = new ModuleUsageCSImpl();
		return moduleUsageCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectExpCS createObjectExpCS() {
		ObjectExpCSImpl objectExpCS = new ObjectExpCSImpl();
		return objectExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterDeclarationCS createParameterDeclarationCS() {
		ParameterDeclarationCSImpl parameterDeclarationCS = new ParameterDeclarationCSImpl();
		return parameterDeclarationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageRefCS createPackageRefCS() {
		PackageRefCSImpl packageRefCS = new PackageRefCSImpl();
		return packageRefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationCS createTransformationCS() {
		TransformationCSImpl transformationCS = new TransformationCSImpl();
		return transformationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitRefCS createUnitRefCS() {
		UnitRefCSImpl unitRefCS = new UnitRefCSImpl();
		return unitRefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolveExpCS createResolveExpCS() {
		ResolveExpCSImpl resolveExpCS = new ResolveExpCSImpl();
		return resolveExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolveByTypeExpCS createResolveByTypeExpCS() {
		ResolveByTypeExpCSImpl resolveByTypeExpCS = new ResolveByTypeExpCSImpl();
		return resolveByTypeExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolveByMappingExpCS createResolveByMappingExpCS() {
		ResolveByMappingExpCSImpl resolveByMappingExpCS = new ResolveByMappingExpCSImpl();
		return resolveByMappingExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelKindCS createMetamodelKindCSFromString(EDataType eDataType, String initialValue) {
		MetamodelKindCS result = MetamodelKindCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetamodelKindCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKindCS createDirectionKindCSFromString(EDataType eDataType, String initialValue) {
		DirectionKindCS result = DirectionKindCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionKindCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportKindCS createImportKindCSFromString(EDataType eDataType, String initialValue) {
		ImportKindCS result = ImportKindCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImportKindCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleKindCS createModuleKindCSFromString(EDataType eDataType, String initialValue) {
		ModuleKindCS result = ModuleKindCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleKindCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierKindCS createQualifierKindCSFromString(EDataType eDataType, String initialValue) {
		QualifierKindCS result = QualifierKindCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualifierKindCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QVTOperationalCSPackage getQVTOperationalCSPackage() {
		return (QVTOperationalCSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QVTOperationalCSPackage getPackage() {
		return QVTOperationalCSPackage.eINSTANCE;
	}

} //QVTOperationalCSFactoryImpl
