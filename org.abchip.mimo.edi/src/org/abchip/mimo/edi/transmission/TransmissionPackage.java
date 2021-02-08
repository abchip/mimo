/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi.transmission;

import org.abchip.mimo.entity.EntityPackage;

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
 * @see org.abchip.mimo.edi.transmission.TransmissionFactory
 * @model kind="package"
 * @generated
 */
public interface TransmissionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transmission";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/edi/transmission";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mimo-edi-transmission";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransmissionPackage eINSTANCE = org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.transmission.impl.TransmissionImpl <em>Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.transmission.impl.TransmissionImpl
	 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmission()
	 * @generated
	 */
	int TRANSMISSION = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transmission Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__TRANSMISSION_ID = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transmission Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__TRANSMISSION_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.transmission.impl.TransmissionTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.transmission.impl.TransmissionTypeImpl
	 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmissionType()
	 * @generated
	 */
	int TRANSMISSION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE__NAME = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE__TEXT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.transmission.Transmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission</em>'.
	 * @see org.abchip.mimo.edi.transmission.Transmission
	 * @generated
	 */
	EClass getTransmission();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.transmission.Transmission#getTransmissionId <em>Transmission Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Id</em>'.
	 * @see org.abchip.mimo.edi.transmission.Transmission#getTransmissionId()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_TransmissionId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.transmission.Transmission#getTransmissionType <em>Transmission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmission Type</em>'.
	 * @see org.abchip.mimo.edi.transmission.Transmission#getTransmissionType()
	 * @see #getTransmission()
	 * @generated
	 */
	EAttribute getTransmission_TransmissionType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.transmission.TransmissionType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.abchip.mimo.edi.transmission.TransmissionType
	 * @generated
	 */
	EClass getTransmissionType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.transmission.TransmissionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.edi.transmission.TransmissionType#getName()
	 * @see #getTransmissionType()
	 * @generated
	 */
	EAttribute getTransmissionType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.transmission.TransmissionType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.abchip.mimo.edi.transmission.TransmissionType#getText()
	 * @see #getTransmissionType()
	 * @generated
	 */
	EAttribute getTransmissionType_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransmissionFactory getTransmissionFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.edi.transmission.impl.TransmissionImpl <em>Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.transmission.impl.TransmissionImpl
		 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmission()
		 * @generated
		 */
		EClass TRANSMISSION = eINSTANCE.getTransmission();

		/**
		 * The meta object literal for the '<em><b>Transmission Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__TRANSMISSION_ID = eINSTANCE.getTransmission_TransmissionId();

		/**
		 * The meta object literal for the '<em><b>Transmission Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION__TRANSMISSION_TYPE = eINSTANCE.getTransmission_TransmissionType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.transmission.impl.TransmissionTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.transmission.impl.TransmissionTypeImpl
		 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmissionType()
		 * @generated
		 */
		EClass TRANSMISSION_TYPE = eINSTANCE.getTransmissionType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_TYPE__NAME = eINSTANCE.getTransmissionType_Name();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMISSION_TYPE__TEXT = eINSTANCE.getTransmissionType_Text();

	}

} //TransmissionPackage
