/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature Iactn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureId <em>Product Feature Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIdTo <em>Product Feature Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIactnTypeId <em>Product Feature Iactn Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductId <em>Product Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn()
 * @model annotation="mimo-ent-frame title='Product Feature Interaction' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductFeatureIactn extends BizEntityTyped<ProductFeatureIactnType> {
	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn_ProductId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Iactn Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Iactn Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Iactn Type Id</em>' reference.
	 * @see #setProductFeatureIactnTypeId(ProductFeatureIactnType)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn_ProductFeatureIactnTypeId()
	 * @model keys="productFeatureIactnTypeId"
	 * @generated
	 */
	ProductFeatureIactnType getProductFeatureIactnTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIactnTypeId <em>Product Feature Iactn Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Iactn Type Id</em>' reference.
	 * @see #getProductFeatureIactnTypeId()
	 * @generated
	 */
	void setProductFeatureIactnTypeId(ProductFeatureIactnType value);

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
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn_ProductFeatureId()
	 * @model keys="productFeatureId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductFeature getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureId <em>Product Feature Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' reference.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(ProductFeature value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id To</em>' reference.
	 * @see #setProductFeatureIdTo(ProductFeature)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn_ProductFeatureIdTo()
	 * @model keys="productFeatureId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductFeature getProductFeatureIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIdTo <em>Product Feature Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id To</em>' reference.
	 * @see #getProductFeatureIdTo()
	 * @generated
	 */
	void setProductFeatureIdTo(ProductFeature value);

} // ProductFeatureIactn
