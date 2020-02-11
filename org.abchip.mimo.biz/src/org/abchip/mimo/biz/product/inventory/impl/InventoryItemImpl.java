/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.InventoryItemAttribute;
import org.abchip.mimo.biz.product.inventory.InventoryItemDetail;
import org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.product.inventory.InventoryItemVariance;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.Lot;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getAccountingQuantityTotal <em>Accounting Quantity Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getActivationNumber <em>Activation Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getActivationValidThru <em>Activation Valid Thru</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getAvailableToPromiseTotal <em>Available To Promise Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getBinNumber <em>Bin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getDatetimeManufactured <em>Datetime Manufactured</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getDatetimeReceived <em>Datetime Received</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemAttributes <em>Inventory Item Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemDetails <em>Inventory Item Details</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemLabelAppls <em>Inventory Item Label Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemVariances <em>Inventory Item Variances</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getLotId <em>Lot Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getOldAvailableToPromise <em>Old Available To Promise</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getOldQuantityOnHand <em>Old Quantity On Hand</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getSoftIdentifier <em>Soft Identifier</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getUomId <em>Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemImpl extends BizEntityTypedImpl<InventoryItemType> implements InventoryItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAccountingQuantityTotal() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountingQuantityTotal(BigDecimal newAccountingQuantityTotal) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL, newAccountingQuantityTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivationNumber() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationNumber(String newActivationNumber) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_NUMBER, newActivationNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActivationValidThru() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_VALID_THRU, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationValidThru(Date newActivationValidThru) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__ACTIVATION_VALID_THRU, newActivationValidThru);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableToPromiseTotal() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableToPromiseTotal(BigDecimal newAvailableToPromiseTotal) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL, newAvailableToPromiseTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBinNumber() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__BIN_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinNumber(String newBinNumber) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__BIN_NUMBER, newBinNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		return (Uom)eGet(InventoryPackage.Literals.INVENTORY_ITEM__CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__CURRENCY_UOM_ID, newCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeManufactured() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_MANUFACTURED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeManufactured(Date newDatetimeManufactured) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_MANUFACTURED, newDatetimeManufactured);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeReceived() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_RECEIVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeReceived(Date newDatetimeReceived) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__DATETIME_RECEIVED, newDatetimeReceived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpireDate() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_ITEM__EXPIRE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpireDate(Date newExpireDate) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__EXPIRE_DATE, newExpireDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		return (FixedAsset)eGet(InventoryPackage.Literals.INVENTORY_ITEM__FIXED_ASSET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__FIXED_ASSET_ID, newFixedAssetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemAttribute> getInventoryItemAttributes() {
		return (List<InventoryItemAttribute>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemDetail> getInventoryItemDetails() {
		return (List<InventoryItemDetail>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_DETAILS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemLabelAppl> getInventoryItemLabelAppls() {
		return (List<InventoryItemLabelAppl>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__LOCATION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__LOCATION_SEQ_ID, newLocationSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldAvailableToPromise() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldAvailableToPromise(BigDecimal newOldAvailableToPromise) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE, newOldAvailableToPromise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldQuantityOnHand() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldQuantityOnHand(BigDecimal newOldQuantityOnHand) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND, newOldQuantityOnHand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOwnerPartyId() {
		return (Party)eGet(InventoryPackage.Literals.INVENTORY_ITEM__OWNER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(Party newOwnerPartyId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__OWNER_PARTY_ID, newOwnerPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(InventoryPackage.Literals.INVENTORY_ITEM__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(InventoryPackage.Literals.INVENTORY_ITEM__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityOnHandTotal() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityOnHandTotal(BigDecimal newQuantityOnHandTotal) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL, newQuantityOnHandTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__SERIAL_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__SERIAL_NUMBER, newSerialNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftIdentifier() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__SOFT_IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftIdentifier(String newSoftIdentifier) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__SOFT_IDENTIFIER, newSoftIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(InventoryPackage.Literals.INVENTORY_ITEM__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitCost() {
		return (BigDecimal)eGet(InventoryPackage.Literals.INVENTORY_ITEM__UNIT_COST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitCost(BigDecimal newUnitCost) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__UNIT_COST, newUnitCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		return (Uom)eGet(InventoryPackage.Literals.INVENTORY_ITEM__UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__UOM_ID, newUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItemType getInventoryItemTypeId() {
		return (InventoryItemType)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemTypeId(InventoryItemType newInventoryItemTypeId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID, newInventoryItemTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<InventoryItemVariance> getInventoryItemVariances() {
		return (List<InventoryItemVariance>)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		return (Facility)eGet(InventoryPackage.Literals.INVENTORY_ITEM__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__FACILITY_ID, newFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.product.facility.Container getContainerId() {
		return (org.abchip.mimo.biz.product.facility.Container)eGet(InventoryPackage.Literals.INVENTORY_ITEM__CONTAINER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerId(org.abchip.mimo.biz.product.facility.Container newContainerId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__CONTAINER_ID, newContainerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lot getLotId() {
		return (Lot)eGet(InventoryPackage.Literals.INVENTORY_ITEM__LOT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLotId(Lot newLotId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__LOT_ID, newLotId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(String newInventoryItemId) {
		eSet(InventoryPackage.Literals.INVENTORY_ITEM__INVENTORY_ITEM_ID, newInventoryItemId);
	}

} //InventoryItemImpl
