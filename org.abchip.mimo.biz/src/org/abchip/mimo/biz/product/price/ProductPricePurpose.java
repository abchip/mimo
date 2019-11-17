/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import java.util.List;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Price Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPricePurpose#getProductPricePurposeId <em>Product Price Purpose Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.price.ProductPricePurpose#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPricePurpose()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ProductPricePurpose extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPricePurpose_Description()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPricePurpose#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderPaymentPreference' route='productPricePurposeId'"
	 * @generated
	 */
	List<String> orderPaymentPreferences();

	/**
	 * Returns the value of the '<em><b>Product Price Purpose Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Price Purpose Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Price Purpose Id</em>' attribute.
	 * @see #setProductPricePurposeId(String)
	 * @see org.abchip.mimo.biz.product.price.PricePackage#getProductPricePurpose_ProductPricePurposeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format type='id' length='20'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPricePurposeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.price.ProductPricePurpose#getProductPricePurposeId <em>Product Price Purpose Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Price Purpose Id</em>' attribute.
	 * @see #getProductPricePurposeId()
	 * @generated
	 */
	void setProductPricePurposeId(String value);

} // ProductPricePurpose
