/**
 * Copyright (c) 2017, 2020 ABChip and others.
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
import org.eclipse.emf.ecore.EClass;

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
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GROUP__PAYMENT_GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGroupName(String newPaymentGroupName) {
		eSet(PaymentPackage.Literals.PAYMENT_GROUP__PAYMENT_GROUP_NAME, newPaymentGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGroupType getPaymentGroupTypeId() {
		return (PaymentGroupType)eGet(PaymentPackage.Literals.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGroupTypeId(PaymentGroupType newPaymentGroupTypeId) {
		eSet(PaymentPackage.Literals.PAYMENT_GROUP__PAYMENT_GROUP_TYPE_ID, newPaymentGroupTypeId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGroupId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GROUP__PAYMENT_GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGroupId(String newPaymentGroupId) {
		eSet(PaymentPackage.Literals.PAYMENT_GROUP__PAYMENT_GROUP_ID, newPaymentGroupId);
	}

} //PaymentGroupImpl
