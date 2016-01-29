/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars Initialization CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarsInitializationCS#getOwnedVarDeclarations <em>Owned Var Declarations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getVarsInitializationCS()
 * @model
 * @generated
 */
public interface VarsInitializationCS extends StatementCS {
	/**
	 * Returns the value of the '<em><b>Owned Var Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Var Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Var Declarations</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getVarsInitializationCS_OwnedVarDeclarations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<VarDeclarationCS> getOwnedVarDeclarations();

} // VarsInitializationCS
