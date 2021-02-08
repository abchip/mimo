/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message;

import org.abchip.mimo.edi.transmission.TransmissionType;
import org.abchip.mimo.entity.EntityInfo;
import org.abchip.mimo.entity.EntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.message.MessageType#getName <em>Name</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.MessageType#getText <em>Text</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.MessageType#getTransmissionType <em>Transmission Type</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.MessageType#isEncrypt <em>Encrypt</em>}</li>
 *   <li>{@link org.abchip.mimo.edi.message.MessageType#isTransmissionOnWrite <em>Transmission On Write</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends EntityType<Message>, EntityInfo {

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
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.MessageType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.MessageType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Transmission Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Type</em>' reference.
	 * @see #setTransmissionType(TransmissionType)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_TransmissionType()
	 * @model required="true"
	 * @generated
	 */
	TransmissionType getTransmissionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.MessageType#getTransmissionType <em>Transmission Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Type</em>' reference.
	 * @see #getTransmissionType()
	 * @generated
	 */
	void setTransmissionType(TransmissionType value);

	/**
	 * Returns the value of the '<em><b>Encrypt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt</em>' attribute.
	 * @see #setEncrypt(boolean)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_Encrypt()
	 * @model required="true"
	 * @generated
	 */
	boolean isEncrypt();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.MessageType#isEncrypt <em>Encrypt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt</em>' attribute.
	 * @see #isEncrypt()
	 * @generated
	 */
	void setEncrypt(boolean value);

	/**
	 * Returns the value of the '<em><b>Transmission On Write</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission On Write</em>' attribute.
	 * @see #setTransmissionOnWrite(boolean)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_TransmissionOnWrite()
	 * @model
	 * @generated
	 */
	boolean isTransmissionOnWrite();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.MessageType#isTransmissionOnWrite <em>Transmission On Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission On Write</em>' attribute.
	 * @see #isTransmissionOnWrite()
	 * @generated
	 */
	void setTransmissionOnWrite(boolean value);
} // MessageType
