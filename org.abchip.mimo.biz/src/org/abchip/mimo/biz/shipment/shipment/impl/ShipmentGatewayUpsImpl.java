/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Gateway Ups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getAccessLicenseNumber <em>Access License Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getAccessPassword <em>Access Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getAccessUserId <em>Access User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getBillShipperAccountNumber <em>Bill Shipper Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getCodAllowCod <em>Cod Allow Cod</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getCodFundsCode <em>Cod Funds Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getCodSurchargeAmount <em>Cod Surcharge Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getCodSurchargeApplyToPackage <em>Cod Surcharge Apply To Package</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getCodSurchargeCurrencyUomId <em>Cod Surcharge Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getCustomerClassification <em>Customer Classification</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getDefaultReturnLabelMemo <em>Default Return Label Memo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getDefaultReturnLabelSubject <em>Default Return Label Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getMaxEstimateWeight <em>Max Estimate Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getMinEstimateWeight <em>Min Estimate Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getSaveCertInfo <em>Save Cert Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getSaveCertPath <em>Save Cert Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getShipperNumber <em>Shipper Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUpsImpl#getShipperPickupType <em>Shipper Pickup Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentGatewayUpsImpl extends ShipmentGatewayConfigImpl implements ShipmentGatewayUps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentGatewayUpsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessLicenseNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLicenseNumber(String newAccessLicenseNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER, newAccessLicenseNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessPassword() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPassword(String newAccessPassword) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD, newAccessPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserId(String newAccessUserId) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID, newAccessUserId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillShipperAccountNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillShipperAccountNumber(String newBillShipperAccountNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER, newBillShipperAccountNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodAllowCod() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodAllowCod(String newCodAllowCod) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD, newCodAllowCod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodFundsCode() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodFundsCode(String newCodFundsCode) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE, newCodFundsCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCodSurchargeAmount() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodSurchargeAmount(BigDecimal newCodSurchargeAmount) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT, newCodSurchargeAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodSurchargeApplyToPackage() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodSurchargeApplyToPackage(String newCodSurchargeApplyToPackage) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE, newCodSurchargeApplyToPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodSurchargeCurrencyUomId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodSurchargeCurrencyUomId(String newCodSurchargeCurrencyUomId) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID, newCodSurchargeCurrencyUomId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectTimeout() {
		return (Long)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeout(long newConnectTimeout) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT, newConnectTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrl() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__CONNECT_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrl(String newConnectUrl) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__CONNECT_URL, newConnectUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerClassification() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerClassification(String newCustomerClassification) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION, newCustomerClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultReturnLabelMemo() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultReturnLabelMemo(String newDefaultReturnLabelMemo) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO, newDefaultReturnLabelMemo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultReturnLabelSubject() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultReturnLabelSubject(String newDefaultReturnLabelSubject) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT, newDefaultReturnLabelSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxEstimateWeight() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxEstimateWeight(BigDecimal newMaxEstimateWeight) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT, newMaxEstimateWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinEstimateWeight() {
		return (BigDecimal)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinEstimateWeight(BigDecimal newMinEstimateWeight) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT, newMinEstimateWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaveCertInfo() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveCertInfo(String newSaveCertInfo) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO, newSaveCertInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaveCertPath() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveCertPath(String newSaveCertPath) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH, newSaveCertPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipperNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipperNumber(String newShipperNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER, newShipperNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipperPickupType() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipperPickupType(String newShipperPickupType) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE, newShipperPickupType);
	}

} //ShipmentGatewayUpsImpl
