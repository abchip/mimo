/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.data;

import org.abchip.mimo.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = org.abchip.mimo.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.BinaryDefImpl <em>Binary Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.BinaryDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getBinaryDef()
	 * @generated
	 */
	int BINARY_DEF = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.DataDefImpl <em>Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.DataDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDataDef()
	 * @generated
	 */
	int DATA_DEF = 2;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__FORMULAS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__TYPE = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unsigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF__UNSIGNED = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.CharacterDefImpl <em>Character Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.CharacterDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getCharacterDef()
	 * @generated
	 */
	int CHARACTER_DEF = 1;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__LENGTH = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Varying</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF__VARYING = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Character Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.DatetimeDefImpl <em>Datetime Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.DatetimeDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDatetimeDef()
	 * @generated
	 */
	int DATETIME_DEF = 3;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__TYPE = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__DATE_FORMAT = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF__TIME_FORMAT = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Datetime Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.DecimalDefImpl <em>Decimal Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.DecimalDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDecimalDef()
	 * @generated
	 */
	int DECIMAL_DEF = 4;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__PRECISION = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__SCALE = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF__TYPE = DATA_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.FloatingDefImpl <em>Floating Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.FloatingDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getFloatingDef()
	 * @generated
	 */
	int FLOATING_DEF = 5;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF__TYPE = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Floating Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOATING_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.IdentityDefImpl <em>Identity Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.IdentityDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getIdentityDef()
	 * @generated
	 */
	int IDENTITY_DEF = 6;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Identity Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTITY_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.NumericDefImpl <em>Numeric Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.NumericDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getNumericDef()
	 * @generated
	 */
	int NUMERIC_DEF = 7;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>Numeric Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.impl.StringDefImpl <em>String Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.impl.StringDefImpl
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getStringDef()
	 * @generated
	 */
	int STRING_DEF = 8;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF__FORMULAS = DATA_DEF__FORMULAS;

	/**
	 * The number of structural features of the '<em>String Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.BinaryType <em>Binary Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.BinaryType
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.DataDefType <em>Def Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.DataDefType
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDataDefType()
	 * @generated
	 */
	int DATA_DEF_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.DatetimeType <em>Datetime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.DatetimeType
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDatetimeType()
	 * @generated
	 */
	int DATETIME_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.DateFormat <em>Date Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.DateFormat
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDateFormat()
	 * @generated
	 */
	int DATE_FORMAT = 12;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.DecimalType <em>Decimal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.DecimalType
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDecimalType()
	 * @generated
	 */
	int DECIMAL_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.FloatingType <em>Floating Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.FloatingType
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getFloatingType()
	 * @generated
	 */
	int FLOATING_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.data.TimeFormat <em>Time Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.data.TimeFormat
	 * @see org.abchip.mimo.data.impl.DataPackageImpl#getTimeFormat()
	 * @generated
	 */
	int TIME_FORMAT = 15;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.BinaryDef <em>Binary Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Def</em>'.
	 * @see org.abchip.mimo.data.BinaryDef
	 * @generated
	 */
	EClass getBinaryDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.BinaryDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.data.BinaryDef#getType()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.BinaryDef#isUnsigned <em>Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsigned</em>'.
	 * @see org.abchip.mimo.data.BinaryDef#isUnsigned()
	 * @see #getBinaryDef()
	 * @generated
	 */
	EAttribute getBinaryDef_Unsigned();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.CharacterDef <em>Character Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Def</em>'.
	 * @see org.abchip.mimo.data.CharacterDef
	 * @generated
	 */
	EClass getCharacterDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.CharacterDef#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.abchip.mimo.data.CharacterDef#getLength()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.CharacterDef#isVarying <em>Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varying</em>'.
	 * @see org.abchip.mimo.data.CharacterDef#isVarying()
	 * @see #getCharacterDef()
	 * @generated
	 */
	EAttribute getCharacterDef_Varying();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.DataDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def</em>'.
	 * @see org.abchip.mimo.data.DataDef
	 * @generated
	 */
	EClass getDataDef();

	/**
	 * Returns the meta object for the attribute list '{@link org.abchip.mimo.data.DataDef#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Formulas</em>'.
	 * @see org.abchip.mimo.data.DataDef#getFormulas()
	 * @see #getDataDef()
	 * @generated
	 */
	EAttribute getDataDef_Formulas();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.DatetimeDef <em>Datetime Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime Def</em>'.
	 * @see org.abchip.mimo.data.DatetimeDef
	 * @generated
	 */
	EClass getDatetimeDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.DatetimeDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.data.DatetimeDef#getType()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.DatetimeDef#getDateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format</em>'.
	 * @see org.abchip.mimo.data.DatetimeDef#getDateFormat()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_DateFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.DatetimeDef#getTimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Format</em>'.
	 * @see org.abchip.mimo.data.DatetimeDef#getTimeFormat()
	 * @see #getDatetimeDef()
	 * @generated
	 */
	EAttribute getDatetimeDef_TimeFormat();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.DecimalDef <em>Decimal Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Def</em>'.
	 * @see org.abchip.mimo.data.DecimalDef
	 * @generated
	 */
	EClass getDecimalDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.DecimalDef#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.abchip.mimo.data.DecimalDef#getPrecision()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.DecimalDef#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.abchip.mimo.data.DecimalDef#getScale()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.DecimalDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.data.DecimalDef#getType()
	 * @see #getDecimalDef()
	 * @generated
	 */
	EAttribute getDecimalDef_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.FloatingDef <em>Floating Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floating Def</em>'.
	 * @see org.abchip.mimo.data.FloatingDef
	 * @generated
	 */
	EClass getFloatingDef();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.data.FloatingDef#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.abchip.mimo.data.FloatingDef#getType()
	 * @see #getFloatingDef()
	 * @generated
	 */
	EAttribute getFloatingDef_Type();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.IdentityDef <em>Identity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identity Def</em>'.
	 * @see org.abchip.mimo.data.IdentityDef
	 * @generated
	 */
	EClass getIdentityDef();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.NumericDef <em>Numeric Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Def</em>'.
	 * @see org.abchip.mimo.data.NumericDef
	 * @generated
	 */
	EClass getNumericDef();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.data.StringDef <em>String Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Def</em>'.
	 * @see org.abchip.mimo.data.StringDef
	 * @generated
	 */
	EClass getStringDef();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.data.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Type</em>'.
	 * @see org.abchip.mimo.data.BinaryType
	 * @generated
	 */
	EEnum getBinaryType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.data.DataDefType <em>Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Def Type</em>'.
	 * @see org.abchip.mimo.data.DataDefType
	 * @generated
	 */
	EEnum getDataDefType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.data.DatetimeType <em>Datetime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datetime Type</em>'.
	 * @see org.abchip.mimo.data.DatetimeType
	 * @generated
	 */
	EEnum getDatetimeType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.data.DateFormat <em>Date Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Format</em>'.
	 * @see org.abchip.mimo.data.DateFormat
	 * @generated
	 */
	EEnum getDateFormat();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.data.DecimalType <em>Decimal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decimal Type</em>'.
	 * @see org.abchip.mimo.data.DecimalType
	 * @generated
	 */
	EEnum getDecimalType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.data.FloatingType <em>Floating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Floating Type</em>'.
	 * @see org.abchip.mimo.data.FloatingType
	 * @generated
	 */
	EEnum getFloatingType();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.data.TimeFormat <em>Time Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Format</em>'.
	 * @see org.abchip.mimo.data.TimeFormat
	 * @generated
	 */
	EEnum getTimeFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.BinaryDefImpl <em>Binary Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.BinaryDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getBinaryDef()
		 * @generated
		 */
		EClass BINARY_DEF = eINSTANCE.getBinaryDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__TYPE = eINSTANCE.getBinaryDef_Type();

		/**
		 * The meta object literal for the '<em><b>Unsigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEF__UNSIGNED = eINSTANCE.getBinaryDef_Unsigned();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.CharacterDefImpl <em>Character Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.CharacterDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getCharacterDef()
		 * @generated
		 */
		EClass CHARACTER_DEF = eINSTANCE.getCharacterDef();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__LENGTH = eINSTANCE.getCharacterDef_Length();

		/**
		 * The meta object literal for the '<em><b>Varying</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_DEF__VARYING = eINSTANCE.getCharacterDef_Varying();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.DataDefImpl <em>Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.DataDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDataDef()
		 * @generated
		 */
		EClass DATA_DEF = eINSTANCE.getDataDef();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_DEF__FORMULAS = eINSTANCE.getDataDef_Formulas();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.DatetimeDefImpl <em>Datetime Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.DatetimeDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDatetimeDef()
		 * @generated
		 */
		EClass DATETIME_DEF = eINSTANCE.getDatetimeDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__TYPE = eINSTANCE.getDatetimeDef_Type();

		/**
		 * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__DATE_FORMAT = eINSTANCE.getDatetimeDef_DateFormat();

		/**
		 * The meta object literal for the '<em><b>Time Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME_DEF__TIME_FORMAT = eINSTANCE.getDatetimeDef_TimeFormat();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.DecimalDefImpl <em>Decimal Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.DecimalDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDecimalDef()
		 * @generated
		 */
		EClass DECIMAL_DEF = eINSTANCE.getDecimalDef();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__PRECISION = eINSTANCE.getDecimalDef_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__SCALE = eINSTANCE.getDecimalDef_Scale();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_DEF__TYPE = eINSTANCE.getDecimalDef_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.FloatingDefImpl <em>Floating Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.FloatingDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getFloatingDef()
		 * @generated
		 */
		EClass FLOATING_DEF = eINSTANCE.getFloatingDef();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOATING_DEF__TYPE = eINSTANCE.getFloatingDef_Type();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.IdentityDefImpl <em>Identity Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.IdentityDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getIdentityDef()
		 * @generated
		 */
		EClass IDENTITY_DEF = eINSTANCE.getIdentityDef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.NumericDefImpl <em>Numeric Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.NumericDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getNumericDef()
		 * @generated
		 */
		EClass NUMERIC_DEF = eINSTANCE.getNumericDef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.impl.StringDefImpl <em>String Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.impl.StringDefImpl
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getStringDef()
		 * @generated
		 */
		EClass STRING_DEF = eINSTANCE.getStringDef();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.BinaryType <em>Binary Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.BinaryType
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getBinaryType()
		 * @generated
		 */
		EEnum BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.DataDefType <em>Def Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.DataDefType
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDataDefType()
		 * @generated
		 */
		EEnum DATA_DEF_TYPE = eINSTANCE.getDataDefType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.DatetimeType <em>Datetime Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.DatetimeType
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDatetimeType()
		 * @generated
		 */
		EEnum DATETIME_TYPE = eINSTANCE.getDatetimeType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.DateFormat <em>Date Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.DateFormat
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDateFormat()
		 * @generated
		 */
		EEnum DATE_FORMAT = eINSTANCE.getDateFormat();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.DecimalType <em>Decimal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.DecimalType
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getDecimalType()
		 * @generated
		 */
		EEnum DECIMAL_TYPE = eINSTANCE.getDecimalType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.FloatingType <em>Floating Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.FloatingType
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getFloatingType()
		 * @generated
		 */
		EEnum FLOATING_TYPE = eINSTANCE.getFloatingType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.data.TimeFormat <em>Time Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.data.TimeFormat
		 * @see org.abchip.mimo.data.impl.DataPackageImpl#getTimeFormat()
		 * @generated
		 */
		EEnum TIME_FORMAT = eINSTANCE.getTimeFormat();

	}

} //DataPackage
