/**
 */
package org.eclipse.qvto.examples.xtext.imperativeoclcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ForExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.util.ImperativeOCLCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Exp CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.imperativeoclcs.impl.ForExpCSImpl#getIsOne <em>Is One</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForExpCSImpl extends ImperativeLoopExpCSImpl implements ForExpCS {
	/**
	 * The default value of the '{@link #getIsOne() <em>Is One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOne()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ONE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIsOne() <em>Is One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOne()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOne = IS_ONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForExpCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImperativeOCLCSPackage.Literals.FOR_EXP_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOne() {
		return isOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOne(Boolean newIsOne) {
		Boolean oldIsOne = isOne;
		isOne = newIsOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImperativeOCLCSPackage.FOR_EXP_CS__IS_ONE, oldIsOne, isOne));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImperativeOCLCSPackage.FOR_EXP_CS__IS_ONE:
				return getIsOne();
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
			case ImperativeOCLCSPackage.FOR_EXP_CS__IS_ONE:
				setIsOne((Boolean)newValue);
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
			case ImperativeOCLCSPackage.FOR_EXP_CS__IS_ONE:
				setIsOne(IS_ONE_EDEFAULT);
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
			case ImperativeOCLCSPackage.FOR_EXP_CS__IS_ONE:
				return IS_ONE_EDEFAULT == null ? isOne != null : !IS_ONE_EDEFAULT.equals(isOne);
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
		return (R) ((ImperativeOCLCSVisitor<?>)visitor).visitForExpCS(this);
	}

} //ForExpCSImpl
