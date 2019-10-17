/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
	 * The meta object id for the '{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl <em>Transmitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.transmission.impl.TransmitterImpl
	 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmitter()
	 * @generated
	 */
	int TRANSMITTER = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER__CREATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER__NAME = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Transmitter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER__TRANSMITTER_TYPE = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Transmitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_FEATURE_COUNT = EntityPackage.ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.transmission.impl.TransmitterTypeImpl <em>Transmitter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.transmission.impl.TransmitterTypeImpl
	 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmitterType()
	 * @generated
	 */
	int TRANSMITTER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_TYPE__SLOTS = EntityPackage.ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_TYPE__CREATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_TYPE__CREATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_TYPE__LAST_UPDATED_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_TYPE__LAST_UPDATED_TX_STAMP = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_TYPE__NAME = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transmitter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_TYPE_FEATURE_COUNT = EntityPackage.ENTITY_TYPE_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.transmission.Transmitter <em>Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmitter</em>'.
	 * @see org.abchip.mimo.edi.transmission.Transmitter
	 * @generated
	 */
	EClass getTransmitter();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.transmission.Transmitter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.edi.transmission.Transmitter#getName()
	 * @see #getTransmitter()
	 * @generated
	 */
	EAttribute getTransmitter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.transmission.Transmitter#getTransmitterType <em>Transmitter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmitter Type</em>'.
	 * @see org.abchip.mimo.edi.transmission.Transmitter#getTransmitterType()
	 * @see #getTransmitter()
	 * @generated
	 */
	EAttribute getTransmitter_TransmitterType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.transmission.TransmitterType <em>Transmitter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmitter Type</em>'.
	 * @see org.abchip.mimo.edi.transmission.TransmitterType
	 * @generated
	 */
	EClass getTransmitterType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.edi.transmission.TransmitterType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.abchip.mimo.edi.transmission.TransmitterType#getName()
	 * @see #getTransmitterType()
	 * @generated
	 */
	EAttribute getTransmitterType_Name();

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
		 * The meta object literal for the '{@link org.abchip.mimo.edi.transmission.impl.TransmitterImpl <em>Transmitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.transmission.impl.TransmitterImpl
		 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmitter()
		 * @generated
		 */
		EClass TRANSMITTER = eINSTANCE.getTransmitter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMITTER__NAME = eINSTANCE.getTransmitter_Name();

		/**
		 * The meta object literal for the '<em><b>Transmitter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMITTER__TRANSMITTER_TYPE = eINSTANCE.getTransmitter_TransmitterType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.transmission.impl.TransmitterTypeImpl <em>Transmitter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.transmission.impl.TransmitterTypeImpl
		 * @see org.abchip.mimo.edi.transmission.impl.TransmissionPackageImpl#getTransmitterType()
		 * @generated
		 */
		EClass TRANSMITTER_TYPE = eINSTANCE.getTransmitterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSMITTER_TYPE__NAME = eINSTANCE.getTransmitterType_Name();

	}

} //TransmissionPackage
