/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Label Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getInventoryItemLabelId <em>Inventory Item Label Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemLabelApplImpl extends BizEntityImpl implements InventoryItemLabelAppl {
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
	 * The default value of the '{@link #getInventoryItemLabelTypeId() <em>Inventory Item Label Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_LABEL_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryItemLabelTypeId() <em>Inventory Item Label Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelTypeId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemLabelTypeId = INVENTORY_ITEM_LABEL_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInventoryItemLabelId() <em>Inventory Item Label Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVENTORY_ITEM_LABEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInventoryItemLabelId() <em>Inventory Item Label Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelId()
	 * @generated
	 * @ordered
	 */
	protected String inventoryItemLabelId = INVENTORY_ITEM_LABEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemLabelApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_LABEL_APPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemLabelTypeId() {
		return inventoryItemLabelTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemLabelTypeId(String newInventoryItemLabelTypeId) {
		String oldInventoryItemLabelTypeId = inventoryItemLabelTypeId;
		inventoryItemLabelTypeId = newInventoryItemLabelTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID, oldInventoryItemLabelTypeId, inventoryItemLabelTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInventoryItemLabelId() {
		return inventoryItemLabelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemLabelId(String newInventoryItemLabelId) {
		String oldInventoryItemLabelId = inventoryItemLabelId;
		inventoryItemLabelId = newInventoryItemLabelId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID, oldInventoryItemLabelId, inventoryItemLabelId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				return getInventoryItemId();
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				return getInventoryItemLabelTypeId();
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				return getInventoryItemLabelId();
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				return getSequenceNum();
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
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				setInventoryItemId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				setInventoryItemLabelTypeId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				setInventoryItemLabelId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
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
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				setInventoryItemId(INVENTORY_ITEM_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				setInventoryItemLabelTypeId(INVENTORY_ITEM_LABEL_TYPE_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				setInventoryItemLabelId(INVENTORY_ITEM_LABEL_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
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
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				return INVENTORY_ITEM_ID_EDEFAULT == null ? inventoryItemId != null : !INVENTORY_ITEM_ID_EDEFAULT.equals(inventoryItemId);
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				return INVENTORY_ITEM_LABEL_TYPE_ID_EDEFAULT == null ? inventoryItemLabelTypeId != null : !INVENTORY_ITEM_LABEL_TYPE_ID_EDEFAULT.equals(inventoryItemLabelTypeId);
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				return INVENTORY_ITEM_LABEL_ID_EDEFAULT == null ? inventoryItemLabelId != null : !INVENTORY_ITEM_LABEL_ID_EDEFAULT.equals(inventoryItemLabelId);
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
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
		result.append(", inventoryItemLabelTypeId: ");
		result.append(inventoryItemLabelTypeId);
		result.append(", inventoryItemLabelId: ");
		result.append(inventoryItemLabelId);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //InventoryItemLabelApplImpl
