/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.resource;

import java.util.List;

import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>QRegistry Notifier</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceNotifier()
 * @model
 * @generated
 */
public interface ResourceNotifier<E extends EntityIdentifiable> {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model eventRequired="true"
	 * @generated
	 */
	void fireEvent(ResourceEvent<E> event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	List<ResourceListener<E>> getListeners();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model listenerRequired="true"
	 * @generated
	 */
	void registerListener(ResourceListener<E> listener);
} // QRegistryNotifier
