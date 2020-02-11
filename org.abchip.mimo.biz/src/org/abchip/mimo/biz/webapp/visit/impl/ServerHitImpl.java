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
import org.abchip.mimo.biz.party.contact.ContactMech;
import org.abchip.mimo.biz.party.party.Party;
import org.abchip.mimo.biz.webapp.visit.ServerHit;
import org.abchip.mimo.biz.webapp.visit.ServerHitType;
import org.abchip.mimo.biz.webapp.visit.Visit;
import org.abchip.mimo.biz.webapp.visit.VisitPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Hit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getHitTypeId <em>Hit Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getVisitId <em>Visit Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getHitStartDateTime <em>Hit Start Date Time</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getIdByIpContactMechId <em>Id By Ip Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getInternalContentId <em>Internal Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getNumOfBytes <em>Num Of Bytes</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getRefByWebContactMechId <em>Ref By Web Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getReferrerUrl <em>Referrer Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getRequestUrl <em>Request Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getRunningTimeMillis <em>Running Time Millis</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getServerHostName <em>Server Host Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getServerIpAddress <em>Server Ip Address</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.webapp.visit.impl.ServerHitImpl#getUserLoginId <em>User Login Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerHitImpl extends BizEntityImpl implements ServerHit {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	public Visit getVisitId() {
		return (Visit)eGet(VisitPackage.Literals.SERVER_HIT__VISIT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisitId(Visit newVisitId) {
		eSet(VisitPackage.Literals.SERVER_HIT__VISIT_ID, newVisitId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT__CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(String newContentId) {
		eSet(VisitPackage.Literals.SERVER_HIT__CONTENT_ID, newContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getHitStartDateTime() {
		return (Date)eGet(VisitPackage.Literals.SERVER_HIT__HIT_START_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHitStartDateTime(Date newHitStartDateTime) {
		eSet(VisitPackage.Literals.SERVER_HIT__HIT_START_DATE_TIME, newHitStartDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerHitType getHitTypeId() {
		return (ServerHitType)eGet(VisitPackage.Literals.SERVER_HIT__HIT_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHitTypeId(ServerHitType newHitTypeId) {
		eSet(VisitPackage.Literals.SERVER_HIT__HIT_TYPE_ID, newHitTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getIdByIpContactMechId() {
		return (ContactMech)eGet(VisitPackage.Literals.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdByIpContactMechId(ContactMech newIdByIpContactMechId) {
		eSet(VisitPackage.Literals.SERVER_HIT__ID_BY_IP_CONTACT_MECH_ID, newIdByIpContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getInternalContentId() {
		return (Content)eGet(VisitPackage.Literals.SERVER_HIT__INTERNAL_CONTENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternalContentId(Content newInternalContentId) {
		eSet(VisitPackage.Literals.SERVER_HIT__INTERNAL_CONTENT_ID, newInternalContentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getNumOfBytes() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT__NUM_OF_BYTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumOfBytes(long newNumOfBytes) {
		eSet(VisitPackage.Literals.SERVER_HIT__NUM_OF_BYTES, newNumOfBytes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		return (Party)eGet(VisitPackage.Literals.SERVER_HIT__PARTY_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		eSet(VisitPackage.Literals.SERVER_HIT__PARTY_ID, newPartyId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactMech getRefByWebContactMechId() {
		return (ContactMech)eGet(VisitPackage.Literals.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefByWebContactMechId(ContactMech newRefByWebContactMechId) {
		eSet(VisitPackage.Literals.SERVER_HIT__REF_BY_WEB_CONTACT_MECH_ID, newRefByWebContactMechId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReferrerUrl() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT__REFERRER_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferrerUrl(String newReferrerUrl) {
		eSet(VisitPackage.Literals.SERVER_HIT__REFERRER_URL, newReferrerUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestUrl() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT__REQUEST_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestUrl(String newRequestUrl) {
		eSet(VisitPackage.Literals.SERVER_HIT__REQUEST_URL, newRequestUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRunningTimeMillis() {
		return (Long)eGet(VisitPackage.Literals.SERVER_HIT__RUNNING_TIME_MILLIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunningTimeMillis(long newRunningTimeMillis) {
		eSet(VisitPackage.Literals.SERVER_HIT__RUNNING_TIME_MILLIS, newRunningTimeMillis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerHostName() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT__SERVER_HOST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerHostName(String newServerHostName) {
		eSet(VisitPackage.Literals.SERVER_HIT__SERVER_HOST_NAME, newServerHostName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerIpAddress() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT__SERVER_IP_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerIpAddress(String newServerIpAddress) {
		eSet(VisitPackage.Literals.SERVER_HIT__SERVER_IP_ADDRESS, newServerIpAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatusId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT__STATUS_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(String newStatusId) {
		eSet(VisitPackage.Literals.SERVER_HIT__STATUS_ID, newStatusId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserLoginId() {
		return (String)eGet(VisitPackage.Literals.SERVER_HIT__USER_LOGIN_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserLoginId(String newUserLoginId) {
		eSet(VisitPackage.Literals.SERVER_HIT__USER_LOGIN_ID, newUserLoginId);
	}

} //ServerHitImpl
