/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import org.abchip.mimo.context.ContextProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Manager</b></em>'.
 * <!-- end-user-doc -->
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
	 * @model required="true" contextProviderRequired="true" klassRequired="true" nameRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> E createProxy(ContextProvider contextProvider, Class<E> klass, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Frame<E> getFrame(ContextProvider contextProvider, Class<E> klass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" klassRequired="true" tenantRequired="true"
	 * @generated
	 */
	<E extends EntityNameable> Frame<E> getFrame(ContextProvider contextProvider, Class<E> klass, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true"
	 * @generated
	 */
	Frame<?> getFrame(ContextProvider contextProvider, String frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	Frame<?> getFrame(ContextProvider contextProvider, String frame, String tenant);

} // FrameManager
