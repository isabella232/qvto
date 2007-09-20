/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.qvt.oml.expressions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.m2m.qvt.oml.expressions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2007 Borland Software Corporation\r\n\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n  \r\nContributors:\r\n    Borland Software Corporation - initial API and implementation"; //$NON-NLS-1$

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ExpressionsFactory init() {
        try {
            ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/qvt/1.0.0/Operational/Expressions"); //$NON-NLS-1$ 
            if (theExpressionsFactory != null) {
                return theExpressionsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ExpressionsFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionsFactoryImpl() {
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
            case ExpressionsPackage.MODULE: return createModule();
            case ExpressionsPackage.LIBRARY: return createLibrary();
            case ExpressionsPackage.RENAME: return createRename();
            case ExpressionsPackage.MODULE_IMPORT: return createModuleImport();
            case ExpressionsPackage.PROPERTY: return createProperty();
            case ExpressionsPackage.LOCAL_PROPERTY: return createLocalProperty();
            case ExpressionsPackage.CONFIG_PROPERTY: return createConfigProperty();
            case ExpressionsPackage.IMPERATIVE_OPERATION: return createImperativeOperation();
            case ExpressionsPackage.MODEL_PARAMETER: return createModelParameter();
            case ExpressionsPackage.VAR_PARAMETER: return createVarParameter();
            case ExpressionsPackage.OPERATION_BODY: return createOperationBody();
            case ExpressionsPackage.MAPPING_OPERATION: return createMappingOperation();
            case ExpressionsPackage.HELPER: return createHelper();
            case ExpressionsPackage.MAPPING_BODY: return createMappingBody();
            case ExpressionsPackage.ASSIGN_EXP: return createAssignExp();
            case ExpressionsPackage.VARIABLE_INIT_EXP: return createVariableInitExp();
            case ExpressionsPackage.MAPPING_CALL_EXP: return createMappingCallExp();
            case ExpressionsPackage.BLOCK_EXP: return createBlockExp();
            case ExpressionsPackage.OBJECT_EXP: return createObjectExp();
            case ExpressionsPackage.WHILE_EXP: return createWhileExp();
            case ExpressionsPackage.SWITCH_EXP: return createSwitchExp();
            case ExpressionsPackage.ALT_EXP: return createAltExp();
            case ExpressionsPackage.RESOLVE_EXP: return createResolveExp();
            case ExpressionsPackage.RESOLVE_IN_EXP: return createResolveInExp();
            case ExpressionsPackage.MODEL_TYPE: return createModelType();
            case ExpressionsPackage.PACKAGE_REF: return createPackageRef();
            case ExpressionsPackage.MAPPING_PARAMETER: return createMappingParameter();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
            case ExpressionsPackage.DIRECTION_KIND:
                return createDirectionKindFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
            case ExpressionsPackage.DIRECTION_KIND:
                return convertDirectionKindToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Module createModule() {
        ModuleImpl module = new ModuleImpl();
        return module;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Library createLibrary() {
        LibraryImpl library = new LibraryImpl();
        return library;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Rename createRename() {
        RenameImpl rename = new RenameImpl();
        return rename;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ModuleImport createModuleImport() {
        ModuleImportImpl moduleImport = new ModuleImportImpl();
        return moduleImport;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LocalProperty createLocalProperty() {
        LocalPropertyImpl localProperty = new LocalPropertyImpl();
        return localProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConfigProperty createConfigProperty() {
        ConfigPropertyImpl configProperty = new ConfigPropertyImpl();
        return configProperty;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ImperativeOperation createImperativeOperation() {
        ImperativeOperationImpl imperativeOperation = new ImperativeOperationImpl();
        return imperativeOperation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ModelParameter createModelParameter() {
        ModelParameterImpl modelParameter = new ModelParameterImpl();
        return modelParameter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VarParameter createVarParameter() {
        VarParameterImpl varParameter = new VarParameterImpl();
        return varParameter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public OperationBody createOperationBody() {
        OperationBodyImpl operationBody = new OperationBodyImpl();
        return operationBody;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MappingOperation createMappingOperation() {
        MappingOperationImpl mappingOperation = new MappingOperationImpl();
        return mappingOperation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Helper createHelper() {
        HelperImpl helper = new HelperImpl();
        return helper;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MappingBody createMappingBody() {
        MappingBodyImpl mappingBody = new MappingBodyImpl();
        return mappingBody;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AssignExp createAssignExp() {
        AssignExpImpl assignExp = new AssignExpImpl();
        return assignExp;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VariableInitExp createVariableInitExp() {
        VariableInitExpImpl variableInitExp = new VariableInitExpImpl();
        return variableInitExp;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MappingCallExp createMappingCallExp() {
        MappingCallExpImpl mappingCallExp = new MappingCallExpImpl();
        return mappingCallExp;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BlockExp createBlockExp() {
        BlockExpImpl blockExp = new BlockExpImpl();
        return blockExp;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ObjectExp createObjectExp() {
        ObjectExpImpl objectExp = new ObjectExpImpl();
        return objectExp;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WhileExp createWhileExp() {
        WhileExpImpl whileExp = new WhileExpImpl();
        return whileExp;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SwitchExp createSwitchExp() {
        SwitchExpImpl switchExp = new SwitchExpImpl();
        return switchExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AltExp createAltExp() {
        AltExpImpl altExp = new AltExpImpl();
        return altExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResolveExp createResolveExp() {
        ResolveExpImpl resolveExp = new ResolveExpImpl();
        return resolveExp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResolveInExp createResolveInExp() {
        ResolveInExpImpl resolveInExp = new ResolveInExpImpl();
        return resolveInExp;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ModelType createModelType() {
        ModelTypeImpl modelType = new ModelTypeImpl();
        return modelType;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PackageRef createPackageRef() {
        PackageRefImpl packageRef = new PackageRefImpl();
        return packageRef;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MappingParameter createMappingParameter() {
        MappingParameterImpl mappingParameter = new MappingParameterImpl();
        return mappingParameter;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DirectionKind createDirectionKindFromString(EDataType eDataType, String initialValue) {
        DirectionKind result = DirectionKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertDirectionKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionsPackage getExpressionsPackage() {
        return (ExpressionsPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static ExpressionsPackage getPackage() {
        return ExpressionsPackage.eINSTANCE;
    }

} //ExpressionsFactoryImpl
