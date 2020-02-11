/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.entity.synchronization.SynchronizationPackage
 * @generated
 */
public interface SynchronizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SynchronizationFactory eINSTANCE = org.abchip.mimo.biz.entity.synchronization.impl.SynchronizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity Sync</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Sync</em>'.
	 * @generated
	 */
	EntitySync createEntitySync();

	/**
	 * Returns a new object of class '<em>Entity Sync History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Sync History</em>'.
	 * @generated
	 */
	EntitySyncHistory createEntitySyncHistory();

	/**
	 * Returns a new object of class '<em>Entity Sync Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Sync Include</em>'.
	 * @generated
	 */
	EntitySyncInclude createEntitySyncInclude();

	/**
	 * Returns a new object of class '<em>Entity Sync Include Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Sync Include Group</em>'.
	 * @generated
	 */
	EntitySyncIncludeGroup createEntitySyncIncludeGroup();

	/**
	 * Returns a new object of class '<em>Entity Sync Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Sync Remove</em>'.
	 * @generated
	 */
	EntitySyncRemove createEntitySyncRemove();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SynchronizationPackage getSynchronizationPackage();

} //SynchronizationFactory
