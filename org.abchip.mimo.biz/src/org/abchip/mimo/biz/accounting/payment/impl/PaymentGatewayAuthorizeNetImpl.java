/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Authorize Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayAuthorizeNetImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
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
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiVersion(String newApiVersion) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__API_VERSION, newApiVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCertificateAlias() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCertificateAlias(String newCertificateAlias) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CERTIFICATE_ALIAS, newCertificateAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpDeviceType() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpDeviceType(String newCpDeviceType) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_DEVICE_TYPE, newCpDeviceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpMarketType() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpMarketType(String newCpMarketType) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_MARKET_TYPE, newCpMarketType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCpVersion() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpVersion(String newCpVersion) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__CP_VERSION, newCpVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimitedData() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimitedData(String newDelimitedData) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITED_DATA, newDelimitedData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelimiterChar() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiterChar(String newDelimiterChar) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__DELIMITER_CHAR, newDelimiterChar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDuplicateWindow() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuplicateWindow(long newDuplicateWindow) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__DUPLICATE_WINDOW, newDuplicateWindow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailCustomer() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailCustomer(String newEmailCustomer) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_CUSTOMER, newEmailCustomer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmailMerchant() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailMerchant(String newEmailMerchant) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__EMAIL_MERCHANT, newEmailMerchant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethod() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(String newMethod) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPwd() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__PWD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPwd(String newPwd) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__PWD, newPwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelayResponse() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelayResponse(String newRelayResponse) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__RELAY_RESPONSE, newRelayResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestMode() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestMode(String newTestMode) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TEST_MODE, newTestMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTranKey() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranKey(String newTranKey) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TRAN_KEY, newTranKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransDescription() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransDescription(String newTransDescription) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANS_DESCRIPTION, newTransDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransactionUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransactionUrl(String newTransactionUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__TRANSACTION_URL, newTransactionUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserId(String newUserId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_AUTHORIZE_NET__USER_ID, newUserId);
	}

} //PaymentGatewayAuthorizeNetImpl
