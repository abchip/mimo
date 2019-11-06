/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment.impl;

import java.util.Date;

import java.util.List;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.humanres.ability.SkillType;
import org.abchip.mimo.biz.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Requisition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getJobRequisitionId <em>Job Requisition Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getDurationMonths <em>Duration Months</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getExperienceMonths <em>Experience Months</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getExperienceYears <em>Experience Years</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#isGender <em>Gender</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getJobLocation <em>Job Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getJobRequisitionDate <em>Job Requisition Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getNoOfResources <em>No Of Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getRequiredOnDate <em>Required On Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getSkillTypeId <em>Skill Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getExamTypeEnumId <em>Exam Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getJobPostingTypeEnumId <em>Job Posting Type Enum Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobRequisitionImpl extends BizEntityImpl implements JobRequisition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final long AGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected long age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationMonths() <em>Duration Months</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMonths()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_MONTHS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDurationMonths() <em>Duration Months</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationMonths()
	 * @generated
	 * @ordered
	 */
	protected long durationMonths = DURATION_MONTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExperienceMonths() <em>Experience Months</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceMonths()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPERIENCE_MONTHS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExperienceMonths() <em>Experience Months</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceMonths()
	 * @generated
	 * @ordered
	 */
	protected long experienceMonths = EXPERIENCE_MONTHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExperienceYears() <em>Experience Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceYears()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPERIENCE_YEARS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExperienceYears() <em>Experience Years</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperienceYears()
	 * @generated
	 * @ordered
	 */
	protected long experienceYears = EXPERIENCE_YEARS_EDEFAULT;

	/**
	 * The default value of the '{@link #isGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGender()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGender()
	 * @generated
	 * @ordered
	 */
	protected boolean gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobLocation() <em>Job Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobLocation() <em>Job Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobLocation()
	 * @generated
	 * @ordered
	 */
	protected String jobLocation = JOB_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobRequisitionDate() <em>Job Requisition Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRequisitionDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date JOB_REQUISITION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobRequisitionDate() <em>Job Requisition Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRequisitionDate()
	 * @generated
	 * @ordered
	 */
	protected Date jobRequisitionDate = JOB_REQUISITION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoOfResources() <em>No Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfResources()
	 * @generated
	 * @ordered
	 */
	protected static final long NO_OF_RESOURCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNoOfResources() <em>No Of Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOfResources()
	 * @generated
	 * @ordered
	 */
	protected long noOfResources = NO_OF_RESOURCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected String qualification = QUALIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredOnDate() <em>Required On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredOnDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REQUIRED_ON_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredOnDate() <em>Required On Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredOnDate()
	 * @generated
	 * @ordered
	 */
	protected Date requiredOnDate = REQUIRED_ON_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSkillTypeId() <em>Skill Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillTypeId()
	 * @generated
	 * @ordered
	 */
	protected SkillType skillTypeId;

	/**
	 * The cached value of the '{@link #getExamTypeEnumId() <em>Exam Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration examTypeEnumId;

	/**
	 * The cached value of the '{@link #getJobPostingTypeEnumId() <em>Job Posting Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPostingTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected Enumeration jobPostingTypeEnumId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobRequisitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecruitmentPackage.Literals.JOB_REQUISITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(long newAge) {
		age = newAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDurationMonths() {
		return durationMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDurationMonths(long newDurationMonths) {
		durationMonths = newDurationMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getExamTypeEnumId() {
		if (examTypeEnumId != null && ((EObject)examTypeEnumId).eIsProxy()) {
			InternalEObject oldExamTypeEnumId = (InternalEObject)examTypeEnumId;
			examTypeEnumId = (Enumeration)eResolveProxy(oldExamTypeEnumId);
			if (examTypeEnumId != oldExamTypeEnumId) {
			}
		}
		return examTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetExamTypeEnumId() {
		return examTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExamTypeEnumId(Enumeration newExamTypeEnumId) {
		examTypeEnumId = newExamTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExperienceMonths() {
		return experienceMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperienceMonths(long newExperienceMonths) {
		experienceMonths = newExperienceMonths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExperienceYears() {
		return experienceYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperienceYears(long newExperienceYears) {
		experienceYears = newExperienceYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGender(boolean newGender) {
		gender = newGender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobLocation() {
		return jobLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobLocation(String newJobLocation) {
		jobLocation = newJobLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getJobPostingTypeEnumId() {
		if (jobPostingTypeEnumId != null && ((EObject)jobPostingTypeEnumId).eIsProxy()) {
			InternalEObject oldJobPostingTypeEnumId = (InternalEObject)jobPostingTypeEnumId;
			jobPostingTypeEnumId = (Enumeration)eResolveProxy(oldJobPostingTypeEnumId);
			if (jobPostingTypeEnumId != oldJobPostingTypeEnumId) {
			}
		}
		return jobPostingTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetJobPostingTypeEnumId() {
		return jobPostingTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobPostingTypeEnumId(Enumeration newJobPostingTypeEnumId) {
		jobPostingTypeEnumId = newJobPostingTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getJobRequisitionDate() {
		return jobRequisitionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRequisitionDate(Date newJobRequisitionDate) {
		jobRequisitionDate = newJobRequisitionDate;
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
		jobRequisitionId = newJobRequisitionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNoOfResources() {
		return noOfResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoOfResources(long newNoOfResources) {
		noOfResources = newNoOfResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualification(String newQualification) {
		qualification = newQualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getRequiredOnDate() {
		return requiredOnDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredOnDate(Date newRequiredOnDate) {
		requiredOnDate = newRequiredOnDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillType getSkillTypeId() {
		if (skillTypeId != null && ((EObject)skillTypeId).eIsProxy()) {
			InternalEObject oldSkillTypeId = (InternalEObject)skillTypeId;
			skillTypeId = (SkillType)eResolveProxy(oldSkillTypeId);
			if (skillTypeId != oldSkillTypeId) {
			}
		}
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillType basicGetSkillTypeId() {
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillTypeId(SkillType newSkillTypeId) {
		skillTypeId = newSkillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> employmentApps() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> jobInterviews() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_ID:
				return getJobRequisitionId();
			case RecruitmentPackage.JOB_REQUISITION__AGE:
				return getAge();
			case RecruitmentPackage.JOB_REQUISITION__DURATION_MONTHS:
				return getDurationMonths();
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_MONTHS:
				return getExperienceMonths();
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_YEARS:
				return getExperienceYears();
			case RecruitmentPackage.JOB_REQUISITION__GENDER:
				return isGender();
			case RecruitmentPackage.JOB_REQUISITION__JOB_LOCATION:
				return getJobLocation();
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_DATE:
				return getJobRequisitionDate();
			case RecruitmentPackage.JOB_REQUISITION__NO_OF_RESOURCES:
				return getNoOfResources();
			case RecruitmentPackage.JOB_REQUISITION__QUALIFICATION:
				return getQualification();
			case RecruitmentPackage.JOB_REQUISITION__REQUIRED_ON_DATE:
				return getRequiredOnDate();
			case RecruitmentPackage.JOB_REQUISITION__SKILL_TYPE_ID:
				if (resolve) return getSkillTypeId();
				return basicGetSkillTypeId();
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				if (resolve) return getExamTypeEnumId();
				return basicGetExamTypeEnumId();
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				if (resolve) return getJobPostingTypeEnumId();
				return basicGetJobPostingTypeEnumId();
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
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_ID:
				setJobRequisitionId((String)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__AGE:
				setAge((Long)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__DURATION_MONTHS:
				setDurationMonths((Long)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_MONTHS:
				setExperienceMonths((Long)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_YEARS:
				setExperienceYears((Long)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__GENDER:
				setGender((Boolean)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__JOB_LOCATION:
				setJobLocation((String)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_DATE:
				setJobRequisitionDate((Date)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__NO_OF_RESOURCES:
				setNoOfResources((Long)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__QUALIFICATION:
				setQualification((String)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__REQUIRED_ON_DATE:
				setRequiredOnDate((Date)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				setExamTypeEnumId((Enumeration)newValue);
				return;
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				setJobPostingTypeEnumId((Enumeration)newValue);
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
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_ID:
				setJobRequisitionId(JOB_REQUISITION_ID_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__DURATION_MONTHS:
				setDurationMonths(DURATION_MONTHS_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_MONTHS:
				setExperienceMonths(EXPERIENCE_MONTHS_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_YEARS:
				setExperienceYears(EXPERIENCE_YEARS_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__JOB_LOCATION:
				setJobLocation(JOB_LOCATION_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_DATE:
				setJobRequisitionDate(JOB_REQUISITION_DATE_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__NO_OF_RESOURCES:
				setNoOfResources(NO_OF_RESOURCES_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__QUALIFICATION:
				setQualification(QUALIFICATION_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__REQUIRED_ON_DATE:
				setRequiredOnDate(REQUIRED_ON_DATE_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_REQUISITION__SKILL_TYPE_ID:
				setSkillTypeId((SkillType)null);
				return;
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				setExamTypeEnumId((Enumeration)null);
				return;
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				setJobPostingTypeEnumId((Enumeration)null);
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
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_ID:
				return JOB_REQUISITION_ID_EDEFAULT == null ? jobRequisitionId != null : !JOB_REQUISITION_ID_EDEFAULT.equals(jobRequisitionId);
			case RecruitmentPackage.JOB_REQUISITION__AGE:
				return age != AGE_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__DURATION_MONTHS:
				return durationMonths != DURATION_MONTHS_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_MONTHS:
				return experienceMonths != EXPERIENCE_MONTHS_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_YEARS:
				return experienceYears != EXPERIENCE_YEARS_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__GENDER:
				return gender != GENDER_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__JOB_LOCATION:
				return JOB_LOCATION_EDEFAULT == null ? jobLocation != null : !JOB_LOCATION_EDEFAULT.equals(jobLocation);
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_DATE:
				return JOB_REQUISITION_DATE_EDEFAULT == null ? jobRequisitionDate != null : !JOB_REQUISITION_DATE_EDEFAULT.equals(jobRequisitionDate);
			case RecruitmentPackage.JOB_REQUISITION__NO_OF_RESOURCES:
				return noOfResources != NO_OF_RESOURCES_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__QUALIFICATION:
				return QUALIFICATION_EDEFAULT == null ? qualification != null : !QUALIFICATION_EDEFAULT.equals(qualification);
			case RecruitmentPackage.JOB_REQUISITION__REQUIRED_ON_DATE:
				return REQUIRED_ON_DATE_EDEFAULT == null ? requiredOnDate != null : !REQUIRED_ON_DATE_EDEFAULT.equals(requiredOnDate);
			case RecruitmentPackage.JOB_REQUISITION__SKILL_TYPE_ID:
				return skillTypeId != null;
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				return examTypeEnumId != null;
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				return jobPostingTypeEnumId != null;
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
		result.append(" (jobRequisitionId: ");
		result.append(jobRequisitionId);
		result.append(", age: ");
		result.append(age);
		result.append(", durationMonths: ");
		result.append(durationMonths);
		result.append(", experienceMonths: ");
		result.append(experienceMonths);
		result.append(", experienceYears: ");
		result.append(experienceYears);
		result.append(", gender: ");
		result.append(gender);
		result.append(", jobLocation: ");
		result.append(jobLocation);
		result.append(", jobRequisitionDate: ");
		result.append(jobRequisitionDate);
		result.append(", noOfResources: ");
		result.append(noOfResources);
		result.append(", qualification: ");
		result.append(qualification);
		result.append(", requiredOnDate: ");
		result.append(requiredOnDate);
		result.append(')');
		return result.toString();
	}

} //JobRequisitionImpl
