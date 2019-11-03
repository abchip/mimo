/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Payment Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getBillingPostalCode <em>Billing Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getManualAuthCode <em>Manual Auth Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getManualRefNum <em>Manual Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getMaxAmount <em>Max Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isNeedsNsfRetry <em>Needs Nsf Retry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isOverflowFlag <em>Overflow Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isPresentFlag <em>Present Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getProcessAttempt <em>Process Attempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getSecurityCode <em>Security Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isSwipedFlag <em>Swiped Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getTrack2 <em>Track2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderPaymentPreferenceImpl extends BizEntityImpl implements OrderPaymentPreference {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderPaymentPreferenceId() <em>Order Payment Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderPaymentPreferenceId() <em>Order Payment Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 * @ordered
	 */
	protected String orderPaymentPreferenceId = ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingPostalCode() <em>Billing Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingPostalCode() <em>Billing Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String billingPostalCode = BILLING_POSTAL_CODE_EDEFAULT;

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
	 * The default value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountId = FIN_ACCOUNT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getManualAuthCode() <em>Manual Auth Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualAuthCode()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUAL_AUTH_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManualAuthCode() <em>Manual Auth Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualAuthCode()
	 * @generated
	 * @ordered
	 */
	protected String manualAuthCode = MANUAL_AUTH_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getManualRefNum() <em>Manual Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualRefNum()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUAL_REF_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManualRefNum() <em>Manual Ref Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualRefNum()
	 * @generated
	 * @ordered
	 */
	protected String manualRefNum = MANUAL_REF_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAmount() <em>Max Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MAX_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAmount() <em>Max Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maxAmount = MAX_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsNsfRetry() <em>Needs Nsf Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsNsfRetry()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_NSF_RETRY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsNsfRetry() <em>Needs Nsf Retry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsNsfRetry()
	 * @generated
	 * @ordered
	 */
	protected boolean needsNsfRetry = NEEDS_NSF_RETRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isOverflowFlag() <em>Overflow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverflowFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERFLOW_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverflowFlag() <em>Overflow Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverflowFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean overflowFlag = OVERFLOW_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodId = PAYMENT_METHOD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodTypeId = PAYMENT_METHOD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isPresentFlag() <em>Present Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresentFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESENT_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPresentFlag() <em>Present Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresentFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean presentFlag = PRESENT_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessAttempt() <em>Process Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessAttempt()
	 * @generated
	 * @ordered
	 */
	protected static final long PROCESS_ATTEMPT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getProcessAttempt() <em>Process Attempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessAttempt()
	 * @generated
	 * @ordered
	 */
	protected long processAttempt = PROCESS_ATTEMPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPricePurposeId() <em>Product Price Purpose Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPricePurposeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PRICE_PURPOSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPricePurposeId() <em>Product Price Purpose Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPricePurposeId()
	 * @generated
	 * @ordered
	 */
	protected String productPricePurposeId = PRODUCT_PRICE_PURPOSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityCode() <em>Security Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityCode() <em>Security Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityCode()
	 * @generated
	 * @ordered
	 */
	protected String securityCode = SECURITY_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipGroupSeqId = SHIP_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSwipedFlag() <em>Swiped Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwipedFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SWIPED_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSwipedFlag() <em>Swiped Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSwipedFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean swipedFlag = SWIPED_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrack2() <em>Track2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrack2()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACK2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrack2() <em>Track2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrack2()
	 * @generated
	 * @ordered
	 */
	protected String track2 = TRACK2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderPaymentPreferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingPostalCode() {
		return billingPostalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingPostalCode(String newBillingPostalCode) {
		String oldBillingPostalCode = billingPostalCode;
		billingPostalCode = newBillingPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE, oldBillingPostalCode, billingPostalCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(String newFinAccountId) {
		String oldFinAccountId = finAccountId;
		finAccountId = newFinAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID, oldFinAccountId, finAccountId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManualAuthCode() {
		return manualAuthCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualAuthCode(String newManualAuthCode) {
		String oldManualAuthCode = manualAuthCode;
		manualAuthCode = newManualAuthCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE, oldManualAuthCode, manualAuthCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManualRefNum() {
		return manualRefNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualRefNum(String newManualRefNum) {
		String oldManualRefNum = manualRefNum;
		manualRefNum = newManualRefNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM, oldManualRefNum, manualRefNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxAmount() {
		return maxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAmount(BigDecimal newMaxAmount) {
		BigDecimal oldMaxAmount = maxAmount;
		maxAmount = newMaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT, oldMaxAmount, maxAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNeedsNsfRetry() {
		return needsNsfRetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsNsfRetry(boolean newNeedsNsfRetry) {
		boolean oldNeedsNsfRetry = needsNsfRetry;
		needsNsfRetry = newNeedsNsfRetry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY, oldNeedsNsfRetry, needsNsfRetry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOverflowFlag() {
		return overflowFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverflowFlag(boolean newOverflowFlag) {
		boolean oldOverflowFlag = overflowFlag;
		overflowFlag = newOverflowFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG, oldOverflowFlag, overflowFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderPaymentPreferenceId() {
		return orderPaymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPaymentPreferenceId(String newOrderPaymentPreferenceId) {
		String oldOrderPaymentPreferenceId = orderPaymentPreferenceId;
		orderPaymentPreferenceId = newOrderPaymentPreferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID, oldOrderPaymentPreferenceId, orderPaymentPreferenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(String newPaymentMethodId) {
		String oldPaymentMethodId = paymentMethodId;
		paymentMethodId = newPaymentMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID, oldPaymentMethodId, paymentMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(String newPaymentMethodTypeId) {
		String oldPaymentMethodTypeId = paymentMethodTypeId;
		paymentMethodTypeId = newPaymentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID, oldPaymentMethodTypeId, paymentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPresentFlag() {
		return presentFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentFlag(boolean newPresentFlag) {
		boolean oldPresentFlag = presentFlag;
		presentFlag = newPresentFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG, oldPresentFlag, presentFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProcessAttempt() {
		return processAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessAttempt(long newProcessAttempt) {
		long oldProcessAttempt = processAttempt;
		processAttempt = newProcessAttempt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT, oldProcessAttempt, processAttempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPricePurposeId() {
		return productPricePurposeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPricePurposeId(String newProductPricePurposeId) {
		String oldProductPricePurposeId = productPricePurposeId;
		productPricePurposeId = newProductPricePurposeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID, oldProductPricePurposeId, productPricePurposeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityCode(String newSecurityCode) {
		String oldSecurityCode = securityCode;
		securityCode = newSecurityCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE, oldSecurityCode, securityCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return shipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		String oldShipGroupSeqId = shipGroupSeqId;
		shipGroupSeqId = newShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSwipedFlag() {
		return swipedFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwipedFlag(boolean newSwipedFlag) {
		boolean oldSwipedFlag = swipedFlag;
		swipedFlag = newSwipedFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG, oldSwipedFlag, swipedFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrack2() {
		return track2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrack2(String newTrack2) {
		String oldTrack2 = track2;
		track2 = newTrack2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2, oldTrack2, track2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderStatuss() {
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
	public List<String> paymentGatewayResponses() {
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
	public List<String> payments() {
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
	public List<String> returnItemResponses() {
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID:
				return getOrderPaymentPreferenceId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE:
				return getBillingPostalCode();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				return getCreatedDate();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				return getFinAccountId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE:
				return getManualAuthCode();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM:
				return getManualRefNum();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT:
				return getMaxAmount();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY:
				return isNeedsNsfRetry();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				return getOrderId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				return isOverflowFlag();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				return getPaymentMethodId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				return getPaymentMethodTypeId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				return isPresentFlag();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				return getProcessAttempt();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				return getProductPricePurposeId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				return getSecurityCode();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				return getStatusId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				return isSwipedFlag();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				return getTrack2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE:
				setBillingPostalCode((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				setFinAccountId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE:
				setManualAuthCode((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM:
				setManualRefNum((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT:
				setMaxAmount((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY:
				setNeedsNsfRetry((Boolean)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				setOverflowFlag((Boolean)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				setPaymentMethodId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				setPresentFlag((Boolean)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				setProcessAttempt((Long)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				setSecurityCode((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				setSwipedFlag((Boolean)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				setTrack2((String)newValue);
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId(ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE:
				setBillingPostalCode(BILLING_POSTAL_CODE_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				setFinAccountId(FIN_ACCOUNT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE:
				setManualAuthCode(MANUAL_AUTH_CODE_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM:
				setManualRefNum(MANUAL_REF_NUM_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT:
				setMaxAmount(MAX_AMOUNT_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY:
				setNeedsNsfRetry(NEEDS_NSF_RETRY_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				setOverflowFlag(OVERFLOW_FLAG_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				setPaymentMethodId(PAYMENT_METHOD_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId(PAYMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				setPresentFlag(PRESENT_FLAG_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				setProcessAttempt(PROCESS_ATTEMPT_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId(PRODUCT_PRICE_PURPOSE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				setSecurityCode(SECURITY_CODE_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				setSwipedFlag(SWIPED_FLAG_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				setTrack2(TRACK2_EDEFAULT);
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID:
				return ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT == null ? orderPaymentPreferenceId != null : !ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT.equals(orderPaymentPreferenceId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE:
				return BILLING_POSTAL_CODE_EDEFAULT == null ? billingPostalCode != null : !BILLING_POSTAL_CODE_EDEFAULT.equals(billingPostalCode);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				return FIN_ACCOUNT_ID_EDEFAULT == null ? finAccountId != null : !FIN_ACCOUNT_ID_EDEFAULT.equals(finAccountId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE:
				return MANUAL_AUTH_CODE_EDEFAULT == null ? manualAuthCode != null : !MANUAL_AUTH_CODE_EDEFAULT.equals(manualAuthCode);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM:
				return MANUAL_REF_NUM_EDEFAULT == null ? manualRefNum != null : !MANUAL_REF_NUM_EDEFAULT.equals(manualRefNum);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT:
				return MAX_AMOUNT_EDEFAULT == null ? maxAmount != null : !MAX_AMOUNT_EDEFAULT.equals(maxAmount);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY:
				return needsNsfRetry != NEEDS_NSF_RETRY_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				return overflowFlag != OVERFLOW_FLAG_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				return PAYMENT_METHOD_ID_EDEFAULT == null ? paymentMethodId != null : !PAYMENT_METHOD_ID_EDEFAULT.equals(paymentMethodId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				return PAYMENT_METHOD_TYPE_ID_EDEFAULT == null ? paymentMethodTypeId != null : !PAYMENT_METHOD_TYPE_ID_EDEFAULT.equals(paymentMethodTypeId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				return presentFlag != PRESENT_FLAG_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				return processAttempt != PROCESS_ATTEMPT_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				return PRODUCT_PRICE_PURPOSE_ID_EDEFAULT == null ? productPricePurposeId != null : !PRODUCT_PRICE_PURPOSE_ID_EDEFAULT.equals(productPricePurposeId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				return SECURITY_CODE_EDEFAULT == null ? securityCode != null : !SECURITY_CODE_EDEFAULT.equals(securityCode);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				return swipedFlag != SWIPED_FLAG_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				return TRACK2_EDEFAULT == null ? track2 != null : !TRACK2_EDEFAULT.equals(track2);
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
		result.append(" (orderPaymentPreferenceId: ");
		result.append(orderPaymentPreferenceId);
		result.append(", billingPostalCode: ");
		result.append(billingPostalCode);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", finAccountId: ");
		result.append(finAccountId);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", manualAuthCode: ");
		result.append(manualAuthCode);
		result.append(", manualRefNum: ");
		result.append(manualRefNum);
		result.append(", maxAmount: ");
		result.append(maxAmount);
		result.append(", needsNsfRetry: ");
		result.append(needsNsfRetry);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", overflowFlag: ");
		result.append(overflowFlag);
		result.append(", paymentMethodId: ");
		result.append(paymentMethodId);
		result.append(", paymentMethodTypeId: ");
		result.append(paymentMethodTypeId);
		result.append(", presentFlag: ");
		result.append(presentFlag);
		result.append(", processAttempt: ");
		result.append(processAttempt);
		result.append(", productPricePurposeId: ");
		result.append(productPricePurposeId);
		result.append(", securityCode: ");
		result.append(securityCode);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", swipedFlag: ");
		result.append(swipedFlag);
		result.append(", track2: ");
		result.append(track2);
		result.append(')');
		return result.toString();
	}

} //OrderPaymentPreferenceImpl
