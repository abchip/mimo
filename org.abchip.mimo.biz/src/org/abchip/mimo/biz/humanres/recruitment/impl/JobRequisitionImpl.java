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

import org.abchip.mimo.biz.humanres.recruitment.JobRequisition;
import org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getExamTypeEnumId <em>Exam Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getExperienceMonths <em>Experience Months</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getExperienceYears <em>Experience Years</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#isGender <em>Gender</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getJobLocation <em>Job Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getJobPostingTypeEnumId <em>Job Posting Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getJobRequisitionDate <em>Job Requisition Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getNoOfResources <em>No Of Resources</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getRequiredOnDate <em>Required On Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobRequisitionImpl#getSkillTypeId <em>Skill Type Id</em>}</li>
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
	 * The default value of the '{@link #getExamTypeEnumId() <em>Exam Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAM_TYPE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExamTypeEnumId() <em>Exam Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String examTypeEnumId = EXAM_TYPE_ENUM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getJobPostingTypeEnumId() <em>Job Posting Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPostingTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_POSTING_TYPE_ENUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobPostingTypeEnumId() <em>Job Posting Type Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPostingTypeEnumId()
	 * @generated
	 * @ordered
	 */
	protected String jobPostingTypeEnumId = JOB_POSTING_TYPE_ENUM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSkillTypeId() <em>Skill Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SKILL_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkillTypeId() <em>Skill Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkillTypeId()
	 * @generated
	 * @ordered
	 */
	protected String skillTypeId = SKILL_TYPE_ID_EDEFAULT;

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
		long oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__AGE, oldAge, age));
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
		long oldDurationMonths = durationMonths;
		durationMonths = newDurationMonths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__DURATION_MONTHS, oldDurationMonths, durationMonths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExamTypeEnumId() {
		return examTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExamTypeEnumId(String newExamTypeEnumId) {
		String oldExamTypeEnumId = examTypeEnumId;
		examTypeEnumId = newExamTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID, oldExamTypeEnumId, examTypeEnumId));
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
		long oldExperienceMonths = experienceMonths;
		experienceMonths = newExperienceMonths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_MONTHS, oldExperienceMonths, experienceMonths));
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
		long oldExperienceYears = experienceYears;
		experienceYears = newExperienceYears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_YEARS, oldExperienceYears, experienceYears));
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
		boolean oldGender = gender;
		gender = newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__GENDER, oldGender, gender));
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
		String oldJobLocation = jobLocation;
		jobLocation = newJobLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__JOB_LOCATION, oldJobLocation, jobLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobPostingTypeEnumId() {
		return jobPostingTypeEnumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobPostingTypeEnumId(String newJobPostingTypeEnumId) {
		String oldJobPostingTypeEnumId = jobPostingTypeEnumId;
		jobPostingTypeEnumId = newJobPostingTypeEnumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID, oldJobPostingTypeEnumId, jobPostingTypeEnumId));
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
		Date oldJobRequisitionDate = jobRequisitionDate;
		jobRequisitionDate = newJobRequisitionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_DATE, oldJobRequisitionDate, jobRequisitionDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_ID, oldJobRequisitionId, jobRequisitionId));
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
		long oldNoOfResources = noOfResources;
		noOfResources = newNoOfResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__NO_OF_RESOURCES, oldNoOfResources, noOfResources));
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
		String oldQualification = qualification;
		qualification = newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__QUALIFICATION, oldQualification, qualification));
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
		Date oldRequiredOnDate = requiredOnDate;
		requiredOnDate = newRequiredOnDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__REQUIRED_ON_DATE, oldRequiredOnDate, requiredOnDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSkillTypeId() {
		return skillTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSkillTypeId(String newSkillTypeId) {
		String oldSkillTypeId = skillTypeId;
		skillTypeId = newSkillTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RecruitmentPackage.JOB_REQUISITION__SKILL_TYPE_ID, oldSkillTypeId, skillTypeId));
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
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				return getExamTypeEnumId();
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_MONTHS:
				return getExperienceMonths();
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_YEARS:
				return getExperienceYears();
			case RecruitmentPackage.JOB_REQUISITION__GENDER:
				return isGender();
			case RecruitmentPackage.JOB_REQUISITION__JOB_LOCATION:
				return getJobLocation();
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				return getJobPostingTypeEnumId();
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_DATE:
				return getJobRequisitionDate();
			case RecruitmentPackage.JOB_REQUISITION__NO_OF_RESOURCES:
				return getNoOfResources();
			case RecruitmentPackage.JOB_REQUISITION__QUALIFICATION:
				return getQualification();
			case RecruitmentPackage.JOB_REQUISITION__REQUIRED_ON_DATE:
				return getRequiredOnDate();
			case RecruitmentPackage.JOB_REQUISITION__SKILL_TYPE_ID:
				return getSkillTypeId();
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
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				setExamTypeEnumId((String)newValue);
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
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				setJobPostingTypeEnumId((String)newValue);
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
				setSkillTypeId((String)newValue);
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
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				setExamTypeEnumId(EXAM_TYPE_ENUM_ID_EDEFAULT);
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
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				setJobPostingTypeEnumId(JOB_POSTING_TYPE_ENUM_ID_EDEFAULT);
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
				setSkillTypeId(SKILL_TYPE_ID_EDEFAULT);
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
			case RecruitmentPackage.JOB_REQUISITION__EXAM_TYPE_ENUM_ID:
				return EXAM_TYPE_ENUM_ID_EDEFAULT == null ? examTypeEnumId != null : !EXAM_TYPE_ENUM_ID_EDEFAULT.equals(examTypeEnumId);
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_MONTHS:
				return experienceMonths != EXPERIENCE_MONTHS_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__EXPERIENCE_YEARS:
				return experienceYears != EXPERIENCE_YEARS_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__GENDER:
				return gender != GENDER_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__JOB_LOCATION:
				return JOB_LOCATION_EDEFAULT == null ? jobLocation != null : !JOB_LOCATION_EDEFAULT.equals(jobLocation);
			case RecruitmentPackage.JOB_REQUISITION__JOB_POSTING_TYPE_ENUM_ID:
				return JOB_POSTING_TYPE_ENUM_ID_EDEFAULT == null ? jobPostingTypeEnumId != null : !JOB_POSTING_TYPE_ENUM_ID_EDEFAULT.equals(jobPostingTypeEnumId);
			case RecruitmentPackage.JOB_REQUISITION__JOB_REQUISITION_DATE:
				return JOB_REQUISITION_DATE_EDEFAULT == null ? jobRequisitionDate != null : !JOB_REQUISITION_DATE_EDEFAULT.equals(jobRequisitionDate);
			case RecruitmentPackage.JOB_REQUISITION__NO_OF_RESOURCES:
				return noOfResources != NO_OF_RESOURCES_EDEFAULT;
			case RecruitmentPackage.JOB_REQUISITION__QUALIFICATION:
				return QUALIFICATION_EDEFAULT == null ? qualification != null : !QUALIFICATION_EDEFAULT.equals(qualification);
			case RecruitmentPackage.JOB_REQUISITION__REQUIRED_ON_DATE:
				return REQUIRED_ON_DATE_EDEFAULT == null ? requiredOnDate != null : !REQUIRED_ON_DATE_EDEFAULT.equals(requiredOnDate);
			case RecruitmentPackage.JOB_REQUISITION__SKILL_TYPE_ID:
				return SKILL_TYPE_ID_EDEFAULT == null ? skillTypeId != null : !SKILL_TYPE_ID_EDEFAULT.equals(skillTypeId);
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
		result.append(", examTypeEnumId: ");
		result.append(examTypeEnumId);
		result.append(", experienceMonths: ");
		result.append(experienceMonths);
		result.append(", experienceYears: ");
		result.append(experienceYears);
		result.append(", gender: ");
		result.append(gender);
		result.append(", jobLocation: ");
		result.append(jobLocation);
		result.append(", jobPostingTypeEnumId: ");
		result.append(jobPostingTypeEnumId);
		result.append(", jobRequisitionDate: ");
		result.append(jobRequisitionDate);
		result.append(", noOfResources: ");
		result.append(noOfResources);
		result.append(", qualification: ");
		result.append(qualification);
		result.append(", requiredOnDate: ");
		result.append(requiredOnDate);
		result.append(", skillTypeId: ");
		result.append(skillTypeId);
		result.append(')');
		return result.toString();
	}

} //JobRequisitionImpl
