/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.context;

import org.abchip.mimo.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OF Biz Provider Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.context.ProviderConfig#getUrl <em>Url</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ProviderConfig#getPublicUser <em>Public User</em>}</li>
 *   <li>{@link org.abchip.mimo.context.ProviderConfig#getSystemUser <em>System User</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig()
 * @model
 * @generated
 */
public interface ProviderConfig extends Entity {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ProviderConfig#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * Returns the value of the '<em><b>System User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System User</em>' containment reference.
	 * @see #setSystemUser(ProviderUser)
	 * @see org.abchip.mimo.context.ContextPackage#getProviderConfig_SystemUser()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	ProviderUser getSystemUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.context.ProviderConfig#getSystemUser <em>System User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System User</em>' containment reference.
	 * @see #getSystemUser()
	 * @generated
	 */
	void setSystemUser(ProviderUser value);

} // ProviderConfig
