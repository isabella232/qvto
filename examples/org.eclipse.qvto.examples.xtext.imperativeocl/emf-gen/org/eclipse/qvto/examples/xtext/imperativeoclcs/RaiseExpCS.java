/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS#getOwnedExceptionRef <em>Owned Exception Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS#getOwnedArguments <em>Owned Arguments</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getRaiseExpCS()
 * @model
 * @generated
 */
public interface RaiseExpCS extends StatementCS {

	/**
	 * Returns the value of the '<em><b>Owned Exception Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exception Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exception Ref</em>' containment reference.
	 * @see #setOwnedExceptionRef(TypedRefCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getRaiseExpCS_OwnedExceptionRef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypedRefCS getOwnedExceptionRef();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS#getOwnedExceptionRef <em>Owned Exception Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Exception Ref</em>' containment reference.
	 * @see #getOwnedExceptionRef()
	 * @generated
	 */
	void setOwnedExceptionRef(TypedRefCS value);

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
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getRaiseExpCS_OwnedArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedArguments();
} // RaiseExpCS
