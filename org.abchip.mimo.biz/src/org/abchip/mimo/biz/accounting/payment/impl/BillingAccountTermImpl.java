/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import java.util.Collection;
import java.util.List;

import org.abchip.mimo.biz.accounting.payment.BillingAccount;
import org.abchip.mimo.biz.accounting.payment.BillingAccountTerm;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.common.uom.Uom;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.abchip.mimo.biz.party.agreement.TermType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Account Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl#getBillingAccountTermId <em>Billing Account Term Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl#getTermDays <em>Term Days</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl#getTermValue <em>Term Value</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl#getUomId <em>Uom Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl#getTermTypeId <em>Term Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl#getBillingAccountId <em>Billing Account Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermImpl#getBillingAccountTermAttrs <em>Billing Account Term Attrs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillingAccountTermImpl extends BizEntityImpl implements BillingAccountTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getBillingAccountTermId() <em>Billing Account Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountTermId()
	 * @generated
	 * @ordered
	 */
	protected static final String BILLING_ACCOUNT_TERM_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBillingAccountTermId() <em>Billing Account Term Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountTermId()
	 * @generated
	 * @ordered
	 */
	protected String billingAccountTermId = BILLING_ACCOUNT_TERM_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getTermDays() <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDays()
	 * @generated
	 * @ordered
	 */
	protected static final long TERM_DAYS_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getTermDays() <em>Term Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDays()
	 * @generated
	 * @ordered
	 */
	protected long termDays = TERM_DAYS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TERM_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTermValue() <em>Term Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal termValue = TERM_VALUE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getUomId() <em>Uom Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUomId()
	 * @generated
	 * @ordered
	 */
	protected Uom uomId;
	/**
	 * The cached value of the '{@link #getTermTypeId() <em>Term Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermTypeId()
	 * @generated
	 * @ordered
	 */
	protected TermType termTypeId;
	/**
	 * The cached value of the '{@link #getBillingAccountId() <em>Billing Account Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountId()
	 * @generated
	 * @ordered
	 */
	protected BillingAccount billingAccountId;

	/**
	 * The cached value of the '{@link #getBillingAccountTermAttrs() <em>Billing Account Term Attrs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingAccountTermAttrs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> billingAccountTermAttrs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingAccountTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.BILLING_ACCOUNT_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getTermDays() {
		return termDays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermDays(long newTermDays) {
		long oldTermDays = termDays;
		termDays = newTermDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM__TERM_DAYS, oldTermDays, termDays));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermType getTermTypeId() {
		if (termTypeId != null && ((EObject)termTypeId).eIsProxy()) {
			InternalEObject oldTermTypeId = (InternalEObject)termTypeId;
			termTypeId = (TermType)eResolveProxy(oldTermTypeId);
			if (termTypeId != oldTermTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.BILLING_ACCOUNT_TERM__TERM_TYPE_ID, oldTermTypeId, termTypeId));
			}
		}
		return termTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType basicGetTermTypeId() {
		return termTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermTypeId(TermType newTermTypeId) {
		TermType oldTermTypeId = termTypeId;
		termTypeId = newTermTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM__TERM_TYPE_ID, oldTermTypeId, termTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTermValue() {
		return termValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermValue(BigDecimal newTermValue) {
		BigDecimal oldTermValue = termValue;
		termValue = newTermValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM__TERM_VALUE, oldTermValue, termValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uom getUomId() {
		if (uomId != null && ((EObject)uomId).eIsProxy()) {
			InternalEObject oldUomId = (InternalEObject)uomId;
			uomId = (Uom)eResolveProxy(oldUomId);
			if (uomId != oldUomId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.BILLING_ACCOUNT_TERM__UOM_ID, oldUomId, uomId));
			}
		}
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uom basicGetUomId() {
		return uomId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUomId(Uom newUomId) {
		Uom oldUomId = uomId;
		uomId = newUomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM__UOM_ID, oldUomId, uomId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getBillingAccountTermAttrs() {
		if (billingAccountTermAttrs == null) {
			billingAccountTermAttrs = new EDataTypeUniqueEList<String>(String.class, this, PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS);
		}
		return billingAccountTermAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BillingAccount getBillingAccountId() {
		if (billingAccountId != null && ((EObject)billingAccountId).eIsProxy()) {
			InternalEObject oldBillingAccountId = (InternalEObject)billingAccountId;
			billingAccountId = (BillingAccount)eResolveProxy(oldBillingAccountId);
			if (billingAccountId != oldBillingAccountId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
			}
		}
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingAccount basicGetBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountId(BillingAccount newBillingAccountId) {
		BillingAccount oldBillingAccountId = billingAccountId;
		billingAccountId = newBillingAccountId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID, oldBillingAccountId, billingAccountId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBillingAccountTermId() {
		return billingAccountTermId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBillingAccountTermId(String newBillingAccountTermId) {
		String oldBillingAccountTermId = billingAccountTermId;
		billingAccountTermId = newBillingAccountTermId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID, oldBillingAccountTermId, billingAccountTermId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID:
				return getBillingAccountTermId();
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_DAYS:
				return getTermDays();
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_VALUE:
				return getTermValue();
			case PaymentPackage.BILLING_ACCOUNT_TERM__UOM_ID:
				if (resolve) return getUomId();
				return basicGetUomId();
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_TYPE_ID:
				if (resolve) return getTermTypeId();
				return basicGetTermTypeId();
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID:
				if (resolve) return getBillingAccountId();
				return basicGetBillingAccountId();
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS:
				return getBillingAccountTermAttrs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID:
				setBillingAccountTermId((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_DAYS:
				setTermDays((Long)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_VALUE:
				setTermValue((BigDecimal)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__UOM_ID:
				setUomId((Uom)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_TYPE_ID:
				setTermTypeId((TermType)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS:
				getBillingAccountTermAttrs().clear();
				getBillingAccountTermAttrs().addAll((Collection<? extends String>)newValue);
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
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID:
				setBillingAccountTermId(BILLING_ACCOUNT_TERM_ID_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_DAYS:
				setTermDays(TERM_DAYS_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_VALUE:
				setTermValue(TERM_VALUE_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__UOM_ID:
				setUomId((Uom)null);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_TYPE_ID:
				setTermTypeId((TermType)null);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID:
				setBillingAccountId((BillingAccount)null);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS:
				getBillingAccountTermAttrs().clear();
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
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ID:
				return BILLING_ACCOUNT_TERM_ID_EDEFAULT == null ? billingAccountTermId != null : !BILLING_ACCOUNT_TERM_ID_EDEFAULT.equals(billingAccountTermId);
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_DAYS:
				return termDays != TERM_DAYS_EDEFAULT;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_VALUE:
				return TERM_VALUE_EDEFAULT == null ? termValue != null : !TERM_VALUE_EDEFAULT.equals(termValue);
			case PaymentPackage.BILLING_ACCOUNT_TERM__UOM_ID:
				return uomId != null;
			case PaymentPackage.BILLING_ACCOUNT_TERM__TERM_TYPE_ID:
				return termTypeId != null;
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_ID:
				return billingAccountId != null;
			case PaymentPackage.BILLING_ACCOUNT_TERM__BILLING_ACCOUNT_TERM_ATTRS:
				return billingAccountTermAttrs != null && !billingAccountTermAttrs.isEmpty();
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
		result.append(" (billingAccountTermId: ");
		result.append(billingAccountTermId);
		result.append(", termDays: ");
		result.append(termDays);
		result.append(", termValue: ");
		result.append(termValue);
		result.append(", billingAccountTermAttrs: ");
		result.append(billingAccountTermAttrs);
		result.append(')');
		return result.toString();
	}

} //BillingAccountTermImpl
