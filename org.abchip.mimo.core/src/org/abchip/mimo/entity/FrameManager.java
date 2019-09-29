/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Frame Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getFrameManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FrameManager {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" frameRequired="true"
	 * @generated
	 */
	<E extends Entity> E createEntity(Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" klassRequired="true"
	 * @generated
	 */
	<E extends Entity> E createEntity(Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	<E extends Entity> EntityReader<Frame<E>> getFrameReader(ContextProvider contextProvider);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	Frame<?> getFrame(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model klassRequired="true"
	 * @generated
	 */
	<E extends Entity> Frame<E> getFrame(Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" resourceRequired="true"
	 * @generated
	 */
	<E extends Entity> void checkFrameAutorization(ContextProvider contextProvider, Frame<E> frame, String resource);
} // FrameManager
