/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.abchip.mimo.biz.product.product.ProductReview;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.security.login.UserLogin;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductReviewId <em>Product Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#isPostedAnonymous <em>Posted Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getPostedDateTime <em>Posted Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductRating <em>Product Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductReview <em>Product Review</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getUserLoginId <em>User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductReviewImpl extends BizEntityImpl implements ProductReview {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPostedDateTime() {
		return (Date)eGet(ProductPackage.Literals.PRODUCT_REVIEW__POSTED_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedDateTime(Date newPostedDateTime) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__POSTED_DATE_TIME, newPostedDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductRating() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_RATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductRating(BigDecimal newProductRating) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_RATING, newProductRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductReview() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_REVIEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductReview(String newProductReview) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_REVIEW, newProductReview);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductReviewId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_REVIEW_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductReviewId(String newProductReviewId) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_REVIEW_ID, newProductReviewId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPostedAnonymous() {
		return (Boolean)eGet(ProductPackage.Literals.PRODUCT_REVIEW__POSTED_ANONYMOUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedAnonymous(boolean newPostedAnonymous) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__POSTED_ANONYMOUS, newPostedAnonymous);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		return (ProductStore)eGet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		return (StatusItem)eGet(ProductPackage.Literals.PRODUCT_REVIEW__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		return (UserLogin)eGet(ProductPackage.Literals.PRODUCT_REVIEW__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__USER_LOGIN_ID, newUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(ProductPackage.Literals.PRODUCT_REVIEW__PRODUCT_ID, newProductId);
	}

} //ProductReviewImpl
