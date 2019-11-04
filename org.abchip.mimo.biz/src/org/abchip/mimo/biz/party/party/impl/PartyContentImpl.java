/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.party.impl;

import java.util.Date;

import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.PartyContent;
import org.abchip.mimo.biz.party.party.PartyContentType;
import org.abchip.mimo.biz.party.party.PartyPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyContentImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyContentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyContentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.party.impl.PartyContentImpl#getPartyContentTypeId <em>Party Content Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyContentImpl extends BizEntityTypedImpl<PartyContentType> implements PartyContent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected Content contentId;
	/**
	 * The cached value of the '{@link #getPartyContentTypeId() <em>Party Content Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected PartyContentType partyContentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartyPackage.Literals.PARTY_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getContentId() {
		if (contentId != null && ((EObject)contentId).eIsProxy()) {
			InternalEObject oldContentId = (InternalEObject)contentId;
			contentId = (Content)eResolveProxy(oldContentId);
			if (contentId != oldContentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_CONTENT__CONTENT_ID, oldContentId, contentId));
			}
		}
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		Content oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CONTENT__CONTENT_ID, oldContentId, contentId));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CONTENT__FROM_DATE, oldFromDate, fromDate));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CONTENT__THRU_DATE, oldThruDate, thruDate));
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
		String oldPartyId = partyId;
		partyId = newPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CONTENT__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyContentType getPartyContentTypeId() {
		if (partyContentTypeId != null && ((EObject)partyContentTypeId).eIsProxy()) {
			InternalEObject oldPartyContentTypeId = (InternalEObject)partyContentTypeId;
			partyContentTypeId = (PartyContentType)eResolveProxy(oldPartyContentTypeId);
			if (partyContentTypeId != oldPartyContentTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartyPackage.PARTY_CONTENT__PARTY_CONTENT_TYPE_ID, oldPartyContentTypeId, partyContentTypeId));
			}
		}
		return partyContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyContentType basicGetPartyContentTypeId() {
		return partyContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyContentTypeId(PartyContentType newPartyContentTypeId) {
		PartyContentType oldPartyContentTypeId = partyContentTypeId;
		partyContentTypeId = newPartyContentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartyPackage.PARTY_CONTENT__PARTY_CONTENT_TYPE_ID, oldPartyContentTypeId, partyContentTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PartyPackage.PARTY_CONTENT__PARTY_ID:
				return getPartyId();
			case PartyPackage.PARTY_CONTENT__FROM_DATE:
				return getFromDate();
			case PartyPackage.PARTY_CONTENT__THRU_DATE:
				return getThruDate();
			case PartyPackage.PARTY_CONTENT__CONTENT_ID:
				if (resolve) return getContentId();
				return basicGetContentId();
			case PartyPackage.PARTY_CONTENT__PARTY_CONTENT_TYPE_ID:
				if (resolve) return getPartyContentTypeId();
				return basicGetPartyContentTypeId();
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
			case PartyPackage.PARTY_CONTENT__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case PartyPackage.PARTY_CONTENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PartyPackage.PARTY_CONTENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PartyPackage.PARTY_CONTENT__CONTENT_ID:
				setContentId((Content)newValue);
				return;
			case PartyPackage.PARTY_CONTENT__PARTY_CONTENT_TYPE_ID:
				setPartyContentTypeId((PartyContentType)newValue);
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
			case PartyPackage.PARTY_CONTENT__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case PartyPackage.PARTY_CONTENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_CONTENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PartyPackage.PARTY_CONTENT__CONTENT_ID:
				setContentId((Content)null);
				return;
			case PartyPackage.PARTY_CONTENT__PARTY_CONTENT_TYPE_ID:
				setPartyContentTypeId((PartyContentType)null);
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
			case PartyPackage.PARTY_CONTENT__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case PartyPackage.PARTY_CONTENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PartyPackage.PARTY_CONTENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PartyPackage.PARTY_CONTENT__CONTENT_ID:
				return contentId != null;
			case PartyPackage.PARTY_CONTENT__PARTY_CONTENT_TYPE_ID:
				return partyContentTypeId != null;
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
		result.append(" (partyId: ");
		result.append(partyId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PartyContentImpl