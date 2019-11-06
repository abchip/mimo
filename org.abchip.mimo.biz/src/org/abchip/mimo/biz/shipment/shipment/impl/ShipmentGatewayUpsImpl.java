/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
	 * The default value of the '{@link #getAccessLicenseNumber() <em>Access License Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLicenseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_LICENSE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessLicenseNumber() <em>Access License Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLicenseNumber()
	 * @generated
	 * @ordered
	 */
	protected String accessLicenseNumber = ACCESS_LICENSE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessPassword() <em>Access Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPassword() <em>Access Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPassword()
	 * @generated
	 * @ordered
	 */
	protected String accessPassword = ACCESS_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessUserId() <em>Access User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessUserId() <em>Access User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserId()
	 * @generated
	 * @ordered
	 */
	protected String accessUserId = ACCESS_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillShipperAccountNumber() <em>Bill Shipper Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillShipperAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_SHIPPER_ACCOUNT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillShipperAccountNumber() <em>Bill Shipper Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillShipperAccountNumber()
	 * @generated
	 * @ordered
	 */
	protected String billShipperAccountNumber = BILL_SHIPPER_ACCOUNT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodAllowCod() <em>Cod Allow Cod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodAllowCod()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_ALLOW_COD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodAllowCod() <em>Cod Allow Cod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodAllowCod()
	 * @generated
	 * @ordered
	 */
	protected String codAllowCod = COD_ALLOW_COD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodFundsCode() <em>Cod Funds Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodFundsCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_FUNDS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodFundsCode() <em>Cod Funds Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodFundsCode()
	 * @generated
	 * @ordered
	 */
	protected String codFundsCode = COD_FUNDS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodSurchargeAmount() <em>Cod Surcharge Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodSurchargeAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COD_SURCHARGE_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodSurchargeAmount() <em>Cod Surcharge Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodSurchargeAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal codSurchargeAmount = COD_SURCHARGE_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodSurchargeApplyToPackage() <em>Cod Surcharge Apply To Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodSurchargeApplyToPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_SURCHARGE_APPLY_TO_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodSurchargeApplyToPackage() <em>Cod Surcharge Apply To Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodSurchargeApplyToPackage()
	 * @generated
	 * @ordered
	 */
	protected String codSurchargeApplyToPackage = COD_SURCHARGE_APPLY_TO_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodSurchargeCurrencyUomId() <em>Cod Surcharge Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodSurchargeCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_SURCHARGE_CURRENCY_UOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodSurchargeCurrencyUomId() <em>Cod Surcharge Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodSurchargeCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String codSurchargeCurrencyUomId = COD_SURCHARGE_CURRENCY_UOM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final long CONNECT_TIMEOUT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConnectTimeout() <em>Connect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectTimeout()
	 * @generated
	 * @ordered
	 */
	protected long connectTimeout = CONNECT_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectUrl() <em>Connect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectUrl() <em>Connect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectUrl()
	 * @generated
	 * @ordered
	 */
	protected String connectUrl = CONNECT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerClassification() <em>Customer Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerClassification() <em>Customer Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerClassification()
	 * @generated
	 * @ordered
	 */
	protected String customerClassification = CUSTOMER_CLASSIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultReturnLabelMemo() <em>Default Return Label Memo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReturnLabelMemo()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_RETURN_LABEL_MEMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultReturnLabelMemo() <em>Default Return Label Memo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReturnLabelMemo()
	 * @generated
	 * @ordered
	 */
	protected String defaultReturnLabelMemo = DEFAULT_RETURN_LABEL_MEMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultReturnLabelSubject() <em>Default Return Label Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReturnLabelSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_RETURN_LABEL_SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultReturnLabelSubject() <em>Default Return Label Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultReturnLabelSubject()
	 * @generated
	 * @ordered
	 */
	protected String defaultReturnLabelSubject = DEFAULT_RETURN_LABEL_SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxEstimateWeight() <em>Max Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEstimateWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MAX_ESTIMATE_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxEstimateWeight() <em>Max Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEstimateWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal maxEstimateWeight = MAX_ESTIMATE_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinEstimateWeight() <em>Min Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEstimateWeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal MIN_ESTIMATE_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinEstimateWeight() <em>Min Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinEstimateWeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal minEstimateWeight = MIN_ESTIMATE_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveCertInfo() <em>Save Cert Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveCertInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String SAVE_CERT_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaveCertInfo() <em>Save Cert Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveCertInfo()
	 * @generated
	 * @ordered
	 */
	protected String saveCertInfo = SAVE_CERT_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSaveCertPath() <em>Save Cert Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveCertPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SAVE_CERT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSaveCertPath() <em>Save Cert Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaveCertPath()
	 * @generated
	 * @ordered
	 */
	protected String saveCertPath = SAVE_CERT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipperNumber() <em>Shipper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipperNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPPER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipperNumber() <em>Shipper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipperNumber()
	 * @generated
	 * @ordered
	 */
	protected String shipperNumber = SHIPPER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShipperPickupType() <em>Shipper Pickup Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipperPickupType()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIPPER_PICKUP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipperPickupType() <em>Shipper Pickup Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipperPickupType()
	 * @generated
	 * @ordered
	 */
	protected String shipperPickupType = SHIPPER_PICKUP_TYPE_EDEFAULT;

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
		return accessLicenseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLicenseNumber(String newAccessLicenseNumber) {
		accessLicenseNumber = newAccessLicenseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessPassword() {
		return accessPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPassword(String newAccessPassword) {
		accessPassword = newAccessPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserId() {
		return accessUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserId(String newAccessUserId) {
		accessUserId = newAccessUserId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillShipperAccountNumber() {
		return billShipperAccountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillShipperAccountNumber(String newBillShipperAccountNumber) {
		billShipperAccountNumber = newBillShipperAccountNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodAllowCod() {
		return codAllowCod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodAllowCod(String newCodAllowCod) {
		codAllowCod = newCodAllowCod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodFundsCode() {
		return codFundsCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodFundsCode(String newCodFundsCode) {
		codFundsCode = newCodFundsCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getCodSurchargeAmount() {
		return codSurchargeAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodSurchargeAmount(BigDecimal newCodSurchargeAmount) {
		codSurchargeAmount = newCodSurchargeAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodSurchargeApplyToPackage() {
		return codSurchargeApplyToPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodSurchargeApplyToPackage(String newCodSurchargeApplyToPackage) {
		codSurchargeApplyToPackage = newCodSurchargeApplyToPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCodSurchargeCurrencyUomId() {
		return codSurchargeCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCodSurchargeCurrencyUomId(String newCodSurchargeCurrencyUomId) {
		codSurchargeCurrencyUomId = newCodSurchargeCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectTimeout() {
		return connectTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeout(long newConnectTimeout) {
		connectTimeout = newConnectTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrl() {
		return connectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrl(String newConnectUrl) {
		connectUrl = newConnectUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerClassification() {
		return customerClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerClassification(String newCustomerClassification) {
		customerClassification = newCustomerClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultReturnLabelMemo() {
		return defaultReturnLabelMemo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultReturnLabelMemo(String newDefaultReturnLabelMemo) {
		defaultReturnLabelMemo = newDefaultReturnLabelMemo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultReturnLabelSubject() {
		return defaultReturnLabelSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultReturnLabelSubject(String newDefaultReturnLabelSubject) {
		defaultReturnLabelSubject = newDefaultReturnLabelSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMaxEstimateWeight() {
		return maxEstimateWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxEstimateWeight(BigDecimal newMaxEstimateWeight) {
		maxEstimateWeight = newMaxEstimateWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getMinEstimateWeight() {
		return minEstimateWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinEstimateWeight(BigDecimal newMinEstimateWeight) {
		minEstimateWeight = newMinEstimateWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaveCertInfo() {
		return saveCertInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveCertInfo(String newSaveCertInfo) {
		saveCertInfo = newSaveCertInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSaveCertPath() {
		return saveCertPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSaveCertPath(String newSaveCertPath) {
		saveCertPath = newSaveCertPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipperNumber() {
		return shipperNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipperNumber(String newShipperNumber) {
		shipperNumber = newShipperNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShipperPickupType() {
		return shipperPickupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShipperPickupType(String newShipperPickupType) {
		shipperPickupType = newShipperPickupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER:
				return getAccessLicenseNumber();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD:
				return getAccessPassword();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID:
				return getAccessUserId();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER:
				return getBillShipperAccountNumber();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD:
				return getCodAllowCod();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE:
				return getCodFundsCode();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT:
				return getCodSurchargeAmount();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE:
				return getCodSurchargeApplyToPackage();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID:
				return getCodSurchargeCurrencyUomId();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT:
				return getConnectTimeout();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_URL:
				return getConnectUrl();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION:
				return getCustomerClassification();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO:
				return getDefaultReturnLabelMemo();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT:
				return getDefaultReturnLabelSubject();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT:
				return getMaxEstimateWeight();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT:
				return getMinEstimateWeight();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO:
				return getSaveCertInfo();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH:
				return getSaveCertPath();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER:
				return getShipperNumber();
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE:
				return getShipperPickupType();
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
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER:
				setAccessLicenseNumber((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD:
				setAccessPassword((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID:
				setAccessUserId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER:
				setBillShipperAccountNumber((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD:
				setCodAllowCod((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE:
				setCodFundsCode((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT:
				setCodSurchargeAmount((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE:
				setCodSurchargeApplyToPackage((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID:
				setCodSurchargeCurrencyUomId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT:
				setConnectTimeout((Long)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_URL:
				setConnectUrl((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION:
				setCustomerClassification((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO:
				setDefaultReturnLabelMemo((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT:
				setDefaultReturnLabelSubject((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT:
				setMaxEstimateWeight((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT:
				setMinEstimateWeight((BigDecimal)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO:
				setSaveCertInfo((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH:
				setSaveCertPath((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER:
				setShipperNumber((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE:
				setShipperPickupType((String)newValue);
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
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER:
				setAccessLicenseNumber(ACCESS_LICENSE_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD:
				setAccessPassword(ACCESS_PASSWORD_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID:
				setAccessUserId(ACCESS_USER_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER:
				setBillShipperAccountNumber(BILL_SHIPPER_ACCOUNT_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD:
				setCodAllowCod(COD_ALLOW_COD_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE:
				setCodFundsCode(COD_FUNDS_CODE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT:
				setCodSurchargeAmount(COD_SURCHARGE_AMOUNT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE:
				setCodSurchargeApplyToPackage(COD_SURCHARGE_APPLY_TO_PACKAGE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID:
				setCodSurchargeCurrencyUomId(COD_SURCHARGE_CURRENCY_UOM_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT:
				setConnectTimeout(CONNECT_TIMEOUT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_URL:
				setConnectUrl(CONNECT_URL_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION:
				setCustomerClassification(CUSTOMER_CLASSIFICATION_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO:
				setDefaultReturnLabelMemo(DEFAULT_RETURN_LABEL_MEMO_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT:
				setDefaultReturnLabelSubject(DEFAULT_RETURN_LABEL_SUBJECT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT:
				setMaxEstimateWeight(MAX_ESTIMATE_WEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT:
				setMinEstimateWeight(MIN_ESTIMATE_WEIGHT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO:
				setSaveCertInfo(SAVE_CERT_INFO_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH:
				setSaveCertPath(SAVE_CERT_PATH_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER:
				setShipperNumber(SHIPPER_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE:
				setShipperPickupType(SHIPPER_PICKUP_TYPE_EDEFAULT);
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
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_LICENSE_NUMBER:
				return ACCESS_LICENSE_NUMBER_EDEFAULT == null ? accessLicenseNumber != null : !ACCESS_LICENSE_NUMBER_EDEFAULT.equals(accessLicenseNumber);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_PASSWORD:
				return ACCESS_PASSWORD_EDEFAULT == null ? accessPassword != null : !ACCESS_PASSWORD_EDEFAULT.equals(accessPassword);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__ACCESS_USER_ID:
				return ACCESS_USER_ID_EDEFAULT == null ? accessUserId != null : !ACCESS_USER_ID_EDEFAULT.equals(accessUserId);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__BILL_SHIPPER_ACCOUNT_NUMBER:
				return BILL_SHIPPER_ACCOUNT_NUMBER_EDEFAULT == null ? billShipperAccountNumber != null : !BILL_SHIPPER_ACCOUNT_NUMBER_EDEFAULT.equals(billShipperAccountNumber);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_ALLOW_COD:
				return COD_ALLOW_COD_EDEFAULT == null ? codAllowCod != null : !COD_ALLOW_COD_EDEFAULT.equals(codAllowCod);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_FUNDS_CODE:
				return COD_FUNDS_CODE_EDEFAULT == null ? codFundsCode != null : !COD_FUNDS_CODE_EDEFAULT.equals(codFundsCode);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_AMOUNT:
				return COD_SURCHARGE_AMOUNT_EDEFAULT == null ? codSurchargeAmount != null : !COD_SURCHARGE_AMOUNT_EDEFAULT.equals(codSurchargeAmount);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_APPLY_TO_PACKAGE:
				return COD_SURCHARGE_APPLY_TO_PACKAGE_EDEFAULT == null ? codSurchargeApplyToPackage != null : !COD_SURCHARGE_APPLY_TO_PACKAGE_EDEFAULT.equals(codSurchargeApplyToPackage);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__COD_SURCHARGE_CURRENCY_UOM_ID:
				return COD_SURCHARGE_CURRENCY_UOM_ID_EDEFAULT == null ? codSurchargeCurrencyUomId != null : !COD_SURCHARGE_CURRENCY_UOM_ID_EDEFAULT.equals(codSurchargeCurrencyUomId);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_TIMEOUT:
				return connectTimeout != CONNECT_TIMEOUT_EDEFAULT;
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CONNECT_URL:
				return CONNECT_URL_EDEFAULT == null ? connectUrl != null : !CONNECT_URL_EDEFAULT.equals(connectUrl);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__CUSTOMER_CLASSIFICATION:
				return CUSTOMER_CLASSIFICATION_EDEFAULT == null ? customerClassification != null : !CUSTOMER_CLASSIFICATION_EDEFAULT.equals(customerClassification);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_MEMO:
				return DEFAULT_RETURN_LABEL_MEMO_EDEFAULT == null ? defaultReturnLabelMemo != null : !DEFAULT_RETURN_LABEL_MEMO_EDEFAULT.equals(defaultReturnLabelMemo);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__DEFAULT_RETURN_LABEL_SUBJECT:
				return DEFAULT_RETURN_LABEL_SUBJECT_EDEFAULT == null ? defaultReturnLabelSubject != null : !DEFAULT_RETURN_LABEL_SUBJECT_EDEFAULT.equals(defaultReturnLabelSubject);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MAX_ESTIMATE_WEIGHT:
				return MAX_ESTIMATE_WEIGHT_EDEFAULT == null ? maxEstimateWeight != null : !MAX_ESTIMATE_WEIGHT_EDEFAULT.equals(maxEstimateWeight);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__MIN_ESTIMATE_WEIGHT:
				return MIN_ESTIMATE_WEIGHT_EDEFAULT == null ? minEstimateWeight != null : !MIN_ESTIMATE_WEIGHT_EDEFAULT.equals(minEstimateWeight);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_INFO:
				return SAVE_CERT_INFO_EDEFAULT == null ? saveCertInfo != null : !SAVE_CERT_INFO_EDEFAULT.equals(saveCertInfo);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SAVE_CERT_PATH:
				return SAVE_CERT_PATH_EDEFAULT == null ? saveCertPath != null : !SAVE_CERT_PATH_EDEFAULT.equals(saveCertPath);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_NUMBER:
				return SHIPPER_NUMBER_EDEFAULT == null ? shipperNumber != null : !SHIPPER_NUMBER_EDEFAULT.equals(shipperNumber);
			case Shipment_Package.SHIPMENT_GATEWAY_UPS__SHIPPER_PICKUP_TYPE:
				return SHIPPER_PICKUP_TYPE_EDEFAULT == null ? shipperPickupType != null : !SHIPPER_PICKUP_TYPE_EDEFAULT.equals(shipperPickupType);
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
		result.append(" (accessLicenseNumber: ");
		result.append(accessLicenseNumber);
		result.append(", accessPassword: ");
		result.append(accessPassword);
		result.append(", accessUserId: ");
		result.append(accessUserId);
		result.append(", billShipperAccountNumber: ");
		result.append(billShipperAccountNumber);
		result.append(", codAllowCod: ");
		result.append(codAllowCod);
		result.append(", codFundsCode: ");
		result.append(codFundsCode);
		result.append(", codSurchargeAmount: ");
		result.append(codSurchargeAmount);
		result.append(", codSurchargeApplyToPackage: ");
		result.append(codSurchargeApplyToPackage);
		result.append(", codSurchargeCurrencyUomId: ");
		result.append(codSurchargeCurrencyUomId);
		result.append(", connectTimeout: ");
		result.append(connectTimeout);
		result.append(", connectUrl: ");
		result.append(connectUrl);
		result.append(", customerClassification: ");
		result.append(customerClassification);
		result.append(", defaultReturnLabelMemo: ");
		result.append(defaultReturnLabelMemo);
		result.append(", defaultReturnLabelSubject: ");
		result.append(defaultReturnLabelSubject);
		result.append(", maxEstimateWeight: ");
		result.append(maxEstimateWeight);
		result.append(", minEstimateWeight: ");
		result.append(minEstimateWeight);
		result.append(", saveCertInfo: ");
		result.append(saveCertInfo);
		result.append(", saveCertPath: ");
		result.append(saveCertPath);
		result.append(", shipperNumber: ");
		result.append(shipperNumber);
		result.append(", shipperPickupType: ");
		result.append(shipperPickupType);
		result.append(')');
		return result.toString();
	}

} //ShipmentGatewayUpsImpl
