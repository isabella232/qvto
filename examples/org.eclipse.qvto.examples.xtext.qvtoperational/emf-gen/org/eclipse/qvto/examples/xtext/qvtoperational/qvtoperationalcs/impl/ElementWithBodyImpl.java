/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.examples.xtext.base.baseCST.impl.ElementCSImpl;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ElementWithBody;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Element With Body</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.impl.ElementWithBodyImpl#getBodyStartLocation <em>Body Start Location</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.impl.ElementWithBodyImpl#getBodyEndLocation <em>Body End Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementWithBodyImpl
		extends ElementCSImpl
		implements ElementWithBody {

	/**
	 * The default value of the '{@link #getBodyStartLocation() <em>Body Start Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBodyStartLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int BODY_START_LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBodyStartLocation() <em>Body Start Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBodyStartLocation()
	 * @generated
	 * @ordered
	 */
	protected int bodyStartLocation = BODY_START_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBodyEndLocation() <em>Body End Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBodyEndLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int BODY_END_LOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBodyEndLocation() <em>Body End Location</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBodyEndLocation()
	 * @generated
	 * @ordered
	 */
	protected int bodyEndLocation = BODY_END_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementWithBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QvtoperationalcsPackage.Literals.ELEMENT_WITH_BODY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getBodyStartLocation() {
		return bodyStartLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyStartLocation(int newBodyStartLocation) {
		int oldBodyStartLocation = bodyStartLocation;
		bodyStartLocation = newBodyStartLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_START_LOCATION, oldBodyStartLocation, bodyStartLocation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getBodyEndLocation() {
		return bodyEndLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyEndLocation(int newBodyEndLocation) {
		int oldBodyEndLocation = bodyEndLocation;
		bodyEndLocation = newBodyEndLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_END_LOCATION, oldBodyEndLocation, bodyEndLocation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_START_LOCATION:
				return getBodyStartLocation();
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_END_LOCATION:
				return getBodyEndLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_START_LOCATION:
				setBodyStartLocation((Integer)newValue);
				return;
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_END_LOCATION:
				setBodyEndLocation((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_START_LOCATION:
				setBodyStartLocation(BODY_START_LOCATION_EDEFAULT);
				return;
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_END_LOCATION:
				setBodyEndLocation(BODY_END_LOCATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_START_LOCATION:
				return bodyStartLocation != BODY_START_LOCATION_EDEFAULT;
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY__BODY_END_LOCATION:
				return bodyEndLocation != BODY_END_LOCATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bodyStartLocation: ");
		result.append(bodyStartLocation);
		result.append(", bodyEndLocation: ");
		result.append(bodyEndLocation);
		result.append(')');
		return result.toString();
	}

} // ElementWithBodyImpl