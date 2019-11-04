/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gift Card Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getFulfillmentId <em>Fulfillment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getAuthCode <em>Auth Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getFulfillmentDate <em>Fulfillment Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getReferenceNum <em>Reference Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getTypeEnumId <em>Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GiftCardFulfillmentImpl extends BizEntityImpl implements GiftCardFulfillment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFulfillmentId() <em>Fulfillment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String FULFILLMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFulfillmentId() <em>Fulfillment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentId()
	 * @generated
	 * @ordered
	 */
	protected String fulfillmentId = FULFILLMENT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;
	/**
	 * The default value of the '{@link #getAuthCode() <em>Auth Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAuthCode() <em>Auth Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthCode()
	 * @generated
	 * @ordered
	 */
	protected String authCode = AUTH_CODE_EDEFAULT;
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
	 * The default value of the '{@link #getFulfillmentDate() <em>Fulfillment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FULFILLMENT_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFulfillmentDate() <em>Fulfillment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFulfillmentDate()
	 * @generated
	 * @ordered
	 */
	protected Date fulfillmentDate = FULFILLMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMerchantId() <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantId()
	 * @generated
	 * @ordered
	 */
	protected static final String MERCHANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMerchantId() <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerchantId()
	 * @generated
	 * @ordered
	 */
	protected String merchantId = MERCHANT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemSeqId() <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String orderItemSeqId = ORDER_ITEM_SEQ_ID_EDEFAULT;

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
	 * The default value of the '{@link #getReferenceNum() <em>Reference Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceNum() <em>Reference Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceNum()
	 * @generated
	 * @ordered
	 */
	protected String referenceNum = REFERENCE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponseCode() <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCode()
	 * @generated
	 * @ordered
	 */
	protected String responseCode = RESPONSE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeEnumId() <em>Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration typeEnumId;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected OrderHeader orderId;
	/**
	 * The cached value of the '{@link #getSurveyResponseId() <em>Survey Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResponseId()
	 * @generated
	 * @ordered
	 */
	protected SurveyResponse surveyResponseId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GiftCardFulfillmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.GIFT_CARD_FULFILLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthCode() {
		return authCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthCode(String newAuthCode) {
		String oldAuthCode = authCode;
		authCode = newAuthCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__AUTH_CODE, oldAuthCode, authCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__CARD_NUMBER, oldCardNumber, cardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFulfillmentDate() {
		return fulfillmentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulfillmentDate(Date newFulfillmentDate) {
		Date oldFulfillmentDate = fulfillmentDate;
		fulfillmentDate = newFulfillmentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE, oldFulfillmentDate, fulfillmentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFulfillmentId() {
		return fulfillmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulfillmentId(String newFulfillmentId) {
		String oldFulfillmentId = fulfillmentId;
		fulfillmentId = newFulfillmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_ID, oldFulfillmentId, fulfillmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		String oldMerchantId = merchantId;
		merchantId = newMerchantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__MERCHANT_ID, oldMerchantId, merchantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		if (orderId != null && ((EObject)orderId).eIsProxy()) {
			InternalEObject oldOrderId = (InternalEObject)orderId;
			orderId = (OrderHeader)eResolveProxy(oldOrderId);
			if (orderId != oldOrderId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ID, oldOrderId, orderId));
			}
		}
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderHeader basicGetOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		OrderHeader oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		String oldOrderItemSeqId = orderItemSeqId;
		orderItemSeqId = newOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.GIFT_CARD_FULFILLMENT__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__PIN_NUMBER, oldPinNumber, pinNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceNum() {
		return referenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceNum(String newReferenceNum) {
		String oldReferenceNum = referenceNum;
		referenceNum = newReferenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__REFERENCE_NUM, oldReferenceNum, referenceNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseCode(String newResponseCode) {
		String oldResponseCode = responseCode;
		responseCode = newResponseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__RESPONSE_CODE, oldResponseCode, responseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse getSurveyResponseId() {
		if (surveyResponseId != null && ((EObject)surveyResponseId).eIsProxy()) {
			InternalEObject oldSurveyResponseId = (InternalEObject)surveyResponseId;
			surveyResponseId = (SurveyResponse)eResolveProxy(oldSurveyResponseId);
			if (surveyResponseId != oldSurveyResponseId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID, oldSurveyResponseId, surveyResponseId));
			}
		}
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyResponse basicGetSurveyResponseId() {
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(SurveyResponse newSurveyResponseId) {
		SurveyResponse oldSurveyResponseId = surveyResponseId;
		surveyResponseId = newSurveyResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID, oldSurveyResponseId, surveyResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTypeEnumId() {
		if (typeEnumId != null && ((EObject)typeEnumId).eIsProxy()) {
			InternalEObject oldTypeEnumId = (InternalEObject)typeEnumId;
			typeEnumId = (Enumeration)eResolveProxy(oldTypeEnumId);
			if (typeEnumId != oldTypeEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID, oldTypeEnumId, typeEnumId));
			}
		}
		return typeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetTypeEnumId() {
		return typeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeEnumId(Enumeration newTypeEnumId) {
		Enumeration oldTypeEnumId = typeEnumId;
		typeEnumId = newTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID, oldTypeEnumId, typeEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_ID:
				return getFulfillmentId();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AMOUNT:
				return getAmount();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AUTH_CODE:
				return getAuthCode();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__CARD_NUMBER:
				return getCardNumber();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE:
				return getFulfillmentDate();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__MERCHANT_ID:
				return getMerchantId();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PIN_NUMBER:
				return getPinNumber();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__REFERENCE_NUM:
				return getReferenceNum();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__RESPONSE_CODE:
				return getResponseCode();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID:
				if (resolve) return getTypeEnumId();
				return basicGetTypeEnumId();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ID:
				if (resolve) return getOrderId();
				return basicGetOrderId();
			case PaymentPackage.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID:
				if (resolve) return getSurveyResponseId();
				return basicGetSurveyResponseId();
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
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_ID:
				setFulfillmentId((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AUTH_CODE:
				setAuthCode((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__CARD_NUMBER:
				setCardNumber((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE:
				setFulfillmentDate((Date)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__MERCHANT_ID:
				setMerchantId((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PIN_NUMBER:
				setPinNumber((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__REFERENCE_NUM:
				setReferenceNum((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__RESPONSE_CODE:
				setResponseCode((String)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID:
				setTypeEnumId((Enumeration)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ID:
				setOrderId((OrderHeader)newValue);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)newValue);
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
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_ID:
				setFulfillmentId(FULFILLMENT_ID_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AUTH_CODE:
				setAuthCode(AUTH_CODE_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__CARD_NUMBER:
				setCardNumber(CARD_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE:
				setFulfillmentDate(FULFILLMENT_DATE_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__MERCHANT_ID:
				setMerchantId(MERCHANT_ID_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PIN_NUMBER:
				setPinNumber(PIN_NUMBER_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__REFERENCE_NUM:
				setReferenceNum(REFERENCE_NUM_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__RESPONSE_CODE:
				setResponseCode(RESPONSE_CODE_EDEFAULT);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID:
				setTypeEnumId((Enumeration)null);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ID:
				setOrderId((OrderHeader)null);
				return;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)null);
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
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_ID:
				return FULFILLMENT_ID_EDEFAULT == null ? fulfillmentId != null : !FULFILLMENT_ID_EDEFAULT.equals(fulfillmentId);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__AUTH_CODE:
				return AUTH_CODE_EDEFAULT == null ? authCode != null : !AUTH_CODE_EDEFAULT.equals(authCode);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__CARD_NUMBER:
				return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE:
				return FULFILLMENT_DATE_EDEFAULT == null ? fulfillmentDate != null : !FULFILLMENT_DATE_EDEFAULT.equals(fulfillmentDate);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__MERCHANT_ID:
				return MERCHANT_ID_EDEFAULT == null ? merchantId != null : !MERCHANT_ID_EDEFAULT.equals(merchantId);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PIN_NUMBER:
				return PIN_NUMBER_EDEFAULT == null ? pinNumber != null : !PIN_NUMBER_EDEFAULT.equals(pinNumber);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__REFERENCE_NUM:
				return REFERENCE_NUM_EDEFAULT == null ? referenceNum != null : !REFERENCE_NUM_EDEFAULT.equals(referenceNum);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__RESPONSE_CODE:
				return RESPONSE_CODE_EDEFAULT == null ? responseCode != null : !RESPONSE_CODE_EDEFAULT.equals(responseCode);
			case PaymentPackage.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID:
				return typeEnumId != null;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__PARTY_ID:
				return partyId != null;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__ORDER_ID:
				return orderId != null;
			case PaymentPackage.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID:
				return surveyResponseId != null;
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
		result.append(" (fulfillmentId: ");
		result.append(fulfillmentId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", authCode: ");
		result.append(authCode);
		result.append(", cardNumber: ");
		result.append(cardNumber);
		result.append(", fulfillmentDate: ");
		result.append(fulfillmentDate);
		result.append(", merchantId: ");
		result.append(merchantId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", pinNumber: ");
		result.append(pinNumber);
		result.append(", referenceNum: ");
		result.append(referenceNum);
		result.append(", responseCode: ");
		result.append(responseCode);
		result.append(')');
		return result.toString();
	}

} //GiftCardFulfillmentImpl
