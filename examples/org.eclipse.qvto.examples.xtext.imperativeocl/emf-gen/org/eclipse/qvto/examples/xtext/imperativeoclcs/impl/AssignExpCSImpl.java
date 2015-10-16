/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.AssignExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assign Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl#getOwnedLeft <em>Owned Left</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl#getOwnedValue <em>Owned Value</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl#getAssignOp <em>Assign Op</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssignExpCSImpl#getOwnedDefault <em>Owned Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignExpCSImpl extends StatementCSImpl implements AssignExpCS {
	/**
	 * The cached value of the '{@link #getOwnedLeft() <em>Owned Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLeft()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedLeft;

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
	 * The default value of the '{@link #getAssignOp() <em>Assign Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignOp()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGN_OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignOp() <em>Assign Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignOp()
	 * @generated
	 * @ordered
	 */
	protected String assignOp = ASSIGN_OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedDefault() <em>Owned Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefault()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedDefault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.ASSIGN_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedLeft() {
		return ownedLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLeft(ExpCS newOwnedLeft, NotificationChain msgs) {
		ExpCS oldOwnedLeft = ownedLeft;
		ownedLeft = newOwnedLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT, oldOwnedLeft, newOwnedLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLeft(ExpCS newOwnedLeft) {
		if (newOwnedLeft != ownedLeft) {
			NotificationChain msgs = null;
			if (ownedLeft != null)
				msgs = ((InternalEObject)ownedLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT, null, msgs);
			if (newOwnedLeft != null)
				msgs = ((InternalEObject)newOwnedLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT, null, msgs);
			msgs = basicSetOwnedLeft(newOwnedLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT, newOwnedLeft, newOwnedLeft));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE, oldOwnedValue, newOwnedValue);
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
				msgs = ((InternalEObject)ownedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE, null, msgs);
			if (newOwnedValue != null)
				msgs = ((InternalEObject)newOwnedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE, null, msgs);
			msgs = basicSetOwnedValue(newOwnedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE, newOwnedValue, newOwnedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignOp() {
		return assignOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignOp(String newAssignOp) {
		String oldAssignOp = assignOp;
		assignOp = newAssignOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSIGN_EXP_CS__ASSIGN_OP, oldAssignOp, assignOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedDefault() {
		return ownedDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefault(ExpCS newOwnedDefault, NotificationChain msgs) {
		ExpCS oldOwnedDefault = ownedDefault;
		ownedDefault = newOwnedDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT, oldOwnedDefault, newOwnedDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDefault(ExpCS newOwnedDefault) {
		if (newOwnedDefault != ownedDefault) {
			NotificationChain msgs = null;
			if (ownedDefault != null)
				msgs = ((InternalEObject)ownedDefault).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT, null, msgs);
			if (newOwnedDefault != null)
				msgs = ((InternalEObject)newOwnedDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT, null, msgs);
			msgs = basicSetOwnedDefault(newOwnedDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT, newOwnedDefault, newOwnedDefault));
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
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT:
				return basicSetOwnedLeft(null, msgs);
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE:
				return basicSetOwnedValue(null, msgs);
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT:
				return basicSetOwnedDefault(null, msgs);
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
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT:
				return getOwnedLeft();
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE:
				return getOwnedValue();
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__ASSIGN_OP:
				return getAssignOp();
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT:
				return getOwnedDefault();
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
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT:
				setOwnedLeft((ExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE:
				setOwnedValue((ExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__ASSIGN_OP:
				setAssignOp((String)newValue);
				return;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT:
				setOwnedDefault((ExpCS)newValue);
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
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT:
				setOwnedLeft((ExpCS)null);
				return;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE:
				setOwnedValue((ExpCS)null);
				return;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__ASSIGN_OP:
				setAssignOp(ASSIGN_OP_EDEFAULT);
				return;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT:
				setOwnedDefault((ExpCS)null);
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
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_LEFT:
				return ownedLeft != null;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_VALUE:
				return ownedValue != null;
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__ASSIGN_OP:
				return ASSIGN_OP_EDEFAULT == null ? assignOp != null : !ASSIGN_OP_EDEFAULT.equals(assignOp);
			case ImperativeOCLCSPackage.ASSIGN_EXP_CS__OWNED_DEFAULT:
				return ownedDefault != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitAssignExpCS(this);
	}

} //AssignExpCSImpl
