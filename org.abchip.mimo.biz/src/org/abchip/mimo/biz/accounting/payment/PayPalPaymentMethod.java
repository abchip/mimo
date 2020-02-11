/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.contact.ContactMech;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pay Pal Payment Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsAddr <em>Avs Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsZip <em>Avs Zip</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getCorrelationId <em>Correlation Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getExpressCheckoutToken <em>Express Checkout Token</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerId <em>Payer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerStatus <em>Payer Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getTransactionId <em>Transaction Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod()
 * @model annotation="mimo-ent-frame help='PayPal Payment Method Details'"
 * @generated
 */
public interface PayPalPaymentMethod extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' reference.
	 * @see #setContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_ContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Id</em>' attribute.
	 * @see #setCorrelationId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_CorrelationId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getCorrelationId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getCorrelationId <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Id</em>' attribute.
	 * @see #getCorrelationId()
	 * @generated
	 */
	void setCorrelationId(String value);

	/**
	 * Returns the value of the '<em><b>Express Checkout Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Express Checkout Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Express Checkout Token</em>' attribute.
	 * @see #setExpressCheckoutToken(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_ExpressCheckoutToken()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getExpressCheckoutToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getExpressCheckoutToken <em>Express Checkout Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Express Checkout Token</em>' attribute.
	 * @see #getExpressCheckoutToken()
	 * @generated
	 */
	void setExpressCheckoutToken(String value);

	/**
	 * Returns the value of the '<em><b>Payer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payer Id</em>' attribute.
	 * @see #setPayerId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_PayerId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPayerId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerId <em>Payer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payer Id</em>' attribute.
	 * @see #getPayerId()
	 * @generated
	 */
	void setPayerId(String value);

	/**
	 * Returns the value of the '<em><b>Payer Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payer Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payer Status</em>' attribute.
	 * @see #setPayerStatus(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_PayerStatus()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getPayerStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPayerStatus <em>Payer Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payer Status</em>' attribute.
	 * @see #getPayerStatus()
	 * @generated
	 */
	void setPayerStatus(String value);

	/**
	 * Returns the value of the '<em><b>Payment Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Method Id</em>' attribute.
	 * @see #setPaymentMethodId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_PaymentMethodId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getPaymentMethodId <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' attribute.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Avs Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avs Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avs Addr</em>' attribute.
	 * @see #setAvsAddr(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_AvsAddr()
	 * @model
	 * @generated
	 */
	boolean isAvsAddr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsAddr <em>Avs Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avs Addr</em>' attribute.
	 * @see #isAvsAddr()
	 * @generated
	 */
	void setAvsAddr(boolean value);

	/**
	 * Returns the value of the '<em><b>Avs Zip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avs Zip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avs Zip</em>' attribute.
	 * @see #setAvsZip(boolean)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_AvsZip()
	 * @model
	 * @generated
	 */
	boolean isAvsZip();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#isAvsZip <em>Avs Zip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avs Zip</em>' attribute.
	 * @see #isAvsZip()
	 * @generated
	 */
	void setAvsZip(boolean value);

	/**
	 * Returns the value of the '<em><b>Transaction Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Id</em>' attribute.
	 * @see #setTransactionId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getPayPalPaymentMethod_TransactionId()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getTransactionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.PayPalPaymentMethod#getTransactionId <em>Transaction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Id</em>' attribute.
	 * @see #getTransactionId()
	 * @generated
	 */
	void setTransactionId(String value);

} // PayPalPaymentMethod
