/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderAdjustment;
import org.abchip.mimo.biz.order.order.OrderAdjustmentType;
import org.abchip.mimo.biz.order.order.OrderPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOrderAdjustmentId <em>Order Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getAmountAlreadyIncluded <em>Amount Already Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getCorrespondingProductId <em>Corresponding Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#isIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#isIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#isIsManual <em>Is Manual</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOldAmountPerQuantity <em>Old Amount Per Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOldPercentage <em>Old Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOrderItemSeqId <em>Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOriginalAdjustmentId <em>Original Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getPrimaryGeoId <em>Primary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getRecurringAmount <em>Recurring Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getSecondaryGeoId <em>Secondary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.impl.OrderAdjustmentImpl#getOrderAdjustmentAttributes <em>Order Adjustment Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderAdjustmentImpl extends BizEntityTypedImpl<OrderAdjustmentType> implements OrderAdjustment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getOrderAdjustmentId() <em>Order Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderAdjustmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ADJUSTMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderAdjustmentId() <em>Order Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderAdjustmentId()
	 * @generated
	 * @ordered
	 */
	protected String orderAdjustmentId = ORDER_ADJUSTMENT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getAmountAlreadyIncluded() <em>Amount Already Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAlreadyIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_ALREADY_INCLUDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmountAlreadyIncluded() <em>Amount Already Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAlreadyIncluded()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amountAlreadyIncluded = AMOUNT_ALREADY_INCLUDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrespondingProductId() <em>Corresponding Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRESPONDING_PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrespondingProductId() <em>Corresponding Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingProductId()
	 * @generated
	 * @ordered
	 */
	protected String correspondingProductId = CORRESPONDING_PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected Date createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerReferenceId() <em>Customer Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerReferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_REFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerReferenceId() <em>Customer Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerReferenceId()
	 * @generated
	 * @ordered
	 */
	protected String customerReferenceId = CUSTOMER_REFERENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExemptAmount() <em>Exempt Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemptAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal EXEMPT_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExemptAmount() <em>Exempt Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemptAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal exemptAmount = EXEMPT_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeInShipping() <em>Include In Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInShipping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_IN_SHIPPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeInShipping() <em>Include In Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInShipping()
	 * @generated
	 * @ordered
	 */
	protected boolean includeInShipping = INCLUDE_IN_SHIPPING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeInTax() <em>Include In Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInTax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_IN_TAX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeInTax() <em>Include In Tax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInTax()
	 * @generated
	 * @ordered
	 */
	protected boolean includeInTax = INCLUDE_IN_TAX_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsManual() <em>Is Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsManual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsManual() <em>Is Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsManual()
	 * @generated
	 * @ordered
	 */
	protected boolean isManual = IS_MANUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedDate() <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastModifiedDate = LAST_MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldAmountPerQuantity() <em>Old Amount Per Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldAmountPerQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OLD_AMOUNT_PER_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldAmountPerQuantity() <em>Old Amount Per Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldAmountPerQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal oldAmountPerQuantity = OLD_AMOUNT_PER_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldPercentage() <em>Old Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final double OLD_PERCENTAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOldPercentage() <em>Old Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPercentage()
	 * @generated
	 * @ordered
	 */
	protected double oldPercentage = OLD_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderAdjustmentTypeId() <em>Order Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderAdjustmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ADJUSTMENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderAdjustmentTypeId() <em>Order Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderAdjustmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String orderAdjustmentTypeId = ORDER_ADJUSTMENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected String orderId = ORDER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getOriginalAdjustmentId() <em>Original Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalAdjustmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_ADJUSTMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalAdjustmentId() <em>Original Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalAdjustmentId()
	 * @generated
	 * @ordered
	 */
	protected String originalAdjustmentId = ORIGINAL_ADJUSTMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERRIDE_GL_ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String overrideGlAccountId = OVERRIDE_GL_ACCOUNT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryGeoId() <em>Primary Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryGeoId() <em>Primary Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryGeoId()
	 * @generated
	 * @ordered
	 */
	protected String primaryGeoId = PRIMARY_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureId() <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureId = PRODUCT_FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoActionSeqId() <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoActionSeqId() <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoActionSeqId = PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoId = PRODUCT_PROMO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_PROMO_RULE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductPromoRuleId() <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoRuleId()
	 * @generated
	 * @ordered
	 */
	protected String productPromoRuleId = PRODUCT_PROMO_RULE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurringAmount() <em>Recurring Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RECURRING_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurringAmount() <em>Recurring Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurringAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal recurringAmount = RECURRING_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryGeoId() <em>Secondary Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDARY_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondaryGeoId() <em>Secondary Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryGeoId()
	 * @generated
	 * @ordered
	 */
	protected String secondaryGeoId = SECONDARY_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipGroupSeqId() <em>Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shipGroupSeqId = SHIP_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcePercentage() <em>Source Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SOURCE_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePercentage() <em>Source Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal sourcePercentage = SOURCE_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceReferenceId() <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReferenceId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_REFERENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceReferenceId() <em>Source Reference Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReferenceId()
	 * @generated
	 * @ordered
	 */
	protected String sourceReferenceId = SOURCE_REFERENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAuthGeoId() <em>Tax Auth Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthGeoId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthGeoId = TAX_AUTH_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTH_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAuthPartyId() <em>Tax Auth Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthPartyId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthPartyId = TAX_AUTH_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected String taxAuthorityRateSeqId = TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderAdjustmentAttributes() <em>Order Adjustment Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderAdjustmentAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> orderAdjustmentAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrderPackage.Literals.ORDER_ADJUSTMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmountAlreadyIncluded() {
		return amountAlreadyIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountAlreadyIncluded(BigDecimal newAmountAlreadyIncluded) {
		BigDecimal oldAmountAlreadyIncluded = amountAlreadyIncluded;
		amountAlreadyIncluded = newAmountAlreadyIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED, oldAmountAlreadyIncluded, amountAlreadyIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorrespondingProductId() {
		return correspondingProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondingProductId(String newCorrespondingProductId) {
		String oldCorrespondingProductId = correspondingProductId;
		correspondingProductId = newCorrespondingProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID, oldCorrespondingProductId, correspondingProductId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		Date oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerReferenceId() {
		return customerReferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerReferenceId(String newCustomerReferenceId) {
		String oldCustomerReferenceId = customerReferenceId;
		customerReferenceId = newCustomerReferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID, oldCustomerReferenceId, customerReferenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getExemptAmount() {
		return exemptAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExemptAmount(BigDecimal newExemptAmount) {
		BigDecimal oldExemptAmount = exemptAmount;
		exemptAmount = newExemptAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__EXEMPT_AMOUNT, oldExemptAmount, exemptAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInShipping() {
		return includeInShipping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInShipping(boolean newIncludeInShipping) {
		boolean oldIncludeInShipping = includeInShipping;
		includeInShipping = newIncludeInShipping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING, oldIncludeInShipping, includeInShipping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInTax() {
		return includeInTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInTax(boolean newIncludeInTax) {
		boolean oldIncludeInTax = includeInTax;
		includeInTax = newIncludeInTax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_TAX, oldIncludeInTax, includeInTax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsManual() {
		return isManual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsManual(boolean newIsManual) {
		boolean oldIsManual = isManual;
		isManual = newIsManual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__IS_MANUAL, oldIsManual, isManual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		Date oldLastModifiedDate = lastModifiedDate;
		lastModifiedDate = newLastModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldAmountPerQuantity() {
		return oldAmountPerQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldAmountPerQuantity(BigDecimal newOldAmountPerQuantity) {
		BigDecimal oldOldAmountPerQuantity = oldAmountPerQuantity;
		oldAmountPerQuantity = newOldAmountPerQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY, oldOldAmountPerQuantity, oldAmountPerQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOldPercentage() {
		return oldPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldPercentage(double newOldPercentage) {
		double oldOldPercentage = oldPercentage;
		oldPercentage = newOldPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__OLD_PERCENTAGE, oldOldPercentage, oldPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderAdjustmentId() {
		return orderAdjustmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderAdjustmentId(String newOrderAdjustmentId) {
		String oldOrderAdjustmentId = orderAdjustmentId;
		orderAdjustmentId = newOrderAdjustmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID, oldOrderAdjustmentId, orderAdjustmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderAdjustmentTypeId() {
		return orderAdjustmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderAdjustmentTypeId(String newOrderAdjustmentTypeId) {
		String oldOrderAdjustmentTypeId = orderAdjustmentTypeId;
		orderAdjustmentTypeId = newOrderAdjustmentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE_ID, oldOrderAdjustmentTypeId, orderAdjustmentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(String newOrderId) {
		String oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__ORDER_ID, oldOrderId, orderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID, oldOrderItemSeqId, orderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalAdjustmentId() {
		return originalAdjustmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalAdjustmentId(String newOriginalAdjustmentId) {
		String oldOriginalAdjustmentId = originalAdjustmentId;
		originalAdjustmentId = newOriginalAdjustmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT_ID, oldOriginalAdjustmentId, originalAdjustmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(String newOverrideGlAccountId) {
		String oldOverrideGlAccountId = overrideGlAccountId;
		overrideGlAccountId = newOverrideGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryGeoId() {
		return primaryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryGeoId(String newPrimaryGeoId) {
		String oldPrimaryGeoId = primaryGeoId;
		primaryGeoId = newPrimaryGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__PRIMARY_GEO_ID, oldPrimaryGeoId, primaryGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureId() {
		return productFeatureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureId(String newProductFeatureId) {
		String oldProductFeatureId = productFeatureId;
		productFeatureId = newProductFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoActionSeqId() {
		return productPromoActionSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoActionSeqId(String newProductPromoActionSeqId) {
		String oldProductPromoActionSeqId = productPromoActionSeqId;
		productPromoActionSeqId = newProductPromoActionSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID, oldProductPromoActionSeqId, productPromoActionSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(String newProductPromoId) {
		String oldProductPromoId = productPromoId;
		productPromoId = newProductPromoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductPromoRuleId() {
		return productPromoRuleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoRuleId(String newProductPromoRuleId) {
		String oldProductPromoRuleId = productPromoRuleId;
		productPromoRuleId = newProductPromoRuleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID, oldProductPromoRuleId, productPromoRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getRecurringAmount() {
		return recurringAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurringAmount(BigDecimal newRecurringAmount) {
		BigDecimal oldRecurringAmount = recurringAmount;
		recurringAmount = newRecurringAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__RECURRING_AMOUNT, oldRecurringAmount, recurringAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecondaryGeoId() {
		return secondaryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryGeoId(String newSecondaryGeoId) {
		String oldSecondaryGeoId = secondaryGeoId;
		secondaryGeoId = newSecondaryGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__SECONDARY_GEO_ID, oldSecondaryGeoId, secondaryGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipGroupSeqId() {
		return shipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipGroupSeqId(String newShipGroupSeqId) {
		String oldShipGroupSeqId = shipGroupSeqId;
		shipGroupSeqId = newShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSourcePercentage() {
		return sourcePercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePercentage(BigDecimal newSourcePercentage) {
		BigDecimal oldSourcePercentage = sourcePercentage;
		sourcePercentage = newSourcePercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__SOURCE_PERCENTAGE, oldSourcePercentage, sourcePercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceReferenceId() {
		return sourceReferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceReferenceId(String newSourceReferenceId) {
		String oldSourceReferenceId = sourceReferenceId;
		sourceReferenceId = newSourceReferenceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID, oldSourceReferenceId, sourceReferenceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthGeoId() {
		return taxAuthGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthGeoId(String newTaxAuthGeoId) {
		String oldTaxAuthGeoId = taxAuthGeoId;
		taxAuthGeoId = newTaxAuthGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthPartyId() {
		return taxAuthPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthPartyId(String newTaxAuthPartyId) {
		String oldTaxAuthPartyId = taxAuthPartyId;
		taxAuthPartyId = newTaxAuthPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaxAuthorityRateSeqId() {
		return taxAuthorityRateSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeqId(String newTaxAuthorityRateSeqId) {
		String oldTaxAuthorityRateSeqId = taxAuthorityRateSeqId;
		taxAuthorityRateSeqId = newTaxAuthorityRateSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrderPackage.ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID, oldTaxAuthorityRateSeqId, taxAuthorityRateSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getOrderAdjustmentAttributes() {
		if (orderAdjustmentAttributes == null) {
			orderAdjustmentAttributes = new EDataTypeUniqueEList<String>(String.class, this, OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES);
		}
		return orderAdjustmentAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnAdjustments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				return getOrderAdjustmentId();
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT:
				return getAmount();
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED:
				return getAmountAlreadyIncluded();
			case OrderPackage.ORDER_ADJUSTMENT__COMMENTS:
				return getComments();
			case OrderPackage.ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				return getCorrespondingProductId();
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_DATE:
				return getCreatedDate();
			case OrderPackage.ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				return getCustomerReferenceId();
			case OrderPackage.ORDER_ADJUSTMENT__DESCRIPTION:
				return getDescription();
			case OrderPackage.ORDER_ADJUSTMENT__EXEMPT_AMOUNT:
				return getExemptAmount();
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				return isIncludeInShipping();
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_TAX:
				return isIncludeInTax();
			case OrderPackage.ORDER_ADJUSTMENT__IS_MANUAL:
				return isIsManual();
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case OrderPackage.ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY:
				return getOldAmountPerQuantity();
			case OrderPackage.ORDER_ADJUSTMENT__OLD_PERCENTAGE:
				return getOldPercentage();
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE_ID:
				return getOrderAdjustmentTypeId();
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ID:
				return getOrderId();
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID:
				return getOrderItemSeqId();
			case OrderPackage.ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT_ID:
				return getOriginalAdjustmentId();
			case OrderPackage.ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				return getOverrideGlAccountId();
			case OrderPackage.ORDER_ADJUSTMENT__PRIMARY_GEO_ID:
				return getPrimaryGeoId();
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				return getProductPromoActionSeqId();
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ID:
				return getProductPromoId();
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				return getProductPromoRuleId();
			case OrderPackage.ORDER_ADJUSTMENT__RECURRING_AMOUNT:
				return getRecurringAmount();
			case OrderPackage.ORDER_ADJUSTMENT__SECONDARY_GEO_ID:
				return getSecondaryGeoId();
			case OrderPackage.ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_PERCENTAGE:
				return getSourcePercentage();
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID:
				return getSourceReferenceId();
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				return getTaxAuthorityRateSeqId();
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES:
				return getOrderAdjustmentAttributes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				setOrderAdjustmentId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED:
				setAmountAlreadyIncluded((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				setCorrespondingProductId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				setCustomerReferenceId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__EXEMPT_AMOUNT:
				setExemptAmount((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				setIncludeInShipping((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_TAX:
				setIncludeInTax((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__IS_MANUAL:
				setIsManual((Boolean)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY:
				setOldAmountPerQuantity((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__OLD_PERCENTAGE:
				setOldPercentage((Double)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE_ID:
				setOrderAdjustmentTypeId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ID:
				setOrderId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT_ID:
				setOriginalAdjustmentId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRIMARY_GEO_ID:
				setPrimaryGeoId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ID:
				setProductPromoId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__RECURRING_AMOUNT:
				setRecurringAmount((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SECONDARY_GEO_ID:
				setSecondaryGeoId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_PERCENTAGE:
				setSourcePercentage((BigDecimal)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID:
				setSourceReferenceId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((String)newValue);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES:
				getOrderAdjustmentAttributes().clear();
				getOrderAdjustmentAttributes().addAll((Collection<? extends String>)newValue);
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
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				setOrderAdjustmentId(ORDER_ADJUSTMENT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED:
				setAmountAlreadyIncluded(AMOUNT_ALREADY_INCLUDED_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				setCorrespondingProductId(CORRESPONDING_PRODUCT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				setCustomerReferenceId(CUSTOMER_REFERENCE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__EXEMPT_AMOUNT:
				setExemptAmount(EXEMPT_AMOUNT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				setIncludeInShipping(INCLUDE_IN_SHIPPING_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_TAX:
				setIncludeInTax(INCLUDE_IN_TAX_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__IS_MANUAL:
				setIsManual(IS_MANUAL_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY:
				setOldAmountPerQuantity(OLD_AMOUNT_PER_QUANTITY_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__OLD_PERCENTAGE:
				setOldPercentage(OLD_PERCENTAGE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE_ID:
				setOrderAdjustmentTypeId(ORDER_ADJUSTMENT_TYPE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID:
				setOrderItemSeqId(ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT_ID:
				setOriginalAdjustmentId(ORIGINAL_ADJUSTMENT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId(OVERRIDE_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRIMARY_GEO_ID:
				setPrimaryGeoId(PRIMARY_GEO_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId(PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ID:
				setProductPromoId(PRODUCT_PROMO_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId(PRODUCT_PROMO_RULE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__RECURRING_AMOUNT:
				setRecurringAmount(RECURRING_AMOUNT_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SECONDARY_GEO_ID:
				setSecondaryGeoId(SECONDARY_GEO_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_PERCENTAGE:
				setSourcePercentage(SOURCE_PERCENTAGE_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID:
				setSourceReferenceId(SOURCE_REFERENCE_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId(TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT);
				return;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES:
				getOrderAdjustmentAttributes().clear();
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
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				return ORDER_ADJUSTMENT_ID_EDEFAULT == null ? orderAdjustmentId != null : !ORDER_ADJUSTMENT_ID_EDEFAULT.equals(orderAdjustmentId);
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case OrderPackage.ORDER_ADJUSTMENT__AMOUNT_ALREADY_INCLUDED:
				return AMOUNT_ALREADY_INCLUDED_EDEFAULT == null ? amountAlreadyIncluded != null : !AMOUNT_ALREADY_INCLUDED_EDEFAULT.equals(amountAlreadyIncluded);
			case OrderPackage.ORDER_ADJUSTMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case OrderPackage.ORDER_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				return CORRESPONDING_PRODUCT_ID_EDEFAULT == null ? correspondingProductId != null : !CORRESPONDING_PRODUCT_ID_EDEFAULT.equals(correspondingProductId);
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case OrderPackage.ORDER_ADJUSTMENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case OrderPackage.ORDER_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				return CUSTOMER_REFERENCE_ID_EDEFAULT == null ? customerReferenceId != null : !CUSTOMER_REFERENCE_ID_EDEFAULT.equals(customerReferenceId);
			case OrderPackage.ORDER_ADJUSTMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrderPackage.ORDER_ADJUSTMENT__EXEMPT_AMOUNT:
				return EXEMPT_AMOUNT_EDEFAULT == null ? exemptAmount != null : !EXEMPT_AMOUNT_EDEFAULT.equals(exemptAmount);
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				return includeInShipping != INCLUDE_IN_SHIPPING_EDEFAULT;
			case OrderPackage.ORDER_ADJUSTMENT__INCLUDE_IN_TAX:
				return includeInTax != INCLUDE_IN_TAX_EDEFAULT;
			case OrderPackage.ORDER_ADJUSTMENT__IS_MANUAL:
				return isManual != IS_MANUAL_EDEFAULT;
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case OrderPackage.ORDER_ADJUSTMENT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case OrderPackage.ORDER_ADJUSTMENT__OLD_AMOUNT_PER_QUANTITY:
				return OLD_AMOUNT_PER_QUANTITY_EDEFAULT == null ? oldAmountPerQuantity != null : !OLD_AMOUNT_PER_QUANTITY_EDEFAULT.equals(oldAmountPerQuantity);
			case OrderPackage.ORDER_ADJUSTMENT__OLD_PERCENTAGE:
				return oldPercentage != OLD_PERCENTAGE_EDEFAULT;
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_TYPE_ID:
				return ORDER_ADJUSTMENT_TYPE_ID_EDEFAULT == null ? orderAdjustmentTypeId != null : !ORDER_ADJUSTMENT_TYPE_ID_EDEFAULT.equals(orderAdjustmentTypeId);
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ID:
				return ORDER_ID_EDEFAULT == null ? orderId != null : !ORDER_ID_EDEFAULT.equals(orderId);
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ITEM_SEQ_ID:
				return ORDER_ITEM_SEQ_ID_EDEFAULT == null ? orderItemSeqId != null : !ORDER_ITEM_SEQ_ID_EDEFAULT.equals(orderItemSeqId);
			case OrderPackage.ORDER_ADJUSTMENT__ORIGINAL_ADJUSTMENT_ID:
				return ORIGINAL_ADJUSTMENT_ID_EDEFAULT == null ? originalAdjustmentId != null : !ORIGINAL_ADJUSTMENT_ID_EDEFAULT.equals(originalAdjustmentId);
			case OrderPackage.ORDER_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				return OVERRIDE_GL_ACCOUNT_ID_EDEFAULT == null ? overrideGlAccountId != null : !OVERRIDE_GL_ACCOUNT_ID_EDEFAULT.equals(overrideGlAccountId);
			case OrderPackage.ORDER_ADJUSTMENT__PRIMARY_GEO_ID:
				return PRIMARY_GEO_ID_EDEFAULT == null ? primaryGeoId != null : !PRIMARY_GEO_ID_EDEFAULT.equals(primaryGeoId);
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				return PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT == null ? productPromoActionSeqId != null : !PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT.equals(productPromoActionSeqId);
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_ID:
				return PRODUCT_PROMO_ID_EDEFAULT == null ? productPromoId != null : !PRODUCT_PROMO_ID_EDEFAULT.equals(productPromoId);
			case OrderPackage.ORDER_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				return PRODUCT_PROMO_RULE_ID_EDEFAULT == null ? productPromoRuleId != null : !PRODUCT_PROMO_RULE_ID_EDEFAULT.equals(productPromoRuleId);
			case OrderPackage.ORDER_ADJUSTMENT__RECURRING_AMOUNT:
				return RECURRING_AMOUNT_EDEFAULT == null ? recurringAmount != null : !RECURRING_AMOUNT_EDEFAULT.equals(recurringAmount);
			case OrderPackage.ORDER_ADJUSTMENT__SECONDARY_GEO_ID:
				return SECONDARY_GEO_ID_EDEFAULT == null ? secondaryGeoId != null : !SECONDARY_GEO_ID_EDEFAULT.equals(secondaryGeoId);
			case OrderPackage.ORDER_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_PERCENTAGE:
				return SOURCE_PERCENTAGE_EDEFAULT == null ? sourcePercentage != null : !SOURCE_PERCENTAGE_EDEFAULT.equals(sourcePercentage);
			case OrderPackage.ORDER_ADJUSTMENT__SOURCE_REFERENCE_ID:
				return SOURCE_REFERENCE_ID_EDEFAULT == null ? sourceReferenceId != null : !SOURCE_REFERENCE_ID_EDEFAULT.equals(sourceReferenceId);
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case OrderPackage.ORDER_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				return TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT == null ? taxAuthorityRateSeqId != null : !TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT.equals(taxAuthorityRateSeqId);
			case OrderPackage.ORDER_ADJUSTMENT__ORDER_ADJUSTMENT_ATTRIBUTES:
				return orderAdjustmentAttributes != null && !orderAdjustmentAttributes.isEmpty();
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
		result.append(" (orderAdjustmentId: ");
		result.append(orderAdjustmentId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", amountAlreadyIncluded: ");
		result.append(amountAlreadyIncluded);
		result.append(", comments: ");
		result.append(comments);
		result.append(", correspondingProductId: ");
		result.append(correspondingProductId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", customerReferenceId: ");
		result.append(customerReferenceId);
		result.append(", description: ");
		result.append(description);
		result.append(", exemptAmount: ");
		result.append(exemptAmount);
		result.append(", includeInShipping: ");
		result.append(includeInShipping);
		result.append(", includeInTax: ");
		result.append(includeInTax);
		result.append(", isManual: ");
		result.append(isManual);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", oldAmountPerQuantity: ");
		result.append(oldAmountPerQuantity);
		result.append(", oldPercentage: ");
		result.append(oldPercentage);
		result.append(", orderAdjustmentTypeId: ");
		result.append(orderAdjustmentTypeId);
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", orderItemSeqId: ");
		result.append(orderItemSeqId);
		result.append(", originalAdjustmentId: ");
		result.append(originalAdjustmentId);
		result.append(", overrideGlAccountId: ");
		result.append(overrideGlAccountId);
		result.append(", primaryGeoId: ");
		result.append(primaryGeoId);
		result.append(", productFeatureId: ");
		result.append(productFeatureId);
		result.append(", productPromoActionSeqId: ");
		result.append(productPromoActionSeqId);
		result.append(", productPromoId: ");
		result.append(productPromoId);
		result.append(", productPromoRuleId: ");
		result.append(productPromoRuleId);
		result.append(", recurringAmount: ");
		result.append(recurringAmount);
		result.append(", secondaryGeoId: ");
		result.append(secondaryGeoId);
		result.append(", shipGroupSeqId: ");
		result.append(shipGroupSeqId);
		result.append(", sourcePercentage: ");
		result.append(sourcePercentage);
		result.append(", sourceReferenceId: ");
		result.append(sourceReferenceId);
		result.append(", taxAuthGeoId: ");
		result.append(taxAuthGeoId);
		result.append(", taxAuthPartyId: ");
		result.append(taxAuthPartyId);
		result.append(", taxAuthorityRateSeqId: ");
		result.append(taxAuthorityRateSeqId);
		result.append(", orderAdjustmentAttributes: ");
		result.append(orderAdjustmentAttributes);
		result.append(')');
		return result.toString();
	}

} //OrderAdjustmentImpl
