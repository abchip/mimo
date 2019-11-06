/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.InventoryTransfer;
import org.abchip.mimo.biz.shipment.issuance.ItemIssuance;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getInventoryTransferId <em>Inventory Transfer Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getLocationSeqIdTo <em>Location Seq Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getReceiveDate <em>Receive Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getSendDate <em>Send Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getFacilityIdTo <em>Facility Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getContainerIdTo <em>Container Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryTransferImpl extends BizEntityImpl implements InventoryTransfer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getInventoryTransferId() <em>Inventory Transfer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryTransferId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_TRANSFER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryTransferId() <em>Inventory Transfer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryTransferId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryTransferId = INVENTORY_TRANSFER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getLocationSeqIdTo() <em>Location Seq Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_SEQ_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationSeqIdTo() <em>Location Seq Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationSeqIdTo()
	 * @generated
	 * @ordered
	 */
	protected String locationSeqIdTo = LOCATION_SEQ_ID_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveDate() <em>Receive Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RECEIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveDate() <em>Receive Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date receiveDate = RECEIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendDate() <em>Send Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SEND_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSendDate() <em>Send Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendDate()
	 * @generated
	 * @ordered
	 */
	protected Date sendDate = SEND_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem inventoryItemId;

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
	 * The cached value of the '{@link #getFacilityIdTo() <em>Facility Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityIdTo()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityIdTo;

	/**
	 * The cached value of the '{@link #getContainerIdTo() <em>Container Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerIdTo()
	 * @generated
	 * @ordered
	 */
	protected org.abchip.mimo.biz.product.facility.Container containerIdTo;

	/**
	 * The cached value of the '{@link #getItemIssuanceId() <em>Item Issuance Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIssuanceId()
	 * @generated
	 * @ordered
	 */
	protected ItemIssuance itemIssuanceId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryTransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_TRANSFER;
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
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryTransferId() {
		return inventoryTransferId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryTransferId(String newInventoryTransferId) {
		inventoryTransferId = newInventoryTransferId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIssuance getItemIssuanceId() {
		if (itemIssuanceId != null && ((EObject)itemIssuanceId).eIsProxy()) {
			InternalEObject oldItemIssuanceId = (InternalEObject)itemIssuanceId;
			itemIssuanceId = (ItemIssuance)eResolveProxy(oldItemIssuanceId);
			if (itemIssuanceId != oldItemIssuanceId) {
			}
		}
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIssuance basicGetItemIssuanceId() {
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuanceId(ItemIssuance newItemIssuanceId) {
		itemIssuanceId = newItemIssuanceId;
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
		locationSeqId = newLocationSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqIdTo() {
		return locationSeqIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqIdTo(String newLocationSeqIdTo) {
		locationSeqIdTo = newLocationSeqIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReceiveDate() {
		return receiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveDate(Date newReceiveDate) {
		receiveDate = newReceiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSendDate() {
		return sendDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendDate(Date newSendDate) {
		sendDate = newSendDate;
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
		statusId = newStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItemId() {
		if (inventoryItemId != null && ((EObject)inventoryItemId).eIsProxy()) {
			InternalEObject oldInventoryItemId = (InternalEObject)inventoryItemId;
			inventoryItemId = (InventoryItem)eResolveProxy(oldInventoryItemId);
			if (inventoryItemId != oldInventoryItemId) {
			}
		}
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItem basicGetInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(InventoryItem newInventoryItemId) {
		inventoryItemId = newInventoryItemId;
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
		facilityId = newFacilityId;
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
		containerId = newContainerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityIdTo() {
		if (facilityIdTo != null && ((EObject)facilityIdTo).eIsProxy()) {
			InternalEObject oldFacilityIdTo = (InternalEObject)facilityIdTo;
			facilityIdTo = (Facility)eResolveProxy(oldFacilityIdTo);
			if (facilityIdTo != oldFacilityIdTo) {
			}
		}
		return facilityIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityIdTo() {
		return facilityIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityIdTo(Facility newFacilityIdTo) {
		facilityIdTo = newFacilityIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.product.facility.Container getContainerIdTo() {
		if (containerIdTo != null && ((EObject)containerIdTo).eIsProxy()) {
			InternalEObject oldContainerIdTo = (InternalEObject)containerIdTo;
			containerIdTo = (org.abchip.mimo.biz.product.facility.Container)eResolveProxy(oldContainerIdTo);
			if (containerIdTo != oldContainerIdTo) {
			}
		}
		return containerIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.abchip.mimo.biz.product.facility.Container basicGetContainerIdTo() {
		return containerIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerIdTo(org.abchip.mimo.biz.product.facility.Container newContainerIdTo) {
		containerIdTo = newContainerIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID:
				return getInventoryTransferId();
			case InventoryPackage.INVENTORY_TRANSFER__COMMENTS:
				return getComments();
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID:
				return getLocationSeqId();
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO:
				return getLocationSeqIdTo();
			case InventoryPackage.INVENTORY_TRANSFER__RECEIVE_DATE:
				return getReceiveDate();
			case InventoryPackage.INVENTORY_TRANSFER__SEND_DATE:
				return getSendDate();
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				if (resolve) return getContainerId();
				return basicGetContainerId();
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				if (resolve) return getFacilityIdTo();
				return basicGetFacilityIdTo();
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				if (resolve) return getContainerIdTo();
				return basicGetContainerIdTo();
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				if (resolve) return getItemIssuanceId();
				return basicGetItemIssuanceId();
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
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID:
				setInventoryTransferId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__COMMENTS:
				setComments((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID:
				setLocationSeqId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO:
				setLocationSeqIdTo((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__RECEIVE_DATE:
				setReceiveDate((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__SEND_DATE:
				setSendDate((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				setContainerId((org.abchip.mimo.biz.product.facility.Container)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				setFacilityIdTo((Facility)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				setContainerIdTo((org.abchip.mimo.biz.product.facility.Container)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				setItemIssuanceId((ItemIssuance)newValue);
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
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID:
				setInventoryTransferId(INVENTORY_TRANSFER_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID:
				setLocationSeqId(LOCATION_SEQ_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO:
				setLocationSeqIdTo(LOCATION_SEQ_ID_TO_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__RECEIVE_DATE:
				setReceiveDate(RECEIVE_DATE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__SEND_DATE:
				setSendDate(SEND_DATE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				setContainerId((org.abchip.mimo.biz.product.facility.Container)null);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				setFacilityIdTo((Facility)null);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				setContainerIdTo((org.abchip.mimo.biz.product.facility.Container)null);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				setItemIssuanceId((ItemIssuance)null);
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
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID:
				return INVENTORY_TRANSFER_ID_EDEFAULT == null ? inventoryTransferId != null : !INVENTORY_TRANSFER_ID_EDEFAULT.equals(inventoryTransferId);
			case InventoryPackage.INVENTORY_TRANSFER__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID:
				return LOCATION_SEQ_ID_EDEFAULT == null ? locationSeqId != null : !LOCATION_SEQ_ID_EDEFAULT.equals(locationSeqId);
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO:
				return LOCATION_SEQ_ID_TO_EDEFAULT == null ? locationSeqIdTo != null : !LOCATION_SEQ_ID_TO_EDEFAULT.equals(locationSeqIdTo);
			case InventoryPackage.INVENTORY_TRANSFER__RECEIVE_DATE:
				return RECEIVE_DATE_EDEFAULT == null ? receiveDate != null : !RECEIVE_DATE_EDEFAULT.equals(receiveDate);
			case InventoryPackage.INVENTORY_TRANSFER__SEND_DATE:
				return SEND_DATE_EDEFAULT == null ? sendDate != null : !SEND_DATE_EDEFAULT.equals(sendDate);
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				return statusId != null;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				return facilityId != null;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				return containerId != null;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				return facilityIdTo != null;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				return containerIdTo != null;
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				return itemIssuanceId != null;
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
		result.append(" (inventoryTransferId: ");
		result.append(inventoryTransferId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", locationSeqId: ");
		result.append(locationSeqId);
		result.append(", locationSeqIdTo: ");
		result.append(locationSeqIdTo);
		result.append(", receiveDate: ");
		result.append(receiveDate);
		result.append(", sendDate: ");
		result.append(sendDate);
		result.append(')');
		return result.toString();
	}

} //InventoryTransferImpl
