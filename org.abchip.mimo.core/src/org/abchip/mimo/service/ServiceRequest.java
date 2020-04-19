/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import java.util.concurrent.Callable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceRequest()
 * @model abstract="true" superTypes="org.abchip.mimo.service.ServiceMessage org.abchip.mimo.java.JavaCallable&lt;V&gt;"
 * @generated
 */
public interface ServiceRequest<R extends ServiceRequest<R, V>, V extends ServiceResponse> extends ServiceMessage, Callable<V> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException"
	 * @generated
	 */
	V call() throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Service<R, V> getService();
} // ServiceRequest
