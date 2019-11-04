/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.ledger.impl;

import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.ledger.LedgerPackage;
import org.abchip.mimo.biz.accounting.ledger.VarianceReasonGlAccount;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variance Reason Gl Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.VarianceReasonGlAccountImpl#getVarianceReasonId <em>Variance Reason Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.VarianceReasonGlAccountImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.ledger.impl.VarianceReasonGlAccountImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarianceReasonGlAccountImpl extends BizEntityImpl implements VarianceReasonGlAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getVarianceReasonId() <em>Variance Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarianceReasonId()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIANCE_REASON_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getVarianceReasonId() <em>Variance Reason Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarianceReasonId()
	 * @generated
	 * @ordered
	 */
	protected String varianceReasonId = VARIANCE_REASON_ID_EDEFAULT;
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
	protected VarianceReasonGlAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LedgerPackage.Literals.VARIANCE_REASON_GL_ACCOUNT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarianceReasonId() {
		return varianceReasonId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarianceReasonId(String newVarianceReasonId) {
		String oldVarianceReasonId = varianceReasonId;
		varianceReasonId = newVarianceReasonId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID, oldVarianceReasonId, varianceReasonId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
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
		GlAccount oldGlAccountId = glAccountId;
		glAccountId = newGlAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID, oldGlAccountId, glAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID:
				return getVarianceReasonId();
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID:
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
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID:
				setVarianceReasonId((String)newValue);
				return;
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID:
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
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID:
				setVarianceReasonId(VARIANCE_REASON_ID_EDEFAULT);
				return;
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID:
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
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__VARIANCE_REASON_ID:
				return VARIANCE_REASON_ID_EDEFAULT == null ? varianceReasonId != null : !VARIANCE_REASON_ID_EDEFAULT.equals(varianceReasonId);
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case LedgerPackage.VARIANCE_REASON_GL_ACCOUNT__GL_ACCOUNT_ID:
				return glAccountId != null;
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
		result.append(" (varianceReasonId: ");
		result.append(varianceReasonId);
		result.append(')');
		return result.toString();
	}

} //VarianceReasonGlAccountImpl
