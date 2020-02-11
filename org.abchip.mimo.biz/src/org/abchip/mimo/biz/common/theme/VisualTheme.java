/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visual Theme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.VisualTheme#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeSetId <em>Visual Theme Set Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualTheme()
 * @model annotation="mimo-ent-frame help='The VisualTheme entity contains one entry per visual theme.' title='Defines a Visual Theme' dictionary='CommonEntityLabels' formula='description'"
 * @generated
 */
public interface VisualTheme extends BizEntity {
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
	 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualTheme_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.theme.VisualTheme#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Visual Theme Set Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visual Theme Set Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Theme Set Id</em>' reference.
	 * @see #setVisualThemeSetId(VisualThemeSet)
	 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualTheme_VisualThemeSetId()
	 * @model keys="visualThemeSetId"
	 * @generated
	 */
	VisualThemeSet getVisualThemeSetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeSetId <em>Visual Theme Set Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Set Id</em>' reference.
	 * @see #getVisualThemeSetId()
	 * @generated
	 */
	void setVisualThemeSetId(VisualThemeSet value);

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
	 * @see org.abchip.mimo.biz.common.theme.ThemePackage#getVisualTheme_VisualThemeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisualThemeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.theme.VisualTheme#getVisualThemeId <em>Visual Theme Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Theme Id</em>' attribute.
	 * @see #getVisualThemeId()
	 * @generated
	 */
	void setVisualThemeId(String value);

} // VisualTheme
