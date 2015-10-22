/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.ocl.xtext.basecs.ElementCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.InitOpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Part CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getInitOp <em>Init Op</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getOwnedExp <em>Owned Exp</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getInitPartCS()
 * @model
 * @generated
 */
public interface InitPartCS extends ElementCS {
	/**
	 * Returns the value of the '<em><b>Init Op</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.qvto.examples.xtext.imperativeoclcs.InitOpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Op</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.InitOpCS
	 * @see #setInitOp(InitOpCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getInitPartCS_InitOp()
	 * @model
	 * @generated
	 */
	InitOpCS getInitOp();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getInitOp <em>Init Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Op</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.InitOpCS
	 * @see #getInitOp()
	 * @generated
	 */
	void setInitOp(InitOpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exp</em>' containment reference.
	 * @see #setOwnedExp(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getInitPartCS_OwnedExp()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedExp();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS#getOwnedExp <em>Owned Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Exp</em>' containment reference.
	 * @see #getOwnedExp()
	 * @generated
	 */
	void setOwnedExp(ExpCS value);

} // InitPartCS
