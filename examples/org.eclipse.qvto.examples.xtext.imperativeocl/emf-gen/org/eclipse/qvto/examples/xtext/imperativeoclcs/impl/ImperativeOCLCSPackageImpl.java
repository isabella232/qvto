/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;
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
import org.eclipse.qvto.examples.xtext.imperativeoclcs.StatementCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImperativeOCLCSPackageImpl extends EPackageImpl implements ImperativeOCLCSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictLiteralExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictLiteralPartCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictTypeCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computeExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperativeIterateExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imperativeLoopExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionBlockCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentRefCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listTypeCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listLiteralExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchAltCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDeclarationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varsInitializationCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileExpCSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assignOpCSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initOpCSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityKindCSEEnum = null;

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
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImperativeOCLCSPackageImpl() {
		super(eNS_URI, ImperativeOCLCSFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImperativeOCLCSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImperativeOCLCSPackage init() {
		if (isInited) return (ImperativeOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(ImperativeOCLCSPackage.eNS_URI);

		// Obtain or create and register package
		Object ePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImperativeOCLCSPackageImpl theImperativeOCLCSPackage = (ImperativeOCLCSPackageImpl)(ePackage instanceof ImperativeOCLCSPackageImpl ? ePackage : new ImperativeOCLCSPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EssentialOCLCSPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theImperativeOCLCSPackage.createPackageContents();

		// Initialize created meta-data
		theImperativeOCLCSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImperativeOCLCSPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImperativeOCLCSPackage.eNS_URI, theImperativeOCLCSPackage);
		return theImperativeOCLCSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertExpCS() {
		return assertExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertExpCS_OwnedAssertion() {
		return (EReference)assertExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertExpCS_OwnedLog() {
		return (EReference)assertExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertExpCS_Severity() {
		return (EAttribute)assertExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignExpCS() {
		return assignExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignExpCS_OwnedLeft() {
		return (EReference)assignExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignExpCS_OwnedValue() {
		return (EReference)assignExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignExpCS_AssignOp() {
		return (EAttribute)assignExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignExpCS_OwnedDefault() {
		return (EReference)assignExpCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreakExpCS() {
		return breakExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictLiteralExpCS() {
		return dictLiteralExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictLiteralExpCS_OwnedParts() {
		return (EReference)dictLiteralExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictLiteralPartCS() {
		return dictLiteralPartCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictLiteralPartCS_OwnedKey() {
		return (EReference)dictLiteralPartCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictLiteralPartCS_OwnedValue() {
		return (EReference)dictLiteralPartCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictTypeCS() {
		return dictTypeCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictTypeCS_OwnedKeyTypeRef() {
		return (EReference)dictTypeCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictTypeCS_OwnedValueTypeRef() {
		return (EReference)dictTypeCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputeExpCS() {
		return computeExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComputeExpCS_OwnedResultVar() {
		return (EReference)computeExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinueExpCS() {
		return continueExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperativeIterateExpCS() {
		return imperativeIterateExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImperativeLoopExpCS() {
		return imperativeLoopExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeLoopExpCS_OwnedCondition() {
		return (EReference)imperativeLoopExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeLoopExpCS_OwnedTarget() {
		return (EReference)imperativeLoopExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeLoopExpCS_OwnedIterator() {
		return (EReference)imperativeLoopExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImperativeLoopExpCS_OwnedBody() {
		return (EReference)imperativeLoopExpCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImperativeLoopExpCS_Name() {
		return (EAttribute)imperativeLoopExpCSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiationExpCS() {
		return instantiationExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationExpCS_OwnedClassRef() {
		return (EReference)instantiationExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationExpCS_OwnedArguments() {
		return (EReference)instantiationExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationExpCS_OwnedExtentRef() {
		return (EReference)instantiationExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchExpCS() {
		return catchExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchExpCS_OwnedExceptionRefs() {
		return (EReference)catchExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatchExpCS_VarName() {
		return (EAttribute)catchExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpressionBlockCS() {
		return expressionBlockCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpressionBlockCS_OwnedExps() {
		return (EReference)expressionBlockCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtentRefCS() {
		return extentRefCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtentRefCS_OwnedPathName() {
		return (EReference)extentRefCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForExpCS() {
		return forExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForExpCS_IsOne() {
		return (EAttribute)forExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListTypeCS() {
		return listTypeCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListTypeCS_OwnedTypeRef() {
		return (EReference)listTypeCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListLiteralExpCS() {
		return listLiteralExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListLiteralExpCS_OwnedParts() {
		return (EReference)listLiteralExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogExpCS() {
		return logExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogExpCS_OwnedMessage() {
		return (EReference)logExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogExpCS_OwnedElement() {
		return (EReference)logExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogExpCS_Severity() {
		return (EAttribute)logExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogExpCS_OwnedCondition() {
		return (EReference)logExpCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExpCS() {
		return raiseExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExpCS_OwnedExceptionRef() {
		return (EReference)raiseExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExpCS_OwnedArguments() {
		return (EReference)raiseExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnExpCS() {
		return returnExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnExpCS_OwnedValue() {
		return (EReference)returnExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatementCS() {
		return statementCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchAltCS() {
		return switchAltCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchAltCS_OwnedCondition() {
		return (EReference)switchAltCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchAltCS_OwnedBody() {
		return (EReference)switchAltCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchExpCS() {
		return switchExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpCS_OwnedAltParts() {
		return (EReference)switchExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpCS_OwnedElsePart() {
		return (EReference)switchExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpCS_OwnedIterator() {
		return (EReference)switchExpCSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchExpCS_IfSyntax() {
		return (EAttribute)switchExpCSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTryExpCS() {
		return tryExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTryExpCS_OwnedCatchs() {
		return (EReference)tryExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarDeclarationCS() {
		return varDeclarationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarDeclarationCS_InitOp() {
		return (EAttribute)varDeclarationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarsInitializationCS() {
		return varsInitializationCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarsInitializationCS_OwnedVarDeclarations() {
		return (EReference)varsInitializationCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileExpCS() {
		return whileExpCSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileExpCS_OwnedCondition() {
		return (EReference)whileExpCSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileExpCS_OwnedResultVar() {
		return (EReference)whileExpCSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssignOpCS() {
		return assignOpCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitOpCS() {
		return initOpCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverityKindCS() {
		return severityKindCSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOCLCSFactory getImperativeOCLCSFactory() {
		return (ImperativeOCLCSFactory)getEFactoryInstance();
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
		assertExpCSEClass = createEClass(ASSERT_EXP_CS);
		createEReference(assertExpCSEClass, ASSERT_EXP_CS__OWNED_ASSERTION);
		createEReference(assertExpCSEClass, ASSERT_EXP_CS__OWNED_LOG);
		createEAttribute(assertExpCSEClass, ASSERT_EXP_CS__SEVERITY);

		assignExpCSEClass = createEClass(ASSIGN_EXP_CS);
		createEReference(assignExpCSEClass, ASSIGN_EXP_CS__OWNED_LEFT);
		createEReference(assignExpCSEClass, ASSIGN_EXP_CS__OWNED_VALUE);
		createEAttribute(assignExpCSEClass, ASSIGN_EXP_CS__ASSIGN_OP);
		createEReference(assignExpCSEClass, ASSIGN_EXP_CS__OWNED_DEFAULT);

		breakExpCSEClass = createEClass(BREAK_EXP_CS);

		dictLiteralExpCSEClass = createEClass(DICT_LITERAL_EXP_CS);
		createEReference(dictLiteralExpCSEClass, DICT_LITERAL_EXP_CS__OWNED_PARTS);

		dictLiteralPartCSEClass = createEClass(DICT_LITERAL_PART_CS);
		createEReference(dictLiteralPartCSEClass, DICT_LITERAL_PART_CS__OWNED_KEY);
		createEReference(dictLiteralPartCSEClass, DICT_LITERAL_PART_CS__OWNED_VALUE);

		dictTypeCSEClass = createEClass(DICT_TYPE_CS);
		createEReference(dictTypeCSEClass, DICT_TYPE_CS__OWNED_KEY_TYPE_REF);
		createEReference(dictTypeCSEClass, DICT_TYPE_CS__OWNED_VALUE_TYPE_REF);

		computeExpCSEClass = createEClass(COMPUTE_EXP_CS);
		createEReference(computeExpCSEClass, COMPUTE_EXP_CS__OWNED_RESULT_VAR);

		continueExpCSEClass = createEClass(CONTINUE_EXP_CS);

		imperativeIterateExpCSEClass = createEClass(IMPERATIVE_ITERATE_EXP_CS);

		imperativeLoopExpCSEClass = createEClass(IMPERATIVE_LOOP_EXP_CS);
		createEReference(imperativeLoopExpCSEClass, IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION);
		createEReference(imperativeLoopExpCSEClass, IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET);
		createEReference(imperativeLoopExpCSEClass, IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR);
		createEReference(imperativeLoopExpCSEClass, IMPERATIVE_LOOP_EXP_CS__OWNED_BODY);
		createEAttribute(imperativeLoopExpCSEClass, IMPERATIVE_LOOP_EXP_CS__NAME);

		instantiationExpCSEClass = createEClass(INSTANTIATION_EXP_CS);
		createEReference(instantiationExpCSEClass, INSTANTIATION_EXP_CS__OWNED_CLASS_REF);
		createEReference(instantiationExpCSEClass, INSTANTIATION_EXP_CS__OWNED_ARGUMENTS);
		createEReference(instantiationExpCSEClass, INSTANTIATION_EXP_CS__OWNED_EXTENT_REF);

		catchExpCSEClass = createEClass(CATCH_EXP_CS);
		createEReference(catchExpCSEClass, CATCH_EXP_CS__OWNED_EXCEPTION_REFS);
		createEAttribute(catchExpCSEClass, CATCH_EXP_CS__VAR_NAME);

		expressionBlockCSEClass = createEClass(EXPRESSION_BLOCK_CS);
		createEReference(expressionBlockCSEClass, EXPRESSION_BLOCK_CS__OWNED_EXPS);

		extentRefCSEClass = createEClass(EXTENT_REF_CS);
		createEReference(extentRefCSEClass, EXTENT_REF_CS__OWNED_PATH_NAME);

		forExpCSEClass = createEClass(FOR_EXP_CS);
		createEAttribute(forExpCSEClass, FOR_EXP_CS__IS_ONE);

		listTypeCSEClass = createEClass(LIST_TYPE_CS);
		createEReference(listTypeCSEClass, LIST_TYPE_CS__OWNED_TYPE_REF);

		listLiteralExpCSEClass = createEClass(LIST_LITERAL_EXP_CS);
		createEReference(listLiteralExpCSEClass, LIST_LITERAL_EXP_CS__OWNED_PARTS);

		logExpCSEClass = createEClass(LOG_EXP_CS);
		createEReference(logExpCSEClass, LOG_EXP_CS__OWNED_MESSAGE);
		createEReference(logExpCSEClass, LOG_EXP_CS__OWNED_ELEMENT);
		createEAttribute(logExpCSEClass, LOG_EXP_CS__SEVERITY);
		createEReference(logExpCSEClass, LOG_EXP_CS__OWNED_CONDITION);

		raiseExpCSEClass = createEClass(RAISE_EXP_CS);
		createEReference(raiseExpCSEClass, RAISE_EXP_CS__OWNED_EXCEPTION_REF);
		createEReference(raiseExpCSEClass, RAISE_EXP_CS__OWNED_ARGUMENTS);

		returnExpCSEClass = createEClass(RETURN_EXP_CS);
		createEReference(returnExpCSEClass, RETURN_EXP_CS__OWNED_VALUE);

		statementCSEClass = createEClass(STATEMENT_CS);

		switchAltCSEClass = createEClass(SWITCH_ALT_CS);
		createEReference(switchAltCSEClass, SWITCH_ALT_CS__OWNED_CONDITION);
		createEReference(switchAltCSEClass, SWITCH_ALT_CS__OWNED_BODY);

		switchExpCSEClass = createEClass(SWITCH_EXP_CS);
		createEReference(switchExpCSEClass, SWITCH_EXP_CS__OWNED_ALT_PARTS);
		createEReference(switchExpCSEClass, SWITCH_EXP_CS__OWNED_ELSE_PART);
		createEReference(switchExpCSEClass, SWITCH_EXP_CS__OWNED_ITERATOR);
		createEAttribute(switchExpCSEClass, SWITCH_EXP_CS__IF_SYNTAX);

		tryExpCSEClass = createEClass(TRY_EXP_CS);
		createEReference(tryExpCSEClass, TRY_EXP_CS__OWNED_CATCHS);

		varDeclarationCSEClass = createEClass(VAR_DECLARATION_CS);
		createEAttribute(varDeclarationCSEClass, VAR_DECLARATION_CS__INIT_OP);

		varsInitializationCSEClass = createEClass(VARS_INITIALIZATION_CS);
		createEReference(varsInitializationCSEClass, VARS_INITIALIZATION_CS__OWNED_VAR_DECLARATIONS);

		whileExpCSEClass = createEClass(WHILE_EXP_CS);
		createEReference(whileExpCSEClass, WHILE_EXP_CS__OWNED_CONDITION);
		createEReference(whileExpCSEClass, WHILE_EXP_CS__OWNED_RESULT_VAR);

		// Create enums
		assignOpCSEEnum = createEEnum(ASSIGN_OP_CS);
		initOpCSEEnum = createEEnum(INIT_OP_CS);
		severityKindCSEEnum = createEEnum(SEVERITY_KIND_CS);
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
		EssentialOCLCSPackage theEssentialOCLCSPackage = (EssentialOCLCSPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSPackage.eNS_URI);
		BaseCSPackage theBaseCSPackage = (BaseCSPackage)EPackage.Registry.INSTANCE.getEPackage(BaseCSPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assertExpCSEClass.getESuperTypes().add(this.getStatementCS());
		assignExpCSEClass.getESuperTypes().add(this.getStatementCS());
		breakExpCSEClass.getESuperTypes().add(this.getStatementCS());
		dictLiteralExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getLiteralExpCS());
		dictLiteralPartCSEClass.getESuperTypes().add(theBaseCSPackage.getModelElementCS());
		dictTypeCSEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		computeExpCSEClass.getESuperTypes().add(this.getExpressionBlockCS());
		continueExpCSEClass.getESuperTypes().add(this.getStatementCS());
		imperativeIterateExpCSEClass.getESuperTypes().add(this.getImperativeLoopExpCS());
		imperativeLoopExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getCallExpCS());
		imperativeLoopExpCSEClass.getESuperTypes().add(this.getStatementCS());
		instantiationExpCSEClass.getESuperTypes().add(this.getStatementCS());
		catchExpCSEClass.getESuperTypes().add(this.getExpressionBlockCS());
		expressionBlockCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		expressionBlockCSEClass.getESuperTypes().add(this.getStatementCS());
		extentRefCSEClass.getESuperTypes().add(theBaseCSPackage.getElementRefCS());
		forExpCSEClass.getESuperTypes().add(this.getImperativeLoopExpCS());
		listTypeCSEClass.getESuperTypes().add(theBaseCSPackage.getTypedRefCS());
		listLiteralExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getLiteralExpCS());
		logExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getCallExpCS());
		raiseExpCSEClass.getESuperTypes().add(this.getStatementCS());
		returnExpCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		statementCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getExpCS());
		switchAltCSEClass.getESuperTypes().add(this.getStatementCS());
		switchExpCSEClass.getESuperTypes().add(this.getStatementCS());
		tryExpCSEClass.getESuperTypes().add(this.getExpressionBlockCS());
		varDeclarationCSEClass.getESuperTypes().add(theEssentialOCLCSPackage.getVariableCS());
		varsInitializationCSEClass.getESuperTypes().add(this.getStatementCS());
		whileExpCSEClass.getESuperTypes().add(this.getExpressionBlockCS());

		// Initialize classes and features; add operations and parameters
		initEClass(assertExpCSEClass, AssertExpCS.class, "AssertExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertExpCS_OwnedAssertion(), theEssentialOCLCSPackage.getExpCS(), null, "ownedAssertion", null, 1, 1, AssertExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertExpCS_OwnedLog(), this.getLogExpCS(), null, "ownedLog", null, 0, 1, AssertExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertExpCS_Severity(), this.getSeverityKindCS(), "severity", null, 0, 1, AssertExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignExpCSEClass, AssignExpCS.class, "AssignExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignExpCS_OwnedLeft(), theEssentialOCLCSPackage.getExpCS(), null, "ownedLeft", null, 1, 1, AssignExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignExpCS_OwnedValue(), theEssentialOCLCSPackage.getExpCS(), null, "ownedValue", null, 1, 1, AssignExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignExpCS_AssignOp(), this.getAssignOpCS(), "assignOp", null, 0, 1, AssignExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignExpCS_OwnedDefault(), theEssentialOCLCSPackage.getExpCS(), null, "ownedDefault", null, 0, 1, AssignExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(breakExpCSEClass, BreakExpCS.class, "BreakExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dictLiteralExpCSEClass, DictLiteralExpCS.class, "DictLiteralExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictLiteralExpCS_OwnedParts(), this.getDictLiteralPartCS(), null, "ownedParts", null, 0, -1, DictLiteralExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictLiteralPartCSEClass, DictLiteralPartCS.class, "DictLiteralPartCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictLiteralPartCS_OwnedKey(), theEssentialOCLCSPackage.getPrimitiveLiteralExpCS(), null, "ownedKey", null, 1, 1, DictLiteralPartCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDictLiteralPartCS_OwnedValue(), theEssentialOCLCSPackage.getExpCS(), null, "ownedValue", null, 1, 1, DictLiteralPartCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictTypeCSEClass, DictTypeCS.class, "DictTypeCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictTypeCS_OwnedKeyTypeRef(), theBaseCSPackage.getTypedRefCS(), null, "ownedKeyTypeRef", null, 0, 1, DictTypeCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDictTypeCS_OwnedValueTypeRef(), theBaseCSPackage.getTypedRefCS(), null, "ownedValueTypeRef", null, 0, 1, DictTypeCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(computeExpCSEClass, ComputeExpCS.class, "ComputeExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComputeExpCS_OwnedResultVar(), this.getVarDeclarationCS(), null, "ownedResultVar", null, 1, 1, ComputeExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(continueExpCSEClass, ContinueExpCS.class, "ContinueExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imperativeIterateExpCSEClass, ImperativeIterateExpCS.class, "ImperativeIterateExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imperativeLoopExpCSEClass, ImperativeLoopExpCS.class, "ImperativeLoopExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImperativeLoopExpCS_OwnedCondition(), theEssentialOCLCSPackage.getExpCS(), null, "ownedCondition", null, 0, 1, ImperativeLoopExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeLoopExpCS_OwnedTarget(), theEssentialOCLCSPackage.getVariableCS(), null, "ownedTarget", null, 0, 1, ImperativeLoopExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeLoopExpCS_OwnedIterator(), theEssentialOCLCSPackage.getVariableCS(), null, "ownedIterator", null, 0, 1, ImperativeLoopExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImperativeLoopExpCS_OwnedBody(), theEssentialOCLCSPackage.getExpCS(), null, "ownedBody", null, 0, 1, ImperativeLoopExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImperativeLoopExpCS_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ImperativeLoopExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantiationExpCSEClass, InstantiationExpCS.class, "InstantiationExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantiationExpCS_OwnedClassRef(), theBaseCSPackage.getTypeRefCS(), null, "ownedClassRef", null, 1, 1, InstantiationExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantiationExpCS_OwnedArguments(), theEssentialOCLCSPackage.getExpCS(), null, "ownedArguments", null, 0, -1, InstantiationExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstantiationExpCS_OwnedExtentRef(), theBaseCSPackage.getTypedRefCS(), null, "ownedExtentRef", null, 0, 1, InstantiationExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(catchExpCSEClass, CatchExpCS.class, "CatchExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCatchExpCS_OwnedExceptionRefs(), theBaseCSPackage.getTypedRefCS(), null, "ownedExceptionRefs", null, 0, -1, CatchExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCatchExpCS_VarName(), theEcorePackage.getEString(), "varName", null, 0, 1, CatchExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionBlockCSEClass, ExpressionBlockCS.class, "ExpressionBlockCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpressionBlockCS_OwnedExps(), theEssentialOCLCSPackage.getExpCS(), null, "ownedExps", null, 0, -1, ExpressionBlockCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extentRefCSEClass, ExtentRefCS.class, "ExtentRefCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtentRefCS_OwnedPathName(), theBaseCSPackage.getPathNameCS(), null, "ownedPathName", null, 1, 1, ExtentRefCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forExpCSEClass, ForExpCS.class, "ForExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForExpCS_IsOne(), theEcorePackage.getEBooleanObject(), "isOne", null, 0, 1, ForExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listTypeCSEClass, ListTypeCS.class, "ListTypeCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListTypeCS_OwnedTypeRef(), theBaseCSPackage.getTypedRefCS(), null, "ownedTypeRef", null, 0, 1, ListTypeCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listLiteralExpCSEClass, ListLiteralExpCS.class, "ListLiteralExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListLiteralExpCS_OwnedParts(), theEssentialOCLCSPackage.getCollectionLiteralPartCS(), null, "ownedParts", null, 0, -1, ListLiteralExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logExpCSEClass, LogExpCS.class, "LogExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogExpCS_OwnedMessage(), theEssentialOCLCSPackage.getStringLiteralExpCS(), null, "ownedMessage", null, 1, 1, LogExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogExpCS_OwnedElement(), theEssentialOCLCSPackage.getExpCS(), null, "ownedElement", null, 0, 1, LogExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogExpCS_Severity(), this.getSeverityKindCS(), "severity", null, 0, 1, LogExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogExpCS_OwnedCondition(), theEssentialOCLCSPackage.getExpCS(), null, "ownedCondition", null, 0, 1, LogExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(raiseExpCSEClass, RaiseExpCS.class, "RaiseExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaiseExpCS_OwnedExceptionRef(), theBaseCSPackage.getTypedRefCS(), null, "ownedExceptionRef", null, 1, 1, RaiseExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRaiseExpCS_OwnedArguments(), theEssentialOCLCSPackage.getExpCS(), null, "ownedArguments", null, 0, -1, RaiseExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnExpCSEClass, ReturnExpCS.class, "ReturnExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnExpCS_OwnedValue(), theEssentialOCLCSPackage.getExpCS(), null, "ownedValue", null, 0, 1, ReturnExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementCSEClass, StatementCS.class, "StatementCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(switchAltCSEClass, SwitchAltCS.class, "SwitchAltCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchAltCS_OwnedCondition(), theEssentialOCLCSPackage.getExpCS(), null, "ownedCondition", null, 1, 1, SwitchAltCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchAltCS_OwnedBody(), theEssentialOCLCSPackage.getExpCS(), null, "ownedBody", null, 1, 1, SwitchAltCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchExpCSEClass, SwitchExpCS.class, "SwitchExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchExpCS_OwnedAltParts(), this.getSwitchAltCS(), null, "ownedAltParts", null, 1, -1, SwitchExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchExpCS_OwnedElsePart(), theEssentialOCLCSPackage.getExpCS(), null, "ownedElsePart", null, 0, 1, SwitchExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchExpCS_OwnedIterator(), theEssentialOCLCSPackage.getVariableCS(), null, "ownedIterator", null, 0, 1, SwitchExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwitchExpCS_IfSyntax(), ecorePackage.getEBooleanObject(), "ifSyntax", null, 0, 1, SwitchExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tryExpCSEClass, TryExpCS.class, "TryExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTryExpCS_OwnedCatchs(), this.getCatchExpCS(), null, "ownedCatchs", null, 1, -1, TryExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varDeclarationCSEClass, VarDeclarationCS.class, "VarDeclarationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarDeclarationCS_InitOp(), this.getInitOpCS(), "initOp", null, 0, 1, VarDeclarationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varsInitializationCSEClass, VarsInitializationCS.class, "VarsInitializationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarsInitializationCS_OwnedVarDeclarations(), this.getVarDeclarationCS(), null, "ownedVarDeclarations", null, 1, -1, VarsInitializationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileExpCSEClass, WhileExpCS.class, "WhileExpCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhileExpCS_OwnedCondition(), theEssentialOCLCSPackage.getExpCS(), null, "ownedCondition", null, 1, 1, WhileExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileExpCS_OwnedResultVar(), this.getVarDeclarationCS(), null, "ownedResultVar", null, 0, 1, WhileExpCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assignOpCSEEnum, AssignOpCS.class, "AssignOpCS");
		addEEnumLiteral(assignOpCSEEnum, AssignOpCS.SINGLE);
		addEEnumLiteral(assignOpCSEEnum, AssignOpCS.MULTI_WITH_RESET);
		addEEnumLiteral(assignOpCSEEnum, AssignOpCS.MULTI_WITHOUT_RESET);

		initEEnum(initOpCSEEnum, InitOpCS.class, "InitOpCS");
		addEEnumLiteral(initOpCSEEnum, InitOpCS.EQUALS);
		addEEnumLiteral(initOpCSEEnum, InitOpCS.COLON_EQUALS);
		addEEnumLiteral(initOpCSEEnum, InitOpCS.COLON_COLON_EQUALS);

		initEEnum(severityKindCSEEnum, SeverityKindCS.class, "SeverityKindCS");
		addEEnumLiteral(severityKindCSEEnum, SeverityKindCS.ERROR);
		addEEnumLiteral(severityKindCSEEnum, SeverityKindCS.WARNING);
		addEEnumLiteral(severityKindCSEEnum, SeverityKindCS.FATAL);

		// Create resource
		createResource(eNS_URI);
	}

} //ImperativeOCLCSPackageImpl
