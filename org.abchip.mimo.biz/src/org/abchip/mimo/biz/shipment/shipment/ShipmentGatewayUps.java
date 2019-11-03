/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Gateway Ups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessLicenseNumber <em>Access License Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessPassword <em>Access Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessUserId <em>Access User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getBillShipperAccountNumber <em>Bill Shipper Account Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodAllowCod <em>Cod Allow Cod</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodFundsCode <em>Cod Funds Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeAmount <em>Cod Surcharge Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeApplyToPackage <em>Cod Surcharge Apply To Package</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeCurrencyUomId <em>Cod Surcharge Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCustomerClassification <em>Customer Classification</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelMemo <em>Default Return Label Memo</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelSubject <em>Default Return Label Subject</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMaxEstimateWeight <em>Max Estimate Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMinEstimateWeight <em>Min Estimate Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertInfo <em>Save Cert Info</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertPath <em>Save Cert Path</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperNumber <em>Shipper Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperPickupType <em>Shipper Pickup Type</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps()
 * @model annotation="mimo-ent-frame formula='description'"
 * @generated
 */
public interface ShipmentGatewayUps extends ShipmentGatewayConfig {
	/**
	 * Returns the value of the '<em><b>Access License Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access License Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access License Number</em>' attribute.
	 * @see #setAccessLicenseNumber(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_AccessLicenseNumber()
	 * @model
	 * @generated
	 */
	String getAccessLicenseNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessLicenseNumber <em>Access License Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access License Number</em>' attribute.
	 * @see #getAccessLicenseNumber()
	 * @generated
	 */
	void setAccessLicenseNumber(String value);

	/**
	 * Returns the value of the '<em><b>Access Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Password</em>' attribute.
	 * @see #setAccessPassword(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_AccessPassword()
	 * @model
	 * @generated
	 */
	String getAccessPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessPassword <em>Access Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Password</em>' attribute.
	 * @see #getAccessPassword()
	 * @generated
	 */
	void setAccessPassword(String value);

	/**
	 * Returns the value of the '<em><b>Access User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access User Id</em>' attribute.
	 * @see #setAccessUserId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_AccessUserId()
	 * @model
	 * @generated
	 */
	String getAccessUserId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getAccessUserId <em>Access User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access User Id</em>' attribute.
	 * @see #getAccessUserId()
	 * @generated
	 */
	void setAccessUserId(String value);

	/**
	 * Returns the value of the '<em><b>Bill Shipper Account Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Shipper Account Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Shipper Account Number</em>' attribute.
	 * @see #setBillShipperAccountNumber(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_BillShipperAccountNumber()
	 * @model
	 * @generated
	 */
	String getBillShipperAccountNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getBillShipperAccountNumber <em>Bill Shipper Account Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Shipper Account Number</em>' attribute.
	 * @see #getBillShipperAccountNumber()
	 * @generated
	 */
	void setBillShipperAccountNumber(String value);

	/**
	 * Returns the value of the '<em><b>Cod Allow Cod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Allow Cod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Allow Cod</em>' attribute.
	 * @see #setCodAllowCod(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_CodAllowCod()
	 * @model
	 * @generated
	 */
	String getCodAllowCod();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodAllowCod <em>Cod Allow Cod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Allow Cod</em>' attribute.
	 * @see #getCodAllowCod()
	 * @generated
	 */
	void setCodAllowCod(String value);

	/**
	 * Returns the value of the '<em><b>Cod Funds Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Funds Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Funds Code</em>' attribute.
	 * @see #setCodFundsCode(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_CodFundsCode()
	 * @model
	 * @generated
	 */
	String getCodFundsCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodFundsCode <em>Cod Funds Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Funds Code</em>' attribute.
	 * @see #getCodFundsCode()
	 * @generated
	 */
	void setCodFundsCode(String value);

	/**
	 * Returns the value of the '<em><b>Cod Surcharge Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Surcharge Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Surcharge Amount</em>' attribute.
	 * @see #setCodSurchargeAmount(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_CodSurchargeAmount()
	 * @model
	 * @generated
	 */
	BigDecimal getCodSurchargeAmount();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeAmount <em>Cod Surcharge Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Surcharge Amount</em>' attribute.
	 * @see #getCodSurchargeAmount()
	 * @generated
	 */
	void setCodSurchargeAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Cod Surcharge Apply To Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Surcharge Apply To Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Surcharge Apply To Package</em>' attribute.
	 * @see #setCodSurchargeApplyToPackage(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_CodSurchargeApplyToPackage()
	 * @model
	 * @generated
	 */
	String getCodSurchargeApplyToPackage();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeApplyToPackage <em>Cod Surcharge Apply To Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Surcharge Apply To Package</em>' attribute.
	 * @see #getCodSurchargeApplyToPackage()
	 * @generated
	 */
	void setCodSurchargeApplyToPackage(String value);

	/**
	 * Returns the value of the '<em><b>Cod Surcharge Currency Uom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Surcharge Currency Uom Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Surcharge Currency Uom Id</em>' attribute.
	 * @see #setCodSurchargeCurrencyUomId(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_CodSurchargeCurrencyUomId()
	 * @model
	 * @generated
	 */
	String getCodSurchargeCurrencyUomId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCodSurchargeCurrencyUomId <em>Cod Surcharge Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Surcharge Currency Uom Id</em>' attribute.
	 * @see #getCodSurchargeCurrencyUomId()
	 * @generated
	 */
	void setCodSurchargeCurrencyUomId(String value);

	/**
	 * Returns the value of the '<em><b>Connect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Timeout</em>' attribute.
	 * @see #setConnectTimeout(long)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_ConnectTimeout()
	 * @model
	 * @generated
	 */
	long getConnectTimeout();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectTimeout <em>Connect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Timeout</em>' attribute.
	 * @see #getConnectTimeout()
	 * @generated
	 */
	void setConnectTimeout(long value);

	/**
	 * Returns the value of the '<em><b>Connect Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Url</em>' attribute.
	 * @see #setConnectUrl(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_ConnectUrl()
	 * @model
	 * @generated
	 */
	String getConnectUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getConnectUrl <em>Connect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Url</em>' attribute.
	 * @see #getConnectUrl()
	 * @generated
	 */
	void setConnectUrl(String value);

	/**
	 * Returns the value of the '<em><b>Customer Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Classification</em>' attribute.
	 * @see #setCustomerClassification(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_CustomerClassification()
	 * @model
	 * @generated
	 */
	String getCustomerClassification();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getCustomerClassification <em>Customer Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Classification</em>' attribute.
	 * @see #getCustomerClassification()
	 * @generated
	 */
	void setCustomerClassification(String value);

	/**
	 * Returns the value of the '<em><b>Default Return Label Memo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Return Label Memo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Return Label Memo</em>' attribute.
	 * @see #setDefaultReturnLabelMemo(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_DefaultReturnLabelMemo()
	 * @model
	 * @generated
	 */
	String getDefaultReturnLabelMemo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelMemo <em>Default Return Label Memo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Return Label Memo</em>' attribute.
	 * @see #getDefaultReturnLabelMemo()
	 * @generated
	 */
	void setDefaultReturnLabelMemo(String value);

	/**
	 * Returns the value of the '<em><b>Default Return Label Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Return Label Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Return Label Subject</em>' attribute.
	 * @see #setDefaultReturnLabelSubject(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_DefaultReturnLabelSubject()
	 * @model
	 * @generated
	 */
	String getDefaultReturnLabelSubject();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getDefaultReturnLabelSubject <em>Default Return Label Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Return Label Subject</em>' attribute.
	 * @see #getDefaultReturnLabelSubject()
	 * @generated
	 */
	void setDefaultReturnLabelSubject(String value);

	/**
	 * Returns the value of the '<em><b>Max Estimate Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Estimate Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Estimate Weight</em>' attribute.
	 * @see #setMaxEstimateWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_MaxEstimateWeight()
	 * @model
	 * @generated
	 */
	BigDecimal getMaxEstimateWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMaxEstimateWeight <em>Max Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Estimate Weight</em>' attribute.
	 * @see #getMaxEstimateWeight()
	 * @generated
	 */
	void setMaxEstimateWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Min Estimate Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Estimate Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Estimate Weight</em>' attribute.
	 * @see #setMinEstimateWeight(BigDecimal)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_MinEstimateWeight()
	 * @model
	 * @generated
	 */
	BigDecimal getMinEstimateWeight();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getMinEstimateWeight <em>Min Estimate Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Estimate Weight</em>' attribute.
	 * @see #getMinEstimateWeight()
	 * @generated
	 */
	void setMinEstimateWeight(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Save Cert Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Cert Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Cert Info</em>' attribute.
	 * @see #setSaveCertInfo(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_SaveCertInfo()
	 * @model
	 * @generated
	 */
	String getSaveCertInfo();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertInfo <em>Save Cert Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Cert Info</em>' attribute.
	 * @see #getSaveCertInfo()
	 * @generated
	 */
	void setSaveCertInfo(String value);

	/**
	 * Returns the value of the '<em><b>Save Cert Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Save Cert Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Cert Path</em>' attribute.
	 * @see #setSaveCertPath(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_SaveCertPath()
	 * @model
	 * @generated
	 */
	String getSaveCertPath();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getSaveCertPath <em>Save Cert Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Cert Path</em>' attribute.
	 * @see #getSaveCertPath()
	 * @generated
	 */
	void setSaveCertPath(String value);

	/**
	 * Returns the value of the '<em><b>Shipper Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipper Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipper Number</em>' attribute.
	 * @see #setShipperNumber(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_ShipperNumber()
	 * @model
	 * @generated
	 */
	String getShipperNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperNumber <em>Shipper Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipper Number</em>' attribute.
	 * @see #getShipperNumber()
	 * @generated
	 */
	void setShipperNumber(String value);

	/**
	 * Returns the value of the '<em><b>Shipper Pickup Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shipper Pickup Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipper Pickup Type</em>' attribute.
	 * @see #setShipperPickupType(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayUps_ShipperPickupType()
	 * @model
	 * @generated
	 */
	String getShipperPickupType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUps#getShipperPickupType <em>Shipper Pickup Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipper Pickup Type</em>' attribute.
	 * @see #getShipperPickupType()
	 * @generated
	 */
	void setShipperPickupType(String value);

} // ShipmentGatewayUps
