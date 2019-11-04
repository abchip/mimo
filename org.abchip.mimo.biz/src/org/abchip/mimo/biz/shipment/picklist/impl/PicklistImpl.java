/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist.impl;

import java.util.Collection;
import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.shipment.picklist.Picklist;
import org.abchip.mimo.biz.shipment.picklist.PicklistPackage;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picklist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getPicklistId <em>Picklist Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getCreatedByUserLogin <em>Created By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getPicklistDate <em>Picklist Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistImpl#getPicklistStatusHistories <em>Picklist Status Histories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PicklistImpl extends BizEntityImpl implements Picklist {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedByUserLogin() <em>Created By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String createdByUserLogin = CREATED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedByUserLogin() <em>Last Modified By User Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastModifiedByUserLogin = LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPicklistDate() <em>Picklist Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PICKLIST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPicklistDate() <em>Picklist Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistDate()
	 * @generated
	 * @ordered
	 */
	protected Date picklistDate = PICKLIST_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected ShipmentMethodType shipmentMethodTypeId;

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
	 * The cached value of the '{@link #getPicklistStatusHistories() <em>Picklist Status Histories</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistStatusHistories()
	 * @generated
	 * @ordered
	 */
	protected EList<String> picklistStatusHistories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicklistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicklistPackage.Literals.PICKLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedByUserLogin(String newCreatedByUserLogin) {
		String oldCreatedByUserLogin = createdByUserLogin;
		createdByUserLogin = newCreatedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__CREATED_BY_USER_LOGIN, oldCreatedByUserLogin, createdByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__DESCRIPTION, oldDescription, description));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST__FACILITY_ID, oldFacilityId, facilityId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModifiedByUserLogin(String newLastModifiedByUserLogin) {
		String oldLastModifiedByUserLogin = lastModifiedByUserLogin;
		lastModifiedByUserLogin = newLastModifiedByUserLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__LAST_MODIFIED_BY_USER_LOGIN, oldLastModifiedByUserLogin, lastModifiedByUserLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPicklistDate() {
		return picklistDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistDate(Date newPicklistDate) {
		Date oldPicklistDate = picklistDate;
		picklistDate = newPicklistDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__PICKLIST_DATE, oldPicklistDate, picklistDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__PICKLIST_ID, oldPicklistId, picklistId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodTypeId() {
		if (shipmentMethodTypeId != null && ((EObject)shipmentMethodTypeId).eIsProxy()) {
			InternalEObject oldShipmentMethodTypeId = (InternalEObject)shipmentMethodTypeId;
			shipmentMethodTypeId = (ShipmentMethodType)eResolveProxy(oldShipmentMethodTypeId);
			if (shipmentMethodTypeId != oldShipmentMethodTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
			}
		}
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipmentMethodType basicGetShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(ShipmentMethodType newShipmentMethodTypeId) {
		ShipmentMethodType oldShipmentMethodTypeId = shipmentMethodTypeId;
		shipmentMethodTypeId = newShipmentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getPicklistStatusHistories() {
		if (picklistStatusHistories == null) {
			picklistStatusHistories = new EDataTypeUniqueEList<String>(String.class, this, PicklistPackage.PICKLIST__PICKLIST_STATUS_HISTORIES);
		}
		return picklistStatusHistories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> picklistBins() {
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
			case PicklistPackage.PICKLIST__PICKLIST_ID:
				return getPicklistId();
			case PicklistPackage.PICKLIST__CREATED_BY_USER_LOGIN:
				return getCreatedByUserLogin();
			case PicklistPackage.PICKLIST__DESCRIPTION:
				return getDescription();
			case PicklistPackage.PICKLIST__LAST_MODIFIED_BY_USER_LOGIN:
				return getLastModifiedByUserLogin();
			case PicklistPackage.PICKLIST__PICKLIST_DATE:
				return getPicklistDate();
			case PicklistPackage.PICKLIST__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case PicklistPackage.PICKLIST__SHIPMENT_METHOD_TYPE_ID:
				if (resolve) return getShipmentMethodTypeId();
				return basicGetShipmentMethodTypeId();
			case PicklistPackage.PICKLIST__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case PicklistPackage.PICKLIST__PICKLIST_STATUS_HISTORIES:
				return getPicklistStatusHistories();
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
			case PicklistPackage.PICKLIST__PICKLIST_ID:
				setPicklistId((String)newValue);
				return;
			case PicklistPackage.PICKLIST__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin((String)newValue);
				return;
			case PicklistPackage.PICKLIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PicklistPackage.PICKLIST__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin((String)newValue);
				return;
			case PicklistPackage.PICKLIST__PICKLIST_DATE:
				setPicklistDate((Date)newValue);
				return;
			case PicklistPackage.PICKLIST__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case PicklistPackage.PICKLIST__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)newValue);
				return;
			case PicklistPackage.PICKLIST__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case PicklistPackage.PICKLIST__PICKLIST_STATUS_HISTORIES:
				getPicklistStatusHistories().clear();
				getPicklistStatusHistories().addAll((Collection<? extends String>)newValue);
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
			case PicklistPackage.PICKLIST__PICKLIST_ID:
				setPicklistId(PICKLIST_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__CREATED_BY_USER_LOGIN:
				setCreatedByUserLogin(CREATED_BY_USER_LOGIN_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__LAST_MODIFIED_BY_USER_LOGIN:
				setLastModifiedByUserLogin(LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__PICKLIST_DATE:
				setPicklistDate(PICKLIST_DATE_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case PicklistPackage.PICKLIST__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((ShipmentMethodType)null);
				return;
			case PicklistPackage.PICKLIST__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case PicklistPackage.PICKLIST__PICKLIST_STATUS_HISTORIES:
				getPicklistStatusHistories().clear();
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
			case PicklistPackage.PICKLIST__PICKLIST_ID:
				return PICKLIST_ID_EDEFAULT == null ? picklistId != null : !PICKLIST_ID_EDEFAULT.equals(picklistId);
			case PicklistPackage.PICKLIST__CREATED_BY_USER_LOGIN:
				return CREATED_BY_USER_LOGIN_EDEFAULT == null ? createdByUserLogin != null : !CREATED_BY_USER_LOGIN_EDEFAULT.equals(createdByUserLogin);
			case PicklistPackage.PICKLIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PicklistPackage.PICKLIST__LAST_MODIFIED_BY_USER_LOGIN:
				return LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT == null ? lastModifiedByUserLogin != null : !LAST_MODIFIED_BY_USER_LOGIN_EDEFAULT.equals(lastModifiedByUserLogin);
			case PicklistPackage.PICKLIST__PICKLIST_DATE:
				return PICKLIST_DATE_EDEFAULT == null ? picklistDate != null : !PICKLIST_DATE_EDEFAULT.equals(picklistDate);
			case PicklistPackage.PICKLIST__FACILITY_ID:
				return facilityId != null;
			case PicklistPackage.PICKLIST__SHIPMENT_METHOD_TYPE_ID:
				return shipmentMethodTypeId != null;
			case PicklistPackage.PICKLIST__STATUS_ID:
				return statusId != null;
			case PicklistPackage.PICKLIST__PICKLIST_STATUS_HISTORIES:
				return picklistStatusHistories != null && !picklistStatusHistories.isEmpty();
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
		result.append(" (picklistId: ");
		result.append(picklistId);
		result.append(", createdByUserLogin: ");
		result.append(createdByUserLogin);
		result.append(", description: ");
		result.append(description);
		result.append(", lastModifiedByUserLogin: ");
		result.append(lastModifiedByUserLogin);
		result.append(", picklistDate: ");
		result.append(picklistDate);
		result.append(", picklistStatusHistories: ");
		result.append(picklistStatusHistories);
		result.append(')');
		return result.toString();
	}

} //PicklistImpl
