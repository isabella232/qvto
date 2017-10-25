/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignOpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.BreakExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ContinueExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ExtentRefCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ForExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeIterateExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSFactory;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.InitOpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SeverityKindCS;
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
		case ImperativeOCLCSPackage.EXTENT_REF_CS: return createExtentRefCS();
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
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ImperativeOCLCSPackage.ASSIGN_OP_CS:
			return createAssignOpCSFromString(eDataType, initialValue);
		case ImperativeOCLCSPackage.INIT_OP_CS:
			return createInitOpCSFromString(eDataType, initialValue);
		case ImperativeOCLCSPackage.SEVERITY_KIND_CS:
			return createSeverityKindCSFromString(eDataType, initialValue);
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
		case ImperativeOCLCSPackage.ASSIGN_OP_CS:
			return convertAssignOpCSToString(eDataType, instanceValue);
		case ImperativeOCLCSPackage.INIT_OP_CS:
			return convertInitOpCSToString(eDataType, instanceValue);
		case ImperativeOCLCSPackage.SEVERITY_KIND_CS:
			return convertSeverityKindCSToString(eDataType, instanceValue);
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
	public AssertExpCS createAssertExpCS() {
		AssertExpCSImpl assertExpCS = new AssertExpCSImpl();
		return assertExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssignExpCS createAssignExpCS() {
		AssignExpCSImpl assignExpCS = new AssignExpCSImpl();
		return assignExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakExpCS createBreakExpCS() {
		BreakExpCSImpl breakExpCS = new BreakExpCSImpl();
		return breakExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictLiteralExpCS createDictLiteralExpCS() {
		DictLiteralExpCSImpl dictLiteralExpCS = new DictLiteralExpCSImpl();
		return dictLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictLiteralPartCS createDictLiteralPartCS() {
		DictLiteralPartCSImpl dictLiteralPartCS = new DictLiteralPartCSImpl();
		return dictLiteralPartCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictTypeCS createDictTypeCS() {
		DictTypeCSImpl dictTypeCS = new DictTypeCSImpl();
		return dictTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputeExpCS createComputeExpCS() {
		ComputeExpCSImpl computeExpCS = new ComputeExpCSImpl();
		return computeExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinueExpCS createContinueExpCS() {
		ContinueExpCSImpl continueExpCS = new ContinueExpCSImpl();
		return continueExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImperativeIterateExpCS createImperativeIterateExpCS() {
		ImperativeIterateExpCSImpl imperativeIterateExpCS = new ImperativeIterateExpCSImpl();
		return imperativeIterateExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImperativeLoopExpCS createImperativeLoopExpCS() {
		ImperativeLoopExpCSImpl imperativeLoopExpCS = new ImperativeLoopExpCSImpl();
		return imperativeLoopExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstantiationExpCS createInstantiationExpCS() {
		InstantiationExpCSImpl instantiationExpCS = new InstantiationExpCSImpl();
		return instantiationExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchExpCS createCatchExpCS() {
		CatchExpCSImpl catchExpCS = new CatchExpCSImpl();
		return catchExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionBlockCS createExpressionBlockCS() {
		ExpressionBlockCSImpl expressionBlockCS = new ExpressionBlockCSImpl();
		return expressionBlockCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtentRefCS createExtentRefCS() {
		ExtentRefCSImpl extentRefCS = new ExtentRefCSImpl();
		return extentRefCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForExpCS createForExpCS() {
		ForExpCSImpl forExpCS = new ForExpCSImpl();
		return forExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListTypeCS createListTypeCS() {
		ListTypeCSImpl listTypeCS = new ListTypeCSImpl();
		return listTypeCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListLiteralExpCS createListLiteralExpCS() {
		ListLiteralExpCSImpl listLiteralExpCS = new ListLiteralExpCSImpl();
		return listLiteralExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogExpCS createLogExpCS() {
		LogExpCSImpl logExpCS = new LogExpCSImpl();
		return logExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RaiseExpCS createRaiseExpCS() {
		RaiseExpCSImpl raiseExpCS = new RaiseExpCSImpl();
		return raiseExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnExpCS createReturnExpCS() {
		ReturnExpCSImpl returnExpCS = new ReturnExpCSImpl();
		return returnExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchAltCS createSwitchAltCS() {
		SwitchAltCSImpl switchAltCS = new SwitchAltCSImpl();
		return switchAltCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchExpCS createSwitchExpCS() {
		SwitchExpCSImpl switchExpCS = new SwitchExpCSImpl();
		return switchExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryExpCS createTryExpCS() {
		TryExpCSImpl tryExpCS = new TryExpCSImpl();
		return tryExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarDeclarationCS createVarDeclarationCS() {
		VarDeclarationCSImpl varDeclarationCS = new VarDeclarationCSImpl();
		return varDeclarationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarsInitializationCS createVarsInitializationCS() {
		VarsInitializationCSImpl varsInitializationCS = new VarsInitializationCSImpl();
		return varsInitializationCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileExpCS createWhileExpCS() {
		WhileExpCSImpl whileExpCS = new WhileExpCSImpl();
		return whileExpCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignOpCS createAssignOpCSFromString(EDataType eDataType, String initialValue) {
		AssignOpCS result = AssignOpCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignOpCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitOpCS createInitOpCSFromString(EDataType eDataType, String initialValue) {
		InitOpCS result = InitOpCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitOpCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityKindCS createSeverityKindCSFromString(EDataType eDataType, String initialValue) {
		SeverityKindCS result = SeverityKindCS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityKindCSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
