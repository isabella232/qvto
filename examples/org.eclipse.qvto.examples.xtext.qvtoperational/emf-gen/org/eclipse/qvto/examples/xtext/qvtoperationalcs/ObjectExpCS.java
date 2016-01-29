/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ExpressionBlockCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ExtentRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedExtentRef <em>Owned Extent Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedIterator <em>Owned Iterator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getObjectExpCS()
 * @model
 * @generated
 */
public interface ObjectExpCS extends ExpressionBlockCS {
	/**
	 * Returns the value of the '<em><b>Owned Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variable</em>' containment reference.
	 * @see #setOwnedVariable(VariableCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getObjectExpCS_OwnedVariable()
	 * @model containment="true"
	 * @generated
	 */
	VariableCS getOwnedVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedVariable <em>Owned Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Variable</em>' containment reference.
	 * @see #getOwnedVariable()
	 * @generated
	 */
	void setOwnedVariable(VariableCS value);

	/**
	 * Returns the value of the '<em><b>Owned Extent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Extent Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Extent Ref</em>' containment reference.
	 * @see #setOwnedExtentRef(ExtentRefCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getObjectExpCS_OwnedExtentRef()
	 * @model containment="true"
	 * @generated
	 */
	ExtentRefCS getOwnedExtentRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedExtentRef <em>Owned Extent Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Extent Ref</em>' containment reference.
	 * @see #getOwnedExtentRef()
	 * @generated
	 */
	void setOwnedExtentRef(ExtentRefCS value);

	/**
	 * Returns the value of the '<em><b>Owned Iterator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Iterator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Iterator</em>' containment reference.
	 * @see #setOwnedIterator(VariableCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getObjectExpCS_OwnedIterator()
	 * @model containment="true"
	 * @generated
	 */
	VariableCS getOwnedIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS#getOwnedIterator <em>Owned Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Iterator</em>' containment reference.
	 * @see #getOwnedIterator()
	 * @generated
	 */
	void setOwnedIterator(VariableCS value);

} // ObjectExpCS
