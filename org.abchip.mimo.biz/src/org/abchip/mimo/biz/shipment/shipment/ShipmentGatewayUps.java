/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 * @model annotation="mimo-ent-frame title='UPS Shipment Gateway Configuration' formula='description'"
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
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='UPS XPCI Access License Number'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='UPS XPCI Access Password'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='UPS XPCI Access User ID'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='UPS Bill Shipper Account Number'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='All shipment package items are from orders which have been fully paid via EXT_COD'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='The code that indicates the type of funds used for the COD payment'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * @model annotation="mimo-ent-slot help='Surcharge amount'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * @model annotation="mimo-ent-slot help='Surcharge amount will be applied to each shipment package'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * @model annotation="mimo-ent-slot help='Surcharge currency'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * @model annotation="mimo-ent-slot help='Timeout in seconds'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
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
	 * @model annotation="mimo-ent-slot help='UPS Connection URL'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='Customer Classification'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * @model annotation="mimo-ent-slot help='Return label email memo'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='Return label subject'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='Estimate split into packages'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * @model annotation="mimo-ent-slot help='Minimum weight for a package'"
	 *        annotation="mimo-ent-format type='fixed-point' precision='18' scale='6'"
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
	 * @model annotation="mimo-ent-slot help='Setting to save files needed for UPS certification (true|false)'"
	 *        annotation="mimo-ent-format length='60'"
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
	 * @model annotation="mimo-ent-slot help='UPS file certificate path'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='UPS Shipper Number'"
	 *        annotation="mimo-ent-format length='255'"
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
	 * @model annotation="mimo-ent-slot help='Shipper Default Pickup Type'"
	 *        annotation="mimo-ent-format length='60'"
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
