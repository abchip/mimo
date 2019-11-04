/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.feature.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.feature.FeaturePackage;
import org.abchip.mimo.biz.product.feature.ProductFeature;
import org.abchip.mimo.biz.product.feature.ProductFeatureType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl#getProductFeatureTypeId <em>Product Feature Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl#isHasTable <em>Has Table</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.feature.impl.ProductFeatureTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductFeatureTypeImpl extends BizEntityTypeImpl<ProductFeature> implements ProductFeatureType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProductFeatureTypeId() <em>Product Feature Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureTypeId() <em>Product Feature Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureTypeId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureTypeId = PRODUCT_FEATURE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasTable() <em>Has Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasTable()
	 * @generated
	 * @ordered
	 */
	protected boolean hasTable = HAS_TABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductFeatureType parentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.PRODUCT_FEATURE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHasTable() {
		return hasTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTable(boolean newHasTable) {
		boolean oldHasTable = hasTable;
		hasTable = newHasTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_TYPE__HAS_TABLE, oldHasTable, hasTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductFeatureType getParentTypeId() {
		if (parentTypeId != null && ((EObject)parentTypeId).eIsProxy()) {
			InternalEObject oldParentTypeId = (InternalEObject)parentTypeId;
			parentTypeId = (ProductFeatureType)eResolveProxy(oldParentTypeId);
			if (parentTypeId != oldParentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeaturePackage.PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
			}
		}
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFeatureType basicGetParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ProductFeatureType newParentTypeId) {
		ProductFeatureType oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childProductFeatureTypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> productFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureTypeId() {
		return productFeatureTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureTypeId(String newProductFeatureTypeId) {
		String oldProductFeatureTypeId = productFeatureTypeId;
		productFeatureTypeId = newProductFeatureTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturePackage.PRODUCT_FEATURE_TYPE__PRODUCT_FEATURE_TYPE_ID, oldProductFeatureTypeId, productFeatureTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PRODUCT_FEATURE_TYPE_ID:
				return getProductFeatureTypeId();
			case FeaturePackage.PRODUCT_FEATURE_TYPE__DESCRIPTION:
				return getDescription();
			case FeaturePackage.PRODUCT_FEATURE_TYPE__HAS_TABLE:
				return isHasTable();
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID:
				if (resolve) return getParentTypeId();
				return basicGetParentTypeId();
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
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PRODUCT_FEATURE_TYPE_ID:
				setProductFeatureTypeId((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_TYPE__HAS_TABLE:
				setHasTable((Boolean)newValue);
				return;
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProductFeatureType)newValue);
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
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PRODUCT_FEATURE_TYPE_ID:
				setProductFeatureTypeId(PRODUCT_FEATURE_TYPE_ID_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_TYPE__HAS_TABLE:
				setHasTable(HAS_TABLE_EDEFAULT);
				return;
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID:
				setParentTypeId((ProductFeatureType)null);
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
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PRODUCT_FEATURE_TYPE_ID:
				return PRODUCT_FEATURE_TYPE_ID_EDEFAULT == null ? productFeatureTypeId != null : !PRODUCT_FEATURE_TYPE_ID_EDEFAULT.equals(productFeatureTypeId);
			case FeaturePackage.PRODUCT_FEATURE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FeaturePackage.PRODUCT_FEATURE_TYPE__HAS_TABLE:
				return hasTable != HAS_TABLE_EDEFAULT;
			case FeaturePackage.PRODUCT_FEATURE_TYPE__PARENT_TYPE_ID:
				return parentTypeId != null;
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
		result.append(" (productFeatureTypeId: ");
		result.append(productFeatureTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", hasTable: ");
		result.append(hasTable);
		result.append(')');
		return result.toString();
	}

} //ProductFeatureTypeImpl
