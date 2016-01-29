/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.essentialoclcs.CallExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedMessage <em>Owned Message</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedCondition <em>Owned Condition</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getLogExpCS()
 * @model
 * @generated
 */
public interface LogExpCS extends CallExpCS {
	/**
	 * Returns the value of the '<em><b>Owned Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Message</em>' containment reference.
	 * @see #setOwnedMessage(StringLiteralExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getLogExpCS_OwnedMessage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringLiteralExpCS getOwnedMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedMessage <em>Owned Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Message</em>' containment reference.
	 * @see #getOwnedMessage()
	 * @generated
	 */
	void setOwnedMessage(StringLiteralExpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' containment reference.
	 * @see #setOwnedElement(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getLogExpCS_OwnedElement()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedElement();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedElement <em>Owned Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' containment reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(ExpCS value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SeverityKindCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SeverityKindCS
	 * @see #setSeverity(SeverityKindCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getLogExpCS_Severity()
	 * @model
	 * @generated
	 */
	SeverityKindCS getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.SeverityKindCS
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKindCS value);

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
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getLogExpCS_OwnedCondition()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS#getOwnedCondition <em>Owned Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Condition</em>' containment reference.
	 * @see #getOwnedCondition()
	 * @generated
	 */
	void setOwnedCondition(ExpCS value);

} // LogExpCS
