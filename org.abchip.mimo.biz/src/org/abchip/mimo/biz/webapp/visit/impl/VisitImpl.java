/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.webapp.visit.UserAgent;
import org.abchip.mimo.biz.webapp.visit.Visit;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.abchip.mimo.biz.webapp.visit.Visitor;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getClientHostName <em>Client Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getClientIpAddress <em>Client Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getClientIpCountryGeoId <em>Client Ip Country Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getClientIpIspName <em>Client Ip Isp Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getClientIpPostalCode <em>Client Ip Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getClientIpStateProvGeoId <em>Client Ip State Prov Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getClientUser <em>Client User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getCookie <em>Cookie</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getInitialLocale <em>Initial Locale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getInitialReferrer <em>Initial Referrer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getInitialRequest <em>Initial Request</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getInitialUserAgent <em>Initial User Agent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#isUserCreated <em>User Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getWebappName <em>Webapp Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getVisitorId <em>Visitor Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getUserAgentId <em>User Agent Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisitImpl extends BizEntityImpl implements Visit {
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
	 * The default value of the '{@link #getClientHostName() <em>Client Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientHostName() <em>Client Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientHostName()
	 * @generated
	 * @ordered
	 */
	protected String clientHostName = CLIENT_HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientIpAddress() <em>Client Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientIpAddress() <em>Client Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String clientIpAddress = CLIENT_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientIpCountryGeoId() <em>Client Ip Country Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpCountryGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_IP_COUNTRY_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientIpCountryGeoId() <em>Client Ip Country Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpCountryGeoId()
	 * @generated
	 * @ordered
	 */
	protected String clientIpCountryGeoId = CLIENT_IP_COUNTRY_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientIpIspName() <em>Client Ip Isp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpIspName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_IP_ISP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientIpIspName() <em>Client Ip Isp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpIspName()
	 * @generated
	 * @ordered
	 */
	protected String clientIpIspName = CLIENT_IP_ISP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientIpPostalCode() <em>Client Ip Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_IP_POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientIpPostalCode() <em>Client Ip Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String clientIpPostalCode = CLIENT_IP_POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientIpStateProvGeoId() <em>Client Ip State Prov Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpStateProvGeoId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_IP_STATE_PROV_GEO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientIpStateProvGeoId() <em>Client Ip State Prov Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIpStateProvGeoId()
	 * @generated
	 * @ordered
	 */
	protected String clientIpStateProvGeoId = CLIENT_IP_STATE_PROV_GEO_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientUser() <em>Client User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientUser()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientUser() <em>Client User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientUser()
	 * @generated
	 * @ordered
	 */
	protected String clientUser = CLIENT_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCookie() <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookie()
	 * @generated
	 * @ordered
	 */
	protected static final String COOKIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCookie() <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookie()
	 * @generated
	 * @ordered
	 */
	protected String cookie = COOKIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialLocale() <em>Initial Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLocale()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_LOCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialLocale() <em>Initial Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLocale()
	 * @generated
	 * @ordered
	 */
	protected String initialLocale = INITIAL_LOCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialReferrer() <em>Initial Referrer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReferrer()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_REFERRER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialReferrer() <em>Initial Referrer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReferrer()
	 * @generated
	 * @ordered
	 */
	protected String initialReferrer = INITIAL_REFERRER_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialRequest() <em>Initial Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRequest()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialRequest() <em>Initial Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialRequest()
	 * @generated
	 * @ordered
	 */
	protected String initialRequest = INITIAL_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialUserAgent() <em>Initial User Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialUserAgent()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_USER_AGENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialUserAgent() <em>Initial User Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialUserAgent()
	 * @generated
	 * @ordered
	 */
	protected String initialUserAgent = INITIAL_USER_AGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected String partyId = PARTY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleTypeId() <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleTypeId()
	 * @generated
	 * @ordered
	 */
	protected String roleTypeId = ROLE_TYPE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionId() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionId()
	 * @generated
	 * @ordered
	 */
	protected String sessionId = SESSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUserCreated() <em>User Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserCreated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USER_CREATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUserCreated() <em>User Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUserCreated()
	 * @generated
	 * @ordered
	 */
	protected boolean userCreated = USER_CREATED_EDEFAULT;

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
	 * The default value of the '{@link #getWebappName() <em>Webapp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebappName()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBAPP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebappName() <em>Webapp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebappName()
	 * @generated
	 * @ordered
	 */
	protected String webappName = WEBAPP_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisitorId() <em>Visitor Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitorId()
	 * @generated
	 * @ordered
	 */
	protected Visitor visitorId;

	/**
	 * The cached value of the '{@link #getUserAgentId() <em>User Agent Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserAgentId()
	 * @generated
	 * @ordered
	 */
	protected UserAgent userAgentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisitPackage.Literals.VISIT;
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
		visitId = newVisitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientHostName() {
		return clientHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientHostName(String newClientHostName) {
		clientHostName = newClientHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpAddress() {
		return clientIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpAddress(String newClientIpAddress) {
		clientIpAddress = newClientIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpCountryGeoId() {
		return clientIpCountryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpCountryGeoId(String newClientIpCountryGeoId) {
		clientIpCountryGeoId = newClientIpCountryGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpIspName() {
		return clientIpIspName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpIspName(String newClientIpIspName) {
		clientIpIspName = newClientIpIspName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpPostalCode() {
		return clientIpPostalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpPostalCode(String newClientIpPostalCode) {
		clientIpPostalCode = newClientIpPostalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpStateProvGeoId() {
		return clientIpStateProvGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpStateProvGeoId(String newClientIpStateProvGeoId) {
		clientIpStateProvGeoId = newClientIpStateProvGeoId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientUser() {
		return clientUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientUser(String newClientUser) {
		clientUser = newClientUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		contactMechId = newContactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCookie() {
		return cookie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCookie(String newCookie) {
		cookie = newCookie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialLocale() {
		return initialLocale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialLocale(String newInitialLocale) {
		initialLocale = newInitialLocale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialReferrer() {
		return initialReferrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialReferrer(String newInitialReferrer) {
		initialReferrer = newInitialReferrer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialRequest() {
		return initialRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialRequest(String newInitialRequest) {
		initialRequest = newInitialRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialUserAgent() {
		return initialUserAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialUserAgent(String newInitialUserAgent) {
		initialUserAgent = newInitialUserAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return roleTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		roleTypeId = newRoleTypeId;
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
		serverHostName = newServerHostName;
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
		serverIpAddress = newServerIpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionId(String newSessionId) {
		sessionId = newSessionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgent getUserAgentId() {
		if (userAgentId != null && ((EObject)userAgentId).eIsProxy()) {
			InternalEObject oldUserAgentId = (InternalEObject)userAgentId;
			userAgentId = (UserAgent)eResolveProxy(oldUserAgentId);
			if (userAgentId != oldUserAgentId) {
			}
		}
		return userAgentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAgent basicGetUserAgentId() {
		return userAgentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentId(UserAgent newUserAgentId) {
		userAgentId = newUserAgentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUserCreated() {
		return userCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserCreated(boolean newUserCreated) {
		userCreated = newUserCreated;
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
		userLoginId = newUserLoginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visitor getVisitorId() {
		if (visitorId != null && ((EObject)visitorId).eIsProxy()) {
			InternalEObject oldVisitorId = (InternalEObject)visitorId;
			visitorId = (Visitor)eResolveProxy(oldVisitorId);
			if (visitorId != oldVisitorId) {
			}
		}
		return visitorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visitor basicGetVisitorId() {
		return visitorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitorId(Visitor newVisitorId) {
		visitorId = newVisitorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebappName() {
		return webappName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebappName(String newWebappName) {
		webappName = newWebappName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisitPackage.VISIT__VISIT_ID:
				return getVisitId();
			case VisitPackage.VISIT__CLIENT_HOST_NAME:
				return getClientHostName();
			case VisitPackage.VISIT__CLIENT_IP_ADDRESS:
				return getClientIpAddress();
			case VisitPackage.VISIT__CLIENT_IP_COUNTRY_GEO_ID:
				return getClientIpCountryGeoId();
			case VisitPackage.VISIT__CLIENT_IP_ISP_NAME:
				return getClientIpIspName();
			case VisitPackage.VISIT__CLIENT_IP_POSTAL_CODE:
				return getClientIpPostalCode();
			case VisitPackage.VISIT__CLIENT_IP_STATE_PROV_GEO_ID:
				return getClientIpStateProvGeoId();
			case VisitPackage.VISIT__CLIENT_USER:
				return getClientUser();
			case VisitPackage.VISIT__CONTACT_MECH_ID:
				return getContactMechId();
			case VisitPackage.VISIT__COOKIE:
				return getCookie();
			case VisitPackage.VISIT__FROM_DATE:
				return getFromDate();
			case VisitPackage.VISIT__INITIAL_LOCALE:
				return getInitialLocale();
			case VisitPackage.VISIT__INITIAL_REFERRER:
				return getInitialReferrer();
			case VisitPackage.VISIT__INITIAL_REQUEST:
				return getInitialRequest();
			case VisitPackage.VISIT__INITIAL_USER_AGENT:
				return getInitialUserAgent();
			case VisitPackage.VISIT__PARTY_ID:
				return getPartyId();
			case VisitPackage.VISIT__ROLE_TYPE_ID:
				return getRoleTypeId();
			case VisitPackage.VISIT__SERVER_HOST_NAME:
				return getServerHostName();
			case VisitPackage.VISIT__SERVER_IP_ADDRESS:
				return getServerIpAddress();
			case VisitPackage.VISIT__SESSION_ID:
				return getSessionId();
			case VisitPackage.VISIT__THRU_DATE:
				return getThruDate();
			case VisitPackage.VISIT__USER_CREATED:
				return isUserCreated();
			case VisitPackage.VISIT__USER_LOGIN_ID:
				return getUserLoginId();
			case VisitPackage.VISIT__WEBAPP_NAME:
				return getWebappName();
			case VisitPackage.VISIT__VISITOR_ID:
				if (resolve) return getVisitorId();
				return basicGetVisitorId();
			case VisitPackage.VISIT__USER_AGENT_ID:
				if (resolve) return getUserAgentId();
				return basicGetUserAgentId();
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
			case VisitPackage.VISIT__VISIT_ID:
				setVisitId((String)newValue);
				return;
			case VisitPackage.VISIT__CLIENT_HOST_NAME:
				setClientHostName((String)newValue);
				return;
			case VisitPackage.VISIT__CLIENT_IP_ADDRESS:
				setClientIpAddress((String)newValue);
				return;
			case VisitPackage.VISIT__CLIENT_IP_COUNTRY_GEO_ID:
				setClientIpCountryGeoId((String)newValue);
				return;
			case VisitPackage.VISIT__CLIENT_IP_ISP_NAME:
				setClientIpIspName((String)newValue);
				return;
			case VisitPackage.VISIT__CLIENT_IP_POSTAL_CODE:
				setClientIpPostalCode((String)newValue);
				return;
			case VisitPackage.VISIT__CLIENT_IP_STATE_PROV_GEO_ID:
				setClientIpStateProvGeoId((String)newValue);
				return;
			case VisitPackage.VISIT__CLIENT_USER:
				setClientUser((String)newValue);
				return;
			case VisitPackage.VISIT__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case VisitPackage.VISIT__COOKIE:
				setCookie((String)newValue);
				return;
			case VisitPackage.VISIT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case VisitPackage.VISIT__INITIAL_LOCALE:
				setInitialLocale((String)newValue);
				return;
			case VisitPackage.VISIT__INITIAL_REFERRER:
				setInitialReferrer((String)newValue);
				return;
			case VisitPackage.VISIT__INITIAL_REQUEST:
				setInitialRequest((String)newValue);
				return;
			case VisitPackage.VISIT__INITIAL_USER_AGENT:
				setInitialUserAgent((String)newValue);
				return;
			case VisitPackage.VISIT__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case VisitPackage.VISIT__ROLE_TYPE_ID:
				setRoleTypeId((String)newValue);
				return;
			case VisitPackage.VISIT__SERVER_HOST_NAME:
				setServerHostName((String)newValue);
				return;
			case VisitPackage.VISIT__SERVER_IP_ADDRESS:
				setServerIpAddress((String)newValue);
				return;
			case VisitPackage.VISIT__SESSION_ID:
				setSessionId((String)newValue);
				return;
			case VisitPackage.VISIT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case VisitPackage.VISIT__USER_CREATED:
				setUserCreated((Boolean)newValue);
				return;
			case VisitPackage.VISIT__USER_LOGIN_ID:
				setUserLoginId((String)newValue);
				return;
			case VisitPackage.VISIT__WEBAPP_NAME:
				setWebappName((String)newValue);
				return;
			case VisitPackage.VISIT__VISITOR_ID:
				setVisitorId((Visitor)newValue);
				return;
			case VisitPackage.VISIT__USER_AGENT_ID:
				setUserAgentId((UserAgent)newValue);
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
			case VisitPackage.VISIT__VISIT_ID:
				setVisitId(VISIT_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__CLIENT_HOST_NAME:
				setClientHostName(CLIENT_HOST_NAME_EDEFAULT);
				return;
			case VisitPackage.VISIT__CLIENT_IP_ADDRESS:
				setClientIpAddress(CLIENT_IP_ADDRESS_EDEFAULT);
				return;
			case VisitPackage.VISIT__CLIENT_IP_COUNTRY_GEO_ID:
				setClientIpCountryGeoId(CLIENT_IP_COUNTRY_GEO_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__CLIENT_IP_ISP_NAME:
				setClientIpIspName(CLIENT_IP_ISP_NAME_EDEFAULT);
				return;
			case VisitPackage.VISIT__CLIENT_IP_POSTAL_CODE:
				setClientIpPostalCode(CLIENT_IP_POSTAL_CODE_EDEFAULT);
				return;
			case VisitPackage.VISIT__CLIENT_IP_STATE_PROV_GEO_ID:
				setClientIpStateProvGeoId(CLIENT_IP_STATE_PROV_GEO_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__CLIENT_USER:
				setClientUser(CLIENT_USER_EDEFAULT);
				return;
			case VisitPackage.VISIT__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__COOKIE:
				setCookie(COOKIE_EDEFAULT);
				return;
			case VisitPackage.VISIT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case VisitPackage.VISIT__INITIAL_LOCALE:
				setInitialLocale(INITIAL_LOCALE_EDEFAULT);
				return;
			case VisitPackage.VISIT__INITIAL_REFERRER:
				setInitialReferrer(INITIAL_REFERRER_EDEFAULT);
				return;
			case VisitPackage.VISIT__INITIAL_REQUEST:
				setInitialRequest(INITIAL_REQUEST_EDEFAULT);
				return;
			case VisitPackage.VISIT__INITIAL_USER_AGENT:
				setInitialUserAgent(INITIAL_USER_AGENT_EDEFAULT);
				return;
			case VisitPackage.VISIT__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__ROLE_TYPE_ID:
				setRoleTypeId(ROLE_TYPE_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__SERVER_HOST_NAME:
				setServerHostName(SERVER_HOST_NAME_EDEFAULT);
				return;
			case VisitPackage.VISIT__SERVER_IP_ADDRESS:
				setServerIpAddress(SERVER_IP_ADDRESS_EDEFAULT);
				return;
			case VisitPackage.VISIT__SESSION_ID:
				setSessionId(SESSION_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case VisitPackage.VISIT__USER_CREATED:
				setUserCreated(USER_CREATED_EDEFAULT);
				return;
			case VisitPackage.VISIT__USER_LOGIN_ID:
				setUserLoginId(USER_LOGIN_ID_EDEFAULT);
				return;
			case VisitPackage.VISIT__WEBAPP_NAME:
				setWebappName(WEBAPP_NAME_EDEFAULT);
				return;
			case VisitPackage.VISIT__VISITOR_ID:
				setVisitorId((Visitor)null);
				return;
			case VisitPackage.VISIT__USER_AGENT_ID:
				setUserAgentId((UserAgent)null);
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
			case VisitPackage.VISIT__VISIT_ID:
				return VISIT_ID_EDEFAULT == null ? visitId != null : !VISIT_ID_EDEFAULT.equals(visitId);
			case VisitPackage.VISIT__CLIENT_HOST_NAME:
				return CLIENT_HOST_NAME_EDEFAULT == null ? clientHostName != null : !CLIENT_HOST_NAME_EDEFAULT.equals(clientHostName);
			case VisitPackage.VISIT__CLIENT_IP_ADDRESS:
				return CLIENT_IP_ADDRESS_EDEFAULT == null ? clientIpAddress != null : !CLIENT_IP_ADDRESS_EDEFAULT.equals(clientIpAddress);
			case VisitPackage.VISIT__CLIENT_IP_COUNTRY_GEO_ID:
				return CLIENT_IP_COUNTRY_GEO_ID_EDEFAULT == null ? clientIpCountryGeoId != null : !CLIENT_IP_COUNTRY_GEO_ID_EDEFAULT.equals(clientIpCountryGeoId);
			case VisitPackage.VISIT__CLIENT_IP_ISP_NAME:
				return CLIENT_IP_ISP_NAME_EDEFAULT == null ? clientIpIspName != null : !CLIENT_IP_ISP_NAME_EDEFAULT.equals(clientIpIspName);
			case VisitPackage.VISIT__CLIENT_IP_POSTAL_CODE:
				return CLIENT_IP_POSTAL_CODE_EDEFAULT == null ? clientIpPostalCode != null : !CLIENT_IP_POSTAL_CODE_EDEFAULT.equals(clientIpPostalCode);
			case VisitPackage.VISIT__CLIENT_IP_STATE_PROV_GEO_ID:
				return CLIENT_IP_STATE_PROV_GEO_ID_EDEFAULT == null ? clientIpStateProvGeoId != null : !CLIENT_IP_STATE_PROV_GEO_ID_EDEFAULT.equals(clientIpStateProvGeoId);
			case VisitPackage.VISIT__CLIENT_USER:
				return CLIENT_USER_EDEFAULT == null ? clientUser != null : !CLIENT_USER_EDEFAULT.equals(clientUser);
			case VisitPackage.VISIT__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case VisitPackage.VISIT__COOKIE:
				return COOKIE_EDEFAULT == null ? cookie != null : !COOKIE_EDEFAULT.equals(cookie);
			case VisitPackage.VISIT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case VisitPackage.VISIT__INITIAL_LOCALE:
				return INITIAL_LOCALE_EDEFAULT == null ? initialLocale != null : !INITIAL_LOCALE_EDEFAULT.equals(initialLocale);
			case VisitPackage.VISIT__INITIAL_REFERRER:
				return INITIAL_REFERRER_EDEFAULT == null ? initialReferrer != null : !INITIAL_REFERRER_EDEFAULT.equals(initialReferrer);
			case VisitPackage.VISIT__INITIAL_REQUEST:
				return INITIAL_REQUEST_EDEFAULT == null ? initialRequest != null : !INITIAL_REQUEST_EDEFAULT.equals(initialRequest);
			case VisitPackage.VISIT__INITIAL_USER_AGENT:
				return INITIAL_USER_AGENT_EDEFAULT == null ? initialUserAgent != null : !INITIAL_USER_AGENT_EDEFAULT.equals(initialUserAgent);
			case VisitPackage.VISIT__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case VisitPackage.VISIT__ROLE_TYPE_ID:
				return ROLE_TYPE_ID_EDEFAULT == null ? roleTypeId != null : !ROLE_TYPE_ID_EDEFAULT.equals(roleTypeId);
			case VisitPackage.VISIT__SERVER_HOST_NAME:
				return SERVER_HOST_NAME_EDEFAULT == null ? serverHostName != null : !SERVER_HOST_NAME_EDEFAULT.equals(serverHostName);
			case VisitPackage.VISIT__SERVER_IP_ADDRESS:
				return SERVER_IP_ADDRESS_EDEFAULT == null ? serverIpAddress != null : !SERVER_IP_ADDRESS_EDEFAULT.equals(serverIpAddress);
			case VisitPackage.VISIT__SESSION_ID:
				return SESSION_ID_EDEFAULT == null ? sessionId != null : !SESSION_ID_EDEFAULT.equals(sessionId);
			case VisitPackage.VISIT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case VisitPackage.VISIT__USER_CREATED:
				return userCreated != USER_CREATED_EDEFAULT;
			case VisitPackage.VISIT__USER_LOGIN_ID:
				return USER_LOGIN_ID_EDEFAULT == null ? userLoginId != null : !USER_LOGIN_ID_EDEFAULT.equals(userLoginId);
			case VisitPackage.VISIT__WEBAPP_NAME:
				return WEBAPP_NAME_EDEFAULT == null ? webappName != null : !WEBAPP_NAME_EDEFAULT.equals(webappName);
			case VisitPackage.VISIT__VISITOR_ID:
				return visitorId != null;
			case VisitPackage.VISIT__USER_AGENT_ID:
				return userAgentId != null;
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
		result.append(", clientHostName: ");
		result.append(clientHostName);
		result.append(", clientIpAddress: ");
		result.append(clientIpAddress);
		result.append(", clientIpCountryGeoId: ");
		result.append(clientIpCountryGeoId);
		result.append(", clientIpIspName: ");
		result.append(clientIpIspName);
		result.append(", clientIpPostalCode: ");
		result.append(clientIpPostalCode);
		result.append(", clientIpStateProvGeoId: ");
		result.append(clientIpStateProvGeoId);
		result.append(", clientUser: ");
		result.append(clientUser);
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", cookie: ");
		result.append(cookie);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", initialLocale: ");
		result.append(initialLocale);
		result.append(", initialReferrer: ");
		result.append(initialReferrer);
		result.append(", initialRequest: ");
		result.append(initialRequest);
		result.append(", initialUserAgent: ");
		result.append(initialUserAgent);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", roleTypeId: ");
		result.append(roleTypeId);
		result.append(", serverHostName: ");
		result.append(serverHostName);
		result.append(", serverIpAddress: ");
		result.append(serverIpAddress);
		result.append(", sessionId: ");
		result.append(sessionId);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", userCreated: ");
		result.append(userCreated);
		result.append(", userLoginId: ");
		result.append(userLoginId);
		result.append(", webappName: ");
		result.append(webappName);
		result.append(')');
		return result.toString();
	}

} //VisitImpl
