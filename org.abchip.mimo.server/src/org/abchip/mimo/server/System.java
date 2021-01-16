/**
 *  Copyright (c) 2017, 2021 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.server;

import org.abchip.mimo.context.ContextRoot;
import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.System#getContext <em>Context</em>}</li>
 *   <li>{@link org.abchip.mimo.server.System#getLastJobNumber <em>Last Job Number</em>}</li>
 *   <li>{@link org.abchip.mimo.server.System#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.server.System#getPort <em>Port</em>}</li>
 *   <li>{@link org.abchip.mimo.server.System#getStatus <em>Status</em>}</li>
 *   <li>{@link org.abchip.mimo.server.System#getSystemUser <em>System User</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EntityIdentifiable {

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(ContextRoot)
	 * @see org.abchip.mimo.server.ServerPackage#getSystem_Context()
	 * @model containment="true" resolveProxies="true" transient="true"
	 * @generated
	 */
	ContextRoot getContext();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.System#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(ContextRoot value);

	public static final long LOCK_TIMEOUT = 1000;
	
	/**
	 * Returns the value of the '<em><b>Last Job Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Job Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Job Number</em>' attribute.
	 * @see #setLastJobNumber(int)
	 * @see org.abchip.mimo.server.ServerPackage#getSystem_LastJobNumber()
	 * @model
	 * @generated
	 */
	int getLastJobNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.System#getLastJobNumber <em>Last Job Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Job Number</em>' attribute.
	 * @see #getLastJobNumber()
	 * @generated
	 */
	void setLastJobNumber(int value);

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
	 * @see org.abchip.mimo.server.ServerPackage#getSystem_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.System#getName <em>Name</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.abchip.mimo.server.ServerPackage#getSystem_Port()
	 * @model required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.System#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"STP"</code>.
	 * The literals are from the enumeration {@link org.abchip.mimo.server.SystemStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.server.SystemStatus
	 * @see #setStatus(SystemStatus)
	 * @see org.abchip.mimo.server.ServerPackage#getSystem_Status()
	 * @model default="STP" required="true"
	 * @generated
	 */
	SystemStatus getStatus();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.System#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.abchip.mimo.server.SystemStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SystemStatus value);

	/**
	 * Returns the value of the '<em><b>System User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System User</em>' attribute.
	 * @see #setSystemUser(String)
	 * @see org.abchip.mimo.server.ServerPackage#getSystem_SystemUser()
	 * @model required="true"
	 * @generated
	 */
	String getSystemUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.System#getSystemUser <em>System User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System User</em>' attribute.
	 * @see #getSystemUser()
	 * @generated
	 */
	void setSystemUser(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getAvailableProcessors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	double getLoadAverage();

} // QSystem
