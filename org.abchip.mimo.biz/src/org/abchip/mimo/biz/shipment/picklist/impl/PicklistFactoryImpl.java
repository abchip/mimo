/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.picklist.impl;

import org.abchip.mimo.biz.shipment.picklist.*;
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
public class PicklistFactoryImpl extends EFactoryImpl implements PicklistFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PicklistFactory init() {
		try {
			PicklistFactory thePicklistFactory = (PicklistFactory)EPackage.Registry.INSTANCE.getEFactory(PicklistPackage.eNS_URI);
			if (thePicklistFactory != null) {
				return thePicklistFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PicklistFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PicklistFactoryImpl() {
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
			case PicklistPackage.PICKLIST: return (EObject)createPicklist();
			case PicklistPackage.PICKLIST_BIN: return (EObject)createPicklistBin();
			case PicklistPackage.PICKLIST_ITEM: return (EObject)createPicklistItem();
			case PicklistPackage.PICKLIST_ROLE: return (EObject)createPicklistRole();
			case PicklistPackage.PICKLIST_STATUS_HISTORY: return (EObject)createPicklistStatusHistory();
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
	public Picklist createPicklist() {
		PicklistImpl picklist = new PicklistImpl();
		return picklist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicklistBin createPicklistBin() {
		PicklistBinImpl picklistBin = new PicklistBinImpl();
		return picklistBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicklistItem createPicklistItem() {
		PicklistItemImpl picklistItem = new PicklistItemImpl();
		return picklistItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicklistRole createPicklistRole() {
		PicklistRoleImpl picklistRole = new PicklistRoleImpl();
		return picklistRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicklistStatusHistory createPicklistStatusHistory() {
		PicklistStatusHistoryImpl picklistStatusHistory = new PicklistStatusHistoryImpl();
		return picklistStatusHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicklistPackage getPicklistPackage() {
		return (PicklistPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PicklistPackage getPackage() {
		return PicklistPackage.eINSTANCE;
	}

} //PicklistFactoryImpl
