/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getGeoIdFrom <em>Geo Id From</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getGeoIdTo <em>Geo Id To</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderFlatPrice <em>Order Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderItemFlatPrice <em>Order Item Flat Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOrderPricePercent <em>Order Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOversizePrice <em>Oversize Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getOversizeUnit <em>Oversize Unit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceBreakId <em>Price Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceUnitPrice <em>Price Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getPriceUomId <em>Price Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductFeatureGroupId <em>Product Feature Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityBreakId <em>Quantity Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityUnitPrice <em>Quantity Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getQuantityUomId <em>Quantity Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getShippingPricePercent <em>Shipping Price Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightBreakId <em>Weight Break Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightUnitPrice <em>Weight Unit Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentCostEstimateImpl#getWeightUomId <em>Weight Uom Id</em>}</li>
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
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierPartyId(String newCarrierPartyId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_PARTY_ID, newCarrierPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCarrierRoleTypeId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCarrierRoleTypeId(String newCarrierRoleTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__CARRIER_ROLE_TYPE_ID, newCarrierRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFeaturePercent() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturePercent(BigDecimal newFeaturePercent) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PERCENT, newFeaturePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFeaturePrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeaturePrice(BigDecimal newFeaturePrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__FEATURE_PRICE, newFeaturePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdFrom() {
		return (Geo)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdFrom(Geo newGeoIdFrom) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_FROM, newGeoIdFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getGeoIdTo() {
		return (Geo)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeoIdTo(Geo newGeoIdTo) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__GEO_ID_TO, newGeoIdTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderFlatPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderFlatPrice(BigDecimal newOrderFlatPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_FLAT_PRICE, newOrderFlatPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderItemFlatPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderItemFlatPrice(BigDecimal newOrderItemFlatPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_ITEM_FLAT_PRICE, newOrderItemFlatPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOrderPricePercent() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderPricePercent(BigDecimal newOrderPricePercent) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ORDER_PRICE_PERCENT, newOrderPricePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOversizePrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizePrice(BigDecimal newOversizePrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_PRICE, newOversizePrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOversizeUnit() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOversizeUnit(BigDecimal newOversizeUnit) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__OVERSIZE_UNIT, newOversizeUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getPriceBreakId() {
		return (QuantityBreak)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceBreakId(QuantityBreak newPriceBreakId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_BREAK_ID, newPriceBreakId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getPriceUnitPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceUnitPrice(BigDecimal newPriceUnitPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UNIT_PRICE, newPriceUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getPriceUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriceUomId(Uom newPriceUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRICE_UOM_ID, newPriceUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductFeatureGroupId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductFeatureGroupId(String newProductFeatureGroupId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_FEATURE_GROUP_ID, newProductFeatureGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductStoreShipmentMeth getProductStoreShipMethId() {
		return (ProductStoreShipmentMeth)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreShipMethId(ProductStoreShipmentMeth newProductStoreShipMethId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__PRODUCT_STORE_SHIP_METH_ID, newProductStoreShipMethId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getQuantityBreakId() {
		return (QuantityBreak)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityBreakId(QuantityBreak newQuantityBreakId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_BREAK_ID, newQuantityBreakId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantityUnitPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUnitPrice(BigDecimal newQuantityUnitPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UNIT_PRICE, newQuantityUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getQuantityUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantityUomId(Uom newQuantityUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__QUANTITY_UOM_ID, newQuantityUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleType getRoleTypeId() {
		return (RoleType)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(RoleType newRoleTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentCostEstimateId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentCostEstimateId(String newShipmentCostEstimateId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_COST_ESTIMATE_ID, newShipmentCostEstimateId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentMethodTypeId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(String newShipmentMethodTypeId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPMENT_METHOD_TYPE_ID, newShipmentMethodTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShippingPricePercent() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingPricePercent(BigDecimal newShippingPricePercent) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__SHIPPING_PRICE_PERCENT, newShippingPricePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityBreak getWeightBreakId() {
		return (QuantityBreak)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightBreakId(QuantityBreak newWeightBreakId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_BREAK_ID, newWeightBreakId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getWeightUnitPrice() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUnitPrice(BigDecimal newWeightUnitPrice) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UNIT_PRICE, newWeightUnitPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getWeightUomId() {
		return (Uom)eGet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeightUomId(Uom newWeightUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_COST_ESTIMATE__WEIGHT_UOM_ID, newWeightUomId);
	}

} //ShipmentCostEstimateImpl
