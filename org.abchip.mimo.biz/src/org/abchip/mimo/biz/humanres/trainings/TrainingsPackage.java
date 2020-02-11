/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.trainings;

import org.abchip.mimo.biz.BizPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.abchip.mimo.biz.humanres.trainings.TrainingsFactory
 * @model kind="package"
 * @generated
 */
public interface TrainingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trainings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/humanres/trainings";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-trainings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainingsPackage eINSTANCE = org.abchip.mimo.biz.humanres.trainings.impl.TrainingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.humanres.trainings.impl.TrainingRequestImpl <em>Training Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.humanres.trainings.impl.TrainingRequestImpl
	 * @see org.abchip.mimo.biz.humanres.trainings.impl.TrainingsPackageImpl#getTrainingRequest()
	 * @generated
	 */
	int TRAINING_REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_REQUEST__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_REQUEST__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_REQUEST__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_REQUEST__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Training Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_REQUEST__TRAINING_REQUEST_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Training Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINING_REQUEST_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.humanres.trainings.TrainingRequest <em>Training Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Training Request</em>'.
	 * @see org.abchip.mimo.biz.humanres.trainings.TrainingRequest
	 * @generated
	 */
	EClass getTrainingRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.humanres.trainings.TrainingRequest#getTrainingRequestId <em>Training Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Training Request Id</em>'.
	 * @see org.abchip.mimo.biz.humanres.trainings.TrainingRequest#getTrainingRequestId()
	 * @see #getTrainingRequest()
	 * @generated
	 */
	EAttribute getTrainingRequest_TrainingRequestId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrainingsFactory getTrainingsFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.humanres.trainings.impl.TrainingRequestImpl <em>Training Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.humanres.trainings.impl.TrainingRequestImpl
		 * @see org.abchip.mimo.biz.humanres.trainings.impl.TrainingsPackageImpl#getTrainingRequest()
		 * @generated
		 */
		EClass TRAINING_REQUEST = eINSTANCE.getTrainingRequest();

		/**
		 * The meta object literal for the '<em><b>Training Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINING_REQUEST__TRAINING_REQUEST_ID = eINSTANCE.getTrainingRequest_TrainingRequestId();

	}

} //TrainingsPackage
