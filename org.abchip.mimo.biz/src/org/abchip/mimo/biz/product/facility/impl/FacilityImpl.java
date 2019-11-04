/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.facility.impl;

import java.math.BigDecimal;

import java.util.Collection;
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClosedDate() <em>Closed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosedDate() <em>Closed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedDate()
	 * @generated
	 * @ordered
	 */
	protected Date closedDate = CLOSED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultDaysToShip() <em>Default Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDaysToShip()
	 * @generated
	 * @ordered
	 */
	protected static final long DEFAULT_DAYS_TO_SHIP_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDefaultDaysToShip() <em>Default Days To Ship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDaysToShip()
	 * @generated
	 * @ordered
	 */
	protected long defaultDaysToShip = DEFAULT_DAYS_TO_SHIP_EDEFAULT;

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
	 * The default value of the '{@link #getFacilityName() <em>Facility Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityName()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityName() <em>Facility Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityName()
	 * @generated
	 * @ordered
	 */
	protected String facilityName = FACILITY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacilitySize() <em>Facility Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FACILITY_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilitySize() <em>Facility Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal facilitySize = FACILITY_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldSquareFootage() <em>Old Square Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldSquareFootage()
	 * @generated
	 * @ordered
	 */
	protected static final long OLD_SQUARE_FOOTAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOldSquareFootage() <em>Old Square Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldSquareFootage()
	 * @generated
	 * @ordered
	 */
	protected long oldSquareFootage = OLD_SQUARE_FOOTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenedDate() <em>Opened Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPENED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenedDate() <em>Opened Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenedDate()
	 * @generated
	 * @ordered
	 */
	protected Date openedDate = OPENED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFacilityTypeId() <em>Facility Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityTypeId()
	 * @generated
	 * @ordered
	 */
	protected FacilityType facilityTypeId;

	/**
	 * The cached value of the '{@link #getParentFacilityId() <em>Parent Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility parentFacilityId;

	/**
	 * The cached value of the '{@link #getPrimaryFacilityGroupId() <em>Primary Facility Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryFacilityGroupId()
	 * @generated
	 * @ordered
	 */
	protected FacilityGroup primaryFacilityGroupId;

	/**
	 * The cached value of the '{@link #getOwnerPartyId() <em>Owner Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party ownerPartyId;

	/**
	 * The cached value of the '{@link #getDefaultInventoryItemTypeId() <em>Default Inventory Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInventoryItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemType defaultInventoryItemTypeId;

	/**
	 * The cached value of the '{@link #getDefaultDimensionUomId() <em>Default Dimension Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDimensionUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom defaultDimensionUomId;

	/**
	 * The cached value of the '{@link #getDefaultWeightUomId() <em>Default Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultWeightUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom defaultWeightUomId;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getGeoPointId() <em>Geo Point Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoPointId()
	 * @generated
	 * @ordered
	 */
	protected GeoPoint geoPointId;

	/**
	 * The cached value of the '{@link #getFacilitySizeUomId() <em>Facility Size Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySizeUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom facilitySizeUomId;

	/**
	 * The cached value of the '{@link #getFacilityAttributes() <em>Facility Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facilityAttributes;

	/**
	 * The cached value of the '{@link #getFacilityLocations() <em>Facility Locations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facilityLocations;

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
		return closedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedDate(Date newClosedDate) {
		Date oldClosedDate = closedDate;
		closedDate = newClosedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__CLOSED_DATE, oldClosedDate, closedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDefaultDaysToShip() {
		return defaultDaysToShip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDaysToShip(long newDefaultDaysToShip) {
		long oldDefaultDaysToShip = defaultDaysToShip;
		defaultDaysToShip = newDefaultDaysToShip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__DEFAULT_DAYS_TO_SHIP, oldDefaultDaysToShip, defaultDaysToShip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDefaultDimensionUomId() {
		if (defaultDimensionUomId != null && ((EObject)defaultDimensionUomId).eIsProxy()) {
			InternalEObject oldDefaultDimensionUomId = (InternalEObject)defaultDimensionUomId;
			defaultDimensionUomId = (Uom)eResolveProxy(oldDefaultDimensionUomId);
			if (defaultDimensionUomId != oldDefaultDimensionUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__DEFAULT_DIMENSION_UOM_ID, oldDefaultDimensionUomId, defaultDimensionUomId));
			}
		}
		return defaultDimensionUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetDefaultDimensionUomId() {
		return defaultDimensionUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDimensionUomId(Uom newDefaultDimensionUomId) {
		Uom oldDefaultDimensionUomId = defaultDimensionUomId;
		defaultDimensionUomId = newDefaultDimensionUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__DEFAULT_DIMENSION_UOM_ID, oldDefaultDimensionUomId, defaultDimensionUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType getDefaultInventoryItemTypeId() {
		if (defaultInventoryItemTypeId != null && ((EObject)defaultInventoryItemTypeId).eIsProxy()) {
			InternalEObject oldDefaultInventoryItemTypeId = (InternalEObject)defaultInventoryItemTypeId;
			defaultInventoryItemTypeId = (InventoryItemType)eResolveProxy(oldDefaultInventoryItemTypeId);
			if (defaultInventoryItemTypeId != oldDefaultInventoryItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID, oldDefaultInventoryItemTypeId, defaultInventoryItemTypeId));
			}
		}
		return defaultInventoryItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemType basicGetDefaultInventoryItemTypeId() {
		return defaultInventoryItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultInventoryItemTypeId(InventoryItemType newDefaultInventoryItemTypeId) {
		InventoryItemType oldDefaultInventoryItemTypeId = defaultInventoryItemTypeId;
		defaultInventoryItemTypeId = newDefaultInventoryItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID, oldDefaultInventoryItemTypeId, defaultInventoryItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getDefaultWeightUomId() {
		if (defaultWeightUomId != null && ((EObject)defaultWeightUomId).eIsProxy()) {
			InternalEObject oldDefaultWeightUomId = (InternalEObject)defaultWeightUomId;
			defaultWeightUomId = (Uom)eResolveProxy(oldDefaultWeightUomId);
			if (defaultWeightUomId != oldDefaultWeightUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__DEFAULT_WEIGHT_UOM_ID, oldDefaultWeightUomId, defaultWeightUomId));
			}
		}
		return defaultWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetDefaultWeightUomId() {
		return defaultWeightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultWeightUomId(Uom newDefaultWeightUomId) {
		Uom oldDefaultWeightUomId = defaultWeightUomId;
		defaultWeightUomId = newDefaultWeightUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__DEFAULT_WEIGHT_UOM_ID, oldDefaultWeightUomId, defaultWeightUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityName() {
		return facilityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityName(String newFacilityName) {
		String oldFacilityName = facilityName;
		facilityName = newFacilityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__FACILITY_NAME, oldFacilityName, facilityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFacilitySize() {
		return facilitySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilitySize(BigDecimal newFacilitySize) {
		BigDecimal oldFacilitySize = facilitySize;
		facilitySize = newFacilitySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__FACILITY_SIZE, oldFacilitySize, facilitySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getFacilitySizeUomId() {
		if (facilitySizeUomId != null && ((EObject)facilitySizeUomId).eIsProxy()) {
			InternalEObject oldFacilitySizeUomId = (InternalEObject)facilitySizeUomId;
			facilitySizeUomId = (Uom)eResolveProxy(oldFacilitySizeUomId);
			if (facilitySizeUomId != oldFacilitySizeUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__FACILITY_SIZE_UOM_ID, oldFacilitySizeUomId, facilitySizeUomId));
			}
		}
		return facilitySizeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetFacilitySizeUomId() {
		return facilitySizeUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilitySizeUomId(Uom newFacilitySizeUomId) {
		Uom oldFacilitySizeUomId = facilitySizeUomId;
		facilitySizeUomId = newFacilitySizeUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__FACILITY_SIZE_UOM_ID, oldFacilitySizeUomId, facilitySizeUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeoPoint getGeoPointId() {
		if (geoPointId != null && ((EObject)geoPointId).eIsProxy()) {
			InternalEObject oldGeoPointId = (InternalEObject)geoPointId;
			geoPointId = (GeoPoint)eResolveProxy(oldGeoPointId);
			if (geoPointId != oldGeoPointId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__GEO_POINT_ID, oldGeoPointId, geoPointId));
			}
		}
		return geoPointId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoPoint basicGetGeoPointId() {
		return geoPointId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoPointId(GeoPoint newGeoPointId) {
		GeoPoint oldGeoPointId = geoPointId;
		geoPointId = newGeoPointId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__GEO_POINT_ID, oldGeoPointId, geoPointId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getOldSquareFootage() {
		return oldSquareFootage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldSquareFootage(long newOldSquareFootage) {
		long oldOldSquareFootage = oldSquareFootage;
		oldSquareFootage = newOldSquareFootage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__OLD_SQUARE_FOOTAGE, oldOldSquareFootage, oldSquareFootage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpenedDate() {
		return openedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenedDate(Date newOpenedDate) {
		Date oldOpenedDate = openedDate;
		openedDate = newOpenedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__OPENED_DATE, oldOpenedDate, openedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerPartyId() {
		if (ownerPartyId != null && ((EObject)ownerPartyId).eIsProxy()) {
			InternalEObject oldOwnerPartyId = (InternalEObject)ownerPartyId;
			ownerPartyId = (Party)eResolveProxy(oldOwnerPartyId);
			if (ownerPartyId != oldOwnerPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__OWNER_PARTY_ID, oldOwnerPartyId, ownerPartyId));
			}
		}
		return ownerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOwnerPartyId() {
		return ownerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(Party newOwnerPartyId) {
		Party oldOwnerPartyId = ownerPartyId;
		ownerPartyId = newOwnerPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__OWNER_PARTY_ID, oldOwnerPartyId, ownerPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFacilityAttributes() {
		if (facilityAttributes == null) {
			facilityAttributes = new EDataTypeUniqueEList<String>(String.class, this, FacilityPackage.FACILITY__FACILITY_ATTRIBUTES);
		}
		return facilityAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFacilityLocations() {
		if (facilityLocations == null) {
			facilityLocations = new EDataTypeUniqueEList<String>(String.class, this, FacilityPackage.FACILITY__FACILITY_LOCATIONS);
		}
		return facilityLocations;
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
	public Facility getParentFacilityId() {
		if (parentFacilityId != null && ((EObject)parentFacilityId).eIsProxy()) {
			InternalEObject oldParentFacilityId = (InternalEObject)parentFacilityId;
			parentFacilityId = (Facility)eResolveProxy(oldParentFacilityId);
			if (parentFacilityId != oldParentFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__PARENT_FACILITY_ID, oldParentFacilityId, parentFacilityId));
			}
		}
		return parentFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetParentFacilityId() {
		return parentFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentFacilityId(Facility newParentFacilityId) {
		Facility oldParentFacilityId = parentFacilityId;
		parentFacilityId = newParentFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__PARENT_FACILITY_ID, oldParentFacilityId, parentFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityGroup getPrimaryFacilityGroupId() {
		if (primaryFacilityGroupId != null && ((EObject)primaryFacilityGroupId).eIsProxy()) {
			InternalEObject oldPrimaryFacilityGroupId = (InternalEObject)primaryFacilityGroupId;
			primaryFacilityGroupId = (FacilityGroup)eResolveProxy(oldPrimaryFacilityGroupId);
			if (primaryFacilityGroupId != oldPrimaryFacilityGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__PRIMARY_FACILITY_GROUP_ID, oldPrimaryFacilityGroupId, primaryFacilityGroupId));
			}
		}
		return primaryFacilityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityGroup basicGetPrimaryFacilityGroupId() {
		return primaryFacilityGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryFacilityGroupId(FacilityGroup newPrimaryFacilityGroupId) {
		FacilityGroup oldPrimaryFacilityGroupId = primaryFacilityGroupId;
		primaryFacilityGroupId = newPrimaryFacilityGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__PRIMARY_FACILITY_GROUP_ID, oldPrimaryFacilityGroupId, primaryFacilityGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FacilityType getFacilityTypeId() {
		if (facilityTypeId != null && ((EObject)facilityTypeId).eIsProxy()) {
			InternalEObject oldFacilityTypeId = (InternalEObject)facilityTypeId;
			facilityTypeId = (FacilityType)eResolveProxy(oldFacilityTypeId);
			if (facilityTypeId != oldFacilityTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacilityPackage.FACILITY__FACILITY_TYPE_ID, oldFacilityTypeId, facilityTypeId));
			}
		}
		return facilityTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityType basicGetFacilityTypeId() {
		return facilityTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityTypeId(FacilityType newFacilityTypeId) {
		FacilityType oldFacilityTypeId = facilityTypeId;
		facilityTypeId = newFacilityTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__FACILITY_TYPE_ID, oldFacilityTypeId, facilityTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FacilityPackage.FACILITY__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FacilityPackage.FACILITY__FACILITY_ID:
				return getFacilityId();
			case FacilityPackage.FACILITY__CLOSED_DATE:
				return getClosedDate();
			case FacilityPackage.FACILITY__DEFAULT_DAYS_TO_SHIP:
				return getDefaultDaysToShip();
			case FacilityPackage.FACILITY__DESCRIPTION:
				return getDescription();
			case FacilityPackage.FACILITY__FACILITY_NAME:
				return getFacilityName();
			case FacilityPackage.FACILITY__FACILITY_SIZE:
				return getFacilitySize();
			case FacilityPackage.FACILITY__OLD_SQUARE_FOOTAGE:
				return getOldSquareFootage();
			case FacilityPackage.FACILITY__OPENED_DATE:
				return getOpenedDate();
			case FacilityPackage.FACILITY__FACILITY_TYPE_ID:
				if (resolve) return getFacilityTypeId();
				return basicGetFacilityTypeId();
			case FacilityPackage.FACILITY__PARENT_FACILITY_ID:
				if (resolve) return getParentFacilityId();
				return basicGetParentFacilityId();
			case FacilityPackage.FACILITY__PRIMARY_FACILITY_GROUP_ID:
				if (resolve) return getPrimaryFacilityGroupId();
				return basicGetPrimaryFacilityGroupId();
			case FacilityPackage.FACILITY__OWNER_PARTY_ID:
				if (resolve) return getOwnerPartyId();
				return basicGetOwnerPartyId();
			case FacilityPackage.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID:
				if (resolve) return getDefaultInventoryItemTypeId();
				return basicGetDefaultInventoryItemTypeId();
			case FacilityPackage.FACILITY__DEFAULT_DIMENSION_UOM_ID:
				if (resolve) return getDefaultDimensionUomId();
				return basicGetDefaultDimensionUomId();
			case FacilityPackage.FACILITY__DEFAULT_WEIGHT_UOM_ID:
				if (resolve) return getDefaultWeightUomId();
				return basicGetDefaultWeightUomId();
			case FacilityPackage.FACILITY__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case FacilityPackage.FACILITY__GEO_POINT_ID:
				if (resolve) return getGeoPointId();
				return basicGetGeoPointId();
			case FacilityPackage.FACILITY__FACILITY_SIZE_UOM_ID:
				if (resolve) return getFacilitySizeUomId();
				return basicGetFacilitySizeUomId();
			case FacilityPackage.FACILITY__FACILITY_ATTRIBUTES:
				return getFacilityAttributes();
			case FacilityPackage.FACILITY__FACILITY_LOCATIONS:
				return getFacilityLocations();
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
			case FacilityPackage.FACILITY__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case FacilityPackage.FACILITY__CLOSED_DATE:
				setClosedDate((Date)newValue);
				return;
			case FacilityPackage.FACILITY__DEFAULT_DAYS_TO_SHIP:
				setDefaultDaysToShip((Long)newValue);
				return;
			case FacilityPackage.FACILITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FacilityPackage.FACILITY__FACILITY_NAME:
				setFacilityName((String)newValue);
				return;
			case FacilityPackage.FACILITY__FACILITY_SIZE:
				setFacilitySize((BigDecimal)newValue);
				return;
			case FacilityPackage.FACILITY__OLD_SQUARE_FOOTAGE:
				setOldSquareFootage((Long)newValue);
				return;
			case FacilityPackage.FACILITY__OPENED_DATE:
				setOpenedDate((Date)newValue);
				return;
			case FacilityPackage.FACILITY__FACILITY_TYPE_ID:
				setFacilityTypeId((FacilityType)newValue);
				return;
			case FacilityPackage.FACILITY__PARENT_FACILITY_ID:
				setParentFacilityId((Facility)newValue);
				return;
			case FacilityPackage.FACILITY__PRIMARY_FACILITY_GROUP_ID:
				setPrimaryFacilityGroupId((FacilityGroup)newValue);
				return;
			case FacilityPackage.FACILITY__OWNER_PARTY_ID:
				setOwnerPartyId((Party)newValue);
				return;
			case FacilityPackage.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID:
				setDefaultInventoryItemTypeId((InventoryItemType)newValue);
				return;
			case FacilityPackage.FACILITY__DEFAULT_DIMENSION_UOM_ID:
				setDefaultDimensionUomId((Uom)newValue);
				return;
			case FacilityPackage.FACILITY__DEFAULT_WEIGHT_UOM_ID:
				setDefaultWeightUomId((Uom)newValue);
				return;
			case FacilityPackage.FACILITY__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case FacilityPackage.FACILITY__GEO_POINT_ID:
				setGeoPointId((GeoPoint)newValue);
				return;
			case FacilityPackage.FACILITY__FACILITY_SIZE_UOM_ID:
				setFacilitySizeUomId((Uom)newValue);
				return;
			case FacilityPackage.FACILITY__FACILITY_ATTRIBUTES:
				getFacilityAttributes().clear();
				getFacilityAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case FacilityPackage.FACILITY__FACILITY_LOCATIONS:
				getFacilityLocations().clear();
				getFacilityLocations().addAll((Collection<? extends String>)newValue);
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
			case FacilityPackage.FACILITY__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__CLOSED_DATE:
				setClosedDate(CLOSED_DATE_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__DEFAULT_DAYS_TO_SHIP:
				setDefaultDaysToShip(DEFAULT_DAYS_TO_SHIP_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__FACILITY_NAME:
				setFacilityName(FACILITY_NAME_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__FACILITY_SIZE:
				setFacilitySize(FACILITY_SIZE_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__OLD_SQUARE_FOOTAGE:
				setOldSquareFootage(OLD_SQUARE_FOOTAGE_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__OPENED_DATE:
				setOpenedDate(OPENED_DATE_EDEFAULT);
				return;
			case FacilityPackage.FACILITY__FACILITY_TYPE_ID:
				setFacilityTypeId((FacilityType)null);
				return;
			case FacilityPackage.FACILITY__PARENT_FACILITY_ID:
				setParentFacilityId((Facility)null);
				return;
			case FacilityPackage.FACILITY__PRIMARY_FACILITY_GROUP_ID:
				setPrimaryFacilityGroupId((FacilityGroup)null);
				return;
			case FacilityPackage.FACILITY__OWNER_PARTY_ID:
				setOwnerPartyId((Party)null);
				return;
			case FacilityPackage.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID:
				setDefaultInventoryItemTypeId((InventoryItemType)null);
				return;
			case FacilityPackage.FACILITY__DEFAULT_DIMENSION_UOM_ID:
				setDefaultDimensionUomId((Uom)null);
				return;
			case FacilityPackage.FACILITY__DEFAULT_WEIGHT_UOM_ID:
				setDefaultWeightUomId((Uom)null);
				return;
			case FacilityPackage.FACILITY__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case FacilityPackage.FACILITY__GEO_POINT_ID:
				setGeoPointId((GeoPoint)null);
				return;
			case FacilityPackage.FACILITY__FACILITY_SIZE_UOM_ID:
				setFacilitySizeUomId((Uom)null);
				return;
			case FacilityPackage.FACILITY__FACILITY_ATTRIBUTES:
				getFacilityAttributes().clear();
				return;
			case FacilityPackage.FACILITY__FACILITY_LOCATIONS:
				getFacilityLocations().clear();
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
			case FacilityPackage.FACILITY__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case FacilityPackage.FACILITY__CLOSED_DATE:
				return CLOSED_DATE_EDEFAULT == null ? closedDate != null : !CLOSED_DATE_EDEFAULT.equals(closedDate);
			case FacilityPackage.FACILITY__DEFAULT_DAYS_TO_SHIP:
				return defaultDaysToShip != DEFAULT_DAYS_TO_SHIP_EDEFAULT;
			case FacilityPackage.FACILITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FacilityPackage.FACILITY__FACILITY_NAME:
				return FACILITY_NAME_EDEFAULT == null ? facilityName != null : !FACILITY_NAME_EDEFAULT.equals(facilityName);
			case FacilityPackage.FACILITY__FACILITY_SIZE:
				return FACILITY_SIZE_EDEFAULT == null ? facilitySize != null : !FACILITY_SIZE_EDEFAULT.equals(facilitySize);
			case FacilityPackage.FACILITY__OLD_SQUARE_FOOTAGE:
				return oldSquareFootage != OLD_SQUARE_FOOTAGE_EDEFAULT;
			case FacilityPackage.FACILITY__OPENED_DATE:
				return OPENED_DATE_EDEFAULT == null ? openedDate != null : !OPENED_DATE_EDEFAULT.equals(openedDate);
			case FacilityPackage.FACILITY__FACILITY_TYPE_ID:
				return facilityTypeId != null;
			case FacilityPackage.FACILITY__PARENT_FACILITY_ID:
				return parentFacilityId != null;
			case FacilityPackage.FACILITY__PRIMARY_FACILITY_GROUP_ID:
				return primaryFacilityGroupId != null;
			case FacilityPackage.FACILITY__OWNER_PARTY_ID:
				return ownerPartyId != null;
			case FacilityPackage.FACILITY__DEFAULT_INVENTORY_ITEM_TYPE_ID:
				return defaultInventoryItemTypeId != null;
			case FacilityPackage.FACILITY__DEFAULT_DIMENSION_UOM_ID:
				return defaultDimensionUomId != null;
			case FacilityPackage.FACILITY__DEFAULT_WEIGHT_UOM_ID:
				return defaultWeightUomId != null;
			case FacilityPackage.FACILITY__PRODUCT_STORE_ID:
				return productStoreId != null;
			case FacilityPackage.FACILITY__GEO_POINT_ID:
				return geoPointId != null;
			case FacilityPackage.FACILITY__FACILITY_SIZE_UOM_ID:
				return facilitySizeUomId != null;
			case FacilityPackage.FACILITY__FACILITY_ATTRIBUTES:
				return facilityAttributes != null && !facilityAttributes.isEmpty();
			case FacilityPackage.FACILITY__FACILITY_LOCATIONS:
				return facilityLocations != null && !facilityLocations.isEmpty();
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
		result.append(" (facilityId: ");
		result.append(facilityId);
		result.append(", closedDate: ");
		result.append(closedDate);
		result.append(", defaultDaysToShip: ");
		result.append(defaultDaysToShip);
		result.append(", description: ");
		result.append(description);
		result.append(", facilityName: ");
		result.append(facilityName);
		result.append(", facilitySize: ");
		result.append(facilitySize);
		result.append(", oldSquareFootage: ");
		result.append(oldSquareFootage);
		result.append(", openedDate: ");
		result.append(openedDate);
		result.append(", facilityAttributes: ");
		result.append(facilityAttributes);
		result.append(", facilityLocations: ");
		result.append(facilityLocations);
		result.append(')');
		return result.toString();
	}

} //FacilityImpl
