/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.util.Date;
import org.abchip.mimo.biz.party.contact.ContactMech;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCardType <em>Card Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCompanyNameOnCard <em>Company Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedAuths <em>Consecutive Failed Auths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedNsf <em>Consecutive Failed Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getFirstNameOnCard <em>First Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getIssueNumber <em>Issue Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedAuthDate <em>Last Failed Auth Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedNsfDate <em>Last Failed Nsf Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastNameOnCard <em>Last Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getMiddleNameOnCard <em>Middle Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getSuffixOnCard <em>Suffix On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getTitleOnCard <em>Title On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getValidFromDate <em>Valid From Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard()
 * @model annotation="mimo-ent-frame title='Credit Card Information' formula='description'"
 * @generated
 */
public interface CreditCard extends PaymentMethod {
	/**
	 * Returns the value of the '<em><b>Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_CardNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format type='credit-card-number' length='255'"
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Type</em>' attribute.
	 * @see #setCardType(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_CardType()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCardType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCardType <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Type</em>' attribute.
	 * @see #getCardType()
	 * @generated
	 */
	void setCardType(String value);

	/**
	 * Returns the value of the '<em><b>Company Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name On Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name On Card</em>' attribute.
	 * @see #setCompanyNameOnCard(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_CompanyNameOnCard()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getCompanyNameOnCard();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getCompanyNameOnCard <em>Company Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name On Card</em>' attribute.
	 * @see #getCompanyNameOnCard()
	 * @generated
	 */
	void setCompanyNameOnCard(String value);

	/**
	 * Returns the value of the '<em><b>Consecutive Failed Auths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consecutive Failed Auths</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consecutive Failed Auths</em>' attribute.
	 * @see #setConsecutiveFailedAuths(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_ConsecutiveFailedAuths()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getConsecutiveFailedAuths();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedAuths <em>Consecutive Failed Auths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consecutive Failed Auths</em>' attribute.
	 * @see #getConsecutiveFailedAuths()
	 * @generated
	 */
	void setConsecutiveFailedAuths(long value);

	/**
	 * Returns the value of the '<em><b>Consecutive Failed Nsf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consecutive Failed Nsf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consecutive Failed Nsf</em>' attribute.
	 * @see #setConsecutiveFailedNsf(long)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_ConsecutiveFailedNsf()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getConsecutiveFailedNsf();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getConsecutiveFailedNsf <em>Consecutive Failed Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consecutive Failed Nsf</em>' attribute.
	 * @see #getConsecutiveFailedNsf()
	 * @generated
	 */
	void setConsecutiveFailedNsf(long value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_ContactMechId()
	 * @model keys="contactMechId"
	 *        annotation="mimo-ent-slot help='The Billing PostalAddress'"
	 * @generated
	 */
	ContactMech getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getContactMechId <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' reference.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Date</em>' attribute.
	 * @see #setExpireDate(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_ExpireDate()
	 * @model annotation="mimo-ent-format type='credit-card-date' length='7'"
	 * @generated
	 */
	String getExpireDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getExpireDate <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Date</em>' attribute.
	 * @see #getExpireDate()
	 * @generated
	 */
	void setExpireDate(String value);

	/**
	 * Returns the value of the '<em><b>First Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name On Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name On Card</em>' attribute.
	 * @see #setFirstNameOnCard(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_FirstNameOnCard()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getFirstNameOnCard();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getFirstNameOnCard <em>First Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name On Card</em>' attribute.
	 * @see #getFirstNameOnCard()
	 * @generated
	 */
	void setFirstNameOnCard(String value);

	/**
	 * Returns the value of the '<em><b>Issue Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Number</em>' attribute.
	 * @see #setIssueNumber(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_IssueNumber()
	 * @model annotation="mimo-ent-slot help='Single digit number on some Switch and Maestro cards'"
	 *        annotation="mimo-ent-format type='credit-card-date' length='7'"
	 * @generated
	 */
	String getIssueNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getIssueNumber <em>Issue Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Number</em>' attribute.
	 * @see #getIssueNumber()
	 * @generated
	 */
	void setIssueNumber(String value);

	/**
	 * Returns the value of the '<em><b>Last Failed Auth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Failed Auth Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Failed Auth Date</em>' attribute.
	 * @see #setLastFailedAuthDate(Date)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_LastFailedAuthDate()
	 * @model
	 * @generated
	 */
	Date getLastFailedAuthDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedAuthDate <em>Last Failed Auth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Failed Auth Date</em>' attribute.
	 * @see #getLastFailedAuthDate()
	 * @generated
	 */
	void setLastFailedAuthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Failed Nsf Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Failed Nsf Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Failed Nsf Date</em>' attribute.
	 * @see #setLastFailedNsfDate(Date)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_LastFailedNsfDate()
	 * @model
	 * @generated
	 */
	Date getLastFailedNsfDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastFailedNsfDate <em>Last Failed Nsf Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Failed Nsf Date</em>' attribute.
	 * @see #getLastFailedNsfDate()
	 * @generated
	 */
	void setLastFailedNsfDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name On Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name On Card</em>' attribute.
	 * @see #setLastNameOnCard(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_LastNameOnCard()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getLastNameOnCard();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getLastNameOnCard <em>Last Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name On Card</em>' attribute.
	 * @see #getLastNameOnCard()
	 * @generated
	 */
	void setLastNameOnCard(String value);

	/**
	 * Returns the value of the '<em><b>Middle Name On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Name On Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Name On Card</em>' attribute.
	 * @see #setMiddleNameOnCard(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_MiddleNameOnCard()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getMiddleNameOnCard();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getMiddleNameOnCard <em>Middle Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle Name On Card</em>' attribute.
	 * @see #getMiddleNameOnCard()
	 * @generated
	 */
	void setMiddleNameOnCard(String value);

	/**
	 * Returns the value of the '<em><b>Suffix On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix On Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix On Card</em>' attribute.
	 * @see #setSuffixOnCard(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_SuffixOnCard()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getSuffixOnCard();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getSuffixOnCard <em>Suffix On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix On Card</em>' attribute.
	 * @see #getSuffixOnCard()
	 * @generated
	 */
	void setSuffixOnCard(String value);

	/**
	 * Returns the value of the '<em><b>Title On Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title On Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title On Card</em>' attribute.
	 * @see #setTitleOnCard(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_TitleOnCard()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getTitleOnCard();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getTitleOnCard <em>Title On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title On Card</em>' attribute.
	 * @see #getTitleOnCard()
	 * @generated
	 */
	void setTitleOnCard(String value);

	/**
	 * Returns the value of the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From Date</em>' attribute.
	 * @see #setValidFromDate(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getCreditCard_ValidFromDate()
	 * @model annotation="mimo-ent-slot help='Not common in some parts of the world.'"
	 *        annotation="mimo-ent-format type='credit-card-date' length='7'"
	 * @generated
	 */
	String getValidFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.CreditCard#getValidFromDate <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From Date</em>' attribute.
	 * @see #getValidFromDate()
	 * @generated
	 */
	void setValidFromDate(String value);

} // CreditCard
