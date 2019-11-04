/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Theme Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceValue <em>Resource Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceTypeEnumId <em>Resource Type Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualThemeResource()
 * @model
 * @generated
 */
public interface VisualThemeResource extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Resource Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Value</em>' attribute.
	 * @see #setResourceValue(String)
	 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualThemeResource_ResourceValue()
	 * @model
	 * @generated
	 */
	String getResourceValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceValue <em>Resource Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Value</em>' attribute.
	 * @see #getResourceValue()
	 * @generated
	 */
	void setResourceValue(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Id</em>' attribute.
	 * @see #setSequenceId(String)
	 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualThemeResource_SequenceId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getSequenceId <em>Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Id</em>' attribute.
	 * @see #getSequenceId()
	 * @generated
	 */
	void setSequenceId(String value);

	/**
	 * Returns the value of the '<em><b>Visual Theme Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Theme Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme Id</em>' attribute.
	 * @see #setVisualThemeId(String)
	 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualThemeResource_VisualThemeId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getVisualThemeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getVisualThemeId <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Id</em>' attribute.
	 * @see #getVisualThemeId()
	 * @generated
	 */
	void setVisualThemeId(String value);

	/**
	 * Returns the value of the '<em><b>Resource Type Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Type Enum Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type Enum Id</em>' reference.
	 * @see #setResourceTypeEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualThemeResource_ResourceTypeEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getResourceTypeEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.theme.VisualThemeResource#getResourceTypeEnumId <em>Resource Type Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type Enum Id</em>' reference.
	 * @see #getResourceTypeEnumId()
	 * @generated
	 */
	void setResourceTypeEnumId(Enumeration value);

} // VisualThemeResource