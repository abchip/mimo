/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.networking;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Pooling Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxTotal <em>Max Total</em>}</li>
 *   <li>{@link org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxPerRoute <em>Max Per Route</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.networking.NetworkingPackage#getConnectionPoolingConfig()
 * @model
 * @generated
 */
public interface ConnectionPoolingConfig extends Entity {
	/**
	 * Returns the value of the '<em><b>Max Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Total</em>' attribute.
	 * @see #setMaxTotal(int)
	 * @see org.abchip.mimo.networking.NetworkingPackage#getConnectionPoolingConfig_MaxTotal()
	 * @model required="true"
	 * @generated
	 */
	int getMaxTotal();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxTotal <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Total</em>' attribute.
	 * @see #getMaxTotal()
	 * @generated
	 */
	void setMaxTotal(int value);

	/**
	 * Returns the value of the '<em><b>Max Per Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Per Route</em>' attribute.
	 * @see #setMaxPerRoute(int)
	 * @see org.abchip.mimo.networking.NetworkingPackage#getConnectionPoolingConfig_MaxPerRoute()
	 * @model required="true"
	 * @generated
	 */
	int getMaxPerRoute();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.networking.ConnectionPoolingConfig#getMaxPerRoute <em>Max Per Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Per Route</em>' attribute.
	 * @see #getMaxPerRoute()
	 * @generated
	 */
	void setMaxPerRoute(int value);

} // ConnectionPoolingConfig
