/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.context.ContextProvider;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;
import org.abchip.mimo.entity.SerializationType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ResourceDriver Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createEntitySerializer(Class<E> klass, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createEntitySerializer(Frame<E> frame, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createEntitySerializer(String frame, SerializationType serializationType);

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
	 * @model frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerListener(String frame, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(Class<E> klass, ResourceProvider provider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(Frame<E> frame, ResourceProvider provider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(String frame, ResourceProvider provider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceProvider getProvider(Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceProvider getProvider(Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceProvider getProvider(String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, Frame<E> frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getEntityReader(ContextProvider contextProvider, String frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, Frame<E> frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getEntityWriter(ContextProvider contextProvider, String frame, String tenant);

} // ResourceManager
