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
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.WhileExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.WhileExpCSImpl#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.WhileExpCSImpl#getOwnedResultVar <em>Owned Result Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileExpCSImpl extends ExpressionBlockCSImpl implements WhileExpCS {
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
	 * The cached value of the '{@link #getOwnedResultVar() <em>Owned Result Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResultVar()
	 * @generated
	 * @ordered
	 */
	protected VarDeclarationCS ownedResultVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.WHILE_EXP_CS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION, oldOwnedCondition, newOwnedCondition);
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
				msgs = ((InternalEObject)ownedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION, null, msgs);
			if (newOwnedCondition != null)
				msgs = ((InternalEObject)newOwnedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION, null, msgs);
			msgs = basicSetOwnedCondition(newOwnedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION, newOwnedCondition, newOwnedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDeclarationCS getOwnedResultVar() {
		return ownedResultVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedResultVar(VarDeclarationCS newOwnedResultVar, NotificationChain msgs) {
		VarDeclarationCS oldOwnedResultVar = ownedResultVar;
		ownedResultVar = newOwnedResultVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR, oldOwnedResultVar, newOwnedResultVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedResultVar(VarDeclarationCS newOwnedResultVar) {
		if (newOwnedResultVar != ownedResultVar) {
			NotificationChain msgs = null;
			if (ownedResultVar != null)
				msgs = ((InternalEObject)ownedResultVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR, null, msgs);
			if (newOwnedResultVar != null)
				msgs = ((InternalEObject)newOwnedResultVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR, null, msgs);
			msgs = basicSetOwnedResultVar(newOwnedResultVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR, newOwnedResultVar, newOwnedResultVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION:
				return basicSetOwnedCondition(null, msgs);
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR:
				return basicSetOwnedResultVar(null, msgs);
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
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION:
				return getOwnedCondition();
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR:
				return getOwnedResultVar();
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
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)newValue);
				return;
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR:
				setOwnedResultVar((VarDeclarationCS)newValue);
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
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION:
				setOwnedCondition((ExpCS)null);
				return;
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR:
				setOwnedResultVar((VarDeclarationCS)null);
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
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_CONDITION:
				return ownedCondition != null;
			case ImperativeOCLCSPackage.WHILE_EXP_CS__OWNED_RESULT_VAR:
				return ownedResultVar != null;
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitWhileExpCS(this);
	}

} //WhileExpCSImpl
