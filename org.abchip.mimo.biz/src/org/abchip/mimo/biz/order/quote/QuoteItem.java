/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quote Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteId <em>Quote Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestId <em>Cust Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getDeliverableTypeId <em>Deliverable Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#isIsPromo <em>Is Promo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getLeadTimeDays <em>Lead Time Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteUnitPrice <em>Quote Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getSelectedAmount <em>Selected Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getSkillTypeId <em>Skill Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.quote.QuoteItem#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem()
 * @model
 * @generated
 */
public interface QuoteItem extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Id</em>' attribute.
	 * @see #setConfigId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_ConfigId()
	 * @model
	 * @generated
	 */
	String getConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getConfigId <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Id</em>' attribute.
	 * @see #getConfigId()
	 * @generated
	 */
	void setConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Id</em>' attribute.
	 * @see #setCustRequestId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_CustRequestId()
	 * @model annotation="mimo-ent-domain frame='CustRequest'"
	 * @generated
	 */
	String getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestId <em>Cust Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' attribute.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #setCustRequestItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_CustRequestItemSeqId()
	 * @model
	 * @generated
	 */
	String getCustRequestItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Item Seq Id</em>' attribute.
	 * @see #getCustRequestItemSeqId()
	 * @generated
	 */
	void setCustRequestItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Deliverable Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deliverable Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverable Type Id</em>' attribute.
	 * @see #setDeliverableTypeId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_DeliverableTypeId()
	 * @model annotation="mimo-ent-domain frame='DeliverableType'"
	 * @generated
	 */
	String getDeliverableTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getDeliverableTypeId <em>Deliverable Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverable Type Id</em>' attribute.
	 * @see #getDeliverableTypeId()
	 * @generated
	 */
	void setDeliverableTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Delivery Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #setEstimatedDeliveryDate(Date)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_EstimatedDeliveryDate()
	 * @model
	 * @generated
	 */
	Date getEstimatedDeliveryDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery Date</em>' attribute.
	 * @see #getEstimatedDeliveryDate()
	 * @generated
	 */
	void setEstimatedDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Is Promo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Promo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Promo</em>' attribute.
	 * @see #setIsPromo(boolean)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_IsPromo()
	 * @model
	 * @generated
	 */
	boolean isIsPromo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#isIsPromo <em>Is Promo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Promo</em>' attribute.
	 * @see #isIsPromo()
	 * @generated
	 */
	void setIsPromo(boolean value);

	/**
	 * Returns the value of the '<em><b>Lead Time Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lead Time Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lead Time Days</em>' attribute.
	 * @see #setLeadTimeDays(long)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_LeadTimeDays()
	 * @model
	 * @generated
	 */
	long getLeadTimeDays();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getLeadTimeDays <em>Lead Time Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lead Time Days</em>' attribute.
	 * @see #getLeadTimeDays()
	 * @generated
	 */
	void setLeadTimeDays(long value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' attribute.
	 * @see #setProductFeatureId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_ProductFeatureId()
	 * @model annotation="mimo-ent-domain frame='ProductFeature'"
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_Quantity()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Id</em>' attribute.
	 * @see #setQuoteId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_QuoteId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Quote'"
	 * @generated
	 */
	String getQuoteId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteId <em>Quote Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Id</em>' attribute.
	 * @see #getQuoteId()
	 * @generated
	 */
	void setQuoteId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #setQuoteItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_QuoteItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getQuoteItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Item Seq Id</em>' attribute.
	 * @see #getQuoteItemSeqId()
	 * @generated
	 */
	void setQuoteItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Quote Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quote Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quote Unit Price</em>' attribute.
	 * @see #setQuoteUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_QuoteUnitPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getQuoteUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteUnitPrice <em>Quote Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quote Unit Price</em>' attribute.
	 * @see #getQuoteUnitPrice()
	 * @generated
	 */
	void setQuoteUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Length</em>' attribute.
	 * @see #setReservLength(BigDecimal)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_ReservLength()
	 * @model
	 * @generated
	 */
	BigDecimal getReservLength();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservLength <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Length</em>' attribute.
	 * @see #getReservLength()
	 * @generated
	 */
	void setReservLength(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Persons</em>' attribute.
	 * @see #setReservPersons(BigDecimal)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_ReservPersons()
	 * @model
	 * @generated
	 */
	BigDecimal getReservPersons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservPersons <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Persons</em>' attribute.
	 * @see #getReservPersons()
	 * @generated
	 */
	void setReservPersons(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Start</em>' attribute.
	 * @see #setReservStart(Date)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_ReservStart()
	 * @model
	 * @generated
	 */
	Date getReservStart();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservStart <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Start</em>' attribute.
	 * @see #getReservStart()
	 * @generated
	 */
	void setReservStart(Date value);

	/**
	 * Returns the value of the '<em><b>Selected Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Amount</em>' attribute.
	 * @see #setSelectedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_SelectedAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getSelectedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getSelectedAmount <em>Selected Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Amount</em>' attribute.
	 * @see #getSelectedAmount()
	 * @generated
	 */
	void setSelectedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Skill Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Type Id</em>' attribute.
	 * @see #setSkillTypeId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_SkillTypeId()
	 * @model annotation="mimo-ent-domain frame='SkillType'"
	 * @generated
	 */
	String getSkillTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getSkillTypeId <em>Skill Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Type Id</em>' attribute.
	 * @see #getSkillTypeId()
	 * @generated
	 */
	void setSkillTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_UomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.order.quote.QuotePackage#getQuoteItem_WorkEffortId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

} // QuoteItem
