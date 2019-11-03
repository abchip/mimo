/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getClosedDate <em>Closed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultDaysToShip <em>Default Days To Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultDimensionUomId <em>Default Dimension Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultInventoryItemTypeId <em>Default Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultWeightUomId <em>Default Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityName <em>Facility Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilitySize <em>Facility Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilitySizeUomId <em>Facility Size Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityTypeId <em>Facility Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getOldSquareFootage <em>Old Square Footage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getOpenedDate <em>Opened Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getParentFacilityId <em>Parent Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getPrimaryFacilityGroupId <em>Primary Facility Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityAttributes <em>Facility Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityLocations <em>Facility Locations</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Facility extends BizEntityTyped<FacilityType> {
	/**
	 * Returns the value of the '<em><b>Closed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Date</em>' attribute.
	 * @see #setClosedDate(Date)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_ClosedDate()
	 * @model
	 * @generated
	 */
	Date getClosedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getClosedDate <em>Closed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Date</em>' attribute.
	 * @see #getClosedDate()
	 * @generated
	 */
	void setClosedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Default Days To Ship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Days To Ship</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Days To Ship</em>' attribute.
	 * @see #setDefaultDaysToShip(long)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_DefaultDaysToShip()
	 * @model
	 * @generated
	 */
	long getDefaultDaysToShip();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultDaysToShip <em>Default Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Days To Ship</em>' attribute.
	 * @see #getDefaultDaysToShip()
	 * @generated
	 */
	void setDefaultDaysToShip(long value);

	/**
	 * Returns the value of the '<em><b>Default Dimension Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Dimension Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Dimension Uom Id</em>' attribute.
	 * @see #setDefaultDimensionUomId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_DefaultDimensionUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getDefaultDimensionUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultDimensionUomId <em>Default Dimension Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Dimension Uom Id</em>' attribute.
	 * @see #getDefaultDimensionUomId()
	 * @generated
	 */
	void setDefaultDimensionUomId(String value);

	/**
	 * Returns the value of the '<em><b>Default Inventory Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Inventory Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Inventory Item Type Id</em>' attribute.
	 * @see #setDefaultInventoryItemTypeId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_DefaultInventoryItemTypeId()
	 * @model annotation="mimo-ent-domain frame='InventoryItemType'"
	 * @generated
	 */
	String getDefaultInventoryItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultInventoryItemTypeId <em>Default Inventory Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Inventory Item Type Id</em>' attribute.
	 * @see #getDefaultInventoryItemTypeId()
	 * @generated
	 */
	void setDefaultInventoryItemTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Default Weight Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Weight Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Weight Uom Id</em>' attribute.
	 * @see #setDefaultWeightUomId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_DefaultWeightUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getDefaultWeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultWeightUomId <em>Default Weight Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Weight Uom Id</em>' attribute.
	 * @see #getDefaultWeightUomId()
	 * @generated
	 */
	void setDefaultWeightUomId(String value);

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
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Facility Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Name</em>' attribute.
	 * @see #setFacilityName(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityName()
	 * @model
	 * @generated
	 */
	String getFacilityName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityName <em>Facility Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Name</em>' attribute.
	 * @see #getFacilityName()
	 * @generated
	 */
	void setFacilityName(String value);

	/**
	 * Returns the value of the '<em><b>Facility Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Size</em>' attribute.
	 * @see #setFacilitySize(BigDecimal)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilitySize()
	 * @model
	 * @generated
	 */
	BigDecimal getFacilitySize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilitySize <em>Facility Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Size</em>' attribute.
	 * @see #getFacilitySize()
	 * @generated
	 */
	void setFacilitySize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Facility Size Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Size Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Size Uom Id</em>' attribute.
	 * @see #setFacilitySizeUomId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilitySizeUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getFacilitySizeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilitySizeUomId <em>Facility Size Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Size Uom Id</em>' attribute.
	 * @see #getFacilitySizeUomId()
	 * @generated
	 */
	void setFacilitySizeUomId(String value);

	/**
	 * Returns the value of the '<em><b>Geo Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Point Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point Id</em>' attribute.
	 * @see #setGeoPointId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_GeoPointId()
	 * @model annotation="mimo-ent-domain frame='GeoPoint'"
	 * @generated
	 */
	String getGeoPointId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getGeoPointId <em>Geo Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point Id</em>' attribute.
	 * @see #getGeoPointId()
	 * @generated
	 */
	void setGeoPointId(String value);

	/**
	 * Returns the value of the '<em><b>Old Square Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Square Footage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Square Footage</em>' attribute.
	 * @see #setOldSquareFootage(long)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_OldSquareFootage()
	 * @model
	 * @generated
	 */
	long getOldSquareFootage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getOldSquareFootage <em>Old Square Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Square Footage</em>' attribute.
	 * @see #getOldSquareFootage()
	 * @generated
	 */
	void setOldSquareFootage(long value);

	/**
	 * Returns the value of the '<em><b>Opened Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opened Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opened Date</em>' attribute.
	 * @see #setOpenedDate(Date)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_OpenedDate()
	 * @model
	 * @generated
	 */
	Date getOpenedDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getOpenedDate <em>Opened Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opened Date</em>' attribute.
	 * @see #getOpenedDate()
	 * @generated
	 */
	void setOpenedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Owner Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party Id</em>' attribute.
	 * @see #setOwnerPartyId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_OwnerPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOwnerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getOwnerPartyId <em>Owner Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party Id</em>' attribute.
	 * @see #getOwnerPartyId()
	 * @generated
	 */
	void setOwnerPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FacilityAttribute'"
	 * @generated
	 */
	List<String> getFacilityAttributes();

	/**
	 * Returns the value of the '<em><b>Facility Locations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Locations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Locations</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityLocations()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FacilityLocation'"
	 * @generated
	 */
	List<String> getFacilityLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Facility' route='parentFacilityId'"
	 * @generated
	 */
	List<String> childFacilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Container' route='facilityId'"
	 * @generated
	 */
	List<String> containers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Delivery' route='destFacilityId'"
	 * @generated
	 */
	List<String> destDeliveries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment' route='destFacilityId'"
	 * @generated
	 */
	List<String> destShipmentRouteSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='destinationFacilityId'"
	 * @generated
	 */
	List<String> destinationShipments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItem' route='facilityId'"
	 * @generated
	 */
	List<String> inventoryItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryTransfer' route='facilityId'"
	 * @generated
	 */
	List<String> inventoryTransfers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset' route='locatedAtFacilityId'"
	 * @generated
	 */
	List<String> locatedAtFixedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItemShipGroup' route='facilityId'"
	 * @generated
	 */
	List<String> orderItemShipGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Delivery' route='originFacilityId'"
	 * @generated
	 */
	List<String> originDeliveries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader' route='originFacilityId'"
	 * @generated
	 */
	List<String> originOrderHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment' route='originFacilityId'"
	 * @generated
	 */
	List<String> originShipmentRouteSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='originFacilityId'"
	 * @generated
	 */
	List<String> originShipments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Picklist' route='facilityId'"
	 * @generated
	 */
	List<String> picklists();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductFacility' route='facilityId'"
	 * @generated
	 */
	List<String> productFacilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='facilityId'"
	 * @generated
	 */
	List<String> products();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReorderGuideline' route='facilityId'"
	 * @generated
	 */
	List<String> reorderGuidelines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Requirement' route='facilityId'"
	 * @generated
	 */
	List<String> requirements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader' route='destinationFacilityId'"
	 * @generated
	 */
	List<String> returnHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryTransfer' route='facilityIdTo'"
	 * @generated
	 */
	List<String> toInventoryTransfers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='facilityId'"
	 * @generated
	 */
	List<String> workEfforts();

	/**
	 * Returns the value of the '<em><b>Parent Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Facility Id</em>' attribute.
	 * @see #setParentFacilityId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_ParentFacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getParentFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getParentFacilityId <em>Parent Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Facility Id</em>' attribute.
	 * @see #getParentFacilityId()
	 * @generated
	 */
	void setParentFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Primary Facility Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Facility Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Facility Group Id</em>' attribute.
	 * @see #setPrimaryFacilityGroupId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_PrimaryFacilityGroupId()
	 * @model annotation="mimo-ent-domain frame='FacilityGroup'"
	 * @generated
	 */
	String getPrimaryFacilityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getPrimaryFacilityGroupId <em>Primary Facility Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Facility Group Id</em>' attribute.
	 * @see #getPrimaryFacilityGroupId()
	 * @generated
	 */
	void setPrimaryFacilityGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Type Id</em>' attribute.
	 * @see #setFacilityTypeId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityTypeId()
	 * @model annotation="mimo-ent-domain frame='FacilityType'"
	 * @generated
	 */
	String getFacilityTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityTypeId <em>Facility Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type Id</em>' attribute.
	 * @see #getFacilityTypeId()
	 * @generated
	 */
	void setFacilityTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' attribute.
	 * @see #setFacilityId(String)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityId <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' attribute.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(String value);

} // Facility
