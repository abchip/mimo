/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Calculated Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getAverageCustomerRating <em>Average Customer Rating</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalQuantityOrdered <em>Total Quantity Ordered</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalTimesViewed <em>Total Times Viewed</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductCalculatedInfo()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductCalculatedInfo extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Average Customer Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Customer Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Customer Rating</em>' attribute.
	 * @see #setAverageCustomerRating(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductCalculatedInfo_AverageCustomerRating()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getAverageCustomerRating();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getAverageCustomerRating <em>Average Customer Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Customer Rating</em>' attribute.
	 * @see #getAverageCustomerRating()
	 * @generated
	 */
	void setAverageCustomerRating(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductCalculatedInfo_ProductId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Total Quantity Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Quantity Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Quantity Ordered</em>' attribute.
	 * @see #setTotalQuantityOrdered(BigDecimal)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductCalculatedInfo_TotalQuantityOrdered()
	 * @model annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
	 * @generated
	 */
	BigDecimal getTotalQuantityOrdered();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalQuantityOrdered <em>Total Quantity Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Quantity Ordered</em>' attribute.
	 * @see #getTotalQuantityOrdered()
	 * @generated
	 */
	void setTotalQuantityOrdered(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Times Viewed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Times Viewed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Times Viewed</em>' attribute.
	 * @see #setTotalTimesViewed(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductCalculatedInfo_TotalTimesViewed()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getTotalTimesViewed();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductCalculatedInfo#getTotalTimesViewed <em>Total Times Viewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Times Viewed</em>' attribute.
	 * @see #getTotalTimesViewed()
	 * @generated
	 */
	void setTotalTimesViewed(long value);

} // ProductCalculatedInfo
