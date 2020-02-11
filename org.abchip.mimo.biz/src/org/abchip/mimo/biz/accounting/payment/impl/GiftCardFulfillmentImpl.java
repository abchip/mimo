/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getReferenceNum <em>Reference Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.GiftCardFulfillmentImpl#getTypeEnumId <em>Type Enum Id</em>}</li>
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
		return (BigDecimal)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthCode() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__AUTH_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthCode(String newAuthCode) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__AUTH_CODE, newAuthCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCardNumber() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__CARD_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardNumber(String newCardNumber) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__CARD_NUMBER, newCardNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFulfillmentDate() {
		return (Date)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulfillmentDate(Date newFulfillmentDate) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__FULFILLMENT_DATE, newFulfillmentDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFulfillmentId() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__FULFILLMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFulfillmentId(String newFulfillmentId) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__FULFILLMENT_ID, newFulfillmentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerchantId() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__MERCHANT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchantId(String newMerchantId) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__MERCHANT_ID, newMerchantId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderHeader getOrderId() {
		return (OrderHeader)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(OrderHeader newOrderId) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderItemSeqId() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemSeqId(String newOrderItemSeqId) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__ORDER_ITEM_SEQ_ID, newOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPinNumber() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__PIN_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPinNumber(String newPinNumber) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__PIN_NUMBER, newPinNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferenceNum() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__REFERENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceNum(String newReferenceNum) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__REFERENCE_NUM, newReferenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResponseCode() {
		return (String)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__RESPONSE_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResponseCode(String newResponseCode) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__RESPONSE_CODE, newResponseCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse getSurveyResponseId() {
		return (SurveyResponse)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(SurveyResponse newSurveyResponseId) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__SURVEY_RESPONSE_ID, newSurveyResponseId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getTypeEnumId() {
		return (Enumeration)eGet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeEnumId(Enumeration newTypeEnumId) {
		eSet(PaymentPackage.Literals.GIFT_CARD_FULFILLMENT__TYPE_ENUM_ID, newTypeEnumId);
	}

} //GiftCardFulfillmentImpl
