/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Authorize Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getCertificateAlias <em>Certificate Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getCpDeviceType <em>Cp Device Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getCpMarketType <em>Cp Market Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getCpVersion <em>Cp Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getDelimitedData <em>Delimited Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getDelimiterChar <em>Delimiter Char</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getDuplicateWindow <em>Duplicate Window</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getEmailCustomer <em>Email Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getEmailMerchant <em>Email Merchant</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getRelayResponse <em>Relay Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getTestMode <em>Test Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getTranKey <em>Tran Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getTransDescription <em>Trans Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getTransactionUrl <em>Transaction Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayAuthorizeNetImpl extends BizEntityImpl implements PaymentGatewayAuthorizeNet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String API_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getApiVersion() <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApiVersion()
	 * @generated
	 * @ordered
	 */
	protected String apiVersion = API_VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getCertificateAlias() <em>Certificate Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_ALIAS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCertificateAlias() <em>Certificate Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateAlias()
	 * @generated
	 * @ordered
	 */
	protected String certificateAlias = CERTIFICATE_ALIAS_EDEFAULT;
	/**
	 * The default value of the '{@link #getCpDeviceType() <em>Cp Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_DEVICE_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCpDeviceType() <em>Cp Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpDeviceType()
	 * @generated
	 * @ordered
	 */
	protected String cpDeviceType = CP_DEVICE_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCpMarketType() <em>Cp Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpMarketType()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_MARKET_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCpMarketType() <em>Cp Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpMarketType()
	 * @generated
	 * @ordered
	 */
	protected String cpMarketType = CP_MARKET_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCpVersion() <em>Cp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCpVersion() <em>Cp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpVersion()
	 * @generated
	 * @ordered
	 */
	protected String cpVersion = CP_VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getDelimitedData() <em>Delimited Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimitedData()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITED_DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDelimitedData() <em>Delimited Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimitedData()
	 * @generated
	 * @ordered
	 */
	protected String delimitedData = DELIMITED_DATA_EDEFAULT;
	/**
	 * The default value of the '{@link #getDelimiterChar() <em>Delimiter Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterChar()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMITER_CHAR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDelimiterChar() <em>Delimiter Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiterChar()
	 * @generated
	 * @ordered
	 */
	protected String delimiterChar = DELIMITER_CHAR_EDEFAULT;
	/**
	 * The default value of the '{@link #getDuplicateWindow() <em>Duplicate Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicateWindow()
	 * @generated
	 * @ordered
	 */
	protected static final long DUPLICATE_WINDOW_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getDuplicateWindow() <em>Duplicate Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuplicateWindow()
	 * @generated
	 * @ordered
	 */
	protected long duplicateWindow = DUPLICATE_WINDOW_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmailCustomer() <em>Email Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_CUSTOMER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmailCustomer() <em>Email Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailCustomer()
	 * @generated
	 * @ordered
	 */
	protected String emailCustomer = EMAIL_CUSTOMER_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmailMerchant() <em>Email Merchant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMerchant()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_MERCHANT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmailMerchant() <em>Email Merchant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailMerchant()
	 * @generated
	 * @ordered
	 */
	protected String emailMerchant = EMAIL_MERCHANT_EDEFAULT;
	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;
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
	 * The default value of the '{@link #getRelayResponse() <em>Relay Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelayResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String RELAY_RESPONSE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRelayResponse() <em>Relay Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelayResponse()
	 * @generated
	 * @ordered
	 */
	protected String relayResponse = RELAY_RESPONSE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTestMode() <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMode()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_MODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTestMode() <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMode()
	 * @generated
	 * @ordered
	 */
	protected String testMode = TEST_MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTranKey() <em>Tran Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranKey()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAN_KEY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTranKey() <em>Tran Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranKey()
	 * @generated
	 * @ordered
	 */
	protected String tranKey = TRAN_KEY_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransDescription() <em>Trans Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANS_DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransDescription() <em>Trans Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransDescription()
	 * @generated
	 * @ordered
	 */
	protected String transDescription = TRANS_DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransactionUrl() <em>Transaction Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSACTION_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransactionUrl() <em>Transaction Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionUrl()
	 * @generated
	 * @ordered
	 */
	protected String transactionUrl = TRANSACTION_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGatewayConfig paymentGatewayConfigId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayAuthorizeNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiVersion(String newApiVersion) {
		String oldApiVersion = apiVersion;
		apiVersion = newApiVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION, oldApiVersion, apiVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateAlias() {
		return certificateAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateAlias(String newCertificateAlias) {
		String oldCertificateAlias = certificateAlias;
		certificateAlias = newCertificateAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS, oldCertificateAlias, certificateAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpDeviceType() {
		return cpDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpDeviceType(String newCpDeviceType) {
		String oldCpDeviceType = cpDeviceType;
		cpDeviceType = newCpDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE, oldCpDeviceType, cpDeviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpMarketType() {
		return cpMarketType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpMarketType(String newCpMarketType) {
		String oldCpMarketType = cpMarketType;
		cpMarketType = newCpMarketType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE, oldCpMarketType, cpMarketType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpVersion() {
		return cpVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpVersion(String newCpVersion) {
		String oldCpVersion = cpVersion;
		cpVersion = newCpVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION, oldCpVersion, cpVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimitedData() {
		return delimitedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimitedData(String newDelimitedData) {
		String oldDelimitedData = delimitedData;
		delimitedData = newDelimitedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA, oldDelimitedData, delimitedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimiterChar() {
		return delimiterChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiterChar(String newDelimiterChar) {
		String oldDelimiterChar = delimiterChar;
		delimiterChar = newDelimiterChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR, oldDelimiterChar, delimiterChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDuplicateWindow() {
		return duplicateWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuplicateWindow(long newDuplicateWindow) {
		long oldDuplicateWindow = duplicateWindow;
		duplicateWindow = newDuplicateWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW, oldDuplicateWindow, duplicateWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailCustomer() {
		return emailCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailCustomer(String newEmailCustomer) {
		String oldEmailCustomer = emailCustomer;
		emailCustomer = newEmailCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER, oldEmailCustomer, emailCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailMerchant() {
		return emailMerchant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailMerchant(String newEmailMerchant) {
		String oldEmailMerchant = emailMerchant;
		emailMerchant = newEmailMerchant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT, oldEmailMerchant, emailMerchant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfig getPaymentGatewayConfigId() {
		if (paymentGatewayConfigId != null && ((EObject)paymentGatewayConfigId).eIsProxy()) {
			InternalEObject oldPaymentGatewayConfigId = (InternalEObject)paymentGatewayConfigId;
			paymentGatewayConfigId = (PaymentGatewayConfig)eResolveProxy(oldPaymentGatewayConfigId);
			if (paymentGatewayConfigId != oldPaymentGatewayConfigId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
			}
		}
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGatewayConfig basicGetPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(PaymentGatewayConfig newPaymentGatewayConfigId) {
		PaymentGatewayConfig oldPaymentGatewayConfigId = paymentGatewayConfigId;
		paymentGatewayConfigId = newPaymentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PWD, oldPwd, pwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelayResponse() {
		return relayResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelayResponse(String newRelayResponse) {
		String oldRelayResponse = relayResponse;
		relayResponse = newRelayResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE, oldRelayResponse, relayResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestMode() {
		return testMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestMode(String newTestMode) {
		String oldTestMode = testMode;
		testMode = newTestMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE, oldTestMode, testMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTranKey() {
		return tranKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranKey(String newTranKey) {
		String oldTranKey = tranKey;
		tranKey = newTranKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY, oldTranKey, tranKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransDescription() {
		return transDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransDescription(String newTransDescription) {
		String oldTransDescription = transDescription;
		transDescription = newTransDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION, oldTransDescription, transDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionUrl() {
		return transactionUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionUrl(String newTransactionUrl) {
		String oldTransactionUrl = transactionUrl;
		transactionUrl = newTransactionUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL, oldTransactionUrl, transactionUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION:
				return getApiVersion();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS:
				return getCertificateAlias();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE:
				return getCpDeviceType();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE:
				return getCpMarketType();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION:
				return getCpVersion();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA:
				return getDelimitedData();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR:
				return getDelimiterChar();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW:
				return getDuplicateWindow();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER:
				return getEmailCustomer();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT:
				return getEmailMerchant();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD:
				return getMethod();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PWD:
				return getPwd();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE:
				return getRelayResponse();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE:
				return getTestMode();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY:
				return getTranKey();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION:
				return getTransDescription();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL:
				return getTransactionUrl();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID:
				return getUserId();
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID:
				if (resolve) return getPaymentGatewayConfigId();
				return basicGetPaymentGatewayConfigId();
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
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION:
				setApiVersion((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS:
				setCertificateAlias((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE:
				setCpDeviceType((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE:
				setCpMarketType((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION:
				setCpVersion((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA:
				setDelimitedData((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR:
				setDelimiterChar((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW:
				setDuplicateWindow((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER:
				setEmailCustomer((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT:
				setEmailMerchant((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD:
				setMethod((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PWD:
				setPwd((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE:
				setRelayResponse((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE:
				setTestMode((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY:
				setTranKey((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION:
				setTransDescription((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL:
				setTransactionUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID:
				setUserId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS:
				setCertificateAlias(CERTIFICATE_ALIAS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE:
				setCpDeviceType(CP_DEVICE_TYPE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE:
				setCpMarketType(CP_MARKET_TYPE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION:
				setCpVersion(CP_VERSION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA:
				setDelimitedData(DELIMITED_DATA_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR:
				setDelimiterChar(DELIMITER_CHAR_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW:
				setDuplicateWindow(DUPLICATE_WINDOW_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER:
				setEmailCustomer(EMAIL_CUSTOMER_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT:
				setEmailMerchant(EMAIL_MERCHANT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PWD:
				setPwd(PWD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE:
				setRelayResponse(RELAY_RESPONSE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE:
				setTestMode(TEST_MODE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY:
				setTranKey(TRAN_KEY_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION:
				setTransDescription(TRANS_DESCRIPTION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL:
				setTransactionUrl(TRANSACTION_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((PaymentGatewayConfig)null);
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
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION:
				return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS:
				return CERTIFICATE_ALIAS_EDEFAULT == null ? certificateAlias != null : !CERTIFICATE_ALIAS_EDEFAULT.equals(certificateAlias);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE:
				return CP_DEVICE_TYPE_EDEFAULT == null ? cpDeviceType != null : !CP_DEVICE_TYPE_EDEFAULT.equals(cpDeviceType);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE:
				return CP_MARKET_TYPE_EDEFAULT == null ? cpMarketType != null : !CP_MARKET_TYPE_EDEFAULT.equals(cpMarketType);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION:
				return CP_VERSION_EDEFAULT == null ? cpVersion != null : !CP_VERSION_EDEFAULT.equals(cpVersion);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA:
				return DELIMITED_DATA_EDEFAULT == null ? delimitedData != null : !DELIMITED_DATA_EDEFAULT.equals(delimitedData);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR:
				return DELIMITER_CHAR_EDEFAULT == null ? delimiterChar != null : !DELIMITER_CHAR_EDEFAULT.equals(delimiterChar);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW:
				return duplicateWindow != DUPLICATE_WINDOW_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER:
				return EMAIL_CUSTOMER_EDEFAULT == null ? emailCustomer != null : !EMAIL_CUSTOMER_EDEFAULT.equals(emailCustomer);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT:
				return EMAIL_MERCHANT_EDEFAULT == null ? emailMerchant != null : !EMAIL_MERCHANT_EDEFAULT.equals(emailMerchant);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PWD:
				return PWD_EDEFAULT == null ? pwd != null : !PWD_EDEFAULT.equals(pwd);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE:
				return RELAY_RESPONSE_EDEFAULT == null ? relayResponse != null : !RELAY_RESPONSE_EDEFAULT.equals(relayResponse);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE:
				return TEST_MODE_EDEFAULT == null ? testMode != null : !TEST_MODE_EDEFAULT.equals(testMode);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY:
				return TRAN_KEY_EDEFAULT == null ? tranKey != null : !TRAN_KEY_EDEFAULT.equals(tranKey);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION:
				return TRANS_DESCRIPTION_EDEFAULT == null ? transDescription != null : !TRANS_DESCRIPTION_EDEFAULT.equals(transDescription);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL:
				return TRANSACTION_URL_EDEFAULT == null ? transactionUrl != null : !TRANSACTION_URL_EDEFAULT.equals(transactionUrl);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case PaymentPackage.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID:
				return paymentGatewayConfigId != null;
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
		result.append(" (apiVersion: ");
		result.append(apiVersion);
		result.append(", certificateAlias: ");
		result.append(certificateAlias);
		result.append(", cpDeviceType: ");
		result.append(cpDeviceType);
		result.append(", cpMarketType: ");
		result.append(cpMarketType);
		result.append(", cpVersion: ");
		result.append(cpVersion);
		result.append(", delimitedData: ");
		result.append(delimitedData);
		result.append(", delimiterChar: ");
		result.append(delimiterChar);
		result.append(", duplicateWindow: ");
		result.append(duplicateWindow);
		result.append(", emailCustomer: ");
		result.append(emailCustomer);
		result.append(", emailMerchant: ");
		result.append(emailMerchant);
		result.append(", method: ");
		result.append(method);
		result.append(", pwd: ");
		result.append(pwd);
		result.append(", relayResponse: ");
		result.append(relayResponse);
		result.append(", testMode: ");
		result.append(testMode);
		result.append(", tranKey: ");
		result.append(tranKey);
		result.append(", transDescription: ");
		result.append(transDescription);
		result.append(", transactionUrl: ");
		result.append(transactionUrl);
		result.append(", userId: ");
		result.append(userId);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayAuthorizeNetImpl
