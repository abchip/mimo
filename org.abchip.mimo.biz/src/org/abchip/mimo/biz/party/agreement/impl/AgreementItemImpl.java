/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.party.agreement.impl;

import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.agreement.Agreement;
import org.abchip.mimo.biz.party.agreement.AgreementItem;
import org.abchip.mimo.biz.party.agreement.AgreementItemType;
import org.abchip.mimo.biz.party.agreement.AgreementPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agreement Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementItemSeqId <em>Agreement Item Seq Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementImage <em>Agreement Image</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementText <em>Agreement Text</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getCurrencyUomId <em>Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementId <em>Agreement Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.party.agreement.impl.AgreementItemImpl#getAgreementItemTypeId <em>Agreement Item Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgreementItemImpl extends BizEntityTypedImpl<AgreementItemType> implements AgreementItem {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getAgreementId() <em>Agreement Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementId()
	 * @generated
	 * @ordered
	 */
	protected Agreement agreementId;
	/**
	 * The cached value of the '{@link #getAgreementItemTypeId() <em>Agreement Item Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgreementItemTypeId()
	 * @generated
	 * @ordered
	 */
	protected AgreementItemType agreementItemTypeId;

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
		agreementImage = newAgreementImage;
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
		agreementItemSeqId = newAgreementItemSeqId;
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
		agreementText = newAgreementText;
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
		currencyUomId = newCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agreement getAgreementId() {
		if (agreementId != null && ((EObject)agreementId).eIsProxy()) {
			InternalEObject oldAgreementId = (InternalEObject)agreementId;
			agreementId = (Agreement)eResolveProxy(oldAgreementId);
			if (agreementId != oldAgreementId) {
			}
		}
		return agreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agreement basicGetAgreementId() {
		return agreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementId(Agreement newAgreementId) {
		agreementId = newAgreementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgreementItemType getAgreementItemTypeId() {
		if (agreementItemTypeId != null && ((EObject)agreementItemTypeId).eIsProxy()) {
			InternalEObject oldAgreementItemTypeId = (InternalEObject)agreementItemTypeId;
			agreementItemTypeId = (AgreementItemType)eResolveProxy(oldAgreementItemTypeId);
			if (agreementItemTypeId != oldAgreementItemTypeId) {
			}
		}
		return agreementItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgreementItemType basicGetAgreementItemTypeId() {
		return agreementItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgreementItemTypeId(AgreementItemType newAgreementItemTypeId) {
		agreementItemTypeId = newAgreementItemTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				return getAgreementItemSeqId();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				return getAgreementImage();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				return getAgreementText();
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				return getCurrencyUomId();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				if (resolve) return getAgreementId();
				return basicGetAgreementId();
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				if (resolve) return getAgreementItemTypeId();
				return basicGetAgreementItemTypeId();
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
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				setAgreementImage(newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				setAgreementText((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				setCurrencyUomId((String)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				setAgreementId((Agreement)newValue);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				setAgreementItemTypeId((AgreementItemType)newValue);
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
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				setAgreementItemSeqId(AGREEMENT_ITEM_SEQ_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				setAgreementImage(AGREEMENT_IMAGE_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				setAgreementText(AGREEMENT_TEXT_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				setCurrencyUomId(CURRENCY_UOM_ID_EDEFAULT);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				setAgreementId((Agreement)null);
				return;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				setAgreementItemTypeId((AgreementItemType)null);
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
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_SEQ_ID:
				return AGREEMENT_ITEM_SEQ_ID_EDEFAULT == null ? agreementItemSeqId != null : !AGREEMENT_ITEM_SEQ_ID_EDEFAULT.equals(agreementItemSeqId);
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_IMAGE:
				return AGREEMENT_IMAGE_EDEFAULT == null ? agreementImage != null : !AGREEMENT_IMAGE_EDEFAULT.equals(agreementImage);
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_TEXT:
				return AGREEMENT_TEXT_EDEFAULT == null ? agreementText != null : !AGREEMENT_TEXT_EDEFAULT.equals(agreementText);
			case AgreementPackage.AGREEMENT_ITEM__CURRENCY_UOM_ID:
				return CURRENCY_UOM_ID_EDEFAULT == null ? currencyUomId != null : !CURRENCY_UOM_ID_EDEFAULT.equals(currencyUomId);
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ID:
				return agreementId != null;
			case AgreementPackage.AGREEMENT_ITEM__AGREEMENT_ITEM_TYPE_ID:
				return agreementItemTypeId != null;
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
		result.append(" (agreementItemSeqId: ");
		result.append(agreementItemSeqId);
		result.append(", agreementImage: ");
		result.append(agreementImage);
		result.append(", agreementText: ");
		result.append(agreementText);
		result.append(", currencyUomId: ");
		result.append(currencyUomId);
		result.append(')');
		return result.toString();
	}

} //AgreementItemImpl
