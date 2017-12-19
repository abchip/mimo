/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity.impl;

import java.util.List;

import org.abchip.mimo.context.ContextProvider;

import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.EntityPackage;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.EntityProvider;
import org.abchip.mimo.entity.EntityReader;
import org.abchip.mimo.entity.EntityWriter;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EntityProviderImpl extends MinimalEObjectImpl.Container implements EntityProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, String resource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String resource) {
		return getEntityReader(contextProvider, frame.getEntityClass(), resource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, List<String> resources) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, List<String> resources) {
		return getEntityReader(contextProvider, frame.getEntityClass(), resources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass, String resource) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resource) {
		return getEntityWriter(contextProvider, frame.getEntityClass(), resource);		
	}
} //EntityProviderImpl
