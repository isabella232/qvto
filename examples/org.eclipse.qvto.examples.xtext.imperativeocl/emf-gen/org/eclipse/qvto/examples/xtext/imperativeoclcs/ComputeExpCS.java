/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS#getOwnedResultVar <em>Owned Result Var</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getComputeExpCS()
 * @model
 * @generated
 */
public interface ComputeExpCS extends ExpressionBlockCS {
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
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getComputeExpCS_OwnedResultVar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VarDeclarationCS getOwnedResultVar();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS#getOwnedResultVar <em>Owned Result Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Result Var</em>' containment reference.
	 * @see #getOwnedResultVar()
	 * @generated
	 */
	void setOwnedResultVar(VarDeclarationCS value);

} // ComputeExpCS
