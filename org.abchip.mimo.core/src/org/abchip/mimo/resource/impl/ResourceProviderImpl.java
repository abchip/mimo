/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import javax.inject.Inject;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.resource.ResourceProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Provider</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ResourceProviderImpl extends MinimalEObjectImpl.Container implements ResourceProvider {

	@Inject
	private ResourceManager resourceManager;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcePackage.Literals.RESOURCE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, Class<E> klass) {
		return getResource(context, klass.getSimpleName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Context context, Frame<E> frame) {
		return getResource(context, frame, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, String frame) {
		return getResource(context, frame, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Context context, Class<E> klass, String tenant) {
		return getResource(context, klass.getSimpleName(), tenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Context context, String frame, String tenant) {
		return getResource(context, (Frame<E>) resourceManager.getFrame(context, frame, tenant), tenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityIdentifiable> Resource<E> getResource(Context context, Frame<E> frame, String tenant) {

		if (tenant == null || tenant.trim().isEmpty()) {
			if (context.getContextDescription().isTenant())
				tenant = context.getContextDescription().getTenant();
		} else if (tenant.equals(Resource.TENANT_MASTER))
			tenant = null;

		return doGetResource(context, frame, tenant);
	}

	public abstract <E extends EntityIdentifiable> Resource<E> doGetResource(Context context, Frame<E> frame, String tenant);
} // ResourceProviderImpl
