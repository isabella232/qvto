/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getOwnedRefinedModule <em>Owned Refined Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationCSImpl extends ModuleCSImpl implements TransformationCS {
	/**
	 * The cached value of the '{@link #getOwnedRefinedModule() <em>Owned Refined Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRefinedModule()
	 * @generated
	 * @ordered
	 */
	protected ModuleRefCS ownedRefinedModule;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.TRANSFORMATION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleRefCS getOwnedRefinedModule() {
		return ownedRefinedModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRefinedModule(ModuleRefCS newOwnedRefinedModule, NotificationChain msgs) {
		ModuleRefCS oldOwnedRefinedModule = ownedRefinedModule;
		ownedRefinedModule = newOwnedRefinedModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE, oldOwnedRefinedModule, newOwnedRefinedModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRefinedModule(ModuleRefCS newOwnedRefinedModule) {
		if (newOwnedRefinedModule != ownedRefinedModule) {
			NotificationChain msgs = null;
			if (ownedRefinedModule != null)
				msgs = ((InternalEObject)ownedRefinedModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE, null, msgs);
			if (newOwnedRefinedModule != null)
				msgs = ((InternalEObject)newOwnedRefinedModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE, null, msgs);
			msgs = basicSetOwnedRefinedModule(newOwnedRefinedModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE, newOwnedRefinedModule, newOwnedRefinedModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE:
				return basicSetOwnedRefinedModule(null, msgs);
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
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE:
				return getOwnedRefinedModule();
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
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE:
				setOwnedRefinedModule((ModuleRefCS)newValue);
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
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE:
				setOwnedRefinedModule((ModuleRefCS)null);
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
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_REFINED_MODULE:
				return ownedRefinedModule != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitTransformationCS(this);
	}

} //TransformationCSImpl
