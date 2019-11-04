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
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.product.ProductCalculatedInfo;
import org.abchip.mimo.biz.product.product.ProductPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Calculated Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getAverageCustomerRating <em>Average Customer Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getTotalQuantityOrdered <em>Total Quantity Ordered</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getTotalTimesViewed <em>Total Times Viewed</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.impl.ProductCalculatedInfoImpl#getProductId <em>Product Id</em>}</li>
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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID, oldProductId, productId));
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
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				return getAverageCustomerRating();
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				return getTotalQuantityOrdered();
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				return getTotalTimesViewed();
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
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
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				setAverageCustomerRating((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				setTotalQuantityOrdered((BigDecimal)newValue);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				setTotalTimesViewed((Long)newValue);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				setProductId((Product)newValue);
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
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				setAverageCustomerRating(AVERAGE_CUSTOMER_RATING_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				setTotalQuantityOrdered(TOTAL_QUANTITY_ORDERED_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				setTotalTimesViewed(TOTAL_TIMES_VIEWED_EDEFAULT);
				return;
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				setProductId((Product)null);
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
			case ProductPackage.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING:
				return AVERAGE_CUSTOMER_RATING_EDEFAULT == null ? averageCustomerRating != null : !AVERAGE_CUSTOMER_RATING_EDEFAULT.equals(averageCustomerRating);
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED:
				return TOTAL_QUANTITY_ORDERED_EDEFAULT == null ? totalQuantityOrdered != null : !TOTAL_QUANTITY_ORDERED_EDEFAULT.equals(totalQuantityOrdered);
			case ProductPackage.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED:
				return totalTimesViewed != TOTAL_TIMES_VIEWED_EDEFAULT;
			case ProductPackage.PRODUCT_CALCULATED_INFO__PRODUCT_ID:
				return productId != null;
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
		result.append(" (averageCustomerRating: ");
		result.append(averageCustomerRating);
		result.append(", totalQuantityOrdered: ");
		result.append(totalQuantityOrdered);
		result.append(", totalTimesViewed: ");
		result.append(totalTimesViewed);
		result.append(')');
		return result.toString();
	}

} //ProductCalculatedInfoImpl
