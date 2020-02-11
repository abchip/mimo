/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;

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
 * @model annotation="mimo-ent-frame help='For information related to a specific vendor and product, especially for multi-vendor stores. The ProductStoreGroup is to be used much like in ProductPrice.' dictionary='ProductEntityLabels'"
 * @generated
 */
public interface VendorProduct extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Product Store Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Group Id</em>' reference.
	 * @see #setProductStoreGroupId(ProductStoreGroup)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getVendorProduct_ProductStoreGroupId()
	 * @model keys="productStoreGroupId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductStoreGroup getProductStoreGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductStoreGroupId <em>Product Store Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Group Id</em>' reference.
	 * @see #getProductStoreGroupId()
	 * @generated
	 */
	void setProductStoreGroupId(ProductStoreGroup value);

	/**
	 * Returns the value of the '<em><b>Vendor Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Party Id</em>' reference.
	 * @see #setVendorPartyId(Party)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getVendorProduct_VendorPartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getVendorPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.VendorProduct#getVendorPartyId <em>Vendor Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Party Id</em>' reference.
	 * @see #getVendorPartyId()
	 * @generated
	 */
	void setVendorPartyId(Party value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getVendorProduct_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.VendorProduct#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

} // VendorProduct
