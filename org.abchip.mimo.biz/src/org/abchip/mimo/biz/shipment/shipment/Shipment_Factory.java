/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package
 * @generated
 */
public interface Shipment_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Shipment_Factory eINSTANCE = org.abchip.mimo.biz.shipment.shipment.impl.Shipment_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Carrier Shipment Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment Box Type</em>'.
	 * @generated
	 */
	CarrierShipmentBoxType createCarrierShipmentBoxType();

	/**
	 * Returns a new object of class '<em>Carrier Shipment Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carrier Shipment Method</em>'.
	 * @generated
	 */
	CarrierShipmentMethod createCarrierShipmentMethod();

	/**
	 * Returns a new object of class '<em>Delivery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery</em>'.
	 * @generated
	 */
	Delivery createDelivery();

	/**
	 * Returns a new object of class '<em>Shipment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment</em>'.
	 * @generated
	 */
	Shipment createShipment();

	/**
	 * Returns a new object of class '<em>Shipment Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Attribute</em>'.
	 * @generated
	 */
	ShipmentAttribute createShipmentAttribute();

	/**
	 * Returns a new object of class '<em>Shipment Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Box Type</em>'.
	 * @generated
	 */
	ShipmentBoxType createShipmentBoxType();

	/**
	 * Returns a new object of class '<em>Shipment Contact Mech</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Contact Mech</em>'.
	 * @generated
	 */
	ShipmentContactMech createShipmentContactMech();

	/**
	 * Returns a new object of class '<em>Shipment Contact Mech Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Contact Mech Type</em>'.
	 * @generated
	 */
	ShipmentContactMechType createShipmentContactMechType();

	/**
	 * Returns a new object of class '<em>Shipment Cost Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Cost Estimate</em>'.
	 * @generated
	 */
	ShipmentCostEstimate createShipmentCostEstimate();

	/**
	 * Returns a new object of class '<em>Shipment Gateway Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Gateway Config</em>'.
	 * @generated
	 */
	ShipmentGatewayConfig createShipmentGatewayConfig();

	/**
	 * Returns a new object of class '<em>Shipment Gateway Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Gateway Config Type</em>'.
	 * @generated
	 */
	ShipmentGatewayConfigType createShipmentGatewayConfigType();

	/**
	 * Returns a new object of class '<em>Shipment Gateway Dhl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Gateway Dhl</em>'.
	 * @generated
	 */
	ShipmentGatewayDhl createShipmentGatewayDhl();

	/**
	 * Returns a new object of class '<em>Shipment Gateway Fedex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Gateway Fedex</em>'.
	 * @generated
	 */
	ShipmentGatewayFedex createShipmentGatewayFedex();

	/**
	 * Returns a new object of class '<em>Shipment Gateway Ups</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Gateway Ups</em>'.
	 * @generated
	 */
	ShipmentGatewayUps createShipmentGatewayUps();

	/**
	 * Returns a new object of class '<em>Shipment Gateway Usps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Gateway Usps</em>'.
	 * @generated
	 */
	ShipmentGatewayUsps createShipmentGatewayUsps();

	/**
	 * Returns a new object of class '<em>Shipment Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Item</em>'.
	 * @generated
	 */
	ShipmentItem createShipmentItem();

	/**
	 * Returns a new object of class '<em>Shipment Item Billing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Item Billing</em>'.
	 * @generated
	 */
	ShipmentItemBilling createShipmentItemBilling();

	/**
	 * Returns a new object of class '<em>Shipment Item Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Item Feature</em>'.
	 * @generated
	 */
	ShipmentItemFeature createShipmentItemFeature();

	/**
	 * Returns a new object of class '<em>Shipment Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Method Type</em>'.
	 * @generated
	 */
	ShipmentMethodType createShipmentMethodType();

	/**
	 * Returns a new object of class '<em>Shipment Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Package</em>'.
	 * @generated
	 */
	ShipmentPackage createShipmentPackage();

	/**
	 * Returns a new object of class '<em>Shipment Package Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Package Content</em>'.
	 * @generated
	 */
	ShipmentPackageContent createShipmentPackageContent();

	/**
	 * Returns a new object of class '<em>Shipment Package Route Seg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Package Route Seg</em>'.
	 * @generated
	 */
	ShipmentPackageRouteSeg createShipmentPackageRouteSeg();

	/**
	 * Returns a new object of class '<em>Shipment Route Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Route Segment</em>'.
	 * @generated
	 */
	ShipmentRouteSegment createShipmentRouteSegment();

	/**
	 * Returns a new object of class '<em>Shipment Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Status</em>'.
	 * @generated
	 */
	ShipmentStatus createShipmentStatus();

	/**
	 * Returns a new object of class '<em>Shipment Time Estimate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Time Estimate</em>'.
	 * @generated
	 */
	ShipmentTimeEstimate createShipmentTimeEstimate();

	/**
	 * Returns a new object of class '<em>Shipment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Type</em>'.
	 * @generated
	 */
	ShipmentType createShipmentType();

	/**
	 * Returns a new object of class '<em>Shipment Type Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipment Type Attr</em>'.
	 * @generated
	 */
	ShipmentTypeAttr createShipmentTypeAttr();

	/**
	 * Returns a new object of class '<em>Shipping Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipping Document</em>'.
	 * @generated
	 */
	ShippingDocument createShippingDocument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Shipment_Package getShipment_Package();

} //Shipment_Factory
