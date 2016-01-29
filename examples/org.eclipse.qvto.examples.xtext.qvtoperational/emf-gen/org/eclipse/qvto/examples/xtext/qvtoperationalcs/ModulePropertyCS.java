/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.basecs.StructuralFeatureCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Property CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS#getOwnedScopedName <em>Owned Scoped Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModulePropertyCS()
 * @model
 * @generated
 */
public interface ModulePropertyCS extends StructuralFeatureCS {
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
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModulePropertyCS_OwnedScopedName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathName2CS getOwnedScopedName();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModulePropertyCS#getOwnedScopedName <em>Owned Scoped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Scoped Name</em>' containment reference.
	 * @see #getOwnedScopedName()
	 * @generated
	 */
	void setOwnedScopedName(PathName2CS value);

} // ModulePropertyCS
