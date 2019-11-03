/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderAdjustmentId <em>Order Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getAmountAlreadyIncluded <em>Amount Already Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#isIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#isIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#isIsManual <em>Is Manual</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOldAmountPerQuantity <em>Old Amount Per Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOldPercentage <em>Old Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOriginalAdjustmentId <em>Original Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getPrimaryGeoId <em>Primary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getRecurringAmount <em>Recurring Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getSecondaryGeoId <em>Secondary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderAdjustmentAttributes <em>Order Adjustment Attributes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface OrderAdjustment extends BizEntityTyped<OrderAdjustmentType> {
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Amount Already Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Already Included</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Already Included</em>' attribute.
	 * @see #setAmountAlreadyIncluded(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_AmountAlreadyIncluded()
	 * @model
	 * @generated
	 */
	BigDecimal getAmountAlreadyIncluded();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getAmountAlreadyIncluded <em>Amount Already Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Already Included</em>' attribute.
	 * @see #getAmountAlreadyIncluded()
	 * @generated
	 */
	void setAmountAlreadyIncluded(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Corresponding Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corresponding Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponding Product Id</em>' attribute.
	 * @see #setCorrespondingProductId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_CorrespondingProductId()
	 * @model
	 * @generated
	 */
	String getCorrespondingProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponding Product Id</em>' attribute.
	 * @see #getCorrespondingProductId()
	 * @generated
	 */
	void setCorrespondingProductId(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' attribute.
	 * @see #setCreatedByUserLogin(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_CreatedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' attribute.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Customer Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Reference Id</em>' attribute.
	 * @see #setCustomerReferenceId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_CustomerReferenceId()
	 * @model
	 * @generated
	 */
	String getCustomerReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Reference Id</em>' attribute.
	 * @see #getCustomerReferenceId()
	 * @generated
	 */
	void setCustomerReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Exempt Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exempt Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exempt Amount</em>' attribute.
	 * @see #setExemptAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_ExemptAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getExemptAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getExemptAmount <em>Exempt Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exempt Amount</em>' attribute.
	 * @see #getExemptAmount()
	 * @generated
	 */
	void setExemptAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Include In Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include In Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Shipping</em>' attribute.
	 * @see #setIncludeInShipping(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_IncludeInShipping()
	 * @model
	 * @generated
	 */
	boolean isIncludeInShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#isIncludeInShipping <em>Include In Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Shipping</em>' attribute.
	 * @see #isIncludeInShipping()
	 * @generated
	 */
	void setIncludeInShipping(boolean value);

	/**
	 * Returns the value of the '<em><b>Include In Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include In Tax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Tax</em>' attribute.
	 * @see #setIncludeInTax(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_IncludeInTax()
	 * @model
	 * @generated
	 */
	boolean isIncludeInTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#isIncludeInTax <em>Include In Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Tax</em>' attribute.
	 * @see #isIncludeInTax()
	 * @generated
	 */
	void setIncludeInTax(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Manual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Manual</em>' attribute.
	 * @see #setIsManual(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_IsManual()
	 * @model
	 * @generated
	 */
	boolean isIsManual();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#isIsManual <em>Is Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Manual</em>' attribute.
	 * @see #isIsManual()
	 * @generated
	 */
	void setIsManual(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #setLastModifiedByUserLogin(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_LastModifiedByUserLogin()
	 * @model
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' attribute.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Old Amount Per Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Amount Per Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Amount Per Quantity</em>' attribute.
	 * @see #setOldAmountPerQuantity(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OldAmountPerQuantity()
	 * @model
	 * @generated
	 */
	BigDecimal getOldAmountPerQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOldAmountPerQuantity <em>Old Amount Per Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Amount Per Quantity</em>' attribute.
	 * @see #getOldAmountPerQuantity()
	 * @generated
	 */
	void setOldAmountPerQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Old Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Percentage</em>' attribute.
	 * @see #setOldPercentage(double)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OldPercentage()
	 * @model
	 * @generated
	 */
	double getOldPercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOldPercentage <em>Old Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Percentage</em>' attribute.
	 * @see #getOldPercentage()
	 * @generated
	 */
	void setOldPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Adjustment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Id</em>' attribute.
	 * @see #setOrderAdjustmentId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OrderAdjustmentId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOrderAdjustmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderAdjustmentId <em>Order Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Adjustment Id</em>' attribute.
	 * @see #getOrderAdjustmentId()
	 * @generated
	 */
	void setOrderAdjustmentId(String value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Adjustment Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Type Id</em>' attribute.
	 * @see #setOrderAdjustmentTypeId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OrderAdjustmentTypeId()
	 * @model annotation="mimo-ent-domain frame='OrderAdjustmentType'"
	 * @generated
	 */
	String getOrderAdjustmentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Adjustment Type Id</em>' attribute.
	 * @see #getOrderAdjustmentTypeId()
	 * @generated
	 */
	void setOrderAdjustmentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OrderId()
	 * @model annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OrderItemSeqId()
	 * @model
	 * @generated
	 */
	String getOrderItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOrderItemSeqId <em>Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Seq Id</em>' attribute.
	 * @see #getOrderItemSeqId()
	 * @generated
	 */
	void setOrderItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Original Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Adjustment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Adjustment Id</em>' attribute.
	 * @see #setOriginalAdjustmentId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OriginalAdjustmentId()
	 * @model annotation="mimo-ent-domain frame='OrderAdjustment'"
	 * @generated
	 */
	String getOriginalAdjustmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOriginalAdjustmentId <em>Original Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Adjustment Id</em>' attribute.
	 * @see #getOriginalAdjustmentId()
	 * @generated
	 */
	void setOriginalAdjustmentId(String value);

	/**
	 * Returns the value of the '<em><b>Override Gl Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #setOverrideGlAccountId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OverrideGlAccountId()
	 * @model annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getOverrideGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getOverrideGlAccountId <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Gl Account Id</em>' attribute.
	 * @see #getOverrideGlAccountId()
	 * @generated
	 */
	void setOverrideGlAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Geo Id</em>' attribute.
	 * @see #setPrimaryGeoId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_PrimaryGeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getPrimaryGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getPrimaryGeoId <em>Primary Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Geo Id</em>' attribute.
	 * @see #getPrimaryGeoId()
	 * @generated
	 */
	void setPrimaryGeoId(String value);

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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_ProductFeatureId()
	 * @model
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Action Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #setProductPromoActionSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_ProductPromoActionSeqId()
	 * @model
	 * @generated
	 */
	String getProductPromoActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 */
	void setProductPromoActionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Id</em>' attribute.
	 * @see #setProductPromoId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_ProductPromoId()
	 * @model annotation="mimo-ent-domain frame='ProductPromo'"
	 * @generated
	 */
	String getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductPromoId <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' attribute.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #setProductPromoRuleId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_ProductPromoRuleId()
	 * @model
	 * @generated
	 */
	String getProductPromoRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #getProductPromoRuleId()
	 * @generated
	 */
	void setProductPromoRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Recurring Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurring Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurring Amount</em>' attribute.
	 * @see #setRecurringAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_RecurringAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getRecurringAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getRecurringAmount <em>Recurring Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurring Amount</em>' attribute.
	 * @see #getRecurringAmount()
	 * @generated
	 */
	void setRecurringAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Secondary Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Geo Id</em>' attribute.
	 * @see #setSecondaryGeoId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_SecondaryGeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getSecondaryGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getSecondaryGeoId <em>Secondary Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Geo Id</em>' attribute.
	 * @see #getSecondaryGeoId()
	 * @generated
	 */
	void setSecondaryGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship Group Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #setShipGroupSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_ShipGroupSeqId()
	 * @model
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship Group Seq Id</em>' attribute.
	 * @see #getShipGroupSeqId()
	 * @generated
	 */
	void setShipGroupSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Source Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Percentage</em>' attribute.
	 * @see #setSourcePercentage(BigDecimal)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_SourcePercentage()
	 * @model
	 * @generated
	 */
	BigDecimal getSourcePercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getSourcePercentage <em>Source Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Percentage</em>' attribute.
	 * @see #getSourcePercentage()
	 * @generated
	 */
	void setSourcePercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Reference Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Reference Id</em>' attribute.
	 * @see #setSourceReferenceId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_SourceReferenceId()
	 * @model
	 * @generated
	 */
	String getSourceReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getSourceReferenceId <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Reference Id</em>' attribute.
	 * @see #getSourceReferenceId()
	 * @generated
	 */
	void setSourceReferenceId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #setTaxAuthGeoId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_TaxAuthGeoId()
	 * @model
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Geo Id</em>' attribute.
	 * @see #getTaxAuthGeoId()
	 * @generated
	 */
	void setTaxAuthGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Auth Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #setTaxAuthPartyId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_TaxAuthPartyId()
	 * @model
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Auth Party Id</em>' attribute.
	 * @see #getTaxAuthPartyId()
	 * @generated
	 */
	void setTaxAuthPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Authority Rate Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Authority Rate Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #setTaxAuthorityRateSeqId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_TaxAuthorityRateSeqId()
	 * @model annotation="mimo-ent-domain frame='TaxAuthorityRateProduct'"
	 * @generated
	 */
	String getTaxAuthorityRateSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustment#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 */
	void setTaxAuthorityRateSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Adjustment Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustment_OrderAdjustmentAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustmentAttribute'"
	 * @generated
	 */
	List<String> getOrderAdjustmentAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnAdjustment' route='orderAdjustmentId'"
	 * @generated
	 */
	List<String> returnAdjustments();

} // OrderAdjustment
