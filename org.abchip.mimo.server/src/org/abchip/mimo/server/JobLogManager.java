/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.server;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Job Log Manager</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobLogManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface JobLogManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" messageRequired="true"
	 * @generated
	 */
	void info(Job job, String message);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true" messageRequired="true"
	 * @generated
	 */
	void warning(Job job, String message);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	void error(Job job, String message);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model jobRequired="true"
	 * @generated
	 */
	JobLog lookup(Job job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" jobReferenceRequired="true"
	 * @generated
	 */
	JobLog lookup(String contextID, JobReference jobReference);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextIDRequired="true" nameRequired="true" userRequired="true" numberRequired="true"
	 * @generated
	 */
	JobLog lookup(String contextID, String name, String user, int number);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model jobRequired="true" messageRequired="true"
	 * @generated
	 */
	void addEntry(Job job, int gravity, String message);

} // JobLogManager
