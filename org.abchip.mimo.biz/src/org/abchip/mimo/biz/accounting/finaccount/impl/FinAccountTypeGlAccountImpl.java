/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.finaccount.impl;

import org.abchip.mimo.biz.accounting.finaccount.FinAccountType;
import org.abchip.mimo.biz.accounting.finaccount.FinAccountTypeGlAccount;
import org.abchip.mimo.biz.accounting.finaccount.FinaccountPackage;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fin Account Type Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeGlAccountImpl#getFinAccountTypeId <em>Fin Account Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeGlAccountImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.finaccount.impl.FinAccountTypeGlAccountImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinAccountTypeGlAccountImpl extends BizEntityImpl implements FinAccountTypeGlAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getFinAccountTypeId() <em>Fin Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected FinAccountType finAccountTypeId;
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
	 * The cached value of the '{@link #getGlAccountId() <em>Gl Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountId()
	 * @generated
	 * @ordered
	 */
	protected GlAccount glAccountId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinAccountTypeGlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinaccountPackage.Literals.FIN_ACCOUNT_TYPE_GL_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccount getGlAccountId() {
		if (glAccountId != null && ((EObject)glAccountId).eIsProxy()) {
			InternalEObject oldGlAccountId = (InternalEObject)glAccountId;
			glAccountId = (GlAccount)eResolveProxy(oldGlAccountId);
			if (glAccountId != oldGlAccountId) {
			}
		}
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccount basicGetGlAccountId() {
		return glAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountId(GlAccount newGlAccountId) {
		glAccountId = newGlAccountId;
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
		organizationPartyId = newOrganizationPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinAccountType getFinAccountTypeId() {
		if (finAccountTypeId != null && ((EObject)finAccountTypeId).eIsProxy()) {
			InternalEObject oldFinAccountTypeId = (InternalEObject)finAccountTypeId;
			finAccountTypeId = (FinAccountType)eResolveProxy(oldFinAccountTypeId);
			if (finAccountTypeId != oldFinAccountTypeId) {
			}
		}
		return finAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccountType basicGetFinAccountTypeId() {
		return finAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountTypeId(FinAccountType newFinAccountTypeId) {
		finAccountTypeId = newFinAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				if (resolve) return getFinAccountTypeId();
				return basicGetFinAccountTypeId();
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
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
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId((FinAccountType)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
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
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				setFinAccountTypeId((FinAccountType)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
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
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__FIN_ACCOUNT_TYPE_ID:
				return finAccountTypeId != null;
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case FinaccountPackage.FIN_ACCOUNT_TYPE_GL_ACCOUNT__GL_ACCOUNT_ID:
				return glAccountId != null;
		}
		return super.eIsSet(featureID);
	}

} //FinAccountTypeGlAccountImpl
