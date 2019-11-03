/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Promo Cond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getInputParamEnumId <em>Input Param Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getOperatorEnumId <em>Operator Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getOtherValue <em>Other Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond()
 * @model
 * @generated
 */
public interface ProductPromoCond extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Cond Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond Value</em>' attribute.
	 * @see #setCondValue(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_CondValue()
	 * @model
	 * @generated
	 */
	String getCondValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getCondValue <em>Cond Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond Value</em>' attribute.
	 * @see #getCondValue()
	 * @generated
	 */
	void setCondValue(String value);

	/**
	 * Returns the value of the '<em><b>Custom Method Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Id</em>' attribute.
	 * @see #setCustomMethodId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_CustomMethodId()
	 * @model annotation="mimo-ent-domain frame='CustomMethod'"
	 * @generated
	 */
	String getCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getCustomMethodId <em>Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Id</em>' attribute.
	 * @see #getCustomMethodId()
	 * @generated
	 */
	void setCustomMethodId(String value);

	/**
	 * Returns the value of the '<em><b>Input Param Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Param Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Param Enum Id</em>' attribute.
	 * @see #setInputParamEnumId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_InputParamEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getInputParamEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getInputParamEnumId <em>Input Param Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Param Enum Id</em>' attribute.
	 * @see #getInputParamEnumId()
	 * @generated
	 */
	void setInputParamEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Operator Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Enum Id</em>' attribute.
	 * @see #setOperatorEnumId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_OperatorEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getOperatorEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getOperatorEnumId <em>Operator Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Enum Id</em>' attribute.
	 * @see #getOperatorEnumId()
	 * @generated
	 */
	void setOperatorEnumId(String value);

	/**
	 * Returns the value of the '<em><b>Other Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Value</em>' attribute.
	 * @see #setOtherValue(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_OtherValue()
	 * @model
	 * @generated
	 */
	String getOtherValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getOtherValue <em>Other Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Value</em>' attribute.
	 * @see #getOtherValue()
	 * @generated
	 */
	void setOtherValue(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Cond Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Cond Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Cond Seq Id</em>' attribute.
	 * @see #setProductPromoCondSeqId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_ProductPromoCondSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPromoCondSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Cond Seq Id</em>' attribute.
	 * @see #getProductPromoCondSeqId()
	 * @generated
	 */
	void setProductPromoCondSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Rule Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Rule Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #setProductPromoRuleId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_ProductPromoRuleId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPromoRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoRuleId <em>Product Promo Rule Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Rule Id</em>' attribute.
	 * @see #getProductPromoRuleId()
	 * @generated
	 */
	void setProductPromoRuleId(String value);

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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_ProductPromoId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromo'"
	 * @generated
	 */
	String getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoId <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' attribute.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(String value);

} // ProductPromoCond
