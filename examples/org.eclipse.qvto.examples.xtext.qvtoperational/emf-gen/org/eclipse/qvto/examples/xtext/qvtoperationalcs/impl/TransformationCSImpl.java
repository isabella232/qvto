/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.ClassCS;
import org.eclipse.ocl.xtext.basecs.ConstraintCS;
import org.eclipse.ocl.xtext.basecs.PackageCS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.TemplateSignatureCS;
import org.eclipse.ocl.xtext.basecs.TemplateableElementCS;
import org.eclipse.ocl.xtext.basecs.TypeCS;
import org.eclipse.ocl.xtext.basecs.impl.PackageCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS;
import org.eclipse.qvto.examples.pivot.qvtoperational.OperationalTransformation;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationRefineCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getOwnedSignature <em>Owned Signature</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getOwnedConstraints <em>Owned Constraints</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getPathNameCS <em>Path Name CS</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getModuleUsages <em>Module Usages</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.TransformationCSImpl#getTransformationRefineCS <em>Transformation Refine CS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationCSImpl extends PackageCSImpl implements TransformationCS {
	/**
	 * The cached value of the '{@link #getOwnedSignature() <em>Owned Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignatureCS ownedSignature;

	/**
	 * The default value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClassName() <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClassName()
	 * @generated
	 * @ordered
	 */
	protected String instanceClassName = INSTANCE_CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedConstraints() <em>Owned Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintCS> ownedConstraints;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<StringLiteralExpCS> qualifiers;

	/**
	 * The cached value of the '{@link #getPathNameCS() <em>Path Name CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathNameCS()
	 * @generated
	 * @ordered
	 */
	protected PathNameCS pathNameCS;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterDeclarationCS> parameters;

	/**
	 * The cached value of the '{@link #getModuleUsages() <em>Module Usages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleUsageCS> moduleUsages;

	/**
	 * The cached value of the '{@link #getTransformationRefineCS() <em>Transformation Refine CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformationRefineCS()
	 * @generated
	 * @ordered
	 */
	protected TransformationRefineCS transformationRefineCS;

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
	public TemplateSignatureCS getOwnedSignature() {
		return ownedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSignature(TemplateSignatureCS newOwnedSignature, NotificationChain msgs) {
		TemplateSignatureCS oldOwnedSignature = ownedSignature;
		ownedSignature = newOwnedSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE, oldOwnedSignature, newOwnedSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSignature(TemplateSignatureCS newOwnedSignature) {
		if (newOwnedSignature != ownedSignature) {
			NotificationChain msgs = null;
			if (ownedSignature != null)
				msgs = ((InternalEObject)ownedSignature).eInverseRemove(this, BaseCSPackage.TEMPLATE_SIGNATURE_CS__OWNING_ELEMENT, TemplateSignatureCS.class, msgs);
			if (newOwnedSignature != null)
				msgs = ((InternalEObject)newOwnedSignature).eInverseAdd(this, BaseCSPackage.TEMPLATE_SIGNATURE_CS__OWNING_ELEMENT, TemplateSignatureCS.class, msgs);
			msgs = basicSetOwnedSignature(newOwnedSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE, newOwnedSignature, newOwnedSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClassName() {
		return instanceClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClassName(String newInstanceClassName) {
		String oldInstanceClassName = instanceClassName;
		instanceClassName = newInstanceClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__INSTANCE_CLASS_NAME, oldInstanceClassName, instanceClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintCS> getOwnedConstraints() {
		if (ownedConstraints == null) {
			ownedConstraints = new EObjectContainmentEList<ConstraintCS>(ConstraintCS.class, this, QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS);
		}
		return ownedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageCS getOwningPackage() {
		if (eContainerFeatureID() != QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE) return null;
		return (PackageCS)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningPackage(PackageCS newOwningPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningPackage, QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningPackage(PackageCS newOwningPackage) {
		if (newOwningPackage != eInternalContainer() || (eContainerFeatureID() != QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE && newOwningPackage != null)) {
			if (EcoreUtil.isAncestor(this, newOwningPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningPackage != null)
				msgs = ((InternalEObject)newOwningPackage).eInverseAdd(this, BaseCSPackage.PACKAGE_CS__OWNED_CLASSES, PackageCS.class, msgs);
			msgs = basicSetOwningPackage(newOwningPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE, newOwningPackage, newOwningPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringLiteralExpCS> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EObjectContainmentEList<StringLiteralExpCS>(StringLiteralExpCS.class, this, QVTOperationalCSPackage.TRANSFORMATION_CS__QUALIFIERS);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathNameCS getPathNameCS() {
		return pathNameCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathNameCS(PathNameCS newPathNameCS, NotificationChain msgs) {
		PathNameCS oldPathNameCS = pathNameCS;
		pathNameCS = newPathNameCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS, oldPathNameCS, newPathNameCS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathNameCS(PathNameCS newPathNameCS) {
		if (newPathNameCS != pathNameCS) {
			NotificationChain msgs = null;
			if (pathNameCS != null)
				msgs = ((InternalEObject)pathNameCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS, null, msgs);
			if (newPathNameCS != null)
				msgs = ((InternalEObject)newPathNameCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS, null, msgs);
			msgs = basicSetPathNameCS(newPathNameCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS, newPathNameCS, newPathNameCS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterDeclarationCS> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ParameterDeclarationCS>(ParameterDeclarationCS.class, this, QVTOperationalCSPackage.TRANSFORMATION_CS__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleUsageCS> getModuleUsages() {
		if (moduleUsages == null) {
			moduleUsages = new EObjectContainmentEList<ModuleUsageCS>(ModuleUsageCS.class, this, QVTOperationalCSPackage.TRANSFORMATION_CS__MODULE_USAGES);
		}
		return moduleUsages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRefineCS getTransformationRefineCS() {
		return transformationRefineCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationRefineCS(TransformationRefineCS newTransformationRefineCS, NotificationChain msgs) {
		TransformationRefineCS oldTransformationRefineCS = transformationRefineCS;
		transformationRefineCS = newTransformationRefineCS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS, oldTransformationRefineCS, newTransformationRefineCS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationRefineCS(TransformationRefineCS newTransformationRefineCS) {
		if (newTransformationRefineCS != transformationRefineCS) {
			NotificationChain msgs = null;
			if (transformationRefineCS != null)
				msgs = ((InternalEObject)transformationRefineCS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS, null, msgs);
			if (newTransformationRefineCS != null)
				msgs = ((InternalEObject)newTransformationRefineCS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS, null, msgs);
			msgs = basicSetTransformationRefineCS(newTransformationRefineCS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS, newTransformationRefineCS, newTransformationRefineCS));
	}

	/**
	 * The cached invocation delegate for the '{@link #ast() <em>Ast</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ast()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AST__EINVOCATION_DELEGATE = ((EOperation.Internal)QVTOperationalCSPackage.Literals.TRANSFORMATION_CS.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalTransformation ast() {
		try {
			return (OperationalTransformation)AST__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE:
				if (ownedSignature != null)
					msgs = ((InternalEObject)ownedSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE, null, msgs);
				return basicSetOwnedSignature((TemplateSignatureCS)otherEnd, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningPackage((PackageCS)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE:
				return basicSetOwnedSignature(null, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS:
				return ((InternalEList<?>)getOwnedConstraints()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE:
				return basicSetOwningPackage(null, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__QUALIFIERS:
				return ((InternalEList<?>)getQualifiers()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS:
				return basicSetPathNameCS(null, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__MODULE_USAGES:
				return ((InternalEList<?>)getModuleUsages()).basicRemove(otherEnd, msgs);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS:
				return basicSetTransformationRefineCS(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, BaseCSPackage.PACKAGE_CS__OWNED_CLASSES, PackageCS.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE:
				return getOwnedSignature();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__INSTANCE_CLASS_NAME:
				return getInstanceClassName();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS:
				return getOwnedConstraints();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE:
				return getOwningPackage();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__QUALIFIERS:
				return getQualifiers();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS:
				return getPathNameCS();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PARAMETERS:
				return getParameters();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__MODULE_USAGES:
				return getModuleUsages();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS:
				return getTransformationRefineCS();
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
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE:
				setOwnedSignature((TemplateSignatureCS)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__INSTANCE_CLASS_NAME:
				setInstanceClassName((String)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				getOwnedConstraints().addAll((Collection<? extends ConstraintCS>)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE:
				setOwningPackage((PackageCS)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__QUALIFIERS:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends StringLiteralExpCS>)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS:
				setPathNameCS((PathNameCS)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ParameterDeclarationCS>)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__MODULE_USAGES:
				getModuleUsages().clear();
				getModuleUsages().addAll((Collection<? extends ModuleUsageCS>)newValue);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS:
				setTransformationRefineCS((TransformationRefineCS)newValue);
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
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE:
				setOwnedSignature((TemplateSignatureCS)null);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__INSTANCE_CLASS_NAME:
				setInstanceClassName(INSTANCE_CLASS_NAME_EDEFAULT);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE:
				setOwningPackage((PackageCS)null);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__QUALIFIERS:
				getQualifiers().clear();
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS:
				setPathNameCS((PathNameCS)null);
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PARAMETERS:
				getParameters().clear();
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__MODULE_USAGES:
				getModuleUsages().clear();
				return;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS:
				setTransformationRefineCS((TransformationRefineCS)null);
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
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE:
				return ownedSignature != null;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__INSTANCE_CLASS_NAME:
				return INSTANCE_CLASS_NAME_EDEFAULT == null ? instanceClassName != null : !INSTANCE_CLASS_NAME_EDEFAULT.equals(instanceClassName);
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS:
				return ownedConstraints != null && !ownedConstraints.isEmpty();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE:
				return getOwningPackage() != null;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__QUALIFIERS:
				return qualifiers != null && !qualifiers.isEmpty();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PATH_NAME_CS:
				return pathNameCS != null;
			case QVTOperationalCSPackage.TRANSFORMATION_CS__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__MODULE_USAGES:
				return moduleUsages != null && !moduleUsages.isEmpty();
			case QVTOperationalCSPackage.TRANSFORMATION_CS__TRANSFORMATION_REFINE_CS:
				return transformationRefineCS != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypeCS.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElementCS.class) {
			switch (derivedFeatureID) {
				case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE: return BaseCSPackage.TEMPLATEABLE_ELEMENT_CS__OWNED_SIGNATURE;
				default: return -1;
			}
		}
		if (baseClass == ClassCS.class) {
			switch (derivedFeatureID) {
				case QVTOperationalCSPackage.TRANSFORMATION_CS__INSTANCE_CLASS_NAME: return BaseCSPackage.CLASS_CS__INSTANCE_CLASS_NAME;
				case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS: return BaseCSPackage.CLASS_CS__OWNED_CONSTRAINTS;
				case QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE: return BaseCSPackage.CLASS_CS__OWNING_PACKAGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypeCS.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElementCS.class) {
			switch (baseFeatureID) {
				case BaseCSPackage.TEMPLATEABLE_ELEMENT_CS__OWNED_SIGNATURE: return QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_SIGNATURE;
				default: return -1;
			}
		}
		if (baseClass == ClassCS.class) {
			switch (baseFeatureID) {
				case BaseCSPackage.CLASS_CS__INSTANCE_CLASS_NAME: return QVTOperationalCSPackage.TRANSFORMATION_CS__INSTANCE_CLASS_NAME;
				case BaseCSPackage.CLASS_CS__OWNED_CONSTRAINTS: return QVTOperationalCSPackage.TRANSFORMATION_CS__OWNED_CONSTRAINTS;
				case BaseCSPackage.CLASS_CS__OWNING_PACKAGE: return QVTOperationalCSPackage.TRANSFORMATION_CS__OWNING_PACKAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
