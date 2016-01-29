/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedResultVar <em>Owned Result Var</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getWhileExpCS()
 * @model
 * @generated
 */
public interface WhileExpCS extends ExpressionBlockCS {
	/**
	 * Returns the value of the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Condition</em>' containment reference.
	 * @see #setOwnedCondition(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getWhileExpCS_OwnedCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpCS getOwnedCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedCondition <em>Owned Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Condition</em>' containment reference.
	 * @see #getOwnedCondition()
	 * @generated
	 */
	void setOwnedCondition(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Result Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Result Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Result Var</em>' containment reference.
	 * @see #setOwnedResultVar(VarDeclarationCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getWhileExpCS_OwnedResultVar()
	 * @model containment="true"
	 * @generated
	 */
	VarDeclarationCS getOwnedResultVar();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS#getOwnedResultVar <em>Owned Result Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Result Var</em>' containment reference.
	 * @see #getOwnedResultVar()
	 * @generated
	 */
	void setOwnedResultVar(VarDeclarationCS value);

} // WhileExpCS
