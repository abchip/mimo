/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductMeterTypeId <em>Product Meter Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMeter#getMeterName <em>Meter Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductMeter#getMeterUomId <em>Meter Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter()
 * @model
 * @generated
 */
public interface ProductMeter extends BizEntityTyped<ProductMeterType> {
	/**
	 * Returns the value of the '<em><b>Meter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Name</em>' attribute.
	 * @see #setMeterName(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter_MeterName()
	 * @model
	 * @generated
	 */
	String getMeterName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeter#getMeterName <em>Meter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Name</em>' attribute.
	 * @see #getMeterName()
	 * @generated
	 */
	void setMeterName(String value);

	/**
	 * Returns the value of the '<em><b>Meter Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Uom Id</em>' attribute.
	 * @see #setMeterUomId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter_MeterUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getMeterUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeter#getMeterUomId <em>Meter Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Uom Id</em>' attribute.
	 * @see #getMeterUomId()
	 * @generated
	 */
	void setMeterUomId(String value);

	/**
	 * Returns the value of the '<em><b>Product Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Id</em>' attribute.
	 * @see #setProductId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

	/**
	 * Returns the value of the '<em><b>Product Meter Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Meter Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Meter Type Id</em>' attribute.
	 * @see #setProductMeterTypeId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter_ProductMeterTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductMeterType'"
	 * @generated
	 */
	String getProductMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductMeterTypeId <em>Product Meter Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Meter Type Id</em>' attribute.
	 * @see #getProductMeterTypeId()
	 * @generated
	 */
	void setProductMeterTypeId(String value);

} // ProductMeter
