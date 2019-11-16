/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Gateway Dhl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getAccessAccountNbr <em>Access Account Nbr</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getAccessPassword <em>Access Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getAccessShippingKey <em>Access Shipping Key</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getAccessUserId <em>Access User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getHeadAction <em>Head Action</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getHeadVersion <em>Head Version</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getLabelImageFormat <em>Label Image Format</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayDhlImpl#getRateEstimateTemplate <em>Rate Estimate Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentGatewayDhlImpl extends ShipmentGatewayConfigImpl implements ShipmentGatewayDhl {
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
	 * The default value of the '{@link #getAccessShippingKey() <em>Access Shipping Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessShippingKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_SHIPPING_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessShippingKey() <em>Access Shipping Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessShippingKey()
	 * @generated
	 * @ordered
	 */
	protected String accessShippingKey = ACCESS_SHIPPING_KEY_EDEFAULT;

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
	 * The default value of the '{@link #getHeadAction() <em>Head Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadAction()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAD_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeadAction() <em>Head Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadAction()
	 * @generated
	 * @ordered
	 */
	protected String headAction = HEAD_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeadVersion() <em>Head Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAD_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeadVersion() <em>Head Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadVersion()
	 * @generated
	 * @ordered
	 */
	protected String headVersion = HEAD_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelImageFormat() <em>Label Image Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelImageFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_IMAGE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelImageFormat() <em>Label Image Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelImageFormat()
	 * @generated
	 * @ordered
	 */
	protected String labelImageFormat = LABEL_IMAGE_FORMAT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentGatewayDhlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR, oldAccessAccountNbr, accessAccountNbr));
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
		String oldAccessPassword = accessPassword;
		accessPassword = newAccessPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD, oldAccessPassword, accessPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessShippingKey() {
		return accessShippingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessShippingKey(String newAccessShippingKey) {
		String oldAccessShippingKey = accessShippingKey;
		accessShippingKey = newAccessShippingKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY, oldAccessShippingKey, accessShippingKey));
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
		String oldAccessUserId = accessUserId;
		accessUserId = newAccessUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID, oldAccessUserId, accessUserId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT, oldConnectTimeout, connectTimeout));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_URL, oldConnectUrl, connectUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadAction() {
		return headAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadAction(String newHeadAction) {
		String oldHeadAction = headAction;
		headAction = newHeadAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_ACTION, oldHeadAction, headAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadVersion() {
		return headVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadVersion(String newHeadVersion) {
		String oldHeadVersion = headVersion;
		headVersion = newHeadVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_VERSION, oldHeadVersion, headVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelImageFormat() {
		return labelImageFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelImageFormat(String newLabelImageFormat) {
		String oldLabelImageFormat = labelImageFormat;
		labelImageFormat = newLabelImageFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT, oldLabelImageFormat, labelImageFormat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Shipment_Package.SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE, oldRateEstimateTemplate, rateEstimateTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR:
				return getAccessAccountNbr();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD:
				return getAccessPassword();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY:
				return getAccessShippingKey();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID:
				return getAccessUserId();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT:
				return getConnectTimeout();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_URL:
				return getConnectUrl();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_ACTION:
				return getHeadAction();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_VERSION:
				return getHeadVersion();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT:
				return getLabelImageFormat();
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE:
				return getRateEstimateTemplate();
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
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR:
				setAccessAccountNbr((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD:
				setAccessPassword((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY:
				setAccessShippingKey((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID:
				setAccessUserId((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT:
				setConnectTimeout((Long)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_URL:
				setConnectUrl((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_ACTION:
				setHeadAction((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_VERSION:
				setHeadVersion((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT:
				setLabelImageFormat((String)newValue);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE:
				setRateEstimateTemplate((String)newValue);
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
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR:
				setAccessAccountNbr(ACCESS_ACCOUNT_NBR_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD:
				setAccessPassword(ACCESS_PASSWORD_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY:
				setAccessShippingKey(ACCESS_SHIPPING_KEY_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID:
				setAccessUserId(ACCESS_USER_ID_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT:
				setConnectTimeout(CONNECT_TIMEOUT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_URL:
				setConnectUrl(CONNECT_URL_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_ACTION:
				setHeadAction(HEAD_ACTION_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_VERSION:
				setHeadVersion(HEAD_VERSION_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT:
				setLabelImageFormat(LABEL_IMAGE_FORMAT_EDEFAULT);
				return;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE:
				setRateEstimateTemplate(RATE_ESTIMATE_TEMPLATE_EDEFAULT);
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
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR:
				return ACCESS_ACCOUNT_NBR_EDEFAULT == null ? accessAccountNbr != null : !ACCESS_ACCOUNT_NBR_EDEFAULT.equals(accessAccountNbr);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD:
				return ACCESS_PASSWORD_EDEFAULT == null ? accessPassword != null : !ACCESS_PASSWORD_EDEFAULT.equals(accessPassword);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY:
				return ACCESS_SHIPPING_KEY_EDEFAULT == null ? accessShippingKey != null : !ACCESS_SHIPPING_KEY_EDEFAULT.equals(accessShippingKey);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID:
				return ACCESS_USER_ID_EDEFAULT == null ? accessUserId != null : !ACCESS_USER_ID_EDEFAULT.equals(accessUserId);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT:
				return connectTimeout != CONNECT_TIMEOUT_EDEFAULT;
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__CONNECT_URL:
				return CONNECT_URL_EDEFAULT == null ? connectUrl != null : !CONNECT_URL_EDEFAULT.equals(connectUrl);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_ACTION:
				return HEAD_ACTION_EDEFAULT == null ? headAction != null : !HEAD_ACTION_EDEFAULT.equals(headAction);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__HEAD_VERSION:
				return HEAD_VERSION_EDEFAULT == null ? headVersion != null : !HEAD_VERSION_EDEFAULT.equals(headVersion);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT:
				return LABEL_IMAGE_FORMAT_EDEFAULT == null ? labelImageFormat != null : !LABEL_IMAGE_FORMAT_EDEFAULT.equals(labelImageFormat);
			case Shipment_Package.SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE:
				return RATE_ESTIMATE_TEMPLATE_EDEFAULT == null ? rateEstimateTemplate != null : !RATE_ESTIMATE_TEMPLATE_EDEFAULT.equals(rateEstimateTemplate);
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
		result.append(", accessPassword: ");
		result.append(accessPassword);
		result.append(", accessShippingKey: ");
		result.append(accessShippingKey);
		result.append(", accessUserId: ");
		result.append(accessUserId);
		result.append(", connectTimeout: ");
		result.append(connectTimeout);
		result.append(", connectUrl: ");
		result.append(connectUrl);
		result.append(", headAction: ");
		result.append(headAction);
		result.append(", headVersion: ");
		result.append(headVersion);
		result.append(", labelImageFormat: ");
		result.append(labelImageFormat);
		result.append(", rateEstimateTemplate: ");
		result.append(rateEstimateTemplate);
		result.append(')');
		return result.toString();
	}

} //ShipmentGatewayDhlImpl
