/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.impl.ModelElementCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PrimitiveLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dict Literal Part CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralPartCSImpl#getOwnedKey <em>Owned Key</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictLiteralPartCSImpl#getOwnedValue <em>Owned Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictLiteralPartCSImpl extends ModelElementCSImpl implements DictLiteralPartCS {
	/**
	 * The cached value of the '{@link #getOwnedKey() <em>Owned Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedKey()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveLiteralExpCS ownedKey;

	/**
	 * The cached value of the '{@link #getOwnedValue() <em>Owned Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedValue()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictLiteralPartCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.DICT_LITERAL_PART_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveLiteralExpCS getOwnedKey() {
		return ownedKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedKey(PrimitiveLiteralExpCS newOwnedKey, NotificationChain msgs) {
		PrimitiveLiteralExpCS oldOwnedKey = ownedKey;
		ownedKey = newOwnedKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY, oldOwnedKey, newOwnedKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedKey(PrimitiveLiteralExpCS newOwnedKey) {
		if (newOwnedKey != ownedKey) {
			NotificationChain msgs = null;
			if (ownedKey != null)
				msgs = ((InternalEObject)ownedKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY, null, msgs);
			if (newOwnedKey != null)
				msgs = ((InternalEObject)newOwnedKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY, null, msgs);
			msgs = basicSetOwnedKey(newOwnedKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY, newOwnedKey, newOwnedKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedValue() {
		return ownedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedValue(ExpCS newOwnedValue, NotificationChain msgs) {
		ExpCS oldOwnedValue = ownedValue;
		ownedValue = newOwnedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE, oldOwnedValue, newOwnedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedValue(ExpCS newOwnedValue) {
		if (newOwnedValue != ownedValue) {
			NotificationChain msgs = null;
			if (ownedValue != null)
				msgs = ((InternalEObject)ownedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE, null, msgs);
			if (newOwnedValue != null)
				msgs = ((InternalEObject)newOwnedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE, null, msgs);
			msgs = basicSetOwnedValue(newOwnedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE, newOwnedValue, newOwnedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY:
				return basicSetOwnedKey(null, msgs);
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE:
				return basicSetOwnedValue(null, msgs);
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
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY:
				return getOwnedKey();
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE:
				return getOwnedValue();
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
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY:
				setOwnedKey((PrimitiveLiteralExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE:
				setOwnedValue((ExpCS)newValue);
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
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY:
				setOwnedKey((PrimitiveLiteralExpCS)null);
				return;
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE:
				setOwnedValue((ExpCS)null);
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
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_KEY:
				return ownedKey != null;
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS__OWNED_VALUE:
				return ownedValue != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitDictLiteralPartCS(this);
	}

} //DictLiteralPartCSImpl
