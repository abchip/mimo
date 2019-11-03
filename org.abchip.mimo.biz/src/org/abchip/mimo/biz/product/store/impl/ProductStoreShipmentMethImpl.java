/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.product.store.impl;

import java.math.BigDecimal;
import java.util.List;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.product.store.ProductStoreShipmentMeth;
import org.abchip.mimo.biz.product.store.StorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getProductStoreShipMethId() <em>Product Store Ship Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreShipMethId()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_STORE_SHIP_METH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductStoreShipMethId() <em>Product Store Ship Meth Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductStoreShipMethId()
	 * @generated
	 * @ordered
	 */
	protected String productStoreShipMethId = PRODUCT_STORE_SHIP_METH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowCompanyAddr() <em>Allow Company Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowCompanyAddr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_COMPANY_ADDR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowCompanyAddr() <em>Allow Company Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowCompanyAddr()
	 * @generated
	 * @ordered
	 */
	protected boolean allowCompanyAddr = ALLOW_COMPANY_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowUspsAddr() <em>Allow Usps Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowUspsAddr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_USPS_ADDR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowUspsAddr() <em>Allow Usps Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowUspsAddr()
	 * @generated
	 * @ordered
	 */
	protected boolean allowUspsAddr = ALLOW_USPS_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowancePercent() <em>Allowance Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowancePercent()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ALLOWANCE_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowancePercent() <em>Allowance Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowancePercent()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal allowancePercent = ALLOWANCE_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyPartyId() <em>Company Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyPartyId() <em>Company Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyPartyId()
	 * @generated
	 * @ordered
	 */
	protected String companyPartyId = COMPANY_PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigProps() <em>Config Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigProps()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_PROPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigProps() <em>Config Props</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigProps()
	 * @generated
	 * @ordered
	 */
	protected String configProps = CONFIG_PROPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeFeatureGroup() <em>Exclude Feature Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_FEATURE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeFeatureGroup() <em>Exclude Feature Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected String excludeFeatureGroup = EXCLUDE_FEATURE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeGeoId() <em>Exclude Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeGeoId() <em>Exclude Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeGeoId()
	 * @generated
	 * @ordered
	 */
	protected String excludeGeoId = EXCLUDE_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeFeatureGroup() <em>Include Feature Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_FEATURE_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeFeatureGroup() <em>Include Feature Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected String includeFeatureGroup = INCLUDE_FEATURE_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeGeoId() <em>Include Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeGeoId() <em>Include Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeGeoId()
	 * @generated
	 * @ordered
	 */
	protected String includeGeoId = INCLUDE_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncludeNoChargeItems() <em>Include No Charge Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeNoChargeItems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_NO_CHARGE_ITEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncludeNoChargeItems() <em>Include No Charge Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeNoChargeItems()
	 * @generated
	 * @ordered
	 */
	protected boolean includeNoChargeItems = INCLUDE_NO_CHARGE_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MAX_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maxSize = MAX_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTotal() <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MAX_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTotal() <em>Max Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maxTotal = MAX_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxWeight() <em>Max Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MAX_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxWeight() <em>Max Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maxWeight = MAX_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinSize() <em>Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minSize = MIN_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTotal() <em>Min Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_TOTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinTotal() <em>Min Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minTotal = MIN_TOTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinWeight() <em>Min Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinWeight() <em>Min Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minWeight = MIN_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumPrice() <em>Minimum Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MINIMUM_PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumPrice() <em>Minimum Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minimumPrice = MINIMUM_PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

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
	 * The default value of the '{@link #isRequireCompanyAddr() <em>Require Company Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCompanyAddr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_COMPANY_ADDR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireCompanyAddr() <em>Require Company Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireCompanyAddr()
	 * @generated
	 * @ordered
	 */
	protected boolean requireCompanyAddr = REQUIRE_COMPANY_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireUspsAddr() <em>Require Usps Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireUspsAddr()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_USPS_ADDR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireUspsAddr() <em>Require Usps Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireUspsAddr()
	 * @generated
	 * @ordered
	 */
	protected boolean requireUspsAddr = REQUIRE_USPS_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUMBER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentCustomMethodId() <em>Shipment Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_CUSTOM_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentCustomMethodId() <em>Shipment Custom Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentCustomMethodId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentCustomMethodId = SHIPMENT_CUSTOM_METHOD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipmentGatewayConfigId() <em>Shipment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipmentGatewayConfigId() <em>Shipment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected String shipmentGatewayConfigId = SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT;

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
		return allowancePercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowancePercent(BigDecimal newAllowancePercent) {
		BigDecimal oldAllowancePercent = allowancePercent;
		allowancePercent = newAllowancePercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT, oldAllowancePercent, allowancePercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompanyPartyId() {
		return companyPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompanyPartyId(String newCompanyPartyId) {
		String oldCompanyPartyId = companyPartyId;
		companyPartyId = newCompanyPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID, oldCompanyPartyId, companyPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigProps() {
		return configProps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigProps(String newConfigProps) {
		String oldConfigProps = configProps;
		configProps = newConfigProps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS, oldConfigProps, configProps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExcludeFeatureGroup() {
		return excludeFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeFeatureGroup(String newExcludeFeatureGroup) {
		String oldExcludeFeatureGroup = excludeFeatureGroup;
		excludeFeatureGroup = newExcludeFeatureGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP, oldExcludeFeatureGroup, excludeFeatureGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExcludeGeoId() {
		return excludeGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcludeGeoId(String newExcludeGeoId) {
		String oldExcludeGeoId = excludeGeoId;
		excludeGeoId = newExcludeGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID, oldExcludeGeoId, excludeGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeFeatureGroup() {
		return includeFeatureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeFeatureGroup(String newIncludeFeatureGroup) {
		String oldIncludeFeatureGroup = includeFeatureGroup;
		includeFeatureGroup = newIncludeFeatureGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP, oldIncludeFeatureGroup, includeFeatureGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIncludeGeoId() {
		return includeGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeGeoId(String newIncludeGeoId) {
		String oldIncludeGeoId = includeGeoId;
		includeGeoId = newIncludeGeoId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID, oldIncludeGeoId, includeGeoId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeNoChargeItems() {
		return includeNoChargeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeNoChargeItems(boolean newIncludeNoChargeItems) {
		boolean oldIncludeNoChargeItems = includeNoChargeItems;
		includeNoChargeItems = newIncludeNoChargeItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS, oldIncludeNoChargeItems, includeNoChargeItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(BigDecimal newMaxSize) {
		BigDecimal oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE, oldMaxSize, maxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxTotal() {
		return maxTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTotal(BigDecimal newMaxTotal) {
		BigDecimal oldMaxTotal = maxTotal;
		maxTotal = newMaxTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL, oldMaxTotal, maxTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxWeight() {
		return maxWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWeight(BigDecimal newMaxWeight) {
		BigDecimal oldMaxWeight = maxWeight;
		maxWeight = newMaxWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT, oldMaxWeight, maxWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinSize() {
		return minSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinSize(BigDecimal newMinSize) {
		BigDecimal oldMinSize = minSize;
		minSize = newMinSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE, oldMinSize, minSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinTotal() {
		return minTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTotal(BigDecimal newMinTotal) {
		BigDecimal oldMinTotal = minTotal;
		minTotal = newMinTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL, oldMinTotal, minTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinWeight() {
		return minWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinWeight(BigDecimal newMinWeight) {
		BigDecimal oldMinWeight = minWeight;
		minWeight = newMinWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT, oldMinWeight, minWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinimumPrice() {
		return minimumPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumPrice(BigDecimal newMinimumPrice) {
		BigDecimal oldMinimumPrice = minimumPrice;
		minimumPrice = newMinimumPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE, oldMinimumPrice, minimumPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__PARTY_ID, oldPartyId, partyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID, oldProductStoreId, productStoreId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireCompanyAddr() {
		return requireCompanyAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireCompanyAddr(boolean newRequireCompanyAddr) {
		boolean oldRequireCompanyAddr = requireCompanyAddr;
		requireCompanyAddr = newRequireCompanyAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR, oldRequireCompanyAddr, requireCompanyAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireUspsAddr() {
		return requireUspsAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireUspsAddr(boolean newRequireUspsAddr) {
		boolean oldRequireUspsAddr = requireUspsAddr;
		requireUspsAddr = newRequireUspsAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR, oldRequireUspsAddr, requireUspsAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductStoreShipMethId() {
		return productStoreShipMethId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductStoreShipMethId(String newProductStoreShipMethId) {
		String oldProductStoreShipMethId = productStoreShipMethId;
		productStoreShipMethId = newProductStoreShipMethId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID, oldProductStoreShipMethId, productStoreShipMethId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowCompanyAddr() {
		return allowCompanyAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowCompanyAddr(boolean newAllowCompanyAddr) {
		boolean oldAllowCompanyAddr = allowCompanyAddr;
		allowCompanyAddr = newAllowCompanyAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR, oldAllowCompanyAddr, allowCompanyAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowUspsAddr() {
		return allowUspsAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowUspsAddr(boolean newAllowUspsAddr) {
		boolean oldAllowUspsAddr = allowUspsAddr;
		allowUspsAddr = newAllowUspsAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR, oldAllowUspsAddr, allowUspsAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		String oldRoleTypeId = roleTypeId;
		roleTypeId = newRoleTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID, oldRoleTypeId, roleTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNumber(long newSequenceNumber) {
		long oldSequenceNumber = sequenceNumber;
		sequenceNumber = newSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER, oldSequenceNumber, sequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentCustomMethodId() {
		return shipmentCustomMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentCustomMethodId(String newShipmentCustomMethodId) {
		String oldShipmentCustomMethodId = shipmentCustomMethodId;
		shipmentCustomMethodId = newShipmentCustomMethodId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID, oldShipmentCustomMethodId, shipmentCustomMethodId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipmentGatewayConfigId() {
		return shipmentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipmentGatewayConfigId(String newShipmentGatewayConfigId) {
		String oldShipmentGatewayConfigId = shipmentGatewayConfigId;
		shipmentGatewayConfigId = newShipmentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID, oldShipmentGatewayConfigId, shipmentGatewayConfigId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID, oldShipmentMethodTypeId, shipmentMethodTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shipmentCostEstimates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID:
				return getProductStoreShipMethId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR:
				return isAllowCompanyAddr();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR:
				return isAllowUspsAddr();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT:
				return getAllowancePercent();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID:
				return getCompanyPartyId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS:
				return getConfigProps();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP:
				return getExcludeFeatureGroup();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID:
				return getExcludeGeoId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP:
				return getIncludeFeatureGroup();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID:
				return getIncludeGeoId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS:
				return isIncludeNoChargeItems();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE:
				return getMaxSize();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL:
				return getMaxTotal();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT:
				return getMaxWeight();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE:
				return getMinSize();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL:
				return getMinTotal();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT:
				return getMinWeight();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE:
				return getMinimumPrice();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PARTY_ID:
				return getPartyId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID:
				return getProductStoreId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR:
				return isRequireCompanyAddr();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR:
				return isRequireUspsAddr();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID:
				return getRoleTypeId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER:
				return getSequenceNumber();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME:
				return getServiceName();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID:
				return getShipmentCustomMethodId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID:
				return getShipmentGatewayConfigId();
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID:
				return getShipmentMethodTypeId();
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
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID:
				setProductStoreShipMethId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR:
				setAllowCompanyAddr((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR:
				setAllowUspsAddr((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT:
				setAllowancePercent((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID:
				setCompanyPartyId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS:
				setConfigProps((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP:
				setExcludeFeatureGroup((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID:
				setExcludeGeoId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP:
				setIncludeFeatureGroup((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID:
				setIncludeGeoId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS:
				setIncludeNoChargeItems((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE:
				setMaxSize((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL:
				setMaxTotal((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT:
				setMaxWeight((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE:
				setMinSize((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL:
				setMinTotal((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT:
				setMinWeight((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE:
				setMinimumPrice((BigDecimal)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID:
				setProductStoreId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR:
				setRequireCompanyAddr((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR:
				setRequireUspsAddr((Boolean)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER:
				setSequenceNumber((Long)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID:
				setShipmentCustomMethodId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID:
				setShipmentGatewayConfigId((String)newValue);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId((String)newValue);
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
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID:
				setProductStoreShipMethId(PRODUCT_STORE_SHIP_METH_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR:
				setAllowCompanyAddr(ALLOW_COMPANY_ADDR_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR:
				setAllowUspsAddr(ALLOW_USPS_ADDR_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT:
				setAllowancePercent(ALLOWANCE_PERCENT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID:
				setCompanyPartyId(COMPANY_PARTY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS:
				setConfigProps(CONFIG_PROPS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP:
				setExcludeFeatureGroup(EXCLUDE_FEATURE_GROUP_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID:
				setExcludeGeoId(EXCLUDE_GEO_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP:
				setIncludeFeatureGroup(INCLUDE_FEATURE_GROUP_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID:
				setIncludeGeoId(INCLUDE_GEO_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS:
				setIncludeNoChargeItems(INCLUDE_NO_CHARGE_ITEMS_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL:
				setMaxTotal(MAX_TOTAL_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT:
				setMaxWeight(MAX_WEIGHT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE:
				setMinSize(MIN_SIZE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL:
				setMinTotal(MIN_TOTAL_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT:
				setMinWeight(MIN_WEIGHT_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE:
				setMinimumPrice(MINIMUM_PRICE_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID:
				setProductStoreId(PRODUCT_STORE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR:
				setRequireCompanyAddr(REQUIRE_COMPANY_ADDR_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR:
				setRequireUspsAddr(REQUIRE_USPS_ADDR_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER:
				setSequenceNumber(SEQUENCE_NUMBER_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID:
				setShipmentCustomMethodId(SHIPMENT_CUSTOM_METHOD_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID:
				setShipmentGatewayConfigId(SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT);
				return;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID:
				setShipmentMethodTypeId(SHIPMENT_METHOD_TYPE_ID_EDEFAULT);
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
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_SHIP_METH_ID:
				return PRODUCT_STORE_SHIP_METH_ID_EDEFAULT == null ? productStoreShipMethId != null : !PRODUCT_STORE_SHIP_METH_ID_EDEFAULT.equals(productStoreShipMethId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_COMPANY_ADDR:
				return allowCompanyAddr != ALLOW_COMPANY_ADDR_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOW_USPS_ADDR:
				return allowUspsAddr != ALLOW_USPS_ADDR_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ALLOWANCE_PERCENT:
				return ALLOWANCE_PERCENT_EDEFAULT == null ? allowancePercent != null : !ALLOWANCE_PERCENT_EDEFAULT.equals(allowancePercent);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__COMPANY_PARTY_ID:
				return COMPANY_PARTY_ID_EDEFAULT == null ? companyPartyId != null : !COMPANY_PARTY_ID_EDEFAULT.equals(companyPartyId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__CONFIG_PROPS:
				return CONFIG_PROPS_EDEFAULT == null ? configProps != null : !CONFIG_PROPS_EDEFAULT.equals(configProps);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_FEATURE_GROUP:
				return EXCLUDE_FEATURE_GROUP_EDEFAULT == null ? excludeFeatureGroup != null : !EXCLUDE_FEATURE_GROUP_EDEFAULT.equals(excludeFeatureGroup);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__EXCLUDE_GEO_ID:
				return EXCLUDE_GEO_ID_EDEFAULT == null ? excludeGeoId != null : !EXCLUDE_GEO_ID_EDEFAULT.equals(excludeGeoId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_FEATURE_GROUP:
				return INCLUDE_FEATURE_GROUP_EDEFAULT == null ? includeFeatureGroup != null : !INCLUDE_FEATURE_GROUP_EDEFAULT.equals(includeFeatureGroup);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_GEO_ID:
				return INCLUDE_GEO_ID_EDEFAULT == null ? includeGeoId != null : !INCLUDE_GEO_ID_EDEFAULT.equals(includeGeoId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__INCLUDE_NO_CHARGE_ITEMS:
				return includeNoChargeItems != INCLUDE_NO_CHARGE_ITEMS_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_SIZE:
				return MAX_SIZE_EDEFAULT == null ? maxSize != null : !MAX_SIZE_EDEFAULT.equals(maxSize);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_TOTAL:
				return MAX_TOTAL_EDEFAULT == null ? maxTotal != null : !MAX_TOTAL_EDEFAULT.equals(maxTotal);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MAX_WEIGHT:
				return MAX_WEIGHT_EDEFAULT == null ? maxWeight != null : !MAX_WEIGHT_EDEFAULT.equals(maxWeight);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_SIZE:
				return MIN_SIZE_EDEFAULT == null ? minSize != null : !MIN_SIZE_EDEFAULT.equals(minSize);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_TOTAL:
				return MIN_TOTAL_EDEFAULT == null ? minTotal != null : !MIN_TOTAL_EDEFAULT.equals(minTotal);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MIN_WEIGHT:
				return MIN_WEIGHT_EDEFAULT == null ? minWeight != null : !MIN_WEIGHT_EDEFAULT.equals(minWeight);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__MINIMUM_PRICE:
				return MINIMUM_PRICE_EDEFAULT == null ? minimumPrice != null : !MINIMUM_PRICE_EDEFAULT.equals(minimumPrice);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__PRODUCT_STORE_ID:
				return PRODUCT_STORE_ID_EDEFAULT == null ? productStoreId != null : !PRODUCT_STORE_ID_EDEFAULT.equals(productStoreId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_COMPANY_ADDR:
				return requireCompanyAddr != REQUIRE_COMPANY_ADDR_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__REQUIRE_USPS_ADDR:
				return requireUspsAddr != REQUIRE_USPS_ADDR_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SEQUENCE_NUMBER:
				return sequenceNumber != SEQUENCE_NUMBER_EDEFAULT;
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_CUSTOM_METHOD_ID:
				return SHIPMENT_CUSTOM_METHOD_ID_EDEFAULT == null ? shipmentCustomMethodId != null : !SHIPMENT_CUSTOM_METHOD_ID_EDEFAULT.equals(shipmentCustomMethodId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_GATEWAY_CONFIG_ID:
				return SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT == null ? shipmentGatewayConfigId != null : !SHIPMENT_GATEWAY_CONFIG_ID_EDEFAULT.equals(shipmentGatewayConfigId);
			case StorePackage.PRODUCT_STORE_SHIPMENT_METH__SHIPMENT_METHOD_TYPE_ID:
				return SHIPMENT_METHOD_TYPE_ID_EDEFAULT == null ? shipmentMethodTypeId != null : !SHIPMENT_METHOD_TYPE_ID_EDEFAULT.equals(shipmentMethodTypeId);
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
		result.append(" (productStoreShipMethId: ");
		result.append(productStoreShipMethId);
		result.append(", allowCompanyAddr: ");
		result.append(allowCompanyAddr);
		result.append(", allowUspsAddr: ");
		result.append(allowUspsAddr);
		result.append(", allowancePercent: ");
		result.append(allowancePercent);
		result.append(", companyPartyId: ");
		result.append(companyPartyId);
		result.append(", configProps: ");
		result.append(configProps);
		result.append(", excludeFeatureGroup: ");
		result.append(excludeFeatureGroup);
		result.append(", excludeGeoId: ");
		result.append(excludeGeoId);
		result.append(", includeFeatureGroup: ");
		result.append(includeFeatureGroup);
		result.append(", includeGeoId: ");
		result.append(includeGeoId);
		result.append(", includeNoChargeItems: ");
		result.append(includeNoChargeItems);
		result.append(", maxSize: ");
		result.append(maxSize);
		result.append(", maxTotal: ");
		result.append(maxTotal);
		result.append(", maxWeight: ");
		result.append(maxWeight);
		result.append(", minSize: ");
		result.append(minSize);
		result.append(", minTotal: ");
		result.append(minTotal);
		result.append(", minWeight: ");
		result.append(minWeight);
		result.append(", minimumPrice: ");
		result.append(minimumPrice);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", productStoreId: ");
		result.append(productStoreId);
		result.append(", requireCompanyAddr: ");
		result.append(requireCompanyAddr);
		result.append(", requireUspsAddr: ");
		result.append(requireUspsAddr);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", sequenceNumber: ");
		result.append(sequenceNumber);
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(", shipmentCustomMethodId: ");
		result.append(shipmentCustomMethodId);
		result.append(", shipmentGatewayConfigId: ");
		result.append(shipmentGatewayConfigId);
		result.append(", shipmentMethodTypeId: ");
		result.append(shipmentMethodTypeId);
		result.append(')');
		return result.toString();
	}

} //ProductStoreShipmentMethImpl
