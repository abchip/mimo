/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.product.ProductCalculatedInfo;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Calculated Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getAverageCustomerRating <em>Average Customer Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getTotalQuantityOrdered <em>Total Quantity Ordered</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getTotalTimesViewed <em>Total Times Viewed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCalculatedInfoImpl extends BizEntityImpl implements ProductCalculatedInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected String productId = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageCustomerRating() <em>Average Customer Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCustomerRating()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AVERAGE_CUSTOMER_RATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageCustomerRating() <em>Average Customer Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCustomerRating()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal averageCustomerRating = AVERAGE_CUSTOMER_RATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalQuantityOrdered() <em>Total Quantity Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantityOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_QUANTITY_ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalQuantityOrdered() <em>Total Quantity Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantityOrdered()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal totalQuantityOrdered = TOTAL_QUANTITY_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalTimesViewed() <em>Total Times Viewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimesViewed()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_TIMES_VIEWED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalTimesViewed() <em>Total Times Viewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimesViewed()
	 * @generated
	 * @ordered
	 */
	protected long totalTimesViewed = TOTAL_TIMES_VIEWED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCalculatedInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT_CALCULATED_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAverageCustomerRating() {
		return averageCustomerRating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageCustomerRating(BigDecimal newAverageCustomerRating) {
		BigDecimal oldAverageCustomerRating = averageCustomerRating;
		averageCustomerRating = newAverageCustomerRating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING, oldAverageCustomerRating, averageCustomerRating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		String oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalQuantityOrdered() {
		return totalQuantityOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalQuantityOrdered(BigDecimal newTotalQuantityOrdered) {
		BigDecimal oldTotalQuantityOrdered = totalQuantityOrdered;
		totalQuantityOrdered = newTotalQuantityOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED, oldTotalQuantityOrdered, totalQuantityOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalTimesViewed() {
		return totalTimesViewed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalTimesViewed(long newTotalTimesViewed) {
		long oldTotalTimesViewed = totalTimesViewed;
		totalTimesViewed = newTotalTimesViewed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED, oldTotalTimesViewed, totalTimesViewed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				return getProductId();
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				return getAverageCustomerRating();
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				return getTotalQuantityOrdered();
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				return getTotalTimesViewed();
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
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				setProductId((String)newValue);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				setAverageCustomerRating((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				setTotalQuantityOrdered((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				setTotalTimesViewed((Long)newValue);
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
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				setProductId(PRODUCT_ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				setAverageCustomerRating(AVERAGE_CUSTOMER_RATING_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				setTotalQuantityOrdered(TOTAL_QUANTITY_ORDERED_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				setTotalTimesViewed(TOTAL_TIMES_VIEWED_EDEFAULT);
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
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productId != null : !PRODUCT_ID_EDEFAULT.equals(productId);
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				return AVERAGE_CUSTOMER_RATING_EDEFAULT == null ? averageCustomerRating != null : !AVERAGE_CUSTOMER_RATING_EDEFAULT.equals(averageCustomerRating);
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				return TOTAL_QUANTITY_ORDERED_EDEFAULT == null ? totalQuantityOrdered != null : !TOTAL_QUANTITY_ORDERED_EDEFAULT.equals(totalQuantityOrdered);
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				return totalTimesViewed != TOTAL_TIMES_VIEWED_EDEFAULT;
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
		result.append(" (productId: ");
		result.append(productId);
		result.append(", averageCustomerRating: ");
		result.append(averageCustomerRating);
		result.append(", totalQuantityOrdered: ");
		result.append(totalQuantityOrdered);
		result.append(", totalTimesViewed: ");
		result.append(totalTimesViewed);
		result.append(')');
		return result.toString();
	}

} //ProductCalculatedInfoImpl
