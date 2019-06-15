/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.FrameManager;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Provider</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityProviderImpl extends MinimalEObjectImpl.Container implements EntityProvider {

	@Inject
	private ContextRoot contextRoot;
	@Inject
	private FrameManager frameManager;

	private EntityReader<Frame<Entity>> frameReader;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityPackage.Literals.ENTITY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isActive(ContextProvider contextId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@PostConstruct
	private void init() {
		this.frameReader = frameManager.getFrameReader(getContextRoot());
	}
	
	protected ContextRoot getContextRoot() {
		return contextRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, String resource) {
		return getEntityReader(contextProvider, klass.getSimpleName(), resource);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, String frameName, String resource) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		return getEntityReader(contextProvider, frame, resource);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, List<String> resources) {
		return getEntityReader(contextProvider, klass.getSimpleName(), resources);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, String frameName, List<String> resources) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		return getEntityReader(contextProvider, frame, resources);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass, String resource) {
		return getEntityWriter(contextProvider, klass.getSimpleName(), resource);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public final <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, String frameName, String resource) {
		@SuppressWarnings("unchecked")
		Frame<E> frame = (Frame<E>) frameReader.lookup(frameName);
		return getEntityWriter(contextProvider, frame, resource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextProvider login(String user, String password, String tenant) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public abstract <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String resource);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, List<String> resources);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public abstract <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resource);
} // EntityProviderImpl
