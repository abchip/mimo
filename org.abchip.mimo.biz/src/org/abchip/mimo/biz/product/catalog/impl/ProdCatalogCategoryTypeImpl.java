/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.catalog.impl;

import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.product.catalog.ProdCatalogCategory;
import org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prod Catalog Category Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryTypeImpl#getProdCatalogCategoryTypeId <em>Prod Catalog Category Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.catalog.impl.ProdCatalogCategoryTypeImpl#getParentTypeId <em>Parent Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProdCatalogCategoryTypeImpl extends BizEntityTypeImpl<ProdCatalogCategory> implements ProdCatalogCategoryType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * The default value of the '{@link #getProdCatalogCategoryTypeId() <em>Prod Catalog Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROD_CATALOG_CATEGORY_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProdCatalogCategoryTypeId() <em>Prod Catalog Category Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProdCatalogCategoryTypeId()
	 * @generated
	 * @ordered
	 */
	protected String prodCatalogCategoryTypeId = PROD_CATALOG_CATEGORY_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentTypeId() <em>Parent Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String parentTypeId = PARENT_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProdCatalogCategoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.PROD_CATALOG_CATEGORY_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentTypeId() {
		return parentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(String newParentTypeId) {
		String oldParentTypeId = parentTypeId;
		parentTypeId = newParentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE_ID, oldParentTypeId, parentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> childProdCatalogCategoryTypes() {
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
	public String getProdCatalogCategoryTypeId() {
		return prodCatalogCategoryTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogCategoryTypeId(String newProdCatalogCategoryTypeId) {
		String oldProdCatalogCategoryTypeId = prodCatalogCategoryTypeId;
		prodCatalogCategoryTypeId = newProdCatalogCategoryTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID, oldProdCatalogCategoryTypeId, prodCatalogCategoryTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID:
				return getProdCatalogCategoryTypeId();
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION:
				return getDescription();
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE_ID:
				return getParentTypeId();
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
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID:
				setProdCatalogCategoryTypeId((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE_ID:
				setParentTypeId((String)newValue);
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
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID:
				setProdCatalogCategoryTypeId(PROD_CATALOG_CATEGORY_TYPE_ID_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE_ID:
				setParentTypeId(PARENT_TYPE_ID_EDEFAULT);
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
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID:
				return PROD_CATALOG_CATEGORY_TYPE_ID_EDEFAULT == null ? prodCatalogCategoryTypeId != null : !PROD_CATALOG_CATEGORY_TYPE_ID_EDEFAULT.equals(prodCatalogCategoryTypeId);
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE_ID:
				return PARENT_TYPE_ID_EDEFAULT == null ? parentTypeId != null : !PARENT_TYPE_ID_EDEFAULT.equals(parentTypeId);
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
		result.append(" (prodCatalogCategoryTypeId: ");
		result.append(prodCatalogCategoryTypeId);
		result.append(", description: ");
		result.append(description);
		result.append(", parentTypeId: ");
		result.append(parentTypeId);
		result.append(')');
		return result.toString();
	}

} //ProdCatalogCategoryTypeImpl
