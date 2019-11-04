/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist;

import java.util.List;

import org.abchip.mimo.biz.BizEntityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shopping List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getShoppingListTypeId <em>Shopping List Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListType()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShoppingListType extends BizEntityType<ShoppingList> {
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
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingList' route='shoppingListTypeId'"
	 * @generated
	 */
	List<String> shoppingLists();

	/**
	 * Returns the value of the '<em><b>Shopping List Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Type Id</em>' attribute.
	 * @see #setShoppingListTypeId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListType_ShoppingListTypeId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShoppingListTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListType#getShoppingListTypeId <em>Shopping List Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Type Id</em>' attribute.
	 * @see #getShoppingListTypeId()
	 * @generated
	 */
	void setShoppingListTypeId(String value);

} // ShoppingListType