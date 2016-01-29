/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.basecs.ClassCS;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getComplianceKind <em>Compliance Kind</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getOwnedPackageRefs <em>Owned Package Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getOwnedConditions <em>Owned Conditions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModelTypeCS()
 * @model
 * @generated
 */
public interface ModelTypeCS extends ClassCS {
	/**
	 * Returns the value of the '<em><b>Compliance Kind</b></em>' attribute.
	 * The default value is <code>"strict"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compliance Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance Kind</em>' attribute.
	 * @see #setComplianceKind(String)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModelTypeCS_ComplianceKind()
	 * @model default="strict"
	 * @generated
	 */
	String getComplianceKind();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS#getComplianceKind <em>Compliance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Kind</em>' attribute.
	 * @see #getComplianceKind()
	 * @generated
	 */
	void setComplianceKind(String value);

	/**
	 * Returns the value of the '<em><b>Owned Package Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Package Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Package Refs</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModelTypeCS_OwnedPackageRefs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PackageRefCS> getOwnedPackageRefs();

	/**
	 * Returns the value of the '<em><b>Owned Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Conditions</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getModelTypeCS_OwnedConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedConditions();

} // ModelTypeCS
