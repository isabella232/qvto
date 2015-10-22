/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Operation CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedInheritRefs <em>Owned Inherit Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedDisjunctRefs <em>Owned Disjunct Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedMergeRefs <em>Owned Merge Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedRefinedRule <em>Owned Refined Rule</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedWhenExps <em>Owned When Exps</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedWhereExps <em>Owned Where Exps</em>}</li>
 * </ul>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS()
 * @model
 * @generated
 */
public interface MappingOperationCS extends ImperativeOperationCS {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS
	 * @see #setDirection(DirectionKindCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS_Direction()
	 * @model
	 * @generated
	 */
	DirectionKindCS getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(DirectionKindCS value);

	/**
	 * Returns the value of the '<em><b>Owned Inherit Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Inherit Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Inherit Refs</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS_OwnedInheritRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationRefCS> getOwnedInheritRefs();

	/**
	 * Returns the value of the '<em><b>Owned Disjunct Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Disjunct Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Disjunct Refs</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS_OwnedDisjunctRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationRefCS> getOwnedDisjunctRefs();

	/**
	 * Returns the value of the '<em><b>Owned Merge Refs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Merge Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Merge Refs</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS_OwnedMergeRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationRefCS> getOwnedMergeRefs();

	/**
	 * Returns the value of the '<em><b>Owned Refined Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Refined Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Refined Rule</em>' containment reference.
	 * @see #setOwnedRefinedRule(PathName2CS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS_OwnedRefinedRule()
	 * @model containment="true"
	 * @generated
	 */
	PathName2CS getOwnedRefinedRule();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS#getOwnedRefinedRule <em>Owned Refined Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Refined Rule</em>' containment reference.
	 * @see #getOwnedRefinedRule()
	 * @generated
	 */
	void setOwnedRefinedRule(PathName2CS value);

	/**
	 * Returns the value of the '<em><b>Owned When Exps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned When Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned When Exps</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS_OwnedWhenExps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedWhenExps();

	/**
	 * Returns the value of the '<em><b>Owned Where Exps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.xtext.essentialoclcs.ExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Where Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Where Exps</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage#getMappingOperationCS_OwnedWhereExps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpCS> getOwnedWhereExps();

} // MappingOperationCS
