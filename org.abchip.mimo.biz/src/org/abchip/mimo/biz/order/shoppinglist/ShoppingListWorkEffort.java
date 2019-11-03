/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping List Work Effort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getWorkEffortId <em>Work Effort Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListWorkEffort()
 * @model
 * @generated
 */
public interface ShoppingListWorkEffort extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Shopping List Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Id</em>' attribute.
	 * @see #setShoppingListId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListWorkEffort_ShoppingListId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingList'"
	 * @generated
	 */
	String getShoppingListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getShoppingListId <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Id</em>' attribute.
	 * @see #getShoppingListId()
	 * @generated
	 */
	void setShoppingListId(String value);

	/**
	 * Returns the value of the '<em><b>Work Effort Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Effort Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Effort Id</em>' attribute.
	 * @see #setWorkEffortId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListWorkEffort_WorkEffortId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort'"
	 * @generated
	 */
	String getWorkEffortId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListWorkEffort#getWorkEffortId <em>Work Effort Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Effort Id</em>' attribute.
	 * @see #getWorkEffortId()
	 * @generated
	 */
	void setWorkEffortId(String value);

} // ShoppingListWorkEffort
