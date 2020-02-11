/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.util.List;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryAttribute;
import org.abchip.mimo.biz.product.category.ProductCategoryType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getCategoryImageUrl <em>Category Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getDetailScreen <em>Detail Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getLinkOneImageUrl <em>Link One Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getLinkTwoImageUrl <em>Link Two Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getPrimaryParentCategoryId <em>Primary Parent Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getProductCategoryAttributes <em>Product Category Attributes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#getProductCategoryTypeId <em>Product Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryImpl#isShowInSelect <em>Show In Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryImpl extends BizEntityTypedImpl<ProductCategoryType> implements ProductCategory {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryImageUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryImageUrl(String newCategoryImageUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_IMAGE_URL, newCategoryImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCategoryName() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategoryName(String newCategoryName) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__CATEGORY_NAME, newCategoryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailScreen() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__DETAIL_SCREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailScreen(String newDetailScreen) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__DETAIL_SCREEN, newDetailScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkOneImageUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkOneImageUrl(String newLinkOneImageUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_ONE_IMAGE_URL, newLinkOneImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkTwoImageUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTwoImageUrl(String newLinkTwoImageUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__LINK_TWO_IMAGE_URL, newLinkTwoImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLongDescription() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__LONG_DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongDescription(String newLongDescription) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__LONG_DESCRIPTION, newLongDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowInSelect() {
		return (Boolean)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__SHOW_IN_SELECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowInSelect(boolean newShowInSelect) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__SHOW_IN_SELECT, newShowInSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategoryType getProductCategoryTypeId() {
		return (ProductCategoryType)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryTypeId(ProductCategoryType newProductCategoryTypeId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_TYPE_ID, newProductCategoryTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getPrimaryParentCategoryId() {
		return (ProductCategory)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentCategoryId(ProductCategory newPrimaryParentCategoryId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRIMARY_PARENT_CATEGORY_ID, newPrimaryParentCategoryId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategoryAttribute> getProductCategoryAttributes() {
		return (List<ProductCategoryAttribute>)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY__PRODUCT_CATEGORY_ID, newProductCategoryId);
	}

} //ProductCategoryImpl
