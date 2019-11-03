/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.employment.EmploymentApp;
import org.abchip.mimo.biz.humanres.employment.EmploymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getApplyingPartyId <em>Applying Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getApproverPartyId <em>Approver Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getEmplPositionId <em>Empl Position Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getEmploymentAppSourceTypeId <em>Employment App Source Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getReferredByPartyId <em>Referred By Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.employment.impl.EmploymentAppImpl#getStatusId <em>Status Id</em>}</li>
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
	 * The default value of the '{@link #getApplyingPartyId() <em>Applying Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyingPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLYING_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplyingPartyId() <em>Applying Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplyingPartyId()
	 * @generated
	 * @ordered
	 */
	protected String applyingPartyId = APPLYING_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApproverPartyId() <em>Approver Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproverPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPROVER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApproverPartyId() <em>Approver Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproverPartyId()
	 * @generated
	 * @ordered
	 */
	protected String approverPartyId = APPROVER_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPL_POSITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmplPositionId() <em>Empl Position Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmplPositionId()
	 * @generated
	 * @ordered
	 */
	protected String emplPositionId = EMPL_POSITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmploymentAppSourceTypeId() <em>Employment App Source Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentAppSourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmploymentAppSourceTypeId() <em>Employment App Source Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploymentAppSourceTypeId()
	 * @generated
	 * @ordered
	 */
	protected String employmentAppSourceTypeId = EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobRequisitionId() <em>Job Requisition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRequisitionId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_REQUISITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobRequisitionId() <em>Job Requisition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRequisitionId()
	 * @generated
	 * @ordered
	 */
	protected String jobRequisitionId = JOB_REQUISITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferredByPartyId() <em>Referred By Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredByPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERRED_BY_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferredByPartyId() <em>Referred By Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredByPartyId()
	 * @generated
	 * @ordered
	 */
	protected String referredByPartyId = REFERRED_BY_PARTY_ID_EDEFAULT;

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
	public String getApplyingPartyId() {
		return applyingPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplyingPartyId(String newApplyingPartyId) {
		String oldApplyingPartyId = applyingPartyId;
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
	public String getApproverPartyId() {
		return approverPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproverPartyId(String newApproverPartyId) {
		String oldApproverPartyId = approverPartyId;
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
	public String getEmplPositionId() {
		return emplPositionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmplPositionId(String newEmplPositionId) {
		String oldEmplPositionId = emplPositionId;
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
	public String getEmploymentAppSourceTypeId() {
		return employmentAppSourceTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmploymentAppSourceTypeId(String newEmploymentAppSourceTypeId) {
		String oldEmploymentAppSourceTypeId = employmentAppSourceTypeId;
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
	public String getJobRequisitionId() {
		return jobRequisitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisitionId(String newJobRequisitionId) {
		String oldJobRequisitionId = jobRequisitionId;
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
	public String getReferredByPartyId() {
		return referredByPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferredByPartyId(String newReferredByPartyId) {
		String oldReferredByPartyId = referredByPartyId;
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
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				return getApplyingPartyId();
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				return getApproverPartyId();
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				return getEmplPositionId();
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				return getEmploymentAppSourceTypeId();
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				return getJobRequisitionId();
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				return getReferredByPartyId();
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				return getStatusId();
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
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				setApplyingPartyId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				setApproverPartyId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				setEmplPositionId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				setEmploymentAppSourceTypeId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				setJobRequisitionId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				setReferredByPartyId((String)newValue);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				setStatusId((String)newValue);
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
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				setApplyingPartyId(APPLYING_PARTY_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				setApproverPartyId(APPROVER_PARTY_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				setEmplPositionId(EMPL_POSITION_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				setEmploymentAppSourceTypeId(EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				setJobRequisitionId(JOB_REQUISITION_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				setReferredByPartyId(REFERRED_BY_PARTY_ID_EDEFAULT);
				return;
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
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
			case EmploymentPackage.EMPLOYMENT_APP__APPLYING_PARTY_ID:
				return APPLYING_PARTY_ID_EDEFAULT == null ? applyingPartyId != null : !APPLYING_PARTY_ID_EDEFAULT.equals(applyingPartyId);
			case EmploymentPackage.EMPLOYMENT_APP__APPROVER_PARTY_ID:
				return APPROVER_PARTY_ID_EDEFAULT == null ? approverPartyId != null : !APPROVER_PARTY_ID_EDEFAULT.equals(approverPartyId);
			case EmploymentPackage.EMPLOYMENT_APP__EMPL_POSITION_ID:
				return EMPL_POSITION_ID_EDEFAULT == null ? emplPositionId != null : !EMPL_POSITION_ID_EDEFAULT.equals(emplPositionId);
			case EmploymentPackage.EMPLOYMENT_APP__EMPLOYMENT_APP_SOURCE_TYPE_ID:
				return EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT == null ? employmentAppSourceTypeId != null : !EMPLOYMENT_APP_SOURCE_TYPE_ID_EDEFAULT.equals(employmentAppSourceTypeId);
			case EmploymentPackage.EMPLOYMENT_APP__JOB_REQUISITION_ID:
				return JOB_REQUISITION_ID_EDEFAULT == null ? jobRequisitionId != null : !JOB_REQUISITION_ID_EDEFAULT.equals(jobRequisitionId);
			case EmploymentPackage.EMPLOYMENT_APP__REFERRED_BY_PARTY_ID:
				return REFERRED_BY_PARTY_ID_EDEFAULT == null ? referredByPartyId != null : !REFERRED_BY_PARTY_ID_EDEFAULT.equals(referredByPartyId);
			case EmploymentPackage.EMPLOYMENT_APP__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
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
		result.append(", applyingPartyId: ");
		result.append(applyingPartyId);
		result.append(", approverPartyId: ");
		result.append(approverPartyId);
		result.append(", emplPositionId: ");
		result.append(emplPositionId);
		result.append(", employmentAppSourceTypeId: ");
		result.append(employmentAppSourceTypeId);
		result.append(", jobRequisitionId: ");
		result.append(jobRequisitionId);
		result.append(", referredByPartyId: ");
		result.append(referredByPartyId);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(')');
		return result.toString();
	}

} //EmploymentAppImpl
