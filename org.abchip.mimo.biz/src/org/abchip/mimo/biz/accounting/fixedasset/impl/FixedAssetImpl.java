/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetAttribute;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetIdent;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetMaint;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetRegistration;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetType;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.manufacturing.techdata.TechDataCalendar;
import org.abchip.mimo.biz.order.order.OrderHeader;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetAttributes <em>Fixed Asset Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetIdents <em>Fixed Asset Idents</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetMaints <em>Fixed Asset Maints</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetName <em>Fixed Asset Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetImpl#getFixedAssetRegistrations <em>Fixed Asset Registrations</em>}</li>
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
	public OrderHeader getAcquireOrderId() {
		return (OrderHeader)eGet(FixedassetPackage.Literals.FIXED_ASSET__ACQUIRE_ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcquireOrderId(OrderHeader newAcquireOrderId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__ACQUIRE_ORDER_ID, newAcquireOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcquireOrderItemSeqId() {
		return (String)eGet(FixedassetPackage.Literals.FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcquireOrderItemSeqId(String newAcquireOrderItemSeqId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__ACQUIRE_ORDER_ITEM_SEQ_ID, newAcquireOrderItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActualEndOfLife() {
		return (Date)eGet(FixedassetPackage.Literals.FIXED_ASSET__ACTUAL_END_OF_LIFE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualEndOfLife(Date newActualEndOfLife) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__ACTUAL_END_OF_LIFE, newActualEndOfLife);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechDataCalendar getCalendarId() {
		return (TechDataCalendar)eGet(FixedassetPackage.Literals.FIXED_ASSET__CALENDAR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCalendarId(TechDataCalendar newCalendarId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__CALENDAR_ID, newCalendarId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getClassEnumId() {
		return (Enumeration)eGet(FixedassetPackage.Literals.FIXED_ASSET__CLASS_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassEnumId(Enumeration newClassEnumId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__CLASS_ENUM_ID, newClassEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateAcquired() {
		return (Date)eGet(FixedassetPackage.Literals.FIXED_ASSET__DATE_ACQUIRED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateAcquired(Date newDateAcquired) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__DATE_ACQUIRED, newDateAcquired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateLastServiced() {
		return (Date)eGet(FixedassetPackage.Literals.FIXED_ASSET__DATE_LAST_SERVICED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateLastServiced(Date newDateLastServiced) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__DATE_LAST_SERVICED, newDateLastServiced);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateNextService() {
		return (Date)eGet(FixedassetPackage.Literals.FIXED_ASSET__DATE_NEXT_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateNextService(Date newDateNextService) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__DATE_NEXT_SERVICE, newDateNextService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDepreciation() {
		return (BigDecimal)eGet(FixedassetPackage.Literals.FIXED_ASSET__DEPRECIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepreciation(BigDecimal newDepreciation) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__DEPRECIATION, newDepreciation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpectedEndOfLife() {
		return (Date)eGet(FixedassetPackage.Literals.FIXED_ASSET__EXPECTED_END_OF_LIFE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedEndOfLife(Date newExpectedEndOfLife) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__EXPECTED_END_OF_LIFE, newExpectedEndOfLife);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FixedAssetAttribute> getFixedAssetAttributes() {
		return (List<FixedAssetAttribute>)eGet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FixedAssetIdent> getFixedAssetIdents() {
		return (List<FixedAssetIdent>)eGet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_IDENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FixedAssetMaint> getFixedAssetMaints() {
		return (List<FixedAssetMaint>)eGet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_MAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetName() {
		return (String)eGet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetName(String newFixedAssetName) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_NAME, newFixedAssetName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FixedAssetRegistration> getFixedAssetRegistrations() {
		return (List<FixedAssetRegistration>)eGet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_REGISTRATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getInstanceOfProductId() {
		return (Product)eGet(FixedassetPackage.Literals.FIXED_ASSET__INSTANCE_OF_PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstanceOfProductId(Product newInstanceOfProductId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__INSTANCE_OF_PRODUCT_ID, newInstanceOfProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getLocatedAtFacilityId() {
		return (Facility)eGet(FixedassetPackage.Literals.FIXED_ASSET__LOCATED_AT_FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocatedAtFacilityId(Facility newLocatedAtFacilityId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__LOCATED_AT_FACILITY_ID, newLocatedAtFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocatedAtLocationSeqId() {
		return (String)eGet(FixedassetPackage.Literals.FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocatedAtLocationSeqId(String newLocatedAtLocationSeqId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__LOCATED_AT_LOCATION_SEQ_ID, newLocatedAtLocationSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(FixedassetPackage.Literals.FIXED_ASSET__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductionCapacity() {
		return (BigDecimal)eGet(FixedassetPackage.Literals.FIXED_ASSET__PRODUCTION_CAPACITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductionCapacity(BigDecimal newProductionCapacity) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__PRODUCTION_CAPACITY, newProductionCapacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPurchaseCost() {
		return (BigDecimal)eGet(FixedassetPackage.Literals.FIXED_ASSET__PURCHASE_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseCost(BigDecimal newPurchaseCost) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__PURCHASE_COST, newPurchaseCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurchaseCostUomId() {
		return (String)eGet(FixedassetPackage.Literals.FIXED_ASSET__PURCHASE_COST_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseCostUomId(String newPurchaseCostUomId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__PURCHASE_COST_UOM_ID, newPurchaseCostUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		return (RoleType)eGet(FixedassetPackage.Literals.FIXED_ASSET__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSalvageValue() {
		return (BigDecimal)eGet(FixedassetPackage.Literals.FIXED_ASSET__SALVAGE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalvageValue(BigDecimal newSalvageValue) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__SALVAGE_VALUE, newSalvageValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return (String)eGet(FixedassetPackage.Literals.FIXED_ASSET__SERIAL_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__SERIAL_NUMBER, newSerialNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		return (Uom)eGet(FixedassetPackage.Literals.FIXED_ASSET__UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__UOM_ID, newUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAssetType getFixedAssetTypeId() {
		return (FixedAssetType)eGet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetTypeId(FixedAssetType newFixedAssetTypeId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_TYPE_ID, newFixedAssetTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getParentFixedAssetId() {
		return (FixedAsset)eGet(FixedassetPackage.Literals.FIXED_ASSET__PARENT_FIXED_ASSET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentFixedAssetId(FixedAsset newParentFixedAssetId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__PARENT_FIXED_ASSET_ID, newParentFixedAssetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return (String)eGet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		eSet(FixedassetPackage.Literals.FIXED_ASSET__FIXED_ASSET_ID, newFixedAssetId);
	}

} //FixedAssetImpl
