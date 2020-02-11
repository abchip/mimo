/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.supplier.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.supplier.SupplierPackage;
import org.abchip.mimo.biz.product.supplier.SupplierPrefOrder;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PREF_ORDER__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(SupplierPackage.Literals.SUPPLIER_PREF_ORDER__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierPrefOrderId() {
		return (String)eGet(SupplierPackage.Literals.SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierPrefOrderId(String newSupplierPrefOrderId) {
		eSet(SupplierPackage.Literals.SUPPLIER_PREF_ORDER__SUPPLIER_PREF_ORDER_ID, newSupplierPrefOrderId);
	}

} //SupplierPrefOrderImpl
