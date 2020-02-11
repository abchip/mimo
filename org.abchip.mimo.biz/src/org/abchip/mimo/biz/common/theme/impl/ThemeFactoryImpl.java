/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.theme.impl;

import org.abchip.mimo.biz.common.theme.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThemeFactoryImpl extends EFactoryImpl implements ThemeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThemeFactory init() {
		try {
			ThemeFactory theThemeFactory = (ThemeFactory)EPackage.Registry.INSTANCE.getEFactory(ThemePackage.eNS_URI);
			if (theThemeFactory != null) {
				return theThemeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThemeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThemeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ThemePackage.VISUAL_THEME: return (EObject)createVisualTheme();
			case ThemePackage.VISUAL_THEME_RESOURCE: return (EObject)createVisualThemeResource();
			case ThemePackage.VISUAL_THEME_SET: return (EObject)createVisualThemeSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualTheme createVisualTheme() {
		VisualThemeImpl visualTheme = new VisualThemeImpl();
		return visualTheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualThemeResource createVisualThemeResource() {
		VisualThemeResourceImpl visualThemeResource = new VisualThemeResourceImpl();
		return visualThemeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisualThemeSet createVisualThemeSet() {
		VisualThemeSetImpl visualThemeSet = new VisualThemeSetImpl();
		return visualThemeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThemePackage getThemePackage() {
		return (ThemePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThemePackage getPackage() {
		return ThemePackage.eINSTANCE;
	}

} //ThemeFactoryImpl
