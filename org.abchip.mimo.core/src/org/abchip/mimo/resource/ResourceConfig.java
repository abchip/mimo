/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.resource.ResourceConfig#isLockSupport <em>Lock Support</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.ResourceConfig#isOrderSupport <em>Order Support</em>}</li>
 *   <li>{@link org.abchip.mimo.resource.ResourceConfig#getPageSize <em>Page Size</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.resource.ResourcePackage#getResourceConfig()
 * @model
 * @generated
 */
public interface ResourceConfig extends Entity {
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
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceConfig_LockSupport()
	 * @model required="true"
	 * @generated
	 */
	boolean isLockSupport();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceConfig#isLockSupport <em>Lock Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Support</em>' attribute.
	 * @see #isLockSupport()
	 * @generated
	 */
	void setLockSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Support</em>' attribute.
	 * @see #setOrderSupport(boolean)
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceConfig_OrderSupport()
	 * @model required="true"
	 * @generated
	 */
	boolean isOrderSupport();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceConfig#isOrderSupport <em>Order Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Support</em>' attribute.
	 * @see #isOrderSupport()
	 * @generated
	 */
	void setOrderSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Page Size</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Size</em>' attribute.
	 * @see #setPageSize(int)
	 * @see org.abchip.mimo.resource.ResourcePackage#getResourceConfig_PageSize()
	 * @model default="100" required="true"
	 * @generated
	 */
	int getPageSize();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.resource.ResourceConfig#getPageSize <em>Page Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Size</em>' attribute.
	 * @see #getPageSize()
	 * @generated
	 */
	void setPageSize(int value);

} // ResourceConfig
