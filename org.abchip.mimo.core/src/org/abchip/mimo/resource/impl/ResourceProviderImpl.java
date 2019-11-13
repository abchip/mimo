/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource.impl;

import javax.inject.Inject;

import org.abchip.mimo.context.AuthenticationAnonymous;
import org.abchip.mimo.context.AuthenticationUserPassword;
import org.abchip.mimo.context.AuthenticationUserToken;
import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.abchip.mimo.resource.Resource;
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
	private FrameManager frameManager;

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
	 * @generated
	 */
	@Override
	public boolean isActive(ContextProvider contextProvider) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextProvider login(String contextId, AuthenticationAnonymous authentication) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextProvider login(String contextId, AuthenticationUserPassword authentication) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextProvider login(String contextId, AuthenticationUserToken authentication) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkLogin(AuthenticationUserToken authentication, boolean create) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void logout(ContextProvider contextProvider) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Class<E> klass) {
		return getResource(contextProvider, klass.getSimpleName());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Frame<E> frame) {
		return getResource(contextProvider, frame, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public final <E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, String frame) {
		return getResource(contextProvider, (Frame<E>) frameManager.getFrame(frame));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Class<E> klass, String tenant) {
		return getResource(contextProvider, klass.getSimpleName(), tenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, String frame, String tenant) {
		return getResource(contextProvider, frame, tenant);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public <E extends EntityNameable> Resource<E> getResource(ContextProvider contextProvider, Frame<E> frame, String tenant) {

		if (tenant == null || tenant.trim().isEmpty()) {
			if (contextProvider.getContextDescription().isTenant())
				tenant = contextProvider.getContextDescription().getTenant();
		} else if (tenant.equals(Resource.TENANT_MASTER))
			tenant = null;	

		return doGetResource(contextProvider, frame, tenant);
	}
	
	public abstract <E extends EntityNameable> Resource<E> doGetResource(ContextProvider contextProvider, Frame<E> frame, String tenant);
} // ResourceProviderImpl
