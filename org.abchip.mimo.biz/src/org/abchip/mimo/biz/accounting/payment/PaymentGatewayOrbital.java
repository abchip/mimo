/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Gateway Orbital</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getAuthorizationURI <em>Authorization URI</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionPassword <em>Connection Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionTimeoutSeconds <em>Connection Timeout Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getEngineClass <em>Engine Class</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostName <em>Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostNameFailover <em>Host Name Failover</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPortFailover <em>Port Failover</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getReadTimeoutSeconds <em>Read Timeout Seconds</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getResponseType <em>Response Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSdkVersion <em>Sdk Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSslSocketFactory <em>Ssl Socket Factory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital()
 * @model
 * @generated
 */
public interface PaymentGatewayOrbital extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Authorization URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization URI</em>' attribute.
	 * @see #setAuthorizationURI(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_AuthorizationURI()
	 * @model
	 * @generated
	 */
	String getAuthorizationURI();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getAuthorizationURI <em>Authorization URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization URI</em>' attribute.
	 * @see #getAuthorizationURI()
	 * @generated
	 */
	void setAuthorizationURI(String value);

	/**
	 * Returns the value of the '<em><b>Connection Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Password</em>' attribute.
	 * @see #setConnectionPassword(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_ConnectionPassword()
	 * @model
	 * @generated
	 */
	String getConnectionPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionPassword <em>Connection Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Password</em>' attribute.
	 * @see #getConnectionPassword()
	 * @generated
	 */
	void setConnectionPassword(String value);

	/**
	 * Returns the value of the '<em><b>Connection Timeout Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Timeout Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Timeout Seconds</em>' attribute.
	 * @see #setConnectionTimeoutSeconds(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_ConnectionTimeoutSeconds()
	 * @model
	 * @generated
	 */
	long getConnectionTimeoutSeconds();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getConnectionTimeoutSeconds <em>Connection Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Timeout Seconds</em>' attribute.
	 * @see #getConnectionTimeoutSeconds()
	 * @generated
	 */
	void setConnectionTimeoutSeconds(long value);

	/**
	 * Returns the value of the '<em><b>Engine Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Class</em>' attribute.
	 * @see #setEngineClass(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_EngineClass()
	 * @model
	 * @generated
	 */
	String getEngineClass();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getEngineClass <em>Engine Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Class</em>' attribute.
	 * @see #getEngineClass()
	 * @generated
	 */
	void setEngineClass(String value);

	/**
	 * Returns the value of the '<em><b>Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Name</em>' attribute.
	 * @see #setHostName(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_HostName()
	 * @model
	 * @generated
	 */
	String getHostName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostName <em>Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name</em>' attribute.
	 * @see #getHostName()
	 * @generated
	 */
	void setHostName(String value);

	/**
	 * Returns the value of the '<em><b>Host Name Failover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Name Failover</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Name Failover</em>' attribute.
	 * @see #setHostNameFailover(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_HostNameFailover()
	 * @model
	 * @generated
	 */
	String getHostNameFailover();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getHostNameFailover <em>Host Name Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Name Failover</em>' attribute.
	 * @see #getHostNameFailover()
	 * @generated
	 */
	void setHostNameFailover(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_MerchantId()
	 * @model
	 * @generated
	 */
	String getMerchantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getMerchantId <em>Merchant Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_PaymentGatewayConfigId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_Port()
	 * @model
	 * @generated
	 */
	long getPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(long value);

	/**
	 * Returns the value of the '<em><b>Port Failover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Failover</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Failover</em>' attribute.
	 * @see #setPortFailover(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_PortFailover()
	 * @model
	 * @generated
	 */
	long getPortFailover();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getPortFailover <em>Port Failover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Failover</em>' attribute.
	 * @see #getPortFailover()
	 * @generated
	 */
	void setPortFailover(long value);

	/**
	 * Returns the value of the '<em><b>Read Timeout Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Timeout Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Timeout Seconds</em>' attribute.
	 * @see #setReadTimeoutSeconds(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_ReadTimeoutSeconds()
	 * @model
	 * @generated
	 */
	long getReadTimeoutSeconds();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getReadTimeoutSeconds <em>Read Timeout Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Timeout Seconds</em>' attribute.
	 * @see #getReadTimeoutSeconds()
	 * @generated
	 */
	void setReadTimeoutSeconds(long value);

	/**
	 * Returns the value of the '<em><b>Response Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Type</em>' attribute.
	 * @see #setResponseType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_ResponseType()
	 * @model
	 * @generated
	 */
	String getResponseType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getResponseType <em>Response Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Type</em>' attribute.
	 * @see #getResponseType()
	 * @generated
	 */
	void setResponseType(String value);

	/**
	 * Returns the value of the '<em><b>Sdk Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sdk Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdk Version</em>' attribute.
	 * @see #setSdkVersion(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_SdkVersion()
	 * @model
	 * @generated
	 */
	String getSdkVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSdkVersion <em>Sdk Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sdk Version</em>' attribute.
	 * @see #getSdkVersion()
	 * @generated
	 */
	void setSdkVersion(String value);

	/**
	 * Returns the value of the '<em><b>Ssl Socket Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssl SocketConfig Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Socket Factory</em>' attribute.
	 * @see #setSslSocketFactory(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_SslSocketFactory()
	 * @model
	 * @generated
	 */
	String getSslSocketFactory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getSslSocketFactory <em>Ssl Socket Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Socket Factory</em>' attribute.
	 * @see #getSslSocketFactory()
	 * @generated
	 */
	void setSslSocketFactory(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayOrbital_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayOrbital#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // PaymentGatewayOrbital
