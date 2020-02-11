/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.property;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.property.SystemProperty#getSystemPropertyId <em>System Property Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.SystemProperty#getSystemResourceId <em>System Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.SystemProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.property.SystemProperty#getSystemPropertyValue <em>System Property Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.property.PropertyPackage#getSystemProperty()
 * @model annotation="mimo-ent-frame title='Defines a System Property' formula='description'"
 * @generated
 */
public interface SystemProperty extends BizEntity {
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
	 * @see org.abchip.mimo.biz.common.property.PropertyPackage#getSystemProperty_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.property.SystemProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>System Property Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Property Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Property Id</em>' attribute.
	 * @see #setSystemPropertyId(String)
	 * @see org.abchip.mimo.biz.common.property.PropertyPackage#getSystemProperty_SystemPropertyId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSystemPropertyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.property.SystemProperty#getSystemPropertyId <em>System Property Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Property Id</em>' attribute.
	 * @see #getSystemPropertyId()
	 * @generated
	 */
	void setSystemPropertyId(String value);

	/**
	 * Returns the value of the '<em><b>System Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Property Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Property Value</em>' attribute.
	 * @see #setSystemPropertyValue(String)
	 * @see org.abchip.mimo.biz.common.property.PropertyPackage#getSystemProperty_SystemPropertyValue()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSystemPropertyValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.property.SystemProperty#getSystemPropertyValue <em>System Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Property Value</em>' attribute.
	 * @see #getSystemPropertyValue()
	 * @generated
	 */
	void setSystemPropertyValue(String value);

	/**
	 * Returns the value of the '<em><b>System Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Resource Id</em>' attribute.
	 * @see #setSystemResourceId(String)
	 * @see org.abchip.mimo.biz.common.property.PropertyPackage#getSystemProperty_SystemResourceId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getSystemResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.property.SystemProperty#getSystemResourceId <em>System Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Resource Id</em>' attribute.
	 * @see #getSystemResourceId()
	 * @generated
	 */
	void setSystemResourceId(String value);

} // SystemProperty
