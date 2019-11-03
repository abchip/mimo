/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getPromoSequenceId <em>Promo Sequence Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getProductPromoCodeId <em>Product Promo Code Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getQuantityLeftInActions <em>Quantity Left In Actions</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getTotalDiscountAmount <em>Total Discount Amount</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse()
 * @model
 * @generated
 */
public interface ProductPromoUse extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse_OrderId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader'"
	 * @generated
	 */
	String getOrderId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Promo Sequence Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promo Sequence Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promo Sequence Id</em>' attribute.
	 * @see #setPromoSequenceId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse_PromoSequenceId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getPromoSequenceId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getPromoSequenceId <em>Promo Sequence Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promo Sequence Id</em>' attribute.
	 * @see #getPromoSequenceId()
	 * @generated
	 */
	void setPromoSequenceId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity Left In Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Left In Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Left In Actions</em>' attribute.
	 * @see #setQuantityLeftInActions(BigDecimal)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse_QuantityLeftInActions()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantityLeftInActions();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getQuantityLeftInActions <em>Quantity Left In Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Left In Actions</em>' attribute.
	 * @see #getQuantityLeftInActions()
	 * @generated
	 */
	void setQuantityLeftInActions(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Total Discount Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Discount Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Discount Amount</em>' attribute.
	 * @see #setTotalDiscountAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse_TotalDiscountAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getTotalDiscountAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getTotalDiscountAmount <em>Total Discount Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Discount Amount</em>' attribute.
	 * @see #getTotalDiscountAmount()
	 * @generated
	 */
	void setTotalDiscountAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Product Promo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Id</em>' attribute.
	 * @see #setProductPromoId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse_ProductPromoId()
	 * @model annotation="mimo-ent-domain frame='ProductPromo'"
	 * @generated
	 */
	String getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getProductPromoId <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' attribute.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Code Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Code Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Code Id</em>' attribute.
	 * @see #setProductPromoCodeId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoUse_ProductPromoCodeId()
	 * @model annotation="mimo-ent-domain frame='ProductPromoCode'"
	 * @generated
	 */
	String getProductPromoCodeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoUse#getProductPromoCodeId <em>Product Promo Code Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Code Id</em>' attribute.
	 * @see #getProductPromoCodeId()
	 * @generated
	 */
	void setProductPromoCodeId(String value);

} // ProductPromoUse
