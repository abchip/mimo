/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.shipment.shipment.Shipment;
import org.abchip.mimo.biz.shipment.shipment.ShipmentStatus;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl#getStatusDate <em>Status Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl#getShipmentId <em>Shipment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl#getChangeByUserLoginId <em>Change By User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentStatusImpl extends BizEntityImpl implements ShipmentStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDate() <em>Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDate()
	 * @generated
	 * @ordered
	 */
	protected Date statusDate = STATUS_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShipmentId() <em>Shipment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentId()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentId;

	/**
	 * The cached value of the '{@link #getChangeByUserLoginId() <em>Change By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin changeByUserLoginId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getChangeByUserLoginId() {
		if (changeByUserLoginId != null && ((EObject)changeByUserLoginId).eIsProxy()) {
			InternalEObject oldChangeByUserLoginId = (InternalEObject)changeByUserLoginId;
			changeByUserLoginId = (UserLogin)eResolveProxy(oldChangeByUserLoginId);
			if (changeByUserLoginId != oldChangeByUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
			}
		}
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetChangeByUserLoginId() {
		return changeByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeByUserLoginId(UserLogin newChangeByUserLoginId) {
		UserLogin oldChangeByUserLoginId = changeByUserLoginId;
		changeByUserLoginId = newChangeByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID, oldChangeByUserLoginId, changeByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipmentId() {
		if (shipmentId != null && ((EObject)shipmentId).eIsProxy()) {
			InternalEObject oldShipmentId = (InternalEObject)shipmentId;
			shipmentId = (Shipment)eResolveProxy(oldShipmentId);
			if (shipmentId != oldShipmentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_STATUS__SHIPMENT_ID, oldShipmentId, shipmentId));
			}
		}
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment basicGetShipmentId() {
		return shipmentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentId(Shipment newShipmentId) {
		Shipment oldShipmentId = shipmentId;
		shipmentId = newShipmentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_STATUS__SHIPMENT_ID, oldShipmentId, shipmentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDate(Date newStatusDate) {
		Date oldStatusDate = statusDate;
		statusDate = newStatusDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_STATUS__STATUS_DATE, oldStatusDate, statusDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_STATUS__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_STATUS__STATUS_ID:
				return getStatusId();
			case Shipment_Package.SHIPMENT_STATUS__STATUS_DATE:
				return getStatusDate();
			case Shipment_Package.SHIPMENT_STATUS__SHIPMENT_ID:
				if (resolve) return getShipmentId();
				return basicGetShipmentId();
			case Shipment_Package.SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID:
				if (resolve) return getChangeByUserLoginId();
				return basicGetChangeByUserLoginId();
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
			case Shipment_Package.SHIPMENT_STATUS__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_STATUS__STATUS_DATE:
				setStatusDate((Date)newValue);
				return;
			case Shipment_Package.SHIPMENT_STATUS__SHIPMENT_ID:
				setShipmentId((Shipment)newValue);
				return;
			case Shipment_Package.SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)newValue);
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
			case Shipment_Package.SHIPMENT_STATUS__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_STATUS__STATUS_DATE:
				setStatusDate(STATUS_DATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_STATUS__SHIPMENT_ID:
				setShipmentId((Shipment)null);
				return;
			case Shipment_Package.SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID:
				setChangeByUserLoginId((UserLogin)null);
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
			case Shipment_Package.SHIPMENT_STATUS__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case Shipment_Package.SHIPMENT_STATUS__STATUS_DATE:
				return STATUS_DATE_EDEFAULT == null ? statusDate != null : !STATUS_DATE_EDEFAULT.equals(statusDate);
			case Shipment_Package.SHIPMENT_STATUS__SHIPMENT_ID:
				return shipmentId != null;
			case Shipment_Package.SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID:
				return changeByUserLoginId != null;
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
		result.append(" (statusId: ");
		result.append(statusId);
		result.append(", statusDate: ");
		result.append(statusDate);
		result.append(')');
		return result.toString();
	}

} //ShipmentStatusImpl
