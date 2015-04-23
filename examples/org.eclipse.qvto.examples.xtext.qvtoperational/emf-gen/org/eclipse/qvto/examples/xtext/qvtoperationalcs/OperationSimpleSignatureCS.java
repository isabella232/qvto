/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ElementCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Simple Signature CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationSimpleSignatureCS#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getOperationSimpleSignatureCS()
 * @model
 * @generated
 */
public interface OperationSimpleSignatureCS extends ElementCS {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationParameterDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getOperationSimpleSignatureCS_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationParameterDeclarationCS> getParameter();

} // OperationSimpleSignatureCS
