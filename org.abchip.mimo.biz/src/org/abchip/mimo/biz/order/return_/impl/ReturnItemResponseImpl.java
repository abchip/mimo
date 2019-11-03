/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.return_.ReturnItemResponse;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Item Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getReturnItemResponseId <em>Return Item Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getReplacementOrderId <em>Replacement Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getResponseAmount <em>Response Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnItemResponseImpl#getResponseDate <em>Response Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnItemResponseImpl extends BizEntityImpl implements ReturnItemResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnItemResponseId() <em>Return Item Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemResponseId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_RESPONSE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemResponseId() <em>Return Item Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemResponseId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemResponseId = RETURN_ITEM_RESPONSE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected String billingAccountId = BILLING_ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinAccountTransId() <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIN_ACCOUNT_TRANS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinAccountTransId() <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTransId()
	 * @generated
	 * @ordered
	 */
	protected String finAccountTransId = FIN_ACCOUNT_TRANS_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected String paymentId = PAYMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementOrderId() <em>Replacement Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACEMENT_ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplacementOrderId() <em>Replacement Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementOrderId()
	 * @generated
	 * @ordered
	 */
	protected String replacementOrderId = REPLACEMENT_ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseAmount() <em>Response Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESPONSE_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseAmount() <em>Response Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal responseAmount = RESPONSE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseDate() <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESPONSE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseDate() <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDate()
	 * @generated
	 * @ordered
	 */
	protected Date responseDate = RESPONSE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnItemResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ITEM_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(String newBillingAccountId) {
		String oldBillingAccountId = billingAccountId;
		billingAccountId = newBillingAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFinAccountTransId() {
		return finAccountTransId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTransId(String newFinAccountTransId) {
		String oldFinAccountTransId = finAccountTransId;
		finAccountTransId = newFinAccountTransId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID, oldFinAccountTransId, finAccountTransId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID, oldOrderPaymentPreferenceId, orderPaymentPreferenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		String oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReplacementOrderId() {
		return replacementOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplacementOrderId(String newReplacementOrderId) {
		String oldReplacementOrderId = replacementOrderId;
		replacementOrderId = newReplacementOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID, oldReplacementOrderId, replacementOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getResponseAmount() {
		return responseAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseAmount(BigDecimal newResponseAmount) {
		BigDecimal oldResponseAmount = responseAmount;
		responseAmount = newResponseAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT, oldResponseAmount, responseAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResponseDate() {
		return responseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseDate(Date newResponseDate) {
		Date oldResponseDate = responseDate;
		responseDate = newResponseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_DATE, oldResponseDate, responseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnItems() {
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
	public String getReturnItemResponseId() {
		return returnItemResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemResponseId(String newReturnItemResponseId) {
		String oldReturnItemResponseId = returnItemResponseId;
		returnItemResponseId = newReturnItemResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID, oldReturnItemResponseId, returnItemResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID:
				return getReturnItemResponseId();
			case ReturnPackage.RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID:
				return getBillingAccountId();
			case ReturnPackage.RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID:
				return getFinAccountTransId();
			case ReturnPackage.RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				return getOrderPaymentPreferenceId();
			case ReturnPackage.RETURN_ITEM_RESPONSE__PAYMENT_ID:
				return getPaymentId();
			case ReturnPackage.RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID:
				return getReplacementOrderId();
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT:
				return getResponseAmount();
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_DATE:
				return getResponseDate();
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
			case ReturnPackage.RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID:
				setReturnItemResponseId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID:
				setBillingAccountId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__PAYMENT_ID:
				setPaymentId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID:
				setReplacementOrderId((String)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT:
				setResponseAmount((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_DATE:
				setResponseDate((Date)newValue);
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
			case ReturnPackage.RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID:
				setReturnItemResponseId(RETURN_ITEM_RESPONSE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID:
				setBillingAccountId(BILLING_ACCOUNT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID:
				setFinAccountTransId(FIN_ACCOUNT_TRANS_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				setOrderPaymentPreferenceId(ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID:
				setReplacementOrderId(REPLACEMENT_ORDER_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT:
				setResponseAmount(RESPONSE_AMOUNT_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_DATE:
				setResponseDate(RESPONSE_DATE_EDEFAULT);
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
			case ReturnPackage.RETURN_ITEM_RESPONSE__RETURN_ITEM_RESPONSE_ID:
				return RETURN_ITEM_RESPONSE_ID_EDEFAULT == null ? returnItemResponseId != null : !RETURN_ITEM_RESPONSE_ID_EDEFAULT.equals(returnItemResponseId);
			case ReturnPackage.RETURN_ITEM_RESPONSE__BILLING_ACCOUNT_ID:
				return BILLING_ACCOUNT_ID_EDEFAULT == null ? billingAccountId != null : !BILLING_ACCOUNT_ID_EDEFAULT.equals(billingAccountId);
			case ReturnPackage.RETURN_ITEM_RESPONSE__FIN_ACCOUNT_TRANS_ID:
				return FIN_ACCOUNT_TRANS_ID_EDEFAULT == null ? finAccountTransId != null : !FIN_ACCOUNT_TRANS_ID_EDEFAULT.equals(finAccountTransId);
			case ReturnPackage.RETURN_ITEM_RESPONSE__ORDER_PAYMENT_PREFERENCE_ID:
				return ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT == null ? orderPaymentPreferenceId != null : !ORDER_PAYMENT_PREFERENCE_ID_EDEFAULT.equals(orderPaymentPreferenceId);
			case ReturnPackage.RETURN_ITEM_RESPONSE__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
			case ReturnPackage.RETURN_ITEM_RESPONSE__REPLACEMENT_ORDER_ID:
				return REPLACEMENT_ORDER_ID_EDEFAULT == null ? replacementOrderId != null : !REPLACEMENT_ORDER_ID_EDEFAULT.equals(replacementOrderId);
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_AMOUNT:
				return RESPONSE_AMOUNT_EDEFAULT == null ? responseAmount != null : !RESPONSE_AMOUNT_EDEFAULT.equals(responseAmount);
			case ReturnPackage.RETURN_ITEM_RESPONSE__RESPONSE_DATE:
				return RESPONSE_DATE_EDEFAULT == null ? responseDate != null : !RESPONSE_DATE_EDEFAULT.equals(responseDate);
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
		result.append(" (returnItemResponseId: ");
		result.append(returnItemResponseId);
		result.append(", billingAccountId: ");
		result.append(billingAccountId);
		result.append(", finAccountTransId: ");
		result.append(finAccountTransId);
		result.append(", orderPaymentPreferenceId: ");
		result.append(orderPaymentPreferenceId);
		result.append(", paymentId: ");
		result.append(paymentId);
		result.append(", replacementOrderId: ");
		result.append(replacementOrderId);
		result.append(", responseAmount: ");
		result.append(responseAmount);
		result.append(", responseDate: ");
		result.append(responseDate);
		result.append(')');
		return result.toString();
	}

} //ReturnItemResponseImpl
