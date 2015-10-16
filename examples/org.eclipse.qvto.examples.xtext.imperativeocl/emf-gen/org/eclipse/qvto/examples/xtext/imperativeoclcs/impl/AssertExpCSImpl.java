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
import org.eclipse.qvto.examples.xtext.imperativeoclcs.AssertExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assert Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssertExpCSImpl#getOwnedAssertion <em>Owned Assertion</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssertExpCSImpl#getOwnedLog <em>Owned Log</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.AssertExpCSImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssertExpCSImpl extends StatementCSImpl implements AssertExpCS {
	/**
	 * The cached value of the '{@link #getOwnedAssertion() <em>Owned Assertion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAssertion()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedAssertion;

	/**
	 * The cached value of the '{@link #getOwnedLog() <em>Owned Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLog()
	 * @generated
	 * @ordered
	 */
	protected LogExpCS ownedLog;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.ASSERT_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedAssertion() {
		return ownedAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAssertion(ExpCS newOwnedAssertion, NotificationChain msgs) {
		ExpCS oldOwnedAssertion = ownedAssertion;
		ownedAssertion = newOwnedAssertion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION, oldOwnedAssertion, newOwnedAssertion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedAssertion(ExpCS newOwnedAssertion) {
		if (newOwnedAssertion != ownedAssertion) {
			NotificationChain msgs = null;
			if (ownedAssertion != null)
				msgs = ((InternalEObject)ownedAssertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION, null, msgs);
			if (newOwnedAssertion != null)
				msgs = ((InternalEObject)newOwnedAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION, null, msgs);
			msgs = basicSetOwnedAssertion(newOwnedAssertion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION, newOwnedAssertion, newOwnedAssertion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogExpCS getOwnedLog() {
		return ownedLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLog(LogExpCS newOwnedLog, NotificationChain msgs) {
		LogExpCS oldOwnedLog = ownedLog;
		ownedLog = newOwnedLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG, oldOwnedLog, newOwnedLog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLog(LogExpCS newOwnedLog) {
		if (newOwnedLog != ownedLog) {
			NotificationChain msgs = null;
			if (ownedLog != null)
				msgs = ((InternalEObject)ownedLog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG, null, msgs);
			if (newOwnedLog != null)
				msgs = ((InternalEObject)newOwnedLog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG, null, msgs);
			msgs = basicSetOwnedLog(newOwnedLog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG, newOwnedLog, newOwnedLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.ASSERT_EXP_CS__SEVERITY, oldSeverity, severity));
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
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION:
				return basicSetOwnedAssertion(null, msgs);
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG:
				return basicSetOwnedLog(null, msgs);
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
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION:
				return getOwnedAssertion();
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG:
				return getOwnedLog();
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__SEVERITY:
				return getSeverity();
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
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION:
				setOwnedAssertion((ExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG:
				setOwnedLog((LogExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__SEVERITY:
				setSeverity((String)newValue);
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
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION:
				setOwnedAssertion((ExpCS)null);
				return;
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG:
				setOwnedLog((LogExpCS)null);
				return;
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
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
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_ASSERTION:
				return ownedAssertion != null;
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__OWNED_LOG:
				return ownedLog != null;
			case ImperativeOCLCSPackage.ASSERT_EXP_CS__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitAssertExpCS(this);
	}

} //AssertExpCSImpl
