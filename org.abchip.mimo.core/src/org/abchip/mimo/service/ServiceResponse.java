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
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.service.ServiceResponse#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.abchip.mimo.service.ServiceResponse#getSuccessMessage <em>Success Message</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.service.ServicePackage#getServiceResponse()
 * @model
 * @generated
 */
public interface ServiceResponse extends ServiceMessage {

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see org.abchip.mimo.service.ServicePackage#getServiceResponse_ErrorMessage()
	 * @model
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.ServiceResponse#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>Success Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Message</em>' attribute.
	 * @see #setSuccessMessage(String)
	 * @see org.abchip.mimo.service.ServicePackage#getServiceResponse_SuccessMessage()
	 * @model
	 * @generated
	 */
	String getSuccessMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.service.ServiceResponse#getSuccessMessage <em>Success Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Message</em>' attribute.
	 * @see #getSuccessMessage()
	 * @generated
	 */
	void setSuccessMessage(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean onError();
} // ServiceResponse
