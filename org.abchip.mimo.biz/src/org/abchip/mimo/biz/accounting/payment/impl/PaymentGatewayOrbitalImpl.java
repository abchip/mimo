/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Orbital</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getAuthorizationURI <em>Authorization URI</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getConnectionPassword <em>Connection Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getConnectionTimeoutSeconds <em>Connection Timeout Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getEngineClass <em>Engine Class</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getHostName <em>Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getHostNameFailover <em>Host Name Failover</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getPortFailover <em>Port Failover</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getReadTimeoutSeconds <em>Read Timeout Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getSdkVersion <em>Sdk Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getSslSocketFactory <em>Ssl Socket Factory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayOrbitalImpl extends BizEntityImpl implements PaymentGatewayOrbital {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayOrbitalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorizationURI() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationURI(String newAuthorizationURI) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI, newAuthorizationURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectionPassword() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionPassword(String newConnectionPassword) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD, newConnectionPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectionTimeoutSeconds() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionTimeoutSeconds(long newConnectionTimeoutSeconds) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS, newConnectionTimeoutSeconds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngineClass() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineClass(String newEngineClass) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS, newEngineClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostName() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__HOST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostName(String newHostName) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__HOST_NAME, newHostName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostNameFailover() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostNameFailover(String newHostNameFailover) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER, newHostNameFailover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID, newMerchantId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPort() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(long newPort) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPortFailover() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortFailover(long newPortFailover) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER, newPortFailover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getReadTimeoutSeconds() {
		return (Long)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadTimeoutSeconds(long newReadTimeoutSeconds) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS, newReadTimeoutSeconds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseType() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseType(String newResponseType) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE, newResponseType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSdkVersion() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__SDK_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSdkVersion(String newSdkVersion) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__SDK_VERSION, newSdkVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSslSocketFactory() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSslSocketFactory(String newSslSocketFactory) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY, newSslSocketFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_ORBITAL__USERNAME, newUsername);
	}

} //PaymentGatewayOrbitalImpl
