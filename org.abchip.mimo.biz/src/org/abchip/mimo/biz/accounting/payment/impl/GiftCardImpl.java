/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.GiftCard;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gift Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getPinNumber <em>Pin Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GiftCardImpl extends PaymentMethodImpl implements GiftCard {
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
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;

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
	 * The default value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PIN_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPinNumber() <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinNumber()
	 * @generated
	 * @ordered
	 */
	protected String pinNumber = PIN_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GiftCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.GIFT_CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD__CARD_NUMBER, oldCardNumber, cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD__CONTACT_MECH_ID, oldContactMechId, contactMechId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD__EXPIRE_DATE, oldExpireDate, expireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPinNumber() {
		return pinNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinNumber(String newPinNumber) {
		String oldPinNumber = pinNumber;
		pinNumber = newPinNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD__PIN_NUMBER, oldPinNumber, pinNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.GIFT_CARD__CARD_NUMBER:
				return getCardNumber();
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
				return getContactMechId();
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				return getExpireDate();
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				return getPinNumber();
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
			case PaymentPackage.GIFT_CARD__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				setExpireDate((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				setPinNumber((String)newValue);
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
			case PaymentPackage.GIFT_CARD__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				setExpireDate(EXPIRE_DATE_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				setPinNumber(PIN_NUMBER_EDEFAULT);
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
			case PaymentPackage.GIFT_CARD__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				return EXPIRE_DATE_EDEFAULT == null ? expireDate != null : !EXPIRE_DATE_EDEFAULT.equals(expireDate);
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				return PIN_NUMBER_EDEFAULT == null ? pinNumber != null : !PIN_NUMBER_EDEFAULT.equals(pinNumber);
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
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", expireDate: ");
		result.append(expireDate);
		result.append(", pinNumber: ");
		result.append(pinNumber);
		result.append(')');
		return result.toString();
	}

} //GiftCardImpl
