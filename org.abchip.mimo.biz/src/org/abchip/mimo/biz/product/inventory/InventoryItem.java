/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory;

import java.math.BigDecimal;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getAccountingQuantityTotal <em>Accounting Quantity Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getActivationNumber <em>Activation Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getActivationValidThru <em>Activation Valid Thru</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getAvailableToPromiseTotal <em>Available To Promise Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getBinNumber <em>Bin Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getDatetimeManufactured <em>Datetime Manufactured</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getDatetimeReceived <em>Datetime Received</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getExpireDate <em>Expire Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemTypeId <em>Inventory Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getLotId <em>Lot Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getOldAvailableToPromise <em>Old Available To Promise</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getOldQuantityOnHand <em>Old Quantity On Hand</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getSoftIdentifier <em>Soft Identifier</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getUnitCost <em>Unit Cost</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemAttributes <em>Inventory Item Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemDetails <em>Inventory Item Details</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemLabelAppls <em>Inventory Item Label Appls</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemVariances <em>Inventory Item Variances</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem()
 * @model
 * @generated
 */
public interface InventoryItem extends BizEntityTyped<InventoryItemType> {
	/**
	 * Returns the value of the '<em><b>Accounting Quantity Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounting Quantity Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounting Quantity Total</em>' attribute.
	 * @see #setAccountingQuantityTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_AccountingQuantityTotal()
	 * @model
	 * @generated
	 */
	BigDecimal getAccountingQuantityTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getAccountingQuantityTotal <em>Accounting Quantity Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounting Quantity Total</em>' attribute.
	 * @see #getAccountingQuantityTotal()
	 * @generated
	 */
	void setAccountingQuantityTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Activation Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Number</em>' attribute.
	 * @see #setActivationNumber(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_ActivationNumber()
	 * @model
	 * @generated
	 */
	String getActivationNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getActivationNumber <em>Activation Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Number</em>' attribute.
	 * @see #getActivationNumber()
	 * @generated
	 */
	void setActivationNumber(String value);

	/**
	 * Returns the value of the '<em><b>Activation Valid Thru</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Valid Thru</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Valid Thru</em>' attribute.
	 * @see #setActivationValidThru(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_ActivationValidThru()
	 * @model
	 * @generated
	 */
	Date getActivationValidThru();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getActivationValidThru <em>Activation Valid Thru</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Valid Thru</em>' attribute.
	 * @see #getActivationValidThru()
	 * @generated
	 */
	void setActivationValidThru(Date value);

	/**
	 * Returns the value of the '<em><b>Available To Promise Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available To Promise Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available To Promise Total</em>' attribute.
	 * @see #setAvailableToPromiseTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_AvailableToPromiseTotal()
	 * @model
	 * @generated
	 */
	BigDecimal getAvailableToPromiseTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getAvailableToPromiseTotal <em>Available To Promise Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To Promise Total</em>' attribute.
	 * @see #getAvailableToPromiseTotal()
	 * @generated
	 */
	void setAvailableToPromiseTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Bin Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Number</em>' attribute.
	 * @see #setBinNumber(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_BinNumber()
	 * @model
	 * @generated
	 */
	String getBinNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getBinNumber <em>Bin Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Number</em>' attribute.
	 * @see #getBinNumber()
	 * @generated
	 */
	void setBinNumber(String value);

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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #setCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_CurrencyUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getCurrencyUomId <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency Uom Id</em>' attribute.
	 * @see #getCurrencyUomId()
	 * @generated
	 */
	void setCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Datetime Manufactured</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Manufactured</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Manufactured</em>' attribute.
	 * @see #setDatetimeManufactured(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_DatetimeManufactured()
	 * @model
	 * @generated
	 */
	Date getDatetimeManufactured();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getDatetimeManufactured <em>Datetime Manufactured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Manufactured</em>' attribute.
	 * @see #getDatetimeManufactured()
	 * @generated
	 */
	void setDatetimeManufactured(Date value);

	/**
	 * Returns the value of the '<em><b>Datetime Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime Received</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime Received</em>' attribute.
	 * @see #setDatetimeReceived(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_DatetimeReceived()
	 * @model
	 * @generated
	 */
	Date getDatetimeReceived();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getDatetimeReceived <em>Datetime Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime Received</em>' attribute.
	 * @see #getDatetimeReceived()
	 * @generated
	 */
	void setDatetimeReceived(Date value);

	/**
	 * Returns the value of the '<em><b>Expire Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expire Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expire Date</em>' attribute.
	 * @see #setExpireDate(Date)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_ExpireDate()
	 * @model
	 * @generated
	 */
	Date getExpireDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getExpireDate <em>Expire Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Date</em>' attribute.
	 * @see #getExpireDate()
	 * @generated
	 */
	void setExpireDate(Date value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #setFixedAssetId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_FixedAssetId()
	 * @model annotation="mimo-ent-domain frame='FixedAsset'"
	 * @generated
	 */
	String getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getFixedAssetId <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' attribute.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(String value);

	/**
	 * Returns the value of the '<em><b>Location Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Seq Id</em>' attribute.
	 * @see #setLocationSeqId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_LocationSeqId()
	 * @model
	 * @generated
	 */
	String getLocationSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getLocationSeqId <em>Location Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Seq Id</em>' attribute.
	 * @see #getLocationSeqId()
	 * @generated
	 */
	void setLocationSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Old Available To Promise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Available To Promise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Available To Promise</em>' attribute.
	 * @see #setOldAvailableToPromise(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_OldAvailableToPromise()
	 * @model
	 * @generated
	 */
	BigDecimal getOldAvailableToPromise();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getOldAvailableToPromise <em>Old Available To Promise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Available To Promise</em>' attribute.
	 * @see #getOldAvailableToPromise()
	 * @generated
	 */
	void setOldAvailableToPromise(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Old Quantity On Hand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Quantity On Hand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Quantity On Hand</em>' attribute.
	 * @see #setOldQuantityOnHand(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_OldQuantityOnHand()
	 * @model
	 * @generated
	 */
	BigDecimal getOldQuantityOnHand();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getOldQuantityOnHand <em>Old Quantity On Hand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Quantity On Hand</em>' attribute.
	 * @see #getOldQuantityOnHand()
	 * @generated
	 */
	void setOldQuantityOnHand(BigDecimal value);

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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_OwnerPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getOwnerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getOwnerPartyId <em>Owner Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Party Id</em>' attribute.
	 * @see #getOwnerPartyId()
	 * @generated
	 */
	void setOwnerPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity On Hand Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity On Hand Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity On Hand Total</em>' attribute.
	 * @see #setQuantityOnHandTotal(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_QuantityOnHandTotal()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantityOnHandTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getQuantityOnHandTotal <em>Quantity On Hand Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity On Hand Total</em>' attribute.
	 * @see #getQuantityOnHandTotal()
	 * @generated
	 */
	void setQuantityOnHandTotal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_SerialNumber()
	 * @model
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Soft Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Identifier</em>' attribute.
	 * @see #setSoftIdentifier(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_SoftIdentifier()
	 * @model
	 * @generated
	 */
	String getSoftIdentifier();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getSoftIdentifier <em>Soft Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Identifier</em>' attribute.
	 * @see #getSoftIdentifier()
	 * @generated
	 */
	void setSoftIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

	/**
	 * Returns the value of the '<em><b>Unit Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Cost</em>' attribute.
	 * @see #setUnitCost(BigDecimal)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_UnitCost()
	 * @model
	 * @generated
	 */
	BigDecimal getUnitCost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getUnitCost <em>Unit Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Cost</em>' attribute.
	 * @see #getUnitCost()
	 * @generated
	 */
	void setUnitCost(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_UomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_InventoryItemAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemAttribute'"
	 * @generated
	 */
	List<String> getInventoryItemAttributes();

	/**
	 * Returns the value of the '<em><b>Inventory Item Details</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Details</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Details</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_InventoryItemDetails()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemDetail'"
	 * @generated
	 */
	List<String> getInventoryItemDetails();

	/**
	 * Returns the value of the '<em><b>Inventory Item Label Appls</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Label Appls</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Label Appls</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_InventoryItemLabelAppls()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemLabelAppl'"
	 * @generated
	 */
	List<String> getInventoryItemLabelAppls();

	/**
	 * Returns the value of the '<em><b>Inventory Item Variances</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Variances</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Variances</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_InventoryItemVariances()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItemVariance'"
	 * @generated
	 */
	List<String> getInventoryItemVariances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTransEntry' route='inventoryItemId'"
	 * @generated
	 */
	List<String> acctgTransEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTrans' route='inventoryItemId'"
	 * @generated
	 */
	List<String> acctgTranss();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItem' route='fromInventoryItemId'"
	 * @generated
	 */
	List<String> fromOrderItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryTransfer' route='inventoryItemId'"
	 * @generated
	 */
	List<String> inventoryTransfers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItem' route='inventoryItemId'"
	 * @generated
	 */
	List<String> invoiceItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ItemIssuance' route='inventoryItemId'"
	 * @generated
	 */
	List<String> itemIssuances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentReceipt' route='inventoryItemId'"
	 * @generated
	 */
	List<String> shipmentReceipts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='inventoryItemId'"
	 * @generated
	 */
	List<String> subscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortInventoryAssign' route='inventoryItemId'"
	 * @generated
	 */
	List<String> workEffortInventoryAssigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffortInventoryProduced' route='inventoryItemId'"
	 * @generated
	 */
	List<String> workEffortInventoryProduceds();

	/**
	 * Returns the value of the '<em><b>Inventory Item Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Type Id</em>' attribute.
	 * @see #setInventoryItemTypeId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_InventoryItemTypeId()
	 * @model annotation="mimo-ent-domain frame='InventoryItemType'"
	 * @generated
	 */
	String getInventoryItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemTypeId <em>Inventory Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Type Id</em>' attribute.
	 * @see #getInventoryItemTypeId()
	 * @generated
	 */
	void setInventoryItemTypeId(String value);

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
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_FacilityId()
	 * @model annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getFacilityId <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' attribute.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(String value);

	/**
	 * Returns the value of the '<em><b>Container Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Id</em>' attribute.
	 * @see #setContainerId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_ContainerId()
	 * @model annotation="mimo-ent-domain frame='Container'"
	 * @generated
	 */
	String getContainerId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getContainerId <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Id</em>' attribute.
	 * @see #getContainerId()
	 * @generated
	 */
	void setContainerId(String value);

	/**
	 * Returns the value of the '<em><b>Lot Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot Id</em>' attribute.
	 * @see #setLotId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_LotId()
	 * @model annotation="mimo-ent-domain frame='Lot'"
	 * @generated
	 */
	String getLotId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getLotId <em>Lot Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Id</em>' attribute.
	 * @see #getLotId()
	 * @generated
	 */
	void setLotId(String value);

	/**
	 * Returns the value of the '<em><b>Inventory Item Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventory Item Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #setInventoryItemId(String)
	 * @see org.abchip.mimo.biz.product.inventory.InventoryPackage#getInventoryItem_InventoryItemId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getInventoryItemId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.inventory.InventoryItem#getInventoryItemId <em>Inventory Item Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventory Item Id</em>' attribute.
	 * @see #getInventoryItemId()
	 * @generated
	 */
	void setInventoryItemId(String value);

} // InventoryItem
