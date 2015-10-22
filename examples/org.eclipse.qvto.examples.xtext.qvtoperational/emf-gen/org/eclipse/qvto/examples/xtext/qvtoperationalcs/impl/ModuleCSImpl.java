/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.impl.StructuredClassCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleCSImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleCSImpl#getOwnedModuleUsages <em>Owned Module Usages</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleCSImpl#getOwnedQualifiers <em>Owned Qualifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleCSImpl extends StructuredClassCSImpl implements ModuleCS {
	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterCS> ownedParameters;

	/**
	 * The cached value of the '{@link #getOwnedModuleUsages() <em>Owned Module Usages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModuleUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleUsageCS> ownedModuleUsages;

	/**
	 * The cached value of the '{@link #getOwnedQualifiers() <em>Owned Qualifiers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ownedQualifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.MODULE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterCS> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList<ParameterCS>(ParameterCS.class, this, QVTOperationalCSPackage.MODULE_CS__OWNED_PARAMETERS);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleUsageCS> getOwnedModuleUsages() {
		if (ownedModuleUsages == null) {
			ownedModuleUsages = new EObjectContainmentEList<ModuleUsageCS>(ModuleUsageCS.class, this, QVTOperationalCSPackage.MODULE_CS__OWNED_MODULE_USAGES);
		}
		return ownedModuleUsages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOwnedQualifiers() {
		if (ownedQualifiers == null) {
			ownedQualifiers = new EDataTypeUniqueEList<String>(String.class, this, QVTOperationalCSPackage.MODULE_CS__OWNED_QUALIFIERS);
		}
		return ownedQualifiers;
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
			case QVTOperationalCSPackage.MODULE_CS__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.MODULE_CS__OWNED_MODULE_USAGES:
				return ((InternalEList<?>)getOwnedModuleUsages()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalCSPackage.MODULE_CS__OWNED_PARAMETERS:
				return getOwnedParameters();
			case QVTOperationalCSPackage.MODULE_CS__OWNED_MODULE_USAGES:
				return getOwnedModuleUsages();
			case QVTOperationalCSPackage.MODULE_CS__OWNED_QUALIFIERS:
				return getOwnedQualifiers();
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
			case QVTOperationalCSPackage.MODULE_CS__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends ParameterCS>)newValue);
				return;
			case QVTOperationalCSPackage.MODULE_CS__OWNED_MODULE_USAGES:
				getOwnedModuleUsages().clear();
				getOwnedModuleUsages().addAll((Collection<? extends ModuleUsageCS>)newValue);
				return;
			case QVTOperationalCSPackage.MODULE_CS__OWNED_QUALIFIERS:
				getOwnedQualifiers().clear();
				getOwnedQualifiers().addAll((Collection<? extends String>)newValue);
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
			case QVTOperationalCSPackage.MODULE_CS__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case QVTOperationalCSPackage.MODULE_CS__OWNED_MODULE_USAGES:
				getOwnedModuleUsages().clear();
				return;
			case QVTOperationalCSPackage.MODULE_CS__OWNED_QUALIFIERS:
				getOwnedQualifiers().clear();
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
			case QVTOperationalCSPackage.MODULE_CS__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case QVTOperationalCSPackage.MODULE_CS__OWNED_MODULE_USAGES:
				return ownedModuleUsages != null && !ownedModuleUsages.isEmpty();
			case QVTOperationalCSPackage.MODULE_CS__OWNED_QUALIFIERS:
				return ownedQualifiers != null && !ownedQualifiers.isEmpty();
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitModuleCS(this);
	}

} //ModuleCSImpl
