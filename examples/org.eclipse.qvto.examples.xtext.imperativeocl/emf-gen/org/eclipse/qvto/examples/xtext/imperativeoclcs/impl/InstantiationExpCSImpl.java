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
import org.eclipse.ocl.xtext.basecs.TypeRefCS;
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.InstantiationExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.InstantiationExpCSImpl#getOwnedClassRef <em>Owned Class Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.InstantiationExpCSImpl#getOwnedArguments <em>Owned Arguments</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.InstantiationExpCSImpl#getOwnedExtentRef <em>Owned Extent Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstantiationExpCSImpl extends StatementCSImpl implements InstantiationExpCS {
	/**
	 * The cached value of the '{@link #getOwnedClassRef() <em>Owned Class Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClassRef()
	 * @generated
	 * @ordered
	 */
	protected TypeRefCS ownedClassRef;

	/**
	 * The cached value of the '{@link #getOwnedArguments() <em>Owned Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpCS> ownedArguments;

	/**
	 * The cached value of the '{@link #getOwnedExtentRef() <em>Owned Extent Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtentRef()
	 * @generated
	 * @ordered
	 */
	protected TypedRefCS ownedExtentRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.INSTANTIATION_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRefCS getOwnedClassRef() {
		return ownedClassRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedClassRef(TypeRefCS newOwnedClassRef, NotificationChain msgs) {
		TypeRefCS oldOwnedClassRef = ownedClassRef;
		ownedClassRef = newOwnedClassRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF, oldOwnedClassRef, newOwnedClassRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedClassRef(TypeRefCS newOwnedClassRef) {
		if (newOwnedClassRef != ownedClassRef) {
			NotificationChain msgs = null;
			if (ownedClassRef != null)
				msgs = ((InternalEObject)ownedClassRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF, null, msgs);
			if (newOwnedClassRef != null)
				msgs = ((InternalEObject)newOwnedClassRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF, null, msgs);
			msgs = basicSetOwnedClassRef(newOwnedClassRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF, newOwnedClassRef, newOwnedClassRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getOwnedArguments() {
		if (ownedArguments == null) {
			ownedArguments = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_ARGUMENTS);
		}
		return ownedArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedRefCS getOwnedExtentRef() {
		return ownedExtentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExtentRef(TypedRefCS newOwnedExtentRef, NotificationChain msgs) {
		TypedRefCS oldOwnedExtentRef = ownedExtentRef;
		ownedExtentRef = newOwnedExtentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF, oldOwnedExtentRef, newOwnedExtentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedExtentRef(TypedRefCS newOwnedExtentRef) {
		if (newOwnedExtentRef != ownedExtentRef) {
			NotificationChain msgs = null;
			if (ownedExtentRef != null)
				msgs = ((InternalEObject)ownedExtentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF, null, msgs);
			if (newOwnedExtentRef != null)
				msgs = ((InternalEObject)newOwnedExtentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF, null, msgs);
			msgs = basicSetOwnedExtentRef(newOwnedExtentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF, newOwnedExtentRef, newOwnedExtentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF:
				return basicSetOwnedClassRef(null, msgs);
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_ARGUMENTS:
				return ((InternalEList<?>)getOwnedArguments()).basicRemove(otherEnd, msgs);
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF:
				return basicSetOwnedExtentRef(null, msgs);
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
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF:
				return getOwnedClassRef();
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_ARGUMENTS:
				return getOwnedArguments();
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF:
				return getOwnedExtentRef();
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
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF:
				setOwnedClassRef((TypeRefCS)newValue);
				return;
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_ARGUMENTS:
				getOwnedArguments().clear();
				getOwnedArguments().addAll((Collection<? extends ExpCS>)newValue);
				return;
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF:
				setOwnedExtentRef((TypedRefCS)newValue);
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
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF:
				setOwnedClassRef((TypeRefCS)null);
				return;
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_ARGUMENTS:
				getOwnedArguments().clear();
				return;
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF:
				setOwnedExtentRef((TypedRefCS)null);
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
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_CLASS_REF:
				return ownedClassRef != null;
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_ARGUMENTS:
				return ownedArguments != null && !ownedArguments.isEmpty();
			case ImperativeOCLCSPackage.INSTANTIATION_EXP_CS__OWNED_EXTENT_REF:
				return ownedExtentRef != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitInstantiationExpCS(this);
	}

} //InstantiationExpCSImpl
