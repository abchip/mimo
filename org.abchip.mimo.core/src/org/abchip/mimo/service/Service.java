/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.Service#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getService()
 * @model abstract="true"
 * @generated
 */
public interface Service<R extends ServiceRequest<R, V>, V extends ServiceResponse> extends Entity {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(ServiceRequest)
	 * @see org.abchip.mimo.service.ServicePackage#getService_Request()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	R getRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.Service#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(R value);

} // Service
