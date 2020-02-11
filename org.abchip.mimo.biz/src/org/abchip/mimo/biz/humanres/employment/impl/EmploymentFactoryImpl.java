/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment.impl;

import org.abchip.mimo.biz.humanres.employment.*;
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
public class EmploymentFactoryImpl extends EFactoryImpl implements EmploymentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmploymentFactory init() {
		try {
			EmploymentFactory theEmploymentFactory = (EmploymentFactory)EPackage.Registry.INSTANCE.getEFactory(EmploymentPackage.eNS_URI);
			if (theEmploymentFactory != null) {
				return theEmploymentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmploymentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmploymentFactoryImpl() {
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
			case EmploymentPackage.BENEFIT_TYPE: return (EObject)createBenefitType();
			case EmploymentPackage.EMPL_LEAVE: return (EObject)createEmplLeave();
			case EmploymentPackage.EMPL_LEAVE_REASON_TYPE: return (EObject)createEmplLeaveReasonType();
			case EmploymentPackage.EMPL_LEAVE_TYPE: return (EObject)createEmplLeaveType();
			case EmploymentPackage.EMPLOYMENT: return (EObject)createEmployment();
			case EmploymentPackage.EMPLOYMENT_APP: return (EObject)createEmploymentApp();
			case EmploymentPackage.EMPLOYMENT_APP_SOURCE_TYPE: return (EObject)createEmploymentAppSourceType();
			case EmploymentPackage.PARTY_BENEFIT: return (EObject)createPartyBenefit();
			case EmploymentPackage.PAY_GRADE: return (EObject)createPayGrade();
			case EmploymentPackage.PAY_HISTORY: return (EObject)createPayHistory();
			case EmploymentPackage.PAYROLL_PREFERENCE: return (EObject)createPayrollPreference();
			case EmploymentPackage.SALARY_STEP: return (EObject)createSalaryStep();
			case EmploymentPackage.TERMINATION_REASON: return (EObject)createTerminationReason();
			case EmploymentPackage.TERMINATION_TYPE: return (EObject)createTerminationType();
			case EmploymentPackage.UNEMPLOYMENT_CLAIM: return (EObject)createUnemploymentClaim();
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
	public BenefitType createBenefitType() {
		BenefitTypeImpl benefitType = new BenefitTypeImpl();
		return benefitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeave createEmplLeave() {
		EmplLeaveImpl emplLeave = new EmplLeaveImpl();
		return emplLeave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeaveReasonType createEmplLeaveReasonType() {
		EmplLeaveReasonTypeImpl emplLeaveReasonType = new EmplLeaveReasonTypeImpl();
		return emplLeaveReasonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmplLeaveType createEmplLeaveType() {
		EmplLeaveTypeImpl emplLeaveType = new EmplLeaveTypeImpl();
		return emplLeaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employment createEmployment() {
		EmploymentImpl employment = new EmploymentImpl();
		return employment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmploymentApp createEmploymentApp() {
		EmploymentAppImpl employmentApp = new EmploymentAppImpl();
		return employmentApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmploymentAppSourceType createEmploymentAppSourceType() {
		EmploymentAppSourceTypeImpl employmentAppSourceType = new EmploymentAppSourceTypeImpl();
		return employmentAppSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyBenefit createPartyBenefit() {
		PartyBenefitImpl partyBenefit = new PartyBenefitImpl();
		return partyBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayGrade createPayGrade() {
		PayGradeImpl payGrade = new PayGradeImpl();
		return payGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayHistory createPayHistory() {
		PayHistoryImpl payHistory = new PayHistoryImpl();
		return payHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PayrollPreference createPayrollPreference() {
		PayrollPreferenceImpl payrollPreference = new PayrollPreferenceImpl();
		return payrollPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SalaryStep createSalaryStep() {
		SalaryStepImpl salaryStep = new SalaryStepImpl();
		return salaryStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationReason createTerminationReason() {
		TerminationReasonImpl terminationReason = new TerminationReasonImpl();
		return terminationReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TerminationType createTerminationType() {
		TerminationTypeImpl terminationType = new TerminationTypeImpl();
		return terminationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnemploymentClaim createUnemploymentClaim() {
		UnemploymentClaimImpl unemploymentClaim = new UnemploymentClaimImpl();
		return unemploymentClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmploymentPackage getEmploymentPackage() {
		return (EmploymentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmploymentPackage getPackage() {
		return EmploymentPackage.eINSTANCE;
	}

} //EmploymentFactoryImpl
