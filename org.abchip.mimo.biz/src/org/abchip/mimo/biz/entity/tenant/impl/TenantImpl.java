/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.entity.tenant.Tenant;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantImpl#getInitialPath <em>Initial Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantImpl#getTenantName <em>Tenant Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantImpl#getTenantDataSources <em>Tenant Data Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TenantImpl extends BizEntityImpl implements Tenant {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TenantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TenantPackage.Literals.TENANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialPath() {
		return (String)eGet(TenantPackage.Literals.TENANT__INITIAL_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialPath(String newInitialPath) {
		eSet(TenantPackage.Literals.TENANT__INITIAL_PATH, newInitialPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantId() {
		return (String)eGet(TenantPackage.Literals.TENANT__TENANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(String newTenantId) {
		eSet(TenantPackage.Literals.TENANT__TENANT_ID, newTenantId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisabled() {
		return (Boolean)eGet(TenantPackage.Literals.TENANT__DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(boolean newDisabled) {
		eSet(TenantPackage.Literals.TENANT__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantName() {
		return (String)eGet(TenantPackage.Literals.TENANT__TENANT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantName(String newTenantName) {
		eSet(TenantPackage.Literals.TENANT__TENANT_NAME, newTenantName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getTenantDataSources() {
		return (List<String>)eGet(TenantPackage.Literals.TENANT__TENANT_DATA_SOURCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> tenantComponents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> tenantDomainNames() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TenantPackage.TENANT___TENANT_COMPONENTS:
				return tenantComponents();
			case TenantPackage.TENANT___TENANT_DOMAIN_NAMES:
				return tenantDomainNames();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TenantImpl
