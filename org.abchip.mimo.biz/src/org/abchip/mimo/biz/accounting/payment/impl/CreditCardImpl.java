/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.CreditCardImpl#getContactMechId <em>Contact Mech Id</em>}</li>
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
	 * The default value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardNumber()
	 * @generated
	 * @ordered
	 */
	protected String cardNumber = CARD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardType() <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardType() <em>Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType()
	 * @generated
	 * @ordered
	 */
	protected String cardType = CARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyNameOnCard() <em>Company Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_ON_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyNameOnCard() <em>Company Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected String companyNameOnCard = COMPANY_NAME_ON_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsecutiveFailedAuths() <em>Consecutive Failed Auths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutiveFailedAuths()
	 * @generated
	 * @ordered
	 */
	protected static final long CONSECUTIVE_FAILED_AUTHS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConsecutiveFailedAuths() <em>Consecutive Failed Auths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutiveFailedAuths()
	 * @generated
	 * @ordered
	 */
	protected long consecutiveFailedAuths = CONSECUTIVE_FAILED_AUTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsecutiveFailedNsf() <em>Consecutive Failed Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutiveFailedNsf()
	 * @generated
	 * @ordered
	 */
	protected static final long CONSECUTIVE_FAILED_NSF_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConsecutiveFailedNsf() <em>Consecutive Failed Nsf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsecutiveFailedNsf()
	 * @generated
	 * @ordered
	 */
	protected long consecutiveFailedNsf = CONSECUTIVE_FAILED_NSF_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected String expireDate = EXPIRE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstNameOnCard() <em>First Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_ON_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstNameOnCard() <em>First Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected String firstNameOnCard = FIRST_NAME_ON_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueNumber() <em>Issue Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueNumber() <em>Issue Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueNumber()
	 * @generated
	 * @ordered
	 */
	protected String issueNumber = ISSUE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastFailedAuthDate() <em>Last Failed Auth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFailedAuthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_FAILED_AUTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastFailedAuthDate() <em>Last Failed Auth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFailedAuthDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastFailedAuthDate = LAST_FAILED_AUTH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastFailedNsfDate() <em>Last Failed Nsf Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFailedNsfDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_FAILED_NSF_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastFailedNsfDate() <em>Last Failed Nsf Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFailedNsfDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastFailedNsfDate = LAST_FAILED_NSF_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastNameOnCard() <em>Last Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_ON_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastNameOnCard() <em>Last Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected String lastNameOnCard = LAST_NAME_ON_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiddleNameOnCard() <em>Middle Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDDLE_NAME_ON_CARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiddleNameOnCard() <em>Middle Name On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleNameOnCard()
	 * @generated
	 * @ordered
	 */
	protected String middleNameOnCard = MIDDLE_NAME_ON_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuffixOnCard() <em>Suffix On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixOnCard()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_ON_CARD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSuffixOnCard() <em>Suffix On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixOnCard()
	 * @generated
	 * @ordered
	 */
	protected String suffixOnCard = SUFFIX_ON_CARD_EDEFAULT;
	/**
	 * The default value of the '{@link #getTitleOnCard() <em>Title On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOnCard()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_ON_CARD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitleOnCard() <em>Title On Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitleOnCard()
	 * @generated
	 * @ordered
	 */
	protected String titleOnCard = TITLE_ON_CARD_EDEFAULT;
	/**
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected String validFromDate = VALID_FROM_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech contactMechId;

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
		return cardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardNumber(String newCardNumber) {
		String oldCardNumber = cardNumber;
		cardNumber = newCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CARD_NUMBER, oldCardNumber, cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardType() {
		return cardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardType(String newCardType) {
		String oldCardType = cardType;
		cardType = newCardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CARD_TYPE, oldCardType, cardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyNameOnCard() {
		return companyNameOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyNameOnCard(String newCompanyNameOnCard) {
		String oldCompanyNameOnCard = companyNameOnCard;
		companyNameOnCard = newCompanyNameOnCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__COMPANY_NAME_ON_CARD, oldCompanyNameOnCard, companyNameOnCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConsecutiveFailedAuths() {
		return consecutiveFailedAuths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsecutiveFailedAuths(long newConsecutiveFailedAuths) {
		long oldConsecutiveFailedAuths = consecutiveFailedAuths;
		consecutiveFailedAuths = newConsecutiveFailedAuths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS, oldConsecutiveFailedAuths, consecutiveFailedAuths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConsecutiveFailedNsf() {
		return consecutiveFailedNsf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsecutiveFailedNsf(long newConsecutiveFailedNsf) {
		long oldConsecutiveFailedNsf = consecutiveFailedNsf;
		consecutiveFailedNsf = newConsecutiveFailedNsf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_NSF, oldConsecutiveFailedNsf, consecutiveFailedNsf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getContactMechId() {
		if (contactMechId != null && ((EObject)contactMechId).eIsProxy()) {
			InternalEObject oldContactMechId = (InternalEObject)contactMechId;
			contactMechId = (ContactMech)eResolveProxy(oldContactMechId);
			if (contactMechId != oldContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.CREDIT_CARD__CONTACT_MECH_ID, oldContactMechId, contactMechId));
			}
		}
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(ContactMech newContactMechId) {
		ContactMech oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__CONTACT_MECH_ID, oldContactMechId, contactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpireDate() {
		return expireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpireDate(String newExpireDate) {
		String oldExpireDate = expireDate;
		expireDate = newExpireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__EXPIRE_DATE, oldExpireDate, expireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstNameOnCard() {
		return firstNameOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstNameOnCard(String newFirstNameOnCard) {
		String oldFirstNameOnCard = firstNameOnCard;
		firstNameOnCard = newFirstNameOnCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__FIRST_NAME_ON_CARD, oldFirstNameOnCard, firstNameOnCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueNumber() {
		return issueNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueNumber(String newIssueNumber) {
		String oldIssueNumber = issueNumber;
		issueNumber = newIssueNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__ISSUE_NUMBER, oldIssueNumber, issueNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastFailedAuthDate() {
		return lastFailedAuthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastFailedAuthDate(Date newLastFailedAuthDate) {
		Date oldLastFailedAuthDate = lastFailedAuthDate;
		lastFailedAuthDate = newLastFailedAuthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__LAST_FAILED_AUTH_DATE, oldLastFailedAuthDate, lastFailedAuthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastFailedNsfDate() {
		return lastFailedNsfDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastFailedNsfDate(Date newLastFailedNsfDate) {
		Date oldLastFailedNsfDate = lastFailedNsfDate;
		lastFailedNsfDate = newLastFailedNsfDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__LAST_FAILED_NSF_DATE, oldLastFailedNsfDate, lastFailedNsfDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastNameOnCard() {
		return lastNameOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastNameOnCard(String newLastNameOnCard) {
		String oldLastNameOnCard = lastNameOnCard;
		lastNameOnCard = newLastNameOnCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__LAST_NAME_ON_CARD, oldLastNameOnCard, lastNameOnCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMiddleNameOnCard() {
		return middleNameOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiddleNameOnCard(String newMiddleNameOnCard) {
		String oldMiddleNameOnCard = middleNameOnCard;
		middleNameOnCard = newMiddleNameOnCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__MIDDLE_NAME_ON_CARD, oldMiddleNameOnCard, middleNameOnCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffixOnCard() {
		return suffixOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffixOnCard(String newSuffixOnCard) {
		String oldSuffixOnCard = suffixOnCard;
		suffixOnCard = newSuffixOnCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__SUFFIX_ON_CARD, oldSuffixOnCard, suffixOnCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleOnCard() {
		return titleOnCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleOnCard(String newTitleOnCard) {
		String oldTitleOnCard = titleOnCard;
		titleOnCard = newTitleOnCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__TITLE_ON_CARD, oldTitleOnCard, titleOnCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidFromDate(String newValidFromDate) {
		String oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.CREDIT_CARD__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				return getCardNumber();
			case PaymentPackage.CREDIT_CARD__CARD_TYPE:
				return getCardType();
			case PaymentPackage.CREDIT_CARD__COMPANY_NAME_ON_CARD:
				return getCompanyNameOnCard();
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS:
				return getConsecutiveFailedAuths();
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_NSF:
				return getConsecutiveFailedNsf();
			case PaymentPackage.CREDIT_CARD__EXPIRE_DATE:
				return getExpireDate();
			case PaymentPackage.CREDIT_CARD__FIRST_NAME_ON_CARD:
				return getFirstNameOnCard();
			case PaymentPackage.CREDIT_CARD__ISSUE_NUMBER:
				return getIssueNumber();
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_AUTH_DATE:
				return getLastFailedAuthDate();
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_NSF_DATE:
				return getLastFailedNsfDate();
			case PaymentPackage.CREDIT_CARD__LAST_NAME_ON_CARD:
				return getLastNameOnCard();
			case PaymentPackage.CREDIT_CARD__MIDDLE_NAME_ON_CARD:
				return getMiddleNameOnCard();
			case PaymentPackage.CREDIT_CARD__SUFFIX_ON_CARD:
				return getSuffixOnCard();
			case PaymentPackage.CREDIT_CARD__TITLE_ON_CARD:
				return getTitleOnCard();
			case PaymentPackage.CREDIT_CARD__VALID_FROM_DATE:
				return getValidFromDate();
			case PaymentPackage.CREDIT_CARD__CONTACT_MECH_ID:
				if (resolve) return getContactMechId();
				return basicGetContactMechId();
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
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__CARD_TYPE:
				setCardType((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__COMPANY_NAME_ON_CARD:
				setCompanyNameOnCard((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS:
				setConsecutiveFailedAuths((Long)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_NSF:
				setConsecutiveFailedNsf((Long)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__EXPIRE_DATE:
				setExpireDate((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__FIRST_NAME_ON_CARD:
				setFirstNameOnCard((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__ISSUE_NUMBER:
				setIssueNumber((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_AUTH_DATE:
				setLastFailedAuthDate((Date)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_NSF_DATE:
				setLastFailedNsfDate((Date)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__LAST_NAME_ON_CARD:
				setLastNameOnCard((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__MIDDLE_NAME_ON_CARD:
				setMiddleNameOnCard((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__SUFFIX_ON_CARD:
				setSuffixOnCard((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__TITLE_ON_CARD:
				setTitleOnCard((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__VALID_FROM_DATE:
				setValidFromDate((String)newValue);
				return;
			case PaymentPackage.CREDIT_CARD__CONTACT_MECH_ID:
				setContactMechId((ContactMech)newValue);
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
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__CARD_TYPE:
				setCardType(CARD_TYPE_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__COMPANY_NAME_ON_CARD:
				setCompanyNameOnCard(COMPANY_NAME_ON_CARD_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS:
				setConsecutiveFailedAuths(CONSECUTIVE_FAILED_AUTHS_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_NSF:
				setConsecutiveFailedNsf(CONSECUTIVE_FAILED_NSF_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__EXPIRE_DATE:
				setExpireDate(EXPIRE_DATE_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__FIRST_NAME_ON_CARD:
				setFirstNameOnCard(FIRST_NAME_ON_CARD_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__ISSUE_NUMBER:
				setIssueNumber(ISSUE_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_AUTH_DATE:
				setLastFailedAuthDate(LAST_FAILED_AUTH_DATE_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_NSF_DATE:
				setLastFailedNsfDate(LAST_FAILED_NSF_DATE_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__LAST_NAME_ON_CARD:
				setLastNameOnCard(LAST_NAME_ON_CARD_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__MIDDLE_NAME_ON_CARD:
				setMiddleNameOnCard(MIDDLE_NAME_ON_CARD_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__SUFFIX_ON_CARD:
				setSuffixOnCard(SUFFIX_ON_CARD_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__TITLE_ON_CARD:
				setTitleOnCard(TITLE_ON_CARD_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case PaymentPackage.CREDIT_CARD__CONTACT_MECH_ID:
				setContactMechId((ContactMech)null);
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
			case PaymentPackage.CREDIT_CARD__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case PaymentPackage.CREDIT_CARD__CARD_TYPE:
				return CARD_TYPE_EDEFAULT == null ? cardType != null : !CARD_TYPE_EDEFAULT.equals(cardType);
			case PaymentPackage.CREDIT_CARD__COMPANY_NAME_ON_CARD:
				return COMPANY_NAME_ON_CARD_EDEFAULT == null ? companyNameOnCard != null : !COMPANY_NAME_ON_CARD_EDEFAULT.equals(companyNameOnCard);
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_AUTHS:
				return consecutiveFailedAuths != CONSECUTIVE_FAILED_AUTHS_EDEFAULT;
			case PaymentPackage.CREDIT_CARD__CONSECUTIVE_FAILED_NSF:
				return consecutiveFailedNsf != CONSECUTIVE_FAILED_NSF_EDEFAULT;
			case PaymentPackage.CREDIT_CARD__EXPIRE_DATE:
				return EXPIRE_DATE_EDEFAULT == null ? expireDate != null : !EXPIRE_DATE_EDEFAULT.equals(expireDate);
			case PaymentPackage.CREDIT_CARD__FIRST_NAME_ON_CARD:
				return FIRST_NAME_ON_CARD_EDEFAULT == null ? firstNameOnCard != null : !FIRST_NAME_ON_CARD_EDEFAULT.equals(firstNameOnCard);
			case PaymentPackage.CREDIT_CARD__ISSUE_NUMBER:
				return ISSUE_NUMBER_EDEFAULT == null ? issueNumber != null : !ISSUE_NUMBER_EDEFAULT.equals(issueNumber);
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_AUTH_DATE:
				return LAST_FAILED_AUTH_DATE_EDEFAULT == null ? lastFailedAuthDate != null : !LAST_FAILED_AUTH_DATE_EDEFAULT.equals(lastFailedAuthDate);
			case PaymentPackage.CREDIT_CARD__LAST_FAILED_NSF_DATE:
				return LAST_FAILED_NSF_DATE_EDEFAULT == null ? lastFailedNsfDate != null : !LAST_FAILED_NSF_DATE_EDEFAULT.equals(lastFailedNsfDate);
			case PaymentPackage.CREDIT_CARD__LAST_NAME_ON_CARD:
				return LAST_NAME_ON_CARD_EDEFAULT == null ? lastNameOnCard != null : !LAST_NAME_ON_CARD_EDEFAULT.equals(lastNameOnCard);
			case PaymentPackage.CREDIT_CARD__MIDDLE_NAME_ON_CARD:
				return MIDDLE_NAME_ON_CARD_EDEFAULT == null ? middleNameOnCard != null : !MIDDLE_NAME_ON_CARD_EDEFAULT.equals(middleNameOnCard);
			case PaymentPackage.CREDIT_CARD__SUFFIX_ON_CARD:
				return SUFFIX_ON_CARD_EDEFAULT == null ? suffixOnCard != null : !SUFFIX_ON_CARD_EDEFAULT.equals(suffixOnCard);
			case PaymentPackage.CREDIT_CARD__TITLE_ON_CARD:
				return TITLE_ON_CARD_EDEFAULT == null ? titleOnCard != null : !TITLE_ON_CARD_EDEFAULT.equals(titleOnCard);
			case PaymentPackage.CREDIT_CARD__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case PaymentPackage.CREDIT_CARD__CONTACT_MECH_ID:
				return contactMechId != null;
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
		result.append(" (cardNumber: ");
		result.append(cardNumber);
		result.append(", cardType: ");
		result.append(cardType);
		result.append(", companyNameOnCard: ");
		result.append(companyNameOnCard);
		result.append(", consecutiveFailedAuths: ");
		result.append(consecutiveFailedAuths);
		result.append(", consecutiveFailedNsf: ");
		result.append(consecutiveFailedNsf);
		result.append(", expireDate: ");
		result.append(expireDate);
		result.append(", firstNameOnCard: ");
		result.append(firstNameOnCard);
		result.append(", issueNumber: ");
		result.append(issueNumber);
		result.append(", lastFailedAuthDate: ");
		result.append(lastFailedAuthDate);
		result.append(", lastFailedNsfDate: ");
		result.append(lastFailedNsfDate);
		result.append(", lastNameOnCard: ");
		result.append(lastNameOnCard);
		result.append(", middleNameOnCard: ");
		result.append(middleNameOnCard);
		result.append(", suffixOnCard: ");
		result.append(suffixOnCard);
		result.append(", titleOnCard: ");
		result.append(titleOnCard);
		result.append(", validFromDate: ");
		result.append(validFromDate);
		result.append(')');
		return result.toString();
	}

} //CreditCardImpl
