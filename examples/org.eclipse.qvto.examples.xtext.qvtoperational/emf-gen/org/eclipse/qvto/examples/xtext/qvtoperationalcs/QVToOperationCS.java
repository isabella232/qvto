/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.basecs.OperationCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QV To Operation CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getQVToOperationCS()
 * @model
 * @generated
 */
public interface QVToOperationCS extends OperationCS {
	/**
	 * Returns the value of the '<em><b>Owned Stereotype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stereotype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stereotype</em>' containment reference.
	 * @see #setOwnedStereotype(StereotypeQualifierCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getQVToOperationCS_OwnedStereotype()
	 * @model containment="true"
	 * @generated
	 */
	StereotypeQualifierCS getOwnedStereotype();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS#getOwnedStereotype <em>Owned Stereotype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Stereotype</em>' containment reference.
	 * @see #getOwnedStereotype()
	 * @generated
	 */
	void setOwnedStereotype(StereotypeQualifierCS value);

} // QVToOperationCS
