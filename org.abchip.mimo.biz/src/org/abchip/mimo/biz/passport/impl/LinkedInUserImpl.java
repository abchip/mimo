/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.passport.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.passport.LinkedInUser;
import org.abchip.mimo.biz.passport.PassportPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked In User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.LinkedInUserImpl#getLinkedInUserId <em>Linked In User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.LinkedInUserImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.LinkedInUserImpl#getEnvPrefix <em>Env Prefix</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.passport.impl.LinkedInUserImpl#getProductStoreId <em>Product Store Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkedInUserImpl extends BizEntityImpl implements LinkedInUser {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getLinkedInUserId() <em>Linked In User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedInUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKED_IN_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkedInUserId() <em>Linked In User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedInUserId()
	 * @generated
	 * @ordered
	 */
	protected String linkedInUserId = LINKED_IN_USER_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkedInUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PassportPackage.Literals.LINKED_IN_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkedInUserId() {
		return linkedInUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkedInUserId(String newLinkedInUserId) {
		String oldLinkedInUserId = linkedInUserId;
		linkedInUserId = newLinkedInUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.LINKED_IN_USER__LINKED_IN_USER_ID, oldLinkedInUserId, linkedInUserId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.LINKED_IN_USER__ACCESS_TOKEN, oldAccessToken, accessToken));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.LINKED_IN_USER__ENV_PREFIX, oldEnvPrefix, envPrefix));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PassportPackage.LINKED_IN_USER__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PassportPackage.LINKED_IN_USER__LINKED_IN_USER_ID:
				return getLinkedInUserId();
			case PassportPackage.LINKED_IN_USER__ACCESS_TOKEN:
				return getAccessToken();
			case PassportPackage.LINKED_IN_USER__ENV_PREFIX:
				return getEnvPrefix();
			case PassportPackage.LINKED_IN_USER__PRODUCT_STORE_ID:
				return getProductStoreId();
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
			case PassportPackage.LINKED_IN_USER__LINKED_IN_USER_ID:
				setLinkedInUserId((String)newValue);
				return;
			case PassportPackage.LINKED_IN_USER__ACCESS_TOKEN:
				setAccessToken((String)newValue);
				return;
			case PassportPackage.LINKED_IN_USER__ENV_PREFIX:
				setEnvPrefix((String)newValue);
				return;
			case PassportPackage.LINKED_IN_USER__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
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
			case PassportPackage.LINKED_IN_USER__LINKED_IN_USER_ID:
				setLinkedInUserId(LINKED_IN_USER_ID_EDEFAULT);
				return;
			case PassportPackage.LINKED_IN_USER__ACCESS_TOKEN:
				setAccessToken(ACCESS_TOKEN_EDEFAULT);
				return;
			case PassportPackage.LINKED_IN_USER__ENV_PREFIX:
				setEnvPrefix(ENV_PREFIX_EDEFAULT);
				return;
			case PassportPackage.LINKED_IN_USER__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
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
			case PassportPackage.LINKED_IN_USER__LINKED_IN_USER_ID:
				return LINKED_IN_USER_ID_EDEFAULT == null ? linkedInUserId != null : !LINKED_IN_USER_ID_EDEFAULT.equals(linkedInUserId);
			case PassportPackage.LINKED_IN_USER__ACCESS_TOKEN:
				return ACCESS_TOKEN_EDEFAULT == null ? accessToken != null : !ACCESS_TOKEN_EDEFAULT.equals(accessToken);
			case PassportPackage.LINKED_IN_USER__ENV_PREFIX:
				return ENV_PREFIX_EDEFAULT == null ? envPrefix != null : !ENV_PREFIX_EDEFAULT.equals(envPrefix);
			case PassportPackage.LINKED_IN_USER__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
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
		result.append(" (linkedInUserId: ");
		result.append(linkedInUserId);
		result.append(", accessToken: ");
		result.append(accessToken);
		result.append(", envPrefix: ");
		result.append(envPrefix);
		result.append(", productStoreId: ");
		result.append(productStoreId);
		result.append(')');
		return result.toString();
	}

} //LinkedInUserImpl
