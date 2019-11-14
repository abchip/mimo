/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import java.util.List;
import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityNameable;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>ResourceDriver</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.ResourceDriver#getResourceConfig <em>Resource Config</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceDriver()
 * @model abstract="true"
 * @generated
 */
public interface ResourceDriver<E extends EntityNameable> extends Entity {

	public static String TENANT_MASTER = "*MASTER";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true" updateRequired="true"
	 * @generated
	 */
	void create(E entity, boolean update);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 * @generated
	 */
	void delete(E entity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Frame<E> getFrame();

	/**
	 * Returns the value of the '<em><b>Resource Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Config</em>' reference.
	 * @see #setResourceConfig(ResourceDriverConfig)
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceDriver_ResourceConfig()
	 * @model required="true"
	 * @generated
	 */
	ResourceDriverConfig getResourceConfig();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceDriver#getResourceConfig <em>Resource Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Config</em>' reference.
	 * @see #getResourceConfig()
	 * @generated
	 */
	void setResourceConfig(ResourceDriverConfig value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String nextSequence();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	E read(String name, String fields, boolean proxy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	List<E> read(String filter, String fields, int limit, boolean proxy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model entityRequired="true"
	 * @generated
	 */
	void update(E entity);

} // ResourceDriver
