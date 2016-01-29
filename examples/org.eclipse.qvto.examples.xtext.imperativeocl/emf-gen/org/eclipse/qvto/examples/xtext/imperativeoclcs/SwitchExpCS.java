/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;

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
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedIterator <em>Owned Iterator</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getIfSyntax <em>If Syntax</em>}</li>
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
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchExpCS_OwnedIterator()
	 * @model containment="true"
	 * @generated
	 */
	VariableCS getOwnedIterator();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getOwnedIterator <em>Owned Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Iterator</em>' containment reference.
	 * @see #getOwnedIterator()
	 * @generated
	 */
	void setOwnedIterator(VariableCS value);

	/**
	 * Returns the value of the '<em><b>If Syntax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Syntax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Syntax</em>' attribute.
	 * @see #setIfSyntax(Boolean)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getSwitchExpCS_IfSyntax()
	 * @model
	 * @generated
	 */
	Boolean getIfSyntax();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS#getIfSyntax <em>If Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Syntax</em>' attribute.
	 * @see #getIfSyntax()
	 * @generated
	 */
	void setIfSyntax(Boolean value);

} // SwitchExpCS
