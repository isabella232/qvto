/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.xtext.basecs.impl.ClassCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeCSImpl#getComplianceKind <em>Compliance Kind</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeCSImpl#getOwnedPackageRefs <em>Owned Package Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModelTypeCSImpl#getOwnedConditions <em>Owned Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelTypeCSImpl extends ClassCSImpl implements ModelTypeCS {
	/**
	 * The default value of the '{@link #getComplianceKind() <em>Compliance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceKind()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLIANCE_KIND_EDEFAULT = "strict";

	/**
	 * The cached value of the '{@link #getComplianceKind() <em>Compliance Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplianceKind()
	 * @generated
	 * @ordered
	 */
	protected String complianceKind = COMPLIANCE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPackageRefs() <em>Owned Package Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackageRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageRefCS> ownedPackageRefs;

	/**
	 * The cached value of the '{@link #getOwnedConditions() <em>Owned Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpCS> ownedConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelTypeCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.MODEL_TYPE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplianceKind() {
		return complianceKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplianceKind(String newComplianceKind) {
		String oldComplianceKind = complianceKind;
		complianceKind = newComplianceKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MODEL_TYPE_CS__COMPLIANCE_KIND, oldComplianceKind, complianceKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageRefCS> getOwnedPackageRefs() {
		if (ownedPackageRefs == null) {
			ownedPackageRefs = new EObjectContainmentEList<PackageRefCS>(PackageRefCS.class, this, QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_PACKAGE_REFS);
		}
		return ownedPackageRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getOwnedConditions() {
		if (ownedConditions == null) {
			ownedConditions = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_CONDITIONS);
		}
		return ownedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_PACKAGE_REFS:
				return ((InternalEList<?>)getOwnedPackageRefs()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_CONDITIONS:
				return ((InternalEList<?>)getOwnedConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTOperationalCSPackage.MODEL_TYPE_CS__COMPLIANCE_KIND:
				return getComplianceKind();
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_PACKAGE_REFS:
				return getOwnedPackageRefs();
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_CONDITIONS:
				return getOwnedConditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTOperationalCSPackage.MODEL_TYPE_CS__COMPLIANCE_KIND:
				setComplianceKind((String)newValue);
				return;
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_PACKAGE_REFS:
				getOwnedPackageRefs().clear();
				getOwnedPackageRefs().addAll((Collection<? extends PackageRefCS>)newValue);
				return;
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_CONDITIONS:
				getOwnedConditions().clear();
				getOwnedConditions().addAll((Collection<? extends ExpCS>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QVTOperationalCSPackage.MODEL_TYPE_CS__COMPLIANCE_KIND:
				setComplianceKind(COMPLIANCE_KIND_EDEFAULT);
				return;
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_PACKAGE_REFS:
				getOwnedPackageRefs().clear();
				return;
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_CONDITIONS:
				getOwnedConditions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QVTOperationalCSPackage.MODEL_TYPE_CS__COMPLIANCE_KIND:
				return COMPLIANCE_KIND_EDEFAULT == null ? complianceKind != null : !COMPLIANCE_KIND_EDEFAULT.equals(complianceKind);
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_PACKAGE_REFS:
				return ownedPackageRefs != null && !ownedPackageRefs.isEmpty();
			case QVTOperationalCSPackage.MODEL_TYPE_CS__OWNED_CONDITIONS:
				return ownedConditions != null && !ownedConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitModelTypeCS(this);
	}

} //ModelTypeCSImpl
