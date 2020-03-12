/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.AuthenticationAdminKey;
import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.impl.EntityImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Admin Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.impl.AuthenticationAdminKeyImpl#getAdminKey <em>Admin Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationAdminKeyImpl extends EntityImpl implements AuthenticationAdminKey {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAdminKey() <em>Admin Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIN_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminKey() <em>Admin Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminKey()
	 * @generated
	 * @ordered
	 */
	protected String adminKey = ADMIN_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationAdminKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.AUTHENTICATION_ADMIN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdminKey() {
		return adminKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdminKey(String newAdminKey) {
		String oldAdminKey = adminKey;
		adminKey = newAdminKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.AUTHENTICATION_ADMIN_KEY__ADMIN_KEY, oldAdminKey, adminKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.AUTHENTICATION_ADMIN_KEY__ADMIN_KEY:
				return getAdminKey();
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
			case ContextPackage.AUTHENTICATION_ADMIN_KEY__ADMIN_KEY:
				setAdminKey((String)newValue);
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
			case ContextPackage.AUTHENTICATION_ADMIN_KEY__ADMIN_KEY:
				setAdminKey(ADMIN_KEY_EDEFAULT);
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
			case ContextPackage.AUTHENTICATION_ADMIN_KEY__ADMIN_KEY:
				return ADMIN_KEY_EDEFAULT == null ? adminKey != null : !ADMIN_KEY_EDEFAULT.equals(adminKey);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (adminKey: ");
		result.append(adminKey);
		result.append(')');
		return result.toString();
	}

} //AuthenticationAdminKeyImpl