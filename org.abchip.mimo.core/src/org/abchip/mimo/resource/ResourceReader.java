/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.EntityIterator;
import org.abchip.mimo.entity.EntityIdentifiable;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.ResourceReader#getNotifier <em>Notifier</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceReader()
 * @model abstract="true"
 * @generated
 */
public interface ResourceReader<E extends EntityIdentifiable> {
	/**
	 * Returns the value of the '<em><b>Notifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifier</em>' reference.
	 * @see #setNotifier(ResourceNotifier)
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceReader_Notifier()
	 * @model
	 * @generated
	 */
	ResourceNotifier<E> getNotifier();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceReader#getNotifier <em>Notifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifier</em>' reference.
	 * @see #getNotifier()
	 * @generated
	 */
	void setNotifier(ResourceNotifier<E> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	EntityIterator<E> find() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	EntityIterator<E> find(String filter) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	EntityIterator<E> find(String filter, String fields) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	EntityIterator<E> find(String filter, String fields, String order) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	EntityIterator<E> find(String filter, String fields, String order, int limit) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	EntityIterator<E> find(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	E first() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	E first(boolean proxy) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" nameRequired="true"
	 * @generated
	 */
	E lookup(String name) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" nameRequired="true"
	 * @generated
	 */
	E lookup(String name, boolean proxy) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Frame<E> getFrame();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Resource<E> getResource();
} // Resource
