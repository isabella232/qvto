/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ComputeExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.VarDeclarationCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compute Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ComputeExpCSImpl#getOwnedResultVar <em>Owned Result Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputeExpCSImpl extends ExpressionBlockCSImpl implements ComputeExpCS {
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
	protected ComputeExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.COMPUTE_EXP_CS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR, oldOwnedResultVar, newOwnedResultVar);
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
				msgs = ((InternalEObject)ownedResultVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR, null, msgs);
			if (newOwnedResultVar != null)
				msgs = ((InternalEObject)newOwnedResultVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR, null, msgs);
			msgs = basicSetOwnedResultVar(newOwnedResultVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR, newOwnedResultVar, newOwnedResultVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR:
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
			case ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR:
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
			case ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR:
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
			case ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR:
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
			case ImperativeOCLCSPackage.COMPUTE_EXP_CS__OWNED_RESULT_VAR:
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitComputeExpCS(this);
	}

} //ComputeExpCSImpl
