/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.context.impl.ProviderConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ProviderConfigImpl#getPublicUser <em>Public User</em>}</li>
 *   <li>{@link org.abchip.mimo.context.impl.ProviderConfigImpl#getSystemUser <em>System User</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderConfigImpl extends EntityImpl implements ProviderConfig {
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
	protected ProviderUser publicUser;
	/**
	 * The cached value of the '{@link #getSystemUser() <em>System User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUser()
	 * @generated
	 * @ordered
	 */
	protected ProviderUser systemUser;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__URL, oldUrl, url));
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
	public ProviderUser getSystemUser() {
		if (systemUser != null && ((EObject)systemUser).eIsProxy()) {
			InternalEObject oldSystemUser = (InternalEObject)systemUser;
			systemUser = (ProviderUser)eResolveProxy(oldSystemUser);
			if (systemUser != oldSystemUser) {
				InternalEObject newSystemUser = (InternalEObject)systemUser;
				NotificationChain msgs = oldSystemUser.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__SYSTEM_USER, null, null);
				if (newSystemUser.eInternalContainer() == null) {
					msgs = newSystemUser.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__SYSTEM_USER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContextPackage.PROVIDER_CONFIG__SYSTEM_USER, oldSystemUser, systemUser));
			}
		}
		return systemUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderUser basicGetSystemUser() {
		return systemUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemUser(ProviderUser newSystemUser, NotificationChain msgs) {
		ProviderUser oldSystemUser = systemUser;
		systemUser = newSystemUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__SYSTEM_USER, oldSystemUser, newSystemUser);
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
	public void setSystemUser(ProviderUser newSystemUser) {
		if (newSystemUser != systemUser) {
			NotificationChain msgs = null;
			if (systemUser != null)
				msgs = ((InternalEObject)systemUser).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__SYSTEM_USER, null, msgs);
			if (newSystemUser != null)
				msgs = ((InternalEObject)newSystemUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContextPackage.PROVIDER_CONFIG__SYSTEM_USER, null, msgs);
			msgs = basicSetSystemUser(newSystemUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.PROVIDER_CONFIG__SYSTEM_USER, newSystemUser, newSystemUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				return basicSetPublicUser(null, msgs);
			case ContextPackage.PROVIDER_CONFIG__SYSTEM_USER:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.PROVIDER_CONFIG__URL:
				return getUrl();
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				if (resolve) return getPublicUser();
				return basicGetPublicUser();
			case ContextPackage.PROVIDER_CONFIG__SYSTEM_USER:
				if (resolve) return getSystemUser();
				return basicGetSystemUser();
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
			case ContextPackage.PROVIDER_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				setPublicUser((ProviderUser)newValue);
				return;
			case ContextPackage.PROVIDER_CONFIG__SYSTEM_USER:
				setSystemUser((ProviderUser)newValue);
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
			case ContextPackage.PROVIDER_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				setPublicUser((ProviderUser)null);
				return;
			case ContextPackage.PROVIDER_CONFIG__SYSTEM_USER:
				setSystemUser((ProviderUser)null);
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
			case ContextPackage.PROVIDER_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case ContextPackage.PROVIDER_CONFIG__PUBLIC_USER:
				return publicUser != null;
			case ContextPackage.PROVIDER_CONFIG__SYSTEM_USER:
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
		result.append(" (url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ProviderConfigImpl
