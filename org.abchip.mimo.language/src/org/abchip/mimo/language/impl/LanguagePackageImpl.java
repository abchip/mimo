/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.context.ContextPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.java.JavaPackage;
import org.abchip.mimo.language.Language;
import org.abchip.mimo.language.LanguageException;
import org.abchip.mimo.language.LanguageExpression;
import org.abchip.mimo.language.LanguageFactory;
import org.abchip.mimo.language.LanguageLinearizer;
import org.abchip.mimo.language.LanguageLinearizerRegistry;
import org.abchip.mimo.language.LanguageManager;
import org.abchip.mimo.language.LanguagePackage;
import org.abchip.mimo.language.LanguageParser;
import org.abchip.mimo.language.LanguageParserRegistry;
import org.abchip.mimo.language.LanguagePlanet;
import org.abchip.mimo.language.LanguageScope;
import org.abchip.mimo.language.LanguageTranslate;
import org.abchip.mimo.language.LanguageType;

import org.abchip.mimo.language.grammar.GrammarPackage;

import org.abchip.mimo.language.grammar.impl.GrammarPackageImpl;

import org.abchip.mimo.mining.MiningPackage;

import org.abchip.mimo.mining.classification.ClassificationPackage;

import org.abchip.mimo.service.ServicePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LanguagePackageImpl extends EPackageImpl implements LanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageParserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageParserRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageLinearizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageLinearizerRegistryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languagePlanetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageTranslateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageExceptionEDataType = null;

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
	 * @see org.abchip.mimo.language.LanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LanguagePackageImpl() {
		super(eNS_URI, LanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LanguagePackage init() {
		if (isInited) return (LanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LanguagePackageImpl theLanguagePackage = registeredLanguagePackage instanceof LanguagePackageImpl ? (LanguagePackageImpl)registeredLanguagePackage : new LanguagePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();
		MiningPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(registeredPackage instanceof GrammarPackageImpl ? registeredPackage : GrammarPackage.eINSTANCE);

		// Create package meta-data objects
		theLanguagePackage.createPackageContents();
		theGrammarPackage.createPackageContents();

		// Initialize created meta-data
		theLanguagePackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LanguagePackage.eNS_URI, theLanguagePackage);
		return theLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguage_Iso_639_1() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguage_Name() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguage_Scope() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguage_Text() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguage_Type() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLanguage_Planets() {
		return (EReference)languageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLanguage_PlanetsCont() {
		return (EReference)languageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageExpression() {
		return languageExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageExpression_ExpressionRow() {
		return (EAttribute)languageExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageManager() {
		return languageManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageParser() {
		return languageParserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageParserRegistry() {
		return languageParserRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageLinearizer() {
		return languageLinearizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageLinearizerRegistry() {
		return languageLinearizerRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguagePlanet() {
		return languagePlanetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguagePlanet_Name() {
		return (EAttribute)languagePlanetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageTranslate() {
		return languageTranslateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageTranslate_Text() {
		return (EAttribute)languageTranslateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageTranslate_From() {
		return (EAttribute)languageTranslateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageTranslate_To() {
		return (EAttribute)languageTranslateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguageScope() {
		return languageScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLanguageException() {
		return languageExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageFactory getLanguageFactory() {
		return (LanguageFactory)getEFactoryInstance();
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
		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__ISO_639_1);
		createEAttribute(languageEClass, LANGUAGE__NAME);
		createEAttribute(languageEClass, LANGUAGE__SCOPE);
		createEAttribute(languageEClass, LANGUAGE__TEXT);
		createEAttribute(languageEClass, LANGUAGE__TYPE);
		createEReference(languageEClass, LANGUAGE__PLANETS);
		createEReference(languageEClass, LANGUAGE__PLANETS_CONT);

		languageExpressionEClass = createEClass(LANGUAGE_EXPRESSION);
		createEAttribute(languageExpressionEClass, LANGUAGE_EXPRESSION__EXPRESSION_ROW);

		languageLinearizerEClass = createEClass(LANGUAGE_LINEARIZER);

		languageLinearizerRegistryEClass = createEClass(LANGUAGE_LINEARIZER_REGISTRY);

		languageManagerEClass = createEClass(LANGUAGE_MANAGER);

		languageParserEClass = createEClass(LANGUAGE_PARSER);

		languageParserRegistryEClass = createEClass(LANGUAGE_PARSER_REGISTRY);

		languagePlanetEClass = createEClass(LANGUAGE_PLANET);
		createEAttribute(languagePlanetEClass, LANGUAGE_PLANET__NAME);

		languageTranslateEClass = createEClass(LANGUAGE_TRANSLATE);
		createEAttribute(languageTranslateEClass, LANGUAGE_TRANSLATE__TEXT);
		createEAttribute(languageTranslateEClass, LANGUAGE_TRANSLATE__FROM);
		createEAttribute(languageTranslateEClass, LANGUAGE_TRANSLATE__TO);

		// Create enums
		languageScopeEEnum = createEEnum(LANGUAGE_SCOPE);
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);

		// Create data types
		languageExceptionEDataType = createEDataType(LANGUAGE_EXCEPTION);
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
		GrammarPackage theGrammarPackage = (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		JavaPackage theJavaPackage = (JavaPackage)EPackage.Registry.INSTANCE.getEPackage(JavaPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGrammarPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		languageEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		EGenericType g1 = createEGenericType(theContextPackage.getRegistry());
		EGenericType g2 = createEGenericType(this.getLanguageLinearizer());
		g1.getETypeArguments().add(g2);
		languageLinearizerRegistryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContextPackage.getRegistry());
		g2 = createEGenericType(this.getLanguageParser());
		g1.getETypeArguments().add(g2);
		languageParserRegistryEClass.getEGenericSuperTypes().add(g1);
		languagePlanetEClass.getESuperTypes().add(theEntityPackage.getEntityIdentifiable());
		g1 = createEGenericType(theServicePackage.getServiceRequest());
		g2 = createEGenericType(theServicePackage.getServiceResponse());
		g1.getETypeArguments().add(g2);
		languageTranslateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theJavaPackage.getJavaCallable());
		g2 = createEGenericType(theServicePackage.getServiceResponse());
		g1.getETypeArguments().add(g2);
		languageTranslateEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_Iso_639_1(), ecorePackage.getEString(), "iso_639_1", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Scope(), this.getLanguageScope(), "scope", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Text(), ecorePackage.getEString(), "text", null, 1, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_Type(), this.getLanguageType(), "type", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_Planets(), this.getLanguagePlanet(), null, "planets", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLanguage_PlanetsCont(), this.getLanguagePlanet(), null, "planetsCont", null, 0, -1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageExpressionEClass, LanguageExpression.class, "LanguageExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageExpression_ExpressionRow(), ecorePackage.getEJavaObject(), "expressionRow", null, 1, 1, LanguageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageLinearizerEClass, LanguageLinearizer.class, "LanguageLinearizer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(languageLinearizerEClass, ecorePackage.getEString(), "linearize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLanguageExpression(), "expression", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(languageLinearizerRegistryEClass, LanguageLinearizerRegistry.class, "LanguageLinearizerRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(languageManagerEClass, LanguageManager.class, "LanguageManager", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(languageManagerEClass, null, "classifyLanguage", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getLanguageException());
		g1 = createEGenericType(theClassificationPackage.getClassification());
		g2 = createEGenericType(this.getLanguage());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(languageManagerEClass, ecorePackage.getEString(), "translate", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "languageSource", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "languageTarget", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getLanguageException());

		initEClass(languageParserEClass, LanguageParser.class, "LanguageParser", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(languageParserEClass, this.getLanguageExpression(), "parse", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theContextPackage.getContext(), "context", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(languageParserRegistryEClass, LanguageParserRegistry.class, "LanguageParserRegistry", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(languagePlanetEClass, LanguagePlanet.class, "LanguagePlanet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguagePlanet_Name(), ecorePackage.getEString(), "name", null, 1, 1, LanguagePlanet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageTranslateEClass, LanguageTranslate.class, "LanguageTranslate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageTranslate_Text(), ecorePackage.getEString(), "text", null, 1, 1, LanguageTranslate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageTranslate_From(), ecorePackage.getEString(), "from", "eng", 0, 1, LanguageTranslate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageTranslate_To(), ecorePackage.getEString(), "to", "ita", 0, 1, LanguageTranslate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(languageScopeEEnum, LanguageScope.class, "LanguageScope");
		addEEnumLiteral(languageScopeEEnum, LanguageScope.INDIVIDUAL);
		addEEnumLiteral(languageScopeEEnum, LanguageScope.MACROLANGUAGE);
		addEEnumLiteral(languageScopeEEnum, LanguageScope.COLLECTIONS);
		addEEnumLiteral(languageScopeEEnum, LanguageScope.RESERVED);
		addEEnumLiteral(languageScopeEEnum, LanguageScope.SPECIALS);
		addEEnumLiteral(languageScopeEEnum, LanguageScope.DIALECTS);

		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.LIVING);
		addEEnumLiteral(languageTypeEEnum, LanguageType.EXTINCT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ANCIENT);
		addEEnumLiteral(languageTypeEEnum, LanguageType.HISTORICAL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.CONSTRUCTED);

		// Initialize data types
		initEDataType(languageExceptionEDataType, LanguageException.class, "LanguageException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LanguagePackageImpl
