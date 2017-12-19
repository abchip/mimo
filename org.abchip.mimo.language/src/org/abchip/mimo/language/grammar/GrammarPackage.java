/**
 * Copyright (c) 2017, 2018 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.grammar;

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
 * @see org.abchip.mimo.language.grammar.GrammarFactory
 * @model kind="package"
 * @generated
 */
public interface GrammarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/language/grammar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-gram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarPackage eINSTANCE = org.abchip.mimo.language.grammar.impl.GrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.WordImpl <em>Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.WordImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getWord()
	 * @generated
	 */
	int WORD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.AdjectiveImpl <em>Adjective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.AdjectiveImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getAdjective()
	 * @generated
	 */
	int ADJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE__NAME = WORD__NAME;

	/**
	 * The number of structural features of the '<em>Adjective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADJECTIVE_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.DialogImpl <em>Dialog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.DialogImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getDialog()
	 * @generated
	 */
	int DIALOG = 1;

	/**
	 * The number of structural features of the '<em>Dialog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOG_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.GrammarImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NAME = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__TEXT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = EntityPackage.ENTITY_NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.NounImpl <em>Noun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.NounImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getNoun()
	 * @generated
	 */
	int NOUN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN__NAME = WORD__NAME;

	/**
	 * The number of structural features of the '<em>Noun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOUN_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.PhraseImpl <em>Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.PhraseImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getPhrase()
	 * @generated
	 */
	int PHRASE = 4;

	/**
	 * The number of structural features of the '<em>Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.PredicateImpl <em>Predicate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.PredicateImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getPredicate()
	 * @generated
	 */
	int PREDICATE = 5;

	/**
	 * The number of structural features of the '<em>Predicate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICATE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.PronounImpl <em>Pronoun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.PronounImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getPronoun()
	 * @generated
	 */
	int PRONOUN = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN__NAME = WORD__NAME;

	/**
	 * The number of structural features of the '<em>Pronoun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRONOUN_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.SentenceImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 7;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.impl.VerbImpl <em>Verb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.impl.VerbImpl
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getVerb()
	 * @generated
	 */
	int VERB = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB__NAME = WORD__NAME;

	/**
	 * The number of structural features of the '<em>Verb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERB_FEATURE_COUNT = WORD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.Number <em>Number</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.Number
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.language.grammar.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.language.grammar.Gender
	 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 10;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Adjective <em>Adjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adjective</em>'.
	 * @see org.abchip.mimo.language.grammar.Adjective
	 * @generated
	 */
	EClass getAdjective();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Dialog <em>Dialog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialog</em>'.
	 * @see org.abchip.mimo.language.grammar.Dialog
	 * @generated
	 */
	EClass getDialog();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see org.abchip.mimo.language.grammar.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.grammar.Grammar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.language.grammar.Grammar#getName()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.grammar.Grammar#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.language.grammar.Grammar#getText()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Text();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Noun <em>Noun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Noun</em>'.
	 * @see org.abchip.mimo.language.grammar.Noun
	 * @generated
	 */
	EClass getNoun();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Phrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phrase</em>'.
	 * @see org.abchip.mimo.language.grammar.Phrase
	 * @generated
	 */
	EClass getPhrase();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicate</em>'.
	 * @see org.abchip.mimo.language.grammar.Predicate
	 * @generated
	 */
	EClass getPredicate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Pronoun <em>Pronoun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pronoun</em>'.
	 * @see org.abchip.mimo.language.grammar.Pronoun
	 * @generated
	 */
	EClass getPronoun();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see org.abchip.mimo.language.grammar.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Verb <em>Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verb</em>'.
	 * @see org.abchip.mimo.language.grammar.Verb
	 * @generated
	 */
	EClass getVerb();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.language.grammar.Word <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word</em>'.
	 * @see org.abchip.mimo.language.grammar.Word
	 * @generated
	 */
	EClass getWord();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.language.grammar.Word#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.language.grammar.Word#getName()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_Name();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.language.grammar.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number</em>'.
	 * @see org.abchip.mimo.language.grammar.Number
	 * @generated
	 */
	EEnum getNumber();

	/**
	 * Returns the meta object for enum '{@link org.abchip.mimo.language.grammar.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see org.abchip.mimo.language.grammar.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarFactory getGrammarFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.AdjectiveImpl <em>Adjective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.AdjectiveImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getAdjective()
		 * @generated
		 */
		EClass ADJECTIVE = eINSTANCE.getAdjective();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.DialogImpl <em>Dialog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.DialogImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getDialog()
		 * @generated
		 */
		EClass DIALOG = eINSTANCE.getDialog();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.GrammarImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__NAME = eINSTANCE.getGrammar_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__TEXT = eINSTANCE.getGrammar_Text();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.NounImpl <em>Noun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.NounImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getNoun()
		 * @generated
		 */
		EClass NOUN = eINSTANCE.getNoun();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.PhraseImpl <em>Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.PhraseImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getPhrase()
		 * @generated
		 */
		EClass PHRASE = eINSTANCE.getPhrase();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.PredicateImpl <em>Predicate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.PredicateImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getPredicate()
		 * @generated
		 */
		EClass PREDICATE = eINSTANCE.getPredicate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.PronounImpl <em>Pronoun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.PronounImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getPronoun()
		 * @generated
		 */
		EClass PRONOUN = eINSTANCE.getPronoun();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.SentenceImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.VerbImpl <em>Verb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.VerbImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getVerb()
		 * @generated
		 */
		EClass VERB = eINSTANCE.getVerb();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.impl.WordImpl <em>Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.impl.WordImpl
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getWord()
		 * @generated
		 */
		EClass WORD = eINSTANCE.getWord();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__NAME = eINSTANCE.getWord_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.Number <em>Number</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.Number
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getNumber()
		 * @generated
		 */
		EEnum NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.language.grammar.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.language.grammar.Gender
		 * @see org.abchip.mimo.language.grammar.impl.GrammarPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //GrammarPackage
