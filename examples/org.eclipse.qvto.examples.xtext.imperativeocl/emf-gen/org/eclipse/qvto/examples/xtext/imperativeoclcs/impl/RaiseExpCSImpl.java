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
import org.eclipse.ocl.xtext.basecs.TypedRefCS;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.RaiseExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raise Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.RaiseExpCSImpl#getOwnedExceptionRef <em>Owned Exception Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.RaiseExpCSImpl#getOwnedArguments <em>Owned Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RaiseExpCSImpl extends StatementCSImpl implements RaiseExpCS {
	/**
	 * The cached value of the '{@link #getOwnedExceptionRef() <em>Owned Exception Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExceptionRef()
	 * @generated
	 * @ordered
	 */
	protected TypedRefCS ownedExceptionRef;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaiseExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.RAISE_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedRefCS getOwnedExceptionRef() {
		return ownedExceptionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExceptionRef(TypedRefCS newOwnedExceptionRef, NotificationChain msgs) {
		TypedRefCS oldOwnedExceptionRef = ownedExceptionRef;
		ownedExceptionRef = newOwnedExceptionRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF, oldOwnedExceptionRef, newOwnedExceptionRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedExceptionRef(TypedRefCS newOwnedExceptionRef) {
		if (newOwnedExceptionRef != ownedExceptionRef) {
			NotificationChain msgs = null;
			if (ownedExceptionRef != null)
				msgs = ((InternalEObject)ownedExceptionRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF, null, msgs);
			if (newOwnedExceptionRef != null)
				msgs = ((InternalEObject)newOwnedExceptionRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF, null, msgs);
			msgs = basicSetOwnedExceptionRef(newOwnedExceptionRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF, newOwnedExceptionRef, newOwnedExceptionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getOwnedArguments() {
		if (ownedArguments == null) {
			ownedArguments = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_ARGUMENTS);
		}
		return ownedArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF:
				return basicSetOwnedExceptionRef(null, msgs);
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_ARGUMENTS:
				return ((InternalEList<?>)getOwnedArguments()).basicRemove(otherEnd, msgs);
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
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF:
				return getOwnedExceptionRef();
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_ARGUMENTS:
				return getOwnedArguments();
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
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF:
				setOwnedExceptionRef((TypedRefCS)newValue);
				return;
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_ARGUMENTS:
				getOwnedArguments().clear();
				getOwnedArguments().addAll((Collection<? extends ExpCS>)newValue);
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
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF:
				setOwnedExceptionRef((TypedRefCS)null);
				return;
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_ARGUMENTS:
				getOwnedArguments().clear();
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
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_EXCEPTION_REF:
				return ownedExceptionRef != null;
			case ImperativeOCLCSPackage.RAISE_EXP_CS__OWNED_ARGUMENTS:
				return ownedArguments != null && !ownedArguments.isEmpty();
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitRaiseExpCS(this);
	}

} //RaiseExpCSImpl
