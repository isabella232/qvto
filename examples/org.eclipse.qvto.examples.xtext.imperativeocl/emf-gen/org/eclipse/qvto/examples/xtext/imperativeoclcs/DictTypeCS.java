/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.basecs.TypedRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dict Type CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedKeyTypeRef <em>Owned Key Type Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedValueTypeRef <em>Owned Value Type Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getDictTypeCS()
 * @model
 * @generated
 */
public interface DictTypeCS extends TypedRefCS {
	/**
	 * Returns the value of the '<em><b>Owned Key Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Key Type Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Key Type Ref</em>' containment reference.
	 * @see #setOwnedKeyTypeRef(TypedRefCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getDictTypeCS_OwnedKeyTypeRef()
	 * @model containment="true"
	 * @generated
	 */
	TypedRefCS getOwnedKeyTypeRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedKeyTypeRef <em>Owned Key Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Key Type Ref</em>' containment reference.
	 * @see #getOwnedKeyTypeRef()
	 * @generated
	 */
	void setOwnedKeyTypeRef(TypedRefCS value);

	/**
	 * Returns the value of the '<em><b>Owned Value Type Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Value Type Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Value Type Ref</em>' containment reference.
	 * @see #setOwnedValueTypeRef(TypedRefCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getDictTypeCS_OwnedValueTypeRef()
	 * @model containment="true"
	 * @generated
	 */
	TypedRefCS getOwnedValueTypeRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS#getOwnedValueTypeRef <em>Owned Value Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Value Type Ref</em>' containment reference.
	 * @see #getOwnedValueTypeRef()
	 * @generated
	 */
	void setOwnedValueTypeRef(TypedRefCS value);

} // DictTypeCS
