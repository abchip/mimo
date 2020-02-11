/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.BizEntityTyped;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.common.uom.UomType;
import org.abchip.mimo.biz.party.communication.CommunicationEventProduct;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.facility.ProductFacility;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getAmountUomTypeId <em>Amount Uom Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isAutoCreateKeywords <em>Auto Create Keywords</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getBillOfMaterialLevel <em>Bill Of Material Level</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getBrandName <em>Brand Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isChargeShipping <em>Charge Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getCommunicationEventProducts <em>Communication Event Products</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getDefaultShipmentBoxTypeId <em>Default Shipment Box Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getDepthUomId <em>Depth Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getDetailImageUrl <em>Detail Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getDiameterUomId <em>Diameter Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getFixedAmount <em>Fixed Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getHeightUomId <em>Height Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isInShippingBox <em>In Shipping Box</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isIncludeInPromotions <em>Include In Promotions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getInternalName <em>Internal Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getIntroductionDate <em>Introduction Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getInventoryMessage <em>Inventory Message</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isIsVariant <em>Is Variant</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isIsVirtual <em>Is Virtual</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getLargeImageUrl <em>Large Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getLotIdFilledIn <em>Lot Id Filled In</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getMediumImageUrl <em>Medium Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getOriginGeoId <em>Origin Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getOriginalImageUrl <em>Original Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getPiecesIncluded <em>Pieces Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getPriceDetailText <em>Price Detail Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getPrimaryProductCategoryId <em>Primary Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductAttributes <em>Product Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductDepth <em>Product Depth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductDiameter <em>Product Diameter</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductFacilities <em>Product Facilities</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductGeos <em>Product Geos</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductHeight <em>Product Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductMaints <em>Product Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductMeters <em>Product Meters</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductRating <em>Product Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductTypeId <em>Product Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductWeight <em>Product Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getProductWidth <em>Product Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getQuantityIncluded <em>Quantity Included</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getRatingTypeEnum <em>Rating Type Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isRequireAmount <em>Require Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isRequireInventory <em>Require Inventory</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getReservMaxPersons <em>Reserv Max Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isReturnable <em>Returnable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isSalesDiscWhenNotAvail <em>Sales Disc When Not Avail</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getSalesDiscontinuationDate <em>Sales Discontinuation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getShippingDepth <em>Shipping Depth</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getShippingHeight <em>Shipping Height</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getShippingWeight <em>Shipping Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getShippingWidth <em>Shipping Width</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getSmallImageUrl <em>Small Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getSupportDiscontinuationDate <em>Support Discontinuation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#isTaxable <em>Taxable</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getVirtualVariantMethodEnum <em>Virtual Variant Method Enum</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getWeightUomId <em>Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.Product#getWidthUomId <em>Width Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface Product extends BizEntityTyped<ProductType> {
	/**
	 * Returns the value of the '<em><b>Amount Uom Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Uom Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Uom Type Id</em>' reference.
	 * @see #setAmountUomTypeId(UomType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_AmountUomTypeId()
	 * @model keys="uomTypeId"
	 * @generated
	 */
	UomType getAmountUomTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getAmountUomTypeId <em>Amount Uom Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Uom Type Id</em>' reference.
	 * @see #getAmountUomTypeId()
	 * @generated
	 */
	void setAmountUomTypeId(UomType value);

	/**
	 * Returns the value of the '<em><b>Bill Of Material Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Of Material Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Of Material Level</em>' attribute.
	 * @see #setBillOfMaterialLevel(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_BillOfMaterialLevel()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getBillOfMaterialLevel();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getBillOfMaterialLevel <em>Bill Of Material Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Of Material Level</em>' attribute.
	 * @see #getBillOfMaterialLevel()
	 * @generated
	 */
	void setBillOfMaterialLevel(long value);

	/**
	 * Returns the value of the '<em><b>Brand Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brand Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand Name</em>' attribute.
	 * @see #setBrandName(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_BrandName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getBrandName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getBrandName <em>Brand Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand Name</em>' attribute.
	 * @see #getBrandName()
	 * @generated
	 */
	void setBrandName(String value);

	/**
	 * Returns the value of the '<em><b>Charge Shipping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Shipping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Shipping</em>' attribute.
	 * @see #setChargeShipping(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ChargeShipping()
	 * @model
	 * @generated
	 */
	boolean isChargeShipping();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isChargeShipping <em>Charge Shipping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Shipping</em>' attribute.
	 * @see #isChargeShipping()
	 * @generated
	 */
	void setChargeShipping(boolean value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_Comments()
	 * @model annotation="mimo-ent-format type='comment' length='255'"
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Communication Event Products</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.party.communication.CommunicationEventProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Event Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Event Products</em>' reference list.
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_CommunicationEventProducts()
	 * @model derived="true"
	 * @generated
	 */
	List<CommunicationEventProduct> getCommunicationEventProducts();

	/**
	 * Returns the value of the '<em><b>Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Id</em>' attribute.
	 * @see #setConfigId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ConfigId()
	 * @model annotation="mimo-ent-slot help='Used to safe the persisted configuration Id for AGGREGATED products.'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getConfigId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getConfigId <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Id</em>' attribute.
	 * @see #getConfigId()
	 * @generated
	 */
	void setConfigId(String value);

	/**
	 * Returns the value of the '<em><b>Created By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User Login</em>' reference.
	 * @see #setCreatedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_CreatedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getCreatedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getCreatedByUserLogin <em>Created By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User Login</em>' reference.
	 * @see #getCreatedByUserLogin()
	 * @generated
	 */
	void setCreatedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_CreatedDate()
	 * @model
	 * @generated
	 */
	Date getCreatedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Default Shipment Box Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Shipment Box Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Shipment Box Type Id</em>' reference.
	 * @see #setDefaultShipmentBoxTypeId(ShipmentBoxType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_DefaultShipmentBoxTypeId()
	 * @model keys="shipmentBoxTypeId"
	 * @generated
	 */
	ShipmentBoxType getDefaultShipmentBoxTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getDefaultShipmentBoxTypeId <em>Default Shipment Box Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Shipment Box Type Id</em>' reference.
	 * @see #getDefaultShipmentBoxTypeId()
	 * @generated
	 */
	void setDefaultShipmentBoxTypeId(ShipmentBoxType value);

	/**
	 * Returns the value of the '<em><b>Depth Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth Uom Id</em>' reference.
	 * @see #setDepthUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_DepthUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getDepthUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getDepthUomId <em>Depth Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth Uom Id</em>' reference.
	 * @see #getDepthUomId()
	 * @generated
	 */
	void setDepthUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Detail Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Image Url</em>' attribute.
	 * @see #setDetailImageUrl(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_DetailImageUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getDetailImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getDetailImageUrl <em>Detail Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Image Url</em>' attribute.
	 * @see #getDetailImageUrl()
	 * @generated
	 */
	void setDetailImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Detail Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Screen</em>' attribute.
	 * @see #setDetailScreen(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_DetailScreen()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDetailScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getDetailScreen <em>Detail Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Screen</em>' attribute.
	 * @see #getDetailScreen()
	 * @generated
	 */
	void setDetailScreen(String value);

	/**
	 * Returns the value of the '<em><b>Diameter Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter Uom Id</em>' reference.
	 * @see #setDiameterUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_DiameterUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getDiameterUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getDiameterUomId <em>Diameter Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter Uom Id</em>' reference.
	 * @see #getDiameterUomId()
	 * @generated
	 */
	void setDiameterUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Fixed Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Amount</em>' attribute.
	 * @see #setFixedAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_FixedAmount()
	 * @model annotation="mimo-ent-slot help='Use this for products which are sold in fixed denominations, such as gift certificates or calling cards.'"
	 *        annotation="mimo-ent-format type='currency-amount' precision='18' scale='2'"
	 * @generated
	 */
	BigDecimal getFixedAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getFixedAmount <em>Fixed Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Amount</em>' attribute.
	 * @see #getFixedAmount()
	 * @generated
	 */
	void setFixedAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>In Shipping Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Shipping Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Shipping Box</em>' attribute.
	 * @see #setInShippingBox(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_InShippingBox()
	 * @model required="true"
	 * @generated
	 */
	boolean isInShippingBox();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isInShippingBox <em>In Shipping Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Shipping Box</em>' attribute.
	 * @see #isInShippingBox()
	 * @generated
	 */
	void setInShippingBox(boolean value);

	/**
	 * Returns the value of the '<em><b>Include In Promotions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include In Promotions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Promotions</em>' attribute.
	 * @see #setIncludeInPromotions(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_IncludeInPromotions()
	 * @model
	 * @generated
	 */
	boolean isIncludeInPromotions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isIncludeInPromotions <em>Include In Promotions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Promotions</em>' attribute.
	 * @see #isIncludeInPromotions()
	 * @generated
	 */
	void setIncludeInPromotions(boolean value);

	/**
	 * Returns the value of the '<em><b>Height Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height Uom Id</em>' reference.
	 * @see #setHeightUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_HeightUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getHeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getHeightUomId <em>Height Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height Uom Id</em>' reference.
	 * @see #getHeightUomId()
	 * @generated
	 */
	void setHeightUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Internal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Name</em>' attribute.
	 * @see #setInternalName(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_InternalName()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getInternalName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getInternalName <em>Internal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Name</em>' attribute.
	 * @see #getInternalName()
	 * @generated
	 */
	void setInternalName(String value);

	/**
	 * Returns the value of the '<em><b>Introduction Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Introduction Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction Date</em>' attribute.
	 * @see #setIntroductionDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_IntroductionDate()
	 * @model
	 * @generated
	 */
	Date getIntroductionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getIntroductionDate <em>Introduction Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction Date</em>' attribute.
	 * @see #getIntroductionDate()
	 * @generated
	 */
	void setIntroductionDate(Date value);

	/**
	 * Returns the value of the '<em><b>Inventory Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Message</em>' attribute.
	 * @see #setInventoryMessage(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_InventoryMessage()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getInventoryMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getInventoryMessage <em>Inventory Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Message</em>' attribute.
	 * @see #getInventoryMessage()
	 * @generated
	 */
	void setInventoryMessage(String value);

	/**
	 * Returns the value of the '<em><b>Is Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Variant</em>' attribute.
	 * @see #setIsVariant(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_IsVariant()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsVariant();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isIsVariant <em>Is Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variant</em>' attribute.
	 * @see #isIsVariant()
	 * @generated
	 */
	void setIsVariant(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Virtual</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Virtual</em>' attribute.
	 * @see #setIsVirtual(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_IsVirtual()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsVirtual();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isIsVirtual <em>Is Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Virtual</em>' attribute.
	 * @see #isIsVirtual()
	 * @generated
	 */
	void setIsVirtual(boolean value);

	/**
	 * Returns the value of the '<em><b>Large Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Large Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Image Url</em>' attribute.
	 * @see #setLargeImageUrl(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_LargeImageUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getLargeImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getLargeImageUrl <em>Large Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Image Url</em>' attribute.
	 * @see #getLargeImageUrl()
	 * @generated
	 */
	void setLargeImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified By User Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified By User Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #setLastModifiedByUserLogin(UserLogin)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_LastModifiedByUserLogin()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getLastModifiedByUserLogin();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified By User Login</em>' reference.
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 */
	void setLastModifiedByUserLogin(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #setLastModifiedDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_LastModifiedDate()
	 * @model
	 * @generated
	 */
	Date getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_LongDescription()
	 * @model
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

	/**
	 * Returns the value of the '<em><b>Lot Id Filled In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot Id Filled In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot Id Filled In</em>' attribute.
	 * @see #setLotIdFilledIn(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_LotIdFilledIn()
	 * @model annotation="mimo-ent-slot help='Indicate if the lotId must be informed'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getLotIdFilledIn();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getLotIdFilledIn <em>Lot Id Filled In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Id Filled In</em>' attribute.
	 * @see #getLotIdFilledIn()
	 * @generated
	 */
	void setLotIdFilledIn(String value);

	/**
	 * Returns the value of the '<em><b>Medium Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Image Url</em>' attribute.
	 * @see #setMediumImageUrl(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_MediumImageUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getMediumImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getMediumImageUrl <em>Medium Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Image Url</em>' attribute.
	 * @see #getMediumImageUrl()
	 * @generated
	 */
	void setMediumImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Order Decimal Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Decimal Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Decimal Quantity</em>' attribute.
	 * @see #setOrderDecimalQuantity(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_OrderDecimalQuantity()
	 * @model annotation="mimo-ent-slot help='use to indicate if decimal quantity can be ordered for this product. Default value is Y'"
	 * @generated
	 */
	boolean isOrderDecimalQuantity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isOrderDecimalQuantity <em>Order Decimal Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Decimal Quantity</em>' attribute.
	 * @see #isOrderDecimalQuantity()
	 * @generated
	 */
	void setOrderDecimalQuantity(boolean value);

	/**
	 * Returns the value of the '<em><b>Origin Geo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Geo Id</em>' reference.
	 * @see #setOriginGeoId(Geo)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_OriginGeoId()
	 * @model keys="geoId"
	 * @generated
	 */
	Geo getOriginGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getOriginGeoId <em>Origin Geo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Geo Id</em>' reference.
	 * @see #getOriginGeoId()
	 * @generated
	 */
	void setOriginGeoId(Geo value);

	/**
	 * Returns the value of the '<em><b>Original Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Image Url</em>' attribute.
	 * @see #setOriginalImageUrl(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_OriginalImageUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getOriginalImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getOriginalImageUrl <em>Original Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Image Url</em>' attribute.
	 * @see #getOriginalImageUrl()
	 * @generated
	 */
	void setOriginalImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Pieces Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pieces Included</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pieces Included</em>' attribute.
	 * @see #setPiecesIncluded(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_PiecesIncluded()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getPiecesIncluded();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getPiecesIncluded <em>Pieces Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pieces Included</em>' attribute.
	 * @see #getPiecesIncluded()
	 * @generated
	 */
	void setPiecesIncluded(long value);

	/**
	 * Returns the value of the '<em><b>Price Detail Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Detail Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Detail Text</em>' attribute.
	 * @see #setPriceDetailText(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_PriceDetailText()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getPriceDetailText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getPriceDetailText <em>Price Detail Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Detail Text</em>' attribute.
	 * @see #getPriceDetailText()
	 * @generated
	 */
	void setPriceDetailText(String value);

	/**
	 * Returns the value of the '<em><b>Product Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Depth</em>' attribute.
	 * @see #setProductDepth(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductDepth()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductDepth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductDepth <em>Product Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Depth</em>' attribute.
	 * @see #getProductDepth()
	 * @generated
	 */
	void setProductDepth(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Diameter</em>' attribute.
	 * @see #setProductDiameter(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductDiameter()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductDiameter();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductDiameter <em>Product Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Diameter</em>' attribute.
	 * @see #getProductDiameter()
	 * @generated
	 */
	void setProductDiameter(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Facilities</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.facility.ProductFacility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Facilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Facilities</em>' reference list.
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductFacilities()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductFacility> getProductFacilities();

	/**
	 * Returns the value of the '<em><b>Product Geos</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.product.ProductGeo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Geos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Geos</em>' reference list.
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductGeos()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductGeo> getProductGeos();

	/**
	 * Returns the value of the '<em><b>Product Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Height</em>' attribute.
	 * @see #setProductHeight(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductHeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductHeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductHeight <em>Product Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Height</em>' attribute.
	 * @see #getProductHeight()
	 * @generated
	 */
	void setProductHeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Maints</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.product.ProductMaint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Maints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Maints</em>' reference list.
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductMaints()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductMaint> getProductMaints();

	/**
	 * Returns the value of the '<em><b>Product Meters</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.product.ProductMeter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Meters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Meters</em>' reference list.
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductMeters()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductMeter> getProductMeters();

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductName()
	 * @model annotation="mimo-ent-format type='name' length='100'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Product Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Rating</em>' attribute.
	 * @see #setProductRating(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductRating()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductRating();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductRating <em>Product Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Rating</em>' attribute.
	 * @see #getProductRating()
	 * @generated
	 */
	void setProductRating(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Weight</em>' attribute.
	 * @see #setProductWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductWeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductWeight <em>Product Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Weight</em>' attribute.
	 * @see #getProductWeight()
	 * @generated
	 */
	void setProductWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Width</em>' attribute.
	 * @see #setProductWidth(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductWidth()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductWidth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductWidth <em>Product Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Width</em>' attribute.
	 * @see #getProductWidth()
	 * @generated
	 */
	void setProductWidth(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Included</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Included</em>' attribute.
	 * @see #setQuantityIncluded(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_QuantityIncluded()
	 * @model annotation="mimo-ent-slot help='If you have a six-pack of 12oz soda cans you would have quantityIncluded=12, quantityUomId=oz, piecesIncluded=6.'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getQuantityIncluded();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getQuantityIncluded <em>Quantity Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Included</em>' attribute.
	 * @see #getQuantityIncluded()
	 * @generated
	 */
	void setQuantityIncluded(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Uom Id</em>' reference.
	 * @see #setQuantityUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_QuantityUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getQuantityUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getQuantityUomId <em>Quantity Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Uom Id</em>' reference.
	 * @see #getQuantityUomId()
	 * @generated
	 */
	void setQuantityUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Rating Type Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rating Type Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rating Type Enum</em>' reference.
	 * @see #setRatingTypeEnum(Enumeration)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_RatingTypeEnum()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getRatingTypeEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getRatingTypeEnum <em>Rating Type Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rating Type Enum</em>' reference.
	 * @see #getRatingTypeEnum()
	 * @generated
	 */
	void setRatingTypeEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Require Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Amount</em>' attribute.
	 * @see #setRequireAmount(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_RequireAmount()
	 * @model
	 * @generated
	 */
	boolean isRequireAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isRequireAmount <em>Require Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Amount</em>' attribute.
	 * @see #isRequireAmount()
	 * @generated
	 */
	void setRequireAmount(boolean value);

	/**
	 * Returns the value of the '<em><b>Require Inventory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Inventory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Inventory</em>' attribute.
	 * @see #setRequireInventory(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_RequireInventory()
	 * @model
	 * @generated
	 */
	boolean isRequireInventory();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isRequireInventory <em>Require Inventory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Inventory</em>' attribute.
	 * @see #isRequireInventory()
	 * @generated
	 */
	void setRequireInventory(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirement Method Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Method Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Method Enum Id</em>' reference.
	 * @see #setRequirementMethodEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_RequirementMethodEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getRequirementMethodEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getRequirementMethodEnumId <em>Requirement Method Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Method Enum Id</em>' reference.
	 * @see #getRequirementMethodEnumId()
	 * @generated
	 */
	void setRequirementMethodEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Reserv2nd PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv2nd PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #setReserv2ndPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_Reserv2ndPPPerc()
	 * @model annotation="mimo-ent-slot help='percentage of the end price for the 2nd person renting this asset connected to this product'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReserv2ndPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getReserv2ndPPPerc <em>Reserv2nd PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv2nd PP Perc</em>' attribute.
	 * @see #getReserv2ndPPPerc()
	 * @generated
	 */
	void setReserv2ndPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Max Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Max Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Max Persons</em>' attribute.
	 * @see #setReservMaxPersons(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ReservMaxPersons()
	 * @model annotation="mimo-ent-slot help='maximum number of persons who can rent this asset at the same time'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservMaxPersons();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getReservMaxPersons <em>Reserv Max Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Max Persons</em>' attribute.
	 * @see #getReservMaxPersons()
	 * @generated
	 */
	void setReservMaxPersons(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Reserv Nth PP Perc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserv Nth PP Perc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #setReservNthPPPerc(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ReservNthPPPerc()
	 * @model annotation="mimo-ent-slot help='percentage of the end price for the Nth person renting this asset connected to this product'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getReservNthPPPerc();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getReservNthPPPerc <em>Reserv Nth PP Perc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserv Nth PP Perc</em>' attribute.
	 * @see #getReservNthPPPerc()
	 * @generated
	 */
	void setReservNthPPPerc(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Returnable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returnable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returnable</em>' attribute.
	 * @see #setReturnable(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_Returnable()
	 * @model
	 * @generated
	 */
	boolean isReturnable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isReturnable <em>Returnable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnable</em>' attribute.
	 * @see #isReturnable()
	 * @generated
	 */
	void setReturnable(boolean value);

	/**
	 * Returns the value of the '<em><b>Sales Disc When Not Avail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Disc When Not Avail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Disc When Not Avail</em>' attribute.
	 * @see #setSalesDiscWhenNotAvail(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_SalesDiscWhenNotAvail()
	 * @model
	 * @generated
	 */
	boolean isSalesDiscWhenNotAvail();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isSalesDiscWhenNotAvail <em>Sales Disc When Not Avail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Disc When Not Avail</em>' attribute.
	 * @see #isSalesDiscWhenNotAvail()
	 * @generated
	 */
	void setSalesDiscWhenNotAvail(boolean value);

	/**
	 * Returns the value of the '<em><b>Sales Discontinuation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sales Discontinuation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sales Discontinuation Date</em>' attribute.
	 * @see #setSalesDiscontinuationDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_SalesDiscontinuationDate()
	 * @model
	 * @generated
	 */
	Date getSalesDiscontinuationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getSalesDiscontinuationDate <em>Sales Discontinuation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sales Discontinuation Date</em>' attribute.
	 * @see #getSalesDiscontinuationDate()
	 * @generated
	 */
	void setSalesDiscontinuationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Shipping Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Depth</em>' attribute.
	 * @see #setShippingDepth(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ShippingDepth()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getShippingDepth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getShippingDepth <em>Shipping Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Depth</em>' attribute.
	 * @see #getShippingDepth()
	 * @generated
	 */
	void setShippingDepth(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shipping Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Height</em>' attribute.
	 * @see #setShippingHeight(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ShippingHeight()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getShippingHeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getShippingHeight <em>Shipping Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Height</em>' attribute.
	 * @see #getShippingHeight()
	 * @generated
	 */
	void setShippingHeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shipping Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Weight</em>' attribute.
	 * @see #setShippingWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ShippingWeight()
	 * @model annotation="mimo-ent-slot help='The shipping weight of the product.'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getShippingWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getShippingWeight <em>Shipping Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Weight</em>' attribute.
	 * @see #getShippingWeight()
	 * @generated
	 */
	void setShippingWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shipping Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Width</em>' attribute.
	 * @see #setShippingWidth(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ShippingWidth()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getShippingWidth();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getShippingWidth <em>Shipping Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Width</em>' attribute.
	 * @see #getShippingWidth()
	 * @generated
	 */
	void setShippingWidth(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Small Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Small Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Image Url</em>' attribute.
	 * @see #setSmallImageUrl(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_SmallImageUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getSmallImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getSmallImageUrl <em>Small Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Image Url</em>' attribute.
	 * @see #getSmallImageUrl()
	 * @generated
	 */
	void setSmallImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Support Discontinuation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Discontinuation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Discontinuation Date</em>' attribute.
	 * @see #setSupportDiscontinuationDate(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_SupportDiscontinuationDate()
	 * @model
	 * @generated
	 */
	Date getSupportDiscontinuationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getSupportDiscontinuationDate <em>Support Discontinuation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Discontinuation Date</em>' attribute.
	 * @see #getSupportDiscontinuationDate()
	 * @generated
	 */
	void setSupportDiscontinuationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Taxable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taxable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taxable</em>' attribute.
	 * @see #setTaxable(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_Taxable()
	 * @model
	 * @generated
	 */
	boolean isTaxable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isTaxable <em>Taxable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxable</em>' attribute.
	 * @see #isTaxable()
	 * @generated
	 */
	void setTaxable(boolean value);

	/**
	 * Returns the value of the '<em><b>Virtual Variant Method Enum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Variant Method Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Variant Method Enum</em>' reference.
	 * @see #setVirtualVariantMethodEnum(Enumeration)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_VirtualVariantMethodEnum()
	 * @model keys="enumId"
	 *        annotation="mimo-ent-slot help='This field defines the method of selecting a variant from the selectable features on the virtual product. Either as a variant explosion which will work to about 200 variants or as feature explosion which almost has no limits'"
	 * @generated
	 */
	Enumeration getVirtualVariantMethodEnum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getVirtualVariantMethodEnum <em>Virtual Variant Method Enum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Variant Method Enum</em>' reference.
	 * @see #getVirtualVariantMethodEnum()
	 * @generated
	 */
	void setVirtualVariantMethodEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Uom Id</em>' reference.
	 * @see #setWeightUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_WeightUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getWeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getWeightUomId <em>Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Uom Id</em>' reference.
	 * @see #getWeightUomId()
	 * @generated
	 */
	void setWeightUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Width Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Uom Id</em>' reference.
	 * @see #setWidthUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_WidthUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getWidthUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getWidthUomId <em>Width Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Uom Id</em>' reference.
	 * @see #getWidthUomId()
	 * @generated
	 */
	void setWidthUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Product Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Type Id</em>' reference.
	 * @see #setProductTypeId(ProductType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductTypeId()
	 * @model keys="productTypeId"
	 * @generated
	 */
	ProductType getProductTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductTypeId <em>Product Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Type Id</em>' reference.
	 * @see #getProductTypeId()
	 * @generated
	 */
	void setProductTypeId(ProductType value);

	/**
	 * Returns the value of the '<em><b>Primary Product Category Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Product Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Product Category Id</em>' reference.
	 * @see #setPrimaryProductCategoryId(ProductCategory)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_PrimaryProductCategoryId()
	 * @model keys="productCategoryId"
	 *        annotation="mimo-ent-slot help='The primary category ; it should be one of the productCategoryId already setup in ProductCategoryMember'"
	 * @generated
	 */
	ProductCategory getPrimaryProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getPrimaryProductCategoryId <em>Primary Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Product Category Id</em>' reference.
	 * @see #getPrimaryProductCategoryId()
	 * @generated
	 */
	void setPrimaryProductCategoryId(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Product Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.product.ProductAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<ProductAttribute> getProductAttributes();

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' reference.
	 * @see #setFacilityId(Facility)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_FacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getFacilityId <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' reference.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Type Id</em>' reference.
	 * @see #setInventoryItemTypeId(InventoryItemType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_InventoryItemTypeId()
	 * @model keys="inventoryItemTypeId"
	 * @generated
	 */
	InventoryItemType getInventoryItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getInventoryItemTypeId <em>Inventory Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Type Id</em>' reference.
	 * @see #getInventoryItemTypeId()
	 * @generated
	 */
	void setInventoryItemTypeId(InventoryItemType value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_ProductId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Auto Create Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Create Keywords</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Create Keywords</em>' attribute.
	 * @see #setAutoCreateKeywords(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProduct_AutoCreateKeywords()
	 * @model
	 * @generated
	 */
	boolean isAutoCreateKeywords();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.Product#isAutoCreateKeywords <em>Auto Create Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Create Keywords</em>' attribute.
	 * @see #isAutoCreateKeywords()
	 * @generated
	 */
	void setAutoCreateKeywords(boolean value);

} // Product
