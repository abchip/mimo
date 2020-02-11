/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.recruitment.impl;

import org.abchip.mimo.biz.humanres.recruitment.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecruitmentFactoryImpl extends EFactoryImpl implements RecruitmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecruitmentFactory init() {
		try {
			RecruitmentFactory theRecruitmentFactory = (RecruitmentFactory)EPackage.Registry.INSTANCE.getEFactory(RecruitmentPackage.eNS_URI);
			if (theRecruitmentFactory != null) {
				return theRecruitmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecruitmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecruitmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RecruitmentPackage.JOB_INTERVIEW: return (EObject)createJobInterview();
			case RecruitmentPackage.JOB_INTERVIEW_TYPE: return (EObject)createJobInterviewType();
			case RecruitmentPackage.JOB_REQUISITION: return (EObject)createJobRequisition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobInterview createJobInterview() {
		JobInterviewImpl jobInterview = new JobInterviewImpl();
		return jobInterview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobInterviewType createJobInterviewType() {
		JobInterviewTypeImpl jobInterviewType = new JobInterviewTypeImpl();
		return jobInterviewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobRequisition createJobRequisition() {
		JobRequisitionImpl jobRequisition = new JobRequisitionImpl();
		return jobRequisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecruitmentPackage getRecruitmentPackage() {
		return (RecruitmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecruitmentPackage getPackage() {
		return RecruitmentPackage.eINSTANCE;
	}

} //RecruitmentFactoryImpl
