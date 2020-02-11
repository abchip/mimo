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
 * A representation of the model object '<em><b>Payment Gateway Cyber Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAutoBill <em>Auto Bill</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAvsDeclineCodes <em>Avs Decline Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isDisableBillAvs <em>Disable Bill Avs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isEnableDav <em>Enable Dav</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isFraudScore <em>Fraud Score</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getIgnoreAvs <em>Ignore Avs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysDir <em>Keys Dir</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysFile <em>Keys File</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogDir <em>Log Dir</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogEnabled <em>Log Enabled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogFile <em>Log File</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogSize <em>Log Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantContact <em>Merchant Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantDescr <em>Merchant Descr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getProduction <em>Production</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource()
 * @model annotation="mimo-ent-frame title='CyberSource Payment Gateway Configuration'"
 * @generated
 */
public interface PaymentGatewayCyberSource extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Version</em>' attribute.
	 * @see #setApiVersion(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_ApiVersion()
	 * @model annotation="mimo-ent-slot help='Target CyberSource API version'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(String value);

	/**
	 * Returns the value of the '<em><b>Auto Bill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Bill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Bill</em>' attribute.
	 * @see #setAutoBill(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_AutoBill()
	 * @model annotation="mimo-ent-slot help='Auto-Bill In Authorization (true|false)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAutoBill();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAutoBill <em>Auto Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Bill</em>' attribute.
	 * @see #getAutoBill()
	 * @generated
	 */
	void setAutoBill(String value);

	/**
	 * Returns the value of the '<em><b>Avs Decline Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avs Decline Codes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avs Decline Codes</em>' attribute.
	 * @see #setAvsDeclineCodes(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_AvsDeclineCodes()
	 * @model annotation="mimo-ent-slot help='AVS Decline Codes -- May not be supported any longer'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAvsDeclineCodes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getAvsDeclineCodes <em>Avs Decline Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avs Decline Codes</em>' attribute.
	 * @see #getAvsDeclineCodes()
	 * @generated
	 */
	void setAvsDeclineCodes(String value);

	/**
	 * Returns the value of the '<em><b>Disable Bill Avs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Bill Avs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Bill Avs</em>' attribute.
	 * @see #setDisableBillAvs(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_DisableBillAvs()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Disable AVS for Capture -- May not be supported any longer'"
	 * @generated
	 */
	boolean isDisableBillAvs();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isDisableBillAvs <em>Disable Bill Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Bill Avs</em>' attribute.
	 * @see #isDisableBillAvs()
	 * @generated
	 */
	void setDisableBillAvs(boolean value);

	/**
	 * Returns the value of the '<em><b>Enable Dav</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Dav</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Dav</em>' attribute.
	 * @see #setEnableDav(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_EnableDav()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Use DAV In Authorization -- May not be supported any longer'"
	 * @generated
	 */
	boolean isEnableDav();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isEnableDav <em>Enable Dav</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Dav</em>' attribute.
	 * @see #isEnableDav()
	 * @generated
	 */
	void setEnableDav(boolean value);

	/**
	 * Returns the value of the '<em><b>Fraud Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraud Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraud Score</em>' attribute.
	 * @see #setFraudScore(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_FraudScore()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Use Fraud Scoring In Authorization -- May not be supported any longer'"
	 * @generated
	 */
	boolean isFraudScore();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#isFraudScore <em>Fraud Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraud Score</em>' attribute.
	 * @see #isFraudScore()
	 * @generated
	 */
	void setFraudScore(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Avs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Avs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Avs</em>' attribute.
	 * @see #setIgnoreAvs(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_IgnoreAvs()
	 * @model annotation="mimo-ent-slot help='Ignore AVS results (true|false)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getIgnoreAvs();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getIgnoreAvs <em>Ignore Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Avs</em>' attribute.
	 * @see #getIgnoreAvs()
	 * @generated
	 */
	void setIgnoreAvs(String value);

	/**
	 * Returns the value of the '<em><b>Keys Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys Dir</em>' attribute.
	 * @see #setKeysDir(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_KeysDir()
	 * @model annotation="mimo-ent-slot help='Directory of the keys from CyberSource (Generate using online tools)'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getKeysDir();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysDir <em>Keys Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys Dir</em>' attribute.
	 * @see #getKeysDir()
	 * @generated
	 */
	void setKeysDir(String value);

	/**
	 * Returns the value of the '<em><b>Keys File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys File</em>' attribute.
	 * @see #setKeysFile(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_KeysFile()
	 * @model annotation="mimo-ent-slot help='Name of the keystore (if different then \"merchantID\".p12)'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getKeysFile();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getKeysFile <em>Keys File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys File</em>' attribute.
	 * @see #getKeysFile()
	 * @generated
	 */
	void setKeysFile(String value);

	/**
	 * Returns the value of the '<em><b>Log Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Dir</em>' attribute.
	 * @see #setLogDir(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_LogDir()
	 * @model annotation="mimo-ent-slot help='Log directory'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLogDir();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogDir <em>Log Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Dir</em>' attribute.
	 * @see #getLogDir()
	 * @generated
	 */
	void setLogDir(String value);

	/**
	 * Returns the value of the '<em><b>Log Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Enabled</em>' attribute.
	 * @see #setLogEnabled(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_LogEnabled()
	 * @model annotation="mimo-ent-slot help='Log transaction information (true|false)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLogEnabled();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogEnabled <em>Log Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Enabled</em>' attribute.
	 * @see #getLogEnabled()
	 * @generated
	 */
	void setLogEnabled(String value);

	/**
	 * Returns the value of the '<em><b>Log File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File</em>' attribute.
	 * @see #setLogFile(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_LogFile()
	 * @model annotation="mimo-ent-slot help='Log file name'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLogFile();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogFile <em>Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log File</em>' attribute.
	 * @see #getLogFile()
	 * @generated
	 */
	void setLogFile(String value);

	/**
	 * Returns the value of the '<em><b>Log Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Size</em>' attribute.
	 * @see #setLogSize(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_LogSize()
	 * @model annotation="mimo-ent-slot help='Max log size (megabytes)'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getLogSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getLogSize <em>Log Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Size</em>' attribute.
	 * @see #getLogSize()
	 * @generated
	 */
	void setLogSize(long value);

	/**
	 * Returns the value of the '<em><b>Merchant Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Contact</em>' attribute.
	 * @see #setMerchantContact(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_MerchantContact()
	 * @model annotation="mimo-ent-slot help='Merchant Description Contact Information - Shown on credit card statement'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMerchantContact();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantContact <em>Merchant Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Contact</em>' attribute.
	 * @see #getMerchantContact()
	 * @generated
	 */
	void setMerchantContact(String value);

	/**
	 * Returns the value of the '<em><b>Merchant Descr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Descr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Descr</em>' attribute.
	 * @see #setMerchantDescr(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_MerchantDescr()
	 * @model annotation="mimo-ent-slot help='Merchant Description - Shown on credit card statement'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMerchantDescr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantDescr <em>Merchant Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Descr</em>' attribute.
	 * @see #getMerchantDescr()
	 * @generated
	 */
	void setMerchantDescr(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_MerchantId()
	 * @model annotation="mimo-ent-slot help='You merchant ID'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMerchantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getMerchantId <em>Merchant Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_PaymentGatewayConfigId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Production</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production</em>' attribute.
	 * @see #setProduction(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayCyberSource_Production()
	 * @model annotation="mimo-ent-slot help='Enable production \"mode\" (true|false)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getProduction();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource#getProduction <em>Production</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production</em>' attribute.
	 * @see #getProduction()
	 * @generated
	 */
	void setProduction(String value);

} // PaymentGatewayCyberSource
