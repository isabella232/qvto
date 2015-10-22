/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Property CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS#getOwnedInitExp <em>Owned Init Exp</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getContextualPropertyCS()
 * @model
 * @generated
 */
public interface ContextualPropertyCS extends ModulePropertyCS {
	/**
	 * Returns the value of the '<em><b>Owned Init Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Init Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Init Exp</em>' containment reference.
	 * @see #setOwnedInitExp(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getContextualPropertyCS_OwnedInitExp()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedInitExp();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS#getOwnedInitExp <em>Owned Init Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Init Exp</em>' containment reference.
	 * @see #getOwnedInitExp()
	 * @generated
	 */
	void setOwnedInitExp(ExpCS value);

} // ContextualPropertyCS
