/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.math.BigDecimal;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

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
 * @model
 * @generated
 */
public interface ReturnItemResponse extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Billing Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Account Id</em>' attribute.
	 * @see #setBillingAccountId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_BillingAccountId()
	 * @model annotation="mimo-ent-domain frame='BillingAccount'"
	 * @generated
	 */
	String getBillingAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getBillingAccountId <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Billing Account Id</em>' attribute.
	 * @see #getBillingAccountId()
	 * @generated
	 */
	void setBillingAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Fin Account Trans Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Account Trans Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #setFinAccountTransId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_FinAccountTransId()
	 * @model annotation="mimo-ent-domain frame='FinAccountTrans'"
	 * @generated
	 */
	String getFinAccountTransId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getFinAccountTransId <em>Fin Account Trans Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Account Trans Id</em>' attribute.
	 * @see #getFinAccountTransId()
	 * @generated
	 */
	void setFinAccountTransId(String value);

	/**
	 * Returns the value of the '<em><b>Order Payment Preference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Payment Preference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Payment Preference Id</em>' attribute.
	 * @see #setOrderPaymentPreferenceId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_OrderPaymentPreferenceId()
	 * @model annotation="mimo-ent-domain frame='OrderPaymentPreference'"
	 * @generated
	 */
	String getOrderPaymentPreferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getOrderPaymentPreferenceId <em>Order Payment Preference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Payment Preference Id</em>' attribute.
	 * @see #getOrderPaymentPreferenceId()
	 * @generated
	 */
	void setOrderPaymentPreferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Id</em>' attribute.
	 * @see #setPaymentId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_PaymentId()
	 * @model annotation="mimo-ent-domain frame='Payment'"
	 * @generated
	 */
	String getPaymentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getPaymentId <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Id</em>' attribute.
	 * @see #getPaymentId()
	 * @generated
	 */
	void setPaymentId(String value);

	/**
	 * Returns the value of the '<em><b>Replacement Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement Order Id</em>' attribute.
	 * @see #setReplacementOrderId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemResponse_ReplacementOrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getReplacementOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemResponse#getReplacementOrderId <em>Replacement Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Order Id</em>' attribute.
	 * @see #getReplacementOrderId()
	 * @generated
	 */
	void setReplacementOrderId(String value);

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
	 * @model
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnItem' route='returnItemResponseId'"
	 * @generated
	 */
	List<String> returnItems();

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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
