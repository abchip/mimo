/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.BillingAccountTermAttr;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Account Term Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermAttrImpl#getBillingAccountTermId <em>Billing Account Term Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermAttrImpl#getAttrName <em>Attr Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.BillingAccountTermAttrImpl#getAttrValue <em>Attr Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BillingAccountTermAttrImpl extends BizEntityImpl implements BillingAccountTermAttr {
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
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAttrValue() <em>Attr Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrValue()
	 * @generated
	 * @ordered
	 */
	protected String attrValue = ATTR_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingAccountTermAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.BILLING_ACCOUNT_TERM_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrName(String newAttrName) {
		String oldAttrName = attrName;
		attrName = newAttrName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME, oldAttrName, attrName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttrValue() {
		return attrValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttrValue(String newAttrValue) {
		String oldAttrValue = attrValue;
		attrValue = newAttrValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE, oldAttrValue, attrValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID, oldBillingAccountTermId, billingAccountTermId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID:
				return getBillingAccountTermId();
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME:
				return getAttrName();
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE:
				return getAttrValue();
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
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID:
				setBillingAccountTermId((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME:
				setAttrName((String)newValue);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE:
				setAttrValue((String)newValue);
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
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID:
				setBillingAccountTermId(BILLING_ACCOUNT_TERM_ID_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
				return;
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE:
				setAttrValue(ATTR_VALUE_EDEFAULT);
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
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__BILLING_ACCOUNT_TERM_ID:
				return BILLING_ACCOUNT_TERM_ID_EDEFAULT == null ? billingAccountTermId != null : !BILLING_ACCOUNT_TERM_ID_EDEFAULT.equals(billingAccountTermId);
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
			case PaymentPackage.BILLING_ACCOUNT_TERM_ATTR__ATTR_VALUE:
				return ATTR_VALUE_EDEFAULT == null ? attrValue != null : !ATTR_VALUE_EDEFAULT.equals(attrValue);
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
		result.append(", attrName: ");
		result.append(attrName);
		result.append(", attrValue: ");
		result.append(attrValue);
		result.append(')');
		return result.toString();
	}

} //BillingAccountTermAttrImpl
