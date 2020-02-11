/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

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
 * @see org.abchip.mimo.biz.product.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/product/product";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-product";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = org.abchip.mimo.biz.product.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationImpl <em>Good Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.GoodIdentificationImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getGoodIdentification()
	 * @generated
	 */
	int GOOD_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Good Identification Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION__ID_VALUE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Good Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl <em>Good Identification Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getGoodIdentificationType()
	 * @generated
	 */
	int GOOD_IDENTIFICATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Good Identification Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Good Identifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Good Identification Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOOD_IDENTIFICATION_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount Uom Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__AMOUNT_UOM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Create Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__AUTO_CREATE_KEYWORDS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bill Of Material Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BILL_OF_MATERIAL_LEVEL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Brand Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__BRAND_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Charge Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CHARGE_SHIPPING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COMMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Communication Event Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__COMMUNICATION_EVENT_PRODUCTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONFIG_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Default Shipment Box Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Depth Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DEPTH_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Detail Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DETAIL_IMAGE_URL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Detail Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DETAIL_SCREEN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Diameter Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DIAMETER_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Fixed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FIXED_AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Height Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__HEIGHT_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>In Shipping Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IN_SHIPPING_BOX = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Include In Promotions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INCLUDE_IN_PROMOTIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Internal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INTERNAL_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Introduction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INTRODUCTION_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Inventory Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INVENTORY_ITEM_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Inventory Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INVENTORY_MESSAGE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Is Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_VARIANT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__IS_VIRTUAL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Large Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LARGE_IMAGE_URL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LONG_DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Lot Id Filled In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LOT_ID_FILLED_IN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Medium Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MEDIUM_IMAGE_URL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Order Decimal Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ORDER_DECIMAL_QUANTITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Origin Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ORIGIN_GEO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Original Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ORIGINAL_IMAGE_URL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Pieces Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PIECES_INCLUDED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Price Detail Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE_DETAIL_TEXT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Primary Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Product Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Product Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_DEPTH = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Product Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_DIAMETER = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Product Facilities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_FACILITIES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Product Geos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_GEOS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Product Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_HEIGHT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Product Maints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_MAINTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Product Meters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_METERS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_NAME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Product Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_RATING = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Product Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Product Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_WEIGHT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Product Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_WIDTH = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Quantity Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUANTITY_INCLUDED = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Quantity Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__QUANTITY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Rating Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RATING_TYPE_ENUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RELEASE_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Require Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REQUIRE_AMOUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Require Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REQUIRE_INVENTORY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Requirement Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REQUIREMENT_METHOD_ENUM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Reserv2nd PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RESERV2ND_PP_PERC = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Reserv Max Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RESERV_MAX_PERSONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Reserv Nth PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RESERV_NTH_PP_PERC = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Returnable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__RETURNABLE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Sales Disc When Not Avail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SALES_DISC_WHEN_NOT_AVAIL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Sales Discontinuation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SALES_DISCONTINUATION_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Shipping Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SHIPPING_DEPTH = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Shipping Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SHIPPING_HEIGHT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Shipping Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SHIPPING_WEIGHT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Shipping Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SHIPPING_WIDTH = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Small Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SMALL_IMAGE_URL = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Support Discontinuation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SUPPORT_DISCONTINUATION_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Taxable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__TAXABLE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Virtual Variant Method Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__WEIGHT_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Width Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__WIDTH_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 75;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 76;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl <em>Assoc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductAssocImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductAssoc()
	 * @generated
	 */
	int PRODUCT_ASSOC = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Assoc Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__PRODUCT_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Estimate Calc Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__ESTIMATE_CALC_METHOD = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__INSTRUCTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__QUANTITY = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__REASON = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Recurrence Info Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__RECURRENCE_INFO_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Routing Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scrap Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__SCRAP_FACTOR = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Assoc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductAssocTypeImpl <em>Assoc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductAssocTypeImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductAssocType()
	 * @generated
	 */
	int PRODUCT_ASSOC_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Assoc Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__PRODUCT_ASSOC_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assoc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ASSOC_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductAttributeImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductAttribute()
	 * @generated
	 */
	int PRODUCT_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__ATTR_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl <em>Calculated Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductCalculatedInfo()
	 * @generated
	 */
	int PRODUCT_CALCULATED_INFO = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Average Customer Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Total Quantity Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Total Times Viewed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Calculated Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CALCULATED_INFO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductContentImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductContent()
	 * @generated
	 */
	int PRODUCT_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__PRODUCT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__CONTENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Content Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purchase From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__PURCHASE_FROM_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Purchase Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__PURCHASE_THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__THRU_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Use Count Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__USE_COUNT_LIMIT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Use Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__USE_ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Use Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__USE_TIME = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Use Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT__USE_TIME_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductContentTypeImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductContentType()
	 * @generated
	 */
	int PRODUCT_CONTENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Content Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__PRODUCT_CONTENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONTENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductGeoImpl <em>Geo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductGeoImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductGeo()
	 * @generated
	 */
	int PRODUCT_GEO = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__GEO_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Geo Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO__PRODUCT_GEO_ENUM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Geo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GEO_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductGlAccountImpl <em>Gl Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductGlAccountImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductGlAccount()
	 * @generated
	 */
	int PRODUCT_GL_ACCOUNT = 10;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__ORGANIZATION_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gl Account Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT__GL_ACCOUNT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Gl Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GL_ACCOUNT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl <em>Group Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductGroupOrder()
	 * @generated
	 */
	int PRODUCT_GROUP_ORDER = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Group Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__GROUP_ORDER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Job Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__JOB_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Req Order Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__REQ_ORDER_QTY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sold Order Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Group Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_GROUP_ORDER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductKeyword()
	 * @generated
	 */
	int PRODUCT_KEYWORD = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keyword Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__KEYWORD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__KEYWORD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relevancy Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__RELEVANCY_WEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_KEYWORD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl <em>Maint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductMaintImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMaint()
	 * @generated
	 */
	int PRODUCT_MAINT = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Maint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval Meter Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__INTERVAL_METER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__INTERVAL_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interval Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__INTERVAL_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__MAINT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Maint Template Work Effort Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Maint Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT__REPEAT_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Maint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMaintTypeImpl <em>Maint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductMaintTypeImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMaintType()
	 * @generated
	 */
	int PRODUCT_MAINT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Maint Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE__PRODUCT_MAINT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Maint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_MAINT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl <em>Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductMeterImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMeter()
	 * @generated
	 */
	int PRODUCT_METER = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Meter Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__PRODUCT_METER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__METER_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Meter Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER__METER_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMeterTypeImpl <em>Meter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductMeterTypeImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMeterType()
	 * @generated
	 */
	int PRODUCT_METER_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Meter Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE__DEFAULT_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Meter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_METER_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductReviewImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductReview()
	 * @generated
	 */
	int PRODUCT_REVIEW = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__PRODUCT_REVIEW_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Posted Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__POSTED_ANONYMOUS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Posted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__POSTED_DATE_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__PRODUCT_RATING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__PRODUCT_REVIEW = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW__USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_REVIEW_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductRoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductRoleImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductRole()
	 * @generated
	 */
	int PRODUCT_ROLE = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__COMMENTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_ROLE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl <em>Search Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductSearchConstraint()
	 * @generated
	 */
	int PRODUCT_SEARCH_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Search Result Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__PRODUCT_SEARCH_RESULT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Any Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__ANY_PREFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Any Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__ANY_SUFFIX = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraint Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>High Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__HIGH_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Include Sub Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Info String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__INFO_STRING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is And</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__IS_AND = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Low Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__LOW_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Remove Stems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT__REMOVE_STEMS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Search Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_CONSTRAINT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl <em>Search Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductSearchResult()
	 * @generated
	 */
	int PRODUCT_SEARCH_RESULT = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Search Result Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_RESULT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__IS_ASCENDING = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Num Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__NUM_RESULTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order By Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__ORDER_BY_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Product Search Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_CONSTRAINTS = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Search Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__SEARCH_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Seconds Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__SECONDS_TOTAL = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT__VISIT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Search Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SEARCH_RESULT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductTypeImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductType()
	 * @generated
	 */
	int PRODUCT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Digital</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__IS_DIGITAL = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__IS_PHYSICAL = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Product Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE__PRODUCT_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.ProductTypeAttrImpl <em>Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.ProductTypeAttrImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductTypeAttr()
	 * @generated
	 */
	int PRODUCT_TYPE_ATTR = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR__PRODUCT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.product.product.impl.VendorProductImpl <em>Vendor Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.product.product.impl.VendorProductImpl
	 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getVendorProduct()
	 * @generated
	 */
	int VENDOR_PRODUCT = 23;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vendor Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT__VENDOR_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT__PRODUCT_STORE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vendor Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_PRODUCT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.GoodIdentification <em>Good Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Good Identification</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentification
	 * @generated
	 */
	EClass getGoodIdentification();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.GoodIdentification#getGoodIdentificationTypeId <em>Good Identification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Good Identification Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentification#getGoodIdentificationTypeId()
	 * @see #getGoodIdentification()
	 * @generated
	 */
	EReference getGoodIdentification_GoodIdentificationTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.GoodIdentification#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentification#getProductId()
	 * @see #getGoodIdentification()
	 * @generated
	 */
	EReference getGoodIdentification_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.GoodIdentification#getIdValue <em>Id Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Value</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentification#getIdValue()
	 * @see #getGoodIdentification()
	 * @generated
	 */
	EAttribute getGoodIdentification_IdValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.GoodIdentificationType <em>Good Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Good Identification Type</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentificationType
	 * @generated
	 */
	EClass getGoodIdentificationType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.GoodIdentificationType#getGoodIdentificationTypeId <em>Good Identification Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Good Identification Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentificationType#getGoodIdentificationTypeId()
	 * @see #getGoodIdentificationType()
	 * @generated
	 */
	EAttribute getGoodIdentificationType_GoodIdentificationTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.GoodIdentificationType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentificationType#getDescription()
	 * @see #getGoodIdentificationType()
	 * @generated
	 */
	EAttribute getGoodIdentificationType_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.GoodIdentificationType#getGoodIdentifications <em>Good Identifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Good Identifications</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentificationType#getGoodIdentifications()
	 * @see #getGoodIdentificationType()
	 * @generated
	 */
	EReference getGoodIdentificationType_GoodIdentifications();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.GoodIdentificationType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentificationType#isHasTable()
	 * @see #getGoodIdentificationType()
	 * @generated
	 */
	EAttribute getGoodIdentificationType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.GoodIdentificationType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.GoodIdentificationType#getParentTypeId()
	 * @see #getGoodIdentificationType()
	 * @generated
	 */
	EReference getGoodIdentificationType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getAmountUomTypeId <em>Amount Uom Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Amount Uom Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getAmountUomTypeId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_AmountUomTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isAutoCreateKeywords <em>Auto Create Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Create Keywords</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isAutoCreateKeywords()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_AutoCreateKeywords();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getBillOfMaterialLevel <em>Bill Of Material Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Of Material Level</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getBillOfMaterialLevel()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_BillOfMaterialLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getBrandName <em>Brand Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Brand Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getBrandName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_BrandName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isChargeShipping <em>Charge Shipping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Shipping</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isChargeShipping()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ChargeShipping();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getComments()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Comments();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.Product#getCommunicationEventProducts <em>Communication Event Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Event Products</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getCommunicationEventProducts()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_CommunicationEventProducts();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getConfigId <em>Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getConfigId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ConfigId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getCreatedByUserLogin()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getCreatedDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getDefaultShipmentBoxTypeId <em>Default Shipment Box Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Shipment Box Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getDefaultShipmentBoxTypeId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_DefaultShipmentBoxTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getDepthUomId <em>Depth Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depth Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getDepthUomId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_DepthUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getDetailImageUrl <em>Detail Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Image Url</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getDetailImageUrl()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_DetailImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getDetailScreen <em>Detail Screen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail Screen</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getDetailScreen()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_DetailScreen();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getDiameterUomId <em>Diameter Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diameter Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getDiameterUomId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_DiameterUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facility Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getFacilityId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_FacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getFixedAmount <em>Fixed Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Amount</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getFixedAmount()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_FixedAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getHeightUomId <em>Height Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Height Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getHeightUomId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_HeightUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isInShippingBox <em>In Shipping Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Shipping Box</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isInShippingBox()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_InShippingBox();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isIncludeInPromotions <em>Include In Promotions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Promotions</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isIncludeInPromotions()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_IncludeInPromotions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getInternalName <em>Internal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getInternalName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_InternalName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getIntroductionDate <em>Introduction Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Introduction Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getIntroductionDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_IntroductionDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getInventoryItemTypeId <em>Inventory Item Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventory Item Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getInventoryItemTypeId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_InventoryItemTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getInventoryMessage <em>Inventory Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inventory Message</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getInventoryMessage()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_InventoryMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isIsVariant <em>Is Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Variant</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isIsVariant()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_IsVariant();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isIsVirtual()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_IsVirtual();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getLargeImageUrl <em>Large Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Image Url</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getLargeImageUrl()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_LargeImageUrl();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getLastModifiedByUserLogin()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getLastModifiedDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getLongDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getLotIdFilledIn <em>Lot Id Filled In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lot Id Filled In</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getLotIdFilledIn()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_LotIdFilledIn();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getMediumImageUrl <em>Medium Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Image Url</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getMediumImageUrl()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_MediumImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Decimal Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isOrderDecimalQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_OrderDecimalQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getOriginGeoId <em>Origin Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getOriginGeoId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_OriginGeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getOriginalImageUrl <em>Original Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Image Url</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getOriginalImageUrl()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_OriginalImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getPiecesIncluded <em>Pieces Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pieces Included</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getPiecesIncluded()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_PiecesIncluded();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getPriceDetailText <em>Price Detail Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Detail Text</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getPriceDetailText()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_PriceDetailText();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getPrimaryProductCategoryId <em>Primary Product Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Product Category Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getPrimaryProductCategoryId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_PrimaryProductCategoryId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.Product#getProductAttributes <em>Product Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Attributes</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductAttributes()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductDepth <em>Product Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Depth</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductDepth()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductDepth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductDiameter <em>Product Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Diameter</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductDiameter()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductDiameter();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.Product#getProductFacilities <em>Product Facilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Facilities</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductFacilities()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductFacilities();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.Product#getProductGeos <em>Product Geos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Geos</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductGeos()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductGeos();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductHeight <em>Product Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Height</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductHeight()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductHeight();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.Product#getProductMaints <em>Product Maints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Maints</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductMaints()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductMaints();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.Product#getProductMeters <em>Product Meters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Meters</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductMeters()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductMeters();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductRating <em>Product Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Rating</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductRating()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductRating();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getProductTypeId <em>Product Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductTypeId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductWeight <em>Product Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Weight</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductWeight()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getProductWidth <em>Product Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Width</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getProductWidth()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getQuantityIncluded <em>Quantity Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Included</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getQuantityIncluded()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_QuantityIncluded();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getQuantityUomId <em>Quantity Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getQuantityUomId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_QuantityUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getRatingTypeEnum <em>Rating Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rating Type Enum</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getRatingTypeEnum()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_RatingTypeEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getReleaseDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isRequireAmount <em>Require Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Amount</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isRequireAmount()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_RequireAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isRequireInventory <em>Require Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Inventory</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isRequireInventory()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_RequireInventory();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Method Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getRequirementMethodEnumId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_RequirementMethodEnumId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv2nd PP Perc</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getReserv2ndPPPerc()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Reserv2ndPPPerc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getReservMaxPersons <em>Reserv Max Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Max Persons</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getReservMaxPersons()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ReservMaxPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserv Nth PP Perc</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getReservNthPPPerc()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ReservNthPPPerc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isReturnable <em>Returnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returnable</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isReturnable()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Returnable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isSalesDiscWhenNotAvail <em>Sales Disc When Not Avail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Disc When Not Avail</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isSalesDiscWhenNotAvail()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_SalesDiscWhenNotAvail();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getSalesDiscontinuationDate <em>Sales Discontinuation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sales Discontinuation Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getSalesDiscontinuationDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_SalesDiscontinuationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getShippingDepth <em>Shipping Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Depth</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getShippingDepth()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ShippingDepth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getShippingHeight <em>Shipping Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Height</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getShippingHeight()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ShippingHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getShippingWeight <em>Shipping Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Weight</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getShippingWeight()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ShippingWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getShippingWidth <em>Shipping Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Width</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getShippingWidth()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ShippingWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getSmallImageUrl <em>Small Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Image Url</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getSmallImageUrl()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_SmallImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#getSupportDiscontinuationDate <em>Support Discontinuation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Support Discontinuation Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getSupportDiscontinuationDate()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_SupportDiscontinuationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.Product#isTaxable <em>Taxable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxable</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#isTaxable()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Taxable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getVirtualVariantMethodEnum <em>Virtual Variant Method Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Virtual Variant Method Enum</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getVirtualVariantMethodEnum()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_VirtualVariantMethodEnum();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getWeightUomId <em>Weight Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weight Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getWeightUomId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_WeightUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.Product#getWidthUomId <em>Width Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Width Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.Product#getWidthUomId()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_WidthUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductAssoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc
	 * @generated
	 */
	EClass getProductAssoc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getProductId()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EReference getProductAssoc_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductIdTo <em>Product Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id To</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getProductIdTo()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EReference getProductAssoc_ProductIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getProductAssocTypeId <em>Product Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getProductAssocTypeId()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EReference getProductAssoc_ProductAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getFromDate()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EAttribute getProductAssoc_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getEstimateCalcMethod <em>Estimate Calc Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Estimate Calc Method</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getEstimateCalcMethod()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EReference getProductAssoc_EstimateCalcMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getInstruction()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EAttribute getProductAssoc_Instruction();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getQuantity()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EAttribute getProductAssoc_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getReason()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EAttribute getProductAssoc_Reason();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getRecurrenceInfoId <em>Recurrence Info Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence Info Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getRecurrenceInfoId()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EReference getProductAssoc_RecurrenceInfoId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getRoutingWorkEffortId <em>Routing Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Routing Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getRoutingWorkEffortId()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EReference getProductAssoc_RoutingWorkEffortId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getScrapFactor <em>Scrap Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrap Factor</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getScrapFactor()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EAttribute getProductAssoc_ScrapFactor();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getSequenceNum()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EAttribute getProductAssoc_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssoc#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssoc#getThruDate()
	 * @see #getProductAssoc()
	 * @generated
	 */
	EAttribute getProductAssoc_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductAssocType <em>Assoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assoc Type</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssocType
	 * @generated
	 */
	EClass getProductAssocType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssocType#getProductAssocTypeId <em>Product Assoc Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Assoc Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssocType#getProductAssocTypeId()
	 * @see #getProductAssocType()
	 * @generated
	 */
	EAttribute getProductAssocType_ProductAssocTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssocType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssocType#getDescription()
	 * @see #getProductAssocType()
	 * @generated
	 */
	EAttribute getProductAssocType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAssocType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssocType#isHasTable()
	 * @see #getProductAssocType()
	 * @generated
	 */
	EAttribute getProductAssocType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAssocType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAssocType#getParentTypeId()
	 * @see #getProductAssocType()
	 * @generated
	 */
	EReference getProductAssocType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAttribute
	 * @generated
	 */
	EClass getProductAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductAttribute#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAttribute#getProductId()
	 * @see #getProductAttribute()
	 * @generated
	 */
	EReference getProductAttribute_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAttribute#getAttrName()
	 * @see #getProductAttribute()
	 * @generated
	 */
	EAttribute getProductAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAttribute#getAttrDescription()
	 * @see #getProductAttribute()
	 * @generated
	 */
	EAttribute getProductAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAttribute#getAttrType <em>Attr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Type</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAttribute#getAttrType()
	 * @see #getProductAttribute()
	 * @generated
	 */
	EAttribute getProductAttribute_AttrType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductAttribute#getAttrValue()
	 * @see #getProductAttribute()
	 * @generated
	 */
	EAttribute getProductAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo <em>Calculated Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Info</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductCalculatedInfo
	 * @generated
	 */
	EClass getProductCalculatedInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getProductId()
	 * @see #getProductCalculatedInfo()
	 * @generated
	 */
	EAttribute getProductCalculatedInfo_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getAverageCustomerRating <em>Average Customer Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average Customer Rating</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getAverageCustomerRating()
	 * @see #getProductCalculatedInfo()
	 * @generated
	 */
	EAttribute getProductCalculatedInfo_AverageCustomerRating();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalQuantityOrdered <em>Total Quantity Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Quantity Ordered</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalQuantityOrdered()
	 * @see #getProductCalculatedInfo()
	 * @generated
	 */
	EAttribute getProductCalculatedInfo_TotalQuantityOrdered();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalTimesViewed <em>Total Times Viewed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Times Viewed</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalTimesViewed()
	 * @see #getProductCalculatedInfo()
	 * @generated
	 */
	EAttribute getProductCalculatedInfo_TotalTimesViewed();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent
	 * @generated
	 */
	EClass getProductContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductContent#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getProductId()
	 * @see #getProductContent()
	 * @generated
	 */
	EReference getProductContent_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductContent#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getContentId()
	 * @see #getProductContent()
	 * @generated
	 */
	EReference getProductContent_ContentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductContent#getProductContentTypeId <em>Product Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getProductContentTypeId()
	 * @see #getProductContent()
	 * @generated
	 */
	EReference getProductContent_ProductContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContent#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getFromDate()
	 * @see #getProductContent()
	 * @generated
	 */
	EAttribute getProductContent_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContent#getPurchaseFromDate <em>Purchase From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase From Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getPurchaseFromDate()
	 * @see #getProductContent()
	 * @generated
	 */
	EAttribute getProductContent_PurchaseFromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContent#getPurchaseThruDate <em>Purchase Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchase Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getPurchaseThruDate()
	 * @see #getProductContent()
	 * @generated
	 */
	EAttribute getProductContent_PurchaseThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContent#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getSequenceNum()
	 * @see #getProductContent()
	 * @generated
	 */
	EAttribute getProductContent_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContent#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getThruDate()
	 * @see #getProductContent()
	 * @generated
	 */
	EAttribute getProductContent_ThruDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseCountLimit <em>Use Count Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Count Limit</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getUseCountLimit()
	 * @see #getProductContent()
	 * @generated
	 */
	EAttribute getProductContent_UseCountLimit();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseRoleTypeId <em>Use Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getUseRoleTypeId()
	 * @see #getProductContent()
	 * @generated
	 */
	EReference getProductContent_UseRoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseTime <em>Use Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Time</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getUseTime()
	 * @see #getProductContent()
	 * @generated
	 */
	EAttribute getProductContent_UseTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductContent#getUseTimeUomId <em>Use Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContent#getUseTimeUomId()
	 * @see #getProductContent()
	 * @generated
	 */
	EReference getProductContent_UseTimeUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContentType
	 * @generated
	 */
	EClass getProductContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContentType#getProductContentTypeId <em>Product Content Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Content Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContentType#getProductContentTypeId()
	 * @see #getProductContentType()
	 * @generated
	 */
	EAttribute getProductContentType_ProductContentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContentType#getDescription()
	 * @see #getProductContentType()
	 * @generated
	 */
	EAttribute getProductContentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductContentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContentType#isHasTable()
	 * @see #getProductContentType()
	 * @generated
	 */
	EAttribute getProductContentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductContentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductContentType#getParentTypeId()
	 * @see #getProductContentType()
	 * @generated
	 */
	EReference getProductContentType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductGeo <em>Geo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geo</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGeo
	 * @generated
	 */
	EClass getProductGeo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGeo#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGeo#getProductId()
	 * @see #getProductGeo()
	 * @generated
	 */
	EReference getProductGeo_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGeo#getGeoId <em>Geo Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGeo#getGeoId()
	 * @see #getProductGeo()
	 * @generated
	 */
	EReference getProductGeo_GeoId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductGeo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGeo#getDescription()
	 * @see #getProductGeo()
	 * @generated
	 */
	EAttribute getProductGeo_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGeo#getProductGeoEnumId <em>Product Geo Enum Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Geo Enum Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGeo#getProductGeoEnumId()
	 * @see #getProductGeo()
	 * @generated
	 */
	EReference getProductGeo_ProductGeoEnumId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductGlAccount <em>Gl Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gl Account</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGlAccount
	 * @generated
	 */
	EClass getProductGlAccount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGlAccount#getProductId()
	 * @see #getProductGlAccount()
	 * @generated
	 */
	EReference getProductGlAccount_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGlAccount#getOrganizationPartyId()
	 * @see #getProductGlAccount()
	 * @generated
	 */
	EReference getProductGlAccount_OrganizationPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountTypeId <em>Gl Account Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountTypeId()
	 * @see #getProductGlAccount()
	 * @generated
	 */
	EReference getProductGlAccount_GlAccountTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountId <em>Gl Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gl Account Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGlAccount#getGlAccountId()
	 * @see #getProductGlAccount()
	 * @generated
	 */
	EReference getProductGlAccount_GlAccountId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder <em>Group Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Order</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder
	 * @generated
	 */
	EClass getProductGroupOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getGroupOrderId <em>Group Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Order Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getGroupOrderId()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EAttribute getProductGroupOrder_GroupOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getFromDate()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EAttribute getProductGroupOrder_FromDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getJobId <em>Job Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getJobId()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EReference getProductGroupOrder_JobId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getProductId()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EReference getProductGroupOrder_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getReqOrderQty <em>Req Order Qty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Order Qty</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getReqOrderQty()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EAttribute getProductGroupOrder_ReqOrderQty();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getSoldOrderQty <em>Sold Order Qty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sold Order Qty</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getSoldOrderQty()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EAttribute getProductGroupOrder_SoldOrderQty();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getStatusId()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EReference getProductGroupOrder_StatusId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductGroupOrder#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductGroupOrder#getThruDate()
	 * @see #getProductGroupOrder()
	 * @generated
	 */
	EAttribute getProductGroupOrder_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductKeyword
	 * @generated
	 */
	EClass getProductKeyword();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductKeyword#getProductId()
	 * @see #getProductKeyword()
	 * @generated
	 */
	EReference getProductKeyword_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductKeyword#getKeyword()
	 * @see #getProductKeyword()
	 * @generated
	 */
	EAttribute getProductKeyword_Keyword();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getKeywordTypeId <em>Keyword Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keyword Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductKeyword#getKeywordTypeId()
	 * @see #getProductKeyword()
	 * @generated
	 */
	EReference getProductKeyword_KeywordTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getRelevancyWeight <em>Relevancy Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relevancy Weight</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductKeyword#getRelevancyWeight()
	 * @see #getProductKeyword()
	 * @generated
	 */
	EAttribute getProductKeyword_RelevancyWeight();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductKeyword#getStatusId()
	 * @see #getProductKeyword()
	 * @generated
	 */
	EReference getProductKeyword_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductMaint <em>Maint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maint</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint
	 * @generated
	 */
	EClass getProductMaint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getProductId()
	 * @see #getProductMaint()
	 * @generated
	 */
	EReference getProductMaint_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintSeqId <em>Product Maint Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Maint Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintSeqId()
	 * @see #getProductMaint()
	 * @generated
	 */
	EAttribute getProductMaint_ProductMaintSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalMeterTypeId <em>Interval Meter Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Meter Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getIntervalMeterTypeId()
	 * @see #getProductMaint()
	 * @generated
	 */
	EReference getProductMaint_IntervalMeterTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalQuantity <em>Interval Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval Quantity</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getIntervalQuantity()
	 * @see #getProductMaint()
	 * @generated
	 */
	EAttribute getProductMaint_IntervalQuantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMaint#getIntervalUomId <em>Interval Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interval Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getIntervalUomId()
	 * @see #getProductMaint()
	 * @generated
	 */
	EReference getProductMaint_IntervalUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMaint#getMaintName <em>Maint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maint Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getMaintName()
	 * @see #getProductMaint()
	 * @generated
	 */
	EAttribute getProductMaint_MaintName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMaint#getMaintTemplateWorkEffortId <em>Maint Template Work Effort Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Maint Template Work Effort Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getMaintTemplateWorkEffortId()
	 * @see #getProductMaint()
	 * @generated
	 */
	EReference getProductMaint_MaintTemplateWorkEffortId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintTypeId <em>Product Maint Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Maint Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getProductMaintTypeId()
	 * @see #getProductMaint()
	 * @generated
	 */
	EReference getProductMaint_ProductMaintTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMaint#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaint#getRepeatCount()
	 * @see #getProductMaint()
	 * @generated
	 */
	EAttribute getProductMaint_RepeatCount();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductMaintType <em>Maint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maint Type</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaintType
	 * @generated
	 */
	EClass getProductMaintType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMaintType#getProductMaintTypeId <em>Product Maint Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Maint Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaintType#getProductMaintTypeId()
	 * @see #getProductMaintType()
	 * @generated
	 */
	EAttribute getProductMaintType_ProductMaintTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMaintType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaintType#getDescription()
	 * @see #getProductMaintType()
	 * @generated
	 */
	EAttribute getProductMaintType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMaintType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMaintType#getParentTypeId()
	 * @see #getProductMaintType()
	 * @generated
	 */
	EReference getProductMaintType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductMeter <em>Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeter
	 * @generated
	 */
	EClass getProductMeter();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeter#getProductId()
	 * @see #getProductMeter()
	 * @generated
	 */
	EReference getProductMeter_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductMeterTypeId <em>Product Meter Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Meter Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeter#getProductMeterTypeId()
	 * @see #getProductMeter()
	 * @generated
	 */
	EReference getProductMeter_ProductMeterTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMeter#getMeterName <em>Meter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meter Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeter#getMeterName()
	 * @see #getProductMeter()
	 * @generated
	 */
	EAttribute getProductMeter_MeterName();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMeter#getMeterUomId <em>Meter Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meter Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeter#getMeterUomId()
	 * @see #getProductMeter()
	 * @generated
	 */
	EReference getProductMeter_MeterUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductMeterType <em>Meter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meter Type</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeterType
	 * @generated
	 */
	EClass getProductMeterType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMeterType#getProductMeterTypeId <em>Product Meter Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Meter Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeterType#getProductMeterTypeId()
	 * @see #getProductMeterType()
	 * @generated
	 */
	EAttribute getProductMeterType_ProductMeterTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductMeterType#getDefaultUomId <em>Default Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Uom Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeterType#getDefaultUomId()
	 * @see #getProductMeterType()
	 * @generated
	 */
	EReference getProductMeterType_DefaultUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductMeterType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductMeterType#getDescription()
	 * @see #getProductMeterType()
	 * @generated
	 */
	EAttribute getProductMeterType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductReview <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview
	 * @generated
	 */
	EClass getProductReview();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductReviewId <em>Product Review Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Review Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getProductReviewId()
	 * @see #getProductReview()
	 * @generated
	 */
	EAttribute getProductReview_ProductReviewId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductReview#isPostedAnonymous <em>Posted Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Anonymous</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#isPostedAnonymous()
	 * @see #getProductReview()
	 * @generated
	 */
	EAttribute getProductReview_PostedAnonymous();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductReview#getPostedDateTime <em>Posted Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posted Date Time</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getPostedDateTime()
	 * @see #getProductReview()
	 * @generated
	 */
	EAttribute getProductReview_PostedDateTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getProductId()
	 * @see #getProductReview()
	 * @generated
	 */
	EReference getProductReview_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductRating <em>Product Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Rating</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getProductRating()
	 * @see #getProductReview()
	 * @generated
	 */
	EAttribute getProductReview_ProductRating();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductReview <em>Product Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Review</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getProductReview()
	 * @see #getProductReview()
	 * @generated
	 */
	EAttribute getProductReview_ProductReview();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getProductStoreId()
	 * @see #getProductReview()
	 * @generated
	 */
	EReference getProductReview_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductReview#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getStatusId()
	 * @see #getProductReview()
	 * @generated
	 */
	EReference getProductReview_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductReview#getUserLoginId <em>User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Login Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductReview#getUserLoginId()
	 * @see #getProductReview()
	 * @generated
	 */
	EReference getProductReview_UserLoginId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole
	 * @generated
	 */
	EClass getProductRole();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductRole#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole#getProductId()
	 * @see #getProductRole()
	 * @generated
	 */
	EReference getProductRole_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductRole#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole#getPartyId()
	 * @see #getProductRole()
	 * @generated
	 */
	EReference getProductRole_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductRole#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole#getRoleTypeId()
	 * @see #getProductRole()
	 * @generated
	 */
	EReference getProductRole_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductRole#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole#getFromDate()
	 * @see #getProductRole()
	 * @generated
	 */
	EAttribute getProductRole_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductRole#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole#getComments()
	 * @see #getProductRole()
	 * @generated
	 */
	EAttribute getProductRole_Comments();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductRole#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole#getSequenceNum()
	 * @see #getProductRole()
	 * @generated
	 */
	EAttribute getProductRole_SequenceNum();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductRole#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductRole#getThruDate()
	 * @see #getProductRole()
	 * @generated
	 */
	EAttribute getProductRole_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint <em>Search Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Constraint</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint
	 * @generated
	 */
	EClass getProductSearchConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getProductSearchResultId <em>Product Search Result Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Search Result Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getProductSearchResultId()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EReference getProductSearchConstraint_ProductSearchResultId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getConstraintSeqId <em>Constraint Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Seq Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getConstraintSeqId()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_ConstraintSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getAnyPrefix <em>Any Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Prefix</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getAnyPrefix()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_AnyPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getAnySuffix <em>Any Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Any Suffix</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getAnySuffix()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_AnySuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getConstraintName <em>Constraint Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getConstraintName()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_ConstraintName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getHighValue <em>High Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High Value</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getHighValue()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_HighValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#isIncludeSubCategories <em>Include Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Sub Categories</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#isIncludeSubCategories()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_IncludeSubCategories();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getInfoString <em>Info String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Info String</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getInfoString()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_InfoString();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#isIsAnd <em>Is And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is And</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#isIsAnd()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_IsAnd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#getLowValue <em>Low Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Value</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#getLowValue()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_LowValue();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchConstraint#isRemoveStems <em>Remove Stems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Stems</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchConstraint#isRemoveStems()
	 * @see #getProductSearchConstraint()
	 * @generated
	 */
	EAttribute getProductSearchConstraint_RemoveStems();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductSearchResult <em>Search Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Result</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult
	 * @generated
	 */
	EClass getProductSearchResult();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#getProductSearchResultId <em>Product Search Result Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Search Result Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#getProductSearchResultId()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EAttribute getProductSearchResult_ProductSearchResultId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#isIsAscending <em>Is Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ascending</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#isIsAscending()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EAttribute getProductSearchResult_IsAscending();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#getNumResults <em>Num Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Results</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#getNumResults()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EAttribute getProductSearchResult_NumResults();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#getOrderByName <em>Order By Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order By Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#getOrderByName()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EAttribute getProductSearchResult_OrderByName();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#getProductSearchConstraints <em>Product Search Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Search Constraints</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#getProductSearchConstraints()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EReference getProductSearchResult_ProductSearchConstraints();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#getSearchDate <em>Search Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Date</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#getSearchDate()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EAttribute getProductSearchResult_SearchDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#getSecondsTotal <em>Seconds Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds Total</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#getSecondsTotal()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EAttribute getProductSearchResult_SecondsTotal();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductSearchResult#getVisitId <em>Visit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visit Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductSearchResult#getVisitId()
	 * @see #getProductSearchResult()
	 * @generated
	 */
	EAttribute getProductSearchResult_VisitId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType
	 * @generated
	 */
	EClass getProductType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductType#getProductTypeId <em>Product Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType#getProductTypeId()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_ProductTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType#getDescription()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType#isHasTable()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_HasTable();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductType#isIsDigital <em>Is Digital</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Digital</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType#isIsDigital()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_IsDigital();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductType#isIsPhysical <em>Is Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Physical</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType#isIsPhysical()
	 * @see #getProductType()
	 * @generated
	 */
	EAttribute getProductType_IsPhysical();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType#getParentTypeId()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.product.product.ProductType#getProductTypeAttrs <em>Product Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductType#getProductTypeAttrs()
	 * @see #getProductType()
	 * @generated
	 */
	EReference getProductType_ProductTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.ProductTypeAttr <em>Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attr</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductTypeAttr
	 * @generated
	 */
	EClass getProductTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.ProductTypeAttr#getProductTypeId <em>Product Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Type Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductTypeAttr#getProductTypeId()
	 * @see #getProductTypeAttr()
	 * @generated
	 */
	EReference getProductTypeAttr_ProductTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductTypeAttr#getAttrName()
	 * @see #getProductTypeAttr()
	 * @generated
	 */
	EAttribute getProductTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.product.product.ProductTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.product.product.ProductTypeAttr#getDescription()
	 * @see #getProductTypeAttr()
	 * @generated
	 */
	EAttribute getProductTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.product.product.VendorProduct <em>Vendor Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Product</em>'.
	 * @see org.abchip.mimo.biz.product.product.VendorProduct
	 * @generated
	 */
	EClass getVendorProduct();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.VendorProduct#getProductId()
	 * @see #getVendorProduct()
	 * @generated
	 */
	EReference getVendorProduct_ProductId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.VendorProduct#getVendorPartyId <em>Vendor Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vendor Party Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.VendorProduct#getVendorPartyId()
	 * @see #getVendorProduct()
	 * @generated
	 */
	EReference getVendorProduct_VendorPartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductStoreGroupId <em>Product Store Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Group Id</em>'.
	 * @see org.abchip.mimo.biz.product.product.VendorProduct#getProductStoreGroupId()
	 * @see #getVendorProduct()
	 * @generated
	 */
	EReference getVendorProduct_ProductStoreGroupId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductFactory getProductFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationImpl <em>Good Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.GoodIdentificationImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getGoodIdentification()
		 * @generated
		 */
		EClass GOOD_IDENTIFICATION = eINSTANCE.getGoodIdentification();

		/**
		 * The meta object literal for the '<em><b>Good Identification Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOD_IDENTIFICATION__GOOD_IDENTIFICATION_TYPE_ID = eINSTANCE.getGoodIdentification_GoodIdentificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOD_IDENTIFICATION__PRODUCT_ID = eINSTANCE.getGoodIdentification_ProductId();

		/**
		 * The meta object literal for the '<em><b>Id Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOD_IDENTIFICATION__ID_VALUE = eINSTANCE.getGoodIdentification_IdValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl <em>Good Identification Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.GoodIdentificationTypeImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getGoodIdentificationType()
		 * @generated
		 */
		EClass GOOD_IDENTIFICATION_TYPE = eINSTANCE.getGoodIdentificationType();

		/**
		 * The meta object literal for the '<em><b>Good Identification Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATION_TYPE_ID = eINSTANCE.getGoodIdentificationType_GoodIdentificationTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOD_IDENTIFICATION_TYPE__DESCRIPTION = eINSTANCE.getGoodIdentificationType_Description();

		/**
		 * The meta object literal for the '<em><b>Good Identifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOD_IDENTIFICATION_TYPE__GOOD_IDENTIFICATIONS = eINSTANCE.getGoodIdentificationType_GoodIdentifications();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOOD_IDENTIFICATION_TYPE__HAS_TABLE = eINSTANCE.getGoodIdentificationType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOOD_IDENTIFICATION_TYPE__PARENT_TYPE_ID = eINSTANCE.getGoodIdentificationType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_ID = eINSTANCE.getProduct_ProductId();

		/**
		 * The meta object literal for the '<em><b>Amount Uom Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__AMOUNT_UOM_TYPE_ID = eINSTANCE.getProduct_AmountUomTypeId();

		/**
		 * The meta object literal for the '<em><b>Auto Create Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__AUTO_CREATE_KEYWORDS = eINSTANCE.getProduct_AutoCreateKeywords();

		/**
		 * The meta object literal for the '<em><b>Bill Of Material Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__BILL_OF_MATERIAL_LEVEL = eINSTANCE.getProduct_BillOfMaterialLevel();

		/**
		 * The meta object literal for the '<em><b>Brand Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__BRAND_NAME = eINSTANCE.getProduct_BrandName();

		/**
		 * The meta object literal for the '<em><b>Charge Shipping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CHARGE_SHIPPING = eINSTANCE.getProduct_ChargeShipping();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__COMMENTS = eINSTANCE.getProduct_Comments();

		/**
		 * The meta object literal for the '<em><b>Communication Event Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__COMMUNICATION_EVENT_PRODUCTS = eINSTANCE.getProduct_CommunicationEventProducts();

		/**
		 * The meta object literal for the '<em><b>Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CONFIG_ID = eINSTANCE.getProduct_ConfigId();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CREATED_BY_USER_LOGIN = eINSTANCE.getProduct_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__CREATED_DATE = eINSTANCE.getProduct_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Default Shipment Box Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID = eINSTANCE.getProduct_DefaultShipmentBoxTypeId();

		/**
		 * The meta object literal for the '<em><b>Depth Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__DEPTH_UOM_ID = eINSTANCE.getProduct_DepthUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Detail Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DETAIL_IMAGE_URL = eINSTANCE.getProduct_DetailImageUrl();

		/**
		 * The meta object literal for the '<em><b>Detail Screen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DETAIL_SCREEN = eINSTANCE.getProduct_DetailScreen();

		/**
		 * The meta object literal for the '<em><b>Diameter Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__DIAMETER_UOM_ID = eINSTANCE.getProduct_DiameterUomId();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FACILITY_ID = eINSTANCE.getProduct_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Fixed Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__FIXED_AMOUNT = eINSTANCE.getProduct_FixedAmount();

		/**
		 * The meta object literal for the '<em><b>Height Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__HEIGHT_UOM_ID = eINSTANCE.getProduct_HeightUomId();

		/**
		 * The meta object literal for the '<em><b>In Shipping Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__IN_SHIPPING_BOX = eINSTANCE.getProduct_InShippingBox();

		/**
		 * The meta object literal for the '<em><b>Include In Promotions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__INCLUDE_IN_PROMOTIONS = eINSTANCE.getProduct_IncludeInPromotions();

		/**
		 * The meta object literal for the '<em><b>Internal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__INTERNAL_NAME = eINSTANCE.getProduct_InternalName();

		/**
		 * The meta object literal for the '<em><b>Introduction Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__INTRODUCTION_DATE = eINSTANCE.getProduct_IntroductionDate();

		/**
		 * The meta object literal for the '<em><b>Inventory Item Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__INVENTORY_ITEM_TYPE_ID = eINSTANCE.getProduct_InventoryItemTypeId();

		/**
		 * The meta object literal for the '<em><b>Inventory Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__INVENTORY_MESSAGE = eINSTANCE.getProduct_InventoryMessage();

		/**
		 * The meta object literal for the '<em><b>Is Variant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__IS_VARIANT = eINSTANCE.getProduct_IsVariant();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__IS_VIRTUAL = eINSTANCE.getProduct_IsVirtual();

		/**
		 * The meta object literal for the '<em><b>Large Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__LARGE_IMAGE_URL = eINSTANCE.getProduct_LargeImageUrl();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getProduct_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__LAST_MODIFIED_DATE = eINSTANCE.getProduct_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__LONG_DESCRIPTION = eINSTANCE.getProduct_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Lot Id Filled In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__LOT_ID_FILLED_IN = eINSTANCE.getProduct_LotIdFilledIn();

		/**
		 * The meta object literal for the '<em><b>Medium Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MEDIUM_IMAGE_URL = eINSTANCE.getProduct_MediumImageUrl();

		/**
		 * The meta object literal for the '<em><b>Order Decimal Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ORDER_DECIMAL_QUANTITY = eINSTANCE.getProduct_OrderDecimalQuantity();

		/**
		 * The meta object literal for the '<em><b>Origin Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__ORIGIN_GEO_ID = eINSTANCE.getProduct_OriginGeoId();

		/**
		 * The meta object literal for the '<em><b>Original Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ORIGINAL_IMAGE_URL = eINSTANCE.getProduct_OriginalImageUrl();

		/**
		 * The meta object literal for the '<em><b>Pieces Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PIECES_INCLUDED = eINSTANCE.getProduct_PiecesIncluded();

		/**
		 * The meta object literal for the '<em><b>Price Detail Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE_DETAIL_TEXT = eINSTANCE.getProduct_PriceDetailText();

		/**
		 * The meta object literal for the '<em><b>Primary Product Category Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID = eINSTANCE.getProduct_PrimaryProductCategoryId();

		/**
		 * The meta object literal for the '<em><b>Product Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_ATTRIBUTES = eINSTANCE.getProduct_ProductAttributes();

		/**
		 * The meta object literal for the '<em><b>Product Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_DEPTH = eINSTANCE.getProduct_ProductDepth();

		/**
		 * The meta object literal for the '<em><b>Product Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_DIAMETER = eINSTANCE.getProduct_ProductDiameter();

		/**
		 * The meta object literal for the '<em><b>Product Facilities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_FACILITIES = eINSTANCE.getProduct_ProductFacilities();

		/**
		 * The meta object literal for the '<em><b>Product Geos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_GEOS = eINSTANCE.getProduct_ProductGeos();

		/**
		 * The meta object literal for the '<em><b>Product Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_HEIGHT = eINSTANCE.getProduct_ProductHeight();

		/**
		 * The meta object literal for the '<em><b>Product Maints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_MAINTS = eINSTANCE.getProduct_ProductMaints();

		/**
		 * The meta object literal for the '<em><b>Product Meters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_METERS = eINSTANCE.getProduct_ProductMeters();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_NAME = eINSTANCE.getProduct_ProductName();

		/**
		 * The meta object literal for the '<em><b>Product Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_RATING = eINSTANCE.getProduct_ProductRating();

		/**
		 * The meta object literal for the '<em><b>Product Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_TYPE_ID = eINSTANCE.getProduct_ProductTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_WEIGHT = eINSTANCE.getProduct_ProductWeight();

		/**
		 * The meta object literal for the '<em><b>Product Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCT_WIDTH = eINSTANCE.getProduct_ProductWidth();

		/**
		 * The meta object literal for the '<em><b>Quantity Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__QUANTITY_INCLUDED = eINSTANCE.getProduct_QuantityIncluded();

		/**
		 * The meta object literal for the '<em><b>Quantity Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__QUANTITY_UOM_ID = eINSTANCE.getProduct_QuantityUomId();

		/**
		 * The meta object literal for the '<em><b>Rating Type Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__RATING_TYPE_ENUM = eINSTANCE.getProduct_RatingTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__RELEASE_DATE = eINSTANCE.getProduct_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Require Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__REQUIRE_AMOUNT = eINSTANCE.getProduct_RequireAmount();

		/**
		 * The meta object literal for the '<em><b>Require Inventory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__REQUIRE_INVENTORY = eINSTANCE.getProduct_RequireInventory();

		/**
		 * The meta object literal for the '<em><b>Requirement Method Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__REQUIREMENT_METHOD_ENUM_ID = eINSTANCE.getProduct_RequirementMethodEnumId();

		/**
		 * The meta object literal for the '<em><b>Reserv2nd PP Perc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__RESERV2ND_PP_PERC = eINSTANCE.getProduct_Reserv2ndPPPerc();

		/**
		 * The meta object literal for the '<em><b>Reserv Max Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__RESERV_MAX_PERSONS = eINSTANCE.getProduct_ReservMaxPersons();

		/**
		 * The meta object literal for the '<em><b>Reserv Nth PP Perc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__RESERV_NTH_PP_PERC = eINSTANCE.getProduct_ReservNthPPPerc();

		/**
		 * The meta object literal for the '<em><b>Returnable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__RETURNABLE = eINSTANCE.getProduct_Returnable();

		/**
		 * The meta object literal for the '<em><b>Sales Disc When Not Avail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SALES_DISC_WHEN_NOT_AVAIL = eINSTANCE.getProduct_SalesDiscWhenNotAvail();

		/**
		 * The meta object literal for the '<em><b>Sales Discontinuation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SALES_DISCONTINUATION_DATE = eINSTANCE.getProduct_SalesDiscontinuationDate();

		/**
		 * The meta object literal for the '<em><b>Shipping Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SHIPPING_DEPTH = eINSTANCE.getProduct_ShippingDepth();

		/**
		 * The meta object literal for the '<em><b>Shipping Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SHIPPING_HEIGHT = eINSTANCE.getProduct_ShippingHeight();

		/**
		 * The meta object literal for the '<em><b>Shipping Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SHIPPING_WEIGHT = eINSTANCE.getProduct_ShippingWeight();

		/**
		 * The meta object literal for the '<em><b>Shipping Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SHIPPING_WIDTH = eINSTANCE.getProduct_ShippingWidth();

		/**
		 * The meta object literal for the '<em><b>Small Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SMALL_IMAGE_URL = eINSTANCE.getProduct_SmallImageUrl();

		/**
		 * The meta object literal for the '<em><b>Support Discontinuation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SUPPORT_DISCONTINUATION_DATE = eINSTANCE.getProduct_SupportDiscontinuationDate();

		/**
		 * The meta object literal for the '<em><b>Taxable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__TAXABLE = eINSTANCE.getProduct_Taxable();

		/**
		 * The meta object literal for the '<em><b>Virtual Variant Method Enum</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM = eINSTANCE.getProduct_VirtualVariantMethodEnum();

		/**
		 * The meta object literal for the '<em><b>Weight Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__WEIGHT_UOM_ID = eINSTANCE.getProduct_WeightUomId();

		/**
		 * The meta object literal for the '<em><b>Width Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__WIDTH_UOM_ID = eINSTANCE.getProduct_WidthUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductAssocImpl <em>Assoc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductAssocImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductAssoc()
		 * @generated
		 */
		EClass PRODUCT_ASSOC = eINSTANCE.getProductAssoc();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ASSOC__PRODUCT_ID = eINSTANCE.getProductAssoc_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ASSOC__PRODUCT_ID_TO = eINSTANCE.getProductAssoc_ProductIdTo();

		/**
		 * The meta object literal for the '<em><b>Product Assoc Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ASSOC__PRODUCT_ASSOC_TYPE_ID = eINSTANCE.getProductAssoc_ProductAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC__FROM_DATE = eINSTANCE.getProductAssoc_FromDate();

		/**
		 * The meta object literal for the '<em><b>Estimate Calc Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ASSOC__ESTIMATE_CALC_METHOD = eINSTANCE.getProductAssoc_EstimateCalcMethod();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC__INSTRUCTION = eINSTANCE.getProductAssoc_Instruction();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC__QUANTITY = eINSTANCE.getProductAssoc_Quantity();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC__REASON = eINSTANCE.getProductAssoc_Reason();

		/**
		 * The meta object literal for the '<em><b>Recurrence Info Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ASSOC__RECURRENCE_INFO_ID = eINSTANCE.getProductAssoc_RecurrenceInfoId();

		/**
		 * The meta object literal for the '<em><b>Routing Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ASSOC__ROUTING_WORK_EFFORT_ID = eINSTANCE.getProductAssoc_RoutingWorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Scrap Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC__SCRAP_FACTOR = eINSTANCE.getProductAssoc_ScrapFactor();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC__SEQUENCE_NUM = eINSTANCE.getProductAssoc_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC__THRU_DATE = eINSTANCE.getProductAssoc_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductAssocTypeImpl <em>Assoc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductAssocTypeImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductAssocType()
		 * @generated
		 */
		EClass PRODUCT_ASSOC_TYPE = eINSTANCE.getProductAssocType();

		/**
		 * The meta object literal for the '<em><b>Product Assoc Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC_TYPE__PRODUCT_ASSOC_TYPE_ID = eINSTANCE.getProductAssocType_ProductAssocTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC_TYPE__DESCRIPTION = eINSTANCE.getProductAssocType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ASSOC_TYPE__HAS_TABLE = eINSTANCE.getProductAssocType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ASSOC_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductAssocType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductAttributeImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductAttribute()
		 * @generated
		 */
		EClass PRODUCT_ATTRIBUTE = eINSTANCE.getProductAttribute();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ATTRIBUTE__PRODUCT_ID = eINSTANCE.getProductAttribute_ProductId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getProductAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getProductAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ATTRIBUTE__ATTR_TYPE = eINSTANCE.getProductAttribute_AttrType();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getProductAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl <em>Calculated Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductCalculatedInfo()
		 * @generated
		 */
		EClass PRODUCT_CALCULATED_INFO = eINSTANCE.getProductCalculatedInfo();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CALCULATED_INFO__PRODUCT_ID = eINSTANCE.getProductCalculatedInfo_ProductId();

		/**
		 * The meta object literal for the '<em><b>Average Customer Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING = eINSTANCE.getProductCalculatedInfo_AverageCustomerRating();

		/**
		 * The meta object literal for the '<em><b>Total Quantity Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED = eINSTANCE.getProductCalculatedInfo_TotalQuantityOrdered();

		/**
		 * The meta object literal for the '<em><b>Total Times Viewed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED = eINSTANCE.getProductCalculatedInfo_TotalTimesViewed();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductContentImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductContent()
		 * @generated
		 */
		EClass PRODUCT_CONTENT = eINSTANCE.getProductContent();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTENT__PRODUCT_ID = eINSTANCE.getProductContent_ProductId();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTENT__CONTENT_ID = eINSTANCE.getProductContent_ContentId();

		/**
		 * The meta object literal for the '<em><b>Product Content Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTENT__PRODUCT_CONTENT_TYPE_ID = eINSTANCE.getProductContent_ProductContentTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT__FROM_DATE = eINSTANCE.getProductContent_FromDate();

		/**
		 * The meta object literal for the '<em><b>Purchase From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT__PURCHASE_FROM_DATE = eINSTANCE.getProductContent_PurchaseFromDate();

		/**
		 * The meta object literal for the '<em><b>Purchase Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT__PURCHASE_THRU_DATE = eINSTANCE.getProductContent_PurchaseThruDate();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT__SEQUENCE_NUM = eINSTANCE.getProductContent_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT__THRU_DATE = eINSTANCE.getProductContent_ThruDate();

		/**
		 * The meta object literal for the '<em><b>Use Count Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT__USE_COUNT_LIMIT = eINSTANCE.getProductContent_UseCountLimit();

		/**
		 * The meta object literal for the '<em><b>Use Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTENT__USE_ROLE_TYPE_ID = eINSTANCE.getProductContent_UseRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Use Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT__USE_TIME = eINSTANCE.getProductContent_UseTime();

		/**
		 * The meta object literal for the '<em><b>Use Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTENT__USE_TIME_UOM_ID = eINSTANCE.getProductContent_UseTimeUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductContentTypeImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductContentType()
		 * @generated
		 */
		EClass PRODUCT_CONTENT_TYPE = eINSTANCE.getProductContentType();

		/**
		 * The meta object literal for the '<em><b>Product Content Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT_TYPE__PRODUCT_CONTENT_TYPE_ID = eINSTANCE.getProductContentType_ProductContentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT_TYPE__DESCRIPTION = eINSTANCE.getProductContentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONTENT_TYPE__HAS_TABLE = eINSTANCE.getProductContentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CONTENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductContentType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductGeoImpl <em>Geo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductGeoImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductGeo()
		 * @generated
		 */
		EClass PRODUCT_GEO = eINSTANCE.getProductGeo();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GEO__PRODUCT_ID = eINSTANCE.getProductGeo_ProductId();

		/**
		 * The meta object literal for the '<em><b>Geo Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GEO__GEO_ID = eINSTANCE.getProductGeo_GeoId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_GEO__DESCRIPTION = eINSTANCE.getProductGeo_Description();

		/**
		 * The meta object literal for the '<em><b>Product Geo Enum Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GEO__PRODUCT_GEO_ENUM_ID = eINSTANCE.getProductGeo_ProductGeoEnumId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductGlAccountImpl <em>Gl Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductGlAccountImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductGlAccount()
		 * @generated
		 */
		EClass PRODUCT_GL_ACCOUNT = eINSTANCE.getProductGlAccount();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GL_ACCOUNT__PRODUCT_ID = eINSTANCE.getProductGlAccount_ProductId();

		/**
		 * The meta object literal for the '<em><b>Organization Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GL_ACCOUNT__ORGANIZATION_PARTY_ID = eINSTANCE.getProductGlAccount_OrganizationPartyId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID = eINSTANCE.getProductGlAccount_GlAccountTypeId();

		/**
		 * The meta object literal for the '<em><b>Gl Account Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GL_ACCOUNT__GL_ACCOUNT_ID = eINSTANCE.getProductGlAccount_GlAccountId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl <em>Group Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductGroupOrderImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductGroupOrder()
		 * @generated
		 */
		EClass PRODUCT_GROUP_ORDER = eINSTANCE.getProductGroupOrder();

		/**
		 * The meta object literal for the '<em><b>Group Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_GROUP_ORDER__GROUP_ORDER_ID = eINSTANCE.getProductGroupOrder_GroupOrderId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_GROUP_ORDER__FROM_DATE = eINSTANCE.getProductGroupOrder_FromDate();

		/**
		 * The meta object literal for the '<em><b>Job Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GROUP_ORDER__JOB_ID = eINSTANCE.getProductGroupOrder_JobId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GROUP_ORDER__PRODUCT_ID = eINSTANCE.getProductGroupOrder_ProductId();

		/**
		 * The meta object literal for the '<em><b>Req Order Qty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_GROUP_ORDER__REQ_ORDER_QTY = eINSTANCE.getProductGroupOrder_ReqOrderQty();

		/**
		 * The meta object literal for the '<em><b>Sold Order Qty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_GROUP_ORDER__SOLD_ORDER_QTY = eINSTANCE.getProductGroupOrder_SoldOrderQty();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_GROUP_ORDER__STATUS_ID = eINSTANCE.getProductGroupOrder_StatusId();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_GROUP_ORDER__THRU_DATE = eINSTANCE.getProductGroupOrder_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductKeywordImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductKeyword()
		 * @generated
		 */
		EClass PRODUCT_KEYWORD = eINSTANCE.getProductKeyword();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_KEYWORD__PRODUCT_ID = eINSTANCE.getProductKeyword_ProductId();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_KEYWORD__KEYWORD = eINSTANCE.getProductKeyword_Keyword();

		/**
		 * The meta object literal for the '<em><b>Keyword Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_KEYWORD__KEYWORD_TYPE_ID = eINSTANCE.getProductKeyword_KeywordTypeId();

		/**
		 * The meta object literal for the '<em><b>Relevancy Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_KEYWORD__RELEVANCY_WEIGHT = eINSTANCE.getProductKeyword_RelevancyWeight();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_KEYWORD__STATUS_ID = eINSTANCE.getProductKeyword_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMaintImpl <em>Maint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductMaintImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMaint()
		 * @generated
		 */
		EClass PRODUCT_MAINT = eINSTANCE.getProductMaint();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MAINT__PRODUCT_ID = eINSTANCE.getProductMaint_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Maint Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MAINT__PRODUCT_MAINT_SEQ_ID = eINSTANCE.getProductMaint_ProductMaintSeqId();

		/**
		 * The meta object literal for the '<em><b>Interval Meter Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MAINT__INTERVAL_METER_TYPE_ID = eINSTANCE.getProductMaint_IntervalMeterTypeId();

		/**
		 * The meta object literal for the '<em><b>Interval Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MAINT__INTERVAL_QUANTITY = eINSTANCE.getProductMaint_IntervalQuantity();

		/**
		 * The meta object literal for the '<em><b>Interval Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MAINT__INTERVAL_UOM_ID = eINSTANCE.getProductMaint_IntervalUomId();

		/**
		 * The meta object literal for the '<em><b>Maint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MAINT__MAINT_NAME = eINSTANCE.getProductMaint_MaintName();

		/**
		 * The meta object literal for the '<em><b>Maint Template Work Effort Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MAINT__MAINT_TEMPLATE_WORK_EFFORT_ID = eINSTANCE.getProductMaint_MaintTemplateWorkEffortId();

		/**
		 * The meta object literal for the '<em><b>Product Maint Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MAINT__PRODUCT_MAINT_TYPE_ID = eINSTANCE.getProductMaint_ProductMaintTypeId();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MAINT__REPEAT_COUNT = eINSTANCE.getProductMaint_RepeatCount();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMaintTypeImpl <em>Maint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductMaintTypeImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMaintType()
		 * @generated
		 */
		EClass PRODUCT_MAINT_TYPE = eINSTANCE.getProductMaintType();

		/**
		 * The meta object literal for the '<em><b>Product Maint Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MAINT_TYPE__PRODUCT_MAINT_TYPE_ID = eINSTANCE.getProductMaintType_ProductMaintTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_MAINT_TYPE__DESCRIPTION = eINSTANCE.getProductMaintType_Description();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_MAINT_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductMaintType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMeterImpl <em>Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductMeterImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMeter()
		 * @generated
		 */
		EClass PRODUCT_METER = eINSTANCE.getProductMeter();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_METER__PRODUCT_ID = eINSTANCE.getProductMeter_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Meter Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_METER__PRODUCT_METER_TYPE_ID = eINSTANCE.getProductMeter_ProductMeterTypeId();

		/**
		 * The meta object literal for the '<em><b>Meter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_METER__METER_NAME = eINSTANCE.getProductMeter_MeterName();

		/**
		 * The meta object literal for the '<em><b>Meter Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_METER__METER_UOM_ID = eINSTANCE.getProductMeter_MeterUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductMeterTypeImpl <em>Meter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductMeterTypeImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductMeterType()
		 * @generated
		 */
		EClass PRODUCT_METER_TYPE = eINSTANCE.getProductMeterType();

		/**
		 * The meta object literal for the '<em><b>Product Meter Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_METER_TYPE__PRODUCT_METER_TYPE_ID = eINSTANCE.getProductMeterType_ProductMeterTypeId();

		/**
		 * The meta object literal for the '<em><b>Default Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_METER_TYPE__DEFAULT_UOM_ID = eINSTANCE.getProductMeterType_DefaultUomId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_METER_TYPE__DESCRIPTION = eINSTANCE.getProductMeterType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductReviewImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductReview()
		 * @generated
		 */
		EClass PRODUCT_REVIEW = eINSTANCE.getProductReview();

		/**
		 * The meta object literal for the '<em><b>Product Review Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_REVIEW__PRODUCT_REVIEW_ID = eINSTANCE.getProductReview_ProductReviewId();

		/**
		 * The meta object literal for the '<em><b>Posted Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_REVIEW__POSTED_ANONYMOUS = eINSTANCE.getProductReview_PostedAnonymous();

		/**
		 * The meta object literal for the '<em><b>Posted Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_REVIEW__POSTED_DATE_TIME = eINSTANCE.getProductReview_PostedDateTime();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_REVIEW__PRODUCT_ID = eINSTANCE.getProductReview_ProductId();

		/**
		 * The meta object literal for the '<em><b>Product Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_REVIEW__PRODUCT_RATING = eINSTANCE.getProductReview_ProductRating();

		/**
		 * The meta object literal for the '<em><b>Product Review</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_REVIEW__PRODUCT_REVIEW = eINSTANCE.getProductReview_ProductReview();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_REVIEW__PRODUCT_STORE_ID = eINSTANCE.getProductReview_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_REVIEW__STATUS_ID = eINSTANCE.getProductReview_StatusId();

		/**
		 * The meta object literal for the '<em><b>User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_REVIEW__USER_LOGIN_ID = eINSTANCE.getProductReview_UserLoginId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductRoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductRoleImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductRole()
		 * @generated
		 */
		EClass PRODUCT_ROLE = eINSTANCE.getProductRole();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ROLE__PRODUCT_ID = eINSTANCE.getProductRole_ProductId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ROLE__PARTY_ID = eINSTANCE.getProductRole_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_ROLE__ROLE_TYPE_ID = eINSTANCE.getProductRole_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ROLE__FROM_DATE = eINSTANCE.getProductRole_FromDate();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ROLE__COMMENTS = eINSTANCE.getProductRole_Comments();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ROLE__SEQUENCE_NUM = eINSTANCE.getProductRole_SequenceNum();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_ROLE__THRU_DATE = eINSTANCE.getProductRole_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl <em>Search Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductSearchConstraintImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductSearchConstraint()
		 * @generated
		 */
		EClass PRODUCT_SEARCH_CONSTRAINT = eINSTANCE.getProductSearchConstraint();

		/**
		 * The meta object literal for the '<em><b>Product Search Result Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SEARCH_CONSTRAINT__PRODUCT_SEARCH_RESULT_ID = eINSTANCE.getProductSearchConstraint_ProductSearchResultId();

		/**
		 * The meta object literal for the '<em><b>Constraint Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_SEQ_ID = eINSTANCE.getProductSearchConstraint_ConstraintSeqId();

		/**
		 * The meta object literal for the '<em><b>Any Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__ANY_PREFIX = eINSTANCE.getProductSearchConstraint_AnyPrefix();

		/**
		 * The meta object literal for the '<em><b>Any Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__ANY_SUFFIX = eINSTANCE.getProductSearchConstraint_AnySuffix();

		/**
		 * The meta object literal for the '<em><b>Constraint Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__CONSTRAINT_NAME = eINSTANCE.getProductSearchConstraint_ConstraintName();

		/**
		 * The meta object literal for the '<em><b>High Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__HIGH_VALUE = eINSTANCE.getProductSearchConstraint_HighValue();

		/**
		 * The meta object literal for the '<em><b>Include Sub Categories</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__INCLUDE_SUB_CATEGORIES = eINSTANCE.getProductSearchConstraint_IncludeSubCategories();

		/**
		 * The meta object literal for the '<em><b>Info String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__INFO_STRING = eINSTANCE.getProductSearchConstraint_InfoString();

		/**
		 * The meta object literal for the '<em><b>Is And</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__IS_AND = eINSTANCE.getProductSearchConstraint_IsAnd();

		/**
		 * The meta object literal for the '<em><b>Low Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__LOW_VALUE = eINSTANCE.getProductSearchConstraint_LowValue();

		/**
		 * The meta object literal for the '<em><b>Remove Stems</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_CONSTRAINT__REMOVE_STEMS = eINSTANCE.getProductSearchConstraint_RemoveStems();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl <em>Search Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductSearchResultImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductSearchResult()
		 * @generated
		 */
		EClass PRODUCT_SEARCH_RESULT = eINSTANCE.getProductSearchResult();

		/**
		 * The meta object literal for the '<em><b>Product Search Result Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_RESULT_ID = eINSTANCE.getProductSearchResult_ProductSearchResultId();

		/**
		 * The meta object literal for the '<em><b>Is Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_RESULT__IS_ASCENDING = eINSTANCE.getProductSearchResult_IsAscending();

		/**
		 * The meta object literal for the '<em><b>Num Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_RESULT__NUM_RESULTS = eINSTANCE.getProductSearchResult_NumResults();

		/**
		 * The meta object literal for the '<em><b>Order By Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_RESULT__ORDER_BY_NAME = eINSTANCE.getProductSearchResult_OrderByName();

		/**
		 * The meta object literal for the '<em><b>Product Search Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SEARCH_RESULT__PRODUCT_SEARCH_CONSTRAINTS = eINSTANCE.getProductSearchResult_ProductSearchConstraints();

		/**
		 * The meta object literal for the '<em><b>Search Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_RESULT__SEARCH_DATE = eINSTANCE.getProductSearchResult_SearchDate();

		/**
		 * The meta object literal for the '<em><b>Seconds Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_RESULT__SECONDS_TOTAL = eINSTANCE.getProductSearchResult_SecondsTotal();

		/**
		 * The meta object literal for the '<em><b>Visit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SEARCH_RESULT__VISIT_ID = eINSTANCE.getProductSearchResult_VisitId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductTypeImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductType()
		 * @generated
		 */
		EClass PRODUCT_TYPE = eINSTANCE.getProductType();

		/**
		 * The meta object literal for the '<em><b>Product Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__PRODUCT_TYPE_ID = eINSTANCE.getProductType_ProductTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__DESCRIPTION = eINSTANCE.getProductType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__HAS_TABLE = eINSTANCE.getProductType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Is Digital</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__IS_DIGITAL = eINSTANCE.getProductType_IsDigital();

		/**
		 * The meta object literal for the '<em><b>Is Physical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE__IS_PHYSICAL = eINSTANCE.getProductType_IsPhysical();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PARENT_TYPE_ID = eINSTANCE.getProductType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Product Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE__PRODUCT_TYPE_ATTRS = eINSTANCE.getProductType_ProductTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.ProductTypeAttrImpl <em>Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.ProductTypeAttrImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getProductTypeAttr()
		 * @generated
		 */
		EClass PRODUCT_TYPE_ATTR = eINSTANCE.getProductTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Product Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_TYPE_ATTR__PRODUCT_TYPE_ID = eINSTANCE.getProductTypeAttr_ProductTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getProductTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getProductTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.product.product.impl.VendorProductImpl <em>Vendor Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.product.product.impl.VendorProductImpl
		 * @see org.abchip.mimo.biz.product.product.impl.ProductPackageImpl#getVendorProduct()
		 * @generated
		 */
		EClass VENDOR_PRODUCT = eINSTANCE.getVendorProduct();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR_PRODUCT__PRODUCT_ID = eINSTANCE.getVendorProduct_ProductId();

		/**
		 * The meta object literal for the '<em><b>Vendor Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR_PRODUCT__VENDOR_PARTY_ID = eINSTANCE.getVendorProduct_VendorPartyId();

		/**
		 * The meta object literal for the '<em><b>Product Store Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VENDOR_PRODUCT__PRODUCT_STORE_GROUP_ID = eINSTANCE.getVendorProduct_ProductStoreGroupId();

	}

} //ProductPackage
