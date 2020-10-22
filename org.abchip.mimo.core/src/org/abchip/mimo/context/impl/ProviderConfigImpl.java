/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.context.ProviderConfig;
import org.abchip.mimo.context.ProviderUser;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.networking.HostConfig;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link org.abchip.mimo.context.impl.ProviderConfigImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ProviderConfigImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ProviderConfigImpl#getPublicUser <em>Public User</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ProviderConfigImpl#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderConfigImpl extends EntityImpl implements ProviderConfig {
	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected HostConfig host;
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPublicUser() <em>Public User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicUser()
	 * @generated
	 * @ordered
	 */
	protected ProviderUser publicUser;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.PROVIDER_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostConfig getHost() {
		if (host != null && ((EObject)host).eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (HostConfig)eResolveProxy(oldHost);
			if (host != oldHost) {
				InternalEObject newHost = (InternalEObject)host;
				NotificationChain msgs = oldHost.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__HOST, null, null);
				if (newHost.eInternalContainer() == null) {
					msgs = newHost.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__HOST, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.PROVIDER_CONFIG__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostConfig basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHost(HostConfig newHost, NotificationChain msgs) {
		HostConfig oldHost = host;
		host = newHost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__HOST, oldHost, newHost);
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
	public void setHost(HostConfig newHost) {
		if (newHost != host) {
			NotificationChain msgs = null;
			if (host != null)
				msgs = ((InternalEObject)host).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__HOST, null, msgs);
			if (newHost != null)
				msgs = ((InternalEObject)newHost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__HOST, null, msgs);
			msgs = basicSetHost(newHost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__HOST, newHost, newHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProviderUser getPublicUser() {
		if (publicUser != null && ((EObject)publicUser).eIsProxy()) {
			InternalEObject oldPublicUser = (InternalEObject)publicUser;
			publicUser = (ProviderUser)eResolveProxy(oldPublicUser);
			if (publicUser != oldPublicUser) {
				InternalEObject newPublicUser = (InternalEObject)publicUser;
				NotificationChain msgs = oldPublicUser.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__PUBLIC_USER, null, null);
				if (newPublicUser.eInternalContainer() == null) {
					msgs = newPublicUser.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__PUBLIC_USER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.PROVIDER_CONFIG__PUBLIC_USER, oldPublicUser, publicUser));
			}
		}
		return publicUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderUser basicGetPublicUser() {
		return publicUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicUser(ProviderUser newPublicUser, NotificationChain msgs) {
		ProviderUser oldPublicUser = publicUser;
		publicUser = newPublicUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__PUBLIC_USER, oldPublicUser, newPublicUser);
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
	public void setPublicUser(ProviderUser newPublicUser) {
		if (newPublicUser != publicUser) {
			NotificationChain msgs = null;
			if (publicUser != null)
				msgs = ((InternalEObject)publicUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__PUBLIC_USER, null, msgs);
			if (newPublicUser != null)
				msgs = ((InternalEObject)newPublicUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__PUBLIC_USER, null, msgs);
			msgs = basicSetPublicUser(newPublicUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__PUBLIC_USER, newPublicUser, newPublicUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.PROVIDER_CONFIG__HOST:
				return basicSetHost(null, msgs);
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				return basicSetPublicUser(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.PROVIDER_CONFIG__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case ContextPackage.PROVIDER_CONFIG__PATH:
				return getPath();
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				if (resolve) return getPublicUser();
				return basicGetPublicUser();
			case ContextPackage.PROVIDER_CONFIG__TOKEN:
				return getToken();
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
			case ContextPackage.PROVIDER_CONFIG__HOST:
				setHost((HostConfig)newValue);
				return;
			case ContextPackage.PROVIDER_CONFIG__PATH:
				setPath((String)newValue);
				return;
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				setPublicUser((ProviderUser)newValue);
				return;
			case ContextPackage.PROVIDER_CONFIG__TOKEN:
				setToken((String)newValue);
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
			case ContextPackage.PROVIDER_CONFIG__HOST:
				setHost((HostConfig)null);
				return;
			case ContextPackage.PROVIDER_CONFIG__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				setPublicUser((ProviderUser)null);
				return;
			case ContextPackage.PROVIDER_CONFIG__TOKEN:
				setToken(TOKEN_EDEFAULT);
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
			case ContextPackage.PROVIDER_CONFIG__HOST:
				return host != null;
			case ContextPackage.PROVIDER_CONFIG__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				return publicUser != null;
			case ContextPackage.PROVIDER_CONFIG__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
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
		result.append(" (path: ");
		result.append(path);
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //ProviderConfigImpl
