/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.receipt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.shipment.receipt.ReceiptPackage
 * @generated
 */
public interface ReceiptFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReceiptFactory eINSTANCE = org.abchip.mimo.biz.shipment.receipt.impl.ReceiptFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rejection Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rejection Reason</em>'.
	 * @generated
	 */
	RejectionReason createRejectionReason();

	/**
	 * Returns a new object of class '<em>Shipment Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Receipt</em>'.
	 * @generated
	 */
	ShipmentReceipt createShipmentReceipt();

	/**
	 * Returns a new object of class '<em>Shipment Receipt Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Receipt Role</em>'.
	 * @generated
	 */
	ShipmentReceiptRole createShipmentReceiptRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReceiptPackage getReceiptPackage();

} //ReceiptFactory
