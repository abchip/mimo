/**
 * Copyright (c) 2017, 2021 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.edi;

import org.abchip.mimo.context.ContextPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.abchip.mimo.edi.EDIFactory
 * @model kind="package"
 * @generated
 */
public interface EDIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/edi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EDIPackage eINSTANCE = org.abchip.mimo.edi.impl.EDIPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.EdiManager <em>Edi Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.EdiManager
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEdiManager()
	 * @generated
	 */
	int EDI_MANAGER = 0;

	/**
	 * The number of structural features of the '<em>Edi Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDI_MANAGER_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.impl.TransmitterImpl <em>Transmitter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.impl.TransmitterImpl
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getTransmitter()
	 * @generated
	 */
	int TRANSMITTER = 1;

	/**
	 * The number of structural features of the '<em>Transmitter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.edi.TransmitterRegistry <em>Transmitter Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.TransmitterRegistry
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getTransmitterRegistry()
	 * @generated
	 */
	int TRANSMITTER_REGISTRY = 2;

	/**
	 * The number of structural features of the '<em>Transmitter Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMITTER_REGISTRY_FEATURE_COUNT = ContextPackage.REGISTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Data Interchange Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.edi.DataInterchangeException
	 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getDataInterchangeException()
	 * @generated
	 */
	int DATA_INTERCHANGE_EXCEPTION = 3;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.EdiManager <em>Edi Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edi Manager</em>'.
	 * @see org.abchip.mimo.edi.EdiManager
	 * @generated
	 */
	EClass getEdiManager();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.Transmitter <em>Transmitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmitter</em>'.
	 * @see org.abchip.mimo.edi.Transmitter
	 * @generated
	 */
	EClass getTransmitter();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.edi.TransmitterRegistry <em>Transmitter Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmitter Registry</em>'.
	 * @see org.abchip.mimo.edi.TransmitterRegistry
	 * @generated
	 */
	EClass getTransmitterRegistry();

	/**
	 * Returns the meta object for data type '{@link org.abchip.mimo.edi.DataInterchangeException <em>Data Interchange Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Interchange Exception</em>'.
	 * @see org.abchip.mimo.edi.DataInterchangeException
	 * @model instanceClass="org.abchip.mimo.edi.DataInterchangeException"
	 * @generated
	 */
	EDataType getDataInterchangeException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EDIFactory getEDIFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.edi.EdiManager <em>Edi Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.EdiManager
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getEdiManager()
		 * @generated
		 */
		EClass EDI_MANAGER = eINSTANCE.getEdiManager();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.impl.TransmitterImpl <em>Transmitter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.impl.TransmitterImpl
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getTransmitter()
		 * @generated
		 */
		EClass TRANSMITTER = eINSTANCE.getTransmitter();
		/**
		 * The meta object literal for the '{@link org.abchip.mimo.edi.TransmitterRegistry <em>Transmitter Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.TransmitterRegistry
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getTransmitterRegistry()
		 * @generated
		 */
		EClass TRANSMITTER_REGISTRY = eINSTANCE.getTransmitterRegistry();
		/**
		 * The meta object literal for the '<em>Data Interchange Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.edi.DataInterchangeException
		 * @see org.abchip.mimo.edi.impl.EDIPackageImpl#getDataInterchangeException()
		 * @generated
		 */
		EDataType DATA_INTERCHANGE_EXCEPTION = eINSTANCE.getDataInterchangeException();

	}

} //EDIPackage
