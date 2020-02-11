/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.service.semaphore;

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
 * @see org.abchip.mimo.biz.service.semaphore.SemaphoreFactory
 * @model kind="package"
 * @generated
 */
public interface SemaphorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semaphore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/service/semaphore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-semaphore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemaphorePackage eINSTANCE = org.abchip.mimo.biz.service.semaphore.impl.SemaphorePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl <em>Service Semaphore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl
	 * @see org.abchip.mimo.biz.service.semaphore.impl.SemaphorePackageImpl#getServiceSemaphore()
	 * @generated
	 */
	int SERVICE_SEMAPHORE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__SERVICE_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lock Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__LOCK_THREAD = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lock Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__LOCK_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Locked By Instance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Semaphore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SEMAPHORE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore <em>Service Semaphore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Semaphore</em>'.
	 * @see org.abchip.mimo.biz.service.semaphore.ServiceSemaphore
	 * @generated
	 */
	EClass getServiceSemaphore();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getServiceName()
	 * @see #getServiceSemaphore()
	 * @generated
	 */
	EAttribute getServiceSemaphore_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockThread <em>Lock Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Thread</em>'.
	 * @see org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockThread()
	 * @see #getServiceSemaphore()
	 * @generated
	 */
	EAttribute getServiceSemaphore_LockThread();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockTime <em>Lock Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Time</em>'.
	 * @see org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockTime()
	 * @see #getServiceSemaphore()
	 * @generated
	 */
	EAttribute getServiceSemaphore_LockTime();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockedByInstanceId <em>Locked By Instance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked By Instance Id</em>'.
	 * @see org.abchip.mimo.biz.service.semaphore.ServiceSemaphore#getLockedByInstanceId()
	 * @see #getServiceSemaphore()
	 * @generated
	 */
	EAttribute getServiceSemaphore_LockedByInstanceId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemaphoreFactory getSemaphoreFactory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl <em>Service Semaphore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.service.semaphore.impl.ServiceSemaphoreImpl
		 * @see org.abchip.mimo.biz.service.semaphore.impl.SemaphorePackageImpl#getServiceSemaphore()
		 * @generated
		 */
		EClass SERVICE_SEMAPHORE = eINSTANCE.getServiceSemaphore();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SEMAPHORE__SERVICE_NAME = eINSTANCE.getServiceSemaphore_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Lock Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SEMAPHORE__LOCK_THREAD = eINSTANCE.getServiceSemaphore_LockThread();

		/**
		 * The meta object literal for the '<em><b>Lock Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SEMAPHORE__LOCK_TIME = eINSTANCE.getServiceSemaphore_LockTime();

		/**
		 * The meta object literal for the '<em><b>Locked By Instance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SEMAPHORE__LOCKED_BY_INSTANCE_ID = eINSTANCE.getServiceSemaphore_LockedByInstanceId();

	}

} //SemaphorePackage
