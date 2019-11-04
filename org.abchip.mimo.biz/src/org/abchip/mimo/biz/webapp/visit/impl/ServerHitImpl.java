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
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.webapp.visit.ServerHit;
import org.abchip.mimo.biz.webapp.visit.ServerHitType;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Hit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getHitStartDateTime <em>Hit Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getNumOfBytes <em>Num Of Bytes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getReferrerUrl <em>Referrer Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getRequestUrl <em>Request Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getRunningTimeMillis <em>Running Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getHitTypeId <em>Hit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getIdByIpContactMechId <em>Id By Ip Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getRefByWebContactMechId <em>Ref By Web Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getInternalContentId <em>Internal Content Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerHitImpl extends BizEntityTypedImpl<ServerHitType> implements ServerHit {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitId() <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitId()
	 * @generated
	 * @ordered
	 */
	protected String visitId = VISIT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getHitStartDateTime() <em>Hit Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date HIT_START_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHitStartDateTime() <em>Hit Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHitStartDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date hitStartDateTime = HIT_START_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumOfBytes() <em>Num Of Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfBytes()
	 * @generated
	 * @ordered
	 */
	protected static final long NUM_OF_BYTES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumOfBytes() <em>Num Of Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfBytes()
	 * @generated
	 * @ordered
	 */
	protected long numOfBytes = NUM_OF_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferrerUrl() <em>Referrer Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrerUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERRER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferrerUrl() <em>Referrer Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferrerUrl()
	 * @generated
	 * @ordered
	 */
	protected String referrerUrl = REFERRER_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestUrl() <em>Request Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUEST_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestUrl() <em>Request Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUrl()
	 * @generated
	 * @ordered
	 */
	protected String requestUrl = REQUEST_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunningTimeMillis() <em>Running Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected static final long RUNNING_TIME_MILLIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRunningTimeMillis() <em>Running Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningTimeMillis()
	 * @generated
	 * @ordered
	 */
	protected long runningTimeMillis = RUNNING_TIME_MILLIS_EDEFAULT;

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
	 * The default value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected String statusId = STATUS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserLoginId() <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_LOGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserLoginId() <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserLoginId()
	 * @generated
	 * @ordered
	 */
	protected String userLoginId = USER_LOGIN_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;

	/**
	 * The cached value of the '{@link #getIdByIpContactMechId() <em>Id By Ip Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdByIpContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech idByIpContactMechId;

	/**
	 * The cached value of the '{@link #getRefByWebContactMechId() <em>Ref By Web Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefByWebContactMechId()
	 * @generated
	 * @ordered
	 */
	protected ContactMech refByWebContactMechId;

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
	protected ServerHitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.SERVER_HIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisitId() {
		return visitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		String oldVisitId = visitId;
		visitId = newVisitId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__VISIT_ID, oldVisitId, visitId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__CONTENT_ID, oldContentId, contentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getHitStartDateTime() {
		return hitStartDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHitStartDateTime(Date newHitStartDateTime) {
		Date oldHitStartDateTime = hitStartDateTime;
		hitStartDateTime = newHitStartDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__HIT_START_DATE_TIME, oldHitStartDateTime, hitStartDateTime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.SERVER_HIT__HIT_TYPE_ID, oldHitTypeId, hitTypeId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__HIT_TYPE_ID, oldHitTypeId, hitTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getIdByIpContactMechId() {
		if (idByIpContactMechId != null && ((EObject)idByIpContactMechId).eIsProxy()) {
			InternalEObject oldIdByIpContactMechId = (InternalEObject)idByIpContactMechId;
			idByIpContactMechId = (ContactMech)eResolveProxy(oldIdByIpContactMechId);
			if (idByIpContactMechId != oldIdByIpContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID, oldIdByIpContactMechId, idByIpContactMechId));
			}
		}
		return idByIpContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetIdByIpContactMechId() {
		return idByIpContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdByIpContactMechId(ContactMech newIdByIpContactMechId) {
		ContactMech oldIdByIpContactMechId = idByIpContactMechId;
		idByIpContactMechId = newIdByIpContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID, oldIdByIpContactMechId, idByIpContactMechId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.SERVER_HIT__INTERNAL_CONTENT_ID, oldInternalContentId, internalContentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__INTERNAL_CONTENT_ID, oldInternalContentId, internalContentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumOfBytes() {
		return numOfBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfBytes(long newNumOfBytes) {
		long oldNumOfBytes = numOfBytes;
		numOfBytes = newNumOfBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__NUM_OF_BYTES, oldNumOfBytes, numOfBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.SERVER_HIT__PARTY_ID, oldPartyId, partyId));
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		Party oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getRefByWebContactMechId() {
		if (refByWebContactMechId != null && ((EObject)refByWebContactMechId).eIsProxy()) {
			InternalEObject oldRefByWebContactMechId = (InternalEObject)refByWebContactMechId;
			refByWebContactMechId = (ContactMech)eResolveProxy(oldRefByWebContactMechId);
			if (refByWebContactMechId != oldRefByWebContactMechId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisitPackage.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID, oldRefByWebContactMechId, refByWebContactMechId));
			}
		}
		return refByWebContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactMech basicGetRefByWebContactMechId() {
		return refByWebContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefByWebContactMechId(ContactMech newRefByWebContactMechId) {
		ContactMech oldRefByWebContactMechId = refByWebContactMechId;
		refByWebContactMechId = newRefByWebContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID, oldRefByWebContactMechId, refByWebContactMechId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferrerUrl() {
		return referrerUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferrerUrl(String newReferrerUrl) {
		String oldReferrerUrl = referrerUrl;
		referrerUrl = newReferrerUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__REFERRER_URL, oldReferrerUrl, referrerUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestUrl() {
		return requestUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestUrl(String newRequestUrl) {
		String oldRequestUrl = requestUrl;
		requestUrl = newRequestUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__REQUEST_URL, oldRequestUrl, requestUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRunningTimeMillis() {
		return runningTimeMillis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningTimeMillis(long newRunningTimeMillis) {
		long oldRunningTimeMillis = runningTimeMillis;
		runningTimeMillis = newRunningTimeMillis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__RUNNING_TIME_MILLIS, oldRunningTimeMillis, runningTimeMillis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__SERVER_HOST_NAME, oldServerHostName, serverHostName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__SERVER_IP_ADDRESS, oldServerIpAddress, serverIpAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		String oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__STATUS_ID, oldStatusId, statusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLoginId() {
		return userLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		String oldUserLoginId = userLoginId;
		userLoginId = newUserLoginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisitPackage.SERVER_HIT__USER_LOGIN_ID, oldUserLoginId, userLoginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisitPackage.SERVER_HIT__VISIT_ID:
				return getVisitId();
			case VisitPackage.SERVER_HIT__CONTENT_ID:
				return getContentId();
			case VisitPackage.SERVER_HIT__HIT_START_DATE_TIME:
				return getHitStartDateTime();
			case VisitPackage.SERVER_HIT__NUM_OF_BYTES:
				return getNumOfBytes();
			case VisitPackage.SERVER_HIT__REFERRER_URL:
				return getReferrerUrl();
			case VisitPackage.SERVER_HIT__REQUEST_URL:
				return getRequestUrl();
			case VisitPackage.SERVER_HIT__RUNNING_TIME_MILLIS:
				return getRunningTimeMillis();
			case VisitPackage.SERVER_HIT__SERVER_HOST_NAME:
				return getServerHostName();
			case VisitPackage.SERVER_HIT__SERVER_IP_ADDRESS:
				return getServerIpAddress();
			case VisitPackage.SERVER_HIT__STATUS_ID:
				return getStatusId();
			case VisitPackage.SERVER_HIT__USER_LOGIN_ID:
				return getUserLoginId();
			case VisitPackage.SERVER_HIT__HIT_TYPE_ID:
				if (resolve) return getHitTypeId();
				return basicGetHitTypeId();
			case VisitPackage.SERVER_HIT__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case VisitPackage.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID:
				if (resolve) return getIdByIpContactMechId();
				return basicGetIdByIpContactMechId();
			case VisitPackage.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID:
				if (resolve) return getRefByWebContactMechId();
				return basicGetRefByWebContactMechId();
			case VisitPackage.SERVER_HIT__INTERNAL_CONTENT_ID:
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
			case VisitPackage.SERVER_HIT__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__HIT_START_DATE_TIME:
				setHitStartDateTime((Date)newValue);
				return;
			case VisitPackage.SERVER_HIT__NUM_OF_BYTES:
				setNumOfBytes((Long)newValue);
				return;
			case VisitPackage.SERVER_HIT__REFERRER_URL:
				setReferrerUrl((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__REQUEST_URL:
				setRequestUrl((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__RUNNING_TIME_MILLIS:
				setRunningTimeMillis((Long)newValue);
				return;
			case VisitPackage.SERVER_HIT__SERVER_HOST_NAME:
				setServerHostName((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__SERVER_IP_ADDRESS:
				setServerIpAddress((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__STATUS_ID:
				setStatusId((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__USER_LOGIN_ID:
				setUserLoginId((String)newValue);
				return;
			case VisitPackage.SERVER_HIT__HIT_TYPE_ID:
				setHitTypeId((ServerHitType)newValue);
				return;
			case VisitPackage.SERVER_HIT__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case VisitPackage.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID:
				setIdByIpContactMechId((ContactMech)newValue);
				return;
			case VisitPackage.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID:
				setRefByWebContactMechId((ContactMech)newValue);
				return;
			case VisitPackage.SERVER_HIT__INTERNAL_CONTENT_ID:
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
			case VisitPackage.SERVER_HIT__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__HIT_START_DATE_TIME:
				setHitStartDateTime(HIT_START_DATE_TIME_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__NUM_OF_BYTES:
				setNumOfBytes(NUM_OF_BYTES_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__REFERRER_URL:
				setReferrerUrl(REFERRER_URL_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__REQUEST_URL:
				setRequestUrl(REQUEST_URL_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__RUNNING_TIME_MILLIS:
				setRunningTimeMillis(RUNNING_TIME_MILLIS_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__SERVER_HOST_NAME:
				setServerHostName(SERVER_HOST_NAME_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__SERVER_IP_ADDRESS:
				setServerIpAddress(SERVER_IP_ADDRESS_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__STATUS_ID:
				setStatusId(STATUS_ID_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__USER_LOGIN_ID:
				setUserLoginId(USER_LOGIN_ID_EDEFAULT);
				return;
			case VisitPackage.SERVER_HIT__HIT_TYPE_ID:
				setHitTypeId((ServerHitType)null);
				return;
			case VisitPackage.SERVER_HIT__PARTY_ID:
				setPartyId((Party)null);
				return;
			case VisitPackage.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID:
				setIdByIpContactMechId((ContactMech)null);
				return;
			case VisitPackage.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID:
				setRefByWebContactMechId((ContactMech)null);
				return;
			case VisitPackage.SERVER_HIT__INTERNAL_CONTENT_ID:
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
			case VisitPackage.SERVER_HIT__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case VisitPackage.SERVER_HIT__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case VisitPackage.SERVER_HIT__HIT_START_DATE_TIME:
				return HIT_START_DATE_TIME_EDEFAULT == null ? hitStartDateTime != null : !HIT_START_DATE_TIME_EDEFAULT.equals(hitStartDateTime);
			case VisitPackage.SERVER_HIT__NUM_OF_BYTES:
				return numOfBytes != NUM_OF_BYTES_EDEFAULT;
			case VisitPackage.SERVER_HIT__REFERRER_URL:
				return REFERRER_URL_EDEFAULT == null ? referrerUrl != null : !REFERRER_URL_EDEFAULT.equals(referrerUrl);
			case VisitPackage.SERVER_HIT__REQUEST_URL:
				return REQUEST_URL_EDEFAULT == null ? requestUrl != null : !REQUEST_URL_EDEFAULT.equals(requestUrl);
			case VisitPackage.SERVER_HIT__RUNNING_TIME_MILLIS:
				return runningTimeMillis != RUNNING_TIME_MILLIS_EDEFAULT;
			case VisitPackage.SERVER_HIT__SERVER_HOST_NAME:
				return SERVER_HOST_NAME_EDEFAULT == null ? serverHostName != null : !SERVER_HOST_NAME_EDEFAULT.equals(serverHostName);
			case VisitPackage.SERVER_HIT__SERVER_IP_ADDRESS:
				return SERVER_IP_ADDRESS_EDEFAULT == null ? serverIpAddress != null : !SERVER_IP_ADDRESS_EDEFAULT.equals(serverIpAddress);
			case VisitPackage.SERVER_HIT__STATUS_ID:
				return STATUS_ID_EDEFAULT == null ? statusId != null : !STATUS_ID_EDEFAULT.equals(statusId);
			case VisitPackage.SERVER_HIT__USER_LOGIN_ID:
				return USER_LOGIN_ID_EDEFAULT == null ? userLoginId != null : !USER_LOGIN_ID_EDEFAULT.equals(userLoginId);
			case VisitPackage.SERVER_HIT__HIT_TYPE_ID:
				return hitTypeId != null;
			case VisitPackage.SERVER_HIT__PARTY_ID:
				return partyId != null;
			case VisitPackage.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID:
				return idByIpContactMechId != null;
			case VisitPackage.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID:
				return refByWebContactMechId != null;
			case VisitPackage.SERVER_HIT__INTERNAL_CONTENT_ID:
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
		result.append(" (visitId: ");
		result.append(visitId);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", hitStartDateTime: ");
		result.append(hitStartDateTime);
		result.append(", numOfBytes: ");
		result.append(numOfBytes);
		result.append(", referrerUrl: ");
		result.append(referrerUrl);
		result.append(", requestUrl: ");
		result.append(requestUrl);
		result.append(", runningTimeMillis: ");
		result.append(runningTimeMillis);
		result.append(", serverHostName: ");
		result.append(serverHostName);
		result.append(", serverIpAddress: ");
		result.append(serverIpAddress);
		result.append(", statusId: ");
		result.append(statusId);
		result.append(", userLoginId: ");
		result.append(userLoginId);
		result.append(')');
		return result.toString();
	}

} //ServerHitImpl
