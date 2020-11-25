/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import java.util.concurrent.Future;

import org.abchip.mimo.application.ServiceScope;
import org.abchip.mimo.application.ServiceScope.Scope;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceManager()
 * @model interface="true" abstract="true"
 * @generated
 */
@ServiceScope(Scope.CONTEXT)
public interface ServiceManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" serviceIdRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> Service<R, V> getService(String serviceId);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" requestRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> V execute(R request) throws ServiceException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model type="org.abchip.mimo.java.JavaFuture&lt;V&gt;" required="true" exceptions="org.abchip.mimo.service.ServiceException" requestRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> Future<V> submit(R request) throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" klassRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Class<R> klass) throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" klassRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Class<R> klass, String tenant) throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" frameRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Frame<R> frame) throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" frameRequired="true" tenantRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(Frame<R> frame, String tenant) throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" frameRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(String frame) throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException" frameRequired="true"
	 * @generated
	 */
	<V extends ServiceResponse, R extends ServiceRequest<V>> R prepare(String frame, String tenant) throws ServiceException;
} // ServiceManager
