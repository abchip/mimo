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
	 * The default value of the '{@link #getPaymentGatewayConfigTypeId() <em>Payment Gateway Config Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_GATEWAY_CONFIG_TYPE_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPaymentGatewayConfigTypeId() <em>Payment Gateway Config Type Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentGatewayConfigTypeId()
	 * @generated
	 * @ordered
	 */
	protected String paymentGatewayConfigTypeId = PAYMENT_GATEWAY_CONFIG_TYPE_ID_EDEFAULT;

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
	public String getPaymentGatewayConfigTypeId() {
		return paymentGatewayConfigTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigTypeId(String newPaymentGatewayConfigTypeId) {
		String oldPaymentGatewayConfigTypeId = paymentGatewayConfigTypeId;
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
				return getPaymentGatewayConfigTypeId();
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
				setPaymentGatewayConfigTypeId((String)newValue);
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
				setPaymentGatewayConfigTypeId(PAYMENT_GATEWAY_CONFIG_TYPE_ID_EDEFAULT);
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
				return PAYMENT_GATEWAY_CONFIG_TYPE_ID_EDEFAULT == null ? paymentGatewayConfigTypeId != null : !PAYMENT_GATEWAY_CONFIG_TYPE_ID_EDEFAULT.equals(paymentGatewayConfigTypeId);
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
		result.append(", paymentGatewayConfigTypeId: ");
		result.append(paymentGatewayConfigTypeId);
		result.append(')');
		return result.toString();
	}

} //PaymentGatewayConfigImpl
