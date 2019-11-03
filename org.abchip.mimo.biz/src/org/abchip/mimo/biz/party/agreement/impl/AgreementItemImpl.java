/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.agreement.AgreementItem;
import org.abchip.mimo.biz.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementImage <em>Agreement Image</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementItemTypeId <em>Agreement Item Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementText <em>Agreement Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementItemImpl extends BizEntityTypedImpl<AgreementItemType> implements AgreementItem {
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
	 * The default value of the '{@link #getAgreementImage() <em>Agreement Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementImage()
	 * @generated
	 * @ordered
	 */
	protected static final Object AGREEMENT_IMAGE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAgreementImage() <em>Agreement Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementImage()
	 * @generated
	 * @ordered
	 */
	protected Object agreementImage = AGREEMENT_IMAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAgreementItemTypeId() <em>Agreement Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_ITEM_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgreementItemTypeId() <em>Agreement Item Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected String agreementItemTypeId = AGREEMENT_ITEM_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAgreementText() <em>Agreement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementText()
	 * @generated
	 * @ordered
	 */
	protected static final String AGREEMENT_TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAgreementText() <em>Agreement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementText()
	 * @generated
	 * @ordered
	 */
	protected String agreementText = AGREEMENT_TEXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCurrencyUomId() <em>Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String currencyUomId = CURRENCY_UOM_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgreementItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgreementPackage.Literals.AGREEMENT_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getAgreementImage() {
		return agreementImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementImage(Object newAgreementImage) {
		Object oldAgreementImage = agreementImage;
		agreementImage = newAgreementImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE, oldAgreementImage, agreementImage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID, oldAgreementItemSeqId, agreementItemSeqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementText() {
		return agreementText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementText(String newAgreementText) {
		String oldAgreementText = agreementText;
		agreementText = newAgreementText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT, oldAgreementText, agreementText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrencyUomId() {
		return currencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrencyUomId(String newCurrencyUomId) {
		String oldCurrencyUomId = currencyUomId;
		currencyUomId = newCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID, oldCurrencyUomId, currencyUomId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID, oldAgreementId, agreementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgreementItemTypeId() {
		return agreementItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemTypeId(String newAgreementItemTypeId) {
		String oldAgreementItemTypeId = agreementItemTypeId;
		agreementItemTypeId = newAgreementItemTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID, oldAgreementItemTypeId, agreementItemTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				return getAgreementId();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				return getAgreementItemSeqId();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				return getAgreementImage();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				return getAgreementItemTypeId();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				return getAgreementText();
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				return getCurrencyUomId();
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
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				setAgreementId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				setAgreementImage(newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				setAgreementItemTypeId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				setAgreementText((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
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
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				setAgreementId(AGREEMENT_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId(AGREEMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				setAgreementImage(AGREEMENT_IMAGE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				setAgreementItemTypeId(AGREEMENT_ITEM_TYPE_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				setAgreementText(AGREEMENT_TEXT_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
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
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				return AGREEMENT_ID_EDEFAULT == null ? agreementId != null : !AGREEMENT_ID_EDEFAULT.equals(agreementId);
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				return AGREEMENT_ITEM_SEQ_ID_EDEFAULT == null ? agreementItemSeqId != null : !AGREEMENT_ITEM_SEQ_ID_EDEFAULT.equals(agreementItemSeqId);
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				return AGREEMENT_IMAGE_EDEFAULT == null ? agreementImage != null : !AGREEMENT_IMAGE_EDEFAULT.equals(agreementImage);
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				return AGREEMENT_ITEM_TYPE_ID_EDEFAULT == null ? agreementItemTypeId != null : !AGREEMENT_ITEM_TYPE_ID_EDEFAULT.equals(agreementItemTypeId);
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				return AGREEMENT_TEXT_EDEFAULT == null ? agreementText != null : !AGREEMENT_TEXT_EDEFAULT.equals(agreementText);
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
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
		result.append(", agreementImage: ");
		result.append(agreementImage);
		result.append(", agreementItemTypeId: ");
		result.append(agreementItemTypeId);
		result.append(", agreementText: ");
		result.append(agreementText);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(')');
		return result.toString();
	}

} //AgreementItemImpl
