/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.inventory.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.inventory.InventoryItemTempRes;
import org.abchip.mimo.biz.product.inventory.InventoryPackage;
import org.abchip.mimo.biz.product.product.Product;
import org.abchip.mimo.biz.product.store.ProductStore;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Item Temp Res</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTempResImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTempResImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTempResImpl#getReservedDate <em>Reserved Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTempResImpl#getProductId <em>Product Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.inventory.impl.InventoryItemTempResImpl#getProductStoreId <em>Product Store Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryItemTempResImpl extends BizEntityImpl implements InventoryItemTempRes {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getReservedDate() <em>Reserved Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESERVED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservedDate() <em>Reserved Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedDate()
	 * @generated
	 * @ordered
	 */
	protected Date reservedDate = RESERVED_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected ProductStore productStoreId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryItemTempResImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_ITEM_TEMP_RES;
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
		productId = newProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStore getProductStoreId() {
		if (productStoreId != null && ((EObject)productStoreId).eIsProxy()) {
			InternalEObject oldProductStoreId = (InternalEObject)productStoreId;
			productStoreId = (ProductStore)eResolveProxy(oldProductStoreId);
			if (productStoreId != oldProductStoreId) {
			}
		}
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore basicGetProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(ProductStore newProductStoreId) {
		productStoreId = newProductStoreId;
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
		quantity = newQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReservedDate() {
		return reservedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedDate(Date newReservedDate) {
		reservedDate = newReservedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		visitId = newVisitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__VISIT_ID:
				return getVisitId();
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__QUANTITY:
				return getQuantity();
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__RESERVED_DATE:
				return getReservedDate();
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_ID:
				if (resolve) return getProductId();
				return basicGetProductId();
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_STORE_ID:
				if (resolve) return getProductStoreId();
				return basicGetProductStoreId();
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
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__RESERVED_DATE:
				setReservedDate((Date)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_ID:
				setProductId((Product)newValue);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)newValue);
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
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__RESERVED_DATE:
				setReservedDate(RESERVED_DATE_EDEFAULT);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_ID:
				setProductId((Product)null);
				return;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_STORE_ID:
				setProductStoreId((ProductStore)null);
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
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__QUANTITY:
				return QUANTITY_EDEFAULT == null ? quantity != null : !QUANTITY_EDEFAULT.equals(quantity);
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__RESERVED_DATE:
				return RESERVED_DATE_EDEFAULT == null ? reservedDate != null : !RESERVED_DATE_EDEFAULT.equals(reservedDate);
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_ID:
				return productId != null;
			case InventoryPackage.INVENTORY_ITEM_TEMP_RES__PRODUCT_STORE_ID:
				return productStoreId != null;
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
		result.append(" (visitId: ");
		result.append(visitId);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", reservedDate: ");
		result.append(reservedDate);
		result.append(')');
		return result.toString();
	}

} //InventoryItemTempResImpl
