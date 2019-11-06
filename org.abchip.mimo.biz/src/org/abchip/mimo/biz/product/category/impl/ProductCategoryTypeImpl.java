/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeImpl#getProductCategoryTypeId <em>Product Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeImpl#getProductCategoryTypeAttrs <em>Product Category Type Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryTypeImpl extends BizEntityTypeImpl<ProductCategory> implements ProductCategoryType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductCategoryTypeId() <em>Product Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCategoryTypeId() <em>Product Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryTypeId = PRODUCT_CATEGORY_TYPE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategoryType parentTypeId;

	/**
	 * The cached value of the '{@link #getProductCategoryTypeAttrs() <em>Product Category Type Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryTypeAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> productCategoryTypeAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_TYPE;
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
	public ProductCategoryType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ProductCategoryType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategoryType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ProductCategoryType newParentTypeId) {
		parentTypeId = newParentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryTypeId() {
		return productCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryTypeId(String newProductCategoryTypeId) {
		productCategoryTypeId = newProductCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getProductCategoryTypeAttrs() {
		if (productCategoryTypeAttrs == null) {
			productCategoryTypeAttrs = new BasicInternalEList<String>(String.class);
		}
		return productCategoryTypeAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childProductCategoryTypes() {
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
	public List<String> productCategories() {
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
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ID:
				return getProductCategoryTypeId();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__DESCRIPTION:
				return getDescription();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__HAS_TABLE:
				return isHasTable();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ATTRS:
				return getProductCategoryTypeAttrs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ID:
				setProductCategoryTypeId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProductCategoryType)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ATTRS:
				getProductCategoryTypeAttrs().clear();
				getProductCategoryTypeAttrs().addAll((Collection<? extends String>)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ID:
				setProductCategoryTypeId(PRODUCT_CATEGORY_TYPE_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProductCategoryType)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ATTRS:
				getProductCategoryTypeAttrs().clear();
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
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ID:
				return PRODUCT_CATEGORY_TYPE_ID_EDEFAULT == null ? productCategoryTypeId != null : !PRODUCT_CATEGORY_TYPE_ID_EDEFAULT.equals(productCategoryTypeId);
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE__PRODUCT_CATEGORY_TYPE_ATTRS:
				return productCategoryTypeAttrs != null && !productCategoryTypeAttrs.isEmpty();
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
		result.append(" (productCategoryTypeId: ");
		result.append(productCategoryTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(", productCategoryTypeAttrs: ");
		result.append(productCategoryTypeAttrs);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryTypeImpl
