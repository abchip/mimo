/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import java.util.Date;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.agreement.Addendum;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addendum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumId <em>Addendum Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumCreationDate <em>Addendum Creation Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumEffectiveDate <em>Addendum Effective Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAddendumText <em>Addendum Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AddendumImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddendumImpl extends BizEntityImpl implements Addendum {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getAddendumId() <em>Addendum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumId()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDENDUM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddendumId() <em>Addendum Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumId()
	 * @generated
	 * @ordered
	 */
	protected String addendumId = ADDENDUM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddendumCreationDate() <em>Addendum Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ADDENDUM_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddendumCreationDate() <em>Addendum Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date addendumCreationDate = ADDENDUM_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddendumEffectiveDate() <em>Addendum Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ADDENDUM_EFFECTIVE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddendumEffectiveDate() <em>Addendum Effective Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected Date addendumEffectiveDate = ADDENDUM_EFFECTIVE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddendumText() <em>Addendum Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumText()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDENDUM_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddendumText() <em>Addendum Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddendumText()
	 * @generated
	 * @ordered
	 */
	protected String addendumText = ADDENDUM_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementId() <em>Agreement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected String agreementId = AGREEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgreementItemSeqId() <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ITEM_SEQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementItemSeqId() <em>Agreement Item Seq Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemSeqId()
	 * @generated
	 * @ordered
	 */
	protected String agreementItemSeqId = AGREEMENT_ITEM_SEQ_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddendumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.ADDENDUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAddendumCreationDate() {
		return addendumCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumCreationDate(Date newAddendumCreationDate) {
		Date oldAddendumCreationDate = addendumCreationDate;
		addendumCreationDate = newAddendumCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.ADDENDUM__ADDENDUM_CREATION_DATE, oldAddendumCreationDate, addendumCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAddendumEffectiveDate() {
		return addendumEffectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumEffectiveDate(Date newAddendumEffectiveDate) {
		Date oldAddendumEffectiveDate = addendumEffectiveDate;
		addendumEffectiveDate = newAddendumEffectiveDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.ADDENDUM__ADDENDUM_EFFECTIVE_DATE, oldAddendumEffectiveDate, addendumEffectiveDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddendumId() {
		return addendumId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumId(String newAddendumId) {
		String oldAddendumId = addendumId;
		addendumId = newAddendumId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.ADDENDUM__ADDENDUM_ID, oldAddendumId, addendumId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddendumText() {
		return addendumText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddendumText(String newAddendumText) {
		String oldAddendumText = addendumText;
		addendumText = newAddendumText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.ADDENDUM__ADDENDUM_TEXT, oldAddendumText, addendumText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemSeqId() {
		return agreementItemSeqId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemSeqId(String newAgreementItemSeqId) {
		String oldAgreementItemSeqId = agreementItemSeqId;
		agreementItemSeqId = newAgreementItemSeqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.ADDENDUM__AGREEMENT_ITEM_SEQ_ID, oldAgreementItemSeqId, agreementItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementId() {
		return agreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(String newAgreementId) {
		String oldAgreementId = agreementId;
		agreementId = newAgreementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.ADDENDUM__AGREEMENT_ID, oldAgreementId, agreementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.ADDENDUM__ADDENDUM_ID:
				return getAddendumId();
			case AgreementPackage.ADDENDUM__ADDENDUM_CREATION_DATE:
				return getAddendumCreationDate();
			case AgreementPackage.ADDENDUM__ADDENDUM_EFFECTIVE_DATE:
				return getAddendumEffectiveDate();
			case AgreementPackage.ADDENDUM__ADDENDUM_TEXT:
				return getAddendumText();
			case AgreementPackage.ADDENDUM__AGREEMENT_ID:
				return getAgreementId();
			case AgreementPackage.ADDENDUM__AGREEMENT_ITEM_SEQ_ID:
				return getAgreementItemSeqId();
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
			case AgreementPackage.ADDENDUM__ADDENDUM_ID:
				setAddendumId((String)newValue);
				return;
			case AgreementPackage.ADDENDUM__ADDENDUM_CREATION_DATE:
				setAddendumCreationDate((Date)newValue);
				return;
			case AgreementPackage.ADDENDUM__ADDENDUM_EFFECTIVE_DATE:
				setAddendumEffectiveDate((Date)newValue);
				return;
			case AgreementPackage.ADDENDUM__ADDENDUM_TEXT:
				setAddendumText((String)newValue);
				return;
			case AgreementPackage.ADDENDUM__AGREEMENT_ID:
				setAgreementId((String)newValue);
				return;
			case AgreementPackage.ADDENDUM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId((String)newValue);
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
			case AgreementPackage.ADDENDUM__ADDENDUM_ID:
				setAddendumId(ADDENDUM_ID_EDEFAULT);
				return;
			case AgreementPackage.ADDENDUM__ADDENDUM_CREATION_DATE:
				setAddendumCreationDate(ADDENDUM_CREATION_DATE_EDEFAULT);
				return;
			case AgreementPackage.ADDENDUM__ADDENDUM_EFFECTIVE_DATE:
				setAddendumEffectiveDate(ADDENDUM_EFFECTIVE_DATE_EDEFAULT);
				return;
			case AgreementPackage.ADDENDUM__ADDENDUM_TEXT:
				setAddendumText(ADDENDUM_TEXT_EDEFAULT);
				return;
			case AgreementPackage.ADDENDUM__AGREEMENT_ID:
				setAgreementId(AGREEMENT_ID_EDEFAULT);
				return;
			case AgreementPackage.ADDENDUM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId(AGREEMENT_ITEM_SEQ_ID_EDEFAULT);
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
			case AgreementPackage.ADDENDUM__ADDENDUM_ID:
				return ADDENDUM_ID_EDEFAULT == null ? addendumId != null : !ADDENDUM_ID_EDEFAULT.equals(addendumId);
			case AgreementPackage.ADDENDUM__ADDENDUM_CREATION_DATE:
				return ADDENDUM_CREATION_DATE_EDEFAULT == null ? addendumCreationDate != null : !ADDENDUM_CREATION_DATE_EDEFAULT.equals(addendumCreationDate);
			case AgreementPackage.ADDENDUM__ADDENDUM_EFFECTIVE_DATE:
				return ADDENDUM_EFFECTIVE_DATE_EDEFAULT == null ? addendumEffectiveDate != null : !ADDENDUM_EFFECTIVE_DATE_EDEFAULT.equals(addendumEffectiveDate);
			case AgreementPackage.ADDENDUM__ADDENDUM_TEXT:
				return ADDENDUM_TEXT_EDEFAULT == null ? addendumText != null : !ADDENDUM_TEXT_EDEFAULT.equals(addendumText);
			case AgreementPackage.ADDENDUM__AGREEMENT_ID:
				return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
			case AgreementPackage.ADDENDUM__AGREEMENT_ITEM_SEQ_ID:
				return AGREEMENT_ITEM_SEQ_ID_EDEFAULT == null ? agreementItemSeqId != null : !AGREEMENT_ITEM_SEQ_ID_EDEFAULT.equals(agreementItemSeqId);
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
		result.append(" (addendumId: ");
		result.append(addendumId);
		result.append(", addendumCreationDate: ");
		result.append(addendumCreationDate);
		result.append(", addendumEffectiveDate: ");
		result.append(addendumEffectiveDate);
		result.append(", addendumText: ");
		result.append(addendumText);
		result.append(", agreementId: ");
		result.append(agreementId);
		result.append(", agreementItemSeqId: ");
		result.append(agreementItemSeqId);
		result.append(')');
		return result.toString();
	}

} //AddendumImpl
