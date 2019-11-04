/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.impl;

import org.abchip.mimo.biz.BizLoginType;
import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.BizProviderConfig;
import org.abchip.mimo.biz.BizProviderUser;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OF Biz Provider Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getLoginType <em>Login Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getPublicUser <em>Public User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.impl.BizProviderConfigImpl#getSystemUser <em>System User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BizProviderConfigImpl extends EntityImpl implements BizProviderConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getLoginType() <em>Login Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginType()
	 * @generated
	 * @ordered
	 */
	protected static final BizLoginType LOGIN_TYPE_EDEFAULT = BizLoginType.EXTERNAL_KEY;

	/**
	 * The cached value of the '{@link #getLoginType() <em>Login Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginType()
	 * @generated
	 * @ordered
	 */
	protected BizLoginType loginType = LOGIN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublicUser() <em>Public User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicUser()
	 * @generated
	 * @ordered
	 */
	protected BizProviderUser publicUser;

	/**
	 * The cached value of the '{@link #getSystemUser() <em>System User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUser()
	 * @generated
	 * @ordered
	 */
	protected BizProviderUser systemUser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BizProviderConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BizPackage.Literals.BIZ_PROVIDER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_PROVIDER_CONFIG__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizProviderUser getPublicUser() {
		return publicUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicUser(BizProviderUser newPublicUser, NotificationChain msgs) {
		BizProviderUser oldPublicUser = publicUser;
		publicUser = newPublicUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER, oldPublicUser, newPublicUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicUser(BizProviderUser newPublicUser) {
		if (newPublicUser != publicUser) {
			NotificationChain msgs = null;
			if (publicUser != null)
				msgs = ((InternalEObject)publicUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER, null, msgs);
			if (newPublicUser != null)
				msgs = ((InternalEObject)newPublicUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER, null, msgs);
			msgs = basicSetPublicUser(newPublicUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER, newPublicUser, newPublicUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizProviderUser getSystemUser() {
		return systemUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemUser(BizProviderUser newSystemUser, NotificationChain msgs) {
		BizProviderUser oldSystemUser = systemUser;
		systemUser = newSystemUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER, oldSystemUser, newSystemUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemUser(BizProviderUser newSystemUser) {
		if (newSystemUser != systemUser) {
			NotificationChain msgs = null;
			if (systemUser != null)
				msgs = ((InternalEObject)systemUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER, null, msgs);
			if (newSystemUser != null)
				msgs = ((InternalEObject)newSystemUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER, null, msgs);
			msgs = basicSetSystemUser(newSystemUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER, newSystemUser, newSystemUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER:
				return basicSetPublicUser(null, msgs);
			case BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER:
				return basicSetSystemUser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BizLoginType getLoginType() {
		return loginType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginType(BizLoginType newLoginType) {
		BizLoginType oldLoginType = loginType;
		loginType = newLoginType == null ? LOGIN_TYPE_EDEFAULT : newLoginType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BizPackage.BIZ_PROVIDER_CONFIG__LOGIN_TYPE, oldLoginType, loginType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BizPackage.BIZ_PROVIDER_CONFIG__LOGIN_TYPE:
				return getLoginType();
			case BizPackage.BIZ_PROVIDER_CONFIG__URL:
				return getUrl();
			case BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER:
				return getPublicUser();
			case BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER:
				return getSystemUser();
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
			case BizPackage.BIZ_PROVIDER_CONFIG__LOGIN_TYPE:
				setLoginType((BizLoginType)newValue);
				return;
			case BizPackage.BIZ_PROVIDER_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER:
				setPublicUser((BizProviderUser)newValue);
				return;
			case BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER:
				setSystemUser((BizProviderUser)newValue);
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
			case BizPackage.BIZ_PROVIDER_CONFIG__LOGIN_TYPE:
				setLoginType(LOGIN_TYPE_EDEFAULT);
				return;
			case BizPackage.BIZ_PROVIDER_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER:
				setPublicUser((BizProviderUser)null);
				return;
			case BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER:
				setSystemUser((BizProviderUser)null);
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
			case BizPackage.BIZ_PROVIDER_CONFIG__LOGIN_TYPE:
				return loginType != LOGIN_TYPE_EDEFAULT;
			case BizPackage.BIZ_PROVIDER_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case BizPackage.BIZ_PROVIDER_CONFIG__PUBLIC_USER:
				return publicUser != null;
			case BizPackage.BIZ_PROVIDER_CONFIG__SYSTEM_USER:
				return systemUser != null;
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
		result.append(" (loginType: ");
		result.append(loginType);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //BizProviderConfigImpl