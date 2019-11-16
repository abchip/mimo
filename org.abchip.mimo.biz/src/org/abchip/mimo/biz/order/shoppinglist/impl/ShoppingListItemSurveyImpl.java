/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping List Item Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemSurveyImpl#getSurveyResponseId <em>Survey Response Id</em>}</li>
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
	 * The default value of the '{@link #getShoppingListItemSeqId() <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShoppingListItemSeqId() <em>Shopping List Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String shoppingListItemSeqId = SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShoppingListId() <em>Shopping List Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoppingListId()
	 * @generated
	 * @ordered
	 */
	protected ShoppingList shoppingListId;

	/**
	 * The cached value of the '{@link #getSurveyResponseId() <em>Survey Response Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurveyResponseId()
	 * @generated
	 * @ordered
	 */
	protected SurveyResponse surveyResponseId;

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
		if (shoppingListId != null && ((EObject)shoppingListId).eIsProxy()) {
			InternalEObject oldShoppingListId = (InternalEObject)shoppingListId;
			shoppingListId = (ShoppingList)eResolveProxy(oldShoppingListId);
			if (shoppingListId != oldShoppingListId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID, oldShoppingListId, shoppingListId));
			}
		}
		return shoppingListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShoppingList basicGetShoppingListId() {
		return shoppingListId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListId(ShoppingList newShoppingListId) {
		ShoppingList oldShoppingListId = shoppingListId;
		shoppingListId = newShoppingListId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID, oldShoppingListId, shoppingListId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListItemSeqId() {
		return shoppingListItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListItemSeqId(String newShoppingListItemSeqId) {
		String oldShoppingListItemSeqId = shoppingListItemSeqId;
		shoppingListItemSeqId = newShoppingListItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID, oldShoppingListItemSeqId, shoppingListItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurveyResponse getSurveyResponseId() {
		if (surveyResponseId != null && ((EObject)surveyResponseId).eIsProxy()) {
			InternalEObject oldSurveyResponseId = (InternalEObject)surveyResponseId;
			surveyResponseId = (SurveyResponse)eResolveProxy(oldSurveyResponseId);
			if (surveyResponseId != oldSurveyResponseId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID, oldSurveyResponseId, surveyResponseId));
			}
		}
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyResponse basicGetSurveyResponseId() {
		return surveyResponseId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurveyResponseId(SurveyResponse newSurveyResponseId) {
		SurveyResponse oldSurveyResponseId = surveyResponseId;
		surveyResponseId = newSurveyResponseId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID, oldSurveyResponseId, surveyResponseId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID:
				return getShoppingListItemSeqId();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID:
				if (resolve) return getShoppingListId();
				return basicGetShoppingListId();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID:
				if (resolve) return getSurveyResponseId();
				return basicGetSurveyResponseId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID:
				setShoppingListItemSeqId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID:
				setShoppingListId((ShoppingList)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID:
				setShoppingListItemSeqId(SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID:
				setShoppingListId((ShoppingList)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID:
				setSurveyResponseId((SurveyResponse)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ITEM_SEQ_ID:
				return SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT == null ? shoppingListItemSeqId != null : !SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT.equals(shoppingListItemSeqId);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SHOPPING_LIST_ID:
				return shoppingListId != null;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY__SURVEY_RESPONSE_ID:
				return surveyResponseId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (shoppingListItemSeqId: ");
		result.append(shoppingListItemSeqId);
		result.append(')');
		return result.toString();
	}

} //ShoppingListItemSurveyImpl
