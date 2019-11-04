/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset.impl;

import org.abchip.mimo.biz.accounting.fixedasset.FixedAsset;
import org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount;
import org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getAssetGlAccountId <em>Asset Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getAccDepGlAccountId <em>Acc Dep Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getDepGlAccountId <em>Dep Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getProfitGlAccountId <em>Profit Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.impl.FixedAssetTypeGlAccountImpl#getLossGlAccountId <em>Loss Gl Account Id</em>}</li>
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
	 * The cached value of the '{@link #getFixedAssetId() <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedAssetId()
	 * @generated
	 * @ordered
	 */
	protected FixedAsset fixedAssetId;
	/**
	 * The cached value of the '{@link #getOrganizationPartyId() <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party organizationPartyId;
	/**
	 * The cached value of the '{@link #getAssetGlAccountId() <em>Asset Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount assetGlAccountId;
	/**
	 * The cached value of the '{@link #getAccDepGlAccountId() <em>Acc Dep Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccDepGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount accDepGlAccountId;
	/**
	 * The cached value of the '{@link #getDepGlAccountId() <em>Dep Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount depGlAccountId;
	/**
	 * The cached value of the '{@link #getProfitGlAccountId() <em>Profit Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfitGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount profitGlAccountId;
	/**
	 * The cached value of the '{@link #getLossGlAccountId() <em>Loss Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount lossGlAccountId;

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
	public GlAccount getAccDepGlAccountId() {
		if (accDepGlAccountId != null && ((EObject)accDepGlAccountId).eIsProxy()) {
			InternalEObject oldAccDepGlAccountId = (InternalEObject)accDepGlAccountId;
			accDepGlAccountId = (GlAccount)eResolveProxy(oldAccDepGlAccountId);
			if (accDepGlAccountId != oldAccDepGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID, oldAccDepGlAccountId, accDepGlAccountId));
			}
		}
		return accDepGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetAccDepGlAccountId() {
		return accDepGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccDepGlAccountId(GlAccount newAccDepGlAccountId) {
		GlAccount oldAccDepGlAccountId = accDepGlAccountId;
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
	public GlAccount getAssetGlAccountId() {
		if (assetGlAccountId != null && ((EObject)assetGlAccountId).eIsProxy()) {
			InternalEObject oldAssetGlAccountId = (InternalEObject)assetGlAccountId;
			assetGlAccountId = (GlAccount)eResolveProxy(oldAssetGlAccountId);
			if (assetGlAccountId != oldAssetGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID, oldAssetGlAccountId, assetGlAccountId));
			}
		}
		return assetGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetAssetGlAccountId() {
		return assetGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetGlAccountId(GlAccount newAssetGlAccountId) {
		GlAccount oldAssetGlAccountId = assetGlAccountId;
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
	public GlAccount getDepGlAccountId() {
		if (depGlAccountId != null && ((EObject)depGlAccountId).eIsProxy()) {
			InternalEObject oldDepGlAccountId = (InternalEObject)depGlAccountId;
			depGlAccountId = (GlAccount)eResolveProxy(oldDepGlAccountId);
			if (depGlAccountId != oldDepGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID, oldDepGlAccountId, depGlAccountId));
			}
		}
		return depGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetDepGlAccountId() {
		return depGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepGlAccountId(GlAccount newDepGlAccountId) {
		GlAccount oldDepGlAccountId = depGlAccountId;
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
	public GlAccount getLossGlAccountId() {
		if (lossGlAccountId != null && ((EObject)lossGlAccountId).eIsProxy()) {
			InternalEObject oldLossGlAccountId = (InternalEObject)lossGlAccountId;
			lossGlAccountId = (GlAccount)eResolveProxy(oldLossGlAccountId);
			if (lossGlAccountId != oldLossGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID, oldLossGlAccountId, lossGlAccountId));
			}
		}
		return lossGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetLossGlAccountId() {
		return lossGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossGlAccountId(GlAccount newLossGlAccountId) {
		GlAccount oldLossGlAccountId = lossGlAccountId;
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
	public Party getOrganizationPartyId() {
		if (organizationPartyId != null && ((EObject)organizationPartyId).eIsProxy()) {
			InternalEObject oldOrganizationPartyId = (InternalEObject)organizationPartyId;
			organizationPartyId = (Party)eResolveProxy(oldOrganizationPartyId);
			if (organizationPartyId != oldOrganizationPartyId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
			}
		}
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetOrganizationPartyId() {
		return organizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationPartyId(Party newOrganizationPartyId) {
		Party oldOrganizationPartyId = organizationPartyId;
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
	public GlAccount getProfitGlAccountId() {
		if (profitGlAccountId != null && ((EObject)profitGlAccountId).eIsProxy()) {
			InternalEObject oldProfitGlAccountId = (InternalEObject)profitGlAccountId;
			profitGlAccountId = (GlAccount)eResolveProxy(oldProfitGlAccountId);
			if (profitGlAccountId != oldProfitGlAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID, oldProfitGlAccountId, profitGlAccountId));
			}
		}
		return profitGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetProfitGlAccountId() {
		return profitGlAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfitGlAccountId(GlAccount newProfitGlAccountId) {
		GlAccount oldProfitGlAccountId = profitGlAccountId;
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
	public FixedAsset getFixedAssetId() {
		if (fixedAssetId != null && ((EObject)fixedAssetId).eIsProxy()) {
			InternalEObject oldFixedAssetId = (InternalEObject)fixedAssetId;
			fixedAssetId = (FixedAsset)eResolveProxy(oldFixedAssetId);
			if (fixedAssetId != oldFixedAssetId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__FIXED_ASSET_ID, oldFixedAssetId, fixedAssetId));
			}
		}
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedAsset basicGetFixedAssetId() {
		return fixedAssetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedAssetId(FixedAsset newFixedAssetId) {
		FixedAsset oldFixedAssetId = fixedAssetId;
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
				if (resolve) return getFixedAssetId();
				return basicGetFixedAssetId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				if (resolve) return getAssetGlAccountId();
				return basicGetAssetGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				if (resolve) return getAccDepGlAccountId();
				return basicGetAccDepGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				if (resolve) return getDepGlAccountId();
				return basicGetDepGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				if (resolve) return getProfitGlAccountId();
				return basicGetProfitGlAccountId();
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				if (resolve) return getLossGlAccountId();
				return basicGetLossGlAccountId();
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
				setFixedAssetId((FixedAsset)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				setAssetGlAccountId((GlAccount)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				setAccDepGlAccountId((GlAccount)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				setDepGlAccountId((GlAccount)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				setProfitGlAccountId((GlAccount)newValue);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				setLossGlAccountId((GlAccount)newValue);
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
				setFixedAssetId((FixedAsset)null);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				setAssetGlAccountId((GlAccount)null);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				setAccDepGlAccountId((GlAccount)null);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				setDepGlAccountId((GlAccount)null);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				setProfitGlAccountId((GlAccount)null);
				return;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				setLossGlAccountId((GlAccount)null);
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
				return fixedAssetId != null;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ASSET_GL_ACCOUNT_ID:
				return assetGlAccountId != null;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__ACC_DEP_GL_ACCOUNT_ID:
				return accDepGlAccountId != null;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__DEP_GL_ACCOUNT_ID:
				return depGlAccountId != null;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__PROFIT_GL_ACCOUNT_ID:
				return profitGlAccountId != null;
			case FixedassetPackage.FIXED_ASSET_TYPE_GL_ACCOUNT__LOSS_GL_ACCOUNT_ID:
				return lossGlAccountId != null;
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
		result.append(')');
		return result.toString();
	}

} //FixedAssetTypeGlAccountImpl
