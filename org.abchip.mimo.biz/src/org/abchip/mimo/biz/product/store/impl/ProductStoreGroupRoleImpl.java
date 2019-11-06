/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.store.ProductStoreGroup;
import org.abchip.mimo.biz.product.store.ProductStoreGroupRole;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Group Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRoleImpl#getProductStoreGroupId <em>Product Store Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRoleImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreGroupRoleImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreGroupRoleImpl extends BizEntityImpl implements ProductStoreGroupRole {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getProductStoreGroupId() <em>Product Store Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreGroupId()
	 * @generated
	 * @ordered
	 */
	protected ProductStoreGroup productStoreGroupId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreGroupRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_GROUP_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		roleTypeId = newRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreGroup getProductStoreGroupId() {
		if (productStoreGroupId != null && ((EObject)productStoreGroupId).eIsProxy()) {
			InternalEObject oldProductStoreGroupId = (InternalEObject)productStoreGroupId;
			productStoreGroupId = (ProductStoreGroup)eResolveProxy(oldProductStoreGroupId);
			if (productStoreGroupId != oldProductStoreGroupId) {
			}
		}
		return productStoreGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStoreGroup basicGetProductStoreGroupId() {
		return productStoreGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreGroupId(ProductStoreGroup newProductStoreGroupId) {
		productStoreGroupId = newProductStoreGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PRODUCT_STORE_GROUP_ID:
				if (resolve) return getProductStoreGroupId();
				return basicGetProductStoreGroupId();
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
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
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId((ProductStoreGroup)newValue);
				return;
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
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
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PRODUCT_STORE_GROUP_ID:
				setProductStoreGroupId((ProductStoreGroup)null);
				return;
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
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
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PRODUCT_STORE_GROUP_ID:
				return productStoreGroupId != null;
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__PARTY_ID:
				return partyId != null;
			case StorePackage.PRODUCT_STORE_GROUP_ROLE__ROLE_TYPE_ID:
				return roleTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductStoreGroupRoleImpl
