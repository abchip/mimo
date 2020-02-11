/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.config;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.config.ConfigPackage
 * @generated
 */
public interface ConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigFactory eINSTANCE = org.abchip.mimo.biz.product.config.impl.ConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Option Product Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option Product Option</em>'.
	 * @generated
	 */
	ConfigOptionProductOption createConfigOptionProductOption();

	/**
	 * Returns a new object of class '<em>Prod Conf Item Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prod Conf Item Content</em>'.
	 * @generated
	 */
	ProdConfItemContent createProdConfItemContent();

	/**
	 * Returns a new object of class '<em>Prod Conf Item Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prod Conf Item Content Type</em>'.
	 * @generated
	 */
	ProdConfItemContentType createProdConfItemContentType();

	/**
	 * Returns a new object of class '<em>Product Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Config</em>'.
	 * @generated
	 */
	ProductConfig createProductConfig();

	/**
	 * Returns a new object of class '<em>Product Config Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Config Config</em>'.
	 * @generated
	 */
	ProductConfigConfig createProductConfigConfig();

	/**
	 * Returns a new object of class '<em>Product Config Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Config Item</em>'.
	 * @generated
	 */
	ProductConfigItem createProductConfigItem();

	/**
	 * Returns a new object of class '<em>Product Config Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Config Option</em>'.
	 * @generated
	 */
	ProductConfigOption createProductConfigOption();

	/**
	 * Returns a new object of class '<em>Product Config Option Iactn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Config Option Iactn</em>'.
	 * @generated
	 */
	ProductConfigOptionIactn createProductConfigOptionIactn();

	/**
	 * Returns a new object of class '<em>Product Config Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Config Product</em>'.
	 * @generated
	 */
	ProductConfigProduct createProductConfigProduct();

	/**
	 * Returns a new object of class '<em>Product Config Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Config Stats</em>'.
	 * @generated
	 */
	ProductConfigStats createProductConfigStats();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigPackage getConfigPackage();

} //ConfigFactory
