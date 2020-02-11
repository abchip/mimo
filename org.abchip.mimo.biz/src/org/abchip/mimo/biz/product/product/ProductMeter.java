/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.uom.Uom;

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
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface ProductMeter extends BizEntity {
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
	 * @model annotation="mimo-ent-format type='name' length='100'"
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
	 * Returns the value of the '<em><b>Meter Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meter Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meter Uom Id</em>' reference.
	 * @see #setMeterUomId(Uom)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter_MeterUomId()
	 * @model keys="uomId"
	 *        annotation="mimo-ent-slot help='Is on this entity instead of the ProductMeterType entity for more flexibility; for example being able to find all speedometers regardless of their primary unit'"
	 * @generated
	 */
	Uom getMeterUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeter#getMeterUomId <em>Meter Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Uom Id</em>' reference.
	 * @see #getMeterUomId()
	 * @generated
	 */
	void setMeterUomId(Uom value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

	/**
	 * Returns the value of the '<em><b>Product Meter Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Meter Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Meter Type Id</em>' reference.
	 * @see #setProductMeterTypeId(ProductMeterType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductMeter_ProductMeterTypeId()
	 * @model keys="productMeterTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='Part of the primary key as different meters on a machine should have distinct types'"
	 * @generated
	 */
	ProductMeterType getProductMeterTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductMeter#getProductMeterTypeId <em>Product Meter Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Meter Type Id</em>' reference.
	 * @see #getProductMeterTypeId()
	 * @generated
	 */
	void setProductMeterTypeId(ProductMeterType value);

} // ProductMeter
