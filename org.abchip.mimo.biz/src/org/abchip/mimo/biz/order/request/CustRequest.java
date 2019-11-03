/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getClosedDateTime <em>Closed Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCategoryId <em>Cust Request Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestDate <em>Cust Request Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestName <em>Cust Request Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getFromPartyId <em>From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getFulfillContactMechId <em>Fulfill Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getInternalComment <em>Internal Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getMaximumAmountUomId <em>Maximum Amount Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getOpenDateTime <em>Open Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getResponseRequiredDate <em>Response Required Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestAttributes <em>Cust Request Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCommEvents <em>Cust Request Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestItems <em>Cust Request Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestNotes <em>Cust Request Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestWorkEfforts <em>Cust Request Work Efforts</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface CustRequest extends BizEntityTyped<CustRequestType> {
	/**
	 * Returns the value of the '<em><b>Closed Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Date Time</em>' attribute.
	 * @see #setClosedDateTime(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_ClosedDateTime()
	 * @model
	 * @generated
	 */
	Date getClosedDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getClosedDateTime <em>Closed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Date Time</em>' attribute.
	 * @see #getClosedDateTime()
	 * @generated
	 */
	void setClosedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CreatedByUserLogin()
	 * @model
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Category Id</em>' attribute.
	 * @see #setCustRequestCategoryId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestCategoryId()
	 * @model annotation="mimo-ent-domain frame='CustRequestCategory'"
	 * @generated
	 */
	String getCustRequestCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCategoryId <em>Cust Request Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Category Id</em>' attribute.
	 * @see #getCustRequestCategoryId()
	 * @generated
	 */
	void setCustRequestCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Date</em>' attribute.
	 * @see #setCustRequestDate(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestDate()
	 * @model
	 * @generated
	 */
	Date getCustRequestDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestDate <em>Cust Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Date</em>' attribute.
	 * @see #getCustRequestDate()
	 * @generated
	 */
	void setCustRequestDate(Date value);

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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestId <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' attribute.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Name</em>' attribute.
	 * @see #setCustRequestName(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestName()
	 * @model
	 * @generated
	 */
	String getCustRequestName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestName <em>Cust Request Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Name</em>' attribute.
	 * @see #getCustRequestName()
	 * @generated
	 */
	void setCustRequestName(String value);

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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestTypeId()
	 * @model annotation="mimo-ent-domain frame='CustRequestType'"
	 * @generated
	 */
	String getCustRequestTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestTypeId <em>Cust Request Type Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>From Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Party Id</em>' attribute.
	 * @see #setFromPartyId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_FromPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getFromPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getFromPartyId <em>From Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Party Id</em>' attribute.
	 * @see #getFromPartyId()
	 * @generated
	 */
	void setFromPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Fulfill Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfill Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfill Contact Mech Id</em>' attribute.
	 * @see #setFulfillContactMechId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_FulfillContactMechId()
	 * @model annotation="mimo-ent-domain frame='ContactMech'"
	 * @generated
	 */
	String getFulfillContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getFulfillContactMechId <em>Fulfill Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfill Contact Mech Id</em>' attribute.
	 * @see #getFulfillContactMechId()
	 * @generated
	 */
	void setFulfillContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Internal Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Comment</em>' attribute.
	 * @see #setInternalComment(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_InternalComment()
	 * @model
	 * @generated
	 */
	String getInternalComment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getInternalComment <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Comment</em>' attribute.
	 * @see #getInternalComment()
	 * @generated
	 */
	void setInternalComment(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_LastModifiedByUserLogin()
	 * @model
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Maximum Amount Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Amount Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Amount Uom Id</em>' attribute.
	 * @see #setMaximumAmountUomId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_MaximumAmountUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getMaximumAmountUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getMaximumAmountUomId <em>Maximum Amount Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Amount Uom Id</em>' attribute.
	 * @see #getMaximumAmountUomId()
	 * @generated
	 */
	void setMaximumAmountUomId(String value);

	/**
	 * Returns the value of the '<em><b>Open Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Date Time</em>' attribute.
	 * @see #setOpenDateTime(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_OpenDateTime()
	 * @model
	 * @generated
	 */
	Date getOpenDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getOpenDateTime <em>Open Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Date Time</em>' attribute.
	 * @see #getOpenDateTime()
	 * @generated
	 */
	void setOpenDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(long)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_Priority()
	 * @model
	 * @generated
	 */
	long getPriority();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(long value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_Reason()
	 * @model
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Response Required Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Required Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Required Date</em>' attribute.
	 * @see #setResponseRequiredDate(Date)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_ResponseRequiredDate()
	 * @model
	 * @generated
	 */
	Date getResponseRequiredDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getResponseRequiredDate <em>Response Required Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Required Date</em>' attribute.
	 * @see #getResponseRequiredDate()
	 * @generated
	 */
	void setResponseRequiredDate(Date value);

	/**
	 * Returns the value of the '<em><b>Sales Channel Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Channel Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel Enum Id</em>' attribute.
	 * @see #setSalesChannelEnumId(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_SalesChannelEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getSalesChannelEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel Enum Id</em>' attribute.
	 * @see #getSalesChannelEnumId()
	 * @generated
	 */
	void setSalesChannelEnumId(String value);

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
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestAttribute'"
	 * @generated
	 */
	List<String> getCustRequestAttributes();

	/**
	 * Returns the value of the '<em><b>Cust Request Comm Events</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Comm Events</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Comm Events</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestCommEvents()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestCommEvent'"
	 * @generated
	 */
	List<String> getCustRequestCommEvents();

	/**
	 * Returns the value of the '<em><b>Cust Request Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Items</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestItems()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestItem'"
	 * @generated
	 */
	List<String> getCustRequestItems();

	/**
	 * Returns the value of the '<em><b>Cust Request Notes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Notes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Notes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestNotes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestNote'"
	 * @generated
	 */
	List<String> getCustRequestNotes();

	/**
	 * Returns the value of the '<em><b>Cust Request Work Efforts</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Work Efforts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Work Efforts</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestWorkEfforts()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestWorkEffort'"
	 * @generated
	 */
	List<String> getCustRequestWorkEfforts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequestStatus' route='custRequestId'"
	 * @generated
	 */
	List<String> custRequestStatuss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteItem' route='custRequestId'"
	 * @generated
	 */
	List<String> quoteItems();

} // CustRequest
