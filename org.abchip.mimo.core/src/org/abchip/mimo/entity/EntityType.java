/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.entity;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.entity.EntityType#getSlots <em>Slots</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.entity.EntityPackage#getEntityType()
 * @model abstract="true"
 * @generated
 */
public interface EntityType<E extends EntityTyped<?>> extends EntityIdentifiable {
	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link org.abchip.mimo.entity.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see org.abchip.mimo.entity.EntityPackage#getEntityType_Slots()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	List<Slot> getSlots();

} // EntityType
