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
 * A representation of the model object '<em><b>Product Promo Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoId <em>Product Promo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoRuleId <em>Product Promo Rule Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getAndGroupId <em>And Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#isIncludeSubCategories <em>Include Sub Categories</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoApplEnumId <em>Product Promo Appl Enum Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory()
 * @model
 * @generated
 */
public interface ProductPromoCategory extends BizEntity {
	/**
	 * Returns the value of the '<em><b>And Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Group Id</em>' attribute.
	 * @see #setAndGroupId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_AndGroupId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAndGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getAndGroupId <em>And Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Group Id</em>' attribute.
	 * @see #getAndGroupId()
	 * @generated
	 */
	void setAndGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Include Sub Categories</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Sub Categories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #setIncludeSubCategories(boolean)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_IncludeSubCategories()
	 * @model
	 * @generated
	 */
	boolean isIncludeSubCategories();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#isIncludeSubCategories <em>Include Sub Categories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Sub Categories</em>' attribute.
	 * @see #isIncludeSubCategories()
	 * @generated
	 */
	void setIncludeSubCategories(boolean value);

	/**
	 * Returns the value of the '<em><b>Product Promo Action Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Action Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #setProductPromoActionSeqId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_ProductPromoActionSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPromoActionSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoActionSeqId <em>Product Promo Action Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Action Seq Id</em>' attribute.
	 * @see #getProductPromoActionSeqId()
	 * @generated
	 */
	void setProductPromoActionSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Product Promo Appl Enum Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Promo Appl Enum Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Promo Appl Enum Id</em>' attribute.
	 * @see #setProductPromoApplEnumId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_ProductPromoApplEnumId()
	 * @model annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getProductPromoApplEnumId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoApplEnumId <em>Product Promo Appl Enum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Appl Enum Id</em>' attribute.
	 * @see #getProductPromoApplEnumId()
	 * @generated
	 */
	void setProductPromoApplEnumId(String value);

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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_ProductPromoCondSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPromoCondSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoCondSeqId <em>Product Promo Cond Seq Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_ProductPromoRuleId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductPromoRuleId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoRuleId <em>Product Promo Rule Id</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_ProductPromoId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductPromo'"
	 * @generated
	 */
	String getProductPromoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductPromoId <em>Product Promo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Promo Id</em>' attribute.
	 * @see #getProductPromoId()
	 * @generated
	 */
	void setProductPromoId(String value);

	/**
	 * Returns the value of the '<em><b>Product Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Category Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category Id</em>' attribute.
	 * @see #setProductCategoryId(String)
	 * @see org.abchip.mimo.biz.product.promo.PromoPackage#getProductPromoCategory_ProductCategoryId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.promo.ProductPromoCategory#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

} // ProductPromoCategory
