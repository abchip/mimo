/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.shipment.shipment.*;
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
public class Shipment_FactoryImpl extends EFactoryImpl implements Shipment_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Shipment_Factory init() {
		try {
			Shipment_Factory theShipment_Factory = (Shipment_Factory)EPackage.Registry.INSTANCE.getEFactory(Shipment_Package.eNS_URI);
			if (theShipment_Factory != null) {
				return theShipment_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Shipment_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipment_FactoryImpl() {
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
			case Shipment_Package.CARRIER_SHIPMENT_BOX_TYPE: return (EObject)createCarrierShipmentBoxType();
			case Shipment_Package.CARRIER_SHIPMENT_METHOD: return (EObject)createCarrierShipmentMethod();
			case Shipment_Package.DELIVERY: return (EObject)createDelivery();
			case Shipment_Package.SHIPMENT: return (EObject)createShipment();
			case Shipment_Package.SHIPMENT_ATTRIBUTE: return (EObject)createShipmentAttribute();
			case Shipment_Package.SHIPMENT_BOX_TYPE: return (EObject)createShipmentBoxType();
			case Shipment_Package.SHIPMENT_CONTACT_MECH: return (EObject)createShipmentContactMech();
			case Shipment_Package.SHIPMENT_CONTACT_MECH_TYPE: return (EObject)createShipmentContactMechType();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE: return (EObject)createShipmentCostEstimate();
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG: return (EObject)createShipmentGatewayConfig();
			case Shipment_Package.SHIPMENT_GATEWAY_CONFIG_TYPE: return (EObject)createShipmentGatewayConfigType();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL: return (EObject)createShipmentGatewayDhl();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX: return (EObject)createShipmentGatewayFedex();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS: return (EObject)createShipmentGatewayUps();
			case Shipment_Package.SHIPMENT_GATEWAY_USPS: return (EObject)createShipmentGatewayUsps();
			case Shipment_Package.SHIPMENT_ITEM: return (EObject)createShipmentItem();
			case Shipment_Package.SHIPMENT_ITEM_BILLING: return (EObject)createShipmentItemBilling();
			case Shipment_Package.SHIPMENT_ITEM_FEATURE: return (EObject)createShipmentItemFeature();
			case Shipment_Package.SHIPMENT_METHOD_TYPE: return (EObject)createShipmentMethodType();
			case Shipment_Package.SHIPMENT_PACKAGE: return (EObject)createShipmentPackage();
			case Shipment_Package.SHIPMENT_PACKAGE_CONTENT: return (EObject)createShipmentPackageContent();
			case Shipment_Package.SHIPMENT_PACKAGE_ROUTE_SEG: return (EObject)createShipmentPackageRouteSeg();
			case Shipment_Package.SHIPMENT_ROUTE_SEGMENT: return (EObject)createShipmentRouteSegment();
			case Shipment_Package.SHIPMENT_STATUS: return (EObject)createShipmentStatus();
			case Shipment_Package.SHIPMENT_TIME_ESTIMATE: return (EObject)createShipmentTimeEstimate();
			case Shipment_Package.SHIPMENT_TYPE: return (EObject)createShipmentType();
			case Shipment_Package.SHIPMENT_TYPE_ATTR: return (EObject)createShipmentTypeAttr();
			case Shipment_Package.SHIPPING_DOCUMENT: return (EObject)createShippingDocument();
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
	public CarrierShipmentBoxType createCarrierShipmentBoxType() {
		CarrierShipmentBoxTypeImpl carrierShipmentBoxType = new CarrierShipmentBoxTypeImpl();
		return carrierShipmentBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarrierShipmentMethod createCarrierShipmentMethod() {
		CarrierShipmentMethodImpl carrierShipmentMethod = new CarrierShipmentMethodImpl();
		return carrierShipmentMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Delivery createDelivery() {
		DeliveryImpl delivery = new DeliveryImpl();
		return delivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment createShipment() {
		ShipmentImpl shipment = new ShipmentImpl();
		return shipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentAttribute createShipmentAttribute() {
		ShipmentAttributeImpl shipmentAttribute = new ShipmentAttributeImpl();
		return shipmentAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentBoxType createShipmentBoxType() {
		ShipmentBoxTypeImpl shipmentBoxType = new ShipmentBoxTypeImpl();
		return shipmentBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentContactMech createShipmentContactMech() {
		ShipmentContactMechImpl shipmentContactMech = new ShipmentContactMechImpl();
		return shipmentContactMech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentContactMechType createShipmentContactMechType() {
		ShipmentContactMechTypeImpl shipmentContactMechType = new ShipmentContactMechTypeImpl();
		return shipmentContactMechType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentCostEstimate createShipmentCostEstimate() {
		ShipmentCostEstimateImpl shipmentCostEstimate = new ShipmentCostEstimateImpl();
		return shipmentCostEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayConfig createShipmentGatewayConfig() {
		ShipmentGatewayConfigImpl shipmentGatewayConfig = new ShipmentGatewayConfigImpl();
		return shipmentGatewayConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayConfigType createShipmentGatewayConfigType() {
		ShipmentGatewayConfigTypeImpl shipmentGatewayConfigType = new ShipmentGatewayConfigTypeImpl();
		return shipmentGatewayConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayDhl createShipmentGatewayDhl() {
		ShipmentGatewayDhlImpl shipmentGatewayDhl = new ShipmentGatewayDhlImpl();
		return shipmentGatewayDhl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayFedex createShipmentGatewayFedex() {
		ShipmentGatewayFedexImpl shipmentGatewayFedex = new ShipmentGatewayFedexImpl();
		return shipmentGatewayFedex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayUps createShipmentGatewayUps() {
		ShipmentGatewayUpsImpl shipmentGatewayUps = new ShipmentGatewayUpsImpl();
		return shipmentGatewayUps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayUsps createShipmentGatewayUsps() {
		ShipmentGatewayUspsImpl shipmentGatewayUsps = new ShipmentGatewayUspsImpl();
		return shipmentGatewayUsps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentItem createShipmentItem() {
		ShipmentItemImpl shipmentItem = new ShipmentItemImpl();
		return shipmentItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentItemBilling createShipmentItemBilling() {
		ShipmentItemBillingImpl shipmentItemBilling = new ShipmentItemBillingImpl();
		return shipmentItemBilling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentItemFeature createShipmentItemFeature() {
		ShipmentItemFeatureImpl shipmentItemFeature = new ShipmentItemFeatureImpl();
		return shipmentItemFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType createShipmentMethodType() {
		ShipmentMethodTypeImpl shipmentMethodType = new ShipmentMethodTypeImpl();
		return shipmentMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentPackage createShipmentPackage() {
		ShipmentPackageImpl shipmentPackage = new ShipmentPackageImpl();
		return shipmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentPackageContent createShipmentPackageContent() {
		ShipmentPackageContentImpl shipmentPackageContent = new ShipmentPackageContentImpl();
		return shipmentPackageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentPackageRouteSeg createShipmentPackageRouteSeg() {
		ShipmentPackageRouteSegImpl shipmentPackageRouteSeg = new ShipmentPackageRouteSegImpl();
		return shipmentPackageRouteSeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentRouteSegment createShipmentRouteSegment() {
		ShipmentRouteSegmentImpl shipmentRouteSegment = new ShipmentRouteSegmentImpl();
		return shipmentRouteSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentStatus createShipmentStatus() {
		ShipmentStatusImpl shipmentStatus = new ShipmentStatusImpl();
		return shipmentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentTimeEstimate createShipmentTimeEstimate() {
		ShipmentTimeEstimateImpl shipmentTimeEstimate = new ShipmentTimeEstimateImpl();
		return shipmentTimeEstimate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentType createShipmentType() {
		ShipmentTypeImpl shipmentType = new ShipmentTypeImpl();
		return shipmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentTypeAttr createShipmentTypeAttr() {
		ShipmentTypeAttrImpl shipmentTypeAttr = new ShipmentTypeAttrImpl();
		return shipmentTypeAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShippingDocument createShippingDocument() {
		ShippingDocumentImpl shippingDocument = new ShippingDocumentImpl();
		return shippingDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment_Package getShipment_Package() {
		return (Shipment_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Shipment_Package getPackage() {
		return Shipment_Package.eINSTANCE;
	}

} //Shipment_FactoryImpl
