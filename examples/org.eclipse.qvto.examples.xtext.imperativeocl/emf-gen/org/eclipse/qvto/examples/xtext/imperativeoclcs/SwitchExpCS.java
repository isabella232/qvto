/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedAltParts <em>Owned Alt Parts</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedElsePart <em>Owned Else Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchExpCS()
 * @model
 * @generated
 */
public interface SwitchExpCS extends StatementCS {
	/**
	 * Returns the value of the '<em><b>Owned Alt Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Alt Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Alt Parts</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchExpCS_OwnedAltParts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SwitchAltCS> getOwnedAltParts();

	/**
	 * Returns the value of the '<em><b>Owned Else Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Else Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Else Part</em>' containment reference.
	 * @see #setOwnedElsePart(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchExpCS_OwnedElsePart()
	 * @model containment="true"
	 * @generated
	 */
	ExpCS getOwnedElsePart();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedElsePart <em>Owned Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Else Part</em>' containment reference.
	 * @see #getOwnedElsePart()
	 * @generated
	 */
	void setOwnedElsePart(ExpCS value);

} // SwitchExpCS
