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
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Hit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getHitTypeId <em>Hit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getHitStartDateTime <em>Hit Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getIdByIpContactMechId <em>Id By Ip Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getInternalContentId <em>Internal Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getNumOfBytes <em>Num Of Bytes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRefByWebContactMechId <em>Ref By Web Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getReferrerUrl <em>Referrer Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRequestUrl <em>Request Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRunningTimeMillis <em>Running Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getUserLoginId <em>User Login Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit()
 * @model
 * @generated
 */
public interface ServerHit extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Visit Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visit Id</em>' reference.
	 * @see #setVisitId(Visit)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_VisitId()
	 * @model keys="visitId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Visit getVisitId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getVisitId <em>Visit Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visit Id</em>' reference.
	 * @see #getVisitId()
	 * @generated
	 */
	void setVisitId(Visit value);

	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_ContentId()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 *        annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(String value);

	/**
	 * Returns the value of the '<em><b>Hit Start Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit Start Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Start Date Time</em>' attribute.
	 * @see #setHitStartDateTime(Date)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_HitStartDateTime()
	 * @model required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Date getHitStartDateTime();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getHitStartDateTime <em>Hit Start Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Start Date Time</em>' attribute.
	 * @see #getHitStartDateTime()
	 * @generated
	 */
	void setHitStartDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Hit Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit Type Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit Type Id</em>' reference.
	 * @see #setHitTypeId(ServerHitType)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_HitTypeId()
	 * @model keys="hitTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	ServerHitType getHitTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getHitTypeId <em>Hit Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit Type Id</em>' reference.
	 * @see #getHitTypeId()
	 * @generated
	 */
	void setHitTypeId(ServerHitType value);

	/**
	 * Returns the value of the '<em><b>Id By Ip Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id By Ip Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id By Ip Contact Mech Id</em>' reference.
	 * @see #setIdByIpContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_IdByIpContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getIdByIpContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getIdByIpContactMechId <em>Id By Ip Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id By Ip Contact Mech Id</em>' reference.
	 * @see #getIdByIpContactMechId()
	 * @generated
	 */
	void setIdByIpContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Internal Content Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Content Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Content Id</em>' reference.
	 * @see #setInternalContentId(Content)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_InternalContentId()
	 * @model keys="contentId"
	 * @generated
	 */
	Content getInternalContentId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getInternalContentId <em>Internal Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Content Id</em>' reference.
	 * @see #getInternalContentId()
	 * @generated
	 */
	void setInternalContentId(Content value);

	/**
	 * Returns the value of the '<em><b>Num Of Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Bytes</em>' attribute.
	 * @see #setNumOfBytes(long)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_NumOfBytes()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getNumOfBytes();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getNumOfBytes <em>Num Of Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Bytes</em>' attribute.
	 * @see #getNumOfBytes()
	 * @generated
	 */
	void setNumOfBytes(long value);

	/**
	 * Returns the value of the '<em><b>Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Id</em>' reference.
	 * @see #setPartyId(Party)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_PartyId()
	 * @model keys="partyId"
	 * @generated
	 */
	Party getPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getPartyId <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Id</em>' reference.
	 * @see #getPartyId()
	 * @generated
	 */
	void setPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Ref By Web Contact Mech Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref By Web Contact Mech Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref By Web Contact Mech Id</em>' reference.
	 * @see #setRefByWebContactMechId(ContactMech)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_RefByWebContactMechId()
	 * @model keys="contactMechId"
	 * @generated
	 */
	ContactMech getRefByWebContactMechId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRefByWebContactMechId <em>Ref By Web Contact Mech Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref By Web Contact Mech Id</em>' reference.
	 * @see #getRefByWebContactMechId()
	 * @generated
	 */
	void setRefByWebContactMechId(ContactMech value);

	/**
	 * Returns the value of the '<em><b>Referrer Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referrer Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referrer Url</em>' attribute.
	 * @see #setReferrerUrl(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_ReferrerUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getReferrerUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getReferrerUrl <em>Referrer Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referrer Url</em>' attribute.
	 * @see #getReferrerUrl()
	 * @generated
	 */
	void setReferrerUrl(String value);

	/**
	 * Returns the value of the '<em><b>Request Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Url</em>' attribute.
	 * @see #setRequestUrl(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_RequestUrl()
	 * @model annotation="mimo-ent-format type='url' length='2000'"
	 * @generated
	 */
	String getRequestUrl();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRequestUrl <em>Request Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Url</em>' attribute.
	 * @see #getRequestUrl()
	 * @generated
	 */
	void setRequestUrl(String value);

	/**
	 * Returns the value of the '<em><b>Running Time Millis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Time Millis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Time Millis</em>' attribute.
	 * @see #setRunningTimeMillis(long)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_RunningTimeMillis()
	 * @model annotation="mimo-ent-format precision='20' scale='0'"
	 * @generated
	 */
	long getRunningTimeMillis();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getRunningTimeMillis <em>Running Time Millis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Time Millis</em>' attribute.
	 * @see #getRunningTimeMillis()
	 * @generated
	 */
	void setRunningTimeMillis(long value);

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
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_ServerHostName()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getServerHostName();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getServerHostName <em>Server Host Name</em>}' attribute.
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
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_ServerIpAddress()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getServerIpAddress();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getServerIpAddress <em>Server Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Ip Address</em>' attribute.
	 * @see #getServerIpAddress()
	 * @generated
	 */
	void setServerIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Status Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Id</em>' attribute.
	 * @see #setStatusId(String)
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_StatusId()
	 * @model annotation="mimo-ent-format length='20'"
	 * @generated
	 */
	String getStatusId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getStatusId <em>Status Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Id</em>' attribute.
	 * @see #getStatusId()
	 * @generated
	 */
	void setStatusId(String value);

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
	 * @see org.abchip.mimo.biz.webapp.visit.VisitPackage#getServerHit_UserLoginId()
	 * @model annotation="mimo-ent-format length='255'"
	 * @generated
	 */
	String getUserLoginId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.webapp.visit.ServerHit#getUserLoginId <em>User Login Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Login Id</em>' attribute.
	 * @see #getUserLoginId()
	 * @generated
	 */
	void setUserLoginId(String value);

} // ServerHit
