/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.request.CustRequest;
import org.abchip.mimo.biz.order.request.CustRequestAttribute;
import org.abchip.mimo.biz.order.request.CustRequestCategory;
import org.abchip.mimo.biz.order.request.CustRequestCommEvent;
import org.abchip.mimo.biz.order.request.CustRequestItem;
import org.abchip.mimo.biz.order.request.CustRequestNote;
import org.abchip.mimo.biz.order.request.CustRequestType;
import org.abchip.mimo.biz.order.request.CustRequestWorkEffort;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cust Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getClosedDateTime <em>Closed Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestAttributes <em>Cust Request Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestCategoryId <em>Cust Request Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestCommEvents <em>Cust Request Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestDate <em>Cust Request Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestItems <em>Cust Request Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestName <em>Cust Request Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestNotes <em>Cust Request Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestWorkEfforts <em>Cust Request Work Efforts</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getFromPartyId <em>From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getFulfillContactMechId <em>Fulfill Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getInternalComment <em>Internal Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getMaximumAmountUomId <em>Maximum Amount Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getOpenDateTime <em>Open Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getResponseRequiredDate <em>Response Required Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustRequestImpl extends BizEntityTypedImpl<CustRequestType> implements CustRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestPackage.Literals.CUST_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getClosedDateTime() {
		return (Date)eGet(RequestPackage.Literals.CUST_REQUEST__CLOSED_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedDateTime(Date newClosedDateTime) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CLOSED_DATE_TIME, newClosedDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(RequestPackage.Literals.CUST_REQUEST__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(RequestPackage.Literals.CUST_REQUEST__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CustRequestAttribute> getCustRequestAttributes() {
		return (List<CustRequestAttribute>)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestCategory getCustRequestCategoryId() {
		return (CustRequestCategory)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestCategoryId(CustRequestCategory newCustRequestCategoryId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID, newCustRequestCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CustRequestCommEvent> getCustRequestCommEvents() {
		return (List<CustRequestCommEvent>)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_COMM_EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCustRequestDate() {
		return (Date)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestDate(Date newCustRequestDate) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_DATE, newCustRequestDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CustRequestItem> getCustRequestItems() {
		return (List<CustRequestItem>)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestId() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(String newCustRequestId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_ID, newCustRequestId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestName() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestName(String newCustRequestName) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_NAME, newCustRequestName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CustRequestNote> getCustRequestNotes() {
		return (List<CustRequestNote>)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestType getCustRequestTypeId() {
		return (CustRequestType)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestTypeId(CustRequestType newCustRequestTypeId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_TYPE_ID, newCustRequestTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CustRequestWorkEffort> getCustRequestWorkEfforts() {
		return (List<CustRequestWorkEffort>)eGet(RequestPackage.Literals.CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(RequestPackage.Literals.CUST_REQUEST__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getFromPartyId() {
		return (Party)eGet(RequestPackage.Literals.CUST_REQUEST__FROM_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromPartyId(Party newFromPartyId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__FROM_PARTY_ID, newFromPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getFulfillContactMechId() {
		return (ContactMech)eGet(RequestPackage.Literals.CUST_REQUEST__FULFILL_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulfillContactMechId(ContactMech newFulfillContactMechId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__FULFILL_CONTACT_MECH_ID, newFulfillContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalComment() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST__INTERNAL_COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalComment(String newInternalComment) {
		eSet(RequestPackage.Literals.CUST_REQUEST__INTERNAL_COMMENT, newInternalComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(RequestPackage.Literals.CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(RequestPackage.Literals.CUST_REQUEST__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(RequestPackage.Literals.CUST_REQUEST__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMaximumAmountUomId() {
		return (Uom)eGet(RequestPackage.Literals.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumAmountUomId(Uom newMaximumAmountUomId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID, newMaximumAmountUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpenDateTime() {
		return (Date)eGet(RequestPackage.Literals.CUST_REQUEST__OPEN_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenDateTime(Date newOpenDateTime) {
		eSet(RequestPackage.Literals.CUST_REQUEST__OPEN_DATE_TIME, newOpenDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPriority() {
		return (Long)eGet(RequestPackage.Literals.CUST_REQUEST__PRIORITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(long newPriority) {
		eSet(RequestPackage.Literals.CUST_REQUEST__PRIORITY, newPriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(RequestPackage.Literals.CUST_REQUEST__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReason() {
		return (String)eGet(RequestPackage.Literals.CUST_REQUEST__REASON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(String newReason) {
		eSet(RequestPackage.Literals.CUST_REQUEST__REASON, newReason);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResponseRequiredDate() {
		return (Date)eGet(RequestPackage.Literals.CUST_REQUEST__RESPONSE_REQUIRED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseRequiredDate(Date newResponseRequiredDate) {
		eSet(RequestPackage.Literals.CUST_REQUEST__RESPONSE_REQUIRED_DATE, newResponseRequiredDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getSalesChannelEnumId() {
		return (Enumeration)eGet(RequestPackage.Literals.CUST_REQUEST__SALES_CHANNEL_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesChannelEnumId(Enumeration newSalesChannelEnumId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__SALES_CHANNEL_ENUM_ID, newSalesChannelEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(RequestPackage.Literals.CUST_REQUEST__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(RequestPackage.Literals.CUST_REQUEST__STATUS_ID, newStatusId);
	}

} //CustRequestImpl
