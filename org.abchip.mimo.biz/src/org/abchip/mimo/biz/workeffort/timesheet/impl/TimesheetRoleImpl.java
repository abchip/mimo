/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.timesheet.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage;
import org.abchip.mimo.biz.workeffort.timesheet.TimesheetRole;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timesheet Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetRoleImpl#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetRoleImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetRoleImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimesheetRoleImpl extends BizEntityImpl implements TimesheetRole {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTimesheetId() <em>Timesheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesheetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESHEET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimesheetId() <em>Timesheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesheetId()
	 * @generated
	 * @ordered
	 */
	protected String timesheetId = TIMESHEET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimesheetRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimesheetPackage.Literals.TIMESHEET_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET_ROLE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET_ROLE__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimesheetId() {
		return timesheetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimesheetId(String newTimesheetId) {
		String oldTimesheetId = timesheetId;
		timesheetId = newTimesheetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET_ROLE__TIMESHEET_ID, oldTimesheetId, timesheetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimesheetPackage.TIMESHEET_ROLE__TIMESHEET_ID:
				return getTimesheetId();
			case TimesheetPackage.TIMESHEET_ROLE__PARTY_ID:
				return getPartyId();
			case TimesheetPackage.TIMESHEET_ROLE__ROLE_TYPE_ID:
				return getRoleTypeId();
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
			case TimesheetPackage.TIMESHEET_ROLE__TIMESHEET_ID:
				setTimesheetId((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET_ROLE__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET_ROLE__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
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
			case TimesheetPackage.TIMESHEET_ROLE__TIMESHEET_ID:
				setTimesheetId(TIMESHEET_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET_ROLE__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET_ROLE__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
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
			case TimesheetPackage.TIMESHEET_ROLE__TIMESHEET_ID:
				return TIMESHEET_ID_EDEFAULT == null ? timesheetId != null : !TIMESHEET_ID_EDEFAULT.equals(timesheetId);
			case TimesheetPackage.TIMESHEET_ROLE__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case TimesheetPackage.TIMESHEET_ROLE__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
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
		result.append(" (timesheetId: ");
		result.append(timesheetId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(')');
		return result.toString();
	}

} //TimesheetRoleImpl
