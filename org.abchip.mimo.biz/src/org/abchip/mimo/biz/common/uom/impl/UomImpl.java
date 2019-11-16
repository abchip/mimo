/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.common.uom.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.common.uom.UomPackage;
import org.abchip.mimo.biz.common.uom.UomType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomImpl#getNumericCode <em>Numeric Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomImpl#getUomTypeId <em>Uom Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.common.uom.impl.UomImpl#getMainUomConversions <em>Main Uom Conversions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UomImpl extends BizEntityTypedImpl<UomType> implements Uom {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UomPackage.Literals.UOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbbreviation() {
		return (String)eGet(UomPackage.Literals.UOM__ABBREVIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbreviation(String newAbbreviation) {
		eSet(UomPackage.Literals.UOM__ABBREVIATION, newAbbreviation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(UomPackage.Literals.UOM__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(UomPackage.Literals.UOM__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumericCode() {
		return (Long)eGet(UomPackage.Literals.UOM__NUMERIC_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumericCode(long newNumericCode) {
		eSet(UomPackage.Literals.UOM__NUMERIC_CODE, newNumericCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomType getUomTypeId() {
		return (UomType)eGet(UomPackage.Literals.UOM__UOM_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomTypeId(UomType newUomTypeId) {
		eSet(UomPackage.Literals.UOM__UOM_TYPE_ID, newUomTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getMainUomConversions() {
		return (List<String>)eGet(UomPackage.Literals.UOM__MAIN_UOM_CONVERSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> actualCurrencyPayments() {
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
	public List<String> availableTimeSubscriptions() {
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
	public List<String> billingAccountTerms() {
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
	public List<String> billingAccounts() {
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
	public List<String> billingWeightShipmentRouteSegments() {
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
	public List<String> cancelTimeSubscriptions() {
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
	public List<String> convToUomConversions() {
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
	public List<String> costComponentCalcs() {
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
	public List<String> currencyAcctgTransEntries() {
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
	public List<String> currencyCostComponents() {
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
	public List<String> currencyCustRequests() {
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
	public List<String> currencyFinAccounts() {
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
	public List<String> currencyInventoryItems() {
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
	public List<String> currencyInvoices() {
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
	public List<String> currencyPayments() {
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
	public List<String> currencyShipmentRouteSegments() {
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
	public List<String> currencyShipments() {
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
	public List<String> defaultProductMeterTypes() {
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
	public List<String> depthProducts() {
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
	public List<String> diameterProducts() {
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
	public List<String> dimensionFacilities() {
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
	public List<String> dimensionShipmentBoxTypes() {
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
	public List<String> dimensionShipmentPackages() {
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
	public List<String> elevationGeoPoints() {
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
	public List<String> facilitySizeFacilities() {
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
	public List<String> fixedAssets() {
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
	public List<String> gracePeriodSubscriptions() {
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
	public List<String> heightProducts() {
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
	public List<String> intervalFixedAssetMaints() {
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
	public List<String> intervalProductMaints() {
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
	public List<String> inventoryItems() {
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
	public List<String> invoiceItems() {
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
	public List<String> marketingCampaigns() {
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
	public List<String> maxLifeTimeSubscriptions() {
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
	public List<String> maximumAmountCustRequests() {
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
	public List<String> meterProductMeters() {
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
	public List<String> moneyWorkEfforts() {
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
	public List<String> orderHeaders() {
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
	public List<String> origCurrencyAcctgTransEntries() {
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
	public List<String> parties() {
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
	public List<String> partyAcctgPreferences() {
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
	public List<String> paymentGatewayResponses() {
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
	public List<String> periodTypes() {
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
	public List<String> priceShipmentCostEstimates() {
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
	public List<String> productFeatures() {
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
	public List<String> productStores() {
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
	public List<String> quantityProducts() {
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
	public List<String> quantitySalesForecastDetails() {
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
	public List<String> quantityShipmentCostEstimates() {
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
	public List<String> quoteItems() {
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
	public List<String> quotes() {
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
	public List<String> recurringFreqOrderItems() {
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
	public List<String> returnHeaders() {
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
	public List<String> salesForecastHistories() {
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
	public List<String> salesForecasts() {
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
	public List<String> salesOpportunities() {
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
	public List<String> salesOpportunityHistories() {
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
	public List<String> supplierProductFeatures() {
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
	public List<String> totalCubicOrderDeliverySchedules() {
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
	public List<String> totalWeightOrderDeliverySchedules() {
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
	public List<String> uomGroups() {
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
	public List<String> useTimeSubscriptions() {
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
	public List<String> weightFacilities() {
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
	public List<String> weightProducts() {
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
	public List<String> weightShipmentBoxTypes() {
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
	public List<String> weightShipmentCostEstimates() {
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
	public List<String> weightShipmentPackages() {
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
	public List<String> widthProducts() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UomPackage.UOM___ACTUAL_CURRENCY_PAYMENTS:
				return actualCurrencyPayments();
			case UomPackage.UOM___AVAILABLE_TIME_SUBSCRIPTIONS:
				return availableTimeSubscriptions();
			case UomPackage.UOM___BILLING_ACCOUNT_TERMS:
				return billingAccountTerms();
			case UomPackage.UOM___BILLING_ACCOUNTS:
				return billingAccounts();
			case UomPackage.UOM___BILLING_WEIGHT_SHIPMENT_ROUTE_SEGMENTS:
				return billingWeightShipmentRouteSegments();
			case UomPackage.UOM___CANCEL_TIME_SUBSCRIPTIONS:
				return cancelTimeSubscriptions();
			case UomPackage.UOM___CONV_TO_UOM_CONVERSIONS:
				return convToUomConversions();
			case UomPackage.UOM___COST_COMPONENT_CALCS:
				return costComponentCalcs();
			case UomPackage.UOM___CURRENCY_ACCTG_TRANS_ENTRIES:
				return currencyAcctgTransEntries();
			case UomPackage.UOM___CURRENCY_COST_COMPONENTS:
				return currencyCostComponents();
			case UomPackage.UOM___CURRENCY_CUST_REQUESTS:
				return currencyCustRequests();
			case UomPackage.UOM___CURRENCY_FIN_ACCOUNTS:
				return currencyFinAccounts();
			case UomPackage.UOM___CURRENCY_INVENTORY_ITEMS:
				return currencyInventoryItems();
			case UomPackage.UOM___CURRENCY_INVOICES:
				return currencyInvoices();
			case UomPackage.UOM___CURRENCY_PAYMENTS:
				return currencyPayments();
			case UomPackage.UOM___CURRENCY_SHIPMENT_ROUTE_SEGMENTS:
				return currencyShipmentRouteSegments();
			case UomPackage.UOM___CURRENCY_SHIPMENTS:
				return currencyShipments();
			case UomPackage.UOM___DEFAULT_PRODUCT_METER_TYPES:
				return defaultProductMeterTypes();
			case UomPackage.UOM___DEPTH_PRODUCTS:
				return depthProducts();
			case UomPackage.UOM___DIAMETER_PRODUCTS:
				return diameterProducts();
			case UomPackage.UOM___DIMENSION_FACILITIES:
				return dimensionFacilities();
			case UomPackage.UOM___DIMENSION_SHIPMENT_BOX_TYPES:
				return dimensionShipmentBoxTypes();
			case UomPackage.UOM___DIMENSION_SHIPMENT_PACKAGES:
				return dimensionShipmentPackages();
			case UomPackage.UOM___ELEVATION_GEO_POINTS:
				return elevationGeoPoints();
			case UomPackage.UOM___FACILITY_SIZE_FACILITIES:
				return facilitySizeFacilities();
			case UomPackage.UOM___FIXED_ASSETS:
				return fixedAssets();
			case UomPackage.UOM___GRACE_PERIOD_SUBSCRIPTIONS:
				return gracePeriodSubscriptions();
			case UomPackage.UOM___HEIGHT_PRODUCTS:
				return heightProducts();
			case UomPackage.UOM___INTERVAL_FIXED_ASSET_MAINTS:
				return intervalFixedAssetMaints();
			case UomPackage.UOM___INTERVAL_PRODUCT_MAINTS:
				return intervalProductMaints();
			case UomPackage.UOM___INVENTORY_ITEMS:
				return inventoryItems();
			case UomPackage.UOM___INVOICE_ITEMS:
				return invoiceItems();
			case UomPackage.UOM___MARKETING_CAMPAIGNS:
				return marketingCampaigns();
			case UomPackage.UOM___MAX_LIFE_TIME_SUBSCRIPTIONS:
				return maxLifeTimeSubscriptions();
			case UomPackage.UOM___MAXIMUM_AMOUNT_CUST_REQUESTS:
				return maximumAmountCustRequests();
			case UomPackage.UOM___METER_PRODUCT_METERS:
				return meterProductMeters();
			case UomPackage.UOM___MONEY_WORK_EFFORTS:
				return moneyWorkEfforts();
			case UomPackage.UOM___ORDER_HEADERS:
				return orderHeaders();
			case UomPackage.UOM___ORIG_CURRENCY_ACCTG_TRANS_ENTRIES:
				return origCurrencyAcctgTransEntries();
			case UomPackage.UOM___PARTIES:
				return parties();
			case UomPackage.UOM___PARTY_ACCTG_PREFERENCES:
				return partyAcctgPreferences();
			case UomPackage.UOM___PAYMENT_GATEWAY_RESPONSES:
				return paymentGatewayResponses();
			case UomPackage.UOM___PERIOD_TYPES:
				return periodTypes();
			case UomPackage.UOM___PRICE_SHIPMENT_COST_ESTIMATES:
				return priceShipmentCostEstimates();
			case UomPackage.UOM___PRODUCT_FEATURES:
				return productFeatures();
			case UomPackage.UOM___PRODUCT_STORES:
				return productStores();
			case UomPackage.UOM___QUANTITY_PRODUCTS:
				return quantityProducts();
			case UomPackage.UOM___QUANTITY_SALES_FORECAST_DETAILS:
				return quantitySalesForecastDetails();
			case UomPackage.UOM___QUANTITY_SHIPMENT_COST_ESTIMATES:
				return quantityShipmentCostEstimates();
			case UomPackage.UOM___QUOTE_ITEMS:
				return quoteItems();
			case UomPackage.UOM___QUOTES:
				return quotes();
			case UomPackage.UOM___RECURRING_FREQ_ORDER_ITEMS:
				return recurringFreqOrderItems();
			case UomPackage.UOM___RETURN_HEADERS:
				return returnHeaders();
			case UomPackage.UOM___SALES_FORECAST_HISTORIES:
				return salesForecastHistories();
			case UomPackage.UOM___SALES_FORECASTS:
				return salesForecasts();
			case UomPackage.UOM___SALES_OPPORTUNITIES:
				return salesOpportunities();
			case UomPackage.UOM___SALES_OPPORTUNITY_HISTORIES:
				return salesOpportunityHistories();
			case UomPackage.UOM___SUPPLIER_PRODUCT_FEATURES:
				return supplierProductFeatures();
			case UomPackage.UOM___TOTAL_CUBIC_ORDER_DELIVERY_SCHEDULES:
				return totalCubicOrderDeliverySchedules();
			case UomPackage.UOM___TOTAL_WEIGHT_ORDER_DELIVERY_SCHEDULES:
				return totalWeightOrderDeliverySchedules();
			case UomPackage.UOM___UOM_GROUPS:
				return uomGroups();
			case UomPackage.UOM___USE_TIME_SUBSCRIPTIONS:
				return useTimeSubscriptions();
			case UomPackage.UOM___WEIGHT_FACILITIES:
				return weightFacilities();
			case UomPackage.UOM___WEIGHT_PRODUCTS:
				return weightProducts();
			case UomPackage.UOM___WEIGHT_SHIPMENT_BOX_TYPES:
				return weightShipmentBoxTypes();
			case UomPackage.UOM___WEIGHT_SHIPMENT_COST_ESTIMATES:
				return weightShipmentCostEstimates();
			case UomPackage.UOM___WEIGHT_SHIPMENT_PACKAGES:
				return weightShipmentPackages();
			case UomPackage.UOM___WIDTH_PRODUCTS:
				return widthProducts();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUomId() {
		return (String)eGet(UomPackage.Literals.UOM__UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(String newUomId) {
		eSet(UomPackage.Literals.UOM__UOM_ID, newUomId);
	}

} //UomImpl
