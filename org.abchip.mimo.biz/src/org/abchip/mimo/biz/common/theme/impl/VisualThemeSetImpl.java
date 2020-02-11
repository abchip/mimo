/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme.impl;

import org.abchip.mimo.biz.common.theme.ThemePackage;
import org.abchip.mimo.biz.common.theme.VisualThemeSet;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Theme Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeSetImpl#getVisualThemeSetId <em>Visual Theme Set Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeSetImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualThemeSetImpl extends BizEntityImpl implements VisualThemeSet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualThemeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThemePackage.Literals.VISUAL_THEME_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ThemePackage.Literals.VISUAL_THEME_SET__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ThemePackage.Literals.VISUAL_THEME_SET__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisualThemeSetId() {
		return (String)eGet(ThemePackage.Literals.VISUAL_THEME_SET__VISUAL_THEME_SET_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeSetId(String newVisualThemeSetId) {
		eSet(ThemePackage.Literals.VISUAL_THEME_SET__VISUAL_THEME_SET_ID, newVisualThemeSetId);
	}

} //VisualThemeSetImpl
