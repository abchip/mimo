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

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.tax.TaxAuthorityRateProduct;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.order.order.OrderAdjustment;
import org.abchip.mimo.biz.order.return_.ReturnAdjustment;
import org.abchip.mimo.biz.order.return_.ReturnAdjustmentType;
import org.abchip.mimo.biz.order.return_.ReturnHeader;
import org.abchip.mimo.biz.order.return_.ReturnPackage;
import org.abchip.mimo.biz.order.return_.ReturnType;
import org.abchip.mimo.biz.product.promo.ProductPromo;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getCustomerReferenceId <em>Customer Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getExemptAmount <em>Exempt Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#isIncludeInShipping <em>Include In Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#isIncludeInTax <em>Include In Tax</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnItemSeqId <em>Return Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getShipGroupSeqId <em>Ship Group Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getSourcePercentage <em>Source Percentage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getSourceReferenceId <em>Source Reference Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getTaxAuthPartyId <em>Tax Auth Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnAdjustmentTypeId <em>Return Adjustment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnId <em>Return Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getPrimaryGeoId <em>Primary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getSecondaryGeoId <em>Secondary Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getOverrideGlAccountId <em>Override Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getReturnTypeId <em>Return Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.impl.ReturnAdjustmentImpl#getOrderAdjustmentId <em>Order Adjustment Id</em>}</li>
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
	 * The cached value of the '{@link #getReturnAdjustmentTypeId() <em>Return Adjustment Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnAdjustmentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ReturnAdjustmentType returnAdjustmentTypeId;

	/**
	 * The cached value of the '{@link #getReturnId() <em>Return Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnId()
	 * @generated
	 * @ordered
	 */
	protected ReturnHeader returnId;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin createdByUserLogin;

	/**
	 * The cached value of the '{@link #getProductPromoId() <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductPromoId()
	 * @generated
	 * @ordered
	 */
	protected ProductPromo productPromoId;

	/**
	 * The cached value of the '{@link #getPrimaryGeoId() <em>Primary Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo primaryGeoId;

	/**
	 * The cached value of the '{@link #getSecondaryGeoId() <em>Secondary Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo secondaryGeoId;

	/**
	 * The cached value of the '{@link #getOverrideGlAccountId() <em>Override Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount overrideGlAccountId;

	/**
	 * The cached value of the '{@link #getReturnTypeId() <em>Return Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypeId()
	 * @generated
	 * @ordered
	 */
	protected ReturnType returnTypeId;

	/**
	 * The cached value of the '{@link #getOrderAdjustmentId() <em>Order Adjustment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderAdjustmentId()
	 * @generated
	 * @ordered
	 */
	protected OrderAdjustment orderAdjustmentId;

	/**
	 * The cached value of the '{@link #getTaxAuthorityRateSeqId() <em>Tax Authority Rate Seq Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAuthorityRateSeqId()
	 * @generated
	 * @ordered
	 */
	protected TaxAuthorityRateProduct taxAuthorityRateSeqId;

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
	public UserLogin getCreatedByUserLogin() {
		if (createdByUserLogin != null && ((EObject)createdByUserLogin).eIsProxy()) {
			InternalEObject oldCreatedByUserLogin = (InternalEObject)createdByUserLogin;
			createdByUserLogin = (UserLogin)eResolveProxy(oldCreatedByUserLogin);
			if (createdByUserLogin != oldCreatedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
			}
		}
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		UserLogin oldCreatedByUserLogin = createdByUserLogin;
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
	public OrderAdjustment getOrderAdjustmentId() {
		if (orderAdjustmentId != null && ((EObject)orderAdjustmentId).eIsProxy()) {
			InternalEObject oldOrderAdjustmentId = (InternalEObject)orderAdjustmentId;
			orderAdjustmentId = (OrderAdjustment)eResolveProxy(oldOrderAdjustmentId);
			if (orderAdjustmentId != oldOrderAdjustmentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID, oldOrderAdjustmentId, orderAdjustmentId));
			}
		}
		return orderAdjustmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderAdjustment basicGetOrderAdjustmentId() {
		return orderAdjustmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderAdjustmentId(OrderAdjustment newOrderAdjustmentId) {
		OrderAdjustment oldOrderAdjustmentId = orderAdjustmentId;
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
	public GlAccount getOverrideGlAccountId() {
		if (overrideGlAccountId != null && ((EObject)overrideGlAccountId).eIsProxy()) {
			InternalEObject oldOverrideGlAccountId = (InternalEObject)overrideGlAccountId;
			overrideGlAccountId = (GlAccount)eResolveProxy(oldOverrideGlAccountId);
			if (overrideGlAccountId != oldOverrideGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID, oldOverrideGlAccountId, overrideGlAccountId));
			}
		}
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetOverrideGlAccountId() {
		return overrideGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverrideGlAccountId(GlAccount newOverrideGlAccountId) {
		GlAccount oldOverrideGlAccountId = overrideGlAccountId;
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
	public Geo getPrimaryGeoId() {
		if (primaryGeoId != null && ((EObject)primaryGeoId).eIsProxy()) {
			InternalEObject oldPrimaryGeoId = (InternalEObject)primaryGeoId;
			primaryGeoId = (Geo)eResolveProxy(oldPrimaryGeoId);
			if (primaryGeoId != oldPrimaryGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID, oldPrimaryGeoId, primaryGeoId));
			}
		}
		return primaryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetPrimaryGeoId() {
		return primaryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryGeoId(Geo newPrimaryGeoId) {
		Geo oldPrimaryGeoId = primaryGeoId;
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
	public ProductPromo getProductPromoId() {
		if (productPromoId != null && ((EObject)productPromoId).eIsProxy()) {
			InternalEObject oldProductPromoId = (InternalEObject)productPromoId;
			productPromoId = (ProductPromo)eResolveProxy(oldProductPromoId);
			if (productPromoId != oldProductPromoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID, oldProductPromoId, productPromoId));
			}
		}
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPromo basicGetProductPromoId() {
		return productPromoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductPromoId(ProductPromo newProductPromoId) {
		ProductPromo oldProductPromoId = productPromoId;
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
	public ReturnAdjustmentType getReturnAdjustmentTypeId() {
		if (returnAdjustmentTypeId != null && ((EObject)returnAdjustmentTypeId).eIsProxy()) {
			InternalEObject oldReturnAdjustmentTypeId = (InternalEObject)returnAdjustmentTypeId;
			returnAdjustmentTypeId = (ReturnAdjustmentType)eResolveProxy(oldReturnAdjustmentTypeId);
			if (returnAdjustmentTypeId != oldReturnAdjustmentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID, oldReturnAdjustmentTypeId, returnAdjustmentTypeId));
			}
		}
		return returnAdjustmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnAdjustmentType basicGetReturnAdjustmentTypeId() {
		return returnAdjustmentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnAdjustmentTypeId(ReturnAdjustmentType newReturnAdjustmentTypeId) {
		ReturnAdjustmentType oldReturnAdjustmentTypeId = returnAdjustmentTypeId;
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
	public ReturnHeader getReturnId() {
		if (returnId != null && ((EObject)returnId).eIsProxy()) {
			InternalEObject oldReturnId = (InternalEObject)returnId;
			returnId = (ReturnHeader)eResolveProxy(oldReturnId);
			if (returnId != oldReturnId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID, oldReturnId, returnId));
			}
		}
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnHeader basicGetReturnId() {
		return returnId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnId(ReturnHeader newReturnId) {
		ReturnHeader oldReturnId = returnId;
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
	public ReturnType getReturnTypeId() {
		if (returnTypeId != null && ((EObject)returnTypeId).eIsProxy()) {
			InternalEObject oldReturnTypeId = (InternalEObject)returnTypeId;
			returnTypeId = (ReturnType)eResolveProxy(oldReturnTypeId);
			if (returnTypeId != oldReturnTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID, oldReturnTypeId, returnTypeId));
			}
		}
		return returnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType basicGetReturnTypeId() {
		return returnTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnTypeId(ReturnType newReturnTypeId) {
		ReturnType oldReturnTypeId = returnTypeId;
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
	public Geo getSecondaryGeoId() {
		if (secondaryGeoId != null && ((EObject)secondaryGeoId).eIsProxy()) {
			InternalEObject oldSecondaryGeoId = (InternalEObject)secondaryGeoId;
			secondaryGeoId = (Geo)eResolveProxy(oldSecondaryGeoId);
			if (secondaryGeoId != oldSecondaryGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID, oldSecondaryGeoId, secondaryGeoId));
			}
		}
		return secondaryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetSecondaryGeoId() {
		return secondaryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryGeoId(Geo newSecondaryGeoId) {
		Geo oldSecondaryGeoId = secondaryGeoId;
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
	public TaxAuthorityRateProduct getTaxAuthorityRateSeqId() {
		if (taxAuthorityRateSeqId != null && ((EObject)taxAuthorityRateSeqId).eIsProxy()) {
			InternalEObject oldTaxAuthorityRateSeqId = (InternalEObject)taxAuthorityRateSeqId;
			taxAuthorityRateSeqId = (TaxAuthorityRateProduct)eResolveProxy(oldTaxAuthorityRateSeqId);
			if (taxAuthorityRateSeqId != oldTaxAuthorityRateSeqId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID, oldTaxAuthorityRateSeqId, taxAuthorityRateSeqId));
			}
		}
		return taxAuthorityRateSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxAuthorityRateProduct basicGetTaxAuthorityRateSeqId() {
		return taxAuthorityRateSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxAuthorityRateSeqId(TaxAuthorityRateProduct newTaxAuthorityRateSeqId) {
		TaxAuthorityRateProduct oldTaxAuthorityRateSeqId = taxAuthorityRateSeqId;
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
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				return getProductFeatureId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				return getProductPromoActionSeqId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				return getProductPromoRuleId();
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				return getReturnItemSeqId();
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
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				if (resolve) return getReturnAdjustmentTypeId();
				return basicGetReturnAdjustmentTypeId();
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				if (resolve) return getReturnId();
				return basicGetReturnId();
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				if (resolve) return getProductPromoId();
				return basicGetProductPromoId();
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				if (resolve) return getPrimaryGeoId();
				return basicGetPrimaryGeoId();
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				if (resolve) return getSecondaryGeoId();
				return basicGetSecondaryGeoId();
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				if (resolve) return getOverrideGlAccountId();
				return basicGetOverrideGlAccountId();
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				if (resolve) return getReturnTypeId();
				return basicGetReturnTypeId();
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				if (resolve) return getOrderAdjustmentId();
				return basicGetOrderAdjustmentId();
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				if (resolve) return getTaxAuthorityRateSeqId();
				return basicGetTaxAuthorityRateSeqId();
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
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				setProductFeatureId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId((String)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId((String)newValue);
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
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				setReturnAdjustmentTypeId((ReturnAdjustmentType)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				setReturnId((ReturnHeader)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				setPrimaryGeoId((Geo)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				setSecondaryGeoId((Geo)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				setReturnTypeId((ReturnType)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				setOrderAdjustmentId((OrderAdjustment)newValue);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((TaxAuthorityRateProduct)newValue);
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
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				setProductFeatureId(PRODUCT_FEATURE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				setProductPromoActionSeqId(PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				setProductPromoRuleId(PRODUCT_PROMO_RULE_ID_EDEFAULT);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				setReturnItemSeqId(RETURN_ITEM_SEQ_ID_EDEFAULT);
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
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				setReturnAdjustmentTypeId((ReturnAdjustmentType)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				setReturnId((ReturnHeader)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				setProductPromoId((ProductPromo)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				setPrimaryGeoId((Geo)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				setSecondaryGeoId((Geo)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				setOverrideGlAccountId((GlAccount)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				setReturnTypeId((ReturnType)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				setOrderAdjustmentId((OrderAdjustment)null);
				return;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				setTaxAuthorityRateSeqId((TaxAuthorityRateProduct)null);
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
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_FEATURE_ID:
				return PRODUCT_FEATURE_ID_EDEFAULT == null ? productFeatureId != null : !PRODUCT_FEATURE_ID_EDEFAULT.equals(productFeatureId);
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID:
				return PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT == null ? productPromoActionSeqId != null : !PRODUCT_PROMO_ACTION_SEQ_ID_EDEFAULT.equals(productPromoActionSeqId);
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_RULE_ID:
				return PRODUCT_PROMO_RULE_ID_EDEFAULT == null ? productPromoRuleId != null : !PRODUCT_PROMO_RULE_ID_EDEFAULT.equals(productPromoRuleId);
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ITEM_SEQ_ID:
				return RETURN_ITEM_SEQ_ID_EDEFAULT == null ? returnItemSeqId != null : !RETURN_ITEM_SEQ_ID_EDEFAULT.equals(returnItemSeqId);
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
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ADJUSTMENT_TYPE_ID:
				return returnAdjustmentTypeId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_ID:
				return returnId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case ReturnPackage.RETURN_ADJUSTMENT__PRODUCT_PROMO_ID:
				return productPromoId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__PRIMARY_GEO_ID:
				return primaryGeoId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__SECONDARY_GEO_ID:
				return secondaryGeoId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID:
				return overrideGlAccountId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__RETURN_TYPE_ID:
				return returnTypeId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__ORDER_ADJUSTMENT_ID:
				return orderAdjustmentId != null;
			case ReturnPackage.RETURN_ADJUSTMENT__TAX_AUTHORITY_RATE_SEQ_ID:
				return taxAuthorityRateSeqId != null;
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
		result.append(", productFeatureId: ");
		result.append(productFeatureId);
		result.append(", productPromoActionSeqId: ");
		result.append(productPromoActionSeqId);
		result.append(", productPromoRuleId: ");
		result.append(productPromoRuleId);
		result.append(", returnItemSeqId: ");
		result.append(returnItemSeqId);
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
		result.append(')');
		return result.toString();
	}

} //ReturnAdjustmentImpl
