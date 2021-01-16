/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.application;

import org.abchip.mimo.entity.Entity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.application.ApplicationPaths#getData <em>Data</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationPaths#getLogs <em>Logs</em>}</li>
 *   <li>{@link org.abchip.mimo.application.ApplicationPaths#getWork <em>Work</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationPaths()
 * @model
 * @generated
 */
public interface ApplicationPaths extends Entity {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationPaths_Data()
	 * @model required="true"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationPaths#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logs</em>' attribute.
	 * @see #setLogs(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationPaths_Logs()
	 * @model required="true"
	 * @generated
	 */
	String getLogs();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationPaths#getLogs <em>Logs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logs</em>' attribute.
	 * @see #getLogs()
	 * @generated
	 */
	void setLogs(String value);

	/**
	 * Returns the value of the '<em><b>Work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work</em>' attribute.
	 * @see #setWork(String)
	 * @see org.abchip.mimo.application.ApplicationPackage#getApplicationPaths_Work()
	 * @model required="true"
	 * @generated
	 */
	String getWork();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.application.ApplicationPaths#getWork <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work</em>' attribute.
	 * @see #getWork()
	 * @generated
	 */
	void setWork(String value);

} // ApplicationPaths
