/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.order;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Adjustment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#getParentTypeId <em>Parent Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#getOrderAdjustmentTypeAttrs <em>Order Adjustment Type Attrs</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface OrderAdjustmentType extends BizEntityType<OrderAdjustment> {
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
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Table</em>' attribute.
	 * @see #setHasTable(boolean)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentType_HasTable()
	 * @model
	 * @generated
	 */
	boolean isHasTable();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#isHasTable <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Table</em>' attribute.
	 * @see #isHasTable()
	 * @generated
	 */
	void setHasTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Adjustment Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Type Id</em>' attribute.
	 * @see #setOrderAdjustmentTypeId(String)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentType_OrderAdjustmentTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getOrderAdjustmentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#getOrderAdjustmentTypeId <em>Order Adjustment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Adjustment Type Id</em>' attribute.
	 * @see #getOrderAdjustmentTypeId()
	 * @generated
	 */
	void setOrderAdjustmentTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Type Id</em>' reference.
	 * @see #setParentTypeId(OrderAdjustmentType)
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentType_ParentTypeId()
	 * @model keys="orderAdjustmentTypeId"
	 * @generated
	 */
	OrderAdjustmentType getParentTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.order.OrderAdjustmentType#getParentTypeId <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Type Id</em>' reference.
	 * @see #getParentTypeId()
	 * @generated
	 */
	void setParentTypeId(OrderAdjustmentType value);

	/**
	 * Returns the value of the '<em><b>Order Adjustment Type Attrs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Adjustment Type Attrs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Adjustment Type Attrs</em>' attribute list.
	 * @see org.abchip.mimo.biz.order.order.OrderPackage#getOrderAdjustmentType_OrderAdjustmentTypeAttrs()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustmentTypeAttr'"
	 * @generated
	 */
	List<String> getOrderAdjustmentTypeAttrs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustmentType' route='parentTypeId'"
	 * @generated
	 */
	List<String> childOrderAdjustmentTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderAdjustment' route='orderAdjustmentTypeId'"
	 * @generated
	 */
	List<String> orderAdjustments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteAdjustment' route='quoteAdjustmentTypeId'"
	 * @generated
	 */
	List<String> quoteAdjustments();

} // OrderAdjustmentType