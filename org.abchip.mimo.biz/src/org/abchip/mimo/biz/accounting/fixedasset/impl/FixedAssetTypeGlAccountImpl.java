/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Asset Type Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getAccDepGlAccountId <em>Acc Dep Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getAssetGlAccountId <em>Asset Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getDepGlAccountId <em>Dep Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getLossGlAccountId <em>Loss Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getProfitGlAccountId <em>Profit Gl Account Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedAssetTypeGlAccountImpl extends BizEntityImpl implements FixedAssetTypeGlAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getFixedAssetTypeId() <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetTypeId() <em>Fixed Asset Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetTypeId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetTypeId = FIXED_ASSET_TYPE_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected static final String FIXED_ASSET_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected String fixedAssetId = FIXED_ASSET_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATION_PARTY_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected String organizationPartyId = ORGANIZATION_PARTY_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAccDepGlAccountId() <em>Acc Dep Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccDepGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACC_DEP_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAccDepGlAccountId() <em>Acc Dep Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccDepGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String accDepGlAccountId = ACC_DEP_GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAssetGlAccountId() <em>Asset Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAssetGlAccountId() <em>Asset Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String assetGlAccountId = ASSET_GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDepGlAccountId() <em>Dep Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEP_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDepGlAccountId() <em>Dep Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String depGlAccountId = DEP_GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getLossGlAccountId() <em>Loss Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOSS_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLossGlAccountId() <em>Loss Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String lossGlAccountId = LOSS_GL_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProfitGlAccountId() <em>Profit Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfitGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFIT_GL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProfitGlAccountId() <em>Profit Gl Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfitGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected String profitGlAccountId = PROFIT_GL_ACCOUNT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedAssetTypeGlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FixedassetPackage.Literals.FIXED_ASSET_TYPE_GL_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccDepGlAccountId() {
		return accDepGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccDepGlAccountId(String newAccDepGlAccountId) {
		String oldAccDepGlAccountId = accDepGlAccountId;
		accDepGlAccountId = newAccDepGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID, oldAccDepGlAccountId, accDepGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetGlAccountId() {
		return assetGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetGlAccountId(String newAssetGlAccountId) {
		String oldAssetGlAccountId = assetGlAccountId;
		assetGlAccountId = newAssetGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID, oldAssetGlAccountId, assetGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDepGlAccountId() {
		return depGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepGlAccountId(String newDepGlAccountId) {
		String oldDepGlAccountId = depGlAccountId;
		depGlAccountId = newDepGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID, oldDepGlAccountId, depGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLossGlAccountId() {
		return lossGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossGlAccountId(String newLossGlAccountId) {
		String oldLossGlAccountId = lossGlAccountId;
		lossGlAccountId = newLossGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID, oldLossGlAccountId, lossGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(String newOrganizationPartyId) {
		String oldOrganizationPartyId = organizationPartyId;
		organizationPartyId = newOrganizationPartyId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProfitGlAccountId() {
		return profitGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfitGlAccountId(String newProfitGlAccountId) {
		String oldProfitGlAccountId = profitGlAccountId;
		profitGlAccountId = newProfitGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID, oldProfitGlAccountId, profitGlAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetTypeId() {
		return fixedAssetTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetTypeId(String newFixedAssetTypeId) {
		String oldFixedAssetTypeId = fixedAssetTypeId;
		fixedAssetTypeId = newFixedAssetTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID, oldFixedAssetTypeId, fixedAssetTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(String newFixedAssetId) {
		String oldFixedAssetId = fixedAssetId;
		fixedAssetId = newFixedAssetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID:
				return getFixedAssetTypeId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID:
				return getFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return getOrganizationPartyId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				return getAccDepGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				return getAssetGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				return getDepGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				return getLossGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				return getProfitGlAccountId();
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
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID:
				setFixedAssetId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				setAccDepGlAccountId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				setAssetGlAccountId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				setDepGlAccountId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				setLossGlAccountId((String)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				setProfitGlAccountId((String)newValue);
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
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID:
				setFixedAssetTypeId(FIXED_ASSET_TYPE_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID:
				setFixedAssetId(FIXED_ASSET_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId(ORGANIZATION_PARTY_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				setAccDepGlAccountId(ACC_DEP_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				setAssetGlAccountId(ASSET_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				setDepGlAccountId(DEP_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				setLossGlAccountId(LOSS_GL_ACCOUNT_ID_EDEFAULT);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				setProfitGlAccountId(PROFIT_GL_ACCOUNT_ID_EDEFAULT);
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
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_TYPE_ID:
				return FIXED_ASSET_TYPE_ID_EDEFAULT == null ? fixedAssetTypeId != null : !FIXED_ASSET_TYPE_ID_EDEFAULT.equals(fixedAssetTypeId);
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID:
				return FIXED_ASSET_ID_EDEFAULT == null ? fixedAssetId != null : !FIXED_ASSET_ID_EDEFAULT.equals(fixedAssetId);
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return ORGANIZATION_PARTY_ID_EDEFAULT == null ? organizationPartyId != null : !ORGANIZATION_PARTY_ID_EDEFAULT.equals(organizationPartyId);
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				return ACC_DEP_GL_ACCOUNT_ID_EDEFAULT == null ? accDepGlAccountId != null : !ACC_DEP_GL_ACCOUNT_ID_EDEFAULT.equals(accDepGlAccountId);
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				return ASSET_GL_ACCOUNT_ID_EDEFAULT == null ? assetGlAccountId != null : !ASSET_GL_ACCOUNT_ID_EDEFAULT.equals(assetGlAccountId);
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				return DEP_GL_ACCOUNT_ID_EDEFAULT == null ? depGlAccountId != null : !DEP_GL_ACCOUNT_ID_EDEFAULT.equals(depGlAccountId);
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				return LOSS_GL_ACCOUNT_ID_EDEFAULT == null ? lossGlAccountId != null : !LOSS_GL_ACCOUNT_ID_EDEFAULT.equals(lossGlAccountId);
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				return PROFIT_GL_ACCOUNT_ID_EDEFAULT == null ? profitGlAccountId != null : !PROFIT_GL_ACCOUNT_ID_EDEFAULT.equals(profitGlAccountId);
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
		result.append(" (fixedAssetTypeId: ");
		result.append(fixedAssetTypeId);
		result.append(", fixedAssetId: ");
		result.append(fixedAssetId);
		result.append(", organizationPartyId: ");
		result.append(organizationPartyId);
		result.append(", accDepGlAccountId: ");
		result.append(accDepGlAccountId);
		result.append(", assetGlAccountId: ");
		result.append(assetGlAccountId);
		result.append(", depGlAccountId: ");
		result.append(depGlAccountId);
		result.append(", lossGlAccountId: ");
		result.append(lossGlAccountId);
		result.append(", profitGlAccountId: ");
		result.append(profitGlAccountId);
		result.append(')');
		return result.toString();
	}

} //FixedAssetTypeGlAccountImpl
