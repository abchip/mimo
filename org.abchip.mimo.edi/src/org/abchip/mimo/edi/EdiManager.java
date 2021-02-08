/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

import org.abchip.mimo.context.Context;
import org.abchip.mimo.edi.entity.EntityEvent;
import org.abchip.mimo.edi.message.Message;
import org.abchip.mimo.entity.EntityIdentifiable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edi Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.edi.EDIPackage#getEdiManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EdiManager {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.edi.DataInterchangeException" contextRequired="true" entityRequired="true" eventRequired="true"
	 * @generated
	 */
	<E extends EntityIdentifiable> void writeMessage(Context context, E entity, EntityEvent event) throws DataInterchangeException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.abchip.mimo.edi.DataInterchangeException" contextRequired="true" messageRequired="true"
	 * @generated
	 */
	void transmitMessage(Context context, Message message) throws DataInterchangeException;
} // EdiManager
