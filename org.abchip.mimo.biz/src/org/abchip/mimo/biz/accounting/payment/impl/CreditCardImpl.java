/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.payment.CreditCard;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getCardType <em>Card Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getCompanyNameOnCard <em>Company Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getConsecutiveFailedAuths <em>Consecutive Failed Auths</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getConsecutiveFailedNsf <em>Consecutive Failed Nsf</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getFirstNameOnCard <em>First Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getIssueNumber <em>Issue Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getLastFailedAuthDate <em>Last Failed Auth Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getLastFailedNsfDate <em>Last Failed Nsf Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getLastNameOnCard <em>Last Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getMiddleNameOnCard <em>Middle Name On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getSuffixOnCard <em>Suffix On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getTitleOnCard <em>Title On Card</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getValidFromDate <em>Valid From Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreditCardImpl extends PaymentMethodImpl implements CreditCard {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.CREDIT_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardNumber() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__CARD_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardNumber(String newCardNumber) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__CARD_NUMBER, newCardNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardType() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__CARD_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardType(String newCardType) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__CARD_TYPE, newCardType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyNameOnCard() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__COMPANY_NAME_ON_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyNameOnCard(String newCompanyNameOnCard) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__COMPANY_NAME_ON_CARD, newCompanyNameOnCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConsecutiveFailedAuths() {
		return (Long)eGet(PaymentPackage.Literals.CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsecutiveFailedAuths(long newConsecutiveFailedAuths) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS, newConsecutiveFailedAuths);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConsecutiveFailedNsf() {
		return (Long)eGet(PaymentPackage.Literals.CREDIT_CARD__CONSECUTIVE_FAILED_NSF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsecutiveFailedNsf(long newConsecutiveFailedNsf) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__CONSECUTIVE_FAILED_NSF, newConsecutiveFailedNsf);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		return (ContactMech)eGet(PaymentPackage.Literals.CREDIT_CARD__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpireDate() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__EXPIRE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpireDate(String newExpireDate) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__EXPIRE_DATE, newExpireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstNameOnCard() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__FIRST_NAME_ON_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstNameOnCard(String newFirstNameOnCard) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__FIRST_NAME_ON_CARD, newFirstNameOnCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueNumber() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__ISSUE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueNumber(String newIssueNumber) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__ISSUE_NUMBER, newIssueNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastFailedAuthDate() {
		return (Date)eGet(PaymentPackage.Literals.CREDIT_CARD__LAST_FAILED_AUTH_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastFailedAuthDate(Date newLastFailedAuthDate) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__LAST_FAILED_AUTH_DATE, newLastFailedAuthDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastFailedNsfDate() {
		return (Date)eGet(PaymentPackage.Literals.CREDIT_CARD__LAST_FAILED_NSF_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastFailedNsfDate(Date newLastFailedNsfDate) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__LAST_FAILED_NSF_DATE, newLastFailedNsfDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastNameOnCard() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__LAST_NAME_ON_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastNameOnCard(String newLastNameOnCard) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__LAST_NAME_ON_CARD, newLastNameOnCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleNameOnCard() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__MIDDLE_NAME_ON_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleNameOnCard(String newMiddleNameOnCard) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__MIDDLE_NAME_ON_CARD, newMiddleNameOnCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffixOnCard() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__SUFFIX_ON_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffixOnCard(String newSuffixOnCard) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__SUFFIX_ON_CARD, newSuffixOnCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleOnCard() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__TITLE_ON_CARD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleOnCard(String newTitleOnCard) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__TITLE_ON_CARD, newTitleOnCard);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidFromDate() {
		return (String)eGet(PaymentPackage.Literals.CREDIT_CARD__VALID_FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFromDate(String newValidFromDate) {
		eSet(PaymentPackage.Literals.CREDIT_CARD__VALID_FROM_DATE, newValidFromDate);
	}

} //CreditCardImpl
