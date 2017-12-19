/**
 *  Copyright (c) 2017, 2018 ABChip and others.
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
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.JobEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobEvent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobEvent()
 * @model
 * @generated
 */
public interface JobEvent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Job)
	 * @see org.abchip.mimo.server.ServerPackage#getJobEvent_Source()
	 * @model
	 * @generated
	 */
	Job getSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobEvent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Job value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.server.JobEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.server.JobEventType
	 * @see #setType(JobEventType)
	 * @see org.abchip.mimo.server.ServerPackage#getJobEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	JobEventType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.server.JobEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(JobEventType value);

} // JobEvent
