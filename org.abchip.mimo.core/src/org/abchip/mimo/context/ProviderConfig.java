/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import org.abchip.mimo.entity.Entity;
import org.abchip.mimo.networking.HostConfig;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OF Biz Provider Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.ProviderConfig#getHost <em>Host</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ProviderConfig#getPath <em>Path</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ProviderConfig#getPublicUser <em>Public User</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ProviderConfig#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig()
 * @model
 * @generated
 */
public interface ProviderConfig extends Entity {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' containment reference.
	 * @see #setHost(HostConfig)
	 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig_Host()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	HostConfig getHost();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ProviderConfig#getHost <em>Host</em>}' containment reference.
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
	 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ProviderConfig#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Public User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public User</em>' containment reference.
	 * @see #setPublicUser(ProviderUser)
	 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig_PublicUser()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ProviderUser getPublicUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ProviderConfig#getPublicUser <em>Public User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public User</em>' containment reference.
	 * @see #getPublicUser()
	 * @generated
	 */
	void setPublicUser(ProviderUser value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ProviderConfig#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

} // ProviderConfig
