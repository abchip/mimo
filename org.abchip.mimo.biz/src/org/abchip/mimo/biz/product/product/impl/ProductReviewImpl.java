/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductRating <em>Product Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductReview <em>Product Review</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductReviewImpl#getStatusId <em>Status Id</em>}</li>
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
	 * The default value of the '{@link #getProductReviewId() <em>Product Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReviewId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_REVIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductReviewId() <em>Product Review Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReviewId()
	 * @generated
	 * @ordered
	 */
	protected String productReviewId = PRODUCT_REVIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostedAnonymous() <em>Posted Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostedAnonymous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSTED_ANONYMOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostedAnonymous() <em>Posted Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostedAnonymous()
	 * @generated
	 * @ordered
	 */
	protected boolean postedAnonymous = POSTED_ANONYMOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostedDateTime() <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date POSTED_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostedDateTime() <em>Posted Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostedDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date postedDateTime = POSTED_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductRating() <em>Product Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductRating()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRODUCT_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductRating() <em>Product Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductRating()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal productRating = PRODUCT_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductReview() <em>Product Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReview()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_REVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductReview() <em>Product Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReview()
	 * @generated
	 * @ordered
	 */
	protected String productReview = PRODUCT_REVIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

	/**
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected UserLogin userLoginId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

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
		return postedDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedDateTime(Date newPostedDateTime) {
		Date oldPostedDateTime = postedDateTime;
		postedDateTime = newPostedDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__POSTED_DATE_TIME, oldPostedDateTime, postedDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getProductRating() {
		return productRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductRating(BigDecimal newProductRating) {
		BigDecimal oldProductRating = productRating;
		productRating = newProductRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__PRODUCT_RATING, oldProductRating, productRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductReview() {
		return productReview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductReview(String newProductReview) {
		String oldProductReview = productReview;
		productReview = newProductReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW, oldProductReview, productReview));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductReviewId() {
		return productReviewId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductReviewId(String newProductReviewId) {
		String oldProductReviewId = productReviewId;
		productReviewId = newProductReviewId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW_ID, oldProductReviewId, productReviewId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPostedAnonymous() {
		return postedAnonymous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostedAnonymous(boolean newPostedAnonymous) {
		boolean oldPostedAnonymous = postedAnonymous;
		postedAnonymous = newPostedAnonymous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__POSTED_ANONYMOUS, oldPostedAnonymous, postedAnonymous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_REVIEW__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		ProductStore oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_REVIEW__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserLogin getUserLoginId() {
		if (userLoginId != null && ((EObject)userLoginId).eIsProxy()) {
			InternalEObject oldUserLoginId = (InternalEObject)userLoginId;
			userLoginId = (UserLogin)eResolveProxy(oldUserLoginId);
			if (userLoginId != oldUserLoginId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_REVIEW__USER_LOGIN_ID, oldUserLoginId, userLoginId));
			}
		}
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserLogin basicGetUserLoginId() {
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(UserLogin newUserLoginId) {
		UserLogin oldUserLoginId = userLoginId;
		userLoginId = newUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__USER_LOGIN_ID, oldUserLoginId, userLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_REVIEW__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_REVIEW__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW_ID:
				return getProductReviewId();
			case ProductPackage.PRODUCT_REVIEW__POSTED_ANONYMOUS:
				return isPostedAnonymous();
			case ProductPackage.PRODUCT_REVIEW__POSTED_DATE_TIME:
				return getPostedDateTime();
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_RATING:
				return getProductRating();
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW:
				return getProductReview();
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case ProductPackage.PRODUCT_REVIEW__USER_LOGIN_ID:
				if (resolve) return getUserLoginId();
				return basicGetUserLoginId();
			case ProductPackage.PRODUCT_REVIEW__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW_ID:
				setProductReviewId((String)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__POSTED_ANONYMOUS:
				setPostedAnonymous((Boolean)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__POSTED_DATE_TIME:
				setPostedDateTime((Date)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_RATING:
				setProductRating((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW:
				setProductReview((String)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__USER_LOGIN_ID:
				setUserLoginId((UserLogin)newValue);
				return;
			case ProductPackage.PRODUCT_REVIEW__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW_ID:
				setProductReviewId(PRODUCT_REVIEW_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_REVIEW__POSTED_ANONYMOUS:
				setPostedAnonymous(POSTED_ANONYMOUS_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_REVIEW__POSTED_DATE_TIME:
				setPostedDateTime(POSTED_DATE_TIME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_RATING:
				setProductRating(PRODUCT_RATING_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW:
				setProductReview(PRODUCT_REVIEW_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
				return;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case ProductPackage.PRODUCT_REVIEW__USER_LOGIN_ID:
				setUserLoginId((UserLogin)null);
				return;
			case ProductPackage.PRODUCT_REVIEW__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW_ID:
				return PRODUCT_REVIEW_ID_EDEFAULT == null ? productReviewId != null : !PRODUCT_REVIEW_ID_EDEFAULT.equals(productReviewId);
			case ProductPackage.PRODUCT_REVIEW__POSTED_ANONYMOUS:
				return postedAnonymous != POSTED_ANONYMOUS_EDEFAULT;
			case ProductPackage.PRODUCT_REVIEW__POSTED_DATE_TIME:
				return POSTED_DATE_TIME_EDEFAULT == null ? postedDateTime != null : !POSTED_DATE_TIME_EDEFAULT.equals(postedDateTime);
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_RATING:
				return PRODUCT_RATING_EDEFAULT == null ? productRating != null : !PRODUCT_RATING_EDEFAULT.equals(productRating);
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_REVIEW:
				return PRODUCT_REVIEW_EDEFAULT == null ? productReview != null : !PRODUCT_REVIEW_EDEFAULT.equals(productReview);
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_STORE_ID:
				return productStoreId != null;
			case ProductPackage.PRODUCT_REVIEW__PRODUCT_ID:
				return productId != null;
			case ProductPackage.PRODUCT_REVIEW__USER_LOGIN_ID:
				return userLoginId != null;
			case ProductPackage.PRODUCT_REVIEW__STATUS_ID:
				return statusId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (productReviewId: ");
		result.append(productReviewId);
		result.append(", postedAnonymous: ");
		result.append(postedAnonymous);
		result.append(", postedDateTime: ");
		result.append(postedDateTime);
		result.append(", productRating: ");
		result.append(productRating);
		result.append(", productReview: ");
		result.append(productReview);
		result.append(')');
		return result.toString();
	}

} //ProductReviewImpl
