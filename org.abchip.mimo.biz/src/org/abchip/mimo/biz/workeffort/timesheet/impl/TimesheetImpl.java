/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.timesheet.impl;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.workeffort.timesheet.Timesheet;
import org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getClientPartyId <em>Client Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getApprovedByUserLoginId <em>Approved By User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimesheetImpl extends BizEntityImpl implements Timesheet {
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
	 * The default value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected String comments = COMMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getClientPartyId() <em>Client Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party clientPartyId;

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
	 * The cached value of the '{@link #getApprovedByUserLoginId() <em>Approved By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin approvedByUserLoginId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimesheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimesheetPackage.Literals.TIMESHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getApprovedByUserLoginId() {
		if (approvedByUserLoginId != null && ((EObject)approvedByUserLoginId).eIsProxy()) {
			InternalEObject oldApprovedByUserLoginId = (InternalEObject)approvedByUserLoginId;
			approvedByUserLoginId = (UserLogin)eResolveProxy(oldApprovedByUserLoginId);
			if (approvedByUserLoginId != oldApprovedByUserLoginId) {
			}
		}
		return approvedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetApprovedByUserLoginId() {
		return approvedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovedByUserLoginId(UserLogin newApprovedByUserLoginId) {
		approvedByUserLoginId = newApprovedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getClientPartyId() {
		if (clientPartyId != null && ((EObject)clientPartyId).eIsProxy()) {
			InternalEObject oldClientPartyId = (InternalEObject)clientPartyId;
			clientPartyId = (Party)eResolveProxy(oldClientPartyId);
			if (clientPartyId != oldClientPartyId) {
			}
		}
		return clientPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetClientPartyId() {
		return clientPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientPartyId(Party newClientPartyId) {
		clientPartyId = newClientPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
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
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> timeEntries() {
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
		timesheetId = newTimesheetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimesheetPackage.TIMESHEET__TIMESHEET_ID:
				return getTimesheetId();
			case TimesheetPackage.TIMESHEET__COMMENTS:
				return getComments();
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				return getFromDate();
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				return getThruDate();
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				if (resolve) return getClientPartyId();
				return basicGetClientPartyId();
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				if (resolve) return getApprovedByUserLoginId();
				return basicGetApprovedByUserLoginId();
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
			case TimesheetPackage.TIMESHEET__TIMESHEET_ID:
				setTimesheetId((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET__COMMENTS:
				setComments((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				setClientPartyId((Party)newValue);
				return;
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				setApprovedByUserLoginId((UserLogin)newValue);
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
			case TimesheetPackage.TIMESHEET__TIMESHEET_ID:
				setTimesheetId(TIMESHEET_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				setPartyId((Party)null);
				return;
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				setClientPartyId((Party)null);
				return;
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				setApprovedByUserLoginId((UserLogin)null);
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
			case TimesheetPackage.TIMESHEET__TIMESHEET_ID:
				return TIMESHEET_ID_EDEFAULT == null ? timesheetId != null : !TIMESHEET_ID_EDEFAULT.equals(timesheetId);
			case TimesheetPackage.TIMESHEET__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				return partyId != null;
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				return clientPartyId != null;
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				return statusId != null;
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				return approvedByUserLoginId != null;
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
		result.append(", comments: ");
		result.append(comments);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //TimesheetImpl
