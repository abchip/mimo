/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.data.impl;

import org.abchip.mimo.data.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFactoryImpl extends EFactoryImpl implements DataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataFactory init() {
		try {
			DataFactory theDataFactory = (DataFactory)EPackage.Registry.INSTANCE.getEFactory(DataPackage.eNS_URI);
			if (theDataFactory != null) {
				return theDataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataPackage.BINARY_DEF: return (EObject)createBinaryDef();
			case DataPackage.CHARACTER_DEF: return (EObject)createCharacterDef();
			case DataPackage.DATETIME_DEF: return (EObject)createDatetimeDef();
			case DataPackage.DECIMAL_DEF: return (EObject)createDecimalDef();
			case DataPackage.FLOATING_DEF: return (EObject)createFloatingDef();
			case DataPackage.IDENTITY_DEF: return (EObject)createIdentityDef();
			case DataPackage.NUMERIC_DEF: return (EObject)createNumericDef();
			case DataPackage.STRING_DEF: return (EObject)createStringDef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DataPackage.BINARY_TYPE:
				return createBinaryTypeFromString(eDataType, initialValue);
			case DataPackage.DATA_DEF_TYPE:
				return createDataDefTypeFromString(eDataType, initialValue);
			case DataPackage.DATETIME_TYPE:
				return createDatetimeTypeFromString(eDataType, initialValue);
			case DataPackage.DATE_FORMAT:
				return createDateFormatFromString(eDataType, initialValue);
			case DataPackage.DECIMAL_TYPE:
				return createDecimalTypeFromString(eDataType, initialValue);
			case DataPackage.FLOATING_TYPE:
				return createFloatingTypeFromString(eDataType, initialValue);
			case DataPackage.TIME_FORMAT:
				return createTimeFormatFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DataPackage.BINARY_TYPE:
				return convertBinaryTypeToString(eDataType, instanceValue);
			case DataPackage.DATA_DEF_TYPE:
				return convertDataDefTypeToString(eDataType, instanceValue);
			case DataPackage.DATETIME_TYPE:
				return convertDatetimeTypeToString(eDataType, instanceValue);
			case DataPackage.DATE_FORMAT:
				return convertDateFormatToString(eDataType, instanceValue);
			case DataPackage.DECIMAL_TYPE:
				return convertDecimalTypeToString(eDataType, instanceValue);
			case DataPackage.FLOATING_TYPE:
				return convertFloatingTypeToString(eDataType, instanceValue);
			case DataPackage.TIME_FORMAT:
				return convertTimeFormatToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryDef createBinaryDef() {
		BinaryDefImpl binaryDef = new BinaryDefImpl();
		return binaryDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterDef createCharacterDef() {
		CharacterDefImpl characterDef = new CharacterDefImpl();
		return characterDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatetimeDef createDatetimeDef() {
		DatetimeDefImpl datetimeDef = new DatetimeDefImpl();
		return datetimeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalDef createDecimalDef() {
		DecimalDefImpl decimalDef = new DecimalDefImpl();
		return decimalDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FloatingDef createFloatingDef() {
		FloatingDefImpl floatingDef = new FloatingDefImpl();
		return floatingDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentityDef createIdentityDef() {
		IdentityDefImpl identityDef = new IdentityDefImpl();
		return identityDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericDef createNumericDef() {
		NumericDefImpl numericDef = new NumericDefImpl();
		return numericDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringDef createStringDef() {
		StringDefImpl stringDef = new StringDefImpl();
		return stringDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryType createBinaryTypeFromString(EDataType eDataType, String initialValue) {
		BinaryType result = BinaryType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDefType createDataDefTypeFromString(EDataType eDataType, String initialValue) {
		DataDefType result = DataDefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataDefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatetimeType createDatetimeTypeFromString(EDataType eDataType, String initialValue) {
		DatetimeType result = DatetimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateFormat createDateFormatFromString(EDataType eDataType, String initialValue) {
		DateFormat result = DateFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalType createDecimalTypeFromString(EDataType eDataType, String initialValue) {
		DecimalType result = DecimalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingType createFloatingTypeFromString(EDataType eDataType, String initialValue) {
		FloatingType result = FloatingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeFormat createTimeFormatFromString(EDataType eDataType, String initialValue) {
		TimeFormat result = TimeFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataPackage getDataPackage() {
		return (DataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataPackage getPackage() {
		return DataPackage.eINSTANCE;
	}

} //DataFactoryImpl
