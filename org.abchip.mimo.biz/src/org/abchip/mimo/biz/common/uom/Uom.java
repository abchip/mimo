/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom;

import java.util.List;

import org.abchip.mimo.biz.BizEntityTyped;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getNumericCode <em>Numeric Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getUomTypeId <em>Uom Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.Uom#getMainUomConversions <em>Main Uom Conversions</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface Uom extends BizEntityTyped<UomType> {
	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbreviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_Abbreviation()
	 * @model
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Numeric Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Code</em>' attribute.
	 * @see #setNumericCode(long)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_NumericCode()
	 * @model
	 * @generated
	 */
	long getNumericCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getNumericCode <em>Numeric Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Code</em>' attribute.
	 * @see #getNumericCode()
	 * @generated
	 */
	void setNumericCode(long value);

	/**
	 * Returns the value of the '<em><b>Uom Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Type Id</em>' reference.
	 * @see #setUomTypeId(UomType)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_UomTypeId()
	 * @model keys="uomTypeId"
	 * @generated
	 */
	UomType getUomTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getUomTypeId <em>Uom Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Type Id</em>' reference.
	 * @see #getUomTypeId()
	 * @generated
	 */
	void setUomTypeId(UomType value);

	/**
	 * Returns the value of the '<em><b>Main Uom Conversions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Uom Conversions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Uom Conversions</em>' attribute list.
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_MainUomConversions()
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UomConversion'"
	 * @generated
	 */
	List<String> getMainUomConversions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Payment' route='actualCurrencyUomId'"
	 * @generated
	 */
	List<String> actualCurrencyPayments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='availableTimeUomId'"
	 * @generated
	 */
	List<String> availableTimeSubscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BillingAccountTerm' route='uomId'"
	 * @generated
	 */
	List<String> billingAccountTerms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='BillingAccount' route='accountCurrencyUomId'"
	 * @generated
	 */
	List<String> billingAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment' route='billingWeightUomId'"
	 * @generated
	 */
	List<String> billingWeightShipmentRouteSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='canclAutmExtTimeUomId'"
	 * @generated
	 */
	List<String> cancelTimeSubscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UomConversion' route='uomIdTo'"
	 * @generated
	 */
	List<String> convToUomConversions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponentCalc' route='currencyUomId'"
	 * @generated
	 */
	List<String> costComponentCalcs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTransEntry' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyAcctgTransEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CostComponent' route='costUomId'"
	 * @generated
	 */
	List<String> currencyCostComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyCustRequests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FinAccount' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyFinAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItem' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyInventoryItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Invoice' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyInvoices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Payment' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyPayments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentRouteSegment' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyShipmentRouteSegments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Shipment' route='currencyUomId'"
	 * @generated
	 */
	List<String> currencyShipments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductMeterType' route='defaultUomId'"
	 * @generated
	 */
	List<String> defaultProductMeterTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='depthUomId'"
	 * @generated
	 */
	List<String> depthProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='diameterUomId'"
	 * @generated
	 */
	List<String> diameterProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Facility' route='defaultDimensionUomId'"
	 * @generated
	 */
	List<String> dimensionFacilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentBoxType' route='dimensionUomId'"
	 * @generated
	 */
	List<String> dimensionShipmentBoxTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentPackage' route='dimensionUomId'"
	 * @generated
	 */
	List<String> dimensionShipmentPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='GeoPoint' route='elevationUomId'"
	 * @generated
	 */
	List<String> elevationGeoPoints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Facility' route='facilitySizeUomId'"
	 * @generated
	 */
	List<String> facilitySizeFacilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAsset' route='uomId'"
	 * @generated
	 */
	List<String> fixedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='gracePeriodOnExpiryUomId'"
	 * @generated
	 */
	List<String> gracePeriodSubscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='heightUomId'"
	 * @generated
	 */
	List<String> heightProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='FixedAssetMaint' route='intervalUomId'"
	 * @generated
	 */
	List<String> intervalFixedAssetMaints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductMaint' route='intervalUomId'"
	 * @generated
	 */
	List<String> intervalProductMaints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InventoryItem' route='uomId'"
	 * @generated
	 */
	List<String> inventoryItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='InvoiceItem' route='uomId'"
	 * @generated
	 */
	List<String> invoiceItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='MarketingCampaign' route='currencyUomId'"
	 * @generated
	 */
	List<String> marketingCampaigns();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='maxLifeTimeUomId'"
	 * @generated
	 */
	List<String> maxLifeTimeSubscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='CustRequest' route='maximumAmountUomId'"
	 * @generated
	 */
	List<String> maximumAmountCustRequests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductMeter' route='meterUomId'"
	 * @generated
	 */
	List<String> meterProductMeters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='WorkEffort' route='moneyUomId'"
	 * @generated
	 */
	List<String> moneyWorkEfforts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderHeader' route='currencyUom'"
	 * @generated
	 */
	List<String> orderHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='AcctgTransEntry' route='origCurrencyUomId'"
	 * @generated
	 */
	List<String> origCurrencyAcctgTransEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Party' route='preferredCurrencyUomId'"
	 * @generated
	 */
	List<String> parties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PartyAcctgPreference' route='baseCurrencyUomId'"
	 * @generated
	 */
	List<String> partyAcctgPreferences();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PaymentGatewayResponse' route='currencyUomId'"
	 * @generated
	 */
	List<String> paymentGatewayResponses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='PeriodType' route='uomId'"
	 * @generated
	 */
	List<String> periodTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='priceUomId'"
	 * @generated
	 */
	List<String> priceShipmentCostEstimates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductFeature' route='uomId'"
	 * @generated
	 */
	List<String> productFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ProductStore' route='defaultCurrencyUomId'"
	 * @generated
	 */
	List<String> productStores();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='quantityUomId'"
	 * @generated
	 */
	List<String> quantityProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecastDetail' route='quantityUomId'"
	 * @generated
	 */
	List<String> quantitySalesForecastDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='quantityUomId'"
	 * @generated
	 */
	List<String> quantityShipmentCostEstimates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='QuoteItem' route='uomId'"
	 * @generated
	 */
	List<String> quoteItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Quote' route='currencyUomId'"
	 * @generated
	 */
	List<String> quotes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderItem' route='recurringFreqUomId'"
	 * @generated
	 */
	List<String> recurringFreqOrderItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ReturnHeader' route='currencyUomId'"
	 * @generated
	 */
	List<String> returnHeaders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecastHistory' route='currencyUomId'"
	 * @generated
	 */
	List<String> salesForecastHistories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesForecast' route='currencyUomId'"
	 * @generated
	 */
	List<String> salesForecasts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunity' route='currencyUomId'"
	 * @generated
	 */
	List<String> salesOpportunities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SalesOpportunityHistory' route='currencyUomId'"
	 * @generated
	 */
	List<String> salesOpportunityHistories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='SupplierProductFeature' route='uomId'"
	 * @generated
	 */
	List<String> supplierProductFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderDeliverySchedule' route='totalCubicUomId'"
	 * @generated
	 */
	List<String> totalCubicOrderDeliverySchedules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='OrderDeliverySchedule' route='totalWeightUomId'"
	 * @generated
	 */
	List<String> totalWeightOrderDeliverySchedules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='UomGroup' route='uomId'"
	 * @generated
	 */
	List<String> uomGroups();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Subscription' route='useTimeUomId'"
	 * @generated
	 */
	List<String> useTimeSubscriptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Facility' route='defaultWeightUomId'"
	 * @generated
	 */
	List<String> weightFacilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='weightUomId'"
	 * @generated
	 */
	List<String> weightProducts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentBoxType' route='weightUomId'"
	 * @generated
	 */
	List<String> weightShipmentBoxTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentCostEstimate' route='weightUomId'"
	 * @generated
	 */
	List<String> weightShipmentCostEstimates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='ShipmentPackage' route='weightUomId'"
	 * @generated
	 */
	List<String> weightShipmentPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="mimo-ent-slot derived='true'"
	 *        annotation="mimo-ent-domain frame='Product' route='widthUomId'"
	 * @generated
	 */
	List<String> widthProducts();

	/**
	 * Returns the value of the '<em><b>Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uom Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uom Id</em>' attribute.
	 * @see #setUomId(String)
	 * @see org.abchip.mimo.biz.common.uom.UomPackage#getUom_UomId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	String getUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.common.uom.Uom#getUomId <em>Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uom Id</em>' attribute.
	 * @see #getUomId()
	 * @generated
	 */
	void setUomId(String value);

} // Uom
