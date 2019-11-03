/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vendor Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.VendorProduct#getVendorPartyId <em>Vendor Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getVendorProduct()
 * @model
 * @generated
 */
public interface VendorProduct extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Product Store Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #setProductStoreGroupId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getVendorProduct_ProductStoreGroupId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStoreGroup'"
	 * @generated
	 */
	String getProductStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductStoreGroupId <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Id</em>' attribute.
	 * @see #getProductStoreGroupId()
	 * @generated
	 */
	void setProductStoreGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party Id</em>' attribute.
	 * @see #setVendorPartyId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getVendorProduct_VendorPartyId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getVendorPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.VendorProduct#getVendorPartyId <em>Vendor Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party Id</em>' attribute.
	 * @see #getVendorPartyId()
	 * @generated
	 */
	void setVendorPartyId(String value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getVendorProduct_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

} // VendorProduct
