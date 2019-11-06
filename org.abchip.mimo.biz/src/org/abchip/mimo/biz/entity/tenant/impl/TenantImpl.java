/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.entity.tenant.Tenant;
import org.abchip.mimo.biz.entity.tenant.TenantPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.BasicInternalEList;

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
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;
	/**
	 * The default value of the '{@link #getInitialPath() <em>Initial Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPath()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInitialPath() <em>Initial Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPath()
	 * @generated
	 * @ordered
	 */
	protected String initialPath = INITIAL_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenantName() <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantName()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenantName() <em>Tenant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantName()
	 * @generated
	 * @ordered
	 */
	protected String tenantName = TENANT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTenantDataSources() <em>Tenant Data Sources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantDataSources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tenantDataSources;

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
		return initialPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialPath(String newInitialPath) {
		initialPath = newInitialPath;
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
		tenantId = newTenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(boolean newDisabled) {
		disabled = newDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenantName() {
		return tenantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantName(String newTenantName) {
		tenantName = newTenantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getTenantDataSources() {
		if (tenantDataSources == null) {
			tenantDataSources = new BasicInternalEList<String>(String.class);
		}
		return tenantDataSources;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TenantPackage.TENANT__TENANT_ID:
				return getTenantId();
			case TenantPackage.TENANT__DISABLED:
				return isDisabled();
			case TenantPackage.TENANT__INITIAL_PATH:
				return getInitialPath();
			case TenantPackage.TENANT__TENANT_NAME:
				return getTenantName();
			case TenantPackage.TENANT__TENANT_DATA_SOURCES:
				return getTenantDataSources();
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
			case TenantPackage.TENANT__TENANT_ID:
				setTenantId((String)newValue);
				return;
			case TenantPackage.TENANT__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case TenantPackage.TENANT__INITIAL_PATH:
				setInitialPath((String)newValue);
				return;
			case TenantPackage.TENANT__TENANT_NAME:
				setTenantName((String)newValue);
				return;
			case TenantPackage.TENANT__TENANT_DATA_SOURCES:
				getTenantDataSources().clear();
				getTenantDataSources().addAll((Collection<? extends String>)newValue);
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
			case TenantPackage.TENANT__TENANT_ID:
				setTenantId(TENANT_ID_EDEFAULT);
				return;
			case TenantPackage.TENANT__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case TenantPackage.TENANT__INITIAL_PATH:
				setInitialPath(INITIAL_PATH_EDEFAULT);
				return;
			case TenantPackage.TENANT__TENANT_NAME:
				setTenantName(TENANT_NAME_EDEFAULT);
				return;
			case TenantPackage.TENANT__TENANT_DATA_SOURCES:
				getTenantDataSources().clear();
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
			case TenantPackage.TENANT__TENANT_ID:
				return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
			case TenantPackage.TENANT__DISABLED:
				return disabled != DISABLED_EDEFAULT;
			case TenantPackage.TENANT__INITIAL_PATH:
				return INITIAL_PATH_EDEFAULT == null ? initialPath != null : !INITIAL_PATH_EDEFAULT.equals(initialPath);
			case TenantPackage.TENANT__TENANT_NAME:
				return TENANT_NAME_EDEFAULT == null ? tenantName != null : !TENANT_NAME_EDEFAULT.equals(tenantName);
			case TenantPackage.TENANT__TENANT_DATA_SOURCES:
				return tenantDataSources != null && !tenantDataSources.isEmpty();
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
		result.append(", disabled: ");
		result.append(disabled);
		result.append(", initialPath: ");
		result.append(initialPath);
		result.append(", tenantName: ");
		result.append(tenantName);
		result.append(", tenantDataSources: ");
		result.append(tenantDataSources);
		result.append(')');
		return result.toString();
	}

} //TenantImpl
