/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server;

import java.util.Date;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.JobLogEntry#getGravity <em>Gravity</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobLogEntry#getMessage <em>Message</em>}</li>
 *   <li>{@link org.abchip.mimo.server.JobLogEntry#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getJobLogEntry()
 * @model
 * @generated
 */
public interface JobLogEntry extends Entity {
	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute.
	 * @see #setGravity(int)
	 * @see org.abchip.mimo.server.ServerPackage#getJobLogEntry_Gravity()
	 * @model required="true"
	 * @generated
	 */
	int getGravity();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobLogEntry#getGravity <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' attribute.
	 * @see #getGravity()
	 * @generated
	 */
	void setGravity(int value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.abchip.mimo.server.ServerPackage#getJobLogEntry_Message()
	 * @model required="true"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobLogEntry#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.abchip.mimo.server.ServerPackage#getJobLogEntry_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.JobLogEntry#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

} // JobLogEntry
