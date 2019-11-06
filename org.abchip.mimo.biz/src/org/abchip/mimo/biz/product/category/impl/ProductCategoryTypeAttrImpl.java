/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategoryType;
import org.abchip.mimo.biz.product.category.ProductCategoryTypeAttr;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Type Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeAttrImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeAttrImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryTypeAttrImpl#getProductCategoryTypeId <em>Product Category Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryTypeAttrImpl extends BizEntityImpl implements ProductCategoryTypeAttr {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getProductCategoryTypeId() <em>Product Category Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategoryType productCategoryTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryTypeAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_TYPE_ATTR;
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
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		attrName = newAttrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryType getProductCategoryTypeId() {
		if (productCategoryTypeId != null && ((EObject)productCategoryTypeId).eIsProxy()) {
			InternalEObject oldProductCategoryTypeId = (InternalEObject)productCategoryTypeId;
			productCategoryTypeId = (ProductCategoryType)eResolveProxy(oldProductCategoryTypeId);
			if (productCategoryTypeId != oldProductCategoryTypeId) {
			}
		}
		return productCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategoryType basicGetProductCategoryTypeId() {
		return productCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryTypeId(ProductCategoryType newProductCategoryTypeId) {
		productCategoryTypeId = newProductCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__ATTR_NAME:
				return getAttrName();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__DESCRIPTION:
				return getDescription();
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__PRODUCT_CATEGORY_TYPE_ID:
				if (resolve) return getProductCategoryTypeId();
				return basicGetProductCategoryTypeId();
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
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__PRODUCT_CATEGORY_TYPE_ID:
				setProductCategoryTypeId((ProductCategoryType)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__PRODUCT_CATEGORY_TYPE_ID:
				setProductCategoryTypeId((ProductCategoryType)null);
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
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CategoryPackage.PRODUCT_CATEGORY_TYPE_ATTR__PRODUCT_CATEGORY_TYPE_ID:
				return productCategoryTypeId != null;
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
		result.append(" (attrName: ");
		result.append(attrName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryTypeAttrImpl
