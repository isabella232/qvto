/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.xtext.basecs.impl.PackageCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelKind;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MetamodelCSImpl#getMetamodelKind <em>Metamodel Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelCSImpl extends PackageCSImpl implements MetamodelCS {
	/**
	 * The default value of the '{@link #getMetamodelKind() <em>Metamodel Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelKind()
	 * @generated
	 * @ordered
	 */
	protected static final MetamodelKind METAMODEL_KIND_EDEFAULT = MetamodelKind.METAMODEL;

	/**
	 * The cached value of the '{@link #getMetamodelKind() <em>Metamodel Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelKind()
	 * @generated
	 * @ordered
	 */
	protected MetamodelKind metamodelKind = METAMODEL_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.METAMODEL_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelKind getMetamodelKind() {
		return metamodelKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelKind(MetamodelKind newMetamodelKind) {
		MetamodelKind oldMetamodelKind = metamodelKind;
		metamodelKind = newMetamodelKind == null ? METAMODEL_KIND_EDEFAULT : newMetamodelKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.METAMODEL_CS__METAMODEL_KIND, oldMetamodelKind, metamodelKind));
	}

	/**
	 * The cached invocation delegate for the '{@link #ast() <em>Ast</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ast()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AST__EINVOCATION_DELEGATE = ((EOperation.Internal)QVTOperationalCSPackage.Literals.METAMODEL_CS.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.ocl.pivot.Package ast() {
		try {
			return (org.eclipse.ocl.pivot.Package)AST__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case QVTOperationalCSPackage.METAMODEL_CS__METAMODEL_KIND:
				return getMetamodelKind();
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
			case QVTOperationalCSPackage.METAMODEL_CS__METAMODEL_KIND:
				setMetamodelKind((MetamodelKind)newValue);
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
			case QVTOperationalCSPackage.METAMODEL_CS__METAMODEL_KIND:
				setMetamodelKind(METAMODEL_KIND_EDEFAULT);
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
			case QVTOperationalCSPackage.METAMODEL_CS__METAMODEL_KIND:
				return metamodelKind != METAMODEL_KIND_EDEFAULT;
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
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitMetamodelCS(this);
	}

} //MetamodelCSImpl
