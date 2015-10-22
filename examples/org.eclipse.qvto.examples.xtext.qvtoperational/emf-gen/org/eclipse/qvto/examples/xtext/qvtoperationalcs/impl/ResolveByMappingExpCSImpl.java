/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveByMappingExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolve By Mapping Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveByMappingExpCSImpl#getOwnedMappingRef <em>Owned Mapping Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolveByMappingExpCSImpl extends ResolveExpCSImpl implements ResolveByMappingExpCS {
	/**
	 * The cached value of the '{@link #getOwnedMappingRef() <em>Owned Mapping Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMappingRef()
	 * @generated
	 * @ordered
	 */
	protected OperationRefCS ownedMappingRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolveByMappingExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.RESOLVE_BY_MAPPING_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationRefCS getOwnedMappingRef() {
		return ownedMappingRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMappingRef(OperationRefCS newOwnedMappingRef, NotificationChain msgs) {
		OperationRefCS oldOwnedMappingRef = ownedMappingRef;
		ownedMappingRef = newOwnedMappingRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF, oldOwnedMappingRef, newOwnedMappingRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMappingRef(OperationRefCS newOwnedMappingRef) {
		if (newOwnedMappingRef != ownedMappingRef) {
			NotificationChain msgs = null;
			if (ownedMappingRef != null)
				msgs = ((InternalEObject)ownedMappingRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF, null, msgs);
			if (newOwnedMappingRef != null)
				msgs = ((InternalEObject)newOwnedMappingRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF, null, msgs);
			msgs = basicSetOwnedMappingRef(newOwnedMappingRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF, newOwnedMappingRef, newOwnedMappingRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF:
				return basicSetOwnedMappingRef(null, msgs);
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
			case QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF:
				return getOwnedMappingRef();
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
			case QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF:
				setOwnedMappingRef((OperationRefCS)newValue);
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
			case QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF:
				setOwnedMappingRef((OperationRefCS)null);
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
			case QVTOperationalCSPackage.RESOLVE_BY_MAPPING_EXP_CS__OWNED_MAPPING_REF:
				return ownedMappingRef != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitResolveByMappingExpCS(this);
	}

} //ResolveByMappingExpCSImpl
