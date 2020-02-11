/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.catalog;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prod Catalog Category Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategoryType()
 * @model annotation="mimo-ent-frame title='Catalog Category Association Type' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface ProdCatalogCategoryType extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategoryType_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(ProdCatalogCategoryType)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategoryType_ParentTypeId()
	 * @model keys="prodCatalogCategoryTypeId"
	 * @generated
	 */
	ProdCatalogCategoryType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(ProdCatalogCategoryType value);

	/**
	 * Returns the value of the '<em><b>Prod Catalog Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prod Catalog Category Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prod Catalog Category Type Id</em>' attribute.
	 * @see #setProdCatalogCategoryTypeId(String)
	 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage#getProdCatalogCategoryType_ProdCatalogCategoryTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProdCatalogCategoryTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prod Catalog Category Type Id</em>' attribute.
	 * @see #getProdCatalogCategoryTypeId()
	 * @generated
	 */
	void setProdCatalogCategoryTypeId(String value);

} // ProdCatalogCategoryType
