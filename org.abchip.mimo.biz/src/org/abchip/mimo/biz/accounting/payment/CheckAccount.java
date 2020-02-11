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
 * A representation of the model object '<em><b>Check Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getCompanyNameOnAccount <em>Company Name On Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getNameOnAccount <em>Name On Account</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getRoutingNumber <em>Routing Number</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount()
 * @model annotation="mimo-ent-frame title='Check Information'"
 * @generated
 */
public interface CheckAccount extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Number</em>' attribute.
	 * @see #setAccountNumber(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_AccountNumber()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccountNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountNumber <em>Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Number</em>' attribute.
	 * @see #getAccountNumber()
	 * @generated
	 */
	void setAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Account Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Type</em>' attribute.
	 * @see #setAccountType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_AccountType()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAccountType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getAccountType <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Type</em>' attribute.
	 * @see #getAccountType()
	 * @generated
	 */
	void setAccountType(String value);

	/**
	 * Returns the value of the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Name</em>' attribute.
	 * @see #setBankName(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_BankName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getBankName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getBankName <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Name</em>' attribute.
	 * @see #getBankName()
	 * @generated
	 */
	void setBankName(String value);

	/**
	 * Returns the value of the '<em><b>Branch Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Code</em>' attribute.
	 * @see #setBranchCode(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_BranchCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getBranchCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getBranchCode <em>Branch Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Code</em>' attribute.
	 * @see #getBranchCode()
	 * @generated
	 */
	void setBranchCode(String value);

	/**
	 * Returns the value of the '<em><b>Company Name On Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name On Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name On Account</em>' attribute.
	 * @see #setCompanyNameOnAccount(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_CompanyNameOnAccount()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getCompanyNameOnAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getCompanyNameOnAccount <em>Company Name On Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name On Account</em>' attribute.
	 * @see #getCompanyNameOnAccount()
	 * @generated
	 */
	void setCompanyNameOnAccount(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_ContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Name On Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name On Account</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name On Account</em>' attribute.
	 * @see #setNameOnAccount(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_NameOnAccount()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getNameOnAccount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getNameOnAccount <em>Name On Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name On Account</em>' attribute.
	 * @see #getNameOnAccount()
	 * @generated
	 */
	void setNameOnAccount(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_PaymentMethodId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPaymentMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getPaymentMethodId <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Method Id</em>' attribute.
	 * @see #getPaymentMethodId()
	 * @generated
	 */
	void setPaymentMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Routing Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routing Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Number</em>' attribute.
	 * @see #setRoutingNumber(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCheckAccount_RoutingNumber()
	 * @model annotation="mimo-ent-slot help='See https://en.wikipedia.org/wiki/Bank_code'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getRoutingNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CheckAccount#getRoutingNumber <em>Routing Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Number</em>' attribute.
	 * @see #getRoutingNumber()
	 * @generated
	 */
	void setRoutingNumber(String value);

} // CheckAccount
