/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway Secure Pay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#isEnableAmountRound <em>Enable Amount Round</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getProcessTimeout <em>Process Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getServerURL <em>Server URL</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySecurePay()
 * @model
 * @generated
 */
public interface PaymentGatewaySecurePay extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Id</em>' attribute.
	 * @see #setMerchantId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySecurePay_MerchantId()
	 * @model
	 * @generated
	 */
	String getMerchantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getMerchantId <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Id</em>' attribute.
	 * @see #getMerchantId()
	 * @generated
	 */
	void setMerchantId(String value);

	/**
	 * Returns the value of the '<em><b>Payment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Gateway Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #setPaymentGatewayConfigId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySecurePay_PaymentGatewayConfigId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayConfig'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Enable Amount Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Amount Round</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Amount Round</em>' attribute.
	 * @see #setEnableAmountRound(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySecurePay_EnableAmountRound()
	 * @model
	 * @generated
	 */
	boolean isEnableAmountRound();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#isEnableAmountRound <em>Enable Amount Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Amount Round</em>' attribute.
	 * @see #isEnableAmountRound()
	 * @generated
	 */
	void setEnableAmountRound(boolean value);

	/**
	 * Returns the value of the '<em><b>Process Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Timeout</em>' attribute.
	 * @see #setProcessTimeout(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySecurePay_ProcessTimeout()
	 * @model
	 * @generated
	 */
	long getProcessTimeout();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getProcessTimeout <em>Process Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Timeout</em>' attribute.
	 * @see #getProcessTimeout()
	 * @generated
	 */
	void setProcessTimeout(long value);

	/**
	 * Returns the value of the '<em><b>Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwd</em>' attribute.
	 * @see #setPwd(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySecurePay_Pwd()
	 * @model
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

	/**
	 * Returns the value of the '<em><b>Server URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server URL</em>' attribute.
	 * @see #setServerURL(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySecurePay_ServerURL()
	 * @model
	 * @generated
	 */
	String getServerURL();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay#getServerURL <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server URL</em>' attribute.
	 * @see #getServerURL()
	 * @generated
	 */
	void setServerURL(String value);

} // PaymentGatewaySecurePay
