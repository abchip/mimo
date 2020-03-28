/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.util;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Service Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.util.HttpServiceConfig#getPath <em>Path</em>}</li>
 *   <li>{@link org.abchip.mimo.util.HttpServiceConfig#getSocket <em>Socket</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.util.UtilPackage#getHttpServiceConfig()
 * @model
 * @generated
 */
public interface HttpServiceConfig extends Entity {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.abchip.mimo.util.UtilPackage#getHttpServiceConfig_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.HttpServiceConfig#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Socket</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Socket</em>' containment reference.
	 * @see #setSocket(SocketConfig)
	 * @see org.abchip.mimo.util.UtilPackage#getHttpServiceConfig_Socket()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	SocketConfig getSocket();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.util.HttpServiceConfig#getSocket <em>Socket</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Socket</em>' containment reference.
	 * @see #getSocket()
	 * @generated
	 */
	void setSocket(SocketConfig value);

} // HttpServiceConfig
