/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shopping List Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getShoppingListItemSeqId <em>Shopping List Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getConfigId <em>Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getModifiedPrice <em>Modified Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getQuantityPurchased <em>Quantity Purchased</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getReservLength <em>Reserv Length</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getReservPersons <em>Reserv Persons</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getReservStart <em>Reserv Start</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getShoppingListId <em>Shopping List Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.order.shoppinglist.impl.ShoppingListItemImpl#getProductId <em>Product Id</em>}</li>
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
	 * The default value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigId() <em>Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigId()
	 * @generated
	 * @ordered
	 */
	protected String configId = CONFIG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedPrice() <em>Modified Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MODIFIED_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedPrice() <em>Modified Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal modifiedPrice = MODIFIED_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityPurchased() <em>Quantity Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityPurchased()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_PURCHASED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityPurchased() <em>Quantity Purchased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityPurchased()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityPurchased = QUANTITY_PURCHASED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservLength() <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservLength()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservLength() <em>Reserv Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservLength()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservLength = RESERV_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal RESERV_PERSONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservPersons() <em>Reserv Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservPersons()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal reservPersons = RESERV_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservStart() <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESERV_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservStart() <em>Reserv Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservStart()
	 * @generated
	 * @ordered
	 */
	protected Date reservStart = RESERV_START_EDEFAULT;

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
	 * The cached value of the '{@link #getProductId() <em>Product Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductId()
	 * @generated
	 * @ordered
	 */
	protected Product productId;

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
		return configId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigId(String newConfigId) {
		String oldConfigId = configId;
		configId = newConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__CONFIG_ID, oldConfigId, configId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getModifiedPrice() {
		return modifiedPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedPrice(BigDecimal newModifiedPrice) {
		BigDecimal oldModifiedPrice = modifiedPrice;
		modifiedPrice = newModifiedPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__MODIFIED_PRICE, oldModifiedPrice, modifiedPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProductId() {
		if (productId != null && ((EObject)productId).eIsProxy()) {
			InternalEObject oldProductId = (InternalEObject)productId;
			productId = (Product)eResolveProxy(oldProductId);
			if (productId != oldProductId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST_ITEM__PRODUCT_ID, oldProductId, productId));
			}
		}
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProductId() {
		return productId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductId(Product newProductId) {
		Product oldProductId = productId;
		productId = newProductId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__PRODUCT_ID, oldProductId, productId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		BigDecimal oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityPurchased() {
		return quantityPurchased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityPurchased(BigDecimal newQuantityPurchased) {
		BigDecimal oldQuantityPurchased = quantityPurchased;
		quantityPurchased = newQuantityPurchased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY_PURCHASED, oldQuantityPurchased, quantityPurchased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservLength() {
		return reservLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservLength(BigDecimal newReservLength) {
		BigDecimal oldReservLength = reservLength;
		reservLength = newReservLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_LENGTH, oldReservLength, reservLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getReservPersons() {
		return reservPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservPersons(BigDecimal newReservPersons) {
		BigDecimal oldReservPersons = reservPersons;
		reservPersons = newReservPersons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_PERSONS, oldReservPersons, reservPersons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservStart() {
		return reservStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservStart(Date newReservStart) {
		Date oldReservStart = reservStart;
		reservStart = newReservStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_START, oldReservStart, reservStart));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID, oldShoppingListId, shoppingListId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID, oldShoppingListId, shoppingListId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID, oldShoppingListItemSeqId, shoppingListItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				return getShoppingListItemSeqId();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__CONFIG_ID:
				return getConfigId();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__MODIFIED_PRICE:
				return getModifiedPrice();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY:
				return getQuantity();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY_PURCHASED:
				return getQuantityPurchased();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_LENGTH:
				return getReservLength();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_PERSONS:
				return getReservPersons();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_START:
				return getReservStart();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID:
				if (resolve) return getShoppingListId();
				return basicGetShoppingListId();
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
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
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				setShoppingListItemSeqId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__CONFIG_ID:
				setConfigId((String)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__MODIFIED_PRICE:
				setModifiedPrice((BigDecimal)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY_PURCHASED:
				setQuantityPurchased((BigDecimal)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_LENGTH:
				setReservLength((BigDecimal)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_PERSONS:
				setReservPersons((BigDecimal)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_START:
				setReservStart((Date)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID:
				setShoppingListId((ShoppingList)newValue);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__PRODUCT_ID:
				setProductId((Product)newValue);
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
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				setShoppingListItemSeqId(SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__CONFIG_ID:
				setConfigId(CONFIG_ID_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__MODIFIED_PRICE:
				setModifiedPrice(MODIFIED_PRICE_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY_PURCHASED:
				setQuantityPurchased(QUANTITY_PURCHASED_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_LENGTH:
				setReservLength(RESERV_LENGTH_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_PERSONS:
				setReservPersons(RESERV_PERSONS_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_START:
				setReservStart(RESERV_START_EDEFAULT);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID:
				setShoppingListId((ShoppingList)null);
				return;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__PRODUCT_ID:
				setProductId((Product)null);
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
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ITEM_SEQ_ID:
				return SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT == null ? shoppingListItemSeqId != null : !SHOPPING_LIST_ITEM_SEQ_ID_EDEFAULT.equals(shoppingListItemSeqId);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__CONFIG_ID:
				return CONFIG_ID_EDEFAULT == null ? configId != null : !CONFIG_ID_EDEFAULT.equals(configId);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__MODIFIED_PRICE:
				return MODIFIED_PRICE_EDEFAULT == null ? modifiedPrice != null : !MODIFIED_PRICE_EDEFAULT.equals(modifiedPrice);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__QUANTITY_PURCHASED:
				return QUANTITY_PURCHASED_EDEFAULT == null ? quantityPurchased != null : !QUANTITY_PURCHASED_EDEFAULT.equals(quantityPurchased);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_LENGTH:
				return RESERV_LENGTH_EDEFAULT == null ? reservLength != null : !RESERV_LENGTH_EDEFAULT.equals(reservLength);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_PERSONS:
				return RESERV_PERSONS_EDEFAULT == null ? reservPersons != null : !RESERV_PERSONS_EDEFAULT.equals(reservPersons);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__RESERV_START:
				return RESERV_START_EDEFAULT == null ? reservStart != null : !RESERV_START_EDEFAULT.equals(reservStart);
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__SHOPPING_LIST_ID:
				return shoppingListId != null;
			case ShoppinglistPackage.SHOPPING_LIST_ITEM__PRODUCT_ID:
				return productId != null;
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
		result.append(", configId: ");
		result.append(configId);
		result.append(", modifiedPrice: ");
		result.append(modifiedPrice);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", quantityPurchased: ");
		result.append(quantityPurchased);
		result.append(", reservLength: ");
		result.append(reservLength);
		result.append(", reservPersons: ");
		result.append(reservPersons);
		result.append(", reservStart: ");
		result.append(reservStart);
		result.append(')');
		return result.toString();
	}

} //ShoppingListItemImpl
