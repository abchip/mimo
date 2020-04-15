/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceExecutor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceExecutor {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getServiceName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" requestRequired="true"
	 * @generated
	 */
	ServiceResponse execute(ServiceResponse request) throws ServiceException;
} // ServiceExecutor
