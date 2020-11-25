/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context.impl;

import java.lang.annotation.Annotation;

import org.abchip.mimo.context.AdapterFactory;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.context.ContextDescription;
import org.abchip.mimo.context.ContextListener;
import org.abchip.mimo.context.ContextPackage;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.impl.EntityImpl;
import org.abchip.mimo.resource.ResourceManager;
import org.abchip.mimo.resource.ResourceSet;
import org.abchip.mimo.service.ServiceManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Context</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ContextImpl extends EntityImpl implements Context {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final String getTenant() {
		ContextDescription contextDescription = getContextDescription();
		if (contextDescription == null)
			return null;

		return contextDescription.getTenant();
	}

	@Override
	protected final void finalize() throws Throwable {
		super.finalize();

		this.dispose();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Frame<E> getFrame(Class<E> klass) {
		return this.getResourceManager().getFrame(klass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> Frame<E> getFrame(String frame) {
		return this.getResourceManager().getFrame(frame);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E createProxy(Class<E> klass, String id) {
		return createProxy(klass, id, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E createProxy(Frame<E> frame, String id) {
		return createProxy(frame, id, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E createProxy(String frame, String id) {
		return createProxy(frame, id, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E createProxy(Class<E> klass, String id, String tenant) {
		return createProxy(klass.getSimpleName(), id, tenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E createProxy(Frame<E> frame, String id, String tenant) {
		return createProxy(frame.getName(), id, tenant);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E createProxy(String frame, String id, String tenant) {

		if (id == null)
			return null;

		E entity = make(frame, id);

		if (tenant == null)
			tenant = this.getTenant();

		InternalEObject internalEObject = (InternalEObject) entity;
		URI uri = URI.createHierarchicalURI("mimo", tenant, null, new String[] { frame }, null, id);
		internalEObject.eSetProxyURI(uri);

		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E make(String frame) {
		return make(this.getFrame(frame));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E make(Frame<E> frame) {
		return make(frame, null);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E make(Class<E> klass, String id) {
		return make(this.getFrame(klass.getSimpleName()), id);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E make(String frame, String id) {
		return make(this.getFrame(frame), id);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityIdentifiable> E make(Frame<E> frame, String id) {

		@SuppressWarnings("unchecked")
		E entity = (E) EcoreUtil.create((EClass) frame.getEClassifier());

		if (id != null) {
			String[] ids = id.split("/");
			Frame<E> domainFrame = entity.isa();
			for (int i = 0; i < ids.length; i++) {
				String key = domainFrame.getKeys().get(i);
				domainFrame.setValue(entity, key, ids[i]);
			}
		}

		entity.init(this);
		
		return entity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract <T> T make(Class<T> klass);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void dispose();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract <T> T get(Class<T> clazz);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract <T extends Object> T getAdapter(Object adaptable, Class<T> adapter);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void inject(Object object);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract boolean isClosed();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract <A extends Annotation> void invoke(Object object, Class<A> qualifier);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract <T extends Object> void registerAdapterFactory(AdapterFactory factory, Class<T> adapterType);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void registerListener(ContextListener listener);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract <T> void set(Class<T> klass, T object);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void set(String name, Object object);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract ContextDescription getContextDescription();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract ResourceManager getResourceManager();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract ResourceSet getResourceSet();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract ServiceManager getServiceManager();

} // ContextImpl
