/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature Data Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getDataResourceId <em>Data Resource Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getProductFeatureId <em>Product Feature Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureDataResource()
 * @model
 * @generated
 */
public interface ProductFeatureDataResource extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Data Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Resource Id</em>' attribute.
	 * @see #setDataResourceId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureDataResource_DataResourceId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getDataResourceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getDataResourceId <em>Data Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Resource Id</em>' attribute.
	 * @see #getDataResourceId()
	 * @generated
	 */
	void setDataResourceId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' reference.
	 * @see #setProductFeatureId(ProductFeature)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureDataResource_ProductFeatureId()
	 * @model keys="productFeatureId"
	 * @generated
	 */
	ProductFeature getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureDataResource#getProductFeatureId <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' reference.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(ProductFeature value);

} // ProductFeatureDataResource
