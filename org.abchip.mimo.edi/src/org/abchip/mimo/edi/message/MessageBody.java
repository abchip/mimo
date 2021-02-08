/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.message;

import java.util.List;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.EntityIdentifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.edi.message.MessageBody#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageBody()
 * @model
 * @generated
 */
public interface MessageBody extends Entity {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.entity.EntityIdentifiable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.abchip.mimo.edi.message.MessagePackage#getMessageBody_Contents()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<EntityIdentifiable> getContents();

} // MessageBody
