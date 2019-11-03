/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
 * @model
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
	 * @model
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
	 * Returns the value of the '<em><b>Product Feature Iactn Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Iactn Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Iactn Type Id</em>' attribute.
	 * @see #setProductFeatureIactnTypeId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn_ProductFeatureIactnTypeId()
	 * @model annotation="mimo-ent-domain frame='ProductFeatureIactnType'"
	 * @generated
	 */
	String getProductFeatureIactnTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIactnTypeId <em>Product Feature Iactn Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Iactn Type Id</em>' attribute.
	 * @see #getProductFeatureIactnTypeId()
	 * @generated
	 */
	void setProductFeatureIactnTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id</em>' attribute.
	 * @see #setProductFeatureId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn_ProductFeatureId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductFeature'"
	 * @generated
	 */
	String getProductFeatureId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureId <em>Product Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id</em>' attribute.
	 * @see #getProductFeatureId()
	 * @generated
	 */
	void setProductFeatureId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Id To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Id To</em>' attribute.
	 * @see #setProductFeatureIdTo(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureIactn_ProductFeatureIdTo()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductFeature'"
	 * @generated
	 */
	String getProductFeatureIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureIactn#getProductFeatureIdTo <em>Product Feature Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Id To</em>' attribute.
	 * @see #getProductFeatureIdTo()
	 * @generated
	 */
	void setProductFeatureIdTo(String value);

} // ProductFeatureIactn
