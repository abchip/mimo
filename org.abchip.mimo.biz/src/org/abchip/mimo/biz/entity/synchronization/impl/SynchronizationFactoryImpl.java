/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.entity.synchronization.impl;

import org.abchip.mimo.biz.entity.synchronization.*;
import org.eclipse.emf.ecore.EClass;
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
public class SynchronizationFactoryImpl extends EFactoryImpl implements SynchronizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SynchronizationFactory init() {
		try {
			SynchronizationFactory theSynchronizationFactory = (SynchronizationFactory)EPackage.Registry.INSTANCE.getEFactory(SynchronizationPackage.eNS_URI);
			if (theSynchronizationFactory != null) {
				return theSynchronizationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SynchronizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationFactoryImpl() {
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
			case SynchronizationPackage.ENTITY_SYNC: return (EObject)createEntitySync();
			case SynchronizationPackage.ENTITY_SYNC_HISTORY: return (EObject)createEntitySyncHistory();
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE: return (EObject)createEntitySyncInclude();
			case SynchronizationPackage.ENTITY_SYNC_INCLUDE_GROUP: return (EObject)createEntitySyncIncludeGroup();
			case SynchronizationPackage.ENTITY_SYNC_REMOVE: return (EObject)createEntitySyncRemove();
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
	public EntitySync createEntitySync() {
		EntitySyncImpl entitySync = new EntitySyncImpl();
		return entitySync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySyncHistory createEntitySyncHistory() {
		EntitySyncHistoryImpl entitySyncHistory = new EntitySyncHistoryImpl();
		return entitySyncHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySyncInclude createEntitySyncInclude() {
		EntitySyncIncludeImpl entitySyncInclude = new EntitySyncIncludeImpl();
		return entitySyncInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySyncIncludeGroup createEntitySyncIncludeGroup() {
		EntitySyncIncludeGroupImpl entitySyncIncludeGroup = new EntitySyncIncludeGroupImpl();
		return entitySyncIncludeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntitySyncRemove createEntitySyncRemove() {
		EntitySyncRemoveImpl entitySyncRemove = new EntitySyncRemoveImpl();
		return entitySyncRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronizationPackage getSynchronizationPackage() {
		return (SynchronizationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SynchronizationPackage getPackage() {
		return SynchronizationPackage.eINSTANCE;
	}

} //SynchronizationFactoryImpl
