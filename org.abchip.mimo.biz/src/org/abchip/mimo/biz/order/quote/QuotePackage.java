/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.quote;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.quote.QuoteFactory
 * @model kind="package"
 * @generated
 */
public interface QuotePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quote";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/order/quote";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-quote";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuotePackage eINSTANCE = org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl <em>Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuote()
	 * @generated
	 */
	int QUOTE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__ISSUE_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__PARTY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quote Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Quote Coefficients</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_COEFFICIENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Quote Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_ITEMS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Quote Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Quote Notes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_NOTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Quote Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Quote Work Efforts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__QUOTE_WORK_EFFORTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sales Channel Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__SALES_CHANNEL_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Valid From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__VALID_FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Valid Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE__VALID_THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteAdjustmentImpl <em>Adjustment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteAdjustmentImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteAdjustment()
	 * @generated
	 */
	int QUOTE_ADJUSTMENT = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Adjustment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Corresponding Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CREATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Customer Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__CUSTOMER_REFERENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Exempt Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__EXEMPT_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Include In Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__INCLUDE_IN_SHIPPING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Include In Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__INCLUDE_IN_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Override Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Primary Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRIMARY_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Product Promo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_PROMO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Quote Adjustment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__QUOTE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Secondary Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__SECONDARY_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Source Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__SOURCE_PERCENTAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Source Reference Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__SOURCE_REFERENCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Adjustment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ADJUSTMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteAttributeImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteAttribute()
	 * @generated
	 */
	int QUOTE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteCoefficientImpl <em>Coefficient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteCoefficientImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteCoefficient()
	 * @generated
	 */
	int QUOTE_COEFFICIENT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coeff Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__COEFF_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coeff Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT__COEFF_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coefficient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_COEFFICIENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteItem()
	 * @generated
	 */
	int QUOTE_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUOTE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CUST_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cust Request Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Deliverable Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__DELIVERABLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Estimated Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__ESTIMATED_DELIVERY_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Promo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__IS_PROMO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lead Time Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__LEAD_TIME_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Quote Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__QUOTE_UNIT_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reserv Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__RESERV_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Reserv Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__RESERV_PERSONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Reserv Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__RESERV_START = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Selected Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__SELECTED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Skill Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__SKILL_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteNoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteNoteImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteNote()
	 * @generated
	 */
	int QUOTE_NOTE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__CREATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_NOTE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Note Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__NOTE_ID = BizPackage.BIZ_ENTITY_NOTE__NOTE_ID;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE__QUOTE_ID = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_NOTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_NOTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteRoleImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteRole()
	 * @generated
	 */
	int QUOTE_ROLE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteTerm()
	 * @generated
	 */
	int QUOTE_TERM = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Term Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TERM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__QUOTE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TERM_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TERM_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__TEXT_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermAttributeImpl <em>Term Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTermAttributeImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteTermAttribute()
	 * @generated
	 */
	int QUOTE_TERM_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quote Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__QUOTE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Term Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__TERM_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Term Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TERM_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteType()
	 * @generated
	 */
	int QUOTE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__QUOTE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Quote Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE__QUOTE_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTypeAttrImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteTypeAttr()
	 * @generated
	 */
	int QUOTE_TYPE_ATTR = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__QUOTE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteWorkEffortImpl <em>Work Effort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.order.quote.impl.QuoteWorkEffortImpl
	 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteWorkEffort()
	 * @generated
	 */
	int QUOTE_WORK_EFFORT = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quote Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__QUOTE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT__WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Work Effort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUOTE_WORK_EFFORT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.Quote <em>Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quote</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote
	 * @generated
	 */
	EClass getQuote();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteId()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_QuoteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.Quote#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getCurrencyUomId()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.Quote#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getDescription()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.Quote#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getIssueDate()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_IssueDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.Quote#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getPartyId()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.Quote#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getProductStoreId()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_ProductStoreId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteAttributes <em>Quote Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Attributes</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteAttributes()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteCoefficients <em>Quote Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Coefficients</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteCoefficients()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteCoefficients();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteItems <em>Quote Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Items</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteItems()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteName <em>Quote Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Name</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteName()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_QuoteName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteNotes <em>Quote Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Notes</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteNotes()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteNotes();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteTypeId <em>Quote Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteTypeId()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.quote.Quote#getQuoteWorkEfforts <em>Quote Work Efforts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Work Efforts</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getQuoteWorkEfforts()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_QuoteWorkEfforts();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.Quote#getSalesChannelEnumId <em>Sales Channel Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sales Channel Enum Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getSalesChannelEnumId()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_SalesChannelEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.Quote#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getStatusId()
	 * @see #getQuote()
	 * @generated
	 */
	EReference getQuote_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.Quote#getValidFromDate <em>Valid From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getValidFromDate()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_ValidFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.Quote#getValidThruDate <em>Valid Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Thru Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.Quote#getValidThruDate()
	 * @see #getQuote()
	 * @generated
	 */
	EAttribute getQuote_ValidThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment <em>Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjustment</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment
	 * @generated
	 */
	EClass getQuoteAdjustment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteAdjustmentId <em>Quote Adjustment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Adjustment Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteAdjustmentId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_QuoteAdjustmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getAmount()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getComments()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCorrespondingProductId <em>Corresponding Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCorrespondingProductId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_CorrespondingProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCreatedByUserLogin()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCreatedDate()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCustomerReferenceId <em>Customer Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Reference Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getCustomerReferenceId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_CustomerReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getDescription()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getExemptAmount <em>Exempt Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exempt Amount</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getExemptAmount()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ExemptAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#isIncludeInShipping <em>Include In Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Shipping</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#isIncludeInShipping()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_IncludeInShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#isIncludeInTax <em>Include In Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Tax</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#isIncludeInTax()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_IncludeInTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getLastModifiedByUserLogin()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getLastModifiedDate()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_LastModifiedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getOverrideGlAccountId <em>Override Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getOverrideGlAccountId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_OverrideGlAccountId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getPrimaryGeoId <em>Primary Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Geo Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getPrimaryGeoId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_PrimaryGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductFeatureId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductPromoActionSeqId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ProductPromoActionSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductPromoId <em>Product Promo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductPromoId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_ProductPromoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductPromoRuleId <em>Product Promo Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Promo Rule Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getProductPromoRuleId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_ProductPromoRuleId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteAdjustmentTypeId <em>Quote Adjustment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Adjustment Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteAdjustmentTypeId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_QuoteAdjustmentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getQuoteItemSeqId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_QuoteItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getSecondaryGeoId <em>Secondary Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secondary Geo Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getSecondaryGeoId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EReference getQuoteAdjustment_SecondaryGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getSourcePercentage <em>Source Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Percentage</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getSourcePercentage()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_SourcePercentage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getSourceReferenceId <em>Source Reference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Reference Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getSourceReferenceId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_SourceReferenceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getTaxAuthGeoId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_TaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAdjustment#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAdjustment#getTaxAuthPartyId()
	 * @see #getQuoteAdjustment()
	 * @generated
	 */
	EAttribute getQuoteAdjustment_TaxAuthPartyId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAttribute
	 * @generated
	 */
	EClass getQuoteAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteAttribute#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAttribute#getQuoteId()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EReference getQuoteAttribute_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAttribute#getAttrName()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EAttribute getQuoteAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAttribute#getAttrDescription()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EAttribute getQuoteAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteAttribute#getAttrValue()
	 * @see #getQuoteAttribute()
	 * @generated
	 */
	EAttribute getQuoteAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient <em>Coefficient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coefficient</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteCoefficient
	 * @generated
	 */
	EClass getQuoteCoefficient();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteCoefficient#getQuoteId()
	 * @see #getQuoteCoefficient()
	 * @generated
	 */
	EReference getQuoteCoefficient_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffName <em>Coeff Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeff Name</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffName()
	 * @see #getQuoteCoefficient()
	 * @generated
	 */
	EAttribute getQuoteCoefficient_CoeffName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffValue <em>Coeff Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeff Value</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteCoefficient#getCoeffValue()
	 * @see #getQuoteCoefficient()
	 * @generated
	 */
	EAttribute getQuoteCoefficient_CoeffValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem
	 * @generated
	 */
	EClass getQuoteItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteItemSeqId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_QuoteItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getComments()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getConfigId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestId <em>Cust Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust Request Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_CustRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestItemSeqId <em>Cust Request Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cust Request Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getCustRequestItemSeqId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_CustRequestItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getDeliverableTypeId <em>Deliverable Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deliverable Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getDeliverableTypeId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_DeliverableTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getEstimatedDeliveryDate <em>Estimated Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Delivery Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getEstimatedDeliveryDate()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_EstimatedDeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#isIsPromo <em>Is Promo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Promo</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#isIsPromo()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_IsPromo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getLeadTimeDays <em>Lead Time Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lead Time Days</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getLeadTimeDays()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_LeadTimeDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getProductFeatureId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getProductId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getQuantity()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteUnitPrice <em>Quote Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Unit Price</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getQuoteUnitPrice()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_QuoteUnitPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservLength <em>Reserv Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Length</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getReservLength()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ReservLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservPersons <em>Reserv Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Persons</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getReservPersons()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ReservPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getReservStart <em>Reserv Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Start</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getReservStart()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_ReservStart();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getSelectedAmount <em>Selected Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected Amount</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getSelectedAmount()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EAttribute getQuoteItem_SelectedAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getSkillTypeId <em>Skill Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getSkillTypeId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_SkillTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getUomId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_UomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteItem#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteItem#getWorkEffortId()
	 * @see #getQuoteItem()
	 * @generated
	 */
	EReference getQuoteItem_WorkEffortId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteNote
	 * @generated
	 */
	EClass getQuoteNote();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteNote#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteNote#getQuoteId()
	 * @see #getQuoteNote()
	 * @generated
	 */
	EReference getQuoteNote_QuoteId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteRole
	 * @generated
	 */
	EClass getQuoteRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteRole#getQuoteId()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EReference getQuoteRole_QuoteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteRole#getPartyId()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EReference getQuoteRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteRole#getRoleTypeId()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EReference getQuoteRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteRole#getFromDate()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EAttribute getQuoteRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteRole#getThruDate()
	 * @see #getQuoteRole()
	 * @generated
	 */
	EAttribute getQuoteRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm
	 * @generated
	 */
	EClass getQuoteTerm();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getTermTypeId <em>Term Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getTermTypeId()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EReference getQuoteTerm_TermTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getQuoteId()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EReference getQuoteTerm_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getQuoteItemSeqId()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_QuoteItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getDescription()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getTermDays <em>Term Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Days</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getTermDays()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_TermDays();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getTermValue <em>Term Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Value</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getTermValue()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_TermValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getTextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Value</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getTextValue()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_TextValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTerm#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTerm#getUomId()
	 * @see #getQuoteTerm()
	 * @generated
	 */
	EAttribute getQuoteTerm_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteTermAttribute <em>Term Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Attribute</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTermAttribute
	 * @generated
	 */
	EClass getQuoteTermAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getTermTypeId <em>Term Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getTermTypeId()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_TermTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getQuoteId()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_QuoteId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getQuoteItemSeqId <em>Quote Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getQuoteItemSeqId()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_QuoteItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getAttrName()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getAttrDescription()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTermAttribute#getAttrValue()
	 * @see #getQuoteTermAttribute()
	 * @generated
	 */
	EAttribute getQuoteTermAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteType
	 * @generated
	 */
	EClass getQuoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteType#getQuoteTypeId <em>Quote Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quote Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteType#getQuoteTypeId()
	 * @see #getQuoteType()
	 * @generated
	 */
	EAttribute getQuoteType_QuoteTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteType#getDescription()
	 * @see #getQuoteType()
	 * @generated
	 */
	EAttribute getQuoteType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteType#isHasTable()
	 * @see #getQuoteType()
	 * @generated
	 */
	EAttribute getQuoteType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteType#getParentTypeId()
	 * @see #getQuoteType()
	 * @generated
	 */
	EReference getQuoteType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.order.quote.QuoteType#getQuoteTypeAttrs <em>Quote Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quote Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteType#getQuoteTypeAttrs()
	 * @see #getQuoteType()
	 * @generated
	 */
	EReference getQuoteType_QuoteTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTypeAttr
	 * @generated
	 */
	EClass getQuoteTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteTypeAttr#getQuoteTypeId <em>Quote Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Type Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTypeAttr#getQuoteTypeId()
	 * @see #getQuoteTypeAttr()
	 * @generated
	 */
	EReference getQuoteTypeAttr_QuoteTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTypeAttr#getAttrName()
	 * @see #getQuoteTypeAttr()
	 * @generated
	 */
	EAttribute getQuoteTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.order.quote.QuoteTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteTypeAttr#getDescription()
	 * @see #getQuoteTypeAttr()
	 * @generated
	 */
	EAttribute getQuoteTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.order.quote.QuoteWorkEffort <em>Work Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Effort</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteWorkEffort
	 * @generated
	 */
	EClass getQuoteWorkEffort();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteWorkEffort#getQuoteId <em>Quote Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quote Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteWorkEffort#getQuoteId()
	 * @see #getQuoteWorkEffort()
	 * @generated
	 */
	EReference getQuoteWorkEffort_QuoteId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.order.quote.QuoteWorkEffort#getWorkEffortId <em>Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.order.quote.QuoteWorkEffort#getWorkEffortId()
	 * @see #getQuoteWorkEffort()
	 * @generated
	 */
	EReference getQuoteWorkEffort_WorkEffortId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuoteFactory getQuoteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteImpl <em>Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuote()
		 * @generated
		 */
		EClass QUOTE = eINSTANCE.getQuote();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__QUOTE_ID = eINSTANCE.getQuote_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__CURRENCY_UOM_ID = eINSTANCE.getQuote_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__DESCRIPTION = eINSTANCE.getQuote_Description();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__ISSUE_DATE = eINSTANCE.getQuote_IssueDate();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__PARTY_ID = eINSTANCE.getQuote_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__PRODUCT_STORE_ID = eINSTANCE.getQuote_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Quote Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_ATTRIBUTES = eINSTANCE.getQuote_QuoteAttributes();

		/**
		 * The meta object literal for the '<em><b>Quote Coefficients</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_COEFFICIENTS = eINSTANCE.getQuote_QuoteCoefficients();

		/**
		 * The meta object literal for the '<em><b>Quote Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_ITEMS = eINSTANCE.getQuote_QuoteItems();

		/**
		 * The meta object literal for the '<em><b>Quote Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__QUOTE_NAME = eINSTANCE.getQuote_QuoteName();

		/**
		 * The meta object literal for the '<em><b>Quote Notes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_NOTES = eINSTANCE.getQuote_QuoteNotes();

		/**
		 * The meta object literal for the '<em><b>Quote Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_TYPE_ID = eINSTANCE.getQuote_QuoteTypeId();

		/**
		 * The meta object literal for the '<em><b>Quote Work Efforts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__QUOTE_WORK_EFFORTS = eINSTANCE.getQuote_QuoteWorkEfforts();

		/**
		 * The meta object literal for the '<em><b>Sales Channel Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__SALES_CHANNEL_ENUM_ID = eINSTANCE.getQuote_SalesChannelEnumId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE__STATUS_ID = eINSTANCE.getQuote_StatusId();

		/**
		 * The meta object literal for the '<em><b>Valid From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__VALID_FROM_DATE = eINSTANCE.getQuote_ValidFromDate();

		/**
		 * The meta object literal for the '<em><b>Valid Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE__VALID_THRU_DATE = eINSTANCE.getQuote_ValidThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteAdjustmentImpl <em>Adjustment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteAdjustmentImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteAdjustment()
		 * @generated
		 */
		EClass QUOTE_ADJUSTMENT = eINSTANCE.getQuoteAdjustment();

		/**
		 * The meta object literal for the '<em><b>Quote Adjustment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_ID = eINSTANCE.getQuoteAdjustment_QuoteAdjustmentId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__AMOUNT = eINSTANCE.getQuoteAdjustment_Amount();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__COMMENTS = eINSTANCE.getQuoteAdjustment_Comments();

		/**
		 * The meta object literal for the '<em><b>Corresponding Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__CORRESPONDING_PRODUCT_ID = eINSTANCE.getQuoteAdjustment_CorrespondingProductId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getQuoteAdjustment_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__CREATED_DATE = eINSTANCE.getQuoteAdjustment_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Customer Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__CUSTOMER_REFERENCE_ID = eINSTANCE.getQuoteAdjustment_CustomerReferenceId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__DESCRIPTION = eINSTANCE.getQuoteAdjustment_Description();

		/**
		 * The meta object literal for the '<em><b>Exempt Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__EXEMPT_AMOUNT = eINSTANCE.getQuoteAdjustment_ExemptAmount();

		/**
		 * The meta object literal for the '<em><b>Include In Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__INCLUDE_IN_SHIPPING = eINSTANCE.getQuoteAdjustment_IncludeInShipping();

		/**
		 * The meta object literal for the '<em><b>Include In Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__INCLUDE_IN_TAX = eINSTANCE.getQuoteAdjustment_IncludeInTax();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getQuoteAdjustment_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__LAST_MODIFIED_DATE = eINSTANCE.getQuoteAdjustment_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Override Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__OVERRIDE_GL_ACCOUNT_ID = eINSTANCE.getQuoteAdjustment_OverrideGlAccountId();

		/**
		 * The meta object literal for the '<em><b>Primary Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__PRIMARY_GEO_ID = eINSTANCE.getQuoteAdjustment_PrimaryGeoId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__PRODUCT_FEATURE_ID = eINSTANCE.getQuoteAdjustment_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__PRODUCT_PROMO_ACTION_SEQ_ID = eINSTANCE.getQuoteAdjustment_ProductPromoActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__PRODUCT_PROMO_ID = eINSTANCE.getQuoteAdjustment_ProductPromoId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__PRODUCT_PROMO_RULE_ID = eINSTANCE.getQuoteAdjustment_ProductPromoRuleId();

		/**
		 * The meta object literal for the '<em><b>Quote Adjustment Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__QUOTE_ADJUSTMENT_TYPE_ID = eINSTANCE.getQuoteAdjustment_QuoteAdjustmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__QUOTE_ID = eINSTANCE.getQuoteAdjustment_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteAdjustment_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Secondary Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ADJUSTMENT__SECONDARY_GEO_ID = eINSTANCE.getQuoteAdjustment_SecondaryGeoId();

		/**
		 * The meta object literal for the '<em><b>Source Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__SOURCE_PERCENTAGE = eINSTANCE.getQuoteAdjustment_SourcePercentage();

		/**
		 * The meta object literal for the '<em><b>Source Reference Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__SOURCE_REFERENCE_ID = eINSTANCE.getQuoteAdjustment_SourceReferenceId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__TAX_AUTH_GEO_ID = eINSTANCE.getQuoteAdjustment_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ADJUSTMENT__TAX_AUTH_PARTY_ID = eINSTANCE.getQuoteAdjustment_TaxAuthPartyId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteAttributeImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteAttribute()
		 * @generated
		 */
		EClass QUOTE_ATTRIBUTE = eINSTANCE.getQuoteAttribute();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ATTRIBUTE__QUOTE_ID = eINSTANCE.getQuoteAttribute_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ATTRIBUTE__ATTR_NAME = eINSTANCE.getQuoteAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getQuoteAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getQuoteAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteCoefficientImpl <em>Coefficient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteCoefficientImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteCoefficient()
		 * @generated
		 */
		EClass QUOTE_COEFFICIENT = eINSTANCE.getQuoteCoefficient();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_COEFFICIENT__QUOTE_ID = eINSTANCE.getQuoteCoefficient_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Coeff Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_COEFFICIENT__COEFF_NAME = eINSTANCE.getQuoteCoefficient_CoeffName();

		/**
		 * The meta object literal for the '<em><b>Coeff Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_COEFFICIENT__COEFF_VALUE = eINSTANCE.getQuoteCoefficient_CoeffValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteItemImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteItem()
		 * @generated
		 */
		EClass QUOTE_ITEM = eINSTANCE.getQuoteItem();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__QUOTE_ID = eINSTANCE.getQuoteItem_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteItem_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__COMMENTS = eINSTANCE.getQuoteItem_Comments();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__CONFIG_ID = eINSTANCE.getQuoteItem_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__CUST_REQUEST_ID = eINSTANCE.getQuoteItem_CustRequestId();

		/**
		 * The meta object literal for the '<em><b>Cust Request Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__CUST_REQUEST_ITEM_SEQ_ID = eINSTANCE.getQuoteItem_CustRequestItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Deliverable Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__DELIVERABLE_TYPE_ID = eINSTANCE.getQuoteItem_DeliverableTypeId();

		/**
		 * The meta object literal for the '<em><b>Estimated Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__ESTIMATED_DELIVERY_DATE = eINSTANCE.getQuoteItem_EstimatedDeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Is Promo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__IS_PROMO = eINSTANCE.getQuoteItem_IsPromo();

		/**
		 * The meta object literal for the '<em><b>Lead Time Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__LEAD_TIME_DAYS = eINSTANCE.getQuoteItem_LeadTimeDays();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__PRODUCT_FEATURE_ID = eINSTANCE.getQuoteItem_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__PRODUCT_ID = eINSTANCE.getQuoteItem_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__QUANTITY = eINSTANCE.getQuoteItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Quote Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__QUOTE_UNIT_PRICE = eINSTANCE.getQuoteItem_QuoteUnitPrice();

		/**
		 * The meta object literal for the '<em><b>Reserv Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__RESERV_LENGTH = eINSTANCE.getQuoteItem_ReservLength();

		/**
		 * The meta object literal for the '<em><b>Reserv Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__RESERV_PERSONS = eINSTANCE.getQuoteItem_ReservPersons();

		/**
		 * The meta object literal for the '<em><b>Reserv Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__RESERV_START = eINSTANCE.getQuoteItem_ReservStart();

		/**
		 * The meta object literal for the '<em><b>Selected Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ITEM__SELECTED_AMOUNT = eINSTANCE.getQuoteItem_SelectedAmount();

		/**
		 * The meta object literal for the '<em><b>Skill Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__SKILL_TYPE_ID = eINSTANCE.getQuoteItem_SkillTypeId();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__UOM_ID = eINSTANCE.getQuoteItem_UomId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ITEM__WORK_EFFORT_ID = eINSTANCE.getQuoteItem_WorkEffortId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteNoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteNoteImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteNote()
		 * @generated
		 */
		EClass QUOTE_NOTE = eINSTANCE.getQuoteNote();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_NOTE__QUOTE_ID = eINSTANCE.getQuoteNote_QuoteId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteRoleImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteRole()
		 * @generated
		 */
		EClass QUOTE_ROLE = eINSTANCE.getQuoteRole();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ROLE__QUOTE_ID = eINSTANCE.getQuoteRole_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ROLE__PARTY_ID = eINSTANCE.getQuoteRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_ROLE__ROLE_TYPE_ID = eINSTANCE.getQuoteRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ROLE__FROM_DATE = eINSTANCE.getQuoteRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_ROLE__THRU_DATE = eINSTANCE.getQuoteRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTermImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteTerm()
		 * @generated
		 */
		EClass QUOTE_TERM = eINSTANCE.getQuoteTerm();

		/**
		 * The meta object literal for the '<em><b>Term Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TERM__TERM_TYPE_ID = eINSTANCE.getQuoteTerm_TermTypeId();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TERM__QUOTE_ID = eINSTANCE.getQuoteTerm_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteTerm_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__DESCRIPTION = eINSTANCE.getQuoteTerm_Description();

		/**
		 * The meta object literal for the '<em><b>Term Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__TERM_DAYS = eINSTANCE.getQuoteTerm_TermDays();

		/**
		 * The meta object literal for the '<em><b>Term Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__TERM_VALUE = eINSTANCE.getQuoteTerm_TermValue();

		/**
		 * The meta object literal for the '<em><b>Text Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__TEXT_VALUE = eINSTANCE.getQuoteTerm_TextValue();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM__UOM_ID = eINSTANCE.getQuoteTerm_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTermAttributeImpl <em>Term Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTermAttributeImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteTermAttribute()
		 * @generated
		 */
		EClass QUOTE_TERM_ATTRIBUTE = eINSTANCE.getQuoteTermAttribute();

		/**
		 * The meta object literal for the '<em><b>Term Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__TERM_TYPE_ID = eINSTANCE.getQuoteTermAttribute_TermTypeId();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__QUOTE_ID = eINSTANCE.getQuoteTermAttribute_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Quote Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__QUOTE_ITEM_SEQ_ID = eINSTANCE.getQuoteTermAttribute_QuoteItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__ATTR_NAME = eINSTANCE.getQuoteTermAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getQuoteTermAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TERM_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getQuoteTermAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTypeImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteType()
		 * @generated
		 */
		EClass QUOTE_TYPE = eINSTANCE.getQuoteType();

		/**
		 * The meta object literal for the '<em><b>Quote Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE__QUOTE_TYPE_ID = eINSTANCE.getQuoteType_QuoteTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE__DESCRIPTION = eINSTANCE.getQuoteType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE__HAS_TABLE = eINSTANCE.getQuoteType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TYPE__PARENT_TYPE_ID = eINSTANCE.getQuoteType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Quote Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TYPE__QUOTE_TYPE_ATTRS = eINSTANCE.getQuoteType_QuoteTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteTypeAttrImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteTypeAttr()
		 * @generated
		 */
		EClass QUOTE_TYPE_ATTR = eINSTANCE.getQuoteTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Quote Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_TYPE_ATTR__QUOTE_TYPE_ID = eINSTANCE.getQuoteTypeAttr_QuoteTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE_ATTR__ATTR_NAME = eINSTANCE.getQuoteTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUOTE_TYPE_ATTR__DESCRIPTION = eINSTANCE.getQuoteTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.order.quote.impl.QuoteWorkEffortImpl <em>Work Effort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.order.quote.impl.QuoteWorkEffortImpl
		 * @see org.abchip.mimo.biz.order.quote.impl.QuotePackageImpl#getQuoteWorkEffort()
		 * @generated
		 */
		EClass QUOTE_WORK_EFFORT = eINSTANCE.getQuoteWorkEffort();

		/**
		 * The meta object literal for the '<em><b>Quote Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_WORK_EFFORT__QUOTE_ID = eINSTANCE.getQuoteWorkEffort_QuoteId();

		/**
		 * The meta object literal for the '<em><b>Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUOTE_WORK_EFFORT__WORK_EFFORT_ID = eINSTANCE.getQuoteWorkEffort_WorkEffortId();

	}

} //QuotePackage
