/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItemStatus;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemStatusImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemStatusImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemStatusImpl#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemStatusImpl#getOwnerPartyId <em>Owner Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemStatusImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemStatusImpl#getStatusEndDatetime <em>Status End Datetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemStatusImpl extends BizEntityImpl implements InventoryItemStatus {
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
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date statusDatetime = STATUS_DATETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String changeByUserLoginId = CHANGE_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwnerPartyId() <em>Owner Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnerPartyId() <em>Owner Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerPartyId()
	 * @generated
	 * @ordered
	 */
	protected String ownerPartyId = OWNER_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusEndDatetime() <em>Status End Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusEndDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_END_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusEndDatetime() <em>Status End Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusEndDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date statusEndDatetime = STATUS_END_DATETIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeByUserLoginId() {
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(String newChangeByUserLoginId) {
		String oldChangeByUserLoginId = changeByUserLoginId;
		changeByUserLoginId = newChangeByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnerPartyId() {
		return ownerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerPartyId(String newOwnerPartyId) {
		String oldOwnerPartyId = ownerPartyId;
		ownerPartyId = newOwnerPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_STATUS__OWNER_PARTY_ID, oldOwnerPartyId, ownerPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_STATUS__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDatetime() {
		return statusDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDatetime(Date newStatusDatetime) {
		Date oldStatusDatetime = statusDatetime;
		statusDatetime = newStatusDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_DATETIME, oldStatusDatetime, statusDatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusEndDatetime() {
		return statusEndDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusEndDatetime(Date newStatusEndDatetime) {
		Date oldStatusEndDatetime = statusEndDatetime;
		statusEndDatetime = newStatusEndDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_END_DATETIME, oldStatusEndDatetime, statusEndDatetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_STATUS__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_STATUS__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_ID:
				return getStatusId();
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_DATETIME:
				return getStatusDatetime();
			case InventoryPackage.INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return getChangeByUserLoginId();
			case InventoryPackage.INVENTORY_ITEM_STATUS__OWNER_PARTY_ID:
				return getOwnerPartyId();
			case InventoryPackage.INVENTORY_ITEM_STATUS__PRODUCT_ID:
				return getProductId();
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_END_DATETIME:
				return getStatusEndDatetime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_STATUS__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_DATETIME:
				setStatusDatetime((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__OWNER_PARTY_ID:
				setOwnerPartyId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_END_DATETIME:
				setStatusEndDatetime((Date)newValue);
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
			case InventoryPackage.INVENTORY_ITEM_STATUS__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_DATETIME:
				setStatusDatetime(STATUS_DATETIME_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId(CHANGE_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__OWNER_PARTY_ID:
				setOwnerPartyId(OWNER_PARTY_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_END_DATETIME:
				setStatusEndDatetime(STATUS_END_DATETIME_EDEFAULT);
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
			case InventoryPackage.INVENTORY_ITEM_STATUS__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_DATETIME:
				return STATUS_DATETIME_EDEFAULT == null ? statusDatetime != null : !STATUS_DATETIME_EDEFAULT.equals(statusDatetime);
			case InventoryPackage.INVENTORY_ITEM_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return CHANGE_BY_USER_LOGIN_ID_EDEFAULT == null ? changeByUserLoginId != null : !CHANGE_BY_USER_LOGIN_ID_EDEFAULT.equals(changeByUserLoginId);
			case InventoryPackage.INVENTORY_ITEM_STATUS__OWNER_PARTY_ID:
				return OWNER_PARTY_ID_EDEFAULT == null ? ownerPartyId != null : !OWNER_PARTY_ID_EDEFAULT.equals(ownerPartyId);
			case InventoryPackage.INVENTORY_ITEM_STATUS__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case InventoryPackage.INVENTORY_ITEM_STATUS__STATUS_END_DATETIME:
				return STATUS_END_DATETIME_EDEFAULT == null ? statusEndDatetime != null : !STATUS_END_DATETIME_EDEFAULT.equals(statusEndDatetime);
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
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", statusDatetime: ");
		result.append(statusDatetime);
		result.append(", changeByUserLoginId: ");
		result.append(changeByUserLoginId);
		result.append(", ownerPartyId: ");
		result.append(ownerPartyId);
		result.append(", productId: ");
		result.append(productId);
		result.append(", statusEndDatetime: ");
		result.append(statusEndDatetime);
		result.append(')');
		return result.toString();
	}

} //InventoryItemStatusImpl
