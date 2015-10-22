/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ExtentRefCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ExpressionBlockCSImpl;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ObjectExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ObjectExpCSImpl#getOwnedVariable <em>Owned Variable</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ObjectExpCSImpl#getOwnedExtentRef <em>Owned Extent Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ObjectExpCSImpl#getOwnedIterator <em>Owned Iterator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectExpCSImpl extends ExpressionBlockCSImpl implements ObjectExpCS {
	/**
	 * The cached value of the '{@link #getOwnedVariable() <em>Owned Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableCS ownedVariable;

	/**
	 * The cached value of the '{@link #getOwnedExtentRef() <em>Owned Extent Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExtentRef()
	 * @generated
	 * @ordered
	 */
	protected ExtentRefCS ownedExtentRef;

	/**
	 * The cached value of the '{@link #getOwnedIterator() <em>Owned Iterator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedIterator()
	 * @generated
	 * @ordered
	 */
	protected VariableCS ownedIterator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.OBJECT_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableCS getOwnedVariable() {
		return ownedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedVariable(VariableCS newOwnedVariable, NotificationChain msgs) {
		VariableCS oldOwnedVariable = ownedVariable;
		ownedVariable = newOwnedVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE, oldOwnedVariable, newOwnedVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedVariable(VariableCS newOwnedVariable) {
		if (newOwnedVariable != ownedVariable) {
			NotificationChain msgs = null;
			if (ownedVariable != null)
				msgs = ((InternalEObject)ownedVariable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE, null, msgs);
			if (newOwnedVariable != null)
				msgs = ((InternalEObject)newOwnedVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE, null, msgs);
			msgs = basicSetOwnedVariable(newOwnedVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE, newOwnedVariable, newOwnedVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtentRefCS getOwnedExtentRef() {
		return ownedExtentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExtentRef(ExtentRefCS newOwnedExtentRef, NotificationChain msgs) {
		ExtentRefCS oldOwnedExtentRef = ownedExtentRef;
		ownedExtentRef = newOwnedExtentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF, oldOwnedExtentRef, newOwnedExtentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedExtentRef(ExtentRefCS newOwnedExtentRef) {
		if (newOwnedExtentRef != ownedExtentRef) {
			NotificationChain msgs = null;
			if (ownedExtentRef != null)
				msgs = ((InternalEObject)ownedExtentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF, null, msgs);
			if (newOwnedExtentRef != null)
				msgs = ((InternalEObject)newOwnedExtentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF, null, msgs);
			msgs = basicSetOwnedExtentRef(newOwnedExtentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF, newOwnedExtentRef, newOwnedExtentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableCS getOwnedIterator() {
		return ownedIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedIterator(VariableCS newOwnedIterator, NotificationChain msgs) {
		VariableCS oldOwnedIterator = ownedIterator;
		ownedIterator = newOwnedIterator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR, oldOwnedIterator, newOwnedIterator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedIterator(VariableCS newOwnedIterator) {
		if (newOwnedIterator != ownedIterator) {
			NotificationChain msgs = null;
			if (ownedIterator != null)
				msgs = ((InternalEObject)ownedIterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR, null, msgs);
			if (newOwnedIterator != null)
				msgs = ((InternalEObject)newOwnedIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR, null, msgs);
			msgs = basicSetOwnedIterator(newOwnedIterator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR, newOwnedIterator, newOwnedIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE:
				return basicSetOwnedVariable(null, msgs);
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF:
				return basicSetOwnedExtentRef(null, msgs);
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR:
				return basicSetOwnedIterator(null, msgs);
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
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE:
				return getOwnedVariable();
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF:
				return getOwnedExtentRef();
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR:
				return getOwnedIterator();
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
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE:
				setOwnedVariable((VariableCS)newValue);
				return;
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF:
				setOwnedExtentRef((ExtentRefCS)newValue);
				return;
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR:
				setOwnedIterator((VariableCS)newValue);
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
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE:
				setOwnedVariable((VariableCS)null);
				return;
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF:
				setOwnedExtentRef((ExtentRefCS)null);
				return;
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR:
				setOwnedIterator((VariableCS)null);
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
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_VARIABLE:
				return ownedVariable != null;
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_EXTENT_REF:
				return ownedExtentRef != null;
			case QVTOperationalCSPackage.OBJECT_EXP_CS__OWNED_ITERATOR:
				return ownedIterator != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitObjectExpCS(this);
	}

} //ObjectExpCSImpl
