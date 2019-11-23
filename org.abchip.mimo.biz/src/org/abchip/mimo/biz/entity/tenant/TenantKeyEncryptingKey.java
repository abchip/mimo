/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tenant Key Encrypting Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getKekText <em>Kek Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getTenantId <em>Tenant Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenantKeyEncryptingKey()
 * @model annotation="mimo-ent-frame help='There should be one record for each tenant and each group-map for the active delegator.\n            The jdbc fields will override the datasource -&gt; inline-jdbc values for the per-tenant delegator.'"
 * @generated
 */
public interface TenantKeyEncryptingKey extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Kek Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kek Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kek Text</em>' attribute.
	 * @see #setKekText(String)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenantKeyEncryptingKey_KekText()
	 * @model annotation="mimo-ent-format type='long-varchar' length='255'"
	 * @generated
	 */
	String getKekText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getKekText <em>Kek Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kek Text</em>' attribute.
	 * @see #getKekText()
	 * @generated
	 */
	void setKekText(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' reference.
	 * @see #setTenantId(Tenant)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenantKeyEncryptingKey_TenantId()
	 * @model keys="tenantId" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 * @generated
	 */
	Tenant getTenantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.TenantKeyEncryptingKey#getTenantId <em>Tenant Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' reference.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(Tenant value);

} // TenantKeyEncryptingKey
