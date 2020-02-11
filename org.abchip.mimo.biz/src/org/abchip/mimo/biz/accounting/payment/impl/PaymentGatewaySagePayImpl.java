/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Sage Pay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getAuthenticationTransType <em>Authentication Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getAuthenticationUrl <em>Authentication Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getAuthoriseTransType <em>Authorise Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getAuthoriseUrl <em>Authorise Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getProductionHost <em>Production Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getProtocolVersion <em>Protocol Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getRefundUrl <em>Refund Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getReleaseTransType <em>Release Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getReleaseUrl <em>Release Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getSagePayMode <em>Sage Pay Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getTestingHost <em>Testing Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getVoidUrl <em>Void Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewaySagePayImpl extends BizEntityImpl implements PaymentGatewaySagePay {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewaySagePayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthenticationTransType() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationTransType(String newAuthenticationTransType) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE, newAuthenticationTransType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthenticationUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationUrl(String newAuthenticationUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL, newAuthenticationUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthoriseTransType() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthoriseTransType(String newAuthoriseTransType) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE, newAuthoriseTransType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthoriseUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthoriseUrl(String newAuthoriseUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL, newAuthoriseUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductionHost() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionHost(String newProductionHost) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST, newProductionHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolVersion() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolVersion(String newProtocolVersion) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION, newProtocolVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefundUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundUrl(String newRefundUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL, newRefundUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleaseTransType() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseTransType(String newReleaseTransType) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE, newReleaseTransType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleaseUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseUrl(String newReleaseUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL, newReleaseUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSagePayMode() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSagePayMode(String newSagePayMode) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE, newSagePayMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingHost() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingHost(String newTestingHost) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST, newTestingHost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendor() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__VENDOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendor(String newVendor) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__VENDOR, newVendor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVoidUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__VOID_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoidUrl(String newVoidUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_SAGE_PAY__VOID_URL, newVoidUrl);
	}

} //PaymentGatewaySagePayImpl
