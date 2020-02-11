/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.humanres.recruitment.RecruitmentPackage
 * @generated
 */
public interface RecruitmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecruitmentFactory eINSTANCE = org.abchip.mimo.biz.humanres.recruitment.impl.RecruitmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job Interview</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Interview</em>'.
	 * @generated
	 */
	JobInterview createJobInterview();

	/**
	 * Returns a new object of class '<em>Job Interview Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Interview Type</em>'.
	 * @generated
	 */
	JobInterviewType createJobInterviewType();

	/**
	 * Returns a new object of class '<em>Job Requisition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Requisition</em>'.
	 * @generated
	 */
	JobRequisition createJobRequisition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RecruitmentPackage getRecruitmentPackage();

} //RecruitmentFactory
