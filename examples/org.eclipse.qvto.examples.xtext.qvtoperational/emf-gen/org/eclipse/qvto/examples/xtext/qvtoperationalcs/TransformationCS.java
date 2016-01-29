/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS#getOwnedRefinedModule <em>Owned Refined Module</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getTransformationCS()
 * @model
 * @generated
 */
public interface TransformationCS extends ModuleCS {
	/**
	 * Returns the value of the '<em><b>Owned Refined Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Refined Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Refined Module</em>' containment reference.
	 * @see #setOwnedRefinedModule(ModuleRefCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getTransformationCS_OwnedRefinedModule()
	 * @model containment="true"
	 * @generated
	 */
	ModuleRefCS getOwnedRefinedModule();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS#getOwnedRefinedModule <em>Owned Refined Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Refined Module</em>' containment reference.
	 * @see #getOwnedRefinedModule()
	 * @generated
	 */
	void setOwnedRefinedModule(ModuleRefCS value);

} // TransformationCS
