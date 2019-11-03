/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.picklist.PicklistBin;
import org.abchip.mimo.biz.shipment.picklist.PicklistPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picklist Bin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl#getPicklistBinId <em>Picklist Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl#getBinLocationNumber <em>Bin Location Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl#getPicklistId <em>Picklist Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl#getPrimaryOrderId <em>Primary Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistBinImpl#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PicklistBinImpl extends BizEntityImpl implements PicklistBin {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPicklistBinId() <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistBinId()
	 * @generated
	 * @ordered
	 */
	protected static final String PICKLIST_BIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicklistBinId() <em>Picklist Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistBinId()
	 * @generated
	 * @ordered
	 */
	protected String picklistBinId = PICKLIST_BIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinLocationNumber() <em>Bin Location Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinLocationNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long BIN_LOCATION_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBinLocationNumber() <em>Bin Location Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinLocationNumber()
	 * @generated
	 * @ordered
	 */
	protected long binLocationNumber = BIN_LOCATION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPicklistId() <em>Picklist Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistId()
	 * @generated
	 * @ordered
	 */
	protected static final String PICKLIST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicklistId() <em>Picklist Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistId()
	 * @generated
	 * @ordered
	 */
	protected String picklistId = PICKLIST_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryOrderId() <em>Primary Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOrderId() <em>Primary Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOrderId()
	 * @generated
	 * @ordered
	 */
	protected String primaryOrderId = PRIMARY_ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryShipGroupSeqId() <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryShipGroupSeqId() <em>Primary Ship Group Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryShipGroupSeqId()
	 * @generated
	 * @ordered
	 */
	protected String primaryShipGroupSeqId = PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicklistBinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicklistPackage.Literals.PICKLIST_BIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBinLocationNumber() {
		return binLocationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinLocationNumber(long newBinLocationNumber) {
		long oldBinLocationNumber = binLocationNumber;
		binLocationNumber = newBinLocationNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_BIN__BIN_LOCATION_NUMBER, oldBinLocationNumber, binLocationNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicklistBinId() {
		return picklistBinId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistBinId(String newPicklistBinId) {
		String oldPicklistBinId = picklistBinId;
		picklistBinId = newPicklistBinId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_BIN__PICKLIST_BIN_ID, oldPicklistBinId, picklistBinId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPicklistId() {
		return picklistId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistId(String newPicklistId) {
		String oldPicklistId = picklistId;
		picklistId = newPicklistId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_BIN__PICKLIST_ID, oldPicklistId, picklistId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryOrderId() {
		return primaryOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOrderId(String newPrimaryOrderId) {
		String oldPrimaryOrderId = primaryOrderId;
		primaryOrderId = newPrimaryOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_BIN__PRIMARY_ORDER_ID, oldPrimaryOrderId, primaryOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryShipGroupSeqId() {
		return primaryShipGroupSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryShipGroupSeqId(String newPrimaryShipGroupSeqId) {
		String oldPrimaryShipGroupSeqId = primaryShipGroupSeqId;
		primaryShipGroupSeqId = newPrimaryShipGroupSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_BIN__PRIMARY_SHIP_GROUP_SEQ_ID, oldPrimaryShipGroupSeqId, primaryShipGroupSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shipments() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PicklistPackage.PICKLIST_BIN__PICKLIST_BIN_ID:
				return getPicklistBinId();
			case PicklistPackage.PICKLIST_BIN__BIN_LOCATION_NUMBER:
				return getBinLocationNumber();
			case PicklistPackage.PICKLIST_BIN__PICKLIST_ID:
				return getPicklistId();
			case PicklistPackage.PICKLIST_BIN__PRIMARY_ORDER_ID:
				return getPrimaryOrderId();
			case PicklistPackage.PICKLIST_BIN__PRIMARY_SHIP_GROUP_SEQ_ID:
				return getPrimaryShipGroupSeqId();
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
			case PicklistPackage.PICKLIST_BIN__PICKLIST_BIN_ID:
				setPicklistBinId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_BIN__BIN_LOCATION_NUMBER:
				setBinLocationNumber((Long)newValue);
				return;
			case PicklistPackage.PICKLIST_BIN__PICKLIST_ID:
				setPicklistId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_BIN__PRIMARY_ORDER_ID:
				setPrimaryOrderId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_BIN__PRIMARY_SHIP_GROUP_SEQ_ID:
				setPrimaryShipGroupSeqId((String)newValue);
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
			case PicklistPackage.PICKLIST_BIN__PICKLIST_BIN_ID:
				setPicklistBinId(PICKLIST_BIN_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_BIN__BIN_LOCATION_NUMBER:
				setBinLocationNumber(BIN_LOCATION_NUMBER_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_BIN__PICKLIST_ID:
				setPicklistId(PICKLIST_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_BIN__PRIMARY_ORDER_ID:
				setPrimaryOrderId(PRIMARY_ORDER_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_BIN__PRIMARY_SHIP_GROUP_SEQ_ID:
				setPrimaryShipGroupSeqId(PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT);
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
			case PicklistPackage.PICKLIST_BIN__PICKLIST_BIN_ID:
				return PICKLIST_BIN_ID_EDEFAULT == null ? picklistBinId != null : !PICKLIST_BIN_ID_EDEFAULT.equals(picklistBinId);
			case PicklistPackage.PICKLIST_BIN__BIN_LOCATION_NUMBER:
				return binLocationNumber != BIN_LOCATION_NUMBER_EDEFAULT;
			case PicklistPackage.PICKLIST_BIN__PICKLIST_ID:
				return PICKLIST_ID_EDEFAULT == null ? picklistId != null : !PICKLIST_ID_EDEFAULT.equals(picklistId);
			case PicklistPackage.PICKLIST_BIN__PRIMARY_ORDER_ID:
				return PRIMARY_ORDER_ID_EDEFAULT == null ? primaryOrderId != null : !PRIMARY_ORDER_ID_EDEFAULT.equals(primaryOrderId);
			case PicklistPackage.PICKLIST_BIN__PRIMARY_SHIP_GROUP_SEQ_ID:
				return PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT == null ? primaryShipGroupSeqId != null : !PRIMARY_SHIP_GROUP_SEQ_ID_EDEFAULT.equals(primaryShipGroupSeqId);
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
		result.append(" (picklistBinId: ");
		result.append(picklistBinId);
		result.append(", binLocationNumber: ");
		result.append(binLocationNumber);
		result.append(", picklistId: ");
		result.append(picklistId);
		result.append(", primaryOrderId: ");
		result.append(primaryOrderId);
		result.append(", primaryShipGroupSeqId: ");
		result.append(primaryShipGroupSeqId);
		result.append(')');
		return result.toString();
	}

} //PicklistBinImpl
