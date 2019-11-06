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
import org.abchip.mimo.biz.accounting.payment.Payment;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The cached value of the '{@link #getDeductionTypeId() <em>Deduction Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeductionTypeId()
	 * @generated
	 * @ordered
	 */
	protected DeductionType deductionTypeId;

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
		amount = newAmount;
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
		deductionId = newDeductionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeductionType getDeductionTypeId() {
		if (deductionTypeId != null && ((EObject)deductionTypeId).eIsProxy()) {
			InternalEObject oldDeductionTypeId = (InternalEObject)deductionTypeId;
			deductionTypeId = (DeductionType)eResolveProxy(oldDeductionTypeId);
			if (deductionTypeId != oldDeductionTypeId) {
			}
		}
		return deductionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeductionType basicGetDeductionTypeId() {
		return deductionTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeductionTypeId(DeductionType newDeductionTypeId) {
		deductionTypeId = newDeductionTypeId;
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
		paymentId = newPaymentId;
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
				if (resolve) return getDeductionTypeId();
				return basicGetDeductionTypeId();
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
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
			case PaymentPackage.DEDUCTION__DEDUCTION_ID:
				setDeductionId((String)newValue);
				return;
			case PaymentPackage.DEDUCTION__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID:
				setDeductionTypeId((DeductionType)newValue);
				return;
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
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
			case PaymentPackage.DEDUCTION__DEDUCTION_ID:
				setDeductionId(DEDUCTION_ID_EDEFAULT);
				return;
			case PaymentPackage.DEDUCTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID:
				setDeductionTypeId((DeductionType)null);
				return;
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
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
			case PaymentPackage.DEDUCTION__DEDUCTION_ID:
				return DEDUCTION_ID_EDEFAULT == null ? deductionId != null : !DEDUCTION_ID_EDEFAULT.equals(deductionId);
			case PaymentPackage.DEDUCTION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case PaymentPackage.DEDUCTION__DEDUCTION_TYPE_ID:
				return deductionTypeId != null;
			case PaymentPackage.DEDUCTION__PAYMENT_ID:
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
		result.append(" (deductionId: ");
		result.append(deductionId);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //DeductionImpl
