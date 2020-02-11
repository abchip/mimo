/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.abchip.mimo.biz.security.login.UserLogin;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getProductReviewId <em>Product Review Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#isPostedAnonymous <em>Posted Anonymous</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getPostedDateTime <em>Posted Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getProductRating <em>Product Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getProductReview <em>Product Review</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductReview#getUserLoginId <em>User Login Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductReview extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Posted Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Date Time</em>' attribute.
	 * @see #setPostedDateTime(Date)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_PostedDateTime()
	 * @model
	 * @generated
	 */
	Date getPostedDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getPostedDateTime <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Date Time</em>' attribute.
	 * @see #getPostedDateTime()
	 * @generated
	 */
	void setPostedDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Product Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Rating</em>' attribute.
	 * @see #setProductRating(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_ProductRating()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getProductRating();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductRating <em>Product Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Rating</em>' attribute.
	 * @see #getProductRating()
	 * @generated
	 */
	void setProductRating(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Review</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Review</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Review</em>' attribute.
	 * @see #setProductReview(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_ProductReview()
	 * @model
	 * @generated
	 */
	String getProductReview();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductReview <em>Product Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Review</em>' attribute.
	 * @see #getProductReview()
	 * @generated
	 */
	void setProductReview(String value);

	/**
	 * Returns the value of the '<em><b>Product Review Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Review Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Review Id</em>' attribute.
	 * @see #setProductReviewId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_ProductReviewId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductReviewId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductReviewId <em>Product Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Review Id</em>' attribute.
	 * @see #getProductReviewId()
	 * @generated
	 */
	void setProductReviewId(String value);

	/**
	 * Returns the value of the '<em><b>Posted Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posted Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posted Anonymous</em>' attribute.
	 * @see #setPostedAnonymous(boolean)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_PostedAnonymous()
	 * @model
	 * @generated
	 */
	boolean isPostedAnonymous();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#isPostedAnonymous <em>Posted Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Posted Anonymous</em>' attribute.
	 * @see #isPostedAnonymous()
	 * @generated
	 */
	void setPostedAnonymous(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' reference.
	 * @see #setProductStoreId(ProductStore)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_ProductStoreId()
	 * @model keys="productStoreId"
	 * @generated
	 */
	ProductStore getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductStoreId <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' reference.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(ProductStore value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' reference.
	 * @see #setStatusId(StatusItem)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_StatusId()
	 * @model keys="statusId"
	 * @generated
	 */
	StatusItem getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getStatusId <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' reference.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(StatusItem value);

	/**
	 * Returns the value of the '<em><b>User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Id</em>' reference.
	 * @see #setUserLoginId(UserLogin)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_UserLoginId()
	 * @model keys="userLoginId"
	 * @generated
	 */
	UserLogin getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getUserLoginId <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' reference.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(UserLogin value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' reference.
	 * @see #setProductId(Product)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductReview_ProductId()
	 * @model keys="productId"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductReview#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

} // ProductReview
