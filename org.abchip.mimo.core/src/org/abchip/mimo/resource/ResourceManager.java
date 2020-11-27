/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.application.ServiceScope;
import org.abchip.mimo.application.ServiceScope.Scope;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Resource
 * Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
@ServiceScope(Scope.CONTEXT)
public interface ResourceManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(Class<E> klass, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(Frame<E> frame, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" serializationTypeRequired="true"
	 * @generated
	 */
	<E extends Entity> ResourceSerializer<E> createResourceSerializer(String frame, SerializationType serializationType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Frame<E> getFrame(Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> Frame<E> getFrame(String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Class<E> klass) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(Frame<E> frame) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceReader<E> getResourceReader(String frame) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" klassRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Class<E> klass) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(Frame<E> frame) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" frameRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> ResourceWriter<E> getResourceWriter(String frame) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> void registerListener(Class<E> klass, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> void registerListener(Frame<E> frame, ResourceListener<E> listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model frameRequired="true" listenerRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> void registerListener(String frame, ResourceListener<E> listener);
} // ResourceManager
