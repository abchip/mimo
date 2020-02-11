/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Date;
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
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingPostalCode(String newBillingPostalCode) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__BILLING_POSTAL_CODE, newBillingPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccount getFinAccountId() {
		return (FinAccount)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__FIN_ACCOUNT_ID, newFinAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManualAuthCode() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualAuthCode(String newManualAuthCode) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_AUTH_CODE, newManualAuthCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManualRefNum() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualRefNum(String newManualRefNum) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MANUAL_REF_NUM, newManualRefNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxAmount() {
		return (BigDecimal)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxAmount(BigDecimal newMaxAmount) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__MAX_AMOUNT, newMaxAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNeedsNsfRetry() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeedsNsfRetry(boolean newNeedsNsfRetry) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__NEEDS_NSF_RETRY, newNeedsNsfRetry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOverflowFlag() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverflowFlag(boolean newOverflowFlag) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__OVERFLOW_FLAG, newOverflowFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderPaymentPreferenceId() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPaymentPreferenceId(String newOrderPaymentPreferenceId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__ORDER_PAYMENT_PREFERENCE_ID, newOrderPaymentPreferenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaymentMethodId() {
		return (PaymentMethod)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(PaymentMethod newPaymentMethodId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_ID, newPaymentMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		return (PaymentMethodType)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PAYMENT_METHOD_TYPE_ID, newPaymentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPresentFlag() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentFlag(boolean newPresentFlag) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRESENT_FLAG, newPresentFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProcessAttempt() {
		return (Long)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessAttempt(long newProcessAttempt) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PROCESS_ATTEMPT, newProcessAttempt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductPricePurpose getProductPricePurposeId() {
		return (ProductPricePurpose)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPricePurposeId(ProductPricePurpose newProductPricePurposeId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__PRODUCT_PRICE_PURPOSE_ID, newProductPricePurposeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityCode() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityCode(String newSecurityCode) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SECURITY_CODE, newSecurityCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SHIP_GROUP_SEQ_ID, newShipGroupSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSwipedFlag() {
		return (Boolean)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwipedFlag(boolean newSwipedFlag) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__SWIPED_FLAG, newSwipedFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrack2() {
		return (String)eGet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__TRACK2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrack2(String newTrack2) {
		eSet(OrderPackage.Literals.ORDER_PAYMENT_PREFERENCE__TRACK2, newTrack2);
	}

} //OrderPaymentPreferenceImpl
