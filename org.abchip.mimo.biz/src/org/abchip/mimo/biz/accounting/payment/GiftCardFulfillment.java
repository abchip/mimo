/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gift Card Fulfillment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentId <em>Fulfillment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAuthCode <em>Auth Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentDate <em>Fulfillment Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getMerchantId <em>Merchant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPinNumber <em>Pin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getReferenceNum <em>Reference Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getResponseCode <em>Response Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getTypeEnumId <em>Type Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment()
 * @model annotation="mimo-ent-frame title='Gift Card Fulfillment History'"
 * @generated
 */
public interface GiftCardFulfillment extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_Amount()
	 * @model annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Auth Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Code</em>' attribute.
	 * @see #setAuthCode(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_AuthCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getAuthCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getAuthCode <em>Auth Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Code</em>' attribute.
	 * @see #getAuthCode()
	 * @generated
	 */
	void setAuthCode(String value);

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
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_CardNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
	 */
	void setCardNumber(String value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillment Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Date</em>' attribute.
	 * @see #setFulfillmentDate(Date)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_FulfillmentDate()
	 * @model
	 * @generated
	 */
	Date getFulfillmentDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentDate <em>Fulfillment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Date</em>' attribute.
	 * @see #getFulfillmentDate()
	 * @generated
	 */
	void setFulfillmentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fulfillment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fulfillment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fulfillment Id</em>' attribute.
	 * @see #setFulfillmentId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_FulfillmentId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getFulfillmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getFulfillmentId <em>Fulfillment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Id</em>' attribute.
	 * @see #getFulfillmentId()
	 * @generated
	 */
	void setFulfillmentId(String value);

	/**
	 * Returns the value of the '<em><b>Merchant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merchant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merchant Id</em>' attribute.
	 * @see #setMerchantId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_MerchantId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getMerchantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getMerchantId <em>Merchant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant Id</em>' attribute.
	 * @see #getMerchantId()
	 * @generated
	 */
	void setMerchantId(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' reference.
	 * @see #setOrderId(OrderHeader)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_OrderId()
	 * @model keys="orderId"
	 * @generated
	 */
	OrderHeader getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderId <em>Order Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' reference.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(OrderHeader value);

	/**
	 * Returns the value of the '<em><b>Order Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #setOrderItemSeqId(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_OrderItemSeqId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Pin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Number</em>' attribute.
	 * @see #setPinNumber(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_PinNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getPinNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getPinNumber <em>Pin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Number</em>' attribute.
	 * @see #getPinNumber()
	 * @generated
	 */
	void setPinNumber(String value);

	/**
	 * Returns the value of the '<em><b>Reference Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Num</em>' attribute.
	 * @see #setReferenceNum(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_ReferenceNum()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getReferenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getReferenceNum <em>Reference Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Num</em>' attribute.
	 * @see #getReferenceNum()
	 * @generated
	 */
	void setReferenceNum(String value);

	/**
	 * Returns the value of the '<em><b>Response Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Code</em>' attribute.
	 * @see #setResponseCode(String)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_ResponseCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getResponseCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getResponseCode <em>Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Code</em>' attribute.
	 * @see #getResponseCode()
	 * @generated
	 */
	void setResponseCode(String value);

	/**
	 * Returns the value of the '<em><b>Survey Response Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response Id</em>' reference.
	 * @see #setSurveyResponseId(SurveyResponse)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_SurveyResponseId()
	 * @model keys="surveyResponseId"
	 * @generated
	 */
	SurveyResponse getSurveyResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getSurveyResponseId <em>Survey Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response Id</em>' reference.
	 * @see #getSurveyResponseId()
	 * @generated
	 */
	void setSurveyResponseId(SurveyResponse value);

	/**
	 * Returns the value of the '<em><b>Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Enum Id</em>' reference.
	 * @see #setTypeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.accounting.payment.PaymentPackage#getGiftCardFulfillment_TypeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.payment.GiftCardFulfillment#getTypeEnumId <em>Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Enum Id</em>' reference.
	 * @see #getTypeEnumId()
	 * @generated
	 */
	void setTypeEnumId(Enumeration value);

} // GiftCardFulfillment
