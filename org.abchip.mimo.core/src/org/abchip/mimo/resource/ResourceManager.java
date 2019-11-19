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
 * A representation of the model object '<em><b>Resource Manager</b></em>'.
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
	 * @model contextProviderRequired="true" klassRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(ContextProvider contextProvider, Class<E> klass, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(ContextProvider contextProvider, Frame<E> frame, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(ContextProvider contextProvider, String frame, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, Frame<E> frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceReader<E> getResourceReader(ContextProvider contextProvider, String frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, Frame<E> frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceWriter<E> getResourceWriter(ContextProvider contextProvider, String frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceProvider getProvider(ContextProvider contextProvider, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceProvider getProvider(ContextProvider contextProvider, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> ResourceProvider getProvider(ContextProvider contextProvider, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerListener(ContextProvider contextProvider, Class<E> klass, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerListener(ContextProvider contextProvider, Frame<E> frame, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerListener(ContextProvider contextProvider, String frame, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(ContextProvider contextProvider, Class<E> klass, ResourceProvider provider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(ContextProvider contextProvider, Frame<E> frame, ResourceProvider provider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" providerRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> void registerProvider(ContextProvider contextProvider, String frame, ResourceProvider provider);

} // ResourceManager
