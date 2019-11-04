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
import org.abchip.mimo.biz.humanres.employment.EmploymentApp;
import org.abchip.mimo.biz.humanres.employment.EmploymentAppSourceType;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.humanres.position.EmplPosition;
import org.abchip.mimo.biz.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employment App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getApplicationId <em>Application Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getApplicationDate <em>Application Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getApplyingPartyId <em>Applying Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getReferredByPartyId <em>Referred By Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getApproverPartyId <em>Approver Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmploymentAppImpl extends BizEntityImpl implements EmploymentApp {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationId() <em>Application Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationId()
	 * @generated
	 * @ordered
	 */
	protected String applicationId = APPLICATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationDate() <em>Application Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date APPLICATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationDate() <em>Application Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDate()
	 * @generated
	 * @ordered
	 */
	protected Date applicationDate = APPLICATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected EmplPosition emplPositionId;

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
	 * The cached value of the '{@link #getEmploymentAppSourceTypeId() <em>Employment App Source Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentAppSourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected EmploymentAppSourceType employmentAppSourceTypeId;

	/**
	 * The cached value of the '{@link #getApplyingPartyId() <em>Applying Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyingPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party applyingPartyId;

	/**
	 * The cached value of the '{@link #getReferredByPartyId() <em>Referred By Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredByPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party referredByPartyId;

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
	 * The cached value of the '{@link #getJobRequisitionId() <em>Job Requisition Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRequisitionId()
	 * @generated
	 * @ordered
	 */
	protected JobRequisition jobRequisitionId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmploymentAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmploymentPackage.Literals.EMPLOYMENT_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getApplicationDate() {
		return applicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationDate(Date newApplicationDate) {
		Date oldApplicationDate = applicationDate;
		applicationDate = newApplicationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__APPLICATION_DATE, oldApplicationDate, applicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicationId(String newApplicationId) {
		String oldApplicationId = applicationId;
		applicationId = newApplicationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__APPLICATION_ID, oldApplicationId, applicationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getApplyingPartyId() {
		if (applyingPartyId != null && ((EObject)applyingPartyId).eIsProxy()) {
			InternalEObject oldApplyingPartyId = (InternalEObject)applyingPartyId;
			applyingPartyId = (Party)eResolveProxy(oldApplyingPartyId);
			if (applyingPartyId != oldApplyingPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID, oldApplyingPartyId, applyingPartyId));
			}
		}
		return applyingPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetApplyingPartyId() {
		return applyingPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplyingPartyId(Party newApplyingPartyId) {
		Party oldApplyingPartyId = applyingPartyId;
		applyingPartyId = newApplyingPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID, oldApplyingPartyId, applyingPartyId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID, oldApproverPartyId, approverPartyId));
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
		Party oldApproverPartyId = approverPartyId;
		approverPartyId = newApproverPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID, oldApproverPartyId, approverPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplPosition getEmplPositionId() {
		if (emplPositionId != null && ((EObject)emplPositionId).eIsProxy()) {
			InternalEObject oldEmplPositionId = (InternalEObject)emplPositionId;
			emplPositionId = (EmplPosition)eResolveProxy(oldEmplPositionId);
			if (emplPositionId != oldEmplPositionId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID, oldEmplPositionId, emplPositionId));
			}
		}
		return emplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmplPosition basicGetEmplPositionId() {
		return emplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionId(EmplPosition newEmplPositionId) {
		EmplPosition oldEmplPositionId = emplPositionId;
		emplPositionId = newEmplPositionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID, oldEmplPositionId, emplPositionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmploymentAppSourceType getEmploymentAppSourceTypeId() {
		if (employmentAppSourceTypeId != null && ((EObject)employmentAppSourceTypeId).eIsProxy()) {
			InternalEObject oldEmploymentAppSourceTypeId = (InternalEObject)employmentAppSourceTypeId;
			employmentAppSourceTypeId = (EmploymentAppSourceType)eResolveProxy(oldEmploymentAppSourceTypeId);
			if (employmentAppSourceTypeId != oldEmploymentAppSourceTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID, oldEmploymentAppSourceTypeId, employmentAppSourceTypeId));
			}
		}
		return employmentAppSourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmploymentAppSourceType basicGetEmploymentAppSourceTypeId() {
		return employmentAppSourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmploymentAppSourceTypeId(EmploymentAppSourceType newEmploymentAppSourceTypeId) {
		EmploymentAppSourceType oldEmploymentAppSourceTypeId = employmentAppSourceTypeId;
		employmentAppSourceTypeId = newEmploymentAppSourceTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID, oldEmploymentAppSourceTypeId, employmentAppSourceTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobRequisition getJobRequisitionId() {
		if (jobRequisitionId != null && ((EObject)jobRequisitionId).eIsProxy()) {
			InternalEObject oldJobRequisitionId = (InternalEObject)jobRequisitionId;
			jobRequisitionId = (JobRequisition)eResolveProxy(oldJobRequisitionId);
			if (jobRequisitionId != oldJobRequisitionId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID, oldJobRequisitionId, jobRequisitionId));
			}
		}
		return jobRequisitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobRequisition basicGetJobRequisitionId() {
		return jobRequisitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisitionId(JobRequisition newJobRequisitionId) {
		JobRequisition oldJobRequisitionId = jobRequisitionId;
		jobRequisitionId = newJobRequisitionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID, oldJobRequisitionId, jobRequisitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getReferredByPartyId() {
		if (referredByPartyId != null && ((EObject)referredByPartyId).eIsProxy()) {
			InternalEObject oldReferredByPartyId = (InternalEObject)referredByPartyId;
			referredByPartyId = (Party)eResolveProxy(oldReferredByPartyId);
			if (referredByPartyId != oldReferredByPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID, oldReferredByPartyId, referredByPartyId));
			}
		}
		return referredByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetReferredByPartyId() {
		return referredByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredByPartyId(Party newReferredByPartyId) {
		Party oldReferredByPartyId = referredByPartyId;
		referredByPartyId = newReferredByPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID, oldReferredByPartyId, referredByPartyId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmploymentPackage.EMPLOYMENT_APP__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmploymentPackage.EMPLOYMENT_APP__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_ID:
				return getApplicationId();
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_DATE:
				return getApplicationDate();
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				if (resolve) return getEmplPositionId();
				return basicGetEmplPositionId();
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				if (resolve) return getEmploymentAppSourceTypeId();
				return basicGetEmploymentAppSourceTypeId();
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				if (resolve) return getApplyingPartyId();
				return basicGetApplyingPartyId();
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				if (resolve) return getReferredByPartyId();
				return basicGetReferredByPartyId();
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				if (resolve) return getApproverPartyId();
				return basicGetApproverPartyId();
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				if (resolve) return getJobRequisitionId();
				return basicGetJobRequisitionId();
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
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_ID:
				setApplicationId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_DATE:
				setApplicationDate((Date)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				setEmplPositionId((EmplPosition)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				setEmploymentAppSourceTypeId((EmploymentAppSourceType)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				setApplyingPartyId((Party)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				setReferredByPartyId((Party)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				setApproverPartyId((Party)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				setJobRequisitionId((JobRequisition)newValue);
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
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_ID:
				setApplicationId(APPLICATION_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_DATE:
				setApplicationDate(APPLICATION_DATE_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				setEmplPositionId((EmplPosition)null);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				setEmploymentAppSourceTypeId((EmploymentAppSourceType)null);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				setApplyingPartyId((Party)null);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				setReferredByPartyId((Party)null);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				setApproverPartyId((Party)null);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				setJobRequisitionId((JobRequisition)null);
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
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_ID:
				return APPLICATION_ID_EDEFAULT == null ? applicationId != null : !APPLICATION_ID_EDEFAULT.equals(applicationId);
			case EmploymentPackage.EMPLOYMENT_APP__APPLICATION_DATE:
				return APPLICATION_DATE_EDEFAULT == null ? applicationDate != null : !APPLICATION_DATE_EDEFAULT.equals(applicationDate);
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				return emplPositionId != null;
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				return statusId != null;
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				return employmentAppSourceTypeId != null;
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				return applyingPartyId != null;
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				return referredByPartyId != null;
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				return approverPartyId != null;
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				return jobRequisitionId != null;
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
		result.append(" (applicationId: ");
		result.append(applicationId);
		result.append(", applicationDate: ");
		result.append(applicationDate);
		result.append(')');
		return result.toString();
	}

} //EmploymentAppImpl
