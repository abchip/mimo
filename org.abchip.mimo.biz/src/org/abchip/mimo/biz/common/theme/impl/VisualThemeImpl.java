/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme.impl;

import org.abchip.mimo.biz.common.theme.ThemePackage;
import org.abchip.mimo.biz.common.theme.VisualTheme;
import org.abchip.mimo.biz.common.theme.VisualThemeSet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Theme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeImpl#getVisualThemeSetId <em>Visual Theme Set Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualThemeImpl extends BizEntityImpl implements VisualTheme {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualThemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThemePackage.Literals.VISUAL_THEME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ThemePackage.Literals.VISUAL_THEME__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ThemePackage.Literals.VISUAL_THEME__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualThemeSet getVisualThemeSetId() {
		return (VisualThemeSet)eGet(ThemePackage.Literals.VISUAL_THEME__VISUAL_THEME_SET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeSetId(VisualThemeSet newVisualThemeSetId) {
		eSet(ThemePackage.Literals.VISUAL_THEME__VISUAL_THEME_SET_ID, newVisualThemeSetId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisualThemeId() {
		return (String)eGet(ThemePackage.Literals.VISUAL_THEME__VISUAL_THEME_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeId(String newVisualThemeId) {
		eSet(ThemePackage.Literals.VISUAL_THEME__VISUAL_THEME_ID, newVisualThemeId);
	}

} //VisualThemeImpl
