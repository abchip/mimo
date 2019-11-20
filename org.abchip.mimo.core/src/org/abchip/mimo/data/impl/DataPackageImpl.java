/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.data.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.application.ApplicationPackage;

import org.abchip.mimo.application.impl.ApplicationPackageImpl;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.context.impl.ContextPackageImpl;

import org.abchip.mimo.data.BinaryDef;
import org.abchip.mimo.data.BinaryType;
import org.abchip.mimo.data.CharacterDef;
import org.abchip.mimo.data.DataDef;
import org.abchip.mimo.data.DataDefType;
import org.abchip.mimo.data.DataFactory;
import org.abchip.mimo.data.DataPackage;
import org.abchip.mimo.data.DateFormat;
import org.abchip.mimo.data.DatetimeDef;
import org.abchip.mimo.data.DatetimeType;
import org.abchip.mimo.data.DecimalDef;
import org.abchip.mimo.data.DecimalType;
import org.abchip.mimo.data.FloatingDef;
import org.abchip.mimo.data.FloatingType;
import org.abchip.mimo.data.IdentityDef;
import org.abchip.mimo.data.NumericDef;
import org.abchip.mimo.data.StringDef;
import org.abchip.mimo.data.TimeFormat;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.entity.impl.EntityPackageImpl;

import org.abchip.mimo.impl.MimoPackageImpl;

import org.abchip.mimo.java.JavaPackage;

import org.abchip.mimo.java.impl.JavaPackageImpl;
import org.abchip.mimo.resource.ResourcePackage;

import org.abchip.mimo.resource.impl.ResourcePackageImpl;

import org.abchip.mimo.util.UtilPackage;

import org.abchip.mimo.util.impl.UtilPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datetimeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataDefTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datetimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decimalTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum floatingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeFormatEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.abchip.mimo.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataPackageImpl theDataPackage = registeredDataPackage instanceof DataPackageImpl ? (DataPackageImpl)registeredDataPackage : new DataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MimoPackage.eNS_URI);
		MimoPackageImpl theMimoPackage = (MimoPackageImpl)(registeredPackage instanceof MimoPackageImpl ? registeredPackage : MimoPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ContextPackageImpl theContextPackage = (ContextPackageImpl)(registeredPackage instanceof ContextPackageImpl ? registeredPackage : ContextPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EntityPackageImpl theEntityPackage = (EntityPackageImpl)(registeredPackage instanceof EntityPackageImpl ? registeredPackage : EntityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl)(registeredPackage instanceof JavaPackageImpl ? registeredPackage : JavaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl)(registeredPackage instanceof ResourcePackageImpl ? registeredPackage : ResourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(registeredPackage instanceof UtilPackageImpl ? registeredPackage : UtilPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theMimoPackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theContextPackage.createPackageContents();
		theEntityPackage.createPackageContents();
		theJavaPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theUtilPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theMimoPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theContextPackage.initializePackageContents();
		theEntityPackage.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theUtilPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryDef() {
		return binaryDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryDef_Type() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryDef_Unsigned() {
		return (EAttribute)binaryDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacterDef() {
		return characterDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterDef_Length() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterDef_Varying() {
		return (EAttribute)characterDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataDef() {
		return dataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataDef_Formulas() {
		return (EAttribute)dataDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatetimeDef() {
		return datetimeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatetimeDef_Type() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatetimeDef_DateFormat() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatetimeDef_TimeFormat() {
		return (EAttribute)datetimeDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalDef() {
		return decimalDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Precision() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Scale() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalDef_Type() {
		return (EAttribute)decimalDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatingDef() {
		return floatingDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloatingDef_Type() {
		return (EAttribute)floatingDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentityDef() {
		return identityDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericDef() {
		return numericDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringDef() {
		return stringDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinaryType() {
		return binaryTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataDefType() {
		return dataDefTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDatetimeType() {
		return datetimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateFormat() {
		return dateFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDecimalType() {
		return decimalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFloatingType() {
		return floatingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeFormat() {
		return timeFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFactory getDataFactory() {
		return (DataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		binaryDefEClass = createEClass(BINARY_DEF);
		createEAttribute(binaryDefEClass, BINARY_DEF__TYPE);
		createEAttribute(binaryDefEClass, BINARY_DEF__UNSIGNED);

		characterDefEClass = createEClass(CHARACTER_DEF);
		createEAttribute(characterDefEClass, CHARACTER_DEF__LENGTH);
		createEAttribute(characterDefEClass, CHARACTER_DEF__VARYING);

		dataDefEClass = createEClass(DATA_DEF);
		createEAttribute(dataDefEClass, DATA_DEF__FORMULAS);

		datetimeDefEClass = createEClass(DATETIME_DEF);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__TYPE);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__DATE_FORMAT);
		createEAttribute(datetimeDefEClass, DATETIME_DEF__TIME_FORMAT);

		decimalDefEClass = createEClass(DECIMAL_DEF);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__PRECISION);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__SCALE);
		createEAttribute(decimalDefEClass, DECIMAL_DEF__TYPE);

		floatingDefEClass = createEClass(FLOATING_DEF);
		createEAttribute(floatingDefEClass, FLOATING_DEF__TYPE);

		identityDefEClass = createEClass(IDENTITY_DEF);

		numericDefEClass = createEClass(NUMERIC_DEF);

		stringDefEClass = createEClass(STRING_DEF);

		// Create enums
		binaryTypeEEnum = createEEnum(BINARY_TYPE);
		dataDefTypeEEnum = createEEnum(DATA_DEF_TYPE);
		datetimeTypeEEnum = createEEnum(DATETIME_TYPE);
		dateFormatEEnum = createEEnum(DATE_FORMAT);
		decimalTypeEEnum = createEEnum(DECIMAL_TYPE);
		floatingTypeEEnum = createEEnum(FLOATING_TYPE);
		timeFormatEEnum = createEEnum(TIME_FORMAT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(dataDefEClass, "D");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getDataDef());
		EGenericType g2 = createEGenericType(ecorePackage.getEByteArray());
		g1.getETypeArguments().add(g2);
		binaryDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		characterDefEClass.getEGenericSuperTypes().add(g1);
		dataDefEClass.getESuperTypes().add(theEntityPackage.getEntity());
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(ecorePackage.getEDate());
		g1.getETypeArguments().add(g2);
		datetimeDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(theJavaPackage.getJavaNumber());
		g1.getETypeArguments().add(g2);
		decimalDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(ecorePackage.getEFloatObject());
		g1.getETypeArguments().add(g2);
		floatingDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(theJavaPackage.getJavaNumber());
		g1.getETypeArguments().add(g2);
		identityDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(theJavaPackage.getJavaNumber());
		g1.getETypeArguments().add(g2);
		numericDefEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataDef());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringDefEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(binaryDefEClass, BinaryDef.class, "BinaryDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryDef_Type(), this.getBinaryType(), "type", null, 1, 1, BinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryDef_Unsigned(), ecorePackage.getEBoolean(), "unsigned", null, 0, 1, BinaryDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterDefEClass, CharacterDef.class, "CharacterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterDef_Length(), ecorePackage.getEInt(), "length", null, 1, 1, CharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterDef_Varying(), ecorePackage.getEBoolean(), "varying", null, 0, 1, CharacterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDefEClass, DataDef.class, "DataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataDef_Formulas(), ecorePackage.getEString(), "formulas", null, 0, -1, DataDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(dataDefEClass, null, "getJavaClass", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(dataDefEClass, this.getDataDefType(), "getDataDefType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(datetimeDefEClass, DatetimeDef.class, "DatetimeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatetimeDef_Type(), this.getDatetimeType(), "type", null, 1, 1, DatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeDef_DateFormat(), this.getDateFormat(), "dateFormat", null, 0, 1, DatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatetimeDef_TimeFormat(), this.getTimeFormat(), "timeFormat", null, 0, 1, DatetimeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalDefEClass, DecimalDef.class, "DecimalDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalDef_Precision(), ecorePackage.getEInt(), "precision", null, 1, 1, DecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Scale(), ecorePackage.getEInt(), "scale", null, 0, 1, DecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalDef_Type(), this.getDecimalType(), "type", null, 0, 1, DecimalDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingDefEClass, FloatingDef.class, "FloatingDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingDef_Type(), this.getFloatingType(), "type", null, 1, 1, FloatingDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityDefEClass, IdentityDef.class, "IdentityDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericDefEClass, NumericDef.class, "NumericDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringDefEClass, StringDef.class, "StringDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(binaryTypeEEnum, BinaryType.class, "BinaryType");
		addEEnumLiteral(binaryTypeEEnum, BinaryType.BYTE);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.SHORT);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.INTEGER);
		addEEnumLiteral(binaryTypeEEnum, BinaryType.LONG);

		initEEnum(dataDefTypeEEnum, DataDefType.class, "DataDefType");
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.ADAPTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.ARRAY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.BINARY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.BUFFER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.CHARACTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DATA_STRUCT);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DATETIME);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.DECIMAL);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.FLOATING);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.HEXADECIMAL);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.IDENTITY);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.INDICATOR);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.LIST);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.POINTER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.SCROLLER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STRING);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STROLLER);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.STRUCT);
		addEEnumLiteral(dataDefTypeEEnum, DataDefType.WRAPPER);

		initEEnum(datetimeTypeEEnum, DatetimeType.class, "DatetimeType");
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.DATE);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME);
		addEEnumLiteral(datetimeTypeEEnum, DatetimeType.TIME_STAMP);

		initEEnum(dateFormatEEnum, DateFormat.class, "DateFormat");
		addEEnumLiteral(dateFormatEEnum, DateFormat.ISO);
		addEEnumLiteral(dateFormatEEnum, DateFormat.MDY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.DMY);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.YYMD);
		addEEnumLiteral(dateFormatEEnum, DateFormat.JUL);
		addEEnumLiteral(dateFormatEEnum, DateFormat.USA);
		addEEnumLiteral(dateFormatEEnum, DateFormat.EUR);

		initEEnum(decimalTypeEEnum, DecimalType.class, "DecimalType");
		addEEnumLiteral(decimalTypeEEnum, DecimalType.ZONED);
		addEEnumLiteral(decimalTypeEEnum, DecimalType.PACKED);

		initEEnum(floatingTypeEEnum, FloatingType.class, "FloatingType");
		addEEnumLiteral(floatingTypeEEnum, FloatingType.FLOAT);
		addEEnumLiteral(floatingTypeEEnum, FloatingType.DOUBLE);

		initEEnum(timeFormatEEnum, TimeFormat.class, "TimeFormat");
		addEEnumLiteral(timeFormatEEnum, TimeFormat.ISO);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.HMS);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.USA);
		addEEnumLiteral(timeFormatEEnum, TimeFormat.EUR);
	}

} //DataPackageImpl
