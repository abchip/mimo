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
import org.abchip.mimo.biz.common.Gender;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.humanres.ability.SkillType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Requisition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getAge <em>Age</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getDurationMonths <em>Duration Months</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getExamTypeEnumId <em>Exam Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getExperienceMonths <em>Experience Months</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getExperienceYears <em>Experience Years</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getGender <em>Gender</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobLocation <em>Job Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobPostingTypeEnumId <em>Job Posting Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobRequisitionDate <em>Job Requisition Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getNoOfResources <em>No Of Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getRequiredOnDate <em>Required On Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getSkillTypeId <em>Skill Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition()
 * @model annotation="mimo-ent-frame title='Entity for storing data about recruitment'"
 * @generated
 */
public interface JobRequisition extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(long)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_Age()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getAge();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(long value);

	/**
	 * Returns the value of the '<em><b>Duration Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Months</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Months</em>' attribute.
	 * @see #setDurationMonths(long)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_DurationMonths()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getDurationMonths();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getDurationMonths <em>Duration Months</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Months</em>' attribute.
	 * @see #getDurationMonths()
	 * @generated
	 */
	void setDurationMonths(long value);

	/**
	 * Returns the value of the '<em><b>Exam Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Type Enum Id</em>' reference.
	 * @see #setExamTypeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_ExamTypeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getExamTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getExamTypeEnumId <em>Exam Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exam Type Enum Id</em>' reference.
	 * @see #getExamTypeEnumId()
	 * @generated
	 */
	void setExamTypeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Experience Months</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experience Months</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experience Months</em>' attribute.
	 * @see #setExperienceMonths(long)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_ExperienceMonths()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getExperienceMonths();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getExperienceMonths <em>Experience Months</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience Months</em>' attribute.
	 * @see #getExperienceMonths()
	 * @generated
	 */
	void setExperienceMonths(long value);

	/**
	 * Returns the value of the '<em><b>Experience Years</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experience Years</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experience Years</em>' attribute.
	 * @see #setExperienceYears(long)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_ExperienceYears()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getExperienceYears();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getExperienceYears <em>Experience Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experience Years</em>' attribute.
	 * @see #getExperienceYears()
	 * @generated
	 */
	void setExperienceYears(long value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.biz.common.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see org.abchip.mimo.biz.common.Gender
	 * @see #setGender(Gender)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see org.abchip.mimo.biz.common.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

	/**
	 * Returns the value of the '<em><b>Job Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Location</em>' attribute.
	 * @see #setJobLocation(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_JobLocation()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getJobLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobLocation <em>Job Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Location</em>' attribute.
	 * @see #getJobLocation()
	 * @generated
	 */
	void setJobLocation(String value);

	/**
	 * Returns the value of the '<em><b>Job Posting Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Posting Type Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Posting Type Enum Id</em>' reference.
	 * @see #setJobPostingTypeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_JobPostingTypeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getJobPostingTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobPostingTypeEnumId <em>Job Posting Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Posting Type Enum Id</em>' reference.
	 * @see #getJobPostingTypeEnumId()
	 * @generated
	 */
	void setJobPostingTypeEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Job Requisition Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Requisition Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Requisition Date</em>' attribute.
	 * @see #setJobRequisitionDate(Date)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_JobRequisitionDate()
	 * @model
	 * @generated
	 */
	Date getJobRequisitionDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobRequisitionDate <em>Job Requisition Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition Date</em>' attribute.
	 * @see #getJobRequisitionDate()
	 * @generated
	 */
	void setJobRequisitionDate(Date value);

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
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_JobRequisitionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getJobRequisitionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getJobRequisitionId <em>Job Requisition Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Requisition Id</em>' attribute.
	 * @see #getJobRequisitionId()
	 * @generated
	 */
	void setJobRequisitionId(String value);

	/**
	 * Returns the value of the '<em><b>No Of Resources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Of Resources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Of Resources</em>' attribute.
	 * @see #setNoOfResources(long)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_NoOfResources()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNoOfResources();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getNoOfResources <em>No Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Of Resources</em>' attribute.
	 * @see #getNoOfResources()
	 * @generated
	 */
	void setNoOfResources(long value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see #setQualification(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_Qualification()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getQualification();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(String value);

	/**
	 * Returns the value of the '<em><b>Required On Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required On Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required On Date</em>' attribute.
	 * @see #setRequiredOnDate(Date)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_RequiredOnDate()
	 * @model
	 * @generated
	 */
	Date getRequiredOnDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getRequiredOnDate <em>Required On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required On Date</em>' attribute.
	 * @see #getRequiredOnDate()
	 * @generated
	 */
	void setRequiredOnDate(Date value);

	/**
	 * Returns the value of the '<em><b>Skill Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Type Id</em>' reference.
	 * @see #setSkillTypeId(SkillType)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobRequisition_SkillTypeId()
	 * @model keys="skillTypeId"
	 * @generated
	 */
	SkillType getSkillTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobRequisition#getSkillTypeId <em>Skill Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Type Id</em>' reference.
	 * @see #getSkillTypeId()
	 * @generated
	 */
	void setSkillTypeId(SkillType value);

} // JobRequisition
