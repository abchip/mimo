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
 * A representation of the model object '<em><b>Shipment Gateway Dhl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessAccountNbr <em>Access Account Nbr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessPassword <em>Access Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessShippingKey <em>Access Shipping Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessUserId <em>Access User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadAction <em>Head Action</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadVersion <em>Head Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getLabelImageFormat <em>Label Image Format</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getRateEstimateTemplate <em>Rate Estimate Template</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl()
 * @model annotation="mimo-ent-frame title='DHL Shipment Gateway Configuration' formula='description'"
 * @generated
 */
public interface ShipmentGatewayDhl extends ShipmentGatewayConfig {
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_AccessAccountNbr()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your DHL ShipIT Account Number'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessAccountNbr();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessAccountNbr <em>Access Account Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Account Nbr</em>' attribute.
	 * @see #getAccessAccountNbr()
	 * @generated
	 */
	void setAccessAccountNbr(String value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_AccessPassword()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your DHL ShipIT Access Password'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessPassword();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessPassword <em>Access Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Password</em>' attribute.
	 * @see #getAccessPassword()
	 * @generated
	 */
	void setAccessPassword(String value);

	/**
	 * Returns the value of the '<em><b>Access Shipping Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Shipping Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Shipping Key</em>' attribute.
	 * @see #setAccessShippingKey(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_AccessShippingKey()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your DHL ShipIT Shipping Key'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessShippingKey();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessShippingKey <em>Access Shipping Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Shipping Key</em>' attribute.
	 * @see #getAccessShippingKey()
	 * @generated
	 */
	void setAccessShippingKey(String value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_AccessUserId()
	 * @model annotation="mimo-ent-slot encrypt='TRUE' help='Your DHL ShipIT User Id'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getAccessUserId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getAccessUserId <em>Access User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access User Id</em>' attribute.
	 * @see #getAccessUserId()
	 * @generated
	 */
	void setAccessUserId(String value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_ConnectTimeout()
	 * @model annotation="mimo-ent-slot help='Timeout in seconds'"
	 *        annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getConnectTimeout();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectTimeout <em>Connect Timeout</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_ConnectUrl()
	 * @model annotation="mimo-ent-slot help='DHL Connection URL'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getConnectUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getConnectUrl <em>Connect Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Url</em>' attribute.
	 * @see #getConnectUrl()
	 * @generated
	 */
	void setConnectUrl(String value);

	/**
	 * Returns the value of the '<em><b>Head Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Action</em>' attribute.
	 * @see #setHeadAction(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_HeadAction()
	 * @model annotation="mimo-ent-slot help='Head action attribute'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getHeadAction();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadAction <em>Head Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Action</em>' attribute.
	 * @see #getHeadAction()
	 * @generated
	 */
	void setHeadAction(String value);

	/**
	 * Returns the value of the '<em><b>Head Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Version</em>' attribute.
	 * @see #setHeadVersion(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_HeadVersion()
	 * @model annotation="mimo-ent-slot help='Head version attribute'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getHeadVersion();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getHeadVersion <em>Head Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Version</em>' attribute.
	 * @see #getHeadVersion()
	 * @generated
	 */
	void setHeadVersion(String value);

	/**
	 * Returns the value of the '<em><b>Label Image Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Image Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Image Format</em>' attribute.
	 * @see #setLabelImageFormat(String)
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_LabelImageFormat()
	 * @model annotation="mimo-ent-slot help='Label image format'"
	 *        annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getLabelImageFormat();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getLabelImageFormat <em>Label Image Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Image Format</em>' attribute.
	 * @see #getLabelImageFormat()
	 * @generated
	 */
	void setLabelImageFormat(String value);

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
	 * @see org.abchip.mimo.biz.shipment.shipment.Shipment_Package#getShipmentGatewayDhl_RateEstimateTemplate()
	 * @model annotation="mimo-ent-slot help='API Schema Templates'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getRateEstimateTemplate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl#getRateEstimateTemplate <em>Rate Estimate Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Estimate Template</em>' attribute.
	 * @see #getRateEstimateTemplate()
	 * @generated
	 */
	void setRateEstimateTemplate(String value);

} // ShipmentGatewayDhl
