/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayFedex;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getAccessAccountNbr() <em>Access Account Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessAccountNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_ACCOUNT_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessAccountNbr() <em>Access Account Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessAccountNbr()
	 * @generated
	 * @ordered
	 */
	protected String accessAccountNbr = ACCESS_ACCOUNT_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessMeterNumber() <em>Access Meter Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMeterNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_METER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessMeterNumber() <em>Access Meter Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMeterNumber()
	 * @generated
	 * @ordered
	 */
	protected String accessMeterNumber = ACCESS_METER_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessUserKey() <em>Access User Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_USER_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessUserKey() <em>Access User Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserKey()
	 * @generated
	 * @ordered
	 */
	protected String accessUserKey = ACCESS_USER_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessUserPwd() <em>Access User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserPwd()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_USER_PWD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessUserPwd() <em>Access User Pwd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessUserPwd()
	 * @generated
	 * @ordered
	 */
	protected String accessUserPwd = ACCESS_USER_PWD_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectSoapUrl() <em>Connect Soap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectSoapUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECT_SOAP_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectSoapUrl() <em>Connect Soap Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectSoapUrl()
	 * @generated
	 * @ordered
	 */
	protected String connectSoapUrl = CONNECT_SOAP_URL_EDEFAULT;

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
	 * The default value of the '{@link #getDefaultDropoffType() <em>Default Dropoff Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDropoffType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_DROPOFF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultDropoffType() <em>Default Dropoff Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDropoffType()
	 * @generated
	 * @ordered
	 */
	protected String defaultDropoffType = DEFAULT_DROPOFF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPackagingType() <em>Default Packaging Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPackagingType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PACKAGING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPackagingType() <em>Default Packaging Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPackagingType()
	 * @generated
	 * @ordered
	 */
	protected String defaultPackagingType = DEFAULT_PACKAGING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelImageType() <em>Label Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelImageType()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_IMAGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelImageType() <em>Label Image Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelImageType()
	 * @generated
	 * @ordered
	 */
	protected String labelImageType = LABEL_IMAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateEstimateTemplate() <em>Rate Estimate Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateEstimateTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_ESTIMATE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateEstimateTemplate() <em>Rate Estimate Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateEstimateTemplate()
	 * @generated
	 * @ordered
	 */
	protected String rateEstimateTemplate = RATE_ESTIMATE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateShipment() <em>Template Shipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateShipment()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_SHIPMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateShipment() <em>Template Shipment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateShipment()
	 * @generated
	 * @ordered
	 */
	protected String templateShipment = TEMPLATE_SHIPMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateSubscription() <em>Template Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateSubscription()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_SUBSCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateSubscription() <em>Template Subscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateSubscription()
	 * @generated
	 * @ordered
	 */
	protected String templateSubscription = TEMPLATE_SUBSCRIPTION_EDEFAULT;

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
		return accessAccountNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessAccountNbr(String newAccessAccountNbr) {
		String oldAccessAccountNbr = accessAccountNbr;
		accessAccountNbr = newAccessAccountNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR, oldAccessAccountNbr, accessAccountNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessMeterNumber() {
		return accessMeterNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessMeterNumber(String newAccessMeterNumber) {
		String oldAccessMeterNumber = accessMeterNumber;
		accessMeterNumber = newAccessMeterNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER, oldAccessMeterNumber, accessMeterNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserKey() {
		return accessUserKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserKey(String newAccessUserKey) {
		String oldAccessUserKey = accessUserKey;
		accessUserKey = newAccessUserKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY, oldAccessUserKey, accessUserKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserPwd() {
		return accessUserPwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserPwd(String newAccessUserPwd) {
		String oldAccessUserPwd = accessUserPwd;
		accessUserPwd = newAccessUserPwd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD, oldAccessUserPwd, accessUserPwd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectSoapUrl() {
		return connectSoapUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectSoapUrl(String newConnectSoapUrl) {
		String oldConnectSoapUrl = connectSoapUrl;
		connectSoapUrl = newConnectSoapUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL, oldConnectSoapUrl, connectSoapUrl));
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
		long oldConnectTimeout = connectTimeout;
		connectTimeout = newConnectTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout));
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
		String oldConnectUrl = connectUrl;
		connectUrl = newConnectUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_URL, oldConnectUrl, connectUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultDropoffType() {
		return defaultDropoffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultDropoffType(String newDefaultDropoffType) {
		String oldDefaultDropoffType = defaultDropoffType;
		defaultDropoffType = newDefaultDropoffType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE, oldDefaultDropoffType, defaultDropoffType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPackagingType() {
		return defaultPackagingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPackagingType(String newDefaultPackagingType) {
		String oldDefaultPackagingType = defaultPackagingType;
		defaultPackagingType = newDefaultPackagingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE, oldDefaultPackagingType, defaultPackagingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelImageType() {
		return labelImageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelImageType(String newLabelImageType) {
		String oldLabelImageType = labelImageType;
		labelImageType = newLabelImageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE, oldLabelImageType, labelImageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateEstimateTemplate() {
		return rateEstimateTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateEstimateTemplate(String newRateEstimateTemplate) {
		String oldRateEstimateTemplate = rateEstimateTemplate;
		rateEstimateTemplate = newRateEstimateTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE, oldRateEstimateTemplate, rateEstimateTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateShipment() {
		return templateShipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateShipment(String newTemplateShipment) {
		String oldTemplateShipment = templateShipment;
		templateShipment = newTemplateShipment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT, oldTemplateShipment, templateShipment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateSubscription() {
		return templateSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateSubscription(String newTemplateSubscription) {
		String oldTemplateSubscription = templateSubscription;
		templateSubscription = newTemplateSubscription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION, oldTemplateSubscription, templateSubscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR:
				return getAccessAccountNbr();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER:
				return getAccessMeterNumber();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY:
				return getAccessUserKey();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD:
				return getAccessUserPwd();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL:
				return getConnectSoapUrl();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT:
				return getConnectTimeout();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_URL:
				return getConnectUrl();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE:
				return getDefaultDropoffType();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE:
				return getDefaultPackagingType();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE:
				return getLabelImageType();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE:
				return getRateEstimateTemplate();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT:
				return getTemplateShipment();
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION:
				return getTemplateSubscription();
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
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR:
				setAccessAccountNbr((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER:
				setAccessMeterNumber((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY:
				setAccessUserKey((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD:
				setAccessUserPwd((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL:
				setConnectSoapUrl((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT:
				setConnectTimeout((Long)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_URL:
				setConnectUrl((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE:
				setDefaultDropoffType((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE:
				setDefaultPackagingType((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE:
				setLabelImageType((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE:
				setRateEstimateTemplate((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT:
				setTemplateShipment((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION:
				setTemplateSubscription((String)newValue);
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
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR:
				setAccessAccountNbr(ACCESS_ACCOUNT_NBR_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER:
				setAccessMeterNumber(ACCESS_METER_NUMBER_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY:
				setAccessUserKey(ACCESS_USER_KEY_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD:
				setAccessUserPwd(ACCESS_USER_PWD_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL:
				setConnectSoapUrl(CONNECT_SOAP_URL_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT:
				setConnectTimeout(CONNECT_TIMEOUT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_URL:
				setConnectUrl(CONNECT_URL_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE:
				setDefaultDropoffType(DEFAULT_DROPOFF_TYPE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE:
				setDefaultPackagingType(DEFAULT_PACKAGING_TYPE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE:
				setLabelImageType(LABEL_IMAGE_TYPE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE:
				setRateEstimateTemplate(RATE_ESTIMATE_TEMPLATE_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT:
				setTemplateShipment(TEMPLATE_SHIPMENT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION:
				setTemplateSubscription(TEMPLATE_SUBSCRIPTION_EDEFAULT);
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
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_ACCOUNT_NBR:
				return ACCESS_ACCOUNT_NBR_EDEFAULT == null ? accessAccountNbr != null : !ACCESS_ACCOUNT_NBR_EDEFAULT.equals(accessAccountNbr);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_METER_NUMBER:
				return ACCESS_METER_NUMBER_EDEFAULT == null ? accessMeterNumber != null : !ACCESS_METER_NUMBER_EDEFAULT.equals(accessMeterNumber);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_KEY:
				return ACCESS_USER_KEY_EDEFAULT == null ? accessUserKey != null : !ACCESS_USER_KEY_EDEFAULT.equals(accessUserKey);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__ACCESS_USER_PWD:
				return ACCESS_USER_PWD_EDEFAULT == null ? accessUserPwd != null : !ACCESS_USER_PWD_EDEFAULT.equals(accessUserPwd);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_SOAP_URL:
				return CONNECT_SOAP_URL_EDEFAULT == null ? connectSoapUrl != null : !CONNECT_SOAP_URL_EDEFAULT.equals(connectSoapUrl);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_TIMEOUT:
				return connectTimeout != CONNECT_TIMEOUT_EDEFAULT;
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__CONNECT_URL:
				return CONNECT_URL_EDEFAULT == null ? connectUrl != null : !CONNECT_URL_EDEFAULT.equals(connectUrl);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_DROPOFF_TYPE:
				return DEFAULT_DROPOFF_TYPE_EDEFAULT == null ? defaultDropoffType != null : !DEFAULT_DROPOFF_TYPE_EDEFAULT.equals(defaultDropoffType);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__DEFAULT_PACKAGING_TYPE:
				return DEFAULT_PACKAGING_TYPE_EDEFAULT == null ? defaultPackagingType != null : !DEFAULT_PACKAGING_TYPE_EDEFAULT.equals(defaultPackagingType);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__LABEL_IMAGE_TYPE:
				return LABEL_IMAGE_TYPE_EDEFAULT == null ? labelImageType != null : !LABEL_IMAGE_TYPE_EDEFAULT.equals(labelImageType);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__RATE_ESTIMATE_TEMPLATE:
				return RATE_ESTIMATE_TEMPLATE_EDEFAULT == null ? rateEstimateTemplate != null : !RATE_ESTIMATE_TEMPLATE_EDEFAULT.equals(rateEstimateTemplate);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SHIPMENT:
				return TEMPLATE_SHIPMENT_EDEFAULT == null ? templateShipment != null : !TEMPLATE_SHIPMENT_EDEFAULT.equals(templateShipment);
			case Shipment_Package.SHIPMENT_GATEWAY_FEDEX__TEMPLATE_SUBSCRIPTION:
				return TEMPLATE_SUBSCRIPTION_EDEFAULT == null ? templateSubscription != null : !TEMPLATE_SUBSCRIPTION_EDEFAULT.equals(templateSubscription);
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
		result.append(" (accessAccountNbr: ");
		result.append(accessAccountNbr);
		result.append(", accessMeterNumber: ");
		result.append(accessMeterNumber);
		result.append(", accessUserKey: ");
		result.append(accessUserKey);
		result.append(", accessUserPwd: ");
		result.append(accessUserPwd);
		result.append(", connectSoapUrl: ");
		result.append(connectSoapUrl);
		result.append(", connectTimeout: ");
		result.append(connectTimeout);
		result.append(", connectUrl: ");
		result.append(connectUrl);
		result.append(", defaultDropoffType: ");
		result.append(defaultDropoffType);
		result.append(", defaultPackagingType: ");
		result.append(defaultPackagingType);
		result.append(", labelImageType: ");
		result.append(labelImageType);
		result.append(", rateEstimateTemplate: ");
		result.append(rateEstimateTemplate);
		result.append(", templateShipment: ");
		result.append(templateShipment);
		result.append(", templateSubscription: ");
		result.append(templateSubscription);
		result.append(')');
		return result.toString();
	}

} //ShipmentGatewayFedexImpl
