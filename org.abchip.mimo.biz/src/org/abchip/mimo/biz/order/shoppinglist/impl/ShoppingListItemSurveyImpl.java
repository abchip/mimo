/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist.impl;

import org.abchip.mimo.biz.content.survey.SurveyResponse;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingListItemSurvey;
import org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping List Item Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingListItemSurveyImpl extends BizEntityImpl implements ShoppingListItemSurvey {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingListItemSurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM_SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingList getShoppingListId() {
		return (ShoppingList)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListId(ShoppingList newShoppingListId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID, newShoppingListId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListItemSeqId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListItemSeqId(String newShoppingListItemSeqId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID, newShoppingListItemSeqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse getSurveyResponseId() {
		return (SurveyResponse)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(SurveyResponse newSurveyResponseId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID, newSurveyResponseId);
	}

} //ShoppingListItemSurveyImpl
