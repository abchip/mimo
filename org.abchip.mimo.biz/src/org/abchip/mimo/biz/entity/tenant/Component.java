/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Component#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Component#getRootLocation <em>Root Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.Component#getTenantComponents <em>Tenant Components</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' attribute.
	 * @see #setComponentName(String)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getComponent_ComponentName()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getComponentName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.Component#getComponentName <em>Component Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' attribute.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(String value);

	/**
	 * Returns the value of the '<em><b>Root Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Location</em>' attribute.
	 * @see #setRootLocation(String)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getComponent_RootLocation()
	 * @model
	 * @generated
	 */
	String getRootLocation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.Component#getRootLocation <em>Root Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Location</em>' attribute.
	 * @see #getRootLocation()
	 * @generated
	 */
	void setRootLocation(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Components</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Components</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Components</em>' attribute list.
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getComponent_TenantComponents()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TenantComponent'"
	 * @generated
	 */
	List<String> getTenantComponents();

} // Component
