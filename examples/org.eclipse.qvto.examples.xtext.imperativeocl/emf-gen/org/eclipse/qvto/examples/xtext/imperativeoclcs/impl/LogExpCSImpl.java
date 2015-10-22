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
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.impl.CallExpCSImpl;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.LogExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.SeverityKindCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl#getOwnedMessage <em>Owned Message</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.LogExpCSImpl#getOwnedCondition <em>Owned Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogExpCSImpl extends CallExpCSImpl implements LogExpCS {
	/**
	 * The cached value of the '{@link #getOwnedMessage() <em>Owned Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMessage()
	 * @generated
	 * @ordered
	 */
	protected StringLiteralExpCS ownedMessage;
	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedElement;
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityKindCS SEVERITY_EDEFAULT = SeverityKindCS.ERROR;
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityKindCS severity = SEVERITY_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.LOG_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralExpCS getOwnedMessage() {
		return ownedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMessage(StringLiteralExpCS newOwnedMessage, NotificationChain msgs) {
		StringLiteralExpCS oldOwnedMessage = ownedMessage;
		ownedMessage = newOwnedMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE, oldOwnedMessage, newOwnedMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMessage(StringLiteralExpCS newOwnedMessage) {
		if (newOwnedMessage != ownedMessage) {
			NotificationChain msgs = null;
			if (ownedMessage != null)
				msgs = ((InternalEObject)ownedMessage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE, null, msgs);
			if (newOwnedMessage != null)
				msgs = ((InternalEObject)newOwnedMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE, null, msgs);
			msgs = basicSetOwnedMessage(newOwnedMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE, newOwnedMessage, newOwnedMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedElement() {
		return ownedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElement(ExpCS newOwnedElement, NotificationChain msgs) {
		ExpCS oldOwnedElement = ownedElement;
		ownedElement = newOwnedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT, oldOwnedElement, newOwnedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedElement(ExpCS newOwnedElement) {
		if (newOwnedElement != ownedElement) {
			NotificationChain msgs = null;
			if (ownedElement != null)
				msgs = ((InternalEObject)ownedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT, null, msgs);
			if (newOwnedElement != null)
				msgs = ((InternalEObject)newOwnedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT, null, msgs);
			msgs = basicSetOwnedElement(newOwnedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT, newOwnedElement, newOwnedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityKindCS getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(SeverityKindCS newSeverity) {
		SeverityKindCS oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LOG_EXP_CS__SEVERITY, oldSeverity, severity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION, oldOwnedCondition, newOwnedCondition);
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
				msgs = ((InternalEObject)ownedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION, null, msgs);
			if (newOwnedCondition != null)
				msgs = ((InternalEObject)newOwnedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION, null, msgs);
			msgs = basicSetOwnedCondition(newOwnedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION, newOwnedCondition, newOwnedCondition));
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
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE:
				return basicSetOwnedMessage(null, msgs);
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT:
				return basicSetOwnedElement(null, msgs);
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION:
				return basicSetOwnedCondition(null, msgs);
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
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE:
				return getOwnedMessage();
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT:
				return getOwnedElement();
			case ImperativeOCLCSPackage.LOG_EXP_CS__SEVERITY:
				return getSeverity();
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION:
				return getOwnedCondition();
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
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE:
				setOwnedMessage((StringLiteralExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT:
				setOwnedElement((ExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.LOG_EXP_CS__SEVERITY:
				setSeverity((SeverityKindCS)newValue);
				return;
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)newValue);
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
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE:
				setOwnedMessage((StringLiteralExpCS)null);
				return;
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT:
				setOwnedElement((ExpCS)null);
				return;
			case ImperativeOCLCSPackage.LOG_EXP_CS__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)null);
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
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_MESSAGE:
				return ownedMessage != null;
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_ELEMENT:
				return ownedElement != null;
			case ImperativeOCLCSPackage.LOG_EXP_CS__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case ImperativeOCLCSPackage.LOG_EXP_CS__OWNED_CONDITION:
				return ownedCondition != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitLogExpCS(this);
	}

} //LogExpCSImpl
