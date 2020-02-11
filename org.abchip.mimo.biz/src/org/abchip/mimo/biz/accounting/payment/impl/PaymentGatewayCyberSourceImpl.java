/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayCyberSource;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiVersion(String newApiVersion) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__API_VERSION, newApiVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutoBill() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoBill(String newAutoBill) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__AUTO_BILL, newAutoBill);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvsDeclineCodes() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvsDeclineCodes(String newAvsDeclineCodes) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__AVS_DECLINE_CODES, newAvsDeclineCodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisableBillAvs() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisableBillAvs(boolean newDisableBillAvs) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__DISABLE_BILL_AVS, newDisableBillAvs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnableDav() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnableDav(boolean newEnableDav) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__ENABLE_DAV, newEnableDav);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFraudScore() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFraudScore(boolean newFraudScore) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__FRAUD_SCORE, newFraudScore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIgnoreAvs() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreAvs(String newIgnoreAvs) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__IGNORE_AVS, newIgnoreAvs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeysDir() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeysDir(String newKeysDir) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_DIR, newKeysDir);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeysFile() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeysFile(String newKeysFile) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__KEYS_FILE, newKeysFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogDir() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogDir(String newLogDir) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_DIR, newLogDir);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogEnabled() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogEnabled(String newLogEnabled) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_ENABLED, newLogEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogFile() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogFile(String newLogFile) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_FILE, newLogFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLogSize() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogSize(long newLogSize) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__LOG_SIZE, newLogSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantContact() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantContact(String newMerchantContact) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_CONTACT, newMerchantContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantDescr() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantDescr(String newMerchantDescr) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_DESCR, newMerchantDescr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__MERCHANT_ID, newMerchantId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduction() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduction(String newProduction) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_CYBER_SOURCE__PRODUCTION, newProduction);
	}

} //PaymentGatewayCyberSourceImpl
