/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentId <em>Return Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOrderAdjustmentId <em>Order Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getPrimaryGeoId <em>Primary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentTypeId <em>Return Adjustment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSecondaryGeoId <em>Secondary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ReturnAdjustment extends BizEntityTyped<ReturnAdjustmentType> {
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getComments <em>Comments</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_CorrespondingProductId()
	 * @model
	 * @generated
	 */
	String getCorrespondingProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_CreatedByUserLogin()
	 * @model annotation="mimo-ent-domain frame='UserLogin'"
	 * @generated
	 */
	String getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCreatedDate <em>Created Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_CustomerReferenceId()
	 * @model
	 * @generated
	 */
	String getCustomerReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getDescription <em>Description</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ExemptAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getExemptAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getExemptAmount <em>Exempt Amount</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_IncludeInShipping()
	 * @model
	 * @generated
	 */
	boolean isIncludeInShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInShipping <em>Include In Shipping</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_IncludeInTax()
	 * @model
	 * @generated
	 */
	boolean isIncludeInTax();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#isIncludeInTax <em>Include In Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Tax</em>' attribute.
	 * @see #isIncludeInTax()
	 * @generated
	 */
	void setIncludeInTax(boolean value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_LastModifiedByUserLogin()
	 * @model
	 * @generated
	 */
	String getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_OrderAdjustmentId()
	 * @model annotation="mimo-ent-domain frame='OrderAdjustment'"
	 * @generated
	 */
	String getOrderAdjustmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOrderAdjustmentId <em>Order Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Adjustment Id</em>' attribute.
	 * @see #getOrderAdjustmentId()
	 * @generated
	 */
	void setOrderAdjustmentId(String value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_OverrideGlAccountId()
	 * @model annotation="mimo-ent-domain frame='GlAccount'"
	 * @generated
	 */
	String getOverrideGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getOverrideGlAccountId <em>Override Gl Account Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_PrimaryGeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getPrimaryGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getPrimaryGeoId <em>Primary Geo Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ProductFeatureId()
	 * @model
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductFeatureId <em>Product Feature Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ProductPromoActionSeqId()
	 * @model
	 * @generated
	 */
	String getProductPromoActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ProductPromoId()
	 * @model annotation="mimo-ent-domain frame='ProductPromo'"
	 * @generated
	 */
	String getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoId <em>Product Promo Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ProductPromoRuleId()
	 * @model
	 * @generated
	 */
	String getProductPromoRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #getProductPromoRuleId()
	 * @generated
	 */
	void setProductPromoRuleId(String value);

	/**
	 * Returns the value of the '<em><b>Return Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Adjustment Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Adjustment Id</em>' attribute.
	 * @see #setReturnAdjustmentId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ReturnAdjustmentId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getReturnAdjustmentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentId <em>Return Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Adjustment Id</em>' attribute.
	 * @see #getReturnAdjustmentId()
	 * @generated
	 */
	void setReturnAdjustmentId(String value);

	/**
	 * Returns the value of the '<em><b>Return Adjustment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Adjustment Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Adjustment Type Id</em>' attribute.
	 * @see #setReturnAdjustmentTypeId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ReturnAdjustmentTypeId()
	 * @model annotation="mimo-ent-domain frame='ReturnAdjustmentType'"
	 * @generated
	 */
	String getReturnAdjustmentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnAdjustmentTypeId <em>Return Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Adjustment Type Id</em>' attribute.
	 * @see #getReturnAdjustmentTypeId()
	 * @generated
	 */
	void setReturnAdjustmentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Return Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Id</em>' attribute.
	 * @see #setReturnId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ReturnId()
	 * @model annotation="mimo-ent-domain frame='ReturnHeader'"
	 * @generated
	 */
	String getReturnId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnId <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Id</em>' attribute.
	 * @see #getReturnId()
	 * @generated
	 */
	void setReturnId(String value);

	/**
	 * Returns the value of the '<em><b>Return Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #setReturnItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ReturnItemSeqId()
	 * @model
	 * @generated
	 */
	String getReturnItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnItemSeqId <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Seq Id</em>' attribute.
	 * @see #getReturnItemSeqId()
	 * @generated
	 */
	void setReturnItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Return Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type Id</em>' attribute.
	 * @see #setReturnTypeId(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ReturnTypeId()
	 * @model annotation="mimo-ent-domain frame='ReturnType'"
	 * @generated
	 */
	String getReturnTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getReturnTypeId <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type Id</em>' attribute.
	 * @see #getReturnTypeId()
	 * @generated
	 */
	void setReturnTypeId(String value);

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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_SecondaryGeoId()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getSecondaryGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSecondaryGeoId <em>Secondary Geo Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_ShipGroupSeqId()
	 * @model
	 * @generated
	 */
	String getShipGroupSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getShipGroupSeqId <em>Ship Group Seq Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_SourcePercentage()
	 * @model
	 * @generated
	 */
	BigDecimal getSourcePercentage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourcePercentage <em>Source Percentage</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_SourceReferenceId()
	 * @model
	 * @generated
	 */
	String getSourceReferenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getSourceReferenceId <em>Source Reference Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_TaxAuthGeoId()
	 * @model
	 * @generated
	 */
	String getTaxAuthGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_TaxAuthPartyId()
	 * @model
	 * @generated
	 */
	String getTaxAuthPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnAdjustment_TaxAuthorityRateSeqId()
	 * @model annotation="mimo-ent-domain frame='TaxAuthorityRateProduct'"
	 * @generated
	 */
	String getTaxAuthorityRateSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnAdjustment#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Authority Rate Seq Id</em>' attribute.
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 */
	void setTaxAuthorityRateSeqId(String value);

} // ReturnAdjustment
