/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(TenantPackage.Literals.TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKekText(String newKekText) {
		eSet(TenantPackage.Literals.TENANT_KEY_ENCRYPTING_KEY__KEK_TEXT, newKekText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantId() {
		return (String)eGet(TenantPackage.Literals.TENANT_KEY_ENCRYPTING_KEY__TENANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(String newTenantId) {
		eSet(TenantPackage.Literals.TENANT_KEY_ENCRYPTING_KEY__TENANT_ID, newTenantId);
	}

} //TenantKeyEncryptingKeyImpl
