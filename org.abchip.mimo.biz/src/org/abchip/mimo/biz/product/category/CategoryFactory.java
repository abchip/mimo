/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.category;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.category.CategoryPackage
 * @generated
 */
public interface CategoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CategoryFactory eINSTANCE = org.abchip.mimo.biz.product.category.impl.CategoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category</em>'.
	 * @generated
	 */
	ProductCategory createProductCategory();

	/**
	 * Returns a new object of class '<em>Product Category Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Attribute</em>'.
	 * @generated
	 */
	ProductCategoryAttribute createProductCategoryAttribute();

	/**
	 * Returns a new object of class '<em>Product Category Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Content</em>'.
	 * @generated
	 */
	ProductCategoryContent createProductCategoryContent();

	/**
	 * Returns a new object of class '<em>Product Category Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Content Type</em>'.
	 * @generated
	 */
	ProductCategoryContentType createProductCategoryContentType();

	/**
	 * Returns a new object of class '<em>Product Category Gl Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Gl Account</em>'.
	 * @generated
	 */
	ProductCategoryGlAccount createProductCategoryGlAccount();

	/**
	 * Returns a new object of class '<em>Product Category Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Link</em>'.
	 * @generated
	 */
	ProductCategoryLink createProductCategoryLink();

	/**
	 * Returns a new object of class '<em>Product Category Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Member</em>'.
	 * @generated
	 */
	ProductCategoryMember createProductCategoryMember();

	/**
	 * Returns a new object of class '<em>Product Category Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Role</em>'.
	 * @generated
	 */
	ProductCategoryRole createProductCategoryRole();

	/**
	 * Returns a new object of class '<em>Product Category Rollup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Rollup</em>'.
	 * @generated
	 */
	ProductCategoryRollup createProductCategoryRollup();

	/**
	 * Returns a new object of class '<em>Product Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Type</em>'.
	 * @generated
	 */
	ProductCategoryType createProductCategoryType();

	/**
	 * Returns a new object of class '<em>Product Category Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Category Type Attr</em>'.
	 * @generated
	 */
	ProductCategoryTypeAttr createProductCategoryTypeAttr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CategoryPackage getCategoryPackage();

} //CategoryFactory
