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
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gift Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardImpl#getContactMechId <em>Contact Mech Id</em>}</li>
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
		cardNumber = newCardNumber;
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
		contactMechId = newContactMechId;
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
		expireDate = newExpireDate;
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
		pinNumber = newPinNumber;
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
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				return getExpireDate();
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				return getPinNumber();
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
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
			case PaymentPackage.GIFT_CARD__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				setExpireDate((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				setPinNumber((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
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
			case PaymentPackage.GIFT_CARD__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				setExpireDate(EXPIRE_DATE_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				setPinNumber(PIN_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
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
			case PaymentPackage.GIFT_CARD__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case PaymentPackage.GIFT_CARD__EXPIRE_DATE:
				return EXPIRE_DATE_EDEFAULT == null ? expireDate != null : !EXPIRE_DATE_EDEFAULT.equals(expireDate);
			case PaymentPackage.GIFT_CARD__PIN_NUMBER:
				return PIN_NUMBER_EDEFAULT == null ? pinNumber != null : !PIN_NUMBER_EDEFAULT.equals(pinNumber);
			case PaymentPackage.GIFT_CARD__CONTACT_MECH_ID:
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
		result.append(", expireDate: ");
		result.append(expireDate);
		result.append(", pinNumber: ");
		result.append(pinNumber);
		result.append(')');
		return result.toString();
	}

} //GiftCardImpl
