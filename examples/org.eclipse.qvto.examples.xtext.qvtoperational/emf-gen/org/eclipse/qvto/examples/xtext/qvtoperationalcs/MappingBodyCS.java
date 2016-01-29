/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Body CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#getOwnedInitExps <em>Owned Init Exps</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#getOwnedEndExps <em>Owned End Exps</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#isHasPopulationKeyword <em>Has Population Keyword</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingBodyCS()
 * @model
 * @generated
 */
public interface MappingBodyCS extends OperationBodyCS {
	/**
	 * Returns the value of the '<em><b>Owned Init Exps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Init Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Init Exps</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingBodyCS_OwnedInitExps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedInitExps();

	/**
	 * Returns the value of the '<em><b>Owned End Exps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned End Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned End Exps</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingBodyCS_OwnedEndExps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedEndExps();

	/**
	 * Returns the value of the '<em><b>Has Population Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Population Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Population Keyword</em>' attribute.
	 * @see #setHasPopulationKeyword(boolean)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingBodyCS_HasPopulationKeyword()
	 * @model
	 * @generated
	 */
	boolean isHasPopulationKeyword();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS#isHasPopulationKeyword <em>Has Population Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Population Keyword</em>' attribute.
	 * @see #isHasPopulationKeyword()
	 * @generated
	 */
	void setHasPopulationKeyword(boolean value);

} // MappingBodyCS
