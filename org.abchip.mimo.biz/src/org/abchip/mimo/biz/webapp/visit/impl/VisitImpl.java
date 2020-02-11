/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getUserAgentId <em>User Agent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#isUserCreated <em>User Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getVisitorId <em>Visitor Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.VisitImpl#getWebappName <em>Webapp Name</em>}</li>
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
		return (String)eGet(VisitPackage.Literals.VISIT__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(String newVisitId) {
		eSet(VisitPackage.Literals.VISIT__VISIT_ID, newVisitId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientHostName() {
		return (String)eGet(VisitPackage.Literals.VISIT__CLIENT_HOST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientHostName(String newClientHostName) {
		eSet(VisitPackage.Literals.VISIT__CLIENT_HOST_NAME, newClientHostName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpAddress() {
		return (String)eGet(VisitPackage.Literals.VISIT__CLIENT_IP_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpAddress(String newClientIpAddress) {
		eSet(VisitPackage.Literals.VISIT__CLIENT_IP_ADDRESS, newClientIpAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpCountryGeoId() {
		return (String)eGet(VisitPackage.Literals.VISIT__CLIENT_IP_COUNTRY_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpCountryGeoId(String newClientIpCountryGeoId) {
		eSet(VisitPackage.Literals.VISIT__CLIENT_IP_COUNTRY_GEO_ID, newClientIpCountryGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpIspName() {
		return (String)eGet(VisitPackage.Literals.VISIT__CLIENT_IP_ISP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpIspName(String newClientIpIspName) {
		eSet(VisitPackage.Literals.VISIT__CLIENT_IP_ISP_NAME, newClientIpIspName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpPostalCode() {
		return (String)eGet(VisitPackage.Literals.VISIT__CLIENT_IP_POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpPostalCode(String newClientIpPostalCode) {
		eSet(VisitPackage.Literals.VISIT__CLIENT_IP_POSTAL_CODE, newClientIpPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIpStateProvGeoId() {
		return (String)eGet(VisitPackage.Literals.VISIT__CLIENT_IP_STATE_PROV_GEO_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIpStateProvGeoId(String newClientIpStateProvGeoId) {
		eSet(VisitPackage.Literals.VISIT__CLIENT_IP_STATE_PROV_GEO_ID, newClientIpStateProvGeoId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientUser() {
		return (String)eGet(VisitPackage.Literals.VISIT__CLIENT_USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientUser(String newClientUser) {
		eSet(VisitPackage.Literals.VISIT__CLIENT_USER, newClientUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return (String)eGet(VisitPackage.Literals.VISIT__CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		eSet(VisitPackage.Literals.VISIT__CONTACT_MECH_ID, newContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCookie() {
		return (String)eGet(VisitPackage.Literals.VISIT__COOKIE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCookie(String newCookie) {
		eSet(VisitPackage.Literals.VISIT__COOKIE, newCookie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return (Date)eGet(VisitPackage.Literals.VISIT__FROM_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		eSet(VisitPackage.Literals.VISIT__FROM_DATE, newFromDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialLocale() {
		return (String)eGet(VisitPackage.Literals.VISIT__INITIAL_LOCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialLocale(String newInitialLocale) {
		eSet(VisitPackage.Literals.VISIT__INITIAL_LOCALE, newInitialLocale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialReferrer() {
		return (String)eGet(VisitPackage.Literals.VISIT__INITIAL_REFERRER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialReferrer(String newInitialReferrer) {
		eSet(VisitPackage.Literals.VISIT__INITIAL_REFERRER, newInitialReferrer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialRequest() {
		return (String)eGet(VisitPackage.Literals.VISIT__INITIAL_REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialRequest(String newInitialRequest) {
		eSet(VisitPackage.Literals.VISIT__INITIAL_REQUEST, newInitialRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitialUserAgent() {
		return (String)eGet(VisitPackage.Literals.VISIT__INITIAL_USER_AGENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialUserAgent(String newInitialUserAgent) {
		eSet(VisitPackage.Literals.VISIT__INITIAL_USER_AGENT, newInitialUserAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartyId() {
		return (String)eGet(VisitPackage.Literals.VISIT__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(String newPartyId) {
		eSet(VisitPackage.Literals.VISIT__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoleTypeId() {
		return (String)eGet(VisitPackage.Literals.VISIT__ROLE_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleTypeId(String newRoleTypeId) {
		eSet(VisitPackage.Literals.VISIT__ROLE_TYPE_ID, newRoleTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerHostName() {
		return (String)eGet(VisitPackage.Literals.VISIT__SERVER_HOST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHostName(String newServerHostName) {
		eSet(VisitPackage.Literals.VISIT__SERVER_HOST_NAME, newServerHostName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerIpAddress() {
		return (String)eGet(VisitPackage.Literals.VISIT__SERVER_IP_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerIpAddress(String newServerIpAddress) {
		eSet(VisitPackage.Literals.VISIT__SERVER_IP_ADDRESS, newServerIpAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionId() {
		return (String)eGet(VisitPackage.Literals.VISIT__SESSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionId(String newSessionId) {
		eSet(VisitPackage.Literals.VISIT__SESSION_ID, newSessionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return (Date)eGet(VisitPackage.Literals.VISIT__THRU_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		eSet(VisitPackage.Literals.VISIT__THRU_DATE, newThruDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUserCreated() {
		return (Boolean)eGet(VisitPackage.Literals.VISIT__USER_CREATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserCreated(boolean newUserCreated) {
		eSet(VisitPackage.Literals.VISIT__USER_CREATED, newUserCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserAgent getUserAgentId() {
		return (UserAgent)eGet(VisitPackage.Literals.VISIT__USER_AGENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserAgentId(UserAgent newUserAgentId) {
		eSet(VisitPackage.Literals.VISIT__USER_AGENT_ID, newUserAgentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLoginId() {
		return (String)eGet(VisitPackage.Literals.VISIT__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		eSet(VisitPackage.Literals.VISIT__USER_LOGIN_ID, newUserLoginId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visitor getVisitorId() {
		return (Visitor)eGet(VisitPackage.Literals.VISIT__VISITOR_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitorId(Visitor newVisitorId) {
		eSet(VisitPackage.Literals.VISIT__VISITOR_ID, newVisitorId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebappName() {
		return (String)eGet(VisitPackage.Literals.VISIT__WEBAPP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebappName(String newWebappName) {
		eSet(VisitPackage.Literals.VISIT__WEBAPP_NAME, newWebappName);
	}

} //VisitImpl
