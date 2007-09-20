/**
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 * 
 * 
 *
 * $Id: ScopedNameCSImpl.java,v 1.4 2007/09/20 10:14:06 aigdalov Exp $
 */
package org.eclipse.m2m.qvt.oml.internal.cst.temp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.m2m.qvt.oml.internal.cst.temp.ScopedNameCS;
import org.eclipse.m2m.qvt.oml.internal.cst.temp.TempPackage;

import org.eclipse.ocl.internal.cst.TypeCS;

import org.eclipse.ocl.internal.cst.impl.CSTNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scoped Name CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.m2m.qvt.oml.internal.cst.temp.impl.ScopedNameCSImpl#getTypeCS <em>Type CS</em>}</li>
 *   <li>{@link org.eclipse.m2m.qvt.oml.internal.cst.temp.impl.ScopedNameCSImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopedNameCSImpl extends CSTNodeImpl implements ScopedNameCS {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "Copyright (c) 2007 Borland Software Corporation\r\n\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\n  \r\nContributors:\r\n    Borland Software Corporation - initial API and implementation\r\n\r\n"; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getTypeCS() <em>Type CS</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypeCS()
     * @generated
     * @ordered
     */
    protected TypeCS typeCS;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScopedNameCSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TempPackage.Literals.SCOPED_NAME_CS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeCS getTypeCS() {
        if (typeCS != null && typeCS.eIsProxy()) {
            InternalEObject oldTypeCS = (InternalEObject)typeCS;
            typeCS = (TypeCS)eResolveProxy(oldTypeCS);
            if (typeCS != oldTypeCS) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TempPackage.SCOPED_NAME_CS__TYPE_CS, oldTypeCS, typeCS));
            }
        }
        return typeCS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeCS basicGetTypeCS() {
        return typeCS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTypeCS(TypeCS newTypeCS) {
        TypeCS oldTypeCS = typeCS;
        typeCS = newTypeCS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.SCOPED_NAME_CS__TYPE_CS, oldTypeCS, typeCS));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TempPackage.SCOPED_NAME_CS__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TempPackage.SCOPED_NAME_CS__TYPE_CS:
                if (resolve) return getTypeCS();
                return basicGetTypeCS();
            case TempPackage.SCOPED_NAME_CS__NAME:
                return getName();
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
            case TempPackage.SCOPED_NAME_CS__TYPE_CS:
                setTypeCS((TypeCS)newValue);
                return;
            case TempPackage.SCOPED_NAME_CS__NAME:
                setName((String)newValue);
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
            case TempPackage.SCOPED_NAME_CS__TYPE_CS:
                setTypeCS((TypeCS)null);
                return;
            case TempPackage.SCOPED_NAME_CS__NAME:
                setName(NAME_EDEFAULT);
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
            case TempPackage.SCOPED_NAME_CS__TYPE_CS:
                return typeCS != null;
            case TempPackage.SCOPED_NAME_CS__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: "); //$NON-NLS-1$
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ScopedNameCSImpl
