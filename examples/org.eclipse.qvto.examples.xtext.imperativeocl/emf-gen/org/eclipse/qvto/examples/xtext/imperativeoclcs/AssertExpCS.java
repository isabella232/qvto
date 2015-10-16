/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assert Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedAssertion <em>Owned Assertion</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedLog <em>Owned Log</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssertExpCS()
 * @model
 * @generated
 */
public interface AssertExpCS extends StatementCS {
	/**
	 * Returns the value of the '<em><b>Owned Assertion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Assertion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Assertion</em>' containment reference.
	 * @see #setOwnedAssertion(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssertExpCS_OwnedAssertion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpCS getOwnedAssertion();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedAssertion <em>Owned Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Assertion</em>' containment reference.
	 * @see #getOwnedAssertion()
	 * @generated
	 */
	void setOwnedAssertion(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Log</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Log</em>' containment reference.
	 * @see #setOwnedLog(LogExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssertExpCS_OwnedLog()
	 * @model containment="true"
	 * @generated
	 */
	LogExpCS getOwnedLog();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getOwnedLog <em>Owned Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Log</em>' containment reference.
	 * @see #getOwnedLog()
	 * @generated
	 */
	void setOwnedLog(LogExpCS value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getAssertExpCS_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

} // AssertExpCS
