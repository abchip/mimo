/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.humanres.recruitment.JobInterview;
import org.abchip.mimo.biz.humanres.recruitment.JobInterviewType;
import org.abchip.mimo.biz.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Interview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewId <em>Job Interview Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewDate <em>Job Interview Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewResult <em>Job Interview Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobIntervieweePartyId <em>Job Interviewee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewerPartyId <em>Job Interviewer Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobInterviewTypeId <em>Job Interview Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewImpl#getGradeSecuredEnumId <em>Grade Secured Enum Id</em>}</li>
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
	 * The cached value of the '{@link #getJobIntervieweePartyId() <em>Job Interviewee Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobIntervieweePartyId()
	 * @generated
	 * @ordered
	 */
	protected Party jobIntervieweePartyId;

	/**
	 * The cached value of the '{@link #getJobInterviewerPartyId() <em>Job Interviewer Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewerPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party jobInterviewerPartyId;

	/**
	 * The cached value of the '{@link #getJobInterviewTypeId() <em>Job Interview Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobInterviewTypeId()
	 * @generated
	 * @ordered
	 */
	protected JobInterviewType jobInterviewTypeId;

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
	 * The cached value of the '{@link #getGradeSecuredEnumId() <em>Grade Secured Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradeSecuredEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration gradeSecuredEnumId;

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
	public Enumeration getGradeSecuredEnumId() {
		if (gradeSecuredEnumId != null && ((EObject)gradeSecuredEnumId).eIsProxy()) {
			InternalEObject oldGradeSecuredEnumId = (InternalEObject)gradeSecuredEnumId;
			gradeSecuredEnumId = (Enumeration)eResolveProxy(oldGradeSecuredEnumId);
			if (gradeSecuredEnumId != oldGradeSecuredEnumId) {
			}
		}
		return gradeSecuredEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetGradeSecuredEnumId() {
		return gradeSecuredEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradeSecuredEnumId(Enumeration newGradeSecuredEnumId) {
		gradeSecuredEnumId = newGradeSecuredEnumId;
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
		jobInterviewDate = newJobInterviewDate;
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
		jobInterviewId = newJobInterviewId;
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
		jobInterviewResult = newJobInterviewResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobInterviewType getJobInterviewTypeId() {
		if (jobInterviewTypeId != null && ((EObject)jobInterviewTypeId).eIsProxy()) {
			InternalEObject oldJobInterviewTypeId = (InternalEObject)jobInterviewTypeId;
			jobInterviewTypeId = (JobInterviewType)eResolveProxy(oldJobInterviewTypeId);
			if (jobInterviewTypeId != oldJobInterviewTypeId) {
			}
		}
		return jobInterviewTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobInterviewType basicGetJobInterviewTypeId() {
		return jobInterviewTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewTypeId(JobInterviewType newJobInterviewTypeId) {
		jobInterviewTypeId = newJobInterviewTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getJobIntervieweePartyId() {
		if (jobIntervieweePartyId != null && ((EObject)jobIntervieweePartyId).eIsProxy()) {
			InternalEObject oldJobIntervieweePartyId = (InternalEObject)jobIntervieweePartyId;
			jobIntervieweePartyId = (Party)eResolveProxy(oldJobIntervieweePartyId);
			if (jobIntervieweePartyId != oldJobIntervieweePartyId) {
			}
		}
		return jobIntervieweePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetJobIntervieweePartyId() {
		return jobIntervieweePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobIntervieweePartyId(Party newJobIntervieweePartyId) {
		jobIntervieweePartyId = newJobIntervieweePartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getJobInterviewerPartyId() {
		if (jobInterviewerPartyId != null && ((EObject)jobInterviewerPartyId).eIsProxy()) {
			InternalEObject oldJobInterviewerPartyId = (InternalEObject)jobInterviewerPartyId;
			jobInterviewerPartyId = (Party)eResolveProxy(oldJobInterviewerPartyId);
			if (jobInterviewerPartyId != oldJobInterviewerPartyId) {
			}
		}
		return jobInterviewerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetJobInterviewerPartyId() {
		return jobInterviewerPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewerPartyId(Party newJobInterviewerPartyId) {
		jobInterviewerPartyId = newJobInterviewerPartyId;
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
		jobRequisitionId = newJobRequisitionId;
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
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				return getJobInterviewDate();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				return getJobInterviewResult();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				if (resolve) return getJobIntervieweePartyId();
				return basicGetJobIntervieweePartyId();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				if (resolve) return getJobInterviewerPartyId();
				return basicGetJobInterviewerPartyId();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				if (resolve) return getJobInterviewTypeId();
				return basicGetJobInterviewTypeId();
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				if (resolve) return getJobRequisitionId();
				return basicGetJobRequisitionId();
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				if (resolve) return getGradeSecuredEnumId();
				return basicGetGradeSecuredEnumId();
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
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				setJobInterviewDate((Date)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				setJobInterviewResult((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				setJobIntervieweePartyId((Party)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				setJobInterviewerPartyId((Party)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				setJobInterviewTypeId((JobInterviewType)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				setJobRequisitionId((JobRequisition)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				setGradeSecuredEnumId((Enumeration)newValue);
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
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				setJobInterviewDate(JOB_INTERVIEW_DATE_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				setJobInterviewResult(JOB_INTERVIEW_RESULT_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				setJobIntervieweePartyId((Party)null);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				setJobInterviewerPartyId((Party)null);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				setJobInterviewTypeId((JobInterviewType)null);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				setJobRequisitionId((JobRequisition)null);
				return;
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				setGradeSecuredEnumId((Enumeration)null);
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
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_DATE:
				return JOB_INTERVIEW_DATE_EDEFAULT == null ? jobInterviewDate != null : !JOB_INTERVIEW_DATE_EDEFAULT.equals(jobInterviewDate);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_RESULT:
				return JOB_INTERVIEW_RESULT_EDEFAULT == null ? jobInterviewResult != null : !JOB_INTERVIEW_RESULT_EDEFAULT.equals(jobInterviewResult);
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID:
				return jobIntervieweePartyId != null;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID:
				return jobInterviewerPartyId != null;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID:
				return jobInterviewTypeId != null;
			case RecruitmentPackage.JOB_INTERVIEW__JOB_REQUISITION_ID:
				return jobRequisitionId != null;
			case RecruitmentPackage.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID:
				return gradeSecuredEnumId != null;
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
		result.append(", jobInterviewDate: ");
		result.append(jobInterviewDate);
		result.append(", jobInterviewResult: ");
		result.append(jobInterviewResult);
		result.append(')');
		return result.toString();
	}

} //JobInterviewImpl
