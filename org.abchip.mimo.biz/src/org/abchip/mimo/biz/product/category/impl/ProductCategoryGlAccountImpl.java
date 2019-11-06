/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategory;
import org.abchip.mimo.biz.product.category.ProductCategoryGlAccount;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Category Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryGlAccountImpl#getProductCategoryId <em>Product Category Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryGlAccountImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryGlAccountImpl#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.category.impl.ProductCategoryGlAccountImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductCategoryGlAccountImpl extends BizEntityImpl implements ProductCategoryGlAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategoryId;

	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party organizationPartyId;

	/**
	 * The cached value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountType glAccountTypeId;

	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount glAccountId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductCategoryGlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CategoryPackage.Literals.PRODUCT_CATEGORY_GL_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getGlAccountId() {
		if (glAccountId != null && ((EObject)glAccountId).eIsProxy()) {
			InternalEObject oldGlAccountId = (InternalEObject)glAccountId;
			glAccountId = (GlAccount)eResolveProxy(oldGlAccountId);
			if (glAccountId != oldGlAccountId) {
			}
		}
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(GlAccount newGlAccountId) {
		glAccountId = newGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getGlAccountTypeId() {
		if (glAccountTypeId != null && ((EObject)glAccountTypeId).eIsProxy()) {
			InternalEObject oldGlAccountTypeId = (InternalEObject)glAccountTypeId;
			glAccountTypeId = (GlAccountType)eResolveProxy(oldGlAccountTypeId);
			if (glAccountTypeId != oldGlAccountTypeId) {
			}
		}
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountType basicGetGlAccountTypeId() {
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(GlAccountType newGlAccountTypeId) {
		glAccountTypeId = newGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getOrganizationPartyId() {
		if (organizationPartyId != null && ((EObject)organizationPartyId).eIsProxy()) {
			InternalEObject oldOrganizationPartyId = (InternalEObject)organizationPartyId;
			organizationPartyId = (Party)eResolveProxy(oldOrganizationPartyId);
			if (organizationPartyId != oldOrganizationPartyId) {
			}
		}
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		organizationPartyId = newOrganizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategoryId() {
		if (productCategoryId != null && ((EObject)productCategoryId).eIsProxy()) {
			InternalEObject oldProductCategoryId = (InternalEObject)productCategoryId;
			productCategoryId = (ProductCategory)eResolveProxy(oldProductCategoryId);
			if (productCategoryId != oldProductCategoryId) {
			}
		}
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(ProductCategory newProductCategoryId) {
		productCategoryId = newProductCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__PRODUCT_CATEGORY_ID:
				if (resolve) return getProductCategoryId();
				return basicGetProductCategoryId();
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				if (resolve) return getGlAccountTypeId();
				return basicGetGlAccountTypeId();
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
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
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
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
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__PRODUCT_CATEGORY_ID:
				setProductCategoryId((ProductCategory)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)null);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
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
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__PRODUCT_CATEGORY_ID:
				return productCategoryId != null;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				return glAccountTypeId != null;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				return glAccountId != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductCategoryGlAccountImpl
