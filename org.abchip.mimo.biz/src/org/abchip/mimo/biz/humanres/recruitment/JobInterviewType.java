/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Interview Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterviewType#getJobInterviewTypeId <em>Job Interview Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.recruitment.JobInterviewType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterviewType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface JobInterviewType extends BizEntityType<JobInterview> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterviewType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterviewType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='JobInterview' route='jobInterviewTypeId'"
	 * @generated
	 */
	List<String> jobInterviews();

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
	 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage#getJobInterviewType_JobInterviewTypeId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getJobInterviewTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.humanres.recruitment.JobInterviewType#getJobInterviewTypeId <em>Job Interview Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Interview Type Id</em>' attribute.
	 * @see #getJobInterviewTypeId()
	 * @generated
	 */
	void setJobInterviewTypeId(String value);

} // JobInterviewType
