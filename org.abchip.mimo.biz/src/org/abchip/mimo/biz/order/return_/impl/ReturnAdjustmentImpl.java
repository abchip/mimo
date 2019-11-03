/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.return_.ReturnAdjustment;
import org.abchip.mimo.biz.order.return_.ReturnAdjustmentType;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnAdjustmentId <em>Return Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getCorrespondingProductId <em>Corresponding Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#isIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#isIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getOrderAdjustmentId <em>Order Adjustment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getPrimaryGeoId <em>Primary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnAdjustmentTypeId <em>Return Adjustment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getSecondaryGeoId <em>Secondary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthorityRateSeqId <em>Tax Authority Rate Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnAdjustmentImpl extends BizEntityTypedImpl<ReturnAdjustmentType> implements ReturnAdjustment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getReturnAdjustmentId() <em>Return Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAdjustmentId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ADJUSTMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnAdjustmentId() <em>Return Adjustment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAdjustmentId()
	 * @generated
	 * @ordered
	 */
	protected String returnAdjustmentId = RETURN_ADJUSTMENT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getReturnAdjustmentTypeId() <em>Return Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAdjustmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ADJUSTMENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnAdjustmentTypeId() <em>Return Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAdjustmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnAdjustmentTypeId = RETURN_ADJUSTMENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected String returnId = RETURN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnItemSeqId() <em>Return Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String returnItemSeqId = RETURN_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected String returnTypeId = RETURN_TYPE_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReturnPackage.Literals.RETURN_ADJUSTMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID, oldCorrespondingProductId, correspondingProductId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__CREATED_DATE, oldCreatedDate, createdDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID, oldCustomerReferenceId, customerReferenceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__EXEMPT_AMOUNT, oldExemptAmount, exemptAmount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING, oldIncludeInShipping, includeInShipping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_TAX, oldIncludeInTax, includeInTax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID, oldOrderAdjustmentId, orderAdjustmentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID, oldPrimaryGeoId, primaryGeoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID, oldProductFeatureId, productFeatureId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID, oldProductPromoActionSeqId, productPromoActionSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID, oldProductPromoRuleId, productPromoRuleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnAdjustmentId() {
		return returnAdjustmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnAdjustmentId(String newReturnAdjustmentId) {
		String oldReturnAdjustmentId = returnAdjustmentId;
		returnAdjustmentId = newReturnAdjustmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID, oldReturnAdjustmentId, returnAdjustmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnAdjustmentTypeId() {
		return returnAdjustmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnAdjustmentTypeId(String newReturnAdjustmentTypeId) {
		String oldReturnAdjustmentTypeId = returnAdjustmentTypeId;
		returnAdjustmentTypeId = newReturnAdjustmentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID, oldReturnAdjustmentTypeId, returnAdjustmentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(String newReturnId) {
		String oldReturnId = returnId;
		returnId = newReturnId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID, oldReturnId, returnId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnItemSeqId() {
		return returnItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnItemSeqId(String newReturnItemSeqId) {
		String oldReturnItemSeqId = returnItemSeqId;
		returnItemSeqId = newReturnItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID, oldReturnItemSeqId, returnItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnTypeId() {
		return returnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnTypeId(String newReturnTypeId) {
		String oldReturnTypeId = returnTypeId;
		returnTypeId = newReturnTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID, oldReturnTypeId, returnTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID, oldSecondaryGeoId, secondaryGeoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID, oldShipGroupSeqId, shipGroupSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__SOURCE_PERCENTAGE, oldSourcePercentage, sourcePercentage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID, oldSourceReferenceId, sourceReferenceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID, oldTaxAuthGeoId, taxAuthGeoId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID, oldTaxAuthPartyId, taxAuthPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID, oldTaxAuthorityRateSeqId, taxAuthorityRateSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID:
				return getReturnAdjustmentId();
			case ReturnPackage.RETURN_ADJUSTMENT__AMOUNT:
				return getAmount();
			case ReturnPackage.RETURN_ADJUSTMENT__COMMENTS:
				return getComments();
			case ReturnPackage.RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				return getCorrespondingProductId();
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_DATE:
				return getCreatedDate();
			case ReturnPackage.RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				return getCustomerReferenceId();
			case ReturnPackage.RETURN_ADJUSTMENT__DESCRIPTION:
				return getDescription();
			case ReturnPackage.RETURN_ADJUSTMENT__EXEMPT_AMOUNT:
				return getExemptAmount();
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				return isIncludeInShipping();
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_TAX:
				return isIncludeInTax();
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				return getOrderAdjustmentId();
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				return getOverrideGlAccountId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				return getPrimaryGeoId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				return getProductPromoActionSeqId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				return getProductPromoId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				return getProductPromoRuleId();
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				return getReturnAdjustmentTypeId();
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				return getReturnId();
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				return getReturnTypeId();
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				return getSecondaryGeoId();
			case ReturnPackage.RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				return getShipGroupSeqId();
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_PERCENTAGE:
				return getSourcePercentage();
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID:
				return getSourceReferenceId();
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID:
				return getTaxAuthGeoId();
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				return getTaxAuthPartyId();
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				return getTaxAuthorityRateSeqId();
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
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID:
				setReturnAdjustmentId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				setCorrespondingProductId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				setCustomerReferenceId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__EXEMPT_AMOUNT:
				setExemptAmount((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				setIncludeInShipping((Boolean)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_TAX:
				setIncludeInTax((Boolean)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				setOrderAdjustmentId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				setPrimaryGeoId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				setProductPromoId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				setReturnAdjustmentTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				setReturnId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				setReturnTypeId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				setSecondaryGeoId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_PERCENTAGE:
				setSourcePercentage((BigDecimal)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID:
				setSourceReferenceId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((String)newValue);
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
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID:
				setReturnAdjustmentId(RETURN_ADJUSTMENT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				setCorrespondingProductId(CORRESPONDING_PRODUCT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				setCustomerReferenceId(CUSTOMER_REFERENCE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__EXEMPT_AMOUNT:
				setExemptAmount(EXEMPT_AMOUNT_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				setIncludeInShipping(INCLUDE_IN_SHIPPING_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_TAX:
				setIncludeInTax(INCLUDE_IN_TAX_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				setOrderAdjustmentId(ORDER_ADJUSTMENT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId(OVERRIDE_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				setPrimaryGeoId(PRIMARY_GEO_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId(PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				setProductPromoId(PRODUCT_PROMO_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId(PRODUCT_PROMO_RULE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				setReturnAdjustmentTypeId(RETURN_ADJUSTMENT_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				setReturnId(RETURN_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				setReturnTypeId(RETURN_TYPE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				setSecondaryGeoId(SECONDARY_GEO_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				setShipGroupSeqId(SHIP_GROUP_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_PERCENTAGE:
				setSourcePercentage(SOURCE_PERCENTAGE_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID:
				setSourceReferenceId(SOURCE_REFERENCE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID:
				setTaxAuthGeoId(TAX_AUTH_GEO_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				setTaxAuthPartyId(TAX_AUTH_PARTY_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId(TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT);
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
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_ID:
				return RETURN_ADJUSTMENT_ID_EDEFAULT == null ? returnAdjustmentId != null : !RETURN_ADJUSTMENT_ID_EDEFAULT.equals(returnAdjustmentId);
			case ReturnPackage.RETURN_ADJUSTMENT__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case ReturnPackage.RETURN_ADJUSTMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ReturnPackage.RETURN_ADJUSTMENT__CORRESPONDING_PRODUCT_ID:
				return CORRESPONDING_PRODUCT_ID_EDEFAULT == null ? correspondingProductId != null : !CORRESPONDING_PRODUCT_ID_EDEFAULT.equals(correspondingProductId);
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case ReturnPackage.RETURN_ADJUSTMENT__CUSTOMER_REFERENCE_ID:
				return CUSTOMER_REFERENCE_ID_EDEFAULT == null ? customerReferenceId != null : !CUSTOMER_REFERENCE_ID_EDEFAULT.equals(customerReferenceId);
			case ReturnPackage.RETURN_ADJUSTMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ReturnPackage.RETURN_ADJUSTMENT__EXEMPT_AMOUNT:
				return EXEMPT_AMOUNT_EDEFAULT == null ? exemptAmount != null : !EXEMPT_AMOUNT_EDEFAULT.equals(exemptAmount);
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_SHIPPING:
				return includeInShipping != INCLUDE_IN_SHIPPING_EDEFAULT;
			case ReturnPackage.RETURN_ADJUSTMENT__INCLUDE_IN_TAX:
				return includeInTax != INCLUDE_IN_TAX_EDEFAULT;
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case ReturnPackage.RETURN_ADJUSTMENT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				return ORDER_ADJUSTMENT_ID_EDEFAULT == null ? orderAdjustmentId != null : !ORDER_ADJUSTMENT_ID_EDEFAULT.equals(orderAdjustmentId);
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				return OVERRIDE_GL_ACCOUNT_ID_EDEFAULT == null ? overrideGlAccountId != null : !OVERRIDE_GL_ACCOUNT_ID_EDEFAULT.equals(overrideGlAccountId);
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				return PRIMARY_GEO_ID_EDEFAULT == null ? primaryGeoId != null : !PRIMARY_GEO_ID_EDEFAULT.equals(primaryGeoId);
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				return PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT == null ? productPromoActionSeqId != null : !PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT.equals(productPromoActionSeqId);
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				return PRODUCT_PROMO_ID_EDEFAULT == null ? productPromoId != null : !PRODUCT_PROMO_ID_EDEFAULT.equals(productPromoId);
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				return PRODUCT_PROMO_RULE_ID_EDEFAULT == null ? productPromoRuleId != null : !PRODUCT_PROMO_RULE_ID_EDEFAULT.equals(productPromoRuleId);
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				return RETURN_ADJUSTMENT_TYPE_ID_EDEFAULT == null ? returnAdjustmentTypeId != null : !RETURN_ADJUSTMENT_TYPE_ID_EDEFAULT.equals(returnAdjustmentTypeId);
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				return RETURN_ID_EDEFAULT == null ? returnId != null : !RETURN_ID_EDEFAULT.equals(returnId);
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				return RETURN_TYPE_ID_EDEFAULT == null ? returnTypeId != null : !RETURN_TYPE_ID_EDEFAULT.equals(returnTypeId);
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				return SECONDARY_GEO_ID_EDEFAULT == null ? secondaryGeoId != null : !SECONDARY_GEO_ID_EDEFAULT.equals(secondaryGeoId);
			case ReturnPackage.RETURN_ADJUSTMENT__SHIP_GROUP_SEQ_ID:
				return SHIP_GROUP_SEQ_ID_EDEFAULT == null ? shipGroupSeqId != null : !SHIP_GROUP_SEQ_ID_EDEFAULT.equals(shipGroupSeqId);
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_PERCENTAGE:
				return SOURCE_PERCENTAGE_EDEFAULT == null ? sourcePercentage != null : !SOURCE_PERCENTAGE_EDEFAULT.equals(sourcePercentage);
			case ReturnPackage.RETURN_ADJUSTMENT__SOURCE_REFERENCE_ID:
				return SOURCE_REFERENCE_ID_EDEFAULT == null ? sourceReferenceId != null : !SOURCE_REFERENCE_ID_EDEFAULT.equals(sourceReferenceId);
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_GEO_ID:
				return TAX_AUTH_GEO_ID_EDEFAULT == null ? taxAuthGeoId != null : !TAX_AUTH_GEO_ID_EDEFAULT.equals(taxAuthGeoId);
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTH_PARTY_ID:
				return TAX_AUTH_PARTY_ID_EDEFAULT == null ? taxAuthPartyId != null : !TAX_AUTH_PARTY_ID_EDEFAULT.equals(taxAuthPartyId);
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				return TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT == null ? taxAuthorityRateSeqId != null : !TAX_AUTHORITY_RATE_SEQ_ID_EDEFAULT.equals(taxAuthorityRateSeqId);
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
		result.append(" (returnAdjustmentId: ");
		result.append(returnAdjustmentId);
		result.append(", amount: ");
		result.append(amount);
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
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", orderAdjustmentId: ");
		result.append(orderAdjustmentId);
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
		result.append(", returnAdjustmentTypeId: ");
		result.append(returnAdjustmentTypeId);
		result.append(", returnId: ");
		result.append(returnId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
		result.append(", returnTypeId: ");
		result.append(returnTypeId);
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
		result.append(')');
		return result.toString();
	}

} //ReturnAdjustmentImpl
