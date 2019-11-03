/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PersonTraining;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getTrainingClassTypeId <em>Training Class Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getApproverId <em>Approver Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getTrainingRequestId <em>Training Request Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonTrainingImpl extends BizEntityImpl implements PersonTraining {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getTrainingClassTypeId() <em>Training Class Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingClassTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAINING_CLASS_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainingClassTypeId() <em>Training Class Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingClassTypeId()
	 * @generated
	 * @ordered
	 */
	protected String trainingClassTypeId = TRAINING_CLASS_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVAL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApprovalStatus() <em>Approval Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalStatus()
	 * @generated
	 * @ordered
	 */
	protected String approvalStatus = APPROVAL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getApproverId() <em>Approver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproverId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApproverId() <em>Approver Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproverId()
	 * @generated
	 * @ordered
	 */
	protected String approverId = APPROVER_ID_EDEFAULT;

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
	 * The default value of the '{@link #getTrainingRequestId() <em>Training Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAINING_REQUEST_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainingRequestId() <em>Training Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingRequestId()
	 * @generated
	 * @ordered
	 */
	protected String trainingRequestId = TRAINING_REQUEST_ID_EDEFAULT;

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
	protected PersonTrainingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PERSON_TRAINING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApprovalStatus() {
		return approvalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalStatus(String newApprovalStatus) {
		String oldApprovalStatus = approvalStatus;
		approvalStatus = newApprovalStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS, oldApprovalStatus, approvalStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApproverId() {
		return approverId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproverId(String newApproverId) {
		String oldApproverId = approverId;
		approverId = newApproverId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__APPROVER_ID, oldApproverId, approverId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__PARTY_ID, oldPartyId, partyId));
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
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__REASON, oldReason, reason));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrainingClassTypeId() {
		return trainingClassTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingClassTypeId(String newTrainingClassTypeId) {
		String oldTrainingClassTypeId = trainingClassTypeId;
		trainingClassTypeId = newTrainingClassTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID, oldTrainingClassTypeId, trainingClassTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrainingRequestId() {
		return trainingRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingRequestId(String newTrainingRequestId) {
		String oldTrainingRequestId = trainingRequestId;
		trainingRequestId = newTrainingRequestId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID, oldTrainingRequestId, trainingRequestId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				return getPartyId();
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				return getTrainingClassTypeId();
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				return getFromDate();
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				return getApprovalStatus();
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				return getApproverId();
			case AbilityPackage.PERSON_TRAINING__REASON:
				return getReason();
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				return getThruDate();
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				return getTrainingRequestId();
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
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
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				setTrainingClassTypeId((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				setApprovalStatus((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				setApproverId((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__REASON:
				setReason((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				setTrainingRequestId((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
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
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				setTrainingClassTypeId(TRAINING_CLASS_TYPE_ID_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				setApprovalStatus(APPROVAL_STATUS_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				setApproverId(APPROVER_ID_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				setTrainingRequestId(TRAINING_REQUEST_ID_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
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
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				return TRAINING_CLASS_TYPE_ID_EDEFAULT == null ? trainingClassTypeId != null : !TRAINING_CLASS_TYPE_ID_EDEFAULT.equals(trainingClassTypeId);
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				return APPROVAL_STATUS_EDEFAULT == null ? approvalStatus != null : !APPROVAL_STATUS_EDEFAULT.equals(approvalStatus);
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				return APPROVER_ID_EDEFAULT == null ? approverId != null : !APPROVER_ID_EDEFAULT.equals(approverId);
			case AbilityPackage.PERSON_TRAINING__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				return TRAINING_REQUEST_ID_EDEFAULT == null ? trainingRequestId != null : !TRAINING_REQUEST_ID_EDEFAULT.equals(trainingRequestId);
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
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
		result.append(" (partyId: ");
		result.append(partyId);
		result.append(", trainingClassTypeId: ");
		result.append(trainingClassTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", approvalStatus: ");
		result.append(approvalStatus);
		result.append(", approverId: ");
		result.append(approverId);
		result.append(", reason: ");
		result.append(reason);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", trainingRequestId: ");
		result.append(trainingRequestId);
		result.append(", workEffortId: ");
		result.append(workEffortId);
		result.append(')');
		return result.toString();
	}

} //PersonTrainingImpl
