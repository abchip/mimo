/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Payflow Pro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getCancelReturnUrl <em>Cancel Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getCertsPath <em>Certs Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#isCheckAvs <em>Check Avs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#isCheckCvv2 <em>Check Cvv2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getEnableTransmit <em>Enable Transmit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getHostAddress <em>Host Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getLogFileName <em>Log File Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getMaxLogFileSize <em>Max Log File Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#isPreAuth <em>Pre Auth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyAddress <em>Proxy Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyLogon <em>Proxy Logon</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyPassword <em>Proxy Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getProxyPort <em>Proxy Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#isStackTraceOn <em>Stack Trace On</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayflowProImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayPayflowProImpl extends BizEntityImpl implements PaymentGatewayPayflowPro {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getCancelReturnUrl() <em>Cancel Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_RETURN_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCancelReturnUrl() <em>Cancel Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected String cancelReturnUrl = CANCEL_RETURN_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getCertsPath() <em>Certs Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertsPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTS_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCertsPath() <em>Certs Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertsPath()
	 * @generated
	 * @ordered
	 */
	protected String certsPath = CERTS_PATH_EDEFAULT;
	/**
	 * The default value of the '{@link #isCheckAvs() <em>Check Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckAvs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_AVS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCheckAvs() <em>Check Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckAvs()
	 * @generated
	 * @ordered
	 */
	protected boolean checkAvs = CHECK_AVS_EDEFAULT;
	/**
	 * The default value of the '{@link #isCheckCvv2() <em>Check Cvv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckCvv2()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_CVV2_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCheckCvv2() <em>Check Cvv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckCvv2()
	 * @generated
	 * @ordered
	 */
	protected boolean checkCvv2 = CHECK_CVV2_EDEFAULT;
	/**
	 * The default value of the '{@link #getEnableTransmit() <em>Enable Transmit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableTransmit()
	 * @generated
	 * @ordered
	 */
	protected static final String ENABLE_TRANSMIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEnableTransmit() <em>Enable Transmit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableTransmit()
	 * @generated
	 * @ordered
	 */
	protected String enableTransmit = ENABLE_TRANSMIT_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostAddress() <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_ADDRESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHostAddress() <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostAddress()
	 * @generated
	 * @ordered
	 */
	protected String hostAddress = HOST_ADDRESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final long HOST_PORT_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getHostPort() <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostPort()
	 * @generated
	 * @ordered
	 */
	protected long hostPort = HOST_PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getLogFileName() <em>Log File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_FILE_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLogFileName() <em>Log File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileName()
	 * @generated
	 * @ordered
	 */
	protected String logFileName = LOG_FILE_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected static final long LOGGING_LEVEL_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLoggingLevel() <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggingLevel()
	 * @generated
	 * @ordered
	 */
	protected long loggingLevel = LOGGING_LEVEL_EDEFAULT;
	/**
	 * The default value of the '{@link #getMaxLogFileSize() <em>Max Log File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLogFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_LOG_FILE_SIZE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getMaxLogFileSize() <em>Max Log File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLogFileSize()
	 * @generated
	 * @ordered
	 */
	protected long maxLogFileSize = MAX_LOG_FILE_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartner() <em>Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTNER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected String partner = PARTNER_EDEFAULT;
	/**
	 * The default value of the '{@link #isPreAuth() <em>Pre Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreAuth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRE_AUTH_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPreAuth() <em>Pre Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreAuth()
	 * @generated
	 * @ordered
	 */
	protected boolean preAuth = PRE_AUTH_EDEFAULT;
	/**
	 * The default value of the '{@link #getProxyAddress() <em>Proxy Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_ADDRESS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProxyAddress() <em>Proxy Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyAddress()
	 * @generated
	 * @ordered
	 */
	protected String proxyAddress = PROXY_ADDRESS_EDEFAULT;
	/**
	 * The default value of the '{@link #getProxyLogon() <em>Proxy Logon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyLogon()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_LOGON_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProxyLogon() <em>Proxy Logon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyLogon()
	 * @generated
	 * @ordered
	 */
	protected String proxyLogon = PROXY_LOGON_EDEFAULT;
	/**
	 * The default value of the '{@link #getProxyPassword() <em>Proxy Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProxyPassword() <em>Proxy Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPassword()
	 * @generated
	 * @ordered
	 */
	protected String proxyPassword = PROXY_PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getProxyPort() <em>Proxy Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPort()
	 * @generated
	 * @ordered
	 */
	protected static final long PROXY_PORT_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getProxyPort() <em>Proxy Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPort()
	 * @generated
	 * @ordered
	 */
	protected long proxyPort = PROXY_PORT_EDEFAULT;
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
	 * The default value of the '{@link #getRedirectUrl() <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REDIRECT_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRedirectUrl() <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectUrl()
	 * @generated
	 * @ordered
	 */
	protected String redirectUrl = REDIRECT_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getReturnUrl() <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReturnUrl() <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnUrl()
	 * @generated
	 * @ordered
	 */
	protected String returnUrl = RETURN_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #isStackTraceOn() <em>Stack Trace On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStackTraceOn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STACK_TRACE_ON_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStackTraceOn() <em>Stack Trace On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStackTraceOn()
	 * @generated
	 * @ordered
	 */
	protected boolean stackTraceOn = STACK_TRACE_ON_EDEFAULT;
	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final long TIMEOUT_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected long timeout = TIMEOUT_EDEFAULT;
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
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;
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
	protected PaymentGatewayPayflowProImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_PAYFLOW_PRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCancelReturnUrl() {
		return cancelReturnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelReturnUrl(String newCancelReturnUrl) {
		cancelReturnUrl = newCancelReturnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertsPath() {
		return certsPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertsPath(String newCertsPath) {
		certsPath = newCertsPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckAvs() {
		return checkAvs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckAvs(boolean newCheckAvs) {
		checkAvs = newCheckAvs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckCvv2() {
		return checkCvv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckCvv2(boolean newCheckCvv2) {
		checkCvv2 = newCheckCvv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnableTransmit() {
		return enableTransmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableTransmit(String newEnableTransmit) {
		enableTransmit = newEnableTransmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostAddress() {
		return hostAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostAddress(String newHostAddress) {
		hostAddress = newHostAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getHostPort() {
		return hostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostPort(long newHostPort) {
		hostPort = newHostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogFileName() {
		return logFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogFileName(String newLogFileName) {
		logFileName = newLogFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLoggingLevel() {
		return loggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoggingLevel(long newLoggingLevel) {
		loggingLevel = newLoggingLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxLogFileSize() {
		return maxLogFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLogFileSize(long newMaxLogFileSize) {
		maxLogFileSize = newMaxLogFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartner() {
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartner(String newPartner) {
		partner = newPartner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPreAuth() {
		return preAuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreAuth(boolean newPreAuth) {
		preAuth = newPreAuth;
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
		paymentGatewayConfigId = newPaymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyAddress() {
		return proxyAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyAddress(String newProxyAddress) {
		proxyAddress = newProxyAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyLogon() {
		return proxyLogon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyLogon(String newProxyLogon) {
		proxyLogon = newProxyLogon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProxyPassword() {
		return proxyPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyPassword(String newProxyPassword) {
		proxyPassword = newProxyPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProxyPort() {
		return proxyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProxyPort(long newProxyPort) {
		proxyPort = newProxyPort;
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
		pwd = newPwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedirectUrl() {
		return redirectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedirectUrl(String newRedirectUrl) {
		redirectUrl = newRedirectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnUrl() {
		return returnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnUrl(String newReturnUrl) {
		returnUrl = newReturnUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStackTraceOn() {
		return stackTraceOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackTraceOn(boolean newStackTraceOn) {
		stackTraceOn = newStackTraceOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(long newTimeout) {
		timeout = newTimeout;
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
		userId = newUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		vendor = newVendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL:
				return getCancelReturnUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH:
				return getCertsPath();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS:
				return isCheckAvs();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2:
				return isCheckCvv2();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT:
				return getEnableTransmit();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS:
				return getHostAddress();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT:
				return getHostPort();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME:
				return getLogFileName();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL:
				return getLoggingLevel();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE:
				return getMaxLogFileSize();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER:
				return getPartner();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH:
				return isPreAuth();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS:
				return getProxyAddress();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON:
				return getProxyLogon();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD:
				return getProxyPassword();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT:
				return getProxyPort();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PWD:
				return getPwd();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL:
				return getRedirectUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL:
				return getReturnUrl();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON:
				return isStackTraceOn();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT:
				return getTimeout();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID:
				return getUserId();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR:
				return getVendor();
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL:
				setCancelReturnUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH:
				setCertsPath((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS:
				setCheckAvs((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2:
				setCheckCvv2((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT:
				setEnableTransmit((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS:
				setHostAddress((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT:
				setHostPort((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME:
				setLogFileName((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL:
				setLoggingLevel((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE:
				setMaxLogFileSize((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER:
				setPartner((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH:
				setPreAuth((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS:
				setProxyAddress((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON:
				setProxyLogon((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD:
				setProxyPassword((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT:
				setProxyPort((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PWD:
				setPwd((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL:
				setRedirectUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL:
				setReturnUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON:
				setStackTraceOn((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT:
				setTimeout((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID:
				setUserId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR:
				setVendor((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL:
				setCancelReturnUrl(CANCEL_RETURN_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH:
				setCertsPath(CERTS_PATH_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS:
				setCheckAvs(CHECK_AVS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2:
				setCheckCvv2(CHECK_CVV2_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT:
				setEnableTransmit(ENABLE_TRANSMIT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS:
				setHostAddress(HOST_ADDRESS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT:
				setHostPort(HOST_PORT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME:
				setLogFileName(LOG_FILE_NAME_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL:
				setLoggingLevel(LOGGING_LEVEL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE:
				setMaxLogFileSize(MAX_LOG_FILE_SIZE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER:
				setPartner(PARTNER_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH:
				setPreAuth(PRE_AUTH_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS:
				setProxyAddress(PROXY_ADDRESS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON:
				setProxyLogon(PROXY_LOGON_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD:
				setProxyPassword(PROXY_PASSWORD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT:
				setProxyPort(PROXY_PORT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PWD:
				setPwd(PWD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL:
				setRedirectUrl(REDIRECT_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL:
				setReturnUrl(RETURN_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON:
				setStackTraceOn(STACK_TRACE_ON_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CANCEL_RETURN_URL:
				return CANCEL_RETURN_URL_EDEFAULT == null ? cancelReturnUrl != null : !CANCEL_RETURN_URL_EDEFAULT.equals(cancelReturnUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CERTS_PATH:
				return CERTS_PATH_EDEFAULT == null ? certsPath != null : !CERTS_PATH_EDEFAULT.equals(certsPath);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_AVS:
				return checkAvs != CHECK_AVS_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__CHECK_CVV2:
				return checkCvv2 != CHECK_CVV2_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__ENABLE_TRANSMIT:
				return ENABLE_TRANSMIT_EDEFAULT == null ? enableTransmit != null : !ENABLE_TRANSMIT_EDEFAULT.equals(enableTransmit);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_ADDRESS:
				return HOST_ADDRESS_EDEFAULT == null ? hostAddress != null : !HOST_ADDRESS_EDEFAULT.equals(hostAddress);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__HOST_PORT:
				return hostPort != HOST_PORT_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOG_FILE_NAME:
				return LOG_FILE_NAME_EDEFAULT == null ? logFileName != null : !LOG_FILE_NAME_EDEFAULT.equals(logFileName);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__LOGGING_LEVEL:
				return loggingLevel != LOGGING_LEVEL_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__MAX_LOG_FILE_SIZE:
				return maxLogFileSize != MAX_LOG_FILE_SIZE_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PARTNER:
				return PARTNER_EDEFAULT == null ? partner != null : !PARTNER_EDEFAULT.equals(partner);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PRE_AUTH:
				return preAuth != PRE_AUTH_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_ADDRESS:
				return PROXY_ADDRESS_EDEFAULT == null ? proxyAddress != null : !PROXY_ADDRESS_EDEFAULT.equals(proxyAddress);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_LOGON:
				return PROXY_LOGON_EDEFAULT == null ? proxyLogon != null : !PROXY_LOGON_EDEFAULT.equals(proxyLogon);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PASSWORD:
				return PROXY_PASSWORD_EDEFAULT == null ? proxyPassword != null : !PROXY_PASSWORD_EDEFAULT.equals(proxyPassword);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PROXY_PORT:
				return proxyPort != PROXY_PORT_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PWD:
				return PWD_EDEFAULT == null ? pwd != null : !PWD_EDEFAULT.equals(pwd);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__REDIRECT_URL:
				return REDIRECT_URL_EDEFAULT == null ? redirectUrl != null : !REDIRECT_URL_EDEFAULT.equals(redirectUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__RETURN_URL:
				return RETURN_URL_EDEFAULT == null ? returnUrl != null : !RETURN_URL_EDEFAULT.equals(returnUrl);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__STACK_TRACE_ON:
				return stackTraceOn != STACK_TRACE_ON_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__TIMEOUT:
				return timeout != TIMEOUT_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case PaymentPackage.PAYMENT_GATEWAY_PAYFLOW_PRO__PAYMENT_GATEWAY_CONFIG_ID:
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
		result.append(" (cancelReturnUrl: ");
		result.append(cancelReturnUrl);
		result.append(", certsPath: ");
		result.append(certsPath);
		result.append(", checkAvs: ");
		result.append(checkAvs);
		result.append(", checkCvv2: ");
		result.append(checkCvv2);
		result.append(", enableTransmit: ");
		result.append(enableTransmit);
		result.append(", hostAddress: ");
		result.append(hostAddress);
		result.append(", hostPort: ");
		result.append(hostPort);
		result.append(", logFileName: ");
		result.append(logFileName);
		result.append(", loggingLevel: ");
		result.append(loggingLevel);
		result.append(", maxLogFileSize: ");
		result.append(maxLogFileSize);
		result.append(", partner: ");
		result.append(partner);
		result.append(", preAuth: ");
		result.append(preAuth);
		result.append(", proxyAddress: ");
		result.append(proxyAddress);
		result.append(", proxyLogon: ");
		result.append(proxyLogon);
		result.append(", proxyPassword: ");
		result.append(proxyPassword);
		result.append(", proxyPort: ");
		result.append(proxyPort);
		result.append(", pwd: ");
		result.append(pwd);
		result.append(", redirectUrl: ");
		result.append(redirectUrl);
		result.append(", returnUrl: ");
		result.append(returnUrl);
		result.append(", stackTraceOn: ");
		result.append(stackTraceOn);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", userId: ");
		result.append(userId);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayPayflowProImpl
