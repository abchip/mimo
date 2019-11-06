/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment.impl;

import java.util.List;

import org.abchip.mimo.biz.humanres.recruitment.JobInterview;
import org.abchip.mimo.biz.humanres.recruitment.JobInterviewType;
import org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Interview Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewTypeImpl#getJobInterviewTypeId <em>Job Interview Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.impl.JobInterviewTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobInterviewTypeImpl extends BizEntityTypeImpl<JobInterview> implements JobInterviewType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobInterviewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecruitmentPackage.Literals.JOB_INTERVIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
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
		jobInterviewTypeId = newJobInterviewTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__JOB_INTERVIEW_TYPE_ID:
				return getJobInterviewTypeId();
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__DESCRIPTION:
				return getDescription();
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
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__JOB_INTERVIEW_TYPE_ID:
				setJobInterviewTypeId((String)newValue);
				return;
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__JOB_INTERVIEW_TYPE_ID:
				setJobInterviewTypeId(JOB_INTERVIEW_TYPE_ID_EDEFAULT);
				return;
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__JOB_INTERVIEW_TYPE_ID:
				return JOB_INTERVIEW_TYPE_ID_EDEFAULT == null ? jobInterviewTypeId != null : !JOB_INTERVIEW_TYPE_ID_EDEFAULT.equals(jobInterviewTypeId);
			case RecruitmentPackage.JOB_INTERVIEW_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (jobInterviewTypeId: ");
		result.append(jobInterviewTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //JobInterviewTypeImpl
