/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.fixedasset;

import org.abchip.mimo.biz.BizEntity;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.party.party.Party;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Asset Type Gl Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetId <em>Fixed Asset Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAccDepGlAccountId <em>Acc Dep Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAssetGlAccountId <em>Asset Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getDepGlAccountId <em>Dep Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getLossGlAccountId <em>Loss Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getProfitGlAccountId <em>Profit Gl Account Id</em>}</li>
 * </ul>
 *
 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount()
 * @model annotation="mimo-ent-frame title='Gl Account Mapping For Fixed Asset Or Fixed Asset Types'"
 * @generated
 */
public interface FixedAssetTypeGlAccount extends BizEntity {
	/**
	 * Returns the value of the '<em><b>Acc Dep Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acc Dep Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acc Dep Gl Account Id</em>' reference.
	 * @see #setAccDepGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_AccDepGlAccountId()
	 * @model keys="glAccountId"
	 *        annotation="mimo-ent-slot help='The (credit) account for the accumulated depreciation'"
	 * @generated
	 */
	GlAccount getAccDepGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAccDepGlAccountId <em>Acc Dep Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acc Dep Gl Account Id</em>' reference.
	 * @see #getAccDepGlAccountId()
	 * @generated
	 */
	void setAccDepGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Asset Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Gl Account Id</em>' reference.
	 * @see #setAssetGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_AssetGlAccountId()
	 * @model keys="glAccountId"
	 *        annotation="mimo-ent-slot help='The (debit) account for the initial asset value (purchase cost)'"
	 * @generated
	 */
	GlAccount getAssetGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getAssetGlAccountId <em>Asset Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Gl Account Id</em>' reference.
	 * @see #getAssetGlAccountId()
	 * @generated
	 */
	void setAssetGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Dep Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dep Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Gl Account Id</em>' reference.
	 * @see #setDepGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_DepGlAccountId()
	 * @model keys="glAccountId"
	 *        annotation="mimo-ent-slot help='The (debit) account for the depreciation expense (matches the accDepGlAccountId)'"
	 * @generated
	 */
	GlAccount getDepGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getDepGlAccountId <em>Dep Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Gl Account Id</em>' reference.
	 * @see #getDepGlAccountId()
	 * @generated
	 */
	void setDepGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Loss Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loss Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss Gl Account Id</em>' reference.
	 * @see #setLossGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_LossGlAccountId()
	 * @model keys="glAccountId"
	 *        annotation="mimo-ent-slot help='The (debit) account for the eventual loss derived from the sale of the asset'"
	 * @generated
	 */
	GlAccount getLossGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getLossGlAccountId <em>Loss Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss Gl Account Id</em>' reference.
	 * @see #getLossGlAccountId()
	 * @generated
	 */
	void setLossGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Organization Party Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization Party Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Party Id</em>' reference.
	 * @see #setOrganizationPartyId(Party)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_OrganizationPartyId()
	 * @model keys="partyId" required="true"
	 *        annotation="mimo-ent-slot key='true'"
	 * @generated
	 */
	Party getOrganizationPartyId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getOrganizationPartyId <em>Organization Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Party Id</em>' reference.
	 * @see #getOrganizationPartyId()
	 * @generated
	 */
	void setOrganizationPartyId(Party value);

	/**
	 * Returns the value of the '<em><b>Profit Gl Account Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profit Gl Account Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profit Gl Account Id</em>' reference.
	 * @see #setProfitGlAccountId(GlAccount)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_ProfitGlAccountId()
	 * @model keys="glAccountId"
	 *        annotation="mimo-ent-slot help='The (credit) account for the eventual profit derived from the sale of the asset'"
	 * @generated
	 */
	GlAccount getProfitGlAccountId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getProfitGlAccountId <em>Profit Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profit Gl Account Id</em>' reference.
	 * @see #getProfitGlAccountId()
	 * @generated
	 */
	void setProfitGlAccountId(GlAccount value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Type Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Type Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Type Id</em>' reference.
	 * @see #setFixedAssetTypeId(FixedAssetType)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_FixedAssetTypeId()
	 * @model keys="fixedAssetTypeId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='The fixed asset type for the mappings. This field can be set to _NA_ in order to define a mapping for all types or for a specific asset (specified by the id in the fixedAssetId field).'"
	 * @generated
	 */
	FixedAssetType getFixedAssetTypeId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetTypeId <em>Fixed Asset Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Type Id</em>' reference.
	 * @see #getFixedAssetTypeId()
	 * @generated
	 */
	void setFixedAssetTypeId(FixedAssetType value);

	/**
	 * Returns the value of the '<em><b>Fixed Asset Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Asset Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #setFixedAssetId(FixedAsset)
	 * @see org.abchip.mimo.biz.accounting.fixedasset.FixedassetPackage#getFixedAssetTypeGlAccount_FixedAssetId()
	 * @model keys="fixedAssetId" required="true"
	 *        annotation="mimo-ent-slot key='true' help='The fixed asset id for the mappings. This field can be set to _NA_ in order to define a mapping for all assets of a given type (specified by the id in the fixedAssetTypeId field).'"
	 * @generated
	 */
	FixedAsset getFixedAssetId();

	/**
	 * Sets the value of the '{@link org.abchip.mimo.biz.accounting.fixedasset.FixedAssetTypeGlAccount#getFixedAssetId <em>Fixed Asset Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Asset Id</em>' reference.
	 * @see #getFixedAssetId()
	 * @generated
	 */
	void setFixedAssetId(FixedAsset value);

} // FixedAssetTypeGlAccount
