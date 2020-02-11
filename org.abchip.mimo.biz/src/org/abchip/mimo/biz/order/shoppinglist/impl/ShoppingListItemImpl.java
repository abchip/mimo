/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.shoppinglist.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingList;
import org.abchip.mimo.biz.order.shoppinglist.ShoppingListItem;
import org.abchip.mimo.biz.order.shoppinglist.ShoppinglistPackage;
import org.abchip.mimo.biz.product.product.Product;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getModifiedPrice <em>Modified Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getQuantityPurchased <em>Quantity Purchased</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getReservStart <em>Reserv Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShoppingListItemImpl extends BizEntityImpl implements ShoppingListItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShoppingListItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__CONFIG_ID, newConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getModifiedPrice() {
		return (BigDecimal)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__MODIFIED_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedPrice(BigDecimal newModifiedPrice) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__MODIFIED_PRICE, newModifiedPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		return (Product)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__PRODUCT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__PRODUCT_ID, newProductId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__QUANTITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityPurchased() {
		return (BigDecimal)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__QUANTITY_PURCHASED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityPurchased(BigDecimal newQuantityPurchased) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__QUANTITY_PURCHASED, newQuantityPurchased);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservLength() {
		return (BigDecimal)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__RESERV_LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservLength(BigDecimal newReservLength) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__RESERV_LENGTH, newReservLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservPersons() {
		return (BigDecimal)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__RESERV_PERSONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservPersons(BigDecimal newReservPersons) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__RESERV_PERSONS, newReservPersons);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservStart() {
		return (Date)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__RESERV_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservStart(Date newReservStart) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__RESERV_START, newReservStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShoppingList getShoppingListId() {
		return (ShoppingList)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListId(ShoppingList newShoppingListId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID, newShoppingListId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShoppingListItemSeqId() {
		return (String)eGet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShoppingListItemSeqId(String newShoppingListItemSeqId) {
		eSet(ShoppinglistPackage.Literals.SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID, newShoppingListItemSeqId);
	}

} //ShoppingListItemImpl
