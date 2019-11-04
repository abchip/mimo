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
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	 * The default value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentTypeId() <em>Payment Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentTypeId = PAYMENT_TYPE_ID_EDEFAULT;
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID, oldOrganizationPartyId, organizationPartyId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentTypeId() {
		return paymentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentTypeId(String newPaymentTypeId) {
		String oldPaymentTypeId = paymentTypeId;
		paymentTypeId = newPaymentTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__PAYMENT_TYPE_ID, oldPaymentTypeId, paymentTypeId));
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
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID, oldGlAccountTypeId, glAccountTypeId));
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
		GlAccountType oldGlAccountTypeId = glAccountTypeId;
		glAccountTypeId = newGlAccountTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID, oldGlAccountTypeId, glAccountTypeId));
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
				return getPaymentTypeId();
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
				setPaymentTypeId((String)newValue);
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
				setPaymentTypeId(PAYMENT_TYPE_ID_EDEFAULT);
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
				return PAYMENT_TYPE_ID_EDEFAULT == null ? paymentTypeId != null : !PAYMENT_TYPE_ID_EDEFAULT.equals(paymentTypeId);
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__ORGANIZATION_PARTY_ID:
				return organizationPartyId != null;
			case PaymentPackage.PAYMENT_GL_ACCOUNT_TYPE_MAP__GL_ACCOUNT_TYPE_ID:
				return glAccountTypeId != null;
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
		result.append(" (paymentTypeId: ");
		result.append(paymentTypeId);
		result.append(')');
		return result.toString();
	}

} //PaymentGlAccountTypeMapImpl
