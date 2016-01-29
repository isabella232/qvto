/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.basecs.impl.TypedRefCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dict Type CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictTypeCSImpl#getOwnedKeyTypeRef <em>Owned Key Type Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.DictTypeCSImpl#getOwnedValueTypeRef <em>Owned Value Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictTypeCSImpl extends TypedRefCSImpl implements DictTypeCS {
	/**
	 * The cached value of the '{@link #getOwnedKeyTypeRef() <em>Owned Key Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedKeyTypeRef()
	 * @generated
	 * @ordered
	 */
	protected TypedRefCS ownedKeyTypeRef;

	/**
	 * The cached value of the '{@link #getOwnedValueTypeRef() <em>Owned Value Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedValueTypeRef()
	 * @generated
	 * @ordered
	 */
	protected TypedRefCS ownedValueTypeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DictTypeCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.DICT_TYPE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedRefCS getOwnedKeyTypeRef() {
		return ownedKeyTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedKeyTypeRef(TypedRefCS newOwnedKeyTypeRef, NotificationChain msgs) {
		TypedRefCS oldOwnedKeyTypeRef = ownedKeyTypeRef;
		ownedKeyTypeRef = newOwnedKeyTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF, oldOwnedKeyTypeRef, newOwnedKeyTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedKeyTypeRef(TypedRefCS newOwnedKeyTypeRef) {
		if (newOwnedKeyTypeRef != ownedKeyTypeRef) {
			NotificationChain msgs = null;
			if (ownedKeyTypeRef != null)
				msgs = ((InternalEObject)ownedKeyTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF, null, msgs);
			if (newOwnedKeyTypeRef != null)
				msgs = ((InternalEObject)newOwnedKeyTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF, null, msgs);
			msgs = basicSetOwnedKeyTypeRef(newOwnedKeyTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF, newOwnedKeyTypeRef, newOwnedKeyTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedRefCS getOwnedValueTypeRef() {
		return ownedValueTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedValueTypeRef(TypedRefCS newOwnedValueTypeRef, NotificationChain msgs) {
		TypedRefCS oldOwnedValueTypeRef = ownedValueTypeRef;
		ownedValueTypeRef = newOwnedValueTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF, oldOwnedValueTypeRef, newOwnedValueTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedValueTypeRef(TypedRefCS newOwnedValueTypeRef) {
		if (newOwnedValueTypeRef != ownedValueTypeRef) {
			NotificationChain msgs = null;
			if (ownedValueTypeRef != null)
				msgs = ((InternalEObject)ownedValueTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF, null, msgs);
			if (newOwnedValueTypeRef != null)
				msgs = ((InternalEObject)newOwnedValueTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF, null, msgs);
			msgs = basicSetOwnedValueTypeRef(newOwnedValueTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF, newOwnedValueTypeRef, newOwnedValueTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF:
				return basicSetOwnedKeyTypeRef(null, msgs);
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF:
				return basicSetOwnedValueTypeRef(null, msgs);
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
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF:
				return getOwnedKeyTypeRef();
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF:
				return getOwnedValueTypeRef();
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
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF:
				setOwnedKeyTypeRef((TypedRefCS)newValue);
				return;
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF:
				setOwnedValueTypeRef((TypedRefCS)newValue);
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
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF:
				setOwnedKeyTypeRef((TypedRefCS)null);
				return;
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF:
				setOwnedValueTypeRef((TypedRefCS)null);
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
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_KEY_TYPE_REF:
				return ownedKeyTypeRef != null;
			case ImperativeOCLCSPackage.DICT_TYPE_CS__OWNED_VALUE_TYPE_REF:
				return ownedValueTypeRef != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitDictTypeCS(this);
	}

} //DictTypeCSImpl
