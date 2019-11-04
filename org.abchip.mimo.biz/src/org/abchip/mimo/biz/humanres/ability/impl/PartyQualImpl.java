/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.Date;

import org.abchip.mimo.biz.common.status.StatusItem;
import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PartyQual;
import org.abchip.mimo.biz.humanres.ability.PartyQualType;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Qual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getQualificationDesc <em>Qualification Desc</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getPartyQualTypeId <em>Party Qual Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getStatusId <em>Status Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyQualImpl#getVerifStatusId <em>Verif Status Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyQualImpl extends BizEntityTypedImpl<PartyQualType> implements PartyQual {
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
	 * The default value of the '{@link #getQualificationDesc() <em>Qualification Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualificationDesc() <em>Qualification Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificationDesc()
	 * @generated
	 * @ordered
	 */
	protected String qualificationDesc = QUALIFICATION_DESC_EDEFAULT;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartyQualTypeId() <em>Party Qual Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyQualTypeId()
	 * @generated
	 * @ordered
	 */
	protected PartyQualType partyQualTypeId;

	/**
	 * The cached value of the '{@link #getStatusId() <em>Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem statusId;

	/**
	 * The cached value of the '{@link #getVerifStatusId() <em>Verif Status Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifStatusId()
	 * @generated
	 * @ordered
	 */
	protected StatusItem verifStatusId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyQualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PARTY_QUAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__FROM_DATE, oldFromDate, fromDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartyQualType getPartyQualTypeId() {
		if (partyQualTypeId != null && ((EObject)partyQualTypeId).eIsProxy()) {
			InternalEObject oldPartyQualTypeId = (InternalEObject)partyQualTypeId;
			partyQualTypeId = (PartyQualType)eResolveProxy(oldPartyQualTypeId);
			if (partyQualTypeId != oldPartyQualTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PARTY_QUAL__PARTY_QUAL_TYPE_ID, oldPartyQualTypeId, partyQualTypeId));
			}
		}
		return partyQualTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartyQualType basicGetPartyQualTypeId() {
		return partyQualTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyQualTypeId(PartyQualType newPartyQualTypeId) {
		PartyQualType oldPartyQualTypeId = partyQualTypeId;
		partyQualTypeId = newPartyQualTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__PARTY_QUAL_TYPE_ID, oldPartyQualTypeId, partyQualTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualificationDesc() {
		return qualificationDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualificationDesc(String newQualificationDesc) {
		String oldQualificationDesc = qualificationDesc;
		qualificationDesc = newQualificationDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__QUALIFICATION_DESC, oldQualificationDesc, qualificationDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getStatusId() {
		if (statusId != null && ((EObject)statusId).eIsProxy()) {
			InternalEObject oldStatusId = (InternalEObject)statusId;
			statusId = (StatusItem)eResolveProxy(oldStatusId);
			if (statusId != oldStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PARTY_QUAL__STATUS_ID, oldStatusId, statusId));
			}
		}
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetStatusId() {
		return statusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusId(StatusItem newStatusId) {
		StatusItem oldStatusId = statusId;
		statusId = newStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__STATUS_ID, oldStatusId, statusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatusItem getVerifStatusId() {
		if (verifStatusId != null && ((EObject)verifStatusId).eIsProxy()) {
			InternalEObject oldVerifStatusId = (InternalEObject)verifStatusId;
			verifStatusId = (StatusItem)eResolveProxy(oldVerifStatusId);
			if (verifStatusId != oldVerifStatusId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AbilityPackage.PARTY_QUAL__VERIF_STATUS_ID, oldVerifStatusId, verifStatusId));
			}
		}
		return verifStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItem basicGetVerifStatusId() {
		return verifStatusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerifStatusId(StatusItem newVerifStatusId) {
		StatusItem oldVerifStatusId = verifStatusId;
		verifStatusId = newVerifStatusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_QUAL__VERIF_STATUS_ID, oldVerifStatusId, verifStatusId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PARTY_QUAL__PARTY_ID:
				return getPartyId();
			case AbilityPackage.PARTY_QUAL__FROM_DATE:
				return getFromDate();
			case AbilityPackage.PARTY_QUAL__QUALIFICATION_DESC:
				return getQualificationDesc();
			case AbilityPackage.PARTY_QUAL__THRU_DATE:
				return getThruDate();
			case AbilityPackage.PARTY_QUAL__TITLE:
				return getTitle();
			case AbilityPackage.PARTY_QUAL__PARTY_QUAL_TYPE_ID:
				if (resolve) return getPartyQualTypeId();
				return basicGetPartyQualTypeId();
			case AbilityPackage.PARTY_QUAL__STATUS_ID:
				if (resolve) return getStatusId();
				return basicGetStatusId();
			case AbilityPackage.PARTY_QUAL__VERIF_STATUS_ID:
				if (resolve) return getVerifStatusId();
				return basicGetVerifStatusId();
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
			case AbilityPackage.PARTY_QUAL__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case AbilityPackage.PARTY_QUAL__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case AbilityPackage.PARTY_QUAL__QUALIFICATION_DESC:
				setQualificationDesc((String)newValue);
				return;
			case AbilityPackage.PARTY_QUAL__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case AbilityPackage.PARTY_QUAL__TITLE:
				setTitle((String)newValue);
				return;
			case AbilityPackage.PARTY_QUAL__PARTY_QUAL_TYPE_ID:
				setPartyQualTypeId((PartyQualType)newValue);
				return;
			case AbilityPackage.PARTY_QUAL__STATUS_ID:
				setStatusId((StatusItem)newValue);
				return;
			case AbilityPackage.PARTY_QUAL__VERIF_STATUS_ID:
				setVerifStatusId((StatusItem)newValue);
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
			case AbilityPackage.PARTY_QUAL__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case AbilityPackage.PARTY_QUAL__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case AbilityPackage.PARTY_QUAL__QUALIFICATION_DESC:
				setQualificationDesc(QUALIFICATION_DESC_EDEFAULT);
				return;
			case AbilityPackage.PARTY_QUAL__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case AbilityPackage.PARTY_QUAL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case AbilityPackage.PARTY_QUAL__PARTY_QUAL_TYPE_ID:
				setPartyQualTypeId((PartyQualType)null);
				return;
			case AbilityPackage.PARTY_QUAL__STATUS_ID:
				setStatusId((StatusItem)null);
				return;
			case AbilityPackage.PARTY_QUAL__VERIF_STATUS_ID:
				setVerifStatusId((StatusItem)null);
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
			case AbilityPackage.PARTY_QUAL__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case AbilityPackage.PARTY_QUAL__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case AbilityPackage.PARTY_QUAL__QUALIFICATION_DESC:
				return QUALIFICATION_DESC_EDEFAULT == null ? qualificationDesc != null : !QUALIFICATION_DESC_EDEFAULT.equals(qualificationDesc);
			case AbilityPackage.PARTY_QUAL__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case AbilityPackage.PARTY_QUAL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case AbilityPackage.PARTY_QUAL__PARTY_QUAL_TYPE_ID:
				return partyQualTypeId != null;
			case AbilityPackage.PARTY_QUAL__STATUS_ID:
				return statusId != null;
			case AbilityPackage.PARTY_QUAL__VERIF_STATUS_ID:
				return verifStatusId != null;
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
		result.append(", qualificationDesc: ");
		result.append(qualificationDesc);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PartyQualImpl
