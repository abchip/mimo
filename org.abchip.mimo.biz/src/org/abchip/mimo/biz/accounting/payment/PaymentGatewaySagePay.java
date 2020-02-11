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
 * A representation of the model object '<em><b>Payment Gateway Sage Pay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationTransType <em>Authentication Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationUrl <em>Authentication Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseTransType <em>Authorise Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseUrl <em>Authorise Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProductionHost <em>Production Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProtocolVersion <em>Protocol Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getRefundUrl <em>Refund Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseTransType <em>Release Trans Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseUrl <em>Release Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getSagePayMode <em>Sage Pay Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getTestingHost <em>Testing Host</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVoidUrl <em>Void Url</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay()
 * @model annotation="mimo-ent-frame title='SagePay Payment Gateway Configuration'"
 * @generated
 */
public interface PaymentGatewaySagePay extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Authentication Trans Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Trans Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Trans Type</em>' attribute.
	 * @see #setAuthenticationTransType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_AuthenticationTransType()
	 * @model annotation="mimo-ent-slot help='Authentication type (PAYMENT/AUTHENTICATE/DEFERRED)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAuthenticationTransType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationTransType <em>Authentication Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Trans Type</em>' attribute.
	 * @see #getAuthenticationTransType()
	 * @generated
	 */
	void setAuthenticationTransType(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Url</em>' attribute.
	 * @see #setAuthenticationUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_AuthenticationUrl()
	 * @model annotation="mimo-ent-slot help='Authentication Url'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAuthenticationUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthenticationUrl <em>Authentication Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Url</em>' attribute.
	 * @see #getAuthenticationUrl()
	 * @generated
	 */
	void setAuthenticationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Authorise Trans Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorise Trans Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorise Trans Type</em>' attribute.
	 * @see #setAuthoriseTransType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_AuthoriseTransType()
	 * @model annotation="mimo-ent-slot help='Authorise type (AUTHORISE/RELEASE)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAuthoriseTransType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseTransType <em>Authorise Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorise Trans Type</em>' attribute.
	 * @see #getAuthoriseTransType()
	 * @generated
	 */
	void setAuthoriseTransType(String value);

	/**
	 * Returns the value of the '<em><b>Authorise Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorise Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorise Url</em>' attribute.
	 * @see #setAuthoriseUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_AuthoriseUrl()
	 * @model annotation="mimo-ent-slot help='Authorise url'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAuthoriseUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getAuthoriseUrl <em>Authorise Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorise Url</em>' attribute.
	 * @see #getAuthoriseUrl()
	 * @generated
	 */
	void setAuthoriseUrl(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_PaymentGatewayConfigId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Production Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Host</em>' attribute.
	 * @see #setProductionHost(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_ProductionHost()
	 * @model annotation="mimo-ent-slot help='Production Host'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getProductionHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProductionHost <em>Production Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Host</em>' attribute.
	 * @see #getProductionHost()
	 * @generated
	 */
	void setProductionHost(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Version</em>' attribute.
	 * @see #setProtocolVersion(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_ProtocolVersion()
	 * @model annotation="mimo-ent-slot help='Protocol Version'"
	 *        annotation="mimo-ent-format length='10'"
	 * @generated
	 */
	String getProtocolVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getProtocolVersion <em>Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Version</em>' attribute.
	 * @see #getProtocolVersion()
	 * @generated
	 */
	void setProtocolVersion(String value);

	/**
	 * Returns the value of the '<em><b>Refund Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refund Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refund Url</em>' attribute.
	 * @see #setRefundUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_RefundUrl()
	 * @model annotation="mimo-ent-slot help='Refund Url'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getRefundUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getRefundUrl <em>Refund Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refund Url</em>' attribute.
	 * @see #getRefundUrl()
	 * @generated
	 */
	void setRefundUrl(String value);

	/**
	 * Returns the value of the '<em><b>Release Trans Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Trans Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Trans Type</em>' attribute.
	 * @see #setReleaseTransType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_ReleaseTransType()
	 * @model annotation="mimo-ent-slot help='Release type (CANCEL/ABORT)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getReleaseTransType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseTransType <em>Release Trans Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Trans Type</em>' attribute.
	 * @see #getReleaseTransType()
	 * @generated
	 */
	void setReleaseTransType(String value);

	/**
	 * Returns the value of the '<em><b>Release Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Url</em>' attribute.
	 * @see #setReleaseUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_ReleaseUrl()
	 * @model annotation="mimo-ent-slot help='Release Url'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getReleaseUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getReleaseUrl <em>Release Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Url</em>' attribute.
	 * @see #getReleaseUrl()
	 * @generated
	 */
	void setReleaseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Sage Pay Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sage Pay Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sage Pay Mode</em>' attribute.
	 * @see #setSagePayMode(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_SagePayMode()
	 * @model annotation="mimo-ent-slot help='Mode (PRODUCTION/TEST)'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSagePayMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getSagePayMode <em>Sage Pay Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sage Pay Mode</em>' attribute.
	 * @see #getSagePayMode()
	 * @generated
	 */
	void setSagePayMode(String value);

	/**
	 * Returns the value of the '<em><b>Testing Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Host</em>' attribute.
	 * @see #setTestingHost(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_TestingHost()
	 * @model annotation="mimo-ent-slot help='Testing Host'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTestingHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getTestingHost <em>Testing Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Host</em>' attribute.
	 * @see #getTestingHost()
	 * @generated
	 */
	void setTestingHost(String value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_Vendor()
	 * @model annotation="mimo-ent-slot help='Vendor name'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getVendor();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(String value);

	/**
	 * Returns the value of the '<em><b>Void Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Void Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Void Url</em>' attribute.
	 * @see #setVoidUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewaySagePay_VoidUrl()
	 * @model annotation="mimo-ent-slot help='Void Url'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getVoidUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewaySagePay#getVoidUrl <em>Void Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Void Url</em>' attribute.
	 * @see #getVoidUrl()
	 * @generated
	 */
	void setVoidUrl(String value);

} // PaymentGatewaySagePay
