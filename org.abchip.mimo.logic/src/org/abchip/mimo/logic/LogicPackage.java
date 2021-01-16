/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.logic;

import org.abchip.mimo.entity.EntityPackage;

import org.abchip.mimo.java.JavaPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.abchip.mimo.logic.LogicFactory
 * @model kind="package"
 * @generated
 */
public interface LogicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/logic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-logic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicPackage eINSTANCE = org.abchip.mimo.logic.impl.LogicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.logic.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.logic.impl.GoalImpl
	 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 0;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TERMS = 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.logic.MindManager <em>Mind Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.logic.MindManager
	 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getMindManager()
	 * @generated
	 */
	int MIND_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Mind Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIND_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.logic.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.logic.impl.QuestionImpl
	 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RELATION = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RULE = 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.logic.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.logic.impl.TermImpl
	 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = EntityPackage.ENTITY_IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.logic.impl.TheoryImpl <em>Theory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.logic.impl.TheoryImpl
	 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getTheory()
	 * @generated
	 */
	int THEORY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Facts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY__FACTS = 1;

	/**
	 * The number of structural features of the '<em>Theory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.logic.Reasoner <em>Reasoner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.logic.Reasoner
	 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getReasoner()
	 * @generated
	 */
	int REASONER = 5;

	/**
	 * The number of structural features of the '<em>Reasoner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONER_FEATURE_COUNT = JavaPackage.JAVA_CLOSEABLE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.logic.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see org.abchip.mimo.logic.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.logic.Goal#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see org.abchip.mimo.logic.Goal#getTerms()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Terms();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.logic.MindManager <em>Mind Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mind Manager</em>'.
	 * @see org.abchip.mimo.logic.MindManager
	 * @generated
	 */
	EClass getMindManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.logic.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see org.abchip.mimo.logic.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.logic.Question#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.abchip.mimo.logic.Question#getObject()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Object();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.logic.Question#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.abchip.mimo.logic.Question#getSubject()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.logic.Question#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see org.abchip.mimo.logic.Question#getRelation()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link org.abchip.mimo.logic.Question#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.abchip.mimo.logic.Question#getRule()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Rule();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.logic.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see org.abchip.mimo.logic.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.logic.Term#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.logic.Term#getName()
	 * @see #getTerm()
	 * @generated
	 */
	EAttribute getTerm_Name();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.logic.Theory <em>Theory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theory</em>'.
	 * @see org.abchip.mimo.logic.Theory
	 * @generated
	 */
	EClass getTheory();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.logic.Theory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.logic.Theory#getName()
	 * @see #getTheory()
	 * @generated
	 */
	EAttribute getTheory_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.abchip.mimo.logic.Theory#getFacts <em>Facts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facts</em>'.
	 * @see org.abchip.mimo.logic.Theory#getFacts()
	 * @see #getTheory()
	 * @generated
	 */
	EReference getTheory_Facts();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.logic.Reasoner <em>Reasoner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoner</em>'.
	 * @see org.abchip.mimo.logic.Reasoner
	 * @generated
	 */
	EClass getReasoner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicFactory getLogicFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.logic.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.logic.impl.GoalImpl
		 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__TERMS = eINSTANCE.getGoal_Terms();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.logic.MindManager <em>Mind Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.logic.MindManager
		 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getMindManager()
		 * @generated
		 */
		EClass MIND_MANAGER = eINSTANCE.getMindManager();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.logic.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.logic.impl.QuestionImpl
		 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OBJECT = eINSTANCE.getQuestion_Object();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__SUBJECT = eINSTANCE.getQuestion_Subject();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__RELATION = eINSTANCE.getQuestion_Relation();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__RULE = eINSTANCE.getQuestion_Rule();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.logic.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.logic.impl.TermImpl
		 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM__NAME = eINSTANCE.getTerm_Name();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.logic.impl.TheoryImpl <em>Theory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.logic.impl.TheoryImpl
		 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getTheory()
		 * @generated
		 */
		EClass THEORY = eINSTANCE.getTheory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEORY__NAME = eINSTANCE.getTheory_Name();

		/**
		 * The meta object literal for the '<em><b>Facts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEORY__FACTS = eINSTANCE.getTheory_Facts();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.logic.Reasoner <em>Reasoner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.logic.Reasoner
		 * @see org.abchip.mimo.logic.impl.LogicPackageImpl#getReasoner()
		 * @generated
		 */
		EClass REASONER = eINSTANCE.getReasoner();

	}

} //LogicPackage
