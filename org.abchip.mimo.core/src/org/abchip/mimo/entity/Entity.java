/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Entity</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntity()
 * @model abstract="true"
 * @generated
 */
public interface Entity {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	<E extends Entity> Frame<E> isa();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model slotRequired="true"
	 * @generated
	 */
	void eSet(Slot slot, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" slotRequired="true" defaultRequired="true" resolveRequired="true"
	 * @generated
	 */
	Object eGet(Slot slot, boolean default_, boolean resolve);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model slotRequired="true"
	 * @generated
	 */
	boolean eIsSet(Slot slot);

} // Entity
