/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.schedule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.service.schedule.SchedulePackage
 * @generated
 */
public interface ScheduleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScheduleFactory eINSTANCE = org.abchip.mimo.biz.service.schedule.impl.ScheduleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job Manager Lock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Manager Lock</em>'.
	 * @generated
	 */
	JobManagerLock createJobManagerLock();

	/**
	 * Returns a new object of class '<em>Job Sandbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Sandbox</em>'.
	 * @generated
	 */
	JobSandbox createJobSandbox();

	/**
	 * Returns a new object of class '<em>Recurrence Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurrence Info</em>'.
	 * @generated
	 */
	RecurrenceInfo createRecurrenceInfo();

	/**
	 * Returns a new object of class '<em>Recurrence Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recurrence Rule</em>'.
	 * @generated
	 */
	RecurrenceRule createRecurrenceRule();

	/**
	 * Returns a new object of class '<em>Runtime Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime Data</em>'.
	 * @generated
	 */
	RuntimeData createRuntimeData();

	/**
	 * Returns a new object of class '<em>Temporal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Expression</em>'.
	 * @generated
	 */
	TemporalExpression createTemporalExpression();

	/**
	 * Returns a new object of class '<em>Temporal Expression Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Expression Assoc</em>'.
	 * @generated
	 */
	TemporalExpressionAssoc createTemporalExpressionAssoc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SchedulePackage getSchedulePackage();

} //ScheduleFactory
