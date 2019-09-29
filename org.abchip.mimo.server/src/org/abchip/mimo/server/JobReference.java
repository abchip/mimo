/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.JobReference#getJobNumber <em>Job Number</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobReference#getJobUser <em>Job User</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobReference#getJobName <em>Job Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobReference()
 * @model
 * @generated
 */
public interface JobReference extends Entity {
	/**
	 * Returns the value of the '<em><b>Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Number</em>' attribute.
	 * @see #setJobNumber(int)
	 * @see org.abchip.mimo.server.ServerPackage#getJobReference_JobNumber()
	 * @model required="true"
	 * @generated
	 */
	int getJobNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobReference#getJobNumber <em>Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Number</em>' attribute.
	 * @see #getJobNumber()
	 * @generated
	 */
	void setJobNumber(int value);

	/**
	 * Returns the value of the '<em><b>Job User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job User</em>' attribute.
	 * @see #setJobUser(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJobReference_JobUser()
	 * @model required="true"
	 * @generated
	 */
	String getJobUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobReference#getJobUser <em>Job User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job User</em>' attribute.
	 * @see #getJobUser()
	 * @generated
	 */
	void setJobUser(String value);

	/**
	 * Returns the value of the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Name</em>' attribute.
	 * @see #setJobName(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJobReference_JobName()
	 * @model required="true"
	 * @generated
	 */
	String getJobName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobReference#getJobName <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Name</em>' attribute.
	 * @see #getJobName()
	 * @generated
	 */
	void setJobName(String value);

} // JobReference
