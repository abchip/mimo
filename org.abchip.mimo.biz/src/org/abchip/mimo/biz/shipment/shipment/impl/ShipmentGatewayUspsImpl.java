/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.shipment.shipment.impl;

import org.abchip.mimo.biz.shipment.shipment.ShipmentGatewayUsps;
import org.abchip.mimo.biz.shipment.shipment.Shipment_Package;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment Gateway Usps</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getAccessPassword <em>Access Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getAccessUserId <em>Access User Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getConnectTimeout <em>Connect Timeout</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getConnectUrl <em>Connect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getConnectUrlLabels <em>Connect Url Labels</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getMaxEstimateWeight <em>Max Estimate Weight</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.shipment.shipment.impl.ShipmentGatewayUspsImpl#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentGatewayUspsImpl extends ShipmentGatewayConfigImpl implements ShipmentGatewayUsps {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentGatewayUspsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessPassword() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPassword(String newAccessPassword) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__ACCESS_PASSWORD, newAccessPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessUserId() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessUserId(String newAccessUserId) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__ACCESS_USER_ID, newAccessUserId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getConnectTimeout() {
		return (Long)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectTimeout(long newConnectTimeout) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__CONNECT_TIMEOUT, newConnectTimeout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrl() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__CONNECT_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrl(String newConnectUrl) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__CONNECT_URL, newConnectUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConnectUrlLabels() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectUrlLabels(String newConnectUrlLabels) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__CONNECT_URL_LABELS, newConnectUrlLabels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxEstimateWeight() {
		return (Long)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxEstimateWeight(long newMaxEstimateWeight) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__MAX_ESTIMATE_WEIGHT, newMaxEstimateWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTest() {
		return (String)eGet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__TEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTest(String newTest) {
		eSet(Shipment_Package.Literals.SHIPMENT_GATEWAY_USPS__TEST, newTest);
	}

} //ShipmentGatewayUspsImpl
