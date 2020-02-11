/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway Payflow Pro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCancelReturnUrl <em>Cancel Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCertsPath <em>Certs Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckAvs <em>Check Avs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckCvv2 <em>Check Cvv2</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getEnableTransmit <em>Enable Transmit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostAddress <em>Host Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostPort <em>Host Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLogFileName <em>Log File Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLoggingLevel <em>Logging Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getMaxLogFileSize <em>Max Log File Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPartner <em>Partner</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isPreAuth <em>Pre Auth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyAddress <em>Proxy Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyLogon <em>Proxy Logon</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPassword <em>Proxy Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPort <em>Proxy Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isStackTraceOn <em>Stack Trace On</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getUserId <em>User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getVendor <em>Vendor</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro()
 * @model annotation="mimo-ent-frame title='Payflow Pro Payment Gateway Config'"
 * @generated
 */
public interface PaymentGatewayPayflowPro extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cancel Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Return Url</em>' attribute.
	 * @see #setCancelReturnUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_CancelReturnUrl()
	 * @model annotation="mimo-ent-slot help='Express Checkout Return On Cancel URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCancelReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCancelReturnUrl <em>Cancel Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Return Url</em>' attribute.
	 * @see #getCancelReturnUrl()
	 * @generated
	 */
	void setCancelReturnUrl(String value);

	/**
	 * Returns the value of the '<em><b>Certs Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certs Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certs Path</em>' attribute.
	 * @see #setCertsPath(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_CertsPath()
	 * @model annotation="mimo-ent-slot help='Path the the VeriSign Certificate'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCertsPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getCertsPath <em>Certs Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certs Path</em>' attribute.
	 * @see #getCertsPath()
	 * @generated
	 */
	void setCertsPath(String value);

	/**
	 * Returns the value of the '<em><b>Check Avs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Avs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Avs</em>' attribute.
	 * @see #setCheckAvs(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_CheckAvs()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Use Address Verification'"
	 * @generated
	 */
	boolean isCheckAvs();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckAvs <em>Check Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Avs</em>' attribute.
	 * @see #isCheckAvs()
	 * @generated
	 */
	void setCheckAvs(boolean value);

	/**
	 * Returns the value of the '<em><b>Check Cvv2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Cvv2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Cvv2</em>' attribute.
	 * @see #setCheckCvv2(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_CheckCvv2()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Require CVV2 Verification'"
	 * @generated
	 */
	boolean isCheckCvv2();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isCheckCvv2 <em>Check Cvv2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Cvv2</em>' attribute.
	 * @see #isCheckCvv2()
	 * @generated
	 */
	void setCheckCvv2(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Transmit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Transmit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Transmit</em>' attribute.
	 * @see #setEnableTransmit(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_EnableTransmit()
	 * @model annotation="mimo-ent-slot help='Set to false to not transmit anything'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getEnableTransmit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getEnableTransmit <em>Enable Transmit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Transmit</em>' attribute.
	 * @see #getEnableTransmit()
	 * @generated
	 */
	void setEnableTransmit(String value);

	/**
	 * Returns the value of the '<em><b>Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Address</em>' attribute.
	 * @see #setHostAddress(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_HostAddress()
	 * @model annotation="mimo-ent-slot help='Address of the payment processor'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getHostAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostAddress <em>Host Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Address</em>' attribute.
	 * @see #getHostAddress()
	 * @generated
	 */
	void setHostAddress(String value);

	/**
	 * Returns the value of the '<em><b>Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Port</em>' attribute.
	 * @see #setHostPort(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_HostPort()
	 * @model annotation="mimo-ent-slot help='Port of the payment processor'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getHostPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getHostPort <em>Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Port</em>' attribute.
	 * @see #getHostPort()
	 * @generated
	 */
	void setHostPort(long value);

	/**
	 * Returns the value of the '<em><b>Log File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File Name</em>' attribute.
	 * @see #setLogFileName(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_LogFileName()
	 * @model annotation="mimo-ent-slot help='Log file name'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLogFileName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLogFileName <em>Log File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log File Name</em>' attribute.
	 * @see #getLogFileName()
	 * @generated
	 */
	void setLogFileName(String value);

	/**
	 * Returns the value of the '<em><b>Logging Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logging Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Level</em>' attribute.
	 * @see #setLoggingLevel(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_LoggingLevel()
	 * @model annotation="mimo-ent-slot help='Logging level'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLoggingLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getLoggingLevel <em>Logging Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Level</em>' attribute.
	 * @see #getLoggingLevel()
	 * @generated
	 */
	void setLoggingLevel(long value);

	/**
	 * Returns the value of the '<em><b>Max Log File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Log File Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Log File Size</em>' attribute.
	 * @see #setMaxLogFileSize(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_MaxLogFileSize()
	 * @model annotation="mimo-ent-slot help='Max log file size'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getMaxLogFileSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getMaxLogFileSize <em>Max Log File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Log File Size</em>' attribute.
	 * @see #getMaxLogFileSize()
	 * @generated
	 */
	void setMaxLogFileSize(long value);

	/**
	 * Returns the value of the '<em><b>Partner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' attribute.
	 * @see #setPartner(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_Partner()
	 * @model annotation="mimo-ent-slot help='PayFlow Partner of account information'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPartner();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPartner <em>Partner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner</em>' attribute.
	 * @see #getPartner()
	 * @generated
	 */
	void setPartner(String value);

	/**
	 * Returns the value of the '<em><b>Pre Auth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Auth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Auth</em>' attribute.
	 * @see #setPreAuth(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_PreAuth()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Pre-Authorize Payments (if set to N will auto-capture)'"
	 * @generated
	 */
	boolean isPreAuth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isPreAuth <em>Pre Auth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Auth</em>' attribute.
	 * @see #isPreAuth()
	 * @generated
	 */
	void setPreAuth(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_PaymentGatewayConfigId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Address</em>' attribute.
	 * @see #setProxyAddress(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_ProxyAddress()
	 * @model annotation="mimo-ent-slot help='Proxy Address'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getProxyAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyAddress <em>Proxy Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Address</em>' attribute.
	 * @see #getProxyAddress()
	 * @generated
	 */
	void setProxyAddress(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Logon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Logon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Logon</em>' attribute.
	 * @see #setProxyLogon(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_ProxyLogon()
	 * @model annotation="mimo-ent-slot help='Proxy Logon'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getProxyLogon();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyLogon <em>Proxy Logon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Logon</em>' attribute.
	 * @see #getProxyLogon()
	 * @generated
	 */
	void setProxyLogon(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Password</em>' attribute.
	 * @see #setProxyPassword(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_ProxyPassword()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Proxy Password'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getProxyPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPassword <em>Proxy Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Password</em>' attribute.
	 * @see #getProxyPassword()
	 * @generated
	 */
	void setProxyPassword(String value);

	/**
	 * Returns the value of the '<em><b>Proxy Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy Port</em>' attribute.
	 * @see #setProxyPort(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_ProxyPort()
	 * @model annotation="mimo-ent-slot help='Proxy Port'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getProxyPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getProxyPort <em>Proxy Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy Port</em>' attribute.
	 * @see #getProxyPort()
	 * @generated
	 */
	void setProxyPort(long value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_Pwd()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='PayFlow Password of account information'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

	/**
	 * Returns the value of the '<em><b>Redirect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirect Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirect Url</em>' attribute.
	 * @see #setRedirectUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_RedirectUrl()
	 * @model annotation="mimo-ent-slot help='Express Checkout Redirect URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getRedirectUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getRedirectUrl <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirect Url</em>' attribute.
	 * @see #getRedirectUrl()
	 * @generated
	 */
	void setRedirectUrl(String value);

	/**
	 * Returns the value of the '<em><b>Return Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Url</em>' attribute.
	 * @see #setReturnUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_ReturnUrl()
	 * @model annotation="mimo-ent-slot help='Express Checkout Return URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getReturnUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getReturnUrl <em>Return Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Url</em>' attribute.
	 * @see #getReturnUrl()
	 * @generated
	 */
	void setReturnUrl(String value);

	/**
	 * Returns the value of the '<em><b>Stack Trace On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack Trace On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack Trace On</em>' attribute.
	 * @see #setStackTraceOn(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_StackTraceOn()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Stack trace on/off'"
	 * @generated
	 */
	boolean isStackTraceOn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#isStackTraceOn <em>Stack Trace On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stack Trace On</em>' attribute.
	 * @see #isStackTraceOn()
	 * @generated
	 */
	void setStackTraceOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_Timeout()
	 * @model annotation="mimo-ent-slot help='Timeout'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTimeout();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(long value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_UserId()
	 * @model annotation="mimo-ent-slot help='PayFlow UserID of account information'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayPayflowPro_Vendor()
	 * @model annotation="mimo-ent-slot help='Vendor of account information'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayflowPro#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

} // PaymentGatewayPayflowPro
