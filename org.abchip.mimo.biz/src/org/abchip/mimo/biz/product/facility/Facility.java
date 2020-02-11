/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.abchip.mimo.biz.common.geo.GeoPoint;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.product.store.ProductStore;

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
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityAttributes <em>Facility Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityLocations <em>Facility Locations</em>}</li>
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
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels' formula='description'"
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
	 * @model annotation="mimo-ent-slot help='In the absence of a product specific days to ship in ProductFacility, this will be used'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
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
	 * Returns the value of the '<em><b>Default Dimension Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Dimension Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Dimension Uom Id</em>' reference.
	 * @see #setDefaultDimensionUomId(Uom)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_DefaultDimensionUomId()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='This field store the unit of measurement of dimension (length, width and height)'"
	 * @generated
	 */
	Uom getDefaultDimensionUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultDimensionUomId <em>Default Dimension Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Dimension Uom Id</em>' reference.
	 * @see #getDefaultDimensionUomId()
	 * @generated
	 */
	void setDefaultDimensionUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Default Inventory Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Inventory Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Inventory Item Type Id</em>' reference.
	 * @see #setDefaultInventoryItemTypeId(InventoryItemType)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_DefaultInventoryItemTypeId()
	 * @model keys="inventoryItemTypeId"
	 * @generated
	 */
	InventoryItemType getDefaultInventoryItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultInventoryItemTypeId <em>Default Inventory Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Inventory Item Type Id</em>' reference.
	 * @see #getDefaultInventoryItemTypeId()
	 * @generated
	 */
	void setDefaultInventoryItemTypeId(InventoryItemType value);

	/**
	 * Returns the value of the '<em><b>Default Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Weight Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Weight Uom Id</em>' reference.
	 * @see #setDefaultWeightUomId(Uom)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_DefaultWeightUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getDefaultWeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getDefaultWeightUomId <em>Default Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Weight Uom Id</em>' reference.
	 * @see #getDefaultWeightUomId()
	 * @generated
	 */
	void setDefaultWeightUomId(Uom value);

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
	 * @model annotation="mimo-ent-format type='description' length='255'"
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
	 * Returns the value of the '<em><b>Facility Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.facility.FacilityAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Attributes</em>' reference list.
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityAttributes()
	 * @model derived="true"
	 * @generated
	 */
	List<FacilityAttribute> getFacilityAttributes();

	/**
	 * Returns the value of the '<em><b>Facility Locations</b></em>' reference list.
	 * The list contents are of type {@link org.abchip.mimo.biz.product.facility.FacilityLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Locations</em>' reference list.
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityLocations()
	 * @model derived="true"
	 * @generated
	 */
	List<FacilityLocation> getFacilityLocations();

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
	 * @model annotation="mimo-ent-format type='name' length='100'"
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
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * Returns the value of the '<em><b>Facility Size Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Size Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Size Uom Id</em>' reference.
	 * @see #setFacilitySizeUomId(Uom)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilitySizeUomId()
	 * @model keys="uomId"
	 * @generated
	 */
	Uom getFacilitySizeUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilitySizeUomId <em>Facility Size Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Size Uom Id</em>' reference.
	 * @see #getFacilitySizeUomId()
	 * @generated
	 */
	void setFacilitySizeUomId(Uom value);

	/**
	 * Returns the value of the '<em><b>Geo Point Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Point Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Point Id</em>' reference.
	 * @see #setGeoPointId(GeoPoint)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_GeoPointId()
	 * @model keys="geoPointId"
	 * @generated
	 */
	GeoPoint getGeoPointId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getGeoPointId <em>Geo Point Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Point Id</em>' reference.
	 * @see #getGeoPointId()
	 * @generated
	 */
	void setGeoPointId(GeoPoint value);

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
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
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
	 * Returns the value of the '<em><b>Owner Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Party Id</em>' reference.
	 * @see #setOwnerPartyId(Party)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_OwnerPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getOwnerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getOwnerPartyId <em>Owner Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party Id</em>' reference.
	 * @see #getOwnerPartyId()
	 * @generated
	 */
	void setOwnerPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_ProductStoreId()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Parent Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Facility Id</em>' reference.
	 * @see #setParentFacilityId(Facility)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_ParentFacilityId()
	 * @model keys="facilityId"
	 * @generated
	 */
	Facility getParentFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getParentFacilityId <em>Parent Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Facility Id</em>' reference.
	 * @see #getParentFacilityId()
	 * @generated
	 */
	void setParentFacilityId(Facility value);

	/**
	 * Returns the value of the '<em><b>Primary Facility Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Facility Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Facility Group Id</em>' reference.
	 * @see #setPrimaryFacilityGroupId(FacilityGroup)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_PrimaryFacilityGroupId()
	 * @model keys="facilityGroupId"
	 * @generated
	 */
	FacilityGroup getPrimaryFacilityGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getPrimaryFacilityGroupId <em>Primary Facility Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Facility Group Id</em>' reference.
	 * @see #getPrimaryFacilityGroupId()
	 * @generated
	 */
	void setPrimaryFacilityGroupId(FacilityGroup value);

	/**
	 * Returns the value of the '<em><b>Facility Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Type Id</em>' reference.
	 * @see #setFacilityTypeId(FacilityType)
	 * @see org.abchip.mimo.biz.product.facility.FacilityPackage#getFacility_FacilityTypeId()
	 * @model keys="facilityTypeId"
	 * @generated
	 */
	FacilityType getFacilityTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.facility.Facility#getFacilityTypeId <em>Facility Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type Id</em>' reference.
	 * @see #getFacilityTypeId()
	 * @generated
	 */
	void setFacilityTypeId(FacilityType value);

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
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
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
