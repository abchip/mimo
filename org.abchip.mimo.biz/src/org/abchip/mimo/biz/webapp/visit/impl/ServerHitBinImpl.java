/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.webapp.visit.ServerHitBin;
import org.abchip.mimo.biz.webapp.visit.ServerHitType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Hit Bin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getServerHitBinId <em>Server Hit Bin Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getBinEndDateTime <em>Bin End Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getBinStartDateTime <em>Bin Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getHitTypeId <em>Hit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getInternalContentId <em>Internal Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getMaxTimeMillis <em>Max Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getMinTimeMillis <em>Min Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getNumberHits <em>Number Hits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getTotalTimeMillis <em>Total Time Millis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerHitBinImpl extends BizEntityImpl implements ServerHitBin {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerHitBinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.SERVER_HIT_BIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerHitBinId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HIT_BIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHitBinId(String newServerHitBinId) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HIT_BIN_ID, newServerHitBinId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBinEndDateTime() {
		return (Date)eGet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_END_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinEndDateTime(Date newBinEndDateTime) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_END_DATE_TIME, newBinEndDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBinStartDateTime() {
		return (Date)eGet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_START_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinStartDateTime(Date newBinStartDateTime) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__BIN_START_DATE_TIME, newBinStartDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__CONTENT_ID, newContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerHitType getHitTypeId() {
		return (ServerHitType)eGet(VisitPackage.Literals.SERVER_HIT_BIN__HIT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHitTypeId(ServerHitType newHitTypeId) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__HIT_TYPE_ID, newHitTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getInternalContentId() {
		return (Content)eGet(VisitPackage.Literals.SERVER_HIT_BIN__INTERNAL_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalContentId(Content newInternalContentId) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__INTERNAL_CONTENT_ID, newInternalContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxTimeMillis() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__MAX_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTimeMillis(long newMaxTimeMillis) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__MAX_TIME_MILLIS, newMaxTimeMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMinTimeMillis() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__MIN_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTimeMillis(long newMinTimeMillis) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__MIN_TIME_MILLIS, newMinTimeMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumberHits() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__NUMBER_HITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberHits(long newNumberHits) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__NUMBER_HITS, newNumberHits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerHostName() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HOST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHostName(String newServerHostName) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_HOST_NAME, newServerHostName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerIpAddress() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_IP_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerIpAddress(String newServerIpAddress) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__SERVER_IP_ADDRESS, newServerIpAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalTimeMillis() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT_BIN__TOTAL_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalTimeMillis(long newTotalTimeMillis) {
		eSet(VisitPackage.Literals.SERVER_HIT_BIN__TOTAL_TIME_MILLIS, newTotalTimeMillis);
	}

} //ServerHitBinImpl
