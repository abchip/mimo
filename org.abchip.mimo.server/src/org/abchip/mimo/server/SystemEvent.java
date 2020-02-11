/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.server;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.server.SystemEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.abchip.mimo.server.SystemEvent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.server.ServerPackage#getSystemEvent()
 * @model
 * @generated
 */
public interface SystemEvent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(org.abchip.mimo.server.System)
	 * @see org.abchip.mimo.server.ServerPackage#getSystemEvent_Source()
	 * @model
	 * @generated
	 */
	org.abchip.mimo.server.System getSource();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.SystemEvent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(org.abchip.mimo.server.System value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.server.SystemEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.server.SystemEventType
	 * @see #setType(SystemEventType)
	 * @see org.abchip.mimo.server.ServerPackage#getSystemEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	SystemEventType getType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.server.SystemEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.abchip.mimo.server.SystemEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(SystemEventType value);

} // SystemEvent
