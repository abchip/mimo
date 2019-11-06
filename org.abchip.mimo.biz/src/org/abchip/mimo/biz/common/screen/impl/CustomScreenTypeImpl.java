/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.screen.impl;

import java.util.List;

import org.abchip.mimo.biz.common.screen.CustomScreen;
import org.abchip.mimo.biz.common.screen.CustomScreenType;
import org.abchip.mimo.biz.common.screen.ScreenPackage;
import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
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
	 * The default value of the '{@link #getCustomScreenTypeId() <em>Custom Screen Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_SCREEN_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomScreenTypeId() <em>Custom Screen Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomScreenTypeId()
	 * @generated
	 * @ordered
	 */
	protected String customScreenTypeId = CUSTOM_SCREEN_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;

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
		return customScreenTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomScreenTypeId(String newCustomScreenTypeId) {
		customScreenTypeId = newCustomScreenTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		hasTable = newHasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		parentTypeId = newParentTypeId;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScreenPackage.CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID:
				return getCustomScreenTypeId();
			case ScreenPackage.CUSTOM_SCREEN_TYPE__DESCRIPTION:
				return getDescription();
			case ScreenPackage.CUSTOM_SCREEN_TYPE__HAS_TABLE:
				return isHasTable();
			case ScreenPackage.CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID:
				return getParentTypeId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScreenPackage.CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID:
				setCustomScreenTypeId((String)newValue);
				return;
			case ScreenPackage.CUSTOM_SCREEN_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ScreenPackage.CUSTOM_SCREEN_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case ScreenPackage.CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScreenPackage.CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID:
				setCustomScreenTypeId(CUSTOM_SCREEN_TYPE_ID_EDEFAULT);
				return;
			case ScreenPackage.CUSTOM_SCREEN_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ScreenPackage.CUSTOM_SCREEN_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case ScreenPackage.CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScreenPackage.CUSTOM_SCREEN_TYPE__CUSTOM_SCREEN_TYPE_ID:
				return CUSTOM_SCREEN_TYPE_ID_EDEFAULT == null ? customScreenTypeId != null : !CUSTOM_SCREEN_TYPE_ID_EDEFAULT.equals(customScreenTypeId);
			case ScreenPackage.CUSTOM_SCREEN_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ScreenPackage.CUSTOM_SCREEN_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case ScreenPackage.CUSTOM_SCREEN_TYPE__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (customScreenTypeId: ");
		result.append(customScreenTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(')');
		return result.toString();
	}

} //CustomScreenTypeImpl
