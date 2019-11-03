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
 * A representation of the model object '<em><b>Shopping List Item Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponseId <em>Survey Response Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey()
 * @model
 * @generated
 */
public interface ShoppingListItemSurvey extends BizEntity {
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
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey_ShoppingListId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='ShoppingList'"
	 * @generated
	 */
	String getShoppingListId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListId <em>Shopping List Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Id</em>' attribute.
	 * @see #getShoppingListId()
	 * @generated
	 */
	void setShoppingListId(String value);

	/**
	 * Returns the value of the '<em><b>Shopping List Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shopping List Item Seq Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shopping List Item Seq Id</em>' attribute.
	 * @see #setShoppingListItemSeqId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey_ShoppingListItemSeqId()
	 * @model annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShoppingListItemSeqId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shopping List Item Seq Id</em>' attribute.
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 */
	void setShoppingListItemSeqId(String value);

	/**
	 * Returns the value of the '<em><b>Survey Response Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Survey Response Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Survey Response Id</em>' attribute.
	 * @see #setSurveyResponseId(String)
	 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage#getShoppingListItemSurvey_SurveyResponseId()
	 * @model annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-domain frame='SurveyResponse'"
	 * @generated
	 */
	String getSurveyResponseId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey#getSurveyResponseId <em>Survey Response Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survey Response Id</em>' attribute.
	 * @see #getSurveyResponseId()
	 * @generated
	 */
	void setSurveyResponseId(String value);

} // ShoppingListItemSurvey
