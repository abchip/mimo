/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import java.util.List;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourcePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceImpl#getResourceConfig <em>Resource Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl<E extends EntityNameable> extends EntityImpl implements Resource<E> {
	/**
	 * The cached value of the '{@link #getResourceConfig() <em>Resource Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceConfig()
	 * @generated
	 * @ordered
	 */
	protected ResourceConfig resourceConfig;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceConfig getResourceConfig() {
		if (resourceConfig != null && ((EObject)resourceConfig).eIsProxy()) {
			InternalEObject oldResourceConfig = (InternalEObject)resourceConfig;
			resourceConfig = (ResourceConfig)eResolveProxy(oldResourceConfig);
			if (resourceConfig != oldResourceConfig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResourcePackage.RESOURCE__RESOURCE_CONFIG, oldResourceConfig, resourceConfig));
			}
		}
		return resourceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceConfig basicGetResourceConfig() {
		return resourceConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceConfig(ResourceConfig newResourceConfig) {
		ResourceConfig oldResourceConfig = resourceConfig;
		resourceConfig = newResourceConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcePackage.RESOURCE__RESOURCE_CONFIG, oldResourceConfig, resourceConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract void create(E entity, boolean update);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract void delete(E entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract String nextSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract E read(String name, String fields, boolean proxy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract List<E> read(String filter, String fields, int limit, boolean proxy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public abstract void update(E entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				if (resolve) return getResourceConfig();
				return basicGetResourceConfig();
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
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				setResourceConfig((ResourceConfig)newValue);
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
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				setResourceConfig((ResourceConfig)null);
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
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				return resourceConfig != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
