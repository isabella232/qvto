/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.xtext.basecs.impl.ElementRefCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Ref CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleRefCSImpl#getOwnedScopedName <em>Owned Scoped Name</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleRefCSImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleRefCSImpl extends ElementRefCSImpl implements ModuleRefCS {
	/**
	 * The cached value of the '{@link #getOwnedScopedName() <em>Owned Scoped Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedScopedName()
	 * @generated
	 * @ordered
	 */
	protected PathName2CS ownedScopedName;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDeclarationCS> ownedParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleRefCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.MODULE_REF_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathName2CS getOwnedScopedName() {
		return ownedScopedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedScopedName(PathName2CS newOwnedScopedName, NotificationChain msgs) {
		PathName2CS oldOwnedScopedName = ownedScopedName;
		ownedScopedName = newOwnedScopedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME, oldOwnedScopedName, newOwnedScopedName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedScopedName(PathName2CS newOwnedScopedName) {
		if (newOwnedScopedName != ownedScopedName) {
			NotificationChain msgs = null;
			if (ownedScopedName != null)
				msgs = ((InternalEObject)ownedScopedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME, null, msgs);
			if (newOwnedScopedName != null)
				msgs = ((InternalEObject)newOwnedScopedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME, null, msgs);
			msgs = basicSetOwnedScopedName(newOwnedScopedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME, newOwnedScopedName, newOwnedScopedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclarationCS> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList<ParameterDeclarationCS>(ParameterDeclarationCS.class, this, QVTOperationalCSPackage.MODULE_REF_CS__OWNED_PARAMETERS);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME:
				return basicSetOwnedScopedName(null, msgs);
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME:
				return getOwnedScopedName();
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_PARAMETERS:
				return getOwnedParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME:
				setOwnedScopedName((PathName2CS)newValue);
				return;
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends ParameterDeclarationCS>)newValue);
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
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME:
				setOwnedScopedName((PathName2CS)null);
				return;
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_PARAMETERS:
				getOwnedParameters().clear();
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
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_SCOPED_NAME:
				return ownedScopedName != null;
			case QVTOperationalCSPackage.MODULE_REF_CS__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitModuleRefCS(this);
	}

} //ModuleRefCSImpl
