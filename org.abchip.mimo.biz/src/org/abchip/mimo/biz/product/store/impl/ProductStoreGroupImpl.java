/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.product.store.ProductStoreGroupType;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getProductStoreGroupName <em>Product Store Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getProductStoreGroupTypeId <em>Product Store Group Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupImpl#getPrimaryParentGroupId <em>Primary Parent Group Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreGroupImpl extends BizEntityTypedImpl<ProductStoreGroupType> implements ProductStoreGroup {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getProductStoreGroupId() <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreGroupId() <em>Product Store Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreGroupId = PRODUCT_STORE_GROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getProductStoreGroupName() <em>Product Store Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreGroupName() <em>Product Store Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupName()
	 * @generated
	 * @ordered
	 */
	protected String productStoreGroupName = PRODUCT_STORE_GROUP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductStoreGroupTypeId() <em>Product Store Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected ProductStoreGroupType productStoreGroupTypeId;

	/**
	 * The cached value of the '{@link #getPrimaryParentGroupId() <em>Primary Parent Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryParentGroupId()
	 * @generated
	 * @ordered
	 */
	protected ProductStoreGroup primaryParentGroupId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_GROUP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreGroupName() {
		return productStoreGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupName(String newProductStoreGroupName) {
		String oldProductStoreGroupName = productStoreGroupName;
		productStoreGroupName = newProductStoreGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME, oldProductStoreGroupName, productStoreGroupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroupType getProductStoreGroupTypeId() {
		if (productStoreGroupTypeId != null && ((EObject)productStoreGroupTypeId).eIsProxy()) {
			InternalEObject oldProductStoreGroupTypeId = (InternalEObject)productStoreGroupTypeId;
			productStoreGroupTypeId = (ProductStoreGroupType)eResolveProxy(oldProductStoreGroupTypeId);
			if (productStoreGroupTypeId != oldProductStoreGroupTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID, oldProductStoreGroupTypeId, productStoreGroupTypeId));
			}
		}
		return productStoreGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStoreGroupType basicGetProductStoreGroupTypeId() {
		return productStoreGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupTypeId(ProductStoreGroupType newProductStoreGroupTypeId) {
		ProductStoreGroupType oldProductStoreGroupTypeId = productStoreGroupTypeId;
		productStoreGroupTypeId = newProductStoreGroupTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID, oldProductStoreGroupTypeId, productStoreGroupTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> primaryProductStores() {
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
	public ProductStoreGroup getPrimaryParentGroupId() {
		if (primaryParentGroupId != null && ((EObject)primaryParentGroupId).eIsProxy()) {
			InternalEObject oldPrimaryParentGroupId = (InternalEObject)primaryParentGroupId;
			primaryParentGroupId = (ProductStoreGroup)eResolveProxy(oldPrimaryParentGroupId);
			if (primaryParentGroupId != oldPrimaryParentGroupId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID, oldPrimaryParentGroupId, primaryParentGroupId));
			}
		}
		return primaryParentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStoreGroup basicGetPrimaryParentGroupId() {
		return primaryParentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryParentGroupId(ProductStoreGroup newPrimaryParentGroupId) {
		ProductStoreGroup oldPrimaryParentGroupId = primaryParentGroupId;
		primaryParentGroupId = newPrimaryParentGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID, oldPrimaryParentGroupId, primaryParentGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreGroupId() {
		return productStoreGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupId(String newProductStoreGroupId) {
		String oldProductStoreGroupId = productStoreGroupId;
		productStoreGroupId = newProductStoreGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID, oldProductStoreGroupId, productStoreGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID:
				return getProductStoreGroupId();
			case StorePackage.PRODUCT_STORE_GROUP__DESCRIPTION:
				return getDescription();
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME:
				return getProductStoreGroupName();
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID:
				if (resolve) return getProductStoreGroupTypeId();
				return basicGetProductStoreGroupTypeId();
			case StorePackage.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID:
				if (resolve) return getPrimaryParentGroupId();
				return basicGetPrimaryParentGroupId();
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
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME:
				setProductStoreGroupName((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID:
				setProductStoreGroupTypeId((ProductStoreGroupType)newValue);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID:
				setPrimaryParentGroupId((ProductStoreGroup)newValue);
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
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId(PRODUCT_STORE_GROUP_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME:
				setProductStoreGroupName(PRODUCT_STORE_GROUP_NAME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID:
				setProductStoreGroupTypeId((ProductStoreGroupType)null);
				return;
			case StorePackage.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID:
				setPrimaryParentGroupId((ProductStoreGroup)null);
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
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_ID:
				return PRODUCT_STORE_GROUP_ID_EDEFAULT == null ? productStoreGroupId != null : !PRODUCT_STORE_GROUP_ID_EDEFAULT.equals(productStoreGroupId);
			case StorePackage.PRODUCT_STORE_GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_NAME:
				return PRODUCT_STORE_GROUP_NAME_EDEFAULT == null ? productStoreGroupName != null : !PRODUCT_STORE_GROUP_NAME_EDEFAULT.equals(productStoreGroupName);
			case StorePackage.PRODUCT_STORE_GROUP__PRODUCT_STORE_GROUP_TYPE_ID:
				return productStoreGroupTypeId != null;
			case StorePackage.PRODUCT_STORE_GROUP__PRIMARY_PARENT_GROUP_ID:
				return primaryParentGroupId != null;
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
		result.append(" (productStoreGroupId: ");
		result.append(productStoreGroupId);
		result.append(", description: ");
		result.append(description);
		result.append(", productStoreGroupName: ");
		result.append(productStoreGroupName);
		result.append(')');
		return result.toString();
	}

} //ProductStoreGroupImpl
