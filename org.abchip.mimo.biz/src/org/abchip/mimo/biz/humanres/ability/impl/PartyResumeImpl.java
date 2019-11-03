/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.humanres.ability.impl;

import java.util.Date;

import org.abchip.mimo.biz.humanres.ability.AbilityPackage;
import org.abchip.mimo.biz.humanres.ability.PartyResume;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party Resume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyResumeImpl#getResumeId <em>Resume Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyResumeImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyResumeImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyResumeImpl#getResumeDate <em>Resume Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.humanres.ability.impl.PartyResumeImpl#getResumeText <em>Resume Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartyResumeImpl extends BizEntityImpl implements PartyResume {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getResumeId() <em>Resume Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESUME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResumeId() <em>Resume Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeId()
	 * @generated
	 * @ordered
	 */
	protected String resumeId = RESUME_ID_EDEFAULT;

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
	 * The default value of the '{@link #getResumeDate() <em>Resume Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESUME_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResumeDate() <em>Resume Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeDate()
	 * @generated
	 * @ordered
	 */
	protected Date resumeDate = RESUME_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResumeText() <em>Resume Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeText()
	 * @generated
	 * @ordered
	 */
	protected static final String RESUME_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResumeText() <em>Resume Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResumeText()
	 * @generated
	 * @ordered
	 */
	protected String resumeText = RESUME_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyResumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbilityPackage.Literals.PARTY_RESUME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_RESUME__CONTENT_ID, oldContentId, contentId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_RESUME__PARTY_ID, oldPartyId, partyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResumeDate() {
		return resumeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResumeDate(Date newResumeDate) {
		Date oldResumeDate = resumeDate;
		resumeDate = newResumeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_RESUME__RESUME_DATE, oldResumeDate, resumeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResumeId() {
		return resumeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResumeId(String newResumeId) {
		String oldResumeId = resumeId;
		resumeId = newResumeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_RESUME__RESUME_ID, oldResumeId, resumeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResumeText() {
		return resumeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResumeText(String newResumeText) {
		String oldResumeText = resumeText;
		resumeText = newResumeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbilityPackage.PARTY_RESUME__RESUME_TEXT, oldResumeText, resumeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbilityPackage.PARTY_RESUME__RESUME_ID:
				return getResumeId();
			case AbilityPackage.PARTY_RESUME__CONTENT_ID:
				return getContentId();
			case AbilityPackage.PARTY_RESUME__PARTY_ID:
				return getPartyId();
			case AbilityPackage.PARTY_RESUME__RESUME_DATE:
				return getResumeDate();
			case AbilityPackage.PARTY_RESUME__RESUME_TEXT:
				return getResumeText();
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
			case AbilityPackage.PARTY_RESUME__RESUME_ID:
				setResumeId((String)newValue);
				return;
			case AbilityPackage.PARTY_RESUME__CONTENT_ID:
				setContentId((String)newValue);
				return;
			case AbilityPackage.PARTY_RESUME__PARTY_ID:
				setPartyId((String)newValue);
				return;
			case AbilityPackage.PARTY_RESUME__RESUME_DATE:
				setResumeDate((Date)newValue);
				return;
			case AbilityPackage.PARTY_RESUME__RESUME_TEXT:
				setResumeText((String)newValue);
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
			case AbilityPackage.PARTY_RESUME__RESUME_ID:
				setResumeId(RESUME_ID_EDEFAULT);
				return;
			case AbilityPackage.PARTY_RESUME__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case AbilityPackage.PARTY_RESUME__PARTY_ID:
				setPartyId(PARTY_ID_EDEFAULT);
				return;
			case AbilityPackage.PARTY_RESUME__RESUME_DATE:
				setResumeDate(RESUME_DATE_EDEFAULT);
				return;
			case AbilityPackage.PARTY_RESUME__RESUME_TEXT:
				setResumeText(RESUME_TEXT_EDEFAULT);
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
			case AbilityPackage.PARTY_RESUME__RESUME_ID:
				return RESUME_ID_EDEFAULT == null ? resumeId != null : !RESUME_ID_EDEFAULT.equals(resumeId);
			case AbilityPackage.PARTY_RESUME__CONTENT_ID:
				return CONTENT_ID_EDEFAULT == null ? contentId != null : !CONTENT_ID_EDEFAULT.equals(contentId);
			case AbilityPackage.PARTY_RESUME__PARTY_ID:
				return PARTY_ID_EDEFAULT == null ? partyId != null : !PARTY_ID_EDEFAULT.equals(partyId);
			case AbilityPackage.PARTY_RESUME__RESUME_DATE:
				return RESUME_DATE_EDEFAULT == null ? resumeDate != null : !RESUME_DATE_EDEFAULT.equals(resumeDate);
			case AbilityPackage.PARTY_RESUME__RESUME_TEXT:
				return RESUME_TEXT_EDEFAULT == null ? resumeText != null : !RESUME_TEXT_EDEFAULT.equals(resumeText);
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
		result.append(" (resumeId: ");
		result.append(resumeId);
		result.append(", contentId: ");
		result.append(contentId);
		result.append(", partyId: ");
		result.append(partyId);
		result.append(", resumeDate: ");
		result.append(resumeDate);
		result.append(", resumeText: ");
		result.append(resumeText);
		result.append(')');
		return result.toString();
	}

} //PartyResumeImpl
