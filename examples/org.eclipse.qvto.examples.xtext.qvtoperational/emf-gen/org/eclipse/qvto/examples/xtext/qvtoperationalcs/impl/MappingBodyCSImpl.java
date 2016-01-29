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
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.ExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingBodyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Body CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingBodyCSImpl#getOwnedInitExps <em>Owned Init Exps</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingBodyCSImpl#getOwnedEndExps <em>Owned End Exps</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingBodyCSImpl#isHasPopulationKeyword <em>Has Population Keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingBodyCSImpl extends OperationBodyCSImpl implements MappingBodyCS {
	/**
	 * The cached value of the '{@link #getOwnedInitExps() <em>Owned Init Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInitExps()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpCS> ownedInitExps;

	/**
	 * The cached value of the '{@link #getOwnedEndExps() <em>Owned End Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndExps()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpCS> ownedEndExps;

	/**
	 * The default value of the '{@link #isHasPopulationKeyword() <em>Has Population Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPopulationKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_POPULATION_KEYWORD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPopulationKeyword() <em>Has Population Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPopulationKeyword()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPopulationKeyword = HAS_POPULATION_KEYWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingBodyCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.MAPPING_BODY_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getOwnedInitExps() {
		if (ownedInitExps == null) {
			ownedInitExps = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_INIT_EXPS);
		}
		return ownedInitExps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getOwnedEndExps() {
		if (ownedEndExps == null) {
			ownedEndExps = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_END_EXPS);
		}
		return ownedEndExps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasPopulationKeyword() {
		return hasPopulationKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPopulationKeyword(boolean newHasPopulationKeyword) {
		boolean oldHasPopulationKeyword = hasPopulationKeyword;
		hasPopulationKeyword = newHasPopulationKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MAPPING_BODY_CS__HAS_POPULATION_KEYWORD, oldHasPopulationKeyword, hasPopulationKeyword));
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
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_INIT_EXPS:
				return ((InternalEList<?>)getOwnedInitExps()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_END_EXPS:
				return ((InternalEList<?>)getOwnedEndExps()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_INIT_EXPS:
				return getOwnedInitExps();
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_END_EXPS:
				return getOwnedEndExps();
			case QVTOperationalCSPackage.MAPPING_BODY_CS__HAS_POPULATION_KEYWORD:
				return isHasPopulationKeyword();
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
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_INIT_EXPS:
				getOwnedInitExps().clear();
				getOwnedInitExps().addAll((Collection<? extends ExpCS>)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_END_EXPS:
				getOwnedEndExps().clear();
				getOwnedEndExps().addAll((Collection<? extends ExpCS>)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_BODY_CS__HAS_POPULATION_KEYWORD:
				setHasPopulationKeyword((Boolean)newValue);
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
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_INIT_EXPS:
				getOwnedInitExps().clear();
				return;
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_END_EXPS:
				getOwnedEndExps().clear();
				return;
			case QVTOperationalCSPackage.MAPPING_BODY_CS__HAS_POPULATION_KEYWORD:
				setHasPopulationKeyword(HAS_POPULATION_KEYWORD_EDEFAULT);
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
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_INIT_EXPS:
				return ownedInitExps != null && !ownedInitExps.isEmpty();
			case QVTOperationalCSPackage.MAPPING_BODY_CS__OWNED_END_EXPS:
				return ownedEndExps != null && !ownedEndExps.isEmpty();
			case QVTOperationalCSPackage.MAPPING_BODY_CS__HAS_POPULATION_KEYWORD:
				return hasPopulationKeyword != HAS_POPULATION_KEYWORD_EDEFAULT;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitMappingBodyCS(this);
	}

} //MappingBodyCSImpl
