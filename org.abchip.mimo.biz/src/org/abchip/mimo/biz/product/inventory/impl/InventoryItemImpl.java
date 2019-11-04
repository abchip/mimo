/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.InventoryItemType;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.Lot;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

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
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getDatetimeManufactured <em>Datetime Manufactured</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getDatetimeReceived <em>Datetime Received</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getOldAvailableToPromise <em>Old Available To Promise</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getOldQuantityOnHand <em>Old Quantity On Hand</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getSoftIdentifier <em>Soft Identifier</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getLotId <em>Lot Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemAttributes <em>Inventory Item Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemDetails <em>Inventory Item Details</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemLabelAppls <em>Inventory Item Label Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemImpl#getInventoryItemVariances <em>Inventory Item Variances</em>}</li>
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
	 * The default value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemId = INVENTORY_ITEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccountingQuantityTotal() <em>Accounting Quantity Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingQuantityTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACCOUNTING_QUANTITY_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccountingQuantityTotal() <em>Accounting Quantity Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountingQuantityTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal accountingQuantityTotal = ACCOUNTING_QUANTITY_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationNumber() <em>Activation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVATION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationNumber() <em>Activation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationNumber()
	 * @generated
	 * @ordered
	 */
	protected String activationNumber = ACTIVATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationValidThru() <em>Activation Valid Thru</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationValidThru()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTIVATION_VALID_THRU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActivationValidThru() <em>Activation Valid Thru</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationValidThru()
	 * @generated
	 * @ordered
	 */
	protected Date activationValidThru = ACTIVATION_VALID_THRU_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableToPromiseTotal() <em>Available To Promise Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableToPromiseTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AVAILABLE_TO_PROMISE_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableToPromiseTotal() <em>Available To Promise Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableToPromiseTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal availableToPromiseTotal = AVAILABLE_TO_PROMISE_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinNumber() <em>Bin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BIN_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinNumber() <em>Bin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinNumber()
	 * @generated
	 * @ordered
	 */
	protected String binNumber = BIN_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getDatetimeManufactured() <em>Datetime Manufactured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeManufactured()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATETIME_MANUFACTURED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetimeManufactured() <em>Datetime Manufactured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeManufactured()
	 * @generated
	 * @ordered
	 */
	protected Date datetimeManufactured = DATETIME_MANUFACTURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatetimeReceived() <em>Datetime Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATETIME_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatetimeReceived() <em>Datetime Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetimeReceived()
	 * @generated
	 * @ordered
	 */
	protected Date datetimeReceived = DATETIME_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpireDate() <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireDate()
	 * @generated
	 * @ordered
	 */
	protected Date expireDate = EXPIRE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationSeqId() <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationSeqId() <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqId()
	 * @generated
	 * @ordered
	 */
	protected String locationSeqId = LOCATION_SEQ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldAvailableToPromise() <em>Old Available To Promise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldAvailableToPromise()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OLD_AVAILABLE_TO_PROMISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldAvailableToPromise() <em>Old Available To Promise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldAvailableToPromise()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal oldAvailableToPromise = OLD_AVAILABLE_TO_PROMISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldQuantityOnHand() <em>Old Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldQuantityOnHand()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OLD_QUANTITY_ON_HAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldQuantityOnHand() <em>Old Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldQuantityOnHand()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal oldQuantityOnHand = OLD_QUANTITY_ON_HAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityOnHandTotal() <em>Quantity On Hand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHandTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_ON_HAND_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityOnHandTotal() <em>Quantity On Hand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOnHandTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityOnHandTotal = QUANTITY_ON_HAND_TOTAL_EDEFAULT;

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
	 * The default value of the '{@link #getSoftIdentifier() <em>Soft Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftIdentifier() <em>Soft Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String softIdentifier = SOFT_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal UNIT_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitCost() <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal unitCost = UNIT_COST_EDEFAULT;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

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
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

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
	 * The cached value of the '{@link #getContainerId() <em>Container Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected org.abchip.mimo.biz.product.facility.Container containerId;

	/**
	 * The cached value of the '{@link #getLotId() <em>Lot Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotId()
	 * @generated
	 * @ordered
	 */
	protected Lot lotId;

	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom uomId;

	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom currencyUomId;

	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;

	/**
	 * The cached value of the '{@link #getInventoryItemAttributes() <em>Inventory Item Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inventoryItemAttributes;

	/**
	 * The cached value of the '{@link #getInventoryItemDetails() <em>Inventory Item Details</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inventoryItemDetails;

	/**
	 * The cached value of the '{@link #getInventoryItemLabelAppls() <em>Inventory Item Label Appls</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelAppls()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inventoryItemLabelAppls;

	/**
	 * The cached value of the '{@link #getInventoryItemVariances() <em>Inventory Item Variances</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemVariances()
	 * @generated
	 * @ordered
	 */
	protected EList<String> inventoryItemVariances;

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
		return accountingQuantityTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountingQuantityTotal(BigDecimal newAccountingQuantityTotal) {
		BigDecimal oldAccountingQuantityTotal = accountingQuantityTotal;
		accountingQuantityTotal = newAccountingQuantityTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL, oldAccountingQuantityTotal, accountingQuantityTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActivationNumber() {
		return activationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationNumber(String newActivationNumber) {
		String oldActivationNumber = activationNumber;
		activationNumber = newActivationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__ACTIVATION_NUMBER, oldActivationNumber, activationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActivationValidThru() {
		return activationValidThru;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationValidThru(Date newActivationValidThru) {
		Date oldActivationValidThru = activationValidThru;
		activationValidThru = newActivationValidThru;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__ACTIVATION_VALID_THRU, oldActivationValidThru, activationValidThru));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAvailableToPromiseTotal() {
		return availableToPromiseTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableToPromiseTotal(BigDecimal newAvailableToPromiseTotal) {
		BigDecimal oldAvailableToPromiseTotal = availableToPromiseTotal;
		availableToPromiseTotal = newAvailableToPromiseTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL, oldAvailableToPromiseTotal, availableToPromiseTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBinNumber() {
		return binNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinNumber(String newBinNumber) {
		String oldBinNumber = binNumber;
		binNumber = newBinNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__BIN_NUMBER, oldBinNumber, binNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getCurrencyUomId() {
		if (currencyUomId != null && ((EObject)currencyUomId).eIsProxy()) {
			InternalEObject oldCurrencyUomId = (InternalEObject)currencyUomId;
			currencyUomId = (Uom)eResolveProxy(oldCurrencyUomId);
			if (currencyUomId != oldCurrencyUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
			}
		}
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(Uom newCurrencyUomId) {
		Uom oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeManufactured() {
		return datetimeManufactured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeManufactured(Date newDatetimeManufactured) {
		Date oldDatetimeManufactured = datetimeManufactured;
		datetimeManufactured = newDatetimeManufactured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__DATETIME_MANUFACTURED, oldDatetimeManufactured, datetimeManufactured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDatetimeReceived() {
		return datetimeReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatetimeReceived(Date newDatetimeReceived) {
		Date oldDatetimeReceived = datetimeReceived;
		datetimeReceived = newDatetimeReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__DATETIME_RECEIVED, oldDatetimeReceived, datetimeReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpireDate(Date newExpireDate) {
		Date oldExpireDate = expireDate;
		expireDate = newExpireDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__EXPIRE_DATE, oldExpireDate, expireDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		FixedAsset oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return locationSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		String oldLocationSeqId = locationSeqId;
		locationSeqId = newLocationSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__LOCATION_SEQ_ID, oldLocationSeqId, locationSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldAvailableToPromise() {
		return oldAvailableToPromise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldAvailableToPromise(BigDecimal newOldAvailableToPromise) {
		BigDecimal oldOldAvailableToPromise = oldAvailableToPromise;
		oldAvailableToPromise = newOldAvailableToPromise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE, oldOldAvailableToPromise, oldAvailableToPromise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOldQuantityOnHand() {
		return oldQuantityOnHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldQuantityOnHand(BigDecimal newOldQuantityOnHand) {
		BigDecimal oldOldQuantityOnHand = oldQuantityOnHand;
		oldQuantityOnHand = newOldQuantityOnHand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND, oldOldQuantityOnHand, oldQuantityOnHand));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__OWNER_PARTY_ID, oldOwnerPartyId, ownerPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__OWNER_PARTY_ID, oldOwnerPartyId, ownerPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityOnHandTotal() {
		return quantityOnHandTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityOnHandTotal(BigDecimal newQuantityOnHandTotal) {
		BigDecimal oldQuantityOnHandTotal = quantityOnHandTotal;
		quantityOnHandTotal = newQuantityOnHandTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL, oldQuantityOnHandTotal, quantityOnHandTotal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftIdentifier() {
		return softIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftIdentifier(String newSoftIdentifier) {
		String oldSoftIdentifier = softIdentifier;
		softIdentifier = newSoftIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__SOFT_IDENTIFIER, oldSoftIdentifier, softIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUnitCost() {
		return unitCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitCost(BigDecimal newUnitCost) {
		BigDecimal oldUnitCost = unitCost;
		unitCost = newUnitCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__UNIT_COST, oldUnitCost, unitCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		if (uomId != null && ((EObject)uomId).eIsProxy()) {
			InternalEObject oldUomId = (InternalEObject)uomId;
			uomId = (Uom)eResolveProxy(oldUomId);
			if (uomId != oldUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__UOM_ID, oldUomId, uomId));
			}
		}
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		Uom oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInventoryItemAttributes() {
		if (inventoryItemAttributes == null) {
			inventoryItemAttributes = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES);
		}
		return inventoryItemAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInventoryItemDetails() {
		if (inventoryItemDetails == null) {
			inventoryItemDetails = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_DETAILS);
		}
		return inventoryItemDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInventoryItemLabelAppls() {
		if (inventoryItemLabelAppls == null) {
			inventoryItemLabelAppls = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS);
		}
		return inventoryItemLabelAppls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getInventoryItemVariances() {
		if (inventoryItemVariances == null) {
			inventoryItemVariances = new EDataTypeUniqueEList<String>(String.class, this, InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES);
		}
		return inventoryItemVariances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> acctgTransEntries() {
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
	public List<String> fromOrderItems() {
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
	public List<String> itemIssuances() {
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
	public List<String> workEffortInventoryAssigns() {
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
	public List<String> workEffortInventoryProduceds() {
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
	public InventoryItemType getInventoryItemTypeId() {
		if (inventoryItemTypeId != null && ((EObject)inventoryItemTypeId).eIsProxy()) {
			InternalEObject oldInventoryItemTypeId = (InternalEObject)inventoryItemTypeId;
			inventoryItemTypeId = (InventoryItemType)eResolveProxy(oldInventoryItemTypeId);
			if (inventoryItemTypeId != oldInventoryItemTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID, oldInventoryItemTypeId, inventoryItemTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID, oldInventoryItemTypeId, inventoryItemTypeId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__FACILITY_ID, oldFacilityId, facilityId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.product.facility.Container getContainerId() {
		if (containerId != null && ((EObject)containerId).eIsProxy()) {
			InternalEObject oldContainerId = (InternalEObject)containerId;
			containerId = (org.abchip.mimo.biz.product.facility.Container)eResolveProxy(oldContainerId);
			if (containerId != oldContainerId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__CONTAINER_ID, oldContainerId, containerId));
			}
		}
		return containerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.abchip.mimo.biz.product.facility.Container basicGetContainerId() {
		return containerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerId(org.abchip.mimo.biz.product.facility.Container newContainerId) {
		org.abchip.mimo.biz.product.facility.Container oldContainerId = containerId;
		containerId = newContainerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__CONTAINER_ID, oldContainerId, containerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lot getLotId() {
		if (lotId != null && ((EObject)lotId).eIsProxy()) {
			InternalEObject oldLotId = (InternalEObject)lotId;
			lotId = (Lot)eResolveProxy(oldLotId);
			if (lotId != oldLotId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM__LOT_ID, oldLotId, lotId));
			}
		}
		return lotId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lot basicGetLotId() {
		return lotId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLotId(Lot newLotId) {
		Lot oldLotId = lotId;
		lotId = newLotId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__LOT_ID, oldLotId, lotId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(String newInventoryItemId) {
		String oldInventoryItemId = inventoryItemId;
		inventoryItemId = newInventoryItemId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case InventoryPackage.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL:
				return getAccountingQuantityTotal();
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_NUMBER:
				return getActivationNumber();
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_VALID_THRU:
				return getActivationValidThru();
			case InventoryPackage.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL:
				return getAvailableToPromiseTotal();
			case InventoryPackage.INVENTORY_ITEM__BIN_NUMBER:
				return getBinNumber();
			case InventoryPackage.INVENTORY_ITEM__COMMENTS:
				return getComments();
			case InventoryPackage.INVENTORY_ITEM__DATETIME_MANUFACTURED:
				return getDatetimeManufactured();
			case InventoryPackage.INVENTORY_ITEM__DATETIME_RECEIVED:
				return getDatetimeReceived();
			case InventoryPackage.INVENTORY_ITEM__EXPIRE_DATE:
				return getExpireDate();
			case InventoryPackage.INVENTORY_ITEM__LOCATION_SEQ_ID:
				return getLocationSeqId();
			case InventoryPackage.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE:
				return getOldAvailableToPromise();
			case InventoryPackage.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND:
				return getOldQuantityOnHand();
			case InventoryPackage.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL:
				return getQuantityOnHandTotal();
			case InventoryPackage.INVENTORY_ITEM__SERIAL_NUMBER:
				return getSerialNumber();
			case InventoryPackage.INVENTORY_ITEM__SOFT_IDENTIFIER:
				return getSoftIdentifier();
			case InventoryPackage.INVENTORY_ITEM__UNIT_COST:
				return getUnitCost();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID:
				if (resolve) return getInventoryItemTypeId();
				return basicGetInventoryItemTypeId();
			case InventoryPackage.INVENTORY_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case InventoryPackage.INVENTORY_ITEM__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case InventoryPackage.INVENTORY_ITEM__OWNER_PARTY_ID:
				if (resolve) return getOwnerPartyId();
				return basicGetOwnerPartyId();
			case InventoryPackage.INVENTORY_ITEM__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case InventoryPackage.INVENTORY_ITEM__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case InventoryPackage.INVENTORY_ITEM__CONTAINER_ID:
				if (resolve) return getContainerId();
				return basicGetContainerId();
			case InventoryPackage.INVENTORY_ITEM__LOT_ID:
				if (resolve) return getLotId();
				return basicGetLotId();
			case InventoryPackage.INVENTORY_ITEM__UOM_ID:
				if (resolve) return getUomId();
				return basicGetUomId();
			case InventoryPackage.INVENTORY_ITEM__CURRENCY_UOM_ID:
				if (resolve) return getCurrencyUomId();
				return basicGetCurrencyUomId();
			case InventoryPackage.INVENTORY_ITEM__FIXED_ASSET_ID:
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES:
				return getInventoryItemAttributes();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_DETAILS:
				return getInventoryItemDetails();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS:
				return getInventoryItemLabelAppls();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES:
				return getInventoryItemVariances();
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
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL:
				setAccountingQuantityTotal((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_NUMBER:
				setActivationNumber((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_VALID_THRU:
				setActivationValidThru((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL:
				setAvailableToPromiseTotal((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__BIN_NUMBER:
				setBinNumber((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__COMMENTS:
				setComments((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__DATETIME_MANUFACTURED:
				setDatetimeManufactured((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__DATETIME_RECEIVED:
				setDatetimeReceived((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__EXPIRE_DATE:
				setExpireDate((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__LOCATION_SEQ_ID:
				setLocationSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE:
				setOldAvailableToPromise((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND:
				setOldQuantityOnHand((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL:
				setQuantityOnHandTotal((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__SOFT_IDENTIFIER:
				setSoftIdentifier((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__UNIT_COST:
				setUnitCost((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID:
				setInventoryItemTypeId((InventoryItemType)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__OWNER_PARTY_ID:
				setOwnerPartyId((Party)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__CONTAINER_ID:
				setContainerId((org.abchip.mimo.biz.product.facility.Container)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__LOT_ID:
				setLotId((Lot)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__UOM_ID:
				setUomId((Uom)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES:
				getInventoryItemAttributes().clear();
				getInventoryItemAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_DETAILS:
				getInventoryItemDetails().clear();
				getInventoryItemDetails().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS:
				getInventoryItemLabelAppls().clear();
				getInventoryItemLabelAppls().addAll((Collection<? extends String>)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES:
				getInventoryItemVariances().clear();
				getInventoryItemVariances().addAll((Collection<? extends String>)newValue);
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
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL:
				setAccountingQuantityTotal(ACCOUNTING_QUANTITY_TOTAL_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_NUMBER:
				setActivationNumber(ACTIVATION_NUMBER_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_VALID_THRU:
				setActivationValidThru(ACTIVATION_VALID_THRU_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL:
				setAvailableToPromiseTotal(AVAILABLE_TO_PROMISE_TOTAL_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__BIN_NUMBER:
				setBinNumber(BIN_NUMBER_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__DATETIME_MANUFACTURED:
				setDatetimeManufactured(DATETIME_MANUFACTURED_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__DATETIME_RECEIVED:
				setDatetimeReceived(DATETIME_RECEIVED_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__EXPIRE_DATE:
				setExpireDate(EXPIRE_DATE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__LOCATION_SEQ_ID:
				setLocationSeqId(LOCATION_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE:
				setOldAvailableToPromise(OLD_AVAILABLE_TO_PROMISE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND:
				setOldQuantityOnHand(OLD_QUANTITY_ON_HAND_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL:
				setQuantityOnHandTotal(QUANTITY_ON_HAND_TOTAL_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__SOFT_IDENTIFIER:
				setSoftIdentifier(SOFT_IDENTIFIER_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__UNIT_COST:
				setUnitCost(UNIT_COST_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID:
				setInventoryItemTypeId((InventoryItemType)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__PARTY_ID:
				setPartyId((Party)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__OWNER_PARTY_ID:
				setOwnerPartyId((Party)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__CONTAINER_ID:
				setContainerId((org.abchip.mimo.biz.product.facility.Container)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__LOT_ID:
				setLotId((Lot)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__UOM_ID:
				setUomId((Uom)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__CURRENCY_UOM_ID:
				setCurrencyUomId((Uom)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__FIXED_ASSET_ID:
				setFixedAssetId((FixedAsset)null);
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES:
				getInventoryItemAttributes().clear();
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_DETAILS:
				getInventoryItemDetails().clear();
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS:
				getInventoryItemLabelAppls().clear();
				return;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES:
				getInventoryItemVariances().clear();
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
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case InventoryPackage.INVENTORY_ITEM__ACCOUNTING_QUANTITY_TOTAL:
				return ACCOUNTING_QUANTITY_TOTAL_EDEFAULT == null ? accountingQuantityTotal != null : !ACCOUNTING_QUANTITY_TOTAL_EDEFAULT.equals(accountingQuantityTotal);
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_NUMBER:
				return ACTIVATION_NUMBER_EDEFAULT == null ? activationNumber != null : !ACTIVATION_NUMBER_EDEFAULT.equals(activationNumber);
			case InventoryPackage.INVENTORY_ITEM__ACTIVATION_VALID_THRU:
				return ACTIVATION_VALID_THRU_EDEFAULT == null ? activationValidThru != null : !ACTIVATION_VALID_THRU_EDEFAULT.equals(activationValidThru);
			case InventoryPackage.INVENTORY_ITEM__AVAILABLE_TO_PROMISE_TOTAL:
				return AVAILABLE_TO_PROMISE_TOTAL_EDEFAULT == null ? availableToPromiseTotal != null : !AVAILABLE_TO_PROMISE_TOTAL_EDEFAULT.equals(availableToPromiseTotal);
			case InventoryPackage.INVENTORY_ITEM__BIN_NUMBER:
				return BIN_NUMBER_EDEFAULT == null ? binNumber != null : !BIN_NUMBER_EDEFAULT.equals(binNumber);
			case InventoryPackage.INVENTORY_ITEM__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case InventoryPackage.INVENTORY_ITEM__DATETIME_MANUFACTURED:
				return DATETIME_MANUFACTURED_EDEFAULT == null ? datetimeManufactured != null : !DATETIME_MANUFACTURED_EDEFAULT.equals(datetimeManufactured);
			case InventoryPackage.INVENTORY_ITEM__DATETIME_RECEIVED:
				return DATETIME_RECEIVED_EDEFAULT == null ? datetimeReceived != null : !DATETIME_RECEIVED_EDEFAULT.equals(datetimeReceived);
			case InventoryPackage.INVENTORY_ITEM__EXPIRE_DATE:
				return EXPIRE_DATE_EDEFAULT == null ? expireDate != null : !EXPIRE_DATE_EDEFAULT.equals(expireDate);
			case InventoryPackage.INVENTORY_ITEM__LOCATION_SEQ_ID:
				return LOCATION_SEQ_ID_EDEFAULT == null ? locationSeqId != null : !LOCATION_SEQ_ID_EDEFAULT.equals(locationSeqId);
			case InventoryPackage.INVENTORY_ITEM__OLD_AVAILABLE_TO_PROMISE:
				return OLD_AVAILABLE_TO_PROMISE_EDEFAULT == null ? oldAvailableToPromise != null : !OLD_AVAILABLE_TO_PROMISE_EDEFAULT.equals(oldAvailableToPromise);
			case InventoryPackage.INVENTORY_ITEM__OLD_QUANTITY_ON_HAND:
				return OLD_QUANTITY_ON_HAND_EDEFAULT == null ? oldQuantityOnHand != null : !OLD_QUANTITY_ON_HAND_EDEFAULT.equals(oldQuantityOnHand);
			case InventoryPackage.INVENTORY_ITEM__QUANTITY_ON_HAND_TOTAL:
				return QUANTITY_ON_HAND_TOTAL_EDEFAULT == null ? quantityOnHandTotal != null : !QUANTITY_ON_HAND_TOTAL_EDEFAULT.equals(quantityOnHandTotal);
			case InventoryPackage.INVENTORY_ITEM__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case InventoryPackage.INVENTORY_ITEM__SOFT_IDENTIFIER:
				return SOFT_IDENTIFIER_EDEFAULT == null ? softIdentifier != null : !SOFT_IDENTIFIER_EDEFAULT.equals(softIdentifier);
			case InventoryPackage.INVENTORY_ITEM__UNIT_COST:
				return UNIT_COST_EDEFAULT == null ? unitCost != null : !UNIT_COST_EDEFAULT.equals(unitCost);
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_TYPE_ID:
				return inventoryItemTypeId != null;
			case InventoryPackage.INVENTORY_ITEM__PRODUCT_ID:
				return productId != null;
			case InventoryPackage.INVENTORY_ITEM__PARTY_ID:
				return partyId != null;
			case InventoryPackage.INVENTORY_ITEM__OWNER_PARTY_ID:
				return ownerPartyId != null;
			case InventoryPackage.INVENTORY_ITEM__STATUS_ID:
				return statusId != null;
			case InventoryPackage.INVENTORY_ITEM__FACILITY_ID:
				return facilityId != null;
			case InventoryPackage.INVENTORY_ITEM__CONTAINER_ID:
				return containerId != null;
			case InventoryPackage.INVENTORY_ITEM__LOT_ID:
				return lotId != null;
			case InventoryPackage.INVENTORY_ITEM__UOM_ID:
				return uomId != null;
			case InventoryPackage.INVENTORY_ITEM__CURRENCY_UOM_ID:
				return currencyUomId != null;
			case InventoryPackage.INVENTORY_ITEM__FIXED_ASSET_ID:
				return fixedAssetId != null;
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_ATTRIBUTES:
				return inventoryItemAttributes != null && !inventoryItemAttributes.isEmpty();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_DETAILS:
				return inventoryItemDetails != null && !inventoryItemDetails.isEmpty();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_LABEL_APPLS:
				return inventoryItemLabelAppls != null && !inventoryItemLabelAppls.isEmpty();
			case InventoryPackage.INVENTORY_ITEM__INVENTORY_ITEM_VARIANCES:
				return inventoryItemVariances != null && !inventoryItemVariances.isEmpty();
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
		result.append(" (inventoryItemId: ");
		result.append(inventoryItemId);
		result.append(", accountingQuantityTotal: ");
		result.append(accountingQuantityTotal);
		result.append(", activationNumber: ");
		result.append(activationNumber);
		result.append(", activationValidThru: ");
		result.append(activationValidThru);
		result.append(", availableToPromiseTotal: ");
		result.append(availableToPromiseTotal);
		result.append(", binNumber: ");
		result.append(binNumber);
		result.append(", comments: ");
		result.append(comments);
		result.append(", datetimeManufactured: ");
		result.append(datetimeManufactured);
		result.append(", datetimeReceived: ");
		result.append(datetimeReceived);
		result.append(", expireDate: ");
		result.append(expireDate);
		result.append(", locationSeqId: ");
		result.append(locationSeqId);
		result.append(", oldAvailableToPromise: ");
		result.append(oldAvailableToPromise);
		result.append(", oldQuantityOnHand: ");
		result.append(oldQuantityOnHand);
		result.append(", quantityOnHandTotal: ");
		result.append(quantityOnHandTotal);
		result.append(", serialNumber: ");
		result.append(serialNumber);
		result.append(", softIdentifier: ");
		result.append(softIdentifier);
		result.append(", unitCost: ");
		result.append(unitCost);
		result.append(", inventoryItemAttributes: ");
		result.append(inventoryItemAttributes);
		result.append(", inventoryItemDetails: ");
		result.append(inventoryItemDetails);
		result.append(", inventoryItemLabelAppls: ");
		result.append(inventoryItemLabelAppls);
		result.append(", inventoryItemVariances: ");
		result.append(inventoryItemVariances);
		result.append(')');
		return result.toString();
	}

} //InventoryItemImpl
