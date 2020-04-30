/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import java.util.List;
import org.abchip.mimo.context.Context;
import org.abchip.mimo.entity.Entity;
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
 *   <li>{@link org.abchip.mimo.resource.Resource#getResourceConfig <em>Resource Config</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResource()
 * @model abstract="true"
 * @generated
 */
public interface Resource<E extends EntityIdentifiable> extends Entity {

	public static String TENANT_MASTER = "*MASTER";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" entityRequired="true" updateRequired="true"
	 * @generated
	 */
	void create(E entity, boolean update) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" idRequired="true"
	 * @generated
	 */
	E createProxy(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" entityRequired="true"
	 * @generated
	 */
	void delete(E entity) throws ResourceException;

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
	String getTenant();

	/**
	 * Returns the value of the '<em><b>Resource Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Config</em>' reference.
	 * @see #setResourceConfig(ResourceConfig)
	 * @see org.abchip.mimo.resource.ResourcePackage#getResource_ResourceConfig()
	 * @model required="true"
	 * @generated
	 */
	ResourceConfig getResourceConfig();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.Resource#getResourceConfig <em>Resource Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Config</em>' reference.
	 * @see #getResourceConfig()
	 * @generated
	 */
	void setResourceConfig(ResourceConfig value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	String nextSequence() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	E read(String name, String fields, boolean proxy) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.resource.ResourceException"
	 * @generated
	 */
	List<E> read(String filter, String fields, String order, int limit, boolean proxy) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" entityRequired="true"
	 * @generated
	 */
	void update(E entity) throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getContext();

} // Resource
