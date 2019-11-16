/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Sage Pay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewaySagePayImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
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
	 * The default value of the '{@link #getAuthenticationTransType() <em>Authentication Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationTransType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_TRANS_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthenticationTransType() <em>Authentication Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationTransType()
	 * @generated
	 * @ordered
	 */
	protected String authenticationTransType = AUTHENTICATION_TRANS_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthenticationUrl() <em>Authentication Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthenticationUrl() <em>Authentication Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationUrl()
	 * @generated
	 * @ordered
	 */
	protected String authenticationUrl = AUTHENTICATION_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthoriseTransType() <em>Authorise Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoriseTransType()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORISE_TRANS_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthoriseTransType() <em>Authorise Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoriseTransType()
	 * @generated
	 * @ordered
	 */
	protected String authoriseTransType = AUTHORISE_TRANS_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthoriseUrl() <em>Authorise Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoriseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORISE_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthoriseUrl() <em>Authorise Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoriseUrl()
	 * @generated
	 * @ordered
	 */
	protected String authoriseUrl = AUTHORISE_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductionHost() <em>Production Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionHost()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCTION_HOST_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductionHost() <em>Production Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionHost()
	 * @generated
	 * @ordered
	 */
	protected String productionHost = PRODUCTION_HOST_EDEFAULT;
	/**
	 * The default value of the '{@link #getProtocolVersion() <em>Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProtocolVersion() <em>Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolVersion()
	 * @generated
	 * @ordered
	 */
	protected String protocolVersion = PROTOCOL_VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getRefundUrl() <em>Refund Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REFUND_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRefundUrl() <em>Refund Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefundUrl()
	 * @generated
	 * @ordered
	 */
	protected String refundUrl = REFUND_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getReleaseTransType() <em>Release Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTransType()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_TRANS_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReleaseTransType() <em>Release Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseTransType()
	 * @generated
	 * @ordered
	 */
	protected String releaseTransType = RELEASE_TRANS_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getReleaseUrl() <em>Release Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getReleaseUrl() <em>Release Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseUrl()
	 * @generated
	 * @ordered
	 */
	protected String releaseUrl = RELEASE_URL_EDEFAULT;
	/**
	 * The default value of the '{@link #getSagePayMode() <em>Sage Pay Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSagePayMode()
	 * @generated
	 * @ordered
	 */
	protected static final String SAGE_PAY_MODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSagePayMode() <em>Sage Pay Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSagePayMode()
	 * @generated
	 * @ordered
	 */
	protected String sagePayMode = SAGE_PAY_MODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getTestingHost() <em>Testing Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingHost()
	 * @generated
	 * @ordered
	 */
	protected static final String TESTING_HOST_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTestingHost() <em>Testing Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestingHost()
	 * @generated
	 * @ordered
	 */
	protected String testingHost = TESTING_HOST_EDEFAULT;
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
	 * The default value of the '{@link #getVoidUrl() <em>Void Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoidUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String VOID_URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVoidUrl() <em>Void Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoidUrl()
	 * @generated
	 * @ordered
	 */
	protected String voidUrl = VOID_URL_EDEFAULT;
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
		return authenticationTransType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationTransType(String newAuthenticationTransType) {
		String oldAuthenticationTransType = authenticationTransType;
		authenticationTransType = newAuthenticationTransType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE, oldAuthenticationTransType, authenticationTransType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthenticationUrl() {
		return authenticationUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationUrl(String newAuthenticationUrl) {
		String oldAuthenticationUrl = authenticationUrl;
		authenticationUrl = newAuthenticationUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL, oldAuthenticationUrl, authenticationUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthoriseTransType() {
		return authoriseTransType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthoriseTransType(String newAuthoriseTransType) {
		String oldAuthoriseTransType = authoriseTransType;
		authoriseTransType = newAuthoriseTransType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE, oldAuthoriseTransType, authoriseTransType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthoriseUrl() {
		return authoriseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthoriseUrl(String newAuthoriseUrl) {
		String oldAuthoriseUrl = authoriseUrl;
		authoriseUrl = newAuthoriseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL, oldAuthoriseUrl, authoriseUrl));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductionHost() {
		return productionHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionHost(String newProductionHost) {
		String oldProductionHost = productionHost;
		productionHost = newProductionHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST, oldProductionHost, productionHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolVersion(String newProtocolVersion) {
		String oldProtocolVersion = protocolVersion;
		protocolVersion = newProtocolVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION, oldProtocolVersion, protocolVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRefundUrl() {
		return refundUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefundUrl(String newRefundUrl) {
		String oldRefundUrl = refundUrl;
		refundUrl = newRefundUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL, oldRefundUrl, refundUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleaseTransType() {
		return releaseTransType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseTransType(String newReleaseTransType) {
		String oldReleaseTransType = releaseTransType;
		releaseTransType = newReleaseTransType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE, oldReleaseTransType, releaseTransType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleaseUrl() {
		return releaseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseUrl(String newReleaseUrl) {
		String oldReleaseUrl = releaseUrl;
		releaseUrl = newReleaseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL, oldReleaseUrl, releaseUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSagePayMode() {
		return sagePayMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSagePayMode(String newSagePayMode) {
		String oldSagePayMode = sagePayMode;
		sagePayMode = newSagePayMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE, oldSagePayMode, sagePayMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestingHost() {
		return testingHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestingHost(String newTestingHost) {
		String oldTestingHost = testingHost;
		testingHost = newTestingHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST, oldTestingHost, testingHost));
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
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVoidUrl() {
		return voidUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoidUrl(String newVoidUrl) {
		String oldVoidUrl = voidUrl;
		voidUrl = newVoidUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VOID_URL, oldVoidUrl, voidUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE:
				return getAuthenticationTransType();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL:
				return getAuthenticationUrl();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE:
				return getAuthoriseTransType();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL:
				return getAuthoriseUrl();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST:
				return getProductionHost();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION:
				return getProtocolVersion();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL:
				return getRefundUrl();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE:
				return getReleaseTransType();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL:
				return getReleaseUrl();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE:
				return getSagePayMode();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST:
				return getTestingHost();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VENDOR:
				return getVendor();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VOID_URL:
				return getVoidUrl();
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE:
				setAuthenticationTransType((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL:
				setAuthenticationUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE:
				setAuthoriseTransType((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL:
				setAuthoriseUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST:
				setProductionHost((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION:
				setProtocolVersion((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL:
				setRefundUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE:
				setReleaseTransType((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL:
				setReleaseUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE:
				setSagePayMode((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST:
				setTestingHost((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VENDOR:
				setVendor((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VOID_URL:
				setVoidUrl((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE:
				setAuthenticationTransType(AUTHENTICATION_TRANS_TYPE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL:
				setAuthenticationUrl(AUTHENTICATION_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE:
				setAuthoriseTransType(AUTHORISE_TRANS_TYPE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL:
				setAuthoriseUrl(AUTHORISE_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST:
				setProductionHost(PRODUCTION_HOST_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION:
				setProtocolVersion(PROTOCOL_VERSION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL:
				setRefundUrl(REFUND_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE:
				setReleaseTransType(RELEASE_TRANS_TYPE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL:
				setReleaseUrl(RELEASE_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE:
				setSagePayMode(SAGE_PAY_MODE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST:
				setTestingHost(TESTING_HOST_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VOID_URL:
				setVoidUrl(VOID_URL_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_TRANS_TYPE:
				return AUTHENTICATION_TRANS_TYPE_EDEFAULT == null ? authenticationTransType != null : !AUTHENTICATION_TRANS_TYPE_EDEFAULT.equals(authenticationTransType);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHENTICATION_URL:
				return AUTHENTICATION_URL_EDEFAULT == null ? authenticationUrl != null : !AUTHENTICATION_URL_EDEFAULT.equals(authenticationUrl);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_TRANS_TYPE:
				return AUTHORISE_TRANS_TYPE_EDEFAULT == null ? authoriseTransType != null : !AUTHORISE_TRANS_TYPE_EDEFAULT.equals(authoriseTransType);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__AUTHORISE_URL:
				return AUTHORISE_URL_EDEFAULT == null ? authoriseUrl != null : !AUTHORISE_URL_EDEFAULT.equals(authoriseUrl);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PRODUCTION_HOST:
				return PRODUCTION_HOST_EDEFAULT == null ? productionHost != null : !PRODUCTION_HOST_EDEFAULT.equals(productionHost);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PROTOCOL_VERSION:
				return PROTOCOL_VERSION_EDEFAULT == null ? protocolVersion != null : !PROTOCOL_VERSION_EDEFAULT.equals(protocolVersion);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__REFUND_URL:
				return REFUND_URL_EDEFAULT == null ? refundUrl != null : !REFUND_URL_EDEFAULT.equals(refundUrl);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_TRANS_TYPE:
				return RELEASE_TRANS_TYPE_EDEFAULT == null ? releaseTransType != null : !RELEASE_TRANS_TYPE_EDEFAULT.equals(releaseTransType);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__RELEASE_URL:
				return RELEASE_URL_EDEFAULT == null ? releaseUrl != null : !RELEASE_URL_EDEFAULT.equals(releaseUrl);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__SAGE_PAY_MODE:
				return SAGE_PAY_MODE_EDEFAULT == null ? sagePayMode != null : !SAGE_PAY_MODE_EDEFAULT.equals(sagePayMode);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__TESTING_HOST:
				return TESTING_HOST_EDEFAULT == null ? testingHost != null : !TESTING_HOST_EDEFAULT.equals(testingHost);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__VOID_URL:
				return VOID_URL_EDEFAULT == null ? voidUrl != null : !VOID_URL_EDEFAULT.equals(voidUrl);
			case PaymentPackage.PAYMENT_GATEWAY_SAGE_PAY__PAYMENT_GATEWAY_CONFIG_ID:
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
		result.append(" (authenticationTransType: ");
		result.append(authenticationTransType);
		result.append(", authenticationUrl: ");
		result.append(authenticationUrl);
		result.append(", authoriseTransType: ");
		result.append(authoriseTransType);
		result.append(", authoriseUrl: ");
		result.append(authoriseUrl);
		result.append(", productionHost: ");
		result.append(productionHost);
		result.append(", protocolVersion: ");
		result.append(protocolVersion);
		result.append(", refundUrl: ");
		result.append(refundUrl);
		result.append(", releaseTransType: ");
		result.append(releaseTransType);
		result.append(", releaseUrl: ");
		result.append(releaseUrl);
		result.append(", sagePayMode: ");
		result.append(sagePayMode);
		result.append(", testingHost: ");
		result.append(testingHost);
		result.append(", vendor: ");
		result.append(vendor);
		result.append(", voidUrl: ");
		result.append(voidUrl);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewaySagePayImpl
