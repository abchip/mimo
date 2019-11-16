/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.screen.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.common.screen.CustomScreen;
import org.abchip.mimo.biz.common.screen.CustomScreenType;
import org.abchip.mimo.biz.common.screen.ScreenPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Screen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl#getCustomScreenTypeId <em>Custom Screen Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.screen.impl.CustomScreenTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomScreenTypeImpl extends BizEntityTypeImpl<CustomScreen> implements CustomScreenType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomScreenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScreenPackage.Literals.CUSTOM_SCREEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomScreenTypeId() {
		return (String)eGet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenTypeId(String newCustomScreenTypeId) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID, newCustomScreenTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return (Boolean)eGet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__HAS_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__HAS_TABLE, newHasTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return (String)eGet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		eSet(ScreenPackage.Literals.CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID, newParentTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childCustomScreenTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> customScreens() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ScreenPackage.CUSTOM_SCREEN_TYPE___CHILD_CUSTOM_SCREEN_TYPES:
				return childCustomScreenTypes();
			case ScreenPackage.CUSTOM_SCREEN_TYPE___CUSTOM_SCREENS:
				return customScreens();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomScreenTypeImpl
