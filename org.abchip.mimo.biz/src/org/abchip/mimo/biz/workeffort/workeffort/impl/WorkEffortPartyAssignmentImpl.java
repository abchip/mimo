/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.workeffort.workeffort.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.facility.Facility;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffortPartyAssignment;
import org.abchip.mimo.biz.workeffort.workeffort.WorkeffortPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Effort Party Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#isMustRsvp <em>Must Rsvp</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getStatusDateTime <em>Status Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getAssignedByUserLoginId <em>Assigned By User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getExpectationEnumId <em>Expectation Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getDelegateReasonEnumId <em>Delegate Reason Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.workeffort.workeffort.impl.WorkEffortPartyAssignmentImpl#getAvailabilityStatusId <em>Availability Status Id</em>}</li>
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
	 * The cached value of the '{@link #getWorkEffortId() <em>Work Effort Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkEffortId()
	 * @generated
	 * @ordered
	 */
	protected WorkEffort workEffortId;

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
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;

	/**
	 * The cached value of the '{@link #getAssignedByUserLoginId() <em>Assigned By User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedByUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin assignedByUserLoginId;

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
	 * The cached value of the '{@link #getExpectationEnumId() <em>Expectation Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectationEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration expectationEnumId;

	/**
	 * The cached value of the '{@link #getDelegateReasonEnumId() <em>Delegate Reason Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegateReasonEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration delegateReasonEnumId;

	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected Facility facilityId;

	/**
	 * The cached value of the '{@link #getAvailabilityStatusId() <em>Availability Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem availabilityStatusId;

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
	public UserLogin getAssignedByUserLoginId() {
		if (assignedByUserLoginId != null && ((EObject)assignedByUserLoginId).eIsProxy()) {
			InternalEObject oldAssignedByUserLoginId = (InternalEObject)assignedByUserLoginId;
			assignedByUserLoginId = (UserLogin)eResolveProxy(oldAssignedByUserLoginId);
			if (assignedByUserLoginId != oldAssignedByUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID, oldAssignedByUserLoginId, assignedByUserLoginId));
			}
		}
		return assignedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetAssignedByUserLoginId() {
		return assignedByUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignedByUserLoginId(UserLogin newAssignedByUserLoginId) {
		UserLogin oldAssignedByUserLoginId = assignedByUserLoginId;
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
	public StatusItem getAvailabilityStatusId() {
		if (availabilityStatusId != null && ((EObject)availabilityStatusId).eIsProxy()) {
			InternalEObject oldAvailabilityStatusId = (InternalEObject)availabilityStatusId;
			availabilityStatusId = (StatusItem)eResolveProxy(oldAvailabilityStatusId);
			if (availabilityStatusId != oldAvailabilityStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID, oldAvailabilityStatusId, availabilityStatusId));
			}
		}
		return availabilityStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetAvailabilityStatusId() {
		return availabilityStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityStatusId(StatusItem newAvailabilityStatusId) {
		StatusItem oldAvailabilityStatusId = availabilityStatusId;
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
	public Enumeration getDelegateReasonEnumId() {
		if (delegateReasonEnumId != null && ((EObject)delegateReasonEnumId).eIsProxy()) {
			InternalEObject oldDelegateReasonEnumId = (InternalEObject)delegateReasonEnumId;
			delegateReasonEnumId = (Enumeration)eResolveProxy(oldDelegateReasonEnumId);
			if (delegateReasonEnumId != oldDelegateReasonEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID, oldDelegateReasonEnumId, delegateReasonEnumId));
			}
		}
		return delegateReasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetDelegateReasonEnumId() {
		return delegateReasonEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegateReasonEnumId(Enumeration newDelegateReasonEnumId) {
		Enumeration oldDelegateReasonEnumId = delegateReasonEnumId;
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
	public Enumeration getExpectationEnumId() {
		if (expectationEnumId != null && ((EObject)expectationEnumId).eIsProxy()) {
			InternalEObject oldExpectationEnumId = (InternalEObject)expectationEnumId;
			expectationEnumId = (Enumeration)eResolveProxy(oldExpectationEnumId);
			if (expectationEnumId != oldExpectationEnumId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID, oldExpectationEnumId, expectationEnumId));
			}
		}
		return expectationEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetExpectationEnumId() {
		return expectationEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectationEnumId(Enumeration newExpectationEnumId) {
		Enumeration oldExpectationEnumId = expectationEnumId;
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
	public Facility getFacilityId() {
		if (facilityId != null && ((EObject)facilityId).eIsProxy()) {
			InternalEObject oldFacilityId = (InternalEObject)facilityId;
			facilityId = (Facility)eResolveProxy(oldFacilityId);
			if (facilityId != oldFacilityId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID, oldFacilityId, facilityId));
			}
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Facility basicGetFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(Facility newFacilityId) {
		Facility oldFacilityId = facilityId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID, oldPartyId, partyId));
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
		Party oldPartyId = partyId;
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
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		RoleType oldRoleTypeId = roleTypeId;
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
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID, oldStatusId, statusId));
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
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
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
		WorkEffort oldWorkEffortId = workEffortId;
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
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				return getFromDate();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				return getComments();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				return isMustRsvp();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				return getStatusDateTime();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
				return getThruDate();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				if (resolve) return getAssignedByUserLoginId();
				return basicGetAssignedByUserLoginId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				if (resolve) return getExpectationEnumId();
				return basicGetExpectationEnumId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				if (resolve) return getDelegateReasonEnumId();
				return basicGetDelegateReasonEnumId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				if (resolve) return getFacilityId();
				return basicGetFacilityId();
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				if (resolve) return getAvailabilityStatusId();
				return basicGetAvailabilityStatusId();
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
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				setComments((String)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				setMustRsvp((Boolean)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				setStatusDateTime((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				setAssignedByUserLoginId((UserLogin)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				setExpectationEnumId((Enumeration)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				setDelegateReasonEnumId((Enumeration)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				setFacilityId((Facility)newValue);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				setAvailabilityStatusId((StatusItem)newValue);
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
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				setComments(COMMENTS_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				setMustRsvp(MUST_RSVP_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				setStatusDateTime(STATUS_DATE_TIME_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				setAssignedByUserLoginId((UserLogin)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				setExpectationEnumId((Enumeration)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				setDelegateReasonEnumId((Enumeration)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				setFacilityId((Facility)null);
				return;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				setAvailabilityStatusId((StatusItem)null);
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
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__COMMENTS:
				return COMMENTS_EDEFAULT == null ? comments != null : !COMMENTS_EDEFAULT.equals(comments);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__MUST_RSVP:
				return mustRsvp != MUST_RSVP_EDEFAULT;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_DATE_TIME:
				return STATUS_DATE_TIME_EDEFAULT == null ? statusDateTime != null : !STATUS_DATE_TIME_EDEFAULT.equals(statusDateTime);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__WORK_EFFORT_ID:
				return workEffortId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__PARTY_ID:
				return partyId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ROLE_TYPE_ID:
				return roleTypeId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__ASSIGNED_BY_USER_LOGIN_ID:
				return assignedByUserLoginId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__STATUS_ID:
				return statusId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__EXPECTATION_ENUM_ID:
				return expectationEnumId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__DELEGATE_REASON_ENUM_ID:
				return delegateReasonEnumId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__FACILITY_ID:
				return facilityId != null;
			case WorkeffortPackage.WORK_EFFORT_PARTY_ASSIGNMENT__AVAILABILITY_STATUS_ID:
				return availabilityStatusId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", comments: ");
		result.append(comments);
		result.append(", mustRsvp: ");
		result.append(mustRsvp);
		result.append(", statusDateTime: ");
		result.append(statusDateTime);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //WorkEffortPartyAssignmentImpl
