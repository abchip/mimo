/**
 *  Copyright (c) 2017, 2018 ABChip and others.
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

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getResourceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceManager extends EntityProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerListener(Class<E> klass, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerListener(Frame<E> frame, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(Class<E> klass, EntityProvider provider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(Frame<E> frame, EntityProvider provider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, ResourceScope scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, ResourceScope scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass, ResourceScope scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, ResourceScope scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityProvider getEntityProvider(Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> EntityProvider getEntityProvider(Frame<E> frame);

} // ResourceManager
