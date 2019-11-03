/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getAcquireOrderId <em>Acquire Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getAcquireOrderItemSeqId <em>Acquire Order Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getActualEndOfLife <em>Actual End Of Life</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getCalendarId <em>Calendar Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getClassEnumId <em>Class Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getDateAcquired <em>Date Acquired</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getDateLastServiced <em>Date Last Serviced</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getDateNextService <em>Date Next Service</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getDepreciation <em>Depreciation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getExpectedEndOfLife <em>Expected End Of Life</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetName <em>Fixed Asset Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getInstanceOfProductId <em>Instance Of Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getLocatedAtFacilityId <em>Located At Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getLocatedAtLocationSeqId <em>Located At Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getParentFixedAssetId <em>Parent Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getProductionCapacity <em>Production Capacity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getPurchaseCost <em>Purchase Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getPurchaseCostUomId <em>Purchase Cost Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getSalvageValue <em>Salvage Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetAttributes <em>Fixed Asset Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetIdents <em>Fixed Asset Idents</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetMaints <em>Fixed Asset Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetRegistrations <em>Fixed Asset Registrations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetImpl extends BizEntityTypedImpl<FixedAssetType> implements FixedAsset {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAcquireOrderId() <em>Acquire Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquireOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACQUIRE_ORDER_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAcquireOrderId() <em>Acquire Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquireOrderId()
	 * @generated
	 * @ordered
	 */
	protected String acquireOrderId = ACQUIRE_ORDER_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAcquireOrderItemSeqId() <em>Acquire Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquireOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACQUIRE_ORDER_ITEM_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAcquireOrderItemSeqId() <em>Acquire Order Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquireOrderItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String acquireOrderItemSeqId = ACQUIRE_ORDER_ITEM_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getActualEndOfLife() <em>Actual End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualEndOfLife()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTUAL_END_OF_LIFE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getActualEndOfLife() <em>Actual End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualEndOfLife()
	 * @generated
	 * @ordered
	 */
	protected Date actualEndOfLife = ACTUAL_END_OF_LIFE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCalendarId() <em>Calendar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarId()
	 * @generated
	 * @ordered
	 */
	protected static final String CALENDAR_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCalendarId() <em>Calendar Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarId()
	 * @generated
	 * @ordered
	 */
	protected String calendarId = CALENDAR_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getClassEnumId() <em>Class Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_ENUM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClassEnumId() <em>Class Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassEnumId()
	 * @generated
	 * @ordered
	 */
	protected String classEnumId = CLASS_ENUM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateAcquired() <em>Date Acquired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAcquired()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ACQUIRED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateAcquired() <em>Date Acquired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAcquired()
	 * @generated
	 * @ordered
	 */
	protected Date dateAcquired = DATE_ACQUIRED_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateLastServiced() <em>Date Last Serviced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastServiced()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_LAST_SERVICED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateLastServiced() <em>Date Last Serviced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLastServiced()
	 * @generated
	 * @ordered
	 */
	protected Date dateLastServiced = DATE_LAST_SERVICED_EDEFAULT;
	/**
	 * The default value of the '{@link #getDateNextService() <em>Date Next Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNextService()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_NEXT_SERVICE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateNextService() <em>Date Next Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNextService()
	 * @generated
	 * @ordered
	 */
	protected Date dateNextService = DATE_NEXT_SERVICE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDepreciation() <em>Depreciation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepreciation()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DEPRECIATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDepreciation() <em>Depreciation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepreciation()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal depreciation = DEPRECIATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getExpectedEndOfLife() <em>Expected End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedEndOfLife()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPECTED_END_OF_LIFE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExpectedEndOfLife() <em>Expected End Of Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedEndOfLife()
	 * @generated
	 * @ordered
	 */
	protected Date expectedEndOfLife = EXPECTED_END_OF_LIFE_EDEFAULT;
	/**
	 * The default value of the '{@link #getFixedAssetName() <em>Fixed Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetName() <em>Fixed Asset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetName()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetName = FIXED_ASSET_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFixedAssetTypeId() <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetTypeId() <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetTypeId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetTypeId = FIXED_ASSET_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getInstanceOfProductId() <em>Instance Of Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_OF_PRODUCT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInstanceOfProductId() <em>Instance Of Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOfProductId()
	 * @generated
	 * @ordered
	 */
	protected String instanceOfProductId = INSTANCE_OF_PRODUCT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocatedAtFacilityId() <em>Located At Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedAtFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATED_AT_FACILITY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocatedAtFacilityId() <em>Located At Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedAtFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String locatedAtFacilityId = LOCATED_AT_FACILITY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getLocatedAtLocationSeqId() <em>Located At Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedAtLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATED_AT_LOCATION_SEQ_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLocatedAtLocationSeqId() <em>Located At Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocatedAtLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected String locatedAtLocationSeqId = LOCATED_AT_LOCATION_SEQ_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getParentFixedAssetId() <em>Parent Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_FIXED_ASSET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getParentFixedAssetId() <em>Parent Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String parentFixedAssetId = PARENT_FIXED_ASSET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProductionCapacity() <em>Production Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCTION_CAPACITY_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProductionCapacity() <em>Production Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionCapacity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productionCapacity = PRODUCTION_CAPACITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getPurchaseCost() <em>Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PURCHASE_COST_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPurchaseCost() <em>Purchase Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal purchaseCost = PURCHASE_COST_EDEFAULT;
	/**
	 * The default value of the '{@link #getPurchaseCostUomId() <em>Purchase Cost Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseCostUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCHASE_COST_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPurchaseCostUomId() <em>Purchase Cost Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseCostUomId()
	 * @generated
	 * @ordered
	 */
	protected String purchaseCostUomId = PURCHASE_COST_UOM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSalvageValue() <em>Salvage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalvageValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SALVAGE_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSalvageValue() <em>Salvage Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalvageValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal salvageValue = SALVAGE_VALUE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected String uomId = UOM_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFixedAssetAttributes() <em>Fixed Asset Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fixedAssetAttributes;
	/**
	 * The cached value of the '{@link #getFixedAssetIdents() <em>Fixed Asset Idents</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetIdents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fixedAssetIdents;
	/**
	 * The cached value of the '{@link #getFixedAssetMaints() <em>Fixed Asset Maints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetMaints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fixedAssetMaints;
	/**
	 * The cached value of the '{@link #getFixedAssetRegistrations() <em>Fixed Asset Registrations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetRegistrations()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fixedAssetRegistrations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcquireOrderId() {
		return acquireOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcquireOrderId(String newAcquireOrderId) {
		String oldAcquireOrderId = acquireOrderId;
		acquireOrderId = newAcquireOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ID, oldAcquireOrderId, acquireOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcquireOrderItemSeqId() {
		return acquireOrderItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcquireOrderItemSeqId(String newAcquireOrderItemSeqId) {
		String oldAcquireOrderItemSeqId = acquireOrderItemSeqId;
		acquireOrderItemSeqId = newAcquireOrderItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID, oldAcquireOrderItemSeqId, acquireOrderItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualEndOfLife() {
		return actualEndOfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualEndOfLife(Date newActualEndOfLife) {
		Date oldActualEndOfLife = actualEndOfLife;
		actualEndOfLife = newActualEndOfLife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__ACTUAL_END_OF_LIFE, oldActualEndOfLife, actualEndOfLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCalendarId() {
		return calendarId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarId(String newCalendarId) {
		String oldCalendarId = calendarId;
		calendarId = newCalendarId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__CALENDAR_ID, oldCalendarId, calendarId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassEnumId() {
		return classEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassEnumId(String newClassEnumId) {
		String oldClassEnumId = classEnumId;
		classEnumId = newClassEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__CLASS_ENUM_ID, oldClassEnumId, classEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateAcquired() {
		return dateAcquired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateAcquired(Date newDateAcquired) {
		Date oldDateAcquired = dateAcquired;
		dateAcquired = newDateAcquired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__DATE_ACQUIRED, oldDateAcquired, dateAcquired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateLastServiced() {
		return dateLastServiced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateLastServiced(Date newDateLastServiced) {
		Date oldDateLastServiced = dateLastServiced;
		dateLastServiced = newDateLastServiced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__DATE_LAST_SERVICED, oldDateLastServiced, dateLastServiced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateNextService() {
		return dateNextService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateNextService(Date newDateNextService) {
		Date oldDateNextService = dateNextService;
		dateNextService = newDateNextService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__DATE_NEXT_SERVICE, oldDateNextService, dateNextService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDepreciation() {
		return depreciation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepreciation(BigDecimal newDepreciation) {
		BigDecimal oldDepreciation = depreciation;
		depreciation = newDepreciation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__DEPRECIATION, oldDepreciation, depreciation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpectedEndOfLife() {
		return expectedEndOfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedEndOfLife(Date newExpectedEndOfLife) {
		Date oldExpectedEndOfLife = expectedEndOfLife;
		expectedEndOfLife = newExpectedEndOfLife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__EXPECTED_END_OF_LIFE, oldExpectedEndOfLife, expectedEndOfLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetName() {
		return fixedAssetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetName(String newFixedAssetName) {
		String oldFixedAssetName = fixedAssetName;
		fixedAssetName = newFixedAssetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__FIXED_ASSET_NAME, oldFixedAssetName, fixedAssetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstanceOfProductId() {
		return instanceOfProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOfProductId(String newInstanceOfProductId) {
		String oldInstanceOfProductId = instanceOfProductId;
		instanceOfProductId = newInstanceOfProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__INSTANCE_OF_PRODUCT_ID, oldInstanceOfProductId, instanceOfProductId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocatedAtFacilityId() {
		return locatedAtFacilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocatedAtFacilityId(String newLocatedAtFacilityId) {
		String oldLocatedAtFacilityId = locatedAtFacilityId;
		locatedAtFacilityId = newLocatedAtFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__LOCATED_AT_FACILITY_ID, oldLocatedAtFacilityId, locatedAtFacilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocatedAtLocationSeqId() {
		return locatedAtLocationSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocatedAtLocationSeqId(String newLocatedAtLocationSeqId) {
		String oldLocatedAtLocationSeqId = locatedAtLocationSeqId;
		locatedAtLocationSeqId = newLocatedAtLocationSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID, oldLocatedAtLocationSeqId, locatedAtLocationSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductionCapacity() {
		return productionCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionCapacity(BigDecimal newProductionCapacity) {
		BigDecimal oldProductionCapacity = productionCapacity;
		productionCapacity = newProductionCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__PRODUCTION_CAPACITY, oldProductionCapacity, productionCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPurchaseCost() {
		return purchaseCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseCost(BigDecimal newPurchaseCost) {
		BigDecimal oldPurchaseCost = purchaseCost;
		purchaseCost = newPurchaseCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__PURCHASE_COST, oldPurchaseCost, purchaseCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchaseCostUomId() {
		return purchaseCostUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseCostUomId(String newPurchaseCostUomId) {
		String oldPurchaseCostUomId = purchaseCostUomId;
		purchaseCostUomId = newPurchaseCostUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__PURCHASE_COST_UOM_ID, oldPurchaseCostUomId, purchaseCostUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSalvageValue() {
		return salvageValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalvageValue(BigDecimal newSalvageValue) {
		BigDecimal oldSalvageValue = salvageValue;
		salvageValue = newSalvageValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__SALVAGE_VALUE, oldSalvageValue, salvageValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(String newUomId) {
		String oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFixedAssetAttributes() {
		if (fixedAssetAttributes == null) {
			fixedAssetAttributes = new EDataTypeUniqueEList<String>(String.class, this, FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ATTRIBUTES);
		}
		return fixedAssetAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFixedAssetIdents() {
		if (fixedAssetIdents == null) {
			fixedAssetIdents = new EDataTypeUniqueEList<String>(String.class, this, FixedassetPackage.FIXED_ASSET__FIXED_ASSET_IDENTS);
		}
		return fixedAssetIdents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFixedAssetMaints() {
		if (fixedAssetMaints == null) {
			fixedAssetMaints = new EDataTypeUniqueEList<String>(String.class, this, FixedassetPackage.FIXED_ASSET__FIXED_ASSET_MAINTS);
		}
		return fixedAssetMaints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getFixedAssetRegistrations() {
		if (fixedAssetRegistrations == null) {
			fixedAssetRegistrations = new EDataTypeUniqueEList<String>(String.class, this, FixedassetPackage.FIXED_ASSET__FIXED_ASSET_REGISTRATIONS);
		}
		return fixedAssetRegistrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> accommodationMaps() {
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
	public List<String> accommodationSpots() {
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
	public List<String> acctgTranss() {
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
	public List<String> childFixedAssets() {
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
	public List<String> deliveries() {
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
	public List<String> fixedAssetDepMethods() {
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
	public List<String> fixedAssetInventoryItems() {
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
	public String getFixedAssetTypeId() {
		return fixedAssetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetTypeId(String newFixedAssetTypeId) {
		String oldFixedAssetTypeId = fixedAssetTypeId;
		fixedAssetTypeId = newFixedAssetTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__FIXED_ASSET_TYPE_ID, oldFixedAssetTypeId, fixedAssetTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentFixedAssetId() {
		return parentFixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentFixedAssetId(String newParentFixedAssetId) {
		String oldParentFixedAssetId = parentFixedAssetId;
		parentFixedAssetId = newParentFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__PARENT_FIXED_ASSET_ID, oldParentFixedAssetId, parentFixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ID:
				return getFixedAssetId();
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ID:
				return getAcquireOrderId();
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID:
				return getAcquireOrderItemSeqId();
			case FixedassetPackage.FIXED_ASSET__ACTUAL_END_OF_LIFE:
				return getActualEndOfLife();
			case FixedassetPackage.FIXED_ASSET__CALENDAR_ID:
				return getCalendarId();
			case FixedassetPackage.FIXED_ASSET__CLASS_ENUM_ID:
				return getClassEnumId();
			case FixedassetPackage.FIXED_ASSET__DATE_ACQUIRED:
				return getDateAcquired();
			case FixedassetPackage.FIXED_ASSET__DATE_LAST_SERVICED:
				return getDateLastServiced();
			case FixedassetPackage.FIXED_ASSET__DATE_NEXT_SERVICE:
				return getDateNextService();
			case FixedassetPackage.FIXED_ASSET__DEPRECIATION:
				return getDepreciation();
			case FixedassetPackage.FIXED_ASSET__EXPECTED_END_OF_LIFE:
				return getExpectedEndOfLife();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_NAME:
				return getFixedAssetName();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_TYPE_ID:
				return getFixedAssetTypeId();
			case FixedassetPackage.FIXED_ASSET__INSTANCE_OF_PRODUCT_ID:
				return getInstanceOfProductId();
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_FACILITY_ID:
				return getLocatedAtFacilityId();
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID:
				return getLocatedAtLocationSeqId();
			case FixedassetPackage.FIXED_ASSET__PARENT_FIXED_ASSET_ID:
				return getParentFixedAssetId();
			case FixedassetPackage.FIXED_ASSET__PARTY_ID:
				return getPartyId();
			case FixedassetPackage.FIXED_ASSET__PRODUCTION_CAPACITY:
				return getProductionCapacity();
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST:
				return getPurchaseCost();
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST_UOM_ID:
				return getPurchaseCostUomId();
			case FixedassetPackage.FIXED_ASSET__ROLE_TYPE_ID:
				return getRoleTypeId();
			case FixedassetPackage.FIXED_ASSET__SALVAGE_VALUE:
				return getSalvageValue();
			case FixedassetPackage.FIXED_ASSET__SERIAL_NUMBER:
				return getSerialNumber();
			case FixedassetPackage.FIXED_ASSET__UOM_ID:
				return getUomId();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ATTRIBUTES:
				return getFixedAssetAttributes();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_IDENTS:
				return getFixedAssetIdents();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_MAINTS:
				return getFixedAssetMaints();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_REGISTRATIONS:
				return getFixedAssetRegistrations();
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
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ID:
				setAcquireOrderId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID:
				setAcquireOrderItemSeqId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__ACTUAL_END_OF_LIFE:
				setActualEndOfLife((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__CALENDAR_ID:
				setCalendarId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__CLASS_ENUM_ID:
				setClassEnumId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__DATE_ACQUIRED:
				setDateAcquired((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__DATE_LAST_SERVICED:
				setDateLastServiced((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__DATE_NEXT_SERVICE:
				setDateNextService((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__DEPRECIATION:
				setDepreciation((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__EXPECTED_END_OF_LIFE:
				setExpectedEndOfLife((Date)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_NAME:
				setFixedAssetName((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__INSTANCE_OF_PRODUCT_ID:
				setInstanceOfProductId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_FACILITY_ID:
				setLocatedAtFacilityId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID:
				setLocatedAtLocationSeqId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__PARENT_FIXED_ASSET_ID:
				setParentFixedAssetId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__PRODUCTION_CAPACITY:
				setProductionCapacity((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST:
				setPurchaseCost((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST_UOM_ID:
				setPurchaseCostUomId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__SALVAGE_VALUE:
				setSalvageValue((BigDecimal)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__UOM_ID:
				setUomId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ATTRIBUTES:
				getFixedAssetAttributes().clear();
				getFixedAssetAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_IDENTS:
				getFixedAssetIdents().clear();
				getFixedAssetIdents().addAll((Collection<? extends String>)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_MAINTS:
				getFixedAssetMaints().clear();
				getFixedAssetMaints().addAll((Collection<? extends String>)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_REGISTRATIONS:
				getFixedAssetRegistrations().clear();
				getFixedAssetRegistrations().addAll((Collection<? extends String>)newValue);
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
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ID:
				setAcquireOrderId(ACQUIRE_ORDER_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID:
				setAcquireOrderItemSeqId(ACQUIRE_ORDER_ITEM_SEQ_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__ACTUAL_END_OF_LIFE:
				setActualEndOfLife(ACTUAL_END_OF_LIFE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__CALENDAR_ID:
				setCalendarId(CALENDAR_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__CLASS_ENUM_ID:
				setClassEnumId(CLASS_ENUM_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__DATE_ACQUIRED:
				setDateAcquired(DATE_ACQUIRED_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__DATE_LAST_SERVICED:
				setDateLastServiced(DATE_LAST_SERVICED_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__DATE_NEXT_SERVICE:
				setDateNextService(DATE_NEXT_SERVICE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__DEPRECIATION:
				setDepreciation(DEPRECIATION_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__EXPECTED_END_OF_LIFE:
				setExpectedEndOfLife(EXPECTED_END_OF_LIFE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_NAME:
				setFixedAssetName(FIXED_ASSET_NAME_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId(FIXED_ASSET_TYPE_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__INSTANCE_OF_PRODUCT_ID:
				setInstanceOfProductId(INSTANCE_OF_PRODUCT_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_FACILITY_ID:
				setLocatedAtFacilityId(LOCATED_AT_FACILITY_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID:
				setLocatedAtLocationSeqId(LOCATED_AT_LOCATION_SEQ_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__PARENT_FIXED_ASSET_ID:
				setParentFixedAssetId(PARENT_FIXED_ASSET_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__PRODUCTION_CAPACITY:
				setProductionCapacity(PRODUCTION_CAPACITY_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST:
				setPurchaseCost(PURCHASE_COST_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST_UOM_ID:
				setPurchaseCostUomId(PURCHASE_COST_UOM_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__SALVAGE_VALUE:
				setSalvageValue(SALVAGE_VALUE_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__UOM_ID:
				setUomId(UOM_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ATTRIBUTES:
				getFixedAssetAttributes().clear();
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_IDENTS:
				getFixedAssetIdents().clear();
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_MAINTS:
				getFixedAssetMaints().clear();
				return;
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_REGISTRATIONS:
				getFixedAssetRegistrations().clear();
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
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ID:
				return ACQUIRE_ORDER_ID_EDEFAULT == null ? acquireOrderId != null : !ACQUIRE_ORDER_ID_EDEFAULT.equals(acquireOrderId);
			case FixedassetPackage.FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID:
				return ACQUIRE_ORDER_ITEM_SEQ_ID_EDEFAULT == null ? acquireOrderItemSeqId != null : !ACQUIRE_ORDER_ITEM_SEQ_ID_EDEFAULT.equals(acquireOrderItemSeqId);
			case FixedassetPackage.FIXED_ASSET__ACTUAL_END_OF_LIFE:
				return ACTUAL_END_OF_LIFE_EDEFAULT == null ? actualEndOfLife != null : !ACTUAL_END_OF_LIFE_EDEFAULT.equals(actualEndOfLife);
			case FixedassetPackage.FIXED_ASSET__CALENDAR_ID:
				return CALENDAR_ID_EDEFAULT == null ? calendarId != null : !CALENDAR_ID_EDEFAULT.equals(calendarId);
			case FixedassetPackage.FIXED_ASSET__CLASS_ENUM_ID:
				return CLASS_ENUM_ID_EDEFAULT == null ? classEnumId != null : !CLASS_ENUM_ID_EDEFAULT.equals(classEnumId);
			case FixedassetPackage.FIXED_ASSET__DATE_ACQUIRED:
				return DATE_ACQUIRED_EDEFAULT == null ? dateAcquired != null : !DATE_ACQUIRED_EDEFAULT.equals(dateAcquired);
			case FixedassetPackage.FIXED_ASSET__DATE_LAST_SERVICED:
				return DATE_LAST_SERVICED_EDEFAULT == null ? dateLastServiced != null : !DATE_LAST_SERVICED_EDEFAULT.equals(dateLastServiced);
			case FixedassetPackage.FIXED_ASSET__DATE_NEXT_SERVICE:
				return DATE_NEXT_SERVICE_EDEFAULT == null ? dateNextService != null : !DATE_NEXT_SERVICE_EDEFAULT.equals(dateNextService);
			case FixedassetPackage.FIXED_ASSET__DEPRECIATION:
				return DEPRECIATION_EDEFAULT == null ? depreciation != null : !DEPRECIATION_EDEFAULT.equals(depreciation);
			case FixedassetPackage.FIXED_ASSET__EXPECTED_END_OF_LIFE:
				return EXPECTED_END_OF_LIFE_EDEFAULT == null ? expectedEndOfLife != null : !EXPECTED_END_OF_LIFE_EDEFAULT.equals(expectedEndOfLife);
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_NAME:
				return FIXED_ASSET_NAME_EDEFAULT == null ? fixedAssetName != null : !FIXED_ASSET_NAME_EDEFAULT.equals(fixedAssetName);
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_TYPE_ID:
				return FIXED_ASSET_TYPE_ID_EDEFAULT == null ? fixedAssetTypeId != null : !FIXED_ASSET_TYPE_ID_EDEFAULT.equals(fixedAssetTypeId);
			case FixedassetPackage.FIXED_ASSET__INSTANCE_OF_PRODUCT_ID:
				return INSTANCE_OF_PRODUCT_ID_EDEFAULT == null ? instanceOfProductId != null : !INSTANCE_OF_PRODUCT_ID_EDEFAULT.equals(instanceOfProductId);
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_FACILITY_ID:
				return LOCATED_AT_FACILITY_ID_EDEFAULT == null ? locatedAtFacilityId != null : !LOCATED_AT_FACILITY_ID_EDEFAULT.equals(locatedAtFacilityId);
			case FixedassetPackage.FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID:
				return LOCATED_AT_LOCATION_SEQ_ID_EDEFAULT == null ? locatedAtLocationSeqId != null : !LOCATED_AT_LOCATION_SEQ_ID_EDEFAULT.equals(locatedAtLocationSeqId);
			case FixedassetPackage.FIXED_ASSET__PARENT_FIXED_ASSET_ID:
				return PARENT_FIXED_ASSET_ID_EDEFAULT == null ? parentFixedAssetId != null : !PARENT_FIXED_ASSET_ID_EDEFAULT.equals(parentFixedAssetId);
			case FixedassetPackage.FIXED_ASSET__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case FixedassetPackage.FIXED_ASSET__PRODUCTION_CAPACITY:
				return PRODUCTION_CAPACITY_EDEFAULT == null ? productionCapacity != null : !PRODUCTION_CAPACITY_EDEFAULT.equals(productionCapacity);
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST:
				return PURCHASE_COST_EDEFAULT == null ? purchaseCost != null : !PURCHASE_COST_EDEFAULT.equals(purchaseCost);
			case FixedassetPackage.FIXED_ASSET__PURCHASE_COST_UOM_ID:
				return PURCHASE_COST_UOM_ID_EDEFAULT == null ? purchaseCostUomId != null : !PURCHASE_COST_UOM_ID_EDEFAULT.equals(purchaseCostUomId);
			case FixedassetPackage.FIXED_ASSET__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case FixedassetPackage.FIXED_ASSET__SALVAGE_VALUE:
				return SALVAGE_VALUE_EDEFAULT == null ? salvageValue != null : !SALVAGE_VALUE_EDEFAULT.equals(salvageValue);
			case FixedassetPackage.FIXED_ASSET__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case FixedassetPackage.FIXED_ASSET__UOM_ID:
				return UOM_ID_EDEFAULT == null ? uomId != null : !UOM_ID_EDEFAULT.equals(uomId);
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_ATTRIBUTES:
				return fixedAssetAttributes != null && !fixedAssetAttributes.isEmpty();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_IDENTS:
				return fixedAssetIdents != null && !fixedAssetIdents.isEmpty();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_MAINTS:
				return fixedAssetMaints != null && !fixedAssetMaints.isEmpty();
			case FixedassetPackage.FIXED_ASSET__FIXED_ASSET_REGISTRATIONS:
				return fixedAssetRegistrations != null && !fixedAssetRegistrations.isEmpty();
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
		result.append(" (fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", acquireOrderId: ");
		result.append(acquireOrderId);
		result.append(", acquireOrderItemSeqId: ");
		result.append(acquireOrderItemSeqId);
		result.append(", actualEndOfLife: ");
		result.append(actualEndOfLife);
		result.append(", calendarId: ");
		result.append(calendarId);
		result.append(", classEnumId: ");
		result.append(classEnumId);
		result.append(", dateAcquired: ");
		result.append(dateAcquired);
		result.append(", dateLastServiced: ");
		result.append(dateLastServiced);
		result.append(", dateNextService: ");
		result.append(dateNextService);
		result.append(", depreciation: ");
		result.append(depreciation);
		result.append(", expectedEndOfLife: ");
		result.append(expectedEndOfLife);
		result.append(", fixedAssetName: ");
		result.append(fixedAssetName);
		result.append(", fixedAssetTypeId: ");
		result.append(fixedAssetTypeId);
		result.append(", instanceOfProductId: ");
		result.append(instanceOfProductId);
		result.append(", locatedAtFacilityId: ");
		result.append(locatedAtFacilityId);
		result.append(", locatedAtLocationSeqId: ");
		result.append(locatedAtLocationSeqId);
		result.append(", parentFixedAssetId: ");
		result.append(parentFixedAssetId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", productionCapacity: ");
		result.append(productionCapacity);
		result.append(", purchaseCost: ");
		result.append(purchaseCost);
		result.append(", purchaseCostUomId: ");
		result.append(purchaseCostUomId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", salvageValue: ");
		result.append(salvageValue);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", uomId: ");
		result.append(uomId);
		result.append(", fixedAssetAttributes: ");
		result.append(fixedAssetAttributes);
		result.append(", fixedAssetIdents: ");
		result.append(fixedAssetIdents);
		result.append(", fixedAssetMaints: ");
		result.append(fixedAssetMaints);
		result.append(", fixedAssetRegistrations: ");
		result.append(fixedAssetRegistrations);
		result.append(')');
		return result.toString();
	}

} //FixedAssetImpl
