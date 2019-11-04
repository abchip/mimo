/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.util.Date;

import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentGroupMember;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Group Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl#getPaymentGroupId <em>Payment Group Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl#getSequenceNum <em>Sequence Num</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGroupMemberImpl#getPaymentId <em>Payment Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGroupMemberImpl extends BizEntityImpl implements PaymentGroupMember {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getPaymentGroupId() <em>Payment Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGroupId = PAYMENT_GROUP_ID_EDEFAULT;

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
	 * The default value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected static final long SEQUENCE_NUM_EDEFAULT = 0L;
	/**
	 * The cached value of the '{@link #getSequenceNum() <em>Sequence Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNum()
	 * @generated
	 * @ordered
	 */
	protected long sequenceNum = SEQUENCE_NUM_EDEFAULT;
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
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGroupMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GROUP_MEMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP_MEMBER__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSequenceNum() {
		return sequenceNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequenceNum(long newSequenceNum) {
		long oldSequenceNum = sequenceNum;
		sequenceNum = newSequenceNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP_MEMBER__SEQUENCE_NUM, oldSequenceNum, sequenceNum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP_MEMBER__THRU_DATE, oldThruDate, thruDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID, oldPaymentGroupId, paymentGroupId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPaymentId() {
		if (paymentId != null && ((EObject)paymentId).eIsProxy()) {
			InternalEObject oldPaymentId = (InternalEObject)paymentId;
			paymentId = (Payment)eResolveProxy(oldPaymentId);
			if (paymentId != oldPaymentId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_ID, oldPaymentId, paymentId));
			}
		}
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Payment basicGetPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(Payment newPaymentId) {
		Payment oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID:
				return getPaymentGroupId();
			case PaymentPackage.PAYMENT_GROUP_MEMBER__FROM_DATE:
				return getFromDate();
			case PaymentPackage.PAYMENT_GROUP_MEMBER__SEQUENCE_NUM:
				return getSequenceNum();
			case PaymentPackage.PAYMENT_GROUP_MEMBER__THRU_DATE:
				return getThruDate();
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_ID:
				if (resolve) return getPaymentId();
				return basicGetPaymentId();
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
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID:
				setPaymentGroupId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__SEQUENCE_NUM:
				setSequenceNum((Long)newValue);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_ID:
				setPaymentId((Payment)newValue);
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
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID:
				setPaymentGroupId(PAYMENT_GROUP_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__SEQUENCE_NUM:
				setSequenceNum(SEQUENCE_NUM_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_ID:
				setPaymentId((Payment)null);
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
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_GROUP_ID:
				return PAYMENT_GROUP_ID_EDEFAULT == null ? paymentGroupId != null : !PAYMENT_GROUP_ID_EDEFAULT.equals(paymentGroupId);
			case PaymentPackage.PAYMENT_GROUP_MEMBER__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PaymentPackage.PAYMENT_GROUP_MEMBER__SEQUENCE_NUM:
				return sequenceNum != SEQUENCE_NUM_EDEFAULT;
			case PaymentPackage.PAYMENT_GROUP_MEMBER__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PaymentPackage.PAYMENT_GROUP_MEMBER__PAYMENT_ID:
				return paymentId != null;
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
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", sequenceNum: ");
		result.append(sequenceNum);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PaymentGroupMemberImpl
