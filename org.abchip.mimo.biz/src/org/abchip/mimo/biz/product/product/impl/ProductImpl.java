/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.common.uom.UomType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.ProductType;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isAutoCreateKeywords <em>Auto Create Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getBillOfMaterialLevel <em>Bill Of Material Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getBrandName <em>Brand Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isChargeShipping <em>Charge Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDetailImageUrl <em>Detail Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isInShippingBox <em>In Shipping Box</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isIncludeInPromotions <em>Include In Promotions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getIntroductionDate <em>Introduction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getInventoryMessage <em>Inventory Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isIsVariant <em>Is Variant</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLargeImageUrl <em>Large Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLotIdFilledIn <em>Lot Id Filled In</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getMediumImageUrl <em>Medium Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getOriginalImageUrl <em>Original Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getPiecesIncluded <em>Pieces Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getPriceDetailText <em>Price Detail Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductDepth <em>Product Depth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductDiameter <em>Product Diameter</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductHeight <em>Product Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductRating <em>Product Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductWeight <em>Product Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductWidth <em>Product Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getQuantityIncluded <em>Quantity Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isRequireAmount <em>Require Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isRequireInventory <em>Require Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getReservMaxPersons <em>Reserv Max Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isReturnable <em>Returnable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isSalesDiscWhenNotAvail <em>Sales Disc When Not Avail</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getSalesDiscontinuationDate <em>Sales Discontinuation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getShippingDepth <em>Shipping Depth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getShippingHeight <em>Shipping Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getShippingWeight <em>Shipping Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getShippingWidth <em>Shipping Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getSmallImageUrl <em>Small Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getSupportDiscontinuationDate <em>Support Discontinuation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isTaxable <em>Taxable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getPrimaryProductCategoryId <em>Primary Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getAmountUomTypeId <em>Amount Uom Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getWeightUomId <em>Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getHeightUomId <em>Height Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getWidthUomId <em>Width Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDepthUomId <em>Depth Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDiameterUomId <em>Diameter Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getVirtualVariantMethodEnum <em>Virtual Variant Method Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getRatingTypeEnum <em>Rating Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getOriginGeoId <em>Origin Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDefaultShipmentBoxTypeId <em>Default Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getCommunicationEventProducts <em>Communication Event Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductAttributes <em>Product Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductFacilities <em>Product Facilities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductGeos <em>Product Geos</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductMaints <em>Product Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductMeters <em>Product Meters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends BizEntityTypedImpl<ProductType> implements Product {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAutoCreateKeywords() <em>Auto Create Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCreateKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_CREATE_KEYWORDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoCreateKeywords() <em>Auto Create Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCreateKeywords()
	 * @generated
	 * @ordered
	 */
	protected boolean autoCreateKeywords = AUTO_CREATE_KEYWORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillOfMaterialLevel() <em>Bill Of Material Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillOfMaterialLevel()
	 * @generated
	 * @ordered
	 */
	protected static final long BILL_OF_MATERIAL_LEVEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBillOfMaterialLevel() <em>Bill Of Material Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillOfMaterialLevel()
	 * @generated
	 * @ordered
	 */
	protected long billOfMaterialLevel = BILL_OF_MATERIAL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrandName() <em>Brand Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandName()
	 * @generated
	 * @ordered
	 */
	protected static final String BRAND_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrandName() <em>Brand Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrandName()
	 * @generated
	 * @ordered
	 */
	protected String brandName = BRAND_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isChargeShipping() <em>Charge Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChargeShipping()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHARGE_SHIPPING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChargeShipping() <em>Charge Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChargeShipping()
	 * @generated
	 * @ordered
	 */
	protected boolean chargeShipping = CHARGE_SHIPPING_EDEFAULT;

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
	 * The default value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected String configId = CONFIG_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDetailImageUrl() <em>Detail Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailImageUrl() <em>Detail Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String detailImageUrl = DETAIL_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetailScreen() <em>Detail Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailScreen()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAIL_SCREEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetailScreen() <em>Detail Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailScreen()
	 * @generated
	 * @ordered
	 */
	protected String detailScreen = DETAIL_SCREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FIXED_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFixedAmount() <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal fixedAmount = FIXED_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInShippingBox() <em>In Shipping Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInShippingBox()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IN_SHIPPING_BOX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInShippingBox() <em>In Shipping Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInShippingBox()
	 * @generated
	 * @ordered
	 */
	protected boolean inShippingBox = IN_SHIPPING_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeInPromotions() <em>Include In Promotions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInPromotions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_IN_PROMOTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeInPromotions() <em>Include In Promotions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeInPromotions()
	 * @generated
	 * @ordered
	 */
	protected boolean includeInPromotions = INCLUDE_IN_PROMOTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalName() <em>Internal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalName() <em>Internal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalName()
	 * @generated
	 * @ordered
	 */
	protected String internalName = INTERNAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntroductionDate() <em>Introduction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroductionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date INTRODUCTION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntroductionDate() <em>Introduction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroductionDate()
	 * @generated
	 * @ordered
	 */
	protected Date introductionDate = INTRODUCTION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInventoryMessage() <em>Inventory Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryMessage() <em>Inventory Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryMessage()
	 * @generated
	 * @ordered
	 */
	protected String inventoryMessage = INVENTORY_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVariant() <em>Is Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVariant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VARIANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVariant() <em>Is Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVariant()
	 * @generated
	 * @ordered
	 */
	protected boolean isVariant = IS_VARIANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VIRTUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVirtual() <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVirtual()
	 * @generated
	 * @ordered
	 */
	protected boolean isVirtual = IS_VIRTUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeImageUrl() <em>Large Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LARGE_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLargeImageUrl() <em>Large Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String largeImageUrl = LARGE_IMAGE_URL_EDEFAULT;

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
	 * The default value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongDescription()
	 * @generated
	 * @ordered
	 */
	protected String longDescription = LONG_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLotIdFilledIn() <em>Lot Id Filled In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotIdFilledIn()
	 * @generated
	 * @ordered
	 */
	protected static final String LOT_ID_FILLED_IN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLotIdFilledIn() <em>Lot Id Filled In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotIdFilledIn()
	 * @generated
	 * @ordered
	 */
	protected String lotIdFilledIn = LOT_ID_FILLED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediumImageUrl() <em>Medium Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIUM_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediumImageUrl() <em>Medium Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String mediumImageUrl = MEDIUM_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrderDecimalQuantity() <em>Order Decimal Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderDecimalQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDER_DECIMAL_QUANTITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrderDecimalQuantity() <em>Order Decimal Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrderDecimalQuantity()
	 * @generated
	 * @ordered
	 */
	protected boolean orderDecimalQuantity = ORDER_DECIMAL_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalImageUrl() <em>Original Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINAL_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginalImageUrl() <em>Original Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String originalImageUrl = ORIGINAL_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPiecesIncluded() <em>Pieces Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiecesIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final long PIECES_INCLUDED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPiecesIncluded() <em>Pieces Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiecesIncluded()
	 * @generated
	 * @ordered
	 */
	protected long piecesIncluded = PIECES_INCLUDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriceDetailText() <em>Price Detail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceDetailText()
	 * @generated
	 * @ordered
	 */
	protected static final String PRICE_DETAIL_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriceDetailText() <em>Price Detail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceDetailText()
	 * @generated
	 * @ordered
	 */
	protected String priceDetailText = PRICE_DETAIL_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductDepth() <em>Product Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDepth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductDepth() <em>Product Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDepth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productDepth = PRODUCT_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductDiameter() <em>Product Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductDiameter() <em>Product Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductDiameter()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productDiameter = PRODUCT_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductHeight() <em>Product Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductHeight() <em>Product Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductHeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productHeight = PRODUCT_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductRating() <em>Product Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductRating()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductRating() <em>Product Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductRating()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productRating = PRODUCT_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductWeight() <em>Product Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductWeight() <em>Product Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productWeight = PRODUCT_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductWidth() <em>Product Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductWidth() <em>Product Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductWidth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productWidth = PRODUCT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityIncluded() <em>Quantity Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_INCLUDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityIncluded() <em>Quantity Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityIncluded()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityIncluded = QUANTITY_INCLUDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected Date releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireAmount() <em>Require Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireAmount()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_AMOUNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireAmount() <em>Require Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireAmount()
	 * @generated
	 * @ordered
	 */
	protected boolean requireAmount = REQUIRE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireInventory() <em>Require Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireInventory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_INVENTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireInventory() <em>Require Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireInventory()
	 * @generated
	 * @ordered
	 */
	protected boolean requireInventory = REQUIRE_INVENTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserv2ndPPPerc() <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV2ND_PP_PERC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserv2ndPPPerc() <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reserv2ndPPPerc = RESERV2ND_PP_PERC_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservMaxPersons() <em>Reserv Max Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservMaxPersons()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_MAX_PERSONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservMaxPersons() <em>Reserv Max Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservMaxPersons()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservMaxPersons = RESERV_MAX_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservNthPPPerc() <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservNthPPPerc()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_NTH_PP_PERC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservNthPPPerc() <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservNthPPPerc()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservNthPPPerc = RESERV_NTH_PP_PERC_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnable() <em>Returnable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURNABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnable() <em>Returnable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnable()
	 * @generated
	 * @ordered
	 */
	protected boolean returnable = RETURNABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSalesDiscWhenNotAvail() <em>Sales Disc When Not Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSalesDiscWhenNotAvail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SALES_DISC_WHEN_NOT_AVAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSalesDiscWhenNotAvail() <em>Sales Disc When Not Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSalesDiscWhenNotAvail()
	 * @generated
	 * @ordered
	 */
	protected boolean salesDiscWhenNotAvail = SALES_DISC_WHEN_NOT_AVAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalesDiscontinuationDate() <em>Sales Discontinuation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesDiscontinuationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SALES_DISCONTINUATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalesDiscontinuationDate() <em>Sales Discontinuation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalesDiscontinuationDate()
	 * @generated
	 * @ordered
	 */
	protected Date salesDiscontinuationDate = SALES_DISCONTINUATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingDepth() <em>Shipping Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingDepth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHIPPING_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingDepth() <em>Shipping Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingDepth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal shippingDepth = SHIPPING_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingHeight() <em>Shipping Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHIPPING_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingHeight() <em>Shipping Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingHeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal shippingHeight = SHIPPING_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingWeight() <em>Shipping Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHIPPING_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingWeight() <em>Shipping Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal shippingWeight = SHIPPING_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingWidth() <em>Shipping Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHIPPING_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingWidth() <em>Shipping Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingWidth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal shippingWidth = SHIPPING_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmallImageUrl() <em>Small Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SMALL_IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmallImageUrl() <em>Small Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmallImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String smallImageUrl = SMALL_IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportDiscontinuationDate() <em>Support Discontinuation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportDiscontinuationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUPPORT_DISCONTINUATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportDiscontinuationDate() <em>Support Discontinuation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportDiscontinuationDate()
	 * @generated
	 * @ordered
	 */
	protected Date supportDiscontinuationDate = SUPPORT_DISCONTINUATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTaxable() <em>Taxable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAXABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTaxable() <em>Taxable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTaxable()
	 * @generated
	 * @ordered
	 */
	protected boolean taxable = TAXABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductTypeId() <em>Product Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductType productTypeId;

	/**
	 * The cached value of the '{@link #getPrimaryProductCategoryId() <em>Primary Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory primaryProductCategoryId;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

	/**
	 * The cached value of the '{@link #getQuantityUomId() <em>Quantity Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom quantityUomId;

	/**
	 * The cached value of the '{@link #getAmountUomTypeId() <em>Amount Uom Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUomTypeId()
	 * @generated
	 * @ordered
	 */
	protected UomType amountUomTypeId;

	/**
	 * The cached value of the '{@link #getWeightUomId() <em>Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom weightUomId;

	/**
	 * The cached value of the '{@link #getHeightUomId() <em>Height Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom heightUomId;

	/**
	 * The cached value of the '{@link #getWidthUomId() <em>Width Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom widthUomId;

	/**
	 * The cached value of the '{@link #getDepthUomId() <em>Depth Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom depthUomId;

	/**
	 * The cached value of the '{@link #getDiameterUomId() <em>Diameter Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiameterUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom diameterUomId;

	/**
	 * The cached value of the '{@link #getVirtualVariantMethodEnum() <em>Virtual Variant Method Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualVariantMethodEnum()
	 * @generated
	 * @ordered
	 */
	protected Enumeration virtualVariantMethodEnum;

	/**
	 * The cached value of the '{@link #getRatingTypeEnum() <em>Rating Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatingTypeEnum()
	 * @generated
	 * @ordered
	 */
	protected Enumeration ratingTypeEnum;

	/**
	 * The cached value of the '{@link #getRequirementMethodEnumId() <em>Requirement Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementMethodEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration requirementMethodEnumId;

	/**
	 * The cached value of the '{@link #getOriginGeoId() <em>Origin Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginGeoId()
	 * @generated
	 * @ordered
	 */
	protected Geo originGeoId;

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
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin lastModifiedByUserLogin;

	/**
	 * The cached value of the '{@link #getDefaultShipmentBoxTypeId() <em>Default Shipment Box Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultShipmentBoxTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentBoxType defaultShipmentBoxTypeId;

	/**
	 * The cached value of the '{@link #getInventoryItemTypeId() <em>Inventory Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemType inventoryItemTypeId;

	/**
	 * The cached value of the '{@link #getCommunicationEventProducts() <em>Communication Event Products</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationEventProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> communicationEventProducts;

	/**
	 * The cached value of the '{@link #getProductAttributes() <em>Product Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productAttributes;

	/**
	 * The cached value of the '{@link #getProductFacilities() <em>Product Facilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFacilities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productFacilities;

	/**
	 * The cached value of the '{@link #getProductGeos() <em>Product Geos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductGeos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productGeos;

	/**
	 * The cached value of the '{@link #getProductMaints() <em>Product Maints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMaints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productMaints;

	/**
	 * The cached value of the '{@link #getProductMeters() <em>Product Meters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductMeters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productMeters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomType getAmountUomTypeId() {
		if (amountUomTypeId != null && ((EObject)amountUomTypeId).eIsProxy()) {
			InternalEObject oldAmountUomTypeId = (InternalEObject)amountUomTypeId;
			amountUomTypeId = (UomType)eResolveProxy(oldAmountUomTypeId);
			if (amountUomTypeId != oldAmountUomTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__AMOUNT_UOM_TYPE_ID, oldAmountUomTypeId, amountUomTypeId));
			}
		}
		return amountUomTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UomType basicGetAmountUomTypeId() {
		return amountUomTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountUomTypeId(UomType newAmountUomTypeId) {
		UomType oldAmountUomTypeId = amountUomTypeId;
		amountUomTypeId = newAmountUomTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__AMOUNT_UOM_TYPE_ID, oldAmountUomTypeId, amountUomTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoCreateKeywords() {
		return autoCreateKeywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoCreateKeywords(boolean newAutoCreateKeywords) {
		boolean oldAutoCreateKeywords = autoCreateKeywords;
		autoCreateKeywords = newAutoCreateKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__AUTO_CREATE_KEYWORDS, oldAutoCreateKeywords, autoCreateKeywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBillOfMaterialLevel() {
		return billOfMaterialLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillOfMaterialLevel(long newBillOfMaterialLevel) {
		long oldBillOfMaterialLevel = billOfMaterialLevel;
		billOfMaterialLevel = newBillOfMaterialLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__BILL_OF_MATERIAL_LEVEL, oldBillOfMaterialLevel, billOfMaterialLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrandName() {
		return brandName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrandName(String newBrandName) {
		String oldBrandName = brandName;
		brandName = newBrandName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__BRAND_NAME, oldBrandName, brandName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChargeShipping() {
		return chargeShipping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargeShipping(boolean newChargeShipping) {
		boolean oldChargeShipping = chargeShipping;
		chargeShipping = newChargeShipping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__CHARGE_SHIPPING, oldChargeShipping, chargeShipping));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigId() {
		return configId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		String oldConfigId = configId;
		configId = newConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__CONFIG_ID, oldConfigId, configId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentBoxType getDefaultShipmentBoxTypeId() {
		if (defaultShipmentBoxTypeId != null && ((EObject)defaultShipmentBoxTypeId).eIsProxy()) {
			InternalEObject oldDefaultShipmentBoxTypeId = (InternalEObject)defaultShipmentBoxTypeId;
			defaultShipmentBoxTypeId = (ShipmentBoxType)eResolveProxy(oldDefaultShipmentBoxTypeId);
			if (defaultShipmentBoxTypeId != oldDefaultShipmentBoxTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID, oldDefaultShipmentBoxTypeId, defaultShipmentBoxTypeId));
			}
		}
		return defaultShipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentBoxType basicGetDefaultShipmentBoxTypeId() {
		return defaultShipmentBoxTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultShipmentBoxTypeId(ShipmentBoxType newDefaultShipmentBoxTypeId) {
		ShipmentBoxType oldDefaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
		defaultShipmentBoxTypeId = newDefaultShipmentBoxTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID, oldDefaultShipmentBoxTypeId, defaultShipmentBoxTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDepthUomId() {
		if (depthUomId != null && ((EObject)depthUomId).eIsProxy()) {
			InternalEObject oldDepthUomId = (InternalEObject)depthUomId;
			depthUomId = (Uom)eResolveProxy(oldDepthUomId);
			if (depthUomId != oldDepthUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__DEPTH_UOM_ID, oldDepthUomId, depthUomId));
			}
		}
		return depthUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetDepthUomId() {
		return depthUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepthUomId(Uom newDepthUomId) {
		Uom oldDepthUomId = depthUomId;
		depthUomId = newDepthUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DEPTH_UOM_ID, oldDepthUomId, depthUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailImageUrl() {
		return detailImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailImageUrl(String newDetailImageUrl) {
		String oldDetailImageUrl = detailImageUrl;
		detailImageUrl = newDetailImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DETAIL_IMAGE_URL, oldDetailImageUrl, detailImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailScreen() {
		return detailScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailScreen(String newDetailScreen) {
		String oldDetailScreen = detailScreen;
		detailScreen = newDetailScreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DETAIL_SCREEN, oldDetailScreen, detailScreen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDiameterUomId() {
		if (diameterUomId != null && ((EObject)diameterUomId).eIsProxy()) {
			InternalEObject oldDiameterUomId = (InternalEObject)diameterUomId;
			diameterUomId = (Uom)eResolveProxy(oldDiameterUomId);
			if (diameterUomId != oldDiameterUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__DIAMETER_UOM_ID, oldDiameterUomId, diameterUomId));
			}
		}
		return diameterUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetDiameterUomId() {
		return diameterUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiameterUomId(Uom newDiameterUomId) {
		Uom oldDiameterUomId = diameterUomId;
		diameterUomId = newDiameterUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__DIAMETER_UOM_ID, oldDiameterUomId, diameterUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFixedAmount() {
		return fixedAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAmount(BigDecimal newFixedAmount) {
		BigDecimal oldFixedAmount = fixedAmount;
		fixedAmount = newFixedAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__FIXED_AMOUNT, oldFixedAmount, fixedAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getHeightUomId() {
		if (heightUomId != null && ((EObject)heightUomId).eIsProxy()) {
			InternalEObject oldHeightUomId = (InternalEObject)heightUomId;
			heightUomId = (Uom)eResolveProxy(oldHeightUomId);
			if (heightUomId != oldHeightUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__HEIGHT_UOM_ID, oldHeightUomId, heightUomId));
			}
		}
		return heightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetHeightUomId() {
		return heightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeightUomId(Uom newHeightUomId) {
		Uom oldHeightUomId = heightUomId;
		heightUomId = newHeightUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__HEIGHT_UOM_ID, oldHeightUomId, heightUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInShippingBox() {
		return inShippingBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInShippingBox(boolean newInShippingBox) {
		boolean oldInShippingBox = inShippingBox;
		inShippingBox = newInShippingBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__IN_SHIPPING_BOX, oldInShippingBox, inShippingBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInPromotions() {
		return includeInPromotions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInPromotions(boolean newIncludeInPromotions) {
		boolean oldIncludeInPromotions = includeInPromotions;
		includeInPromotions = newIncludeInPromotions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__INCLUDE_IN_PROMOTIONS, oldIncludeInPromotions, includeInPromotions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalName() {
		return internalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalName(String newInternalName) {
		String oldInternalName = internalName;
		internalName = newInternalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__INTERNAL_NAME, oldInternalName, internalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIntroductionDate() {
		return introductionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntroductionDate(Date newIntroductionDate) {
		Date oldIntroductionDate = introductionDate;
		introductionDate = newIntroductionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__INTRODUCTION_DATE, oldIntroductionDate, introductionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryMessage() {
		return inventoryMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryMessage(String newInventoryMessage) {
		String oldInventoryMessage = inventoryMessage;
		inventoryMessage = newInventoryMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__INVENTORY_MESSAGE, oldInventoryMessage, inventoryMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVariant() {
		return isVariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariant(boolean newIsVariant) {
		boolean oldIsVariant = isVariant;
		isVariant = newIsVariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__IS_VARIANT, oldIsVariant, isVariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVirtual() {
		return isVirtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVirtual(boolean newIsVirtual) {
		boolean oldIsVirtual = isVirtual;
		isVirtual = newIsVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__IS_VIRTUAL, oldIsVirtual, isVirtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLargeImageUrl() {
		return largeImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLargeImageUrl(String newLargeImageUrl) {
		String oldLargeImageUrl = largeImageUrl;
		largeImageUrl = newLargeImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LARGE_IMAGE_URL, oldLargeImageUrl, largeImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		if (lastModifiedByUserLogin != null && ((EObject)lastModifiedByUserLogin).eIsProxy()) {
			InternalEObject oldLastModifiedByUserLogin = (InternalEObject)lastModifiedByUserLogin;
			lastModifiedByUserLogin = (UserLogin)eResolveProxy(oldLastModifiedByUserLogin);
			if (lastModifiedByUserLogin != oldLastModifiedByUserLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
			}
		}
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		UserLogin oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LAST_MODIFIED_DATE, oldLastModifiedDate, lastModifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		String oldLongDescription = longDescription;
		longDescription = newLongDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LONG_DESCRIPTION, oldLongDescription, longDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLotIdFilledIn() {
		return lotIdFilledIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLotIdFilledIn(String newLotIdFilledIn) {
		String oldLotIdFilledIn = lotIdFilledIn;
		lotIdFilledIn = newLotIdFilledIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LOT_ID_FILLED_IN, oldLotIdFilledIn, lotIdFilledIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediumImageUrl(String newMediumImageUrl) {
		String oldMediumImageUrl = mediumImageUrl;
		mediumImageUrl = newMediumImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__MEDIUM_IMAGE_URL, oldMediumImageUrl, mediumImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrderDecimalQuantity() {
		return orderDecimalQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDecimalQuantity(boolean newOrderDecimalQuantity) {
		boolean oldOrderDecimalQuantity = orderDecimalQuantity;
		orderDecimalQuantity = newOrderDecimalQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__ORDER_DECIMAL_QUANTITY, oldOrderDecimalQuantity, orderDecimalQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getOriginGeoId() {
		if (originGeoId != null && ((EObject)originGeoId).eIsProxy()) {
			InternalEObject oldOriginGeoId = (InternalEObject)originGeoId;
			originGeoId = (Geo)eResolveProxy(oldOriginGeoId);
			if (originGeoId != oldOriginGeoId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__ORIGIN_GEO_ID, oldOriginGeoId, originGeoId));
			}
		}
		return originGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetOriginGeoId() {
		return originGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginGeoId(Geo newOriginGeoId) {
		Geo oldOriginGeoId = originGeoId;
		originGeoId = newOriginGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__ORIGIN_GEO_ID, oldOriginGeoId, originGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalImageUrl() {
		return originalImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalImageUrl(String newOriginalImageUrl) {
		String oldOriginalImageUrl = originalImageUrl;
		originalImageUrl = newOriginalImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__ORIGINAL_IMAGE_URL, oldOriginalImageUrl, originalImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPiecesIncluded() {
		return piecesIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPiecesIncluded(long newPiecesIncluded) {
		long oldPiecesIncluded = piecesIncluded;
		piecesIncluded = newPiecesIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PIECES_INCLUDED, oldPiecesIncluded, piecesIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriceDetailText() {
		return priceDetailText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceDetailText(String newPriceDetailText) {
		String oldPriceDetailText = priceDetailText;
		priceDetailText = newPriceDetailText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRICE_DETAIL_TEXT, oldPriceDetailText, priceDetailText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductDepth() {
		return productDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductDepth(BigDecimal newProductDepth) {
		BigDecimal oldProductDepth = productDepth;
		productDepth = newProductDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_DEPTH, oldProductDepth, productDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductDiameter() {
		return productDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductDiameter(BigDecimal newProductDiameter) {
		BigDecimal oldProductDiameter = productDiameter;
		productDiameter = newProductDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_DIAMETER, oldProductDiameter, productDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductHeight() {
		return productHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductHeight(BigDecimal newProductHeight) {
		BigDecimal oldProductHeight = productHeight;
		productHeight = newProductHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_HEIGHT, oldProductHeight, productHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductRating() {
		return productRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductRating(BigDecimal newProductRating) {
		BigDecimal oldProductRating = productRating;
		productRating = newProductRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_RATING, oldProductRating, productRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductWeight() {
		return productWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductWeight(BigDecimal newProductWeight) {
		BigDecimal oldProductWeight = productWeight;
		productWeight = newProductWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_WEIGHT, oldProductWeight, productWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductWidth() {
		return productWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductWidth(BigDecimal newProductWidth) {
		BigDecimal oldProductWidth = productWidth;
		productWidth = newProductWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_WIDTH, oldProductWidth, productWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityIncluded() {
		return quantityIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityIncluded(BigDecimal newQuantityIncluded) {
		BigDecimal oldQuantityIncluded = quantityIncluded;
		quantityIncluded = newQuantityIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__QUANTITY_INCLUDED, oldQuantityIncluded, quantityIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUomId() {
		if (quantityUomId != null && ((EObject)quantityUomId).eIsProxy()) {
			InternalEObject oldQuantityUomId = (InternalEObject)quantityUomId;
			quantityUomId = (Uom)eResolveProxy(oldQuantityUomId);
			if (quantityUomId != oldQuantityUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__QUANTITY_UOM_ID, oldQuantityUomId, quantityUomId));
			}
		}
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetQuantityUomId() {
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUomId(Uom newQuantityUomId) {
		Uom oldQuantityUomId = quantityUomId;
		quantityUomId = newQuantityUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__QUANTITY_UOM_ID, oldQuantityUomId, quantityUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRatingTypeEnum() {
		if (ratingTypeEnum != null && ((EObject)ratingTypeEnum).eIsProxy()) {
			InternalEObject oldRatingTypeEnum = (InternalEObject)ratingTypeEnum;
			ratingTypeEnum = (Enumeration)eResolveProxy(oldRatingTypeEnum);
			if (ratingTypeEnum != oldRatingTypeEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__RATING_TYPE_ENUM, oldRatingTypeEnum, ratingTypeEnum));
			}
		}
		return ratingTypeEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetRatingTypeEnum() {
		return ratingTypeEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRatingTypeEnum(Enumeration newRatingTypeEnum) {
		Enumeration oldRatingTypeEnum = ratingTypeEnum;
		ratingTypeEnum = newRatingTypeEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__RATING_TYPE_ENUM, oldRatingTypeEnum, ratingTypeEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(Date newReleaseDate) {
		Date oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireAmount() {
		return requireAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireAmount(boolean newRequireAmount) {
		boolean oldRequireAmount = requireAmount;
		requireAmount = newRequireAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__REQUIRE_AMOUNT, oldRequireAmount, requireAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireInventory() {
		return requireInventory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireInventory(boolean newRequireInventory) {
		boolean oldRequireInventory = requireInventory;
		requireInventory = newRequireInventory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__REQUIRE_INVENTORY, oldRequireInventory, requireInventory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRequirementMethodEnumId() {
		if (requirementMethodEnumId != null && ((EObject)requirementMethodEnumId).eIsProxy()) {
			InternalEObject oldRequirementMethodEnumId = (InternalEObject)requirementMethodEnumId;
			requirementMethodEnumId = (Enumeration)eResolveProxy(oldRequirementMethodEnumId);
			if (requirementMethodEnumId != oldRequirementMethodEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__REQUIREMENT_METHOD_ENUM_ID, oldRequirementMethodEnumId, requirementMethodEnumId));
			}
		}
		return requirementMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetRequirementMethodEnumId() {
		return requirementMethodEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementMethodEnumId(Enumeration newRequirementMethodEnumId) {
		Enumeration oldRequirementMethodEnumId = requirementMethodEnumId;
		requirementMethodEnumId = newRequirementMethodEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__REQUIREMENT_METHOD_ENUM_ID, oldRequirementMethodEnumId, requirementMethodEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReserv2ndPPPerc() {
		return reserv2ndPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserv2ndPPPerc(BigDecimal newReserv2ndPPPerc) {
		BigDecimal oldReserv2ndPPPerc = reserv2ndPPPerc;
		reserv2ndPPPerc = newReserv2ndPPPerc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__RESERV2ND_PP_PERC, oldReserv2ndPPPerc, reserv2ndPPPerc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservMaxPersons() {
		return reservMaxPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservMaxPersons(BigDecimal newReservMaxPersons) {
		BigDecimal oldReservMaxPersons = reservMaxPersons;
		reservMaxPersons = newReservMaxPersons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__RESERV_MAX_PERSONS, oldReservMaxPersons, reservMaxPersons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservNthPPPerc() {
		return reservNthPPPerc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservNthPPPerc(BigDecimal newReservNthPPPerc) {
		BigDecimal oldReservNthPPPerc = reservNthPPPerc;
		reservNthPPPerc = newReservNthPPPerc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__RESERV_NTH_PP_PERC, oldReservNthPPPerc, reservNthPPPerc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReturnable() {
		return returnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnable(boolean newReturnable) {
		boolean oldReturnable = returnable;
		returnable = newReturnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__RETURNABLE, oldReturnable, returnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSalesDiscWhenNotAvail() {
		return salesDiscWhenNotAvail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesDiscWhenNotAvail(boolean newSalesDiscWhenNotAvail) {
		boolean oldSalesDiscWhenNotAvail = salesDiscWhenNotAvail;
		salesDiscWhenNotAvail = newSalesDiscWhenNotAvail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SALES_DISC_WHEN_NOT_AVAIL, oldSalesDiscWhenNotAvail, salesDiscWhenNotAvail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSalesDiscontinuationDate() {
		return salesDiscontinuationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesDiscontinuationDate(Date newSalesDiscontinuationDate) {
		Date oldSalesDiscontinuationDate = salesDiscontinuationDate;
		salesDiscontinuationDate = newSalesDiscontinuationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SALES_DISCONTINUATION_DATE, oldSalesDiscontinuationDate, salesDiscontinuationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingDepth() {
		return shippingDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingDepth(BigDecimal newShippingDepth) {
		BigDecimal oldShippingDepth = shippingDepth;
		shippingDepth = newShippingDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SHIPPING_DEPTH, oldShippingDepth, shippingDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingHeight() {
		return shippingHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingHeight(BigDecimal newShippingHeight) {
		BigDecimal oldShippingHeight = shippingHeight;
		shippingHeight = newShippingHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SHIPPING_HEIGHT, oldShippingHeight, shippingHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingWeight() {
		return shippingWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingWeight(BigDecimal newShippingWeight) {
		BigDecimal oldShippingWeight = shippingWeight;
		shippingWeight = newShippingWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SHIPPING_WEIGHT, oldShippingWeight, shippingWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingWidth() {
		return shippingWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingWidth(BigDecimal newShippingWidth) {
		BigDecimal oldShippingWidth = shippingWidth;
		shippingWidth = newShippingWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SHIPPING_WIDTH, oldShippingWidth, shippingWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmallImageUrl() {
		return smallImageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmallImageUrl(String newSmallImageUrl) {
		String oldSmallImageUrl = smallImageUrl;
		smallImageUrl = newSmallImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SMALL_IMAGE_URL, oldSmallImageUrl, smallImageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSupportDiscontinuationDate() {
		return supportDiscontinuationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportDiscontinuationDate(Date newSupportDiscontinuationDate) {
		Date oldSupportDiscontinuationDate = supportDiscontinuationDate;
		supportDiscontinuationDate = newSupportDiscontinuationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SUPPORT_DISCONTINUATION_DATE, oldSupportDiscontinuationDate, supportDiscontinuationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxable() {
		return taxable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxable(boolean newTaxable) {
		boolean oldTaxable = taxable;
		taxable = newTaxable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__TAXABLE, oldTaxable, taxable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getVirtualVariantMethodEnum() {
		if (virtualVariantMethodEnum != null && ((EObject)virtualVariantMethodEnum).eIsProxy()) {
			InternalEObject oldVirtualVariantMethodEnum = (InternalEObject)virtualVariantMethodEnum;
			virtualVariantMethodEnum = (Enumeration)eResolveProxy(oldVirtualVariantMethodEnum);
			if (virtualVariantMethodEnum != oldVirtualVariantMethodEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM, oldVirtualVariantMethodEnum, virtualVariantMethodEnum));
			}
		}
		return virtualVariantMethodEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetVirtualVariantMethodEnum() {
		return virtualVariantMethodEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualVariantMethodEnum(Enumeration newVirtualVariantMethodEnum) {
		Enumeration oldVirtualVariantMethodEnum = virtualVariantMethodEnum;
		virtualVariantMethodEnum = newVirtualVariantMethodEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM, oldVirtualVariantMethodEnum, virtualVariantMethodEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWeightUomId() {
		if (weightUomId != null && ((EObject)weightUomId).eIsProxy()) {
			InternalEObject oldWeightUomId = (InternalEObject)weightUomId;
			weightUomId = (Uom)eResolveProxy(oldWeightUomId);
			if (weightUomId != oldWeightUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__WEIGHT_UOM_ID, oldWeightUomId, weightUomId));
			}
		}
		return weightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetWeightUomId() {
		return weightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUomId(Uom newWeightUomId) {
		Uom oldWeightUomId = weightUomId;
		weightUomId = newWeightUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__WEIGHT_UOM_ID, oldWeightUomId, weightUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWidthUomId() {
		if (widthUomId != null && ((EObject)widthUomId).eIsProxy()) {
			InternalEObject oldWidthUomId = (InternalEObject)widthUomId;
			widthUomId = (Uom)eResolveProxy(oldWidthUomId);
			if (widthUomId != oldWidthUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__WIDTH_UOM_ID, oldWidthUomId, widthUomId));
			}
		}
		return widthUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetWidthUomId() {
		return widthUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidthUomId(Uom newWidthUomId) {
		Uom oldWidthUomId = widthUomId;
		widthUomId = newWidthUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__WIDTH_UOM_ID, oldWidthUomId, widthUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getCommunicationEventProducts() {
		if (communicationEventProducts == null) {
			communicationEventProducts = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.PRODUCT__COMMUNICATION_EVENT_PRODUCTS);
		}
		return communicationEventProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductAttributes() {
		if (productAttributes == null) {
			productAttributes = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.PRODUCT__PRODUCT_ATTRIBUTES);
		}
		return productAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductFacilities() {
		if (productFacilities == null) {
			productFacilities = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.PRODUCT__PRODUCT_FACILITIES);
		}
		return productFacilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductGeos() {
		if (productGeos == null) {
			productGeos = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.PRODUCT__PRODUCT_GEOS);
		}
		return productGeos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductMaints() {
		if (productMaints == null) {
			productMaints = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.PRODUCT__PRODUCT_MAINTS);
		}
		return productMaints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductMeters() {
		if (productMeters == null) {
			productMeters = new EDataTypeUniqueEList<String>(String.class, this, ProductPackage.PRODUCT__PRODUCT_METERS);
		}
		return productMeters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> agreements() {
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
	public List<String> cartAbandonedLines() {
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
	public List<String> costComponents() {
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
	public List<String> custRequestItems() {
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
	public List<String> goodIdentifications() {
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
	public List<String> instanceOfFixedAssets() {
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
	public List<String> inventoryItems() {
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
	public List<String> invoiceItems() {
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
	public List<String> orderItems() {
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
	public List<String> productForProductManufacturingRules() {
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
	public List<String> productGroupOrders() {
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
	public List<String> productInProductManufacturingRules() {
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
	public List<String> productManufacturingRules() {
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
	public List<String> productProductConfigStatss() {
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
	public List<String> productReviews() {
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
	public List<String> productStoreSurveyAppls() {
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
	public List<String> productSubstProductManufacturingRules() {
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
	public List<String> quoteItems() {
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
	public List<String> reorderGuidelines() {
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
	public List<String> requirements() {
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
	public List<String> returnItems() {
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
	public List<String> salesForecastDetails() {
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
	public List<String> shipmentItems() {
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
	public List<String> shipmentReceipts() {
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
	public List<String> shoppingListItems() {
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
	public List<String> subscriptions() {
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
	public ProductType getProductTypeId() {
		if (productTypeId != null && ((EObject)productTypeId).eIsProxy()) {
			InternalEObject oldProductTypeId = (InternalEObject)productTypeId;
			productTypeId = (ProductType)eResolveProxy(oldProductTypeId);
			if (productTypeId != oldProductTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__PRODUCT_TYPE_ID, oldProductTypeId, productTypeId));
			}
		}
		return productTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType basicGetProductTypeId() {
		return productTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductTypeId(ProductType newProductTypeId) {
		ProductType oldProductTypeId = productTypeId;
		productTypeId = newProductTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_TYPE_ID, oldProductTypeId, productTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getPrimaryProductCategoryId() {
		if (primaryProductCategoryId != null && ((EObject)primaryProductCategoryId).eIsProxy()) {
			InternalEObject oldPrimaryProductCategoryId = (InternalEObject)primaryProductCategoryId;
			primaryProductCategoryId = (ProductCategory)eResolveProxy(oldPrimaryProductCategoryId);
			if (primaryProductCategoryId != oldPrimaryProductCategoryId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID, oldPrimaryProductCategoryId, primaryProductCategoryId));
			}
		}
		return primaryProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetPrimaryProductCategoryId() {
		return primaryProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryProductCategoryId(ProductCategory newPrimaryProductCategoryId) {
		ProductCategory oldPrimaryProductCategoryId = primaryProductCategoryId;
		primaryProductCategoryId = newPrimaryProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID, oldPrimaryProductCategoryId, primaryProductCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__FACILITY_ID, oldFacilityId, facilityId));
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		Facility oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType getInventoryItemTypeId() {
		if (inventoryItemTypeId != null && ((EObject)inventoryItemTypeId).eIsProxy()) {
			InternalEObject oldInventoryItemTypeId = (InternalEObject)inventoryItemTypeId;
			inventoryItemTypeId = (InventoryItemType)eResolveProxy(oldInventoryItemTypeId);
			if (inventoryItemTypeId != oldInventoryItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT__INVENTORY_ITEM_TYPE_ID, oldInventoryItemTypeId, inventoryItemTypeId));
			}
		}
		return inventoryItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemType basicGetInventoryItemTypeId() {
		return inventoryItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemTypeId(InventoryItemType newInventoryItemTypeId) {
		InventoryItemType oldInventoryItemTypeId = inventoryItemTypeId;
		inventoryItemTypeId = newInventoryItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__INVENTORY_ITEM_TYPE_ID, oldInventoryItemTypeId, inventoryItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT__PRODUCT_ID:
				return getProductId();
			case ProductPackage.PRODUCT__AUTO_CREATE_KEYWORDS:
				return isAutoCreateKeywords();
			case ProductPackage.PRODUCT__BILL_OF_MATERIAL_LEVEL:
				return getBillOfMaterialLevel();
			case ProductPackage.PRODUCT__BRAND_NAME:
				return getBrandName();
			case ProductPackage.PRODUCT__CHARGE_SHIPPING:
				return isChargeShipping();
			case ProductPackage.PRODUCT__COMMENTS:
				return getComments();
			case ProductPackage.PRODUCT__CONFIG_ID:
				return getConfigId();
			case ProductPackage.PRODUCT__CREATED_DATE:
				return getCreatedDate();
			case ProductPackage.PRODUCT__DESCRIPTION:
				return getDescription();
			case ProductPackage.PRODUCT__DETAIL_IMAGE_URL:
				return getDetailImageUrl();
			case ProductPackage.PRODUCT__DETAIL_SCREEN:
				return getDetailScreen();
			case ProductPackage.PRODUCT__FIXED_AMOUNT:
				return getFixedAmount();
			case ProductPackage.PRODUCT__IN_SHIPPING_BOX:
				return isInShippingBox();
			case ProductPackage.PRODUCT__INCLUDE_IN_PROMOTIONS:
				return isIncludeInPromotions();
			case ProductPackage.PRODUCT__INTERNAL_NAME:
				return getInternalName();
			case ProductPackage.PRODUCT__INTRODUCTION_DATE:
				return getIntroductionDate();
			case ProductPackage.PRODUCT__INVENTORY_MESSAGE:
				return getInventoryMessage();
			case ProductPackage.PRODUCT__IS_VARIANT:
				return isIsVariant();
			case ProductPackage.PRODUCT__IS_VIRTUAL:
				return isIsVirtual();
			case ProductPackage.PRODUCT__LARGE_IMAGE_URL:
				return getLargeImageUrl();
			case ProductPackage.PRODUCT__LAST_MODIFIED_DATE:
				return getLastModifiedDate();
			case ProductPackage.PRODUCT__LONG_DESCRIPTION:
				return getLongDescription();
			case ProductPackage.PRODUCT__LOT_ID_FILLED_IN:
				return getLotIdFilledIn();
			case ProductPackage.PRODUCT__MEDIUM_IMAGE_URL:
				return getMediumImageUrl();
			case ProductPackage.PRODUCT__ORDER_DECIMAL_QUANTITY:
				return isOrderDecimalQuantity();
			case ProductPackage.PRODUCT__ORIGINAL_IMAGE_URL:
				return getOriginalImageUrl();
			case ProductPackage.PRODUCT__PIECES_INCLUDED:
				return getPiecesIncluded();
			case ProductPackage.PRODUCT__PRICE_DETAIL_TEXT:
				return getPriceDetailText();
			case ProductPackage.PRODUCT__PRODUCT_DEPTH:
				return getProductDepth();
			case ProductPackage.PRODUCT__PRODUCT_DIAMETER:
				return getProductDiameter();
			case ProductPackage.PRODUCT__PRODUCT_HEIGHT:
				return getProductHeight();
			case ProductPackage.PRODUCT__PRODUCT_NAME:
				return getProductName();
			case ProductPackage.PRODUCT__PRODUCT_RATING:
				return getProductRating();
			case ProductPackage.PRODUCT__PRODUCT_WEIGHT:
				return getProductWeight();
			case ProductPackage.PRODUCT__PRODUCT_WIDTH:
				return getProductWidth();
			case ProductPackage.PRODUCT__QUANTITY_INCLUDED:
				return getQuantityIncluded();
			case ProductPackage.PRODUCT__RELEASE_DATE:
				return getReleaseDate();
			case ProductPackage.PRODUCT__REQUIRE_AMOUNT:
				return isRequireAmount();
			case ProductPackage.PRODUCT__REQUIRE_INVENTORY:
				return isRequireInventory();
			case ProductPackage.PRODUCT__RESERV2ND_PP_PERC:
				return getReserv2ndPPPerc();
			case ProductPackage.PRODUCT__RESERV_MAX_PERSONS:
				return getReservMaxPersons();
			case ProductPackage.PRODUCT__RESERV_NTH_PP_PERC:
				return getReservNthPPPerc();
			case ProductPackage.PRODUCT__RETURNABLE:
				return isReturnable();
			case ProductPackage.PRODUCT__SALES_DISC_WHEN_NOT_AVAIL:
				return isSalesDiscWhenNotAvail();
			case ProductPackage.PRODUCT__SALES_DISCONTINUATION_DATE:
				return getSalesDiscontinuationDate();
			case ProductPackage.PRODUCT__SHIPPING_DEPTH:
				return getShippingDepth();
			case ProductPackage.PRODUCT__SHIPPING_HEIGHT:
				return getShippingHeight();
			case ProductPackage.PRODUCT__SHIPPING_WEIGHT:
				return getShippingWeight();
			case ProductPackage.PRODUCT__SHIPPING_WIDTH:
				return getShippingWidth();
			case ProductPackage.PRODUCT__SMALL_IMAGE_URL:
				return getSmallImageUrl();
			case ProductPackage.PRODUCT__SUPPORT_DISCONTINUATION_DATE:
				return getSupportDiscontinuationDate();
			case ProductPackage.PRODUCT__TAXABLE:
				return isTaxable();
			case ProductPackage.PRODUCT__PRODUCT_TYPE_ID:
				if (resolve) return getProductTypeId();
				return basicGetProductTypeId();
			case ProductPackage.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID:
				if (resolve) return getPrimaryProductCategoryId();
				return basicGetPrimaryProductCategoryId();
			case ProductPackage.PRODUCT__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case ProductPackage.PRODUCT__QUANTITY_UOM_ID:
				if (resolve) return getQuantityUomId();
				return basicGetQuantityUomId();
			case ProductPackage.PRODUCT__AMOUNT_UOM_TYPE_ID:
				if (resolve) return getAmountUomTypeId();
				return basicGetAmountUomTypeId();
			case ProductPackage.PRODUCT__WEIGHT_UOM_ID:
				if (resolve) return getWeightUomId();
				return basicGetWeightUomId();
			case ProductPackage.PRODUCT__HEIGHT_UOM_ID:
				if (resolve) return getHeightUomId();
				return basicGetHeightUomId();
			case ProductPackage.PRODUCT__WIDTH_UOM_ID:
				if (resolve) return getWidthUomId();
				return basicGetWidthUomId();
			case ProductPackage.PRODUCT__DEPTH_UOM_ID:
				if (resolve) return getDepthUomId();
				return basicGetDepthUomId();
			case ProductPackage.PRODUCT__DIAMETER_UOM_ID:
				if (resolve) return getDiameterUomId();
				return basicGetDiameterUomId();
			case ProductPackage.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM:
				if (resolve) return getVirtualVariantMethodEnum();
				return basicGetVirtualVariantMethodEnum();
			case ProductPackage.PRODUCT__RATING_TYPE_ENUM:
				if (resolve) return getRatingTypeEnum();
				return basicGetRatingTypeEnum();
			case ProductPackage.PRODUCT__REQUIREMENT_METHOD_ENUM_ID:
				if (resolve) return getRequirementMethodEnumId();
				return basicGetRequirementMethodEnumId();
			case ProductPackage.PRODUCT__ORIGIN_GEO_ID:
				if (resolve) return getOriginGeoId();
				return basicGetOriginGeoId();
			case ProductPackage.PRODUCT__CREATED_BY_USER_LOGIN:
				if (resolve) return getCreatedByUserLogin();
				return basicGetCreatedByUserLogin();
			case ProductPackage.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN:
				if (resolve) return getLastModifiedByUserLogin();
				return basicGetLastModifiedByUserLogin();
			case ProductPackage.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID:
				if (resolve) return getDefaultShipmentBoxTypeId();
				return basicGetDefaultShipmentBoxTypeId();
			case ProductPackage.PRODUCT__INVENTORY_ITEM_TYPE_ID:
				if (resolve) return getInventoryItemTypeId();
				return basicGetInventoryItemTypeId();
			case ProductPackage.PRODUCT__COMMUNICATION_EVENT_PRODUCTS:
				return getCommunicationEventProducts();
			case ProductPackage.PRODUCT__PRODUCT_ATTRIBUTES:
				return getProductAttributes();
			case ProductPackage.PRODUCT__PRODUCT_FACILITIES:
				return getProductFacilities();
			case ProductPackage.PRODUCT__PRODUCT_GEOS:
				return getProductGeos();
			case ProductPackage.PRODUCT__PRODUCT_MAINTS:
				return getProductMaints();
			case ProductPackage.PRODUCT__PRODUCT_METERS:
				return getProductMeters();
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
			case ProductPackage.PRODUCT__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ProductPackage.PRODUCT__AUTO_CREATE_KEYWORDS:
				setAutoCreateKeywords((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__BILL_OF_MATERIAL_LEVEL:
				setBillOfMaterialLevel((Long)newValue);
				return;
			case ProductPackage.PRODUCT__BRAND_NAME:
				setBrandName((String)newValue);
				return;
			case ProductPackage.PRODUCT__CHARGE_SHIPPING:
				setChargeShipping((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__COMMENTS:
				setComments((String)newValue);
				return;
			case ProductPackage.PRODUCT__CONFIG_ID:
				setConfigId((String)newValue);
				return;
			case ProductPackage.PRODUCT__CREATED_DATE:
				setCreatedDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProductPackage.PRODUCT__DETAIL_IMAGE_URL:
				setDetailImageUrl((String)newValue);
				return;
			case ProductPackage.PRODUCT__DETAIL_SCREEN:
				setDetailScreen((String)newValue);
				return;
			case ProductPackage.PRODUCT__FIXED_AMOUNT:
				setFixedAmount((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__IN_SHIPPING_BOX:
				setInShippingBox((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__INCLUDE_IN_PROMOTIONS:
				setIncludeInPromotions((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__INTERNAL_NAME:
				setInternalName((String)newValue);
				return;
			case ProductPackage.PRODUCT__INTRODUCTION_DATE:
				setIntroductionDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT__INVENTORY_MESSAGE:
				setInventoryMessage((String)newValue);
				return;
			case ProductPackage.PRODUCT__IS_VARIANT:
				setIsVariant((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__IS_VIRTUAL:
				setIsVirtual((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__LARGE_IMAGE_URL:
				setLargeImageUrl((String)newValue);
				return;
			case ProductPackage.PRODUCT__LAST_MODIFIED_DATE:
				setLastModifiedDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT__LONG_DESCRIPTION:
				setLongDescription((String)newValue);
				return;
			case ProductPackage.PRODUCT__LOT_ID_FILLED_IN:
				setLotIdFilledIn((String)newValue);
				return;
			case ProductPackage.PRODUCT__MEDIUM_IMAGE_URL:
				setMediumImageUrl((String)newValue);
				return;
			case ProductPackage.PRODUCT__ORDER_DECIMAL_QUANTITY:
				setOrderDecimalQuantity((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__ORIGINAL_IMAGE_URL:
				setOriginalImageUrl((String)newValue);
				return;
			case ProductPackage.PRODUCT__PIECES_INCLUDED:
				setPiecesIncluded((Long)newValue);
				return;
			case ProductPackage.PRODUCT__PRICE_DETAIL_TEXT:
				setPriceDetailText((String)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_DEPTH:
				setProductDepth((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_DIAMETER:
				setProductDiameter((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_HEIGHT:
				setProductHeight((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_RATING:
				setProductRating((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_WEIGHT:
				setProductWeight((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_WIDTH:
				setProductWidth((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__QUANTITY_INCLUDED:
				setQuantityIncluded((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__RELEASE_DATE:
				setReleaseDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT__REQUIRE_AMOUNT:
				setRequireAmount((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__REQUIRE_INVENTORY:
				setRequireInventory((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__RESERV2ND_PP_PERC:
				setReserv2ndPPPerc((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__RESERV_MAX_PERSONS:
				setReservMaxPersons((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__RESERV_NTH_PP_PERC:
				setReservNthPPPerc((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__RETURNABLE:
				setReturnable((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__SALES_DISC_WHEN_NOT_AVAIL:
				setSalesDiscWhenNotAvail((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__SALES_DISCONTINUATION_DATE:
				setSalesDiscontinuationDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT__SHIPPING_DEPTH:
				setShippingDepth((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__SHIPPING_HEIGHT:
				setShippingHeight((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__SHIPPING_WEIGHT:
				setShippingWeight((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__SHIPPING_WIDTH:
				setShippingWidth((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT__SMALL_IMAGE_URL:
				setSmallImageUrl((String)newValue);
				return;
			case ProductPackage.PRODUCT__SUPPORT_DISCONTINUATION_DATE:
				setSupportDiscontinuationDate((Date)newValue);
				return;
			case ProductPackage.PRODUCT__TAXABLE:
				setTaxable((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_TYPE_ID:
				setProductTypeId((ProductType)newValue);
				return;
			case ProductPackage.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID:
				setPrimaryProductCategoryId((ProductCategory)newValue);
				return;
			case ProductPackage.PRODUCT__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case ProductPackage.PRODUCT__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)newValue);
				return;
			case ProductPackage.PRODUCT__AMOUNT_UOM_TYPE_ID:
				setAmountUomTypeId((UomType)newValue);
				return;
			case ProductPackage.PRODUCT__WEIGHT_UOM_ID:
				setWeightUomId((Uom)newValue);
				return;
			case ProductPackage.PRODUCT__HEIGHT_UOM_ID:
				setHeightUomId((Uom)newValue);
				return;
			case ProductPackage.PRODUCT__WIDTH_UOM_ID:
				setWidthUomId((Uom)newValue);
				return;
			case ProductPackage.PRODUCT__DEPTH_UOM_ID:
				setDepthUomId((Uom)newValue);
				return;
			case ProductPackage.PRODUCT__DIAMETER_UOM_ID:
				setDiameterUomId((Uom)newValue);
				return;
			case ProductPackage.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM:
				setVirtualVariantMethodEnum((Enumeration)newValue);
				return;
			case ProductPackage.PRODUCT__RATING_TYPE_ENUM:
				setRatingTypeEnum((Enumeration)newValue);
				return;
			case ProductPackage.PRODUCT__REQUIREMENT_METHOD_ENUM_ID:
				setRequirementMethodEnumId((Enumeration)newValue);
				return;
			case ProductPackage.PRODUCT__ORIGIN_GEO_ID:
				setOriginGeoId((Geo)newValue);
				return;
			case ProductPackage.PRODUCT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)newValue);
				return;
			case ProductPackage.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)newValue);
				return;
			case ProductPackage.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID:
				setDefaultShipmentBoxTypeId((ShipmentBoxType)newValue);
				return;
			case ProductPackage.PRODUCT__INVENTORY_ITEM_TYPE_ID:
				setInventoryItemTypeId((InventoryItemType)newValue);
				return;
			case ProductPackage.PRODUCT__COMMUNICATION_EVENT_PRODUCTS:
				getCommunicationEventProducts().clear();
				getCommunicationEventProducts().addAll((Collection<? extends String>)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_ATTRIBUTES:
				getProductAttributes().clear();
				getProductAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_FACILITIES:
				getProductFacilities().clear();
				getProductFacilities().addAll((Collection<? extends String>)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_GEOS:
				getProductGeos().clear();
				getProductGeos().addAll((Collection<? extends String>)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_MAINTS:
				getProductMaints().clear();
				getProductMaints().addAll((Collection<? extends String>)newValue);
				return;
			case ProductPackage.PRODUCT__PRODUCT_METERS:
				getProductMeters().clear();
				getProductMeters().addAll((Collection<? extends String>)newValue);
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
			case ProductPackage.PRODUCT__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__AUTO_CREATE_KEYWORDS:
				setAutoCreateKeywords(AUTO_CREATE_KEYWORDS_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__BILL_OF_MATERIAL_LEVEL:
				setBillOfMaterialLevel(BILL_OF_MATERIAL_LEVEL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__BRAND_NAME:
				setBrandName(BRAND_NAME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__CHARGE_SHIPPING:
				setChargeShipping(CHARGE_SHIPPING_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__CONFIG_ID:
				setConfigId(CONFIG_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__DETAIL_IMAGE_URL:
				setDetailImageUrl(DETAIL_IMAGE_URL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__DETAIL_SCREEN:
				setDetailScreen(DETAIL_SCREEN_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__FIXED_AMOUNT:
				setFixedAmount(FIXED_AMOUNT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__IN_SHIPPING_BOX:
				setInShippingBox(IN_SHIPPING_BOX_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__INCLUDE_IN_PROMOTIONS:
				setIncludeInPromotions(INCLUDE_IN_PROMOTIONS_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__INTERNAL_NAME:
				setInternalName(INTERNAL_NAME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__INTRODUCTION_DATE:
				setIntroductionDate(INTRODUCTION_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__INVENTORY_MESSAGE:
				setInventoryMessage(INVENTORY_MESSAGE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__IS_VARIANT:
				setIsVariant(IS_VARIANT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__IS_VIRTUAL:
				setIsVirtual(IS_VIRTUAL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__LARGE_IMAGE_URL:
				setLargeImageUrl(LARGE_IMAGE_URL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__LAST_MODIFIED_DATE:
				setLastModifiedDate(LAST_MODIFIED_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__LONG_DESCRIPTION:
				setLongDescription(LONG_DESCRIPTION_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__LOT_ID_FILLED_IN:
				setLotIdFilledIn(LOT_ID_FILLED_IN_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__MEDIUM_IMAGE_URL:
				setMediumImageUrl(MEDIUM_IMAGE_URL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__ORDER_DECIMAL_QUANTITY:
				setOrderDecimalQuantity(ORDER_DECIMAL_QUANTITY_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__ORIGINAL_IMAGE_URL:
				setOriginalImageUrl(ORIGINAL_IMAGE_URL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PIECES_INCLUDED:
				setPiecesIncluded(PIECES_INCLUDED_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRICE_DETAIL_TEXT:
				setPriceDetailText(PRICE_DETAIL_TEXT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_DEPTH:
				setProductDepth(PRODUCT_DEPTH_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_DIAMETER:
				setProductDiameter(PRODUCT_DIAMETER_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_HEIGHT:
				setProductHeight(PRODUCT_HEIGHT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_RATING:
				setProductRating(PRODUCT_RATING_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_WEIGHT:
				setProductWeight(PRODUCT_WEIGHT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_WIDTH:
				setProductWidth(PRODUCT_WIDTH_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__QUANTITY_INCLUDED:
				setQuantityIncluded(QUANTITY_INCLUDED_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__REQUIRE_AMOUNT:
				setRequireAmount(REQUIRE_AMOUNT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__REQUIRE_INVENTORY:
				setRequireInventory(REQUIRE_INVENTORY_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__RESERV2ND_PP_PERC:
				setReserv2ndPPPerc(RESERV2ND_PP_PERC_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__RESERV_MAX_PERSONS:
				setReservMaxPersons(RESERV_MAX_PERSONS_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__RESERV_NTH_PP_PERC:
				setReservNthPPPerc(RESERV_NTH_PP_PERC_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__RETURNABLE:
				setReturnable(RETURNABLE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SALES_DISC_WHEN_NOT_AVAIL:
				setSalesDiscWhenNotAvail(SALES_DISC_WHEN_NOT_AVAIL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SALES_DISCONTINUATION_DATE:
				setSalesDiscontinuationDate(SALES_DISCONTINUATION_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SHIPPING_DEPTH:
				setShippingDepth(SHIPPING_DEPTH_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SHIPPING_HEIGHT:
				setShippingHeight(SHIPPING_HEIGHT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SHIPPING_WEIGHT:
				setShippingWeight(SHIPPING_WEIGHT_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SHIPPING_WIDTH:
				setShippingWidth(SHIPPING_WIDTH_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SMALL_IMAGE_URL:
				setSmallImageUrl(SMALL_IMAGE_URL_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__SUPPORT_DISCONTINUATION_DATE:
				setSupportDiscontinuationDate(SUPPORT_DISCONTINUATION_DATE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__TAXABLE:
				setTaxable(TAXABLE_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__PRODUCT_TYPE_ID:
				setProductTypeId((ProductType)null);
				return;
			case ProductPackage.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID:
				setPrimaryProductCategoryId((ProductCategory)null);
				return;
			case ProductPackage.PRODUCT__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case ProductPackage.PRODUCT__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)null);
				return;
			case ProductPackage.PRODUCT__AMOUNT_UOM_TYPE_ID:
				setAmountUomTypeId((UomType)null);
				return;
			case ProductPackage.PRODUCT__WEIGHT_UOM_ID:
				setWeightUomId((Uom)null);
				return;
			case ProductPackage.PRODUCT__HEIGHT_UOM_ID:
				setHeightUomId((Uom)null);
				return;
			case ProductPackage.PRODUCT__WIDTH_UOM_ID:
				setWidthUomId((Uom)null);
				return;
			case ProductPackage.PRODUCT__DEPTH_UOM_ID:
				setDepthUomId((Uom)null);
				return;
			case ProductPackage.PRODUCT__DIAMETER_UOM_ID:
				setDiameterUomId((Uom)null);
				return;
			case ProductPackage.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM:
				setVirtualVariantMethodEnum((Enumeration)null);
				return;
			case ProductPackage.PRODUCT__RATING_TYPE_ENUM:
				setRatingTypeEnum((Enumeration)null);
				return;
			case ProductPackage.PRODUCT__REQUIREMENT_METHOD_ENUM_ID:
				setRequirementMethodEnumId((Enumeration)null);
				return;
			case ProductPackage.PRODUCT__ORIGIN_GEO_ID:
				setOriginGeoId((Geo)null);
				return;
			case ProductPackage.PRODUCT__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((UserLogin)null);
				return;
			case ProductPackage.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((UserLogin)null);
				return;
			case ProductPackage.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID:
				setDefaultShipmentBoxTypeId((ShipmentBoxType)null);
				return;
			case ProductPackage.PRODUCT__INVENTORY_ITEM_TYPE_ID:
				setInventoryItemTypeId((InventoryItemType)null);
				return;
			case ProductPackage.PRODUCT__COMMUNICATION_EVENT_PRODUCTS:
				getCommunicationEventProducts().clear();
				return;
			case ProductPackage.PRODUCT__PRODUCT_ATTRIBUTES:
				getProductAttributes().clear();
				return;
			case ProductPackage.PRODUCT__PRODUCT_FACILITIES:
				getProductFacilities().clear();
				return;
			case ProductPackage.PRODUCT__PRODUCT_GEOS:
				getProductGeos().clear();
				return;
			case ProductPackage.PRODUCT__PRODUCT_MAINTS:
				getProductMaints().clear();
				return;
			case ProductPackage.PRODUCT__PRODUCT_METERS:
				getProductMeters().clear();
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
			case ProductPackage.PRODUCT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ProductPackage.PRODUCT__AUTO_CREATE_KEYWORDS:
				return autoCreateKeywords != AUTO_CREATE_KEYWORDS_EDEFAULT;
			case ProductPackage.PRODUCT__BILL_OF_MATERIAL_LEVEL:
				return billOfMaterialLevel != BILL_OF_MATERIAL_LEVEL_EDEFAULT;
			case ProductPackage.PRODUCT__BRAND_NAME:
				return BRAND_NAME_EDEFAULT == null ? brandName != null : !BRAND_NAME_EDEFAULT.equals(brandName);
			case ProductPackage.PRODUCT__CHARGE_SHIPPING:
				return chargeShipping != CHARGE_SHIPPING_EDEFAULT;
			case ProductPackage.PRODUCT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case ProductPackage.PRODUCT__CONFIG_ID:
				return CONFIG_ID_EDEFAULT == null ? configId != null : !CONFIG_ID_EDEFAULT.equals(configId);
			case ProductPackage.PRODUCT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case ProductPackage.PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProductPackage.PRODUCT__DETAIL_IMAGE_URL:
				return DETAIL_IMAGE_URL_EDEFAULT == null ? detailImageUrl != null : !DETAIL_IMAGE_URL_EDEFAULT.equals(detailImageUrl);
			case ProductPackage.PRODUCT__DETAIL_SCREEN:
				return DETAIL_SCREEN_EDEFAULT == null ? detailScreen != null : !DETAIL_SCREEN_EDEFAULT.equals(detailScreen);
			case ProductPackage.PRODUCT__FIXED_AMOUNT:
				return FIXED_AMOUNT_EDEFAULT == null ? fixedAmount != null : !FIXED_AMOUNT_EDEFAULT.equals(fixedAmount);
			case ProductPackage.PRODUCT__IN_SHIPPING_BOX:
				return inShippingBox != IN_SHIPPING_BOX_EDEFAULT;
			case ProductPackage.PRODUCT__INCLUDE_IN_PROMOTIONS:
				return includeInPromotions != INCLUDE_IN_PROMOTIONS_EDEFAULT;
			case ProductPackage.PRODUCT__INTERNAL_NAME:
				return INTERNAL_NAME_EDEFAULT == null ? internalName != null : !INTERNAL_NAME_EDEFAULT.equals(internalName);
			case ProductPackage.PRODUCT__INTRODUCTION_DATE:
				return INTRODUCTION_DATE_EDEFAULT == null ? introductionDate != null : !INTRODUCTION_DATE_EDEFAULT.equals(introductionDate);
			case ProductPackage.PRODUCT__INVENTORY_MESSAGE:
				return INVENTORY_MESSAGE_EDEFAULT == null ? inventoryMessage != null : !INVENTORY_MESSAGE_EDEFAULT.equals(inventoryMessage);
			case ProductPackage.PRODUCT__IS_VARIANT:
				return isVariant != IS_VARIANT_EDEFAULT;
			case ProductPackage.PRODUCT__IS_VIRTUAL:
				return isVirtual != IS_VIRTUAL_EDEFAULT;
			case ProductPackage.PRODUCT__LARGE_IMAGE_URL:
				return LARGE_IMAGE_URL_EDEFAULT == null ? largeImageUrl != null : !LARGE_IMAGE_URL_EDEFAULT.equals(largeImageUrl);
			case ProductPackage.PRODUCT__LAST_MODIFIED_DATE:
				return LAST_MODIFIED_DATE_EDEFAULT == null ? lastModifiedDate != null : !LAST_MODIFIED_DATE_EDEFAULT.equals(lastModifiedDate);
			case ProductPackage.PRODUCT__LONG_DESCRIPTION:
				return LONG_DESCRIPTION_EDEFAULT == null ? longDescription != null : !LONG_DESCRIPTION_EDEFAULT.equals(longDescription);
			case ProductPackage.PRODUCT__LOT_ID_FILLED_IN:
				return LOT_ID_FILLED_IN_EDEFAULT == null ? lotIdFilledIn != null : !LOT_ID_FILLED_IN_EDEFAULT.equals(lotIdFilledIn);
			case ProductPackage.PRODUCT__MEDIUM_IMAGE_URL:
				return MEDIUM_IMAGE_URL_EDEFAULT == null ? mediumImageUrl != null : !MEDIUM_IMAGE_URL_EDEFAULT.equals(mediumImageUrl);
			case ProductPackage.PRODUCT__ORDER_DECIMAL_QUANTITY:
				return orderDecimalQuantity != ORDER_DECIMAL_QUANTITY_EDEFAULT;
			case ProductPackage.PRODUCT__ORIGINAL_IMAGE_URL:
				return ORIGINAL_IMAGE_URL_EDEFAULT == null ? originalImageUrl != null : !ORIGINAL_IMAGE_URL_EDEFAULT.equals(originalImageUrl);
			case ProductPackage.PRODUCT__PIECES_INCLUDED:
				return piecesIncluded != PIECES_INCLUDED_EDEFAULT;
			case ProductPackage.PRODUCT__PRICE_DETAIL_TEXT:
				return PRICE_DETAIL_TEXT_EDEFAULT == null ? priceDetailText != null : !PRICE_DETAIL_TEXT_EDEFAULT.equals(priceDetailText);
			case ProductPackage.PRODUCT__PRODUCT_DEPTH:
				return PRODUCT_DEPTH_EDEFAULT == null ? productDepth != null : !PRODUCT_DEPTH_EDEFAULT.equals(productDepth);
			case ProductPackage.PRODUCT__PRODUCT_DIAMETER:
				return PRODUCT_DIAMETER_EDEFAULT == null ? productDiameter != null : !PRODUCT_DIAMETER_EDEFAULT.equals(productDiameter);
			case ProductPackage.PRODUCT__PRODUCT_HEIGHT:
				return PRODUCT_HEIGHT_EDEFAULT == null ? productHeight != null : !PRODUCT_HEIGHT_EDEFAULT.equals(productHeight);
			case ProductPackage.PRODUCT__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case ProductPackage.PRODUCT__PRODUCT_RATING:
				return PRODUCT_RATING_EDEFAULT == null ? productRating != null : !PRODUCT_RATING_EDEFAULT.equals(productRating);
			case ProductPackage.PRODUCT__PRODUCT_WEIGHT:
				return PRODUCT_WEIGHT_EDEFAULT == null ? productWeight != null : !PRODUCT_WEIGHT_EDEFAULT.equals(productWeight);
			case ProductPackage.PRODUCT__PRODUCT_WIDTH:
				return PRODUCT_WIDTH_EDEFAULT == null ? productWidth != null : !PRODUCT_WIDTH_EDEFAULT.equals(productWidth);
			case ProductPackage.PRODUCT__QUANTITY_INCLUDED:
				return QUANTITY_INCLUDED_EDEFAULT == null ? quantityIncluded != null : !QUANTITY_INCLUDED_EDEFAULT.equals(quantityIncluded);
			case ProductPackage.PRODUCT__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case ProductPackage.PRODUCT__REQUIRE_AMOUNT:
				return requireAmount != REQUIRE_AMOUNT_EDEFAULT;
			case ProductPackage.PRODUCT__REQUIRE_INVENTORY:
				return requireInventory != REQUIRE_INVENTORY_EDEFAULT;
			case ProductPackage.PRODUCT__RESERV2ND_PP_PERC:
				return RESERV2ND_PP_PERC_EDEFAULT == null ? reserv2ndPPPerc != null : !RESERV2ND_PP_PERC_EDEFAULT.equals(reserv2ndPPPerc);
			case ProductPackage.PRODUCT__RESERV_MAX_PERSONS:
				return RESERV_MAX_PERSONS_EDEFAULT == null ? reservMaxPersons != null : !RESERV_MAX_PERSONS_EDEFAULT.equals(reservMaxPersons);
			case ProductPackage.PRODUCT__RESERV_NTH_PP_PERC:
				return RESERV_NTH_PP_PERC_EDEFAULT == null ? reservNthPPPerc != null : !RESERV_NTH_PP_PERC_EDEFAULT.equals(reservNthPPPerc);
			case ProductPackage.PRODUCT__RETURNABLE:
				return returnable != RETURNABLE_EDEFAULT;
			case ProductPackage.PRODUCT__SALES_DISC_WHEN_NOT_AVAIL:
				return salesDiscWhenNotAvail != SALES_DISC_WHEN_NOT_AVAIL_EDEFAULT;
			case ProductPackage.PRODUCT__SALES_DISCONTINUATION_DATE:
				return SALES_DISCONTINUATION_DATE_EDEFAULT == null ? salesDiscontinuationDate != null : !SALES_DISCONTINUATION_DATE_EDEFAULT.equals(salesDiscontinuationDate);
			case ProductPackage.PRODUCT__SHIPPING_DEPTH:
				return SHIPPING_DEPTH_EDEFAULT == null ? shippingDepth != null : !SHIPPING_DEPTH_EDEFAULT.equals(shippingDepth);
			case ProductPackage.PRODUCT__SHIPPING_HEIGHT:
				return SHIPPING_HEIGHT_EDEFAULT == null ? shippingHeight != null : !SHIPPING_HEIGHT_EDEFAULT.equals(shippingHeight);
			case ProductPackage.PRODUCT__SHIPPING_WEIGHT:
				return SHIPPING_WEIGHT_EDEFAULT == null ? shippingWeight != null : !SHIPPING_WEIGHT_EDEFAULT.equals(shippingWeight);
			case ProductPackage.PRODUCT__SHIPPING_WIDTH:
				return SHIPPING_WIDTH_EDEFAULT == null ? shippingWidth != null : !SHIPPING_WIDTH_EDEFAULT.equals(shippingWidth);
			case ProductPackage.PRODUCT__SMALL_IMAGE_URL:
				return SMALL_IMAGE_URL_EDEFAULT == null ? smallImageUrl != null : !SMALL_IMAGE_URL_EDEFAULT.equals(smallImageUrl);
			case ProductPackage.PRODUCT__SUPPORT_DISCONTINUATION_DATE:
				return SUPPORT_DISCONTINUATION_DATE_EDEFAULT == null ? supportDiscontinuationDate != null : !SUPPORT_DISCONTINUATION_DATE_EDEFAULT.equals(supportDiscontinuationDate);
			case ProductPackage.PRODUCT__TAXABLE:
				return taxable != TAXABLE_EDEFAULT;
			case ProductPackage.PRODUCT__PRODUCT_TYPE_ID:
				return productTypeId != null;
			case ProductPackage.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID:
				return primaryProductCategoryId != null;
			case ProductPackage.PRODUCT__FACILITY_ID:
				return facilityId != null;
			case ProductPackage.PRODUCT__QUANTITY_UOM_ID:
				return quantityUomId != null;
			case ProductPackage.PRODUCT__AMOUNT_UOM_TYPE_ID:
				return amountUomTypeId != null;
			case ProductPackage.PRODUCT__WEIGHT_UOM_ID:
				return weightUomId != null;
			case ProductPackage.PRODUCT__HEIGHT_UOM_ID:
				return heightUomId != null;
			case ProductPackage.PRODUCT__WIDTH_UOM_ID:
				return widthUomId != null;
			case ProductPackage.PRODUCT__DEPTH_UOM_ID:
				return depthUomId != null;
			case ProductPackage.PRODUCT__DIAMETER_UOM_ID:
				return diameterUomId != null;
			case ProductPackage.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM:
				return virtualVariantMethodEnum != null;
			case ProductPackage.PRODUCT__RATING_TYPE_ENUM:
				return ratingTypeEnum != null;
			case ProductPackage.PRODUCT__REQUIREMENT_METHOD_ENUM_ID:
				return requirementMethodEnumId != null;
			case ProductPackage.PRODUCT__ORIGIN_GEO_ID:
				return originGeoId != null;
			case ProductPackage.PRODUCT__CREATED_BY_USER_LOGIN:
				return createdByUserLogin != null;
			case ProductPackage.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN:
				return lastModifiedByUserLogin != null;
			case ProductPackage.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID:
				return defaultShipmentBoxTypeId != null;
			case ProductPackage.PRODUCT__INVENTORY_ITEM_TYPE_ID:
				return inventoryItemTypeId != null;
			case ProductPackage.PRODUCT__COMMUNICATION_EVENT_PRODUCTS:
				return communicationEventProducts != null && !communicationEventProducts.isEmpty();
			case ProductPackage.PRODUCT__PRODUCT_ATTRIBUTES:
				return productAttributes != null && !productAttributes.isEmpty();
			case ProductPackage.PRODUCT__PRODUCT_FACILITIES:
				return productFacilities != null && !productFacilities.isEmpty();
			case ProductPackage.PRODUCT__PRODUCT_GEOS:
				return productGeos != null && !productGeos.isEmpty();
			case ProductPackage.PRODUCT__PRODUCT_MAINTS:
				return productMaints != null && !productMaints.isEmpty();
			case ProductPackage.PRODUCT__PRODUCT_METERS:
				return productMeters != null && !productMeters.isEmpty();
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", autoCreateKeywords: ");
		result.append(autoCreateKeywords);
		result.append(", billOfMaterialLevel: ");
		result.append(billOfMaterialLevel);
		result.append(", brandName: ");
		result.append(brandName);
		result.append(", chargeShipping: ");
		result.append(chargeShipping);
		result.append(", comments: ");
		result.append(comments);
		result.append(", configId: ");
		result.append(configId);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", description: ");
		result.append(description);
		result.append(", detailImageUrl: ");
		result.append(detailImageUrl);
		result.append(", detailScreen: ");
		result.append(detailScreen);
		result.append(", fixedAmount: ");
		result.append(fixedAmount);
		result.append(", inShippingBox: ");
		result.append(inShippingBox);
		result.append(", includeInPromotions: ");
		result.append(includeInPromotions);
		result.append(", internalName: ");
		result.append(internalName);
		result.append(", introductionDate: ");
		result.append(introductionDate);
		result.append(", inventoryMessage: ");
		result.append(inventoryMessage);
		result.append(", isVariant: ");
		result.append(isVariant);
		result.append(", isVirtual: ");
		result.append(isVirtual);
		result.append(", largeImageUrl: ");
		result.append(largeImageUrl);
		result.append(", lastModifiedDate: ");
		result.append(lastModifiedDate);
		result.append(", longDescription: ");
		result.append(longDescription);
		result.append(", lotIdFilledIn: ");
		result.append(lotIdFilledIn);
		result.append(", mediumImageUrl: ");
		result.append(mediumImageUrl);
		result.append(", orderDecimalQuantity: ");
		result.append(orderDecimalQuantity);
		result.append(", originalImageUrl: ");
		result.append(originalImageUrl);
		result.append(", piecesIncluded: ");
		result.append(piecesIncluded);
		result.append(", priceDetailText: ");
		result.append(priceDetailText);
		result.append(", productDepth: ");
		result.append(productDepth);
		result.append(", productDiameter: ");
		result.append(productDiameter);
		result.append(", productHeight: ");
		result.append(productHeight);
		result.append(", productName: ");
		result.append(productName);
		result.append(", productRating: ");
		result.append(productRating);
		result.append(", productWeight: ");
		result.append(productWeight);
		result.append(", productWidth: ");
		result.append(productWidth);
		result.append(", quantityIncluded: ");
		result.append(quantityIncluded);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(", requireAmount: ");
		result.append(requireAmount);
		result.append(", requireInventory: ");
		result.append(requireInventory);
		result.append(", reserv2ndPPPerc: ");
		result.append(reserv2ndPPPerc);
		result.append(", reservMaxPersons: ");
		result.append(reservMaxPersons);
		result.append(", reservNthPPPerc: ");
		result.append(reservNthPPPerc);
		result.append(", returnable: ");
		result.append(returnable);
		result.append(", salesDiscWhenNotAvail: ");
		result.append(salesDiscWhenNotAvail);
		result.append(", salesDiscontinuationDate: ");
		result.append(salesDiscontinuationDate);
		result.append(", shippingDepth: ");
		result.append(shippingDepth);
		result.append(", shippingHeight: ");
		result.append(shippingHeight);
		result.append(", shippingWeight: ");
		result.append(shippingWeight);
		result.append(", shippingWidth: ");
		result.append(shippingWidth);
		result.append(", smallImageUrl: ");
		result.append(smallImageUrl);
		result.append(", supportDiscontinuationDate: ");
		result.append(supportDiscontinuationDate);
		result.append(", taxable: ");
		result.append(taxable);
		result.append(", communicationEventProducts: ");
		result.append(communicationEventProducts);
		result.append(", productAttributes: ");
		result.append(productAttributes);
		result.append(", productFacilities: ");
		result.append(productFacilities);
		result.append(", productGeos: ");
		result.append(productGeos);
		result.append(", productMaints: ");
		result.append(productMaints);
		result.append(", productMeters: ");
		result.append(productMeters);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
