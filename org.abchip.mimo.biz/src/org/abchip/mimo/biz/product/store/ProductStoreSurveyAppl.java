/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store Survey Appl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreSurveyId <em>Product Store Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getResultTemplate <em>Result Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyApplTypeId <em>Survey Appl Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyId <em>Survey Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyTemplate <em>Survey Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl()
 * @model
 * @generated
 */
public interface ProductStoreSurveyAppl extends BizEntity {
	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_GroupName()
	 * @model
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Survey Id</em>' attribute.
	 * @see #setProductStoreSurveyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_ProductStoreSurveyId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getProductStoreSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreSurveyId <em>Product Store Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Survey Id</em>' attribute.
	 * @see #getProductStoreSurveyId()
	 * @generated
	 */
	void setProductStoreSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Result Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Template</em>' attribute.
	 * @see #setResultTemplate(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_ResultTemplate()
	 * @model
	 * @generated
	 */
	String getResultTemplate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getResultTemplate <em>Result Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Template</em>' attribute.
	 * @see #getResultTemplate()
	 * @generated
	 */
	void setResultTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num</em>' attribute.
	 * @see #setSequenceNum(long)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

	/**
	 * Returns the value of the '<em><b>Survey Appl Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Appl Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Appl Type Id</em>' attribute.
	 * @see #setSurveyApplTypeId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_SurveyApplTypeId()
	 * @model annotation="mimo-ent-domain frame='SurveyApplType'"
	 * @generated
	 */
	String getSurveyApplTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyApplTypeId <em>Survey Appl Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Appl Type Id</em>' attribute.
	 * @see #getSurveyApplTypeId()
	 * @generated
	 */
	void setSurveyApplTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Id</em>' attribute.
	 * @see #setSurveyId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_SurveyId()
	 * @model annotation="mimo-ent-domain frame='Survey'"
	 * @generated
	 */
	String getSurveyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyId <em>Survey Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Id</em>' attribute.
	 * @see #getSurveyId()
	 * @generated
	 */
	void setSurveyId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Template</em>' attribute.
	 * @see #setSurveyTemplate(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_SurveyTemplate()
	 * @model
	 * @generated
	 */
	String getSurveyTemplate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getSurveyTemplate <em>Survey Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Template</em>' attribute.
	 * @see #getSurveyTemplate()
	 * @generated
	 */
	void setSurveyTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_ProductStoreId()
	 * @model annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_ProductId()
	 * @model annotation="mimo-ent-domain frame='Product'"
	 * @generated
	 */
	String getProductId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductId <em>Product Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Id</em>' attribute.
	 * @see #getProductId()
	 * @generated
	 */
	void setProductId(String value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreSurveyAppl_ProductCategoryId()
	 * @model annotation="mimo-ent-domain frame='ProductCategory'"
	 * @generated
	 */
	String getProductCategoryId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreSurveyAppl#getProductCategoryId <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category Id</em>' attribute.
	 * @see #getProductCategoryId()
	 * @generated
	 */
	void setProductCategoryId(String value);

} // ProductStoreSurveyAppl
