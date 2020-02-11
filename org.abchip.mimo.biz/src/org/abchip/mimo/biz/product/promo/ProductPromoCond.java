/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.common.enum_.Enumeration;
import org.abchip.mimo.biz.common.method.CustomMethod;

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
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getCondValue <em>Cond Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getCustomMethodId <em>Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getInputParamEnumId <em>Input Param Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getOperatorEnumId <em>Operator Enum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getOtherValue <em>Other Value</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond()
 * @model annotation="mimo-ent-frame title='Product Promotion Condition' dictionary='ProductEntityLabels'"
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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * Returns the value of the '<em><b>Custom Method Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Method Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Method Id</em>' reference.
	 * @see #setCustomMethodId(CustomMethod)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_CustomMethodId()
	 * @model keys="customMethodId"
	 * @generated
	 */
	CustomMethod getCustomMethodId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getCustomMethodId <em>Custom Method Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Method Id</em>' reference.
	 * @see #getCustomMethodId()
	 * @generated
	 */
	void setCustomMethodId(CustomMethod value);

	/**
	 * Returns the value of the '<em><b>Input Param Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Param Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Param Enum Id</em>' reference.
	 * @see #setInputParamEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_InputParamEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getInputParamEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getInputParamEnumId <em>Input Param Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Param Enum Id</em>' reference.
	 * @see #getInputParamEnumId()
	 * @generated
	 */
	void setInputParamEnumId(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Operator Enum Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Enum Id</em>' reference.
	 * @see #setOperatorEnumId(Enumeration)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_OperatorEnumId()
	 * @model keys="enumId"
	 * @generated
	 */
	Enumeration getOperatorEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getOperatorEnumId <em>Operator Enum Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Enum Id</em>' reference.
	 * @see #getOperatorEnumId()
	 * @generated
	 */
	void setOperatorEnumId(Enumeration value);

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
	 * @model annotation="mimo-ent-format length='255'"
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
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
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
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
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
	 * Returns the value of the '<em><b>Product Promo Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Id</em>' reference.
	 * @see #setProductPromoId(ProductPromo)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCond_ProductPromoId()
	 * @model keys="productPromoId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ProductPromo getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCond#getProductPromoId <em>Product Promo Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' reference.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(ProductPromo value);

} // ProductPromoCond
