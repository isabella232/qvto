/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.PivotableElementCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Body CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS#getOwnedContentExps <em>Owned Content Exps</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getOperationBodyCS()
 * @model
 * @generated
 */
public interface OperationBodyCS extends PivotableElementCS {
	/**
	 * Returns the value of the '<em><b>Owned Content Exps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Content Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Content Exps</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getOperationBodyCS_OwnedContentExps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedContentExps();

} // OperationBodyCS
