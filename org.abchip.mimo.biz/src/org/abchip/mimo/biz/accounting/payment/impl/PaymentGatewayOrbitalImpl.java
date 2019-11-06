/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Orbital</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayOrbitalImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
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
	 * The default value of the '{@link #getAuthorizationURI() <em>Authorization URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationURI()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthorizationURI() <em>Authorization URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationURI()
	 * @generated
	 * @ordered
	 */
	protected String authorizationURI = AUTHORIZATION_URI_EDEFAULT;
	/**
	 * The default value of the '{@link #getConnectionPassword() <em>Connection Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getConnectionPassword() <em>Connection Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPassword()
	 * @generated
	 * @ordered
	 */
	protected String connectionPassword = CONNECTION_PASSWORD_EDEFAULT;
	/**
	 * The default value of the '{@link #getConnectionTimeoutSeconds() <em>Connection Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeoutSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final long CONNECTION_TIMEOUT_SECONDS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getConnectionTimeoutSeconds() <em>Connection Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeoutSeconds()
	 * @generated
	 * @ordered
	 */
	protected long connectionTimeoutSeconds = CONNECTION_TIMEOUT_SECONDS_EDEFAULT;
	/**
	 * The default value of the '{@link #getEngineClass() <em>Engine Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ENGINE_CLASS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEngineClass() <em>Engine Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngineClass()
	 * @generated
	 * @ordered
	 */
	protected String engineClass = ENGINE_CLASS_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHostName() <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName()
	 * @generated
	 * @ordered
	 */
	protected String hostName = HOST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getHostNameFailover() <em>Host Name Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostNameFailover()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_NAME_FAILOVER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getHostNameFailover() <em>Host Name Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostNameFailover()
	 * @generated
	 * @ordered
	 */
	protected String hostNameFailover = HOST_NAME_FAILOVER_EDEFAULT;
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
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final long PORT_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected long port = PORT_EDEFAULT;
	/**
	 * The default value of the '{@link #getPortFailover() <em>Port Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortFailover()
	 * @generated
	 * @ordered
	 */
	protected static final long PORT_FAILOVER_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getPortFailover() <em>Port Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortFailover()
	 * @generated
	 * @ordered
	 */
	protected long portFailover = PORT_FAILOVER_EDEFAULT;
	/**
	 * The default value of the '{@link #getReadTimeoutSeconds() <em>Read Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTimeoutSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final long READ_TIMEOUT_SECONDS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getReadTimeoutSeconds() <em>Read Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadTimeoutSeconds()
	 * @generated
	 * @ordered
	 */
	protected long readTimeoutSeconds = READ_TIMEOUT_SECONDS_EDEFAULT;
	/**
	 * The default value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getResponseType() <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseType()
	 * @generated
	 * @ordered
	 */
	protected String responseType = RESPONSE_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSdkVersion() <em>Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SDK_VERSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSdkVersion() <em>Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdkVersion()
	 * @generated
	 * @ordered
	 */
	protected String sdkVersion = SDK_VERSION_EDEFAULT;
	/**
	 * The default value of the '{@link #getSslSocketFactory() <em>Ssl Socket Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslSocketFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String SSL_SOCKET_FACTORY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSslSocketFactory() <em>Ssl Socket Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSslSocketFactory()
	 * @generated
	 * @ordered
	 */
	protected String sslSocketFactory = SSL_SOCKET_FACTORY_EDEFAULT;
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;
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
		return authorizationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationURI(String newAuthorizationURI) {
		authorizationURI = newAuthorizationURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectionPassword() {
		return connectionPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionPassword(String newConnectionPassword) {
		connectionPassword = newConnectionPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectionTimeoutSeconds() {
		return connectionTimeoutSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionTimeoutSeconds(long newConnectionTimeoutSeconds) {
		connectionTimeoutSeconds = newConnectionTimeoutSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEngineClass() {
		return engineClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEngineClass(String newEngineClass) {
		engineClass = newEngineClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostName() {
		return hostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostName(String newHostName) {
		hostName = newHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostNameFailover() {
		return hostNameFailover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostNameFailover(String newHostNameFailover) {
		hostNameFailover = newHostNameFailover;
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
		merchantId = newMerchantId;
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
	public long getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPort(long newPort) {
		port = newPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPortFailover() {
		return portFailover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortFailover(long newPortFailover) {
		portFailover = newPortFailover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getReadTimeoutSeconds() {
		return readTimeoutSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadTimeoutSeconds(long newReadTimeoutSeconds) {
		readTimeoutSeconds = newReadTimeoutSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseType() {
		return responseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseType(String newResponseType) {
		responseType = newResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSdkVersion() {
		return sdkVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSdkVersion(String newSdkVersion) {
		sdkVersion = newSdkVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSslSocketFactory() {
		return sslSocketFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSslSocketFactory(String newSslSocketFactory) {
		sslSocketFactory = newSslSocketFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		username = newUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI:
				return getAuthorizationURI();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD:
				return getConnectionPassword();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS:
				return getConnectionTimeoutSeconds();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS:
				return getEngineClass();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME:
				return getHostName();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER:
				return getHostNameFailover();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID:
				return getMerchantId();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT:
				return getPort();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER:
				return getPortFailover();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS:
				return getReadTimeoutSeconds();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE:
				return getResponseType();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SDK_VERSION:
				return getSdkVersion();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY:
				return getSslSocketFactory();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__USERNAME:
				return getUsername();
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI:
				setAuthorizationURI((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD:
				setConnectionPassword((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS:
				setConnectionTimeoutSeconds((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS:
				setEngineClass((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME:
				setHostName((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER:
				setHostNameFailover((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID:
				setMerchantId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT:
				setPort((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER:
				setPortFailover((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS:
				setReadTimeoutSeconds((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE:
				setResponseType((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SDK_VERSION:
				setSdkVersion((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY:
				setSslSocketFactory((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__USERNAME:
				setUsername((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI:
				setAuthorizationURI(AUTHORIZATION_URI_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD:
				setConnectionPassword(CONNECTION_PASSWORD_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS:
				setConnectionTimeoutSeconds(CONNECTION_TIMEOUT_SECONDS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS:
				setEngineClass(ENGINE_CLASS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME:
				setHostName(HOST_NAME_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER:
				setHostNameFailover(HOST_NAME_FAILOVER_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID:
				setMerchantId(MERCHANT_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER:
				setPortFailover(PORT_FAILOVER_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS:
				setReadTimeoutSeconds(READ_TIMEOUT_SECONDS_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE:
				setResponseType(RESPONSE_TYPE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SDK_VERSION:
				setSdkVersion(SDK_VERSION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY:
				setSslSocketFactory(SSL_SOCKET_FACTORY_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID:
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
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__AUTHORIZATION_URI:
				return AUTHORIZATION_URI_EDEFAULT == null ? authorizationURI != null : !AUTHORIZATION_URI_EDEFAULT.equals(authorizationURI);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_PASSWORD:
				return CONNECTION_PASSWORD_EDEFAULT == null ? connectionPassword != null : !CONNECTION_PASSWORD_EDEFAULT.equals(connectionPassword);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__CONNECTION_TIMEOUT_SECONDS:
				return connectionTimeoutSeconds != CONNECTION_TIMEOUT_SECONDS_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__ENGINE_CLASS:
				return ENGINE_CLASS_EDEFAULT == null ? engineClass != null : !ENGINE_CLASS_EDEFAULT.equals(engineClass);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME:
				return HOST_NAME_EDEFAULT == null ? hostName != null : !HOST_NAME_EDEFAULT.equals(hostName);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__HOST_NAME_FAILOVER:
				return HOST_NAME_FAILOVER_EDEFAULT == null ? hostNameFailover != null : !HOST_NAME_FAILOVER_EDEFAULT.equals(hostNameFailover);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__MERCHANT_ID:
				return MERCHANT_ID_EDEFAULT == null ? merchantId != null : !MERCHANT_ID_EDEFAULT.equals(merchantId);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT:
				return port != PORT_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PORT_FAILOVER:
				return portFailover != PORT_FAILOVER_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__READ_TIMEOUT_SECONDS:
				return readTimeoutSeconds != READ_TIMEOUT_SECONDS_EDEFAULT;
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__RESPONSE_TYPE:
				return RESPONSE_TYPE_EDEFAULT == null ? responseType != null : !RESPONSE_TYPE_EDEFAULT.equals(responseType);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SDK_VERSION:
				return SDK_VERSION_EDEFAULT == null ? sdkVersion != null : !SDK_VERSION_EDEFAULT.equals(sdkVersion);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__SSL_SOCKET_FACTORY:
				return SSL_SOCKET_FACTORY_EDEFAULT == null ? sslSocketFactory != null : !SSL_SOCKET_FACTORY_EDEFAULT.equals(sslSocketFactory);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case PaymentPackage.PAYMENT_GATEWAY_ORBITAL__PAYMENT_GATEWAY_CONFIG_ID:
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
		result.append(" (authorizationURI: ");
		result.append(authorizationURI);
		result.append(", connectionPassword: ");
		result.append(connectionPassword);
		result.append(", connectionTimeoutSeconds: ");
		result.append(connectionTimeoutSeconds);
		result.append(", engineClass: ");
		result.append(engineClass);
		result.append(", hostName: ");
		result.append(hostName);
		result.append(", hostNameFailover: ");
		result.append(hostNameFailover);
		result.append(", merchantId: ");
		result.append(merchantId);
		result.append(", port: ");
		result.append(port);
		result.append(", portFailover: ");
		result.append(portFailover);
		result.append(", readTimeoutSeconds: ");
		result.append(readTimeoutSeconds);
		result.append(", responseType: ");
		result.append(responseType);
		result.append(", sdkVersion: ");
		result.append(sdkVersion);
		result.append(", sslSocketFactory: ");
		result.append(sslSocketFactory);
		result.append(", username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayOrbitalImpl
