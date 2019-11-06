/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.ledger.GlAccountType;
import org.abchip.mimo.biz.accounting.payment.PaymentGlAccountTypeMap;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.accounting.payment.PaymentType;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gl Account Type Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGlAccountTypeMapImpl#getPaymentTypeId <em>Payment Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGlAccountTypeMapImpl#getOrganizationPartyId <em>Organization Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGlAccountTypeMapImpl#getGlAccountTypeId <em>Gl Account Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGlAccountTypeMapImpl extends BizEntityImpl implements PaymentGlAccountTypeMap {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentType paymentTypeId;
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
	 * The cached value of the '{@link #getGlAccountTypeId() <em>Gl Account Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlAccountTypeId()
	 * @generated
	 * @ordered
	 */
	protected GlAccountType glAccountTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGlAccountTypeMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GL_ACCOUNT_TYPE_MAP;
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
	public PaymentType getPaymentTypeId() {
		if (paymentTypeId != null && ((EObject)paymentTypeId).eIsProxy()) {
			InternalEObject oldPaymentTypeId = (InternalEObject)paymentTypeId;
			paymentTypeId = (PaymentType)eResolveProxy(oldPaymentTypeId);
			if (paymentTypeId != oldPaymentTypeId) {
			}
		}
		return paymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType basicGetPaymentTypeId() {
		return paymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentTypeId(PaymentType newPaymentTypeId) {
		paymentTypeId = newPaymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlAccountType getGlAccountTypeId() {
		if (glAccountTypeId != null && ((EObject)glAccountTypeId).eIsProxy()) {
			InternalEObject oldGlAccountTypeId = (InternalEObject)glAccountTypeId;
			glAccountTypeId = (GlAccountType)eResolveProxy(oldGlAccountTypeId);
			if (glAccountTypeId != oldGlAccountTypeId) {
			}
		}
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlAccountType basicGetGlAccountTypeId() {
		return glAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlAccountTypeId(GlAccountType newGlAccountTypeId) {
		glAccountTypeId = newGlAccountTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID:
				if (resolve) return getPaymentTypeId();
				return basicGetPaymentTypeId();
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID:
				if (resolve) return getOrganizationPartyId();
				return basicGetOrganizationPartyId();
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID:
				if (resolve) return getGlAccountTypeId();
				return basicGetGlAccountTypeId();
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
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID:
				setPaymentTypeId((PaymentType)newValue);
				return;
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)newValue);
				return;
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)newValue);
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
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID:
				setPaymentTypeId((PaymentType)null);
				return;
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID:
				setOrganizationPartyId((Party)null);
				return;
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID:
				setGlAccountTypeId((GlAccountType)null);
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
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID:
				return paymentTypeId != null;
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID:
				return glAccountTypeId != null;
		}
		return super.eIsSet(featureID);
	}

} //PaymentGlAccountTypeMapImpl
