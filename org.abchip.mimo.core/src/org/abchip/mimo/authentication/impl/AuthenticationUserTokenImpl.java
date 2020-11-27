/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.authentication.impl;

import org.abchip.mimo.authentication.AuthenticationPackage;
import org.abchip.mimo.authentication.AuthenticationUserToken;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication User Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl#getTenant <em>Tenant</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl#getIdToken <em>Id Token</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl#getPicture <em>Picture</em>}</li>
 *   <li>{@link org.abchip.mimo.authentication.impl.AuthenticationUserTokenImpl#getUser <em>User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationUserTokenImpl extends EntityImpl implements AuthenticationUserToken {
	/**
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;
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
	 * The default value of the '{@link #getIdToken() <em>Id Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TOKEN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIdToken() <em>Id Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdToken()
	 * @generated
	 * @ordered
	 */
	protected String idToken = ID_TOKEN_EDEFAULT;
	/**
	 * The default value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPicture() <em>Picture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicture()
	 * @generated
	 * @ordered
	 */
	protected String picture = PICTURE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationUserTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationPackage.Literals.AUTHENTICATION_USER_TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTenant(String newTenant) {
		String oldTenant = tenant;
		tenant = newTenant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.AUTHENTICATION_USER_TOKEN__TENANT, oldTenant, tenant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PROVIDER, oldProvider, provider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN, oldAccessToken, accessToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdToken() {
		return idToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdToken(String newIdToken) {
		String oldIdToken = idToken;
		idToken = newIdToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ID_TOKEN, oldIdToken, idToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicture() {
		return picture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicture(String newPicture) {
		String oldPicture = picture;
		picture = newPicture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PICTURE, oldPicture, picture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationPackage.AUTHENTICATION_USER_TOKEN__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__TENANT:
				return getTenant();
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PROVIDER:
				return getProvider();
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN:
				return getAccessToken();
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ID_TOKEN:
				return getIdToken();
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PICTURE:
				return getPicture();
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__USER:
				return getUser();
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
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__TENANT:
				setTenant((String)newValue);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PROVIDER:
				setProvider((String)newValue);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN:
				setAccessToken((String)newValue);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ID_TOKEN:
				setIdToken((String)newValue);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PICTURE:
				setPicture((String)newValue);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__USER:
				setUser((String)newValue);
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
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__TENANT:
				setTenant(TENANT_EDEFAULT);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN:
				setAccessToken(ACCESS_TOKEN_EDEFAULT);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ID_TOKEN:
				setIdToken(ID_TOKEN_EDEFAULT);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PICTURE:
				setPicture(PICTURE_EDEFAULT);
				return;
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__USER:
				setUser(USER_EDEFAULT);
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
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ACCESS_TOKEN:
				return ACCESS_TOKEN_EDEFAULT == null ? accessToken != null : !ACCESS_TOKEN_EDEFAULT.equals(accessToken);
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__ID_TOKEN:
				return ID_TOKEN_EDEFAULT == null ? idToken != null : !ID_TOKEN_EDEFAULT.equals(idToken);
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__PICTURE:
				return PICTURE_EDEFAULT == null ? picture != null : !PICTURE_EDEFAULT.equals(picture);
			case AuthenticationPackage.AUTHENTICATION_USER_TOKEN__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
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
		result.append(" (tenant: ");
		result.append(tenant);
		result.append(", provider: ");
		result.append(provider);
		result.append(", accessToken: ");
		result.append(accessToken);
		result.append(", idToken: ");
		result.append(idToken);
		result.append(", picture: ");
		result.append(picture);
		result.append(", user: ");
		result.append(user);
		result.append(')');
		return result.toString();
	}

} //AuthenticationUserTokenImpl
