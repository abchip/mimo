/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.server.ServerPackage
 * @generated
 */
public interface ServerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServerFactory eINSTANCE = org.abchip.mimo.server.impl.ServerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job</em>'.
	 * @generated
	 */
	Job createJob();

	/**
	 * Returns a new object of class '<em>Job Capability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Capability</em>'.
	 * @generated
	 */
	JobCapability createJobCapability();

	/**
	 * Returns a new object of class '<em>Job Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Description</em>'.
	 * @generated
	 */
	JobDescription createJobDescription();

	/**
	 * Returns a new object of class '<em>Job Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Event</em>'.
	 * @generated
	 */
	JobEvent createJobEvent();

	/**
	 * Returns a new object of class '<em>Job Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Log</em>'.
	 * @generated
	 */
	JobLog createJobLog();

	/**
	 * Returns a new object of class '<em>Job Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Log Entry</em>'.
	 * @generated
	 */
	JobLogEntry createJobLogEntry();

	/**
	 * Returns a new object of class '<em>Job Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Message</em>'.
	 * @generated
	 */
	JobMessage createJobMessage();

	/**
	 * Returns a new object of class '<em>Job Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Reference</em>'.
	 * @generated
	 */
	JobReference createJobReference();

	/**
	 * Returns a new object of class '<em>Job Run Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job Run Info</em>'.
	 * @generated
	 */
	JobRunInfo createJobRunInfo();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>System Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Event</em>'.
	 * @generated
	 */
	SystemEvent createSystemEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServerPackage getServerPackage();

} //ServerFactory
