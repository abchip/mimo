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
package org.abchip.mimo.context;

import java.security.Principal;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.context.ContextPackage#getIdentity()
 * @model
 * @generated
 */
public interface Identity<T extends Entity> extends Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.abchip.mimo.util.JavaPrincipal"
	 * @generated
	 */
	Principal getJavaPrincipal();

} // Identity
