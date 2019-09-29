/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server;

import org.abchip.mimo.context.Capability;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.JobCapability#getJobReference <em>Job Reference</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobCapability#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobCapability#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobCapability#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobCapability()
 * @model
 * @generated
 */
public interface JobCapability extends Capability {

	/**
	 * Returns the value of the '<em><b>Job Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Reference</em>' reference.
	 * @see #setJobReference(JobReference)
	 * @see org.abchip.mimo.server.ServerPackage#getJobCapability_JobReference()
	 * @model required="true"
	 * @generated
	 */
	JobReference getJobReference();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobCapability#getJobReference <em>Job Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Reference</em>' reference.
	 * @see #getJobReference()
	 * @generated
	 */
	void setJobReference(JobReference value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJobCapability_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobCapability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.abchip.mimo.server.ServerPackage#getJobCapability_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobCapability#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJobCapability_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobCapability#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);
} // JobCapability
