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
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.DirectionKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Operation CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl#getOwnedInheritRefs <em>Owned Inherit Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl#getOwnedDisjunctRefs <em>Owned Disjunct Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl#getOwnedMergeRefs <em>Owned Merge Refs</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl#getOwnedRefinedRule <em>Owned Refined Rule</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl#getOwnedWhenExps <em>Owned When Exps</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingOperationCSImpl#getOwnedWhereExps <em>Owned Where Exps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingOperationCSImpl extends ImperativeOperationCSImpl implements MappingOperationCS {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionKindCS DIRECTION_EDEFAULT = DirectionKindCS.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected DirectionKindCS direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedInheritRefs() <em>Owned Inherit Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInheritRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationRefCS> ownedInheritRefs;

	/**
	 * The cached value of the '{@link #getOwnedDisjunctRefs() <em>Owned Disjunct Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDisjunctRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationRefCS> ownedDisjunctRefs;

	/**
	 * The cached value of the '{@link #getOwnedMergeRefs() <em>Owned Merge Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMergeRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationRefCS> ownedMergeRefs;

	/**
	 * The cached value of the '{@link #getOwnedRefinedRule() <em>Owned Refined Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRefinedRule()
	 * @generated
	 * @ordered
	 */
	protected PathName2CS ownedRefinedRule;

	/**
	 * The cached value of the '{@link #getOwnedWhenExps() <em>Owned When Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedWhenExps()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpCS> ownedWhenExps;

	/**
	 * The cached value of the '{@link #getOwnedWhereExps() <em>Owned Where Exps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedWhereExps()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpCS> ownedWhereExps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingOperationCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.MAPPING_OPERATION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionKindCS getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(DirectionKindCS newDirection) {
		DirectionKindCS oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MAPPING_OPERATION_CS__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationRefCS> getOwnedInheritRefs() {
		if (ownedInheritRefs == null) {
			ownedInheritRefs = new EObjectContainmentEList<OperationRefCS>(OperationRefCS.class, this, QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_INHERIT_REFS);
		}
		return ownedInheritRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationRefCS> getOwnedDisjunctRefs() {
		if (ownedDisjunctRefs == null) {
			ownedDisjunctRefs = new EObjectContainmentEList<OperationRefCS>(OperationRefCS.class, this, QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS);
		}
		return ownedDisjunctRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationRefCS> getOwnedMergeRefs() {
		if (ownedMergeRefs == null) {
			ownedMergeRefs = new EObjectContainmentEList<OperationRefCS>(OperationRefCS.class, this, QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_MERGE_REFS);
		}
		return ownedMergeRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathName2CS getOwnedRefinedRule() {
		return ownedRefinedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRefinedRule(PathName2CS newOwnedRefinedRule, NotificationChain msgs) {
		PathName2CS oldOwnedRefinedRule = ownedRefinedRule;
		ownedRefinedRule = newOwnedRefinedRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE, oldOwnedRefinedRule, newOwnedRefinedRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRefinedRule(PathName2CS newOwnedRefinedRule) {
		if (newOwnedRefinedRule != ownedRefinedRule) {
			NotificationChain msgs = null;
			if (ownedRefinedRule != null)
				msgs = ((InternalEObject)ownedRefinedRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE, null, msgs);
			if (newOwnedRefinedRule != null)
				msgs = ((InternalEObject)newOwnedRefinedRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE, null, msgs);
			msgs = basicSetOwnedRefinedRule(newOwnedRefinedRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE, newOwnedRefinedRule, newOwnedRefinedRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getOwnedWhenExps() {
		if (ownedWhenExps == null) {
			ownedWhenExps = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHEN_EXPS);
		}
		return ownedWhenExps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpCS> getOwnedWhereExps() {
		if (ownedWhereExps == null) {
			ownedWhereExps = new EObjectContainmentEList<ExpCS>(ExpCS.class, this, QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHERE_EXPS);
		}
		return ownedWhereExps;
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
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_INHERIT_REFS:
				return ((InternalEList<?>)getOwnedInheritRefs()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS:
				return ((InternalEList<?>)getOwnedDisjunctRefs()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_MERGE_REFS:
				return ((InternalEList<?>)getOwnedMergeRefs()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE:
				return basicSetOwnedRefinedRule(null, msgs);
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHEN_EXPS:
				return ((InternalEList<?>)getOwnedWhenExps()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHERE_EXPS:
				return ((InternalEList<?>)getOwnedWhereExps()).basicRemove(otherEnd, msgs);
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
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__DIRECTION:
				return getDirection();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_INHERIT_REFS:
				return getOwnedInheritRefs();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS:
				return getOwnedDisjunctRefs();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_MERGE_REFS:
				return getOwnedMergeRefs();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE:
				return getOwnedRefinedRule();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHEN_EXPS:
				return getOwnedWhenExps();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHERE_EXPS:
				return getOwnedWhereExps();
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
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__DIRECTION:
				setDirection((DirectionKindCS)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_INHERIT_REFS:
				getOwnedInheritRefs().clear();
				getOwnedInheritRefs().addAll((Collection<? extends OperationRefCS>)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS:
				getOwnedDisjunctRefs().clear();
				getOwnedDisjunctRefs().addAll((Collection<? extends OperationRefCS>)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_MERGE_REFS:
				getOwnedMergeRefs().clear();
				getOwnedMergeRefs().addAll((Collection<? extends OperationRefCS>)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE:
				setOwnedRefinedRule((PathName2CS)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHEN_EXPS:
				getOwnedWhenExps().clear();
				getOwnedWhenExps().addAll((Collection<? extends ExpCS>)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHERE_EXPS:
				getOwnedWhereExps().clear();
				getOwnedWhereExps().addAll((Collection<? extends ExpCS>)newValue);
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
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_INHERIT_REFS:
				getOwnedInheritRefs().clear();
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS:
				getOwnedDisjunctRefs().clear();
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_MERGE_REFS:
				getOwnedMergeRefs().clear();
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE:
				setOwnedRefinedRule((PathName2CS)null);
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHEN_EXPS:
				getOwnedWhenExps().clear();
				return;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHERE_EXPS:
				getOwnedWhereExps().clear();
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
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_INHERIT_REFS:
				return ownedInheritRefs != null && !ownedInheritRefs.isEmpty();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_DISJUNCT_REFS:
				return ownedDisjunctRefs != null && !ownedDisjunctRefs.isEmpty();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_MERGE_REFS:
				return ownedMergeRefs != null && !ownedMergeRefs.isEmpty();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_REFINED_RULE:
				return ownedRefinedRule != null;
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHEN_EXPS:
				return ownedWhenExps != null && !ownedWhenExps.isEmpty();
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS__OWNED_WHERE_EXPS:
				return ownedWhereExps != null && !ownedWhereExps.isEmpty();
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitMappingOperationCS(this);
	}

} //MappingOperationCSImpl
