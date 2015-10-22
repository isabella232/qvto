/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.basecs.ElementRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Ref CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS#getOwnedPathName <em>Owned Path Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getOperationRefCS()
 * @model
 * @generated
 */
public interface OperationRefCS extends ElementRefCS {
	/**
	 * Returns the value of the '<em><b>Owned Path Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Path Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Path Name</em>' containment reference.
	 * @see #setOwnedPathName(PathName2CS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getOperationRefCS_OwnedPathName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathName2CS getOwnedPathName();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS#getOwnedPathName <em>Owned Path Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Path Name</em>' containment reference.
	 * @see #getOwnedPathName()
	 * @generated
	 */
	void setOwnedPathName(PathName2CS value);

} // OperationRefCS
