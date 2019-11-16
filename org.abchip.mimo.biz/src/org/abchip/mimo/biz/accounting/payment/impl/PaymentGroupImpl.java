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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The cached value of the '{@link #getPaymentGroupTypeId() <em>Payment Group Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGroupTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGroupType paymentGroupTypeId;

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
	public PaymentGroupType getPaymentGroupTypeId() {
		if (paymentGroupTypeId != null && ((EObject)paymentGroupTypeId).eIsProxy()) {
			InternalEObject oldPaymentGroupTypeId = (InternalEObject)paymentGroupTypeId;
			paymentGroupTypeId = (PaymentGroupType)eResolveProxy(oldPaymentGroupTypeId);
			if (paymentGroupTypeId != oldPaymentGroupTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID, oldPaymentGroupTypeId, paymentGroupTypeId));
			}
		}
		return paymentGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGroupType basicGetPaymentGroupTypeId() {
		return paymentGroupTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGroupTypeId(PaymentGroupType newPaymentGroupTypeId) {
		PaymentGroupType oldPaymentGroupTypeId = paymentGroupTypeId;
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
				if (resolve) return getPaymentGroupTypeId();
				return basicGetPaymentGroupTypeId();
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
				setPaymentGroupTypeId((PaymentGroupType)newValue);
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
				setPaymentGroupTypeId((PaymentGroupType)null);
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
				return paymentGroupTypeId != null;
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
		result.append(')');
		return result.toString();
	}

} //PaymentGroupImpl
