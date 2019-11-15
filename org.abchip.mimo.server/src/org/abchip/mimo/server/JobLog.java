/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server;

import java.util.List;

import org.abchip.mimo.entity.EntityNameable;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Job Log</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.JobLog#getJob <em>Job</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobLog#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobLog()
 * @model
 * @generated
 */
public interface JobLog extends EntityNameable {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' reference.
	 * @see #setJob(Job)
	 * @see org.abchip.mimo.server.ServerPackage#getJobLog_Job()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobLog#getJob <em>Job</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' reference.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.server.JobLogEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.abchip.mimo.server.ServerPackage#getJobLog_Entries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<JobLogEntry> getEntries();

} // JobLog
