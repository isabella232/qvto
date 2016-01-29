/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.TypeRefCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedClassRef <em>Owned Class Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedArguments <em>Owned Arguments</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedExtentRef <em>Owned Extent Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getInstantiationExpCS()
 * @model
 * @generated
 */
public interface InstantiationExpCS extends StatementCS {
	/**
	 * Returns the value of the '<em><b>Owned Class Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Class Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Class Ref</em>' containment reference.
	 * @see #setOwnedClassRef(TypeRefCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getInstantiationExpCS_OwnedClassRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeRefCS getOwnedClassRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedClassRef <em>Owned Class Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Class Ref</em>' containment reference.
	 * @see #getOwnedClassRef()
	 * @generated
	 */
	void setOwnedClassRef(TypeRefCS value);

	/**
	 * Returns the value of the '<em><b>Owned Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Arguments</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getInstantiationExpCS_OwnedArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedArguments();

	/**
	 * Returns the value of the '<em><b>Owned Extent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Extent Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Extent Ref</em>' containment reference.
	 * @see #setOwnedExtentRef(TypedRefCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getInstantiationExpCS_OwnedExtentRef()
	 * @model containment="true"
	 * @generated
	 */
	TypedRefCS getOwnedExtentRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS#getOwnedExtentRef <em>Owned Extent Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Extent Ref</em>' containment reference.
	 * @see #getOwnedExtentRef()
	 * @generated
	 */
	void setOwnedExtentRef(TypedRefCS value);

} // InstantiationExpCS
