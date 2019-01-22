/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.mining.classification;

import org.abchip.mimo.context.ContextPackage;
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
 * @see org.abchip.mimo.mining.classification.ClassificationFactory
 * @model kind="package"
 * @generated
 */
public interface ClassificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/mining/classification";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-mine-class";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassificationPackage eINSTANCE = org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.mining.classification.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.mining.classification.impl.ClassificationImpl
	 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__SCORE = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.mining.classification.Classifier <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.mining.classification.Classifier
	 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 1;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.mining.classification.ClassifierRegistry <em>Classifier Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.mining.classification.ClassifierRegistry
	 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getClassifierRegistry()
	 * @generated
	 */
	int CLASSIFIER_REGISTRY = 2;

	/**
	 * The number of structural features of the '<em>Classifier Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.mining.classification.Evaluator <em>Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.mining.classification.Evaluator
	 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getEvaluator()
	 * @generated
	 */
	int EVALUATOR = 3;

	/**
	 * The number of structural features of the '<em>Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATOR_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.mining.classification.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see org.abchip.mimo.mining.classification.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.mining.classification.Classification#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see org.abchip.mimo.mining.classification.Classification#getScore()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Score();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.mining.classification.Classification#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.abchip.mimo.mining.classification.Classification#getEntity()
	 * @see #getClassification()
	 * @generated
	 */
	EReference getClassification_Entity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.mining.classification.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see org.abchip.mimo.mining.classification.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.mining.classification.ClassifierRegistry <em>Classifier Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier Registry</em>'.
	 * @see org.abchip.mimo.mining.classification.ClassifierRegistry
	 * @generated
	 */
	EClass getClassifierRegistry();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.mining.classification.Evaluator <em>Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluator</em>'.
	 * @see org.abchip.mimo.mining.classification.Evaluator
	 * @generated
	 */
	EClass getEvaluator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassificationFactory getClassificationFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.mining.classification.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.mining.classification.impl.ClassificationImpl
		 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__SCORE = eINSTANCE.getClassification_Score();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION__ENTITY = eINSTANCE.getClassification_Entity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.mining.classification.Classifier <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.mining.classification.Classifier
		 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.mining.classification.ClassifierRegistry <em>Classifier Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.mining.classification.ClassifierRegistry
		 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getClassifierRegistry()
		 * @generated
		 */
		EClass CLASSIFIER_REGISTRY = eINSTANCE.getClassifierRegistry();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.mining.classification.Evaluator <em>Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.mining.classification.Evaluator
		 * @see org.abchip.mimo.mining.classification.impl.ClassificationPackageImpl#getEvaluator()
		 * @generated
		 */
		EClass EVALUATOR = eINSTANCE.getEvaluator();

	}

} //ClassificationPackage
