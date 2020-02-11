/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment Gateway Fedex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessAccountNbr <em>Access Account Nbr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessMeterNumber <em>Access Meter Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserKey <em>Access User Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserPwd <em>Access User Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectSoapUrl <em>Connect Soap Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultDropoffType <em>Default Dropoff Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultPackagingType <em>Default Packaging Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getLabelImageType <em>Label Image Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getRateEstimateTemplate <em>Rate Estimate Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateShipment <em>Template Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateSubscription <em>Template Subscription</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex()
 * @model annotation="mimo-ent-frame title='Fedex Shipment Gateway Configuration' formula='description'"
 * @generated
 */
public interface ShipmentGatewayFedex extends ShipmentGatewayConfig {
	/**
	 * Returns the value of the '<em><b>Access Account Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Account Nbr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Account Nbr</em>' attribute.
	 * @see #setAccessAccountNbr(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_AccessAccountNbr()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your Fedex account number'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessAccountNbr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessAccountNbr <em>Access Account Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Account Nbr</em>' attribute.
	 * @see #getAccessAccountNbr()
	 * @generated
	 */
	void setAccessAccountNbr(String value);

	/**
	 * Returns the value of the '<em><b>Access Meter Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Meter Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Meter Number</em>' attribute.
	 * @see #setAccessMeterNumber(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_AccessMeterNumber()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your Fedex meter number'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessMeterNumber();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessMeterNumber <em>Access Meter Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Meter Number</em>' attribute.
	 * @see #getAccessMeterNumber()
	 * @generated
	 */
	void setAccessMeterNumber(String value);

	/**
	 * Returns the value of the '<em><b>Access User Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access User Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access User Key</em>' attribute.
	 * @see #setAccessUserKey(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_AccessUserKey()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your Fedex user credential key'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessUserKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserKey <em>Access User Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access User Key</em>' attribute.
	 * @see #getAccessUserKey()
	 * @generated
	 */
	void setAccessUserKey(String value);

	/**
	 * Returns the value of the '<em><b>Access User Pwd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access User Pwd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access User Pwd</em>' attribute.
	 * @see #setAccessUserPwd(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_AccessUserPwd()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your Fedex user credential password'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessUserPwd();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getAccessUserPwd <em>Access User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access User Pwd</em>' attribute.
	 * @see #getAccessUserPwd()
	 * @generated
	 */
	void setAccessUserPwd(String value);

	/**
	 * Returns the value of the '<em><b>Connect Soap Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect Soap Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect Soap Url</em>' attribute.
	 * @see #setConnectSoapUrl(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_ConnectSoapUrl()
	 * @model annotation="mimo-ent-slot help='Fedex Soap Connection URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConnectSoapUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectSoapUrl <em>Connect Soap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Soap Url</em>' attribute.
	 * @see #getConnectSoapUrl()
	 * @generated
	 */
	void setConnectSoapUrl(String value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_ConnectTimeout()
	 * @model annotation="mimo-ent-slot help='Timeout in seconds'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getConnectTimeout();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectTimeout <em>Connect Timeout</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_ConnectUrl()
	 * @model annotation="mimo-ent-slot help='Fedex Connection URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConnectUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getConnectUrl <em>Connect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Url</em>' attribute.
	 * @see #getConnectUrl()
	 * @generated
	 */
	void setConnectUrl(String value);

	/**
	 * Returns the value of the '<em><b>Default Dropoff Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Dropoff Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Dropoff Type</em>' attribute.
	 * @see #setDefaultDropoffType(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_DefaultDropoffType()
	 * @model annotation="mimo-ent-slot help='Default dropoff type'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDefaultDropoffType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultDropoffType <em>Default Dropoff Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Dropoff Type</em>' attribute.
	 * @see #getDefaultDropoffType()
	 * @generated
	 */
	void setDefaultDropoffType(String value);

	/**
	 * Returns the value of the '<em><b>Default Packaging Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Packaging Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Packaging Type</em>' attribute.
	 * @see #setDefaultPackagingType(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_DefaultPackagingType()
	 * @model annotation="mimo-ent-slot help='Default packaging type'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getDefaultPackagingType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getDefaultPackagingType <em>Default Packaging Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Packaging Type</em>' attribute.
	 * @see #getDefaultPackagingType()
	 * @generated
	 */
	void setDefaultPackagingType(String value);

	/**
	 * Returns the value of the '<em><b>Label Image Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Image Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Image Type</em>' attribute.
	 * @see #setLabelImageType(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_LabelImageType()
	 * @model annotation="mimo-ent-slot help='Label image type'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLabelImageType();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getLabelImageType <em>Label Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Image Type</em>' attribute.
	 * @see #getLabelImageType()
	 * @generated
	 */
	void setLabelImageType(String value);

	/**
	 * Returns the value of the '<em><b>Rate Estimate Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Estimate Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Estimate Template</em>' attribute.
	 * @see #setRateEstimateTemplate(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_RateEstimateTemplate()
	 * @model annotation="mimo-ent-slot help='FedEx API Rate Estimate Template'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getRateEstimateTemplate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getRateEstimateTemplate <em>Rate Estimate Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Estimate Template</em>' attribute.
	 * @see #getRateEstimateTemplate()
	 * @generated
	 */
	void setRateEstimateTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Template Shipment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Shipment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Shipment</em>' attribute.
	 * @see #setTemplateShipment(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_TemplateShipment()
	 * @model annotation="mimo-ent-slot help='Shipment Template location'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTemplateShipment();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateShipment <em>Template Shipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Shipment</em>' attribute.
	 * @see #getTemplateShipment()
	 * @generated
	 */
	void setTemplateShipment(String value);

	/**
	 * Returns the value of the '<em><b>Template Subscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Subscription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Subscription</em>' attribute.
	 * @see #setTemplateSubscription(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayFedex_TemplateSubscription()
	 * @model annotation="mimo-ent-slot help='Subscription Template location'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getTemplateSubscription();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex#getTemplateSubscription <em>Template Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Subscription</em>' attribute.
	 * @see #getTemplateSubscription()
	 * @generated
	 */
	void setTemplateSubscription(String value);

} // ShipmentGatewayFedex
