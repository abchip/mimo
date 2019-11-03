/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.timesheet.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.timesheet.TimeEntry;
import org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getTimeEntryId <em>Time Entry Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getHours <em>Hours</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getRateTypeId <em>Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.impl.TimeEntryImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeEntryImpl extends BizEntityImpl implements TimeEntry {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getTimeEntryId() <em>Time Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEntryId()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_ENTRY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeEntryId() <em>Time Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEntryId()
	 * @generated
	 * @ordered
	 */
	protected String timeEntryId = TIME_ENTRY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected static final double HOURS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHours() <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHours()
	 * @generated
	 * @ordered
	 */
	protected double hours = HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceId() <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceId = INVOICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String INVOICE_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceItemSeqId() <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String invoiceItemSeqId = INVOICE_ITEM_SEQ_ID_EDEFAULT;

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
	 * The default value of the '{@link #getRateTypeId() <em>Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateTypeId() <em>Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTypeId()
	 * @generated
	 * @ordered
	 */
	protected String rateTypeId = RATE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected static final String WORK_EFFORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected String workEffortId = WORK_EFFORT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimesheetPackage.Literals.TIME_ENTRY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__COMMENTS, oldComments, comments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHours() {
		return hours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHours(double newHours) {
		double oldHours = hours;
		hours = newHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__HOURS, oldHours, hours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceId(String newInvoiceId) {
		String oldInvoiceId = invoiceId;
		invoiceId = newInvoiceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__INVOICE_ID, oldInvoiceId, invoiceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInvoiceItemSeqId() {
		return invoiceItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvoiceItemSeqId(String newInvoiceItemSeqId) {
		String oldInvoiceItemSeqId = invoiceItemSeqId;
		invoiceItemSeqId = newInvoiceItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__INVOICE_ITEM_SEQ_ID, oldInvoiceItemSeqId, invoiceItemSeqId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateTypeId() {
		return rateTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateTypeId(String newRateTypeId) {
		String oldRateTypeId = rateTypeId;
		rateTypeId = newRateTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__RATE_TYPE_ID, oldRateTypeId, rateTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeEntryId() {
		return timeEntryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeEntryId(String newTimeEntryId) {
		String oldTimeEntryId = timeEntryId;
		timeEntryId = newTimeEntryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__TIME_ENTRY_ID, oldTimeEntryId, timeEntryId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__TIMESHEET_ID, oldTimesheetId, timesheetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkEffortId() {
		return workEffortId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkEffortId(String newWorkEffortId) {
		String oldWorkEffortId = workEffortId;
		workEffortId = newWorkEffortId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimesheetPackage.TIME_ENTRY__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimesheetPackage.TIME_ENTRY__TIME_ENTRY_ID:
				return getTimeEntryId();
			case TimesheetPackage.TIME_ENTRY__COMMENTS:
				return getComments();
			case TimesheetPackage.TIME_ENTRY__FROM_DATE:
				return getFromDate();
			case TimesheetPackage.TIME_ENTRY__HOURS:
				return getHours();
			case TimesheetPackage.TIME_ENTRY__INVOICE_ID:
				return getInvoiceId();
			case TimesheetPackage.TIME_ENTRY__INVOICE_ITEM_SEQ_ID:
				return getInvoiceItemSeqId();
			case TimesheetPackage.TIME_ENTRY__PARTY_ID:
				return getPartyId();
			case TimesheetPackage.TIME_ENTRY__RATE_TYPE_ID:
				return getRateTypeId();
			case TimesheetPackage.TIME_ENTRY__THRU_DATE:
				return getThruDate();
			case TimesheetPackage.TIME_ENTRY__TIMESHEET_ID:
				return getTimesheetId();
			case TimesheetPackage.TIME_ENTRY__WORK_EFFORT_ID:
				return getWorkEffortId();
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
			case TimesheetPackage.TIME_ENTRY__TIME_ENTRY_ID:
				setTimeEntryId((String)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__COMMENTS:
				setComments((String)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__HOURS:
				setHours((Double)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__INVOICE_ID:
				setInvoiceId((String)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId((String)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__RATE_TYPE_ID:
				setRateTypeId((String)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__TIMESHEET_ID:
				setTimesheetId((String)newValue);
				return;
			case TimesheetPackage.TIME_ENTRY__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
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
			case TimesheetPackage.TIME_ENTRY__TIME_ENTRY_ID:
				setTimeEntryId(TIME_ENTRY_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__HOURS:
				setHours(HOURS_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__INVOICE_ID:
				setInvoiceId(INVOICE_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__INVOICE_ITEM_SEQ_ID:
				setInvoiceItemSeqId(INVOICE_ITEM_SEQ_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__RATE_TYPE_ID:
				setRateTypeId(RATE_TYPE_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__TIMESHEET_ID:
				setTimesheetId(TIMESHEET_ID_EDEFAULT);
				return;
			case TimesheetPackage.TIME_ENTRY__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
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
			case TimesheetPackage.TIME_ENTRY__TIME_ENTRY_ID:
				return TIME_ENTRY_ID_EDEFAULT == null ? timeEntryId != null : !TIME_ENTRY_ID_EDEFAULT.equals(timeEntryId);
			case TimesheetPackage.TIME_ENTRY__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case TimesheetPackage.TIME_ENTRY__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case TimesheetPackage.TIME_ENTRY__HOURS:
				return hours != HOURS_EDEFAULT;
			case TimesheetPackage.TIME_ENTRY__INVOICE_ID:
				return INVOICE_ID_EDEFAULT == null ? invoiceId != null : !INVOICE_ID_EDEFAULT.equals(invoiceId);
			case TimesheetPackage.TIME_ENTRY__INVOICE_ITEM_SEQ_ID:
				return INVOICE_ITEM_SEQ_ID_EDEFAULT == null ? invoiceItemSeqId != null : !INVOICE_ITEM_SEQ_ID_EDEFAULT.equals(invoiceItemSeqId);
			case TimesheetPackage.TIME_ENTRY__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case TimesheetPackage.TIME_ENTRY__RATE_TYPE_ID:
				return RATE_TYPE_ID_EDEFAULT == null ? rateTypeId != null : !RATE_TYPE_ID_EDEFAULT.equals(rateTypeId);
			case TimesheetPackage.TIME_ENTRY__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case TimesheetPackage.TIME_ENTRY__TIMESHEET_ID:
				return TIMESHEET_ID_EDEFAULT == null ? timesheetId != null : !TIMESHEET_ID_EDEFAULT.equals(timesheetId);
			case TimesheetPackage.TIME_ENTRY__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
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
		result.append(" (timeEntryId: ");
		result.append(timeEntryId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", hours: ");
		result.append(hours);
		result.append(", invoiceId: ");
		result.append(invoiceId);
		result.append(", invoiceItemSeqId: ");
		result.append(invoiceItemSeqId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", rateTypeId: ");
		result.append(rateTypeId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", timesheetId: ");
		result.append(timesheetId);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(')');
		return result.toString();
	}

} //TimeEntryImpl
