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
import org.abchip.mimo.resource.ResourceReader;

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
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	ResourceReader<Frame<?>> getFrameReader(ContextProvider contextProvider);

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
} // FrameManager
