/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestResolutionId <em>Cust Request Resolution Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestResolution()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface CustRequestResolution extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cust Request Resolution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Resolution Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Resolution Id</em>' attribute.
	 * @see #setCustRequestResolutionId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestResolution_CustRequestResolutionId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCustRequestResolutionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestResolutionId <em>Cust Request Resolution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Resolution Id</em>' attribute.
	 * @see #getCustRequestResolutionId()
	 * @generated
	 */
	void setCustRequestResolutionId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Type Id</em>' attribute.
	 * @see #setCustRequestTypeId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestResolution_CustRequestTypeId()
	 * @model annotation="mimo-ent-domain frame='CustRequestType'"
	 * @generated
	 */
	String getCustRequestTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getCustRequestTypeId <em>Cust Request Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Type Id</em>' attribute.
	 * @see #getCustRequestTypeId()
	 * @generated
	 */
	void setCustRequestTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestResolution_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestResolution#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestItem' route='custRequestResolutionId'"
	 * @generated
	 */
	List<String> custRequestItems();

} // CustRequestResolution
