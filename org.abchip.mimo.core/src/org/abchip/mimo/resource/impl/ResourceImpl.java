/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import java.util.List;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceConfig;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.util.Logs;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osgi.service.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Resource</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceImpl#getResourceConfig <em>Resource Config</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.impl.ResourceImpl#getTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl<E extends EntityIdentifiable> extends EntityImpl implements Resource<E> {

	private static final Logger LOGGER = Logs.getLogger(ResourceImpl.class);

	private Context context;

	/**
	 * The cached value of the '{@link #getResourceConfig() <em>Resource Config</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getResourceConfig()
	 * @generated
	 * @ordered
	 */
	protected ResourceConfig resourceConfig;

	/**
	 * The default value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenant() <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTenant()
	 * @generated
	 * @ordered
	 */
	protected String tenant = TENANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ResourceImpl(Context context, String tenant) {
		super();

		this.context = context;
		this.tenant = tenant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceConfig basicGetResourceConfig() {
		return resourceConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final Context getContext() {
		return this.context;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final String getTenant() {
		return tenant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				if (resolve) return getResourceConfig();
				return basicGetResourceConfig();
			case ResourcePackage.RESOURCE__TENANT:
				return getTenant();
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
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				setResourceConfig((ResourceConfig)newValue);
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
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				setResourceConfig((ResourceConfig)null);
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
			case ResourcePackage.RESOURCE__RESOURCE_CONFIG:
				return resourceConfig != null;
			case ResourcePackage.RESOURCE__TENANT:
				return TENANT_EDEFAULT == null ? tenant != null : !TENANT_EDEFAULT.equals(tenant);
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
		result.append(" (tenant: ");
		result.append(tenant);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final void attach(E entity) {
		InternalEObject internalEObject = (InternalEObject) entity;
		internalEObject.eSetResource(this.eInternalResource(), null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final void detach(E entity) {
		InternalEObject internalEObject = (InternalEObject) entity;
		internalEObject.eSetResource(null, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public E createProxy(String id) {

		E entity = this.getContext().createProxy(this.getFrame(), id, this.getTenant());
		if (entity == null)
			return null;

		this.attach(entity);

		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final E make() {
		try {
			return make(false);
		} catch (ResourceException e) {
			LOGGER.warn(e.getMessage());
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final E make(boolean sequence) throws ResourceException {

		String id = null;
		if (sequence)
			id = this.nextSequence();

		return make(id);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final E make(String id) {

		E entity = this.getContext().make(this.getFrame(), id);

		this.attach(entity);

		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void create(E entity, boolean update, boolean raw) throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract void delete(E entity) throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract Frame<E> getFrame();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract String nextSequence() throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract E lookup(String name, String fields, boolean proxy) throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract List<E> find(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void update(E entity) throws ResourceException;
} // ResourceImpl
