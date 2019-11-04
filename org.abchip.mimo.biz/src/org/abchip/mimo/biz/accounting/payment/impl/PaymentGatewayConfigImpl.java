/**
 * Copyright (c) 2017, 2019 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfig;
import org.abchip.mimo.biz.accounting.payment.PaymentGatewayConfigType;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityTypedImpl;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayConfigImpl#getPaymentGatewayConfigTypeId <em>Payment Gateway Config Type Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayConfigImpl extends BizEntityTypedImpl<PaymentGatewayConfigType> implements PaymentGatewayConfig {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The default value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigId() <em>Payment Gateway Config Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGatewayConfigId = PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT;
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
	 * The cached value of the '{@link #getPaymentGatewayConfigTypeId() <em>Payment Gateway Config Type Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigTypeId()
	 * @generated
	 * @ordered
	 */
	protected PaymentGatewayConfigType paymentGatewayConfigTypeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CONFIG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGatewayConfigType getPaymentGatewayConfigTypeId() {
		if (paymentGatewayConfigTypeId != null && ((EObject)paymentGatewayConfigTypeId).eIsProxy()) {
			InternalEObject oldPaymentGatewayConfigTypeId = (InternalEObject)paymentGatewayConfigTypeId;
			paymentGatewayConfigTypeId = (PaymentGatewayConfigType)eResolveProxy(oldPaymentGatewayConfigTypeId);
			if (paymentGatewayConfigTypeId != oldPaymentGatewayConfigTypeId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID, oldPaymentGatewayConfigTypeId, paymentGatewayConfigTypeId));
			}
		}
		return paymentGatewayConfigTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGatewayConfigType basicGetPaymentGatewayConfigTypeId() {
		return paymentGatewayConfigTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigTypeId(PaymentGatewayConfigType newPaymentGatewayConfigTypeId) {
		PaymentGatewayConfigType oldPaymentGatewayConfigTypeId = paymentGatewayConfigTypeId;
		paymentGatewayConfigTypeId = newPaymentGatewayConfigTypeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID, oldPaymentGatewayConfigTypeId, paymentGatewayConfigTypeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return paymentGatewayConfigId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		String oldPaymentGatewayConfigId = paymentGatewayConfigId;
		paymentGatewayConfigId = newPaymentGatewayConfigId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID, oldPaymentGatewayConfigId, paymentGatewayConfigId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID:
				return getPaymentGatewayConfigId();
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__DESCRIPTION:
				return getDescription();
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID:
				if (resolve) return getPaymentGatewayConfigTypeId();
				return basicGetPaymentGatewayConfigTypeId();
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
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID:
				setPaymentGatewayConfigTypeId((PaymentGatewayConfigType)newValue);
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
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID:
				setPaymentGatewayConfigId(PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID:
				setPaymentGatewayConfigTypeId((PaymentGatewayConfigType)null);
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
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_ID:
				return PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT == null ? paymentGatewayConfigId != null : !PAYMENT_GATEWAY_CONFIG_ID_EDEFAULT.equals(paymentGatewayConfigId);
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PaymentPackage.PAYMENT_GATEWAY_CONFIG__PAYMENT_GATEWAY_CONFIG_TYPE_ID:
				return paymentGatewayConfigTypeId != null;
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
		result.append(" (paymentGatewayConfigId: ");
		result.append(paymentGatewayConfigId);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayConfigImpl
