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
 * A representation of the model object '<em><b>Testing Subtype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingSubtype#getTestingTypeId <em>Testing Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.entity.test.TestingSubtype#getSubtypeDescription <em>Subtype Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingSubtype()
 * @model
 * @generated
 */
public interface TestingSubtype extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Subtype Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Description</em>' attribute.
	 * @see #setSubtypeDescription(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingSubtype_SubtypeDescription()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getSubtypeDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingSubtype#getSubtypeDescription <em>Subtype Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype Description</em>' attribute.
	 * @see #getSubtypeDescription()
	 * @generated
	 */
	void setSubtypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Testing Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testing Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testing Type Id</em>' attribute.
	 * @see #setTestingTypeId(String)
	 * @see org.abchip.mimo.biz.entity.test.TestPackage#getTestingSubtype_TestingTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getTestingTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.entity.test.TestingSubtype#getTestingTypeId <em>Testing Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testing Type Id</em>' attribute.
	 * @see #getTestingTypeId()
	 * @generated
	 */
	void setTestingTypeId(String value);

} // TestingSubtype
