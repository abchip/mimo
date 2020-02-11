/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.employment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.humanres.employment.EmploymentPackage
 * @generated
 */
public interface EmploymentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmploymentFactory eINSTANCE = org.abchip.mimo.biz.humanres.employment.impl.EmploymentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Benefit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Benefit Type</em>'.
	 * @generated
	 */
	BenefitType createBenefitType();

	/**
	 * Returns a new object of class '<em>Empl Leave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Leave</em>'.
	 * @generated
	 */
	EmplLeave createEmplLeave();

	/**
	 * Returns a new object of class '<em>Empl Leave Reason Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Leave Reason Type</em>'.
	 * @generated
	 */
	EmplLeaveReasonType createEmplLeaveReasonType();

	/**
	 * Returns a new object of class '<em>Empl Leave Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Leave Type</em>'.
	 * @generated
	 */
	EmplLeaveType createEmplLeaveType();

	/**
	 * Returns a new object of class '<em>Employment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employment</em>'.
	 * @generated
	 */
	Employment createEmployment();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	EmploymentApp createEmploymentApp();

	/**
	 * Returns a new object of class '<em>App Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Source Type</em>'.
	 * @generated
	 */
	EmploymentAppSourceType createEmploymentAppSourceType();

	/**
	 * Returns a new object of class '<em>Party Benefit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party Benefit</em>'.
	 * @generated
	 */
	PartyBenefit createPartyBenefit();

	/**
	 * Returns a new object of class '<em>Pay Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pay Grade</em>'.
	 * @generated
	 */
	PayGrade createPayGrade();

	/**
	 * Returns a new object of class '<em>Pay History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pay History</em>'.
	 * @generated
	 */
	PayHistory createPayHistory();

	/**
	 * Returns a new object of class '<em>Payroll Preference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payroll Preference</em>'.
	 * @generated
	 */
	PayrollPreference createPayrollPreference();

	/**
	 * Returns a new object of class '<em>Salary Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salary Step</em>'.
	 * @generated
	 */
	SalaryStep createSalaryStep();

	/**
	 * Returns a new object of class '<em>Termination Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Reason</em>'.
	 * @generated
	 */
	TerminationReason createTerminationReason();

	/**
	 * Returns a new object of class '<em>Termination Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Termination Type</em>'.
	 * @generated
	 */
	TerminationType createTerminationType();

	/**
	 * Returns a new object of class '<em>Unemployment Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unemployment Claim</em>'.
	 * @generated
	 */
	UnemploymentClaim createUnemploymentClaim();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmploymentPackage getEmploymentPackage();

} //EmploymentFactory
