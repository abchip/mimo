/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.finaccount.FinAccount;
import org.abchip.mimo.biz.accounting.ledger.GlAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentMethod;
import org.abchip.mimo.biz.accounting.payment.PaymentMethodType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.abchip.mimo.biz.party.party.Party;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getPaymentMethodId <em>Payment Method Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getPaymentMethodTypeId <em>Payment Method Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getPartyId <em>Party Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getGlAccountId <em>Gl Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentMethodImpl#getFinAccountId <em>Fin Account Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentMethodImpl extends BizEntityTypedImpl<PaymentMethodType> implements PaymentMethod {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_METHOD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentMethodId() <em>Payment Method Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodId()
	 * @generated
	 * @ordered
	 */
	protected String paymentMethodId = PAYMENT_METHOD_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date THRU_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThruDate() <em>Thru Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThruDate()
	 * @generated
	 * @ordered
	 */
	protected Date thruDate = THRU_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaymentMethodTypeId() <em>Payment Method Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentMethodTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethodType paymentMethodTypeId;
	/**
	 * The cached value of the '{@link #getPartyId() <em>Party Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartyId()
	 * @generated
	 * @ordered
	 */
	protected Party partyId;
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
	 * The cached value of the '{@link #getFinAccountId() <em>Fin Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinAccountId()
	 * @generated
	 * @ordered
	 */
	protected FinAccount finAccountId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromDate(Date newFromDate) {
		fromDate = newFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party getPartyId() {
		if (partyId != null && ((EObject)partyId).eIsProxy()) {
			InternalEObject oldPartyId = (InternalEObject)partyId;
			partyId = (Party)eResolveProxy(oldPartyId);
			if (partyId != oldPartyId) {
			}
		}
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party basicGetPartyId() {
		return partyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartyId(Party newPartyId) {
		partyId = newPartyId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getThruDate() {
		return thruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThruDate(Date newThruDate) {
		thruDate = newThruDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> orderPaymentPreferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> partyAcctgPreferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> paymentGatewayResponses() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> payments() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> replenishFinAccounts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> returnHeaders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> shoppingLists() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethodType getPaymentMethodTypeId() {
		if (paymentMethodTypeId != null && ((EObject)paymentMethodTypeId).eIsProxy()) {
			InternalEObject oldPaymentMethodTypeId = (InternalEObject)paymentMethodTypeId;
			paymentMethodTypeId = (PaymentMethodType)eResolveProxy(oldPaymentMethodTypeId);
			if (paymentMethodTypeId != oldPaymentMethodTypeId) {
			}
		}
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentMethodType basicGetPaymentMethodTypeId() {
		return paymentMethodTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodTypeId(PaymentMethodType newPaymentMethodTypeId) {
		paymentMethodTypeId = newPaymentMethodTypeId;
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
	public FinAccount getFinAccountId() {
		if (finAccountId != null && ((EObject)finAccountId).eIsProxy()) {
			InternalEObject oldFinAccountId = (InternalEObject)finAccountId;
			finAccountId = (FinAccount)eResolveProxy(oldFinAccountId);
			if (finAccountId != oldFinAccountId) {
			}
		}
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinAccount basicGetFinAccountId() {
		return finAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinAccountId(FinAccount newFinAccountId) {
		finAccountId = newFinAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentMethodId() {
		return paymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentMethodId(String newPaymentMethodId) {
		paymentMethodId = newPaymentMethodId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_ID:
				return getPaymentMethodId();
			case PaymentPackage.PAYMENT_METHOD__DESCRIPTION:
				return getDescription();
			case PaymentPackage.PAYMENT_METHOD__FROM_DATE:
				return getFromDate();
			case PaymentPackage.PAYMENT_METHOD__THRU_DATE:
				return getThruDate();
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID:
				if (resolve) return getPaymentMethodTypeId();
				return basicGetPaymentMethodTypeId();
			case PaymentPackage.PAYMENT_METHOD__PARTY_ID:
				if (resolve) return getPartyId();
				return basicGetPartyId();
			case PaymentPackage.PAYMENT_METHOD__GL_ACCOUNT_ID:
				if (resolve) return getGlAccountId();
				return basicGetGlAccountId();
			case PaymentPackage.PAYMENT_METHOD__FIN_ACCOUNT_ID:
				if (resolve) return getFinAccountId();
				return basicGetFinAccountId();
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
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_ID:
				setPaymentMethodId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD__PARTY_ID:
				setPartyId((Party)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)newValue);
				return;
			case PaymentPackage.PAYMENT_METHOD__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)newValue);
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
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_ID:
				setPaymentMethodId(PAYMENT_METHOD_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_METHOD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_METHOD__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_METHOD__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID:
				setPaymentMethodTypeId((PaymentMethodType)null);
				return;
			case PaymentPackage.PAYMENT_METHOD__PARTY_ID:
				setPartyId((Party)null);
				return;
			case PaymentPackage.PAYMENT_METHOD__GL_ACCOUNT_ID:
				setGlAccountId((GlAccount)null);
				return;
			case PaymentPackage.PAYMENT_METHOD__FIN_ACCOUNT_ID:
				setFinAccountId((FinAccount)null);
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
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_ID:
				return PAYMENT_METHOD_ID_EDEFAULT == null ? paymentMethodId != null : !PAYMENT_METHOD_ID_EDEFAULT.equals(paymentMethodId);
			case PaymentPackage.PAYMENT_METHOD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentPackage.PAYMENT_METHOD__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PaymentPackage.PAYMENT_METHOD__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PaymentPackage.PAYMENT_METHOD__PAYMENT_METHOD_TYPE_ID:
				return paymentMethodTypeId != null;
			case PaymentPackage.PAYMENT_METHOD__PARTY_ID:
				return partyId != null;
			case PaymentPackage.PAYMENT_METHOD__GL_ACCOUNT_ID:
				return glAccountId != null;
			case PaymentPackage.PAYMENT_METHOD__FIN_ACCOUNT_ID:
				return finAccountId != null;
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
		result.append(" (paymentMethodId: ");
		result.append(paymentMethodId);
		result.append(", description: ");
		result.append(description);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PaymentMethodImpl
