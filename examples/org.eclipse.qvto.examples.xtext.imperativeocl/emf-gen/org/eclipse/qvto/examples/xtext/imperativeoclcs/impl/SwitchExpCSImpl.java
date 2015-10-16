/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchAltCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SwitchExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchExpCSImpl#getOwnedAltParts <em>Owned Alt Parts</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.SwitchExpCSImpl#getOwnedElsePart <em>Owned Else Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchExpCSImpl extends StatementCSImpl implements SwitchExpCS {
	/**
	 * The cached value of the '{@link #getOwnedAltParts() <em>Owned Alt Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAltParts()
	 * @generated
	 * @ordered
	 */
	protected EList<SwitchAltCS> ownedAltParts;

	/**
	 * The cached value of the '{@link #getOwnedElsePart() <em>Owned Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElsePart()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedElsePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.SWITCH_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SwitchAltCS> getOwnedAltParts() {
		if (ownedAltParts == null) {
			ownedAltParts = new EObjectContainmentEList<SwitchAltCS>(SwitchAltCS.class, this, ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ALT_PARTS);
		}
		return ownedAltParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedElsePart() {
		return ownedElsePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElsePart(ExpCS newOwnedElsePart, NotificationChain msgs) {
		ExpCS oldOwnedElsePart = ownedElsePart;
		ownedElsePart = newOwnedElsePart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART, oldOwnedElsePart, newOwnedElsePart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedElsePart(ExpCS newOwnedElsePart) {
		if (newOwnedElsePart != ownedElsePart) {
			NotificationChain msgs = null;
			if (ownedElsePart != null)
				msgs = ((InternalEObject)ownedElsePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART, null, msgs);
			if (newOwnedElsePart != null)
				msgs = ((InternalEObject)newOwnedElsePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART, null, msgs);
			msgs = basicSetOwnedElsePart(newOwnedElsePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART, newOwnedElsePart, newOwnedElsePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ALT_PARTS:
				return ((InternalEList<?>)getOwnedAltParts()).basicRemove(otherEnd, msgs);
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART:
				return basicSetOwnedElsePart(null, msgs);
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
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ALT_PARTS:
				return getOwnedAltParts();
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART:
				return getOwnedElsePart();
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
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ALT_PARTS:
				getOwnedAltParts().clear();
				getOwnedAltParts().addAll((Collection<? extends SwitchAltCS>)newValue);
				return;
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART:
				setOwnedElsePart((ExpCS)newValue);
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
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ALT_PARTS:
				getOwnedAltParts().clear();
				return;
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART:
				setOwnedElsePart((ExpCS)null);
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
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ALT_PARTS:
				return ownedAltParts != null && !ownedAltParts.isEmpty();
			case ImperativeOCLCSPackage.SWITCH_EXP_CS__OWNED_ELSE_PART:
				return ownedElsePart != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitSwitchExpCS(this);
	}

} //SwitchExpCSImpl
