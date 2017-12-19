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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Listener</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getResourceListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceListener<E extends EntityNameable> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model eventRequired="true"
	 * @generated
	 */
	void handleEvent(ResourceEvent<E> event);

} // ResourceListener
