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
 * A representation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.transmission.Transmission#getTransmissionId <em>Transmission Id</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.transmission.Transmission#getTransmissionType <em>Transmission Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.transmission.TransmissionPackage#getTransmission()
 * @model
 * @generated
 */
public interface Transmission extends EntityTyped<TransmissionType>, EntityInfo {
	/**
	 * Returns the value of the '<em><b>Transmission Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Id</em>' attribute.
	 * @see #setTransmissionId(String)
	 * @see org.abchip.mimo.edi.transmission.TransmissionPackage#getTransmission_TransmissionId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getTransmissionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.transmission.Transmission#getTransmissionId <em>Transmission Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Id</em>' attribute.
	 * @see #getTransmissionId()
	 * @generated
	 */
	void setTransmissionId(String value);

	/**
	 * Returns the value of the '<em><b>Transmission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Type</em>' attribute.
	 * @see #setTransmissionType(String)
	 * @see org.abchip.mimo.edi.transmission.TransmissionPackage#getTransmission_TransmissionType()
	 * @model required="true"
	 *        annotation="mimo-ent-domain frame='TransmissionType'"
	 * @generated
	 */
	String getTransmissionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.transmission.Transmission#getTransmissionType <em>Transmission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Type</em>' attribute.
	 * @see #getTransmissionType()
	 * @generated
	 */
	void setTransmissionType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='MessageType'"
	 * @generated
	 */
	List<String> messageTypes();

} // Transmission
