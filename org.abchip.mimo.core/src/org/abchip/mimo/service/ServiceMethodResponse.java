/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.service;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.ServiceMethodResponse#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceMethodResponse()
 * @model
 * @generated
 */
public interface ServiceMethodResponse<T> extends ServiceResponse {

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(Object)
	 * @see org.abchip.mimo.service.ServicePackage#getServiceMethodResponse_Result()
	 * @model
	 * @generated
	 */
	T getResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.ServiceMethodResponse#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(T value);
} // ServiceMethodResponse
