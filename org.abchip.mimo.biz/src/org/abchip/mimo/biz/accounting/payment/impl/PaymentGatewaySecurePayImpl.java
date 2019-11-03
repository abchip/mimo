/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewaySecurePay;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGatewayConfigId = PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnableAmountRound() <em>Enable Amount Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAmountRound()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_AMOUNT_ROUND_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnableAmountRound() <em>Enable Amount Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableAmountRound()
	 * @generated
	 * @ordered
	 */
	protected boolean enableAmountRound = ENABLE_AMOUNT_ROUND_EDEFAULT;
	/**
	 * The default value of the '{@link #getMerchantId() <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantId()
	 * @generated
	 * @ordered
	 */
	protected static final String MERCHANT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMerchantId() <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantId()
	 * @generated
	 * @ordered
	 */
	protected String merchantId = MERCHANT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProcessTimeout() <em>Process Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final long PROCESS_TIMEOUT_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getProcessTimeout() <em>Process Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessTimeout()
	 * @generated
	 * @ordered
	 */
	protected long processTimeout = PROCESS_TIMEOUT_EDEFAULT;
	/**
	 * The default value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String PWD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPwd() <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwd()
	 * @generated
	 * @ordered
	 */
	protected String pwd = PWD_EDEFAULT;
	/**
	 * The default value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getServerURL() <em>Server URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerURL()
	 * @generated
	 * @ordered
	 */
	protected String serverURL = SERVER_URL_EDEFAULT;

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
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		String oldMerchantId = merchantId;
		merchantId = newMerchantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID, oldMerchantId, merchantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		String oldPaymentGatewayConfigId = paymentGatewayConfigId;
		paymentGatewayConfigId = newPaymentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableAmountRound() {
		return enableAmountRound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableAmountRound(boolean newEnableAmountRound) {
		boolean oldEnableAmountRound = enableAmountRound;
		enableAmountRound = newEnableAmountRound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND, oldEnableAmountRound, enableAmountRound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProcessTimeout() {
		return processTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessTimeout(long newProcessTimeout) {
		long oldProcessTimeout = processTimeout;
		processTimeout = newProcessTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT, oldProcessTimeout, processTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPwd() {
		return pwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPwd(String newPwd) {
		String oldPwd = pwd;
		pwd = newPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PWD, oldPwd, pwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerURL() {
		return serverURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerURL(String newServerURL) {
		String oldServerURL = serverURL;
		serverURL = newServerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL, oldServerURL, serverURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				return getPaymentGatewayConfigId();
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND:
				return isEnableAmountRound();
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID:
				return getMerchantId();
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT:
				return getProcessTimeout();
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PWD:
				return getPwd();
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL:
				return getServerURL();
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
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND:
				setEnableAmountRound((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID:
				setMerchantId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT:
				setProcessTimeout((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PWD:
				setPwd((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL:
				setServerURL((String)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId(PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND:
				setEnableAmountRound(ENABLE_AMOUNT_ROUND_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID:
				setMerchantId(MERCHANT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT:
				setProcessTimeout(PROCESS_TIMEOUT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PWD:
				setPwd(PWD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL:
				setServerURL(SERVER_URL_EDEFAULT);
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
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
				return PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT == null ? paymentGatewayConfigId != null : !PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT.equals(paymentGatewayConfigId);
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__ENABLE_AMOUNT_ROUND:
				return enableAmountRound != ENABLE_AMOUNT_ROUND_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__MERCHANT_ID:
				return MERCHANT_ID_EDEFAULT == null ? merchantId != null : !MERCHANT_ID_EDEFAULT.equals(merchantId);
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PROCESS_TIMEOUT:
				return processTimeout != PROCESS_TIMEOUT_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__PWD:
				return PWD_EDEFAULT == null ? pwd != null : !PWD_EDEFAULT.equals(pwd);
			case PaymentPackage.PAYMENT_GATEWAY_SECURE_PAY__SERVER_URL:
				return SERVER_URL_EDEFAULT == null ? serverURL != null : !SERVER_URL_EDEFAULT.equals(serverURL);
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
		result.append(" (paymentGatewayConfigId: ");
		result.append(paymentGatewayConfigId);
		result.append(", enableAmountRound: ");
		result.append(enableAmountRound);
		result.append(", merchantId: ");
		result.append(merchantId);
		result.append(", processTimeout: ");
		result.append(processTimeout);
		result.append(", pwd: ");
		result.append(pwd);
		result.append(", serverURL: ");
		result.append(serverURL);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewaySecurePayImpl
