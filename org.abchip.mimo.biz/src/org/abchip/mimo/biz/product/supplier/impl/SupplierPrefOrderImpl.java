/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.supplier.SupplierPackage;
import org.abchip.mimo.biz.product.supplier.SupplierPrefOrder;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Pref Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierPrefOrderImpl#getSupplierPrefOrderId <em>Supplier Pref Order Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierPrefOrderImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierPrefOrderImpl extends BizEntityImpl implements SupplierPrefOrder {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSupplierPrefOrderId() <em>Supplier Pref Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierPrefOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_PREF_ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierPrefOrderId() <em>Supplier Pref Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierPrefOrderId()
	 * @generated
	 * @ordered
	 */
	protected String supplierPrefOrderId = SUPPLIER_PREF_ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierPrefOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplierPackage.Literals.SUPPLIER_PREF_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplierPackage.SUPPLIER_PREF_ORDER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierPrefOrderId() {
		return supplierPrefOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierPrefOrderId(String newSupplierPrefOrderId) {
		String oldSupplierPrefOrderId = supplierPrefOrderId;
		supplierPrefOrderId = newSupplierPrefOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SupplierPackage.SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID, oldSupplierPrefOrderId, supplierPrefOrderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplierPackage.SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID:
				return getSupplierPrefOrderId();
			case SupplierPackage.SUPPLIER_PREF_ORDER__DESCRIPTION:
				return getDescription();
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
			case SupplierPackage.SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID:
				setSupplierPrefOrderId((String)newValue);
				return;
			case SupplierPackage.SUPPLIER_PREF_ORDER__DESCRIPTION:
				setDescription((String)newValue);
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
			case SupplierPackage.SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID:
				setSupplierPrefOrderId(SUPPLIER_PREF_ORDER_ID_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_PREF_ORDER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case SupplierPackage.SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID:
				return SUPPLIER_PREF_ORDER_ID_EDEFAULT == null ? supplierPrefOrderId != null : !SUPPLIER_PREF_ORDER_ID_EDEFAULT.equals(supplierPrefOrderId);
			case SupplierPackage.SUPPLIER_PREF_ORDER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (supplierPrefOrderId: ");
		result.append(supplierPrefOrderId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SupplierPrefOrderImpl
