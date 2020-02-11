/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Gateway Fedex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getAccessAccountNbr <em>Access Account Nbr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getAccessMeterNumber <em>Access Meter Number</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getAccessUserKey <em>Access User Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getAccessUserPwd <em>Access User Pwd</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getConnectSoapUrl <em>Connect Soap Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getDefaultDropoffType <em>Default Dropoff Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getDefaultPackagingType <em>Default Packaging Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getLabelImageType <em>Label Image Type</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getRateEstimateTemplate <em>Rate Estimate Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getTemplateShipment <em>Template Shipment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayFedexImpl#getTemplateSubscription <em>Template Subscription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentGatewayFedexImpl extends ShipmentGatewayConfigImpl implements ShipmentGatewayFedex {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentGatewayFedexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessAccountNbr() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessAccountNbr(String newAccessAccountNbr) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR, newAccessAccountNbr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessMeterNumber() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessMeterNumber(String newAccessMeterNumber) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER, newAccessMeterNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserKey() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserKey(String newAccessUserKey) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY, newAccessUserKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserPwd() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserPwd(String newAccessUserPwd) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD, newAccessUserPwd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectSoapUrl() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectSoapUrl(String newConnectSoapUrl) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL, newConnectSoapUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectTimeout() {
		return (Long)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeout(long newConnectTimeout) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT, newConnectTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrl() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__CONNECT_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrl(String newConnectUrl) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__CONNECT_URL, newConnectUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDropoffType() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDropoffType(String newDefaultDropoffType) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE, newDefaultDropoffType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPackagingType() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPackagingType(String newDefaultPackagingType) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE, newDefaultPackagingType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelImageType() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelImageType(String newLabelImageType) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE, newLabelImageType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateEstimateTemplate() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateEstimateTemplate(String newRateEstimateTemplate) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE, newRateEstimateTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateShipment() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateShipment(String newTemplateShipment) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT, newTemplateShipment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateSubscription() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateSubscription(String newTemplateSubscription) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION, newTemplateSubscription);
	}

} //ShipmentGatewayFedexImpl
