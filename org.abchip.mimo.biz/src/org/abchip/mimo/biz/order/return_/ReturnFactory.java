/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.order.return_;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.order.return_.ReturnPackage
 * @generated
 */
public interface ReturnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReturnFactory eINSTANCE = org.abchip.mimo.biz.order.return_.impl.ReturnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Communication Event Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Event Return</em>'.
	 * @generated
	 */
	CommunicationEventReturn createCommunicationEventReturn();

	/**
	 * Returns a new object of class '<em>Adjustment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjustment</em>'.
	 * @generated
	 */
	ReturnAdjustment createReturnAdjustment();

	/**
	 * Returns a new object of class '<em>Adjustment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adjustment Type</em>'.
	 * @generated
	 */
	ReturnAdjustmentType createReturnAdjustmentType();

	/**
	 * Returns a new object of class '<em>Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Mech</em>'.
	 * @generated
	 */
	ReturnContactMech createReturnContactMech();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	ReturnHeader createReturnHeader();

	/**
	 * Returns a new object of class '<em>Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header Type</em>'.
	 * @generated
	 */
	ReturnHeaderType createReturnHeaderType();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	ReturnItem createReturnItem();

	/**
	 * Returns a new object of class '<em>Item Billing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Billing</em>'.
	 * @generated
	 */
	ReturnItemBilling createReturnItemBilling();

	/**
	 * Returns a new object of class '<em>Item Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Response</em>'.
	 * @generated
	 */
	ReturnItemResponse createReturnItemResponse();

	/**
	 * Returns a new object of class '<em>Item Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Shipment</em>'.
	 * @generated
	 */
	ReturnItemShipment createReturnItemShipment();

	/**
	 * Returns a new object of class '<em>Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type</em>'.
	 * @generated
	 */
	ReturnItemType createReturnItemType();

	/**
	 * Returns a new object of class '<em>Item Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Type Map</em>'.
	 * @generated
	 */
	ReturnItemTypeMap createReturnItemTypeMap();

	/**
	 * Returns a new object of class '<em>Reason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reason</em>'.
	 * @generated
	 */
	ReturnReason createReturnReason();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	ReturnStatus createReturnStatus();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	ReturnType createReturnType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReturnPackage getReturnPackage();

} //ReturnFactory
