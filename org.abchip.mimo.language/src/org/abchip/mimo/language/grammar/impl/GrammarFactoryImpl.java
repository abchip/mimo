/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.language.grammar.impl;

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
public class GrammarFactoryImpl extends EFactoryImpl implements GrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarFactory init() {
		try {
			GrammarFactory theGrammarFactory = (GrammarFactory)EPackage.Registry.INSTANCE.getEFactory(GrammarPackage.eNS_URI);
			if (theGrammarFactory != null) {
				return theGrammarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactoryImpl() {
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
			case GrammarPackage.ADJECTIVE: return (EObject)createAdjective();
			case GrammarPackage.DIALOG: return (EObject)createDialog();
			case GrammarPackage.GRAMMAR: return (EObject)createGrammar();
			case GrammarPackage.NOUN: return (EObject)createNoun();
			case GrammarPackage.PREDICATE: return (EObject)createPredicate();
			case GrammarPackage.PRONOUN: return (EObject)createPronoun();
			case GrammarPackage.SENTENCE: return (EObject)createSentence();
			case GrammarPackage.VERB: return (EObject)createVerb();
			case GrammarPackage.WORD: return (EObject)createWord();
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
			case GrammarPackage.GENDER:
				return createGenderFromString(eDataType, initialValue);
			case GrammarPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
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
			case GrammarPackage.GENDER:
				return convertGenderToString(eDataType, instanceValue);
			case GrammarPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
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
	public Adjective createAdjective() {
		AdjectiveImpl adjective = new AdjectiveImpl();
		return adjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dialog createDialog() {
		DialogImpl dialog = new DialogImpl();
		return dialog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Noun createNoun() {
		NounImpl noun = new NounImpl();
		return noun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate createPredicate() {
		PredicateImpl predicate = new PredicateImpl();
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pronoun createPronoun() {
		PronounImpl pronoun = new PronounImpl();
		return pronoun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sentence createSentence() {
		SentenceImpl sentence = new SentenceImpl();
		return sentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verb createVerb() {
		VerbImpl verb = new VerbImpl();
		return verb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Word createWord() {
		WordImpl word = new WordImpl();
		return word;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.abchip.mimo.language.grammar.Number createNumberFromString(EDataType eDataType, String initialValue) {
		org.abchip.mimo.language.grammar.Number result = org.abchip.mimo.language.grammar.Number.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGenderFromString(EDataType eDataType, String initialValue) {
		Gender result = Gender.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GrammarPackage getGrammarPackage() {
		return (GrammarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarPackage getPackage() {
		return GrammarPackage.eINSTANCE;
	}

} //GrammarFactoryImpl
