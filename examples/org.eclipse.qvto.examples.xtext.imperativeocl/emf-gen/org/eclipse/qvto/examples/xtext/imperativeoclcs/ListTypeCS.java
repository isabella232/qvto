/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS#getOwnedTypeRef <em>Owned Type Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getListTypeCS()
 * @model
 * @generated
 */
public interface ListTypeCS extends TypedRefCS {
	/**
	 * Returns the value of the '<em><b>Owned Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Type Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Type Ref</em>' containment reference.
	 * @see #setOwnedTypeRef(TypedRefCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getListTypeCS_OwnedTypeRef()
	 * @model containment="true"
	 * @generated
	 */
	TypedRefCS getOwnedTypeRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS#getOwnedTypeRef <em>Owned Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Type Ref</em>' containment reference.
	 * @see #getOwnedTypeRef()
	 * @generated
	 */
	void setOwnedTypeRef(TypedRefCS value);

} // ListTypeCS
