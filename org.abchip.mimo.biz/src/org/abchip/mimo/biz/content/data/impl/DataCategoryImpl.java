/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.content.data.impl;

import java.util.List;

import org.abchip.mimo.biz.content.data.DataCategory;
import org.abchip.mimo.biz.content.data.DataPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataCategoryImpl#getDataCategoryId <em>Data Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataCategoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.content.data.impl.DataCategoryImpl#getParentCategoryId <em>Parent Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataCategoryImpl extends BizEntityImpl implements DataCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getDataCategoryId() <em>Data Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataCategoryId() <em>Data Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String dataCategoryId = DATA_CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String categoryName = CATEGORY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentCategoryId() <em>Parent Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCategoryId()
	 * @generated
	 * @ordered
	 */
	protected DataCategory parentCategoryId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.DATA_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryName(String newCategoryName) {
		categoryName = newCategoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataCategoryId() {
		return dataCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataCategoryId(String newDataCategoryId) {
		dataCategoryId = newDataCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataCategory getParentCategoryId() {
		if (parentCategoryId != null && ((EObject)parentCategoryId).eIsProxy()) {
			InternalEObject oldParentCategoryId = (InternalEObject)parentCategoryId;
			parentCategoryId = (DataCategory)eResolveProxy(oldParentCategoryId);
			if (parentCategoryId != oldParentCategoryId) {
			}
		}
		return parentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCategory basicGetParentCategoryId() {
		return parentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCategoryId(DataCategory newParentCategoryId) {
		parentCategoryId = newParentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childDataCategories() {
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
	public List<String> dataResources() {
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
			case DataPackage.DATA_CATEGORY__DATA_CATEGORY_ID:
				return getDataCategoryId();
			case DataPackage.DATA_CATEGORY__CATEGORY_NAME:
				return getCategoryName();
			case DataPackage.DATA_CATEGORY__PARENT_CATEGORY_ID:
				if (resolve) return getParentCategoryId();
				return basicGetParentCategoryId();
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
			case DataPackage.DATA_CATEGORY__DATA_CATEGORY_ID:
				setDataCategoryId((String)newValue);
				return;
			case DataPackage.DATA_CATEGORY__CATEGORY_NAME:
				setCategoryName((String)newValue);
				return;
			case DataPackage.DATA_CATEGORY__PARENT_CATEGORY_ID:
				setParentCategoryId((DataCategory)newValue);
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
			case DataPackage.DATA_CATEGORY__DATA_CATEGORY_ID:
				setDataCategoryId(DATA_CATEGORY_ID_EDEFAULT);
				return;
			case DataPackage.DATA_CATEGORY__CATEGORY_NAME:
				setCategoryName(CATEGORY_NAME_EDEFAULT);
				return;
			case DataPackage.DATA_CATEGORY__PARENT_CATEGORY_ID:
				setParentCategoryId((DataCategory)null);
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
			case DataPackage.DATA_CATEGORY__DATA_CATEGORY_ID:
				return DATA_CATEGORY_ID_EDEFAULT == null ? dataCategoryId != null : !DATA_CATEGORY_ID_EDEFAULT.equals(dataCategoryId);
			case DataPackage.DATA_CATEGORY__CATEGORY_NAME:
				return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
			case DataPackage.DATA_CATEGORY__PARENT_CATEGORY_ID:
				return parentCategoryId != null;
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
		result.append(" (dataCategoryId: ");
		result.append(dataCategoryId);
		result.append(", categoryName: ");
		result.append(categoryName);
		result.append(')');
		return result.toString();
	}

} //DataCategoryImpl
