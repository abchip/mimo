/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tenant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Tenant#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Tenant#getInitialPath <em>Initial Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantName <em>Tenant Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantDataSources <em>Tenant Data Sources</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenant()
 * @model
 * @generated
 */
public interface Tenant extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Initial Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Path</em>' attribute.
	 * @see #setInitialPath(String)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenant_InitialPath()
	 * @model
	 * @generated
	 */
	String getInitialPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.Tenant#getInitialPath <em>Initial Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Path</em>' attribute.
	 * @see #getInitialPath()
	 * @generated
	 */
	void setInitialPath(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' attribute.
	 * @see #setTenantId(String)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenant_TenantId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTenantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantId <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' attribute.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(String value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenant_Disabled()
	 * @model
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.Tenant#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Tenant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Name</em>' attribute.
	 * @see #setTenantName(String)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenant_TenantName()
	 * @model
	 * @generated
	 */
	String getTenantName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.Tenant#getTenantName <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Name</em>' attribute.
	 * @see #getTenantName()
	 * @generated
	 */
	void setTenantName(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Data Sources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Data Sources</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Data Sources</em>' attribute list.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenant_TenantDataSources()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TenantDataSource'"
	 * @generated
	 */
	List<String> getTenantDataSources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TenantComponent' route='tenantId'"
	 * @generated
	 */
	List<String> tenantComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TenantDomainName' route='tenantId'"
	 * @generated
	 */
	List<String> tenantDomainNames();

} // Tenant