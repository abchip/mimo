/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;

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
public class JobInterviewImpl extends BizEntityImpl implements JobInterview {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		return (Enumeration)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGradeSecuredEnumId(Enumeration newGradeSecuredEnumId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__GRADE_SECURED_ENUM_ID, newGradeSecuredEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJobInterviewDate() {
		return (Date)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewDate(Date newJobInterviewDate) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_DATE, newJobInterviewDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewId() {
		return (String)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewId(String newJobInterviewId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_ID, newJobInterviewId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobInterviewResult() {
		return (String)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewResult(String newJobInterviewResult) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_RESULT, newJobInterviewResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobInterviewType getJobInterviewTypeId() {
		return (JobInterviewType)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewTypeId(JobInterviewType newJobInterviewTypeId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEW_TYPE_ID, newJobInterviewTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getJobIntervieweePartyId() {
		return (Party)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobIntervieweePartyId(Party newJobIntervieweePartyId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWEE_PARTY_ID, newJobIntervieweePartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getJobInterviewerPartyId() {
		return (Party)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobInterviewerPartyId(Party newJobInterviewerPartyId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_INTERVIEWER_PARTY_ID, newJobInterviewerPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobRequisition getJobRequisitionId() {
		return (JobRequisition)eGet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_REQUISITION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisitionId(JobRequisition newJobRequisitionId) {
		eSet(RecruitmentPackage.Literals.JOB_INTERVIEW__JOB_REQUISITION_ID, newJobRequisitionId);
	}

} //JobInterviewImpl
