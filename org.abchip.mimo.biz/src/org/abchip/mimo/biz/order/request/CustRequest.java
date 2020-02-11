/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStore;

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
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestAttributes <em>Cust Request Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCategoryId <em>Cust Request Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCommEvents <em>Cust Request Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestDate <em>Cust Request Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestItems <em>Cust Request Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestName <em>Cust Request Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestNotes <em>Cust Request Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestWorkEfforts <em>Cust Request Work Efforts</em>}</li>
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
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest()
 * @model annotation="mimo-ent-frame title='Customer Request' formula='description'"
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
	 * @model annotation="mimo-ent-slot help='Used when the customer service person, or anyone assigned to handle the incoming request, closes it as resolution.\n          In some customer response systems, the openDateTime and closedDateTime can happen more than once as the customer is not satified with the resolution.'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='When it is actually stored in the system.'"
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
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' reference.
	 * @see #setCurrencyUomId(Uom)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CurrencyUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCurrencyUomId <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' reference.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Cust Request Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.order.request.CustRequestAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestAttribute> getCustRequestAttributes();

	/**
	 * Returns the value of the '<em><b>Cust Request Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Category Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Category Id</em>' reference.
	 * @see #setCustRequestCategoryId(CustRequestCategory)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestCategoryId()
	 * @model keys="custRequestCategoryId"
	 * @generated
	 */
	CustRequestCategory getCustRequestCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestCategoryId <em>Cust Request Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Category Id</em>' reference.
	 * @see #getCustRequestCategoryId()
	 * @generated
	 */
	void setCustRequestCategoryId(CustRequestCategory value);

	/**
	 * Returns the value of the '<em><b>Cust Request Comm Events</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.order.request.CustRequestCommEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Comm Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Comm Events</em>' reference list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestCommEvents()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestCommEvent> getCustRequestCommEvents();

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
	 * @model annotation="mimo-ent-slot help='When the customer (or whoever) submitted the request, maybe out of OFBiz : comming by mail, email, etc.'"
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
	 * Returns the value of the '<em><b>Cust Request Items</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.order.request.CustRequestItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Items</em>' reference list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestItems()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestItem> getCustRequestItems();

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-format type='name' length='100'"
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
	 * Returns the value of the '<em><b>Cust Request Notes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.order.request.CustRequestNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Notes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Notes</em>' reference list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestNotes()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestNote> getCustRequestNotes();

	/**
	 * Returns the value of the '<em><b>Cust Request Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Type Id</em>' reference.
	 * @see #setCustRequestTypeId(CustRequestType)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestTypeId()
	 * @model keys="custRequestTypeId"
	 * @generated
	 */
	CustRequestType getCustRequestTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getCustRequestTypeId <em>Cust Request Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Type Id</em>' reference.
	 * @see #getCustRequestTypeId()
	 * @generated
	 */
	void setCustRequestTypeId(CustRequestType value);

	/**
	 * Returns the value of the '<em><b>Cust Request Work Efforts</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.order.request.CustRequestWorkEffort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Work Efforts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Work Efforts</em>' reference list.
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_CustRequestWorkEfforts()
	 * @model derived="true"
	 * @generated
	 */
	List<CustRequestWorkEffort> getCustRequestWorkEfforts();

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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * Returns the value of the '<em><b>From Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Party Id</em>' reference.
	 * @see #setFromPartyId(Party)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_FromPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getFromPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getFromPartyId <em>From Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Party Id</em>' reference.
	 * @see #getFromPartyId()
	 * @generated
	 */
	void setFromPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Fulfill Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfill Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfill Contact Mech Id</em>' reference.
	 * @see #setFulfillContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_FulfillContactMechId()
	 * @model keys="contactMechId"
	 *        annotation="mimo-ent-slot help='Field to support a location of a cust request--ie, product literature sent to an address, service call at a localtion, etc.'"
	 * @generated
	 */
	ContactMech getFulfillContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getFulfillContactMechId <em>Fulfill Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfill Contact Mech Id</em>' reference.
	 * @see #getFulfillContactMechId()
	 * @generated
	 */
	void setFulfillContactMechId(ContactMech value);

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
	 * @model annotation="mimo-ent-format type='comment' length='255'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='Last modified date can be till the closedDateTime which is when the customer service people, or anyone assigned to handle the incoming request, says it is resolved.\n          This gives when the last action was done to see if the steps to resolve the request are happening in a timely manner.'"
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
	 * Returns the value of the '<em><b>Maximum Amount Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Amount Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Amount Uom Id</em>' reference.
	 * @see #setMaximumAmountUomId(Uom)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_MaximumAmountUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getMaximumAmountUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getMaximumAmountUomId <em>Maximum Amount Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Amount Uom Id</em>' reference.
	 * @see #getMaximumAmountUomId()
	 * @generated
	 */
	void setMaximumAmountUomId(Uom value);

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
	 * @model annotation="mimo-ent-slot help='Used when the customer service person, or anyone assigned to handle the incoming request, opens it for action.\n          You  cantake the customer requestdate and openDateTime to see the efficiency of the customer service people.'"
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
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
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
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_ProductStoreId()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * @model annotation="mimo-ent-slot help='responseRequiredDate is the time the customer needs a response.'"
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
	 * Returns the value of the '<em><b>Sales Channel Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Channel Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Channel Enum Id</em>' reference.
	 * @see #setSalesChannelEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_SalesChannelEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getSalesChannelEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Channel Enum Id</em>' reference.
	 * @see #getSalesChannelEnumId()
	 * @generated
	 */
	void setSalesChannelEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequest_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequest#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

} // CustRequest
