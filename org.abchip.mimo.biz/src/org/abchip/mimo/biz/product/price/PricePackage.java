/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

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
 * @see org.abchip.mimo.biz.product.price.PriceFactory
 * @model kind="package"
 * @generated
 */
public interface PricePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "price";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/price";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-price";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PricePackage eINSTANCE = org.abchip.mimo.biz.product.price.impl.PricePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl <em>Product Feature Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductFeaturePrice()
	 * @generated
	 */
	int PRODUCT_FEATURE_PRICE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__PRODUCT_PRICE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__CREATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Product Feature Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_PRICE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPaymentMethodTypeImpl <em>Product Payment Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPaymentMethodTypeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPaymentMethodType()
	 * @generated
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Price Purpose Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__PRODUCT_PRICE_PURPOSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Payment Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PAYMENT_METHOD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl <em>Product Price</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPrice()
	 * @generated
	 */
	int PRODUCT_PRICE = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Price Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__PRODUCT_PRICE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Price Purpose Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__PRODUCT_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__CREATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Custom Price Calc Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Price With Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__PRICE_WITH_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Price Without Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__PRICE_WITHOUT_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__TAX_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tax Auth Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Tax Auth Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Tax In Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__TAX_IN_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__TAX_PERCENTAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Term Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__TERM_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Product Price</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl <em>Product Price Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceAction()
	 * @generated
	 */
	int PRODUCT_PRICE_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Price Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Price Action Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rate Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION__RATE_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Price Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionTypeImpl <em>Product Price Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceActionTypeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceActionType()
	 * @generated
	 */
	int PRODUCT_PRICE_ACTION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Action Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_TYPE__PRODUCT_PRICE_ACTION_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Price Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_ACTION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceAutoNoticeImpl <em>Product Price Auto Notice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceAutoNoticeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceAutoNotice()
	 * @generated
	 */
	int PRODUCT_PRICE_AUTO_NOTICE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Notice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__PRODUCT_PRICE_NOTICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Run Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__RUN_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Price Auto Notice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_AUTO_NOTICE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl <em>Product Price Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceChange()
	 * @generated
	 */
	int PRODUCT_PRICE_CHANGE = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Change Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Changed By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Changed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__CHANGED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Old Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__OLD_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Product Price Purpose Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Product Price Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Product Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Product Price Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_CHANGE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl <em>Product Price Cond</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceCond()
	 * @generated
	 */
	int PRODUCT_PRICE_COND = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Rule Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Price Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cond Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__COND_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Param Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operator Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND__OPERATOR_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Price Cond</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_COND_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPricePurposeImpl <em>Product Price Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPricePurposeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPricePurpose()
	 * @generated
	 */
	int PRODUCT_PRICE_PURPOSE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_PURPOSE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_PURPOSE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_PURPOSE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_PURPOSE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Purpose Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_PURPOSE__PRODUCT_PRICE_PURPOSE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_PURPOSE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Price Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_PURPOSE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl <em>Product Price Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceRule()
	 * @generated
	 */
	int PRODUCT_PRICE_RULE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Sale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__IS_SALE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Price Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Price Conds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__RULE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Price Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_RULE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceTypeImpl <em>Product Price Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceTypeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceType()
	 * @generated
	 */
	int PRODUCT_PRICE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Price Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Price Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_PRICE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl <em>Quantity Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getQuantityBreak()
	 * @generated
	 */
	int QUANTITY_BREAK = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quantity Break Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__QUANTITY_BREAK_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__FROM_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity Break Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK__THRU_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quantity Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakTypeImpl <em>Quantity Break Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.QuantityBreakTypeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getQuantityBreakType()
	 * @generated
	 */
	int QUANTITY_BREAK_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Quantity Break Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_TYPE__QUANTITY_BREAK_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantity Break Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_BREAK_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.price.impl.SaleTypeImpl <em>Sale Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.price.impl.SaleTypeImpl
	 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getSaleType()
	 * @generated
	 */
	int SALE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Sale Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_TYPE__SALE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sale Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice <em>Product Feature Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature Price</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice
	 * @generated
	 */
	EClass getProductFeaturePrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getProductFeatureId()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EAttribute getProductFeaturePrice_ProductFeatureId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getProductPriceTypeId <em>Product Price Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getProductPriceTypeId()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EReference getProductFeaturePrice_ProductPriceTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getCurrencyUomId()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EReference getProductFeaturePrice_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getFromDate()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EAttribute getProductFeaturePrice_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getCreatedByUserLogin()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EReference getProductFeaturePrice_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getCreatedDate()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EAttribute getProductFeaturePrice_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getLastModifiedByUserLogin()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EReference getProductFeaturePrice_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getLastModifiedDate()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EAttribute getProductFeaturePrice_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getPrice()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EAttribute getProductFeaturePrice_Price();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductFeaturePrice#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductFeaturePrice#getThruDate()
	 * @see #getProductFeaturePrice()
	 * @generated
	 */
	EAttribute getProductFeaturePrice_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPaymentMethodType <em>Product Payment Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Payment Method Type</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPaymentMethodType
	 * @generated
	 */
	EClass getProductPaymentMethodType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getProductId()
	 * @see #getProductPaymentMethodType()
	 * @generated
	 */
	EReference getProductPaymentMethodType_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getPaymentMethodTypeId()
	 * @see #getProductPaymentMethodType()
	 * @generated
	 */
	EReference getProductPaymentMethodType_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getProductPricePurposeId <em>Product Price Purpose Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Purpose Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getProductPricePurposeId()
	 * @see #getProductPaymentMethodType()
	 * @generated
	 */
	EReference getProductPaymentMethodType_ProductPricePurposeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getFromDate()
	 * @see #getProductPaymentMethodType()
	 * @generated
	 */
	EAttribute getProductPaymentMethodType_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getSequenceNum()
	 * @see #getProductPaymentMethodType()
	 * @generated
	 */
	EAttribute getProductPaymentMethodType_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPaymentMethodType#getThruDate()
	 * @see #getProductPaymentMethodType()
	 * @generated
	 */
	EAttribute getProductPaymentMethodType_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPrice <em>Product Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice
	 * @generated
	 */
	EClass getProductPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getProductId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductPriceTypeId <em>Product Price Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getProductPriceTypeId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_ProductPriceTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductPricePurposeId <em>Product Price Purpose Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Purpose Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getProductPricePurposeId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_ProductPricePurposeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getCurrencyUomId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getProductStoreGroupId <em>Product Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getProductStoreGroupId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_ProductStoreGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getFromDate()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getCreatedByUserLogin()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getCreatedDate()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getCustomPriceCalcService <em>Custom Price Calc Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Price Calc Service</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getCustomPriceCalcService()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_CustomPriceCalcService();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedByUserLogin()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getLastModifiedDate()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getPrice()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_Price();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithTax <em>Price With Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price With Tax</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithTax()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_PriceWithTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithoutTax <em>Price Without Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Without Tax</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getPriceWithoutTax()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_PriceWithoutTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAmount <em>Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Amount</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getTaxAmount()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_TaxAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthGeoId <em>Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthGeoId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_TaxAuthGeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthPartyId <em>Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getTaxAuthPartyId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_TaxAuthPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#isTaxInPrice <em>Tax In Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax In Price</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#isTaxInPrice()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_TaxInPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTaxPercentage <em>Tax Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax Percentage</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getTaxPercentage()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_TaxPercentage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPrice#getTermUomId <em>Term Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getTermUomId()
	 * @see #getProductPrice()
	 * @generated
	 */
	EReference getProductPrice_TermUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPrice#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPrice#getThruDate()
	 * @see #getProductPrice()
	 * @generated
	 */
	EAttribute getProductPrice_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPriceAction <em>Product Price Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Action</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAction
	 * @generated
	 */
	EClass getProductPriceAction();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceRuleId <em>Product Price Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Rule Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceRuleId()
	 * @see #getProductPriceAction()
	 * @generated
	 */
	EReference getProductPriceAction_ProductPriceRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionSeqId <em>Product Price Action Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Action Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionSeqId()
	 * @see #getProductPriceAction()
	 * @generated
	 */
	EAttribute getProductPriceAction_ProductPriceActionSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAction#getAmount()
	 * @see #getProductPriceAction()
	 * @generated
	 */
	EAttribute getProductPriceAction_Amount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionTypeId <em>Product Price Action Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Action Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAction#getProductPriceActionTypeId()
	 * @see #getProductPriceAction()
	 * @generated
	 */
	EReference getProductPriceAction_ProductPriceActionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAction#getRateCode <em>Rate Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Code</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAction#getRateCode()
	 * @see #getProductPriceAction()
	 * @generated
	 */
	EAttribute getProductPriceAction_RateCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPriceActionType <em>Product Price Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Action Type</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceActionType
	 * @generated
	 */
	EClass getProductPriceActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceActionType#getProductPriceActionTypeId <em>Product Price Action Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Action Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceActionType#getProductPriceActionTypeId()
	 * @see #getProductPriceActionType()
	 * @generated
	 */
	EAttribute getProductPriceActionType_ProductPriceActionTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceActionType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceActionType#getDescription()
	 * @see #getProductPriceActionType()
	 * @generated
	 */
	EAttribute getProductPriceActionType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPriceAutoNotice <em>Product Price Auto Notice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Auto Notice</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAutoNotice
	 * @generated
	 */
	EClass getProductPriceAutoNotice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getProductPriceNoticeId <em>Product Price Notice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Notice Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getProductPriceNoticeId()
	 * @see #getProductPriceAutoNotice()
	 * @generated
	 */
	EAttribute getProductPriceAutoNotice_ProductPriceNoticeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getFacilityId()
	 * @see #getProductPriceAutoNotice()
	 * @generated
	 */
	EAttribute getProductPriceAutoNotice_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getFromDate()
	 * @see #getProductPriceAutoNotice()
	 * @generated
	 */
	EAttribute getProductPriceAutoNotice_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getRunDate <em>Run Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getRunDate()
	 * @see #getProductPriceAutoNotice()
	 * @generated
	 */
	EAttribute getProductPriceAutoNotice_RunDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceAutoNotice#getThruDate()
	 * @see #getProductPriceAutoNotice()
	 * @generated
	 */
	EAttribute getProductPriceAutoNotice_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPriceChange <em>Product Price Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Change</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange
	 * @generated
	 */
	EClass getProductPriceChange();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceChangeId <em>Product Price Change Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Change Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceChangeId()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_ProductPriceChangeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedByUserLogin <em>Changed By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Changed By User Login</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedByUserLogin()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EReference getProductPriceChange_ChangedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedDate <em>Changed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getChangedDate()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_ChangedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getCurrencyUomId()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getFromDate()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getOldPrice <em>Old Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Price</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getOldPrice()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_OldPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getPrice()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_Price();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getProductId()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPricePurposeId <em>Product Price Purpose Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Purpose Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPricePurposeId()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_ProductPricePurposeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceTypeId <em>Product Price Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getProductPriceTypeId()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_ProductPriceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getProductStoreGroupId <em>Product Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getProductStoreGroupId()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_ProductStoreGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceChange#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceChange#getThruDate()
	 * @see #getProductPriceChange()
	 * @generated
	 */
	EAttribute getProductPriceChange_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPriceCond <em>Product Price Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Cond</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceCond
	 * @generated
	 */
	EClass getProductPriceCond();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceRuleId <em>Product Price Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Price Rule Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceRuleId()
	 * @see #getProductPriceCond()
	 * @generated
	 */
	EReference getProductPriceCond_ProductPriceRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceCondSeqId <em>Product Price Cond Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Cond Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceCond#getProductPriceCondSeqId()
	 * @see #getProductPriceCond()
	 * @generated
	 */
	EAttribute getProductPriceCond_ProductPriceCondSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getCondValue <em>Cond Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cond Value</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceCond#getCondValue()
	 * @see #getProductPriceCond()
	 * @generated
	 */
	EAttribute getProductPriceCond_CondValue();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getInputParamEnumId <em>Input Param Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Param Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceCond#getInputParamEnumId()
	 * @see #getProductPriceCond()
	 * @generated
	 */
	EReference getProductPriceCond_InputParamEnumId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.ProductPriceCond#getOperatorEnumId <em>Operator Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operator Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceCond#getOperatorEnumId()
	 * @see #getProductPriceCond()
	 * @generated
	 */
	EReference getProductPriceCond_OperatorEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPricePurpose <em>Product Price Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Purpose</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPricePurpose
	 * @generated
	 */
	EClass getProductPricePurpose();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPricePurpose#getProductPricePurposeId <em>Product Price Purpose Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Purpose Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPricePurpose#getProductPricePurposeId()
	 * @see #getProductPricePurpose()
	 * @generated
	 */
	EAttribute getProductPricePurpose_ProductPricePurposeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPricePurpose#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPricePurpose#getDescription()
	 * @see #getProductPricePurpose()
	 * @generated
	 */
	EAttribute getProductPricePurpose_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPriceRule <em>Product Price Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Rule</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule
	 * @generated
	 */
	EClass getProductPriceRule();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceRuleId <em>Product Price Rule Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Rule Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceRuleId()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EAttribute getProductPriceRule_ProductPriceRuleId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#getDescription()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EAttribute getProductPriceRule_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#getFromDate()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EAttribute getProductPriceRule_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#isIsSale <em>Is Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sale</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#isIsSale()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EAttribute getProductPriceRule_IsSale();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceActions <em>Product Price Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Price Actions</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceActions()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EReference getProductPriceRule_ProductPriceActions();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceConds <em>Product Price Conds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Price Conds</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#getProductPriceConds()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EReference getProductPriceRule_ProductPriceConds();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getRuleName <em>Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Name</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#getRuleName()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EAttribute getProductPriceRule_RuleName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceRule#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceRule#getThruDate()
	 * @see #getProductPriceRule()
	 * @generated
	 */
	EAttribute getProductPriceRule_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.ProductPriceType <em>Product Price Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Price Type</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceType
	 * @generated
	 */
	EClass getProductPriceType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceType#getProductPriceTypeId <em>Product Price Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Price Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceType#getProductPriceTypeId()
	 * @see #getProductPriceType()
	 * @generated
	 */
	EAttribute getProductPriceType_ProductPriceTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.ProductPriceType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.price.ProductPriceType#getDescription()
	 * @see #getProductPriceType()
	 * @generated
	 */
	EAttribute getProductPriceType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.QuantityBreak <em>Quantity Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Break</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreak
	 * @generated
	 */
	EClass getQuantityBreak();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakId <em>Quantity Break Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Break Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakId()
	 * @see #getQuantityBreak()
	 * @generated
	 */
	EAttribute getQuantityBreak_QuantityBreakId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getFromQuantity <em>From Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreak#getFromQuantity()
	 * @see #getQuantityBreak()
	 * @generated
	 */
	EAttribute getQuantityBreak_FromQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakTypeId <em>Quantity Break Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Break Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreak#getQuantityBreakTypeId()
	 * @see #getQuantityBreak()
	 * @generated
	 */
	EReference getQuantityBreak_QuantityBreakTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.QuantityBreak#getThruQuantity <em>Thru Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreak#getThruQuantity()
	 * @see #getQuantityBreak()
	 * @generated
	 */
	EAttribute getQuantityBreak_ThruQuantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.QuantityBreakType <em>Quantity Break Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Break Type</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreakType
	 * @generated
	 */
	EClass getQuantityBreakType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.QuantityBreakType#getQuantityBreakTypeId <em>Quantity Break Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Break Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreakType#getQuantityBreakTypeId()
	 * @see #getQuantityBreakType()
	 * @generated
	 */
	EAttribute getQuantityBreakType_QuantityBreakTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.QuantityBreakType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.price.QuantityBreakType#getDescription()
	 * @see #getQuantityBreakType()
	 * @generated
	 */
	EAttribute getQuantityBreakType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.price.SaleType <em>Sale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sale Type</em>'.
	 * @see org.abchip.mimo.biz.product.price.SaleType
	 * @generated
	 */
	EClass getSaleType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.SaleType#getSaleTypeId <em>Sale Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sale Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.price.SaleType#getSaleTypeId()
	 * @see #getSaleType()
	 * @generated
	 */
	EAttribute getSaleType_SaleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.price.SaleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.price.SaleType#getDescription()
	 * @see #getSaleType()
	 * @generated
	 */
	EAttribute getSaleType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PriceFactory getPriceFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl <em>Product Feature Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductFeaturePriceImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductFeaturePrice()
		 * @generated
		 */
		EClass PRODUCT_FEATURE_PRICE = eINSTANCE.getProductFeaturePrice();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_PRICE__PRODUCT_FEATURE_ID = eINSTANCE.getProductFeaturePrice_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Product Price Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_PRICE__PRODUCT_PRICE_TYPE_ID = eINSTANCE.getProductFeaturePrice_ProductPriceTypeId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_PRICE__CURRENCY_UOM_ID = eINSTANCE.getProductFeaturePrice_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_PRICE__FROM_DATE = eINSTANCE.getProductFeaturePrice_FromDate();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_PRICE__CREATED_BY_USER_LOGIN = eINSTANCE.getProductFeaturePrice_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_PRICE__CREATED_DATE = eINSTANCE.getProductFeaturePrice_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_FEATURE_PRICE__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getProductFeaturePrice_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_PRICE__LAST_MODIFIED_DATE = eINSTANCE.getProductFeaturePrice_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_PRICE__PRICE = eINSTANCE.getProductFeaturePrice_Price();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_FEATURE_PRICE__THRU_DATE = eINSTANCE.getProductFeaturePrice_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPaymentMethodTypeImpl <em>Product Payment Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPaymentMethodTypeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPaymentMethodType()
		 * @generated
		 */
		EClass PRODUCT_PAYMENT_METHOD_TYPE = eINSTANCE.getProductPaymentMethodType();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PAYMENT_METHOD_TYPE__PRODUCT_ID = eINSTANCE.getProductPaymentMethodType_ProductId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PAYMENT_METHOD_TYPE__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getProductPaymentMethodType_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Price Purpose Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PAYMENT_METHOD_TYPE__PRODUCT_PRICE_PURPOSE_ID = eINSTANCE.getProductPaymentMethodType_ProductPricePurposeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PAYMENT_METHOD_TYPE__FROM_DATE = eINSTANCE.getProductPaymentMethodType_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PAYMENT_METHOD_TYPE__SEQUENCE_NUM = eINSTANCE.getProductPaymentMethodType_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PAYMENT_METHOD_TYPE__THRU_DATE = eINSTANCE.getProductPaymentMethodType_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceImpl <em>Product Price</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPrice()
		 * @generated
		 */
		EClass PRODUCT_PRICE = eINSTANCE.getProductPrice();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__PRODUCT_ID = eINSTANCE.getProductPrice_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Price Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__PRODUCT_PRICE_TYPE_ID = eINSTANCE.getProductPrice_ProductPriceTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Price Purpose Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__PRODUCT_PRICE_PURPOSE_ID = eINSTANCE.getProductPrice_ProductPricePurposeId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__CURRENCY_UOM_ID = eINSTANCE.getProductPrice_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__PRODUCT_STORE_GROUP_ID = eINSTANCE.getProductPrice_ProductStoreGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__FROM_DATE = eINSTANCE.getProductPrice_FromDate();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__CREATED_BY_USER_LOGIN = eINSTANCE.getProductPrice_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__CREATED_DATE = eINSTANCE.getProductPrice_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Custom Price Calc Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__CUSTOM_PRICE_CALC_SERVICE = eINSTANCE.getProductPrice_CustomPriceCalcService();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getProductPrice_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__LAST_MODIFIED_DATE = eINSTANCE.getProductPrice_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__PRICE = eINSTANCE.getProductPrice_Price();

		/**
		 * The meta object literal for the '<em><b>Price With Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__PRICE_WITH_TAX = eINSTANCE.getProductPrice_PriceWithTax();

		/**
		 * The meta object literal for the '<em><b>Price Without Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__PRICE_WITHOUT_TAX = eINSTANCE.getProductPrice_PriceWithoutTax();

		/**
		 * The meta object literal for the '<em><b>Tax Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__TAX_AMOUNT = eINSTANCE.getProductPrice_TaxAmount();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__TAX_AUTH_GEO_ID = eINSTANCE.getProductPrice_TaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Tax Auth Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__TAX_AUTH_PARTY_ID = eINSTANCE.getProductPrice_TaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>Tax In Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__TAX_IN_PRICE = eINSTANCE.getProductPrice_TaxInPrice();

		/**
		 * The meta object literal for the '<em><b>Tax Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__TAX_PERCENTAGE = eINSTANCE.getProductPrice_TaxPercentage();

		/**
		 * The meta object literal for the '<em><b>Term Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE__TERM_UOM_ID = eINSTANCE.getProductPrice_TermUomId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE__THRU_DATE = eINSTANCE.getProductPrice_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl <em>Product Price Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceActionImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceAction()
		 * @generated
		 */
		EClass PRODUCT_PRICE_ACTION = eINSTANCE.getProductPriceAction();

		/**
		 * The meta object literal for the '<em><b>Product Price Rule Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_ACTION__PRODUCT_PRICE_RULE_ID = eINSTANCE.getProductPriceAction_ProductPriceRuleId();

		/**
		 * The meta object literal for the '<em><b>Product Price Action Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_SEQ_ID = eINSTANCE.getProductPriceAction_ProductPriceActionSeqId();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_ACTION__AMOUNT = eINSTANCE.getProductPriceAction_Amount();

		/**
		 * The meta object literal for the '<em><b>Product Price Action Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_ACTION__PRODUCT_PRICE_ACTION_TYPE_ID = eINSTANCE.getProductPriceAction_ProductPriceActionTypeId();

		/**
		 * The meta object literal for the '<em><b>Rate Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_ACTION__RATE_CODE = eINSTANCE.getProductPriceAction_RateCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceActionTypeImpl <em>Product Price Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceActionTypeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceActionType()
		 * @generated
		 */
		EClass PRODUCT_PRICE_ACTION_TYPE = eINSTANCE.getProductPriceActionType();

		/**
		 * The meta object literal for the '<em><b>Product Price Action Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_ACTION_TYPE__PRODUCT_PRICE_ACTION_TYPE_ID = eINSTANCE.getProductPriceActionType_ProductPriceActionTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_ACTION_TYPE__DESCRIPTION = eINSTANCE.getProductPriceActionType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceAutoNoticeImpl <em>Product Price Auto Notice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceAutoNoticeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceAutoNotice()
		 * @generated
		 */
		EClass PRODUCT_PRICE_AUTO_NOTICE = eINSTANCE.getProductPriceAutoNotice();

		/**
		 * The meta object literal for the '<em><b>Product Price Notice Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_AUTO_NOTICE__PRODUCT_PRICE_NOTICE_ID = eINSTANCE.getProductPriceAutoNotice_ProductPriceNoticeId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_AUTO_NOTICE__FACILITY_ID = eINSTANCE.getProductPriceAutoNotice_FacilityId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_AUTO_NOTICE__FROM_DATE = eINSTANCE.getProductPriceAutoNotice_FromDate();

		/**
		 * The meta object literal for the '<em><b>Run Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_AUTO_NOTICE__RUN_DATE = eINSTANCE.getProductPriceAutoNotice_RunDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_AUTO_NOTICE__THRU_DATE = eINSTANCE.getProductPriceAutoNotice_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl <em>Product Price Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceChangeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceChange()
		 * @generated
		 */
		EClass PRODUCT_PRICE_CHANGE = eINSTANCE.getProductPriceChange();

		/**
		 * The meta object literal for the '<em><b>Product Price Change Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_CHANGE_ID = eINSTANCE.getProductPriceChange_ProductPriceChangeId();

		/**
		 * The meta object literal for the '<em><b>Changed By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_CHANGE__CHANGED_BY_USER_LOGIN = eINSTANCE.getProductPriceChange_ChangedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Changed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__CHANGED_DATE = eINSTANCE.getProductPriceChange_ChangedDate();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__CURRENCY_UOM_ID = eINSTANCE.getProductPriceChange_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__FROM_DATE = eINSTANCE.getProductPriceChange_FromDate();

		/**
		 * The meta object literal for the '<em><b>Old Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__OLD_PRICE = eINSTANCE.getProductPriceChange_OldPrice();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__PRICE = eINSTANCE.getProductPriceChange_Price();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__PRODUCT_ID = eINSTANCE.getProductPriceChange_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Price Purpose Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_PURPOSE_ID = eINSTANCE.getProductPriceChange_ProductPricePurposeId();

		/**
		 * The meta object literal for the '<em><b>Product Price Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__PRODUCT_PRICE_TYPE_ID = eINSTANCE.getProductPriceChange_ProductPriceTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__PRODUCT_STORE_GROUP_ID = eINSTANCE.getProductPriceChange_ProductStoreGroupId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_CHANGE__THRU_DATE = eINSTANCE.getProductPriceChange_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl <em>Product Price Cond</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceCondImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceCond()
		 * @generated
		 */
		EClass PRODUCT_PRICE_COND = eINSTANCE.getProductPriceCond();

		/**
		 * The meta object literal for the '<em><b>Product Price Rule Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_COND__PRODUCT_PRICE_RULE_ID = eINSTANCE.getProductPriceCond_ProductPriceRuleId();

		/**
		 * The meta object literal for the '<em><b>Product Price Cond Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_COND__PRODUCT_PRICE_COND_SEQ_ID = eINSTANCE.getProductPriceCond_ProductPriceCondSeqId();

		/**
		 * The meta object literal for the '<em><b>Cond Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_COND__COND_VALUE = eINSTANCE.getProductPriceCond_CondValue();

		/**
		 * The meta object literal for the '<em><b>Input Param Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_COND__INPUT_PARAM_ENUM_ID = eINSTANCE.getProductPriceCond_InputParamEnumId();

		/**
		 * The meta object literal for the '<em><b>Operator Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_COND__OPERATOR_ENUM_ID = eINSTANCE.getProductPriceCond_OperatorEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPricePurposeImpl <em>Product Price Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPricePurposeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPricePurpose()
		 * @generated
		 */
		EClass PRODUCT_PRICE_PURPOSE = eINSTANCE.getProductPricePurpose();

		/**
		 * The meta object literal for the '<em><b>Product Price Purpose Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_PURPOSE__PRODUCT_PRICE_PURPOSE_ID = eINSTANCE.getProductPricePurpose_ProductPricePurposeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_PURPOSE__DESCRIPTION = eINSTANCE.getProductPricePurpose_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl <em>Product Price Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceRuleImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceRule()
		 * @generated
		 */
		EClass PRODUCT_PRICE_RULE = eINSTANCE.getProductPriceRule();

		/**
		 * The meta object literal for the '<em><b>Product Price Rule Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_RULE__PRODUCT_PRICE_RULE_ID = eINSTANCE.getProductPriceRule_ProductPriceRuleId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_RULE__DESCRIPTION = eINSTANCE.getProductPriceRule_Description();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_RULE__FROM_DATE = eINSTANCE.getProductPriceRule_FromDate();

		/**
		 * The meta object literal for the '<em><b>Is Sale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_RULE__IS_SALE = eINSTANCE.getProductPriceRule_IsSale();

		/**
		 * The meta object literal for the '<em><b>Product Price Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_RULE__PRODUCT_PRICE_ACTIONS = eINSTANCE.getProductPriceRule_ProductPriceActions();

		/**
		 * The meta object literal for the '<em><b>Product Price Conds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_PRICE_RULE__PRODUCT_PRICE_CONDS = eINSTANCE.getProductPriceRule_ProductPriceConds();

		/**
		 * The meta object literal for the '<em><b>Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_RULE__RULE_NAME = eINSTANCE.getProductPriceRule_RuleName();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_RULE__THRU_DATE = eINSTANCE.getProductPriceRule_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.ProductPriceTypeImpl <em>Product Price Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.ProductPriceTypeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getProductPriceType()
		 * @generated
		 */
		EClass PRODUCT_PRICE_TYPE = eINSTANCE.getProductPriceType();

		/**
		 * The meta object literal for the '<em><b>Product Price Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_TYPE__PRODUCT_PRICE_TYPE_ID = eINSTANCE.getProductPriceType_ProductPriceTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_PRICE_TYPE__DESCRIPTION = eINSTANCE.getProductPriceType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl <em>Quantity Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.QuantityBreakImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getQuantityBreak()
		 * @generated
		 */
		EClass QUANTITY_BREAK = eINSTANCE.getQuantityBreak();

		/**
		 * The meta object literal for the '<em><b>Quantity Break Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_BREAK__QUANTITY_BREAK_ID = eINSTANCE.getQuantityBreak_QuantityBreakId();

		/**
		 * The meta object literal for the '<em><b>From Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_BREAK__FROM_QUANTITY = eINSTANCE.getQuantityBreak_FromQuantity();

		/**
		 * The meta object literal for the '<em><b>Quantity Break Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_BREAK__QUANTITY_BREAK_TYPE_ID = eINSTANCE.getQuantityBreak_QuantityBreakTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_BREAK__THRU_QUANTITY = eINSTANCE.getQuantityBreak_ThruQuantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.QuantityBreakTypeImpl <em>Quantity Break Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.QuantityBreakTypeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getQuantityBreakType()
		 * @generated
		 */
		EClass QUANTITY_BREAK_TYPE = eINSTANCE.getQuantityBreakType();

		/**
		 * The meta object literal for the '<em><b>Quantity Break Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_BREAK_TYPE__QUANTITY_BREAK_TYPE_ID = eINSTANCE.getQuantityBreakType_QuantityBreakTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_BREAK_TYPE__DESCRIPTION = eINSTANCE.getQuantityBreakType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.price.impl.SaleTypeImpl <em>Sale Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.price.impl.SaleTypeImpl
		 * @see org.abchip.mimo.biz.product.price.impl.PricePackageImpl#getSaleType()
		 * @generated
		 */
		EClass SALE_TYPE = eINSTANCE.getSaleType();

		/**
		 * The meta object literal for the '<em><b>Sale Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE_TYPE__SALE_TYPE_ID = eINSTANCE.getSaleType_SaleTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALE_TYPE__DESCRIPTION = eINSTANCE.getSaleType_Description();

	}

} //PricePackage
