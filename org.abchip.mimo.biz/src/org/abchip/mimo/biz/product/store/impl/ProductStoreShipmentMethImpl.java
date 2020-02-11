/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.math.BigDecimal;
import org.abchip.mimo.biz.common.geo.Geo;
import org.abchip.mimo.biz.common.method.CustomMethod;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayConfig;
import org.abchip.mimo.biz.shipment.shipment.ShipmentMethodType;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Store Shipment Meth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getProductStoreShipMethId <em>Product Store Ship Meth Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#isAllowCompanyAddr <em>Allow Company Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#isAllowUspsAddr <em>Allow Usps Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getAllowancePercent <em>Allowance Percent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getCompanyPartyId <em>Company Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getConfigProps <em>Config Props</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getExcludeFeatureGroup <em>Exclude Feature Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getExcludeGeoId <em>Exclude Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getIncludeFeatureGroup <em>Include Feature Group</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getIncludeGeoId <em>Include Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#isIncludeNoChargeItems <em>Include No Charge Items</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getMaxTotal <em>Max Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getMaxWeight <em>Max Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getMinSize <em>Min Size</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getMinTotal <em>Min Total</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getMinWeight <em>Min Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getMinimumPrice <em>Minimum Price</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getProductStoreId <em>Product Store Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#isRequireCompanyAddr <em>Require Company Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#isRequireUspsAddr <em>Require Usps Addr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getShipmentCustomMethodId <em>Shipment Custom Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getShipmentGatewayConfigId <em>Shipment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.product.store.impl.ProductStoreShipmentMethImpl#getShipmentMethodTypeId <em>Shipment Method Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductStoreShipmentMethImpl extends BizEntityImpl implements ProductStoreShipmentMeth {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductStoreShipmentMethImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAllowancePercent() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowancePercent(BigDecimal newAllowancePercent) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT, newAllowancePercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getCompanyPartyId() {
		return (Party)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyPartyId(Party newCompanyPartyId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID, newCompanyPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigProps() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigProps(String newConfigProps) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS, newConfigProps);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExcludeFeatureGroup() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeFeatureGroup(String newExcludeFeatureGroup) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP, newExcludeFeatureGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getExcludeGeoId() {
		return (Geo)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeGeoId(Geo newExcludeGeoId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID, newExcludeGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeFeatureGroup() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeFeatureGroup(String newIncludeFeatureGroup) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP, newIncludeFeatureGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeNoChargeItems() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeNoChargeItems(boolean newIncludeNoChargeItems) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS, newIncludeNoChargeItems);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Geo getIncludeGeoId() {
		return (Geo)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeGeoId(Geo newIncludeGeoId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID, newIncludeGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxSize() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(BigDecimal newMaxSize) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE, newMaxSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxTotal() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTotal(BigDecimal newMaxTotal) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL, newMaxTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxWeight() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWeight(BigDecimal newMaxWeight) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT, newMaxWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinSize() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSize(BigDecimal newMinSize) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE, newMinSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinTotal() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTotal(BigDecimal newMinTotal) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL, newMinTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinWeight() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinWeight(BigDecimal newMinWeight) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT, newMinWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinimumPrice() {
		return (BigDecimal)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumPrice(BigDecimal newMinimumPrice) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE, newMinimumPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreId(String newProductStoreId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID, newProductStoreId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireCompanyAddr() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireCompanyAddr(boolean newRequireCompanyAddr) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR, newRequireCompanyAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireUspsAddr() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireUspsAddr(boolean newRequireUspsAddr) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR, newRequireUspsAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreShipMethId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreShipMethId(String newProductStoreShipMethId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID, newProductStoreShipMethId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowCompanyAddr() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowCompanyAddr(boolean newAllowCompanyAddr) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR, newAllowCompanyAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowUspsAddr() {
		return (Boolean)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowUspsAddr(boolean newAllowUspsAddr) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR, newAllowUspsAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNumber() {
		return (Long)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNumber(long newSequenceNumber) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER, newSequenceNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return (String)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME, newServiceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomMethod getShipmentCustomMethodId() {
		return (CustomMethod)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentCustomMethodId(CustomMethod newShipmentCustomMethodId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID, newShipmentCustomMethodId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentGatewayConfig getShipmentGatewayConfigId() {
		return (ShipmentGatewayConfig)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentGatewayConfigId(ShipmentGatewayConfig newShipmentGatewayConfigId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID, newShipmentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShipmentMethodType getShipmentMethodTypeId() {
		return (ShipmentMethodType)eGet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentMethodTypeId(ShipmentMethodType newShipmentMethodTypeId) {
		eSet(StorePackage.Literals.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID, newShipmentMethodTypeId);
	}

} //ProductStoreShipmentMethImpl
