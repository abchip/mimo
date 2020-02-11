/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryLink;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getLinkSeqId <em>Link Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getDetailSubScreen <em>Detail Sub Screen</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getDetailText <em>Detail Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getImageTwoUrl <em>Image Two Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getLinkInfo <em>Link Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getLinkTypeEnumId <em>Link Type Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryLinkImpl#getTitleText <em>Title Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryLinkImpl extends BizEntityImpl implements ProductCategoryLink {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__COMMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments(String newComments) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__COMMENTS, newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailSubScreen() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailSubScreen(String newDetailSubScreen) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__DETAIL_SUB_SCREEN, newDetailSubScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDetailText() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__DETAIL_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailText(String newDetailText) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__DETAIL_TEXT, newDetailText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageTwoUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageTwoUrl(String newImageTwoUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__IMAGE_TWO_URL, newImageTwoUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__IMAGE_URL, newImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkInfo() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__LINK_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkInfo(String newLinkInfo) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__LINK_INFO, newLinkInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLinkSeqId() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__LINK_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkSeqId(String newLinkSeqId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__LINK_SEQ_ID, newLinkSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getLinkTypeEnumId() {
		return (Enumeration)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTypeEnumId(Enumeration newLinkTypeEnumId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__LINK_TYPE_ENUM_ID, newLinkTypeEnumId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return (Long)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__SEQUENCE_NUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__SEQUENCE_NUM, newSequenceNum);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitleText() {
		return (String)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__TITLE_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitleText(String newTitleText) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__TITLE_TEXT, newTitleText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		return (ProductCategory)eGet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		eSet(CategoryPackage.Literals.PRODUCT_CATEGORY_LINK__PRODUCT_CATEGORY_ID, newProductCategoryId);
	}

} //ProductCategoryLinkImpl
