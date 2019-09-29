/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.context;

import java.net.URI;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentMap;

import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Lock Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getLockManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LockManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true" addressDataType="org.abchip.mimo.util.JavaURI"
	 * @generated
	 */
	<N extends EntityNameable> EntityLocker<N> getLocker(ContextProvider contextProvider, URI address);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextProviderRequired="true"
	 * @generated
	 */
	<N extends EntityNameable> EntityLocker<N> getLocker(ContextProvider contextProvider, N object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaConcurrentMap" contextProviderRequired="true"
	 * @generated
	 */
	<K, V> ConcurrentMap<K, V> getConcurrentMap(ContextProvider contextProvider, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.util.JavaBlockingQueue" contextProviderRequired="true"
	 * @generated
	 */
	<E> BlockingQueue<E> getQueue(ContextProvider contextProvider, String name);

} // LockManager
