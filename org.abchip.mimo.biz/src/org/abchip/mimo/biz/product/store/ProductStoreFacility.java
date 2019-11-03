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
 * A representation of the model object '<em><b>Product Store Facility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFacility()
 * @model
 * @generated
 */
public interface ProductStoreFacility extends BizEntity {
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFacility_FromDate()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFacility_SequenceNum()
	 * @model
	 * @generated
	 */
	long getSequenceNum();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getSequenceNum <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num</em>' attribute.
	 * @see #getSequenceNum()
	 * @generated
	 */
	void setSequenceNum(long value);

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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFacility_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getThruDate <em>Thru Date</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFacility_ProductStoreId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore'"
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' attribute.
	 * @see #setFacilityId(String)
	 * @see org.abchip.mimo.biz.product.store.StorePackage#getProductStoreFacility_FacilityId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='Facility'"
	 * @generated
	 */
	String getFacilityId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.product.store.ProductStoreFacility#getFacilityId <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Id</em>' attribute.
	 * @see #getFacilityId()
	 * @generated
	 */
	void setFacilityId(String value);

} // ProductStoreFacility
