/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.edi.message.MessagePackage
 * @generated
 */
public interface MessageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessageFactory eINSTANCE = org.abchip.mimo.edi.message.impl.MessageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Received</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Received</em>'.
	 * @generated
	 */
	MessageReceived createMessageReceived();

	/**
	 * Returns a new object of class '<em>Sent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sent</em>'.
	 * @generated
	 */
	MessageSent createMessageSent();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	<E extends Message> MessageType<E> createMessageType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MessagePackage getMessagePackage();

} //MessageFactory
