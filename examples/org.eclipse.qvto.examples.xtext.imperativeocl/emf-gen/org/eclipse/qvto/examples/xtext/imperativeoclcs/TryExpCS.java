/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.TryExpCS#getOwnedCatchs <em>Owned Catchs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getTryExpCS()
 * @model
 * @generated
 */
public interface TryExpCS extends ExpressionBlockCS {
	/**
	 * Returns the value of the '<em><b>Owned Catchs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.imperativeoclcs.CatchExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Catchs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Catchs</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getTryExpCS_OwnedCatchs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CatchExpCS> getOwnedCatchs();

} // TryExpCS
