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
import org.eclipse.ocl.xtext.essentialoclcs.VariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.impl.CallExpCSImpl;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeLoopExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative Loop Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl#getOwnedTarget <em>Owned Target</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl#getOwnedIterator <em>Owned Iterator</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl#getOwnedBody <em>Owned Body</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ImperativeLoopExpCSImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImperativeLoopExpCSImpl extends CallExpCSImpl implements ImperativeLoopExpCS {
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
	 * The cached value of the '{@link #getOwnedTarget() <em>Owned Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTarget()
	 * @generated
	 * @ordered
	 */
	protected VariableCS ownedTarget;

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
	 * The cached value of the '{@link #getOwnedBody() <em>Owned Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBody()
	 * @generated
	 * @ordered
	 */
	protected ExpCS ownedBody;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImperativeLoopExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.IMPERATIVE_LOOP_EXP_CS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION, oldOwnedCondition, newOwnedCondition);
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
				msgs = ((InternalEObject)ownedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION, null, msgs);
			if (newOwnedCondition != null)
				msgs = ((InternalEObject)newOwnedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION, null, msgs);
			msgs = basicSetOwnedCondition(newOwnedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION, newOwnedCondition, newOwnedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableCS getOwnedTarget() {
		return ownedTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTarget(VariableCS newOwnedTarget, NotificationChain msgs) {
		VariableCS oldOwnedTarget = ownedTarget;
		ownedTarget = newOwnedTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET, oldOwnedTarget, newOwnedTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTarget(VariableCS newOwnedTarget) {
		if (newOwnedTarget != ownedTarget) {
			NotificationChain msgs = null;
			if (ownedTarget != null)
				msgs = ((InternalEObject)ownedTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET, null, msgs);
			if (newOwnedTarget != null)
				msgs = ((InternalEObject)newOwnedTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET, null, msgs);
			msgs = basicSetOwnedTarget(newOwnedTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET, newOwnedTarget, newOwnedTarget));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR, oldOwnedIterator, newOwnedIterator);
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
				msgs = ((InternalEObject)ownedIterator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR, null, msgs);
			if (newOwnedIterator != null)
				msgs = ((InternalEObject)newOwnedIterator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR, null, msgs);
			msgs = basicSetOwnedIterator(newOwnedIterator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR, newOwnedIterator, newOwnedIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpCS getOwnedBody() {
		return ownedBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBody(ExpCS newOwnedBody, NotificationChain msgs) {
		ExpCS oldOwnedBody = ownedBody;
		ownedBody = newOwnedBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY, oldOwnedBody, newOwnedBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBody(ExpCS newOwnedBody) {
		if (newOwnedBody != ownedBody) {
			NotificationChain msgs = null;
			if (ownedBody != null)
				msgs = ((InternalEObject)ownedBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY, null, msgs);
			if (newOwnedBody != null)
				msgs = ((InternalEObject)newOwnedBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY, null, msgs);
			msgs = basicSetOwnedBody(newOwnedBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY, newOwnedBody, newOwnedBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__NAME, oldName, name));
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
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION:
				return basicSetOwnedCondition(null, msgs);
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET:
				return basicSetOwnedTarget(null, msgs);
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR:
				return basicSetOwnedIterator(null, msgs);
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY:
				return basicSetOwnedBody(null, msgs);
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
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION:
				return getOwnedCondition();
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET:
				return getOwnedTarget();
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR:
				return getOwnedIterator();
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY:
				return getOwnedBody();
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__NAME:
				return getName();
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
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET:
				setOwnedTarget((VariableCS)newValue);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR:
				setOwnedIterator((VariableCS)newValue);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY:
				setOwnedBody((ExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__NAME:
				setName((String)newValue);
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
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)null);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET:
				setOwnedTarget((VariableCS)null);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR:
				setOwnedIterator((VariableCS)null);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY:
				setOwnedBody((ExpCS)null);
				return;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__NAME:
				setName(NAME_EDEFAULT);
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
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_CONDITION:
				return ownedCondition != null;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_TARGET:
				return ownedTarget != null;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_ITERATOR:
				return ownedIterator != null;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__OWNED_BODY:
				return ownedBody != null;
			case ImperativeOCLCSPackage.IMPERATIVE_LOOP_EXP_CS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitImperativeLoopExpCS(this);
	}

} //ImperativeLoopExpCSImpl
