/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.ocl.pivot.utilities.Nameable;
import org.eclipse.ocl.pivot.utilities.Pivotable;
import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.basecs.ElementRefCS;
import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.basecs.NamedElementCS;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.basecs.TypeRefCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.basecs.util.VisitableCS;
import org.eclipse.ocl.xtext.essentialoclcs.AbstractNameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;
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
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.StatementCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage
 * @generated
 */
public class ImperativeOCLCSSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ImperativeOCLCSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImperativeOCLCSSwitch() {
		if (modelPackage == null) {
			modelPackage = ImperativeOCLCSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ImperativeOCLCSPackage.ASSERT_EXP_CS: {
				AssertExpCS assertExpCS = (AssertExpCS)theEObject;
				T result = caseAssertExpCS(assertExpCS);
				if (result == null) result = caseStatementCS(assertExpCS);
				if (result == null) result = caseExpCS(assertExpCS);
				if (result == null) result = caseModelElementCS(assertExpCS);
				if (result == null) result = casePivotableElementCS(assertExpCS);
				if (result == null) result = caseElementCS(assertExpCS);
				if (result == null) result = casePivotable(assertExpCS);
				if (result == null) result = caseVisitableCS(assertExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS: {
				AssignExpCS assignExpCS = (AssignExpCS)theEObject;
				T result = caseAssignExpCS(assignExpCS);
				if (result == null) result = caseStatementCS(assignExpCS);
				if (result == null) result = caseExpCS(assignExpCS);
				if (result == null) result = caseModelElementCS(assignExpCS);
				if (result == null) result = casePivotableElementCS(assignExpCS);
				if (result == null) result = caseElementCS(assignExpCS);
				if (result == null) result = casePivotable(assignExpCS);
				if (result == null) result = caseVisitableCS(assignExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.BREAK_EXP_CS: {
				BreakExpCS breakExpCS = (BreakExpCS)theEObject;
				T result = caseBreakExpCS(breakExpCS);
				if (result == null) result = caseStatementCS(breakExpCS);
				if (result == null) result = caseExpCS(breakExpCS);
				if (result == null) result = caseModelElementCS(breakExpCS);
				if (result == null) result = casePivotableElementCS(breakExpCS);
				if (result == null) result = caseElementCS(breakExpCS);
				if (result == null) result = casePivotable(breakExpCS);
				if (result == null) result = caseVisitableCS(breakExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.DICT_LITERAL_EXP_CS: {
				DictLiteralExpCS dictLiteralExpCS = (DictLiteralExpCS)theEObject;
				T result = caseDictLiteralExpCS(dictLiteralExpCS);
				if (result == null) result = caseLiteralExpCS(dictLiteralExpCS);
				if (result == null) result = caseExpCS(dictLiteralExpCS);
				if (result == null) result = caseModelElementCS(dictLiteralExpCS);
				if (result == null) result = casePivotableElementCS(dictLiteralExpCS);
				if (result == null) result = caseElementCS(dictLiteralExpCS);
				if (result == null) result = casePivotable(dictLiteralExpCS);
				if (result == null) result = caseVisitableCS(dictLiteralExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS: {
				DictLiteralPartCS dictLiteralPartCS = (DictLiteralPartCS)theEObject;
				T result = caseDictLiteralPartCS(dictLiteralPartCS);
				if (result == null) result = caseModelElementCS(dictLiteralPartCS);
				if (result == null) result = casePivotableElementCS(dictLiteralPartCS);
				if (result == null) result = caseElementCS(dictLiteralPartCS);
				if (result == null) result = casePivotable(dictLiteralPartCS);
				if (result == null) result = caseVisitableCS(dictLiteralPartCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.DICT_TYPE_CS: {
				DictTypeCS dictTypeCS = (DictTypeCS)theEObject;
				T result = caseDictTypeCS(dictTypeCS);
				if (result == null) result = caseTypedRefCS(dictTypeCS);
				if (result == null) result = caseTypeRefCS(dictTypeCS);
				if (result == null) result = caseElementRefCS(dictTypeCS);
				if (result == null) result = casePivotableElementCS(dictTypeCS);
				if (result == null) result = caseElementCS(dictTypeCS);
				if (result == null) result = casePivotable(dictTypeCS);
				if (result == null) result = caseVisitableCS(dictTypeCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.COMPUTE_EXP_CS: {
				ComputeExpCS computeExpCS = (ComputeExpCS)theEObject;
				T result = caseComputeExpCS(computeExpCS);
				if (result == null) result = caseExpressionBlockCS(computeExpCS);
				if (result == null) result = caseExpCS(computeExpCS);
				if (result == null) result = caseModelElementCS(computeExpCS);
				if (result == null) result = casePivotableElementCS(computeExpCS);
				if (result == null) result = caseElementCS(computeExpCS);
				if (result == null) result = casePivotable(computeExpCS);
				if (result == null) result = caseVisitableCS(computeExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.CONTINUE_EXP_CS: {
				ContinueExpCS continueExpCS = (ContinueExpCS)theEObject;
				T result = caseContinueExpCS(continueExpCS);
				if (result == null) result = caseStatementCS(continueExpCS);
				if (result == null) result = caseExpCS(continueExpCS);
				if (result == null) result = caseModelElementCS(continueExpCS);
				if (result == null) result = casePivotableElementCS(continueExpCS);
				if (result == null) result = caseElementCS(continueExpCS);
				if (result == null) result = casePivotable(continueExpCS);
				if (result == null) result = caseVisitableCS(continueExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.IMPERATIVE_ITERATE_EXP_CS: {
				ImperativeIterateExpCS imperativeIterateExpCS = (ImperativeIterateExpCS)theEObject;
				T result = caseImperativeIterateExpCS(imperativeIterateExpCS);
				if (result == null) result = caseImperativeLoopExpCS(imperativeIterateExpCS);
				if (result == null) result = caseCallExpCS(imperativeIterateExpCS);
				if (result == null) result = caseStatementCS(imperativeIterateExpCS);
				if (result == null) result = caseAbstractNameExpCS(imperativeIterateExpCS);
				if (result == null) result = caseExpCS(imperativeIterateExpCS);
				if (result == null) result = caseModelElementCS(imperativeIterateExpCS);
				if (result == null) result = casePivotableElementCS(imperativeIterateExpCS);
				if (result == null) result = caseElementCS(imperativeIterateExpCS);
				if (result == null) result = casePivotable(imperativeIterateExpCS);
				if (result == null) result = caseVisitableCS(imperativeIterateExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS: {
				ImperativeLoopExpCS imperativeLoopExpCS = (ImperativeLoopExpCS)theEObject;
				T result = caseImperativeLoopExpCS(imperativeLoopExpCS);
				if (result == null) result = caseCallExpCS(imperativeLoopExpCS);
				if (result == null) result = caseStatementCS(imperativeLoopExpCS);
				if (result == null) result = caseAbstractNameExpCS(imperativeLoopExpCS);
				if (result == null) result = caseExpCS(imperativeLoopExpCS);
				if (result == null) result = caseModelElementCS(imperativeLoopExpCS);
				if (result == null) result = casePivotableElementCS(imperativeLoopExpCS);
				if (result == null) result = caseElementCS(imperativeLoopExpCS);
				if (result == null) result = casePivotable(imperativeLoopExpCS);
				if (result == null) result = caseVisitableCS(imperativeLoopExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS: {
				InstantiationExpCS instantiationExpCS = (InstantiationExpCS)theEObject;
				T result = caseInstantiationExpCS(instantiationExpCS);
				if (result == null) result = caseStatementCS(instantiationExpCS);
				if (result == null) result = caseExpCS(instantiationExpCS);
				if (result == null) result = caseModelElementCS(instantiationExpCS);
				if (result == null) result = casePivotableElementCS(instantiationExpCS);
				if (result == null) result = caseElementCS(instantiationExpCS);
				if (result == null) result = casePivotable(instantiationExpCS);
				if (result == null) result = caseVisitableCS(instantiationExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.CATCH_EXP_CS: {
				CatchExpCS catchExpCS = (CatchExpCS)theEObject;
				T result = caseCatchExpCS(catchExpCS);
				if (result == null) result = caseExpressionBlockCS(catchExpCS);
				if (result == null) result = caseExpCS(catchExpCS);
				if (result == null) result = caseModelElementCS(catchExpCS);
				if (result == null) result = casePivotableElementCS(catchExpCS);
				if (result == null) result = caseElementCS(catchExpCS);
				if (result == null) result = casePivotable(catchExpCS);
				if (result == null) result = caseVisitableCS(catchExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.EXPRESSION_BLOCK_CS: {
				ExpressionBlockCS expressionBlockCS = (ExpressionBlockCS)theEObject;
				T result = caseExpressionBlockCS(expressionBlockCS);
				if (result == null) result = caseExpCS(expressionBlockCS);
				if (result == null) result = caseModelElementCS(expressionBlockCS);
				if (result == null) result = casePivotableElementCS(expressionBlockCS);
				if (result == null) result = caseElementCS(expressionBlockCS);
				if (result == null) result = casePivotable(expressionBlockCS);
				if (result == null) result = caseVisitableCS(expressionBlockCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.FOR_EXP_CS: {
				ForExpCS forExpCS = (ForExpCS)theEObject;
				T result = caseForExpCS(forExpCS);
				if (result == null) result = caseImperativeLoopExpCS(forExpCS);
				if (result == null) result = caseCallExpCS(forExpCS);
				if (result == null) result = caseStatementCS(forExpCS);
				if (result == null) result = caseAbstractNameExpCS(forExpCS);
				if (result == null) result = caseExpCS(forExpCS);
				if (result == null) result = caseModelElementCS(forExpCS);
				if (result == null) result = casePivotableElementCS(forExpCS);
				if (result == null) result = caseElementCS(forExpCS);
				if (result == null) result = casePivotable(forExpCS);
				if (result == null) result = caseVisitableCS(forExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.LIST_TYPE_CS: {
				ListTypeCS listTypeCS = (ListTypeCS)theEObject;
				T result = caseListTypeCS(listTypeCS);
				if (result == null) result = caseTypedRefCS(listTypeCS);
				if (result == null) result = caseTypeRefCS(listTypeCS);
				if (result == null) result = caseElementRefCS(listTypeCS);
				if (result == null) result = casePivotableElementCS(listTypeCS);
				if (result == null) result = caseElementCS(listTypeCS);
				if (result == null) result = casePivotable(listTypeCS);
				if (result == null) result = caseVisitableCS(listTypeCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.LIST_LITERAL_EXP_CS: {
				ListLiteralExpCS listLiteralExpCS = (ListLiteralExpCS)theEObject;
				T result = caseListLiteralExpCS(listLiteralExpCS);
				if (result == null) result = caseLiteralExpCS(listLiteralExpCS);
				if (result == null) result = caseExpCS(listLiteralExpCS);
				if (result == null) result = caseModelElementCS(listLiteralExpCS);
				if (result == null) result = casePivotableElementCS(listLiteralExpCS);
				if (result == null) result = caseElementCS(listLiteralExpCS);
				if (result == null) result = casePivotable(listLiteralExpCS);
				if (result == null) result = caseVisitableCS(listLiteralExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.LOG_EXP_CS: {
				LogExpCS logExpCS = (LogExpCS)theEObject;
				T result = caseLogExpCS(logExpCS);
				if (result == null) result = caseCallExpCS(logExpCS);
				if (result == null) result = caseAbstractNameExpCS(logExpCS);
				if (result == null) result = caseExpCS(logExpCS);
				if (result == null) result = caseModelElementCS(logExpCS);
				if (result == null) result = casePivotableElementCS(logExpCS);
				if (result == null) result = caseElementCS(logExpCS);
				if (result == null) result = casePivotable(logExpCS);
				if (result == null) result = caseVisitableCS(logExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.RAISE_EXP_CS: {
				RaiseExpCS raiseExpCS = (RaiseExpCS)theEObject;
				T result = caseRaiseExpCS(raiseExpCS);
				if (result == null) result = caseStatementCS(raiseExpCS);
				if (result == null) result = caseExpCS(raiseExpCS);
				if (result == null) result = caseModelElementCS(raiseExpCS);
				if (result == null) result = casePivotableElementCS(raiseExpCS);
				if (result == null) result = caseElementCS(raiseExpCS);
				if (result == null) result = casePivotable(raiseExpCS);
				if (result == null) result = caseVisitableCS(raiseExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.RETURN_EXP_CS: {
				ReturnExpCS returnExpCS = (ReturnExpCS)theEObject;
				T result = caseReturnExpCS(returnExpCS);
				if (result == null) result = caseExpCS(returnExpCS);
				if (result == null) result = caseModelElementCS(returnExpCS);
				if (result == null) result = casePivotableElementCS(returnExpCS);
				if (result == null) result = caseElementCS(returnExpCS);
				if (result == null) result = casePivotable(returnExpCS);
				if (result == null) result = caseVisitableCS(returnExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.STATEMENT_CS: {
				StatementCS statementCS = (StatementCS)theEObject;
				T result = caseStatementCS(statementCS);
				if (result == null) result = caseExpCS(statementCS);
				if (result == null) result = caseModelElementCS(statementCS);
				if (result == null) result = casePivotableElementCS(statementCS);
				if (result == null) result = caseElementCS(statementCS);
				if (result == null) result = casePivotable(statementCS);
				if (result == null) result = caseVisitableCS(statementCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.SWITCH_ALT_CS: {
				SwitchAltCS switchAltCS = (SwitchAltCS)theEObject;
				T result = caseSwitchAltCS(switchAltCS);
				if (result == null) result = caseStatementCS(switchAltCS);
				if (result == null) result = caseExpCS(switchAltCS);
				if (result == null) result = caseModelElementCS(switchAltCS);
				if (result == null) result = casePivotableElementCS(switchAltCS);
				if (result == null) result = caseElementCS(switchAltCS);
				if (result == null) result = casePivotable(switchAltCS);
				if (result == null) result = caseVisitableCS(switchAltCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.SWITCH_EXP_CS: {
				SwitchExpCS switchExpCS = (SwitchExpCS)theEObject;
				T result = caseSwitchExpCS(switchExpCS);
				if (result == null) result = caseStatementCS(switchExpCS);
				if (result == null) result = caseExpCS(switchExpCS);
				if (result == null) result = caseModelElementCS(switchExpCS);
				if (result == null) result = casePivotableElementCS(switchExpCS);
				if (result == null) result = caseElementCS(switchExpCS);
				if (result == null) result = casePivotable(switchExpCS);
				if (result == null) result = caseVisitableCS(switchExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.TRY_EXP_CS: {
				TryExpCS tryExpCS = (TryExpCS)theEObject;
				T result = caseTryExpCS(tryExpCS);
				if (result == null) result = caseExpressionBlockCS(tryExpCS);
				if (result == null) result = caseExpCS(tryExpCS);
				if (result == null) result = caseModelElementCS(tryExpCS);
				if (result == null) result = casePivotableElementCS(tryExpCS);
				if (result == null) result = caseElementCS(tryExpCS);
				if (result == null) result = casePivotable(tryExpCS);
				if (result == null) result = caseVisitableCS(tryExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.VAR_DECLARATION_CS: {
				VarDeclarationCS varDeclarationCS = (VarDeclarationCS)theEObject;
				T result = caseVarDeclarationCS(varDeclarationCS);
				if (result == null) result = caseVariableCS(varDeclarationCS);
				if (result == null) result = caseNamedElementCS(varDeclarationCS);
				if (result == null) result = caseModelElementCS(varDeclarationCS);
				if (result == null) result = caseNameable(varDeclarationCS);
				if (result == null) result = casePivotableElementCS(varDeclarationCS);
				if (result == null) result = caseElementCS(varDeclarationCS);
				if (result == null) result = casePivotable(varDeclarationCS);
				if (result == null) result = caseVisitableCS(varDeclarationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.VARS_INITIALIZATION_CS: {
				VarsInitializationCS varsInitializationCS = (VarsInitializationCS)theEObject;
				T result = caseVarsInitializationCS(varsInitializationCS);
				if (result == null) result = caseStatementCS(varsInitializationCS);
				if (result == null) result = caseExpCS(varsInitializationCS);
				if (result == null) result = caseModelElementCS(varsInitializationCS);
				if (result == null) result = casePivotableElementCS(varsInitializationCS);
				if (result == null) result = caseElementCS(varsInitializationCS);
				if (result == null) result = casePivotable(varsInitializationCS);
				if (result == null) result = caseVisitableCS(varsInitializationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ImperativeOCLCSPackage.WHILE_EXP_CS: {
				WhileExpCS whileExpCS = (WhileExpCS)theEObject;
				T result = caseWhileExpCS(whileExpCS);
				if (result == null) result = caseExpressionBlockCS(whileExpCS);
				if (result == null) result = caseExpCS(whileExpCS);
				if (result == null) result = caseModelElementCS(whileExpCS);
				if (result == null) result = casePivotableElementCS(whileExpCS);
				if (result == null) result = caseElementCS(whileExpCS);
				if (result == null) result = casePivotable(whileExpCS);
				if (result == null) result = caseVisitableCS(whileExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertExpCS(AssertExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignExpCS(AssignExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakExpCS(BreakExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dict Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dict Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictLiteralExpCS(DictLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dict Literal Part CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dict Literal Part CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictLiteralPartCS(DictLiteralPartCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dict Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dict Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictTypeCS(DictTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputeExpCS(ComputeExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueExpCS(ContinueExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imperative Iterate Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imperative Iterate Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImperativeIterateExpCS(ImperativeIterateExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imperative Loop Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imperative Loop Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImperativeLoopExpCS(ImperativeLoopExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instantiation Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instantiation Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantiationExpCS(InstantiationExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchExpCS(CatchExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Block CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Block CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionBlockCS(ExpressionBlockCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForExpCS(ForExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Type CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListTypeCS(ListTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListLiteralExpCS(ListLiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogExpCS(LogExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raise Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raise Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaiseExpCS(RaiseExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnExpCS(ReturnExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementCS(StatementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Alt CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Alt CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchAltCS(SwitchAltCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchExpCS(SwitchExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryExpCS(TryExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Declaration CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Declaration CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarDeclarationCS(VarDeclarationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vars Initialization CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vars Initialization CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarsInitializationCS(VarsInitializationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileExpCS(WhileExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitableCS(VisitableCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCS(ElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotable(Pivotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotableElementCS(PivotableElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementCS(ModelElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpCS(ExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralExpCS(LiteralExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRefCS(ElementRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRefCS(TypeRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Ref CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedRefCS(TypedRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Name Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Name Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNameExpCS(AbstractNameExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Exp CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallExpCS(CallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementCS(NamedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableCS(VariableCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ImperativeOCLCSSwitch
