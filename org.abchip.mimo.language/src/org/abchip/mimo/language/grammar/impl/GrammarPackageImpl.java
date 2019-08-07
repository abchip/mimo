/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.grammar.impl;

import org.abchip.mimo.MimoPackage;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.language.LanguagePackage;

import org.abchip.mimo.language.grammar.Adjective;
import org.abchip.mimo.language.grammar.Dialog;
import org.abchip.mimo.language.grammar.Gender;
import org.abchip.mimo.language.grammar.Grammar;
import org.abchip.mimo.language.grammar.GrammarFactory;
import org.abchip.mimo.language.grammar.GrammarPackage;
import org.abchip.mimo.language.grammar.Noun;
import org.abchip.mimo.language.grammar.Predicate;
import org.abchip.mimo.language.grammar.Pronoun;
import org.abchip.mimo.language.grammar.Sentence;
import org.abchip.mimo.language.grammar.Verb;
import org.abchip.mimo.language.grammar.Word;

import org.abchip.mimo.language.impl.LanguagePackageImpl;

import org.abchip.mimo.mining.MiningPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammarPackageImpl extends EPackageImpl implements GrammarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pronounEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

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
	 * @see org.abchip.mimo.language.grammar.GrammarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrammarPackageImpl() {
		super(eNS_URI, GrammarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GrammarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrammarPackage init() {
		if (isInited) return (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGrammarPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GrammarPackageImpl theGrammarPackage = registeredGrammarPackage instanceof GrammarPackageImpl ? (GrammarPackageImpl)registeredGrammarPackage : new GrammarPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		MimoPackage.eINSTANCE.eClass();
		MiningPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(registeredPackage instanceof LanguagePackageImpl ? registeredPackage : LanguagePackage.eINSTANCE);

		// Create package meta-data objects
		theGrammarPackage.createPackageContents();
		theLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theGrammarPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrammarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrammarPackage.eNS_URI, theGrammarPackage);
		return theGrammarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdjective() {
		return adjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDialog() {
		return dialogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrammar() {
		return grammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Name() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrammar_Text() {
		return (EAttribute)grammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoun() {
		return nounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicate() {
		return predicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPronoun() {
		return pronounEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSentence() {
		return sentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerb() {
		return verbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWord() {
		return wordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWord_Name() {
		return (EAttribute)wordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNumber() {
		return numberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrammarFactory getGrammarFactory() {
		return (GrammarFactory)getEFactoryInstance();
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
		adjectiveEClass = createEClass(ADJECTIVE);

		dialogEClass = createEClass(DIALOG);

		grammarEClass = createEClass(GRAMMAR);
		createEAttribute(grammarEClass, GRAMMAR__NAME);
		createEAttribute(grammarEClass, GRAMMAR__TEXT);

		nounEClass = createEClass(NOUN);

		predicateEClass = createEClass(PREDICATE);

		pronounEClass = createEClass(PRONOUN);

		sentenceEClass = createEClass(SENTENCE);

		verbEClass = createEClass(VERB);

		wordEClass = createEClass(WORD);
		createEAttribute(wordEClass, WORD__NAME);

		// Create enums
		genderEEnum = createEEnum(GENDER);
		numberEEnum = createEEnum(NUMBER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		adjectiveEClass.getESuperTypes().add(this.getWord());
		dialogEClass.getESuperTypes().add(theEntityPackage.getEntity());
		grammarEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());
		grammarEClass.getESuperTypes().add(theEntityPackage.getTextable());
		nounEClass.getESuperTypes().add(this.getWord());
		predicateEClass.getESuperTypes().add(theEntityPackage.getEntity());
		pronounEClass.getESuperTypes().add(this.getWord());
		sentenceEClass.getESuperTypes().add(theEntityPackage.getEntity());
		verbEClass.getESuperTypes().add(this.getWord());
		wordEClass.getESuperTypes().add(theEntityPackage.getEntityNameable());

		// Initialize classes and features; add operations and parameters
		initEClass(adjectiveEClass, Adjective.class, "Adjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialogEClass, Dialog.class, "Dialog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grammarEClass, Grammar.class, "Grammar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrammar_Name(), ecorePackage.getEString(), "name", null, 1, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Text(), ecorePackage.getEString(), "text", null, 1, 1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nounEClass, Noun.class, "Noun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicateEClass, Predicate.class, "Predicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pronounEClass, Pronoun.class, "Pronoun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sentenceEClass, Sentence.class, "Sentence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verbEClass, Verb.class, "Verb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wordEClass, Word.class, "Word", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWord_Name(), ecorePackage.getEString(), "name", null, 1, 1, Word.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.M);
		addEEnumLiteral(genderEEnum, Gender.F);

		initEEnum(numberEEnum, org.abchip.mimo.language.grammar.Number.class, "Number");
		addEEnumLiteral(numberEEnum, org.abchip.mimo.language.grammar.Number.S);
		addEEnumLiteral(numberEEnum, org.abchip.mimo.language.grammar.Number.P);
	}

} //GrammarPackageImpl
