/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.promo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.promo.PromoPackage
 * @generated
 */
public interface PromoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PromoFactory eINSTANCE = org.abchip.mimo.biz.product.promo.impl.PromoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Promo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo</em>'.
	 * @generated
	 */
	ProductPromo createProductPromo();

	/**
	 * Returns a new object of class '<em>Product Promo Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Action</em>'.
	 * @generated
	 */
	ProductPromoAction createProductPromoAction();

	/**
	 * Returns a new object of class '<em>Product Promo Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Category</em>'.
	 * @generated
	 */
	ProductPromoCategory createProductPromoCategory();

	/**
	 * Returns a new object of class '<em>Product Promo Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Code</em>'.
	 * @generated
	 */
	ProductPromoCode createProductPromoCode();

	/**
	 * Returns a new object of class '<em>Product Promo Code Email</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Code Email</em>'.
	 * @generated
	 */
	ProductPromoCodeEmail createProductPromoCodeEmail();

	/**
	 * Returns a new object of class '<em>Product Promo Code Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Code Party</em>'.
	 * @generated
	 */
	ProductPromoCodeParty createProductPromoCodeParty();

	/**
	 * Returns a new object of class '<em>Product Promo Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Cond</em>'.
	 * @generated
	 */
	ProductPromoCond createProductPromoCond();

	/**
	 * Returns a new object of class '<em>Product Promo Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Content</em>'.
	 * @generated
	 */
	ProductPromoContent createProductPromoContent();

	/**
	 * Returns a new object of class '<em>Product Promo Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Product</em>'.
	 * @generated
	 */
	ProductPromoProduct createProductPromoProduct();

	/**
	 * Returns a new object of class '<em>Product Promo Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Rule</em>'.
	 * @generated
	 */
	ProductPromoRule createProductPromoRule();

	/**
	 * Returns a new object of class '<em>Product Promo Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Promo Use</em>'.
	 * @generated
	 */
	ProductPromoUse createProductPromoUse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PromoPackage getPromoPackage();

} //PromoFactory
