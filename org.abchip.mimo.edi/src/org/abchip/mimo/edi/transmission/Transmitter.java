/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.transmission;

import java.util.List;

import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmitter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.transmission.Transmitter#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.transmission.Transmitter#getTransmitterType <em>Transmitter Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.transmission.TransmissionPackage#getTransmitter()
 * @model
 * @generated
 */
public interface Transmitter extends EntityTyped<TransmitterType>, EntityInfo {
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
	 * @see org.abchip.mimo.edi.transmission.TransmissionPackage#getTransmitter_Name()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.transmission.Transmitter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transmitter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmitter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmitter Type</em>' attribute.
	 * @see #setTransmitterType(String)
	 * @see org.abchip.mimo.edi.transmission.TransmissionPackage#getTransmitter_TransmitterType()
	 * @model required="true"
	 *        annotation="mimo-ent-domain frame='TransmitterType'"
	 * @generated
	 */
	String getTransmitterType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.transmission.Transmitter#getTransmitterType <em>Transmitter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmitter Type</em>' attribute.
	 * @see #getTransmitterType()
	 * @generated
	 */
	void setTransmitterType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='MessageType'"
	 * @generated
	 */
	List<String> messageTypes();

} // Transmitter
