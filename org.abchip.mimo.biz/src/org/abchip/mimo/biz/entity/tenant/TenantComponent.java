/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.tenant;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tenant Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getComponentName <em>Component Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getSequenceNum <em>Sequence Num</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenantComponent()
 * @model
 * @generated
 */
public interface TenantComponent extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Component Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name</em>' reference.
	 * @see #setComponentName(Component)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenantComponent_ComponentName()
	 * @model keys="componentName" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Component getComponentName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getComponentName <em>Component Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name</em>' reference.
	 * @see #getComponentName()
	 * @generated
	 */
	void setComponentName(Component value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenantComponent_SequenceNum()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tenant Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' reference.
	 * @see #setTenantId(Tenant)
	 * @see org.abchip.mimo.biz.entity.tenant.TenantPackage#getTenantComponent_TenantId()
	 * @model keys="tenantId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Tenant getTenantId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.tenant.TenantComponent#getTenantId <em>Tenant Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' reference.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(Tenant value);

} // TenantComponent
