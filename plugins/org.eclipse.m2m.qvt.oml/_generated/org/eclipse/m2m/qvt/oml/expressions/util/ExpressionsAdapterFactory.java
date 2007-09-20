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
package org.eclipse.m2m.qvt.oml.expressions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;

import org.eclipse.m2m.qvt.oml.expressions.*;

import org.eclipse.ocl.expressions.CallExp;
import org.eclipse.ocl.expressions.FeatureCallExp;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;

import org.eclipse.ocl.utilities.ASTNode;
import org.eclipse.ocl.utilities.CallingASTNode;
import org.eclipse.ocl.utilities.TypedElement;
import org.eclipse.ocl.utilities.Visitable;
import org.eclipse.ocl.utilities.Visitor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.m2m.qvt.oml.expressions.ExpressionsPackage
 * @generated
 */
public class ExpressionsAdapterFactory extends AdapterFactoryImpl {
	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2007 Borland Software Corporation\r\n\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n  \r\nContributors:\r\n    Borland Software Corporation - initial API and implementation"; //$NON-NLS-1$
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static ExpressionsPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExpressionsAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ExpressionsPackage.eINSTANCE;
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
     * The switch the delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ExpressionsSwitch<Adapter> modelSwitch =
		new ExpressionsSwitch<Adapter>() {
            @Override
            public Adapter caseModule(Module object) {
                return createModuleAdapter();
            }
            @Override
            public Adapter caseLibrary(Library object) {
                return createLibraryAdapter();
            }
            @Override
            public Adapter caseRename(Rename object) {
                return createRenameAdapter();
            }
            @Override
            public Adapter caseModuleImport(ModuleImport object) {
                return createModuleImportAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseLocalProperty(LocalProperty object) {
                return createLocalPropertyAdapter();
            }
            @Override
            public Adapter caseConfigProperty(ConfigProperty object) {
                return createConfigPropertyAdapter();
            }
            @Override
            public Adapter caseImperativeOperation(ImperativeOperation object) {
                return createImperativeOperationAdapter();
            }
            @Override
            public Adapter caseModelParameter(ModelParameter object) {
                return createModelParameterAdapter();
            }
            @Override
            public Adapter caseVarParameter(VarParameter object) {
                return createVarParameterAdapter();
            }
            @Override
            public Adapter caseOperationBody(OperationBody object) {
                return createOperationBodyAdapter();
            }
            @Override
            public Adapter caseMappingOperation(MappingOperation object) {
                return createMappingOperationAdapter();
            }
            @Override
            public Adapter caseHelper(Helper object) {
                return createHelperAdapter();
            }
            @Override
            public Adapter caseMappingBody(MappingBody object) {
                return createMappingBodyAdapter();
            }
            @Override
            public Adapter caseImperativeExpression(ImperativeExpression object) {
                return createImperativeExpressionAdapter();
            }
            @Override
            public Adapter caseAssignExp(AssignExp object) {
                return createAssignExpAdapter();
            }
            @Override
            public Adapter caseVariableInitExp(VariableInitExp object) {
                return createVariableInitExpAdapter();
            }
            @Override
            public Adapter caseMappingCallExp(MappingCallExp object) {
                return createMappingCallExpAdapter();
            }
            @Override
            public Adapter caseBlockExp(BlockExp object) {
                return createBlockExpAdapter();
            }
            @Override
            public Adapter caseObjectExp(ObjectExp object) {
                return createObjectExpAdapter();
            }
            @Override
            public Adapter caseWhileExp(WhileExp object) {
                return createWhileExpAdapter();
            }
            @Override
            public Adapter caseSwitchExp(SwitchExp object) {
                return createSwitchExpAdapter();
            }
            @Override
            public Adapter caseAltExp(AltExp object) {
                return createAltExpAdapter();
            }
            @Override
            public <T, S, COA, SSA, CT> Adapter caseExtendedVisitor(ExtendedVisitor<T, S, COA, SSA, CT> object) {
                return createExtendedVisitorAdapter();
            }
            @Override
            public Adapter caseVisitableASTNode(VisitableASTNode object) {
                return createVisitableASTNodeAdapter();
            }
            @Override
            public Adapter caseResolveExp(ResolveExp object) {
                return createResolveExpAdapter();
            }
            @Override
            public Adapter caseResolveInExp(ResolveInExp object) {
                return createResolveInExpAdapter();
            }
            @Override
            public Adapter caseModelType(ModelType object) {
                return createModelTypeAdapter();
            }
            @Override
            public Adapter casePackageRef(PackageRef object) {
                return createPackageRefAdapter();
            }
            @Override
            public Adapter caseMappingParameter(MappingParameter object) {
                return createMappingParameterAdapter();
            }
            @Override
            public Adapter caseEModelElement(EModelElement object) {
                return createEModelElementAdapter();
            }
            @Override
            public Adapter caseENamedElement(ENamedElement object) {
                return createENamedElementAdapter();
            }
            @Override
            public Adapter caseEClassifier(EClassifier object) {
                return createEClassifierAdapter();
            }
            @Override
            public Adapter caseEClass(EClass object) {
                return createEClassAdapter();
            }
            @Override
            public Adapter caseEPackage(EPackage object) {
                return createEPackageAdapter();
            }
            @Override
            public Adapter caseVisitable(Visitable object) {
                return createVisitableAdapter();
            }
            @Override
            public Adapter caseASTNode(ASTNode object) {
                return createASTNodeAdapter();
            }
            @Override
            public Adapter caseETypedElement(ETypedElement object) {
                return createETypedElementAdapter();
            }
            @Override
            public Adapter caseEParameter(EParameter object) {
                return createEParameterAdapter();
            }
            @Override
            public Adapter caseEOperation(EOperation object) {
                return createEOperationAdapter();
            }
            @Override
            public <C> Adapter caseTypedElement(TypedElement<C> object) {
                return createTypedElementAdapter();
            }
            @Override
            public <C> Adapter caseOCLExpression(OCLExpression<C> object) {
                return createOCLExpressionAdapter();
            }
            @Override
            public Adapter caseCallingASTNode(CallingASTNode object) {
                return createCallingASTNodeAdapter();
            }
            @Override
            public <C> Adapter caseCallExp(CallExp<C> object) {
                return createCallExpAdapter();
            }
            @Override
            public <C> Adapter caseFeatureCallExp(FeatureCallExp<C> object) {
                return createFeatureCallExpAdapter();
            }
            @Override
            public <C, O> Adapter caseOperationCallExp(OperationCallExp<C, O> object) {
                return createOperationCallExpAdapter();
            }
            @Override
            public <T, C, O, P, EL, PM, S, COA, SSA, CT> Adapter caseVisitor(Visitor<T, C, O, P, EL, PM, S, COA, SSA, CT> object) {
                return createVisitorAdapter();
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
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.Module <em>Module</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.Module
     * @generated
     */
	public Adapter createModuleAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.Library <em>Library</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.Library
     * @generated
     */
	public Adapter createLibraryAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.Rename <em>Rename</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.Rename
     * @generated
     */
	public Adapter createRenameAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ModuleImport <em>Module Import</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ModuleImport
     * @generated
     */
	public Adapter createModuleImportAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.Property
     * @generated
     */
	public Adapter createPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.LocalProperty <em>Local Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.LocalProperty
     * @generated
     */
	public Adapter createLocalPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ConfigProperty <em>Config Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ConfigProperty
     * @generated
     */
	public Adapter createConfigPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ImperativeOperation <em>Imperative Operation</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ImperativeOperation
     * @generated
     */
	public Adapter createImperativeOperationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ModelParameter <em>Model Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ModelParameter
     * @generated
     */
	public Adapter createModelParameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.VarParameter <em>Var Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.VarParameter
     * @generated
     */
	public Adapter createVarParameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.OperationBody <em>Operation Body</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.OperationBody
     * @generated
     */
	public Adapter createOperationBodyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.MappingOperation <em>Mapping Operation</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.MappingOperation
     * @generated
     */
	public Adapter createMappingOperationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.Helper <em>Helper</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.Helper
     * @generated
     */
	public Adapter createHelperAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.MappingBody <em>Mapping Body</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.MappingBody
     * @generated
     */
	public Adapter createMappingBodyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ImperativeExpression <em>Imperative Expression</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ImperativeExpression
     * @generated
     */
	public Adapter createImperativeExpressionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.AssignExp <em>Assign Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.AssignExp
     * @generated
     */
	public Adapter createAssignExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.VariableInitExp <em>Variable Init Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.VariableInitExp
     * @generated
     */
	public Adapter createVariableInitExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.MappingCallExp <em>Mapping Call Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.MappingCallExp
     * @generated
     */
	public Adapter createMappingCallExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.BlockExp <em>Block Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.BlockExp
     * @generated
     */
	public Adapter createBlockExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ObjectExp <em>Object Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ObjectExp
     * @generated
     */
	public Adapter createObjectExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.WhileExp <em>While Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.WhileExp
     * @generated
     */
	public Adapter createWhileExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.SwitchExp <em>Switch Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.SwitchExp
     * @generated
     */
    public Adapter createSwitchExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.AltExp <em>Alt Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.AltExp
     * @generated
     */
    public Adapter createAltExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ExtendedVisitor <em>Extended Visitor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ExtendedVisitor
     * @generated
     */
	public Adapter createExtendedVisitorAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.VisitableASTNode <em>Visitable AST Node</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.VisitableASTNode
     * @generated
     */
	public Adapter createVisitableASTNodeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ResolveExp <em>Resolve Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ResolveExp
     * @generated
     */
    public Adapter createResolveExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ResolveInExp <em>Resolve In Exp</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ResolveInExp
     * @generated
     */
    public Adapter createResolveInExpAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.ModelType <em>Model Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.ModelType
     * @generated
     */
	public Adapter createModelTypeAdapter() {
        return null;
    }

				/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.PackageRef <em>Package Ref</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.PackageRef
     * @generated
     */
	public Adapter createPackageRefAdapter() {
        return null;
    }

				/**
     * Creates a new adapter for an object of class '{@link org.eclipse.m2m.qvt.oml.expressions.MappingParameter <em>Mapping Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.m2m.qvt.oml.expressions.MappingParameter
     * @generated
     */
	public Adapter createMappingParameterAdapter() {
        return null;
    }

				/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EModelElement
     * @generated
     */
	public Adapter createEModelElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.ENamedElement
     * @generated
     */
	public Adapter createENamedElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EClassifier <em>EClassifier</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EClassifier
     * @generated
     */
	public Adapter createEClassifierAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EClass <em>EClass</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EClass
     * @generated
     */
	public Adapter createEClassAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EPackage <em>EPackage</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EPackage
     * @generated
     */
	public Adapter createEPackageAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.Visitable <em>Visitable</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.utilities.Visitable
     * @generated
     */
	public Adapter createVisitableAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.ASTNode <em>AST Node</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.utilities.ASTNode
     * @generated
     */
	public Adapter createASTNodeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ETypedElement <em>ETyped Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.ETypedElement
     * @generated
     */
	public Adapter createETypedElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EParameter <em>EParameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EParameter
     * @generated
     */
	public Adapter createEParameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EOperation <em>EOperation</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EOperation
     * @generated
     */
	public Adapter createEOperationAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.utilities.TypedElement
     * @generated
     */
	public Adapter createTypedElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.OCLExpression <em>OCL Expression</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.expressions.OCLExpression
     * @generated
     */
	public Adapter createOCLExpressionAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.CallingASTNode <em>Calling AST Node</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.utilities.CallingASTNode
     * @generated
     */
	public Adapter createCallingASTNodeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.CallExp <em>Call Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.expressions.CallExp
     * @generated
     */
	public Adapter createCallExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.FeatureCallExp <em>Feature Call Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.expressions.FeatureCallExp
     * @generated
     */
	public Adapter createFeatureCallExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.expressions.OperationCallExp <em>Operation Call Exp</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.expressions.OperationCallExp
     * @generated
     */
	public Adapter createOperationCallExpAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.ocl.utilities.Visitor <em>Visitor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.ocl.utilities.Visitor
     * @generated
     */
	public Adapter createVisitorAdapter() {
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

} //ExpressionsAdapterFactory
