/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs;

import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Declaration CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS#getInitOp <em>Init Op</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getVarDeclarationCS()
 * @model
 * @generated
 */
public interface VarDeclarationCS extends VariableCS {
	/**
	 * Returns the value of the '<em><b>Init Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Op</em>' attribute.
	 * @see #setInitOp(String)
	 * @see org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage#getVarDeclarationCS_InitOp()
	 * @model
	 * @generated
	 */
	String getInitOp();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS#getInitOp <em>Init Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Op</em>' attribute.
	 * @see #getInitOp()
	 * @generated
	 */
	void setInitOp(String value);

} // VarDeclarationCS
