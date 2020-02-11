/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.cost;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.product.cost.CostPackage
 * @generated
 */
public interface CostFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CostFactory eINSTANCE = org.abchip.mimo.biz.product.cost.impl.CostFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	CostComponent createCostComponent();

	/**
	 * Returns a new object of class '<em>Component Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Attribute</em>'.
	 * @generated
	 */
	CostComponentAttribute createCostComponentAttribute();

	/**
	 * Returns a new object of class '<em>Component Calc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Calc</em>'.
	 * @generated
	 */
	CostComponentCalc createCostComponentCalc();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	CostComponentType createCostComponentType();

	/**
	 * Returns a new object of class '<em>Component Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type Attr</em>'.
	 * @generated
	 */
	CostComponentTypeAttr createCostComponentTypeAttr();

	/**
	 * Returns a new object of class '<em>Product Cost Component Calc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Cost Component Calc</em>'.
	 * @generated
	 */
	ProductCostComponentCalc createProductCostComponentCalc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CostPackage getCostPackage();

} //CostFactory
