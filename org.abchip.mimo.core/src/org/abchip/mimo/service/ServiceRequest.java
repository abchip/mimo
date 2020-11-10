/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.context.Context;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.ServiceRequest#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.service.ServiceRequest#getTenant <em>Tenant</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceRequest()
 * @model abstract="true"
 * @generated
 */
public interface ServiceRequest<V extends ServiceResponse> extends ServiceMessage {

	/**
	 * Returns the value of the '<em><b>Tenant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant</em>' attribute.
	 * @see #setTenant(String)
	 * @see org.abchip.mimo.service.ServicePackage#getServiceRequest_Tenant()
	 * @model
	 * @generated
	 */
	String getTenant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.ServiceRequest#getTenant <em>Tenant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant</em>' attribute.
	 * @see #getTenant()
	 * @generated
	 */
	void setTenant(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see org.abchip.mimo.service.ServicePackage#getServiceRequest_Context()
	 * @model transient="true" changeable="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isPrepared();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Class<V> getResponse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="org.abchip.mimo.service.ServiceException"
	 * @generated
	 */
	V buildResponse() throws ServiceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" tenantRequired="true"
	 * @generated
	 */
	void init(Context context, String tenant);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getServiceName();
} // ServiceRequest
