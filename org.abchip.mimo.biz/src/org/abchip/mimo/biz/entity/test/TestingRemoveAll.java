/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.test;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing Remove All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingRemoveAll#getTestingRemoveAllId <em>Testing Remove All Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingRemoveAll#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingRemoveAll()
 * @model annotation="mimo-ent-frame title='Testing' formula='description'"
 * @generated
 */
public interface TestingRemoveAll extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingRemoveAll_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingRemoveAll#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Testing Remove All Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Remove All Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Remove All Id</em>' attribute.
	 * @see #setTestingRemoveAllId(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingRemoveAll_TestingRemoveAllId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestingRemoveAllId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingRemoveAll#getTestingRemoveAllId <em>Testing Remove All Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Remove All Id</em>' attribute.
	 * @see #getTestingRemoveAllId()
	 * @generated
	 */
	void setTestingRemoveAllId(String value);

} // TestingRemoveAll
