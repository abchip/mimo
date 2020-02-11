/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import org.abchip.mimo.biz.entity.tenant.Tenant;
import org.abchip.mimo.biz.entity.tenant.TenantDataSource;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getEntityGroupName <em>Entity Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getJdbcUri <em>Jdbc Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getJdbcUsername <em>Jdbc Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenantDataSourceImpl extends BizEntityImpl implements TenantDataSource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TenantDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TenantPackage.Literals.TENANT_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntityGroupName() {
		return (String)eGet(TenantPackage.Literals.TENANT_DATA_SOURCE__ENTITY_GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupName(String newEntityGroupName) {
		eSet(TenantPackage.Literals.TENANT_DATA_SOURCE__ENTITY_GROUP_NAME, newEntityGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcPassword() {
		return (String)eGet(TenantPackage.Literals.TENANT_DATA_SOURCE__JDBC_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcPassword(String newJdbcPassword) {
		eSet(TenantPackage.Literals.TENANT_DATA_SOURCE__JDBC_PASSWORD, newJdbcPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcUri() {
		return (String)eGet(TenantPackage.Literals.TENANT_DATA_SOURCE__JDBC_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcUri(String newJdbcUri) {
		eSet(TenantPackage.Literals.TENANT_DATA_SOURCE__JDBC_URI, newJdbcUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcUsername() {
		return (String)eGet(TenantPackage.Literals.TENANT_DATA_SOURCE__JDBC_USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcUsername(String newJdbcUsername) {
		eSet(TenantPackage.Literals.TENANT_DATA_SOURCE__JDBC_USERNAME, newJdbcUsername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tenant getTenantId() {
		return (Tenant)eGet(TenantPackage.Literals.TENANT_DATA_SOURCE__TENANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(Tenant newTenantId) {
		eSet(TenantPackage.Literals.TENANT_DATA_SOURCE__TENANT_ID, newTenantId);
	}

} //TenantDataSourceImpl
