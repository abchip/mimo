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
 * A representation of the model object '<em><b>Product Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductKeyword#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductKeyword#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductKeyword#getKeywordTypeId <em>Keyword Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductKeyword#getRelevancyWeight <em>Relevancy Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.product.ProductKeyword#getStatusId <em>Status Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductKeyword()
 * @model
 * @generated
 */
public interface ProductKeyword extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductKeyword_Keyword()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Keyword Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Type Id</em>' attribute.
	 * @see #setKeywordTypeId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductKeyword_KeywordTypeId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Enumeration'"
	 * @generated
	 */
	String getKeywordTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getKeywordTypeId <em>Keyword Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword Type Id</em>' attribute.
	 * @see #getKeywordTypeId()
	 * @generated
	 */
	void setKeywordTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Relevancy Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevancy Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevancy Weight</em>' attribute.
	 * @see #setRelevancyWeight(long)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductKeyword_RelevancyWeight()
	 * @model
	 * @generated
	 */
	long getRelevancyWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getRelevancyWeight <em>Relevancy Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevancy Weight</em>' attribute.
	 * @see #getRelevancyWeight()
	 * @generated
	 */
	void setRelevancyWeight(long value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductKeyword_StatusId()
	 * @model annotation="mimo-ent-domain frame='StatusItem'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

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
	 * @see org.abchip.mimo.biz.product.product.ProductPackage#getProductKeyword_ProductId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.product.ProductKeyword#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

} // ProductKeyword
