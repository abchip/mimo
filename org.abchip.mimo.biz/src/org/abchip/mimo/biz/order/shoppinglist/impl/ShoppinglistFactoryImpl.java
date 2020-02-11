/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist.impl;

import org.abchip.mimo.biz.order.shoppinglist.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShoppinglistFactoryImpl extends EFactoryImpl implements ShoppinglistFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShoppinglistFactory init() {
		try {
			ShoppinglistFactory theShoppinglistFactory = (ShoppinglistFactory)EPackage.Registry.INSTANCE.getEFactory(ShoppinglistPackage.eNS_URI);
			if (theShoppinglistFactory != null) {
				return theShoppinglistFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShoppinglistFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShoppinglistFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShoppinglistPackage.SHOPPING_LIST: return (EObject)createShoppingList();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM: return (EObject)createShoppingListItem();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM_SURVEY: return (EObject)createShoppingListItemSurvey();
			case ShoppinglistPackage.SHOPPING_LIST_TYPE: return (EObject)createShoppingListType();
			case ShoppinglistPackage.SHOPPING_LIST_WORK_EFFORT: return (EObject)createShoppingListWorkEffort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingList createShoppingList() {
		ShoppingListImpl shoppingList = new ShoppingListImpl();
		return shoppingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingListItem createShoppingListItem() {
		ShoppingListItemImpl shoppingListItem = new ShoppingListItemImpl();
		return shoppingListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingListItemSurvey createShoppingListItemSurvey() {
		ShoppingListItemSurveyImpl shoppingListItemSurvey = new ShoppingListItemSurveyImpl();
		return shoppingListItemSurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingListType createShoppingListType() {
		ShoppingListTypeImpl shoppingListType = new ShoppingListTypeImpl();
		return shoppingListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingListWorkEffort createShoppingListWorkEffort() {
		ShoppingListWorkEffortImpl shoppingListWorkEffort = new ShoppingListWorkEffortImpl();
		return shoppingListWorkEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppinglistPackage getShoppinglistPackage() {
		return (ShoppinglistPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShoppinglistPackage getPackage() {
		return ShoppinglistPackage.eINSTANCE;
	}

} //ShoppinglistFactoryImpl
