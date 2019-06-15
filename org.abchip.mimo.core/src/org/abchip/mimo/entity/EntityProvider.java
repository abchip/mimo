/**

 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.entity;

import java.util.List;

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Provider</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityProvider()
 * @model abstract="true"
 * @generated
 */
public interface EntityProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIdRequired="true"
	 * @generated
	 */
	boolean isActive(ContextProvider contextId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" resourceRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" resourceRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" resourceRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, String frame, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" resourcesRequired="true" resourcesMany="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, List<String> resources);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" resourcesRequired="true" resourcesMany="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, List<String> resources);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" resourcesRequired="true" resourcesMany="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, String frame, List<String> resources);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" resourceRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" resourceRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" resourceRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, String frame, String resource);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userRequired="true" passwordRequired="true"
	 * @generated
	 */
	ContextProvider login(String user, String password, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	void logout(ContextProvider contextProvider);

} // EntityProvider
