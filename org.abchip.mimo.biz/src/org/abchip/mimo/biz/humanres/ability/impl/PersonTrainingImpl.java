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
import org.abchip.mimo.biz.humanres.ability.TrainingClassType;
import org.abchip.mimo.biz.humanres.trainings.TrainingRequest;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.Person;
import org.abchip.mimo.biz.workeffort.workeffort.WorkEffort;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getApproverId <em>Approver Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getTrainingClassTypeId <em>Training Class Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getWorkEffortId <em>Work Effort Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PersonTrainingImpl#getTrainingRequestId <em>Training Request Id</em>}</li>
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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getApproverId() <em>Approver Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproverId()
	 * @generated
	 * @ordered
	 */
	protected Person approverId;

	/**
	 * The cached value of the '{@link #getTrainingClassTypeId() <em>Training Class Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingClassTypeId()
	 * @generated
	 * @ordered
	 */
	protected TrainingClassType trainingClassTypeId;

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
	 * The cached value of the '{@link #getTrainingRequestId() <em>Training Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainingRequestId()
	 * @generated
	 * @ordered
	 */
	protected TrainingRequest trainingRequestId;

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
	public Person getApproverId() {
		if (approverId != null && ((EObject)approverId).eIsProxy()) {
			InternalEObject oldApproverId = (InternalEObject)approverId;
			approverId = (Person)eResolveProxy(oldApproverId);
			if (approverId != oldApproverId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERSON_TRAINING__APPROVER_ID, oldApproverId, approverId));
			}
		}
		return approverId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetApproverId() {
		return approverId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproverId(Person newApproverId) {
		Person oldApproverId = approverId;
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
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERSON_TRAINING__PARTY_ID, oldPartyId, partyId));
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
	public TrainingClassType getTrainingClassTypeId() {
		if (trainingClassTypeId != null && ((EObject)trainingClassTypeId).eIsProxy()) {
			InternalEObject oldTrainingClassTypeId = (InternalEObject)trainingClassTypeId;
			trainingClassTypeId = (TrainingClassType)eResolveProxy(oldTrainingClassTypeId);
			if (trainingClassTypeId != oldTrainingClassTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID, oldTrainingClassTypeId, trainingClassTypeId));
			}
		}
		return trainingClassTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingClassType basicGetTrainingClassTypeId() {
		return trainingClassTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingClassTypeId(TrainingClassType newTrainingClassTypeId) {
		TrainingClassType oldTrainingClassTypeId = trainingClassTypeId;
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
	public TrainingRequest getTrainingRequestId() {
		if (trainingRequestId != null && ((EObject)trainingRequestId).eIsProxy()) {
			InternalEObject oldTrainingRequestId = (InternalEObject)trainingRequestId;
			trainingRequestId = (TrainingRequest)eResolveProxy(oldTrainingRequestId);
			if (trainingRequestId != oldTrainingRequestId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID, oldTrainingRequestId, trainingRequestId));
			}
		}
		return trainingRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainingRequest basicGetTrainingRequestId() {
		return trainingRequestId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrainingRequestId(TrainingRequest newTrainingRequestId) {
		TrainingRequest oldTrainingRequestId = trainingRequestId;
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
	public WorkEffort getWorkEffortId() {
		if (workEffortId != null && ((EObject)workEffortId).eIsProxy()) {
			InternalEObject oldWorkEffortId = (InternalEObject)workEffortId;
			workEffortId = (WorkEffort)eResolveProxy(oldWorkEffortId);
			if (workEffortId != oldWorkEffortId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID, oldWorkEffortId, workEffortId));
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
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				return getFromDate();
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				return getApprovalStatus();
			case AbilityPackage.PERSON_TRAINING__REASON:
				return getReason();
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				return getThruDate();
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				if (resolve) return getApproverId();
				return basicGetApproverId();
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				if (resolve) return getTrainingClassTypeId();
				return basicGetTrainingClassTypeId();
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
				if (resolve) return getWorkEffortId();
				return basicGetWorkEffortId();
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				if (resolve) return getTrainingRequestId();
				return basicGetTrainingRequestId();
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
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				setApprovalStatus((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__REASON:
				setReason((String)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				setApproverId((Person)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				setTrainingClassTypeId((TrainingClassType)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)newValue);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				setTrainingRequestId((TrainingRequest)newValue);
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
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				setApprovalStatus(APPROVAL_STATUS_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				setPartyId((Party)null);
				return;
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				setApproverId((Person)null);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				setTrainingClassTypeId((TrainingClassType)null);
				return;
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
				setWorkEffortId((WorkEffort)null);
				return;
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				setTrainingRequestId((TrainingRequest)null);
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
			case AbilityPackage.PERSON_TRAINING__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case AbilityPackage.PERSON_TRAINING__APPROVAL_STATUS:
				return APPROVAL_STATUS_EDEFAULT == null ? approvalStatus != null : !APPROVAL_STATUS_EDEFAULT.equals(approvalStatus);
			case AbilityPackage.PERSON_TRAINING__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case AbilityPackage.PERSON_TRAINING__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case AbilityPackage.PERSON_TRAINING__PARTY_ID:
				return partyId != null;
			case AbilityPackage.PERSON_TRAINING__APPROVER_ID:
				return approverId != null;
			case AbilityPackage.PERSON_TRAINING__TRAINING_CLASS_TYPE_ID:
				return trainingClassTypeId != null;
			case AbilityPackage.PERSON_TRAINING__WORK_EFFORT_ID:
				return workEffortId != null;
			case AbilityPackage.PERSON_TRAINING__TRAINING_REQUEST_ID:
				return trainingRequestId != null;
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
		result.append(", approvalStatus: ");
		result.append(approvalStatus);
		result.append(", reason: ");
		result.append(reason);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PersonTrainingImpl
