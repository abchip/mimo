/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.ProductFeatureCategory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryImpl#getProductFeatureCategoryId <em>Product Feature Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureCategoryImpl#getParentCategoryId <em>Parent Category Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureCategoryImpl extends BizEntityImpl implements ProductFeatureCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductFeatureCategoryId() <em>Product Feature Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureCategoryId() <em>Product Feature Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureCategoryId = PRODUCT_FEATURE_CATEGORY_ID_EDEFAULT;

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
	 * The default value of the '{@link #getParentCategoryId() <em>Parent Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentCategoryId() <em>Parent Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String parentCategoryId = PARENT_CATEGORY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE_CATEGORY;
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_CATEGORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentCategoryId() {
		return parentCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentCategoryId(String newParentCategoryId) {
		String oldParentCategoryId = parentCategoryId;
		parentCategoryId = newParentCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_CATEGORY__PARENT_CATEGORY_ID, oldParentCategoryId, parentCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childProductFeatureCategories() {
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
	public List<String> productFeatures() {
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
	public String getProductFeatureCategoryId() {
		return productFeatureCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureCategoryId(String newProductFeatureCategoryId) {
		String oldProductFeatureCategoryId = productFeatureCategoryId;
		productFeatureCategoryId = newProductFeatureCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_CATEGORY__PRODUCT_FEATURE_CATEGORY_ID, oldProductFeatureCategoryId, productFeatureCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PRODUCT_FEATURE_CATEGORY_ID:
				return getProductFeatureCategoryId();
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__DESCRIPTION:
				return getDescription();
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PARENT_CATEGORY_ID:
				return getParentCategoryId();
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
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PRODUCT_FEATURE_CATEGORY_ID:
				setProductFeatureCategoryId((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PARENT_CATEGORY_ID:
				setParentCategoryId((String)newValue);
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
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PRODUCT_FEATURE_CATEGORY_ID:
				setProductFeatureCategoryId(PRODUCT_FEATURE_CATEGORY_ID_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PARENT_CATEGORY_ID:
				setParentCategoryId(PARENT_CATEGORY_ID_EDEFAULT);
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
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PRODUCT_FEATURE_CATEGORY_ID:
				return PRODUCT_FEATURE_CATEGORY_ID_EDEFAULT == null ? productFeatureCategoryId != null : !PRODUCT_FEATURE_CATEGORY_ID_EDEFAULT.equals(productFeatureCategoryId);
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FeaturePackage.PRODUCT_FEATURE_CATEGORY__PARENT_CATEGORY_ID:
				return PARENT_CATEGORY_ID_EDEFAULT == null ? parentCategoryId != null : !PARENT_CATEGORY_ID_EDEFAULT.equals(parentCategoryId);
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
		result.append(" (productFeatureCategoryId: ");
		result.append(productFeatureCategoryId);
		result.append(", description: ");
		result.append(description);
		result.append(", parentCategoryId: ");
		result.append(parentCategoryId);
		result.append(')');
		return result.toString();
	}

} //ProductFeatureCategoryImpl
