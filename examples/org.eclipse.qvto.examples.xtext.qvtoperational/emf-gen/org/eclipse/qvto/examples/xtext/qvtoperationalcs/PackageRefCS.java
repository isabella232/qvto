/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.basecs.ElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Ref CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getOwnedScopedName <em>Owned Scoped Name</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getPackageRefCS()
 * @model
 * @generated
 */
public interface PackageRefCS extends ElementCS {
	/**
	 * Returns the value of the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Scoped Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Scoped Name</em>' containment reference.
	 * @see #setOwnedScopedName(PathName2CS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getPackageRefCS_OwnedScopedName()
	 * @model containment="true"
	 * @generated
	 */
	PathName2CS getOwnedScopedName();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getOwnedScopedName <em>Owned Scoped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Scoped Name</em>' containment reference.
	 * @see #getOwnedScopedName()
	 * @generated
	 */
	void setOwnedScopedName(PathName2CS value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getPackageRefCS_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // PackageRefCS
