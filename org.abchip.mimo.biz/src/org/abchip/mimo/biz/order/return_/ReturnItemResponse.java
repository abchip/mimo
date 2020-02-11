/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.math.BigDecimal;

import java.util.Date;
import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTrans;
import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.order.order.OrderPaymentPreference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReturnItemResponseId <em>Return Item Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getFinAccountTransId <em>Fin Account Trans Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReplacementOrderId <em>Replacement Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseAmount <em>Response Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseDate <em>Response Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse()
 * @model annotation="mimo-ent-frame help='Records what was done with a return: whether a replacement order, a payment, or a billing account credit was issued' title='The Return Item Response'"
 * @generated
 */
public interface ReturnItemResponse extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' reference.
	 * @see #setBillingAccountId(BillingAccount)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_BillingAccountId()
	 * @model keys="billingAccountId"
	 * @generated
	 */
	BillingAccount getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getBillingAccountId <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' reference.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(BillingAccount value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Id</em>' reference.
	 * @see #setFinAccountTransId(FinAccountTrans)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_FinAccountTransId()
	 * @model keys="finAccountTransId"
	 * @generated
	 */
	FinAccountTrans getFinAccountTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getFinAccountTransId <em>Fin Account Trans Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Id</em>' reference.
	 * @see #getFinAccountTransId()
	 * @generated
	 */
	void setFinAccountTransId(FinAccountTrans value);

	/**
	 * Returns the value of the '<em><b>Order Payment Preference Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Payment Preference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Payment Preference Id</em>' reference.
	 * @see #setOrderPaymentPreferenceId(OrderPaymentPreference)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_OrderPaymentPreferenceId()
	 * @model keys="orderPaymentPreferenceId"
	 * @generated
	 */
	OrderPaymentPreference getOrderPaymentPreferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Payment Preference Id</em>' reference.
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 */
	void setOrderPaymentPreferenceId(OrderPaymentPreference value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' reference.
	 * @see #setPaymentId(Payment)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_PaymentId()
	 * @model keys="paymentId"
	 * @generated
	 */
	Payment getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getPaymentId <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' reference.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(Payment value);

	/**
	 * Returns the value of the '<em><b>Replacement Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Order Id</em>' reference.
	 * @see #setReplacementOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_ReplacementOrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getReplacementOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReplacementOrderId <em>Replacement Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Order Id</em>' reference.
	 * @see #getReplacementOrderId()
	 * @generated
	 */
	void setReplacementOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Response Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Amount</em>' attribute.
	 * @see #setResponseAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_ResponseAmount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getResponseAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseAmount <em>Response Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Amount</em>' attribute.
	 * @see #getResponseAmount()
	 * @generated
	 */
	void setResponseAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Response Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Date</em>' attribute.
	 * @see #setResponseDate(Date)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_ResponseDate()
	 * @model
	 * @generated
	 */
	Date getResponseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getResponseDate <em>Response Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Date</em>' attribute.
	 * @see #getResponseDate()
	 * @generated
	 */
	void setResponseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Return Item Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Response Id</em>' attribute.
	 * @see #setReturnItemResponseId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_ReturnItemResponseId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReturnItemResponseId <em>Return Item Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Response Id</em>' attribute.
	 * @see #getReturnItemResponseId()
	 * @generated
	 */
	void setReturnItemResponseId(String value);

} // ReturnItemResponse
