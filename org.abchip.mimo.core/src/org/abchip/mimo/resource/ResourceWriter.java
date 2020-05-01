/**
 *  Copyright (c) 2017, 2020 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Writer</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceWriter()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceWriter<E extends EntityIdentifiable> extends ResourceReader<E> {
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
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" entityRequired="true"
	 * @generated
	 */
	void create(E entity) throws ResourceException;

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
	 * @model exceptions="org.abchip.mimo.resource.ResourceException" entityRequired="true"
	 * @generated
	 */
	void update(E entity) throws ResourceException;

} // ResourceWriter
