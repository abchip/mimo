/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.common.theme.ThemePackage
 * @generated
 */
public interface ThemeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThemeFactory eINSTANCE = org.abchip.mimo.biz.common.theme.impl.ThemeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Visual Theme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Theme</em>'.
	 * @generated
	 */
	VisualTheme createVisualTheme();

	/**
	 * Returns a new object of class '<em>Visual Theme Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Theme Resource</em>'.
	 * @generated
	 */
	VisualThemeResource createVisualThemeResource();

	/**
	 * Returns a new object of class '<em>Visual Theme Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visual Theme Set</em>'.
	 * @generated
	 */
	VisualThemeSet createVisualThemeSet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ThemePackage getThemePackage();

} //ThemeFactory
