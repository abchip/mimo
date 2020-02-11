/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Interview</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewId <em>Job Interview Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getGradeSecuredEnumId <em>Grade Secured Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewDate <em>Job Interview Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewResult <em>Job Interview Result</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewTypeId <em>Job Interview Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobIntervieweePartyId <em>Job Interviewee Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewerPartyId <em>Job Interviewer Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview()
 * @model annotation="mimo-ent-frame title='Entity for storing data about Interviews conducted'"
 * @generated
 */
public interface JobInterview extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Grade Secured Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade Secured Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Secured Enum Id</em>' reference.
	 * @see #setGradeSecuredEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_GradeSecuredEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getGradeSecuredEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getGradeSecuredEnumId <em>Grade Secured Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Secured Enum Id</em>' reference.
	 * @see #getGradeSecuredEnumId()
	 * @generated
	 */
	void setGradeSecuredEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Job Interview Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Date</em>' attribute.
	 * @see #setJobInterviewDate(Date)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewDate()
	 * @model
	 * @generated
	 */
	Date getJobInterviewDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewDate <em>Job Interview Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Date</em>' attribute.
	 * @see #getJobInterviewDate()
	 * @generated
	 */
	void setJobInterviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Job Interview Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Id</em>' attribute.
	 * @see #setJobInterviewId(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getJobInterviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewId <em>Job Interview Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Id</em>' attribute.
	 * @see #getJobInterviewId()
	 * @generated
	 */
	void setJobInterviewId(String value);

	/**
	 * Returns the value of the '<em><b>Job Interview Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Result</em>' attribute.
	 * @see #setJobInterviewResult(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewResult()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getJobInterviewResult();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewResult <em>Job Interview Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Result</em>' attribute.
	 * @see #getJobInterviewResult()
	 * @generated
	 */
	void setJobInterviewResult(String value);

	/**
	 * Returns the value of the '<em><b>Job Interview Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Type Id</em>' reference.
	 * @see #setJobInterviewTypeId(JobInterviewType)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewTypeId()
	 * @model keys="jobInterviewTypeId"
	 * @generated
	 */
	JobInterviewType getJobInterviewTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewTypeId <em>Job Interview Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Type Id</em>' reference.
	 * @see #getJobInterviewTypeId()
	 * @generated
	 */
	void setJobInterviewTypeId(JobInterviewType value);

	/**
	 * Returns the value of the '<em><b>Job Interviewee Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interviewee Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interviewee Party Id</em>' reference.
	 * @see #setJobIntervieweePartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobIntervieweePartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getJobIntervieweePartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobIntervieweePartyId <em>Job Interviewee Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interviewee Party Id</em>' reference.
	 * @see #getJobIntervieweePartyId()
	 * @generated
	 */
	void setJobIntervieweePartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Job Interviewer Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interviewer Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interviewer Party Id</em>' reference.
	 * @see #setJobInterviewerPartyId(Party)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewerPartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getJobInterviewerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewerPartyId <em>Job Interviewer Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interviewer Party Id</em>' reference.
	 * @see #getJobInterviewerPartyId()
	 * @generated
	 */
	void setJobInterviewerPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Job Requisition Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Requisition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Requisition Id</em>' reference.
	 * @see #setJobRequisitionId(JobRequisition)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobRequisitionId()
	 * @model keys="jobRequisitionId"
	 * @generated
	 */
	JobRequisition getJobRequisitionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobRequisitionId <em>Job Requisition Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition Id</em>' reference.
	 * @see #getJobRequisitionId()
	 * @generated
	 */
	void setJobRequisitionId(JobRequisition value);

} // JobInterview
