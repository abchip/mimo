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
import org.abchip.mimo.biz.product.supplier.SupplierRatingType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Rating Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierRatingTypeImpl#getSupplierRatingTypeId <em>Supplier Rating Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.supplier.impl.SupplierRatingTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierRatingTypeImpl extends BizEntityImpl implements SupplierRatingType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getSupplierRatingTypeId() <em>Supplier Rating Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRatingTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_RATING_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierRatingTypeId() <em>Supplier Rating Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierRatingTypeId()
	 * @generated
	 * @ordered
	 */
	protected String supplierRatingTypeId = SUPPLIER_RATING_TYPE_ID_EDEFAULT;

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
	protected SupplierRatingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SupplierPackage.Literals.SUPPLIER_RATING_TYPE;
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
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierRatingTypeId() {
		return supplierRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierRatingTypeId(String newSupplierRatingTypeId) {
		supplierRatingTypeId = newSupplierRatingTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SupplierPackage.SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID:
				return getSupplierRatingTypeId();
			case SupplierPackage.SUPPLIER_RATING_TYPE__DESCRIPTION:
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
			case SupplierPackage.SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID:
				setSupplierRatingTypeId((String)newValue);
				return;
			case SupplierPackage.SUPPLIER_RATING_TYPE__DESCRIPTION:
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
			case SupplierPackage.SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID:
				setSupplierRatingTypeId(SUPPLIER_RATING_TYPE_ID_EDEFAULT);
				return;
			case SupplierPackage.SUPPLIER_RATING_TYPE__DESCRIPTION:
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
			case SupplierPackage.SUPPLIER_RATING_TYPE__SUPPLIER_RATING_TYPE_ID:
				return SUPPLIER_RATING_TYPE_ID_EDEFAULT == null ? supplierRatingTypeId != null : !SUPPLIER_RATING_TYPE_ID_EDEFAULT.equals(supplierRatingTypeId);
			case SupplierPackage.SUPPLIER_RATING_TYPE__DESCRIPTION:
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
		result.append(" (supplierRatingTypeId: ");
		result.append(supplierRatingTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SupplierRatingTypeImpl
