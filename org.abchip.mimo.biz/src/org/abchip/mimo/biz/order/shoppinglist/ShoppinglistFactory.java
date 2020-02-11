/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage
 * @generated
 */
public interface ShoppinglistFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShoppinglistFactory eINSTANCE = org.abchip.mimo.biz.order.shoppinglist.impl.ShoppinglistFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shopping List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shopping List</em>'.
	 * @generated
	 */
	ShoppingList createShoppingList();

	/**
	 * Returns a new object of class '<em>Shopping List Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shopping List Item</em>'.
	 * @generated
	 */
	ShoppingListItem createShoppingListItem();

	/**
	 * Returns a new object of class '<em>Shopping List Item Survey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shopping List Item Survey</em>'.
	 * @generated
	 */
	ShoppingListItemSurvey createShoppingListItemSurvey();

	/**
	 * Returns a new object of class '<em>Shopping List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shopping List Type</em>'.
	 * @generated
	 */
	ShoppingListType createShoppingListType();

	/**
	 * Returns a new object of class '<em>Shopping List Work Effort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shopping List Work Effort</em>'.
	 * @generated
	 */
	ShoppingListWorkEffort createShoppingListWorkEffort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ShoppinglistPackage getShoppinglistPackage();

} //ShoppinglistFactory
