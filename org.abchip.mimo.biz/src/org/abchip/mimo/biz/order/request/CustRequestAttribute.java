/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.request;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cust Request Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrDescription <em>Attr Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrValue <em>Attr Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getCustRequestId <em>Cust Request Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestAttribute()
 * @model
 * @generated
 */
public interface CustRequestAttribute extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Description</em>' attribute.
	 * @see #setAttrDescription(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestAttribute_AttrDescription()
	 * @model annotation="mimo-ent-format type='description' length='255'"
	 * @generated
	 */
	String getAttrDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrDescription <em>Attr Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Description</em>' attribute.
	 * @see #getAttrDescription()
	 * @generated
	 */
	void setAttrDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestAttribute_AttrName()
	 * @model required="true"
	 *        annotation="mimo-ent-format type='id-long' length='60'"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * Returns the value of the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Value</em>' attribute.
	 * @see #setAttrValue(String)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestAttribute_AttrValue()
	 * @model annotation="mimo-ent-format type='value' length='255'"
	 * @generated
	 */
	String getAttrValue();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getAttrValue <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Value</em>' attribute.
	 * @see #getAttrValue()
	 * @generated
	 */
	void setAttrValue(String value);

	/**
	 * Returns the value of the '<em><b>Cust Request Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust Request Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust Request Id</em>' reference.
	 * @see #setCustRequestId(CustRequest)
	 * @see org.abchip.mimo.biz.order.request.RequestPackage#getCustRequestAttribute_CustRequestId()
	 * @model keys="custRequestId"
	 * @generated
	 */
	CustRequest getCustRequestId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.request.CustRequestAttribute#getCustRequestId <em>Cust Request Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust Request Id</em>' reference.
	 * @see #getCustRequestId()
	 * @generated
	 */
	void setCustRequestId(CustRequest value);

} // CustRequestAttribute
