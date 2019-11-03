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

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.timesheet.Timesheet;
import org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getApprovedByUserLoginId <em>Approved By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getClientPartyId <em>Client Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimesheetImpl#getThruDate <em>Thru Date</em>}</li>
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
	 * The default value of the '{@link #getApprovedByUserLoginId() <em>Approved By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVED_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovedByUserLoginId() <em>Approved By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String approvedByUserLoginId = APPROVED_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientPartyId() <em>Client Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientPartyId() <em>Client Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPartyId()
	 * @generated
	 * @ordered
	 */
	protected String clientPartyId = CLIENT_PARTY_ID_EDEFAULT;

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
	public String getApprovedByUserLoginId() {
		return approvedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovedByUserLoginId(String newApprovedByUserLoginId) {
		String oldApprovedByUserLoginId = approvedByUserLoginId;
		approvedByUserLoginId = newApprovedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID, oldApprovedByUserLoginId, approvedByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientPartyId() {
		return clientPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientPartyId(String newClientPartyId) {
		String oldClientPartyId = clientPartyId;
		clientPartyId = newClientPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID, oldClientPartyId, clientPartyId));
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
		String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__COMMENTS, oldComments, comments));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__STATUS_ID, oldStatusId, statusId));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__THRU_DATE, oldThruDate, thruDate));
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
		String oldTimesheetId = timesheetId;
		timesheetId = newTimesheetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIMESHEET__TIMESHEET_ID, oldTimesheetId, timesheetId));
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
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				return getApprovedByUserLoginId();
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				return getClientPartyId();
			case TimesheetPackage.TIMESHEET__COMMENTS:
				return getComments();
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				return getFromDate();
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				return getPartyId();
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				return getStatusId();
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				return getThruDate();
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
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				setApprovedByUserLoginId((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				setClientPartyId((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET__COMMENTS:
				setComments((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				setThruDate((Date)newValue);
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
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				setApprovedByUserLoginId(APPROVED_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				setClientPartyId(CLIENT_PARTY_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case TimesheetPackage.TIMESHEET__APPROVED_BY_USER_LOGIN_ID:
				return APPROVED_BY_USER_LOGIN_ID_EDEFAULT == null ? approvedByUserLoginId != null : !APPROVED_BY_USER_LOGIN_ID_EDEFAULT.equals(approvedByUserLoginId);
			case TimesheetPackage.TIMESHEET__CLIENT_PARTY_ID:
				return CLIENT_PARTY_ID_EDEFAULT == null ? clientPartyId != null : !CLIENT_PARTY_ID_EDEFAULT.equals(clientPartyId);
			case TimesheetPackage.TIMESHEET__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case TimesheetPackage.TIMESHEET__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TimesheetPackage.TIMESHEET__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case TimesheetPackage.TIMESHEET__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case TimesheetPackage.TIMESHEET__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(", approvedByUserLoginId: ");
		result.append(approvedByUserLoginId);
		result.append(", clientPartyId: ");
		result.append(clientPartyId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //TimesheetImpl
