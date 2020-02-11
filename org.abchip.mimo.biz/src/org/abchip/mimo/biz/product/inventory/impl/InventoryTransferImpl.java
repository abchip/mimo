/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryTransferId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryTransferId(String newInventoryTransferId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_TRANSFER_ID, newInventoryTransferId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIssuance getItemIssuanceId() {
		return (ItemIssuance)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemIssuanceId(ItemIssuance newItemIssuanceId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__ITEM_ISSUANCE_ID, newItemIssuanceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqId() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqId(String newLocationSeqId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID, newLocationSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationSeqIdTo() {
		return (String)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationSeqIdTo(String newLocationSeqIdTo) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__LOCATION_SEQ_ID_TO, newLocationSeqIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReceiveDate() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__RECEIVE_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveDate(Date newReceiveDate) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__RECEIVE_DATE, newReceiveDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSendDate() {
		return (Date)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__SEND_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendDate(Date newSendDate) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__SEND_DATE, newSendDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryItem getInventoryItemId() {
		return (InventoryItem)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_ITEM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemId(InventoryItem newInventoryItemId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__INVENTORY_ITEM_ID, newInventoryItemId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityId() {
		return (Facility)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY_ID, newFacilityId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.product.facility.Container getContainerId() {
		return (org.abchip.mimo.biz.product.facility.Container)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerId(org.abchip.mimo.biz.product.facility.Container newContainerId) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER_ID, newContainerId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facility getFacilityIdTo() {
		return (Facility)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityIdTo(Facility newFacilityIdTo) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__FACILITY_ID_TO, newFacilityIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.abchip.mimo.biz.product.facility.Container getContainerIdTo() {
		return (org.abchip.mimo.biz.product.facility.Container)eGet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerIdTo(org.abchip.mimo.biz.product.facility.Container newContainerIdTo) {
		eSet(InventoryPackage.Literals.INVENTORY_TRANSFER__CONTAINER_ID_TO, newContainerIdTo);
	}

} //InventoryTransferImpl
