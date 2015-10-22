/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.basecs.StructuredClassCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QV To Class CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS#isIsIntermediate <em>Is Intermediate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getQVToClassCS()
 * @model
 * @generated
 */
public interface QVToClassCS extends StructuredClassCS {
	/**
	 * Returns the value of the '<em><b>Is Intermediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Intermediate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Intermediate</em>' attribute.
	 * @see #setIsIntermediate(boolean)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getQVToClassCS_IsIntermediate()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsIntermediate();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS#isIsIntermediate <em>Is Intermediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Intermediate</em>' attribute.
	 * @see #isIsIntermediate()
	 * @generated
	 */
	void setIsIntermediate(boolean value);

} // QVToClassCS
