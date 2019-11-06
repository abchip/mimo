/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortStatus;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl#getStatusDatetime <em>Status Datetime</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortStatusImpl#getSetByUserLogin <em>Set By User Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortStatusImpl extends BizEntityImpl implements WorkEffortStatus {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATETIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDatetime() <em>Status Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date statusDatetime = STATUS_DATETIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

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
	 * The cached value of the '{@link #getSetByUserLogin() <em>Set By User Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetByUserLogin()
	 * @generated
	 * @ordered
	 */
	protected UserLogin setByUserLogin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkEffortStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReason(String newReason) {
		reason = newReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getSetByUserLogin() {
		if (setByUserLogin != null && ((EObject)setByUserLogin).eIsProxy()) {
			InternalEObject oldSetByUserLogin = (InternalEObject)setByUserLogin;
			setByUserLogin = (UserLogin)eResolveProxy(oldSetByUserLogin);
			if (setByUserLogin != oldSetByUserLogin) {
			}
		}
		return setByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetSetByUserLogin() {
		return setByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetByUserLogin(UserLogin newSetByUserLogin) {
		setByUserLogin = newSetByUserLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDatetime() {
		return statusDatetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDatetime(Date newStatusDatetime) {
		statusDatetime = newStatusDatetime;
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
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
			}
		}
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkEffort basicGetWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(WorkEffort newWorkEffortId) {
		workEffortId = newWorkEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_DATETIME:
				return getStatusDatetime();
			case WorkeffortPackage.WORK_EFFORT_STATUS__REASON:
				return getReason();
			case WorkeffortPackage.WORK_EFFORT_STATUS__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case WorkeffortPackage.WORK_EFFORT_STATUS__SET_BY_USER_LOGIN:
				if (resolve) return getSetByUserLogin();
				return basicGetSetByUserLogin();
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
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_DATETIME:
				setStatusDatetime((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__REASON:
				setReason((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__SET_BY_USER_LOGIN:
				setSetByUserLogin((UserLogin)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_DATETIME:
				setStatusDatetime(STATUS_DATETIME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_STATUS__SET_BY_USER_LOGIN:
				setSetByUserLogin((UserLogin)null);
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
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_DATETIME:
				return STATUS_DATETIME_EDEFAULT == null ? statusDatetime != null : !STATUS_DATETIME_EDEFAULT.equals(statusDatetime);
			case WorkeffortPackage.WORK_EFFORT_STATUS__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case WorkeffortPackage.WORK_EFFORT_STATUS__WORK_EFFORT_ID:
				return workEffortId != null;
			case WorkeffortPackage.WORK_EFFORT_STATUS__STATUS_ID:
				return statusId != null;
			case WorkeffortPackage.WORK_EFFORT_STATUS__SET_BY_USER_LOGIN:
				return setByUserLogin != null;
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
		result.append(" (statusDatetime: ");
		result.append(statusDatetime);
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //WorkEffortStatusImpl
