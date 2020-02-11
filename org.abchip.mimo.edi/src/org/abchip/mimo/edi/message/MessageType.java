/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message;

import java.util.List;
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
 *   <li>{@link org.abchip.mimo.edi.message.MessageType#getEdiFrameSetups <em>Edi Frame Setups</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType<E extends Message> extends EntityType<E>, EntityInfo {

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
	 * Returns the value of the '<em><b>Transmission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Type</em>' attribute.
	 * @see #setTransmissionType(String)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_TransmissionType()
	 * @model required="true"
	 *        annotation="mimo-ent-domain frame='TransmissionType'"
	 * @generated
	 */
	String getTransmissionType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.MessageType#getTransmissionType <em>Transmission Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Type</em>' attribute.
	 * @see #getTransmissionType()
	 * @generated
	 */
	void setTransmissionType(String value);

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
	 * Returns the value of the '<em><b>Edi Frame Setups</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edi Frame Setups</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edi Frame Setups</em>' attribute list.
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_EdiFrameSetups()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='EdiFrameSetup'"
	 * @generated
	 */
	List<String> getEdiFrameSetups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='MessageReceived' route='messageType'"
	 * @generated
	 */
	List<String> messageReceiveds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='MessageSent' route='messageType'"
	 * @generated
	 */
	List<String> messageSents();
} // MessageType
