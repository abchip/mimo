/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http:/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.database.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.database.CatalogContainer;
import org.abchip.mimo.database.DatabaseContainer;
import org.abchip.mimo.database.DatabasePackage;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Database Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.database.impl.DatabaseContainerImpl#getCatalogContainers <em>Catalog Containers</em>}</li>
 *   <li>{@link org.abchip.mimo.database.impl.DatabaseContainerImpl#getDefaultCatalogContainer <em>Default Catalog Container</em>}</li>
 *   <li>{@link org.abchip.mimo.database.impl.DatabaseContainerImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.abchip.mimo.database.impl.DatabaseContainerImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatabaseContainerImpl extends EntityImpl implements DatabaseContainer {

	/**
	 * The cached value of the '{@link #getCatalogContainers()
	 * <em>Catalog Containers</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCatalogContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogContainer> catalogContainers;

	/**
	 * The cached value of the '{@link #getDefaultCatalogContainer() <em>Default Catalog Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCatalogContainer()
	 * @generated
	 * @ordered
	 */
	protected CatalogContainer defaultCatalogContainer;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatabasePackage.Literals.DATABASE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<CatalogContainer> getCatalogContainers() {
		if (catalogContainers == null) {
			catalogContainers = new EObjectContainmentEList.Resolving<CatalogContainer>(CatalogContainer.class, this, DatabasePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS);
		}
		return catalogContainers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE_CONTAINER__VENDOR, oldVendor, vendor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE_CONTAINER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogContainer getDefaultCatalogContainer() {
		if (defaultCatalogContainer != null && ((EObject)defaultCatalogContainer).eIsProxy()) {
			InternalEObject oldDefaultCatalogContainer = (InternalEObject)defaultCatalogContainer;
			defaultCatalogContainer = (CatalogContainer)eResolveProxy(oldDefaultCatalogContainer);
			if (defaultCatalogContainer != oldDefaultCatalogContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatabasePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER, oldDefaultCatalogContainer, defaultCatalogContainer));
			}
		}
		return defaultCatalogContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CatalogContainer basicGetDefaultCatalogContainer() {
		return defaultCatalogContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCatalogContainer(CatalogContainer newDefaultCatalogContainer) {
		CatalogContainer oldDefaultCatalogContainer = defaultCatalogContainer;
		defaultCatalogContainer = newDefaultCatalogContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatabasePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER, oldDefaultCatalogContainer, defaultCatalogContainer));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatabasePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				return ((InternalEList<?>)getCatalogContainers()).basicRemove(otherEnd, msgs);
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
			case DatabasePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				return getCatalogContainers();
			case DatabasePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				if (resolve) return getDefaultCatalogContainer();
				return basicGetDefaultCatalogContainer();
			case DatabasePackage.DATABASE_CONTAINER__VENDOR:
				return getVendor();
			case DatabasePackage.DATABASE_CONTAINER__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatabasePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				getCatalogContainers().clear();
				getCatalogContainers().addAll((Collection<? extends CatalogContainer>)newValue);
				return;
			case DatabasePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				setDefaultCatalogContainer((CatalogContainer)newValue);
				return;
			case DatabasePackage.DATABASE_CONTAINER__VENDOR:
				setVendor((String)newValue);
				return;
			case DatabasePackage.DATABASE_CONTAINER__VERSION:
				setVersion((String)newValue);
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
			case DatabasePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				getCatalogContainers().clear();
				return;
			case DatabasePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				setDefaultCatalogContainer((CatalogContainer)null);
				return;
			case DatabasePackage.DATABASE_CONTAINER__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case DatabasePackage.DATABASE_CONTAINER__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case DatabasePackage.DATABASE_CONTAINER__CATALOG_CONTAINERS:
				return catalogContainers != null && !catalogContainers.isEmpty();
			case DatabasePackage.DATABASE_CONTAINER__DEFAULT_CATALOG_CONTAINER:
				return defaultCatalogContainer != null;
			case DatabasePackage.DATABASE_CONTAINER__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case DatabasePackage.DATABASE_CONTAINER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(')');
		return result.toString();
	}

} // DatabaseContainerImpl
