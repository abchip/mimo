/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.price;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.price.PricePackage
 * @generated
 */
public interface PriceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PriceFactory eINSTANCE = org.abchip.mimo.biz.product.price.impl.PriceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Feature Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Feature Price</em>'.
	 * @generated
	 */
	ProductFeaturePrice createProductFeaturePrice();

	/**
	 * Returns a new object of class '<em>Product Payment Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Payment Method Type</em>'.
	 * @generated
	 */
	ProductPaymentMethodType createProductPaymentMethodType();

	/**
	 * Returns a new object of class '<em>Product Price</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price</em>'.
	 * @generated
	 */
	ProductPrice createProductPrice();

	/**
	 * Returns a new object of class '<em>Product Price Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Action</em>'.
	 * @generated
	 */
	ProductPriceAction createProductPriceAction();

	/**
	 * Returns a new object of class '<em>Product Price Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Action Type</em>'.
	 * @generated
	 */
	ProductPriceActionType createProductPriceActionType();

	/**
	 * Returns a new object of class '<em>Product Price Auto Notice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Auto Notice</em>'.
	 * @generated
	 */
	ProductPriceAutoNotice createProductPriceAutoNotice();

	/**
	 * Returns a new object of class '<em>Product Price Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Change</em>'.
	 * @generated
	 */
	ProductPriceChange createProductPriceChange();

	/**
	 * Returns a new object of class '<em>Product Price Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Cond</em>'.
	 * @generated
	 */
	ProductPriceCond createProductPriceCond();

	/**
	 * Returns a new object of class '<em>Product Price Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Purpose</em>'.
	 * @generated
	 */
	ProductPricePurpose createProductPricePurpose();

	/**
	 * Returns a new object of class '<em>Product Price Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Rule</em>'.
	 * @generated
	 */
	ProductPriceRule createProductPriceRule();

	/**
	 * Returns a new object of class '<em>Product Price Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Price Type</em>'.
	 * @generated
	 */
	ProductPriceType createProductPriceType();

	/**
	 * Returns a new object of class '<em>Quantity Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Break</em>'.
	 * @generated
	 */
	QuantityBreak createQuantityBreak();

	/**
	 * Returns a new object of class '<em>Quantity Break Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Break Type</em>'.
	 * @generated
	 */
	QuantityBreakType createQuantityBreakType();

	/**
	 * Returns a new object of class '<em>Sale Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sale Type</em>'.
	 * @generated
	 */
	SaleType createSaleType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PricePackage getPricePackage();

} //PriceFactory
