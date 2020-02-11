/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Item Type Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnHeaderTypeId <em>Return Header Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemMapKey <em>Return Item Map Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemTypeId <em>Return Item Type Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemTypeMap()
 * @model annotation="mimo-ent-frame help='Mapping between productTypeId and returnItemTypeId for product order items, orderItemTypeId and returnItemTypeId for other\n          order items, or orderAdjustmentTypeId and returnAdjustmentTypeId.  Separate mappings for different types of returns (customer vs. vendor)'"
 * @generated
 */
public interface ReturnItemTypeMap extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Return Header Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Header Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Header Type Id</em>' reference.
	 * @see #setReturnHeaderTypeId(ReturnHeaderType)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemTypeMap_ReturnHeaderTypeId()
	 * @model keys="returnHeaderTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ReturnHeaderType getReturnHeaderTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnHeaderTypeId <em>Return Header Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Header Type Id</em>' reference.
	 * @see #getReturnHeaderTypeId()
	 * @generated
	 */
	void setReturnHeaderTypeId(ReturnHeaderType value);

	/**
	 * Returns the value of the '<em><b>Return Item Map Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Map Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Map Key</em>' attribute.
	 * @see #setReturnItemMapKey(String)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemTypeMap_ReturnItemMapKey()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getReturnItemMapKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemMapKey <em>Return Item Map Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Map Key</em>' attribute.
	 * @see #getReturnItemMapKey()
	 * @generated
	 */
	void setReturnItemMapKey(String value);

	/**
	 * Returns the value of the '<em><b>Return Item Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Item Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Item Type Id</em>' reference.
	 * @see #setReturnItemTypeId(ReturnItemType)
	 * @see org.abchip.mimo.biz.order.return_.ReturnPackage#getReturnItemTypeMap_ReturnItemTypeId()
	 * @model keys="returnItemTypeId"
	 * @generated
	 */
	ReturnItemType getReturnItemTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.return_.ReturnItemTypeMap#getReturnItemTypeId <em>Return Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Item Type Id</em>' reference.
	 * @see #getReturnItemTypeId()
	 * @generated
	 */
	void setReturnItemTypeId(ReturnItemType value);

} // ReturnItemTypeMap
