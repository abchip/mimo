/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant Key Encrypting Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantKeyEncryptingKeyImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantKeyEncryptingKeyImpl#getKekText <em>Kek Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenantKeyEncryptingKeyImpl extends BizEntityImpl implements TenantKeyEncryptingKey {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected String tenantId = TENANT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getKekText() <em>Kek Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKekText()
	 * @generated
	 * @ordered
	 */
	protected static final String KEK_TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKekText() <em>Kek Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKekText()
	 * @generated
	 * @ordered
	 */
	protected String kekText = KEK_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TenantKeyEncryptingKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TenantPackage.Literals.TENANT_KEY_ENCRYPTING_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKekText() {
		return kekText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKekText(String newKekText) {
		String oldKekText = kekText;
		kekText = newKekText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT, oldKekText, kekText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(String newTenantId) {
		String oldTenantId = tenantId;
		tenantId = newTenantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.TENANT_KEY_ENCRYPTING_KEY__TENANT_ID, oldTenantId, tenantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__TENANT_ID:
				return getTenantId();
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT:
				return getKekText();
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
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__TENANT_ID:
				setTenantId((String)newValue);
				return;
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT:
				setKekText((String)newValue);
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
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__TENANT_ID:
				setTenantId(TENANT_ID_EDEFAULT);
				return;
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT:
				setKekText(KEK_TEXT_EDEFAULT);
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
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
			case TenantPackage.TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT:
				return KEK_TEXT_EDEFAULT == null ? kekText != null : !KEK_TEXT_EDEFAULT.equals(kekText);
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
		result.append(" (tenantId: ");
		result.append(tenantId);
		result.append(", kekText: ");
		result.append(kekText);
		result.append(')');
		return result.toString();
	}

} //TenantKeyEncryptingKeyImpl
