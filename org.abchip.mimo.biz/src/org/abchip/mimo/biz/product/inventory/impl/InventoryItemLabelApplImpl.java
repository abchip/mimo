/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItem;
import org.abchip.mimo.biz.product.inventory.InventoryItemLabel;
import org.abchip.mimo.biz.product.inventory.InventoryItemLabelAppl;
import org.abchip.mimo.biz.product.inventory.InventoryItemLabelType;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Label Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getInventoryItemId <em>Inventory Item Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getInventoryItemLabelTypeId <em>Inventory Item Label Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemLabelApplImpl#getInventoryItemLabelId <em>Inventory Item Label Id</em>}</li>
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
	 * The cached value of the '{@link #getInventoryItemId() <em>Inventory Item Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItem inventoryItemId;

	/**
	 * The cached value of the '{@link #getInventoryItemLabelTypeId() <em>Inventory Item Label Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelTypeId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemLabelType inventoryItemLabelTypeId;

	/**
	 * The cached value of the '{@link #getInventoryItemLabelId() <em>Inventory Item Label Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItemLabelId()
	 * @generated
	 * @ordered
	 */
	protected InventoryItemLabel inventoryItemLabelId;

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
	public InventoryItem getInventoryItemId() {
		if (inventoryItemId != null && ((EObject)inventoryItemId).eIsProxy()) {
			InternalEObject oldInventoryItemId = (InternalEObject)inventoryItemId;
			inventoryItemId = (InventoryItem)eResolveProxy(oldInventoryItemId);
			if (inventoryItemId != oldInventoryItemId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID, oldInventoryItemId, inventoryItemId));
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
		InventoryItem oldInventoryItemId = inventoryItemId;
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
	public InventoryItemLabelType getInventoryItemLabelTypeId() {
		if (inventoryItemLabelTypeId != null && ((EObject)inventoryItemLabelTypeId).eIsProxy()) {
			InternalEObject oldInventoryItemLabelTypeId = (InternalEObject)inventoryItemLabelTypeId;
			inventoryItemLabelTypeId = (InventoryItemLabelType)eResolveProxy(oldInventoryItemLabelTypeId);
			if (inventoryItemLabelTypeId != oldInventoryItemLabelTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID, oldInventoryItemLabelTypeId, inventoryItemLabelTypeId));
			}
		}
		return inventoryItemLabelTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemLabelType basicGetInventoryItemLabelTypeId() {
		return inventoryItemLabelTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemLabelTypeId(InventoryItemLabelType newInventoryItemLabelTypeId) {
		InventoryItemLabelType oldInventoryItemLabelTypeId = inventoryItemLabelTypeId;
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
	public InventoryItemLabel getInventoryItemLabelId() {
		if (inventoryItemLabelId != null && ((EObject)inventoryItemLabelId).eIsProxy()) {
			InternalEObject oldInventoryItemLabelId = (InternalEObject)inventoryItemLabelId;
			inventoryItemLabelId = (InventoryItemLabel)eResolveProxy(oldInventoryItemLabelId);
			if (inventoryItemLabelId != oldInventoryItemLabelId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID, oldInventoryItemLabelId, inventoryItemLabelId));
			}
		}
		return inventoryItemLabelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryItemLabel basicGetInventoryItemLabelId() {
		return inventoryItemLabelId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInventoryItemLabelId(InventoryItemLabel newInventoryItemLabelId) {
		InventoryItemLabel oldInventoryItemLabelId = inventoryItemLabelId;
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
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				return getSequenceNum();
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				if (resolve) return getInventoryItemId();
				return basicGetInventoryItemId();
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				if (resolve) return getInventoryItemLabelTypeId();
				return basicGetInventoryItemLabelTypeId();
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				if (resolve) return getInventoryItemLabelId();
				return basicGetInventoryItemLabelId();
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
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				setInventoryItemLabelTypeId((InventoryItemLabelType)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				setInventoryItemLabelId((InventoryItemLabel)newValue);
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
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				setInventoryItemId((InventoryItem)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				setInventoryItemLabelTypeId((InventoryItemLabelType)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				setInventoryItemLabelId((InventoryItemLabel)null);
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
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_ID:
				return inventoryItemId != null;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_TYPE_ID:
				return inventoryItemLabelTypeId != null;
			case InventoryPackage.INVENTORY_ITEM_LABEL_APPL__INVENTORY_ITEM_LABEL_ID:
				return inventoryItemLabelId != null;
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
		result.append(" (sequenceNum: ");
		result.append(sequenceNum);
		result.append(')');
		return result.toString();
	}

} //InventoryItemLabelApplImpl
