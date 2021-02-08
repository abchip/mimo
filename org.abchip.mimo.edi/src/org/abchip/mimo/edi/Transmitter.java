/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

import org.abchip.mimo.context.Context;

import org.abchip.mimo.edi.message.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmitter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.edi.EDIPackage#getTransmitter()
 * @model abstract="true"
 * @generated
 */
public interface Transmitter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.edi.DataInterchangeException" contextRequired="true" messageRequired="true"
	 * @generated
	 */
	void transmitMessage(Context context, Message message) throws DataInterchangeException;

} // Transmitter
