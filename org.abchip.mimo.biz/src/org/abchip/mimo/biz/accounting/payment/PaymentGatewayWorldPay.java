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
 * A representation of the model object '<em><b>Payment Gateway World Pay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isAuthMode <em>Auth Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isFixContact <em>Fix Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideContact <em>Hide Contact</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideCurrency <em>Hide Currency</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getInstId <em>Inst Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getLangId <em>Lang Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isNoLanguageMenu <em>No Language Menu</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getTestMode <em>Test Mode</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isWithDelivery <em>With Delivery</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay()
 * @model
 * @generated
 */
public interface PaymentGatewayWorldPay extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Inst Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inst Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inst Id</em>' attribute.
	 * @see #setInstId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_InstId()
	 * @model
	 * @generated
	 */
	String getInstId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getInstId <em>Inst Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inst Id</em>' attribute.
	 * @see #getInstId()
	 * @generated
	 */
	void setInstId(String value);

	/**
	 * Returns the value of the '<em><b>Lang Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang Id</em>' attribute.
	 * @see #setLangId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_LangId()
	 * @model
	 * @generated
	 */
	String getLangId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getLangId <em>Lang Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Id</em>' attribute.
	 * @see #getLangId()
	 * @generated
	 */
	void setLangId(String value);

	/**
	 * Returns the value of the '<em><b>No Language Menu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Language Menu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Language Menu</em>' attribute.
	 * @see #setNoLanguageMenu(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_NoLanguageMenu()
	 * @model
	 * @generated
	 */
	boolean isNoLanguageMenu();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isNoLanguageMenu <em>No Language Menu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Language Menu</em>' attribute.
	 * @see #isNoLanguageMenu()
	 * @generated
	 */
	void setNoLanguageMenu(boolean value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_PaymentGatewayConfigId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayConfig'"
	 * @generated
	 */
	String getPaymentGatewayConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Gateway Config Id</em>' attribute.
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 */
	void setPaymentGatewayConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Auth Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Mode</em>' attribute.
	 * @see #setAuthMode(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_AuthMode()
	 * @model
	 * @generated
	 */
	boolean isAuthMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isAuthMode <em>Auth Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Mode</em>' attribute.
	 * @see #isAuthMode()
	 * @generated
	 */
	void setAuthMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Fix Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fix Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fix Contact</em>' attribute.
	 * @see #setFixContact(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_FixContact()
	 * @model
	 * @generated
	 */
	boolean isFixContact();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isFixContact <em>Fix Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fix Contact</em>' attribute.
	 * @see #isFixContact()
	 * @generated
	 */
	void setFixContact(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Contact</em>' attribute.
	 * @see #setHideContact(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_HideContact()
	 * @model
	 * @generated
	 */
	boolean isHideContact();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideContact <em>Hide Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Contact</em>' attribute.
	 * @see #isHideContact()
	 * @generated
	 */
	void setHideContact(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Currency</em>' attribute.
	 * @see #setHideCurrency(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_HideCurrency()
	 * @model
	 * @generated
	 */
	boolean isHideCurrency();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isHideCurrency <em>Hide Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Currency</em>' attribute.
	 * @see #isHideCurrency()
	 * @generated
	 */
	void setHideCurrency(boolean value);

	/**
	 * Returns the value of the '<em><b>Redirect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirect Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirect Url</em>' attribute.
	 * @see #setRedirectUrl(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_RedirectUrl()
	 * @model
	 * @generated
	 */
	String getRedirectUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getRedirectUrl <em>Redirect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirect Url</em>' attribute.
	 * @see #getRedirectUrl()
	 * @generated
	 */
	void setRedirectUrl(String value);

	/**
	 * Returns the value of the '<em><b>Test Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Mode</em>' attribute.
	 * @see #setTestMode(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_TestMode()
	 * @model
	 * @generated
	 */
	long getTestMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getTestMode <em>Test Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Mode</em>' attribute.
	 * @see #getTestMode()
	 * @generated
	 */
	void setTestMode(long value);

	/**
	 * Returns the value of the '<em><b>With Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Delivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Delivery</em>' attribute.
	 * @see #setWithDelivery(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_WithDelivery()
	 * @model
	 * @generated
	 */
	boolean isWithDelivery();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#isWithDelivery <em>With Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Delivery</em>' attribute.
	 * @see #isWithDelivery()
	 * @generated
	 */
	void setWithDelivery(boolean value);

} // PaymentGatewayWorldPay
