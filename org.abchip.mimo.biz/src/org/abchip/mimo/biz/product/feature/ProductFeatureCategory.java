/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getProductFeatureCategoryId <em>Product Feature Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getParentCategoryId <em>Parent Category Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCategory()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ProductFeatureCategory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCategory_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Category Id</em>' attribute.
	 * @see #setParentCategoryId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCategory_ParentCategoryId()
	 * @model annotation="mimo-ent-domain frame='ProductFeatureCategory'"
	 * @generated
	 */
	String getParentCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getParentCategoryId <em>Parent Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Category Id</em>' attribute.
	 * @see #getParentCategoryId()
	 * @generated
	 */
	void setParentCategoryId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductFeatureCategory' route='parentCategoryId'"
	 * @generated
	 */
	List<String> childProductFeatureCategories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductFeature' route='productFeatureCategoryId'"
	 * @generated
	 */
	List<String> productFeatures();

	/**
	 * Returns the value of the '<em><b>Product Feature Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Category Id</em>' attribute.
	 * @see #setProductFeatureCategoryId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCategory_ProductFeatureCategoryId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductFeatureCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCategory#getProductFeatureCategoryId <em>Product Feature Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Category Id</em>' attribute.
	 * @see #getProductFeatureCategoryId()
	 * @generated
	 */
	void setProductFeatureCategoryId(String value);

} // ProductFeatureCategory
