/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.common.uom.UomType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.communication.CommunicationEventProduct;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.facility.ProductFacility;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductAttribute;
import org.abchip.mimo.biz.product.product.ProductGeo;
import org.abchip.mimo.biz.product.product.ProductMaint;
import org.abchip.mimo.biz.product.product.ProductMeter;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.ProductType;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getAmountUomTypeId <em>Amount Uom Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isAutoCreateKeywords <em>Auto Create Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getBillOfMaterialLevel <em>Bill Of Material Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getBrandName <em>Brand Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isChargeShipping <em>Charge Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getCommunicationEventProducts <em>Communication Event Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDefaultShipmentBoxTypeId <em>Default Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDepthUomId <em>Depth Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDetailImageUrl <em>Detail Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getDiameterUomId <em>Diameter Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getHeightUomId <em>Height Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isInShippingBox <em>In Shipping Box</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isIncludeInPromotions <em>Include In Promotions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getIntroductionDate <em>Introduction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getInventoryMessage <em>Inventory Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isIsVariant <em>Is Variant</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLargeImageUrl <em>Large Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getLotIdFilledIn <em>Lot Id Filled In</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getMediumImageUrl <em>Medium Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getOriginGeoId <em>Origin Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getOriginalImageUrl <em>Original Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getPiecesIncluded <em>Pieces Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getPriceDetailText <em>Price Detail Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getPrimaryProductCategoryId <em>Primary Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductAttributes <em>Product Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductDepth <em>Product Depth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductDiameter <em>Product Diameter</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductFacilities <em>Product Facilities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductGeos <em>Product Geos</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductHeight <em>Product Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductMaints <em>Product Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductMeters <em>Product Meters</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductRating <em>Product Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductWeight <em>Product Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getProductWidth <em>Product Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getQuantityIncluded <em>Quantity Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getRatingTypeEnum <em>Rating Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isRequireAmount <em>Require Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#isRequireInventory <em>Require Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
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
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getVirtualVariantMethodEnum <em>Virtual Variant Method Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getWeightUomId <em>Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductImpl#getWidthUomId <em>Width Uom Id</em>}</li>
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
		return (UomType)eGet(ProductPackage.Literals.PRODUCT__AMOUNT_UOM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountUomTypeId(UomType newAmountUomTypeId) {
		eSet(ProductPackage.Literals.PRODUCT__AMOUNT_UOM_TYPE_ID, newAmountUomTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBillOfMaterialLevel() {
		return (Long)eGet(ProductPackage.Literals.PRODUCT__BILL_OF_MATERIAL_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillOfMaterialLevel(long newBillOfMaterialLevel) {
		eSet(ProductPackage.Literals.PRODUCT__BILL_OF_MATERIAL_LEVEL, newBillOfMaterialLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBrandName() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__BRAND_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrandName(String newBrandName) {
		eSet(ProductPackage.Literals.PRODUCT__BRAND_NAME, newBrandName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChargeShipping() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__CHARGE_SHIPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargeShipping(boolean newChargeShipping) {
		eSet(ProductPackage.Literals.PRODUCT__CHARGE_SHIPPING, newChargeShipping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(ProductPackage.Literals.PRODUCT__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<CommunicationEventProduct> getCommunicationEventProducts() {
		return (List<CommunicationEventProduct>)eGet(ProductPackage.Literals.PRODUCT__COMMUNICATION_EVENT_PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		eSet(ProductPackage.Literals.PRODUCT__CONFIG_ID, newConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getCreatedByUserLogin() {
		return (UserLogin)eGet(ProductPackage.Literals.PRODUCT__CREATED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(UserLogin newCreatedByUserLogin) {
		eSet(ProductPackage.Literals.PRODUCT__CREATED_BY_USER_LOGIN, newCreatedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedDate(Date newCreatedDate) {
		eSet(ProductPackage.Literals.PRODUCT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentBoxType getDefaultShipmentBoxTypeId() {
		return (ShipmentBoxType)eGet(ProductPackage.Literals.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultShipmentBoxTypeId(ShipmentBoxType newDefaultShipmentBoxTypeId) {
		eSet(ProductPackage.Literals.PRODUCT__DEFAULT_SHIPMENT_BOX_TYPE_ID, newDefaultShipmentBoxTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDepthUomId() {
		return (Uom)eGet(ProductPackage.Literals.PRODUCT__DEPTH_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepthUomId(Uom newDepthUomId) {
		eSet(ProductPackage.Literals.PRODUCT__DEPTH_UOM_ID, newDepthUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ProductPackage.Literals.PRODUCT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailImageUrl() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__DETAIL_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailImageUrl(String newDetailImageUrl) {
		eSet(ProductPackage.Literals.PRODUCT__DETAIL_IMAGE_URL, newDetailImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailScreen() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__DETAIL_SCREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailScreen(String newDetailScreen) {
		eSet(ProductPackage.Literals.PRODUCT__DETAIL_SCREEN, newDetailScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDiameterUomId() {
		return (Uom)eGet(ProductPackage.Literals.PRODUCT__DIAMETER_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiameterUomId(Uom newDiameterUomId) {
		eSet(ProductPackage.Literals.PRODUCT__DIAMETER_UOM_ID, newDiameterUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFixedAmount() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__FIXED_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAmount(BigDecimal newFixedAmount) {
		eSet(ProductPackage.Literals.PRODUCT__FIXED_AMOUNT, newFixedAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInShippingBox() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__IN_SHIPPING_BOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInShippingBox(boolean newInShippingBox) {
		eSet(ProductPackage.Literals.PRODUCT__IN_SHIPPING_BOX, newInShippingBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeInPromotions() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__INCLUDE_IN_PROMOTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeInPromotions(boolean newIncludeInPromotions) {
		eSet(ProductPackage.Literals.PRODUCT__INCLUDE_IN_PROMOTIONS, newIncludeInPromotions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getHeightUomId() {
		return (Uom)eGet(ProductPackage.Literals.PRODUCT__HEIGHT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeightUomId(Uom newHeightUomId) {
		eSet(ProductPackage.Literals.PRODUCT__HEIGHT_UOM_ID, newHeightUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternalName() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__INTERNAL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalName(String newInternalName) {
		eSet(ProductPackage.Literals.PRODUCT__INTERNAL_NAME, newInternalName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIntroductionDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT__INTRODUCTION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntroductionDate(Date newIntroductionDate) {
		eSet(ProductPackage.Literals.PRODUCT__INTRODUCTION_DATE, newIntroductionDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryMessage() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__INVENTORY_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryMessage(String newInventoryMessage) {
		eSet(ProductPackage.Literals.PRODUCT__INVENTORY_MESSAGE, newInventoryMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVariant() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__IS_VARIANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariant(boolean newIsVariant) {
		eSet(ProductPackage.Literals.PRODUCT__IS_VARIANT, newIsVariant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVirtual() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__IS_VIRTUAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVirtual(boolean newIsVirtual) {
		eSet(ProductPackage.Literals.PRODUCT__IS_VIRTUAL, newIsVirtual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLargeImageUrl() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__LARGE_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLargeImageUrl(String newLargeImageUrl) {
		eSet(ProductPackage.Literals.PRODUCT__LARGE_IMAGE_URL, newLargeImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getLastModifiedByUserLogin() {
		return (UserLogin)eGet(ProductPackage.Literals.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(UserLogin newLastModifiedByUserLogin) {
		eSet(ProductPackage.Literals.PRODUCT__LAST_MODIFIED_BY_USER_LOGIN, newLastModifiedByUserLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastModifiedDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT__LAST_MODIFIED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedDate(Date newLastModifiedDate) {
		eSet(ProductPackage.Literals.PRODUCT__LAST_MODIFIED_DATE, newLastModifiedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__LONG_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		eSet(ProductPackage.Literals.PRODUCT__LONG_DESCRIPTION, newLongDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLotIdFilledIn() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__LOT_ID_FILLED_IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLotIdFilledIn(String newLotIdFilledIn) {
		eSet(ProductPackage.Literals.PRODUCT__LOT_ID_FILLED_IN, newLotIdFilledIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediumImageUrl() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__MEDIUM_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediumImageUrl(String newMediumImageUrl) {
		eSet(ProductPackage.Literals.PRODUCT__MEDIUM_IMAGE_URL, newMediumImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrderDecimalQuantity() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__ORDER_DECIMAL_QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDecimalQuantity(boolean newOrderDecimalQuantity) {
		eSet(ProductPackage.Literals.PRODUCT__ORDER_DECIMAL_QUANTITY, newOrderDecimalQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getOriginGeoId() {
		return (Geo)eGet(ProductPackage.Literals.PRODUCT__ORIGIN_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginGeoId(Geo newOriginGeoId) {
		eSet(ProductPackage.Literals.PRODUCT__ORIGIN_GEO_ID, newOriginGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginalImageUrl() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__ORIGINAL_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalImageUrl(String newOriginalImageUrl) {
		eSet(ProductPackage.Literals.PRODUCT__ORIGINAL_IMAGE_URL, newOriginalImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPiecesIncluded() {
		return (Long)eGet(ProductPackage.Literals.PRODUCT__PIECES_INCLUDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPiecesIncluded(long newPiecesIncluded) {
		eSet(ProductPackage.Literals.PRODUCT__PIECES_INCLUDED, newPiecesIncluded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPriceDetailText() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__PRICE_DETAIL_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceDetailText(String newPriceDetailText) {
		eSet(ProductPackage.Literals.PRODUCT__PRICE_DETAIL_TEXT, newPriceDetailText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductDepth() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_DEPTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductDepth(BigDecimal newProductDepth) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_DEPTH, newProductDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductDiameter() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_DIAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductDiameter(BigDecimal newProductDiameter) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_DIAMETER, newProductDiameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductFacility> getProductFacilities() {
		return (List<ProductFacility>)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_FACILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductGeo> getProductGeos() {
		return (List<ProductGeo>)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_GEOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductHeight() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductHeight(BigDecimal newProductHeight) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_HEIGHT, newProductHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductMaint> getProductMaints() {
		return (List<ProductMaint>)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_MAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductMeter> getProductMeters() {
		return (List<ProductMeter>)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_METERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductName() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductName(String newProductName) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_NAME, newProductName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductRating() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_RATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductRating(BigDecimal newProductRating) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_RATING, newProductRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductWeight() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductWeight(BigDecimal newProductWeight) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_WEIGHT, newProductWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductWidth() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductWidth(BigDecimal newProductWidth) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_WIDTH, newProductWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityIncluded() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__QUANTITY_INCLUDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityIncluded(BigDecimal newQuantityIncluded) {
		eSet(ProductPackage.Literals.PRODUCT__QUANTITY_INCLUDED, newQuantityIncluded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUomId() {
		return (Uom)eGet(ProductPackage.Literals.PRODUCT__QUANTITY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUomId(Uom newQuantityUomId) {
		eSet(ProductPackage.Literals.PRODUCT__QUANTITY_UOM_ID, newQuantityUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRatingTypeEnum() {
		return (Enumeration)eGet(ProductPackage.Literals.PRODUCT__RATING_TYPE_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRatingTypeEnum(Enumeration newRatingTypeEnum) {
		eSet(ProductPackage.Literals.PRODUCT__RATING_TYPE_ENUM, newRatingTypeEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReleaseDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT__RELEASE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleaseDate(Date newReleaseDate) {
		eSet(ProductPackage.Literals.PRODUCT__RELEASE_DATE, newReleaseDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireAmount() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__REQUIRE_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireAmount(boolean newRequireAmount) {
		eSet(ProductPackage.Literals.PRODUCT__REQUIRE_AMOUNT, newRequireAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireInventory() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__REQUIRE_INVENTORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireInventory(boolean newRequireInventory) {
		eSet(ProductPackage.Literals.PRODUCT__REQUIRE_INVENTORY, newRequireInventory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getRequirementMethodEnumId() {
		return (Enumeration)eGet(ProductPackage.Literals.PRODUCT__REQUIREMENT_METHOD_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementMethodEnumId(Enumeration newRequirementMethodEnumId) {
		eSet(ProductPackage.Literals.PRODUCT__REQUIREMENT_METHOD_ENUM_ID, newRequirementMethodEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReserv2ndPPPerc() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__RESERV2ND_PP_PERC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserv2ndPPPerc(BigDecimal newReserv2ndPPPerc) {
		eSet(ProductPackage.Literals.PRODUCT__RESERV2ND_PP_PERC, newReserv2ndPPPerc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservMaxPersons() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__RESERV_MAX_PERSONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservMaxPersons(BigDecimal newReservMaxPersons) {
		eSet(ProductPackage.Literals.PRODUCT__RESERV_MAX_PERSONS, newReservMaxPersons);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservNthPPPerc() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__RESERV_NTH_PP_PERC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservNthPPPerc(BigDecimal newReservNthPPPerc) {
		eSet(ProductPackage.Literals.PRODUCT__RESERV_NTH_PP_PERC, newReservNthPPPerc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReturnable() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__RETURNABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnable(boolean newReturnable) {
		eSet(ProductPackage.Literals.PRODUCT__RETURNABLE, newReturnable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSalesDiscWhenNotAvail() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__SALES_DISC_WHEN_NOT_AVAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesDiscWhenNotAvail(boolean newSalesDiscWhenNotAvail) {
		eSet(ProductPackage.Literals.PRODUCT__SALES_DISC_WHEN_NOT_AVAIL, newSalesDiscWhenNotAvail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSalesDiscontinuationDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT__SALES_DISCONTINUATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalesDiscontinuationDate(Date newSalesDiscontinuationDate) {
		eSet(ProductPackage.Literals.PRODUCT__SALES_DISCONTINUATION_DATE, newSalesDiscontinuationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingDepth() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__SHIPPING_DEPTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingDepth(BigDecimal newShippingDepth) {
		eSet(ProductPackage.Literals.PRODUCT__SHIPPING_DEPTH, newShippingDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingHeight() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__SHIPPING_HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingHeight(BigDecimal newShippingHeight) {
		eSet(ProductPackage.Literals.PRODUCT__SHIPPING_HEIGHT, newShippingHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingWeight() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__SHIPPING_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingWeight(BigDecimal newShippingWeight) {
		eSet(ProductPackage.Literals.PRODUCT__SHIPPING_WEIGHT, newShippingWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingWidth() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT__SHIPPING_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingWidth(BigDecimal newShippingWidth) {
		eSet(ProductPackage.Literals.PRODUCT__SHIPPING_WIDTH, newShippingWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmallImageUrl() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__SMALL_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmallImageUrl(String newSmallImageUrl) {
		eSet(ProductPackage.Literals.PRODUCT__SMALL_IMAGE_URL, newSmallImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSupportDiscontinuationDate() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT__SUPPORT_DISCONTINUATION_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportDiscontinuationDate(Date newSupportDiscontinuationDate) {
		eSet(ProductPackage.Literals.PRODUCT__SUPPORT_DISCONTINUATION_DATE, newSupportDiscontinuationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTaxable() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__TAXABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxable(boolean newTaxable) {
		eSet(ProductPackage.Literals.PRODUCT__TAXABLE, newTaxable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getVirtualVariantMethodEnum() {
		return (Enumeration)eGet(ProductPackage.Literals.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualVariantMethodEnum(Enumeration newVirtualVariantMethodEnum) {
		eSet(ProductPackage.Literals.PRODUCT__VIRTUAL_VARIANT_METHOD_ENUM, newVirtualVariantMethodEnum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWeightUomId() {
		return (Uom)eGet(ProductPackage.Literals.PRODUCT__WEIGHT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUomId(Uom newWeightUomId) {
		eSet(ProductPackage.Literals.PRODUCT__WEIGHT_UOM_ID, newWeightUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWidthUomId() {
		return (Uom)eGet(ProductPackage.Literals.PRODUCT__WIDTH_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidthUomId(Uom newWidthUomId) {
		eSet(ProductPackage.Literals.PRODUCT__WIDTH_UOM_ID, newWidthUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductType getProductTypeId() {
		return (ProductType)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductTypeId(ProductType newProductTypeId) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_TYPE_ID, newProductTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getPrimaryProductCategoryId() {
		return (ProductCategory)eGet(ProductPackage.Literals.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryProductCategoryId(ProductCategory newPrimaryProductCategoryId) {
		eSet(ProductPackage.Literals.PRODUCT__PRIMARY_PRODUCT_CATEGORY_ID, newPrimaryProductCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductAttribute> getProductAttributes() {
		return (List<ProductAttribute>)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		return (Facility)eGet(ProductPackage.Literals.PRODUCT__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		eSet(ProductPackage.Literals.PRODUCT__FACILITY_ID, newFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType getInventoryItemTypeId() {
		return (InventoryItemType)eGet(ProductPackage.Literals.PRODUCT__INVENTORY_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemTypeId(InventoryItemType newInventoryItemTypeId) {
		eSet(ProductPackage.Literals.PRODUCT__INVENTORY_ITEM_TYPE_ID, newInventoryItemTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(ProductPackage.Literals.PRODUCT__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAutoCreateKeywords() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT__AUTO_CREATE_KEYWORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoCreateKeywords(boolean newAutoCreateKeywords) {
		eSet(ProductPackage.Literals.PRODUCT__AUTO_CREATE_KEYWORDS, newAutoCreateKeywords);
	}

} //ProductImpl
