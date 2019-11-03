/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGroup;
import org.abchip.mimo.biz.accounting.payment.PaymentGroupType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupImpl#getPaymentGroupId <em>Payment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupImpl#getPaymentGroupName <em>Payment Group Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupImpl#getPaymentGroupTypeId <em>Payment Group Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGroupImpl extends BizEntityTypedImpl<PaymentGroupType> implements PaymentGroup {
	/**
	 * The default value of the '{@link #getPaymentGroupId() <em>Payment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GROUP_ID_EDEFAULT = null;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The cached value of the '{@link #getPaymentGroupId() <em>Payment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGroupId = PAYMENT_GROUP_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaymentGroupName() <em>Payment Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GROUP_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentGroupName() <em>Payment Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupName()
	 * @generated
	 * @ordered
	 */
	protected String paymentGroupName = PAYMENT_GROUP_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPaymentGroupTypeId() <em>Payment Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GROUP_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentGroupTypeId() <em>Payment Group Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGroupTypeId = PAYMENT_GROUP_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGroupName() {
		return paymentGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGroupName(String newPaymentGroupName) {
		String oldPaymentGroupName = paymentGroupName;
		paymentGroupName = newPaymentGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_NAME, oldPaymentGroupName, paymentGroupName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGroupTypeId() {
		return paymentGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGroupTypeId(String newPaymentGroupTypeId) {
		String oldPaymentGroupTypeId = paymentGroupTypeId;
		paymentGroupTypeId = newPaymentGroupTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID, oldPaymentGroupTypeId, paymentGroupTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGroupId() {
		return paymentGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGroupId(String newPaymentGroupId) {
		String oldPaymentGroupId = paymentGroupId;
		paymentGroupId = newPaymentGroupId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_ID, oldPaymentGroupId, paymentGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_ID:
				return getPaymentGroupId();
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_NAME:
				return getPaymentGroupName();
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID:
				return getPaymentGroupTypeId();
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
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_ID:
				setPaymentGroupId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_NAME:
				setPaymentGroupName((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID:
				setPaymentGroupTypeId((String)newValue);
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
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_ID:
				setPaymentGroupId(PAYMENT_GROUP_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_NAME:
				setPaymentGroupName(PAYMENT_GROUP_NAME_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID:
				setPaymentGroupTypeId(PAYMENT_GROUP_TYPE_ID_EDEFAULT);
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
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_ID:
				return PAYMENT_GROUP_ID_EDEFAULT == null ? paymentGroupId != null : !PAYMENT_GROUP_ID_EDEFAULT.equals(paymentGroupId);
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_NAME:
				return PAYMENT_GROUP_NAME_EDEFAULT == null ? paymentGroupName != null : !PAYMENT_GROUP_NAME_EDEFAULT.equals(paymentGroupName);
			case PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID:
				return PAYMENT_GROUP_TYPE_ID_EDEFAULT == null ? paymentGroupTypeId != null : !PAYMENT_GROUP_TYPE_ID_EDEFAULT.equals(paymentGroupTypeId);
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
		result.append(" (paymentGroupId: ");
		result.append(paymentGroupId);
		result.append(", paymentGroupName: ");
		result.append(paymentGroupName);
		result.append(", paymentGroupTypeId: ");
		result.append(paymentGroupTypeId);
		result.append(')');
		return result.toString();
	}

} //PaymentGroupImpl
