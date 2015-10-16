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
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ListTypeCSImpl#getOwnedTypeRef <em>Owned Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListTypeCSImpl extends TypedRefCSImpl implements ListTypeCS {
	/**
	 * The cached value of the '{@link #getOwnedTypeRef() <em>Owned Type Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypeRef()
	 * @generated
	 * @ordered
	 */
	protected TypedRefCS ownedTypeRef;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListTypeCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.LIST_TYPE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedRefCS getOwnedTypeRef() {
		return ownedTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTypeRef(TypedRefCS newOwnedTypeRef, NotificationChain msgs) {
		TypedRefCS oldOwnedTypeRef = ownedTypeRef;
		ownedTypeRef = newOwnedTypeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF, oldOwnedTypeRef, newOwnedTypeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTypeRef(TypedRefCS newOwnedTypeRef) {
		if (newOwnedTypeRef != ownedTypeRef) {
			NotificationChain msgs = null;
			if (ownedTypeRef != null)
				msgs = ((InternalEObject)ownedTypeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF, null, msgs);
			if (newOwnedTypeRef != null)
				msgs = ((InternalEObject)newOwnedTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF, null, msgs);
			msgs = basicSetOwnedTypeRef(newOwnedTypeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF, newOwnedTypeRef, newOwnedTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF:
				return basicSetOwnedTypeRef(null, msgs);
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
			case ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF:
				return getOwnedTypeRef();
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
			case ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF:
				setOwnedTypeRef((TypedRefCS)newValue);
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
			case ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF:
				setOwnedTypeRef((TypedRefCS)null);
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
			case ImperativeOCLCSPackage.LIST_TYPE_CS__OWNED_TYPE_REF:
				return ownedTypeRef != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitListTypeCS(this);
	}

} //ListTypeCSImpl
