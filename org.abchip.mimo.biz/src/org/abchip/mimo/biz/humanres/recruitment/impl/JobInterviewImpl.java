/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.recruitment.JobInterview;
import org.abchip.mimo.biz.humanres.recruitment.JobInterviewType;
import org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Interview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewId <em>Job Interview Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getGradeSecuredEnumId <em>Grade Secured Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewDate <em>Job Interview Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewResult <em>Job Interview Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewTypeId <em>Job Interview Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobIntervieweePartyId <em>Job Interviewee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewerPartyId <em>Job Interviewer Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobInterviewImpl extends BizEntityTypedImpl<JobInterviewType> implements JobInterview {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getJobInterviewId() <em>Job Interview Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_INTERVIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobInterviewId() <em>Job Interview Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewId()
	 * @generated
	 * @ordered
	 */
	protected String jobInterviewId = JOB_INTERVIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradeSecuredEnumId() <em>Grade Secured Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeSecuredEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_SECURED_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradeSecuredEnumId() <em>Grade Secured Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeSecuredEnumId()
	 * @generated
	 * @ordered
	 */
	protected String gradeSecuredEnumId = GRADE_SECURED_ENUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobInterviewDate() <em>Job Interview Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date JOB_INTERVIEW_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobInterviewDate() <em>Job Interview Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date jobInterviewDate = JOB_INTERVIEW_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobInterviewResult() <em>Job Interview Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewResult()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_INTERVIEW_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobInterviewResult() <em>Job Interview Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewResult()
	 * @generated
	 * @ordered
	 */
	protected String jobInterviewResult = JOB_INTERVIEW_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobInterviewTypeId() <em>Job Interview Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_INTERVIEW_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobInterviewTypeId() <em>Job Interview Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewTypeId()
	 * @generated
	 * @ordered
	 */
	protected String jobInterviewTypeId = JOB_INTERVIEW_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobIntervieweePartyId() <em>Job Interviewee Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobIntervieweePartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_INTERVIEWEE_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobIntervieweePartyId() <em>Job Interviewee Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobIntervieweePartyId()
	 * @generated
	 * @ordered
	 */
	protected String jobIntervieweePartyId = JOB_INTERVIEWEE_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobInterviewerPartyId() <em>Job Interviewer Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewerPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_INTERVIEWER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobInterviewerPartyId() <em>Job Interviewer Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewerPartyId()
	 * @generated
	 * @ordered
	 */
	protected String jobInterviewerPartyId = JOB_INTERVIEWER_PARTY_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobInterviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecruitmentPackage.Literals.JOB_INTERVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGradeSecuredEnumId() {
		return gradeSecuredEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradeSecuredEnumId(String newGradeSecuredEnumId) {
		String oldGradeSecuredEnumId = gradeSecuredEnumId;
		gradeSecuredEnumId = newGradeSecuredEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID, oldGradeSecuredEnumId, gradeSecuredEnumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJobInterviewDate() {
		return jobInterviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewDate(Date newJobInterviewDate) {
		Date oldJobInterviewDate = jobInterviewDate;
		jobInterviewDate = newJobInterviewDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE, oldJobInterviewDate, jobInterviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewId() {
		return jobInterviewId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewId(String newJobInterviewId) {
		String oldJobInterviewId = jobInterviewId;
		jobInterviewId = newJobInterviewId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_ID, oldJobInterviewId, jobInterviewId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewResult() {
		return jobInterviewResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewResult(String newJobInterviewResult) {
		String oldJobInterviewResult = jobInterviewResult;
		jobInterviewResult = newJobInterviewResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT, oldJobInterviewResult, jobInterviewResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewTypeId() {
		return jobInterviewTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewTypeId(String newJobInterviewTypeId) {
		String oldJobInterviewTypeId = jobInterviewTypeId;
		jobInterviewTypeId = newJobInterviewTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID, oldJobInterviewTypeId, jobInterviewTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobIntervieweePartyId() {
		return jobIntervieweePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobIntervieweePartyId(String newJobIntervieweePartyId) {
		String oldJobIntervieweePartyId = jobIntervieweePartyId;
		jobIntervieweePartyId = newJobIntervieweePartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID, oldJobIntervieweePartyId, jobIntervieweePartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewerPartyId() {
		return jobInterviewerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewerPartyId(String newJobInterviewerPartyId) {
		String oldJobInterviewerPartyId = jobInterviewerPartyId;
		jobInterviewerPartyId = newJobInterviewerPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID, oldJobInterviewerPartyId, jobInterviewerPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID, oldJobRequisitionId, jobRequisitionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_ID:
				return getJobInterviewId();
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				return getGradeSecuredEnumId();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				return getJobInterviewDate();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				return getJobInterviewResult();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				return getJobInterviewTypeId();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				return getJobIntervieweePartyId();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				return getJobInterviewerPartyId();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				return getJobRequisitionId();
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
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_ID:
				setJobInterviewId((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				setGradeSecuredEnumId((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				setJobInterviewDate((Date)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				setJobInterviewResult((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				setJobInterviewTypeId((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				setJobIntervieweePartyId((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				setJobInterviewerPartyId((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				setJobRequisitionId((String)newValue);
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
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_ID:
				setJobInterviewId(JOB_INTERVIEW_ID_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				setGradeSecuredEnumId(GRADE_SECURED_ENUM_ID_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				setJobInterviewDate(JOB_INTERVIEW_DATE_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				setJobInterviewResult(JOB_INTERVIEW_RESULT_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				setJobInterviewTypeId(JOB_INTERVIEW_TYPE_ID_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				setJobIntervieweePartyId(JOB_INTERVIEWEE_PARTY_ID_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				setJobInterviewerPartyId(JOB_INTERVIEWER_PARTY_ID_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				setJobRequisitionId(JOB_REQUISITION_ID_EDEFAULT);
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
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_ID:
				return JOB_INTERVIEW_ID_EDEFAULT == null ? jobInterviewId != null : !JOB_INTERVIEW_ID_EDEFAULT.equals(jobInterviewId);
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				return GRADE_SECURED_ENUM_ID_EDEFAULT == null ? gradeSecuredEnumId != null : !GRADE_SECURED_ENUM_ID_EDEFAULT.equals(gradeSecuredEnumId);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				return JOB_INTERVIEW_DATE_EDEFAULT == null ? jobInterviewDate != null : !JOB_INTERVIEW_DATE_EDEFAULT.equals(jobInterviewDate);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				return JOB_INTERVIEW_RESULT_EDEFAULT == null ? jobInterviewResult != null : !JOB_INTERVIEW_RESULT_EDEFAULT.equals(jobInterviewResult);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				return JOB_INTERVIEW_TYPE_ID_EDEFAULT == null ? jobInterviewTypeId != null : !JOB_INTERVIEW_TYPE_ID_EDEFAULT.equals(jobInterviewTypeId);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				return JOB_INTERVIEWEE_PARTY_ID_EDEFAULT == null ? jobIntervieweePartyId != null : !JOB_INTERVIEWEE_PARTY_ID_EDEFAULT.equals(jobIntervieweePartyId);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				return JOB_INTERVIEWER_PARTY_ID_EDEFAULT == null ? jobInterviewerPartyId != null : !JOB_INTERVIEWER_PARTY_ID_EDEFAULT.equals(jobInterviewerPartyId);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				return JOB_REQUISITION_ID_EDEFAULT == null ? jobRequisitionId != null : !JOB_REQUISITION_ID_EDEFAULT.equals(jobRequisitionId);
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
		result.append(" (jobInterviewId: ");
		result.append(jobInterviewId);
		result.append(", gradeSecuredEnumId: ");
		result.append(gradeSecuredEnumId);
		result.append(", jobInterviewDate: ");
		result.append(jobInterviewDate);
		result.append(", jobInterviewResult: ");
		result.append(jobInterviewResult);
		result.append(", jobInterviewTypeId: ");
		result.append(jobInterviewTypeId);
		result.append(", jobIntervieweePartyId: ");
		result.append(jobIntervieweePartyId);
		result.append(", jobInterviewerPartyId: ");
		result.append(jobInterviewerPartyId);
		result.append(", jobRequisitionId: ");
		result.append(jobRequisitionId);
		result.append(')');
		return result.toString();
	}

} //JobInterviewImpl
