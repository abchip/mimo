/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import java.math.BigDecimal;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Cost Estimate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentCostEstimateId <em>Shipment Cost Estimate Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierPartyId <em>Carrier Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePercent <em>Feature Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePrice <em>Feature Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdFrom <em>Geo Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderFlatPrice <em>Order Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderItemFlatPrice <em>Order Item Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderPricePercent <em>Order Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizePrice <em>Oversize Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizeUnit <em>Oversize Unit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceBreakId <em>Price Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUnitPrice <em>Price Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUomId <em>Price Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityBreakId <em>Quantity Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUnitPrice <em>Quantity Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShippingPricePercent <em>Shipping Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightBreakId <em>Weight Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUnitPrice <em>Weight Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUomId <em>Weight Uom Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate()
 * @model
 * @generated
 */
public interface ShipmentCostEstimate extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Carrier Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #setCarrierPartyId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_CarrierPartyId()
	 * @model
	 * @generated
	 */
	String getCarrierPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierPartyId <em>Carrier Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Party Id</em>' attribute.
	 * @see #getCarrierPartyId()
	 * @generated
	 */
	void setCarrierPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Carrier Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #setCarrierRoleTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_CarrierRoleTypeId()
	 * @model
	 * @generated
	 */
	String getCarrierRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getCarrierRoleTypeId <em>Carrier Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Role Type Id</em>' attribute.
	 * @see #getCarrierRoleTypeId()
	 * @generated
	 */
	void setCarrierRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Feature Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Percent</em>' attribute.
	 * @see #setFeaturePercent(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_FeaturePercent()
	 * @model
	 * @generated
	 */
	BigDecimal getFeaturePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePercent <em>Feature Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Percent</em>' attribute.
	 * @see #getFeaturePercent()
	 * @generated
	 */
	void setFeaturePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Feature Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Price</em>' attribute.
	 * @see #setFeaturePrice(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_FeaturePrice()
	 * @model
	 * @generated
	 */
	BigDecimal getFeaturePrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getFeaturePrice <em>Feature Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Price</em>' attribute.
	 * @see #getFeaturePrice()
	 * @generated
	 */
	void setFeaturePrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Geo Id From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id From</em>' attribute.
	 * @see #setGeoIdFrom(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_GeoIdFrom()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getGeoIdFrom();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdFrom <em>Geo Id From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id From</em>' attribute.
	 * @see #getGeoIdFrom()
	 * @generated
	 */
	void setGeoIdFrom(String value);

	/**
	 * Returns the value of the '<em><b>Geo Id To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geo Id To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geo Id To</em>' attribute.
	 * @see #setGeoIdTo(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_GeoIdTo()
	 * @model annotation="mimo-ent-domain frame='Geo'"
	 * @generated
	 */
	String getGeoIdTo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getGeoIdTo <em>Geo Id To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geo Id To</em>' attribute.
	 * @see #getGeoIdTo()
	 * @generated
	 */
	void setGeoIdTo(String value);

	/**
	 * Returns the value of the '<em><b>Order Flat Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Flat Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Flat Price</em>' attribute.
	 * @see #setOrderFlatPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OrderFlatPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getOrderFlatPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderFlatPrice <em>Order Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Flat Price</em>' attribute.
	 * @see #getOrderFlatPrice()
	 * @generated
	 */
	void setOrderFlatPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Item Flat Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Item Flat Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Item Flat Price</em>' attribute.
	 * @see #setOrderItemFlatPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OrderItemFlatPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getOrderItemFlatPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderItemFlatPrice <em>Order Item Flat Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Item Flat Price</em>' attribute.
	 * @see #getOrderItemFlatPrice()
	 * @generated
	 */
	void setOrderItemFlatPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Price Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Price Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Price Percent</em>' attribute.
	 * @see #setOrderPricePercent(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OrderPricePercent()
	 * @model
	 * @generated
	 */
	BigDecimal getOrderPricePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOrderPricePercent <em>Order Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Price Percent</em>' attribute.
	 * @see #getOrderPricePercent()
	 * @generated
	 */
	void setOrderPricePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Oversize Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oversize Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oversize Price</em>' attribute.
	 * @see #setOversizePrice(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OversizePrice()
	 * @model
	 * @generated
	 */
	BigDecimal getOversizePrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizePrice <em>Oversize Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversize Price</em>' attribute.
	 * @see #getOversizePrice()
	 * @generated
	 */
	void setOversizePrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Oversize Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oversize Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oversize Unit</em>' attribute.
	 * @see #setOversizeUnit(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_OversizeUnit()
	 * @model
	 * @generated
	 */
	BigDecimal getOversizeUnit();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getOversizeUnit <em>Oversize Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oversize Unit</em>' attribute.
	 * @see #getOversizeUnit()
	 * @generated
	 */
	void setOversizeUnit(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_PartyId()
	 * @model annotation="mimo-ent-domain frame='Party'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Price Break Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Break Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Break Id</em>' attribute.
	 * @see #setPriceBreakId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_PriceBreakId()
	 * @model annotation="mimo-ent-domain frame='QuantityBreak'"
	 * @generated
	 */
	String getPriceBreakId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceBreakId <em>Price Break Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Break Id</em>' attribute.
	 * @see #getPriceBreakId()
	 * @generated
	 */
	void setPriceBreakId(String value);

	/**
	 * Returns the value of the '<em><b>Price Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Unit Price</em>' attribute.
	 * @see #setPriceUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_PriceUnitPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getPriceUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUnitPrice <em>Price Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Unit Price</em>' attribute.
	 * @see #getPriceUnitPrice()
	 * @generated
	 */
	void setPriceUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Price Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Uom Id</em>' attribute.
	 * @see #setPriceUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_PriceUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getPriceUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getPriceUomId <em>Price Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Uom Id</em>' attribute.
	 * @see #getPriceUomId()
	 * @generated
	 */
	void setPriceUomId(String value);

	/**
	 * Returns the value of the '<em><b>Product Feature Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Feature Group Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Feature Group Id</em>' attribute.
	 * @see #setProductFeatureGroupId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ProductFeatureGroupId()
	 * @model
	 * @generated
	 */
	String getProductFeatureGroupId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductFeatureGroupId <em>Product Feature Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Feature Group Id</em>' attribute.
	 * @see #getProductFeatureGroupId()
	 * @generated
	 */
	void setProductFeatureGroupId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Id</em>' attribute.
	 * @see #setProductStoreId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ProductStoreId()
	 * @model
	 * @generated
	 */
	String getProductStoreId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreId <em>Product Store Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Id</em>' attribute.
	 * @see #getProductStoreId()
	 * @generated
	 */
	void setProductStoreId(String value);

	/**
	 * Returns the value of the '<em><b>Product Store Ship Meth Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Store Ship Meth Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Store Ship Meth Id</em>' attribute.
	 * @see #setProductStoreShipMethId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ProductStoreShipMethId()
	 * @model annotation="mimo-ent-domain frame='ProductStoreShipmentMeth'"
	 * @generated
	 */
	String getProductStoreShipMethId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Store Ship Meth Id</em>' attribute.
	 * @see #getProductStoreShipMethId()
	 * @generated
	 */
	void setProductStoreShipMethId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity Break Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Break Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Break Id</em>' attribute.
	 * @see #setQuantityBreakId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_QuantityBreakId()
	 * @model annotation="mimo-ent-domain frame='QuantityBreak'"
	 * @generated
	 */
	String getQuantityBreakId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityBreakId <em>Quantity Break Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Break Id</em>' attribute.
	 * @see #getQuantityBreakId()
	 * @generated
	 */
	void setQuantityBreakId(String value);

	/**
	 * Returns the value of the '<em><b>Quantity Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Unit Price</em>' attribute.
	 * @see #setQuantityUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_QuantityUnitPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getQuantityUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUnitPrice <em>Quantity Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Unit Price</em>' attribute.
	 * @see #getQuantityUnitPrice()
	 * @generated
	 */
	void setQuantityUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Quantity Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Uom Id</em>' attribute.
	 * @see #setQuantityUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_QuantityUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getQuantityUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getQuantityUomId <em>Quantity Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Uom Id</em>' attribute.
	 * @see #getQuantityUomId()
	 * @generated
	 */
	void setQuantityUomId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_RoleTypeId()
	 * @model annotation="mimo-ent-domain frame='RoleType'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Cost Estimate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Cost Estimate Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Cost Estimate Id</em>' attribute.
	 * @see #setShipmentCostEstimateId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ShipmentCostEstimateId()
	 * @model id="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getShipmentCostEstimateId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentCostEstimateId <em>Shipment Cost Estimate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Cost Estimate Id</em>' attribute.
	 * @see #getShipmentCostEstimateId()
	 * @generated
	 */
	void setShipmentCostEstimateId(String value);

	/**
	 * Returns the value of the '<em><b>Shipment Method Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipment Method Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #setShipmentMethodTypeId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ShipmentMethodTypeId()
	 * @model
	 * @generated
	 */
	String getShipmentMethodTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Method Type Id</em>' attribute.
	 * @see #getShipmentMethodTypeId()
	 * @generated
	 */
	void setShipmentMethodTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Shipping Price Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipping Price Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipping Price Percent</em>' attribute.
	 * @see #setShippingPricePercent(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_ShippingPricePercent()
	 * @model
	 * @generated
	 */
	BigDecimal getShippingPricePercent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getShippingPricePercent <em>Shipping Price Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipping Price Percent</em>' attribute.
	 * @see #getShippingPricePercent()
	 * @generated
	 */
	void setShippingPricePercent(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Weight Break Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Break Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Break Id</em>' attribute.
	 * @see #setWeightBreakId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_WeightBreakId()
	 * @model annotation="mimo-ent-domain frame='QuantityBreak'"
	 * @generated
	 */
	String getWeightBreakId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightBreakId <em>Weight Break Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Break Id</em>' attribute.
	 * @see #getWeightBreakId()
	 * @generated
	 */
	void setWeightBreakId(String value);

	/**
	 * Returns the value of the '<em><b>Weight Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Unit Price</em>' attribute.
	 * @see #setWeightUnitPrice(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_WeightUnitPrice()
	 * @model
	 * @generated
	 */
	BigDecimal getWeightUnitPrice();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUnitPrice <em>Weight Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Unit Price</em>' attribute.
	 * @see #getWeightUnitPrice()
	 * @generated
	 */
	void setWeightUnitPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Weight Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight Uom Id</em>' attribute.
	 * @see #setWeightUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentCostEstimate_WeightUomId()
	 * @model annotation="mimo-ent-domain frame='Uom'"
	 * @generated
	 */
	String getWeightUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentCostEstimate#getWeightUomId <em>Weight Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight Uom Id</em>' attribute.
	 * @see #getWeightUomId()
	 * @generated
	 */
	void setWeightUomId(String value);

} // ShipmentCostEstimate
