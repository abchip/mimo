/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getCategoryImageUrl <em>Category Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getLinkOneImageUrl <em>Link One Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getLinkTwoImageUrl <em>Link Two Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getPrimaryParentCategoryId <em>Primary Parent Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getProductCategoryTypeId <em>Product Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#isShowInSelect <em>Show In Select</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.ProductCategory#getProductCategoryAttributes <em>Product Category Attributes</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ProductCategory extends BizEntityTyped<ProductCategoryType> {
	/**
	 * Returns the value of the '<em><b>Category Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Image Url</em>' attribute.
	 * @see #setCategoryImageUrl(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_CategoryImageUrl()
	 * @model
	 * @generated
	 */
	String getCategoryImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getCategoryImageUrl <em>Category Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Image Url</em>' attribute.
	 * @see #getCategoryImageUrl()
	 * @generated
	 */
	void setCategoryImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_CategoryName()
	 * @model
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

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
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Detail Screen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail Screen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Screen</em>' attribute.
	 * @see #setDetailScreen(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_DetailScreen()
	 * @model
	 * @generated
	 */
	String getDetailScreen();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getDetailScreen <em>Detail Screen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Screen</em>' attribute.
	 * @see #getDetailScreen()
	 * @generated
	 */
	void setDetailScreen(String value);

	/**
	 * Returns the value of the '<em><b>Link One Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link One Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link One Image Url</em>' attribute.
	 * @see #setLinkOneImageUrl(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_LinkOneImageUrl()
	 * @model
	 * @generated
	 */
	String getLinkOneImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getLinkOneImageUrl <em>Link One Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link One Image Url</em>' attribute.
	 * @see #getLinkOneImageUrl()
	 * @generated
	 */
	void setLinkOneImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Link Two Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Two Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Two Image Url</em>' attribute.
	 * @see #setLinkTwoImageUrl(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_LinkTwoImageUrl()
	 * @model
	 * @generated
	 */
	String getLinkTwoImageUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getLinkTwoImageUrl <em>Link Two Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Two Image Url</em>' attribute.
	 * @see #getLinkTwoImageUrl()
	 * @generated
	 */
	void setLinkTwoImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see #setLongDescription(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_LongDescription()
	 * @model
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getLongDescription <em>Long Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Description</em>' attribute.
	 * @see #getLongDescription()
	 * @generated
	 */
	void setLongDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Category Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Attributes</em>' attribute list.
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_ProductCategoryAttributes()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductCategoryAttribute'"
	 * @generated
	 */
	List<String> getProductCategoryAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductCategory' route='primaryParentCategoryId'"
	 * @generated
	 */
	List<String> primaryChildProductCategories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='primaryProductCategoryId'"
	 * @generated
	 */
	List<String> primaryProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreSurveyAppl' route='productCategoryId'"
	 * @generated
	 */
	List<String> productStoreSurveyAppls();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecastDetail' route='productCategoryId'"
	 * @generated
	 */
	List<String> salesForecastDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='productCategoryId'"
	 * @generated
	 */
	List<String> subscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='TaxAuthorityRateProduct' route='productCategoryId'"
	 * @generated
	 */
	List<String> taxAuthorityRateProducts();

	/**
	 * Returns the value of the '<em><b>Product Category Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Type Id</em>' attribute.
	 * @see #setProductCategoryTypeId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_ProductCategoryTypeId()
	 * @model annotation="mimo-ent-domain frame='ProductCategoryType'"
	 * @generated
	 */
	String getProductCategoryTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getProductCategoryTypeId <em>Product Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Type Id</em>' attribute.
	 * @see #getProductCategoryTypeId()
	 * @generated
	 */
	void setProductCategoryTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Show In Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show In Select</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show In Select</em>' attribute.
	 * @see #setShowInSelect(boolean)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_ShowInSelect()
	 * @model
	 * @generated
	 */
	boolean isShowInSelect();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#isShowInSelect <em>Show In Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show In Select</em>' attribute.
	 * @see #isShowInSelect()
	 * @generated
	 */
	void setShowInSelect(boolean value);

	/**
	 * Returns the value of the '<em><b>Primary Parent Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Parent Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Parent Category Id</em>' attribute.
	 * @see #setPrimaryParentCategoryId(String)
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_PrimaryParentCategoryId()
	 * @model annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getPrimaryParentCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getPrimaryParentCategoryId <em>Primary Parent Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Parent Category Id</em>' attribute.
	 * @see #getPrimaryParentCategoryId()
	 * @generated
	 */
	void setPrimaryParentCategoryId(String value);

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
	 * @see org.abchip.mimo.biz.product.category.CategoryPackage#getProductCategory_ProductCategoryId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.category.ProductCategory#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

} // ProductCategory
