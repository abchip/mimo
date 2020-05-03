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
 * A representation of the model object '<em><b>Http ServiceScope Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.networking.HttpServiceConfig#getHost <em>Host</em>}</li>
 *   <li>{@link org.abchip.mimo.networking.HttpServiceConfig#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.networking.NetworkingPackage#getHttpServiceConfig()
 * @model
 * @generated
 */
public interface HttpServiceConfig extends Entity {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' containment reference.
	 * @see #setHost(HostConfig)
	 * @see org.abchip.mimo.networking.NetworkingPackage#getHttpServiceConfig_Host()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	HostConfig getHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.networking.HttpServiceConfig#getHost <em>Host</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' containment reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(HostConfig value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.abchip.mimo.networking.NetworkingPackage#getHttpServiceConfig_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.networking.HttpServiceConfig#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // HttpServiceConfig
