/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier;

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
 * @see org.abchip.mimo.biz.product.supplier.SupplierFactory
 * @model kind="package"
 * @generated
 */
public interface SupplierPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "supplier";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/supplier";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-supplier";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SupplierPackage eINSTANCE = org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.supplier.impl.MarketInterestImpl <em>Market Interest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.supplier.impl.MarketInterestImpl
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getMarketInterest()
	 * @generated
	 */
	int MARKET_INTEREST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Classification Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__PARTY_CLASSIFICATION_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Market Interest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_INTEREST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl <em>Reorder Guideline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getReorderGuideline()
	 * @generated
	 */
	int REORDER_GUIDELINE = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Reorder Guideline Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__REORDER_GUIDELINE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reorder Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__REORDER_LEVEL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reorder Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__REORDER_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Reorder Guideline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REORDER_GUIDELINE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierPrefOrderImpl <em>Pref Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPrefOrderImpl
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierPrefOrder()
	 * @generated
	 */
	int SUPPLIER_PREF_ORDER = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Supplier Pref Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pref Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PREF_ORDER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierProduct()
	 * @generated
	 */
	int SUPPLIER_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Agreement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AGREEMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Agreement Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Available Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Can Drop Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__CAN_DROP_SHIP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Last Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__LAST_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Order Qty Increments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Quantity Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__QUANTITY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Shipping Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SHIPPING_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Standard Lead Time Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Supplier Pref Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Supplier Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Supplier Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Supplier Rating Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Units Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT__UNITS_INCLUDED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductFeatureImpl <em>Product Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierProductFeatureImpl
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierProductFeature()
	 * @generated
	 */
	int SUPPLIER_PRODUCT_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__ID_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE__UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_PRODUCT_FEATURE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierRatingTypeImpl <em>Rating Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierRatingTypeImpl
	 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierRatingType()
	 * @generated
	 */
	int SUPPLIER_RATING_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Supplier Rating Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rating Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_RATING_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.supplier.MarketInterest <em>Market Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Interest</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.MarketInterest
	 * @generated
	 */
	EClass getMarketInterest();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.MarketInterest#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.MarketInterest#getProductCategoryId()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EReference getMarketInterest_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.MarketInterest#getPartyClassificationGroupId <em>Party Classification Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Classification Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.MarketInterest#getPartyClassificationGroupId()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EReference getMarketInterest_PartyClassificationGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.MarketInterest#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.MarketInterest#getFromDate()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EAttribute getMarketInterest_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.MarketInterest#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.MarketInterest#getThruDate()
	 * @see #getMarketInterest()
	 * @generated
	 */
	EAttribute getMarketInterest_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline <em>Reorder Guideline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reorder Guideline</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline
	 * @generated
	 */
	EClass getReorderGuideline();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getReorderGuidelineId <em>Reorder Guideline Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorder Guideline Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getReorderGuidelineId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ReorderGuidelineId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getFacilityId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getFromDate()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getGeoId <em>Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getGeoId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_GeoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getPartyId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getProductId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EReference getReorderGuideline_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getReorderLevel <em>Reorder Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorder Level</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getReorderLevel()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ReorderLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getReorderQuantity <em>Reorder Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reorder Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getReorderQuantity()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ReorderQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getRoleTypeId()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.ReorderGuideline#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.ReorderGuideline#getThruDate()
	 * @see #getReorderGuideline()
	 * @generated
	 */
	EAttribute getReorderGuideline_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.supplier.SupplierPrefOrder <em>Pref Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pref Order</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPrefOrder
	 * @generated
	 */
	EClass getSupplierPrefOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Pref Order Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getSupplierPrefOrderId()
	 * @see #getSupplierPrefOrder()
	 * @generated
	 */
	EAttribute getSupplierPrefOrder_SupplierPrefOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getDescription()
	 * @see #getSupplierPrefOrder()
	 * @generated
	 */
	EAttribute getSupplierPrefOrder_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct
	 * @generated
	 */
	EClass getSupplierProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getProductId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getPartyId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getCurrencyUomId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getMinimumOrderQuantity <em>Minimum Order Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Order Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getMinimumOrderQuantity()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_MinimumOrderQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableFromDate <em>Available From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available From Date</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableFromDate()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AvailableFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementId <em>Agreement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AgreementId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agreement Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getAgreementItemSeqId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AgreementItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableThruDate <em>Available Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getAvailableThruDate()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_AvailableThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#isCanDropShip <em>Can Drop Ship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Drop Ship</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#isCanDropShip()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_CanDropShip();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getComments()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getLastPrice <em>Last Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Price</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getLastPrice()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_LastPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getOrderQtyIncrements <em>Order Qty Increments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Qty Increments</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getOrderQtyIncrements()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_OrderQtyIncrements();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getQuantityUomId <em>Quantity Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getQuantityUomId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_QuantityUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getShippingPrice <em>Shipping Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Price</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getShippingPrice()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_ShippingPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getStandardLeadTimeDays <em>Standard Lead Time Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Lead Time Days</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getStandardLeadTimeDays()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_StandardLeadTimeDays();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier Pref Order Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierPrefOrderId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_SupplierPrefOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductId <em>Supplier Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_SupplierProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductName <em>Supplier Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Product Name</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierProductName()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_SupplierProductName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier Rating Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getSupplierRatingTypeId()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EReference getSupplierProduct_SupplierRatingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProduct#getUnitsIncluded <em>Units Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units Included</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProduct#getUnitsIncluded()
	 * @see #getSupplierProduct()
	 * @generated
	 */
	EAttribute getSupplierProduct_UnitsIncluded();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature <em>Product Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Feature</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProductFeature
	 * @generated
	 */
	EClass getSupplierProductFeature();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getPartyId()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EReference getSupplierProductFeature_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getProductFeatureId()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EReference getSupplierProductFeature_ProductFeatureId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getDescription()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EAttribute getSupplierProductFeature_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getIdCode <em>Id Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Code</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getIdCode()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EAttribute getSupplierProductFeature_IdCode();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getUomId <em>Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierProductFeature#getUomId()
	 * @see #getSupplierProductFeature()
	 * @generated
	 */
	EReference getSupplierProductFeature_UomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.supplier.SupplierRatingType <em>Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating Type</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierRatingType
	 * @generated
	 */
	EClass getSupplierRatingType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierRatingType#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Rating Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierRatingType#getSupplierRatingTypeId()
	 * @see #getSupplierRatingType()
	 * @generated
	 */
	EAttribute getSupplierRatingType_SupplierRatingTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.supplier.SupplierRatingType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.supplier.SupplierRatingType#getDescription()
	 * @see #getSupplierRatingType()
	 * @generated
	 */
	EAttribute getSupplierRatingType_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SupplierFactory getSupplierFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.supplier.impl.MarketInterestImpl <em>Market Interest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.supplier.impl.MarketInterestImpl
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getMarketInterest()
		 * @generated
		 */
		EClass MARKET_INTEREST = eINSTANCE.getMarketInterest();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_INTEREST__PRODUCT_CATEGORY_ID = eINSTANCE.getMarketInterest_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Party Classification Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_INTEREST__PARTY_CLASSIFICATION_GROUP_ID = eINSTANCE.getMarketInterest_PartyClassificationGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_INTEREST__FROM_DATE = eINSTANCE.getMarketInterest_FromDate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_INTEREST__THRU_DATE = eINSTANCE.getMarketInterest_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl <em>Reorder Guideline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.supplier.impl.ReorderGuidelineImpl
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getReorderGuideline()
		 * @generated
		 */
		EClass REORDER_GUIDELINE = eINSTANCE.getReorderGuideline();

		/**
		 * The meta object literal for the '<em><b>Reorder Guideline Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__REORDER_GUIDELINE_ID = eINSTANCE.getReorderGuideline_ReorderGuidelineId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__FACILITY_ID = eINSTANCE.getReorderGuideline_FacilityId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__FROM_DATE = eINSTANCE.getReorderGuideline_FromDate();

		/**
		 * The meta object literal for the '<em><b>Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__GEO_ID = eINSTANCE.getReorderGuideline_GeoId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__PARTY_ID = eINSTANCE.getReorderGuideline_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REORDER_GUIDELINE__PRODUCT_ID = eINSTANCE.getReorderGuideline_ProductId();

		/**
		 * The meta object literal for the '<em><b>Reorder Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__REORDER_LEVEL = eINSTANCE.getReorderGuideline_ReorderLevel();

		/**
		 * The meta object literal for the '<em><b>Reorder Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__REORDER_QUANTITY = eINSTANCE.getReorderGuideline_ReorderQuantity();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__ROLE_TYPE_ID = eINSTANCE.getReorderGuideline_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REORDER_GUIDELINE__THRU_DATE = eINSTANCE.getReorderGuideline_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierPrefOrderImpl <em>Pref Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPrefOrderImpl
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierPrefOrder()
		 * @generated
		 */
		EClass SUPPLIER_PREF_ORDER = eINSTANCE.getSupplierPrefOrder();

		/**
		 * The meta object literal for the '<em><b>Supplier Pref Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID = eINSTANCE.getSupplierPrefOrder_SupplierPrefOrderId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PREF_ORDER__DESCRIPTION = eINSTANCE.getSupplierPrefOrder_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierProductImpl
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierProduct()
		 * @generated
		 */
		EClass SUPPLIER_PRODUCT = eINSTANCE.getSupplierProduct();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__PRODUCT_ID = eINSTANCE.getSupplierProduct_ProductId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__PARTY_ID = eINSTANCE.getSupplierProduct_PartyId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__CURRENCY_UOM_ID = eINSTANCE.getSupplierProduct_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Minimum Order Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__MINIMUM_ORDER_QUANTITY = eINSTANCE.getSupplierProduct_MinimumOrderQuantity();

		/**
		 * The meta object literal for the '<em><b>Available From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AVAILABLE_FROM_DATE = eINSTANCE.getSupplierProduct_AvailableFromDate();

		/**
		 * The meta object literal for the '<em><b>Agreement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AGREEMENT_ID = eINSTANCE.getSupplierProduct_AgreementId();

		/**
		 * The meta object literal for the '<em><b>Agreement Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AGREEMENT_ITEM_SEQ_ID = eINSTANCE.getSupplierProduct_AgreementItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Available Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__AVAILABLE_THRU_DATE = eINSTANCE.getSupplierProduct_AvailableThruDate();

		/**
		 * The meta object literal for the '<em><b>Can Drop Ship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__CAN_DROP_SHIP = eINSTANCE.getSupplierProduct_CanDropShip();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__COMMENTS = eINSTANCE.getSupplierProduct_Comments();

		/**
		 * The meta object literal for the '<em><b>Last Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__LAST_PRICE = eINSTANCE.getSupplierProduct_LastPrice();

		/**
		 * The meta object literal for the '<em><b>Order Qty Increments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__ORDER_QTY_INCREMENTS = eINSTANCE.getSupplierProduct_OrderQtyIncrements();

		/**
		 * The meta object literal for the '<em><b>Quantity Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__QUANTITY_UOM_ID = eINSTANCE.getSupplierProduct_QuantityUomId();

		/**
		 * The meta object literal for the '<em><b>Shipping Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__SHIPPING_PRICE = eINSTANCE.getSupplierProduct_ShippingPrice();

		/**
		 * The meta object literal for the '<em><b>Standard Lead Time Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__STANDARD_LEAD_TIME_DAYS = eINSTANCE.getSupplierProduct_StandardLeadTimeDays();

		/**
		 * The meta object literal for the '<em><b>Supplier Pref Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__SUPPLIER_PREF_ORDER_ID = eINSTANCE.getSupplierProduct_SupplierPrefOrderId();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_ID = eINSTANCE.getSupplierProduct_SupplierProductId();

		/**
		 * The meta object literal for the '<em><b>Supplier Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__SUPPLIER_PRODUCT_NAME = eINSTANCE.getSupplierProduct_SupplierProductName();

		/**
		 * The meta object literal for the '<em><b>Supplier Rating Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT__SUPPLIER_RATING_TYPE_ID = eINSTANCE.getSupplierProduct_SupplierRatingTypeId();

		/**
		 * The meta object literal for the '<em><b>Units Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT__UNITS_INCLUDED = eINSTANCE.getSupplierProduct_UnitsIncluded();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierProductFeatureImpl <em>Product Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierProductFeatureImpl
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierProductFeature()
		 * @generated
		 */
		EClass SUPPLIER_PRODUCT_FEATURE = eINSTANCE.getSupplierProductFeature();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT_FEATURE__PARTY_ID = eINSTANCE.getSupplierProductFeature_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT_FEATURE__PRODUCT_FEATURE_ID = eINSTANCE.getSupplierProductFeature_ProductFeatureId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT_FEATURE__DESCRIPTION = eINSTANCE.getSupplierProductFeature_Description();

		/**
		 * The meta object literal for the '<em><b>Id Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_PRODUCT_FEATURE__ID_CODE = eINSTANCE.getSupplierProductFeature_IdCode();

		/**
		 * The meta object literal for the '<em><b>Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_PRODUCT_FEATURE__UOM_ID = eINSTANCE.getSupplierProductFeature_UomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.supplier.impl.SupplierRatingTypeImpl <em>Rating Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierRatingTypeImpl
		 * @see org.abchip.mimo.biz.product.supplier.impl.SupplierPackageImpl#getSupplierRatingType()
		 * @generated
		 */
		EClass SUPPLIER_RATING_TYPE = eINSTANCE.getSupplierRatingType();

		/**
		 * The meta object literal for the '<em><b>Supplier Rating Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID = eINSTANCE.getSupplierRatingType_SupplierRatingTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_RATING_TYPE__DESCRIPTION = eINSTANCE.getSupplierRatingType_Description();

	}

} //SupplierPackage
