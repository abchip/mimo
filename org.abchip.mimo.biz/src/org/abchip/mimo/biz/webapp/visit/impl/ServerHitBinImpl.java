/**
 * Copyright (c) 2017, 2019 ABChip and others.
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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getMaxTimeMillis <em>Max Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getMinTimeMillis <em>Min Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getNumberHits <em>Number Hits</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getTotalTimeMillis <em>Total Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getHitTypeId <em>Hit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitBinImpl#getInternalContentId <em>Internal Content Id</em>}</li>
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
	 * The default value of the '{@link #getServerHitBinId() <em>Server Hit Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHitBinId()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_HIT_BIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerHitBinId() <em>Server Hit Bin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHitBinId()
	 * @generated
	 * @ordered
	 */
	protected String serverHitBinId = SERVER_HIT_BIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinEndDateTime() <em>Bin End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIN_END_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinEndDateTime() <em>Bin End Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinEndDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date binEndDateTime = BIN_END_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBinStartDateTime() <em>Bin Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIN_START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBinStartDateTime() <em>Bin Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date binStartDateTime = BIN_START_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected String contentId = CONTENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTimeMillis() <em>Max Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_TIME_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxTimeMillis() <em>Max Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected long maxTimeMillis = MAX_TIME_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTimeMillis() <em>Min Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_TIME_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinTimeMillis() <em>Min Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected long minTimeMillis = MIN_TIME_MILLIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberHits() <em>Number Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberHits()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMBER_HITS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumberHits() <em>Number Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberHits()
	 * @generated
	 * @ordered
	 */
	protected long numberHits = NUMBER_HITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerHostName() <em>Server Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerHostName() <em>Server Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerHostName()
	 * @generated
	 * @ordered
	 */
	protected String serverHostName = SERVER_HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerIpAddress() <em>Server Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerIpAddress() <em>Server Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String serverIpAddress = SERVER_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalTimeMillis() <em>Total Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_TIME_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotalTimeMillis() <em>Total Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected long totalTimeMillis = TOTAL_TIME_MILLIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHitTypeId() <em>Hit Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitTypeId()
	 * @generated
	 * @ordered
	 */
	protected ServerHitType hitTypeId;

	/**
	 * The cached value of the '{@link #getInternalContentId() <em>Internal Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalContentId()
	 * @generated
	 * @ordered
	 */
	protected Content internalContentId;

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
		return serverHitBinId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHitBinId(String newServerHitBinId) {
		String oldServerHitBinId = serverHitBinId;
		serverHitBinId = newServerHitBinId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__SERVER_HIT_BIN_ID, oldServerHitBinId, serverHitBinId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBinEndDateTime() {
		return binEndDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinEndDateTime(Date newBinEndDateTime) {
		Date oldBinEndDateTime = binEndDateTime;
		binEndDateTime = newBinEndDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__BIN_END_DATE_TIME, oldBinEndDateTime, binEndDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getBinStartDateTime() {
		return binStartDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinStartDateTime(Date newBinStartDateTime) {
		Date oldBinStartDateTime = binStartDateTime;
		binStartDateTime = newBinStartDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__BIN_START_DATE_TIME, oldBinStartDateTime, binStartDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		String oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerHitType getHitTypeId() {
		if (hitTypeId != null && ((EObject)hitTypeId).eIsProxy()) {
			InternalEObject oldHitTypeId = (InternalEObject)hitTypeId;
			hitTypeId = (ServerHitType)eResolveProxy(oldHitTypeId);
			if (hitTypeId != oldHitTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.SERVER_HIT_BIN__HIT_TYPE_ID, oldHitTypeId, hitTypeId));
			}
		}
		return hitTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerHitType basicGetHitTypeId() {
		return hitTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHitTypeId(ServerHitType newHitTypeId) {
		ServerHitType oldHitTypeId = hitTypeId;
		hitTypeId = newHitTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__HIT_TYPE_ID, oldHitTypeId, hitTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getInternalContentId() {
		if (internalContentId != null && ((EObject)internalContentId).eIsProxy()) {
			InternalEObject oldInternalContentId = (InternalEObject)internalContentId;
			internalContentId = (Content)eResolveProxy(oldInternalContentId);
			if (internalContentId != oldInternalContentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.SERVER_HIT_BIN__INTERNAL_CONTENT_ID, oldInternalContentId, internalContentId));
			}
		}
		return internalContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetInternalContentId() {
		return internalContentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalContentId(Content newInternalContentId) {
		Content oldInternalContentId = internalContentId;
		internalContentId = newInternalContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__INTERNAL_CONTENT_ID, oldInternalContentId, internalContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaxTimeMillis() {
		return maxTimeMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTimeMillis(long newMaxTimeMillis) {
		long oldMaxTimeMillis = maxTimeMillis;
		maxTimeMillis = newMaxTimeMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__MAX_TIME_MILLIS, oldMaxTimeMillis, maxTimeMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMinTimeMillis() {
		return minTimeMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinTimeMillis(long newMinTimeMillis) {
		long oldMinTimeMillis = minTimeMillis;
		minTimeMillis = newMinTimeMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__MIN_TIME_MILLIS, oldMinTimeMillis, minTimeMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumberHits() {
		return numberHits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberHits(long newNumberHits) {
		long oldNumberHits = numberHits;
		numberHits = newNumberHits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__NUMBER_HITS, oldNumberHits, numberHits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerHostName() {
		return serverHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHostName(String newServerHostName) {
		String oldServerHostName = serverHostName;
		serverHostName = newServerHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__SERVER_HOST_NAME, oldServerHostName, serverHostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerIpAddress() {
		return serverIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerIpAddress(String newServerIpAddress) {
		String oldServerIpAddress = serverIpAddress;
		serverIpAddress = newServerIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__SERVER_IP_ADDRESS, oldServerIpAddress, serverIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTotalTimeMillis() {
		return totalTimeMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalTimeMillis(long newTotalTimeMillis) {
		long oldTotalTimeMillis = totalTimeMillis;
		totalTimeMillis = newTotalTimeMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT_BIN__TOTAL_TIME_MILLIS, oldTotalTimeMillis, totalTimeMillis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisitPackage.SERVER_HIT_BIN__SERVER_HIT_BIN_ID:
				return getServerHitBinId();
			case VisitPackage.SERVER_HIT_BIN__BIN_END_DATE_TIME:
				return getBinEndDateTime();
			case VisitPackage.SERVER_HIT_BIN__BIN_START_DATE_TIME:
				return getBinStartDateTime();
			case VisitPackage.SERVER_HIT_BIN__CONTENT_ID:
				return getContentId();
			case VisitPackage.SERVER_HIT_BIN__MAX_TIME_MILLIS:
				return getMaxTimeMillis();
			case VisitPackage.SERVER_HIT_BIN__MIN_TIME_MILLIS:
				return getMinTimeMillis();
			case VisitPackage.SERVER_HIT_BIN__NUMBER_HITS:
				return getNumberHits();
			case VisitPackage.SERVER_HIT_BIN__SERVER_HOST_NAME:
				return getServerHostName();
			case VisitPackage.SERVER_HIT_BIN__SERVER_IP_ADDRESS:
				return getServerIpAddress();
			case VisitPackage.SERVER_HIT_BIN__TOTAL_TIME_MILLIS:
				return getTotalTimeMillis();
			case VisitPackage.SERVER_HIT_BIN__HIT_TYPE_ID:
				if (resolve) return getHitTypeId();
				return basicGetHitTypeId();
			case VisitPackage.SERVER_HIT_BIN__INTERNAL_CONTENT_ID:
				if (resolve) return getInternalContentId();
				return basicGetInternalContentId();
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
			case VisitPackage.SERVER_HIT_BIN__SERVER_HIT_BIN_ID:
				setServerHitBinId((String)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__BIN_END_DATE_TIME:
				setBinEndDateTime((Date)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__BIN_START_DATE_TIME:
				setBinStartDateTime((Date)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__MAX_TIME_MILLIS:
				setMaxTimeMillis((Long)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__MIN_TIME_MILLIS:
				setMinTimeMillis((Long)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__NUMBER_HITS:
				setNumberHits((Long)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__SERVER_HOST_NAME:
				setServerHostName((String)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__SERVER_IP_ADDRESS:
				setServerIpAddress((String)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__TOTAL_TIME_MILLIS:
				setTotalTimeMillis((Long)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__HIT_TYPE_ID:
				setHitTypeId((ServerHitType)newValue);
				return;
			case VisitPackage.SERVER_HIT_BIN__INTERNAL_CONTENT_ID:
				setInternalContentId((Content)newValue);
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
			case VisitPackage.SERVER_HIT_BIN__SERVER_HIT_BIN_ID:
				setServerHitBinId(SERVER_HIT_BIN_ID_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__BIN_END_DATE_TIME:
				setBinEndDateTime(BIN_END_DATE_TIME_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__BIN_START_DATE_TIME:
				setBinStartDateTime(BIN_START_DATE_TIME_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__MAX_TIME_MILLIS:
				setMaxTimeMillis(MAX_TIME_MILLIS_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__MIN_TIME_MILLIS:
				setMinTimeMillis(MIN_TIME_MILLIS_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__NUMBER_HITS:
				setNumberHits(NUMBER_HITS_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__SERVER_HOST_NAME:
				setServerHostName(SERVER_HOST_NAME_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__SERVER_IP_ADDRESS:
				setServerIpAddress(SERVER_IP_ADDRESS_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__TOTAL_TIME_MILLIS:
				setTotalTimeMillis(TOTAL_TIME_MILLIS_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT_BIN__HIT_TYPE_ID:
				setHitTypeId((ServerHitType)null);
				return;
			case VisitPackage.SERVER_HIT_BIN__INTERNAL_CONTENT_ID:
				setInternalContentId((Content)null);
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
			case VisitPackage.SERVER_HIT_BIN__SERVER_HIT_BIN_ID:
				return SERVER_HIT_BIN_ID_EDEFAULT == null ? serverHitBinId != null : !SERVER_HIT_BIN_ID_EDEFAULT.equals(serverHitBinId);
			case VisitPackage.SERVER_HIT_BIN__BIN_END_DATE_TIME:
				return BIN_END_DATE_TIME_EDEFAULT == null ? binEndDateTime != null : !BIN_END_DATE_TIME_EDEFAULT.equals(binEndDateTime);
			case VisitPackage.SERVER_HIT_BIN__BIN_START_DATE_TIME:
				return BIN_START_DATE_TIME_EDEFAULT == null ? binStartDateTime != null : !BIN_START_DATE_TIME_EDEFAULT.equals(binStartDateTime);
			case VisitPackage.SERVER_HIT_BIN__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case VisitPackage.SERVER_HIT_BIN__MAX_TIME_MILLIS:
				return maxTimeMillis != MAX_TIME_MILLIS_EDEFAULT;
			case VisitPackage.SERVER_HIT_BIN__MIN_TIME_MILLIS:
				return minTimeMillis != MIN_TIME_MILLIS_EDEFAULT;
			case VisitPackage.SERVER_HIT_BIN__NUMBER_HITS:
				return numberHits != NUMBER_HITS_EDEFAULT;
			case VisitPackage.SERVER_HIT_BIN__SERVER_HOST_NAME:
				return SERVER_HOST_NAME_EDEFAULT == null ? serverHostName != null : !SERVER_HOST_NAME_EDEFAULT.equals(serverHostName);
			case VisitPackage.SERVER_HIT_BIN__SERVER_IP_ADDRESS:
				return SERVER_IP_ADDRESS_EDEFAULT == null ? serverIpAddress != null : !SERVER_IP_ADDRESS_EDEFAULT.equals(serverIpAddress);
			case VisitPackage.SERVER_HIT_BIN__TOTAL_TIME_MILLIS:
				return totalTimeMillis != TOTAL_TIME_MILLIS_EDEFAULT;
			case VisitPackage.SERVER_HIT_BIN__HIT_TYPE_ID:
				return hitTypeId != null;
			case VisitPackage.SERVER_HIT_BIN__INTERNAL_CONTENT_ID:
				return internalContentId != null;
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
		result.append(" (serverHitBinId: ");
		result.append(serverHitBinId);
		result.append(", binEndDateTime: ");
		result.append(binEndDateTime);
		result.append(", binStartDateTime: ");
		result.append(binStartDateTime);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", maxTimeMillis: ");
		result.append(maxTimeMillis);
		result.append(", minTimeMillis: ");
		result.append(minTimeMillis);
		result.append(", numberHits: ");
		result.append(numberHits);
		result.append(", serverHostName: ");
		result.append(serverHostName);
		result.append(", serverIpAddress: ");
		result.append(serverIpAddress);
		result.append(", totalTimeMillis: ");
		result.append(totalTimeMillis);
		result.append(')');
		return result.toString();
	}

} //ServerHitBinImpl
