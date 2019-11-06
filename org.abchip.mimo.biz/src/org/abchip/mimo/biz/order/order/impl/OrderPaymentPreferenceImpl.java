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

import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;
import org.abchip.mimo.biz.product.price.ProductPricePurpose;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getManualAuthCode <em>Manual Auth Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getManualRefNum <em>Manual Ref Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getMaxAmount <em>Max Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isNeedsNsfRetry <em>Needs Nsf Retry</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isOverflowFlag <em>Overflow Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isPresentFlag <em>Present Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getProcessAttempt <em>Process Attempt</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getSecurityCode <em>Security Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#isSwipedFlag <em>Swiped Flag</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getTrack2 <em>Track2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderPaymentPreferenceImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
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
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;

	/**
	 * The cached value of the '{@link #getProductPricePurposeId() <em>Product Price Purpose Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPricePurposeId()
	 * @generated
	 * @ordered
	 */
	protected ProductPricePurpose productPricePurposeId;

	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethodType paymentMethodTypeId;

	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paymentMethodId;

	/**
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected FinAccount finAccountId;

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
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLogin;

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
		billingPostalCode = newBillingPostalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		if (createdByUserLogin != null && ((EObject)createdByUserLogin).eIsProxy()) {
			InternalEObject oldCreatedByUserLogin = (InternalEObject)createdByUserLogin;
			createdByUserLogin = (UserLogin)eResolveProxy(oldCreatedByUserLogin);
			if (createdByUserLogin != oldCreatedByUserLogin) {
			}
		}
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		createdByUserLogin = newCreatedByUserLogin;
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
		createdDate = newCreatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccountId() {
		if (finAccountId != null && ((EObject)finAccountId).eIsProxy()) {
			InternalEObject oldFinAccountId = (InternalEObject)finAccountId;
			finAccountId = (FinAccount)eResolveProxy(oldFinAccountId);
			if (finAccountId != oldFinAccountId) {
			}
		}
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccount basicGetFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		finAccountId = newFinAccountId;
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
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
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
		lastModifiedDate = newLastModifiedDate;
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
		manualAuthCode = newManualAuthCode;
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
		manualRefNum = newManualRefNum;
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
		maxAmount = newMaxAmount;
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
		needsNsfRetry = newNeedsNsfRetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		orderId = newOrderId;
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
		orderItemSeqId = newOrderItemSeqId;
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
		overflowFlag = newOverflowFlag;
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
		orderPaymentPreferenceId = newOrderPaymentPreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethodId() {
		if (paymentMethodId != null && ((EObject)paymentMethodId).eIsProxy()) {
			InternalEObject oldPaymentMethodId = (InternalEObject)paymentMethodId;
			paymentMethodId = (PaymentMethod)eResolveProxy(oldPaymentMethodId);
			if (paymentMethodId != oldPaymentMethodId) {
			}
		}
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethod basicGetPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(PaymentMethod newPaymentMethodId) {
		paymentMethodId = newPaymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		if (paymentMethodTypeId != null && ((EObject)paymentMethodTypeId).eIsProxy()) {
			InternalEObject oldPaymentMethodTypeId = (InternalEObject)paymentMethodTypeId;
			paymentMethodTypeId = (PaymentMethodType)eResolveProxy(oldPaymentMethodTypeId);
			if (paymentMethodTypeId != oldPaymentMethodTypeId) {
			}
		}
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethodType basicGetPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		paymentMethodTypeId = newPaymentMethodTypeId;
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
		presentFlag = newPresentFlag;
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
		processAttempt = newProcessAttempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPricePurpose getProductPricePurposeId() {
		if (productPricePurposeId != null && ((EObject)productPricePurposeId).eIsProxy()) {
			InternalEObject oldProductPricePurposeId = (InternalEObject)productPricePurposeId;
			productPricePurposeId = (ProductPricePurpose)eResolveProxy(oldProductPricePurposeId);
			if (productPricePurposeId != oldProductPricePurposeId) {
			}
		}
		return productPricePurposeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPricePurpose basicGetProductPricePurposeId() {
		return productPricePurposeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPricePurposeId(ProductPricePurpose newProductPricePurposeId) {
		productPricePurposeId = newProductPricePurposeId;
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
		securityCode = newSecurityCode;
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
		shipGroupSeqId = newShipGroupSeqId;
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
		statusId = newStatusId;
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
		swipedFlag = newSwipedFlag;
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
		track2 = newTrack2;
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				return getCreatedDate();
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				return isOverflowFlag();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				return isPresentFlag();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				return getProcessAttempt();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				return getSecurityCode();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				return isSwipedFlag();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				return getTrack2();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				if (resolve) return getProductPricePurposeId();
				return basicGetProductPricePurposeId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				if (resolve) return getPaymentMethodTypeId();
				return basicGetPaymentMethodTypeId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				if (resolve) return getPaymentMethodId();
				return basicGetPaymentMethodId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				if (resolve) return getFinAccountId();
				return basicGetFinAccountId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				setCreatedDate((Date)newValue);
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				setOverflowFlag((Boolean)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				setPresentFlag((Boolean)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				setProcessAttempt((Long)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				setSecurityCode((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				setSwipedFlag((Boolean)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				setTrack2((String)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId((ProductPricePurpose)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				setOverflowFlag(OVERFLOW_FLAG_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				setPresentFlag(PRESENT_FLAG_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				setProcessAttempt(PROCESS_ATTEMPT_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				setSecurityCode(SECURITY_CODE_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				setSwipedFlag(SWIPED_FLAG_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				setTrack2(TRACK2_EDEFAULT);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				setProductPricePurposeId((ProductPricePurpose)null);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)null);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				setPaymentMethodId((PaymentMethod)null);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)null);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
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
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG:
				return overflowFlag != OVERFLOW_FLAG_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG:
				return presentFlag != PRESENT_FLAG_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT:
				return processAttempt != PROCESS_ATTEMPT_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE:
				return SECURITY_CODE_EDEFAULT == null ? securityCode != null : !SECURITY_CODE_EDEFAULT.equals(securityCode);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG:
				return swipedFlag != SWIPED_FLAG_EDEFAULT;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__TRACK2:
				return TRACK2_EDEFAULT == null ? track2 != null : !TRACK2_EDEFAULT.equals(track2);
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__ORDER_ID:
				return orderId != null;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID:
				return productPricePurposeId != null;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID:
				return paymentMethodId != null;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID:
				return finAccountId != null;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__STATUS_ID:
				return statusId != null;
			case OrderPackage.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
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
		result.append(", createdDate: ");
		result.append(createdDate);
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
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", overflowFlag: ");
		result.append(overflowFlag);
		result.append(", presentFlag: ");
		result.append(presentFlag);
		result.append(", processAttempt: ");
		result.append(processAttempt);
		result.append(", securityCode: ");
		result.append(securityCode);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", swipedFlag: ");
		result.append(swipedFlag);
		result.append(", track2: ");
		result.append(track2);
		result.append(')');
		return result.toString();
	}

} //OrderPaymentPreferenceImpl
