/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS#isIsStrict <em>Is Strict</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingCallExpCS()
 * @model
 * @generated
 */
public interface MappingCallExpCS extends NameExpCS {
	/**
	 * Returns the value of the '<em><b>Is Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Strict</em>' attribute.
	 * @see #setIsStrict(boolean)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingCallExpCS_IsStrict()
	 * @model
	 * @generated
	 */
	boolean isIsStrict();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingCallExpCS#isIsStrict <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Strict</em>' attribute.
	 * @see #isIsStrict()
	 * @generated
	 */
	void setIsStrict(boolean value);

} // MappingCallExpCS
