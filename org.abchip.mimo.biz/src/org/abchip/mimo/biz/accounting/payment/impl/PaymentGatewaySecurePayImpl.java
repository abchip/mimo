/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Secure Pay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl#isEnableAmountRound <em>Enable Amount Round</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl#getProcessTimeout <em>Process Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySecurePayImpl#getServerURL <em>Server URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewaySecurePayImpl extends BizEntityImpl implements PaymentGatewaySecurePay {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewaySecurePayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableAmountRound() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAmountRound(boolean newEnableAmountRound) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND, newEnableAmountRound);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID, newMerchantId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProcessTimeout() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessTimeout(long newProcessTimeout) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT, newProcessTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPwd() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__PWD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPwd(String newPwd) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__PWD, newPwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerURL() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerURL(String newServerURL) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL, newServerURL);
	}

} //PaymentGatewaySecurePayImpl
