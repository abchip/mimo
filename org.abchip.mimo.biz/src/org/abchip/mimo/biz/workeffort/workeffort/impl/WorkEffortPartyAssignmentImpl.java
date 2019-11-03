/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Party Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getAssignedByUserLoginId <em>Assigned By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getAvailabilityStatusId <em>Availability Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getDelegateReasonEnumId <em>Delegate Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getExpectationEnumId <em>Expectation Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#isMustRsvp <em>Must Rsvp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getStatusDateTime <em>Status Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkEffortPartyAssignmentImpl extends BizEntityImpl implements WorkEffortPartyAssignment {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getAssignedByUserLoginId() <em>Assigned By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNED_BY_USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedByUserLoginId() <em>Assigned By User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String assignedByUserLoginId = ASSIGNED_BY_USER_LOGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityStatusId() <em>Availability Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityStatusId() <em>Availability Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatusId()
	 * @generated
	 * @ordered
	 */
	protected String availabilityStatusId = AVAILABILITY_STATUS_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDelegateReasonEnumId() <em>Delegate Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATE_REASON_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegateReasonEnumId() <em>Delegate Reason Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected String delegateReasonEnumId = DELEGATE_REASON_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectationEnumId() <em>Expectation Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectationEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTATION_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectationEnumId() <em>Expectation Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectationEnumId()
	 * @generated
	 * @ordered
	 */
	protected String expectationEnumId = EXPECTATION_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isMustRsvp() <em>Must Rsvp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustRsvp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_RSVP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustRsvp() <em>Must Rsvp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustRsvp()
	 * @generated
	 * @ordered
	 */
	protected boolean mustRsvp = MUST_RSVP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusDateTime() <em>Status Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date STATUS_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusDateTime() <em>Status Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date statusDateTime = STATUS_DATE_TIME_EDEFAULT;

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
	protected WorkEffortPartyAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkeffortPackage.Literals.WORK_EFFORT_PARTY_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignedByUserLoginId() {
		return assignedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedByUserLoginId(String newAssignedByUserLoginId) {
		String oldAssignedByUserLoginId = assignedByUserLoginId;
		assignedByUserLoginId = newAssignedByUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID, oldAssignedByUserLoginId, assignedByUserLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailabilityStatusId() {
		return availabilityStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityStatusId(String newAvailabilityStatusId) {
		String oldAvailabilityStatusId = availabilityStatusId;
		availabilityStatusId = newAvailabilityStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID, oldAvailabilityStatusId, availabilityStatusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS, oldComments, comments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelegateReasonEnumId() {
		return delegateReasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegateReasonEnumId(String newDelegateReasonEnumId) {
		String oldDelegateReasonEnumId = delegateReasonEnumId;
		delegateReasonEnumId = newDelegateReasonEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID, oldDelegateReasonEnumId, delegateReasonEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpectationEnumId() {
		return expectationEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectationEnumId(String newExpectationEnumId) {
		String oldExpectationEnumId = expectationEnumId;
		expectationEnumId = newExpectationEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID, oldExpectationEnumId, expectationEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID, oldFacilityId, facilityId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMustRsvp() {
		return mustRsvp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMustRsvp(boolean newMustRsvp) {
		boolean oldMustRsvp = mustRsvp;
		mustRsvp = newMustRsvp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP, oldMustRsvp, mustRsvp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStatusDateTime() {
		return statusDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusDateTime(Date newStatusDateTime) {
		Date oldStatusDateTime = statusDateTime;
		statusDateTime = newStatusDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME, oldStatusDateTime, statusDateTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				return getWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				return getPartyId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				return getRoleTypeId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				return getFromDate();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				return getAssignedByUserLoginId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				return getAvailabilityStatusId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				return getComments();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				return getDelegateReasonEnumId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				return getExpectationEnumId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				return getFacilityId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				return isMustRsvp();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				return getStatusDateTime();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				return getStatusId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
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
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				setWorkEffortId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				setAssignedByUserLoginId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				setAvailabilityStatusId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				setDelegateReasonEnumId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				setExpectationEnumId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				setFacilityId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				setMustRsvp((Boolean)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				setStatusDateTime((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
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
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				setWorkEffortId(WORK_EFFORT_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				setAssignedByUserLoginId(ASSIGNED_BY_USER_LOGIN_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				setAvailabilityStatusId(AVAILABILITY_STATUS_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				setDelegateReasonEnumId(DELEGATE_REASON_ENUM_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				setExpectationEnumId(EXPECTATION_ENUM_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				setMustRsvp(MUST_RSVP_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				setStatusDateTime(STATUS_DATE_TIME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
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
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				return WORK_EFFORT_ID_EDEFAULT == null ? workEffortId != null : !WORK_EFFORT_ID_EDEFAULT.equals(workEffortId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				return ASSIGNED_BY_USER_LOGIN_ID_EDEFAULT == null ? assignedByUserLoginId != null : !ASSIGNED_BY_USER_LOGIN_ID_EDEFAULT.equals(assignedByUserLoginId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				return AVAILABILITY_STATUS_ID_EDEFAULT == null ? availabilityStatusId != null : !AVAILABILITY_STATUS_ID_EDEFAULT.equals(availabilityStatusId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				return DELEGATE_REASON_ENUM_ID_EDEFAULT == null ? delegateReasonEnumId != null : !DELEGATE_REASON_ENUM_ID_EDEFAULT.equals(delegateReasonEnumId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				return EXPECTATION_ENUM_ID_EDEFAULT == null ? expectationEnumId != null : !EXPECTATION_ENUM_ID_EDEFAULT.equals(expectationEnumId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				return mustRsvp != MUST_RSVP_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				return STATUS_DATE_TIME_EDEFAULT == null ? statusDateTime != null : !STATUS_DATE_TIME_EDEFAULT.equals(statusDateTime);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
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
		result.append(" (workEffortId: ");
		result.append(workEffortId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", assignedByUserLoginId: ");
		result.append(assignedByUserLoginId);
		result.append(", availabilityStatusId: ");
		result.append(availabilityStatusId);
		result.append(", comments: ");
		result.append(comments);
		result.append(", delegateReasonEnumId: ");
		result.append(delegateReasonEnumId);
		result.append(", expectationEnumId: ");
		result.append(expectationEnumId);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(", mustRsvp: ");
		result.append(mustRsvp);
		result.append(", statusDateTime: ");
		result.append(statusDateTime);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //WorkEffortPartyAssignmentImpl
