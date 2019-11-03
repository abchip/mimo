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
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.inventory.InventoryTransfer;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getContainerId <em>Container Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getContainerIdTo <em>Container Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getFacilityIdTo <em>Facility Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getItemIssuanceId <em>Item Issuance Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getLocationSeqId <em>Location Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getLocationSeqIdTo <em>Location Seq Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getReceiveDate <em>Receive Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getSendDate <em>Send Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryTransferImpl#getStatusId <em>Status Id</em>}</li>
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
	 * The default value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerId() <em>Container Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerId()
	 * @generated
	 * @ordered
	 */
	protected String containerId = CONTAINER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerIdTo() <em>Container Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerIdTo() <em>Container Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerIdTo()
	 * @generated
	 * @ordered
	 */
	protected String containerIdTo = CONTAINER_ID_TO_EDEFAULT;

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
	 * The default value of the '{@link #getFacilityIdTo() <em>Facility Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityIdTo() <em>Facility Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityIdTo()
	 * @generated
	 * @ordered
	 */
	protected String facilityIdTo = FACILITY_ID_TO_EDEFAULT;

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
	 * The default value of the '{@link #getItemIssuanceId() <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIssuanceId()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_ISSUANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemIssuanceId() <em>Item Issuance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIssuanceId()
	 * @generated
	 * @ordered
	 */
	protected String itemIssuanceId = ITEM_ISSUANCE_ID_EDEFAULT;

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
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__COMMENTS, oldComments, comments));
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
		String oldInventoryTransferId = inventoryTransferId;
		inventoryTransferId = newInventoryTransferId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID, oldInventoryTransferId, inventoryTransferId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemIssuanceId() {
		return itemIssuanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuanceId(String newItemIssuanceId) {
		String oldItemIssuanceId = itemIssuanceId;
		itemIssuanceId = newItemIssuanceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID, oldItemIssuanceId, itemIssuanceId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID, oldLocationSeqId, locationSeqId));
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
		String oldLocationSeqIdTo = locationSeqIdTo;
		locationSeqIdTo = newLocationSeqIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO, oldLocationSeqIdTo, locationSeqIdTo));
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
		Date oldReceiveDate = receiveDate;
		receiveDate = newReceiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__RECEIVE_DATE, oldReceiveDate, receiveDate));
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
		Date oldSendDate = sendDate;
		sendDate = newSendDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__SEND_DATE, oldSendDate, sendDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerId() {
		return containerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerId(String newContainerId) {
		String oldContainerId = containerId;
		containerId = newContainerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID, oldContainerId, containerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityIdTo() {
		return facilityIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityIdTo(String newFacilityIdTo) {
		String oldFacilityIdTo = facilityIdTo;
		facilityIdTo = newFacilityIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO, oldFacilityIdTo, facilityIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerIdTo() {
		return containerIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerIdTo(String newContainerIdTo) {
		String oldContainerIdTo = containerIdTo;
		containerIdTo = newContainerIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO, oldContainerIdTo, containerIdTo));
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
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				return getContainerId();
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				return getContainerIdTo();
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				return getFacilityId();
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				return getFacilityIdTo();
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				return getItemIssuanceId();
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID:
				return getLocationSeqId();
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO:
				return getLocationSeqIdTo();
			case InventoryPackage.INVENTORY_TRANSFER__RECEIVE_DATE:
				return getReceiveDate();
			case InventoryPackage.INVENTORY_TRANSFER__SEND_DATE:
				return getSendDate();
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				return getStatusId();
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
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				setContainerId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				setContainerIdTo((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				setFacilityIdTo((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				setItemIssuanceId((String)newValue);
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
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				setStatusId((String)newValue);
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
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				setContainerId(CONTAINER_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				setContainerIdTo(CONTAINER_ID_TO_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				setFacilityIdTo(FACILITY_ID_TO_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				setItemIssuanceId(ITEM_ISSUANCE_ID_EDEFAULT);
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
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
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
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID:
				return CONTAINER_ID_EDEFAULT == null ? containerId != null : !CONTAINER_ID_EDEFAULT.equals(containerId);
			case InventoryPackage.INVENTORY_TRANSFER__CONTAINER_ID_TO:
				return CONTAINER_ID_TO_EDEFAULT == null ? containerIdTo != null : !CONTAINER_ID_TO_EDEFAULT.equals(containerIdTo);
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case InventoryPackage.INVENTORY_TRANSFER__FACILITY_ID_TO:
				return FACILITY_ID_TO_EDEFAULT == null ? facilityIdTo != null : !FACILITY_ID_TO_EDEFAULT.equals(facilityIdTo);
			case InventoryPackage.INVENTORY_TRANSFER__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case InventoryPackage.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID:
				return ITEM_ISSUANCE_ID_EDEFAULT == null ? itemIssuanceId != null : !ITEM_ISSUANCE_ID_EDEFAULT.equals(itemIssuanceId);
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID:
				return LOCATION_SEQ_ID_EDEFAULT == null ? locationSeqId != null : !LOCATION_SEQ_ID_EDEFAULT.equals(locationSeqId);
			case InventoryPackage.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO:
				return LOCATION_SEQ_ID_TO_EDEFAULT == null ? locationSeqIdTo != null : !LOCATION_SEQ_ID_TO_EDEFAULT.equals(locationSeqIdTo);
			case InventoryPackage.INVENTORY_TRANSFER__RECEIVE_DATE:
				return RECEIVE_DATE_EDEFAULT == null ? receiveDate != null : !RECEIVE_DATE_EDEFAULT.equals(receiveDate);
			case InventoryPackage.INVENTORY_TRANSFER__SEND_DATE:
				return SEND_DATE_EDEFAULT == null ? sendDate != null : !SEND_DATE_EDEFAULT.equals(sendDate);
			case InventoryPackage.INVENTORY_TRANSFER__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
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
		result.append(", containerId: ");
		result.append(containerId);
		result.append(", containerIdTo: ");
		result.append(containerIdTo);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", facilityIdTo: ");
		result.append(facilityIdTo);
		result.append(", inventoryItemId: ");
		result.append(inventoryItemId);
		result.append(", itemIssuanceId: ");
		result.append(itemIssuanceId);
		result.append(", locationSeqId: ");
		result.append(locationSeqId);
		result.append(", locationSeqIdTo: ");
		result.append(locationSeqIdTo);
		result.append(", receiveDate: ");
		result.append(receiveDate);
		result.append(", sendDate: ");
		result.append(sendDate);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //InventoryTransferImpl
