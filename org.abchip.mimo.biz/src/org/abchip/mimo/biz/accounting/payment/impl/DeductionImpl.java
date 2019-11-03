/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import java.math.BigDecimal;

import org.abchip.mimo.biz.accounting.payment.Deduction;
import org.abchip.mimo.biz.accounting.payment.DeductionType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deduction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl#getDeductionId <em>Deduction Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl#getDeductionTypeId <em>Deduction Type Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.DeductionImpl#getPaymentId <em>Payment Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeductionImpl extends BizEntityTypedImpl<DeductionType> implements Deduction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getDeductionId() <em>Deduction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEDUCTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeductionId() <em>Deduction Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionId()
	 * @generated
	 * @ordered
	 */
	protected String deductionId = DEDUCTION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeductionTypeId() <em>Deduction Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEDUCTION_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDeductionTypeId() <em>Deduction Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionTypeId()
	 * @generated
	 * @ordered
	 */
	protected String deductionTypeId = DEDUCTION_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected String paymentId = PAYMENT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.DEDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		BigDecimal oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.DEDUCTION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeductionId() {
		return deductionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeductionId(String newDeductionId) {
		String oldDeductionId = deductionId;
		deductionId = newDeductionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.DEDUCTION__DEDUCTION_ID, oldDeductionId, deductionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeductionTypeId() {
		return deductionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeductionTypeId(String newDeductionTypeId) {
		String oldDeductionTypeId = deductionTypeId;
		deductionTypeId = newDeductionTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID, oldDeductionTypeId, deductionTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentId() {
		return paymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentId(String newPaymentId) {
		String oldPaymentId = paymentId;
		paymentId = newPaymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.DEDUCTION__PAYMENT_ID, oldPaymentId, paymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.DEDUCTION__DEDUCTION_ID:
				return getDeductionId();
			case PaymentPackage.DEDUCTION__AMOUNT:
				return getAmount();
			case PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID:
				return getDeductionTypeId();
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
				return getPaymentId();
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
			case PaymentPackage.DEDUCTION__DEDUCTION_ID:
				setDeductionId((String)newValue);
				return;
			case PaymentPackage.DEDUCTION__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID:
				setDeductionTypeId((String)newValue);
				return;
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
				setPaymentId((String)newValue);
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
			case PaymentPackage.DEDUCTION__DEDUCTION_ID:
				setDeductionId(DEDUCTION_ID_EDEFAULT);
				return;
			case PaymentPackage.DEDUCTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID:
				setDeductionTypeId(DEDUCTION_TYPE_ID_EDEFAULT);
				return;
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
				setPaymentId(PAYMENT_ID_EDEFAULT);
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
			case PaymentPackage.DEDUCTION__DEDUCTION_ID:
				return DEDUCTION_ID_EDEFAULT == null ? deductionId != null : !DEDUCTION_ID_EDEFAULT.equals(deductionId);
			case PaymentPackage.DEDUCTION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID:
				return DEDUCTION_TYPE_ID_EDEFAULT == null ? deductionTypeId != null : !DEDUCTION_TYPE_ID_EDEFAULT.equals(deductionTypeId);
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
				return PAYMENT_ID_EDEFAULT == null ? paymentId != null : !PAYMENT_ID_EDEFAULT.equals(paymentId);
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
		result.append(" (deductionId: ");
		result.append(deductionId);
		result.append(", amount: ");
		result.append(amount);
		result.append(", deductionTypeId: ");
		result.append(deductionTypeId);
		result.append(", paymentId: ");
		result.append(paymentId);
		result.append(')');
		return result.toString();
	}

} //DeductionImpl
