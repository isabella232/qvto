/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ElementRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Ref CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS#getOwnedScopedName <em>Owned Scoped Name</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS#getOwnedParameters <em>Owned Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModuleRefCS()
 * @model
 * @generated
 */
public interface ModuleRefCS extends ElementRefCS {
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
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModuleRefCS_OwnedScopedName()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathName2CS getOwnedScopedName();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS#getOwnedScopedName <em>Owned Scoped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Scoped Name</em>' containment reference.
	 * @see #getOwnedScopedName()
	 * @generated
	 */
	void setOwnedScopedName(PathName2CS value);

	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModuleRefCS_OwnedParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDeclarationCS> getOwnedParameters();

} // ModuleRefCS
