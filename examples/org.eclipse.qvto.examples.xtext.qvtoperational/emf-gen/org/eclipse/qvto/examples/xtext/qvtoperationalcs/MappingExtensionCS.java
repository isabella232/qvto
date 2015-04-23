/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ElementRefCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Extension CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionCS#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionCS#getMappingIdentifiers <em>Mapping Identifiers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingExtensionCS()
 * @model
 * @generated
 */
public interface MappingExtensionCS extends ElementRefCS {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"disjuncts"</code>.
	 * The literals are from the enumeration {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionKindCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionKindCS
	 * @see #setKind(MappingExtensionKindCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingExtensionCS_Kind()
	 * @model default="disjuncts"
	 * @generated
	 */
	MappingExtensionKindCS getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionCS#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionKindCS
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MappingExtensionKindCS value);

	/**
	 * Returns the value of the '<em><b>Mapping Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ScopedNameCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Identifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Identifiers</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingExtensionCS_MappingIdentifiers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ScopedNameCS> getMappingIdentifiers();

} // MappingExtensionCS
