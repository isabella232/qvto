/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.BreakExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ContinueExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ForExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeIterateExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSFactory;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperativeOCLCSFactoryImpl extends EFactoryImpl implements ImperativeOCLCSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImperativeOCLCSFactory init() {
		try {
			ImperativeOCLCSFactory theImperativeOCLCSFactory = (ImperativeOCLCSFactory)EPackage.Registry.INSTANCE.getEFactory(ImperativeOCLCSPackage.eNS_URI);
			if (theImperativeOCLCSFactory != null) {
				return theImperativeOCLCSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImperativeOCLCSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOCLCSFactoryImpl() {
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
			case ImperativeOCLCSPackage.ASSERT_EXP_CS: return createAssertExpCS();
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS: return createAssignExpCS();
			case ImperativeOCLCSPackage.BREAK_EXP_CS: return createBreakExpCS();
			case ImperativeOCLCSPackage.DICT_LITERAL_EXP_CS: return createDictLiteralExpCS();
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS: return createDictLiteralPartCS();
			case ImperativeOCLCSPackage.DICT_TYPE_CS: return createDictTypeCS();
			case ImperativeOCLCSPackage.COMPUTE_EXP_CS: return createComputeExpCS();
			case ImperativeOCLCSPackage.CONTINUE_EXP_CS: return createContinueExpCS();
			case ImperativeOCLCSPackage.IMPERATIVE_ITERATE_EXP_CS: return createImperativeIterateExpCS();
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS: return createImperativeLoopExpCS();
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS: return createInstantiationExpCS();
			case ImperativeOCLCSPackage.CATCH_EXP_CS: return createCatchExpCS();
			case ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS: return createExpressionBlockCS();
			case ImperativeOCLCSPackage.FOR_EXP_CS: return createForExpCS();
			case ImperativeOCLCSPackage.LIST_TYPE_CS: return createListTypeCS();
			case ImperativeOCLCSPackage.LIST_LITERAL_EXP_CS: return createListLiteralExpCS();
			case ImperativeOCLCSPackage.LOG_EXP_CS: return createLogExpCS();
			case ImperativeOCLCSPackage.RAISE_EXP_CS: return createRaiseExpCS();
			case ImperativeOCLCSPackage.RETURN_EXP_CS: return createReturnExpCS();
			case ImperativeOCLCSPackage.SWITCH_ALT_CS: return createSwitchAltCS();
			case ImperativeOCLCSPackage.SWITCH_EXP_CS: return createSwitchExpCS();
			case ImperativeOCLCSPackage.TRY_EXP_CS: return createTryExpCS();
			case ImperativeOCLCSPackage.VAR_DECLARATION_CS: return createVarDeclarationCS();
			case ImperativeOCLCSPackage.VARS_INITIALIZATION_CS: return createVarsInitializationCS();
			case ImperativeOCLCSPackage.WHILE_EXP_CS: return createWhileExpCS();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertExpCS createAssertExpCS() {
		AssertExpCSImpl assertExpCS = new AssertExpCSImpl();
		return assertExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignExpCS createAssignExpCS() {
		AssignExpCSImpl assignExpCS = new AssignExpCSImpl();
		return assignExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakExpCS createBreakExpCS() {
		BreakExpCSImpl breakExpCS = new BreakExpCSImpl();
		return breakExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictLiteralExpCS createDictLiteralExpCS() {
		DictLiteralExpCSImpl dictLiteralExpCS = new DictLiteralExpCSImpl();
		return dictLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictLiteralPartCS createDictLiteralPartCS() {
		DictLiteralPartCSImpl dictLiteralPartCS = new DictLiteralPartCSImpl();
		return dictLiteralPartCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictTypeCS createDictTypeCS() {
		DictTypeCSImpl dictTypeCS = new DictTypeCSImpl();
		return dictTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputeExpCS createComputeExpCS() {
		ComputeExpCSImpl computeExpCS = new ComputeExpCSImpl();
		return computeExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueExpCS createContinueExpCS() {
		ContinueExpCSImpl continueExpCS = new ContinueExpCSImpl();
		return continueExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeIterateExpCS createImperativeIterateExpCS() {
		ImperativeIterateExpCSImpl imperativeIterateExpCS = new ImperativeIterateExpCSImpl();
		return imperativeIterateExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeLoopExpCS createImperativeLoopExpCS() {
		ImperativeLoopExpCSImpl imperativeLoopExpCS = new ImperativeLoopExpCSImpl();
		return imperativeLoopExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstantiationExpCS createInstantiationExpCS() {
		InstantiationExpCSImpl instantiationExpCS = new InstantiationExpCSImpl();
		return instantiationExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchExpCS createCatchExpCS() {
		CatchExpCSImpl catchExpCS = new CatchExpCSImpl();
		return catchExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionBlockCS createExpressionBlockCS() {
		ExpressionBlockCSImpl expressionBlockCS = new ExpressionBlockCSImpl();
		return expressionBlockCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForExpCS createForExpCS() {
		ForExpCSImpl forExpCS = new ForExpCSImpl();
		return forExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListTypeCS createListTypeCS() {
		ListTypeCSImpl listTypeCS = new ListTypeCSImpl();
		return listTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListLiteralExpCS createListLiteralExpCS() {
		ListLiteralExpCSImpl listLiteralExpCS = new ListLiteralExpCSImpl();
		return listLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogExpCS createLogExpCS() {
		LogExpCSImpl logExpCS = new LogExpCSImpl();
		return logExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseExpCS createRaiseExpCS() {
		RaiseExpCSImpl raiseExpCS = new RaiseExpCSImpl();
		return raiseExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnExpCS createReturnExpCS() {
		ReturnExpCSImpl returnExpCS = new ReturnExpCSImpl();
		return returnExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchAltCS createSwitchAltCS() {
		SwitchAltCSImpl switchAltCS = new SwitchAltCSImpl();
		return switchAltCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchExpCS createSwitchExpCS() {
		SwitchExpCSImpl switchExpCS = new SwitchExpCSImpl();
		return switchExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryExpCS createTryExpCS() {
		TryExpCSImpl tryExpCS = new TryExpCSImpl();
		return tryExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDeclarationCS createVarDeclarationCS() {
		VarDeclarationCSImpl varDeclarationCS = new VarDeclarationCSImpl();
		return varDeclarationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarsInitializationCS createVarsInitializationCS() {
		VarsInitializationCSImpl varsInitializationCS = new VarsInitializationCSImpl();
		return varsInitializationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileExpCS createWhileExpCS() {
		WhileExpCSImpl whileExpCS = new WhileExpCSImpl();
		return whileExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOCLCSPackage getImperativeOCLCSPackage() {
		return (ImperativeOCLCSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImperativeOCLCSPackage getPackage() {
		return ImperativeOCLCSPackage.eINSTANCE;
	}

} //ImperativeOCLCSFactoryImpl
