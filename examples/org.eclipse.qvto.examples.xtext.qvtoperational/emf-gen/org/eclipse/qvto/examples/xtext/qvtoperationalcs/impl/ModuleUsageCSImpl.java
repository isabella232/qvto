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
import org.eclipse.ocl.xtext.basecs.impl.ElementCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImportKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Usage CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleUsageCSImpl#getImportKind <em>Import Kind</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleUsageCSImpl#getModuleKind <em>Module Kind</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ModuleUsageCSImpl#getOwnedModuleRefs <em>Owned Module Refs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleUsageCSImpl extends ElementCSImpl implements ModuleUsageCS {
	/**
	 * The default value of the '{@link #getImportKind() <em>Import Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportKind()
	 * @generated
	 * @ordered
	 */
	protected static final ImportKindCS IMPORT_KIND_EDEFAULT = ImportKindCS.EXTENSION;

	/**
	 * The cached value of the '{@link #getImportKind() <em>Import Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportKind()
	 * @generated
	 * @ordered
	 */
	protected ImportKindCS importKind = IMPORT_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleKind() <em>Module Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleKind()
	 * @generated
	 * @ordered
	 */
	protected static final ModuleKindCS MODULE_KIND_EDEFAULT = ModuleKindCS.TRANSFORMATION;

	/**
	 * The cached value of the '{@link #getModuleKind() <em>Module Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleKind()
	 * @generated
	 * @ordered
	 */
	protected ModuleKindCS moduleKind = MODULE_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedModuleRefs() <em>Owned Module Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModuleRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleRefCS> ownedModuleRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleUsageCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.MODULE_USAGE_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportKindCS getImportKind() {
		return importKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportKind(ImportKindCS newImportKind) {
		ImportKindCS oldImportKind = importKind;
		importKind = newImportKind == null ? IMPORT_KIND_EDEFAULT : newImportKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MODULE_USAGE_CS__IMPORT_KIND, oldImportKind, importKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleKindCS getModuleKind() {
		return moduleKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleKind(ModuleKindCS newModuleKind) {
		ModuleKindCS oldModuleKind = moduleKind;
		moduleKind = newModuleKind == null ? MODULE_KIND_EDEFAULT : newModuleKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MODULE_USAGE_CS__MODULE_KIND, oldModuleKind, moduleKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleRefCS> getOwnedModuleRefs() {
		if (ownedModuleRefs == null) {
			ownedModuleRefs = new EObjectContainmentEList<ModuleRefCS>(ModuleRefCS.class, this, QVTOperationalCSPackage.MODULE_USAGE_CS__OWNED_MODULE_REFS);
		}
		return ownedModuleRefs;
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
			case QVTOperationalCSPackage.MODULE_USAGE_CS__OWNED_MODULE_REFS:
				return ((InternalEList<?>)getOwnedModuleRefs()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalCSPackage.MODULE_USAGE_CS__IMPORT_KIND:
				return getImportKind();
			case QVTOperationalCSPackage.MODULE_USAGE_CS__MODULE_KIND:
				return getModuleKind();
			case QVTOperationalCSPackage.MODULE_USAGE_CS__OWNED_MODULE_REFS:
				return getOwnedModuleRefs();
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
			case QVTOperationalCSPackage.MODULE_USAGE_CS__IMPORT_KIND:
				setImportKind((ImportKindCS)newValue);
				return;
			case QVTOperationalCSPackage.MODULE_USAGE_CS__MODULE_KIND:
				setModuleKind((ModuleKindCS)newValue);
				return;
			case QVTOperationalCSPackage.MODULE_USAGE_CS__OWNED_MODULE_REFS:
				getOwnedModuleRefs().clear();
				getOwnedModuleRefs().addAll((Collection<? extends ModuleRefCS>)newValue);
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
			case QVTOperationalCSPackage.MODULE_USAGE_CS__IMPORT_KIND:
				setImportKind(IMPORT_KIND_EDEFAULT);
				return;
			case QVTOperationalCSPackage.MODULE_USAGE_CS__MODULE_KIND:
				setModuleKind(MODULE_KIND_EDEFAULT);
				return;
			case QVTOperationalCSPackage.MODULE_USAGE_CS__OWNED_MODULE_REFS:
				getOwnedModuleRefs().clear();
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
			case QVTOperationalCSPackage.MODULE_USAGE_CS__IMPORT_KIND:
				return importKind != IMPORT_KIND_EDEFAULT;
			case QVTOperationalCSPackage.MODULE_USAGE_CS__MODULE_KIND:
				return moduleKind != MODULE_KIND_EDEFAULT;
			case QVTOperationalCSPackage.MODULE_USAGE_CS__OWNED_MODULE_REFS:
				return ownedModuleRefs != null && !ownedModuleRefs.isEmpty();
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitModuleUsageCS(this);
	}

} //ModuleUsageCSImpl
