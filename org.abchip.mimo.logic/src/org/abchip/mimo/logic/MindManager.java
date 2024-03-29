/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.logic;

import org.abchip.mimo.context.Context;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.entity.Frame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.logic.LogicPackage#getMindManager()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MindManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true" frameRequired="true"
	 * @generated
	 */
	<E extends Entity> Theory buildTheory(Context context, Frame<E> frame);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	Reasoner createReasoner(Context context);

} // MindManager
