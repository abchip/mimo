/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.category.CategoryPackage;
import org.abchip.mimo.biz.product.category.ProductCategoryGlAccount;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_CATEGORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductCategoryId() <em>Product Category Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategoryId()
	 * @generated
	 * @ordered
	 */
	protected String productCategoryId = PRODUCT_CATEGORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected String organizationPartyId = ORGANIZATION_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountTypeId = GL_ACCOUNT_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String GL_ACCOUNT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String glAccountId = GL_ACCOUNT_ID_EDEFAULT;

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
	public String getGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(String newGlAccountId) {
		String oldGlAccountId = glAccountId;
		glAccountId = newGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGlAccountTypeId() {
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(String newGlAccountTypeId) {
		String oldGlAccountTypeId = glAccountTypeId;
		glAccountTypeId = newGlAccountTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID, oldGlAccountTypeId, glAccountTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(String newOrganizationPartyId) {
		String oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductCategoryId() {
		return productCategoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductCategoryId(String newProductCategoryId) {
		String oldProductCategoryId = productCategoryId;
		productCategoryId = newProductCategoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__PRODUCT_CATEGORY_ID, oldProductCategoryId, productCategoryId));
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
				return getProductCategoryId();
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return getOrganizationPartyId();
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				return getGlAccountTypeId();
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				return getGlAccountId();
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
				setProductCategoryId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((String)newValue);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId((String)newValue);
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
				setProductCategoryId(PRODUCT_CATEGORY_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId(ORGANIZATION_PARTY_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId(GL_ACCOUNT_TYPE_ID_EDEFAULT);
				return;
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId(GL_ACCOUNT_ID_EDEFAULT);
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
				return PRODUCT_CATEGORY_ID_EDEFAULT == null ? productCategoryId != null : !PRODUCT_CATEGORY_ID_EDEFAULT.equals(productCategoryId);
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return ORGANIZATION_PARTY_ID_EDEFAULT == null ? organizationPartyId != null : !ORGANIZATION_PARTY_ID_EDEFAULT.equals(organizationPartyId);
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_TYPE_ID:
				return GL_ACCOUNT_TYPE_ID_EDEFAULT == null ? glAccountTypeId != null : !GL_ACCOUNT_TYPE_ID_EDEFAULT.equals(glAccountTypeId);
			case CategoryPackage.PRODUCT_CATEGORY_GL_ACCOUNT__GL_ACCOUNT_ID:
				return GL_ACCOUNT_ID_EDEFAULT == null ? glAccountId != null : !GL_ACCOUNT_ID_EDEFAULT.equals(glAccountId);
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
		result.append(" (productCategoryId: ");
		result.append(productCategoryId);
		result.append(", organizationPartyId: ");
		result.append(organizationPartyId);
		result.append(", glAccountTypeId: ");
		result.append(glAccountTypeId);
		result.append(", glAccountId: ");
		result.append(glAccountId);
		result.append(')');
		return result.toString();
	}

} //ProductCategoryGlAccountImpl
