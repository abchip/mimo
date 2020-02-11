/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Pref Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierPrefOrder()
 * @model annotation="mimo-ent-frame title='Preference Type' dictionary='ProductEntityLabels' formula='description'"
 * @generated
 */
public interface SupplierPrefOrder extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierPrefOrder_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Pref Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Pref Order Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Pref Order Id</em>' attribute.
	 * @see #setSupplierPrefOrderId(String)
	 * @see org.abchip.mimo.biz.product.supplier.SupplierPackage#getSupplierPrefOrder_SupplierPrefOrderId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getSupplierPrefOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.supplier.SupplierPrefOrder#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Pref Order Id</em>' attribute.
	 * @see #getSupplierPrefOrderId()
	 * @generated
	 */
	void setSupplierPrefOrderId(String value);

} // SupplierPrefOrder
