/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assign Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedLeft <em>Owned Left</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedValue <em>Owned Value</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getAssignOp <em>Assign Op</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssignExpCS()
 * @model
 * @generated
 */
public interface AssignExpCS extends StatementCS {
	/**
	 * Returns the value of the '<em><b>Owned Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Left</em>' containment reference.
	 * @see #setOwnedLeft(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssignExpCS_OwnedLeft()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpCS getOwnedLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedLeft <em>Owned Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Left</em>' containment reference.
	 * @see #getOwnedLeft()
	 * @generated
	 */
	void setOwnedLeft(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Value</em>' containment reference.
	 * @see #setOwnedValue(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssignExpCS_OwnedValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpCS getOwnedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedValue <em>Owned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Value</em>' containment reference.
	 * @see #getOwnedValue()
	 * @generated
	 */
	void setOwnedValue(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Assign Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assign Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assign Op</em>' attribute.
	 * @see #setAssignOp(String)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssignExpCS_AssignOp()
	 * @model
	 * @generated
	 */
	String getAssignOp();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getAssignOp <em>Assign Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assign Op</em>' attribute.
	 * @see #getAssignOp()
	 * @generated
	 */
	void setAssignOp(String value);

	/**
	 * Returns the value of the '<em><b>Owned Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default</em>' containment reference.
	 * @see #setOwnedDefault(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssignExpCS_OwnedDefault()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS#getOwnedDefault <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default</em>' containment reference.
	 * @see #getOwnedDefault()
	 * @generated
	 */
	void setOwnedDefault(ExpCS value);

} // AssignExpCS
