/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.basecs.ParameterCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Declaration CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getOwnedInitPart <em>Owned Init Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getParameterDeclarationCS()
 * @model
 * @generated
 */
public interface ParameterDeclarationCS extends ParameterCS {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(DirectionKindCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getParameterDeclarationCS_Direction()
	 * @model unsettable="true"
	 * @generated
	 */
	DirectionKindCS getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionKindCS value);

	/**
	 * Unsets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionKindCS)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(DirectionKindCS)
	 * @generated
	 */
	boolean isSetDirection();

	/**
	 * Returns the value of the '<em><b>Owned Init Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Init Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Init Part</em>' containment reference.
	 * @see #setOwnedInitPart(InitPartCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getParameterDeclarationCS_OwnedInitPart()
	 * @model containment="true"
	 * @generated
	 */
	InitPartCS getOwnedInitPart();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS#getOwnedInitPart <em>Owned Init Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Init Part</em>' containment reference.
	 * @see #getOwnedInitPart()
	 * @generated
	 */
	void setOwnedInitPart(InitPartCS value);

} // ParameterDeclarationCS
