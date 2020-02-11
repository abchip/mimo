/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.position;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.humanres.position.PositionPackage
 * @generated
 */
public interface PositionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PositionFactory eINSTANCE = org.abchip.mimo.biz.humanres.position.impl.PositionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Empl Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position</em>'.
	 * @generated
	 */
	EmplPosition createEmplPosition();

	/**
	 * Returns a new object of class '<em>Empl Position Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position Class Type</em>'.
	 * @generated
	 */
	EmplPositionClassType createEmplPositionClassType();

	/**
	 * Returns a new object of class '<em>Empl Position Fulfillment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position Fulfillment</em>'.
	 * @generated
	 */
	EmplPositionFulfillment createEmplPositionFulfillment();

	/**
	 * Returns a new object of class '<em>Empl Position Reporting Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position Reporting Struct</em>'.
	 * @generated
	 */
	EmplPositionReportingStruct createEmplPositionReportingStruct();

	/**
	 * Returns a new object of class '<em>Empl Position Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position Responsibility</em>'.
	 * @generated
	 */
	EmplPositionResponsibility createEmplPositionResponsibility();

	/**
	 * Returns a new object of class '<em>Empl Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position Type</em>'.
	 * @generated
	 */
	EmplPositionType createEmplPositionType();

	/**
	 * Returns a new object of class '<em>Empl Position Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position Type Class</em>'.
	 * @generated
	 */
	EmplPositionTypeClass createEmplPositionTypeClass();

	/**
	 * Returns a new object of class '<em>Empl Position Type Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empl Position Type Rate</em>'.
	 * @generated
	 */
	EmplPositionTypeRate createEmplPositionTypeRate();

	/**
	 * Returns a new object of class '<em>Valid Responsibility</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Responsibility</em>'.
	 * @generated
	 */
	ValidResponsibility createValidResponsibility();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PositionPackage getPositionPackage();

} //PositionFactory
