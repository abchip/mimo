/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.catalog.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityTypeImpl;
import org.abchip.mimo.biz.product.catalog.CatalogPackage;
import org.abchip.mimo.biz.product.catalog.ProdCatalogCategory;
import org.abchip.mimo.biz.product.catalog.ProdCatalogCategoryType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(CatalogPackage.Literals.PROD_CATALOG_CATEGORY_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCatalogCategoryType getParentTypeId() {
		return (ProdCatalogCategoryType)eGet(CatalogPackage.Literals.PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentTypeId(ProdCatalogCategoryType newParentTypeId) {
		eSet(CatalogPackage.Literals.PROD_CATALOG_CATEGORY_TYPE__PARENT_TYPE_ID, newParentTypeId);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CatalogPackage.PROD_CATALOG_CATEGORY_TYPE___CHILD_PROD_CATALOG_CATEGORY_TYPES:
				return childProdCatalogCategoryTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProdCatalogCategoryTypeId() {
		return (String)eGet(CatalogPackage.Literals.PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProdCatalogCategoryTypeId(String newProdCatalogCategoryTypeId) {
		eSet(CatalogPackage.Literals.PROD_CATALOG_CATEGORY_TYPE__PROD_CATALOG_CATEGORY_TYPE_ID, newProdCatalogCategoryTypeId);
	}

} //ProdCatalogCategoryTypeImpl
