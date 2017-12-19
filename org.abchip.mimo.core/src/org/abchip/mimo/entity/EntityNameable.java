/**
 *  Copyright (c) 2017, 2018 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.entity;

import java.net.URI;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Entity Nameable</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityNameable()
 * @model abstract="true"
 * @generated
 */
public interface EntityNameable extends Entity, Nameable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.abchip.mimo.util.JavaURI" required="true"
	 * @generated
	 */
	URI getURI();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getResource();

} // EntityNameable
