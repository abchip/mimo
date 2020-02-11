/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.receipt.impl;

import org.abchip.mimo.biz.shipment.receipt.*;
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
public class ReceiptFactoryImpl extends EFactoryImpl implements ReceiptFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReceiptFactory init() {
		try {
			ReceiptFactory theReceiptFactory = (ReceiptFactory)EPackage.Registry.INSTANCE.getEFactory(ReceiptPackage.eNS_URI);
			if (theReceiptFactory != null) {
				return theReceiptFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReceiptFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiptFactoryImpl() {
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
			case ReceiptPackage.REJECTION_REASON: return (EObject)createRejectionReason();
			case ReceiptPackage.SHIPMENT_RECEIPT: return (EObject)createShipmentReceipt();
			case ReceiptPackage.SHIPMENT_RECEIPT_ROLE: return (EObject)createShipmentReceiptRole();
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
	public RejectionReason createRejectionReason() {
		RejectionReasonImpl rejectionReason = new RejectionReasonImpl();
		return rejectionReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentReceipt createShipmentReceipt() {
		ShipmentReceiptImpl shipmentReceipt = new ShipmentReceiptImpl();
		return shipmentReceipt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentReceiptRole createShipmentReceiptRole() {
		ShipmentReceiptRoleImpl shipmentReceiptRole = new ShipmentReceiptRoleImpl();
		return shipmentReceiptRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReceiptPackage getReceiptPackage() {
		return (ReceiptPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReceiptPackage getPackage() {
		return ReceiptPackage.eINSTANCE;
	}

} //ReceiptFactoryImpl
