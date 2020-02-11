/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import org.abchip.mimo.biz.entity.tenant.Tenant;
import org.abchip.mimo.biz.entity.tenant.TenantDomainName;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant Domain Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDomainNameImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDomainNameImpl#getTenantId <em>Tenant Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenantDomainNameImpl extends BizEntityImpl implements TenantDomainName {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TenantDomainNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TenantPackage.Literals.TENANT_DOMAIN_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName() {
		return (String)eGet(TenantPackage.Literals.TENANT_DOMAIN_NAME__DOMAIN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName(String newDomainName) {
		eSet(TenantPackage.Literals.TENANT_DOMAIN_NAME__DOMAIN_NAME, newDomainName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tenant getTenantId() {
		return (Tenant)eGet(TenantPackage.Literals.TENANT_DOMAIN_NAME__TENANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(Tenant newTenantId) {
		eSet(TenantPackage.Literals.TENANT_DOMAIN_NAME__TENANT_ID, newTenantId);
	}

} //TenantDomainNameImpl
