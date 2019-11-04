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
 * A representation of the model object '<em><b>Payment Gateway Authorize Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getApiVersion <em>Api Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCertificateAlias <em>Certificate Alias</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpDeviceType <em>Cp Device Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpMarketType <em>Cp Market Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpVersion <em>Cp Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimitedData <em>Delimited Data</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimiterChar <em>Delimiter Char</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDuplicateWindow <em>Duplicate Window</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailCustomer <em>Email Customer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailMerchant <em>Email Merchant</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getMethod <em>Method</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPwd <em>Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getRelayResponse <em>Relay Response</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTestMode <em>Test Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTranKey <em>Tran Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransDescription <em>Trans Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransactionUrl <em>Transaction Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getUserId <em>User Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet()
 * @model
 * @generated
 */
public interface PaymentGatewayAuthorizeNet extends BizEntity {
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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_ApiVersion()
	 * @model
	 * @generated
	 */
	String getApiVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getApiVersion <em>Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api Version</em>' attribute.
	 * @see #getApiVersion()
	 * @generated
	 */
	void setApiVersion(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Alias</em>' attribute.
	 * @see #setCertificateAlias(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_CertificateAlias()
	 * @model
	 * @generated
	 */
	String getCertificateAlias();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCertificateAlias <em>Certificate Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Alias</em>' attribute.
	 * @see #getCertificateAlias()
	 * @generated
	 */
	void setCertificateAlias(String value);

	/**
	 * Returns the value of the '<em><b>Cp Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp Device Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp Device Type</em>' attribute.
	 * @see #setCpDeviceType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_CpDeviceType()
	 * @model
	 * @generated
	 */
	String getCpDeviceType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpDeviceType <em>Cp Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp Device Type</em>' attribute.
	 * @see #getCpDeviceType()
	 * @generated
	 */
	void setCpDeviceType(String value);

	/**
	 * Returns the value of the '<em><b>Cp Market Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp Market Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp Market Type</em>' attribute.
	 * @see #setCpMarketType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_CpMarketType()
	 * @model
	 * @generated
	 */
	String getCpMarketType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpMarketType <em>Cp Market Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp Market Type</em>' attribute.
	 * @see #getCpMarketType()
	 * @generated
	 */
	void setCpMarketType(String value);

	/**
	 * Returns the value of the '<em><b>Cp Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp Version</em>' attribute.
	 * @see #setCpVersion(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_CpVersion()
	 * @model
	 * @generated
	 */
	String getCpVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getCpVersion <em>Cp Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp Version</em>' attribute.
	 * @see #getCpVersion()
	 * @generated
	 */
	void setCpVersion(String value);

	/**
	 * Returns the value of the '<em><b>Delimited Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimited Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimited Data</em>' attribute.
	 * @see #setDelimitedData(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_DelimitedData()
	 * @model
	 * @generated
	 */
	String getDelimitedData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimitedData <em>Delimited Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimited Data</em>' attribute.
	 * @see #getDelimitedData()
	 * @generated
	 */
	void setDelimitedData(String value);

	/**
	 * Returns the value of the '<em><b>Delimiter Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter Char</em>' attribute.
	 * @see #setDelimiterChar(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_DelimiterChar()
	 * @model
	 * @generated
	 */
	String getDelimiterChar();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDelimiterChar <em>Delimiter Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter Char</em>' attribute.
	 * @see #getDelimiterChar()
	 * @generated
	 */
	void setDelimiterChar(String value);

	/**
	 * Returns the value of the '<em><b>Duplicate Window</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duplicate Window</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicate Window</em>' attribute.
	 * @see #setDuplicateWindow(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_DuplicateWindow()
	 * @model
	 * @generated
	 */
	long getDuplicateWindow();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getDuplicateWindow <em>Duplicate Window</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duplicate Window</em>' attribute.
	 * @see #getDuplicateWindow()
	 * @generated
	 */
	void setDuplicateWindow(long value);

	/**
	 * Returns the value of the '<em><b>Email Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Customer</em>' attribute.
	 * @see #setEmailCustomer(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_EmailCustomer()
	 * @model
	 * @generated
	 */
	String getEmailCustomer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailCustomer <em>Email Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Customer</em>' attribute.
	 * @see #getEmailCustomer()
	 * @generated
	 */
	void setEmailCustomer(String value);

	/**
	 * Returns the value of the '<em><b>Email Merchant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email Merchant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Merchant</em>' attribute.
	 * @see #setEmailMerchant(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_EmailMerchant()
	 * @model
	 * @generated
	 */
	String getEmailMerchant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getEmailMerchant <em>Email Merchant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email Merchant</em>' attribute.
	 * @see #getEmailMerchant()
	 * @generated
	 */
	void setEmailMerchant(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_PaymentGatewayConfigId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_Pwd()
	 * @model
	 * @generated
	 */
	String getPwd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getPwd <em>Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwd</em>' attribute.
	 * @see #getPwd()
	 * @generated
	 */
	void setPwd(String value);

	/**
	 * Returns the value of the '<em><b>Relay Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relay Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relay Response</em>' attribute.
	 * @see #setRelayResponse(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_RelayResponse()
	 * @model
	 * @generated
	 */
	String getRelayResponse();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getRelayResponse <em>Relay Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relay Response</em>' attribute.
	 * @see #getRelayResponse()
	 * @generated
	 */
	void setRelayResponse(String value);

	/**
	 * Returns the value of the '<em><b>Test Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Mode</em>' attribute.
	 * @see #setTestMode(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_TestMode()
	 * @model
	 * @generated
	 */
	String getTestMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTestMode <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Mode</em>' attribute.
	 * @see #getTestMode()
	 * @generated
	 */
	void setTestMode(String value);

	/**
	 * Returns the value of the '<em><b>Tran Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tran Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tran Key</em>' attribute.
	 * @see #setTranKey(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_TranKey()
	 * @model
	 * @generated
	 */
	String getTranKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTranKey <em>Tran Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tran Key</em>' attribute.
	 * @see #getTranKey()
	 * @generated
	 */
	void setTranKey(String value);

	/**
	 * Returns the value of the '<em><b>Trans Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Description</em>' attribute.
	 * @see #setTransDescription(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_TransDescription()
	 * @model
	 * @generated
	 */
	String getTransDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransDescription <em>Trans Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Description</em>' attribute.
	 * @see #getTransDescription()
	 * @generated
	 */
	void setTransDescription(String value);

	/**
	 * Returns the value of the '<em><b>Transaction Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Url</em>' attribute.
	 * @see #setTransactionUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_TransactionUrl()
	 * @model
	 * @generated
	 */
	String getTransactionUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getTransactionUrl <em>Transaction Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Url</em>' attribute.
	 * @see #getTransactionUrl()
	 * @generated
	 */
	void setTransactionUrl(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayAuthorizeNet_UserId()
	 * @model
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayAuthorizeNet#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

} // PaymentGatewayAuthorizeNet
