/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getAccountCurrencyUomId <em>Account Currency Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getAccountLimit <em>Account Limit</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getContactMechId <em>Contact Mech Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getExternalAccountId <em>External Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountImpl#getThruDate <em>Thru Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillingAccountImpl extends BizEntityImpl implements BillingAccount {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected String billingAccountId = BILLING_ACCOUNT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAccountCurrencyUomId() <em>Account Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_CURRENCY_UOM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAccountCurrencyUomId() <em>Account Currency Uom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountCurrencyUomId()
	 * @generated
	 * @ordered
	 */
	protected String accountCurrencyUomId = ACCOUNT_CURRENCY_UOM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAccountLimit() <em>Account Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ACCOUNT_LIMIT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAccountLimit() <em>Account Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountLimit()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal accountLimit = ACCOUNT_LIMIT_EDEFAULT;
	/**
	 * The default value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_MECH_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getContactMechId() <em>Contact Mech Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactMechId()
	 * @generated
	 * @ordered
	 */
	protected String contactMechId = CONTACT_MECH_ID_EDEFAULT;
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
	 * The default value of the '{@link #getExternalAccountId() <em>External Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ACCOUNT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExternalAccountId() <em>External Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalAccountId()
	 * @generated
	 * @ordered
	 */
	protected String externalAccountId = EXTERNAL_ACCOUNT_ID_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.BILLING_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountCurrencyUomId() {
		return accountCurrencyUomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountCurrencyUomId(String newAccountCurrencyUomId) {
		String oldAccountCurrencyUomId = accountCurrencyUomId;
		accountCurrencyUomId = newAccountCurrencyUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID, oldAccountCurrencyUomId, accountCurrencyUomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAccountLimit() {
		return accountLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountLimit(BigDecimal newAccountLimit) {
		BigDecimal oldAccountLimit = accountLimit;
		accountLimit = newAccountLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__ACCOUNT_LIMIT, oldAccountLimit, accountLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactMechId() {
		return contactMechId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactMechId(String newContactMechId) {
		String oldContactMechId = contactMechId;
		contactMechId = newContactMechId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__CONTACT_MECH_ID, oldContactMechId, contactMechId));
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
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalAccountId() {
		return externalAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalAccountId(String newExternalAccountId) {
		String oldExternalAccountId = externalAccountId;
		externalAccountId = newExternalAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID, oldExternalAccountId, externalAccountId));
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
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__FROM_DATE, oldFromDate, fromDate));
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
		Date oldThruDate = thruDate;
		thruDate = newThruDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__THRU_DATE, oldThruDate, thruDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> billingAccountTerms() {
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
	public List<String> invoices() {
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
	public List<String> orderHeaders() {
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
	public List<String> paymentApplications() {
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
	public List<String> returnItemResponses() {
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
	public String getBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(String newBillingAccountId) {
		String oldBillingAccountId = billingAccountId;
		billingAccountId = newBillingAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.BILLING_ACCOUNT__BILLING_ACCOUNT_ID:
				return getBillingAccountId();
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID:
				return getAccountCurrencyUomId();
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_LIMIT:
				return getAccountLimit();
			case PaymentPackage.BILLING_ACCOUNT__CONTACT_MECH_ID:
				return getContactMechId();
			case PaymentPackage.BILLING_ACCOUNT__DESCRIPTION:
				return getDescription();
			case PaymentPackage.BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID:
				return getExternalAccountId();
			case PaymentPackage.BILLING_ACCOUNT__FROM_DATE:
				return getFromDate();
			case PaymentPackage.BILLING_ACCOUNT__THRU_DATE:
				return getThruDate();
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
			case PaymentPackage.BILLING_ACCOUNT__BILLING_ACCOUNT_ID:
				setBillingAccountId((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID:
				setAccountCurrencyUomId((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_LIMIT:
				setAccountLimit((BigDecimal)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT__CONTACT_MECH_ID:
				setContactMechId((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID:
				setExternalAccountId((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT__THRU_DATE:
				setThruDate((Date)newValue);
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
			case PaymentPackage.BILLING_ACCOUNT__BILLING_ACCOUNT_ID:
				setBillingAccountId(BILLING_ACCOUNT_ID_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID:
				setAccountCurrencyUomId(ACCOUNT_CURRENCY_UOM_ID_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_LIMIT:
				setAccountLimit(ACCOUNT_LIMIT_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT__CONTACT_MECH_ID:
				setContactMechId(CONTACT_MECH_ID_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID:
				setExternalAccountId(EXTERNAL_ACCOUNT_ID_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
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
			case PaymentPackage.BILLING_ACCOUNT__BILLING_ACCOUNT_ID:
				return BILLING_ACCOUNT_ID_EDEFAULT == null ? billingAccountId != null : !BILLING_ACCOUNT_ID_EDEFAULT.equals(billingAccountId);
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_CURRENCY_UOM_ID:
				return ACCOUNT_CURRENCY_UOM_ID_EDEFAULT == null ? accountCurrencyUomId != null : !ACCOUNT_CURRENCY_UOM_ID_EDEFAULT.equals(accountCurrencyUomId);
			case PaymentPackage.BILLING_ACCOUNT__ACCOUNT_LIMIT:
				return ACCOUNT_LIMIT_EDEFAULT == null ? accountLimit != null : !ACCOUNT_LIMIT_EDEFAULT.equals(accountLimit);
			case PaymentPackage.BILLING_ACCOUNT__CONTACT_MECH_ID:
				return CONTACT_MECH_ID_EDEFAULT == null ? contactMechId != null : !CONTACT_MECH_ID_EDEFAULT.equals(contactMechId);
			case PaymentPackage.BILLING_ACCOUNT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentPackage.BILLING_ACCOUNT__EXTERNAL_ACCOUNT_ID:
				return EXTERNAL_ACCOUNT_ID_EDEFAULT == null ? externalAccountId != null : !EXTERNAL_ACCOUNT_ID_EDEFAULT.equals(externalAccountId);
			case PaymentPackage.BILLING_ACCOUNT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PaymentPackage.BILLING_ACCOUNT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
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
		result.append(" (billingAccountId: ");
		result.append(billingAccountId);
		result.append(", accountCurrencyUomId: ");
		result.append(accountCurrencyUomId);
		result.append(", accountLimit: ");
		result.append(accountLimit);
		result.append(", contactMechId: ");
		result.append(contactMechId);
		result.append(", description: ");
		result.append(description);
		result.append(", externalAccountId: ");
		result.append(externalAccountId);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //BillingAccountImpl
