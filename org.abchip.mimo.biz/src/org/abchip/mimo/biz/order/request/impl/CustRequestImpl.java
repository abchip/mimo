/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.request.CustRequest;
import org.abchip.mimo.biz.order.request.CustRequestCategory;
import org.abchip.mimo.biz.order.request.CustRequestType;
import org.abchip.mimo.biz.order.request.RequestPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestDate <em>Cust Request Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestName <em>Cust Request Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getInternalComment <em>Internal Comment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getOpenDateTime <em>Open Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getResponseRequiredDate <em>Response Required Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestTypeId <em>Cust Request Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestCategoryId <em>Cust Request Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getFromPartyId <em>From Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getMaximumAmountUomId <em>Maximum Amount Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getFulfillContactMechId <em>Fulfill Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestAttributes <em>Cust Request Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestCommEvents <em>Cust Request Comm Events</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestItems <em>Cust Request Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestNotes <em>Cust Request Notes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.impl.CustRequestImpl#getCustRequestWorkEfforts <em>Cust Request Work Efforts</em>}</li>
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
	 * The default value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestId() <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestId()
	 * @generated
	 * @ordered
	 */
	protected String custRequestId = CUST_REQUEST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosedDateTime() <em>Closed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosedDateTime() <em>Closed Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date closedDateTime = CLOSED_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustRequestDate() <em>Cust Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CUST_REQUEST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestDate() <em>Cust Request Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestDate()
	 * @generated
	 * @ordered
	 */
	protected Date custRequestDate = CUST_REQUEST_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustRequestName() <em>Cust Request Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUST_REQUEST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustRequestName() <em>Cust Request Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestName()
	 * @generated
	 * @ordered
	 */
	protected String custRequestName = CUST_REQUEST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalComment() <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComment()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalComment() <em>Internal Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalComment()
	 * @generated
	 * @ordered
	 */
	protected String internalComment = INTERNAL_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenDateTime() <em>Open Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPEN_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenDateTime() <em>Open Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date openDateTime = OPEN_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected long priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseRequiredDate() <em>Response Required Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseRequiredDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESPONSE_REQUIRED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseRequiredDate() <em>Response Required Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseRequiredDate()
	 * @generated
	 * @ordered
	 */
	protected Date responseRequiredDate = RESPONSE_REQUIRED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustRequestTypeId() <em>Cust Request Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestTypeId()
	 * @generated
	 * @ordered
	 */
	protected CustRequestType custRequestTypeId;

	/**
	 * The cached value of the '{@link #getCustRequestCategoryId() <em>Cust Request Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestCategoryId()
	 * @generated
	 * @ordered
	 */
	protected CustRequestCategory custRequestCategoryId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getFromPartyId() <em>From Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party fromPartyId;

	/**
	 * The cached value of the '{@link #getMaximumAmountUomId() <em>Maximum Amount Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAmountUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom maximumAmountUomId;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getSalesChannelEnumId() <em>Sales Channel Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesChannelEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration salesChannelEnumId;

	/**
	 * The cached value of the '{@link #getFulfillContactMechId() <em>Fulfill Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech fulfillContactMechId;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getCustRequestAttributes() <em>Cust Request Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> custRequestAttributes;

	/**
	 * The cached value of the '{@link #getCustRequestCommEvents() <em>Cust Request Comm Events</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestCommEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> custRequestCommEvents;

	/**
	 * The cached value of the '{@link #getCustRequestItems() <em>Cust Request Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> custRequestItems;

	/**
	 * The cached value of the '{@link #getCustRequestNotes() <em>Cust Request Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> custRequestNotes;

	/**
	 * The cached value of the '{@link #getCustRequestWorkEfforts() <em>Cust Request Work Efforts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustRequestWorkEfforts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> custRequestWorkEfforts;

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
		return closedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedDateTime(Date newClosedDateTime) {
		Date oldClosedDateTime = closedDateTime;
		closedDateTime = newClosedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CLOSED_DATE_TIME, oldClosedDateTime, closedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestCategory getCustRequestCategoryId() {
		if (custRequestCategoryId != null && ((EObject)custRequestCategoryId).eIsProxy()) {
			InternalEObject oldCustRequestCategoryId = (InternalEObject)custRequestCategoryId;
			custRequestCategoryId = (CustRequestCategory)eResolveProxy(oldCustRequestCategoryId);
			if (custRequestCategoryId != oldCustRequestCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID, oldCustRequestCategoryId, custRequestCategoryId));
			}
		}
		return custRequestCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustRequestCategory basicGetCustRequestCategoryId() {
		return custRequestCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestCategoryId(CustRequestCategory newCustRequestCategoryId) {
		CustRequestCategory oldCustRequestCategoryId = custRequestCategoryId;
		custRequestCategoryId = newCustRequestCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID, oldCustRequestCategoryId, custRequestCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCustRequestDate() {
		return custRequestDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestDate(Date newCustRequestDate) {
		Date oldCustRequestDate = custRequestDate;
		custRequestDate = newCustRequestDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CUST_REQUEST_DATE, oldCustRequestDate, custRequestDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestId() {
		return custRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestId(String newCustRequestId) {
		String oldCustRequestId = custRequestId;
		custRequestId = newCustRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CUST_REQUEST_ID, oldCustRequestId, custRequestId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustRequestName() {
		return custRequestName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestName(String newCustRequestName) {
		String oldCustRequestName = custRequestName;
		custRequestName = newCustRequestName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CUST_REQUEST_NAME, oldCustRequestName, custRequestName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustRequestType getCustRequestTypeId() {
		if (custRequestTypeId != null && ((EObject)custRequestTypeId).eIsProxy()) {
			InternalEObject oldCustRequestTypeId = (InternalEObject)custRequestTypeId;
			custRequestTypeId = (CustRequestType)eResolveProxy(oldCustRequestTypeId);
			if (custRequestTypeId != oldCustRequestTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__CUST_REQUEST_TYPE_ID, oldCustRequestTypeId, custRequestTypeId));
			}
		}
		return custRequestTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustRequestType basicGetCustRequestTypeId() {
		return custRequestTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustRequestTypeId(CustRequestType newCustRequestTypeId) {
		CustRequestType oldCustRequestTypeId = custRequestTypeId;
		custRequestTypeId = newCustRequestTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__CUST_REQUEST_TYPE_ID, oldCustRequestTypeId, custRequestTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getFromPartyId() {
		if (fromPartyId != null && ((EObject)fromPartyId).eIsProxy()) {
			InternalEObject oldFromPartyId = (InternalEObject)fromPartyId;
			fromPartyId = (Party)eResolveProxy(oldFromPartyId);
			if (fromPartyId != oldFromPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__FROM_PARTY_ID, oldFromPartyId, fromPartyId));
			}
		}
		return fromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetFromPartyId() {
		return fromPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromPartyId(Party newFromPartyId) {
		Party oldFromPartyId = fromPartyId;
		fromPartyId = newFromPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__FROM_PARTY_ID, oldFromPartyId, fromPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getFulfillContactMechId() {
		if (fulfillContactMechId != null && ((EObject)fulfillContactMechId).eIsProxy()) {
			InternalEObject oldFulfillContactMechId = (InternalEObject)fulfillContactMechId;
			fulfillContactMechId = (ContactMech)eResolveProxy(oldFulfillContactMechId);
			if (fulfillContactMechId != oldFulfillContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__FULFILL_CONTACT_MECH_ID, oldFulfillContactMechId, fulfillContactMechId));
			}
		}
		return fulfillContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetFulfillContactMechId() {
		return fulfillContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulfillContactMechId(ContactMech newFulfillContactMechId) {
		ContactMech oldFulfillContactMechId = fulfillContactMechId;
		fulfillContactMechId = newFulfillContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__FULFILL_CONTACT_MECH_ID, oldFulfillContactMechId, fulfillContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalComment() {
		return internalComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalComment(String newInternalComment) {
		String oldInternalComment = internalComment;
		internalComment = newInternalComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__INTERNAL_COMMENT, oldInternalComment, internalComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getMaximumAmountUomId() {
		if (maximumAmountUomId != null && ((EObject)maximumAmountUomId).eIsProxy()) {
			InternalEObject oldMaximumAmountUomId = (InternalEObject)maximumAmountUomId;
			maximumAmountUomId = (Uom)eResolveProxy(oldMaximumAmountUomId);
			if (maximumAmountUomId != oldMaximumAmountUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID, oldMaximumAmountUomId, maximumAmountUomId));
			}
		}
		return maximumAmountUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetMaximumAmountUomId() {
		return maximumAmountUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumAmountUomId(Uom newMaximumAmountUomId) {
		Uom oldMaximumAmountUomId = maximumAmountUomId;
		maximumAmountUomId = newMaximumAmountUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID, oldMaximumAmountUomId, maximumAmountUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpenDateTime() {
		return openDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenDateTime(Date newOpenDateTime) {
		Date oldOpenDateTime = openDateTime;
		openDateTime = newOpenDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__OPEN_DATE_TIME, oldOpenDateTime, openDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(long newPriority) {
		long oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResponseRequiredDate() {
		return responseRequiredDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseRequiredDate(Date newResponseRequiredDate) {
		Date oldResponseRequiredDate = responseRequiredDate;
		responseRequiredDate = newResponseRequiredDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__RESPONSE_REQUIRED_DATE, oldResponseRequiredDate, responseRequiredDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getSalesChannelEnumId() {
		if (salesChannelEnumId != null && ((EObject)salesChannelEnumId).eIsProxy()) {
			InternalEObject oldSalesChannelEnumId = (InternalEObject)salesChannelEnumId;
			salesChannelEnumId = (Enumeration)eResolveProxy(oldSalesChannelEnumId);
			if (salesChannelEnumId != oldSalesChannelEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__SALES_CHANNEL_ENUM_ID, oldSalesChannelEnumId, salesChannelEnumId));
			}
		}
		return salesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetSalesChannelEnumId() {
		return salesChannelEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesChannelEnumId(Enumeration newSalesChannelEnumId) {
		Enumeration oldSalesChannelEnumId = salesChannelEnumId;
		salesChannelEnumId = newSalesChannelEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__SALES_CHANNEL_ENUM_ID, oldSalesChannelEnumId, salesChannelEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RequestPackage.CUST_REQUEST__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequestPackage.CUST_REQUEST__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCustRequestAttributes() {
		if (custRequestAttributes == null) {
			custRequestAttributes = new EDataTypeUniqueEList<String>(String.class, this, RequestPackage.CUST_REQUEST__CUST_REQUEST_ATTRIBUTES);
		}
		return custRequestAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCustRequestCommEvents() {
		if (custRequestCommEvents == null) {
			custRequestCommEvents = new EDataTypeUniqueEList<String>(String.class, this, RequestPackage.CUST_REQUEST__CUST_REQUEST_COMM_EVENTS);
		}
		return custRequestCommEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCustRequestItems() {
		if (custRequestItems == null) {
			custRequestItems = new EDataTypeUniqueEList<String>(String.class, this, RequestPackage.CUST_REQUEST__CUST_REQUEST_ITEMS);
		}
		return custRequestItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCustRequestNotes() {
		if (custRequestNotes == null) {
			custRequestNotes = new EDataTypeUniqueEList<String>(String.class, this, RequestPackage.CUST_REQUEST__CUST_REQUEST_NOTES);
		}
		return custRequestNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCustRequestWorkEfforts() {
		if (custRequestWorkEfforts == null) {
			custRequestWorkEfforts = new EDataTypeUniqueEList<String>(String.class, this, RequestPackage.CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS);
		}
		return custRequestWorkEfforts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> custRequestStatuss() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> quoteItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ID:
				return getCustRequestId();
			case RequestPackage.CUST_REQUEST__CLOSED_DATE_TIME:
				return getClosedDateTime();
			case RequestPackage.CUST_REQUEST__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case RequestPackage.CUST_REQUEST__CREATED_DATE:
				return getCreatedDate();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_DATE:
				return getCustRequestDate();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NAME:
				return getCustRequestName();
			case RequestPackage.CUST_REQUEST__DESCRIPTION:
				return getDescription();
			case RequestPackage.CUST_REQUEST__INTERNAL_COMMENT:
				return getInternalComment();
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case RequestPackage.CUST_REQUEST__OPEN_DATE_TIME:
				return getOpenDateTime();
			case RequestPackage.CUST_REQUEST__PRIORITY:
				return getPriority();
			case RequestPackage.CUST_REQUEST__REASON:
				return getReason();
			case RequestPackage.CUST_REQUEST__RESPONSE_REQUIRED_DATE:
				return getResponseRequiredDate();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_TYPE_ID:
				if (resolve) return getCustRequestTypeId();
				return basicGetCustRequestTypeId();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID:
				if (resolve) return getCustRequestCategoryId();
				return basicGetCustRequestCategoryId();
			case RequestPackage.CUST_REQUEST__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case RequestPackage.CUST_REQUEST__FROM_PARTY_ID:
				if (resolve) return getFromPartyId();
				return basicGetFromPartyId();
			case RequestPackage.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID:
				if (resolve) return getMaximumAmountUomId();
				return basicGetMaximumAmountUomId();
			case RequestPackage.CUST_REQUEST__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case RequestPackage.CUST_REQUEST__SALES_CHANNEL_ENUM_ID:
				if (resolve) return getSalesChannelEnumId();
				return basicGetSalesChannelEnumId();
			case RequestPackage.CUST_REQUEST__FULFILL_CONTACT_MECH_ID:
				if (resolve) return getFulfillContactMechId();
				return basicGetFulfillContactMechId();
			case RequestPackage.CUST_REQUEST__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ATTRIBUTES:
				return getCustRequestAttributes();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_COMM_EVENTS:
				return getCustRequestCommEvents();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ITEMS:
				return getCustRequestItems();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NOTES:
				return getCustRequestNotes();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS:
				return getCustRequestWorkEfforts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ID:
				setCustRequestId((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CLOSED_DATE_TIME:
				setClosedDateTime((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_DATE:
				setCustRequestDate((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NAME:
				setCustRequestName((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST__INTERNAL_COMMENT:
				setInternalComment((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST__OPEN_DATE_TIME:
				setOpenDateTime((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST__PRIORITY:
				setPriority((Long)newValue);
				return;
			case RequestPackage.CUST_REQUEST__REASON:
				setReason((String)newValue);
				return;
			case RequestPackage.CUST_REQUEST__RESPONSE_REQUIRED_DATE:
				setResponseRequiredDate((Date)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_TYPE_ID:
				setCustRequestTypeId((CustRequestType)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID:
				setCustRequestCategoryId((CustRequestCategory)newValue);
				return;
			case RequestPackage.CUST_REQUEST__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case RequestPackage.CUST_REQUEST__FROM_PARTY_ID:
				setFromPartyId((Party)newValue);
				return;
			case RequestPackage.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID:
				setMaximumAmountUomId((Uom)newValue);
				return;
			case RequestPackage.CUST_REQUEST__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case RequestPackage.CUST_REQUEST__SALES_CHANNEL_ENUM_ID:
				setSalesChannelEnumId((Enumeration)newValue);
				return;
			case RequestPackage.CUST_REQUEST__FULFILL_CONTACT_MECH_ID:
				setFulfillContactMechId((ContactMech)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ATTRIBUTES:
				getCustRequestAttributes().clear();
				getCustRequestAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_COMM_EVENTS:
				getCustRequestCommEvents().clear();
				getCustRequestCommEvents().addAll((Collection<? extends String>)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ITEMS:
				getCustRequestItems().clear();
				getCustRequestItems().addAll((Collection<? extends String>)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NOTES:
				getCustRequestNotes().clear();
				getCustRequestNotes().addAll((Collection<? extends String>)newValue);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS:
				getCustRequestWorkEfforts().clear();
				getCustRequestWorkEfforts().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ID:
				setCustRequestId(CUST_REQUEST_ID_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__CLOSED_DATE_TIME:
				setClosedDateTime(CLOSED_DATE_TIME_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_DATE:
				setCustRequestDate(CUST_REQUEST_DATE_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NAME:
				setCustRequestName(CUST_REQUEST_NAME_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__INTERNAL_COMMENT:
				setInternalComment(INTERNAL_COMMENT_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__OPEN_DATE_TIME:
				setOpenDateTime(OPEN_DATE_TIME_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__RESPONSE_REQUIRED_DATE:
				setResponseRequiredDate(RESPONSE_REQUIRED_DATE_EDEFAULT);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_TYPE_ID:
				setCustRequestTypeId((CustRequestType)null);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID:
				setCustRequestCategoryId((CustRequestCategory)null);
				return;
			case RequestPackage.CUST_REQUEST__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case RequestPackage.CUST_REQUEST__FROM_PARTY_ID:
				setFromPartyId((Party)null);
				return;
			case RequestPackage.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID:
				setMaximumAmountUomId((Uom)null);
				return;
			case RequestPackage.CUST_REQUEST__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case RequestPackage.CUST_REQUEST__SALES_CHANNEL_ENUM_ID:
				setSalesChannelEnumId((Enumeration)null);
				return;
			case RequestPackage.CUST_REQUEST__FULFILL_CONTACT_MECH_ID:
				setFulfillContactMechId((ContactMech)null);
				return;
			case RequestPackage.CUST_REQUEST__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ATTRIBUTES:
				getCustRequestAttributes().clear();
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_COMM_EVENTS:
				getCustRequestCommEvents().clear();
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ITEMS:
				getCustRequestItems().clear();
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NOTES:
				getCustRequestNotes().clear();
				return;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS:
				getCustRequestWorkEfforts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ID:
				return CUST_REQUEST_ID_EDEFAULT == null ? custRequestId != null : !CUST_REQUEST_ID_EDEFAULT.equals(custRequestId);
			case RequestPackage.CUST_REQUEST__CLOSED_DATE_TIME:
				return CLOSED_DATE_TIME_EDEFAULT == null ? closedDateTime != null : !CLOSED_DATE_TIME_EDEFAULT.equals(closedDateTime);
			case RequestPackage.CUST_REQUEST__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case RequestPackage.CUST_REQUEST__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_DATE:
				return CUST_REQUEST_DATE_EDEFAULT == null ? custRequestDate != null : !CUST_REQUEST_DATE_EDEFAULT.equals(custRequestDate);
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NAME:
				return CUST_REQUEST_NAME_EDEFAULT == null ? custRequestName != null : !CUST_REQUEST_NAME_EDEFAULT.equals(custRequestName);
			case RequestPackage.CUST_REQUEST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RequestPackage.CUST_REQUEST__INTERNAL_COMMENT:
				return INTERNAL_COMMENT_EDEFAULT == null ? internalComment != null : !INTERNAL_COMMENT_EDEFAULT.equals(internalComment);
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case RequestPackage.CUST_REQUEST__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case RequestPackage.CUST_REQUEST__OPEN_DATE_TIME:
				return OPEN_DATE_TIME_EDEFAULT == null ? openDateTime != null : !OPEN_DATE_TIME_EDEFAULT.equals(openDateTime);
			case RequestPackage.CUST_REQUEST__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case RequestPackage.CUST_REQUEST__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case RequestPackage.CUST_REQUEST__RESPONSE_REQUIRED_DATE:
				return RESPONSE_REQUIRED_DATE_EDEFAULT == null ? responseRequiredDate != null : !RESPONSE_REQUIRED_DATE_EDEFAULT.equals(responseRequiredDate);
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_TYPE_ID:
				return custRequestTypeId != null;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_CATEGORY_ID:
				return custRequestCategoryId != null;
			case RequestPackage.CUST_REQUEST__STATUS_ID:
				return statusId != null;
			case RequestPackage.CUST_REQUEST__FROM_PARTY_ID:
				return fromPartyId != null;
			case RequestPackage.CUST_REQUEST__MAXIMUM_AMOUNT_UOM_ID:
				return maximumAmountUomId != null;
			case RequestPackage.CUST_REQUEST__PRODUCT_STORE_ID:
				return productStoreId != null;
			case RequestPackage.CUST_REQUEST__SALES_CHANNEL_ENUM_ID:
				return salesChannelEnumId != null;
			case RequestPackage.CUST_REQUEST__FULFILL_CONTACT_MECH_ID:
				return fulfillContactMechId != null;
			case RequestPackage.CUST_REQUEST__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ATTRIBUTES:
				return custRequestAttributes != null && !custRequestAttributes.isEmpty();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_COMM_EVENTS:
				return custRequestCommEvents != null && !custRequestCommEvents.isEmpty();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_ITEMS:
				return custRequestItems != null && !custRequestItems.isEmpty();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_NOTES:
				return custRequestNotes != null && !custRequestNotes.isEmpty();
			case RequestPackage.CUST_REQUEST__CUST_REQUEST_WORK_EFFORTS:
				return custRequestWorkEfforts != null && !custRequestWorkEfforts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (custRequestId: ");
		result.append(custRequestId);
		result.append(", closedDateTime: ");
		result.append(closedDateTime);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", custRequestDate: ");
		result.append(custRequestDate);
		result.append(", custRequestName: ");
		result.append(custRequestName);
		result.append(", description: ");
		result.append(description);
		result.append(", internalComment: ");
		result.append(internalComment);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", openDateTime: ");
		result.append(openDateTime);
		result.append(", priority: ");
		result.append(priority);
		result.append(", reason: ");
		result.append(reason);
		result.append(", responseRequiredDate: ");
		result.append(responseRequiredDate);
		result.append(", custRequestAttributes: ");
		result.append(custRequestAttributes);
		result.append(", custRequestCommEvents: ");
		result.append(custRequestCommEvents);
		result.append(", custRequestItems: ");
		result.append(custRequestItems);
		result.append(", custRequestNotes: ");
		result.append(custRequestNotes);
		result.append(", custRequestWorkEfforts: ");
		result.append(custRequestWorkEfforts);
		result.append(')');
		return result.toString();
	}

} //CustRequestImpl
