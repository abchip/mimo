/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Feature Cat Grp Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCatGrpAppl()
 * @model
 * @generated
 */
public interface ProductFeatureCatGrpAppl extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCatGrpAppl_FromDate()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCatGrpAppl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCatGrpAppl_ProductCategoryId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Group Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Group Id</em>' reference.
	 * @see #setProductFeatureGroupId(ProductFeatureGroup)
	 * @see org.abchip.mimo.biz.product.feature.FeaturePackage#getProductFeatureCatGrpAppl_ProductFeatureGroupId()
	 * @model keys="productFeatureGroupId"
	 * @generated
	 */
	ProductFeatureGroup getProductFeatureGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.feature.ProductFeatureCatGrpAppl#getProductFeatureGroupId <em>Product Feature Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Group Id</em>' reference.
	 * @see #getProductFeatureGroupId()
	 * @generated
	 */
	void setProductFeatureGroupId(ProductFeatureGroup value);

} // ProductFeatureCatGrpAppl
