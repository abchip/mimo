/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageCustomerRating(BigDecimal newAverageCustomerRating) {
		eSet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__AVERAGE_CUSTOMER_RATING, newAverageCustomerRating);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductId() {
		return (String)eGet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(String newProductId) {
		eSet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalQuantityOrdered() {
		return (BigDecimal)eGet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalQuantityOrdered(BigDecimal newTotalQuantityOrdered) {
		eSet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__TOTAL_QUANTITY_ORDERED, newTotalQuantityOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalTimesViewed() {
		return (Long)eGet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalTimesViewed(long newTotalTimesViewed) {
		eSet(ProductPackage.Literals.PRODUCT_CALCULATED_INFO__TOTAL_TIMES_VIEWED, newTotalTimesViewed);
	}

} //ProductCalculatedInfoImpl
