/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategoryContent;
import org.abchip.mimo.biz.product.category.ProductCategoryContentType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getProdCatContentTypeId <em>Prod Cat Content Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getPurchaseFromDate <em>Purchase From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getPurchaseThruDate <em>Purchase Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getUseCountLimit <em>Use Count Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryContentImpl#getUseDaysLimit <em>Use Days Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryContentImpl extends BizEntityTypedImpl<ProductCategoryContentType> implements ProductCategoryContent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProdCatContentTypeId() <em>Prod Cat Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROD_CAT_CONTENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdCatContentTypeId() <em>Prod Cat Content Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String prodCatContentTypeId = PROD_CAT_CONTENT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseFromDate() <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseFromDate() <em>Purchase From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseFromDate = PURCHASE_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurchaseThruDate() <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PURCHASE_THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchaseThruDate() <em>Purchase Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchaseThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date purchaseThruDate = PURCHASE_THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCountLimit() <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCountLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long USE_COUNT_LIMIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUseCountLimit() <em>Use Count Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCountLimit()
	 * @generated
	 * @ordered
	 */
	protected long useCountLimit = USE_COUNT_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseDaysLimit() <em>Use Days Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDaysLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal USE_DAYS_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseDaysLimit() <em>Use Days Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseDaysLimit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal useDaysLimit = USE_DAYS_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseFromDate() {
		return purchaseFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseFromDate(Date newPurchaseFromDate) {
		Date oldPurchaseFromDate = purchaseFromDate;
		purchaseFromDate = newPurchaseFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_FROM_DATE, oldPurchaseFromDate, purchaseFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPurchaseThruDate() {
		return purchaseThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurchaseThruDate(Date newPurchaseThruDate) {
		Date oldPurchaseThruDate = purchaseThruDate;
		purchaseThruDate = newPurchaseThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_THRU_DATE, oldPurchaseThruDate, purchaseThruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getUseCountLimit() {
		return useCountLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseCountLimit(long newUseCountLimit) {
		long oldUseCountLimit = useCountLimit;
		useCountLimit = newUseCountLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_COUNT_LIMIT, oldUseCountLimit, useCountLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getUseDaysLimit() {
		return useDaysLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseDaysLimit(BigDecimal newUseDaysLimit) {
		BigDecimal oldUseDaysLimit = useDaysLimit;
		useDaysLimit = newUseDaysLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_DAYS_LIMIT, oldUseDaysLimit, useDaysLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdCatContentTypeId() {
		return prodCatContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatContentTypeId(String newProdCatContentTypeId) {
		String oldProdCatContentTypeId = prodCatContentTypeId;
		prodCatContentTypeId = newProdCatContentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_CONTENT__PROD_CAT_CONTENT_TYPE_ID, oldProdCatContentTypeId, prodCatContentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PRODUCT_CATEGORY_ID:
				return getProductCategoryId();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__CONTENT_ID:
				return getContentId();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PROD_CAT_CONTENT_TYPE_ID:
				return getProdCatContentTypeId();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__FROM_DATE:
				return getFromDate();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_FROM_DATE:
				return getPurchaseFromDate();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_THRU_DATE:
				return getPurchaseThruDate();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__THRU_DATE:
				return getThruDate();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_COUNT_LIMIT:
				return getUseCountLimit();
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_DAYS_LIMIT:
				return getUseDaysLimit();
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
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PRODUCT_CATEGORY_ID:
				setProductCategoryId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PROD_CAT_CONTENT_TYPE_ID:
				setProdCatContentTypeId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_FROM_DATE:
				setPurchaseFromDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_THRU_DATE:
				setPurchaseThruDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_COUNT_LIMIT:
				setUseCountLimit((Long)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_DAYS_LIMIT:
				setUseDaysLimit((BigDecimal)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PRODUCT_CATEGORY_ID:
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PROD_CAT_CONTENT_TYPE_ID:
				setProdCatContentTypeId(PROD_CAT_CONTENT_TYPE_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_FROM_DATE:
				setPurchaseFromDate(PURCHASE_FROM_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_THRU_DATE:
				setPurchaseThruDate(PURCHASE_THRU_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_COUNT_LIMIT:
				setUseCountLimit(USE_COUNT_LIMIT_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_DAYS_LIMIT:
				setUseDaysLimit(USE_DAYS_LIMIT_EDEFAULT);
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
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PRODUCT_CATEGORY_ID:
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PROD_CAT_CONTENT_TYPE_ID:
				return PROD_CAT_CONTENT_TYPE_ID_EDEFAULT == null ? prodCatContentTypeId != null : !PROD_CAT_CONTENT_TYPE_ID_EDEFAULT.equals(prodCatContentTypeId);
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_FROM_DATE:
				return PURCHASE_FROM_DATE_EDEFAULT == null ? purchaseFromDate != null : !PURCHASE_FROM_DATE_EDEFAULT.equals(purchaseFromDate);
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__PURCHASE_THRU_DATE:
				return PURCHASE_THRU_DATE_EDEFAULT == null ? purchaseThruDate != null : !PURCHASE_THRU_DATE_EDEFAULT.equals(purchaseThruDate);
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_COUNT_LIMIT:
				return useCountLimit != USE_COUNT_LIMIT_EDEFAULT;
			case CategoryPackage.PRODUCT_CATEGORY_CONTENT__USE_DAYS_LIMIT:
				return USE_DAYS_LIMIT_EDEFAULT == null ? useDaysLimit != null : !USE_DAYS_LIMIT_EDEFAULT.equals(useDaysLimit);
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
		result.append(" (productCategoryId: ");
		result.append(productCategoryId);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", prodCatContentTypeId: ");
		result.append(prodCatContentTypeId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", purchaseFromDate: ");
		result.append(purchaseFromDate);
		result.append(", purchaseThruDate: ");
		result.append(purchaseThruDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", useCountLimit: ");
		result.append(useCountLimit);
		result.append(", useDaysLimit: ");
		result.append(useDaysLimit);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryContentImpl
