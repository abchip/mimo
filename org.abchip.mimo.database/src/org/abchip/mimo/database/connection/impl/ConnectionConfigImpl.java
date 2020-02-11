/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.connection.impl;

import org.abchip.mimo.database.connection.ConnectionConfig;
import org.abchip.mimo.database.connection.ConnectionCredentials;
import org.abchip.mimo.database.connection.DatabaseConnectionPackage;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Connection Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.abchip.mimo.database.connection.impl.ConnectionConfigImpl#isPersistent <em>Persistent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionConfigImpl extends EntityImpl implements ConnectionConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected ConnectionCredentials credentials;

	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final String CATALOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected String catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERSISTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPersistent()
	 * @generated
	 * @ordered
	 */
	protected boolean persistent = PERSISTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabaseConnectionPackage.Literals.CONNECTION_CONFIG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionCredentials getCredentials() {
		if (credentials != null && ((EObject)credentials).eIsProxy()) {
			InternalEObject oldCredentials = (InternalEObject)credentials;
			credentials = (ConnectionCredentials)eResolveProxy(oldCredentials);
			if (credentials != oldCredentials) {
				InternalEObject newCredentials = (InternalEObject)credentials;
				NotificationChain msgs = oldCredentials.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS, null, null);
				if (newCredentials.eInternalContainer() == null) {
					msgs = newCredentials.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS, oldCredentials, credentials));
			}
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionCredentials basicGetCredentials() {
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredentials(ConnectionCredentials newCredentials, NotificationChain msgs) {
		ConnectionCredentials oldCredentials = credentials;
		credentials = newCredentials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS, oldCredentials, newCredentials);
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
	public void setCredentials(ConnectionCredentials newCredentials) {
		if (newCredentials != credentials) {
			NotificationChain msgs = null;
			if (credentials != null)
				msgs = ((InternalEObject)credentials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS, null, msgs);
			if (newCredentials != null)
				msgs = ((InternalEObject)newCredentials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS, null, msgs);
			msgs = basicSetCredentials(newCredentials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS, newCredentials, newCredentials));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseConnectionPackage.CONNECTION_CONFIG__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseConnectionPackage.CONNECTION_CONFIG__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseConnectionPackage.CONNECTION_CONFIG__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatalog(String newCatalog) {
		String oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseConnectionPackage.CONNECTION_CONFIG__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistent(boolean newPersistent) {
		boolean oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabaseConnectionPackage.CONNECTION_CONFIG__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS:
				return basicSetCredentials(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS:
				if (resolve) return getCredentials();
				return basicGetCredentials();
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VENDOR:
				return getVendor();
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VERSION:
				return getVersion();
			case DatabaseConnectionPackage.CONNECTION_CONFIG__URL:
				return getUrl();
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CATALOG:
				return getCatalog();
			case DatabaseConnectionPackage.CONNECTION_CONFIG__PERSISTENT:
				return isPersistent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS:
				setCredentials((ConnectionCredentials)newValue);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VENDOR:
				setVendor((String)newValue);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VERSION:
				setVersion((String)newValue);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__URL:
				setUrl((String)newValue);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CATALOG:
				setCatalog((String)newValue);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__PERSISTENT:
				setPersistent((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS:
				setCredentials((ConnectionCredentials)null);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CATALOG:
				setCatalog(CATALOG_EDEFAULT);
				return;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CREDENTIALS:
				return credentials != null;
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DatabaseConnectionPackage.CONNECTION_CONFIG__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DatabaseConnectionPackage.CONNECTION_CONFIG__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DatabaseConnectionPackage.CONNECTION_CONFIG__CATALOG:
				return CATALOG_EDEFAULT == null ? catalog != null : !CATALOG_EDEFAULT.equals(catalog);
			case DatabaseConnectionPackage.CONNECTION_CONFIG__PERSISTENT:
				return persistent != PERSISTENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(", version: ");
		result.append(version);
		result.append(", url: ");
		result.append(url);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(')');
		return result.toString();
	}

} // ConnectionConfigImpl
