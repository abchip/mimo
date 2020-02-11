/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.webapp.visit;

import java.util.Date;

import org.abchip.mimo.biz.BizEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientHostName <em>Client Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpAddress <em>Client Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpCountryGeoId <em>Client Ip Country Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpIspName <em>Client Ip Isp Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpPostalCode <em>Client Ip Postal Code</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpStateProvGeoId <em>Client Ip State Prov Geo Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientUser <em>Client User</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getCookie <em>Cookie</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialLocale <em>Initial Locale</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialReferrer <em>Initial Referrer</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialRequest <em>Initial Request</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialUserAgent <em>Initial User Agent</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getRoleTypeId <em>Role Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getSessionId <em>Session Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getUserAgentId <em>User Agent Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#isUserCreated <em>User Created</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getUserLoginId <em>User Login Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getVisitorId <em>Visitor Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.Visit#getWebappName <em>Webapp Name</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit()
 * @model
 * @generated
 */
public interface Visit extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' attribute.
	 * @see #setVisitId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_VisitId()
	 * @model id="true" required="true"
	 *        annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getVisitId <em>Visit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' attribute.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(String value);

	/**
	 * Returns the value of the '<em><b>Client Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Host Name</em>' attribute.
	 * @see #setClientHostName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ClientHostName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getClientHostName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientHostName <em>Client Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Host Name</em>' attribute.
	 * @see #getClientHostName()
	 * @generated
	 */
	void setClientHostName(String value);

	/**
	 * Returns the value of the '<em><b>Client Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Ip Address</em>' attribute.
	 * @see #setClientIpAddress(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ClientIpAddress()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getClientIpAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpAddress <em>Client Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Ip Address</em>' attribute.
	 * @see #getClientIpAddress()
	 * @generated
	 */
	void setClientIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Client Ip Country Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Ip Country Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Ip Country Geo Id</em>' attribute.
	 * @see #setClientIpCountryGeoId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ClientIpCountryGeoId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getClientIpCountryGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpCountryGeoId <em>Client Ip Country Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Ip Country Geo Id</em>' attribute.
	 * @see #getClientIpCountryGeoId()
	 * @generated
	 */
	void setClientIpCountryGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Client Ip Isp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Ip Isp Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Ip Isp Name</em>' attribute.
	 * @see #setClientIpIspName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ClientIpIspName()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getClientIpIspName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpIspName <em>Client Ip Isp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Ip Isp Name</em>' attribute.
	 * @see #getClientIpIspName()
	 * @generated
	 */
	void setClientIpIspName(String value);

	/**
	 * Returns the value of the '<em><b>Client Ip Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Ip Postal Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Ip Postal Code</em>' attribute.
	 * @see #setClientIpPostalCode(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ClientIpPostalCode()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getClientIpPostalCode();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpPostalCode <em>Client Ip Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Ip Postal Code</em>' attribute.
	 * @see #getClientIpPostalCode()
	 * @generated
	 */
	void setClientIpPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Client Ip State Prov Geo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Ip State Prov Geo Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Ip State Prov Geo Id</em>' attribute.
	 * @see #setClientIpStateProvGeoId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ClientIpStateProvGeoId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getClientIpStateProvGeoId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientIpStateProvGeoId <em>Client Ip State Prov Geo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Ip State Prov Geo Id</em>' attribute.
	 * @see #getClientIpStateProvGeoId()
	 * @generated
	 */
	void setClientIpStateProvGeoId(String value);

	/**
	 * Returns the value of the '<em><b>Client User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client User</em>' attribute.
	 * @see #setClientUser(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ClientUser()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getClientUser();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getClientUser <em>Client User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client User</em>' attribute.
	 * @see #getClientUser()
	 * @generated
	 */
	void setClientUser(String value);

	/**
	 * Returns the value of the '<em><b>Contact Mech Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #setContactMechId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ContactMechId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getContactMechId <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Mech Id</em>' attribute.
	 * @see #getContactMechId()
	 * @generated
	 */
	void setContactMechId(String value);

	/**
	 * Returns the value of the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookie</em>' attribute.
	 * @see #setCookie(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_Cookie()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getCookie();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getCookie <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie</em>' attribute.
	 * @see #getCookie()
	 * @generated
	 */
	void setCookie(String value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>Initial Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Locale</em>' attribute.
	 * @see #setInitialLocale(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_InitialLocale()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getInitialLocale();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialLocale <em>Initial Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Locale</em>' attribute.
	 * @see #getInitialLocale()
	 * @generated
	 */
	void setInitialLocale(String value);

	/**
	 * Returns the value of the '<em><b>Initial Referrer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Referrer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Referrer</em>' attribute.
	 * @see #setInitialReferrer(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_InitialReferrer()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getInitialReferrer();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialReferrer <em>Initial Referrer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Referrer</em>' attribute.
	 * @see #getInitialReferrer()
	 * @generated
	 */
	void setInitialReferrer(String value);

	/**
	 * Returns the value of the '<em><b>Initial Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Request</em>' attribute.
	 * @see #setInitialRequest(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_InitialRequest()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getInitialRequest();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialRequest <em>Initial Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Request</em>' attribute.
	 * @see #getInitialRequest()
	 * @generated
	 */
	void setInitialRequest(String value);

	/**
	 * Returns the value of the '<em><b>Initial User Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial User Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial User Agent</em>' attribute.
	 * @see #setInitialUserAgent(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_InitialUserAgent()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getInitialUserAgent();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getInitialUserAgent <em>Initial User Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial User Agent</em>' attribute.
	 * @see #getInitialUserAgent()
	 * @generated
	 */
	void setInitialUserAgent(String value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' attribute.
	 * @see #setPartyId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_PartyId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getPartyId <em>Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' attribute.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(String value);

	/**
	 * Returns the value of the '<em><b>Role Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Type Id</em>' attribute.
	 * @see #setRoleTypeId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_RoleTypeId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getRoleTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getRoleTypeId <em>Role Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Type Id</em>' attribute.
	 * @see #getRoleTypeId()
	 * @generated
	 */
	void setRoleTypeId(String value);

	/**
	 * Returns the value of the '<em><b>Server Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Host Name</em>' attribute.
	 * @see #setServerHostName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ServerHostName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getServerHostName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getServerHostName <em>Server Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Host Name</em>' attribute.
	 * @see #getServerHostName()
	 * @generated
	 */
	void setServerHostName(String value);

	/**
	 * Returns the value of the '<em><b>Server Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Ip Address</em>' attribute.
	 * @see #setServerIpAddress(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ServerIpAddress()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getServerIpAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getServerIpAddress <em>Server Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Ip Address</em>' attribute.
	 * @see #getServerIpAddress()
	 * @generated
	 */
	void setServerIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' attribute.
	 * @see #setSessionId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_SessionId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getSessionId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getSessionId <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Id</em>' attribute.
	 * @see #getSessionId()
	 * @generated
	 */
	void setSessionId(String value);

	/**
	 * Returns the value of the '<em><b>Thru Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thru Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thru Date</em>' attribute.
	 * @see #setThruDate(Date)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_ThruDate()
	 * @model
	 * @generated
	 */
	Date getThruDate();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getThruDate <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thru Date</em>' attribute.
	 * @see #getThruDate()
	 * @generated
	 */
	void setThruDate(Date value);

	/**
	 * Returns the value of the '<em><b>User Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Created</em>' attribute.
	 * @see #setUserCreated(boolean)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_UserCreated()
	 * @model
	 * @generated
	 */
	boolean isUserCreated();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#isUserCreated <em>User Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Created</em>' attribute.
	 * @see #isUserCreated()
	 * @generated
	 */
	void setUserCreated(boolean value);

	/**
	 * Returns the value of the '<em><b>User Agent Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Agent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Agent Id</em>' reference.
	 * @see #setUserAgentId(UserAgent)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_UserAgentId()
	 * @model keys="userAgentId"
	 * @generated
	 */
	UserAgent getUserAgentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getUserAgentId <em>User Agent Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Agent Id</em>' reference.
	 * @see #getUserAgentId()
	 * @generated
	 */
	void setUserAgentId(UserAgent value);

	/**
	 * Returns the value of the '<em><b>User Login Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Login Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Login Id</em>' attribute.
	 * @see #setUserLoginId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_UserLoginId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getUserLoginId <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' attribute.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(String value);

	/**
	 * Returns the value of the '<em><b>Visitor Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visitor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visitor Id</em>' reference.
	 * @see #setVisitorId(Visitor)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_VisitorId()
	 * @model keys="visitorId"
	 * @generated
	 */
	Visitor getVisitorId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getVisitorId <em>Visitor Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visitor Id</em>' reference.
	 * @see #getVisitorId()
	 * @generated
	 */
	void setVisitorId(Visitor value);

	/**
	 * Returns the value of the '<em><b>Webapp Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webapp Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webapp Name</em>' attribute.
	 * @see #setWebappName(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getVisit_WebappName()
	 * @model annotation="mimo-ent-format length='60'"
	 * @generated
	 */
	String getWebappName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.Visit#getWebappName <em>Webapp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webapp Name</em>' attribute.
	 * @see #getWebappName()
	 * @generated
	 */
	void setWebappName(String value);

} // Visit
