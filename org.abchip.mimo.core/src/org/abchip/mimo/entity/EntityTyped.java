/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityTyped()
 * @model
 * @generated
 */
public interface EntityTyped<T extends EntityType<?>> extends EntityIdentifiable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	T getType();

} // EntityTyped
