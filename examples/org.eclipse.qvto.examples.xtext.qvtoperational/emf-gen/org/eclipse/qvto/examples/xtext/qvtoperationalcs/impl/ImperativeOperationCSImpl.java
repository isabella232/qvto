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
import org.eclipse.ocl.xtext.basecs.impl.OperationCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ImperativeOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.OperationBodyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative Operation CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ImperativeOperationCSImpl#getOwnedScopedName <em>Owned Scoped Name</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ImperativeOperationCSImpl#getOwnedResults <em>Owned Results</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.ImperativeOperationCSImpl#getOwnedBody <em>Owned Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImperativeOperationCSImpl extends OperationCSImpl implements ImperativeOperationCS {
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
	 * The cached value of the '{@link #getOwnedResults() <em>Owned Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResults()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDeclarationCS> ownedResults;

	/**
	 * The cached value of the '{@link #getOwnedBody() <em>Owned Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBody()
	 * @generated
	 * @ordered
	 */
	protected OperationBodyCS ownedBody;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImperativeOperationCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.IMPERATIVE_OPERATION_CS;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME, oldOwnedScopedName, newOwnedScopedName);
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
				msgs = ((InternalEObject)ownedScopedName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME, null, msgs);
			if (newOwnedScopedName != null)
				msgs = ((InternalEObject)newOwnedScopedName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME, null, msgs);
			msgs = basicSetOwnedScopedName(newOwnedScopedName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME, newOwnedScopedName, newOwnedScopedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclarationCS> getOwnedResults() {
		if (ownedResults == null) {
			ownedResults = new EObjectContainmentEList<ParameterDeclarationCS>(ParameterDeclarationCS.class, this, QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_RESULTS);
		}
		return ownedResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationBodyCS getOwnedBody() {
		return ownedBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedBody(OperationBodyCS newOwnedBody, NotificationChain msgs) {
		OperationBodyCS oldOwnedBody = ownedBody;
		ownedBody = newOwnedBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY, oldOwnedBody, newOwnedBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedBody(OperationBodyCS newOwnedBody) {
		if (newOwnedBody != ownedBody) {
			NotificationChain msgs = null;
			if (ownedBody != null)
				msgs = ((InternalEObject)ownedBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY, null, msgs);
			if (newOwnedBody != null)
				msgs = ((InternalEObject)newOwnedBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY, null, msgs);
			msgs = basicSetOwnedBody(newOwnedBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY, newOwnedBody, newOwnedBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME:
				return basicSetOwnedScopedName(null, msgs);
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_RESULTS:
				return ((InternalEList<?>)getOwnedResults()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY:
				return basicSetOwnedBody(null, msgs);
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
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME:
				return getOwnedScopedName();
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_RESULTS:
				return getOwnedResults();
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY:
				return getOwnedBody();
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
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME:
				setOwnedScopedName((PathName2CS)newValue);
				return;
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_RESULTS:
				getOwnedResults().clear();
				getOwnedResults().addAll((Collection<? extends ParameterDeclarationCS>)newValue);
				return;
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY:
				setOwnedBody((OperationBodyCS)newValue);
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
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME:
				setOwnedScopedName((PathName2CS)null);
				return;
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_RESULTS:
				getOwnedResults().clear();
				return;
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY:
				setOwnedBody((OperationBodyCS)null);
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
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_SCOPED_NAME:
				return ownedScopedName != null;
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_RESULTS:
				return ownedResults != null && !ownedResults.isEmpty();
			case QVTOperationalCSPackage.IMPERATIVE_OPERATION_CS__OWNED_BODY:
				return ownedBody != null;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitImperativeOperationCS(this);
	}

} //ImperativeOperationCSImpl
