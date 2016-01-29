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
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.impl.CallExpCSImpl;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ResolveExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resolve Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl#getIsDeferred <em>Is Deferred</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ResolveExpCSImpl#getOwnedTarget <em>Owned Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResolveExpCSImpl extends CallExpCSImpl implements ResolveExpCS {
	/**
	 * The default value of the '{@link #getIsDeferred() <em>Is Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeferred()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeferred() <em>Is Deferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeferred()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeferred = IS_DEFERRED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedCondition() <em>Owned Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCondition()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedCondition;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedTarget() <em>Owned Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTarget()
	 * @generated
	 * @ordered
	 */
	protected VariableCS ownedTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResolveExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.RESOLVE_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeferred() {
		return isDeferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeferred(Boolean newIsDeferred) {
		Boolean oldIsDeferred = isDeferred;
		isDeferred = newIsDeferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_EXP_CS__IS_DEFERRED, oldIsDeferred, isDeferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedCondition() {
		return ownedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedCondition(ExpCS newOwnedCondition, NotificationChain msgs) {
		ExpCS oldOwnedCondition = ownedCondition;
		ownedCondition = newOwnedCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION, oldOwnedCondition, newOwnedCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCondition(ExpCS newOwnedCondition) {
		if (newOwnedCondition != ownedCondition) {
			NotificationChain msgs = null;
			if (ownedCondition != null)
				msgs = ((InternalEObject)ownedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION, null, msgs);
			if (newOwnedCondition != null)
				msgs = ((InternalEObject)newOwnedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION, null, msgs);
			msgs = basicSetOwnedCondition(newOwnedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION, newOwnedCondition, newOwnedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_EXP_CS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableCS getOwnedTarget() {
		return ownedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTarget(VariableCS newOwnedTarget, NotificationChain msgs) {
		VariableCS oldOwnedTarget = ownedTarget;
		ownedTarget = newOwnedTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET, oldOwnedTarget, newOwnedTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTarget(VariableCS newOwnedTarget) {
		if (newOwnedTarget != ownedTarget) {
			NotificationChain msgs = null;
			if (ownedTarget != null)
				msgs = ((InternalEObject)ownedTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET, null, msgs);
			if (newOwnedTarget != null)
				msgs = ((InternalEObject)newOwnedTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET, null, msgs);
			msgs = basicSetOwnedTarget(newOwnedTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET, newOwnedTarget, newOwnedTarget));
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
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION:
				return basicSetOwnedCondition(null, msgs);
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET:
				return basicSetOwnedTarget(null, msgs);
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
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__IS_DEFERRED:
				return getIsDeferred();
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION:
				return getOwnedCondition();
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__NAME:
				return getName();
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET:
				return getOwnedTarget();
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
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__IS_DEFERRED:
				setIsDeferred((Boolean)newValue);
				return;
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)newValue);
				return;
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__NAME:
				setName((String)newValue);
				return;
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET:
				setOwnedTarget((VariableCS)newValue);
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
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__IS_DEFERRED:
				setIsDeferred(IS_DEFERRED_EDEFAULT);
				return;
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)null);
				return;
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET:
				setOwnedTarget((VariableCS)null);
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
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__IS_DEFERRED:
				return IS_DEFERRED_EDEFAULT == null ? isDeferred != null : !IS_DEFERRED_EDEFAULT.equals(isDeferred);
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_CONDITION:
				return ownedCondition != null;
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QVTOperationalCSPackage.RESOLVE_EXP_CS__OWNED_TARGET:
				return ownedTarget != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitResolveExpCS(this);
	}

} //ResolveExpCSImpl
