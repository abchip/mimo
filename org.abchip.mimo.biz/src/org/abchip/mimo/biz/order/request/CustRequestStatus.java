/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestStatusId <em>Cust Request Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestStatus()
 * @model
 * @generated
 */
public interface CustRequestStatus extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Change By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change By User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change By User Login Id</em>' attribute.
	 * @see #setChangeByUserLoginId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestStatus_ChangeByUserLoginId()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getChangeByUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change By User Login Id</em>' attribute.
	 * @see #getChangeByUserLoginId()
	 * @generated
	 */
	void setChangeByUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Id</em>' attribute.
	 * @see #setCustRequestId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestStatus_CustRequestId()
	 * @model annotation="mimo-ent-domain frame='CustRequest'"
	 * @generated
	 */
	String getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestId <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' attribute.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #setCustRequestItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestStatus_CustRequestItemSeqId()
	 * @model
	 * @generated
	 */
	String getCustRequestItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 */
	void setCustRequestItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Status Id</em>' attribute.
	 * @see #setCustRequestStatusId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestStatus_CustRequestStatusId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCustRequestStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getCustRequestStatusId <em>Cust Request Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Status Id</em>' attribute.
	 * @see #getCustRequestStatusId()
	 * @generated
	 */
	void setCustRequestStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Date</em>' attribute.
	 * @see #setStatusDate(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestStatus_StatusDate()
	 * @model
	 * @generated
	 */
	Date getStatusDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusDate <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Date</em>' attribute.
	 * @see #getStatusDate()
	 * @generated
	 */
	void setStatusDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestStatus_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestStatus#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

} // CustRequestStatus
