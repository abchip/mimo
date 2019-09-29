/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.abchip.mimo.util;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.util.UtilPackage
 * @generated
 */
public interface UtilFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilFactory eINSTANCE = org.abchip.mimo.util.impl.UtilFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Binary Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Def</em>'.
	 * @generated
	 */
	BinaryDef createBinaryDef();

	/**
	 * Returns a new object of class '<em>Character Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character Def</em>'.
	 * @generated
	 */
	CharacterDef createCharacterDef();

	/**
	 * Returns a new object of class '<em>Datetime Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datetime Def</em>'.
	 * @generated
	 */
	DatetimeDef createDatetimeDef();

	/**
	 * Returns a new object of class '<em>Decimal Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Def</em>'.
	 * @generated
	 */
	DecimalDef createDecimalDef();

	/**
	 * Returns a new object of class '<em>Floating Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floating Def</em>'.
	 * @generated
	 */
	FloatingDef createFloatingDef();

	/**
	 * Returns a new object of class '<em>Identity Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Def</em>'.
	 * @generated
	 */
	IdentityDef createIdentityDef();

	/**
	 * Returns a new object of class '<em>Numeric Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Def</em>'.
	 * @generated
	 */
	NumericDef createNumericDef();

	/**
	 * Returns a new object of class '<em>String Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Def</em>'.
	 * @generated
	 */
	StringDef createStringDef();

	/**
	 * Returns a new object of class '<em>Thread Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread Info</em>'.
	 * @generated
	 */
	ThreadInfo createThreadInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilPackage getUtilPackage();

} //UtilFactory
