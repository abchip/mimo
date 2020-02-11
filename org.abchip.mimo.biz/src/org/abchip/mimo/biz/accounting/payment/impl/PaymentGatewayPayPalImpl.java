/**
 * Copyright (c) 2017, 2020 ABChip and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.abchip.mimo.biz.accounting.payment.impl;

import org.abchip.mimo.biz.accounting.payment.PaymentGatewayPayPal;
import org.abchip.mimo.biz.accounting.payment.PaymentPackage;
import org.abchip.mimo.biz.impl.BizEntityImpl;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Gateway Pay Pal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getPaymentGatewayConfigId <em>Payment Gateway Config Id</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiEnvironment <em>Api Environment</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiPassword <em>Api Password</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiSignature <em>Api Signature</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getApiUserName <em>Api User Name</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getBusinessEmail <em>Business Email</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getCancelReturnUrl <em>Cancel Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getConfirmTemplate <em>Confirm Template</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getConfirmUrl <em>Confirm Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getNotifyUrl <em>Notify Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getRedirectUrl <em>Redirect Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#isRequireConfirmedShipping <em>Require Confirmed Shipping</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getReturnUrl <em>Return Url</em>}</li>
 *   <li>{@link org.abchip.mimo.biz.accounting.payment.impl.PaymentGatewayPayPalImpl#getShippingCallbackUrl <em>Shipping Callback Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentGatewayPayPalImpl extends BizEntityImpl implements PaymentGatewayPayPal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentGatewayPayPalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiEnvironment() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiEnvironment(String newApiEnvironment) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_ENVIRONMENT, newApiEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiPassword() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiPassword(String newApiPassword) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_PASSWORD, newApiPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiSignature() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiSignature(String newApiSignature) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_SIGNATURE, newApiSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApiUserName() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApiUserName(String newApiUserName) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__API_USER_NAME, newApiUserName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusinessEmail() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessEmail(String newBusinessEmail) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__BUSINESS_EMAIL, newBusinessEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCancelReturnUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancelReturnUrl(String newCancelReturnUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__CANCEL_RETURN_URL, newCancelReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmTemplate() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmTemplate(String newConfirmTemplate) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_TEMPLATE, newConfirmTemplate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmUrl(String newConfirmUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__CONFIRM_URL, newConfirmUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUrl(String newImageUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__IMAGE_URL, newImageUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotifyUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotifyUrl(String newNotifyUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__NOTIFY_URL, newNotifyUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPaymentGatewayConfigId() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentGatewayConfigId(String newPaymentGatewayConfigId) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__PAYMENT_GATEWAY_CONFIG_ID, newPaymentGatewayConfigId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRedirectUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRedirectUrl(String newRedirectUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__REDIRECT_URL, newRedirectUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequireConfirmedShipping() {
		return (Boolean)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequireConfirmedShipping(boolean newRequireConfirmedShipping) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__REQUIRE_CONFIRMED_SHIPPING, newRequireConfirmedShipping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__RETURN_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnUrl(String newReturnUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__RETURN_URL, newReturnUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShippingCallbackUrl() {
		return (String)eGet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShippingCallbackUrl(String newShippingCallbackUrl) {
		eSet(PaymentPackage.Literals.PAYMENT_GATEWAY_PAY_PAL__SHIPPING_CALLBACK_URL, newShippingCallbackUrl);
	}

} //PaymentGatewayPayPalImpl
