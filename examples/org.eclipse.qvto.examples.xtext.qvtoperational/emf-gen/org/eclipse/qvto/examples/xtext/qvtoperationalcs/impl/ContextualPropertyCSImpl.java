/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ContextualPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contextual Property CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ContextualPropertyCSImpl#getOwnedInitExp <em>Owned Init Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextualPropertyCSImpl extends ModulePropertyCSImpl implements ContextualPropertyCS {
	/**
	 * The cached value of the '{@link #getOwnedInitExp() <em>Owned Init Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInitExp()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedInitExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextualPropertyCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.CONTEXTUAL_PROPERTY_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedInitExp() {
		return ownedInitExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInitExp(ExpCS newOwnedInitExp, NotificationChain msgs) {
		ExpCS oldOwnedInitExp = ownedInitExp;
		ownedInitExp = newOwnedInitExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP, oldOwnedInitExp, newOwnedInitExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedInitExp(ExpCS newOwnedInitExp) {
		if (newOwnedInitExp != ownedInitExp) {
			NotificationChain msgs = null;
			if (ownedInitExp != null)
				msgs = ((InternalEObject)ownedInitExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP, null, msgs);
			if (newOwnedInitExp != null)
				msgs = ((InternalEObject)newOwnedInitExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP, null, msgs);
			msgs = basicSetOwnedInitExp(newOwnedInitExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP, newOwnedInitExp, newOwnedInitExp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP:
				return basicSetOwnedInitExp(null, msgs);
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
			case QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP:
				return getOwnedInitExp();
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
			case QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP:
				setOwnedInitExp((ExpCS)newValue);
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
			case QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP:
				setOwnedInitExp((ExpCS)null);
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
			case QVTOperationalCSPackage.CONTEXTUAL_PROPERTY_CS__OWNED_INIT_EXP:
				return ownedInitExp != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitContextualPropertyCS(this);
	}

} //ContextualPropertyCSImpl
