/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.catalog.CatalogPackage
 * @generated
 */
public interface CatalogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogFactory eINSTANCE = org.abchip.mimo.biz.product.catalog.impl.CatalogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Prod Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prod Catalog</em>'.
	 * @generated
	 */
	ProdCatalog createProdCatalog();

	/**
	 * Returns a new object of class '<em>Prod Catalog Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prod Catalog Category</em>'.
	 * @generated
	 */
	ProdCatalogCategory createProdCatalogCategory();

	/**
	 * Returns a new object of class '<em>Prod Catalog Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prod Catalog Category Type</em>'.
	 * @generated
	 */
	ProdCatalogCategoryType createProdCatalogCategoryType();

	/**
	 * Returns a new object of class '<em>Prod Catalog Inv Facility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prod Catalog Inv Facility</em>'.
	 * @generated
	 */
	ProdCatalogInvFacility createProdCatalogInvFacility();

	/**
	 * Returns a new object of class '<em>Prod Catalog Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prod Catalog Role</em>'.
	 * @generated
	 */
	ProdCatalogRole createProdCatalogRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CatalogPackage getCatalogPackage();

} //CatalogFactory
