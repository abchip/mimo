/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.resource;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.resource.ResourceDriverConfig#isLockSupport <em>Lock Support</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceDriverConfig()
 * @model
 * @generated
 */
public interface ResourceDriverConfig extends Entity {
	/**
	 * Returns the value of the '<em><b>Lock Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lock Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Support</em>' attribute.
	 * @see #setLockSupport(boolean)
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceDriverConfig_LockSupport()
	 * @model required="true"
	 * @generated
	 */
	boolean isLockSupport();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceDriverConfig#isLockSupport <em>Lock Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Support</em>' attribute.
	 * @see #isLockSupport()
	 * @generated
	 */
	void setLockSupport(boolean value);

} // ResourceDriverConfig
