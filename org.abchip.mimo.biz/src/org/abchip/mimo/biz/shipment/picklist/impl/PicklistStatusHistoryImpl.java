/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.shipment.picklist.PicklistPackage;
import org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picklist Status History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl#getPicklistId <em>Picklist Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl#getChangeUserLoginId <em>Change User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl#getStatusIdTo <em>Status Id To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PicklistStatusHistoryImpl extends BizEntityImpl implements PicklistStatusHistory {
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
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date changeDate = CHANGE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeUserLoginId() <em>Change User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeUserLoginId() <em>Change User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String changeUserLoginId = CHANGE_USER_LOGIN_ID_EDEFAULT;

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
	 * The default value of the '{@link #getStatusIdTo() <em>Status Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusIdTo()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusIdTo() <em>Status Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusIdTo()
	 * @generated
	 * @ordered
	 */
	protected String statusIdTo = STATUS_ID_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PicklistStatusHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicklistPackage.Literals.PICKLIST_STATUS_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getChangeDate() {
		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeDate(Date newChangeDate) {
		Date oldChangeDate = changeDate;
		changeDate = newChangeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE, oldChangeDate, changeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangeUserLoginId() {
		return changeUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeUserLoginId(String newChangeUserLoginId) {
		String oldChangeUserLoginId = changeUserLoginId;
		changeUserLoginId = newChangeUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID, oldChangeUserLoginId, changeUserLoginId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID, oldPicklistId, picklistId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusIdTo() {
		return statusIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusIdTo(String newStatusIdTo) {
		String oldStatusIdTo = statusIdTo;
		statusIdTo = newStatusIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO, oldStatusIdTo, statusIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				return getPicklistId();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				return getChangeDate();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				return getChangeUserLoginId();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				return getStatusId();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				return getStatusIdTo();
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
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				setPicklistId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				setChangeUserLoginId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				setStatusIdTo((String)newValue);
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
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				setPicklistId(PICKLIST_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				setChangeUserLoginId(CHANGE_USER_LOGIN_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				setStatusIdTo(STATUS_ID_TO_EDEFAULT);
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
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				return PICKLIST_ID_EDEFAULT == null ? picklistId != null : !PICKLIST_ID_EDEFAULT.equals(picklistId);
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				return CHANGE_USER_LOGIN_ID_EDEFAULT == null ? changeUserLoginId != null : !CHANGE_USER_LOGIN_ID_EDEFAULT.equals(changeUserLoginId);
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				return STATUS_ID_TO_EDEFAULT == null ? statusIdTo != null : !STATUS_ID_TO_EDEFAULT.equals(statusIdTo);
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
		result.append(", changeDate: ");
		result.append(changeDate);
		result.append(", changeUserLoginId: ");
		result.append(changeUserLoginId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", statusIdTo: ");
		result.append(statusIdTo);
		result.append(')');
		return result.toString();
	}

} //PicklistStatusHistoryImpl
