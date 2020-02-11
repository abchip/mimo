/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

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
 * @see org.abchip.mimo.biz.product.store.StoreFactory
 * @model kind="package"
 * @generated
 */
public interface StorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "store";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/store";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-store";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StorePackage eINSTANCE = org.abchip.mimo.biz.product.store.impl.StorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl <em>Product Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStore()
	 * @generated
	 */
	int PRODUCT_STORE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Add To Cart Remove Incompat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Add To Cart Replace Upsell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allow Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ALLOW_COMMENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allow Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ALLOW_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Auth Declined Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTH_DECLINED_MESSAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Auth Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTH_ERROR_MESSAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Auth Fraud Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTH_FRAUD_MESSAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Auto Approve Invoice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_APPROVE_INVOICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Auto Approve Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_APPROVE_ORDER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Auto Approve Reviews</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_APPROVE_REVIEWS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Auto Invoice Digital Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Auto Order Cc Try Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Auto Order Cc Try Later Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Auto Order Cc Try Later Nsf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Auto Order Cc Try Other Cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Auto Save Cart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AUTO_SAVE_CART = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Balance Res On Order Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Check Gc Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__CHECK_GC_BALANCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Check Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__CHECK_INVENTORY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__COMPANY_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Days To Cancel Non Pay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Default Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Default Locale String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DEFAULT_LOCALE_STRING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Default Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DEFAULT_PASSWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Default Sales Channel Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Default Time Zone String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Dig Prod Upload Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Digital Item Approved Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Enable Auto Suggestion List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Enable Dig Prod Upload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Explode Order Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__EXPLODE_ORDER_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Header Approved Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__HEADER_APPROVED_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Header Cancel Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__HEADER_CANCEL_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Header Declined Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__HEADER_DECLINED_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Inventory Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__INVENTORY_FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Is Demo Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__IS_DEMO_STORE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Is Immediately Fulfilled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Item Approved Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ITEM_APPROVED_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Item Cancel Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ITEM_CANCEL_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Item Declined Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ITEM_DECLINED_STATUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Managed By Lot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__MANAGED_BY_LOT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Manual Auth Is Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>OAuth2 Git Hubs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OAUTH2_GIT_HUBS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>OAuth2 Googles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OAUTH2_GOOGLES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>OAuth2 Linked Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OAUTH2_LINKED_INS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Old Header Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OLD_HEADER_LOGO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Old Header Middle Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Old Header Right Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Old Style Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__OLD_STYLE_SHEET = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>One Inventory Facility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ONE_INVENTORY_FACILITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Order Decimal Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ORDER_DECIMAL_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Order Number Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ORDER_NUMBER_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Pay To Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PAY_TO_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Primary Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PRIMARY_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Prod Search Exclude Variants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Product Store Email Settings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Product Store Fin Act Settings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Prorate Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PRORATE_SHIPPING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Prorate Taxes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__PRORATE_TAXES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Req Return Inventory Receive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Req Ship Addr For Dig Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Require Customer Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Require Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__REQUIRE_INVENTORY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Requirement Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Reserve Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__RESERVE_INVENTORY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Reserve Order Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__RESERVE_ORDER_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Retry Failed Auths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__RETRY_FAILED_AUTHS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Select Payment Type Per Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Set Owner Upon Issuance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Ship If Capture Fails</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Show Checkout Gift Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Show Out Of Stock Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Show Prices With Vat Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Show Tax Is Exempt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SHOW_TAX_IS_EXEMPT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Split Pay Pref Per Shp Grp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>Store Credit Account Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>Store Credit Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__STORE_CREDIT_VALID_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>Store Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__STORE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SUBTITLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__TITLE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>Use Primary Email Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>Vat Tax Auth Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>Vat Tax Auth Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>View Cart On Add</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__VIEW_CART_ON_ADD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 84;

	/**
	 * The feature id for the '<em><b>Visual Theme Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__VISUAL_THEME_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 85;

	/**
	 * The number of structural features of the '<em>Product Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 86;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreCatalogImpl <em>Product Store Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreCatalogImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreCatalog()
	 * @generated
	 */
	int PRODUCT_STORE_CATALOG = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prod Catalog Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__PROD_CATALOG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Store Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_CATALOG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl <em>Product Store Email Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreEmailSetting()
	 * @generated
	 */
	int PRODUCT_STORE_EMAIL_SETTING = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bcc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cc Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__SUBJECT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Xslfo Attach Screen Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Product Store Email Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_EMAIL_SETTING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFacilityImpl <em>Product Store Facility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreFacilityImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreFacility()
	 * @generated
	 */
	int PRODUCT_STORE_FACILITY = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Store Facility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FACILITY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl <em>Product Store Fin Act Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreFinActSetting()
	 * @generated
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fin Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Account Code Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Account Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allow Auth To Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Auth Valid Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pin Code Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Purch Survey Copy Me</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Purch Survey Send To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Purchase Survey Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Replenish Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Replenish Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Require Pin Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Validate GC Fin Acct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Product Store Fin Act Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FIN_ACT_SETTING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl <em>Product Store Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroup()
	 * @generated
	 */
	int PRODUCT_STORE_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primary Parent Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Store Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Store Group Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Store Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupMemberImpl <em>Product Store Group Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupMemberImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupMember()
	 * @generated
	 */
	int PRODUCT_STORE_GROUP_MEMBER = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__PRODUCT_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Store Group Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_MEMBER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRoleImpl <em>Product Store Group Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRoleImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupRole()
	 * @generated
	 */
	int PRODUCT_STORE_GROUP_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE__PRODUCT_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Store Group Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRollupImpl <em>Product Store Group Rollup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRollupImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupRollup()
	 * @generated
	 */
	int PRODUCT_STORE_GROUP_ROLLUP = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__PRODUCT_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__PARENT_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Product Store Group Rollup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_ROLLUP_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupTypeImpl <em>Product Store Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupTypeImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupType()
	 * @generated
	 */
	int PRODUCT_STORE_GROUP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Group Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_TYPE__PRODUCT_STORE_GROUP_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product Store Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_GROUP_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl <em>Product Store Keyword Ovrd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreKeywordOvrd()
	 * @generated
	 */
	int PRODUCT_STORE_KEYWORD_OVRD = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__KEYWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__TARGET = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Store Keyword Ovrd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_KEYWORD_OVRD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl <em>Product Store Payment Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStorePaymentSetting()
	 * @generated
	 */
	int PRODUCT_STORE_PAYMENT_SETTING = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payment Service Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Apply To All Products</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Payment Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Payment Gateway Config Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Payment Properties Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Payment Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product Store Payment Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PAYMENT_SETTING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl <em>Product Store Promo Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStorePromoAppl()
	 * @generated
	 */
	int PRODUCT_STORE_PROMO_APPL = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Promo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Manual Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Store Promo Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_PROMO_APPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreRoleImpl <em>Product Store Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreRoleImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreRole()
	 * @generated
	 */
	int PRODUCT_STORE_ROLE = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Product Store Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl <em>Product Store Shipment Meth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreShipmentMeth()
	 * @generated
	 */
	int PRODUCT_STORE_SHIPMENT_METH = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Ship Meth Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Company Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allow Usps Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allowance Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Company Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Config Props</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exclude Feature Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exclude Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Include Feature Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Include Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Include No Charge Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Min Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Min Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Min Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Minimum Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Require Company Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Require Usps Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Shipment Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Config Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Product Store Shipment Meth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SHIPMENT_METH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 28;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl <em>Product Store Survey Appl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreSurveyAppl()
	 * @generated
	 */
	int PRODUCT_STORE_SURVEY_APPL = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__GROUP_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Result Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Survey Appl Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Survey Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__SURVEY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Survey Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Product Store Survey Appl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_SURVEY_APPL_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl <em>Product Store Vendor Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreVendorPayment()
	 * @generated
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vendor Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Payment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Credit Card Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Store Vendor Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_PAYMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl <em>Product Store Vendor Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl
	 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreVendorShipment()
	 * @generated
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vendor Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Carrier Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Product Store Vendor Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_VENDOR_SHIPMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore
	 * @generated
	 */
	EClass getProductStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getProductStoreId()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAddToCartRemoveIncompat <em>Add To Cart Remove Incompat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add To Cart Remove Incompat</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAddToCartRemoveIncompat()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AddToCartRemoveIncompat();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAddToCartReplaceUpsell <em>Add To Cart Replace Upsell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add To Cart Replace Upsell</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAddToCartReplaceUpsell()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AddToCartReplaceUpsell();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAllowComment <em>Allow Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Comment</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAllowComment()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AllowComment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAllowPassword <em>Allow Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Password</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAllowPassword()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AllowPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthDeclinedMessage <em>Auth Declined Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Declined Message</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getAuthDeclinedMessage()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AuthDeclinedMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthErrorMessage <em>Auth Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Error Message</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getAuthErrorMessage()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AuthErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getAuthFraudMessage <em>Auth Fraud Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Fraud Message</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getAuthFraudMessage()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AuthFraudMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveInvoice <em>Auto Approve Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Approve Invoice</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveInvoice()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoApproveInvoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveOrder <em>Auto Approve Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Approve Order</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveOrder()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoApproveOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveReviews <em>Auto Approve Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Approve Reviews</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoApproveReviews()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoApproveReviews();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoInvoiceDigitalItems <em>Auto Invoice Digital Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Invoice Digital Items</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoInvoiceDigitalItems()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoInvoiceDigitalItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryExp <em>Auto Order Cc Try Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Order Cc Try Exp</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryExp()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoOrderCcTryExp();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getAutoOrderCcTryLaterMax <em>Auto Order Cc Try Later Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Order Cc Try Later Max</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getAutoOrderCcTryLaterMax()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoOrderCcTryLaterMax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryLaterNsf <em>Auto Order Cc Try Later Nsf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Order Cc Try Later Nsf</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryLaterNsf()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoOrderCcTryLaterNsf();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryOtherCards <em>Auto Order Cc Try Other Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Order Cc Try Other Cards</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoOrderCcTryOtherCards()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoOrderCcTryOtherCards();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isAutoSaveCart <em>Auto Save Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Save Cart</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isAutoSaveCart()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_AutoSaveCart();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isBalanceResOnOrderCreation <em>Balance Res On Order Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance Res On Order Creation</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isBalanceResOnOrderCreation()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_BalanceResOnOrderCreation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isCheckGcBalance <em>Check Gc Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Gc Balance</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isCheckGcBalance()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_CheckGcBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isCheckInventory <em>Check Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Inventory</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isCheckInventory()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_CheckInventory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getCompanyName()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getDaysToCancelNonPay <em>Days To Cancel Non Pay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days To Cancel Non Pay</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDaysToCancelNonPay()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_DaysToCancelNonPay();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultCurrencyUomId <em>Default Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDefaultCurrencyUomId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_DefaultCurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultLocaleString <em>Default Locale String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Locale String</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDefaultLocaleString()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_DefaultLocaleString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultPassword <em>Default Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Password</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDefaultPassword()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_DefaultPassword();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultSalesChannelEnumId <em>Default Sales Channel Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Sales Channel Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDefaultSalesChannelEnumId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_DefaultSalesChannelEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getDefaultTimeZoneString <em>Default Time Zone String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Time Zone String</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDefaultTimeZoneString()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_DefaultTimeZoneString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getDigProdUploadCategoryId <em>Dig Prod Upload Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dig Prod Upload Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDigProdUploadCategoryId()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_DigProdUploadCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getDigitalItemApprovedStatus <em>Digital Item Approved Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Digital Item Approved Status</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getDigitalItemApprovedStatus()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_DigitalItemApprovedStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isEnableAutoSuggestionList <em>Enable Auto Suggestion List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Auto Suggestion List</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isEnableAutoSuggestionList()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_EnableAutoSuggestionList();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isEnableDigProdUpload <em>Enable Dig Prod Upload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Dig Prod Upload</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isEnableDigProdUpload()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_EnableDigProdUpload();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isExplodeOrderItems <em>Explode Order Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explode Order Items</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isExplodeOrderItems()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ExplodeOrderItems();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderApprovedStatus <em>Header Approved Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header Approved Status</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getHeaderApprovedStatus()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_HeaderApprovedStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderCancelStatus <em>Header Cancel Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header Cancel Status</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getHeaderCancelStatus()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_HeaderCancelStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getHeaderDeclinedStatus <em>Header Declined Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Header Declined Status</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getHeaderDeclinedStatus()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_HeaderDeclinedStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getInventoryFacilityId <em>Inventory Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getInventoryFacilityId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_InventoryFacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isIsDemoStore <em>Is Demo Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Demo Store</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isIsDemoStore()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_IsDemoStore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isIsImmediatelyFulfilled <em>Is Immediately Fulfilled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immediately Fulfilled</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isIsImmediatelyFulfilled()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_IsImmediatelyFulfilled();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemApprovedStatus <em>Item Approved Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Approved Status</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getItemApprovedStatus()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_ItemApprovedStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemCancelStatus <em>Item Cancel Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Cancel Status</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getItemCancelStatus()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_ItemCancelStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getItemDeclinedStatus <em>Item Declined Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item Declined Status</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getItemDeclinedStatus()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_ItemDeclinedStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isManagedByLot <em>Managed By Lot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed By Lot</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isManagedByLot()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ManagedByLot();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isManualAuthIsCapture <em>Manual Auth Is Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Auth Is Capture</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isManualAuthIsCapture()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ManualAuthIsCapture();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2GitHubs <em>OAuth2 Git Hubs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OAuth2 Git Hubs</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOAuth2GitHubs()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_OAuth2GitHubs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2Googles <em>OAuth2 Googles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OAuth2 Googles</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOAuth2Googles()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_OAuth2Googles();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.store.ProductStore#getOAuth2LinkedIns <em>OAuth2 Linked Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>OAuth2 Linked Ins</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOAuth2LinkedIns()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_OAuth2LinkedIns();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderLogo <em>Old Header Logo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Header Logo</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderLogo()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_OldHeaderLogo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderMiddleBackground <em>Old Header Middle Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Header Middle Background</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderMiddleBackground()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_OldHeaderMiddleBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderRightBackground <em>Old Header Right Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Header Right Background</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOldHeaderRightBackground()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_OldHeaderRightBackground();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getOldStyleSheet <em>Old Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Style Sheet</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOldStyleSheet()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_OldStyleSheet();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isOneInventoryFacility <em>One Inventory Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Inventory Facility</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isOneInventoryFacility()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_OneInventoryFacility();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Decimal Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isOrderDecimalQuantity()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_OrderDecimalQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getOrderNumberPrefix <em>Order Number Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Number Prefix</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getOrderNumberPrefix()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_OrderNumberPrefix();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getPayToPartyId <em>Pay To Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pay To Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getPayToPartyId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_PayToPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getPrimaryStoreGroupId <em>Primary Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getPrimaryStoreGroupId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_PrimaryStoreGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isProdSearchExcludeVariants <em>Prod Search Exclude Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prod Search Exclude Variants</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isProdSearchExcludeVariants()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ProdSearchExcludeVariants();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreEmailSettings <em>Product Store Email Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Store Email Settings</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getProductStoreEmailSettings()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_ProductStoreEmailSettings();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.store.ProductStore#getProductStoreFinActSettings <em>Product Store Fin Act Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Store Fin Act Settings</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getProductStoreFinActSettings()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_ProductStoreFinActSettings();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isProrateShipping <em>Prorate Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prorate Shipping</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isProrateShipping()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ProrateShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isProrateTaxes <em>Prorate Taxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prorate Taxes</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isProrateTaxes()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ProrateTaxes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isReqReturnInventoryReceive <em>Req Return Inventory Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Return Inventory Receive</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isReqReturnInventoryReceive()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ReqReturnInventoryReceive();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isReqShipAddrForDigItems <em>Req Ship Addr For Dig Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Ship Addr For Dig Items</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isReqShipAddrForDigItems()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ReqShipAddrForDigItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isRequireCustomerRole <em>Require Customer Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Customer Role</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isRequireCustomerRole()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_RequireCustomerRole();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isRequireInventory <em>Require Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Inventory</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isRequireInventory()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_RequireInventory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Method Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getRequirementMethodEnumId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_RequirementMethodEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isReserveInventory <em>Reserve Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserve Inventory</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isReserveInventory()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ReserveInventory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getReserveOrderEnumId <em>Reserve Order Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reserve Order Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getReserveOrderEnumId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_ReserveOrderEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isRetryFailedAuths <em>Retry Failed Auths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retry Failed Auths</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isRetryFailedAuths()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_RetryFailedAuths();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isSelectPaymentTypePerItem <em>Select Payment Type Per Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Select Payment Type Per Item</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isSelectPaymentTypePerItem()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_SelectPaymentTypePerItem();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isSetOwnerUponIssuance <em>Set Owner Upon Issuance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Owner Upon Issuance</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isSetOwnerUponIssuance()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_SetOwnerUponIssuance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isShipIfCaptureFails <em>Ship If Capture Fails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship If Capture Fails</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isShipIfCaptureFails()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ShipIfCaptureFails();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowCheckoutGiftOptions <em>Show Checkout Gift Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Checkout Gift Options</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isShowCheckoutGiftOptions()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ShowCheckoutGiftOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowOutOfStockProducts <em>Show Out Of Stock Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Out Of Stock Products</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isShowOutOfStockProducts()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ShowOutOfStockProducts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowPricesWithVatTax <em>Show Prices With Vat Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Prices With Vat Tax</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isShowPricesWithVatTax()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ShowPricesWithVatTax();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isShowTaxIsExempt <em>Show Tax Is Exempt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Tax Is Exempt</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isShowTaxIsExempt()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ShowTaxIsExempt();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isSplitPayPrefPerShpGrp <em>Split Pay Pref Per Shp Grp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Split Pay Pref Per Shp Grp</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isSplitPayPrefPerShpGrp()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_SplitPayPrefPerShpGrp();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditAccountEnumId <em>Store Credit Account Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Store Credit Account Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditAccountEnumId()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_StoreCreditAccountEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditValidDays <em>Store Credit Valid Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Credit Valid Days</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getStoreCreditValidDays()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_StoreCreditValidDays();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getStoreName <em>Store Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Name</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getStoreName()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_StoreName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getSubtitle()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getTitle()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isUsePrimaryEmailUsername <em>Use Primary Email Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Primary Email Username</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isUsePrimaryEmailUsername()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_UsePrimaryEmailUsername();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthGeoId <em>Vat Tax Auth Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vat Tax Auth Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthGeoId()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_VatTaxAuthGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthPartyId <em>Vat Tax Auth Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vat Tax Auth Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getVatTaxAuthPartyId()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_VatTaxAuthPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#isViewCartOnAdd <em>View Cart On Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Cart On Add</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#isViewCartOnAdd()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_ViewCartOnAdd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStore#getVisualThemeId <em>Visual Theme Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visual Theme Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStore#getVisualThemeId()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_VisualThemeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreCatalog <em>Product Store Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Catalog</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreCatalog
	 * @generated
	 */
	EClass getProductStoreCatalog();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreCatalog#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreCatalog#getProductStoreId()
	 * @see #getProductStoreCatalog()
	 * @generated
	 */
	EReference getProductStoreCatalog_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreCatalog#getProdCatalogId <em>Prod Catalog Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prod Catalog Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreCatalog#getProdCatalogId()
	 * @see #getProductStoreCatalog()
	 * @generated
	 */
	EReference getProductStoreCatalog_ProdCatalogId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreCatalog#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreCatalog#getFromDate()
	 * @see #getProductStoreCatalog()
	 * @generated
	 */
	EAttribute getProductStoreCatalog_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreCatalog#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreCatalog#getSequenceNum()
	 * @see #getProductStoreCatalog()
	 * @generated
	 */
	EAttribute getProductStoreCatalog_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreCatalog#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreCatalog#getThruDate()
	 * @see #getProductStoreCatalog()
	 * @generated
	 */
	EAttribute getProductStoreCatalog_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting <em>Product Store Email Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Email Setting</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting
	 * @generated
	 */
	EClass getProductStoreEmailSetting();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getProductStoreId()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EReference getProductStoreEmailSetting_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getEmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Email Type</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getEmailType()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EReference getProductStoreEmailSetting_EmailType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBccAddress <em>Bcc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bcc Address</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBccAddress()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EAttribute getProductStoreEmailSetting_BccAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBodyScreenLocation <em>Body Screen Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Screen Location</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getBodyScreenLocation()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EAttribute getProductStoreEmailSetting_BodyScreenLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getCcAddress <em>Cc Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Address</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getCcAddress()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EAttribute getProductStoreEmailSetting_CcAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getContentType()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EAttribute getProductStoreEmailSetting_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getFromAddress <em>From Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Address</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getFromAddress()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EAttribute getProductStoreEmailSetting_FromAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getSubject()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EAttribute getProductStoreEmailSetting_Subject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getXslfoAttachScreenLocation <em>Xslfo Attach Screen Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xslfo Attach Screen Location</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreEmailSetting#getXslfoAttachScreenLocation()
	 * @see #getProductStoreEmailSetting()
	 * @generated
	 */
	EAttribute getProductStoreEmailSetting_XslfoAttachScreenLocation();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility <em>Product Store Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Facility</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFacility
	 * @generated
	 */
	EClass getProductStoreFacility();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFacility#getProductStoreId()
	 * @see #getProductStoreFacility()
	 * @generated
	 */
	EReference getProductStoreFacility_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFacility#getFacilityId()
	 * @see #getProductStoreFacility()
	 * @generated
	 */
	EReference getProductStoreFacility_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFacility#getFromDate()
	 * @see #getProductStoreFacility()
	 * @generated
	 */
	EAttribute getProductStoreFacility_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFacility#getSequenceNum()
	 * @see #getProductStoreFacility()
	 * @generated
	 */
	EAttribute getProductStoreFacility_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFacility#getThruDate()
	 * @see #getProductStoreFacility()
	 * @generated
	 */
	EAttribute getProductStoreFacility_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting <em>Product Store Fin Act Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Fin Act Setting</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting
	 * @generated
	 */
	EClass getProductStoreFinActSetting();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getProductStoreId()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EReference getProductStoreFinActSetting_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getFinAccountTypeId <em>Fin Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fin Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getFinAccountTypeId()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EReference getProductStoreFinActSetting_FinAccountTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountCodeLength <em>Account Code Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Code Length</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountCodeLength()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_AccountCodeLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountValidDays <em>Account Valid Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Valid Days</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAccountValidDays()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_AccountValidDays();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isAllowAuthToNegative <em>Allow Auth To Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Auth To Negative</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isAllowAuthToNegative()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_AllowAuthToNegative();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAuthValidDays <em>Auth Valid Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Valid Days</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getAuthValidDays()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_AuthValidDays();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getMinBalance <em>Min Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Balance</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getMinBalance()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_MinBalance();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPinCodeLength <em>Pin Code Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin Code Length</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPinCodeLength()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_PinCodeLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveyCopyMe <em>Purch Survey Copy Me</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purch Survey Copy Me</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveyCopyMe()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_PurchSurveyCopyMe();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveySendTo <em>Purch Survey Send To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purch Survey Send To</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchSurveySendTo()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_PurchSurveySendTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchaseSurveyId <em>Purchase Survey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Purchase Survey Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getPurchaseSurveyId()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EReference getProductStoreFinActSetting_PurchaseSurveyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishMethodEnumId <em>Replenish Method Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Replenish Method Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishMethodEnumId()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EReference getProductStoreFinActSetting_ReplenishMethodEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishThreshold <em>Replenish Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replenish Threshold</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#getReplenishThreshold()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_ReplenishThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isRequirePinCode <em>Require Pin Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Pin Code</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isRequirePinCode()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_RequirePinCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isValidateGCFinAcct <em>Validate GC Fin Acct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate GC Fin Acct</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreFinActSetting#isValidateGCFinAcct()
	 * @see #getProductStoreFinActSetting()
	 * @generated
	 */
	EAttribute getProductStoreFinActSetting_ValidateGCFinAcct();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup <em>Product Store Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Group</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroup
	 * @generated
	 */
	EClass getProductStoreGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupId <em>Product Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupId()
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	EAttribute getProductStoreGroup_ProductStoreGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroup#getDescription()
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	EAttribute getProductStoreGroup_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Parent Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroup#getPrimaryParentGroupId()
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	EReference getProductStoreGroup_PrimaryParentGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupName <em>Product Store Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Group Name</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupName()
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	EAttribute getProductStoreGroup_ProductStoreGroupName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupTypeId <em>Product Store Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroup#getProductStoreGroupTypeId()
	 * @see #getProductStoreGroup()
	 * @generated
	 */
	EReference getProductStoreGroup_ProductStoreGroupTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupMember <em>Product Store Group Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Group Member</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupMember
	 * @generated
	 */
	EClass getProductStoreGroupMember();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getProductStoreId()
	 * @see #getProductStoreGroupMember()
	 * @generated
	 */
	EReference getProductStoreGroupMember_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getProductStoreGroupId <em>Product Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getProductStoreGroupId()
	 * @see #getProductStoreGroupMember()
	 * @generated
	 */
	EReference getProductStoreGroupMember_ProductStoreGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getFromDate()
	 * @see #getProductStoreGroupMember()
	 * @generated
	 */
	EAttribute getProductStoreGroupMember_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getSequenceNum()
	 * @see #getProductStoreGroupMember()
	 * @generated
	 */
	EAttribute getProductStoreGroupMember_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupMember#getThruDate()
	 * @see #getProductStoreGroupMember()
	 * @generated
	 */
	EAttribute getProductStoreGroupMember_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRole <em>Product Store Group Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Group Role</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRole
	 * @generated
	 */
	EClass getProductStoreGroupRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRole#getProductStoreGroupId <em>Product Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRole#getProductStoreGroupId()
	 * @see #getProductStoreGroupRole()
	 * @generated
	 */
	EReference getProductStoreGroupRole_ProductStoreGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRole#getPartyId()
	 * @see #getProductStoreGroupRole()
	 * @generated
	 */
	EReference getProductStoreGroupRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRole#getRoleTypeId()
	 * @see #getProductStoreGroupRole()
	 * @generated
	 */
	EReference getProductStoreGroupRole_RoleTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRollup <em>Product Store Group Rollup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Group Rollup</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRollup
	 * @generated
	 */
	EClass getProductStoreGroupRollup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getProductStoreGroupId <em>Product Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getProductStoreGroupId()
	 * @see #getProductStoreGroupRollup()
	 * @generated
	 */
	EReference getProductStoreGroupRollup_ProductStoreGroupId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getParentGroupId <em>Parent Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getParentGroupId()
	 * @see #getProductStoreGroupRollup()
	 * @generated
	 */
	EReference getProductStoreGroupRollup_ParentGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getFromDate()
	 * @see #getProductStoreGroupRollup()
	 * @generated
	 */
	EAttribute getProductStoreGroupRollup_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getSequenceNum()
	 * @see #getProductStoreGroupRollup()
	 * @generated
	 */
	EAttribute getProductStoreGroupRollup_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupRollup#getThruDate()
	 * @see #getProductStoreGroupRollup()
	 * @generated
	 */
	EAttribute getProductStoreGroupRollup_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupType <em>Product Store Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Group Type</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupType
	 * @generated
	 */
	EClass getProductStoreGroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupType#getProductStoreGroupTypeId <em>Product Store Group Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Group Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupType#getProductStoreGroupTypeId()
	 * @see #getProductStoreGroupType()
	 * @generated
	 */
	EAttribute getProductStoreGroupType_ProductStoreGroupTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreGroupType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreGroupType#getDescription()
	 * @see #getProductStoreGroupType()
	 * @generated
	 */
	EAttribute getProductStoreGroupType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd <em>Product Store Keyword Ovrd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Keyword Ovrd</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd
	 * @generated
	 */
	EClass getProductStoreKeywordOvrd();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getProductStoreId()
	 * @see #getProductStoreKeywordOvrd()
	 * @generated
	 */
	EReference getProductStoreKeywordOvrd_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getKeyword()
	 * @see #getProductStoreKeywordOvrd()
	 * @generated
	 */
	EAttribute getProductStoreKeywordOvrd_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getFromDate()
	 * @see #getProductStoreKeywordOvrd()
	 * @generated
	 */
	EAttribute getProductStoreKeywordOvrd_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getTarget()
	 * @see #getProductStoreKeywordOvrd()
	 * @generated
	 */
	EAttribute getProductStoreKeywordOvrd_Target();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getTargetTypeEnumId <em>Target Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getTargetTypeEnumId()
	 * @see #getProductStoreKeywordOvrd()
	 * @generated
	 */
	EReference getProductStoreKeywordOvrd_TargetTypeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreKeywordOvrd#getThruDate()
	 * @see #getProductStoreKeywordOvrd()
	 * @generated
	 */
	EAttribute getProductStoreKeywordOvrd_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting <em>Product Store Payment Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Payment Setting</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting
	 * @generated
	 */
	EClass getProductStorePaymentSetting();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getProductStoreId()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EReference getProductStorePaymentSetting_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentMethodTypeId()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EReference getProductStorePaymentSetting_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentServiceTypeEnumId <em>Payment Service Type Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Service Type Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentServiceTypeEnumId()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EReference getProductStorePaymentSetting_PaymentServiceTypeEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#isApplyToAllProducts <em>Apply To All Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To All Products</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#isApplyToAllProducts()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EAttribute getProductStorePaymentSetting_ApplyToAllProducts();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentCustomMethodId <em>Payment Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentCustomMethodId()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EReference getProductStorePaymentSetting_PaymentCustomMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentGatewayConfigId()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EReference getProductStorePaymentSetting_PaymentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentPropertiesPath <em>Payment Properties Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Properties Path</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentPropertiesPath()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EAttribute getProductStorePaymentSetting_PaymentPropertiesPath();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentService <em>Payment Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Service</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePaymentSetting#getPaymentService()
	 * @see #getProductStorePaymentSetting()
	 * @generated
	 */
	EAttribute getProductStorePaymentSetting_PaymentService();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStorePromoAppl <em>Product Store Promo Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Promo Appl</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePromoAppl
	 * @generated
	 */
	EClass getProductStorePromoAppl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getProductStoreId()
	 * @see #getProductStorePromoAppl()
	 * @generated
	 */
	EReference getProductStorePromoAppl_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getProductPromoId <em>Product Promo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Promo Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getProductPromoId()
	 * @see #getProductStorePromoAppl()
	 * @generated
	 */
	EReference getProductStorePromoAppl_ProductPromoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getFromDate()
	 * @see #getProductStorePromoAppl()
	 * @generated
	 */
	EAttribute getProductStorePromoAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStorePromoAppl#isManualOnly <em>Manual Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual Only</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePromoAppl#isManualOnly()
	 * @see #getProductStorePromoAppl()
	 * @generated
	 */
	EAttribute getProductStorePromoAppl_ManualOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getSequenceNum()
	 * @see #getProductStorePromoAppl()
	 * @generated
	 */
	EAttribute getProductStorePromoAppl_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStorePromoAppl#getThruDate()
	 * @see #getProductStorePromoAppl()
	 * @generated
	 */
	EAttribute getProductStorePromoAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreRole <em>Product Store Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Role</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreRole
	 * @generated
	 */
	EClass getProductStoreRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreRole#getPartyId()
	 * @see #getProductStoreRole()
	 * @generated
	 */
	EReference getProductStoreRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreRole#getRoleTypeId()
	 * @see #getProductStoreRole()
	 * @generated
	 */
	EReference getProductStoreRole_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreRole#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreRole#getProductStoreId()
	 * @see #getProductStoreRole()
	 * @generated
	 */
	EReference getProductStoreRole_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreRole#getFromDate()
	 * @see #getProductStoreRole()
	 * @generated
	 */
	EAttribute getProductStoreRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreRole#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreRole#getSequenceNum()
	 * @see #getProductStoreRole()
	 * @generated
	 */
	EAttribute getProductStoreRole_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreRole#getThruDate()
	 * @see #getProductStoreRole()
	 * @generated
	 */
	EAttribute getProductStoreRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth <em>Product Store Shipment Meth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Shipment Meth</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth
	 * @generated
	 */
	EClass getProductStoreShipmentMeth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Ship Meth Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getProductStoreShipMethId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_ProductStoreShipMethId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isAllowCompanyAddr <em>Allow Company Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Company Addr</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isAllowCompanyAddr()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_AllowCompanyAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isAllowUspsAddr <em>Allow Usps Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Usps Addr</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isAllowUspsAddr()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_AllowUspsAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getAllowancePercent <em>Allowance Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowance Percent</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getAllowancePercent()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_AllowancePercent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getCompanyPartyId <em>Company Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Company Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getCompanyPartyId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EReference getProductStoreShipmentMeth_CompanyPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getConfigProps <em>Config Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Props</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getConfigProps()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_ConfigProps();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getExcludeFeatureGroup <em>Exclude Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Feature Group</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getExcludeFeatureGroup()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_ExcludeFeatureGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getExcludeGeoId <em>Exclude Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exclude Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getExcludeGeoId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EReference getProductStoreShipmentMeth_ExcludeGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getIncludeFeatureGroup <em>Include Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Feature Group</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getIncludeFeatureGroup()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_IncludeFeatureGroup();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getIncludeGeoId <em>Include Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Include Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getIncludeGeoId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EReference getProductStoreShipmentMeth_IncludeGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isIncludeNoChargeItems <em>Include No Charge Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include No Charge Items</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isIncludeNoChargeItems()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_IncludeNoChargeItems();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMaxSize <em>Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Size</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMaxSize()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_MaxSize();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMaxTotal <em>Max Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Total</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMaxTotal()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_MaxTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMaxWeight <em>Max Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Weight</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMaxWeight()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_MaxWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinSize <em>Min Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Size</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinSize()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_MinSize();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinTotal <em>Min Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Total</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinTotal()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_MinTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinWeight <em>Min Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Weight</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinWeight()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_MinWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinimumPrice <em>Minimum Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Price</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getMinimumPrice()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_MinimumPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getPartyId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getProductStoreId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isRequireCompanyAddr <em>Require Company Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Company Addr</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isRequireCompanyAddr()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_RequireCompanyAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isRequireUspsAddr <em>Require Usps Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Usps Addr</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#isRequireUspsAddr()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_RequireUspsAddr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getRoleTypeId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getSequenceNumber()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_SequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getServiceName()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EAttribute getProductStoreShipmentMeth_ServiceName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getShipmentCustomMethodId <em>Shipment Custom Method Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Custom Method Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getShipmentCustomMethodId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EReference getProductStoreShipmentMeth_ShipmentCustomMethodId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getShipmentGatewayConfigId <em>Shipment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getShipmentGatewayConfigId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EReference getProductStoreShipmentMeth_ShipmentGatewayConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth#getShipmentMethodTypeId()
	 * @see #getProductStoreShipmentMeth()
	 * @generated
	 */
	EReference getProductStoreShipmentMeth_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl <em>Product Store Survey Appl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Survey Appl</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl
	 * @generated
	 */
	EClass getProductStoreSurveyAppl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreSurveyId <em>Product Store Survey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Survey Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreSurveyId()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EAttribute getProductStoreSurveyAppl_ProductStoreSurveyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getFromDate()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EAttribute getProductStoreSurveyAppl_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getGroupName()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EAttribute getProductStoreSurveyAppl_GroupName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductCategoryId <em>Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductCategoryId()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EReference getProductStoreSurveyAppl_ProductCategoryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductId()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EReference getProductStoreSurveyAppl_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreId()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EReference getProductStoreSurveyAppl_ProductStoreId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getResultTemplate <em>Result Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Template</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getResultTemplate()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EAttribute getProductStoreSurveyAppl_ResultTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSequenceNum()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EAttribute getProductStoreSurveyAppl_SequenceNum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyApplTypeId <em>Survey Appl Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Appl Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyApplTypeId()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EReference getProductStoreSurveyAppl_SurveyApplTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyId <em>Survey Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Survey Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyId()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EReference getProductStoreSurveyAppl_SurveyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyTemplate <em>Survey Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Survey Template</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyTemplate()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EAttribute getProductStoreSurveyAppl_SurveyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getThruDate()
	 * @see #getProductStoreSurveyAppl()
	 * @generated
	 */
	EAttribute getProductStoreSurveyAppl_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment <em>Product Store Vendor Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Vendor Payment</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorPayment
	 * @generated
	 */
	EClass getProductStoreVendorPayment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getProductStoreId()
	 * @see #getProductStoreVendorPayment()
	 * @generated
	 */
	EReference getProductStoreVendorPayment_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getVendorPartyId <em>Vendor Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getVendorPartyId()
	 * @see #getProductStoreVendorPayment()
	 * @generated
	 */
	EReference getProductStoreVendorPayment_VendorPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getPaymentMethodTypeId <em>Payment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getPaymentMethodTypeId()
	 * @see #getProductStoreVendorPayment()
	 * @generated
	 */
	EReference getProductStoreVendorPayment_PaymentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getCreditCardEnumId <em>Credit Card Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorPayment#getCreditCardEnumId()
	 * @see #getProductStoreVendorPayment()
	 * @generated
	 */
	EReference getProductStoreVendorPayment_CreditCardEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment <em>Product Store Vendor Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store Vendor Shipment</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorShipment
	 * @generated
	 */
	EClass getProductStoreVendorShipment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getProductStoreId()
	 * @see #getProductStoreVendorShipment()
	 * @generated
	 */
	EReference getProductStoreVendorShipment_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getVendorPartyId <em>Vendor Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getVendorPartyId()
	 * @see #getProductStoreVendorShipment()
	 * @generated
	 */
	EReference getProductStoreVendorShipment_VendorPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getShipmentMethodTypeId()
	 * @see #getProductStoreVendorShipment()
	 * @generated
	 */
	EReference getProductStoreVendorShipment_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getCarrierPartyId <em>Carrier Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.store.ProductStoreVendorShipment#getCarrierPartyId()
	 * @see #getProductStoreVendorShipment()
	 * @generated
	 */
	EReference getProductStoreVendorShipment_CarrierPartyId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StoreFactory getStoreFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreImpl <em>Product Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStore()
		 * @generated
		 */
		EClass PRODUCT_STORE = eINSTANCE.getProductStore();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__PRODUCT_STORE_ID = eINSTANCE.getProductStore_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Add To Cart Remove Incompat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ADD_TO_CART_REMOVE_INCOMPAT = eINSTANCE.getProductStore_AddToCartRemoveIncompat();

		/**
		 * The meta object literal for the '<em><b>Add To Cart Replace Upsell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ADD_TO_CART_REPLACE_UPSELL = eINSTANCE.getProductStore_AddToCartReplaceUpsell();

		/**
		 * The meta object literal for the '<em><b>Allow Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ALLOW_COMMENT = eINSTANCE.getProductStore_AllowComment();

		/**
		 * The meta object literal for the '<em><b>Allow Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ALLOW_PASSWORD = eINSTANCE.getProductStore_AllowPassword();

		/**
		 * The meta object literal for the '<em><b>Auth Declined Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTH_DECLINED_MESSAGE = eINSTANCE.getProductStore_AuthDeclinedMessage();

		/**
		 * The meta object literal for the '<em><b>Auth Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTH_ERROR_MESSAGE = eINSTANCE.getProductStore_AuthErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Auth Fraud Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTH_FRAUD_MESSAGE = eINSTANCE.getProductStore_AuthFraudMessage();

		/**
		 * The meta object literal for the '<em><b>Auto Approve Invoice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_APPROVE_INVOICE = eINSTANCE.getProductStore_AutoApproveInvoice();

		/**
		 * The meta object literal for the '<em><b>Auto Approve Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_APPROVE_ORDER = eINSTANCE.getProductStore_AutoApproveOrder();

		/**
		 * The meta object literal for the '<em><b>Auto Approve Reviews</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_APPROVE_REVIEWS = eINSTANCE.getProductStore_AutoApproveReviews();

		/**
		 * The meta object literal for the '<em><b>Auto Invoice Digital Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_INVOICE_DIGITAL_ITEMS = eINSTANCE.getProductStore_AutoInvoiceDigitalItems();

		/**
		 * The meta object literal for the '<em><b>Auto Order Cc Try Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_ORDER_CC_TRY_EXP = eINSTANCE.getProductStore_AutoOrderCcTryExp();

		/**
		 * The meta object literal for the '<em><b>Auto Order Cc Try Later Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_MAX = eINSTANCE.getProductStore_AutoOrderCcTryLaterMax();

		/**
		 * The meta object literal for the '<em><b>Auto Order Cc Try Later Nsf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_ORDER_CC_TRY_LATER_NSF = eINSTANCE.getProductStore_AutoOrderCcTryLaterNsf();

		/**
		 * The meta object literal for the '<em><b>Auto Order Cc Try Other Cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_ORDER_CC_TRY_OTHER_CARDS = eINSTANCE.getProductStore_AutoOrderCcTryOtherCards();

		/**
		 * The meta object literal for the '<em><b>Auto Save Cart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__AUTO_SAVE_CART = eINSTANCE.getProductStore_AutoSaveCart();

		/**
		 * The meta object literal for the '<em><b>Balance Res On Order Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__BALANCE_RES_ON_ORDER_CREATION = eINSTANCE.getProductStore_BalanceResOnOrderCreation();

		/**
		 * The meta object literal for the '<em><b>Check Gc Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__CHECK_GC_BALANCE = eINSTANCE.getProductStore_CheckGcBalance();

		/**
		 * The meta object literal for the '<em><b>Check Inventory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__CHECK_INVENTORY = eINSTANCE.getProductStore_CheckInventory();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__COMPANY_NAME = eINSTANCE.getProductStore_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Days To Cancel Non Pay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__DAYS_TO_CANCEL_NON_PAY = eINSTANCE.getProductStore_DaysToCancelNonPay();

		/**
		 * The meta object literal for the '<em><b>Default Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__DEFAULT_CURRENCY_UOM_ID = eINSTANCE.getProductStore_DefaultCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Default Locale String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__DEFAULT_LOCALE_STRING = eINSTANCE.getProductStore_DefaultLocaleString();

		/**
		 * The meta object literal for the '<em><b>Default Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__DEFAULT_PASSWORD = eINSTANCE.getProductStore_DefaultPassword();

		/**
		 * The meta object literal for the '<em><b>Default Sales Channel Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__DEFAULT_SALES_CHANNEL_ENUM_ID = eINSTANCE.getProductStore_DefaultSalesChannelEnumId();

		/**
		 * The meta object literal for the '<em><b>Default Time Zone String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__DEFAULT_TIME_ZONE_STRING = eINSTANCE.getProductStore_DefaultTimeZoneString();

		/**
		 * The meta object literal for the '<em><b>Dig Prod Upload Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__DIG_PROD_UPLOAD_CATEGORY_ID = eINSTANCE.getProductStore_DigProdUploadCategoryId();

		/**
		 * The meta object literal for the '<em><b>Digital Item Approved Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__DIGITAL_ITEM_APPROVED_STATUS = eINSTANCE.getProductStore_DigitalItemApprovedStatus();

		/**
		 * The meta object literal for the '<em><b>Enable Auto Suggestion List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ENABLE_AUTO_SUGGESTION_LIST = eINSTANCE.getProductStore_EnableAutoSuggestionList();

		/**
		 * The meta object literal for the '<em><b>Enable Dig Prod Upload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ENABLE_DIG_PROD_UPLOAD = eINSTANCE.getProductStore_EnableDigProdUpload();

		/**
		 * The meta object literal for the '<em><b>Explode Order Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__EXPLODE_ORDER_ITEMS = eINSTANCE.getProductStore_ExplodeOrderItems();

		/**
		 * The meta object literal for the '<em><b>Header Approved Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__HEADER_APPROVED_STATUS = eINSTANCE.getProductStore_HeaderApprovedStatus();

		/**
		 * The meta object literal for the '<em><b>Header Cancel Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__HEADER_CANCEL_STATUS = eINSTANCE.getProductStore_HeaderCancelStatus();

		/**
		 * The meta object literal for the '<em><b>Header Declined Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__HEADER_DECLINED_STATUS = eINSTANCE.getProductStore_HeaderDeclinedStatus();

		/**
		 * The meta object literal for the '<em><b>Inventory Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__INVENTORY_FACILITY_ID = eINSTANCE.getProductStore_InventoryFacilityId();

		/**
		 * The meta object literal for the '<em><b>Is Demo Store</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__IS_DEMO_STORE = eINSTANCE.getProductStore_IsDemoStore();

		/**
		 * The meta object literal for the '<em><b>Is Immediately Fulfilled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__IS_IMMEDIATELY_FULFILLED = eINSTANCE.getProductStore_IsImmediatelyFulfilled();

		/**
		 * The meta object literal for the '<em><b>Item Approved Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__ITEM_APPROVED_STATUS = eINSTANCE.getProductStore_ItemApprovedStatus();

		/**
		 * The meta object literal for the '<em><b>Item Cancel Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__ITEM_CANCEL_STATUS = eINSTANCE.getProductStore_ItemCancelStatus();

		/**
		 * The meta object literal for the '<em><b>Item Declined Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__ITEM_DECLINED_STATUS = eINSTANCE.getProductStore_ItemDeclinedStatus();

		/**
		 * The meta object literal for the '<em><b>Managed By Lot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__MANAGED_BY_LOT = eINSTANCE.getProductStore_ManagedByLot();

		/**
		 * The meta object literal for the '<em><b>Manual Auth Is Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__MANUAL_AUTH_IS_CAPTURE = eINSTANCE.getProductStore_ManualAuthIsCapture();

		/**
		 * The meta object literal for the '<em><b>OAuth2 Git Hubs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__OAUTH2_GIT_HUBS = eINSTANCE.getProductStore_OAuth2GitHubs();

		/**
		 * The meta object literal for the '<em><b>OAuth2 Googles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__OAUTH2_GOOGLES = eINSTANCE.getProductStore_OAuth2Googles();

		/**
		 * The meta object literal for the '<em><b>OAuth2 Linked Ins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__OAUTH2_LINKED_INS = eINSTANCE.getProductStore_OAuth2LinkedIns();

		/**
		 * The meta object literal for the '<em><b>Old Header Logo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__OLD_HEADER_LOGO = eINSTANCE.getProductStore_OldHeaderLogo();

		/**
		 * The meta object literal for the '<em><b>Old Header Middle Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__OLD_HEADER_MIDDLE_BACKGROUND = eINSTANCE.getProductStore_OldHeaderMiddleBackground();

		/**
		 * The meta object literal for the '<em><b>Old Header Right Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__OLD_HEADER_RIGHT_BACKGROUND = eINSTANCE.getProductStore_OldHeaderRightBackground();

		/**
		 * The meta object literal for the '<em><b>Old Style Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__OLD_STYLE_SHEET = eINSTANCE.getProductStore_OldStyleSheet();

		/**
		 * The meta object literal for the '<em><b>One Inventory Facility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ONE_INVENTORY_FACILITY = eINSTANCE.getProductStore_OneInventoryFacility();

		/**
		 * The meta object literal for the '<em><b>Order Decimal Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ORDER_DECIMAL_QUANTITY = eINSTANCE.getProductStore_OrderDecimalQuantity();

		/**
		 * The meta object literal for the '<em><b>Order Number Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__ORDER_NUMBER_PREFIX = eINSTANCE.getProductStore_OrderNumberPrefix();

		/**
		 * The meta object literal for the '<em><b>Pay To Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__PAY_TO_PARTY_ID = eINSTANCE.getProductStore_PayToPartyId();

		/**
		 * The meta object literal for the '<em><b>Primary Store Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__PRIMARY_STORE_GROUP_ID = eINSTANCE.getProductStore_PrimaryStoreGroupId();

		/**
		 * The meta object literal for the '<em><b>Prod Search Exclude Variants</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__PROD_SEARCH_EXCLUDE_VARIANTS = eINSTANCE.getProductStore_ProdSearchExcludeVariants();

		/**
		 * The meta object literal for the '<em><b>Product Store Email Settings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__PRODUCT_STORE_EMAIL_SETTINGS = eINSTANCE.getProductStore_ProductStoreEmailSettings();

		/**
		 * The meta object literal for the '<em><b>Product Store Fin Act Settings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__PRODUCT_STORE_FIN_ACT_SETTINGS = eINSTANCE.getProductStore_ProductStoreFinActSettings();

		/**
		 * The meta object literal for the '<em><b>Prorate Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__PRORATE_SHIPPING = eINSTANCE.getProductStore_ProrateShipping();

		/**
		 * The meta object literal for the '<em><b>Prorate Taxes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__PRORATE_TAXES = eINSTANCE.getProductStore_ProrateTaxes();

		/**
		 * The meta object literal for the '<em><b>Req Return Inventory Receive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__REQ_RETURN_INVENTORY_RECEIVE = eINSTANCE.getProductStore_ReqReturnInventoryReceive();

		/**
		 * The meta object literal for the '<em><b>Req Ship Addr For Dig Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__REQ_SHIP_ADDR_FOR_DIG_ITEMS = eINSTANCE.getProductStore_ReqShipAddrForDigItems();

		/**
		 * The meta object literal for the '<em><b>Require Customer Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__REQUIRE_CUSTOMER_ROLE = eINSTANCE.getProductStore_RequireCustomerRole();

		/**
		 * The meta object literal for the '<em><b>Require Inventory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__REQUIRE_INVENTORY = eINSTANCE.getProductStore_RequireInventory();

		/**
		 * The meta object literal for the '<em><b>Requirement Method Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__REQUIREMENT_METHOD_ENUM_ID = eINSTANCE.getProductStore_RequirementMethodEnumId();

		/**
		 * The meta object literal for the '<em><b>Reserve Inventory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__RESERVE_INVENTORY = eINSTANCE.getProductStore_ReserveInventory();

		/**
		 * The meta object literal for the '<em><b>Reserve Order Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__RESERVE_ORDER_ENUM_ID = eINSTANCE.getProductStore_ReserveOrderEnumId();

		/**
		 * The meta object literal for the '<em><b>Retry Failed Auths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__RETRY_FAILED_AUTHS = eINSTANCE.getProductStore_RetryFailedAuths();

		/**
		 * The meta object literal for the '<em><b>Select Payment Type Per Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SELECT_PAYMENT_TYPE_PER_ITEM = eINSTANCE.getProductStore_SelectPaymentTypePerItem();

		/**
		 * The meta object literal for the '<em><b>Set Owner Upon Issuance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SET_OWNER_UPON_ISSUANCE = eINSTANCE.getProductStore_SetOwnerUponIssuance();

		/**
		 * The meta object literal for the '<em><b>Ship If Capture Fails</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SHIP_IF_CAPTURE_FAILS = eINSTANCE.getProductStore_ShipIfCaptureFails();

		/**
		 * The meta object literal for the '<em><b>Show Checkout Gift Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SHOW_CHECKOUT_GIFT_OPTIONS = eINSTANCE.getProductStore_ShowCheckoutGiftOptions();

		/**
		 * The meta object literal for the '<em><b>Show Out Of Stock Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SHOW_OUT_OF_STOCK_PRODUCTS = eINSTANCE.getProductStore_ShowOutOfStockProducts();

		/**
		 * The meta object literal for the '<em><b>Show Prices With Vat Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SHOW_PRICES_WITH_VAT_TAX = eINSTANCE.getProductStore_ShowPricesWithVatTax();

		/**
		 * The meta object literal for the '<em><b>Show Tax Is Exempt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SHOW_TAX_IS_EXEMPT = eINSTANCE.getProductStore_ShowTaxIsExempt();

		/**
		 * The meta object literal for the '<em><b>Split Pay Pref Per Shp Grp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SPLIT_PAY_PREF_PER_SHP_GRP = eINSTANCE.getProductStore_SplitPayPrefPerShpGrp();

		/**
		 * The meta object literal for the '<em><b>Store Credit Account Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__STORE_CREDIT_ACCOUNT_ENUM_ID = eINSTANCE.getProductStore_StoreCreditAccountEnumId();

		/**
		 * The meta object literal for the '<em><b>Store Credit Valid Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__STORE_CREDIT_VALID_DAYS = eINSTANCE.getProductStore_StoreCreditValidDays();

		/**
		 * The meta object literal for the '<em><b>Store Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__STORE_NAME = eINSTANCE.getProductStore_StoreName();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__SUBTITLE = eINSTANCE.getProductStore_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__TITLE = eINSTANCE.getProductStore_Title();

		/**
		 * The meta object literal for the '<em><b>Use Primary Email Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__USE_PRIMARY_EMAIL_USERNAME = eINSTANCE.getProductStore_UsePrimaryEmailUsername();

		/**
		 * The meta object literal for the '<em><b>Vat Tax Auth Geo Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__VAT_TAX_AUTH_GEO_ID = eINSTANCE.getProductStore_VatTaxAuthGeoId();

		/**
		 * The meta object literal for the '<em><b>Vat Tax Auth Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__VAT_TAX_AUTH_PARTY_ID = eINSTANCE.getProductStore_VatTaxAuthPartyId();

		/**
		 * The meta object literal for the '<em><b>View Cart On Add</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__VIEW_CART_ON_ADD = eINSTANCE.getProductStore_ViewCartOnAdd();

		/**
		 * The meta object literal for the '<em><b>Visual Theme Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__VISUAL_THEME_ID = eINSTANCE.getProductStore_VisualThemeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreCatalogImpl <em>Product Store Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreCatalogImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreCatalog()
		 * @generated
		 */
		EClass PRODUCT_STORE_CATALOG = eINSTANCE.getProductStoreCatalog();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_CATALOG__PRODUCT_STORE_ID = eINSTANCE.getProductStoreCatalog_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Prod Catalog Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_CATALOG__PROD_CATALOG_ID = eINSTANCE.getProductStoreCatalog_ProdCatalogId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_CATALOG__FROM_DATE = eINSTANCE.getProductStoreCatalog_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_CATALOG__SEQUENCE_NUM = eINSTANCE.getProductStoreCatalog_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_CATALOG__THRU_DATE = eINSTANCE.getProductStoreCatalog_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl <em>Product Store Email Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreEmailSettingImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreEmailSetting()
		 * @generated
		 */
		EClass PRODUCT_STORE_EMAIL_SETTING = eINSTANCE.getProductStoreEmailSetting();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_EMAIL_SETTING__PRODUCT_STORE_ID = eINSTANCE.getProductStoreEmailSetting_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Email Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_EMAIL_SETTING__EMAIL_TYPE = eINSTANCE.getProductStoreEmailSetting_EmailType();

		/**
		 * The meta object literal for the '<em><b>Bcc Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_EMAIL_SETTING__BCC_ADDRESS = eINSTANCE.getProductStoreEmailSetting_BccAddress();

		/**
		 * The meta object literal for the '<em><b>Body Screen Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_EMAIL_SETTING__BODY_SCREEN_LOCATION = eINSTANCE.getProductStoreEmailSetting_BodyScreenLocation();

		/**
		 * The meta object literal for the '<em><b>Cc Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_EMAIL_SETTING__CC_ADDRESS = eINSTANCE.getProductStoreEmailSetting_CcAddress();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_EMAIL_SETTING__CONTENT_TYPE = eINSTANCE.getProductStoreEmailSetting_ContentType();

		/**
		 * The meta object literal for the '<em><b>From Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_EMAIL_SETTING__FROM_ADDRESS = eINSTANCE.getProductStoreEmailSetting_FromAddress();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_EMAIL_SETTING__SUBJECT = eINSTANCE.getProductStoreEmailSetting_Subject();

		/**
		 * The meta object literal for the '<em><b>Xslfo Attach Screen Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_EMAIL_SETTING__XSLFO_ATTACH_SCREEN_LOCATION = eINSTANCE.getProductStoreEmailSetting_XslfoAttachScreenLocation();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFacilityImpl <em>Product Store Facility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreFacilityImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreFacility()
		 * @generated
		 */
		EClass PRODUCT_STORE_FACILITY = eINSTANCE.getProductStoreFacility();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_FACILITY__PRODUCT_STORE_ID = eINSTANCE.getProductStoreFacility_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_FACILITY__FACILITY_ID = eINSTANCE.getProductStoreFacility_FacilityId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FACILITY__FROM_DATE = eINSTANCE.getProductStoreFacility_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FACILITY__SEQUENCE_NUM = eINSTANCE.getProductStoreFacility_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FACILITY__THRU_DATE = eINSTANCE.getProductStoreFacility_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl <em>Product Store Fin Act Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreFinActSettingImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreFinActSetting()
		 * @generated
		 */
		EClass PRODUCT_STORE_FIN_ACT_SETTING = eINSTANCE.getProductStoreFinActSetting();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_FIN_ACT_SETTING__PRODUCT_STORE_ID = eINSTANCE.getProductStoreFinActSetting_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Fin Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_FIN_ACT_SETTING__FIN_ACCOUNT_TYPE_ID = eINSTANCE.getProductStoreFinActSetting_FinAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Account Code Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_CODE_LENGTH = eINSTANCE.getProductStoreFinActSetting_AccountCodeLength();

		/**
		 * The meta object literal for the '<em><b>Account Valid Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__ACCOUNT_VALID_DAYS = eINSTANCE.getProductStoreFinActSetting_AccountValidDays();

		/**
		 * The meta object literal for the '<em><b>Allow Auth To Negative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__ALLOW_AUTH_TO_NEGATIVE = eINSTANCE.getProductStoreFinActSetting_AllowAuthToNegative();

		/**
		 * The meta object literal for the '<em><b>Auth Valid Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__AUTH_VALID_DAYS = eINSTANCE.getProductStoreFinActSetting_AuthValidDays();

		/**
		 * The meta object literal for the '<em><b>Min Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__MIN_BALANCE = eINSTANCE.getProductStoreFinActSetting_MinBalance();

		/**
		 * The meta object literal for the '<em><b>Pin Code Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__PIN_CODE_LENGTH = eINSTANCE.getProductStoreFinActSetting_PinCodeLength();

		/**
		 * The meta object literal for the '<em><b>Purch Survey Copy Me</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_COPY_ME = eINSTANCE.getProductStoreFinActSetting_PurchSurveyCopyMe();

		/**
		 * The meta object literal for the '<em><b>Purch Survey Send To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__PURCH_SURVEY_SEND_TO = eINSTANCE.getProductStoreFinActSetting_PurchSurveySendTo();

		/**
		 * The meta object literal for the '<em><b>Purchase Survey Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_FIN_ACT_SETTING__PURCHASE_SURVEY_ID = eINSTANCE.getProductStoreFinActSetting_PurchaseSurveyId();

		/**
		 * The meta object literal for the '<em><b>Replenish Method Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_METHOD_ENUM_ID = eINSTANCE.getProductStoreFinActSetting_ReplenishMethodEnumId();

		/**
		 * The meta object literal for the '<em><b>Replenish Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__REPLENISH_THRESHOLD = eINSTANCE.getProductStoreFinActSetting_ReplenishThreshold();

		/**
		 * The meta object literal for the '<em><b>Require Pin Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__REQUIRE_PIN_CODE = eINSTANCE.getProductStoreFinActSetting_RequirePinCode();

		/**
		 * The meta object literal for the '<em><b>Validate GC Fin Acct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_FIN_ACT_SETTING__VALIDATE_GC_FIN_ACCT = eINSTANCE.getProductStoreFinActSetting_ValidateGCFinAcct();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl <em>Product Store Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroup()
		 * @generated
		 */
		EClass PRODUCT_STORE_GROUP = eINSTANCE.getProductStoreGroup();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID = eINSTANCE.getProductStoreGroup_ProductStoreGroupId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP__DESCRIPTION = eINSTANCE.getProductStoreGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Primary Parent Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID = eINSTANCE.getProductStoreGroup_PrimaryParentGroupId();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME = eINSTANCE.getProductStoreGroup_ProductStoreGroupName();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID = eINSTANCE.getProductStoreGroup_ProductStoreGroupTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupMemberImpl <em>Product Store Group Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupMemberImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupMember()
		 * @generated
		 */
		EClass PRODUCT_STORE_GROUP_MEMBER = eINSTANCE.getProductStoreGroupMember();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP_MEMBER__PRODUCT_STORE_ID = eINSTANCE.getProductStoreGroupMember_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP_MEMBER__PRODUCT_STORE_GROUP_ID = eINSTANCE.getProductStoreGroupMember_ProductStoreGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_MEMBER__FROM_DATE = eINSTANCE.getProductStoreGroupMember_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_MEMBER__SEQUENCE_NUM = eINSTANCE.getProductStoreGroupMember_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_MEMBER__THRU_DATE = eINSTANCE.getProductStoreGroupMember_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRoleImpl <em>Product Store Group Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRoleImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupRole()
		 * @generated
		 */
		EClass PRODUCT_STORE_GROUP_ROLE = eINSTANCE.getProductStoreGroupRole();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP_ROLE__PRODUCT_STORE_GROUP_ID = eINSTANCE.getProductStoreGroupRole_ProductStoreGroupId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP_ROLE__PARTY_ID = eINSTANCE.getProductStoreGroupRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP_ROLE__ROLE_TYPE_ID = eINSTANCE.getProductStoreGroupRole_RoleTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRollupImpl <em>Product Store Group Rollup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRollupImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupRollup()
		 * @generated
		 */
		EClass PRODUCT_STORE_GROUP_ROLLUP = eINSTANCE.getProductStoreGroupRollup();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP_ROLLUP__PRODUCT_STORE_GROUP_ID = eINSTANCE.getProductStoreGroupRollup_ProductStoreGroupId();

		/**
		 * The meta object literal for the '<em><b>Parent Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_GROUP_ROLLUP__PARENT_GROUP_ID = eINSTANCE.getProductStoreGroupRollup_ParentGroupId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_ROLLUP__FROM_DATE = eINSTANCE.getProductStoreGroupRollup_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_ROLLUP__SEQUENCE_NUM = eINSTANCE.getProductStoreGroupRollup_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_ROLLUP__THRU_DATE = eINSTANCE.getProductStoreGroupRollup_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupTypeImpl <em>Product Store Group Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreGroupTypeImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreGroupType()
		 * @generated
		 */
		EClass PRODUCT_STORE_GROUP_TYPE = eINSTANCE.getProductStoreGroupType();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_TYPE__PRODUCT_STORE_GROUP_TYPE_ID = eINSTANCE.getProductStoreGroupType_ProductStoreGroupTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_GROUP_TYPE__DESCRIPTION = eINSTANCE.getProductStoreGroupType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl <em>Product Store Keyword Ovrd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreKeywordOvrdImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreKeywordOvrd()
		 * @generated
		 */
		EClass PRODUCT_STORE_KEYWORD_OVRD = eINSTANCE.getProductStoreKeywordOvrd();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_KEYWORD_OVRD__PRODUCT_STORE_ID = eINSTANCE.getProductStoreKeywordOvrd_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_KEYWORD_OVRD__KEYWORD = eINSTANCE.getProductStoreKeywordOvrd_Keyword();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_KEYWORD_OVRD__FROM_DATE = eINSTANCE.getProductStoreKeywordOvrd_FromDate();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_KEYWORD_OVRD__TARGET = eINSTANCE.getProductStoreKeywordOvrd_Target();

		/**
		 * The meta object literal for the '<em><b>Target Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_KEYWORD_OVRD__TARGET_TYPE_ENUM_ID = eINSTANCE.getProductStoreKeywordOvrd_TargetTypeEnumId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_KEYWORD_OVRD__THRU_DATE = eINSTANCE.getProductStoreKeywordOvrd_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl <em>Product Store Payment Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStorePaymentSettingImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStorePaymentSetting()
		 * @generated
		 */
		EClass PRODUCT_STORE_PAYMENT_SETTING = eINSTANCE.getProductStorePaymentSetting();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_PAYMENT_SETTING__PRODUCT_STORE_ID = eINSTANCE.getProductStorePaymentSetting_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getProductStorePaymentSetting_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Payment Service Type Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE_TYPE_ENUM_ID = eINSTANCE.getProductStorePaymentSetting_PaymentServiceTypeEnumId();

		/**
		 * The meta object literal for the '<em><b>Apply To All Products</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_PAYMENT_SETTING__APPLY_TO_ALL_PRODUCTS = eINSTANCE.getProductStorePaymentSetting_ApplyToAllProducts();

		/**
		 * The meta object literal for the '<em><b>Payment Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_CUSTOM_METHOD_ID = eINSTANCE.getProductStorePaymentSetting_PaymentCustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Payment Gateway Config Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_GATEWAY_CONFIG_ID = eINSTANCE.getProductStorePaymentSetting_PaymentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Payment Properties Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_PROPERTIES_PATH = eINSTANCE.getProductStorePaymentSetting_PaymentPropertiesPath();

		/**
		 * The meta object literal for the '<em><b>Payment Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_PAYMENT_SETTING__PAYMENT_SERVICE = eINSTANCE.getProductStorePaymentSetting_PaymentService();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl <em>Product Store Promo Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStorePromoApplImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStorePromoAppl()
		 * @generated
		 */
		EClass PRODUCT_STORE_PROMO_APPL = eINSTANCE.getProductStorePromoAppl();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_PROMO_APPL__PRODUCT_STORE_ID = eINSTANCE.getProductStorePromoAppl_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Product Promo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_PROMO_APPL__PRODUCT_PROMO_ID = eINSTANCE.getProductStorePromoAppl_ProductPromoId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_PROMO_APPL__FROM_DATE = eINSTANCE.getProductStorePromoAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Manual Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_PROMO_APPL__MANUAL_ONLY = eINSTANCE.getProductStorePromoAppl_ManualOnly();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_PROMO_APPL__SEQUENCE_NUM = eINSTANCE.getProductStorePromoAppl_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_PROMO_APPL__THRU_DATE = eINSTANCE.getProductStorePromoAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreRoleImpl <em>Product Store Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreRoleImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreRole()
		 * @generated
		 */
		EClass PRODUCT_STORE_ROLE = eINSTANCE.getProductStoreRole();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_ROLE__PARTY_ID = eINSTANCE.getProductStoreRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_ROLE__ROLE_TYPE_ID = eINSTANCE.getProductStoreRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_ROLE__PRODUCT_STORE_ID = eINSTANCE.getProductStoreRole_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_ROLE__FROM_DATE = eINSTANCE.getProductStoreRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_ROLE__SEQUENCE_NUM = eINSTANCE.getProductStoreRole_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_ROLE__THRU_DATE = eINSTANCE.getProductStoreRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl <em>Product Store Shipment Meth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreShipmentMeth()
		 * @generated
		 */
		EClass PRODUCT_STORE_SHIPMENT_METH = eINSTANCE.getProductStoreShipmentMeth();

		/**
		 * The meta object literal for the '<em><b>Product Store Ship Meth Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID = eINSTANCE.getProductStoreShipmentMeth_ProductStoreShipMethId();

		/**
		 * The meta object literal for the '<em><b>Allow Company Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR = eINSTANCE.getProductStoreShipmentMeth_AllowCompanyAddr();

		/**
		 * The meta object literal for the '<em><b>Allow Usps Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR = eINSTANCE.getProductStoreShipmentMeth_AllowUspsAddr();

		/**
		 * The meta object literal for the '<em><b>Allowance Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT = eINSTANCE.getProductStoreShipmentMeth_AllowancePercent();

		/**
		 * The meta object literal for the '<em><b>Company Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID = eINSTANCE.getProductStoreShipmentMeth_CompanyPartyId();

		/**
		 * The meta object literal for the '<em><b>Config Props</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS = eINSTANCE.getProductStoreShipmentMeth_ConfigProps();

		/**
		 * The meta object literal for the '<em><b>Exclude Feature Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP = eINSTANCE.getProductStoreShipmentMeth_ExcludeFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Exclude Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID = eINSTANCE.getProductStoreShipmentMeth_ExcludeGeoId();

		/**
		 * The meta object literal for the '<em><b>Include Feature Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP = eINSTANCE.getProductStoreShipmentMeth_IncludeFeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Include Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID = eINSTANCE.getProductStoreShipmentMeth_IncludeGeoId();

		/**
		 * The meta object literal for the '<em><b>Include No Charge Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS = eINSTANCE.getProductStoreShipmentMeth_IncludeNoChargeItems();

		/**
		 * The meta object literal for the '<em><b>Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE = eINSTANCE.getProductStoreShipmentMeth_MaxSize();

		/**
		 * The meta object literal for the '<em><b>Max Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL = eINSTANCE.getProductStoreShipmentMeth_MaxTotal();

		/**
		 * The meta object literal for the '<em><b>Max Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT = eINSTANCE.getProductStoreShipmentMeth_MaxWeight();

		/**
		 * The meta object literal for the '<em><b>Min Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE = eINSTANCE.getProductStoreShipmentMeth_MinSize();

		/**
		 * The meta object literal for the '<em><b>Min Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL = eINSTANCE.getProductStoreShipmentMeth_MinTotal();

		/**
		 * The meta object literal for the '<em><b>Min Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT = eINSTANCE.getProductStoreShipmentMeth_MinWeight();

		/**
		 * The meta object literal for the '<em><b>Minimum Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE = eINSTANCE.getProductStoreShipmentMeth_MinimumPrice();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__PARTY_ID = eINSTANCE.getProductStoreShipmentMeth_PartyId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID = eINSTANCE.getProductStoreShipmentMeth_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Require Company Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR = eINSTANCE.getProductStoreShipmentMeth_RequireCompanyAddr();

		/**
		 * The meta object literal for the '<em><b>Require Usps Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR = eINSTANCE.getProductStoreShipmentMeth_RequireUspsAddr();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID = eINSTANCE.getProductStoreShipmentMeth_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER = eINSTANCE.getProductStoreShipmentMeth_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME = eINSTANCE.getProductStoreShipmentMeth_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Shipment Custom Method Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID = eINSTANCE.getProductStoreShipmentMeth_ShipmentCustomMethodId();

		/**
		 * The meta object literal for the '<em><b>Shipment Gateway Config Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID = eINSTANCE.getProductStoreShipmentMeth_ShipmentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getProductStoreShipmentMeth_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl <em>Product Store Survey Appl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreSurveyApplImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreSurveyAppl()
		 * @generated
		 */
		EClass PRODUCT_STORE_SURVEY_APPL = eINSTANCE.getProductStoreSurveyAppl();

		/**
		 * The meta object literal for the '<em><b>Product Store Survey Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_SURVEY_ID = eINSTANCE.getProductStoreSurveyAppl_ProductStoreSurveyId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SURVEY_APPL__FROM_DATE = eINSTANCE.getProductStoreSurveyAppl_FromDate();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SURVEY_APPL__GROUP_NAME = eINSTANCE.getProductStoreSurveyAppl_GroupName();

		/**
		 * The meta object literal for the '<em><b>Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SURVEY_APPL__PRODUCT_CATEGORY_ID = eINSTANCE.getProductStoreSurveyAppl_ProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SURVEY_APPL__PRODUCT_ID = eINSTANCE.getProductStoreSurveyAppl_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SURVEY_APPL__PRODUCT_STORE_ID = eINSTANCE.getProductStoreSurveyAppl_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Result Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SURVEY_APPL__RESULT_TEMPLATE = eINSTANCE.getProductStoreSurveyAppl_ResultTemplate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SURVEY_APPL__SEQUENCE_NUM = eINSTANCE.getProductStoreSurveyAppl_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Survey Appl Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SURVEY_APPL__SURVEY_APPL_TYPE_ID = eINSTANCE.getProductStoreSurveyAppl_SurveyApplTypeId();

		/**
		 * The meta object literal for the '<em><b>Survey Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_SURVEY_APPL__SURVEY_ID = eINSTANCE.getProductStoreSurveyAppl_SurveyId();

		/**
		 * The meta object literal for the '<em><b>Survey Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SURVEY_APPL__SURVEY_TEMPLATE = eINSTANCE.getProductStoreSurveyAppl_SurveyTemplate();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE_SURVEY_APPL__THRU_DATE = eINSTANCE.getProductStoreSurveyAppl_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl <em>Product Store Vendor Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreVendorPaymentImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreVendorPayment()
		 * @generated
		 */
		EClass PRODUCT_STORE_VENDOR_PAYMENT = eINSTANCE.getProductStoreVendorPayment();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_PAYMENT__PRODUCT_STORE_ID = eINSTANCE.getProductStoreVendorPayment_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Vendor Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_PAYMENT__VENDOR_PARTY_ID = eINSTANCE.getProductStoreVendorPayment_VendorPartyId();

		/**
		 * The meta object literal for the '<em><b>Payment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_PAYMENT__PAYMENT_METHOD_TYPE_ID = eINSTANCE.getProductStoreVendorPayment_PaymentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Credit Card Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_PAYMENT__CREDIT_CARD_ENUM_ID = eINSTANCE.getProductStoreVendorPayment_CreditCardEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl <em>Product Store Vendor Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.store.impl.ProductStoreVendorShipmentImpl
		 * @see org.abchip.mimo.biz.product.store.impl.StorePackageImpl#getProductStoreVendorShipment()
		 * @generated
		 */
		EClass PRODUCT_STORE_VENDOR_SHIPMENT = eINSTANCE.getProductStoreVendorShipment();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_SHIPMENT__PRODUCT_STORE_ID = eINSTANCE.getProductStoreVendorShipment_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Vendor Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_SHIPMENT__VENDOR_PARTY_ID = eINSTANCE.getProductStoreVendorShipment_VendorPartyId();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_SHIPMENT__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getProductStoreVendorShipment_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Carrier Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE_VENDOR_SHIPMENT__CARRIER_PARTY_ID = eINSTANCE.getProductStoreVendorShipment_CarrierPartyId();

	}

} //StorePackage
