/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment;

import java.util.Date;

import org.abchip.mimo.biz.BizEntityTyped;

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
 * @model
 * @generated
 */
public interface JobInterview extends BizEntityTyped<JobInterviewType> {
	/**
	 * Returns the value of the '<em><b>Grade Secured Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grade Secured Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade Secured Enum Id</em>' attribute.
	 * @see #setGradeSecuredEnumId(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_GradeSecuredEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getGradeSecuredEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getGradeSecuredEnumId <em>Grade Secured Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grade Secured Enum Id</em>' attribute.
	 * @see #getGradeSecuredEnumId()
	 * @generated
	 */
	void setGradeSecuredEnumId(String value);

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
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
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
	 * @model
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
	 * Returns the value of the '<em><b>Job Interview Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interview Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interview Type Id</em>' attribute.
	 * @see #setJobInterviewTypeId(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewTypeId()
	 * @model annotation="mimo-ent-domain frame='JobInterviewType'"
	 * @generated
	 */
	String getJobInterviewTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewTypeId <em>Job Interview Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Type Id</em>' attribute.
	 * @see #getJobInterviewTypeId()
	 * @generated
	 */
	void setJobInterviewTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Job Interviewee Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interviewee Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interviewee Party Id</em>' attribute.
	 * @see #setJobIntervieweePartyId(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobIntervieweePartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getJobIntervieweePartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobIntervieweePartyId <em>Job Interviewee Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interviewee Party Id</em>' attribute.
	 * @see #getJobIntervieweePartyId()
	 * @generated
	 */
	void setJobIntervieweePartyId(String value);

	/**
	 * Returns the value of the '<em><b>Job Interviewer Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Interviewer Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Interviewer Party Id</em>' attribute.
	 * @see #setJobInterviewerPartyId(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobInterviewerPartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getJobInterviewerPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobInterviewerPartyId <em>Job Interviewer Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interviewer Party Id</em>' attribute.
	 * @see #getJobInterviewerPartyId()
	 * @generated
	 */
	void setJobInterviewerPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Job Requisition Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Requisition Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Requisition Id</em>' attribute.
	 * @see #setJobRequisitionId(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterview_JobRequisitionId()
	 * @model annotation="mimo-ent-domain frame='JobRequisition'"
	 * @generated
	 */
	String getJobRequisitionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterview#getJobRequisitionId <em>Job Requisition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition Id</em>' attribute.
	 * @see #getJobRequisitionId()
	 * @generated
	 */
	void setJobRequisitionId(String value);

} // JobInterview
