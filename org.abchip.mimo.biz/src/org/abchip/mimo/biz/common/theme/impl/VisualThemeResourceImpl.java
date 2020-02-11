/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme.impl;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.theme.ThemePackage;
import org.abchip.mimo.biz.common.theme.VisualTheme;
import org.abchip.mimo.biz.common.theme.VisualThemeResource;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visual Theme Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getVisualThemeId <em>Visual Theme Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getResourceTypeEnumId <em>Resource Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getSequenceId <em>Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.theme.impl.VisualThemeResourceImpl#getResourceValue <em>Resource Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisualThemeResourceImpl extends BizEntityImpl implements VisualThemeResource {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisualThemeResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThemePackage.Literals.VISUAL_THEME_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceValue() {
		return (String)eGet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__RESOURCE_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceValue(String newResourceValue) {
		eSet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__RESOURCE_VALUE, newResourceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSequenceId() {
		return (String)eGet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__SEQUENCE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceId(String newSequenceId) {
		eSet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__SEQUENCE_ID, newSequenceId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualTheme getVisualThemeId() {
		return (VisualTheme)eGet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualThemeId(VisualTheme newVisualThemeId) {
		eSet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__VISUAL_THEME_ID, newVisualThemeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getResourceTypeEnumId() {
		return (Enumeration)eGet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceTypeEnumId(Enumeration newResourceTypeEnumId) {
		eSet(ThemePackage.Literals.VISUAL_THEME_RESOURCE__RESOURCE_TYPE_ENUM_ID, newResourceTypeEnumId);
	}

} //VisualThemeResourceImpl
