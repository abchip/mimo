/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.AuthMode;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getAuthMode <em>Auth Mode</em>}</li>
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
 * @model annotation="mimo-ent-frame title='RBS WorldPay Payment Gateway Config'"
 * @generated
 */
public interface PaymentGatewayWorldPay extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Auth Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.biz.accounting.AuthMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Mode</em>' attribute.
	 * @see org.abchip.mimo.biz.accounting.AuthMode
	 * @see #setAuthMode(AuthMode)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPaymentGatewayWorldPay_AuthMode()
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Authorization Mode (A: Full-Auth / E: Pre-Auth)'"
	 * @generated
	 */
	AuthMode getAuthMode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PaymentGatewayWorldPay#getAuthMode <em>Auth Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Mode</em>' attribute.
	 * @see org.abchip.mimo.biz.accounting.AuthMode
	 * @see #getAuthMode()
	 * @generated
	 */
	void setAuthMode(AuthMode value);

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
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Will displace contact info on WorldPay in non-editable format'"
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
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Will hide the contact info completely'"
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
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='This causes the currency drop down to be no hidden, so fixing the currency that the shopper must value purchase in'"
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
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Worldpay instance Id'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='The shopper\'s language choice, as a 2-character ISO 639 code, with optional regionalisation using 2-character country code separated by hyphen'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='This suppresses the display of the language menu if noLanguageMenu no you have a choice of languages enabled for your value installation'"
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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
	 * @model annotation="mimo-ent-slot help='Redirect URL'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='Test Mode (100: approve / 101: cancelled / 0: Live Mode (no test)'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
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
	 * @model required="true"
	 *        annotation="mimo-ent-slot help='Displays input fields for delivery address and withDelivery no mandate that they be filled in'"
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
