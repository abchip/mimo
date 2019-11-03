/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz;

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
 *   <li>{@link org.abchip.mimo.biz.BizProviderConfig#getLoginType <em>Login Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizProviderConfig#getUrl <em>Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizProviderConfig#getPublicUser <em>Public User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.BizProviderConfig#getSystemUser <em>System User</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.BizPackage#getBizProviderConfig()
 * @model
 * @generated
 */
public interface BizProviderConfig extends Entity {
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
	 * @see org.abchip.mimo.biz.BizPackage#getBizProviderConfig_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizProviderConfig#getUrl <em>Url</em>}' attribute.
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
	 * @see #setPublicUser(BizProviderUser)
	 * @see org.abchip.mimo.biz.BizPackage#getBizProviderConfig_PublicUser()
	 * @model containment="true"
	 * @generated
	 */
	BizProviderUser getPublicUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizProviderConfig#getPublicUser <em>Public User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public User</em>' containment reference.
	 * @see #getPublicUser()
	 * @generated
	 */
	void setPublicUser(BizProviderUser value);

	/**
	 * Returns the value of the '<em><b>System User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System User</em>' containment reference.
	 * @see #setSystemUser(BizProviderUser)
	 * @see org.abchip.mimo.biz.BizPackage#getBizProviderConfig_SystemUser()
	 * @model containment="true"
	 * @generated
	 */
	BizProviderUser getSystemUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizProviderConfig#getSystemUser <em>System User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System User</em>' containment reference.
	 * @see #getSystemUser()
	 * @generated
	 */
	void setSystemUser(BizProviderUser value);

	/**
	 * Returns the value of the '<em><b>Login Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.abchip.mimo.biz.BizLoginType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Type</em>' attribute.
	 * @see org.abchip.mimo.biz.BizLoginType
	 * @see #setLoginType(BizLoginType)
	 * @see org.abchip.mimo.biz.BizPackage#getBizProviderConfig_LoginType()
	 * @model required="true"
	 * @generated
	 */
	BizLoginType getLoginType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.BizProviderConfig#getLoginType <em>Login Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Type</em>' attribute.
	 * @see org.abchip.mimo.biz.BizLoginType
	 * @see #getLoginType()
	 * @generated
	 */
	void setLoginType(BizLoginType value);

} // BizProviderConfig
