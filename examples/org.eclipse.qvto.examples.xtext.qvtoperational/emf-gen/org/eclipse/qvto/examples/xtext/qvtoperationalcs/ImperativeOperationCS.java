/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.OperationCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Operation CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedScopedName <em>Owned Scoped Name</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedResults <em>Owned Results</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedBody <em>Owned Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getImperativeOperationCS()
 * @model
 * @generated
 */
public interface ImperativeOperationCS extends OperationCS {
	/**
	 * Returns the value of the '<em><b>Owned Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Scoped Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Scoped Name</em>' containment reference.
	 * @see #setOwnedScopedName(PathName2CS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getImperativeOperationCS_OwnedScopedName()
	 * @model containment="true"
	 * @generated
	 */
	PathName2CS getOwnedScopedName();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedScopedName <em>Owned Scoped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Scoped Name</em>' containment reference.
	 * @see #getOwnedScopedName()
	 * @generated
	 */
	void setOwnedScopedName(PathName2CS value);

	/**
	 * Returns the value of the '<em><b>Owned Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Results</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getImperativeOperationCS_OwnedResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDeclarationCS> getOwnedResults();

	/**
	 * Returns the value of the '<em><b>Owned Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Body</em>' containment reference.
	 * @see #setOwnedBody(OperationBodyCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getImperativeOperationCS_OwnedBody()
	 * @model containment="true"
	 * @generated
	 */
	OperationBodyCS getOwnedBody();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS#getOwnedBody <em>Owned Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Body</em>' containment reference.
	 * @see #getOwnedBody()
	 * @generated
	 */
	void setOwnedBody(OperationBodyCS value);

} // ImperativeOperationCS
