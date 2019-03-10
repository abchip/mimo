/**
 *  Copyright (c) 2017, 2019 ABChip and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *
 * Contributors:
 *   Mattia Rocchi - Initial API and implementation
 */
package org.abchip.mimo.util.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

import java.lang.annotation.Annotation;

import java.lang.reflect.Type;

import java.net.URI;
import java.net.URL;

import java.util.Dictionary;
import java.util.Map;
import java.util.Properties;

import org.abchip.mimo.util.BinaryDef;
import org.abchip.mimo.util.BinaryType;
import org.abchip.mimo.util.CharacterDef;
import org.abchip.mimo.util.DataDefType;
import org.abchip.mimo.util.DateFormat;
import org.abchip.mimo.util.DatetimeDef;
import org.abchip.mimo.util.DatetimeType;
import org.abchip.mimo.util.DecimalDef;
import org.abchip.mimo.util.DecimalType;
import org.abchip.mimo.util.FloatingDef;
import org.abchip.mimo.util.FloatingType;
import org.abchip.mimo.util.IdentityDef;
import org.abchip.mimo.util.UtilFactory;
import org.abchip.mimo.util.UtilPackage;
import org.abchip.mimo.util.NumericDef;
import org.abchip.mimo.util.StringDef;
import org.abchip.mimo.util.ThreadInfo;
import org.abchip.mimo.util.ThreadStatus;
import org.abchip.mimo.util.TimeFormat;
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
public class UtilFactoryImpl extends EFactoryImpl implements UtilFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilFactory init() {
		try {
			UtilFactory theUtilFactory = (UtilFactory)EPackage.Registry.INSTANCE.getEFactory(UtilPackage.eNS_URI);
			if (theUtilFactory != null) {
				return theUtilFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactoryImpl() {
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
			case UtilPackage.BINARY_DEF: return (EObject)createBinaryDef();
			case UtilPackage.CHARACTER_DEF: return (EObject)createCharacterDef();
			case UtilPackage.DATETIME_DEF: return (EObject)createDatetimeDef();
			case UtilPackage.DECIMAL_DEF: return (EObject)createDecimalDef();
			case UtilPackage.FLOATING_DEF: return (EObject)createFloatingDef();
			case UtilPackage.IDENTITY_DEF: return (EObject)createIdentityDef();
			case UtilPackage.NUMERIC_DEF: return (EObject)createNumericDef();
			case UtilPackage.STRING_DEF: return (EObject)createStringDef();
			case UtilPackage.THREAD_INFO: return (EObject)createThreadInfo();
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
			case UtilPackage.BINARY_TYPE:
				return createBinaryTypeFromString(eDataType, initialValue);
			case UtilPackage.DATA_DEF_TYPE:
				return createDataDefTypeFromString(eDataType, initialValue);
			case UtilPackage.DATETIME_TYPE:
				return createDatetimeTypeFromString(eDataType, initialValue);
			case UtilPackage.DATE_FORMAT:
				return createDateFormatFromString(eDataType, initialValue);
			case UtilPackage.DECIMAL_TYPE:
				return createDecimalTypeFromString(eDataType, initialValue);
			case UtilPackage.FLOATING_TYPE:
				return createFloatingTypeFromString(eDataType, initialValue);
			case UtilPackage.THREAD_STATUS:
				return createThreadStatusFromString(eDataType, initialValue);
			case UtilPackage.TIME_FORMAT:
				return createTimeFormatFromString(eDataType, initialValue);
			case UtilPackage.JAVA_ANNOTATION:
				return createJavaAnnotationFromString(eDataType, initialValue);
			case UtilPackage.JAVA_DICTIONARY:
				return createJavaDictionaryFromString(eDataType, initialValue);
			case UtilPackage.JAVA_EXCEPTION:
				return createJavaExceptionFromString(eDataType, initialValue);
			case UtilPackage.JAVA_INPUT_STREAM:
				return createJavaInputStreamFromString(eDataType, initialValue);
			case UtilPackage.JAVA_IO_EXCEPTION:
				return createJavaIOExceptionFromString(eDataType, initialValue);
			case UtilPackage.JAVA_MAP:
				return createJavaMapFromString(eDataType, initialValue);
			case UtilPackage.JAVA_OUTPUT_STREAM:
				return createJavaOutputStreamFromString(eDataType, initialValue);
			case UtilPackage.JAVA_PROPERTIES:
				return createJavaPropertiesFromString(eDataType, initialValue);
			case UtilPackage.JAVA_THROWABLE:
				return createJavaThrowableFromString(eDataType, initialValue);
			case UtilPackage.JAVA_TYPE:
				return createJavaTypeFromString(eDataType, initialValue);
			case UtilPackage.JAVA_URI:
				return createJavaURIFromString(eDataType, initialValue);
			case UtilPackage.JAVA_URL:
				return createJavaURLFromString(eDataType, initialValue);
			case UtilPackage.JAVA_WRITER:
				return createJavaWriterFromString(eDataType, initialValue);
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
			case UtilPackage.BINARY_TYPE:
				return convertBinaryTypeToString(eDataType, instanceValue);
			case UtilPackage.DATA_DEF_TYPE:
				return convertDataDefTypeToString(eDataType, instanceValue);
			case UtilPackage.DATETIME_TYPE:
				return convertDatetimeTypeToString(eDataType, instanceValue);
			case UtilPackage.DATE_FORMAT:
				return convertDateFormatToString(eDataType, instanceValue);
			case UtilPackage.DECIMAL_TYPE:
				return convertDecimalTypeToString(eDataType, instanceValue);
			case UtilPackage.FLOATING_TYPE:
				return convertFloatingTypeToString(eDataType, instanceValue);
			case UtilPackage.THREAD_STATUS:
				return convertThreadStatusToString(eDataType, instanceValue);
			case UtilPackage.TIME_FORMAT:
				return convertTimeFormatToString(eDataType, instanceValue);
			case UtilPackage.JAVA_ANNOTATION:
				return convertJavaAnnotationToString(eDataType, instanceValue);
			case UtilPackage.JAVA_DICTIONARY:
				return convertJavaDictionaryToString(eDataType, instanceValue);
			case UtilPackage.JAVA_EXCEPTION:
				return convertJavaExceptionToString(eDataType, instanceValue);
			case UtilPackage.JAVA_INPUT_STREAM:
				return convertJavaInputStreamToString(eDataType, instanceValue);
			case UtilPackage.JAVA_IO_EXCEPTION:
				return convertJavaIOExceptionToString(eDataType, instanceValue);
			case UtilPackage.JAVA_MAP:
				return convertJavaMapToString(eDataType, instanceValue);
			case UtilPackage.JAVA_OUTPUT_STREAM:
				return convertJavaOutputStreamToString(eDataType, instanceValue);
			case UtilPackage.JAVA_PROPERTIES:
				return convertJavaPropertiesToString(eDataType, instanceValue);
			case UtilPackage.JAVA_THROWABLE:
				return convertJavaThrowableToString(eDataType, instanceValue);
			case UtilPackage.JAVA_TYPE:
				return convertJavaTypeToString(eDataType, instanceValue);
			case UtilPackage.JAVA_URI:
				return convertJavaURIToString(eDataType, instanceValue);
			case UtilPackage.JAVA_URL:
				return convertJavaURLToString(eDataType, instanceValue);
			case UtilPackage.JAVA_WRITER:
				return convertJavaWriterToString(eDataType, instanceValue);
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
	@Override
	public ThreadInfo createThreadInfo() {
		ThreadInfoImpl threadInfo = new ThreadInfoImpl();
		return threadInfo;
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
	public ThreadStatus createThreadStatusFromString(EDataType eDataType, String initialValue) {
		ThreadStatus result = ThreadStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThreadStatusToString(EDataType eDataType, Object instanceValue) {
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
	public Annotation createJavaAnnotationFromString(EDataType eDataType, String initialValue) {
		return (Annotation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaAnnotationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary<?, ?> createJavaDictionaryFromString(EDataType eDataType, String initialValue) {
		return (Dictionary<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaDictionaryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createJavaExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createJavaInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createJavaIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createJavaMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createJavaOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createJavaPropertiesFromString(EDataType eDataType, String initialValue) {
		return (Properties)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaPropertiesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createJavaThrowableFromString(EDataType eDataType, String initialValue) {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaThrowableToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createJavaTypeFromString(EDataType eDataType, String initialValue) {
		return (Type)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createJavaURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createJavaURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writer createJavaWriterFromString(EDataType eDataType, String initialValue) {
		return (Writer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJavaWriterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UtilPackage getUtilPackage() {
		return (UtilPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilPackage getPackage() {
		return UtilPackage.eINSTANCE;
	}

} //UtilFactoryImpl
