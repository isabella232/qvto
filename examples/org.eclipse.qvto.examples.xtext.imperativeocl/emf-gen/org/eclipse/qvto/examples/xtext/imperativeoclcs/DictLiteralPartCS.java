/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.basecs.ModelElementCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PrimitiveLiteralExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dict Literal Part CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedKey <em>Owned Key</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedValue <em>Owned Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getDictLiteralPartCS()
 * @model
 * @generated
 */
public interface DictLiteralPartCS extends ModelElementCS {
	/**
	 * Returns the value of the '<em><b>Owned Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Key</em>' containment reference.
	 * @see #setOwnedKey(PrimitiveLiteralExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getDictLiteralPartCS_OwnedKey()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimitiveLiteralExpCS getOwnedKey();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedKey <em>Owned Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Key</em>' containment reference.
	 * @see #getOwnedKey()
	 * @generated
	 */
	void setOwnedKey(PrimitiveLiteralExpCS value);

	/**
	 * Returns the value of the '<em><b>Owned Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Value</em>' containment reference.
	 * @see #setOwnedValue(ExpCS)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getDictLiteralPartCS_OwnedValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpCS getOwnedValue();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS#getOwnedValue <em>Owned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Value</em>' containment reference.
	 * @see #getOwnedValue()
	 * @generated
	 */
	void setOwnedValue(ExpCS value);

} // DictLiteralPartCS
