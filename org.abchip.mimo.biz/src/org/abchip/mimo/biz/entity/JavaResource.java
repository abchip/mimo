/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java ResourceDriver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.JavaResource#getResourceName <em>ResourceDriver Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.JavaResource#getResourceValue <em>ResourceDriver Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.EntityPackage#getJavaResource()
 * @model
 * @generated
 */
public interface JavaResource extends BizEntity {
	/**
	 * Returns the value of the '<em><b>ResourceDriver Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ResourceDriver Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ResourceDriver Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see org.abchip.mimo.biz.entity.EntityPackage#getJavaResource_ResourceName()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.JavaResource#getResourceName <em>ResourceDriver Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ResourceDriver Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

	/**
	 * Returns the value of the '<em><b>ResourceDriver Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ResourceDriver Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ResourceDriver Value</em>' attribute.
	 * @see #setResourceValue(byte[])
	 * @see org.abchip.mimo.biz.entity.EntityPackage#getJavaResource_ResourceValue()
	 * @model
	 * @generated
	 */
	byte[] getResourceValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.JavaResource#getResourceValue <em>ResourceDriver Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ResourceDriver Value</em>' attribute.
	 * @see #getResourceValue()
	 * @generated
	 */
	void setResourceValue(byte[] value);

} // JavaResource
