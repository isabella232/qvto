/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Alt CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedBody <em>Owned Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchAltCS()
 * @model
 * @generated
 */
public interface SwitchAltCS extends StatementCS {
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
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchAltCS_OwnedCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpCS getOwnedCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedCondition <em>Owned Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Condition</em>' containment reference.
	 * @see #getOwnedCondition()
	 * @generated
	 */
	void setOwnedCondition(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Body</em>' containment reference.
	 * @see #setOwnedBody(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchAltCS_OwnedBody()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpCS getOwnedBody();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS#getOwnedBody <em>Owned Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Body</em>' containment reference.
	 * @see #getOwnedBody()
	 * @generated
	 */
	void setOwnedBody(ExpCS value);

} // SwitchAltCS
