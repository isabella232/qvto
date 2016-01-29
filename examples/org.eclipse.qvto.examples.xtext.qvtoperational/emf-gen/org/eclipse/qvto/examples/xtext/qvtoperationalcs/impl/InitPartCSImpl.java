/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.impl.ElementCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.InitOpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Init Part CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.InitPartCSImpl#getInitOp <em>Init Op</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.InitPartCSImpl#getOwnedExp <em>Owned Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitPartCSImpl extends ElementCSImpl implements InitPartCS {
	/**
	 * The default value of the '{@link #getInitOp() <em>Init Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitOp()
	 * @generated
	 * @ordered
	 */
	protected static final InitOpCS INIT_OP_EDEFAULT = InitOpCS.EQUALS;

	/**
	 * The cached value of the '{@link #getInitOp() <em>Init Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitOp()
	 * @generated
	 * @ordered
	 */
	protected InitOpCS initOp = INIT_OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedExp() <em>Owned Exp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExp()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedExp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitPartCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.INIT_PART_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitOpCS getInitOp() {
		return initOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitOp(InitOpCS newInitOp) {
		InitOpCS oldInitOp = initOp;
		initOp = newInitOp == null ? INIT_OP_EDEFAULT : newInitOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.INIT_PART_CS__INIT_OP, oldInitOp, initOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedExp() {
		return ownedExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExp(ExpCS newOwnedExp, NotificationChain msgs) {
		ExpCS oldOwnedExp = ownedExp;
		ownedExp = newOwnedExp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP, oldOwnedExp, newOwnedExp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedExp(ExpCS newOwnedExp) {
		if (newOwnedExp != ownedExp) {
			NotificationChain msgs = null;
			if (ownedExp != null)
				msgs = ((InternalEObject)ownedExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP, null, msgs);
			if (newOwnedExp != null)
				msgs = ((InternalEObject)newOwnedExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP, null, msgs);
			msgs = basicSetOwnedExp(newOwnedExp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP, newOwnedExp, newOwnedExp));
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
			case QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP:
				return basicSetOwnedExp(null, msgs);
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
			case QVTOperationalCSPackage.INIT_PART_CS__INIT_OP:
				return getInitOp();
			case QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP:
				return getOwnedExp();
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
			case QVTOperationalCSPackage.INIT_PART_CS__INIT_OP:
				setInitOp((InitOpCS)newValue);
				return;
			case QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP:
				setOwnedExp((ExpCS)newValue);
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
			case QVTOperationalCSPackage.INIT_PART_CS__INIT_OP:
				setInitOp(INIT_OP_EDEFAULT);
				return;
			case QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP:
				setOwnedExp((ExpCS)null);
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
			case QVTOperationalCSPackage.INIT_PART_CS__INIT_OP:
				return initOp != INIT_OP_EDEFAULT;
			case QVTOperationalCSPackage.INIT_PART_CS__OWNED_EXP:
				return ownedExp != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitInitPartCS(this);
	}

} //InitPartCSImpl
