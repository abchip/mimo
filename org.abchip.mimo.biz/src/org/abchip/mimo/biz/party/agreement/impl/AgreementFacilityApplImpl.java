/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.agreement.AgreementFacilityAppl;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Facility Appl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementFacilityApplImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementFacilityApplImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementFacilityApplImpl#getFacilityId <em>Facility Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementFacilityApplImpl extends BizEntityImpl implements AgreementFacilityAppl {
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
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The default value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected static final String FACILITY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected String facilityId = FACILITY_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementFacilityApplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT_FACILITY_APPL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID, oldAgreementItemSeqId, agreementItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacilityId() {
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilityId(String newFacilityId) {
		String oldFacilityId = facilityId;
		facilityId = newFacilityId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_FACILITY_APPL__FACILITY_ID, oldFacilityId, facilityId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ID, oldAgreementId, agreementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ID:
				return getAgreementId();
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID:
				return getAgreementItemSeqId();
			case AgreementPackage.AGREEMENT_FACILITY_APPL__FACILITY_ID:
				return getFacilityId();
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
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ID:
				setAgreementId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_FACILITY_APPL__FACILITY_ID:
				setFacilityId((String)newValue);
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
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ID:
				setAgreementId(AGREEMENT_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId(AGREEMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_FACILITY_APPL__FACILITY_ID:
				setFacilityId(FACILITY_ID_EDEFAULT);
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
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ID:
				return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
			case AgreementPackage.AGREEMENT_FACILITY_APPL__AGREEMENT_ITEM_SEQ_ID:
				return AGREEMENT_ITEM_SEQ_ID_EDEFAULT == null ? agreementItemSeqId != null : !AGREEMENT_ITEM_SEQ_ID_EDEFAULT.equals(agreementItemSeqId);
			case AgreementPackage.AGREEMENT_FACILITY_APPL__FACILITY_ID:
				return FACILITY_ID_EDEFAULT == null ? facilityId != null : !FACILITY_ID_EDEFAULT.equals(facilityId);
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
		result.append(" (agreementId: ");
		result.append(agreementId);
		result.append(", agreementItemSeqId: ");
		result.append(agreementItemSeqId);
		result.append(", facilityId: ");
		result.append(facilityId);
		result.append(')');
		return result.toString();
	}

} //AgreementFacilityApplImpl
