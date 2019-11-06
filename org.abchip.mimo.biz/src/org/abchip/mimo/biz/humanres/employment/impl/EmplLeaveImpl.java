/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.humanres.employment.EmplLeave;
import org.abchip.mimo.biz.humanres.employment.EmplLeaveReasonType;
import org.abchip.mimo.biz.humanres.employment.EmplLeaveType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Empl Leave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getLeaveTypeId <em>Leave Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getEmplLeaveReasonTypeId <em>Empl Leave Reason Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getApproverPartyId <em>Approver Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmplLeaveImpl#getLeaveStatus <em>Leave Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmplLeaveImpl extends BizEntityTypedImpl<EmplLeaveType> implements EmplLeave {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getLeaveTypeId() <em>Leave Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaveTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmplLeaveType leaveTypeId;

	/**
	 * The cached value of the '{@link #getEmplLeaveReasonTypeId() <em>Empl Leave Reason Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplLeaveReasonTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmplLeaveReasonType emplLeaveReasonTypeId;

	/**
	 * The cached value of the '{@link #getApproverPartyId() <em>Approver Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproverPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party approverPartyId;

	/**
	 * The cached value of the '{@link #getLeaveStatus() <em>Leave Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaveStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusItem leaveStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmplLeaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPL_LEAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getApproverPartyId() {
		if (approverPartyId != null && ((EObject)approverPartyId).eIsProxy()) {
			InternalEObject oldApproverPartyId = (InternalEObject)approverPartyId;
			approverPartyId = (Party)eResolveProxy(oldApproverPartyId);
			if (approverPartyId != oldApproverPartyId) {
			}
		}
		return approverPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetApproverPartyId() {
		return approverPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproverPartyId(Party newApproverPartyId) {
		approverPartyId = newApproverPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeaveReasonType getEmplLeaveReasonTypeId() {
		if (emplLeaveReasonTypeId != null && ((EObject)emplLeaveReasonTypeId).eIsProxy()) {
			InternalEObject oldEmplLeaveReasonTypeId = (InternalEObject)emplLeaveReasonTypeId;
			emplLeaveReasonTypeId = (EmplLeaveReasonType)eResolveProxy(oldEmplLeaveReasonTypeId);
			if (emplLeaveReasonTypeId != oldEmplLeaveReasonTypeId) {
			}
		}
		return emplLeaveReasonTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplLeaveReasonType basicGetEmplLeaveReasonTypeId() {
		return emplLeaveReasonTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplLeaveReasonTypeId(EmplLeaveReasonType newEmplLeaveReasonTypeId) {
		emplLeaveReasonTypeId = newEmplLeaveReasonTypeId;
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
	public StatusItem getLeaveStatus() {
		if (leaveStatus != null && ((EObject)leaveStatus).eIsProxy()) {
			InternalEObject oldLeaveStatus = (InternalEObject)leaveStatus;
			leaveStatus = (StatusItem)eResolveProxy(oldLeaveStatus);
			if (leaveStatus != oldLeaveStatus) {
			}
		}
		return leaveStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetLeaveStatus() {
		return leaveStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaveStatus(StatusItem newLeaveStatus) {
		leaveStatus = newLeaveStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeaveType getLeaveTypeId() {
		if (leaveTypeId != null && ((EObject)leaveTypeId).eIsProxy()) {
			InternalEObject oldLeaveTypeId = (InternalEObject)leaveTypeId;
			leaveTypeId = (EmplLeaveType)eResolveProxy(oldLeaveTypeId);
			if (leaveTypeId != oldLeaveTypeId) {
			}
		}
		return leaveTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplLeaveType basicGetLeaveTypeId() {
		return leaveTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeaveTypeId(EmplLeaveType newLeaveTypeId) {
		leaveTypeId = newLeaveTypeId;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.EMPL_LEAVE__FROM_DATE:
				return getFromDate();
			case EmploymentPackage.EMPL_LEAVE__DESCRIPTION:
				return getDescription();
			case EmploymentPackage.EMPL_LEAVE__THRU_DATE:
				return getThruDate();
			case EmploymentPackage.EMPL_LEAVE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case EmploymentPackage.EMPL_LEAVE__LEAVE_TYPE_ID:
				if (resolve) return getLeaveTypeId();
				return basicGetLeaveTypeId();
			case EmploymentPackage.EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE_ID:
				if (resolve) return getEmplLeaveReasonTypeId();
				return basicGetEmplLeaveReasonTypeId();
			case EmploymentPackage.EMPL_LEAVE__APPROVER_PARTY_ID:
				if (resolve) return getApproverPartyId();
				return basicGetApproverPartyId();
			case EmploymentPackage.EMPL_LEAVE__LEAVE_STATUS:
				if (resolve) return getLeaveStatus();
				return basicGetLeaveStatus();
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
			case EmploymentPackage.EMPL_LEAVE__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE__LEAVE_TYPE_ID:
				setLeaveTypeId((EmplLeaveType)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE_ID:
				setEmplLeaveReasonTypeId((EmplLeaveReasonType)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE__APPROVER_PARTY_ID:
				setApproverPartyId((Party)newValue);
				return;
			case EmploymentPackage.EMPL_LEAVE__LEAVE_STATUS:
				setLeaveStatus((StatusItem)newValue);
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
			case EmploymentPackage.EMPL_LEAVE__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case EmploymentPackage.EMPL_LEAVE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EmploymentPackage.EMPL_LEAVE__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case EmploymentPackage.EMPL_LEAVE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case EmploymentPackage.EMPL_LEAVE__LEAVE_TYPE_ID:
				setLeaveTypeId((EmplLeaveType)null);
				return;
			case EmploymentPackage.EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE_ID:
				setEmplLeaveReasonTypeId((EmplLeaveReasonType)null);
				return;
			case EmploymentPackage.EMPL_LEAVE__APPROVER_PARTY_ID:
				setApproverPartyId((Party)null);
				return;
			case EmploymentPackage.EMPL_LEAVE__LEAVE_STATUS:
				setLeaveStatus((StatusItem)null);
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
			case EmploymentPackage.EMPL_LEAVE__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case EmploymentPackage.EMPL_LEAVE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EmploymentPackage.EMPL_LEAVE__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case EmploymentPackage.EMPL_LEAVE__PARTY_ID:
				return partyId != null;
			case EmploymentPackage.EMPL_LEAVE__LEAVE_TYPE_ID:
				return leaveTypeId != null;
			case EmploymentPackage.EMPL_LEAVE__EMPL_LEAVE_REASON_TYPE_ID:
				return emplLeaveReasonTypeId != null;
			case EmploymentPackage.EMPL_LEAVE__APPROVER_PARTY_ID:
				return approverPartyId != null;
			case EmploymentPackage.EMPL_LEAVE__LEAVE_STATUS:
				return leaveStatus != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //EmplLeaveImpl
