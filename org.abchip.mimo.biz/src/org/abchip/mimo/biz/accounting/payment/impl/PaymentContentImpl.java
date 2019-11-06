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
import org.abchip.mimo.biz.accounting.payment.PaymentContent;
import org.abchip.mimo.biz.accounting.payment.PaymentContentType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.content.content.Content;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl#getThruDate <em>Thru Date</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl#getPaymentId <em>Payment Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentContentImpl#getPaymentContentTypeId <em>Payment Content Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentContentImpl extends BizEntityTypedImpl<PaymentContentType> implements PaymentContent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	 * The cached value of the '{@link #getPaymentId() <em>Payment Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentId()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentId;
	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected Content contentId;
	/**
	 * The cached value of the '{@link #getPaymentContentTypeId() <em>Payment Content Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentContentTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentContentType paymentContentTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Content getContentId() {
		if (contentId != null && ((EObject)contentId).eIsProxy()) {
			InternalEObject oldContentId = (InternalEObject)contentId;
			contentId = (Content)eResolveProxy(oldContentId);
			if (contentId != oldContentId) {
			}
		}
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Content basicGetContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentId(Content newContentId) {
		contentId = newContentId;
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
	public PaymentContentType getPaymentContentTypeId() {
		if (paymentContentTypeId != null && ((EObject)paymentContentTypeId).eIsProxy()) {
			InternalEObject oldPaymentContentTypeId = (InternalEObject)paymentContentTypeId;
			paymentContentTypeId = (PaymentContentType)eResolveProxy(oldPaymentContentTypeId);
			if (paymentContentTypeId != oldPaymentContentTypeId) {
			}
		}
		return paymentContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentContentType basicGetPaymentContentTypeId() {
		return paymentContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentContentTypeId(PaymentContentType newPaymentContentTypeId) {
		paymentContentTypeId = newPaymentContentTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_CONTENT__FROM_DATE:
				return getFromDate();
			case PaymentPackage.PAYMENT_CONTENT__THRU_DATE:
				return getThruDate();
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_ID:
				if (resolve) return getPaymentId();
				return basicGetPaymentId();
			case PaymentPackage.PAYMENT_CONTENT__CONTENT_ID:
				if (resolve) return getContentId();
				return basicGetContentId();
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_CONTENT_TYPE_ID:
				if (resolve) return getPaymentContentTypeId();
				return basicGetPaymentContentTypeId();
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
			case PaymentPackage.PAYMENT_CONTENT__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT_CONTENT__THRU_DATE:
				setThruDate((Date)newValue);
				return;
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_ID:
				setPaymentId((Payment)newValue);
				return;
			case PaymentPackage.PAYMENT_CONTENT__CONTENT_ID:
				setContentId((Content)newValue);
				return;
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_CONTENT_TYPE_ID:
				setPaymentContentTypeId((PaymentContentType)newValue);
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
			case PaymentPackage.PAYMENT_CONTENT__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_CONTENT__THRU_DATE:
				setThruDate(THRU_DATE_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_ID:
				setPaymentId((Payment)null);
				return;
			case PaymentPackage.PAYMENT_CONTENT__CONTENT_ID:
				setContentId((Content)null);
				return;
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_CONTENT_TYPE_ID:
				setPaymentContentTypeId((PaymentContentType)null);
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
			case PaymentPackage.PAYMENT_CONTENT__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case PaymentPackage.PAYMENT_CONTENT__THRU_DATE:
				return THRU_DATE_EDEFAULT == null ? thruDate != null : !THRU_DATE_EDEFAULT.equals(thruDate);
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_ID:
				return paymentId != null;
			case PaymentPackage.PAYMENT_CONTENT__CONTENT_ID:
				return contentId != null;
			case PaymentPackage.PAYMENT_CONTENT__PAYMENT_CONTENT_TYPE_ID:
				return paymentContentTypeId != null;
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
		result.append(" (fromDate: ");
		result.append(fromDate);
		result.append(", thruDate: ");
		result.append(thruDate);
		result.append(')');
		return result.toString();
	}

} //PaymentContentImpl
