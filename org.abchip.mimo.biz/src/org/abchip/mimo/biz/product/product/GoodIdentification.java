/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.product;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Good Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.GoodIdentification#getGoodIdentificationTypeId <em>Good Identification Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.GoodIdentification#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.GoodIdentification#getIdValue <em>Id Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getGoodIdentification()
 * @model annotation="mimo-ent-frame dictionary='ProductEntityLabels'"
 * @generated
 */
public interface GoodIdentification extends BizEntityTyped<GoodIdentificationType> {
	/**
	 * Returns the value of the '<em><b>Id Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Value</em>' attribute.
	 * @see #setIdValue(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getGoodIdentification_IdValue()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getIdValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.GoodIdentification#getIdValue <em>Id Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Value</em>' attribute.
	 * @see #getIdValue()
	 * @generated
	 */
	void setIdValue(String value);

	/**
	 * Returns the value of the '<em><b>Good Identification Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Good Identification Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Good Identification Type Id</em>' reference.
	 * @see #setGoodIdentificationTypeId(GoodIdentificationType)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getGoodIdentification_GoodIdentificationTypeId()
	 * @model keys="goodIdentificationTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	GoodIdentificationType getGoodIdentificationTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.GoodIdentification#getGoodIdentificationTypeId <em>Good Identification Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Good Identification Type Id</em>' reference.
	 * @see #getGoodIdentificationTypeId()
	 * @generated
	 */
	void setGoodIdentificationTypeId(GoodIdentificationType value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getGoodIdentification_ProductId()
	 * @model keys="productId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Product getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.GoodIdentification#getProductId <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' reference.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(Product value);

} // GoodIdentification
