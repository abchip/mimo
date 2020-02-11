/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import org.abchip.mimo.biz.BizPackage;
import org.abchip.mimo.biz.content.document.DocumentPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Factory
 * @model kind="package"
 * @generated
 */
public interface Shipment_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shipment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.abchip.org/mimo/biz/shipment/shipment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "biz-shipment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Shipment_Package eINSTANCE = org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl <em>Carrier Shipment Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getCarrierShipmentBoxType()
	 * @generated
	 */
	int CARRIER_SHIPMENT_BOX_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Box Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Oversize Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Packaging Type Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Carrier Shipment Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_BOX_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl <em>Carrier Shipment Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getCarrierShipmentMethod()
	 * @generated
	 */
	int CARRIER_SHIPMENT_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Carrier Service Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__CARRIER_SERVICE_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD__SEQUENCE_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Carrier Shipment Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARRIER_SHIPMENT_METHOD_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl <em>Delivery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getDelivery()
	 * @generated
	 */
	int DELIVERY = 2;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Delivery Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__DELIVERY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ACTUAL_ARRIVAL_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ACTUAL_START_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dest Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__DEST_FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__END_MILEAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Estimated Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ESTIMATED_ARRIVAL_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Estimated Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ESTIMATED_START_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__FIXED_ASSET_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fuel Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__FUEL_USED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Origin Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__ORIGIN_FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Start Mileage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY__START_MILEAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Delivery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl <em>Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipment()
	 * @generated
	 */
	int SHIPMENT = 3;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SHIPMENT_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additional Shipping Charge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ADDITIONAL_SHIPPING_CHARGE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Addtl Shipping Charge Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__CREATED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__CREATED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Destination Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__DESTINATION_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Destination Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__DESTINATION_FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Destination Telecom Number Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__DESTINATION_TELECOM_NUMBER_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Estimated Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ESTIMATED_ARRIVAL_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Estimated Arrival Work Eff Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Estimated Ready Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ESTIMATED_READY_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Estimated Ship Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ESTIMATED_SHIP_COST = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Estimated Ship Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ESTIMATED_SHIP_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Estimated Ship Work Eff Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Handling Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__HANDLING_INSTRUCTIONS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Last Modified By User Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LAST_MODIFIED_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Latest Cancel Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__LATEST_CANCEL_DATE = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Origin Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ORIGIN_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Origin Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ORIGIN_FACILITY_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Origin Telecom Number Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ORIGIN_TELECOM_NUMBER_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Party Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__PARTY_ID_FROM = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Party Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__PARTY_ID_TO = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Picklist Bin Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__PICKLIST_BIN_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Primary Order Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__PRIMARY_ORDER_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Primary Return Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__PRIMARY_RETURN_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Primary Ship Group Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Shipment Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SHIPMENT_ATTRIBUTES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Shipment Contact Mechs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SHIPMENT_CONTACT_MECHS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Shipment Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SHIPMENT_ITEMS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Shipment Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SHIPMENT_PACKAGES = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Shipment Route Segments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SHIPMENT_ROUTE_SEGMENTS = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Shipment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__SHIPMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__STATUS_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 34;

	/**
	 * The number of structural features of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 35;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentAttributeImpl <em>Shipment Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentAttributeImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentAttribute()
	 * @generated
	 */
	int SHIPMENT_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attr Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__ATTR_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attr Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE__ATTR_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shipment Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ATTRIBUTE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl <em>Shipment Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentBoxType()
	 * @generated
	 */
	int SHIPMENT_BOX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Box Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Box Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__BOX_HEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Box Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__BOX_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Box Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__BOX_WEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Box Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__BOX_WIDTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Carrier Shipment Box Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__CARRIER_SHIPMENT_BOX_TYPES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dimension Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__DIMENSION_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE__WEIGHT_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Shipment Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_BOX_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechImpl <em>Shipment Contact Mech</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentContactMech()
	 * @generated
	 */
	int SHIPMENT_CONTACT_MECH = 6;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Contact Mech Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shipment Contact Mech</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechTypeImpl <em>Shipment Contact Mech Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechTypeImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentContactMechType()
	 * @generated
	 */
	int SHIPMENT_CONTACT_MECH_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Contact Mech Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_TYPE__SHIPMENT_CONTACT_MECH_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shipment Contact Mech Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_CONTACT_MECH_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl <em>Shipment Cost Estimate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentCostEstimate()
	 * @generated
	 */
	int SHIPMENT_COST_ESTIMATE = 8;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Cost Estimate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__FEATURE_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Geo Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__GEO_ID_FROM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Geo Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__GEO_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Order Flat Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Order Item Flat Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Order Price Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Oversize Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Oversize Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Price Break Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Price Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Price Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Product Feature Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Product Store Ship Meth Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Quantity Break Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Quantity Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Quantity Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Shipping Price Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Weight Break Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Weight Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The number of structural features of the '<em>Shipment Cost Estimate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_COST_ESTIMATE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 28;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigImpl <em>Shipment Gateway Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayConfig()
	 * @generated
	 */
	int SHIPMENT_GATEWAY_CONFIG = 9;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPED__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Conf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shipment Gateway Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPED_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl <em>Shipment Gateway Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayConfigType()
	 * @generated
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Conf Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__SHIPMENT_GATEWAY_CONF_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shipment Gateway Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_CONFIG_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl <em>Shipment Gateway Dhl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayDhl()
	 * @generated
	 */
	int SHIPMENT_GATEWAY_DHL = 11;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__CREATED_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__CREATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__LAST_UPDATED_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__LAST_UPDATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__SHIPMENT_GATEWAY_CONFIG_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__DESCRIPTION = SHIPMENT_GATEWAY_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Conf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__SHIPMENT_GATEWAY_CONF_TYPE_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Access Account Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access Shipping Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__CONNECT_URL = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Head Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__HEAD_ACTION = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Head Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__HEAD_VERSION = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Label Image Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rate Estimate Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Shipment Gateway Dhl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_DHL_FEATURE_COUNT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl <em>Shipment Gateway Fedex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayFedex()
	 * @generated
	 */
	int SHIPMENT_GATEWAY_FEDEX = 12;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__CREATED_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__CREATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__LAST_UPDATED_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__LAST_UPDATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__SHIPMENT_GATEWAY_CONFIG_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__DESCRIPTION = SHIPMENT_GATEWAY_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Conf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__SHIPMENT_GATEWAY_CONF_TYPE_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Access Account Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Meter Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access User Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Access User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connect Soap Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__CONNECT_URL = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default Dropoff Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Packaging Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Image Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rate Estimate Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Template Shipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Template Subscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Shipment Gateway Fedex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_FEDEX_FEATURE_COUNT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl <em>Shipment Gateway Ups</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayUps()
	 * @generated
	 */
	int SHIPMENT_GATEWAY_UPS = 13;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__CREATED_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__CREATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__LAST_UPDATED_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__LAST_UPDATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__SHIPMENT_GATEWAY_CONFIG_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__DESCRIPTION = SHIPMENT_GATEWAY_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Conf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__SHIPMENT_GATEWAY_CONF_TYPE_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Access License Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Access User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bill Shipper Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cod Allow Cod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cod Funds Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cod Surcharge Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cod Surcharge Apply To Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Cod Surcharge Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Connect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__CONNECT_URL = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Customer Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Default Return Label Memo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Default Return Label Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Max Estimate Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Min Estimate Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Save Cert Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Save Cert Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Shipper Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Shipper Pickup Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Shipment Gateway Ups</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_UPS_FEATURE_COUNT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl <em>Shipment Gateway Usps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayUsps()
	 * @generated
	 */
	int SHIPMENT_GATEWAY_USPS = 14;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__CREATED_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__CREATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__LAST_UPDATED_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__LAST_UPDATED_TX_STAMP = SHIPMENT_GATEWAY_CONFIG__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Config Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__SHIPMENT_GATEWAY_CONFIG_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__DESCRIPTION = SHIPMENT_GATEWAY_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Shipment Gateway Conf Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__SHIPMENT_GATEWAY_CONF_TYPE_ID = SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Access Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__CONNECT_URL = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connect Url Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Estimate Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS__TEST = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Shipment Gateway Usps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_GATEWAY_USPS_FEATURE_COUNT = SHIPMENT_GATEWAY_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemImpl <em>Shipment Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentItem()
	 * @generated
	 */
	int SHIPMENT_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__SHIPMENT_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shipment Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM__SHIPMENT_CONTENT_DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Shipment Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemBillingImpl <em>Shipment Item Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemBillingImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentItemBilling()
	 * @generated
	 */
	int SHIPMENT_ITEM_BILLING = 16;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoice Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__INVOICE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Invoice Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING__SHIPMENT_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shipment Item Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_BILLING_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemFeatureImpl <em>Shipment Item Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemFeatureImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentItemFeature()
	 * @generated
	 */
	int SHIPMENT_ITEM_FEATURE = 17;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product Feature Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shipment Item Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ITEM_FEATURE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentMethodTypeImpl <em>Shipment Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentMethodTypeImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentMethodType()
	 * @generated
	 */
	int SHIPMENT_METHOD_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE__SEQUENCE_NUM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shipment Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_METHOD_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl <em>Shipment Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentPackage()
	 * @generated
	 */
	int SHIPMENT_PACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Box Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__BOX_HEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Box Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__BOX_LENGTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Box Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__BOX_WIDTH = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__DATE_CREATED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dimension Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__DIMENSION_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Insured Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__INSURED_VALUE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Shipment Box Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__WEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE__WEIGHT_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Shipment Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageContentImpl <em>Shipment Package Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageContentImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentPackageContent()
	 * @generated
	 */
	int SHIPMENT_PACKAGE_CONTENT = 20;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__SHIPMENT_ITEM_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__SHIPMENT_PACKAGE_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Product Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__SUB_PRODUCT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sub Product Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT__SUB_PRODUCT_QUANTITY = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shipment Package Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_CONTENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl <em>Shipment Package Route Seg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentPackageRouteSeg()
	 * @generated
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG = 21;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipment Route Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Box Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cod Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Insured Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>International Invoice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Label Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Label Intl Sign Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Label Printed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Package Other Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Package Service Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Package Transport Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Tracking Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Shipment Package Route Seg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_PACKAGE_ROUTE_SEG_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl <em>Shipment Route Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentRouteSegment()
	 * @generated
	 */
	int SHIPMENT_ROUTE_SEGMENT = 22;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Route Segment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actual Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actual Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actual Other Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actual Service Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Actual Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Actual Transport Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Billing Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Billing Weight Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Carrier Delivery Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Carrier Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Carrier Restriction Codes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Carrier Restriction Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Carrier Service Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Currency Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Delivery Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Dest Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Dest Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Dest Telecom Number Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Estimated Arrival Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Estimated Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Home Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Home Delivery Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Last Updated Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Origin Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Origin Facility Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Origin Telecom Number Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Third Party Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Third Party Country Geo Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Third Party Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Tracking Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Tracking Id Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Updated By User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Ups High Value Report</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 35;

	/**
	 * The number of structural features of the '<em>Shipment Route Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_ROUTE_SEGMENT_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 36;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl <em>Shipment Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentStatus()
	 * @generated
	 */
	int SHIPMENT_STATUS = 23;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Status Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__STATUS_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__SHIPMENT_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Change By User Login Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS__STATUS_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shipment Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_STATUS_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl <em>Shipment Time Estimate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentTimeEstimate()
	 * @generated
	 */
	int SHIPMENT_TIME_ESTIMATE = 24;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Geo Id To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__GEO_ID_TO = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geo Id From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__GEO_ID_FROM = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__FROM_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__PARTY_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__ROLE_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__SHIPMENT_METHOD_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lead Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__LEAD_TIME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lead Time Uom Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__LEAD_TIME_UOM_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__SEQUENCE_NUMBER = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE__THRU_DATE = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Shipment Time Estimate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TIME_ESTIMATE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl <em>Shipment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentType()
	 * @generated
	 */
	int SHIPMENT_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__SLOTS = BizPackage.BIZ_ENTITY_TYPE__SLOTS;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__CREATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY_TYPE__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__SHIPMENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__DESCRIPTION = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__HAS_TABLE = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__PARENT_TYPE_ID = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shipment Type Attrs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Shipment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_FEATURE_COUNT = BizPackage.BIZ_ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeAttrImpl <em>Shipment Type Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeAttrImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentTypeAttr()
	 * @generated
	 */
	int SHIPMENT_TYPE_ATTR = 26;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR__CREATED_STAMP = BizPackage.BIZ_ENTITY__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR__CREATED_TX_STAMP = BizPackage.BIZ_ENTITY__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR__LAST_UPDATED_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR__LAST_UPDATED_TX_STAMP = BizPackage.BIZ_ENTITY__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Shipment Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR__SHIPMENT_TYPE_ID = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR__ATTR_NAME = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR__DESCRIPTION = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shipment Type Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_TYPE_ATTR_FEATURE_COUNT = BizPackage.BIZ_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShippingDocumentImpl <em>Shipping Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShippingDocumentImpl
	 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShippingDocument()
	 * @generated
	 */
	int SHIPPING_DOCUMENT = 27;

	/**
	 * The feature id for the '<em><b>Created Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__CREATED_STAMP = DocumentPackage.DOCUMENT__CREATED_STAMP;

	/**
	 * The feature id for the '<em><b>Created Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__CREATED_TX_STAMP = DocumentPackage.DOCUMENT__CREATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__LAST_UPDATED_STAMP = DocumentPackage.DOCUMENT__LAST_UPDATED_STAMP;

	/**
	 * The feature id for the '<em><b>Last Updated Tx Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__LAST_UPDATED_TX_STAMP = DocumentPackage.DOCUMENT__LAST_UPDATED_TX_STAMP;

	/**
	 * The feature id for the '<em><b>Document Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__DOCUMENT_ID = DocumentPackage.DOCUMENT__DOCUMENT_ID;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__COMMENTS = DocumentPackage.DOCUMENT__COMMENTS;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__DATE_CREATED = DocumentPackage.DOCUMENT__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Document Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__DOCUMENT_ATTRIBUTES = DocumentPackage.DOCUMENT__DOCUMENT_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Document Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__DOCUMENT_LOCATION = DocumentPackage.DOCUMENT__DOCUMENT_LOCATION;

	/**
	 * The feature id for the '<em><b>Document Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__DOCUMENT_TEXT = DocumentPackage.DOCUMENT__DOCUMENT_TEXT;

	/**
	 * The feature id for the '<em><b>Document Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__DOCUMENT_TYPE_ID = DocumentPackage.DOCUMENT__DOCUMENT_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Image Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__IMAGE_DATA = DocumentPackage.DOCUMENT__IMAGE_DATA;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__DESCRIPTION = DocumentPackage.DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Shipment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__SHIPMENT_ID = DocumentPackage.DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shipment Item Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__SHIPMENT_ITEM_SEQ_ID = DocumentPackage.DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shipment Package Seq Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT__SHIPMENT_PACKAGE_SEQ_ID = DocumentPackage.DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Shipping Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPPING_DOCUMENT_FEATURE_COUNT = DocumentPackage.DOCUMENT_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType <em>Carrier Shipment Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment Box Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType
	 * @generated
	 */
	EClass getCarrierShipmentBoxType();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Box Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getShipmentBoxTypeId()
	 * @see #getCarrierShipmentBoxType()
	 * @generated
	 */
	EReference getCarrierShipmentBoxType_ShipmentBoxTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPartyId()
	 * @see #getCarrierShipmentBoxType()
	 * @generated
	 */
	EReference getCarrierShipmentBoxType_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getOversizeCode <em>Oversize Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oversize Code</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getOversizeCode()
	 * @see #getCarrierShipmentBoxType()
	 * @generated
	 */
	EAttribute getCarrierShipmentBoxType_OversizeCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPackagingTypeCode <em>Packaging Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packaging Type Code</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentBoxType#getPackagingTypeCode()
	 * @see #getCarrierShipmentBoxType()
	 * @generated
	 */
	EAttribute getCarrierShipmentBoxType_PackagingTypeCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod <em>Carrier Shipment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carrier Shipment Method</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod
	 * @generated
	 */
	EClass getCarrierShipmentMethod();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getShipmentMethodTypeId()
	 * @see #getCarrierShipmentMethod()
	 * @generated
	 */
	EReference getCarrierShipmentMethod_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getPartyId()
	 * @see #getCarrierShipmentMethod()
	 * @generated
	 */
	EReference getCarrierShipmentMethod_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getRoleTypeId()
	 * @see #getCarrierShipmentMethod()
	 * @generated
	 */
	EAttribute getCarrierShipmentMethod_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getCarrierServiceCode <em>Carrier Service Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Service Code</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getCarrierServiceCode()
	 * @see #getCarrierShipmentMethod()
	 * @generated
	 */
	EAttribute getCarrierShipmentMethod_CarrierServiceCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.CarrierShipmentMethod#getSequenceNumber()
	 * @see #getCarrierShipmentMethod()
	 * @generated
	 */
	EAttribute getCarrierShipmentMethod_SequenceNumber();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.Delivery <em>Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery
	 * @generated
	 */
	EClass getDelivery();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getDeliveryId <em>Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getDeliveryId()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_DeliveryId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getActualArrivalDate <em>Actual Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Arrival Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getActualArrivalDate()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_ActualArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getActualStartDate <em>Actual Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Start Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getActualStartDate()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_ActualStartDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getDestFacilityId <em>Dest Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest Facility Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getDestFacilityId()
	 * @see #getDelivery()
	 * @generated
	 */
	EReference getDelivery_DestFacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEndMileage <em>End Mileage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Mileage</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getEndMileage()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_EndMileage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Arrival Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedArrivalDate()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_EstimatedArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedStartDate <em>Estimated Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Start Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getEstimatedStartDate()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_EstimatedStartDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getFixedAssetId <em>Fixed Asset Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed Asset Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getFixedAssetId()
	 * @see #getDelivery()
	 * @generated
	 */
	EReference getDelivery_FixedAssetId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getFuelUsed <em>Fuel Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fuel Used</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getFuelUsed()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_FuelUsed();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getOriginFacilityId <em>Origin Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Facility Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getOriginFacilityId()
	 * @see #getDelivery()
	 * @generated
	 */
	EReference getDelivery_OriginFacilityId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Delivery#getStartMileage <em>Start Mileage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Mileage</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Delivery#getStartMileage()
	 * @see #getDelivery()
	 * @generated
	 */
	EAttribute getDelivery_StartMileage();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment
	 * @generated
	 */
	EClass getShipment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentId()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getAdditionalShippingCharge <em>Additional Shipping Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Shipping Charge</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getAdditionalShippingCharge()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_AdditionalShippingCharge();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getAddtlShippingChargeDesc <em>Addtl Shipping Charge Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addtl Shipping Charge Desc</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getAddtlShippingChargeDesc()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_AddtlShippingChargeDesc();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedByUserLogin <em>Created By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User Login</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedByUserLogin()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_CreatedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getCreatedDate()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_CreatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getCurrencyUomId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationContactMechId <em>Destination Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationContactMechId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_DestinationContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationFacilityId <em>Destination Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Facility Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationFacilityId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_DestinationFacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationTelecomNumberId <em>Destination Telecom Number Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination Telecom Number Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getDestinationTelecomNumberId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_DestinationTelecomNumberId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Arrival Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalDate()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_EstimatedArrivalDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalWorkEffId <em>Estimated Arrival Work Eff Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Estimated Arrival Work Eff Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedArrivalWorkEffId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_EstimatedArrivalWorkEffId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedReadyDate <em>Estimated Ready Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Ready Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedReadyDate()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_EstimatedReadyDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipCost <em>Estimated Ship Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Ship Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipCost()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_EstimatedShipCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipDate <em>Estimated Ship Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Ship Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipDate()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_EstimatedShipDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipWorkEffId <em>Estimated Ship Work Eff Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Estimated Ship Work Eff Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getEstimatedShipWorkEffId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_EstimatedShipWorkEffId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getHandlingInstructions <em>Handling Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handling Instructions</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getHandlingInstructions()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_HandlingInstructions();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedByUserLogin <em>Last Modified By User Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified By User Login</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedByUserLogin()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_LastModifiedByUserLogin();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedDate <em>Last Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getLastModifiedDate()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_LastModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getLatestCancelDate <em>Latest Cancel Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Cancel Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getLatestCancelDate()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_LatestCancelDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginContactMechId <em>Origin Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginContactMechId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_OriginContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginFacilityId <em>Origin Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Facility Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginFacilityId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_OriginFacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Telecom Number Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getOriginTelecomNumberId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_OriginTelecomNumberId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdFrom <em>Party Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id From</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdFrom()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_PartyIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdTo <em>Party Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id To</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getPartyIdTo()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_PartyIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPicklistBinId <em>Picklist Bin Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Picklist Bin Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getPicklistBinId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_PicklistBinId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryOrderId <em>Primary Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Order Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryOrderId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_PrimaryOrderId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryReturnId <em>Primary Return Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primary Return Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryReturnId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_PrimaryReturnId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryShipGroupSeqId <em>Primary Ship Group Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Ship Group Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getPrimaryShipGroupSeqId()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_PrimaryShipGroupSeqId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentAttributes <em>Shipment Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipment Attributes</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentAttributes()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_ShipmentAttributes();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentContactMechs <em>Shipment Contact Mechs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipment Contact Mechs</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentContactMechs()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_ShipmentContactMechs();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentItems <em>Shipment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipment Items</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentItems()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_ShipmentItems();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentPackages <em>Shipment Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipment Packages</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentPackages()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_ShipmentPackages();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentRouteSegments <em>Shipment Route Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipment Route Segments</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentRouteSegments()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_ShipmentRouteSegments();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentTypeId <em>Shipment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getShipmentTypeId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_ShipmentTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.Shipment#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment#getStatusId()
	 * @see #getShipment()
	 * @generated
	 */
	EReference getShipment_StatusId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute <em>Shipment Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Attribute</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute
	 * @generated
	 */
	EClass getShipmentAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getShipmentId()
	 * @see #getShipmentAttribute()
	 * @generated
	 */
	EReference getShipmentAttribute_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getAttrName()
	 * @see #getShipmentAttribute()
	 * @generated
	 */
	EAttribute getShipmentAttribute_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getAttrDescription <em>Attr Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getAttrDescription()
	 * @see #getShipmentAttribute()
	 * @generated
	 */
	EAttribute getShipmentAttribute_AttrDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getAttrValue <em>Attr Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Value</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentAttribute#getAttrValue()
	 * @see #getShipmentAttribute()
	 * @generated
	 */
	EAttribute getShipmentAttribute_AttrValue();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType <em>Shipment Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Box Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType
	 * @generated
	 */
	EClass getShipmentBoxType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Box Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getShipmentBoxTypeId()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EAttribute getShipmentBoxType_ShipmentBoxTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxHeight <em>Box Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Height</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxHeight()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EAttribute getShipmentBoxType_BoxHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxLength <em>Box Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Length</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxLength()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EAttribute getShipmentBoxType_BoxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWeight <em>Box Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Weight</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWeight()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EAttribute getShipmentBoxType_BoxWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWidth <em>Box Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Width</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getBoxWidth()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EAttribute getShipmentBoxType_BoxWidth();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getCarrierShipmentBoxTypes <em>Carrier Shipment Box Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Carrier Shipment Box Types</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getCarrierShipmentBoxTypes()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EReference getShipmentBoxType_CarrierShipmentBoxTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDescription()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EAttribute getShipmentBoxType_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDimensionUomId <em>Dimension Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getDimensionUomId()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EReference getShipmentBoxType_DimensionUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getWeightUomId <em>Weight Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weight Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentBoxType#getWeightUomId()
	 * @see #getShipmentBoxType()
	 * @generated
	 */
	EReference getShipmentBoxType_WeightUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech <em>Shipment Contact Mech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Contact Mech</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech
	 * @generated
	 */
	EClass getShipmentContactMech();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentId()
	 * @see #getShipmentContactMech()
	 * @generated
	 */
	EReference getShipmentContactMech_ShipmentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentContactMechTypeId <em>Shipment Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getShipmentContactMechTypeId()
	 * @see #getShipmentContactMech()
	 * @generated
	 */
	EReference getShipmentContactMech_ShipmentContactMechTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getContactMechId <em>Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentContactMech#getContactMechId()
	 * @see #getShipmentContactMech()
	 * @generated
	 */
	EReference getShipmentContactMech_ContactMechId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType <em>Shipment Contact Mech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Contact Mech Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType
	 * @generated
	 */
	EClass getShipmentContactMechType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType#getShipmentContactMechTypeId <em>Shipment Contact Mech Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Contact Mech Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType#getShipmentContactMechTypeId()
	 * @see #getShipmentContactMechType()
	 * @generated
	 */
	EAttribute getShipmentContactMechType_ShipmentContactMechTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentContactMechType#getDescription()
	 * @see #getShipmentContactMechType()
	 * @generated
	 */
	EAttribute getShipmentContactMechType_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate <em>Shipment Cost Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Cost Estimate</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate
	 * @generated
	 */
	EClass getShipmentCostEstimate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentCostEstimateId <em>Shipment Cost Estimate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Cost Estimate Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentCostEstimateId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_ShipmentCostEstimateId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierPartyId <em>Carrier Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierPartyId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_CarrierPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierRoleTypeId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_CarrierRoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePercent <em>Feature Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Percent</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePercent()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_FeaturePercent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePrice <em>Feature Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Price</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePrice()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_FeaturePrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdFrom <em>Geo Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id From</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdFrom()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_GeoIdFrom();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdTo <em>Geo Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id To</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdTo()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_GeoIdTo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderFlatPrice <em>Order Flat Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Flat Price</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderFlatPrice()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_OrderFlatPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderItemFlatPrice <em>Order Item Flat Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Item Flat Price</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderItemFlatPrice()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_OrderItemFlatPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderPricePercent <em>Order Price Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Price Percent</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderPricePercent()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_OrderPricePercent();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizePrice <em>Oversize Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oversize Price</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizePrice()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_OversizePrice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizeUnit <em>Oversize Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oversize Unit</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizeUnit()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_OversizeUnit();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPartyId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_PartyId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceBreakId <em>Price Break Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price Break Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceBreakId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_PriceBreakId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUnitPrice <em>Price Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Unit Price</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUnitPrice()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_PriceUnitPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUomId <em>Price Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Price Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUomId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_PriceUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductFeatureGroupId <em>Product Feature Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Feature Group Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductFeatureGroupId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_ProductFeatureGroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreId <em>Product Store Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Store Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_ProductStoreId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Store Ship Meth Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreShipMethId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_ProductStoreShipMethId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityBreakId <em>Quantity Break Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Break Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityBreakId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_QuantityBreakId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUnitPrice <em>Quantity Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity Unit Price</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUnitPrice()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_QuantityUnitPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUomId <em>Quantity Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUomId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_QuantityUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getRoleTypeId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_RoleTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentMethodTypeId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShippingPricePercent <em>Shipping Price Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipping Price Percent</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShippingPricePercent()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_ShippingPricePercent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightBreakId <em>Weight Break Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weight Break Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightBreakId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_WeightBreakId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUnitPrice <em>Weight Unit Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight Unit Price</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUnitPrice()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EAttribute getShipmentCostEstimate_WeightUnitPrice();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUomId <em>Weight Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weight Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUomId()
	 * @see #getShipmentCostEstimate()
	 * @generated
	 */
	EReference getShipmentCostEstimate_WeightUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig <em>Shipment Gateway Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Gateway Config</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig
	 * @generated
	 */
	EClass getShipmentGatewayConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfigId <em>Shipment Gateway Config Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Gateway Config Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfigId()
	 * @see #getShipmentGatewayConfig()
	 * @generated
	 */
	EAttribute getShipmentGatewayConfig_ShipmentGatewayConfigId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getDescription()
	 * @see #getShipmentGatewayConfig()
	 * @generated
	 */
	EAttribute getShipmentGatewayConfig_Description();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Gateway Conf Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig#getShipmentGatewayConfTypeId()
	 * @see #getShipmentGatewayConfig()
	 * @generated
	 */
	EReference getShipmentGatewayConfig_ShipmentGatewayConfTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType <em>Shipment Gateway Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Gateway Config Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType
	 * @generated
	 */
	EClass getShipmentGatewayConfigType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getShipmentGatewayConfTypeId <em>Shipment Gateway Conf Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Gateway Conf Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getShipmentGatewayConfTypeId()
	 * @see #getShipmentGatewayConfigType()
	 * @generated
	 */
	EAttribute getShipmentGatewayConfigType_ShipmentGatewayConfTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getDescription()
	 * @see #getShipmentGatewayConfigType()
	 * @generated
	 */
	EAttribute getShipmentGatewayConfigType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#isHasTable()
	 * @see #getShipmentGatewayConfigType()
	 * @generated
	 */
	EAttribute getShipmentGatewayConfigType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfigType#getParentTypeId()
	 * @see #getShipmentGatewayConfigType()
	 * @generated
	 */
	EReference getShipmentGatewayConfigType_ParentTypeId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl <em>Shipment Gateway Dhl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Gateway Dhl</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl
	 * @generated
	 */
	EClass getShipmentGatewayDhl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessAccountNbr <em>Access Account Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Account Nbr</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessAccountNbr()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_AccessAccountNbr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessPassword <em>Access Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Password</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessPassword()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_AccessPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessShippingKey <em>Access Shipping Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Shipping Key</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessShippingKey()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_AccessShippingKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessUserId <em>Access User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access User Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessUserId()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_AccessUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectTimeout <em>Connect Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Timeout</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectTimeout()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_ConnectTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectUrl <em>Connect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Url</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectUrl()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_ConnectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadAction <em>Head Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head Action</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadAction()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_HeadAction();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadVersion <em>Head Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head Version</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadVersion()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_HeadVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getLabelImageFormat <em>Label Image Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Image Format</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getLabelImageFormat()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_LabelImageFormat();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getRateEstimateTemplate <em>Rate Estimate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Estimate Template</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getRateEstimateTemplate()
	 * @see #getShipmentGatewayDhl()
	 * @generated
	 */
	EAttribute getShipmentGatewayDhl_RateEstimateTemplate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex <em>Shipment Gateway Fedex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Gateway Fedex</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex
	 * @generated
	 */
	EClass getShipmentGatewayFedex();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessAccountNbr <em>Access Account Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Account Nbr</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessAccountNbr()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_AccessAccountNbr();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessMeterNumber <em>Access Meter Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Meter Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessMeterNumber()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_AccessMeterNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserKey <em>Access User Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access User Key</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserKey()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_AccessUserKey();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserPwd <em>Access User Pwd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access User Pwd</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserPwd()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_AccessUserPwd();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectSoapUrl <em>Connect Soap Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Soap Url</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectSoapUrl()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_ConnectSoapUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectTimeout <em>Connect Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Timeout</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectTimeout()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_ConnectTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectUrl <em>Connect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Url</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectUrl()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_ConnectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultDropoffType <em>Default Dropoff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Dropoff Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultDropoffType()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_DefaultDropoffType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultPackagingType <em>Default Packaging Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Packaging Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultPackagingType()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_DefaultPackagingType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getLabelImageType <em>Label Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Image Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getLabelImageType()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_LabelImageType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getRateEstimateTemplate <em>Rate Estimate Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate Estimate Template</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getRateEstimateTemplate()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_RateEstimateTemplate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateShipment <em>Template Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Shipment</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateShipment()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_TemplateShipment();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateSubscription <em>Template Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Subscription</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateSubscription()
	 * @see #getShipmentGatewayFedex()
	 * @generated
	 */
	EAttribute getShipmentGatewayFedex_TemplateSubscription();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps <em>Shipment Gateway Ups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Gateway Ups</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps
	 * @generated
	 */
	EClass getShipmentGatewayUps();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessLicenseNumber <em>Access License Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access License Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessLicenseNumber()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_AccessLicenseNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessPassword <em>Access Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Password</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessPassword()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_AccessPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessUserId <em>Access User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access User Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessUserId()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_AccessUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getBillShipperAccountNumber <em>Bill Shipper Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill Shipper Account Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getBillShipperAccountNumber()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_BillShipperAccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodAllowCod <em>Cod Allow Cod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Allow Cod</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodAllowCod()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_CodAllowCod();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodFundsCode <em>Cod Funds Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Funds Code</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodFundsCode()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_CodFundsCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeAmount <em>Cod Surcharge Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Surcharge Amount</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeAmount()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_CodSurchargeAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeApplyToPackage <em>Cod Surcharge Apply To Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Surcharge Apply To Package</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeApplyToPackage()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_CodSurchargeApplyToPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeCurrencyUomId <em>Cod Surcharge Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Surcharge Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeCurrencyUomId()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_CodSurchargeCurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectTimeout <em>Connect Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Timeout</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectTimeout()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_ConnectTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectUrl <em>Connect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Url</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectUrl()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_ConnectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCustomerClassification <em>Customer Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer Classification</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCustomerClassification()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_CustomerClassification();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelMemo <em>Default Return Label Memo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Return Label Memo</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelMemo()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_DefaultReturnLabelMemo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelSubject <em>Default Return Label Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Return Label Subject</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelSubject()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_DefaultReturnLabelSubject();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMaxEstimateWeight <em>Max Estimate Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Estimate Weight</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMaxEstimateWeight()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_MaxEstimateWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMinEstimateWeight <em>Min Estimate Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Estimate Weight</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMinEstimateWeight()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_MinEstimateWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertInfo <em>Save Cert Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Cert Info</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertInfo()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_SaveCertInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertPath <em>Save Cert Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Cert Path</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertPath()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_SaveCertPath();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperNumber <em>Shipper Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipper Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperNumber()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_ShipperNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperPickupType <em>Shipper Pickup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipper Pickup Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperPickupType()
	 * @see #getShipmentGatewayUps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUps_ShipperPickupType();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps <em>Shipment Gateway Usps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Gateway Usps</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps
	 * @generated
	 */
	EClass getShipmentGatewayUsps();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getAccessPassword <em>Access Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Password</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getAccessPassword()
	 * @see #getShipmentGatewayUsps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUsps_AccessPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getAccessUserId <em>Access User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access User Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getAccessUserId()
	 * @see #getShipmentGatewayUsps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUsps_AccessUserId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getConnectTimeout <em>Connect Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Timeout</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getConnectTimeout()
	 * @see #getShipmentGatewayUsps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUsps_ConnectTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getConnectUrl <em>Connect Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Url</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getConnectUrl()
	 * @see #getShipmentGatewayUsps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUsps_ConnectUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getConnectUrlLabels <em>Connect Url Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connect Url Labels</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getConnectUrlLabels()
	 * @see #getShipmentGatewayUsps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUsps_ConnectUrlLabels();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getMaxEstimateWeight <em>Max Estimate Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Estimate Weight</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getMaxEstimateWeight()
	 * @see #getShipmentGatewayUsps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUsps_MaxEstimateWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps#getTest()
	 * @see #getShipmentGatewayUsps()
	 * @generated
	 */
	EAttribute getShipmentGatewayUsps_Test();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItem <em>Shipment Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Item</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItem
	 * @generated
	 */
	EClass getShipmentItem();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getShipmentId()
	 * @see #getShipmentItem()
	 * @generated
	 */
	EReference getShipmentItem_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getShipmentItemSeqId()
	 * @see #getShipmentItem()
	 * @generated
	 */
	EAttribute getShipmentItem_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getProductId <em>Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getProductId()
	 * @see #getShipmentItem()
	 * @generated
	 */
	EReference getShipmentItem_ProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getQuantity()
	 * @see #getShipmentItem()
	 * @generated
	 */
	EAttribute getShipmentItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getShipmentContentDescription <em>Shipment Content Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Content Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItem#getShipmentContentDescription()
	 * @see #getShipmentItem()
	 * @generated
	 */
	EAttribute getShipmentItem_ShipmentContentDescription();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling <em>Shipment Item Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Item Billing</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling
	 * @generated
	 */
	EClass getShipmentItemBilling();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getShipmentId()
	 * @see #getShipmentItemBilling()
	 * @generated
	 */
	EReference getShipmentItemBilling_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getShipmentItemSeqId()
	 * @see #getShipmentItemBilling()
	 * @generated
	 */
	EAttribute getShipmentItemBilling_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getInvoiceId <em>Invoice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoice Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getInvoiceId()
	 * @see #getShipmentItemBilling()
	 * @generated
	 */
	EReference getShipmentItemBilling_InvoiceId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getInvoiceItemSeqId <em>Invoice Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemBilling#getInvoiceItemSeqId()
	 * @see #getShipmentItemBilling()
	 * @generated
	 */
	EAttribute getShipmentItemBilling_InvoiceItemSeqId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature <em>Shipment Item Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Item Feature</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature
	 * @generated
	 */
	EClass getShipmentItemFeature();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature#getShipmentId()
	 * @see #getShipmentItemFeature()
	 * @generated
	 */
	EReference getShipmentItemFeature_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature#getShipmentItemSeqId()
	 * @see #getShipmentItemFeature()
	 * @generated
	 */
	EAttribute getShipmentItemFeature_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature#getProductFeatureId <em>Product Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Feature Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentItemFeature#getProductFeatureId()
	 * @see #getShipmentItemFeature()
	 * @generated
	 */
	EReference getShipmentItemFeature_ProductFeatureId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType <em>Shipment Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Method Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType
	 * @generated
	 */
	EClass getShipmentMethodType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType#getShipmentMethodTypeId()
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	EAttribute getShipmentMethodType_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType#getDescription()
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	EAttribute getShipmentMethodType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType#getSequenceNum <em>Sequence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType#getSequenceNum()
	 * @see #getShipmentMethodType()
	 * @generated
	 */
	EAttribute getShipmentMethodType_SequenceNum();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage <em>Shipment Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Package</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage
	 * @generated
	 */
	EClass getShipmentPackage();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentId()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EReference getShipmentPackage_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Package Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentPackageSeqId()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EAttribute getShipmentPackage_ShipmentPackageSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxHeight <em>Box Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Height</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxHeight()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EAttribute getShipmentPackage_BoxHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxLength <em>Box Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Length</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxLength()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EAttribute getShipmentPackage_BoxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxWidth <em>Box Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Width</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getBoxWidth()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EAttribute getShipmentPackage_BoxWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDateCreated()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EAttribute getShipmentPackage_DateCreated();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDimensionUomId <em>Dimension Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getDimensionUomId()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EReference getShipmentPackage_DimensionUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getInsuredValue <em>Insured Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insured Value</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getInsuredValue()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EAttribute getShipmentPackage_InsuredValue();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentBoxTypeId <em>Shipment Box Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Box Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getShipmentBoxTypeId()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EReference getShipmentPackage_ShipmentBoxTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeight()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EAttribute getShipmentPackage_Weight();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeightUomId <em>Weight Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Weight Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackage#getWeightUomId()
	 * @see #getShipmentPackage()
	 * @generated
	 */
	EReference getShipmentPackage_WeightUomId();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent <em>Shipment Package Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Package Content</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent
	 * @generated
	 */
	EClass getShipmentPackageContent();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getShipmentId()
	 * @see #getShipmentPackageContent()
	 * @generated
	 */
	EReference getShipmentPackageContent_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Package Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getShipmentPackageSeqId()
	 * @see #getShipmentPackageContent()
	 * @generated
	 */
	EAttribute getShipmentPackageContent_ShipmentPackageSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getShipmentItemSeqId()
	 * @see #getShipmentPackageContent()
	 * @generated
	 */
	EAttribute getShipmentPackageContent_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getQuantity()
	 * @see #getShipmentPackageContent()
	 * @generated
	 */
	EAttribute getShipmentPackageContent_Quantity();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getSubProductId <em>Sub Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Product Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getSubProductId()
	 * @see #getShipmentPackageContent()
	 * @generated
	 */
	EReference getShipmentPackageContent_SubProductId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getSubProductQuantity <em>Sub Product Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Product Quantity</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageContent#getSubProductQuantity()
	 * @see #getShipmentPackageContent()
	 * @generated
	 */
	EAttribute getShipmentPackageContent_SubProductQuantity();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg <em>Shipment Package Route Seg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Package Route Seg</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg
	 * @generated
	 */
	EClass getShipmentPackageRouteSeg();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentId()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EReference getShipmentPackageRouteSeg_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Package Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentPackageSeqId()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_ShipmentPackageSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Route Segment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getShipmentRouteSegmentId()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_ShipmentRouteSegmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getBoxNumber <em>Box Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Box Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getBoxNumber()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_BoxNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCodAmount <em>Cod Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Amount</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCodAmount()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_CodAmount();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getCurrencyUomId()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EReference getShipmentPackageRouteSeg_CurrencyUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInsuredAmount <em>Insured Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insured Amount</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInsuredAmount()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_InsuredAmount();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInternationalInvoice <em>International Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>International Invoice</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getInternationalInvoice()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_InternationalInvoice();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelHtml <em>Label Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Html</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelHtml()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_LabelHtml();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelImage <em>Label Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Image</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelImage()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_LabelImage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelIntlSignImage <em>Label Intl Sign Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Intl Sign Image</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getLabelIntlSignImage()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_LabelIntlSignImage();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#isLabelPrinted <em>Label Printed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Printed</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#isLabelPrinted()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_LabelPrinted();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageOtherCost <em>Package Other Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Other Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageOtherCost()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_PackageOtherCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageServiceCost <em>Package Service Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Service Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageServiceCost()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_PackageServiceCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageTransportCost <em>Package Transport Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Transport Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getPackageTransportCost()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_PackageTransportCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getTrackingCode <em>Tracking Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Code</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentPackageRouteSeg#getTrackingCode()
	 * @see #getShipmentPackageRouteSeg()
	 * @generated
	 */
	EAttribute getShipmentPackageRouteSeg_TrackingCode();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment <em>Shipment Route Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Route Segment</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment
	 * @generated
	 */
	EClass getShipmentRouteSegment();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentRouteSegmentId <em>Shipment Route Segment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Route Segment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentRouteSegmentId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ShipmentRouteSegmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualArrivalDate <em>Actual Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Arrival Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualArrivalDate()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ActualArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualCost <em>Actual Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualCost()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ActualCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualOtherCost <em>Actual Other Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Other Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualOtherCost()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ActualOtherCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualServiceCost <em>Actual Service Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Service Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualServiceCost()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ActualServiceCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualStartDate <em>Actual Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Start Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualStartDate()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ActualStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualTransportCost <em>Actual Transport Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Transport Cost</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getActualTransportCost()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ActualTransportCost();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeight <em>Billing Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Billing Weight</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeight()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_BillingWeight();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeightUomId <em>Billing Weight Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Billing Weight Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getBillingWeightUomId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_BillingWeightUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierDeliveryZone <em>Carrier Delivery Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Delivery Zone</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierDeliveryZone()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_CarrierDeliveryZone();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierPartyId <em>Carrier Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierPartyId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_CarrierPartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionCodes <em>Carrier Restriction Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Restriction Codes</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionCodes()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_CarrierRestrictionCodes();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionDesc <em>Carrier Restriction Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carrier Restriction Desc</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierRestrictionDesc()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_CarrierRestrictionDesc();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierServiceStatusId <em>Carrier Service Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Carrier Service Status Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCarrierServiceStatusId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_CarrierServiceStatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCurrencyUomId <em>Currency Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Currency Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getCurrencyUomId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_CurrencyUomId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDeliveryId <em>Delivery Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delivery Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDeliveryId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_DeliveryId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestContactMechId <em>Dest Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestContactMechId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_DestContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestFacilityId <em>Dest Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest Facility Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestFacilityId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_DestFacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestTelecomNumberId <em>Dest Telecom Number Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest Telecom Number Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getDestTelecomNumberId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_DestTelecomNumberId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedArrivalDate <em>Estimated Arrival Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Arrival Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedArrivalDate()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_EstimatedArrivalDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedStartDate <em>Estimated Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Start Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getEstimatedStartDate()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_EstimatedStartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryDate <em>Home Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Delivery Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryDate()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_HomeDeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryType <em>Home Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Delivery Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getHomeDeliveryType()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_HomeDeliveryType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getLastUpdatedDate <em>Last Updated Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getLastUpdatedDate()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_LastUpdatedDate();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginContactMechId <em>Origin Contact Mech Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Contact Mech Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginContactMechId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_OriginContactMechId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginFacilityId <em>Origin Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Facility Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginFacilityId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_OriginFacilityId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginTelecomNumberId <em>Origin Telecom Number Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin Telecom Number Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getOriginTelecomNumberId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_OriginTelecomNumberId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getShipmentMethodTypeId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EReference getShipmentRouteSegment_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyAccountNumber <em>Third Party Account Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Party Account Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyAccountNumber()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ThirdPartyAccountNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyCountryGeoCode <em>Third Party Country Geo Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Party Country Geo Code</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyCountryGeoCode()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ThirdPartyCountryGeoCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyPostalCode <em>Third Party Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Third Party Postal Code</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getThirdPartyPostalCode()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_ThirdPartyPostalCode();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingDigest <em>Tracking Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Digest</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingDigest()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_TrackingDigest();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingIdNumber <em>Tracking Id Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracking Id Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getTrackingIdNumber()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_TrackingIdNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpdatedByUserLoginId <em>Updated By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpdatedByUserLoginId()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_UpdatedByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpsHighValueReport <em>Ups High Value Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ups High Value Report</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentRouteSegment#getUpsHighValueReport()
	 * @see #getShipmentRouteSegment()
	 * @generated
	 */
	EAttribute getShipmentRouteSegment_UpsHighValueReport();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentStatus <em>Shipment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Status</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentStatus
	 * @generated
	 */
	EClass getShipmentStatus();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getStatusId <em>Status Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getStatusId()
	 * @see #getShipmentStatus()
	 * @generated
	 */
	EReference getShipmentStatus_StatusId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getShipmentId()
	 * @see #getShipmentStatus()
	 * @generated
	 */
	EReference getShipmentStatus_ShipmentId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getChangeByUserLoginId <em>Change By User Login Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change By User Login Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getChangeByUserLoginId()
	 * @see #getShipmentStatus()
	 * @generated
	 */
	EReference getShipmentStatus_ChangeByUserLoginId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getStatusDate <em>Status Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentStatus#getStatusDate()
	 * @see #getShipmentStatus()
	 * @generated
	 */
	EAttribute getShipmentStatus_StatusDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate <em>Shipment Time Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Time Estimate</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate
	 * @generated
	 */
	EClass getShipmentTimeEstimate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Method Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getShipmentMethodTypeId()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EAttribute getShipmentTimeEstimate_ShipmentMethodTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getPartyId <em>Party Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Party Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getPartyId()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EAttribute getShipmentTimeEstimate_PartyId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getRoleTypeId <em>Role Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getRoleTypeId()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EAttribute getShipmentTimeEstimate_RoleTypeId();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getGeoIdTo <em>Geo Id To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id To</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getGeoIdTo()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EReference getShipmentTimeEstimate_GeoIdTo();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getGeoIdFrom <em>Geo Id From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Geo Id From</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getGeoIdFrom()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EReference getShipmentTimeEstimate_GeoIdFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getFromDate()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EAttribute getShipmentTimeEstimate_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getLeadTime <em>Lead Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lead Time</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getLeadTime()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EAttribute getShipmentTimeEstimate_LeadTime();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getLeadTimeUomId <em>Lead Time Uom Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lead Time Uom Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getLeadTimeUomId()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EReference getShipmentTimeEstimate_LeadTimeUomId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getSequenceNumber <em>Sequence Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Number</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getSequenceNumber()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EAttribute getShipmentTimeEstimate_SequenceNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getThruDate <em>Thru Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thru Date</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTimeEstimate#getThruDate()
	 * @see #getShipmentTimeEstimate()
	 * @generated
	 */
	EAttribute getShipmentTimeEstimate_ThruDate();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentType <em>Shipment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Type</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentType
	 * @generated
	 */
	EClass getShipmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentType#getShipmentTypeId <em>Shipment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentType#getShipmentTypeId()
	 * @see #getShipmentType()
	 * @generated
	 */
	EAttribute getShipmentType_ShipmentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentType#getDescription()
	 * @see #getShipmentType()
	 * @generated
	 */
	EAttribute getShipmentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentType#isHasTable <em>Has Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Table</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentType#isHasTable()
	 * @see #getShipmentType()
	 * @generated
	 */
	EAttribute getShipmentType_HasTable();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentType#getParentTypeId <em>Parent Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentType#getParentTypeId()
	 * @see #getShipmentType()
	 * @generated
	 */
	EReference getShipmentType_ParentTypeId();

	/**
	 * Returns the meta object for the reference list '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentType#getShipmentTypeAttrs <em>Shipment Type Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shipment Type Attrs</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentType#getShipmentTypeAttrs()
	 * @see #getShipmentType()
	 * @generated
	 */
	EReference getShipmentType_ShipmentTypeAttrs();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr <em>Shipment Type Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment Type Attr</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr
	 * @generated
	 */
	EClass getShipmentTypeAttr();

	/**
	 * Returns the meta object for the reference '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr#getShipmentTypeId <em>Shipment Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipment Type Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr#getShipmentTypeId()
	 * @see #getShipmentTypeAttr()
	 * @generated
	 */
	EReference getShipmentTypeAttr_ShipmentTypeId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr#getAttrName()
	 * @see #getShipmentTypeAttr()
	 * @generated
	 */
	EAttribute getShipmentTypeAttr_AttrName();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShipmentTypeAttr#getDescription()
	 * @see #getShipmentTypeAttr()
	 * @generated
	 */
	EAttribute getShipmentTypeAttr_Description();

	/**
	 * Returns the meta object for class '{@link org.abchip.mimo.biz.shipment.shipment.ShippingDocument <em>Shipping Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipping Document</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShippingDocument
	 * @generated
	 */
	EClass getShippingDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getDescription()
	 * @see #getShippingDocument()
	 * @generated
	 */
	EAttribute getShippingDocument_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getShipmentId <em>Shipment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getShipmentId()
	 * @see #getShippingDocument()
	 * @generated
	 */
	EAttribute getShippingDocument_ShipmentId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getShipmentItemSeqId <em>Shipment Item Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Item Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getShipmentItemSeqId()
	 * @see #getShippingDocument()
	 * @generated
	 */
	EAttribute getShippingDocument_ShipmentItemSeqId();

	/**
	 * Returns the meta object for the attribute '{@link org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getShipmentPackageSeqId <em>Shipment Package Seq Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shipment Package Seq Id</em>'.
	 * @see org.abchip.mimo.biz.shipment.shipment.ShippingDocument#getShipmentPackageSeqId()
	 * @see #getShippingDocument()
	 * @generated
	 */
	EAttribute getShippingDocument_ShipmentPackageSeqId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Shipment_Factory getShipment_Factory();

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
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl <em>Carrier Shipment Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentBoxTypeImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getCarrierShipmentBoxType()
		 * @generated
		 */
		EClass CARRIER_SHIPMENT_BOX_TYPE = eINSTANCE.getCarrierShipmentBoxType();

		/**
		 * The meta object literal for the '<em><b>Shipment Box Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID = eINSTANCE.getCarrierShipmentBoxType_ShipmentBoxTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_BOX_TYPE__PARTY_ID = eINSTANCE.getCarrierShipmentBoxType_PartyId();

		/**
		 * The meta object literal for the '<em><b>Oversize Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_BOX_TYPE__OVERSIZE_CODE = eINSTANCE.getCarrierShipmentBoxType_OversizeCode();

		/**
		 * The meta object literal for the '<em><b>Packaging Type Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_BOX_TYPE__PACKAGING_TYPE_CODE = eINSTANCE.getCarrierShipmentBoxType_PackagingTypeCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl <em>Carrier Shipment Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.CarrierShipmentMethodImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getCarrierShipmentMethod()
		 * @generated
		 */
		EClass CARRIER_SHIPMENT_METHOD = eINSTANCE.getCarrierShipmentMethod();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_METHOD__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getCarrierShipmentMethod_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARRIER_SHIPMENT_METHOD__PARTY_ID = eINSTANCE.getCarrierShipmentMethod_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_METHOD__ROLE_TYPE_ID = eINSTANCE.getCarrierShipmentMethod_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Carrier Service Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_METHOD__CARRIER_SERVICE_CODE = eINSTANCE.getCarrierShipmentMethod_CarrierServiceCode();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARRIER_SHIPMENT_METHOD__SEQUENCE_NUMBER = eINSTANCE.getCarrierShipmentMethod_SequenceNumber();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl <em>Delivery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.DeliveryImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getDelivery()
		 * @generated
		 */
		EClass DELIVERY = eINSTANCE.getDelivery();

		/**
		 * The meta object literal for the '<em><b>Delivery Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__DELIVERY_ID = eINSTANCE.getDelivery_DeliveryId();

		/**
		 * The meta object literal for the '<em><b>Actual Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ACTUAL_ARRIVAL_DATE = eINSTANCE.getDelivery_ActualArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Actual Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ACTUAL_START_DATE = eINSTANCE.getDelivery_ActualStartDate();

		/**
		 * The meta object literal for the '<em><b>Dest Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY__DEST_FACILITY_ID = eINSTANCE.getDelivery_DestFacilityId();

		/**
		 * The meta object literal for the '<em><b>End Mileage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__END_MILEAGE = eINSTANCE.getDelivery_EndMileage();

		/**
		 * The meta object literal for the '<em><b>Estimated Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ESTIMATED_ARRIVAL_DATE = eINSTANCE.getDelivery_EstimatedArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__ESTIMATED_START_DATE = eINSTANCE.getDelivery_EstimatedStartDate();

		/**
		 * The meta object literal for the '<em><b>Fixed Asset Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY__FIXED_ASSET_ID = eINSTANCE.getDelivery_FixedAssetId();

		/**
		 * The meta object literal for the '<em><b>Fuel Used</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__FUEL_USED = eINSTANCE.getDelivery_FuelUsed();

		/**
		 * The meta object literal for the '<em><b>Origin Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERY__ORIGIN_FACILITY_ID = eINSTANCE.getDelivery_OriginFacilityId();

		/**
		 * The meta object literal for the '<em><b>Start Mileage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY__START_MILEAGE = eINSTANCE.getDelivery_StartMileage();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl <em>Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipment()
		 * @generated
		 */
		EClass SHIPMENT = eINSTANCE.getShipment();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__SHIPMENT_ID = eINSTANCE.getShipment_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Additional Shipping Charge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ADDITIONAL_SHIPPING_CHARGE = eINSTANCE.getShipment_AdditionalShippingCharge();

		/**
		 * The meta object literal for the '<em><b>Addtl Shipping Charge Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ADDTL_SHIPPING_CHARGE_DESC = eINSTANCE.getShipment_AddtlShippingChargeDesc();

		/**
		 * The meta object literal for the '<em><b>Created By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__CREATED_BY_USER_LOGIN = eINSTANCE.getShipment_CreatedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__CREATED_DATE = eINSTANCE.getShipment_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__CURRENCY_UOM_ID = eINSTANCE.getShipment_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Destination Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__DESTINATION_CONTACT_MECH_ID = eINSTANCE.getShipment_DestinationContactMechId();

		/**
		 * The meta object literal for the '<em><b>Destination Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__DESTINATION_FACILITY_ID = eINSTANCE.getShipment_DestinationFacilityId();

		/**
		 * The meta object literal for the '<em><b>Destination Telecom Number Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__DESTINATION_TELECOM_NUMBER_ID = eINSTANCE.getShipment_DestinationTelecomNumberId();

		/**
		 * The meta object literal for the '<em><b>Estimated Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ESTIMATED_ARRIVAL_DATE = eINSTANCE.getShipment_EstimatedArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Arrival Work Eff Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__ESTIMATED_ARRIVAL_WORK_EFF_ID = eINSTANCE.getShipment_EstimatedArrivalWorkEffId();

		/**
		 * The meta object literal for the '<em><b>Estimated Ready Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ESTIMATED_READY_DATE = eINSTANCE.getShipment_EstimatedReadyDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Ship Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ESTIMATED_SHIP_COST = eINSTANCE.getShipment_EstimatedShipCost();

		/**
		 * The meta object literal for the '<em><b>Estimated Ship Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ESTIMATED_SHIP_DATE = eINSTANCE.getShipment_EstimatedShipDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Ship Work Eff Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__ESTIMATED_SHIP_WORK_EFF_ID = eINSTANCE.getShipment_EstimatedShipWorkEffId();

		/**
		 * The meta object literal for the '<em><b>Handling Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__HANDLING_INSTRUCTIONS = eINSTANCE.getShipment_HandlingInstructions();

		/**
		 * The meta object literal for the '<em><b>Last Modified By User Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__LAST_MODIFIED_BY_USER_LOGIN = eINSTANCE.getShipment_LastModifiedByUserLogin();

		/**
		 * The meta object literal for the '<em><b>Last Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__LAST_MODIFIED_DATE = eINSTANCE.getShipment_LastModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Latest Cancel Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__LATEST_CANCEL_DATE = eINSTANCE.getShipment_LatestCancelDate();

		/**
		 * The meta object literal for the '<em><b>Origin Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__ORIGIN_CONTACT_MECH_ID = eINSTANCE.getShipment_OriginContactMechId();

		/**
		 * The meta object literal for the '<em><b>Origin Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__ORIGIN_FACILITY_ID = eINSTANCE.getShipment_OriginFacilityId();

		/**
		 * The meta object literal for the '<em><b>Origin Telecom Number Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__ORIGIN_TELECOM_NUMBER_ID = eINSTANCE.getShipment_OriginTelecomNumberId();

		/**
		 * The meta object literal for the '<em><b>Party Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__PARTY_ID_FROM = eINSTANCE.getShipment_PartyIdFrom();

		/**
		 * The meta object literal for the '<em><b>Party Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__PARTY_ID_TO = eINSTANCE.getShipment_PartyIdTo();

		/**
		 * The meta object literal for the '<em><b>Picklist Bin Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__PICKLIST_BIN_ID = eINSTANCE.getShipment_PicklistBinId();

		/**
		 * The meta object literal for the '<em><b>Primary Order Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__PRIMARY_ORDER_ID = eINSTANCE.getShipment_PrimaryOrderId();

		/**
		 * The meta object literal for the '<em><b>Primary Return Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__PRIMARY_RETURN_ID = eINSTANCE.getShipment_PrimaryReturnId();

		/**
		 * The meta object literal for the '<em><b>Primary Ship Group Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__PRIMARY_SHIP_GROUP_SEQ_ID = eINSTANCE.getShipment_PrimaryShipGroupSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__SHIPMENT_ATTRIBUTES = eINSTANCE.getShipment_ShipmentAttributes();

		/**
		 * The meta object literal for the '<em><b>Shipment Contact Mechs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__SHIPMENT_CONTACT_MECHS = eINSTANCE.getShipment_ShipmentContactMechs();

		/**
		 * The meta object literal for the '<em><b>Shipment Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__SHIPMENT_ITEMS = eINSTANCE.getShipment_ShipmentItems();

		/**
		 * The meta object literal for the '<em><b>Shipment Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__SHIPMENT_PACKAGES = eINSTANCE.getShipment_ShipmentPackages();

		/**
		 * The meta object literal for the '<em><b>Shipment Route Segments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__SHIPMENT_ROUTE_SEGMENTS = eINSTANCE.getShipment_ShipmentRouteSegments();

		/**
		 * The meta object literal for the '<em><b>Shipment Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__SHIPMENT_TYPE_ID = eINSTANCE.getShipment_ShipmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT__STATUS_ID = eINSTANCE.getShipment_StatusId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentAttributeImpl <em>Shipment Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentAttributeImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentAttribute()
		 * @generated
		 */
		EClass SHIPMENT_ATTRIBUTE = eINSTANCE.getShipmentAttribute();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ATTRIBUTE__SHIPMENT_ID = eINSTANCE.getShipmentAttribute_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ATTRIBUTE__ATTR_NAME = eINSTANCE.getShipmentAttribute_AttrName();

		/**
		 * The meta object literal for the '<em><b>Attr Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ATTRIBUTE__ATTR_DESCRIPTION = eINSTANCE.getShipmentAttribute_AttrDescription();

		/**
		 * The meta object literal for the '<em><b>Attr Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ATTRIBUTE__ATTR_VALUE = eINSTANCE.getShipmentAttribute_AttrValue();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl <em>Shipment Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentBoxTypeImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentBoxType()
		 * @generated
		 */
		EClass SHIPMENT_BOX_TYPE = eINSTANCE.getShipmentBoxType();

		/**
		 * The meta object literal for the '<em><b>Shipment Box Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_BOX_TYPE__SHIPMENT_BOX_TYPE_ID = eINSTANCE.getShipmentBoxType_ShipmentBoxTypeId();

		/**
		 * The meta object literal for the '<em><b>Box Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_BOX_TYPE__BOX_HEIGHT = eINSTANCE.getShipmentBoxType_BoxHeight();

		/**
		 * The meta object literal for the '<em><b>Box Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_BOX_TYPE__BOX_LENGTH = eINSTANCE.getShipmentBoxType_BoxLength();

		/**
		 * The meta object literal for the '<em><b>Box Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_BOX_TYPE__BOX_WEIGHT = eINSTANCE.getShipmentBoxType_BoxWeight();

		/**
		 * The meta object literal for the '<em><b>Box Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_BOX_TYPE__BOX_WIDTH = eINSTANCE.getShipmentBoxType_BoxWidth();

		/**
		 * The meta object literal for the '<em><b>Carrier Shipment Box Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_BOX_TYPE__CARRIER_SHIPMENT_BOX_TYPES = eINSTANCE.getShipmentBoxType_CarrierShipmentBoxTypes();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_BOX_TYPE__DESCRIPTION = eINSTANCE.getShipmentBoxType_Description();

		/**
		 * The meta object literal for the '<em><b>Dimension Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_BOX_TYPE__DIMENSION_UOM_ID = eINSTANCE.getShipmentBoxType_DimensionUomId();

		/**
		 * The meta object literal for the '<em><b>Weight Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_BOX_TYPE__WEIGHT_UOM_ID = eINSTANCE.getShipmentBoxType_WeightUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechImpl <em>Shipment Contact Mech</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentContactMech()
		 * @generated
		 */
		EClass SHIPMENT_CONTACT_MECH = eINSTANCE.getShipmentContactMech();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_CONTACT_MECH__SHIPMENT_ID = eINSTANCE.getShipmentContactMech_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Contact Mech Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_CONTACT_MECH__SHIPMENT_CONTACT_MECH_TYPE_ID = eINSTANCE.getShipmentContactMech_ShipmentContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_CONTACT_MECH__CONTACT_MECH_ID = eINSTANCE.getShipmentContactMech_ContactMechId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechTypeImpl <em>Shipment Contact Mech Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentContactMechTypeImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentContactMechType()
		 * @generated
		 */
		EClass SHIPMENT_CONTACT_MECH_TYPE = eINSTANCE.getShipmentContactMechType();

		/**
		 * The meta object literal for the '<em><b>Shipment Contact Mech Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_CONTACT_MECH_TYPE__SHIPMENT_CONTACT_MECH_TYPE_ID = eINSTANCE.getShipmentContactMechType_ShipmentContactMechTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_CONTACT_MECH_TYPE__DESCRIPTION = eINSTANCE.getShipmentContactMechType_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl <em>Shipment Cost Estimate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentCostEstimate()
		 * @generated
		 */
		EClass SHIPMENT_COST_ESTIMATE = eINSTANCE.getShipmentCostEstimate();

		/**
		 * The meta object literal for the '<em><b>Shipment Cost Estimate Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID = eINSTANCE.getShipmentCostEstimate_ShipmentCostEstimateId();

		/**
		 * The meta object literal for the '<em><b>Carrier Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID = eINSTANCE.getShipmentCostEstimate_CarrierPartyId();

		/**
		 * The meta object literal for the '<em><b>Carrier Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID = eINSTANCE.getShipmentCostEstimate_CarrierRoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Feature Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT = eINSTANCE.getShipmentCostEstimate_FeaturePercent();

		/**
		 * The meta object literal for the '<em><b>Feature Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__FEATURE_PRICE = eINSTANCE.getShipmentCostEstimate_FeaturePrice();

		/**
		 * The meta object literal for the '<em><b>Geo Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__GEO_ID_FROM = eINSTANCE.getShipmentCostEstimate_GeoIdFrom();

		/**
		 * The meta object literal for the '<em><b>Geo Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__GEO_ID_TO = eINSTANCE.getShipmentCostEstimate_GeoIdTo();

		/**
		 * The meta object literal for the '<em><b>Order Flat Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE = eINSTANCE.getShipmentCostEstimate_OrderFlatPrice();

		/**
		 * The meta object literal for the '<em><b>Order Item Flat Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE = eINSTANCE.getShipmentCostEstimate_OrderItemFlatPrice();

		/**
		 * The meta object literal for the '<em><b>Order Price Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT = eINSTANCE.getShipmentCostEstimate_OrderPricePercent();

		/**
		 * The meta object literal for the '<em><b>Oversize Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE = eINSTANCE.getShipmentCostEstimate_OversizePrice();

		/**
		 * The meta object literal for the '<em><b>Oversize Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT = eINSTANCE.getShipmentCostEstimate_OversizeUnit();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__PARTY_ID = eINSTANCE.getShipmentCostEstimate_PartyId();

		/**
		 * The meta object literal for the '<em><b>Price Break Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID = eINSTANCE.getShipmentCostEstimate_PriceBreakId();

		/**
		 * The meta object literal for the '<em><b>Price Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE = eINSTANCE.getShipmentCostEstimate_PriceUnitPrice();

		/**
		 * The meta object literal for the '<em><b>Price Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID = eINSTANCE.getShipmentCostEstimate_PriceUomId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID = eINSTANCE.getShipmentCostEstimate_ProductFeatureGroupId();

		/**
		 * The meta object literal for the '<em><b>Product Store Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID = eINSTANCE.getShipmentCostEstimate_ProductStoreId();

		/**
		 * The meta object literal for the '<em><b>Product Store Ship Meth Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID = eINSTANCE.getShipmentCostEstimate_ProductStoreShipMethId();

		/**
		 * The meta object literal for the '<em><b>Quantity Break Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID = eINSTANCE.getShipmentCostEstimate_QuantityBreakId();

		/**
		 * The meta object literal for the '<em><b>Quantity Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE = eINSTANCE.getShipmentCostEstimate_QuantityUnitPrice();

		/**
		 * The meta object literal for the '<em><b>Quantity Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID = eINSTANCE.getShipmentCostEstimate_QuantityUomId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID = eINSTANCE.getShipmentCostEstimate_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getShipmentCostEstimate_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Shipping Price Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT = eINSTANCE.getShipmentCostEstimate_ShippingPricePercent();

		/**
		 * The meta object literal for the '<em><b>Weight Break Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID = eINSTANCE.getShipmentCostEstimate_WeightBreakId();

		/**
		 * The meta object literal for the '<em><b>Weight Unit Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE = eINSTANCE.getShipmentCostEstimate_WeightUnitPrice();

		/**
		 * The meta object literal for the '<em><b>Weight Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID = eINSTANCE.getShipmentCostEstimate_WeightUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigImpl <em>Shipment Gateway Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayConfig()
		 * @generated
		 */
		EClass SHIPMENT_GATEWAY_CONFIG = eINSTANCE.getShipmentGatewayConfig();

		/**
		 * The meta object literal for the '<em><b>Shipment Gateway Config Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONFIG_ID = eINSTANCE.getShipmentGatewayConfig_ShipmentGatewayConfigId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_CONFIG__DESCRIPTION = eINSTANCE.getShipmentGatewayConfig_Description();

		/**
		 * The meta object literal for the '<em><b>Shipment Gateway Conf Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_GATEWAY_CONFIG__SHIPMENT_GATEWAY_CONF_TYPE_ID = eINSTANCE.getShipmentGatewayConfig_ShipmentGatewayConfTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl <em>Shipment Gateway Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayConfigTypeImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayConfigType()
		 * @generated
		 */
		EClass SHIPMENT_GATEWAY_CONFIG_TYPE = eINSTANCE.getShipmentGatewayConfigType();

		/**
		 * The meta object literal for the '<em><b>Shipment Gateway Conf Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_CONFIG_TYPE__SHIPMENT_GATEWAY_CONF_TYPE_ID = eINSTANCE.getShipmentGatewayConfigType_ShipmentGatewayConfTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_CONFIG_TYPE__DESCRIPTION = eINSTANCE.getShipmentGatewayConfigType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_CONFIG_TYPE__HAS_TABLE = eINSTANCE.getShipmentGatewayConfigType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_GATEWAY_CONFIG_TYPE__PARENT_TYPE_ID = eINSTANCE.getShipmentGatewayConfigType_ParentTypeId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl <em>Shipment Gateway Dhl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayDhl()
		 * @generated
		 */
		EClass SHIPMENT_GATEWAY_DHL = eINSTANCE.getShipmentGatewayDhl();

		/**
		 * The meta object literal for the '<em><b>Access Account Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR = eINSTANCE.getShipmentGatewayDhl_AccessAccountNbr();

		/**
		 * The meta object literal for the '<em><b>Access Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD = eINSTANCE.getShipmentGatewayDhl_AccessPassword();

		/**
		 * The meta object literal for the '<em><b>Access Shipping Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY = eINSTANCE.getShipmentGatewayDhl_AccessShippingKey();

		/**
		 * The meta object literal for the '<em><b>Access User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID = eINSTANCE.getShipmentGatewayDhl_AccessUserId();

		/**
		 * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT = eINSTANCE.getShipmentGatewayDhl_ConnectTimeout();

		/**
		 * The meta object literal for the '<em><b>Connect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__CONNECT_URL = eINSTANCE.getShipmentGatewayDhl_ConnectUrl();

		/**
		 * The meta object literal for the '<em><b>Head Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__HEAD_ACTION = eINSTANCE.getShipmentGatewayDhl_HeadAction();

		/**
		 * The meta object literal for the '<em><b>Head Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__HEAD_VERSION = eINSTANCE.getShipmentGatewayDhl_HeadVersion();

		/**
		 * The meta object literal for the '<em><b>Label Image Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT = eINSTANCE.getShipmentGatewayDhl_LabelImageFormat();

		/**
		 * The meta object literal for the '<em><b>Rate Estimate Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE = eINSTANCE.getShipmentGatewayDhl_RateEstimateTemplate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl <em>Shipment Gateway Fedex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayFedex()
		 * @generated
		 */
		EClass SHIPMENT_GATEWAY_FEDEX = eINSTANCE.getShipmentGatewayFedex();

		/**
		 * The meta object literal for the '<em><b>Access Account Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR = eINSTANCE.getShipmentGatewayFedex_AccessAccountNbr();

		/**
		 * The meta object literal for the '<em><b>Access Meter Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER = eINSTANCE.getShipmentGatewayFedex_AccessMeterNumber();

		/**
		 * The meta object literal for the '<em><b>Access User Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY = eINSTANCE.getShipmentGatewayFedex_AccessUserKey();

		/**
		 * The meta object literal for the '<em><b>Access User Pwd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD = eINSTANCE.getShipmentGatewayFedex_AccessUserPwd();

		/**
		 * The meta object literal for the '<em><b>Connect Soap Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL = eINSTANCE.getShipmentGatewayFedex_ConnectSoapUrl();

		/**
		 * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT = eINSTANCE.getShipmentGatewayFedex_ConnectTimeout();

		/**
		 * The meta object literal for the '<em><b>Connect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__CONNECT_URL = eINSTANCE.getShipmentGatewayFedex_ConnectUrl();

		/**
		 * The meta object literal for the '<em><b>Default Dropoff Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE = eINSTANCE.getShipmentGatewayFedex_DefaultDropoffType();

		/**
		 * The meta object literal for the '<em><b>Default Packaging Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE = eINSTANCE.getShipmentGatewayFedex_DefaultPackagingType();

		/**
		 * The meta object literal for the '<em><b>Label Image Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE = eINSTANCE.getShipmentGatewayFedex_LabelImageType();

		/**
		 * The meta object literal for the '<em><b>Rate Estimate Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE = eINSTANCE.getShipmentGatewayFedex_RateEstimateTemplate();

		/**
		 * The meta object literal for the '<em><b>Template Shipment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT = eINSTANCE.getShipmentGatewayFedex_TemplateShipment();

		/**
		 * The meta object literal for the '<em><b>Template Subscription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION = eINSTANCE.getShipmentGatewayFedex_TemplateSubscription();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl <em>Shipment Gateway Ups</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayUps()
		 * @generated
		 */
		EClass SHIPMENT_GATEWAY_UPS = eINSTANCE.getShipmentGatewayUps();

		/**
		 * The meta object literal for the '<em><b>Access License Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER = eINSTANCE.getShipmentGatewayUps_AccessLicenseNumber();

		/**
		 * The meta object literal for the '<em><b>Access Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD = eINSTANCE.getShipmentGatewayUps_AccessPassword();

		/**
		 * The meta object literal for the '<em><b>Access User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID = eINSTANCE.getShipmentGatewayUps_AccessUserId();

		/**
		 * The meta object literal for the '<em><b>Bill Shipper Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER = eINSTANCE.getShipmentGatewayUps_BillShipperAccountNumber();

		/**
		 * The meta object literal for the '<em><b>Cod Allow Cod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD = eINSTANCE.getShipmentGatewayUps_CodAllowCod();

		/**
		 * The meta object literal for the '<em><b>Cod Funds Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE = eINSTANCE.getShipmentGatewayUps_CodFundsCode();

		/**
		 * The meta object literal for the '<em><b>Cod Surcharge Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT = eINSTANCE.getShipmentGatewayUps_CodSurchargeAmount();

		/**
		 * The meta object literal for the '<em><b>Cod Surcharge Apply To Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE = eINSTANCE.getShipmentGatewayUps_CodSurchargeApplyToPackage();

		/**
		 * The meta object literal for the '<em><b>Cod Surcharge Currency Uom Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID = eINSTANCE.getShipmentGatewayUps_CodSurchargeCurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT = eINSTANCE.getShipmentGatewayUps_ConnectTimeout();

		/**
		 * The meta object literal for the '<em><b>Connect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__CONNECT_URL = eINSTANCE.getShipmentGatewayUps_ConnectUrl();

		/**
		 * The meta object literal for the '<em><b>Customer Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION = eINSTANCE.getShipmentGatewayUps_CustomerClassification();

		/**
		 * The meta object literal for the '<em><b>Default Return Label Memo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO = eINSTANCE.getShipmentGatewayUps_DefaultReturnLabelMemo();

		/**
		 * The meta object literal for the '<em><b>Default Return Label Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT = eINSTANCE.getShipmentGatewayUps_DefaultReturnLabelSubject();

		/**
		 * The meta object literal for the '<em><b>Max Estimate Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT = eINSTANCE.getShipmentGatewayUps_MaxEstimateWeight();

		/**
		 * The meta object literal for the '<em><b>Min Estimate Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT = eINSTANCE.getShipmentGatewayUps_MinEstimateWeight();

		/**
		 * The meta object literal for the '<em><b>Save Cert Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO = eINSTANCE.getShipmentGatewayUps_SaveCertInfo();

		/**
		 * The meta object literal for the '<em><b>Save Cert Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH = eINSTANCE.getShipmentGatewayUps_SaveCertPath();

		/**
		 * The meta object literal for the '<em><b>Shipper Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER = eINSTANCE.getShipmentGatewayUps_ShipperNumber();

		/**
		 * The meta object literal for the '<em><b>Shipper Pickup Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE = eINSTANCE.getShipmentGatewayUps_ShipperPickupType();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl <em>Shipment Gateway Usps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentGatewayUsps()
		 * @generated
		 */
		EClass SHIPMENT_GATEWAY_USPS = eINSTANCE.getShipmentGatewayUsps();

		/**
		 * The meta object literal for the '<em><b>Access Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD = eINSTANCE.getShipmentGatewayUsps_AccessPassword();

		/**
		 * The meta object literal for the '<em><b>Access User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID = eINSTANCE.getShipmentGatewayUsps_AccessUserId();

		/**
		 * The meta object literal for the '<em><b>Connect Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT = eINSTANCE.getShipmentGatewayUsps_ConnectTimeout();

		/**
		 * The meta object literal for the '<em><b>Connect Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_USPS__CONNECT_URL = eINSTANCE.getShipmentGatewayUsps_ConnectUrl();

		/**
		 * The meta object literal for the '<em><b>Connect Url Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS = eINSTANCE.getShipmentGatewayUsps_ConnectUrlLabels();

		/**
		 * The meta object literal for the '<em><b>Max Estimate Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT = eINSTANCE.getShipmentGatewayUsps_MaxEstimateWeight();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_GATEWAY_USPS__TEST = eINSTANCE.getShipmentGatewayUsps_Test();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemImpl <em>Shipment Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentItem()
		 * @generated
		 */
		EClass SHIPMENT_ITEM = eINSTANCE.getShipmentItem();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ITEM__SHIPMENT_ID = eINSTANCE.getShipmentItem_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ITEM__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getShipmentItem_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ITEM__PRODUCT_ID = eINSTANCE.getShipmentItem_ProductId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ITEM__QUANTITY = eINSTANCE.getShipmentItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Shipment Content Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ITEM__SHIPMENT_CONTENT_DESCRIPTION = eINSTANCE.getShipmentItem_ShipmentContentDescription();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemBillingImpl <em>Shipment Item Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemBillingImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentItemBilling()
		 * @generated
		 */
		EClass SHIPMENT_ITEM_BILLING = eINSTANCE.getShipmentItemBilling();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ITEM_BILLING__SHIPMENT_ID = eINSTANCE.getShipmentItemBilling_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ITEM_BILLING__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getShipmentItemBilling_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Invoice Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ITEM_BILLING__INVOICE_ID = eINSTANCE.getShipmentItemBilling_InvoiceId();

		/**
		 * The meta object literal for the '<em><b>Invoice Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ITEM_BILLING__INVOICE_ITEM_SEQ_ID = eINSTANCE.getShipmentItemBilling_InvoiceItemSeqId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemFeatureImpl <em>Shipment Item Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentItemFeatureImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentItemFeature()
		 * @generated
		 */
		EClass SHIPMENT_ITEM_FEATURE = eINSTANCE.getShipmentItemFeature();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ITEM_FEATURE__SHIPMENT_ID = eINSTANCE.getShipmentItemFeature_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ITEM_FEATURE__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getShipmentItemFeature_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Product Feature Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ITEM_FEATURE__PRODUCT_FEATURE_ID = eINSTANCE.getShipmentItemFeature_ProductFeatureId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentMethodTypeImpl <em>Shipment Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentMethodTypeImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentMethodType()
		 * @generated
		 */
		EClass SHIPMENT_METHOD_TYPE = eINSTANCE.getShipmentMethodType();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_METHOD_TYPE__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getShipmentMethodType_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_METHOD_TYPE__DESCRIPTION = eINSTANCE.getShipmentMethodType_Description();

		/**
		 * The meta object literal for the '<em><b>Sequence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_METHOD_TYPE__SEQUENCE_NUM = eINSTANCE.getShipmentMethodType_SequenceNum();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl <em>Shipment Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentPackage()
		 * @generated
		 */
		EClass SHIPMENT_PACKAGE = eINSTANCE.getShipmentPackage();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE__SHIPMENT_ID = eINSTANCE.getShipmentPackage_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Package Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE__SHIPMENT_PACKAGE_SEQ_ID = eINSTANCE.getShipmentPackage_ShipmentPackageSeqId();

		/**
		 * The meta object literal for the '<em><b>Box Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE__BOX_HEIGHT = eINSTANCE.getShipmentPackage_BoxHeight();

		/**
		 * The meta object literal for the '<em><b>Box Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE__BOX_LENGTH = eINSTANCE.getShipmentPackage_BoxLength();

		/**
		 * The meta object literal for the '<em><b>Box Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE__BOX_WIDTH = eINSTANCE.getShipmentPackage_BoxWidth();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE__DATE_CREATED = eINSTANCE.getShipmentPackage_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Dimension Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE__DIMENSION_UOM_ID = eINSTANCE.getShipmentPackage_DimensionUomId();

		/**
		 * The meta object literal for the '<em><b>Insured Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE__INSURED_VALUE = eINSTANCE.getShipmentPackage_InsuredValue();

		/**
		 * The meta object literal for the '<em><b>Shipment Box Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE__SHIPMENT_BOX_TYPE_ID = eINSTANCE.getShipmentPackage_ShipmentBoxTypeId();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE__WEIGHT = eINSTANCE.getShipmentPackage_Weight();

		/**
		 * The meta object literal for the '<em><b>Weight Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE__WEIGHT_UOM_ID = eINSTANCE.getShipmentPackage_WeightUomId();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageContentImpl <em>Shipment Package Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageContentImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentPackageContent()
		 * @generated
		 */
		EClass SHIPMENT_PACKAGE_CONTENT = eINSTANCE.getShipmentPackageContent();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE_CONTENT__SHIPMENT_ID = eINSTANCE.getShipmentPackageContent_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Package Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_CONTENT__SHIPMENT_PACKAGE_SEQ_ID = eINSTANCE.getShipmentPackageContent_ShipmentPackageSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_CONTENT__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getShipmentPackageContent_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_CONTENT__QUANTITY = eINSTANCE.getShipmentPackageContent_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sub Product Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE_CONTENT__SUB_PRODUCT_ID = eINSTANCE.getShipmentPackageContent_SubProductId();

		/**
		 * The meta object literal for the '<em><b>Sub Product Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_CONTENT__SUB_PRODUCT_QUANTITY = eINSTANCE.getShipmentPackageContent_SubProductQuantity();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl <em>Shipment Package Route Seg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentPackageRouteSegImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentPackageRouteSeg()
		 * @generated
		 */
		EClass SHIPMENT_PACKAGE_ROUTE_SEG = eINSTANCE.getShipmentPackageRouteSeg();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ID = eINSTANCE.getShipmentPackageRouteSeg_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Package Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_PACKAGE_SEQ_ID = eINSTANCE.getShipmentPackageRouteSeg_ShipmentPackageSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Route Segment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__SHIPMENT_ROUTE_SEGMENT_ID = eINSTANCE.getShipmentPackageRouteSeg_ShipmentRouteSegmentId();

		/**
		 * The meta object literal for the '<em><b>Box Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__BOX_NUMBER = eINSTANCE.getShipmentPackageRouteSeg_BoxNumber();

		/**
		 * The meta object literal for the '<em><b>Cod Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__COD_AMOUNT = eINSTANCE.getShipmentPackageRouteSeg_CodAmount();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_PACKAGE_ROUTE_SEG__CURRENCY_UOM_ID = eINSTANCE.getShipmentPackageRouteSeg_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Insured Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__INSURED_AMOUNT = eINSTANCE.getShipmentPackageRouteSeg_InsuredAmount();

		/**
		 * The meta object literal for the '<em><b>International Invoice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__INTERNATIONAL_INVOICE = eINSTANCE.getShipmentPackageRouteSeg_InternationalInvoice();

		/**
		 * The meta object literal for the '<em><b>Label Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_HTML = eINSTANCE.getShipmentPackageRouteSeg_LabelHtml();

		/**
		 * The meta object literal for the '<em><b>Label Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_IMAGE = eINSTANCE.getShipmentPackageRouteSeg_LabelImage();

		/**
		 * The meta object literal for the '<em><b>Label Intl Sign Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_INTL_SIGN_IMAGE = eINSTANCE.getShipmentPackageRouteSeg_LabelIntlSignImage();

		/**
		 * The meta object literal for the '<em><b>Label Printed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__LABEL_PRINTED = eINSTANCE.getShipmentPackageRouteSeg_LabelPrinted();

		/**
		 * The meta object literal for the '<em><b>Package Other Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_OTHER_COST = eINSTANCE.getShipmentPackageRouteSeg_PackageOtherCost();

		/**
		 * The meta object literal for the '<em><b>Package Service Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_SERVICE_COST = eINSTANCE.getShipmentPackageRouteSeg_PackageServiceCost();

		/**
		 * The meta object literal for the '<em><b>Package Transport Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__PACKAGE_TRANSPORT_COST = eINSTANCE.getShipmentPackageRouteSeg_PackageTransportCost();

		/**
		 * The meta object literal for the '<em><b>Tracking Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_PACKAGE_ROUTE_SEG__TRACKING_CODE = eINSTANCE.getShipmentPackageRouteSeg_TrackingCode();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl <em>Shipment Route Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentRouteSegmentImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentRouteSegment()
		 * @generated
		 */
		EClass SHIPMENT_ROUTE_SEGMENT = eINSTANCE.getShipmentRouteSegment();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ID = eINSTANCE.getShipmentRouteSegment_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Route Segment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__SHIPMENT_ROUTE_SEGMENT_ID = eINSTANCE.getShipmentRouteSegment_ShipmentRouteSegmentId();

		/**
		 * The meta object literal for the '<em><b>Actual Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ACTUAL_ARRIVAL_DATE = eINSTANCE.getShipmentRouteSegment_ActualArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Actual Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ACTUAL_COST = eINSTANCE.getShipmentRouteSegment_ActualCost();

		/**
		 * The meta object literal for the '<em><b>Actual Other Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ACTUAL_OTHER_COST = eINSTANCE.getShipmentRouteSegment_ActualOtherCost();

		/**
		 * The meta object literal for the '<em><b>Actual Service Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ACTUAL_SERVICE_COST = eINSTANCE.getShipmentRouteSegment_ActualServiceCost();

		/**
		 * The meta object literal for the '<em><b>Actual Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ACTUAL_START_DATE = eINSTANCE.getShipmentRouteSegment_ActualStartDate();

		/**
		 * The meta object literal for the '<em><b>Actual Transport Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ACTUAL_TRANSPORT_COST = eINSTANCE.getShipmentRouteSegment_ActualTransportCost();

		/**
		 * The meta object literal for the '<em><b>Billing Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT = eINSTANCE.getShipmentRouteSegment_BillingWeight();

		/**
		 * The meta object literal for the '<em><b>Billing Weight Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__BILLING_WEIGHT_UOM_ID = eINSTANCE.getShipmentRouteSegment_BillingWeightUomId();

		/**
		 * The meta object literal for the '<em><b>Carrier Delivery Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__CARRIER_DELIVERY_ZONE = eINSTANCE.getShipmentRouteSegment_CarrierDeliveryZone();

		/**
		 * The meta object literal for the '<em><b>Carrier Party Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__CARRIER_PARTY_ID = eINSTANCE.getShipmentRouteSegment_CarrierPartyId();

		/**
		 * The meta object literal for the '<em><b>Carrier Restriction Codes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_CODES = eINSTANCE.getShipmentRouteSegment_CarrierRestrictionCodes();

		/**
		 * The meta object literal for the '<em><b>Carrier Restriction Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__CARRIER_RESTRICTION_DESC = eINSTANCE.getShipmentRouteSegment_CarrierRestrictionDesc();

		/**
		 * The meta object literal for the '<em><b>Carrier Service Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__CARRIER_SERVICE_STATUS_ID = eINSTANCE.getShipmentRouteSegment_CarrierServiceStatusId();

		/**
		 * The meta object literal for the '<em><b>Currency Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__CURRENCY_UOM_ID = eINSTANCE.getShipmentRouteSegment_CurrencyUomId();

		/**
		 * The meta object literal for the '<em><b>Delivery Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__DELIVERY_ID = eINSTANCE.getShipmentRouteSegment_DeliveryId();

		/**
		 * The meta object literal for the '<em><b>Dest Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__DEST_CONTACT_MECH_ID = eINSTANCE.getShipmentRouteSegment_DestContactMechId();

		/**
		 * The meta object literal for the '<em><b>Dest Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__DEST_FACILITY_ID = eINSTANCE.getShipmentRouteSegment_DestFacilityId();

		/**
		 * The meta object literal for the '<em><b>Dest Telecom Number Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__DEST_TELECOM_NUMBER_ID = eINSTANCE.getShipmentRouteSegment_DestTelecomNumberId();

		/**
		 * The meta object literal for the '<em><b>Estimated Arrival Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ESTIMATED_ARRIVAL_DATE = eINSTANCE.getShipmentRouteSegment_EstimatedArrivalDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__ESTIMATED_START_DATE = eINSTANCE.getShipmentRouteSegment_EstimatedStartDate();

		/**
		 * The meta object literal for the '<em><b>Home Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_DATE = eINSTANCE.getShipmentRouteSegment_HomeDeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Home Delivery Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__HOME_DELIVERY_TYPE = eINSTANCE.getShipmentRouteSegment_HomeDeliveryType();

		/**
		 * The meta object literal for the '<em><b>Last Updated Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__LAST_UPDATED_DATE = eINSTANCE.getShipmentRouteSegment_LastUpdatedDate();

		/**
		 * The meta object literal for the '<em><b>Origin Contact Mech Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__ORIGIN_CONTACT_MECH_ID = eINSTANCE.getShipmentRouteSegment_OriginContactMechId();

		/**
		 * The meta object literal for the '<em><b>Origin Facility Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__ORIGIN_FACILITY_ID = eINSTANCE.getShipmentRouteSegment_OriginFacilityId();

		/**
		 * The meta object literal for the '<em><b>Origin Telecom Number Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__ORIGIN_TELECOM_NUMBER_ID = eINSTANCE.getShipmentRouteSegment_OriginTelecomNumberId();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_ROUTE_SEGMENT__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getShipmentRouteSegment_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Third Party Account Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_ACCOUNT_NUMBER = eINSTANCE.getShipmentRouteSegment_ThirdPartyAccountNumber();

		/**
		 * The meta object literal for the '<em><b>Third Party Country Geo Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_COUNTRY_GEO_CODE = eINSTANCE.getShipmentRouteSegment_ThirdPartyCountryGeoCode();

		/**
		 * The meta object literal for the '<em><b>Third Party Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__THIRD_PARTY_POSTAL_CODE = eINSTANCE.getShipmentRouteSegment_ThirdPartyPostalCode();

		/**
		 * The meta object literal for the '<em><b>Tracking Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__TRACKING_DIGEST = eINSTANCE.getShipmentRouteSegment_TrackingDigest();

		/**
		 * The meta object literal for the '<em><b>Tracking Id Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__TRACKING_ID_NUMBER = eINSTANCE.getShipmentRouteSegment_TrackingIdNumber();

		/**
		 * The meta object literal for the '<em><b>Updated By User Login Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__UPDATED_BY_USER_LOGIN_ID = eINSTANCE.getShipmentRouteSegment_UpdatedByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Ups High Value Report</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_ROUTE_SEGMENT__UPS_HIGH_VALUE_REPORT = eINSTANCE.getShipmentRouteSegment_UpsHighValueReport();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl <em>Shipment Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentStatusImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentStatus()
		 * @generated
		 */
		EClass SHIPMENT_STATUS = eINSTANCE.getShipmentStatus();

		/**
		 * The meta object literal for the '<em><b>Status Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_STATUS__STATUS_ID = eINSTANCE.getShipmentStatus_StatusId();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_STATUS__SHIPMENT_ID = eINSTANCE.getShipmentStatus_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Change By User Login Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_STATUS__CHANGE_BY_USER_LOGIN_ID = eINSTANCE.getShipmentStatus_ChangeByUserLoginId();

		/**
		 * The meta object literal for the '<em><b>Status Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_STATUS__STATUS_DATE = eINSTANCE.getShipmentStatus_StatusDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl <em>Shipment Time Estimate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTimeEstimateImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentTimeEstimate()
		 * @generated
		 */
		EClass SHIPMENT_TIME_ESTIMATE = eINSTANCE.getShipmentTimeEstimate();

		/**
		 * The meta object literal for the '<em><b>Shipment Method Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TIME_ESTIMATE__SHIPMENT_METHOD_TYPE_ID = eINSTANCE.getShipmentTimeEstimate_ShipmentMethodTypeId();

		/**
		 * The meta object literal for the '<em><b>Party Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TIME_ESTIMATE__PARTY_ID = eINSTANCE.getShipmentTimeEstimate_PartyId();

		/**
		 * The meta object literal for the '<em><b>Role Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TIME_ESTIMATE__ROLE_TYPE_ID = eINSTANCE.getShipmentTimeEstimate_RoleTypeId();

		/**
		 * The meta object literal for the '<em><b>Geo Id To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_TIME_ESTIMATE__GEO_ID_TO = eINSTANCE.getShipmentTimeEstimate_GeoIdTo();

		/**
		 * The meta object literal for the '<em><b>Geo Id From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_TIME_ESTIMATE__GEO_ID_FROM = eINSTANCE.getShipmentTimeEstimate_GeoIdFrom();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TIME_ESTIMATE__FROM_DATE = eINSTANCE.getShipmentTimeEstimate_FromDate();

		/**
		 * The meta object literal for the '<em><b>Lead Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TIME_ESTIMATE__LEAD_TIME = eINSTANCE.getShipmentTimeEstimate_LeadTime();

		/**
		 * The meta object literal for the '<em><b>Lead Time Uom Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_TIME_ESTIMATE__LEAD_TIME_UOM_ID = eINSTANCE.getShipmentTimeEstimate_LeadTimeUomId();

		/**
		 * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TIME_ESTIMATE__SEQUENCE_NUMBER = eINSTANCE.getShipmentTimeEstimate_SequenceNumber();

		/**
		 * The meta object literal for the '<em><b>Thru Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TIME_ESTIMATE__THRU_DATE = eINSTANCE.getShipmentTimeEstimate_ThruDate();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl <em>Shipment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentType()
		 * @generated
		 */
		EClass SHIPMENT_TYPE = eINSTANCE.getShipmentType();

		/**
		 * The meta object literal for the '<em><b>Shipment Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TYPE__SHIPMENT_TYPE_ID = eINSTANCE.getShipmentType_ShipmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TYPE__DESCRIPTION = eINSTANCE.getShipmentType_Description();

		/**
		 * The meta object literal for the '<em><b>Has Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TYPE__HAS_TABLE = eINSTANCE.getShipmentType_HasTable();

		/**
		 * The meta object literal for the '<em><b>Parent Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_TYPE__PARENT_TYPE_ID = eINSTANCE.getShipmentType_ParentTypeId();

		/**
		 * The meta object literal for the '<em><b>Shipment Type Attrs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_TYPE__SHIPMENT_TYPE_ATTRS = eINSTANCE.getShipmentType_ShipmentTypeAttrs();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeAttrImpl <em>Shipment Type Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShipmentTypeAttrImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShipmentTypeAttr()
		 * @generated
		 */
		EClass SHIPMENT_TYPE_ATTR = eINSTANCE.getShipmentTypeAttr();

		/**
		 * The meta object literal for the '<em><b>Shipment Type Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPMENT_TYPE_ATTR__SHIPMENT_TYPE_ID = eINSTANCE.getShipmentTypeAttr_ShipmentTypeId();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TYPE_ATTR__ATTR_NAME = eINSTANCE.getShipmentTypeAttr_AttrName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT_TYPE_ATTR__DESCRIPTION = eINSTANCE.getShipmentTypeAttr_Description();

		/**
		 * The meta object literal for the '{@link org.abchip.mimo.biz.shipment.shipment.impl.ShippingDocumentImpl <em>Shipping Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.ShippingDocumentImpl
		 * @see org.abchip.mimo.biz.shipment.shipment.impl.Shipment_PackageImpl#getShippingDocument()
		 * @generated
		 */
		EClass SHIPPING_DOCUMENT = eINSTANCE.getShippingDocument();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_DOCUMENT__DESCRIPTION = eINSTANCE.getShippingDocument_Description();

		/**
		 * The meta object literal for the '<em><b>Shipment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_DOCUMENT__SHIPMENT_ID = eINSTANCE.getShippingDocument_ShipmentId();

		/**
		 * The meta object literal for the '<em><b>Shipment Item Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_DOCUMENT__SHIPMENT_ITEM_SEQ_ID = eINSTANCE.getShippingDocument_ShipmentItemSeqId();

		/**
		 * The meta object literal for the '<em><b>Shipment Package Seq Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPPING_DOCUMENT__SHIPMENT_PACKAGE_SEQ_ID = eINSTANCE.getShippingDocument_ShipmentPackageSeqId();

	}

} //Shipment_Package
