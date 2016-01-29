/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolve By Mapping Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS#getOwnedMappingRef <em>Owned Mapping Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getResolveByMappingExpCS()
 * @model
 * @generated
 */
public interface ResolveByMappingExpCS extends ResolveExpCS {
	/**
	 * Returns the value of the '<em><b>Owned Mapping Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Mapping Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Mapping Ref</em>' containment reference.
	 * @see #setOwnedMappingRef(OperationRefCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getResolveByMappingExpCS_OwnedMappingRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OperationRefCS getOwnedMappingRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS#getOwnedMappingRef <em>Owned Mapping Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Mapping Ref</em>' containment reference.
	 * @see #getOwnedMappingRef()
	 * @generated
	 */
	void setOwnedMappingRef(OperationRefCS value);

} // ResolveByMappingExpCS
