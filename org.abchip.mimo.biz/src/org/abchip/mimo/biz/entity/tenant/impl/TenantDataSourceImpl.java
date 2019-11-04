/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tenant Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getEntityGroupName <em>Entity Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getJdbcUri <em>Jdbc Uri</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getJdbcUsername <em>Jdbc Username</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.impl.TenantDataSourceImpl#getTenantId <em>Tenant Id</em>}</li>
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
	 * The default value of the '{@link #getEntityGroupName() <em>Entity Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_GROUP_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEntityGroupName() <em>Entity Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityGroupName()
	 * @generated
	 * @ordered
	 */
	protected String entityGroupName = ENTITY_GROUP_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getJdbcPassword() <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJdbcPassword() <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPassword()
	 * @generated
	 * @ordered
	 */
	protected String jdbcPassword = JDBC_PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getJdbcUri() <em>Jdbc Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUri()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJdbcUri() <em>Jdbc Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUri()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUri = JDBC_URI_EDEFAULT;
	/**
	 * The default value of the '{@link #getJdbcUsername() <em>Jdbc Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_USERNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getJdbcUsername() <em>Jdbc Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUsername()
	 * @generated
	 * @ordered
	 */
	protected String jdbcUsername = JDBC_USERNAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getTenantId() <em>Tenant Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected Tenant tenantId;

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
		return entityGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityGroupName(String newEntityGroupName) {
		String oldEntityGroupName = entityGroupName;
		entityGroupName = newEntityGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.TENANT_DATA_SOURCE__ENTITY_GROUP_NAME, oldEntityGroupName, entityGroupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcPassword() {
		return jdbcPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcPassword(String newJdbcPassword) {
		String oldJdbcPassword = jdbcPassword;
		jdbcPassword = newJdbcPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.TENANT_DATA_SOURCE__JDBC_PASSWORD, oldJdbcPassword, jdbcPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcUri() {
		return jdbcUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcUri(String newJdbcUri) {
		String oldJdbcUri = jdbcUri;
		jdbcUri = newJdbcUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.TENANT_DATA_SOURCE__JDBC_URI, oldJdbcUri, jdbcUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJdbcUsername() {
		return jdbcUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJdbcUsername(String newJdbcUsername) {
		String oldJdbcUsername = jdbcUsername;
		jdbcUsername = newJdbcUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.TENANT_DATA_SOURCE__JDBC_USERNAME, oldJdbcUsername, jdbcUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tenant getTenantId() {
		if (tenantId != null && ((EObject)tenantId).eIsProxy()) {
			InternalEObject oldTenantId = (InternalEObject)tenantId;
			tenantId = (Tenant)eResolveProxy(oldTenantId);
			if (tenantId != oldTenantId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TenantPackage.TENANT_DATA_SOURCE__TENANT_ID, oldTenantId, tenantId));
			}
		}
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tenant basicGetTenantId() {
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenantId(Tenant newTenantId) {
		Tenant oldTenantId = tenantId;
		tenantId = newTenantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TenantPackage.TENANT_DATA_SOURCE__TENANT_ID, oldTenantId, tenantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TenantPackage.TENANT_DATA_SOURCE__ENTITY_GROUP_NAME:
				return getEntityGroupName();
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_PASSWORD:
				return getJdbcPassword();
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_URI:
				return getJdbcUri();
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_USERNAME:
				return getJdbcUsername();
			case TenantPackage.TENANT_DATA_SOURCE__TENANT_ID:
				if (resolve) return getTenantId();
				return basicGetTenantId();
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
			case TenantPackage.TENANT_DATA_SOURCE__ENTITY_GROUP_NAME:
				setEntityGroupName((String)newValue);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_PASSWORD:
				setJdbcPassword((String)newValue);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_URI:
				setJdbcUri((String)newValue);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_USERNAME:
				setJdbcUsername((String)newValue);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__TENANT_ID:
				setTenantId((Tenant)newValue);
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
			case TenantPackage.TENANT_DATA_SOURCE__ENTITY_GROUP_NAME:
				setEntityGroupName(ENTITY_GROUP_NAME_EDEFAULT);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_PASSWORD:
				setJdbcPassword(JDBC_PASSWORD_EDEFAULT);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_URI:
				setJdbcUri(JDBC_URI_EDEFAULT);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_USERNAME:
				setJdbcUsername(JDBC_USERNAME_EDEFAULT);
				return;
			case TenantPackage.TENANT_DATA_SOURCE__TENANT_ID:
				setTenantId((Tenant)null);
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
			case TenantPackage.TENANT_DATA_SOURCE__ENTITY_GROUP_NAME:
				return ENTITY_GROUP_NAME_EDEFAULT == null ? entityGroupName != null : !ENTITY_GROUP_NAME_EDEFAULT.equals(entityGroupName);
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_PASSWORD:
				return JDBC_PASSWORD_EDEFAULT == null ? jdbcPassword != null : !JDBC_PASSWORD_EDEFAULT.equals(jdbcPassword);
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_URI:
				return JDBC_URI_EDEFAULT == null ? jdbcUri != null : !JDBC_URI_EDEFAULT.equals(jdbcUri);
			case TenantPackage.TENANT_DATA_SOURCE__JDBC_USERNAME:
				return JDBC_USERNAME_EDEFAULT == null ? jdbcUsername != null : !JDBC_USERNAME_EDEFAULT.equals(jdbcUsername);
			case TenantPackage.TENANT_DATA_SOURCE__TENANT_ID:
				return tenantId != null;
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
		result.append(" (entityGroupName: ");
		result.append(entityGroupName);
		result.append(", jdbcPassword: ");
		result.append(jdbcPassword);
		result.append(", jdbcUri: ");
		result.append(jdbcUri);
		result.append(", jdbcUsername: ");
		result.append(jdbcUsername);
		result.append(')');
		return result.toString();
	}

} //TenantDataSourceImpl
