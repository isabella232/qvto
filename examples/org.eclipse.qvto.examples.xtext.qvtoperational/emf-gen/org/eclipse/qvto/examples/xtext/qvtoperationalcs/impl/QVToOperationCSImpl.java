/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.impl.OperationCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QV To Operation CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToOperationCSImpl#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QVToOperationCSImpl extends OperationCSImpl implements QVToOperationCS {
	/**
	 * The cached value of the '{@link #getOwnedStereotype() <em>Owned Stereotype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStereotype()
	 * @generated
	 * @ordered
	 */
	protected StereotypeQualifierCS ownedStereotype;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QVToOperationCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.QV_TO_OPERATION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeQualifierCS getOwnedStereotype() {
		return ownedStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedStereotype(StereotypeQualifierCS newOwnedStereotype, NotificationChain msgs) {
		StereotypeQualifierCS oldOwnedStereotype = ownedStereotype;
		ownedStereotype = newOwnedStereotype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE, oldOwnedStereotype, newOwnedStereotype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedStereotype(StereotypeQualifierCS newOwnedStereotype) {
		if (newOwnedStereotype != ownedStereotype) {
			NotificationChain msgs = null;
			if (ownedStereotype != null)
				msgs = ((InternalEObject)ownedStereotype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE, null, msgs);
			if (newOwnedStereotype != null)
				msgs = ((InternalEObject)newOwnedStereotype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE, null, msgs);
			msgs = basicSetOwnedStereotype(newOwnedStereotype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE, newOwnedStereotype, newOwnedStereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE:
				return basicSetOwnedStereotype(null, msgs);
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
			case QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE:
				return getOwnedStereotype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE:
				setOwnedStereotype((StereotypeQualifierCS)newValue);
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
			case QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE:
				setOwnedStereotype((StereotypeQualifierCS)null);
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
			case QVTOperationalCSPackage.QV_TO_OPERATION_CS__OWNED_STEREOTYPE:
				return ownedStereotype != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitQVToOperationCS(this);
	}

} //QVToOperationCSImpl
