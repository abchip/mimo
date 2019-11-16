/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.facility.FacilityGroup;
import org.abchip.mimo.biz.product.facility.FacilityPackage;
import org.abchip.mimo.biz.product.facility.FacilityType;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getClosedDate <em>Closed Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getDefaultDaysToShip <em>Default Days To Ship</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getFacilityName <em>Facility Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getFacilitySize <em>Facility Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getOldSquareFootage <em>Old Square Footage</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getOpenedDate <em>Opened Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getFacilityTypeId <em>Facility Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getParentFacilityId <em>Parent Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getPrimaryFacilityGroupId <em>Primary Facility Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getDefaultInventoryItemTypeId <em>Default Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getDefaultDimensionUomId <em>Default Dimension Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getDefaultWeightUomId <em>Default Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getGeoPointId <em>Geo Point Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getFacilitySizeUomId <em>Facility Size Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getFacilityAttributes <em>Facility Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.impl.FacilityImpl#getFacilityLocations <em>Facility Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacilityImpl extends BizEntityTypedImpl<FacilityType> implements Facility {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FacilityPackage.Literals.FACILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getClosedDate() {
		return (Date)eGet(FacilityPackage.Literals.FACILITY__CLOSED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedDate(Date newClosedDate) {
		eSet(FacilityPackage.Literals.FACILITY__CLOSED_DATE, newClosedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDefaultDaysToShip() {
		return (Long)eGet(FacilityPackage.Literals.FACILITY__DEFAULT_DAYS_TO_SHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDaysToShip(long newDefaultDaysToShip) {
		eSet(FacilityPackage.Literals.FACILITY__DEFAULT_DAYS_TO_SHIP, newDefaultDaysToShip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDefaultDimensionUomId() {
		return (Uom)eGet(FacilityPackage.Literals.FACILITY__DEFAULT_DIMENSION_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDimensionUomId(Uom newDefaultDimensionUomId) {
		eSet(FacilityPackage.Literals.FACILITY__DEFAULT_DIMENSION_UOM_ID, newDefaultDimensionUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType getDefaultInventoryItemTypeId() {
		return (InventoryItemType)eGet(FacilityPackage.Literals.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInventoryItemTypeId(InventoryItemType newDefaultInventoryItemTypeId) {
		eSet(FacilityPackage.Literals.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID, newDefaultInventoryItemTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDefaultWeightUomId() {
		return (Uom)eGet(FacilityPackage.Literals.FACILITY__DEFAULT_WEIGHT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultWeightUomId(Uom newDefaultWeightUomId) {
		eSet(FacilityPackage.Literals.FACILITY__DEFAULT_WEIGHT_UOM_ID, newDefaultWeightUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(FacilityPackage.Literals.FACILITY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(FacilityPackage.Literals.FACILITY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityName() {
		return (String)eGet(FacilityPackage.Literals.FACILITY__FACILITY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityName(String newFacilityName) {
		eSet(FacilityPackage.Literals.FACILITY__FACILITY_NAME, newFacilityName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFacilitySize() {
		return (BigDecimal)eGet(FacilityPackage.Literals.FACILITY__FACILITY_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilitySize(BigDecimal newFacilitySize) {
		eSet(FacilityPackage.Literals.FACILITY__FACILITY_SIZE, newFacilitySize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getFacilitySizeUomId() {
		return (Uom)eGet(FacilityPackage.Literals.FACILITY__FACILITY_SIZE_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilitySizeUomId(Uom newFacilitySizeUomId) {
		eSet(FacilityPackage.Literals.FACILITY__FACILITY_SIZE_UOM_ID, newFacilitySizeUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPoint getGeoPointId() {
		return (GeoPoint)eGet(FacilityPackage.Literals.FACILITY__GEO_POINT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointId(GeoPoint newGeoPointId) {
		eSet(FacilityPackage.Literals.FACILITY__GEO_POINT_ID, newGeoPointId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getOldSquareFootage() {
		return (Long)eGet(FacilityPackage.Literals.FACILITY__OLD_SQUARE_FOOTAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldSquareFootage(long newOldSquareFootage) {
		eSet(FacilityPackage.Literals.FACILITY__OLD_SQUARE_FOOTAGE, newOldSquareFootage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpenedDate() {
		return (Date)eGet(FacilityPackage.Literals.FACILITY__OPENED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenedDate(Date newOpenedDate) {
		eSet(FacilityPackage.Literals.FACILITY__OPENED_DATE, newOpenedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerPartyId() {
		return (Party)eGet(FacilityPackage.Literals.FACILITY__OWNER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(Party newOwnerPartyId) {
		eSet(FacilityPackage.Literals.FACILITY__OWNER_PARTY_ID, newOwnerPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(FacilityPackage.Literals.FACILITY__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(FacilityPackage.Literals.FACILITY__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getFacilityAttributes() {
		return (List<String>)eGet(FacilityPackage.Literals.FACILITY__FACILITY_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getFacilityLocations() {
		return (List<String>)eGet(FacilityPackage.Literals.FACILITY__FACILITY_LOCATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childFacilities() {
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
	public List<String> containers() {
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
	public List<String> destDeliveries() {
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
	public List<String> destShipmentRouteSegments() {
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
	public List<String> destinationShipments() {
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
	public List<String> inventoryTransfers() {
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
	public List<String> locatedAtFixedAssets() {
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
	public List<String> orderItemShipGroups() {
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
	public List<String> originDeliveries() {
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
	public List<String> originOrderHeaders() {
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
	public List<String> originShipmentRouteSegments() {
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
	public List<String> originShipments() {
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
	public List<String> picklists() {
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
	public List<String> productFacilities() {
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
	public List<String> products() {
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
	public List<String> returnHeaders() {
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
	public List<String> toInventoryTransfers() {
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
	public List<String> workEfforts() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FacilityPackage.FACILITY___CHILD_FACILITIES:
				return childFacilities();
			case FacilityPackage.FACILITY___CONTAINERS:
				return containers();
			case FacilityPackage.FACILITY___DEST_DELIVERIES:
				return destDeliveries();
			case FacilityPackage.FACILITY___DEST_SHIPMENT_ROUTE_SEGMENTS:
				return destShipmentRouteSegments();
			case FacilityPackage.FACILITY___DESTINATION_SHIPMENTS:
				return destinationShipments();
			case FacilityPackage.FACILITY___INVENTORY_ITEMS:
				return inventoryItems();
			case FacilityPackage.FACILITY___INVENTORY_TRANSFERS:
				return inventoryTransfers();
			case FacilityPackage.FACILITY___LOCATED_AT_FIXED_ASSETS:
				return locatedAtFixedAssets();
			case FacilityPackage.FACILITY___ORDER_ITEM_SHIP_GROUPS:
				return orderItemShipGroups();
			case FacilityPackage.FACILITY___ORIGIN_DELIVERIES:
				return originDeliveries();
			case FacilityPackage.FACILITY___ORIGIN_ORDER_HEADERS:
				return originOrderHeaders();
			case FacilityPackage.FACILITY___ORIGIN_SHIPMENT_ROUTE_SEGMENTS:
				return originShipmentRouteSegments();
			case FacilityPackage.FACILITY___ORIGIN_SHIPMENTS:
				return originShipments();
			case FacilityPackage.FACILITY___PICKLISTS:
				return picklists();
			case FacilityPackage.FACILITY___PRODUCT_FACILITIES:
				return productFacilities();
			case FacilityPackage.FACILITY___PRODUCTS:
				return products();
			case FacilityPackage.FACILITY___REORDER_GUIDELINES:
				return reorderGuidelines();
			case FacilityPackage.FACILITY___REQUIREMENTS:
				return requirements();
			case FacilityPackage.FACILITY___RETURN_HEADERS:
				return returnHeaders();
			case FacilityPackage.FACILITY___TO_INVENTORY_TRANSFERS:
				return toInventoryTransfers();
			case FacilityPackage.FACILITY___WORK_EFFORTS:
				return workEfforts();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getParentFacilityId() {
		return (Facility)eGet(FacilityPackage.Literals.FACILITY__PARENT_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentFacilityId(Facility newParentFacilityId) {
		eSet(FacilityPackage.Literals.FACILITY__PARENT_FACILITY_ID, newParentFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroup getPrimaryFacilityGroupId() {
		return (FacilityGroup)eGet(FacilityPackage.Literals.FACILITY__PRIMARY_FACILITY_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryFacilityGroupId(FacilityGroup newPrimaryFacilityGroupId) {
		eSet(FacilityPackage.Literals.FACILITY__PRIMARY_FACILITY_GROUP_ID, newPrimaryFacilityGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityType getFacilityTypeId() {
		return (FacilityType)eGet(FacilityPackage.Literals.FACILITY__FACILITY_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityTypeId(FacilityType newFacilityTypeId) {
		eSet(FacilityPackage.Literals.FACILITY__FACILITY_TYPE_ID, newFacilityTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return (String)eGet(FacilityPackage.Literals.FACILITY__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		eSet(FacilityPackage.Literals.FACILITY__FACILITY_ID, newFacilityId);
	}

} //FacilityImpl
