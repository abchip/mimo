/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;

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
	 * @model contextRequired="true" klassRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(Context context, Class<E> klass, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(Context context, Frame<E> frame, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(Context context, String frame, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends Entity> Frame<E> getFrame(Context context, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends Entity> Frame<E> getFrame(Context context, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true"
	 * @generated
	 */
	Frame<?> getFrame(Context context, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	Frame<?> getFrame(Context context, String frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, Frame<E> frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Context context, String frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, Frame<E> frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Context context, String frame, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" klassRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> void registerListener(Context context, Class<E> klass, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> void registerListener(Context context, Frame<E> frame, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> void registerListener(Context context, String frame, ResourceListener<E> listener);

} // ResourceManager
