/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.edi.message.MessageType#getTransmitter <em>Transmitter</em>}</li>
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
	 * Returns the value of the '<em><b>Transmitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmitter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmitter</em>' attribute.
	 * @see #setTransmitter(String)
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageType_Transmitter()
	 * @model required="true"
	 *        annotation="mimo-ent-domain frame='Transmitter'"
	 * @generated
	 */
	String getTransmitter();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.edi.message.MessageType#getTransmitter <em>Transmitter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmitter</em>' attribute.
	 * @see #getTransmitter()
	 * @generated
	 */
	void setTransmitter(String value);

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
