/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayDhl;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

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
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessAccountNbr(String newAccessAccountNbr) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_ACCOUNT_NBR, newAccessAccountNbr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessPassword() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPassword(String newAccessPassword) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_PASSWORD, newAccessPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessShippingKey() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessShippingKey(String newAccessShippingKey) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_SHIPPING_KEY, newAccessShippingKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserId(String newAccessUserId) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__ACCESS_USER_ID, newAccessUserId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectTimeout() {
		return (Long)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeout(long newConnectTimeout) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__CONNECT_TIMEOUT, newConnectTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrl() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__CONNECT_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrl(String newConnectUrl) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__CONNECT_URL, newConnectUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadAction() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__HEAD_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadAction(String newHeadAction) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__HEAD_ACTION, newHeadAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadVersion() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__HEAD_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadVersion(String newHeadVersion) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__HEAD_VERSION, newHeadVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelImageFormat() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelImageFormat(String newLabelImageFormat) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__LABEL_IMAGE_FORMAT, newLabelImageFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateEstimateTemplate() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateEstimateTemplate(String newRateEstimateTemplate) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_DHL__RATE_ESTIMATE_TEMPLATE, newRateEstimateTemplate);
	}

} //ShipmentGatewayDhlImpl
