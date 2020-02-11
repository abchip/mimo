/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.screen.impl;

import org.abchip.mimo.biz.common.screen.CustomScreen;
import org.abchip.mimo.biz.common.screen.CustomScreenType;
import org.abchip.mimo.biz.common.screen.ScreenPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Screen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenId <em>Custom Screen Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenLocation <em>Custom Screen Location</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenName <em>Custom Screen Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getCustomScreenTypeId <em>Custom Screen Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomScreenImpl extends BizEntityTypedImpl<CustomScreenType> implements CustomScreen {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomScreenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenPackage.Literals.CUSTOM_SCREEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenId() {
		return (String)eGet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenId(String newCustomScreenId) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_ID, newCustomScreenId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenLocation() {
		return (String)eGet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenLocation(String newCustomScreenLocation) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_LOCATION, newCustomScreenLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenName() {
		return (String)eGet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenName(String newCustomScreenName) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_NAME, newCustomScreenName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomScreenType getCustomScreenTypeId() {
		return (CustomScreenType)eGet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenTypeId(CustomScreenType newCustomScreenTypeId) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN__CUSTOM_SCREEN_TYPE_ID, newCustomScreenTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ScreenPackage.Literals.CUSTOM_SCREEN__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN__DESCRIPTION, newDescription);
	}

} //CustomScreenImpl
