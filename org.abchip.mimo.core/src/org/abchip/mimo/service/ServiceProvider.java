/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import java.util.concurrent.Future;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceProvider()
 * @model abstract="true"
 * @generated
 */
public interface ServiceProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaFuture&lt;V&gt;" required="true" exceptions="org.abchip.mimo.service.ServiceException"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException;

} // ServiceProvider
