/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.passport.GitHubUser;
import org.abchip.mimo.biz.passport.PassportPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Hub User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.GitHubUserImpl#getGitHubUserId <em>Git Hub User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.GitHubUserImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.GitHubUserImpl#getEnvPrefix <em>Env Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.GitHubUserImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.GitHubUserImpl#getTokenType <em>Token Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitHubUserImpl extends BizEntityImpl implements GitHubUser {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getGitHubUserId() <em>Git Hub User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitHubUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_HUB_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGitHubUserId() <em>Git Hub User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitHubUserId()
	 * @generated
	 * @ordered
	 */
	protected String gitHubUserId = GIT_HUB_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected String accessToken = ACCESS_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvPrefix() <em>Env Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvPrefix() <em>Env Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvPrefix()
	 * @generated
	 * @ordered
	 */
	protected String envPrefix = ENV_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenType() <em>Token Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenType()
	 * @generated
	 * @ordered
	 */
	protected String tokenType = TOKEN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitHubUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PassportPackage.Literals.GIT_HUB_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGitHubUserId() {
		return gitHubUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGitHubUserId(String newGitHubUserId) {
		String oldGitHubUserId = gitHubUserId;
		gitHubUserId = newGitHubUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.GIT_HUB_USER__GIT_HUB_USER_ID, oldGitHubUserId, gitHubUserId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessToken(String newAccessToken) {
		String oldAccessToken = accessToken;
		accessToken = newAccessToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.GIT_HUB_USER__ACCESS_TOKEN, oldAccessToken, accessToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnvPrefix() {
		return envPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvPrefix(String newEnvPrefix) {
		String oldEnvPrefix = envPrefix;
		envPrefix = newEnvPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.GIT_HUB_USER__ENV_PREFIX, oldEnvPrefix, envPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.GIT_HUB_USER__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTokenType() {
		return tokenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenType(String newTokenType) {
		String oldTokenType = tokenType;
		tokenType = newTokenType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.GIT_HUB_USER__TOKEN_TYPE, oldTokenType, tokenType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PassportPackage.GIT_HUB_USER__GIT_HUB_USER_ID:
				return getGitHubUserId();
			case PassportPackage.GIT_HUB_USER__ACCESS_TOKEN:
				return getAccessToken();
			case PassportPackage.GIT_HUB_USER__ENV_PREFIX:
				return getEnvPrefix();
			case PassportPackage.GIT_HUB_USER__PRODUCT_STORE_ID:
				return getProductStoreId();
			case PassportPackage.GIT_HUB_USER__TOKEN_TYPE:
				return getTokenType();
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
			case PassportPackage.GIT_HUB_USER__GIT_HUB_USER_ID:
				setGitHubUserId((String)newValue);
				return;
			case PassportPackage.GIT_HUB_USER__ACCESS_TOKEN:
				setAccessToken((String)newValue);
				return;
			case PassportPackage.GIT_HUB_USER__ENV_PREFIX:
				setEnvPrefix((String)newValue);
				return;
			case PassportPackage.GIT_HUB_USER__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case PassportPackage.GIT_HUB_USER__TOKEN_TYPE:
				setTokenType((String)newValue);
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
			case PassportPackage.GIT_HUB_USER__GIT_HUB_USER_ID:
				setGitHubUserId(GIT_HUB_USER_ID_EDEFAULT);
				return;
			case PassportPackage.GIT_HUB_USER__ACCESS_TOKEN:
				setAccessToken(ACCESS_TOKEN_EDEFAULT);
				return;
			case PassportPackage.GIT_HUB_USER__ENV_PREFIX:
				setEnvPrefix(ENV_PREFIX_EDEFAULT);
				return;
			case PassportPackage.GIT_HUB_USER__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case PassportPackage.GIT_HUB_USER__TOKEN_TYPE:
				setTokenType(TOKEN_TYPE_EDEFAULT);
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
			case PassportPackage.GIT_HUB_USER__GIT_HUB_USER_ID:
				return GIT_HUB_USER_ID_EDEFAULT == null ? gitHubUserId != null : !GIT_HUB_USER_ID_EDEFAULT.equals(gitHubUserId);
			case PassportPackage.GIT_HUB_USER__ACCESS_TOKEN:
				return ACCESS_TOKEN_EDEFAULT == null ? accessToken != null : !ACCESS_TOKEN_EDEFAULT.equals(accessToken);
			case PassportPackage.GIT_HUB_USER__ENV_PREFIX:
				return ENV_PREFIX_EDEFAULT == null ? envPrefix != null : !ENV_PREFIX_EDEFAULT.equals(envPrefix);
			case PassportPackage.GIT_HUB_USER__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case PassportPackage.GIT_HUB_USER__TOKEN_TYPE:
				return TOKEN_TYPE_EDEFAULT == null ? tokenType != null : !TOKEN_TYPE_EDEFAULT.equals(tokenType);
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
		result.append(" (gitHubUserId: ");
		result.append(gitHubUserId);
		result.append(", accessToken: ");
		result.append(accessToken);
		result.append(", envPrefix: ");
		result.append(envPrefix);
		result.append(", productStoreId: ");
		result.append(productStoreId);
		result.append(", tokenType: ");
		result.append(tokenType);
		result.append(')');
		return result.toString();
	}

} //GitHubUserImpl
