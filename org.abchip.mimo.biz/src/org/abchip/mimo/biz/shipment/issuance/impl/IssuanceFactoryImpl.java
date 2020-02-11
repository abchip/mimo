/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.issuance.impl;

import org.abchip.mimo.biz.shipment.issuance.*;
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
public class IssuanceFactoryImpl extends EFactoryImpl implements IssuanceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IssuanceFactory init() {
		try {
			IssuanceFactory theIssuanceFactory = (IssuanceFactory)EPackage.Registry.INSTANCE.getEFactory(IssuancePackage.eNS_URI);
			if (theIssuanceFactory != null) {
				return theIssuanceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IssuanceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuanceFactoryImpl() {
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
			case IssuancePackage.ITEM_ISSUANCE: return (EObject)createItemIssuance();
			case IssuancePackage.ITEM_ISSUANCE_ROLE: return (EObject)createItemIssuanceRole();
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
	public ItemIssuance createItemIssuance() {
		ItemIssuanceImpl itemIssuance = new ItemIssuanceImpl();
		return itemIssuance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemIssuanceRole createItemIssuanceRole() {
		ItemIssuanceRoleImpl itemIssuanceRole = new ItemIssuanceRoleImpl();
		return itemIssuanceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssuancePackage getIssuancePackage() {
		return (IssuancePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IssuancePackage getPackage() {
		return IssuancePackage.eINSTANCE;
	}

} //IssuanceFactoryImpl
