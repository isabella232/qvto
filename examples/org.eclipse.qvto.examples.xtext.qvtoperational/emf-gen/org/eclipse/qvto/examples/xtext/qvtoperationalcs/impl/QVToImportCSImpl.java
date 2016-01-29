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
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.ocl.xtext.basecs.impl.ImportCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QV To Import CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToImportCSImpl#getOwnedUnitRef <em>Owned Unit Ref</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.QVToImportCSImpl#getImportedUnitElement <em>Imported Unit Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QVToImportCSImpl extends ImportCSImpl implements QVToImportCS {
	/**
	 * The cached value of the '{@link #getOwnedUnitRef() <em>Owned Unit Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUnitRef()
	 * @generated
	 * @ordered
	 */
	protected UnitRefCS ownedUnitRef;

	/**
	 * The cached value of the '{@link #getImportedUnitElement() <em>Imported Unit Element</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedUnitElement()
	 * @generated
	 * @ordered
	 */
	protected EList<String> importedUnitElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QVToImportCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.QV_TO_IMPORT_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitRefCS getOwnedUnitRef() {
		return ownedUnitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedUnitRef(UnitRefCS newOwnedUnitRef, NotificationChain msgs) {
		UnitRefCS oldOwnedUnitRef = ownedUnitRef;
		ownedUnitRef = newOwnedUnitRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF, oldOwnedUnitRef, newOwnedUnitRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedUnitRef(UnitRefCS newOwnedUnitRef) {
		if (newOwnedUnitRef != ownedUnitRef) {
			NotificationChain msgs = null;
			if (ownedUnitRef != null)
				msgs = ((InternalEObject)ownedUnitRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF, null, msgs);
			if (newOwnedUnitRef != null)
				msgs = ((InternalEObject)newOwnedUnitRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF, null, msgs);
			msgs = basicSetOwnedUnitRef(newOwnedUnitRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF, newOwnedUnitRef, newOwnedUnitRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImportedUnitElement() {
		if (importedUnitElement == null) {
			importedUnitElement = new EDataTypeUniqueEList<String>(String.class, this, QVTOperationalCSPackage.QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT);
		}
		return importedUnitElement;
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
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF:
				return basicSetOwnedUnitRef(null, msgs);
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
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF:
				return getOwnedUnitRef();
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT:
				return getImportedUnitElement();
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
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF:
				setOwnedUnitRef((UnitRefCS)newValue);
				return;
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT:
				getImportedUnitElement().clear();
				getImportedUnitElement().addAll((Collection<? extends String>)newValue);
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
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF:
				setOwnedUnitRef((UnitRefCS)null);
				return;
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT:
				getImportedUnitElement().clear();
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
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__OWNED_UNIT_REF:
				return ownedUnitRef != null;
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS__IMPORTED_UNIT_ELEMENT:
				return importedUnitElement != null && !importedUnitElement.isEmpty();
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitQVToImportCS(this);
	}

} //QVToImportCSImpl
