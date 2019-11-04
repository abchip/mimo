/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.party.party.RoleType;
import org.abchip.mimo.biz.product.price.QuantityBreak;
import org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth;
import org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Cost Estimate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getShipmentCostEstimateId <em>Shipment Cost Estimate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getFeaturePercent <em>Feature Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getFeaturePrice <em>Feature Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderFlatPrice <em>Order Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderItemFlatPrice <em>Order Item Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderPricePercent <em>Order Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOversizePrice <em>Oversize Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOversizeUnit <em>Oversize Unit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceUnitPrice <em>Price Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityUnitPrice <em>Quantity Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getShippingPricePercent <em>Shipping Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightUnitPrice <em>Weight Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightUomId <em>Weight Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceUomId <em>Price Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getGeoIdFrom <em>Geo Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightBreakId <em>Weight Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityBreakId <em>Quantity Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceBreakId <em>Price Break Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentCostEstimateImpl extends BizEntityImpl implements ShipmentCostEstimate {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getShipmentCostEstimateId() <em>Shipment Cost Estimate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentCostEstimateId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_COST_ESTIMATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentCostEstimateId() <em>Shipment Cost Estimate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentCostEstimateId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentCostEstimateId = SHIPMENT_COST_ESTIMATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierPartyId() <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierPartyId()
	 * @generated
	 * @ordered
	 */
	protected String carrierPartyId = CARRIER_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCarrierRoleTypeId() <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String CARRIER_ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCarrierRoleTypeId() <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String carrierRoleTypeId = CARRIER_ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeaturePercent() <em>Feature Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePercent()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FEATURE_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeaturePercent() <em>Feature Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePercent()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal featurePercent = FEATURE_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeaturePrice() <em>Feature Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FEATURE_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeaturePrice() <em>Feature Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturePrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal featurePrice = FEATURE_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderFlatPrice() <em>Order Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderFlatPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ORDER_FLAT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderFlatPrice() <em>Order Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderFlatPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal orderFlatPrice = ORDER_FLAT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderItemFlatPrice() <em>Order Item Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemFlatPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ORDER_ITEM_FLAT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderItemFlatPrice() <em>Order Item Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItemFlatPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal orderItemFlatPrice = ORDER_ITEM_FLAT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderPricePercent() <em>Order Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPricePercent()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ORDER_PRICE_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderPricePercent() <em>Order Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPricePercent()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal orderPricePercent = ORDER_PRICE_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOversizePrice() <em>Oversize Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOversizePrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OVERSIZE_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOversizePrice() <em>Oversize Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOversizePrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal oversizePrice = OVERSIZE_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOversizeUnit() <em>Oversize Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOversizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OVERSIZE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOversizeUnit() <em>Oversize Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOversizeUnit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal oversizeUnit = OVERSIZE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriceUnitPrice() <em>Price Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRICE_UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriceUnitPrice() <em>Price Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal priceUnitPrice = PRICE_UNIT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductFeatureGroupId() <em>Product Feature Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_FEATURE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductFeatureGroupId() <em>Product Feature Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductFeatureGroupId()
	 * @generated
	 * @ordered
	 */
	protected String productFeatureGroupId = PRODUCT_FEATURE_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreId() <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreId = PRODUCT_STORE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantityUnitPrice() <em>Quantity Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuantityUnitPrice() <em>Quantity Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal quantityUnitPrice = QUANTITY_UNIT_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_METHOD_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentMethodTypeId() <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentMethodTypeId = SHIPMENT_METHOD_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShippingPricePercent() <em>Shipping Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPricePercent()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHIPPING_PRICE_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShippingPricePercent() <em>Shipping Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShippingPricePercent()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal shippingPricePercent = SHIPPING_PRICE_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeightUnitPrice() <em>Weight Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WEIGHT_UNIT_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeightUnitPrice() <em>Weight Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal weightUnitPrice = WEIGHT_UNIT_PRICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductStoreShipMethId() <em>Product Store Ship Meth Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreShipMethId()
	 * @generated
	 * @ordered
	 */
	protected ProductStoreShipmentMeth productStoreShipMethId;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected RoleType roleTypeId;

	/**
	 * The cached value of the '{@link #getWeightUomId() <em>Weight Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom weightUomId;

	/**
	 * The cached value of the '{@link #getQuantityUomId() <em>Quantity Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom quantityUomId;

	/**
	 * The cached value of the '{@link #getPriceUomId() <em>Price Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom priceUomId;

	/**
	 * The cached value of the '{@link #getGeoIdTo() <em>Geo Id To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoIdTo()
	 * @generated
	 * @ordered
	 */
	protected Geo geoIdTo;

	/**
	 * The cached value of the '{@link #getGeoIdFrom() <em>Geo Id From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoIdFrom()
	 * @generated
	 * @ordered
	 */
	protected Geo geoIdFrom;

	/**
	 * The cached value of the '{@link #getWeightBreakId() <em>Weight Break Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeightBreakId()
	 * @generated
	 * @ordered
	 */
	protected QuantityBreak weightBreakId;

	/**
	 * The cached value of the '{@link #getQuantityBreakId() <em>Quantity Break Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityBreakId()
	 * @generated
	 * @ordered
	 */
	protected QuantityBreak quantityBreakId;

	/**
	 * The cached value of the '{@link #getPriceBreakId() <em>Price Break Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceBreakId()
	 * @generated
	 * @ordered
	 */
	protected QuantityBreak priceBreakId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentCostEstimateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierPartyId() {
		return carrierPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(String newCarrierPartyId) {
		String oldCarrierPartyId = carrierPartyId;
		carrierPartyId = newCarrierPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID, oldCarrierPartyId, carrierPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRoleTypeId() {
		return carrierRoleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRoleTypeId(String newCarrierRoleTypeId) {
		String oldCarrierRoleTypeId = carrierRoleTypeId;
		carrierRoleTypeId = newCarrierRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID, oldCarrierRoleTypeId, carrierRoleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFeaturePercent() {
		return featurePercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturePercent(BigDecimal newFeaturePercent) {
		BigDecimal oldFeaturePercent = featurePercent;
		featurePercent = newFeaturePercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT, oldFeaturePercent, featurePercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFeaturePrice() {
		return featurePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturePrice(BigDecimal newFeaturePrice) {
		BigDecimal oldFeaturePrice = featurePrice;
		featurePrice = newFeaturePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE, oldFeaturePrice, featurePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdFrom() {
		if (geoIdFrom != null && ((EObject)geoIdFrom).eIsProxy()) {
			InternalEObject oldGeoIdFrom = (InternalEObject)geoIdFrom;
			geoIdFrom = (Geo)eResolveProxy(oldGeoIdFrom);
			if (geoIdFrom != oldGeoIdFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM, oldGeoIdFrom, geoIdFrom));
			}
		}
		return geoIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoIdFrom() {
		return geoIdFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdFrom(Geo newGeoIdFrom) {
		Geo oldGeoIdFrom = geoIdFrom;
		geoIdFrom = newGeoIdFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM, oldGeoIdFrom, geoIdFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdTo() {
		if (geoIdTo != null && ((EObject)geoIdTo).eIsProxy()) {
			InternalEObject oldGeoIdTo = (InternalEObject)geoIdTo;
			geoIdTo = (Geo)eResolveProxy(oldGeoIdTo);
			if (geoIdTo != oldGeoIdTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_TO, oldGeoIdTo, geoIdTo));
			}
		}
		return geoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geo basicGetGeoIdTo() {
		return geoIdTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdTo(Geo newGeoIdTo) {
		Geo oldGeoIdTo = geoIdTo;
		geoIdTo = newGeoIdTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_TO, oldGeoIdTo, geoIdTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderFlatPrice() {
		return orderFlatPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderFlatPrice(BigDecimal newOrderFlatPrice) {
		BigDecimal oldOrderFlatPrice = orderFlatPrice;
		orderFlatPrice = newOrderFlatPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE, oldOrderFlatPrice, orderFlatPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderItemFlatPrice() {
		return orderItemFlatPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemFlatPrice(BigDecimal newOrderItemFlatPrice) {
		BigDecimal oldOrderItemFlatPrice = orderItemFlatPrice;
		orderItemFlatPrice = newOrderItemFlatPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE, oldOrderItemFlatPrice, orderItemFlatPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderPricePercent() {
		return orderPricePercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPricePercent(BigDecimal newOrderPricePercent) {
		BigDecimal oldOrderPricePercent = orderPricePercent;
		orderPricePercent = newOrderPricePercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT, oldOrderPricePercent, orderPricePercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOversizePrice() {
		return oversizePrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizePrice(BigDecimal newOversizePrice) {
		BigDecimal oldOversizePrice = oversizePrice;
		oversizePrice = newOversizePrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE, oldOversizePrice, oversizePrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOversizeUnit() {
		return oversizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizeUnit(BigDecimal newOversizeUnit) {
		BigDecimal oldOversizeUnit = oversizeUnit;
		oversizeUnit = newOversizeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT, oldOversizeUnit, oversizeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getPriceBreakId() {
		if (priceBreakId != null && ((EObject)priceBreakId).eIsProxy()) {
			InternalEObject oldPriceBreakId = (InternalEObject)priceBreakId;
			priceBreakId = (QuantityBreak)eResolveProxy(oldPriceBreakId);
			if (priceBreakId != oldPriceBreakId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID, oldPriceBreakId, priceBreakId));
			}
		}
		return priceBreakId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityBreak basicGetPriceBreakId() {
		return priceBreakId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceBreakId(QuantityBreak newPriceBreakId) {
		QuantityBreak oldPriceBreakId = priceBreakId;
		priceBreakId = newPriceBreakId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID, oldPriceBreakId, priceBreakId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPriceUnitPrice() {
		return priceUnitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceUnitPrice(BigDecimal newPriceUnitPrice) {
		BigDecimal oldPriceUnitPrice = priceUnitPrice;
		priceUnitPrice = newPriceUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE, oldPriceUnitPrice, priceUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getPriceUomId() {
		if (priceUomId != null && ((EObject)priceUomId).eIsProxy()) {
			InternalEObject oldPriceUomId = (InternalEObject)priceUomId;
			priceUomId = (Uom)eResolveProxy(oldPriceUomId);
			if (priceUomId != oldPriceUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID, oldPriceUomId, priceUomId));
			}
		}
		return priceUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetPriceUomId() {
		return priceUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceUomId(Uom newPriceUomId) {
		Uom oldPriceUomId = priceUomId;
		priceUomId = newPriceUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID, oldPriceUomId, priceUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureGroupId() {
		return productFeatureGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureGroupId(String newProductFeatureGroupId) {
		String oldProductFeatureGroupId = productFeatureGroupId;
		productFeatureGroupId = newProductFeatureGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID, oldProductFeatureGroupId, productFeatureGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return productStoreId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		String oldProductStoreId = productStoreId;
		productStoreId = newProductStoreId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreShipmentMeth getProductStoreShipMethId() {
		if (productStoreShipMethId != null && ((EObject)productStoreShipMethId).eIsProxy()) {
			InternalEObject oldProductStoreShipMethId = (InternalEObject)productStoreShipMethId;
			productStoreShipMethId = (ProductStoreShipmentMeth)eResolveProxy(oldProductStoreShipMethId);
			if (productStoreShipMethId != oldProductStoreShipMethId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID, oldProductStoreShipMethId, productStoreShipMethId));
			}
		}
		return productStoreShipMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStoreShipmentMeth basicGetProductStoreShipMethId() {
		return productStoreShipMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreShipMethId(ProductStoreShipmentMeth newProductStoreShipMethId) {
		ProductStoreShipmentMeth oldProductStoreShipMethId = productStoreShipMethId;
		productStoreShipMethId = newProductStoreShipMethId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID, oldProductStoreShipMethId, productStoreShipMethId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getQuantityBreakId() {
		if (quantityBreakId != null && ((EObject)quantityBreakId).eIsProxy()) {
			InternalEObject oldQuantityBreakId = (InternalEObject)quantityBreakId;
			quantityBreakId = (QuantityBreak)eResolveProxy(oldQuantityBreakId);
			if (quantityBreakId != oldQuantityBreakId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID, oldQuantityBreakId, quantityBreakId));
			}
		}
		return quantityBreakId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityBreak basicGetQuantityBreakId() {
		return quantityBreakId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityBreakId(QuantityBreak newQuantityBreakId) {
		QuantityBreak oldQuantityBreakId = quantityBreakId;
		quantityBreakId = newQuantityBreakId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID, oldQuantityBreakId, quantityBreakId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityUnitPrice() {
		return quantityUnitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUnitPrice(BigDecimal newQuantityUnitPrice) {
		BigDecimal oldQuantityUnitPrice = quantityUnitPrice;
		quantityUnitPrice = newQuantityUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE, oldQuantityUnitPrice, quantityUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUomId() {
		if (quantityUomId != null && ((EObject)quantityUomId).eIsProxy()) {
			InternalEObject oldQuantityUomId = (InternalEObject)quantityUomId;
			quantityUomId = (Uom)eResolveProxy(oldQuantityUomId);
			if (quantityUomId != oldQuantityUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID, oldQuantityUomId, quantityUomId));
			}
		}
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetQuantityUomId() {
		return quantityUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUomId(Uom newQuantityUomId) {
		Uom oldQuantityUomId = quantityUomId;
		quantityUomId = newQuantityUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID, oldQuantityUomId, quantityUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		if (roleTypeId != null && ((EObject)roleTypeId).eIsProxy()) {
			InternalEObject oldRoleTypeId = (InternalEObject)roleTypeId;
			roleTypeId = (RoleType)eResolveProxy(oldRoleTypeId);
			if (roleTypeId != oldRoleTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
			}
		}
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType basicGetRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		RoleType oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentCostEstimateId() {
		return shipmentCostEstimateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentCostEstimateId(String newShipmentCostEstimateId) {
		String oldShipmentCostEstimateId = shipmentCostEstimateId;
		shipmentCostEstimateId = newShipmentCostEstimateId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID, oldShipmentCostEstimateId, shipmentCostEstimateId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentMethodTypeId() {
		return shipmentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		String oldShipmentMethodTypeId = shipmentMethodTypeId;
		shipmentMethodTypeId = newShipmentMethodTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPricePercent() {
		return shippingPricePercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPricePercent(BigDecimal newShippingPricePercent) {
		BigDecimal oldShippingPricePercent = shippingPricePercent;
		shippingPricePercent = newShippingPricePercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT, oldShippingPricePercent, shippingPricePercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getWeightBreakId() {
		if (weightBreakId != null && ((EObject)weightBreakId).eIsProxy()) {
			InternalEObject oldWeightBreakId = (InternalEObject)weightBreakId;
			weightBreakId = (QuantityBreak)eResolveProxy(oldWeightBreakId);
			if (weightBreakId != oldWeightBreakId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID, oldWeightBreakId, weightBreakId));
			}
		}
		return weightBreakId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityBreak basicGetWeightBreakId() {
		return weightBreakId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightBreakId(QuantityBreak newWeightBreakId) {
		QuantityBreak oldWeightBreakId = weightBreakId;
		weightBreakId = newWeightBreakId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID, oldWeightBreakId, weightBreakId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getWeightUnitPrice() {
		return weightUnitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUnitPrice(BigDecimal newWeightUnitPrice) {
		BigDecimal oldWeightUnitPrice = weightUnitPrice;
		weightUnitPrice = newWeightUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE, oldWeightUnitPrice, weightUnitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWeightUomId() {
		if (weightUomId != null && ((EObject)weightUomId).eIsProxy()) {
			InternalEObject oldWeightUomId = (InternalEObject)weightUomId;
			weightUomId = (Uom)eResolveProxy(oldWeightUomId);
			if (weightUomId != oldWeightUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID, oldWeightUomId, weightUomId));
			}
		}
		return weightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetWeightUomId() {
		return weightUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUomId(Uom newWeightUomId) {
		Uom oldWeightUomId = weightUomId;
		weightUomId = newWeightUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID, oldWeightUomId, weightUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID:
				return getShipmentCostEstimateId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID:
				return getCarrierPartyId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID:
				return getCarrierRoleTypeId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT:
				return getFeaturePercent();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE:
				return getFeaturePrice();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE:
				return getOrderFlatPrice();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE:
				return getOrderItemFlatPrice();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT:
				return getOrderPricePercent();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE:
				return getOversizePrice();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT:
				return getOversizeUnit();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE:
				return getPriceUnitPrice();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID:
				return getProductFeatureGroupId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID:
				return getProductStoreId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE:
				return getQuantityUnitPrice();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				return getShipmentMethodTypeId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT:
				return getShippingPricePercent();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE:
				return getWeightUnitPrice();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID:
				if (resolve) return getProductStoreShipMethId();
				return basicGetProductStoreShipMethId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID:
				if (resolve) return getRoleTypeId();
				return basicGetRoleTypeId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID:
				if (resolve) return getWeightUomId();
				return basicGetWeightUomId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID:
				if (resolve) return getQuantityUomId();
				return basicGetQuantityUomId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID:
				if (resolve) return getPriceUomId();
				return basicGetPriceUomId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_TO:
				if (resolve) return getGeoIdTo();
				return basicGetGeoIdTo();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM:
				if (resolve) return getGeoIdFrom();
				return basicGetGeoIdFrom();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID:
				if (resolve) return getWeightBreakId();
				return basicGetWeightBreakId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID:
				if (resolve) return getQuantityBreakId();
				return basicGetQuantityBreakId();
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID:
				if (resolve) return getPriceBreakId();
				return basicGetPriceBreakId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID:
				setShipmentCostEstimateId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID:
				setCarrierPartyId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID:
				setCarrierRoleTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT:
				setFeaturePercent((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE:
				setFeaturePrice((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE:
				setOrderFlatPrice((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE:
				setOrderItemFlatPrice((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT:
				setOrderPricePercent((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE:
				setOversizePrice((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT:
				setOversizeUnit((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE:
				setPriceUnitPrice((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID:
				setProductFeatureGroupId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE:
				setQuantityUnitPrice((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT:
				setShippingPricePercent((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE:
				setWeightUnitPrice((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID:
				setProductStoreShipMethId((ProductStoreShipmentMeth)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID:
				setWeightUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID:
				setPriceUomId((Uom)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_TO:
				setGeoIdTo((Geo)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM:
				setGeoIdFrom((Geo)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID:
				setWeightBreakId((QuantityBreak)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID:
				setQuantityBreakId((QuantityBreak)newValue);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID:
				setPriceBreakId((QuantityBreak)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID:
				setShipmentCostEstimateId(SHIPMENT_COST_ESTIMATE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID:
				setCarrierPartyId(CARRIER_PARTY_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID:
				setCarrierRoleTypeId(CARRIER_ROLE_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT:
				setFeaturePercent(FEATURE_PERCENT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE:
				setFeaturePrice(FEATURE_PRICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE:
				setOrderFlatPrice(ORDER_FLAT_PRICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE:
				setOrderItemFlatPrice(ORDER_ITEM_FLAT_PRICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT:
				setOrderPricePercent(ORDER_PRICE_PERCENT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE:
				setOversizePrice(OVERSIZE_PRICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT:
				setOversizeUnit(OVERSIZE_UNIT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE:
				setPriceUnitPrice(PRICE_UNIT_PRICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID:
				setProductFeatureGroupId(PRODUCT_FEATURE_GROUP_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE:
				setQuantityUnitPrice(QUANTITY_UNIT_PRICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId(SHIPMENT_METHOD_TYPE_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT:
				setShippingPricePercent(SHIPPING_PRICE_PERCENT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE:
				setWeightUnitPrice(WEIGHT_UNIT_PRICE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID:
				setProductStoreShipMethId((ProductStoreShipmentMeth)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PARTY_ID:
				setPartyId((Party)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID:
				setRoleTypeId((RoleType)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID:
				setWeightUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID:
				setQuantityUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID:
				setPriceUomId((Uom)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_TO:
				setGeoIdTo((Geo)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM:
				setGeoIdFrom((Geo)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID:
				setWeightBreakId((QuantityBreak)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID:
				setQuantityBreakId((QuantityBreak)null);
				return;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID:
				setPriceBreakId((QuantityBreak)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID:
				return SHIPMENT_COST_ESTIMATE_ID_EDEFAULT == null ? shipmentCostEstimateId != null : !SHIPMENT_COST_ESTIMATE_ID_EDEFAULT.equals(shipmentCostEstimateId);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID:
				return CARRIER_PARTY_ID_EDEFAULT == null ? carrierPartyId != null : !CARRIER_PARTY_ID_EDEFAULT.equals(carrierPartyId);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID:
				return CARRIER_ROLE_TYPE_ID_EDEFAULT == null ? carrierRoleTypeId != null : !CARRIER_ROLE_TYPE_ID_EDEFAULT.equals(carrierRoleTypeId);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT:
				return FEATURE_PERCENT_EDEFAULT == null ? featurePercent != null : !FEATURE_PERCENT_EDEFAULT.equals(featurePercent);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE:
				return FEATURE_PRICE_EDEFAULT == null ? featurePrice != null : !FEATURE_PRICE_EDEFAULT.equals(featurePrice);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE:
				return ORDER_FLAT_PRICE_EDEFAULT == null ? orderFlatPrice != null : !ORDER_FLAT_PRICE_EDEFAULT.equals(orderFlatPrice);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE:
				return ORDER_ITEM_FLAT_PRICE_EDEFAULT == null ? orderItemFlatPrice != null : !ORDER_ITEM_FLAT_PRICE_EDEFAULT.equals(orderItemFlatPrice);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT:
				return ORDER_PRICE_PERCENT_EDEFAULT == null ? orderPricePercent != null : !ORDER_PRICE_PERCENT_EDEFAULT.equals(orderPricePercent);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE:
				return OVERSIZE_PRICE_EDEFAULT == null ? oversizePrice != null : !OVERSIZE_PRICE_EDEFAULT.equals(oversizePrice);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT:
				return OVERSIZE_UNIT_EDEFAULT == null ? oversizeUnit != null : !OVERSIZE_UNIT_EDEFAULT.equals(oversizeUnit);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE:
				return PRICE_UNIT_PRICE_EDEFAULT == null ? priceUnitPrice != null : !PRICE_UNIT_PRICE_EDEFAULT.equals(priceUnitPrice);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID:
				return PRODUCT_FEATURE_GROUP_ID_EDEFAULT == null ? productFeatureGroupId != null : !PRODUCT_FEATURE_GROUP_ID_EDEFAULT.equals(productFeatureGroupId);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE:
				return QUANTITY_UNIT_PRICE_EDEFAULT == null ? quantityUnitPrice != null : !QUANTITY_UNIT_PRICE_EDEFAULT.equals(quantityUnitPrice);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID:
				return SHIPMENT_METHOD_TYPE_ID_EDEFAULT == null ? shipmentMethodTypeId != null : !SHIPMENT_METHOD_TYPE_ID_EDEFAULT.equals(shipmentMethodTypeId);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT:
				return SHIPPING_PRICE_PERCENT_EDEFAULT == null ? shippingPricePercent != null : !SHIPPING_PRICE_PERCENT_EDEFAULT.equals(shippingPricePercent);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE:
				return WEIGHT_UNIT_PRICE_EDEFAULT == null ? weightUnitPrice != null : !WEIGHT_UNIT_PRICE_EDEFAULT.equals(weightUnitPrice);
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID:
				return productStoreShipMethId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PARTY_ID:
				return partyId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID:
				return roleTypeId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID:
				return weightUomId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID:
				return quantityUomId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID:
				return priceUomId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_TO:
				return geoIdTo != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM:
				return geoIdFrom != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID:
				return weightBreakId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID:
				return quantityBreakId != null;
			case Shipment_Package.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID:
				return priceBreakId != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (shipmentCostEstimateId: ");
		result.append(shipmentCostEstimateId);
		result.append(", carrierPartyId: ");
		result.append(carrierPartyId);
		result.append(", carrierRoleTypeId: ");
		result.append(carrierRoleTypeId);
		result.append(", featurePercent: ");
		result.append(featurePercent);
		result.append(", featurePrice: ");
		result.append(featurePrice);
		result.append(", orderFlatPrice: ");
		result.append(orderFlatPrice);
		result.append(", orderItemFlatPrice: ");
		result.append(orderItemFlatPrice);
		result.append(", orderPricePercent: ");
		result.append(orderPricePercent);
		result.append(", oversizePrice: ");
		result.append(oversizePrice);
		result.append(", oversizeUnit: ");
		result.append(oversizeUnit);
		result.append(", priceUnitPrice: ");
		result.append(priceUnitPrice);
		result.append(", productFeatureGroupId: ");
		result.append(productFeatureGroupId);
		result.append(", productStoreId: ");
		result.append(productStoreId);
		result.append(", quantityUnitPrice: ");
		result.append(quantityUnitPrice);
		result.append(", shipmentMethodTypeId: ");
		result.append(shipmentMethodTypeId);
		result.append(", shippingPricePercent: ");
		result.append(shippingPricePercent);
		result.append(", weightUnitPrice: ");
		result.append(weightUnitPrice);
		result.append(')');
		return result.toString();
	}

} //ShipmentCostEstimateImpl
