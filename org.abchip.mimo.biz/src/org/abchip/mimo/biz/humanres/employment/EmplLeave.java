/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Empl Leave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getLeaveTypeId <em>Leave Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getApproverPartyId <em>Approver Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getEmplLeaveReasonTypeId <em>Empl Leave Reason Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getLeaveStatus <em>Leave Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface EmplLeave extends BizEntityTyped<EmplLeaveType> {
	/**
	 * Returns the value of the '<em><b>Approver Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approver Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approver Party Id</em>' attribute.
	 * @see #setApproverPartyId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_ApproverPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getApproverPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getApproverPartyId <em>Approver Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approver Party Id</em>' attribute.
	 * @see #getApproverPartyId()
	 * @generated
	 */
	void setApproverPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Empl Leave Reason Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empl Leave Reason Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empl Leave Reason Type Id</em>' attribute.
	 * @see #setEmplLeaveReasonTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_EmplLeaveReasonTypeId()
	 * @model annotation="mimo-ent-domain frame='EmplLeaveReasonType'"
	 * @generated
	 */
	String getEmplLeaveReasonTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getEmplLeaveReasonTypeId <em>Empl Leave Reason Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empl Leave Reason Type Id</em>' attribute.
	 * @see #getEmplLeaveReasonTypeId()
	 * @generated
	 */
	void setEmplLeaveReasonTypeId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Leave Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leave Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave Status</em>' attribute.
	 * @see #setLeaveStatus(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_LeaveStatus()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getLeaveStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getLeaveStatus <em>Leave Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave Status</em>' attribute.
	 * @see #getLeaveStatus()
	 * @generated
	 */
	void setLeaveStatus(String value);

	/**
	 * Returns the value of the '<em><b>Leave Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leave Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leave Type Id</em>' attribute.
	 * @see #setLeaveTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_LeaveTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='EmplLeaveType'"
	 * @generated
	 */
	String getLeaveTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getLeaveTypeId <em>Leave Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leave Type Id</em>' attribute.
	 * @see #getLeaveTypeId()
	 * @generated
	 */
	void setLeaveTypeId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_PartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

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
	 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage#getEmplLeave_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.employment.EmplLeave#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

} // EmplLeave
