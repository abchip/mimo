/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.resource.Resource;
import org.abchip.mimo.resource.ResourceException;
import org.abchip.mimo.resource.ResourcePackage;
import org.abchip.mimo.resource.ResourceProvider;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.util.Strings;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Provider</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ResourceProviderImpl extends MinimalEObjectImpl.Container implements ResourceProvider {

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
	public abstract <E extends EntityIdentifiable> Resource<E> createResource(ResourceSet resourceSet, Frame<E> frame, String tenantId) throws ResourceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, Class<E> klass) throws ResourceException {
		return getResource(context, klass.getSimpleName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, Frame<E> frame) throws ResourceException {
		return getResource(context, frame, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, String frameId) throws ResourceException {
		return getResource(context, frameId, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, Class<E> klass, String tenant) throws ResourceException {
		return getResource(context, klass.getSimpleName(), tenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, Frame<E> frame, String tenant) throws ResourceException {
		return getResource(context, frame.getName(), tenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Resource<E> getResource(Context context, String frameId, String tenantId) throws ResourceException {

		if (Strings.isEmpty(tenantId)) {
			if (context.getContextDescription().isTenant())
				tenantId = context.getContextDescription().getTenant();
		} else if (tenantId.equals(Resource.TENANT_MASTER))
			tenantId = null;

		checkAuthorization(context, tenantId);

		ResourceSet resourceSet = context.get(ResourceSet.class);
		Resource<E> resource = resourceSet.getResource(frameId, tenantId);

		return resource;
	}

	private final void checkAuthorization(Context context, String tenantId) throws ResourceException {
		ContextDescription contextDescription = context.getContextDescription();

		// check authorization
		if (contextDescription.isTenant()) {
			if (!contextDescription.getTenant().equals(tenantId))
				throw new ResourceException("Permission denied for tenant: " + contextDescription.getTenant());
		}

		// check frame authorization
	}

} // ResourceProviderImpl
