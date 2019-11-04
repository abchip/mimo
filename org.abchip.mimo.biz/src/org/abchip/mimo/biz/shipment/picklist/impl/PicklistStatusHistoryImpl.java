/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.shipment.picklist.Picklist;
import org.abchip.mimo.biz.shipment.picklist.PicklistPackage;
import org.abchip.mimo.biz.shipment.picklist.PicklistStatusHistory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Picklist Status History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.picklist.impl.PicklistStatusHistoryImpl#getPicklistId <em>Picklist Id</em>}</li>
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
	 * The cached value of the '{@link #getPicklistId() <em>Picklist Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPicklistId()
	 * @generated
	 * @ordered
	 */
	protected Picklist picklistId;

	/**
	 * The cached value of the '{@link #getChangeUserLoginId() <em>Change User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin changeUserLoginId;

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
	 * The cached value of the '{@link #getStatusIdTo() <em>Status Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusIdTo()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusIdTo;

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
	public UserLogin getChangeUserLoginId() {
		if (changeUserLoginId != null && ((EObject)changeUserLoginId).eIsProxy()) {
			InternalEObject oldChangeUserLoginId = (InternalEObject)changeUserLoginId;
			changeUserLoginId = (UserLogin)eResolveProxy(oldChangeUserLoginId);
			if (changeUserLoginId != oldChangeUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID, oldChangeUserLoginId, changeUserLoginId));
			}
		}
		return changeUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetChangeUserLoginId() {
		return changeUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeUserLoginId(UserLogin newChangeUserLoginId) {
		UserLogin oldChangeUserLoginId = changeUserLoginId;
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
	public Picklist getPicklistId() {
		if (picklistId != null && ((EObject)picklistId).eIsProxy()) {
			InternalEObject oldPicklistId = (InternalEObject)picklistId;
			picklistId = (Picklist)eResolveProxy(oldPicklistId);
			if (picklistId != oldPicklistId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID, oldPicklistId, picklistId));
			}
		}
		return picklistId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Picklist basicGetPicklistId() {
		return picklistId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPicklistId(Picklist newPicklistId) {
		Picklist oldPicklistId = picklistId;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusIdTo() {
		if (statusIdTo != null && ((EObject)statusIdTo).eIsProxy()) {
			InternalEObject oldStatusIdTo = (InternalEObject)statusIdTo;
			statusIdTo = (StatusItem)eResolveProxy(oldStatusIdTo);
			if (statusIdTo != oldStatusIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO, oldStatusIdTo, statusIdTo));
			}
		}
		return statusIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusIdTo() {
		return statusIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusIdTo(StatusItem newStatusIdTo) {
		StatusItem oldStatusIdTo = statusIdTo;
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
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				return getChangeDate();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				if (resolve) return getPicklistId();
				return basicGetPicklistId();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				if (resolve) return getChangeUserLoginId();
				return basicGetChangeUserLoginId();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				if (resolve) return getStatusIdTo();
				return basicGetStatusIdTo();
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
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				setPicklistId((Picklist)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				setChangeUserLoginId((UserLogin)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				setStatusIdTo((StatusItem)newValue);
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
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				setPicklistId((Picklist)null);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				setChangeUserLoginId((UserLogin)null);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				setStatusIdTo((StatusItem)null);
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
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case PicklistPackage.PICKLIST_STATUS_HISTORY__PICKLIST_ID:
				return picklistId != null;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__CHANGE_USER_LOGIN_ID:
				return changeUserLoginId != null;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID:
				return statusId != null;
			case PicklistPackage.PICKLIST_STATUS_HISTORY__STATUS_ID_TO:
				return statusIdTo != null;
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
		result.append(" (changeDate: ");
		result.append(changeDate);
		result.append(')');
		return result.toString();
	}

} //PicklistStatusHistoryImpl
