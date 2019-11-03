/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Cyber Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getAutoBill <em>Auto Bill</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getAvsDeclineCodes <em>Avs Decline Codes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#isDisableBillAvs <em>Disable Bill Avs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#isEnableDav <em>Enable Dav</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#isFraudScore <em>Fraud Score</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getIgnoreAvs <em>Ignore Avs</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getKeysDir <em>Keys Dir</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getKeysFile <em>Keys File</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getLogDir <em>Log Dir</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getLogEnabled <em>Log Enabled</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getLogFile <em>Log File</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getLogSize <em>Log Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getMerchantContact <em>Merchant Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getMerchantDescr <em>Merchant Descr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayCyberSourceImpl#getProduction <em>Production</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayCyberSourceImpl extends BizEntityImpl implements PaymentGatewayCyberSource {
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
	 * The default value of the '{@link #getAutoBill() <em>Auto Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoBill()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_BILL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAutoBill() <em>Auto Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoBill()
	 * @generated
	 * @ordered
	 */
	protected String autoBill = AUTO_BILL_EDEFAULT;
	/**
	 * The default value of the '{@link #getAvsDeclineCodes() <em>Avs Decline Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvsDeclineCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String AVS_DECLINE_CODES_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAvsDeclineCodes() <em>Avs Decline Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvsDeclineCodes()
	 * @generated
	 * @ordered
	 */
	protected String avsDeclineCodes = AVS_DECLINE_CODES_EDEFAULT;
	/**
	 * The default value of the '{@link #isDisableBillAvs() <em>Disable Bill Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableBillAvs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_BILL_AVS_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDisableBillAvs() <em>Disable Bill Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableBillAvs()
	 * @generated
	 * @ordered
	 */
	protected boolean disableBillAvs = DISABLE_BILL_AVS_EDEFAULT;
	/**
	 * The default value of the '{@link #isEnableDav() <em>Enable Dav</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDav()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_DAV_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnableDav() <em>Enable Dav</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDav()
	 * @generated
	 * @ordered
	 */
	protected boolean enableDav = ENABLE_DAV_EDEFAULT;
	/**
	 * The default value of the '{@link #isFraudScore() <em>Fraud Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFraudScore()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAUD_SCORE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isFraudScore() <em>Fraud Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFraudScore()
	 * @generated
	 * @ordered
	 */
	protected boolean fraudScore = FRAUD_SCORE_EDEFAULT;
	/**
	 * The default value of the '{@link #getIgnoreAvs() <em>Ignore Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreAvs()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_AVS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIgnoreAvs() <em>Ignore Avs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreAvs()
	 * @generated
	 * @ordered
	 */
	protected String ignoreAvs = IGNORE_AVS_EDEFAULT;
	/**
	 * The default value of the '{@link #getKeysDir() <em>Keys Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysDir()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYS_DIR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKeysDir() <em>Keys Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysDir()
	 * @generated
	 * @ordered
	 */
	protected String keysDir = KEYS_DIR_EDEFAULT;
	/**
	 * The default value of the '{@link #getKeysFile() <em>Keys File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysFile()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYS_FILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getKeysFile() <em>Keys File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeysFile()
	 * @generated
	 * @ordered
	 */
	protected String keysFile = KEYS_FILE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLogDir() <em>Log Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDir()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_DIR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLogDir() <em>Log Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDir()
	 * @generated
	 * @ordered
	 */
	protected String logDir = LOG_DIR_EDEFAULT;
	/**
	 * The default value of the '{@link #getLogEnabled() <em>Log Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_ENABLED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLogEnabled() <em>Log Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEnabled()
	 * @generated
	 * @ordered
	 */
	protected String logEnabled = LOG_ENABLED_EDEFAULT;
	/**
	 * The default value of the '{@link #getLogFile() <em>Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFile()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_FILE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLogFile() <em>Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFile()
	 * @generated
	 * @ordered
	 */
	protected String logFile = LOG_FILE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLogSize() <em>Log Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogSize()
	 * @generated
	 * @ordered
	 */
	protected static final long LOG_SIZE_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getLogSize() <em>Log Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogSize()
	 * @generated
	 * @ordered
	 */
	protected long logSize = LOG_SIZE_EDEFAULT;
	/**
	 * The default value of the '{@link #getMerchantContact() <em>Merchant Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantContact()
	 * @generated
	 * @ordered
	 */
	protected static final String MERCHANT_CONTACT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMerchantContact() <em>Merchant Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantContact()
	 * @generated
	 * @ordered
	 */
	protected String merchantContact = MERCHANT_CONTACT_EDEFAULT;
	/**
	 * The default value of the '{@link #getMerchantDescr() <em>Merchant Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantDescr()
	 * @generated
	 * @ordered
	 */
	protected static final String MERCHANT_DESCR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMerchantDescr() <em>Merchant Descr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantDescr()
	 * @generated
	 * @ordered
	 */
	protected String merchantDescr = MERCHANT_DESCR_EDEFAULT;
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
	 * The default value of the '{@link #getProduction() <em>Production</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduction()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProduction() <em>Production</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduction()
	 * @generated
	 * @ordered
	 */
	protected String production = PRODUCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayCyberSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION, oldApiVersion, apiVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutoBill() {
		return autoBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoBill(String newAutoBill) {
		String oldAutoBill = autoBill;
		autoBill = newAutoBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL, oldAutoBill, autoBill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvsDeclineCodes() {
		return avsDeclineCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvsDeclineCodes(String newAvsDeclineCodes) {
		String oldAvsDeclineCodes = avsDeclineCodes;
		avsDeclineCodes = newAvsDeclineCodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES, oldAvsDeclineCodes, avsDeclineCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisableBillAvs() {
		return disableBillAvs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableBillAvs(boolean newDisableBillAvs) {
		boolean oldDisableBillAvs = disableBillAvs;
		disableBillAvs = newDisableBillAvs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS, oldDisableBillAvs, disableBillAvs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableDav() {
		return enableDav;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDav(boolean newEnableDav) {
		boolean oldEnableDav = enableDav;
		enableDav = newEnableDav;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV, oldEnableDav, enableDav));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFraudScore() {
		return fraudScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFraudScore(boolean newFraudScore) {
		boolean oldFraudScore = fraudScore;
		fraudScore = newFraudScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE, oldFraudScore, fraudScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreAvs() {
		return ignoreAvs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreAvs(String newIgnoreAvs) {
		String oldIgnoreAvs = ignoreAvs;
		ignoreAvs = newIgnoreAvs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS, oldIgnoreAvs, ignoreAvs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeysDir() {
		return keysDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeysDir(String newKeysDir) {
		String oldKeysDir = keysDir;
		keysDir = newKeysDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR, oldKeysDir, keysDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeysFile() {
		return keysFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeysFile(String newKeysFile) {
		String oldKeysFile = keysFile;
		keysFile = newKeysFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE, oldKeysFile, keysFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogDir() {
		return logDir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogDir(String newLogDir) {
		String oldLogDir = logDir;
		logDir = newLogDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR, oldLogDir, logDir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogEnabled() {
		return logEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogEnabled(String newLogEnabled) {
		String oldLogEnabled = logEnabled;
		logEnabled = newLogEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED, oldLogEnabled, logEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogFile() {
		return logFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogFile(String newLogFile) {
		String oldLogFile = logFile;
		logFile = newLogFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE, oldLogFile, logFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLogSize() {
		return logSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogSize(long newLogSize) {
		long oldLogSize = logSize;
		logSize = newLogSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE, oldLogSize, logSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantContact() {
		return merchantContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantContact(String newMerchantContact) {
		String oldMerchantContact = merchantContact;
		merchantContact = newMerchantContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT, oldMerchantContact, merchantContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantDescr() {
		return merchantDescr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantDescr(String newMerchantDescr) {
		String oldMerchantDescr = merchantDescr;
		merchantDescr = newMerchantDescr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR, oldMerchantDescr, merchantDescr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID, oldMerchantId, merchantId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduction() {
		return production;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduction(String newProduction) {
		String oldProduction = production;
		production = newProduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION, oldProduction, production));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID:
				return getPaymentGatewayConfigId();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION:
				return getApiVersion();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL:
				return getAutoBill();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES:
				return getAvsDeclineCodes();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS:
				return isDisableBillAvs();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV:
				return isEnableDav();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE:
				return isFraudScore();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS:
				return getIgnoreAvs();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR:
				return getKeysDir();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE:
				return getKeysFile();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR:
				return getLogDir();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED:
				return getLogEnabled();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE:
				return getLogFile();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE:
				return getLogSize();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT:
				return getMerchantContact();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR:
				return getMerchantDescr();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID:
				return getMerchantId();
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION:
				return getProduction();
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
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION:
				setApiVersion((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL:
				setAutoBill((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES:
				setAvsDeclineCodes((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS:
				setDisableBillAvs((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV:
				setEnableDav((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE:
				setFraudScore((Boolean)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS:
				setIgnoreAvs((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR:
				setKeysDir((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE:
				setKeysFile((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR:
				setLogDir((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED:
				setLogEnabled((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE:
				setLogFile((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE:
				setLogSize((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT:
				setMerchantContact((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR:
				setMerchantDescr((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID:
				setMerchantId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION:
				setProduction((String)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId(PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION:
				setApiVersion(API_VERSION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL:
				setAutoBill(AUTO_BILL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES:
				setAvsDeclineCodes(AVS_DECLINE_CODES_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS:
				setDisableBillAvs(DISABLE_BILL_AVS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV:
				setEnableDav(ENABLE_DAV_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE:
				setFraudScore(FRAUD_SCORE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS:
				setIgnoreAvs(IGNORE_AVS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR:
				setKeysDir(KEYS_DIR_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE:
				setKeysFile(KEYS_FILE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR:
				setLogDir(LOG_DIR_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED:
				setLogEnabled(LOG_ENABLED_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE:
				setLogFile(LOG_FILE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE:
				setLogSize(LOG_SIZE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT:
				setMerchantContact(MERCHANT_CONTACT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR:
				setMerchantDescr(MERCHANT_DESCR_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID:
				setMerchantId(MERCHANT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION:
				setProduction(PRODUCTION_EDEFAULT);
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
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID:
				return PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT == null ? paymentGatewayConfigId != null : !PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT.equals(paymentGatewayConfigId);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION:
				return API_VERSION_EDEFAULT == null ? apiVersion != null : !API_VERSION_EDEFAULT.equals(apiVersion);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL:
				return AUTO_BILL_EDEFAULT == null ? autoBill != null : !AUTO_BILL_EDEFAULT.equals(autoBill);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES:
				return AVS_DECLINE_CODES_EDEFAULT == null ? avsDeclineCodes != null : !AVS_DECLINE_CODES_EDEFAULT.equals(avsDeclineCodes);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS:
				return disableBillAvs != DISABLE_BILL_AVS_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV:
				return enableDav != ENABLE_DAV_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE:
				return fraudScore != FRAUD_SCORE_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS:
				return IGNORE_AVS_EDEFAULT == null ? ignoreAvs != null : !IGNORE_AVS_EDEFAULT.equals(ignoreAvs);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR:
				return KEYS_DIR_EDEFAULT == null ? keysDir != null : !KEYS_DIR_EDEFAULT.equals(keysDir);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE:
				return KEYS_FILE_EDEFAULT == null ? keysFile != null : !KEYS_FILE_EDEFAULT.equals(keysFile);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR:
				return LOG_DIR_EDEFAULT == null ? logDir != null : !LOG_DIR_EDEFAULT.equals(logDir);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED:
				return LOG_ENABLED_EDEFAULT == null ? logEnabled != null : !LOG_ENABLED_EDEFAULT.equals(logEnabled);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE:
				return LOG_FILE_EDEFAULT == null ? logFile != null : !LOG_FILE_EDEFAULT.equals(logFile);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE:
				return logSize != LOG_SIZE_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT:
				return MERCHANT_CONTACT_EDEFAULT == null ? merchantContact != null : !MERCHANT_CONTACT_EDEFAULT.equals(merchantContact);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR:
				return MERCHANT_DESCR_EDEFAULT == null ? merchantDescr != null : !MERCHANT_DESCR_EDEFAULT.equals(merchantDescr);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID:
				return MERCHANT_ID_EDEFAULT == null ? merchantId != null : !MERCHANT_ID_EDEFAULT.equals(merchantId);
			case PaymentPackage.PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION:
				return PRODUCTION_EDEFAULT == null ? production != null : !PRODUCTION_EDEFAULT.equals(production);
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
		result.append(", apiVersion: ");
		result.append(apiVersion);
		result.append(", autoBill: ");
		result.append(autoBill);
		result.append(", avsDeclineCodes: ");
		result.append(avsDeclineCodes);
		result.append(", disableBillAvs: ");
		result.append(disableBillAvs);
		result.append(", enableDav: ");
		result.append(enableDav);
		result.append(", fraudScore: ");
		result.append(fraudScore);
		result.append(", ignoreAvs: ");
		result.append(ignoreAvs);
		result.append(", keysDir: ");
		result.append(keysDir);
		result.append(", keysFile: ");
		result.append(keysFile);
		result.append(", logDir: ");
		result.append(logDir);
		result.append(", logEnabled: ");
		result.append(logEnabled);
		result.append(", logFile: ");
		result.append(logFile);
		result.append(", logSize: ");
		result.append(logSize);
		result.append(", merchantContact: ");
		result.append(merchantContact);
		result.append(", merchantDescr: ");
		result.append(merchantDescr);
		result.append(", merchantId: ");
		result.append(merchantId);
		result.append(", production: ");
		result.append(production);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayCyberSourceImpl
