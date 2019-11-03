/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.timesheet;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getTimeEntryId <em>Time Entry Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getHours <em>Hours</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getInvoiceId <em>Invoice Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getRateTypeId <em>Rate Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getTimesheetId <em>Timesheet Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry()
 * @model
 * @generated
 */
public interface TimeEntry extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute.
	 * @see #setComments(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_Comments()
	 * @model
	 * @generated
	 */
	String getComments();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getComments <em>Comments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments</em>' attribute.
	 * @see #getComments()
	 * @generated
	 */
	void setComments(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see #setHours(double)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_Hours()
	 * @model
	 * @generated
	 */
	double getHours();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getHours <em>Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hours</em>' attribute.
	 * @see #getHours()
	 * @generated
	 */
	void setHours(double value);

	/**
	 * Returns the value of the '<em><b>Invoice Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Id</em>' attribute.
	 * @see #setInvoiceId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_InvoiceId()
	 * @model annotation="mimo-ent-domain frame='Invoice'"
	 * @generated
	 */
	String getInvoiceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getInvoiceId <em>Invoice Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Id</em>' attribute.
	 * @see #getInvoiceId()
	 * @generated
	 */
	void setInvoiceId(String value);

	/**
	 * Returns the value of the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #setInvoiceItemSeqId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_InvoiceItemSeqId()
	 * @model
	 * @generated
	 */
	String getInvoiceItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Item Seq Id</em>' attribute.
	 * @see #getInvoiceItemSeqId()
	 * @generated
	 */
	void setInvoiceItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Rate Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Type Id</em>' attribute.
	 * @see #setRateTypeId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_RateTypeId()
	 * @model annotation="mimo-ent-domain frame='RateType'"
	 * @generated
	 */
	String getRateTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getRateTypeId <em>Rate Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Type Id</em>' attribute.
	 * @see #getRateTypeId()
	 * @generated
	 */
	void setRateTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Time Entry Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Entry Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Entry Id</em>' attribute.
	 * @see #setTimeEntryId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_TimeEntryId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTimeEntryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getTimeEntryId <em>Time Entry Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Entry Id</em>' attribute.
	 * @see #getTimeEntryId()
	 * @generated
	 */
	void setTimeEntryId(String value);

	/**
	 * Returns the value of the '<em><b>Timesheet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timesheet Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timesheet Id</em>' attribute.
	 * @see #setTimesheetId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_TimesheetId()
	 * @model annotation="mimo-ent-domain frame='Timesheet'"
	 * @generated
	 */
	String getTimesheetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getTimesheetId <em>Timesheet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timesheet Id</em>' attribute.
	 * @see #getTimesheetId()
	 * @generated
	 */
	void setTimesheetId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.workeffort.timesheet.TimesheetPackage#getTimeEntry_WorkEffortId()
	 * @model annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.workeffort.timesheet.TimeEntry#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

} // TimeEntry
